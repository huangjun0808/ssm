<%--
  Created by IntelliJ IDEA.
  User: huangjun
  Time: 2017/11/25 12:50
  Motto：软件在能够复用前必须先能用。
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="main-sidebar">
    <section class="sidebar">
    <!-- Sidebar user panel -->
    <div class="user-panel">
        <div class="pull-left image">
            <img src="static/images/lte/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
            <p>管理员</p>
            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
    </div>
    <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu" data-widget="tree">
        <li class="treeview text-center">
            <a href="javascript:;" class="sidebar-toggle" data-toggle="push-menu" role="button" style="padding-left: 0;">
                <span class="sr-only">切换</span>
                <i class="fa fa-bars"></i>
            </a>
        </li>

        <li class="active treeview">
            <a href="index">
                <i class="fa fa-dashboard"></i> <span>首页</span>
            </a>
        </li>
        <li class="treeview">
            <a href="javascript:;">
                <i class="fa fa-files-o"></i><span>商品管理</span>
            </a>
        </li>

        <li>
            <a href="<%=request.getContextPath()%>/category">
                <i class="fa fa-folder"></i> <span>分类管理</span>
            </a>
        </li>
        <li class="treeview">
            <a href="javascript:;">
                <i class="fa fa-share"></i> <span>幻灯片管理</span>
            </a>
        </li>

        <li class="treeview">
            <a href="javascript:;">
                <i class="fa fa-pie-chart"></i>
                <span>订单管理</span>
                <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
            </a>
            <ul class="treeview-menu">
                <li><a href=""><i class="fa fa-circle-o"></i> 待付款</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 待发货</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 待收货</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 已完成</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 已关闭</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 全部订单</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="javascript:;">
                <i class="fa fa-laptop"></i>
                <span>拼团管理</span>
                <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
            </a>
            <ul class="treeview-menu">
                <li><a href=""><i class="fa fa-circle-o"></i> 拼团成功</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 拼团中</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 拼团失败</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 全部拼团</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="javascript:;">
                <i class="fa fa-tag"></i>
                <span>基础管理</span>
                <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
            </a>
            <ul class="treeview-menu">
                <li><a href=""><i class="fa fa-circle-o"></i> 基础设置</a></li>
                <li><a href=""><i class="fa fa-circle-o"></i> 批量发货</a></li>
            </ul>
        </li>
        <li class="header">LABELS</li>
        <li><a href="javascript:;"><i class="fa fa-circle-o text-red"></i> <span>Important</span></a></li>
        <li><a href="javascript:;"><i class="fa fa-circle-o text-yellow"></i> <span>Warning</span></a></li>
        <li><a href="javascript:;"><i class="fa fa-circle-o text-aqua"></i> <span>Information</span></a></li>

    </ul>
</section>
</aside>