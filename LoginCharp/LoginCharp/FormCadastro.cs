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
    public partial class FormCadastro : Form {
        public FormCadastro() {
            InitializeComponent();
        }

        private void FormCadastro_Load(object sender, EventArgs e) {

        }

        private void label1_Click(object sender, EventArgs e) {

        }

        private void label2_Click(object sender, EventArgs e) {

        }

        private void textBox1_TextChanged(object sender, EventArgs e) {

        }

        private void button1_Click(object sender, EventArgs e) {
            SqlConnection SqlCAD = new SqlConnection("Data Source=DESKTOP-3Q4KE5J\\SQLEXPRESS;Initial Catalog=LoginCharp;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("INSERT INTO Usuario(Username, Password) values (@Username, @Password)", SqlCAD);
            cmd.Parameters.Add("@Password", SqlDbType.Int).Value = txtPassword.Text;
            cmd.Parameters.Add("@Username", SqlDbType.VarChar).Value = txtUsuario.Text;

            if (txtPassword.Text != "" & txtUsuario.Text != "") {
                try {
                   
                    Form1 concluido = new Form1();
                    this.Hide();
                    concluido.Show();

                    SqlCAD.Open();
                    cmd.ExecuteNonQuery();
                    MessageBox.Show("Cadastro efetuado com sucesso! ", "CADASTRO", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    txtPassword.Text = "";
                    txtUsuario.Text = "";
                   

                }
                catch {

                    MessageBox.Show("Por favor digita todas informaçoes nos campos Obrigatorios");
                }
                finally {
                    SqlCAD.Close();
                }


            }
            else {
                MessageBox.Show("Por favor digita todas informaçoes nos campos obrigatorios", "CADASTRO", MessageBoxButtons.OK, MessageBoxIcon.Question);
            }

        }

        private void button2_Click(object sender, EventArgs e) {
            Form1 principal = new Form1();

            this.Hide();
            principal.Show();
        }
    }
}
