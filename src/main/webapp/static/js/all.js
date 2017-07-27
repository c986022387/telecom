/**
 * Created by Kasumi on 2017-04-28.
 */

//格式日期
function Padding0(n) {
    return n > 9 ? n : '0' + n;
}
Date.prototype.format = function (format) {
    var o = {
        "y+": this.getFullYear(),//year
        "M+": Padding0(this.getMonth() + 1), //month
        "d+": Padding0(this.getDate()), //day
        "h+": Padding0(this.getHours()), //hour
        "m+": Padding0(this.getMinutes()), //minute
        "s+": Padding0(this.getSeconds()), //second
        "q+": Math.floor((this.getMonth() + 3) / 3), //quarter
        "S": this.getMilliseconds(), //millisecond
        "XQJ": '星期' + ['日', '一', '二', '三', '四', '五', '六'][this.getDay()]
    }

    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, o[k]);
        }
    }
    return format;
}
function ParseDate(str) {
    var ymd = str.split('-');
    return new Date(parseInt(ymd[0]), parseInt(ymd[1]) - 1, parseInt(ymd[2]));
}

var issafari = navigator.userAgent.toLowerCase().indexOf('safari') >= 0;

//等待至特定时刻才执行
//定时检查fnBool, 返回true的时候
//执行fnAction, 并清除定时器
//否则等待interval后, 再次检查
function WaitAction(fnBool, fnAction, interval) {
    interval = interval || 100;
    var timer = setInterval(function () {
        if (fnBool()) {
            clearInterval(timer);
            fnAction();
        }
    }, interval);
}


//将秒数转换成时间间隔字符串
function FormatTimeDelta(delta) {
    var def = [[60, '秒'], [60, '分'], [24, '小时'], [30, '天'], [12, '个月'], [100, '年']];
    var re = '';
    for (var i = 0; i < def.length; i++) {
        var now = delta % def[i][0];
        delta = Math.floor(delta / def[i][0]);
        if (now > 0) {
            re = now.toString() + def[i][1] + re;
        }
        if (delta <= 0) {
            break;
        }
    }
    return re;
}
//一个方便的ajax调用
function FastAjax(url, data, success) {
    $.ajax({
        url: url,
        data: data,
        dataType: 'json',
        type: 'post',
        success: function (d) {
            success(d);
        },
        error: function () {
            alert('网络错误');
        }
    });
}

function isArray(a) {
    return toString.apply(a) === '[object Array]';
}

/*
 根据条件切换class
 传入{name1:func1,name2:func2}
 最后将
 */
$.fn.SwitchClass = function (def) {
    var _t = $(this);
    var flag = false;
    for (var name in def) {
        if (flag) {
            _t.removeClass(name);
            continue;
        }
        var func = def[name];
        if (typeof func == 'function') {
            func = func();
        }
        if (func) {
            flag = true;
            _t.addClass(name);
        } else {
            _t.removeClass(name);
        }

    }
    return $(this);
};

//仅支持简单lambda表达式
/*
 lambda('x=>x+1')()
 //结果为: function(x){return x+1;}

 var a = 1;
 lambda('a=>x=>x+a')()//支持变量捕抓
 //结果为 function(x){return x+a;}
 */
function lambda(str) {
    var subs = str.split('=>');
    if (subs.length < 2) {
        return null;
    }
    var arg = subs[subs.length - 2].trim();
    var body = subs[subs.length - 1];
    var re = "return function ";
    if (arg.indexOf('(') < 0) {
        arg = '(' + arg + ')';
    }
    re += arg;
    if (body.indexOf('return') < 0) {
        body = '{return ' + body + ';}';
    }
    var ns = Array(subs.length - 2);
    for (var i = 0; i < arguments; i++) {
        ns[i] = arguments[i];
    }
    return new Function(subs.slice(0, subs.length - 2), re + body);
}
Array.Range = function (start, length) {
    var re = Array(length);
    for (var i = 0; i < length; i++) {
        re[i] = start + i;
    }
    return re;
};

function zoomBody(size) {
    document.body.style.zoom = size;
    var percent = (100 / size).toString() + "%";
    $('body').css('-moz-transform', 'scale(' + size + ')').css('-moz-transform-origin', '0 0').width(percent).height(percent);

}

function UrlParams() {
    var key = 'alljsurlparam';
    var re = $('body').data(key);
    if (!re) {
        var str = window.location.search;
        if (str) {
            str = str.toLowerCase();
            str = str.substr(1);
            var arr = str.split('&').map(function (s) {
                return s.split('=');
            });
            re = {};
            for (var i in arr) {
                if (re[arr[i][0]]) {
                    var v = re[arr[i][0]];
                    if (isArray(v)) {
                        v.push(arr[i][1])
                    } else {
                        re[arr[i][0]] = [v, arr[i][1]];
                    }
                } else {
                    re[arr[i][0]] = arr[i][1];
                }
            }
        }
        $('body').data(re);
    }
    return re;
}

