using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;


namespace WebApplication3.Pages {
    public partial class WebForm1 : System.Web.UI.Page {
        SqlConnection Conexao = new SqlConnection
            ("Data Source=DESKTOP-3Q4KE5J\\SQLEXPRESS;Initial Catalog=LoginCharp;Integrated Security=True");
        protected void Page_Load(object sender, EventArgs e) {
            txtUsuario.Focus();

        }

        protected void Button1_Click(object sender, EventArgs e) {
            if (Conexao.State == ConnectionState.Closed) {
                Conexao.Open();

            }

            string query = $"SELECT * FROM Usuario WHERE Username = '{txtUsuario.Text}' AND Password = '{txtPassword.Text}'";
            SqlDataAdapter dp = new SqlDataAdapter(query, Conexao);
            DataTable dt = new DataTable();
            dp.Fill(dt);

            if (dt.Rows.Count > 0) {

               
                Response.Redirect ("PosLogin.aspx");
                Conexao.Close();    
               
            }
            
            else {
                
                txtPassword.Text = "";
                txtUsuario.Text = "";
                txtUsuario.Focus();
            }

        }
    }
}