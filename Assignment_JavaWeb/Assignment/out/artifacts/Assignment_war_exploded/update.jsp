<!doctype html>
<html class="no-js h-100" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Update Product</title>
</head>
<body class="h-100">
<div class="container-fluid">
    <div class="row">
        <!-- Main Sidebar -->
        <aside class="main-sidebar col-12 col-md-3 col-lg-2 px-0">
            <div class="main-navbar">
                <nav class="navbar align-items-stretch navbar-light bg-white flex-md-nowrap border-bottom p-0">
                    <a class="navbar-brand w-100 mr-0" href="#" style="line-height: 25px;">
                        <div class="d-table m-auto">
                            <img id="main-logo" class="d-inline-block align-top mr-1" style="max-width: 25px;" src="images/shards-dashboards-logo.svg" alt="Cleanser">
                            <span class="d-none d-md-inline ml-1">Cleanser</span>
                        </div>
                    </a>
                    <a class="toggle-sidebar d-sm-inline d-md-none d-lg-none">
                        <i class="material-icons">&#xE5C4;</i>
                    </a>
                </nav>
            </div>
            <form action="#" class="main-sidebar__search w-100 border-right d-sm-flex d-md-none d-lg-none">
                <div class="input-group input-group-seamless ml-3">
                    <div class="input-group-prepend">
                        <div class="input-group-text">
                            <i class="fas fa-search"></i>
                        </div>
                    </div>
                    <input class="navbar-search form-control" type="text" placeholder="Search for something..." aria-label="Search"> </div>
            </form>
            <div class="nav-wrapper">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link " href="index.jsp">
                            <i class="material-icons">edit</i>
                            <span>Dashboard</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="add-new-post.jsp">
                            <i class="material-icons">note_add</i>
                            <span>Add New Product</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="product">
                            <i class="material-icons">table_chart</i>
                            <span>Tables</span>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
        <!-- End Main Sidebar -->
        <main class="main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3">
            <div class="main-navbar sticky-top bg-white">
                <!-- Main Navbar -->
                <nav class="navbar align-items-stretch navbar-light flex-md-nowrap p-0">
                    <form action="#" class="main-navbar__search w-100 d-none d-md-flex d-lg-flex">
                        <div class="input-group input-group-seamless ml-3">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fas fa-search"></i>
                                </div>
                            </div>
                            <input class="navbar-search form-control" type="text" placeholder="Search for something..." aria-label="Search"> </div>
                    </form>
                    <ul class="navbar-nav border-left flex-row ">
                        <li class="nav-item border-right dropdown notifications">
                            <a class="nav-link nav-link-icon text-center" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <div class="nav-link-icon__wrapper">
                                    <i class="material-icons">&#xE7F4;</i>
                                    <span class="badge badge-pill badge-danger">2</span>
                                </div>
                            </a>
                            <div class="dropdown-menu dropdown-menu-small" aria-labelledby="dropdownMenuLink">
                                <a class="dropdown-item" href="#">
                                    <div class="notification__icon-wrapper">
                                        <div class="notification__icon">
                                            <i class="material-icons">&#xE6E1;</i>
                                        </div>
                                    </div>
                                    <div class="notification__content">
                                        <span class="notification__category">Analytics</span>
                                        <p>Your website???s active users count increased by
                                            <span class="text-success text-semibold">28%</span> in the last week. Great job!</p>
                                    </div>
                                </a>
                                <a class="dropdown-item" href="#">
                                    <div class="notification__icon-wrapper">
                                        <div class="notification__icon">
                                            <i class="material-icons">&#xE8D1;</i>
                                        </div>
                                    </div>
                                    <div class="notification__content">
                                        <span class="notification__category">Sales</span>
                                        <p>Last week your store???s sales count decreased by
                                            <span class="text-danger text-semibold">5.52%</span>. It could have been worse!</p>
                                    </div>
                                </a>
                                <a class="dropdown-item notification__all text-center" href="#"> View all Notifications </a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-nowrap px-3" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle mr-2" src="images/avatars/0.jpg" alt="User Avatar">
                                <span class="d-none d-md-inline-block">Sierra Brooks</span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-small">
                                <a class="dropdown-item" href="user-profile-lite.jsp">
                                    <i class="material-icons">&#xE7FD;</i> Profile</a>
                                <a class="dropdown-item" href="components-blog-posts.jsp">
                                    <i class="material-icons">vertical_split</i> Posts</a>
                                <a class="dropdown-item" href="add-new-post.jsp">
                                    <i class="material-icons">note_add</i> Add New Product</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item text-danger" href="#">
                                    <i class="material-icons text-danger">&#xE879;</i> Logout </a>
                            </div>
                        </li>
                    </ul>
                    <nav class="nav">
                        <a href="#" class="nav-link nav-link-icon toggle-sidebar d-md-inline d-lg-none text-center border-left" data-toggle="collapse" data-target=".header-navbar" aria-expanded="false" aria-controls="header-navbar">
                            <i class="material-icons">&#xE5D2;</i>
                        </a>
                    </nav>
                </nav>
            </div>
            <!-- / .main-navbar -->
            <div class="main-content-container container-fluid px-4">
                <!-- Page Header -->
                <div class="page-header row no-gutters py-4">
                    <div class="col-12 col-sm-4 text-center text-sm-left mb-0">
                        <span class="text-uppercase page-subtitle">Posts</span>
                        <h3 class="page-title">Add New Product</h3>
                    </div>
                </div>
                <!-- End Page Header -->
                <div class="row">
                    <div class="col-lg-9 col-md-12">
                        <!-- Add New Post Form -->
                        <div class="card card-small mb-3">
                            <div class="card-body">
                                <form class="add-new-post" method="post" action="update">
                                    <input class="form-control form-control-lg mb-3" type="number" name="id" value="${requestScope.st.id}" readonly>
                                    <input class="form-control form-control-lg mb-3" type="text" name="name" value="${requestScope.st.name}">
                                    <input class="form-control form-control-lg mb-3" type="number" name="price"  value="${requestScope.st.price}">
                                    <input class="form-control form-control-lg mb-3" type="number" name="quantity" value="${requestScope.st.quantity}">
                                    <input class="form-control form-control-lg mb-3" type="text" name="image" value="${requestScope.st.image}">
                                    <input class="btn btn-primary" style="float: right" type="submit" value="Submit">
                                    <%--                                    <div id="editor-container" class="add-new-post__editor mb-1"></div>--%>
                                </form>
                            </div>
                        </div>
                        <!-- / Add New Post Form -->
                    </div>
                    <div class="col-lg-3 col-md-12">
                        <!-- Post Overview -->
                        <div class='card card-small mb-3'>
                            <div class="card-header border-bottom">
                                <h6 class="m-0">Actions</h6>
                            </div>
                            <div class='card-body p-0'>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item p-3">
                        <span class="d-flex mb-2">
                          <i class="material-icons mr-1">flag</i>
                          <strong class="mr-1">Status:</strong> Draft
                          <a class="ml-auto" href="#">Edit</a>
                        </span>
                                        <span class="d-flex mb-2">
                          <i class="material-icons mr-1">visibility</i>
                          <strong class="mr-1">Visibility:</strong>
                          <strong class="text-success">Public</strong>
                          <a class="ml-auto" href="#">Edit</a>
                        </span>
                                        <span class="d-flex mb-2">
                          <i class="material-icons mr-1">calendar_today</i>
                          <strong class="mr-1">Schedule:</strong> Now
                          <a class="ml-auto" href="#">Edit</a>
                        </span>
                                        <span class="d-flex">
                          <i class="material-icons mr-1">score</i>
                          <strong class="mr-1">Readability:</strong>
                          <strong class="text-warning">Ok</strong>
                        </span>
                                    </li>
                                    <li class="list-group-item d-flex px-3">
                                        <button class="btn btn-sm btn-outline-accent">
                                            <i class="material-icons">save</i> Save Draft</button>
                                        <button class="btn btn-sm btn-accent ml-auto">
                                            <i class="material-icons">file_copy</i> Publish</button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- / Post Overview -->
                        <!-- Post Overview -->
                        <div class='card card-small mb-3'>
                            <div class="card-header border-bottom">
                                <h6 class="m-0">Categories</h6>
                            </div>
                            <div class='card-body p-0'>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item px-3 pb-2">
                                        <div class="custom-control custom-checkbox mb-1">
                                            <input type="checkbox" class="custom-control-input" id="category1" checked>
                                            <label class="custom-control-label" for="category1">Uncategorized</label>
                                        </div>
                                        <div class="custom-control custom-checkbox mb-1">
                                            <input type="checkbox" class="custom-control-input" id="category2" checked>
                                            <label class="custom-control-label" for="category2">Design</label>
                                        </div>
                                        <div class="custom-control custom-checkbox mb-1">
                                            <input type="checkbox" class="custom-control-input" id="category3">
                                            <label class="custom-control-label" for="category3">Development</label>
                                        </div>
                                        <div class="custom-control custom-checkbox mb-1">
                                            <input type="checkbox" class="custom-control-input" id="category4">
                                            <label class="custom-control-label" for="category4">Writing</label>
                                        </div>
                                        <div class="custom-control custom-checkbox mb-1">
                                            <input type="checkbox" class="custom-control-input" id="category5">
                                            <label class="custom-control-label" for="category5">Books</label>
                                        </div>
                                    </li>
                                    <li class="list-group-item d-flex px-3">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="New category" aria-label="Add new category" aria-describedby="basic-addon2">
                                            <div class="input-group-append">
                                                <button class="btn btn-white px-2" type="button">
                                                    <i class="material-icons">add</i>
                                                </button>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- / Post Overview -->
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>
</body>
</html>