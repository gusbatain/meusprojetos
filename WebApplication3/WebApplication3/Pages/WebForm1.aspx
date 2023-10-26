<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication3.Pages.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <link rel="stylesheet" href="../Content/bootstrap.css" />


    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div class="container-fluid h-custom">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-md-9 col-lg-6 col-xl-5">
                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                        class="img-fluid" alt="Sample image">
                </div>
                <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">

                    <!-- Email input -->

                    <div class="form-outline mb-4">
                        <asp:TextBox ID="txtUsuario" runat="server" CssClass="form-control form-control-lg" 
                            placeholder="Enter a valid email address"></asp:TextBox>
                        <label class="form-label" for="form3Example3">Email address</label>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-3">

                        <asp:TextBox ID="txtPassword" runat="server" placeholder="Enter password" 
                            CssClass="form-control form-control-lg"></asp:TextBox>

                        <label class="form-label" for="form3Example4">Password</label>
                    </div>

                    <div class="d-flex justify-content-between align-items-center">
                        <!-- Checkbox -->
                        <div class="form-check mb-0">
                            <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
                            <label class="form-check-label" for="form2Example3">
                                Remember me
                            </label>
                        </div>
                        <a href="#!" class="text-body">Forgot password?</a>
                    </div>

                    <div class="text-center text-lg-start mt-4 pt-2">

                        <asp:Button ID="Button1" runat="server" Text="Login" class="btn btn-primary btn-lg" OnClick="Button1_Click"
                            Style="padding-left: 2.5rem; padding-right: 2.5rem;" />

                        <p class="small fw-bold mt-2 pt-1 mb-0">
                            Don't have an account? <a href="#!"
                                class="link-danger">Register</a>

                        </p>
                    </div>
                </div>
            </div>
        </div>
    </form>
</body>
</html>
