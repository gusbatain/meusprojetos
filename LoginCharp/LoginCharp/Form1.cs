using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace LoginCharp {
    public partial class Form1 : Form {
        SqlConnection Conexao = new SqlConnection("Data Source=DESKTOP-3Q4KE5J\\SQLEXPRESS;Initial Catalog=LoginCharp;Integrated Security=True");

        public Form1() {
            InitializeComponent();
            txtUsuario.Select();
        }

        private void label1_Click(object sender, EventArgs e) {

        }

        private void label2_Click(object sender, EventArgs e) {

        }

        private void Form1_Load(object sender, EventArgs e) {

        }

        private void button3_Click(object sender, EventArgs e) {
            Application.Exit();
        }

        void Verificacao() {
            if (txtUsuario.Text == "" && txtPassword.Text == "") {
                MessageBox.Show("Preencha os campos", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
                txtUsuario.Select();
            }
        }

        private void button1_Click(object sender, EventArgs e) {

            if (Conexao.State == ConnectionState.Closed) {
                Conexao.Open();

            }

            Verificacao();
            string query = $"SELECT * FROM Usuario WHERE Username = '{txtUsuario.Text}' AND Password = '{txtPassword.Text}'";
            SqlDataAdapter dp = new SqlDataAdapter(query, Conexao);
            DataTable dt = new DataTable();
            dp.Fill(dt);


            try {
                if (dt.Rows.Count > 0) {

                    FormPrincipal principal = new FormPrincipal();
                    this.Hide();
                    principal.Show();

                }
                else if(txtUsuario.Text == "" && txtPassword.Text == "") {
                    MessageBox.Show("Preencha os campos Usuário e Senha", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    txtUsuario.Select();
                }
                else {
                    MessageBox.Show("Usúario ou senha invalidos", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    txtUsuario.Text = "";
                    txtPassword.Text = "";
                    txtUsuario.Select();
                }
            }
            catch (Exception Erro) {

                MessageBox.Show("Usuario ou Password incorrecta" + Erro);
                txtPassword.Text = "";
                txtUsuario.Text = "";
                txtUsuario.Select();
            }



            Conexao.Close();
        }
        
        private void button2_Click(object sender, EventArgs e) {
            FormCadastro Cadastro = new FormCadastro();
            Cadastro.Show();
        }

        private void button2_Click_1(object sender, EventArgs e) {
            FormCadastro Cadastro = new FormCadastro();
            this.Hide();
            Cadastro.Show();
        }
    }
}