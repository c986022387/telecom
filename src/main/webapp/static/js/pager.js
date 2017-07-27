/**
 * Created by lam on 2017/4/12.
 */
;(function($){
    //定义Pager的构造函数
    var Pager = function(ele, opt) {
        this.$element = ele,
        this.defaults = {
            page : 1,//当前页
            pageSize : 10,//每页条数
            pageCont:1,//总页数
            total : 0,//总条数
            maxPageBtn: 5,//最多页按钮
            showFirstLastBtn:true,//显示首页、尾页按钮
            showPreNextBtn:true,//显示上一页、下一页按钮
            onPageClicked : function($ele,page,pageSize){}//单击执行
        },
        this.options = $.extend({}, this.defaults, opt);
    }
    //定义Pager的方法
    Pager.prototype = {
        constructor:Pager,
        _firstBtn:null,
        _preBtn:null,
        _lastBtn:null,
        _nextBtn:null,
        init: function() {
            this._render();//渲染UI
            this._firstBtn = this.$element.find('li a.first').parent();
            this._preBtn = this.$element.find('li a.pre').parent();
            this._lastBtn = this.$element.find('li a.last').parent();
            this._nextBtn = this.$element.find('li a.next').parent();
            return this;
        },
        _render:function(){
            //计算总页数，如果页数小于1则设置为1
            this.options.pageCont = Math.ceil(this.options.total/this.options.pageSize);
            this.options.pageCont  = this.options.pageCont < 1 ? 1:this.options.pageCont;
            //显示总共条数及选择每页条数
            var html='';
            //分页按钮
            html+='<div class="pull-right" style="display:inline-block;"><ul class="pager pager-loose">';
            if(this.options.showPreNextBtn){
                html+='<li class="previous"><a class="pre">上一页</a></li>';
            }
            if(this.options.showFirstLastBtn){
                html+='<li><a class="first">首页</a></li>';
            }
            if(this.options.showFirstLastBtn){
                html+='<li><a class="last">尾页</a></li>';
            }
            if(this.options.showPreNextBtn){
                html+='<li class="next"><a class="next">下一页</a></li>';
            }
            html+='</ul></div>';
            html+='<div class="pull-right" style="display:inline-block;">共&nbsp;'+this.options.total+'&nbsp;条记录，&nbsp;每页&nbsp;'
            +'<div class="dropdown dropup" style="display: inline-block;">'
            +'<button class="btn btn-default btn-mini" type="button" data-toggle="dropdown">'+this.options.pageSize+'&nbsp;<span class="caret"></span></button>'
            +'<div class="dropdown-menu dropdown-menu-table">'
            +'<table class="table table-bordered">'
            +'<tbody>'
            +'<tr><td><a>1</a></td><td><a>5</td><td><a>10</a></td></tr>'
            +'<tr><td><a>15</a></td><td><a>20</td><td><a>30</a></td></tr>'
            +'<tr><td><a>50</a></td><td><a>100</td><td><a>200</a></td></tr>'
            +'<tr><td><a>500</a></td><td><a>1000</td><td><a>2000</a></td></tr>'
            +'</tbody>'
            +'</table>'
            +'</div>'
            +'</div>&nbsp;条&nbsp;&nbsp;</div>';

            this.$element.html(html);
            this._renderPageBtn();
            this.$element.height(28);
            this._setNavBtnStatus();
            //绑定事件
            //选择每页条数
            var $this = this;
            this.$element.find('.dropdown table td').click(function(){
                $this.options.page = 1;
                $this.options.pageSize = $(this).text();
                $this._render();
                if($this.options.onPageClicked) {
                    $this.options.onPageClicked.call($this, $this.$element, $this.options.page, $this.options.pageSize);
                }
            });

            $this.$element.find("li a.first,li a.last,li a.pre,li a.next").each(function() {
                $(this).on('pageClick', function() {
                    $this._onPageBtnClick($(this));
                });
            });

            $this.$element.find("li.page a,li a.first,li a.last,li a.pre,li a.next").click(function(e) {
                e.preventDefault();
                if($(this).parent().hasClass('disabled')) return;
                $(this).trigger('pageClick', e);
            });
        },
        _renderPageBtn:function(){
            //当前存在页数按钮
            //设置的最大页数大于等于总页数
            //起始页为第一页 且 当前页小于等于当前页数按钮的一半
            //总页数等于页数按钮最后一个按钮的页数 且 当前页大于（总页数-页数按钮的一半）
            //直接设置选中页数
            var c = this.options;
            var $ele = this.$element;
            if($ele.find('ld.page').length>0 && (c.maxPageBtn>=c.pageCont
                ||  (parseInt($ele.find('li.page').first().find('a').text()) == 1 && c.page <= Math.ceil($ele.find('li.page').length/2))
                || (c.pageCont == parseInt($ele.find('li.page').last().find('a').text()) && c.page > (c.pageCont - Math.ceil($ele.find('li.page').length/2))))) {
                //do not thing
            }
            else{
                var html='';
                var startPage = 1;
                if(c.page==1 || c.page<=parseInt(c.maxPageBtn/2) || c.pageCont<c.maxPageBtn){
                    startPage = 1;
                }
                else if(c.page == c.pageCont && c.pageCont>c.maxPageBtn) {
                    startPage = c.pageCont - c.maxPageBtn + 1;
                }
                else if(c.page>parseInt(c.maxPageBtn/2) && c.page>c.pageCont-(parseInt(c.maxPageBtn/2))){
                    startPage = c.page-(c.pageCont-c.page)-parseInt(c.maxPageBtn/2);
                }
                else{
                    startPage = c.page-parseInt(c.maxPageBtn/2);
                }
                var endPage = c.page == 1 ? (c.maxPageBtn<c.pageCont ? c.maxPageBtn:c.pageCont) : c.page == c.pageCont ? c.pageCont : startPage + (c.maxPageBtn<c.pageCont?c.maxPageBtn:c.pageCont)-1;
                for(var index = startPage; index <= endPage; index++){
                    html+='<li class="page"><a page="'+index+'">'+index+'</a></li>';
                }
                $ele.find('li.page').remove();
                if($ele.find('li').length>0) {
                    $ele.find('li').eq($ele.find('li').length/2-1).after(html);
                }
                else {
                    $ele.find('li:nth-child(2)').after(html);
                }
                this._bindPages();
            }
            $ele.find("li.page").removeClass('active');
            $ele.find("li.page").find('a:contains('+this.options.page+')').parent().addClass('active');
        },
        _setNavBtnStatus:function(){//设置上一页下一页首页尾页状态
            if(this.options.page == 1) {
                this.$element.find('li a.pre').parent().addClass("disabled");
                this.$element.find('li a.first').parent().addClass("disabled");
            }
            else{
                this.$element.find('li a.pre').parent().removeClass("disabled");
                this.$element.find('li a.first').parent().removeClass("disabled");
            }
            if(this.options.page ==this.options.pageCont) {
                this.$element.find('li a.next').parent().addClass("disabled");
                this.$element.find('li a.last').parent().addClass("disabled");
            }
            else{
                this.$element.find('li a.next').parent().removeClass("disabled");
                this.$element.find('li a.last').parent().removeClass("disabled");
            }
        },
        _onClickPage:function(){
            //优先执行回调函数
            if(this.options.onPageClicked) {
                this.options.onPageClicked.call(this, this.$element, this.options.page,this.options.pageSize);
            }
            this._setNavBtnStatus();//设置上一页下一页首页尾页状态
            this._renderPageBtn();//重新渲染页数按钮
        },//页面点击事件
        _onPageBtnClick:function($_this){
            var selectedText = $_this.text();
            if(selectedText == '下一页') {
                this.options.page += 1;
            }
            else if(selectedText == '上一页' ) {
                this.options.page -= 1;
            }
            else if(selectedText == '首页'){
                this.options.page = 1;
            }
            else if(selectedText == '尾页'){
                this.options.page = this.options.pageCont;
            }
            else {
                this.options.page = parseInt($_this.text());
            }
            this._onClickPage();
        },//分页控件页面单击执行
        _bindPages:function(){//绑定页数事件
            var $this = this;
            this.$element.find("li.page a").each(function(){
                $(this).unbind('pageClick');
                if($(this).parent().hasClass('disabled')) return;
                $(this).on('pageClick', function() {$this._onPageBtnClick($(this));});
            });
            this.$element.find("li.page a").click(function(e){
                e.preventDefault();
                $(this).trigger('pageClick', e);
            });
        },//绑定页面
        pageReload:function(){//页面重新加载
            if(this.options.onPageClicked) {
                this.options.onPageClicked.call(this, this.$element, this.options.page, this.options.pageSize);
            }
        }
    }
    //在插件中使用Pager对象
    $.fn.Pager = function(options) {
        if (this.size() != 1){
            $.error('请为这个插件提供一个唯一的编号');
        }
        //创建Pager的实体
        var pager = new Pager(this, options);
        //调用初始方法
        return pager.init();
    }
})(jQuery);