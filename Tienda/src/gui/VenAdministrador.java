package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clase.Cliente;
import clase.Empleado;
import clase.HistorialVentas;
import clase.Producto;
import clase.Proveedor;
import clase.Venta;
import mantenimiento.MantCliente;
import mantenimiento.MantEmpleado;
import mantenimiento.MantHistorialVentas;
import mantenimiento.MantProducto;
import mantenimiento.MantProveedor;
import mantenimiento.MantVenta;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;

public class VenAdministrador extends JFrame implements ActionListener, KeyListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDniE;
	private JLabel lblNombreCompletoE;
	private JLabel lblTelefono;
	private JLabel lblCargo;
	private JLabel lblIdE;
	private JTextField txtIdEmpleado;
	private JTextField txtNombreEmpleado;
	private JTextField txtDniEmpleado;
	private JTextField txtTelefono;
	private JComboBox cboCargo;
	private JLabel lblJornada;
	private JComboBox cboJornada;
	private JLabel lblHorario;
	private JComboBox cboHorario;
	private JButton btnRegistrarEmpleado;
	private JButton btnModificarEmpleado;
	private JLabel lblRegistrarEmpleado;
	private JLabel lblIdBuscarE;
	private JTextField txtBuscarEmple;
	private JLabel lblclock;
	private JScrollPane scrollPane;
	private JPanel panelVenta;
	private JScrollPane scrollPane_1;
	private JLabel lblIdBuscarP;
	private JTextField txtIdProdBuscar;
	private JLabel lblRegistrarProducto;
	private JLabel lblIdP;
	private JTextField txtIdProducto;
	private JLabel lblCategoria;
	private JTextField txtCategoria;
	private JLabel lblNombreP;
	private JTextField txtNombreProducto;
	private JLabel lblGarantia;
	private JLabel lblPrecio;
	private JLabel lblCantProducto;
	private JTextField txtCantProducto;
	private JTextField txtPrecio;
	private JButton btnModificarProducto;
	private JLabel lblIdStock;
	private JTextField txtIdProdStock;
	private JLabel lblCantStock;
	private JTextField txtCantStock;
	private JButton btnRegistrarStock;
	private JScrollPane scrollPane_2;
	private JLabel lblBuscarHistorial;
	private JTextField txtBuscarHistorialVentas;
	
	private JButton btnRegistrarProducto;
	private JTable tablaProducto;
	private JTextField txtGarantia;
	private JLabel lblSueldo;
	private JTextField txtSueldo;
	private JTable tablaEmpleado;
	private JTable tablaHistorialVentas;
	private JLabel lblHistorialVentas;
	private JLabel lblIdProveedor;
	private JTextField txtIdProveedor;
	private JPanel panelProveedor;
	private JScrollPane scrollPane_3;
	private JTable tablaProveedor;
	private JButton btnRegistrarProveedor;
	private JButton btnModificarProveedor;
	private JTextField txtBuscarProveedor;
	private JLabel lblId;
	private JTextField txtIDProveedor;
	private JLabel lblRuc;
	private JTextField txtRucProveedor;
	private JLabel lblNombre;
	private JTextField txtNombreProveedor;
	private JLabel lblTelfono;
	private JTextField txtTelefonoProveedor;
	private JLabel lblCorreo;
	private JTextField txtCorreoProveedor;
	private JLabel lblDireccin;
	private JTextField txtDireccionProveedor;
	private JLabel lblCorreo_2;
	private JTextField txtEstadoProveedor;
	private JLabel lblNewLabel;
	private JLabel lblEliminar;
	private JTextField txtEliminarHistorial;
	private JTabbedPane tabbedPane;
	private JPanel panelEmpleado;
	private JPanel panelProducto;
	public int day;
	public int year;
	public int month;
	public int second;
	public int minute;
	public int hour;
	public String tmam;
	public String fecha;
	public String hora;
	private static Clip clipreproduciendo;
	private JSlider controlvol;
	
	private static FloatControl volumeControl;
	private JTextField txtEstadoEmpleado;
	private JLabel lblEstado;
	private JButton btnBorrarEmpleado;
	private JButton btnMostrarEmpleado;
	private JButton btnBorrarProducto;
	private JButton btnMostrarProducto;
	private JButton btnMostrarProveedor;
	private JButton btnBorrarProveedor;
	private JButton btnEliminarVenta;
	private JPanel panelDatosPersonalesE;
	private JPanel panelDatosLaborales;
	private JLabel lblNewLabel_1;
	private JPanel panelDatosPersonalesProv;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JLabel lblNewLabel_4;
	private JPanel panelRegistrarProducto;
	private JPanel panelRegistrarStock;
	private JLabel lblNewLabel_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VenAdministrador frame = new VenAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clock() {
		Thread clock =new Thread() {
			public void run() {
				try {
					for(;;) {
					Calendar cal= new GregorianCalendar();
					 int dai= cal.get(Calendar.DAY_OF_MONTH);
					 String day, month, second,minute,hour;
					 if(dai<10) {
						 day="0"+Integer.toString(dai);
					 }
					 else {
						 day=Integer.toString(dai);
					 }
					int mont= cal.get(Calendar.MONTH);
					 if(mont<10) {
						 month="0"+Integer.toString(mont+1);
					 }
					 else {
						 month=Integer.toString(mont+1);
					 }
					
					year= cal.get(Calendar.YEAR);
					
					 int secon= cal.get(Calendar.SECOND);
					 if(secon<10) {
						 second="0"+Integer.toString(secon);
					 }
					 else {
						 second=Integer.toString(secon);
					 }
					 
					 int minut= cal.get(Calendar.MINUTE);
					 
					 if(minut<10) {
						 minute="0"+Integer.toString(minut);
					 }
					 else {
						 minute=Integer.toString(minut);
					 }
					 
					 int hou= cal.get(Calendar.HOUR);
					 
					 if(hou == 0) { 
						    hour = "12";
						}
					 else if(hou<10) {
						 hour="0"+Integer.toString(hou);
					 }
					 else {
						 hour=Integer.toString(hou);
					 }
					 
					int ampm= cal.get(Calendar.AM_PM);

				if(ampm == 0) {
					
					tmam= "am";
				}
				else {
					tmam= "pm";
				}
					
					lblclock.setText("Fecha: "+ day+"/"+month+"/"+year+" Hora: "+hour+":"+minute+":"+second+tmam);
					sleep(1000);
					}
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		clock.start();
	}
	
	/**
	 * Create the frame.
	 */
	public VenAdministrador() {
		addMouseListener(this);
		setAlwaysOnTop(true);
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1370, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			
			tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
			tabbedPane.setFont(new Font("Verdana", Font.PLAIN, 30));
			tabbedPane.addMouseListener(this);
			tabbedPane.setBounds(10, 11, 1336, 712);
			contentPane.add(tabbedPane);
			
			ImageIcon iconEmpleado = new ImageIcon(
			        getClass().getResource("/recursos/empleadoicon3.png"));
			
			ImageIcon iconProducto = new ImageIcon(
			        getClass().getResource("/recursos/productoicon.png"));
			
			ImageIcon iconVenta = new ImageIcon(
			        getClass().getResource("/recursos/ventaicon.png"));
			
			ImageIcon iconProveedor = new ImageIcon(
			        getClass().getResource("/recursos/proveedoricon.png"));
			
			panelEmpleado = new JPanel();
			panelEmpleado.setBackground(SystemColor.activeCaption);
			panelEmpleado.addMouseListener(this);
			tabbedPane.addTab("   Empleado      ", iconEmpleado, panelEmpleado, null);
			panelEmpleado.setLayout(null);
			{
				lblIdBuscarE = new JLabel("Buscar:");
				lblIdBuscarE.setBounds(10, 57, 67, 19);
				panelEmpleado.add(lblIdBuscarE);
				lblIdBuscarE.setFont(new Font("Verdana", Font.BOLD, 15));
			}
			{
				txtBuscarEmple = new JTextField();
				txtBuscarEmple.setFont(new Font("Verdana", Font.PLAIN, 15));
				txtBuscarEmple.addKeyListener(this);
				txtBuscarEmple.setBounds(85, 56, 461, 25);
				panelEmpleado.add(txtBuscarEmple);
				txtBuscarEmple.setBackground(Color.WHITE);
				txtBuscarEmple.setColumns(10);
			}
			{
				lblRegistrarEmpleado = new JLabel("REGISTRO DE EMPLEADOS");
				lblRegistrarEmpleado.setBounds(324, 11, 424, 34);
				panelEmpleado.add(lblRegistrarEmpleado);
				lblRegistrarEmpleado.setFont(new Font("Verdana", Font.BOLD, 25));
			}
			{
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 421, 1007, 275);
					panelEmpleado.add(scrollPane);
					{
						tablaEmpleado = new JTable();
						tablaEmpleado.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaEmpleado.addMouseListener(this);
						tablaEmpleado.setFillsViewportHeight(true);
						scrollPane.setViewportView(tablaEmpleado);
					}
				}
				{
					btnMostrarEmpleado = new JButton("Mostrar");
					btnMostrarEmpleado.addActionListener(this);
					btnMostrarEmpleado.setFont(new Font("Verdana", Font.PLAIN, 13));
					btnMostrarEmpleado.setBounds(901, 385, 116, 25);
					panelEmpleado.add(btnMostrarEmpleado);
				}
			}
			{
				panelDatosPersonalesE = new JPanel();
				panelDatosPersonalesE.setBackground(SystemColor.activeCaption);
				panelDatosPersonalesE.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Datos personales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
				panelDatosPersonalesE.setBounds(10, 92, 536, 230);
				panelEmpleado.add(panelDatosPersonalesE);
				panelDatosPersonalesE.setLayout(null);
				{
					lblIdE = new JLabel("ID:");
					lblIdE.setBounds(203, 54, 45, 19);
					panelDatosPersonalesE.add(lblIdE);
					lblIdE.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtIdEmpleado = new JTextField();
					txtIdEmpleado.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtIdEmpleado.setBounds(288, 53, 222, 25);
					panelDatosPersonalesE.add(txtIdEmpleado);
					txtIdEmpleado.addKeyListener(this);
					txtIdEmpleado.setColumns(10);
				}
				{
					txtDniEmpleado = new JTextField();
					txtDniEmpleado.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtDniEmpleado.setBounds(288, 89, 222, 25);
					panelDatosPersonalesE.add(txtDniEmpleado);
					txtDniEmpleado.addKeyListener(this);
					txtDniEmpleado.setColumns(10);
				}
				{
					lblDniE = new JLabel("N° DNI:");
					lblDniE.setBounds(203, 90, 75, 19);
					panelDatosPersonalesE.add(lblDniE);
					lblDniE.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					lblTelefono = new JLabel("Teléfono:");
					lblTelefono.setBounds(204, 162, 87, 19);
					panelDatosPersonalesE.add(lblTelefono);
					lblTelefono.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtTelefono.setBounds(288, 161, 222, 25);
					panelDatosPersonalesE.add(txtTelefono);
					txtTelefono.addKeyListener(this);
					txtTelefono.setColumns(10);
				}
				{
					txtNombreEmpleado = new JTextField();
					txtNombreEmpleado.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtNombreEmpleado.setBounds(288, 125, 222, 25);
					panelDatosPersonalesE.add(txtNombreEmpleado);
					txtNombreEmpleado.addKeyListener(this);
					txtNombreEmpleado.setColumns(10);
				}
				{
					lblNombreCompletoE = new JLabel("Nombre:");
					lblNombreCompletoE.setBounds(203, 126, 158, 19);
					panelDatosPersonalesE.add(lblNombreCompletoE);
					lblNombreCompletoE.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					lblNewLabel_1 = new JLabel("New label");
					lblNewLabel_1.setIcon(new ImageIcon(VenAdministrador.class.getResource("/recursos/empleadoicon2.png")));
					lblNewLabel_1.setBounds(25, 33, 168, 173);
					panelDatosPersonalesE.add(lblNewLabel_1);
				}
			}
			{
				btnRegistrarEmpleado = new JButton("Registrar");
				btnRegistrarEmpleado.setBounds(328, 363, 116, 25);
				panelEmpleado.add(btnRegistrarEmpleado);
				btnRegistrarEmpleado.addActionListener(this);
				btnRegistrarEmpleado.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
			{
				btnModificarEmpleado = new JButton("Modificar");
				btnModificarEmpleado.setBounds(455, 363, 116, 25);
				panelEmpleado.add(btnModificarEmpleado);
				btnModificarEmpleado.addActionListener(this);
				btnModificarEmpleado.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
			{
				btnBorrarEmpleado = new JButton("Limpiar");
				btnBorrarEmpleado.setBounds(581, 363, 116, 25);
				panelEmpleado.add(btnBorrarEmpleado);
				btnBorrarEmpleado.addActionListener(this);
				btnBorrarEmpleado.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
			{
				panelDatosLaborales = new JPanel();
				panelDatosLaborales.setBackground(SystemColor.activeCaption);
				panelDatosLaborales.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Datos laborales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
				panelDatosLaborales.setBounds(556, 92, 461, 230);
				panelEmpleado.add(panelDatosLaborales);
				panelDatosLaborales.setLayout(null);
				{
					lblCargo = new JLabel("Cargo:");
					lblCargo.setBounds(82, 38, 69, 19);
					panelDatosLaborales.add(lblCargo);
					lblCargo.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					cboCargo = new JComboBox();
					cboCargo.setBounds(161, 35, 222, 25);
					panelDatosLaborales.add(cboCargo);
					cboCargo.setModel(new DefaultComboBoxModel(new String[] {"Cajero", "Vendedor"}));
					cboCargo.setFont(new Font("Verdana", Font.PLAIN, 15));
				}
				{
					cboJornada = new JComboBox();
					cboJornada.setBounds(161, 71, 222, 25);
					panelDatosLaborales.add(cboJornada);
					cboJornada.setModel(new DefaultComboBoxModel(new String[] {"Tiempo completo", "Medio tiempo"}));
					cboJornada.setFont(new Font("Verdana", Font.PLAIN, 15));
				}
				{
					lblJornada = new JLabel("Jornada:");
					lblJornada.setBounds(82, 74, 81, 19);
					panelDatosLaborales.add(lblJornada);
					lblJornada.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					lblHorario = new JLabel("Horario:");
					lblHorario.setBounds(82, 110, 69, 19);
					panelDatosLaborales.add(lblHorario);
					lblHorario.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					cboHorario = new JComboBox();
					cboHorario.setBounds(161, 107, 222, 25);
					panelDatosLaborales.add(cboHorario);
					cboHorario.setModel(new DefaultComboBoxModel(new String[] {"7:00 a.m. - 4:00 p.m.", "8:00 a.m. - 5:00 p.m.", "8:00 a.m. - 12:00 a.m.", "9:00 a.m. - 6:00 p.m.", "10:00 a.m. - 7:00 p.m.", "12:00 a.m. - 4:00 p.m.", "1:00 p.m. - 5:00 p.m.", "2:00 p.m. - 6:00 p.m."}));
					cboHorario.setFont(new Font("Verdana", Font.PLAIN, 15));
				}
				{
					lblSueldo = new JLabel("Sueldo:");
					lblSueldo.setBounds(82, 144, 69, 19);
					panelDatosLaborales.add(lblSueldo);
					lblSueldo.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtSueldo = new JTextField();
					txtSueldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
					txtSueldo.setBounds(161, 143, 222, 25);
					panelDatosLaborales.add(txtSueldo);
					txtSueldo.addKeyListener(this);
					txtSueldo.setColumns(10);
				}
				{
					lblEstado = new JLabel("Estado:");
					lblEstado.setBounds(82, 180, 69, 19);
					panelDatosLaborales.add(lblEstado);
					lblEstado.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtEstadoEmpleado = new JTextField();
					txtEstadoEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 15));
					txtEstadoEmpleado.setBounds(161, 179, 222, 25);
					panelDatosLaborales.add(txtEstadoEmpleado);
					txtEstadoEmpleado.addKeyListener(this);
					txtEstadoEmpleado.setColumns(10);
				}
			}
			
			panelProducto = new JPanel();
			panelProducto.setBackground(SystemColor.activeCaption);
			panelProducto.addMouseListener(this);
			tabbedPane.addTab("   Producto       ", iconProducto, panelProducto, null);
			panelProducto.setLayout(null);
			{
				lblIdBuscarP = new JLabel("Buscar:");
				lblIdBuscarP.setFont(new Font("Verdana", Font.BOLD, 15));
				lblIdBuscarP.setBounds(10, 57, 69, 19);
				panelProducto.add(lblIdBuscarP);
			}
			{
				txtIdProdBuscar = new JTextField();
				txtIdProdBuscar.setFont(new Font("Verdana", Font.PLAIN, 15));
				txtIdProdBuscar.addKeyListener(this);
				txtIdProdBuscar.setColumns(10);
				txtIdProdBuscar.setBackground(Color.WHITE);
				txtIdProdBuscar.setBounds(89, 56, 377, 25);
				panelProducto.add(txtIdProdBuscar);
			}
			{
				lblRegistrarProducto = new JLabel("REGISTRO DE PRODUCTOS");
				lblRegistrarProducto.setFont(new Font("Verdana", Font.BOLD, 25));
				lblRegistrarProducto.setBounds(326, 11, 401, 43);
				panelProducto.add(lblRegistrarProducto);
			}
			{
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(10, 405, 1007, 291);
				panelProducto.add(scrollPane_2);
				{
					tablaProducto = new JTable();
					tablaProducto.setFont(new Font("Verdana", Font.PLAIN, 11));
					tablaProducto.addMouseListener(this);
					tablaProducto.setFillsViewportHeight(true);
					scrollPane_2.setViewportView(tablaProducto);
				}
			}
			{
				btnMostrarProducto = new JButton("Mostrar");
				btnMostrarProducto.addActionListener(this);
				btnMostrarProducto.setFont(new Font("Verdana", Font.PLAIN, 13));
				btnMostrarProducto.setBounds(901, 369, 116, 25);
				panelProducto.add(btnMostrarProducto);
			}
			{
				panelRegistrarProducto = new JPanel();
				panelRegistrarProducto.setBackground(SystemColor.activeCaption);
				panelRegistrarProducto.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Registrar producto", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
				panelRegistrarProducto.setBounds(10, 87, 508, 308);
				panelProducto.add(panelRegistrarProducto);
				panelRegistrarProducto.setLayout(null);
				{
					lblIdP = new JLabel("ID:");
					lblIdP.setBounds(28, 38, 45, 19);
					panelRegistrarProducto.add(lblIdP);
					lblIdP.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtIdProducto = new JTextField();
					txtIdProducto.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtIdProducto.setBounds(128, 38, 222, 25);
					panelRegistrarProducto.add(txtIdProducto);
					txtIdProducto.addKeyListener(this);
					txtIdProducto.setColumns(10);
				}
				{
					txtCategoria = new JTextField();
					txtCategoria.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtCategoria.setBounds(128, 74, 222, 25);
					panelRegistrarProducto.add(txtCategoria);
					txtCategoria.addKeyListener(this);
					txtCategoria.setColumns(10);
				}
				{
					txtNombreProducto = new JTextField();
					txtNombreProducto.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtNombreProducto.setBounds(128, 110, 222, 25);
					panelRegistrarProducto.add(txtNombreProducto);
					txtNombreProducto.setColumns(10);
				}
				{
					lblCategoria = new JLabel("Categoría:");
					lblCategoria.setBounds(28, 74, 87, 19);
					panelRegistrarProducto.add(lblCategoria);
					lblCategoria.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					lblNombreP = new JLabel("Nombre:");
					lblNombreP.setBounds(28, 110, 87, 19);
					panelRegistrarProducto.add(lblNombreP);
					lblNombreP.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtGarantia = new JTextField();
					txtGarantia.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtGarantia.setBounds(128, 146, 222, 25);
					panelRegistrarProducto.add(txtGarantia);
					txtGarantia.setColumns(10);
				}
				{
					lblGarantia = new JLabel("Garantía:");
					lblGarantia.setBounds(28, 146, 87, 19);
					panelRegistrarProducto.add(lblGarantia);
					lblGarantia.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtIdProveedor = new JTextField();
					txtIdProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtIdProveedor.setBounds(128, 182, 222, 25);
					panelRegistrarProducto.add(txtIdProveedor);
					txtIdProveedor.addKeyListener(this);
					txtIdProveedor.setColumns(10);
				}
				{
					lblIdProveedor = new JLabel("Proveedor:");
					lblIdProveedor.setBounds(28, 182, 118, 19);
					panelRegistrarProducto.add(lblIdProveedor);
					lblIdProveedor.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtPrecio = new JTextField();
					txtPrecio.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtPrecio.setBounds(128, 218, 222, 25);
					panelRegistrarProducto.add(txtPrecio);
					txtPrecio.addKeyListener(this);
					txtPrecio.setColumns(10);
				}
				{
					txtCantProducto = new JTextField();
					txtCantProducto.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtCantProducto.setBounds(128, 254, 222, 25);
					panelRegistrarProducto.add(txtCantProducto);
					txtCantProducto.addKeyListener(this);
					txtCantProducto.setColumns(10);
				}
				{
					lblPrecio = new JLabel("Precio:");
					lblPrecio.setBounds(28, 218, 69, 19);
					panelRegistrarProducto.add(lblPrecio);
					lblPrecio.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					lblCantProducto = new JLabel("Cantidad:");
					lblCantProducto.setBounds(28, 254, 87, 19);
					panelRegistrarProducto.add(lblCantProducto);
					lblCantProducto.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					btnRegistrarProducto = new JButton("Registrar");
					btnRegistrarProducto.setBounds(360, 124, 116, 25);
					panelRegistrarProducto.add(btnRegistrarProducto);
					btnRegistrarProducto.addActionListener(this);
					btnRegistrarProducto.setFont(new Font("Verdana", Font.PLAIN, 13));
				}
				{
					btnModificarProducto = new JButton("Modificar");
					btnModificarProducto.setBounds(360, 166, 116, 25);
					panelRegistrarProducto.add(btnModificarProducto);
					btnModificarProducto.addActionListener(this);
					btnModificarProducto.setFont(new Font("Verdana", Font.PLAIN, 13));
				}
			}
			{
				panelRegistrarStock = new JPanel();
				panelRegistrarStock.setBackground(SystemColor.activeCaption);
				panelRegistrarStock.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Registrar stock", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
				panelRegistrarStock.setBounds(528, 243, 489, 115);
				panelProducto.add(panelRegistrarStock);
				panelRegistrarStock.setLayout(null);
				{
					lblIdStock = new JLabel("ID:");
					lblIdStock.setBounds(28, 31, 45, 19);
					panelRegistrarStock.add(lblIdStock);
					lblIdStock.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					txtIdProdStock = new JTextField();
					txtIdProdStock.setBounds(116, 31, 222, 25);
					panelRegistrarStock.add(txtIdProdStock);
					txtIdProdStock.addKeyListener(this);
					txtIdProdStock.setColumns(10);
				}
				{
					txtCantStock = new JTextField();
					txtCantStock.setBounds(116, 67, 222, 25);
					panelRegistrarStock.add(txtCantStock);
					txtCantStock.addKeyListener(this);
					txtCantStock.setColumns(10);
				}
				{
					lblCantStock = new JLabel("Cantidad:");
					lblCantStock.setBounds(28, 66, 87, 19);
					panelRegistrarStock.add(lblCantStock);
					lblCantStock.setFont(new Font("Verdana", Font.BOLD, 15));
				}
				{
					btnRegistrarStock = new JButton("Registrar");
					btnRegistrarStock.setBounds(348, 48, 116, 25);
					panelRegistrarStock.add(btnRegistrarStock);
					btnRegistrarStock.addActionListener(this);
					btnRegistrarStock.setFont(new Font("Verdana", Font.PLAIN, 13));
				}
			}
			{
				btnBorrarProducto = new JButton("Limpiar");
				btnBorrarProducto.setBounds(528, 369, 116, 25);
				panelProducto.add(btnBorrarProducto);
				btnBorrarProducto.addActionListener(this);
				btnBorrarProducto.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
			{
				lblNewLabel_5 = new JLabel("New label");
				lblNewLabel_5.setIcon(new ImageIcon(VenAdministrador.class.getResource("/recursos/productoicon2.png")));
				lblNewLabel_5.setBounds(632, 57, 280, 175);
				panelProducto.add(lblNewLabel_5);
			}
			{
				panelVenta = new JPanel();
				panelVenta.setBackground(SystemColor.activeCaption);
				panelVenta.addMouseListener(this);
				tabbedPane.addTab("     Venta         ", iconVenta, panelVenta, null);
				panelVenta.setLayout(null);
				{
					scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(10, 107, 1007, 423);
					panelVenta.add(scrollPane_1);
					{
						tablaHistorialVentas = new JTable();
						tablaHistorialVentas.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaHistorialVentas.addMouseListener(this);
						tablaHistorialVentas.setFillsViewportHeight(true);
						scrollPane_1.setViewportView(tablaHistorialVentas);
					}
				}
				{
					lblBuscarHistorial = new JLabel("Buscar:");
					lblBuscarHistorial.setFont(new Font("Verdana", Font.BOLD, 15));
					lblBuscarHistorial.setBounds(10, 65, 82, 19);
					panelVenta.add(lblBuscarHistorial);
				}
				{
					txtBuscarHistorialVentas = new JTextField();
					txtBuscarHistorialVentas.addKeyListener(this);
					txtBuscarHistorialVentas.setColumns(10);
					txtBuscarHistorialVentas.setBackground(Color.WHITE);
					txtBuscarHistorialVentas.setBounds(91, 64, 926, 25);
					panelVenta.add(txtBuscarHistorialVentas);
				}
				{
					lblHistorialVentas = new JLabel("HISTORIAL DE VENTAS");
					lblHistorialVentas.setFont(new Font("Verdana", Font.BOLD, 25));
					lblHistorialVentas.setBounds(350, 11, 361, 46);
					panelVenta.add(lblHistorialVentas);
				}
				{
					panel = new JPanel();
					panel.setBackground(new Color(153, 0, 0));
					panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Eliminar venta", TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE));
					panel.setBounds(10, 541, 1007, 155);
					panelVenta.add(panel);
					panel.setLayout(null);
					{
						lblEliminar = new JLabel("Cód:");
						lblEliminar.setForeground(new Color(255, 255, 255));
						lblEliminar.setBounds(437, 72, 53, 19);
						panel.add(lblEliminar);
						lblEliminar.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtEliminarHistorial = new JTextField();
						txtEliminarHistorial.setBounds(483, 68, 92, 25);
						panel.add(txtEliminarHistorial);
						txtEliminarHistorial.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtEliminarHistorial.setColumns(10);
						txtEliminarHistorial.setBackground(Color.WHITE);
					}
					{
						btnEliminarVenta = new JButton("Eliminar");
						btnEliminarVenta.setBounds(585, 69, 116, 25);
						panel.add(btnEliminarVenta);
						btnEliminarVenta.addActionListener(this);
						btnEliminarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						lblNewLabel_4 = new JLabel("New label");
						lblNewLabel_4.setIcon(new ImageIcon(VenAdministrador.class.getResource("/recursos/ventaicon2.png")));
						lblNewLabel_4.setBounds(276, 27, 130, 112);
						panel.add(lblNewLabel_4);
					}
				}
			}
			{
				panelProveedor = new JPanel();
				panelProveedor.setBackground(SystemColor.activeCaption);
				panelProveedor.addMouseListener(this);
				tabbedPane.addTab("   Proveedor      ", iconProveedor, panelProveedor, null);
				panelProveedor.setLayout(null);
				{
					scrollPane_3 = new JScrollPane();
					scrollPane_3.setBounds(373, 145, 644, 551);
					panelProveedor.add(scrollPane_3);
					{
						tablaProveedor = new JTable();
						tablaProveedor.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaProveedor.addMouseListener(this);
						tablaProveedor.setFillsViewportHeight(true);
						scrollPane_3.setViewportView(tablaProveedor);
					}
				}
				{
					txtBuscarProveedor = new JTextField();
					txtBuscarProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtBuscarProveedor.addKeyListener(this);
					txtBuscarProveedor.setColumns(10);
					txtBuscarProveedor.setBackground(Color.WHITE);
					txtBuscarProveedor.setBounds(448, 71, 569, 25);
					panelProveedor.add(txtBuscarProveedor);
				}
				{
					lblNewLabel = new JLabel("Buscar:");
					lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
					lblNewLabel.setBounds(373, 77, 79, 14);
					panelProveedor.add(lblNewLabel);
				}
				{
					btnMostrarProveedor = new JButton("Mostrar");
					btnMostrarProveedor.addActionListener(this);
					btnMostrarProveedor.setFont(new Font("Verdana", Font.PLAIN, 13));
					btnMostrarProveedor.setBounds(901, 109, 116, 25);
					panelProveedor.add(btnMostrarProveedor);
				}
				{
					panelDatosPersonalesProv = new JPanel();
					panelDatosPersonalesProv.setBackground(SystemColor.activeCaption);
					panelDatosPersonalesProv.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Datos personales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
					panelDatosPersonalesProv.setBounds(10, 71, 355, 625);
					panelProveedor.add(panelDatosPersonalesProv);
					panelDatosPersonalesProv.setLayout(null);
					{
						lblId = new JLabel("ID:");
						lblId.setBounds(21, 233, 31, 14);
						panelDatosPersonalesProv.add(lblId);
						lblId.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtIDProveedor = new JTextField();
						txtIDProveedor.setBounds(110, 229, 222, 25);
						panelDatosPersonalesProv.add(txtIDProveedor);
						txtIDProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtIDProveedor.addKeyListener(this);
						txtIDProveedor.setColumns(10);
						txtIDProveedor.setBackground(Color.WHITE);
					}
					{
						lblRuc = new JLabel("RUC:");
						lblRuc.setBounds(21, 271, 44, 14);
						panelDatosPersonalesProv.add(lblRuc);
						lblRuc.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtRucProveedor = new JTextField();
						txtRucProveedor.setBounds(110, 265, 222, 25);
						panelDatosPersonalesProv.add(txtRucProveedor);
						txtRucProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtRucProveedor.addKeyListener(this);
						txtRucProveedor.setColumns(10);
						txtRucProveedor.setBackground(Color.WHITE);
					}
					{
						lblNombre = new JLabel("Nombre:");
						lblNombre.setBounds(21, 307, 84, 14);
						panelDatosPersonalesProv.add(lblNombre);
						lblNombre.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtNombreProveedor = new JTextField();
						txtNombreProveedor.setBounds(110, 301, 222, 25);
						panelDatosPersonalesProv.add(txtNombreProveedor);
						txtNombreProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtNombreProveedor.addKeyListener(this);
						txtNombreProveedor.setColumns(10);
						txtNombreProveedor.setBackground(Color.WHITE);
					}
					{
						lblTelfono = new JLabel("Teléfono:");
						lblTelfono.setBounds(21, 343, 107, 14);
						panelDatosPersonalesProv.add(lblTelfono);
						lblTelfono.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtTelefonoProveedor = new JTextField();
						txtTelefonoProveedor.setBounds(110, 337, 222, 25);
						panelDatosPersonalesProv.add(txtTelefonoProveedor);
						txtTelefonoProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtTelefonoProveedor.addKeyListener(this);
						txtTelefonoProveedor.setColumns(10);
						txtTelefonoProveedor.setBackground(Color.WHITE);
					}
					{
						lblCorreo = new JLabel("Correo:");
						lblCorreo.setBounds(21, 379, 78, 14);
						panelDatosPersonalesProv.add(lblCorreo);
						lblCorreo.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtCorreoProveedor = new JTextField();
						txtCorreoProveedor.setBounds(110, 373, 222, 25);
						panelDatosPersonalesProv.add(txtCorreoProveedor);
						txtCorreoProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtCorreoProveedor.addKeyListener(this);
						txtCorreoProveedor.setColumns(10);
						txtCorreoProveedor.setBackground(Color.WHITE);
					}
					{
						lblDireccin = new JLabel("Dirección:");
						lblDireccin.setBounds(21, 415, 107, 14);
						panelDatosPersonalesProv.add(lblDireccin);
						lblDireccin.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtDireccionProveedor = new JTextField();
						txtDireccionProveedor.setBounds(110, 409, 222, 25);
						panelDatosPersonalesProv.add(txtDireccionProveedor);
						txtDireccionProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtDireccionProveedor.addKeyListener(this);
						txtDireccionProveedor.setColumns(10);
						txtDireccionProveedor.setBackground(Color.WHITE);
					}
					{
						lblCorreo_2 = new JLabel("Estado:");
						lblCorreo_2.setBounds(21, 450, 78, 14);
						panelDatosPersonalesProv.add(lblCorreo_2);
						lblCorreo_2.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtEstadoProveedor = new JTextField();
						txtEstadoProveedor.setBounds(110, 445, 222, 25);
						panelDatosPersonalesProv.add(txtEstadoProveedor);
						txtEstadoProveedor.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtEstadoProveedor.addKeyListener(this);
						txtEstadoProveedor.setColumns(10);
						txtEstadoProveedor.setBackground(Color.WHITE);
					}
					{
						btnRegistrarProveedor = new JButton("Registrar");
						btnRegistrarProveedor.setBounds(47, 510, 116, 25);
						panelDatosPersonalesProv.add(btnRegistrarProveedor);
						btnRegistrarProveedor.addActionListener(this);
						btnRegistrarProveedor.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						btnModificarProveedor = new JButton("Modificar");
						btnModificarProveedor.setBounds(194, 510, 116, 25);
						panelDatosPersonalesProv.add(btnModificarProveedor);
						btnModificarProveedor.addActionListener(this);
						btnModificarProveedor.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						btnBorrarProveedor = new JButton("Limpiar");
						btnBorrarProveedor.setBounds(122, 556, 116, 25);
						panelDatosPersonalesProv.add(btnBorrarProveedor);
						btnBorrarProveedor.addActionListener(this);
						btnBorrarProveedor.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						lblNewLabel_2 = new JLabel("New label");
						lblNewLabel_2.setIcon(new ImageIcon(VenAdministrador.class.getResource("/recursos/proveedoricon2.png")));
						lblNewLabel_2.setBounds(95, 28, 168, 180);
						panelDatosPersonalesProv.add(lblNewLabel_2);
					}
				}
				{
					lblNewLabel_3 = new JLabel("REGISTRO DE PROVEEDORES");
					lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 25));
					lblNewLabel_3.setBounds(309, 11, 431, 32);
					panelProveedor.add(lblNewLabel_3);
				}
			}
			lblclock = new JLabel("");
			lblclock.setBounds(1090, 10, 256, 19);
			contentPane.add(lblclock);
			lblclock.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
		    clock();
		}
		ListarProducto("");
		ListarEmpleado("");
		ListarHistorialVentas("");
		ListarProveedor("");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminarVenta) {
			do_btnEliminarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnModificarProveedor) {
			do_btnModificarProveedor_actionPerformed(e);
		}
		if (e.getSource() == btnBorrarProveedor) {
			do_btnBorrarProveedor_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarProveedor) {
			do_btnMostrarProveedor_actionPerformed(e);
		}
		if (e.getSource() == btnBorrarProducto) {
			do_btnBorrarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarProducto) {
			do_btnMostrarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnBorrarEmpleado) {
			do_btnBorrarEmpleado_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarEmpleado) {
			do_btnMostrarEmpleado_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarProveedor) {
			do_btnRegistrarProveedor_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarStock) {
			do_btnRegistrarStock_actionPerformed(e);
		}
		if (e.getSource() == btnModificarProducto) {
			do_btnModificarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarProducto) {
			do_btnRegistrarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnModificarEmpleado) {
			do_btnModificarEmpleado_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarEmpleado) {
			do_btnRegistrarEmpleado_actionPerformed(e);
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == txtBuscarProveedor) {
			do_txtBuscarProveedor_keyPressed(e);
		}
		if (e.getSource() == txtBuscarHistorialVentas) {
			do_txtBuscarHistorialVentas_keyPressed(e);
		}
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtBuscarEmple) {
			do_txtIdEmpleBuscar_keyReleased(e);
		}
		if (e.getSource() == txtIdProdBuscar) {
			do_txtIdProdBuscar_keyReleased(e);
		}
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtEstadoEmpleado) {
			do_txtEstadoEmpleado_keyTyped(e);
		}
		if (e.getSource() == txtNombreProveedor) {
			do_txtNombreProveedor_keyTyped(e);
		}
		if (e.getSource() == txtTelefonoProveedor) {
			do_txtTelefonoProveedor_keyTyped(e);
		}
		if (e.getSource() == txtRucProveedor) {
			do_txtRucProveedor_keyTyped(e);
		}
		if (e.getSource() == txtIDProveedor) {
			do_txtIDProveedor_keyTyped(e);
		}
		if (e.getSource() == txtIdProveedor) {
			do_txtIdProveedor_keyTyped(e);
		}
		if (e.getSource() == txtSueldo) {
			do_txtSueldo_keyTyped(e);
		}
		if (e.getSource() == txtTelefono) {
			do_txtTelefono_keyTyped(e);
		}
		if (e.getSource() == txtNombreEmpleado) {
			do_txtNombreEmpleado_keyTyped(e);
		}
		if (e.getSource() == txtDniEmpleado) {
			do_txtDniEmpleado_keyTyped(e);
		}
		if (e.getSource() == txtIdEmpleado) {
			do_txtIdEmpleado_keyTyped(e);
		}
		if (e.getSource() == txtCantStock) {
			do_txtCantStock_keyTyped(e);
		}
		if (e.getSource() == txtIdProdStock) {
			do_txtIdProdStock_keyTyped(e);
		}
		if (e.getSource() == txtCantProducto) {
			do_txtCantProducto_keyTyped(e);
		}
		if (e.getSource() == txtPrecio) {
			do_txtPrecio_keyTyped(e);
		}
		if (e.getSource() == txtCategoria) {
			do_txtCategoria_keyTyped(e);
		}
		if (e.getSource() == txtIdProducto) {
			do_txtIdProducto_keyTyped(e);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tablaHistorialVentas) {
			do_tablaHistorialVentas_mouseClicked(e);
		}
		if (e.getSource() == tablaProveedor) {
			do_tablaProveedor_mouseClicked(e);
		}
		if (e.getSource() == tablaEmpleado) {
			do_tablaEmpleado_mouseClicked(e);
		}
		if (e.getSource() == tablaProducto) {
			do_tablaProducto_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	//                                                                                             EMPLEADO
	protected void do_txtIdEmpleado_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtDniEmpleado_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtNombreEmpleado_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}
	protected void do_txtTelefono_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtSueldo_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtEstadoEmpleado_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}
	public void ListarEmpleado(String filtro) {
		DefaultTableModel modelo = new DefaultTableModel();
		MantEmpleado me = new MantEmpleado();
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		if(filtro.length() == 0) lista = me.MostrarEmpleado();
		else lista = me.ConsultarEmpleado(filtro);
		
		modelo.setRowCount(lista.size());
		Iterator<Empleado> it = lista.iterator();
	    modelo.addColumn("ID");
	    modelo.addColumn("DNI");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Teléfono");
	    modelo.addColumn("Fecha");
	    modelo.addColumn("Cargo");
	    modelo.addColumn("Jornada");
	    modelo.addColumn("Horario");
	    modelo.addColumn("Sueldo");
	    modelo.addColumn("Estado");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Empleado e = (Empleado)obj;
	        modelo.setValueAt(e.getIdEmpleado(), i, 0);
	        modelo.setValueAt(e.getDniEmpleado(), i, 1);
	        modelo.setValueAt(e.getNombreEmpleado(), i, 2);
	        modelo.setValueAt(e.getTelefonoEmpleado(), i, 3);
	        modelo.setValueAt(e.getFechaEmpleado(), i, 4);
	        modelo.setValueAt(e.getCargoEmpleado(), i, 5);
	        modelo.setValueAt(e.getJornadaEmpleado(), i, 6);
	        modelo.setValueAt(e.getHorarioEmpleado(), i, 7);
	        modelo.setValueAt(e.getSueldoEmpleado(), i, 8);
	        modelo.setValueAt(e.getEstadoEmpleado(), i, 9);
	        i++;
		}
		tablaEmpleado.setModel(modelo);
	}
	protected void do_tablaEmpleado_mouseClicked(MouseEvent e) {
		int fila = tablaEmpleado.getSelectedRow();
		txtIdEmpleado.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 0)));
		txtDniEmpleado.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 1)));
		txtNombreEmpleado.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 2)));
		txtTelefono.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 3)));
		cboCargo.setSelectedItem(String.valueOf(tablaEmpleado.getValueAt(fila, 5)));
		cboJornada.setSelectedItem(String.valueOf(tablaEmpleado.getValueAt(fila, 6)));
		cboHorario.setSelectedItem(String.valueOf(tablaEmpleado.getValueAt(fila, 7)));
		txtSueldo.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 8)));
		txtEstadoEmpleado.setText(String.valueOf(tablaEmpleado.getValueAt(fila, 9)));
	}
	protected void do_btnRegistrarEmpleado_actionPerformed(ActionEvent e) {
		try {
			if(txtIdEmpleado.getText().length()==0 ||txtDniEmpleado.getText().length()==0 || txtNombreEmpleado.getText().length()==0
					|| txtTelefono.getText().length()==0 || txtSueldo.getText().length()==0 || txtEstadoEmpleado.getText().length()==0
					) {
				JOptionPane.showMessageDialog(this, "Rellene todos los campos.");
				return;
			}
			else {
			
			if(txtDniEmpleado.getText().length()!=8) {
				JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos");
				return;
			}
			
			if(txtTelefono.getText().length()!=9) {
				JOptionPane.showMessageDialog(this, "El Teléfono debe tener 9 dígitos");
				return;
			}
			Date fecha = java.sql.Date.valueOf(LocalDate.now());
				
			Empleado emple = new Empleado(Integer.parseInt(txtIdEmpleado.getText()), 
					txtDniEmpleado.getText(), txtNombreEmpleado.getText(), 
					txtTelefono.getText(), fecha, cboCargo.getSelectedItem().toString(), 
					cboJornada.getSelectedItem().toString(), cboHorario.getSelectedItem().toString(), 
					Double.parseDouble(txtSueldo.getText()), txtEstadoEmpleado.getText());		
			MantEmpleado me = new MantEmpleado();
			if(me.BuscarEmpleado(Integer.parseInt(txtIdEmpleado.getText())) != null) {
				JOptionPane.showMessageDialog(this, "Este ID ya se encuentra registrado");
				return;
			}
			if(me.BuscarEmpleadoporDNI(txtDniEmpleado.getText()) != null) {
				JOptionPane.showMessageDialog(this, "Este DNI ya se encuentra registrado");
				return;
			}
			me.AgregarEmpleado(emple);
			ListarEmpleado("");
			LimpiarEmpleado();
			}

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}	
	}
	protected void do_btnModificarEmpleado_actionPerformed(ActionEvent e) {
		try {
			if(txtIdEmpleado.getText().length()==0 ||txtDniEmpleado.getText().length()==0 || txtNombreEmpleado.getText().length()==0
					|| txtTelefono.getText().length()==0 || txtSueldo.getText().length()==0 || txtEstadoEmpleado.getText().length()==0
					) {
				JOptionPane.showMessageDialog(this, "Rellene todos los campos.");
				return;
			}
			else {
				Date fecha = java.sql.Date.valueOf(LocalDate.now());
				Empleado emple = new Empleado(Integer.parseInt(txtIdEmpleado.getText()), 
						txtDniEmpleado.getText(), txtNombreEmpleado.getText(), 
						txtTelefono.getText(), fecha, cboCargo.getSelectedItem().toString(), 
						cboJornada.getSelectedItem().toString(), cboHorario.getSelectedItem().toString(), 
						Double.parseDouble(txtSueldo.getText()), txtEstadoEmpleado.getText());
					
				 MantEmpleado me = new MantEmpleado();
				 me.ModificarEmpleado(emple);
				 ListarEmpleado(txtIdEmpleado.getText()); // Solo se mostrará ese empleado
				 tablaEmpleado.setRowSelectionInterval(0, 0);
				 LimpiarEmpleado();
			}
		}
		catch(Exception e2){
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	void LimpiarEmpleado() {
		txtIdEmpleado.setText("");
		txtDniEmpleado.setText("");
		txtNombreEmpleado.setText("");
		txtTelefono.setText("");
		txtSueldo.setText("");
		txtEstadoEmpleado.setText("");
	}
	protected void do_txtIdEmpleBuscar_keyReleased(KeyEvent e) {
		String filtro = txtBuscarEmple.getText();
		ListarEmpleado(filtro);
	}
	protected void do_btnMostrarEmpleado_actionPerformed(ActionEvent e) {
		ListarEmpleado("");
	}
	protected void do_btnBorrarEmpleado_actionPerformed(ActionEvent e) {
		LimpiarEmpleado();
	}
	//                                                                                             PRODUCTO
	protected void do_txtIdProducto_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}	
	}
	protected void do_txtCategoria_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}
	protected void do_txtIdProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtPrecio_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtCantProducto_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtIdProdStock_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtCantStock_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	public void ListarProducto(String filtro) {
		DefaultTableModel modelo = new DefaultTableModel();
		MantProducto mp = new MantProducto();
		ArrayList<Producto> lista = new ArrayList<Producto>();
		if(filtro.length() == 0) lista = mp.MostrarProducto();
		else lista = mp.ConsultarProducto(filtro);
		
		modelo.setRowCount(lista.size());
		Iterator<Producto> it = lista.iterator();
		modelo.addColumn("ID");
		modelo.addColumn("Categoría");
		modelo.addColumn("Nombre");
		modelo.addColumn("Garantía");
		modelo.addColumn("ID Proveedor");
		modelo.addColumn("Nombre Proveedor");
		modelo.addColumn("Precio");
		modelo.addColumn("Stock");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Producto p = (Producto)obj;
			modelo.setValueAt(p.getIdProducto(), i, 0);
			modelo.setValueAt(p.getCategoriaProducto(), i, 1);
			modelo.setValueAt(p.getNombreProducto(), i, 2);
			modelo.setValueAt(p.getGarantiaProducto(), i, 3);
			modelo.setValueAt(p.getProveedor().getIdProveedor(), i, 4);
			modelo.setValueAt(p.getProveedor().getNombreProveedor(), i, 5);
			modelo.setValueAt(p.getPrecioProducto(), i, 6);
			modelo.setValueAt(p.getStockProducto(), i, 7);
			i++;
		}
		tablaProducto.setModel(modelo);
	}
	protected void do_tablaProducto_mouseClicked(MouseEvent e) {
		int fila = tablaProducto.getSelectedRow();
		txtIdProducto.setText(String.valueOf(tablaProducto.getValueAt(fila, 0)));
		txtCategoria.setText(String.valueOf(tablaProducto.getValueAt(fila, 1)));
		txtNombreProducto.setText(String.valueOf(tablaProducto.getValueAt(fila, 2)));
		txtGarantia.setText(String.valueOf(tablaProducto.getValueAt(fila, 3)));
		txtIdProveedor.setText(String.valueOf(tablaProducto.getValueAt(fila, 4)));
		txtPrecio.setText(String.valueOf(tablaProducto.getValueAt(fila, 6)));
		txtCantProducto.setText(String.valueOf(tablaProducto.getValueAt(fila, 7)));
	}
	protected void do_btnRegistrarProducto_actionPerformed(ActionEvent e) {
		try {
			if(txtIdProducto.getText().length() == 0 || txtCategoria.getText().length()== 0  || txtNombreProducto.getText().length()== 0 
					|| txtGarantia.getText().length()== 0  || txtIdProveedor.getText().length()== 0
					|| txtPrecio.getText().length()== 0  || txtCantProducto.getText().length()== 0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar");
			}
			else {
				int idProveedor = Integer.parseInt(txtIdProveedor.getText());
				Proveedor proveedor = new Proveedor(idProveedor);
				MantProveedor mpv= new MantProveedor();
				
				if(	mpv.BuscarProveedor(idProveedor) == null) {
					JOptionPane.showMessageDialog(this, "Proveedor no encontrado");
					return;
				}
		
				Producto p = new Producto(Integer.parseInt(txtIdProducto.getText()), 
						txtCategoria.getText(), txtNombreProducto.getText(), 
						txtGarantia.getText(), proveedor , Double.parseDouble(txtPrecio.getText()), 
						Integer.parseInt(txtCantProducto.getText()));
				
				MantProducto mp = new MantProducto();
				
				if(mp.BuscarProducto(Integer.parseInt(txtIdProducto.getText())) != null) {
					JOptionPane.showMessageDialog(this, "ID del producto ya registrado");
					return;}
				
				mp.AgregarProducto(p);
				ListarProducto("");
				LimpiarProducto();
				JOptionPane.showMessageDialog(this, "Producto Registrado");
			}
							
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	protected void do_btnModificarProducto_actionPerformed(ActionEvent e) {
		try {
			if(txtIdProducto.getText().length() == 0 || txtCategoria.getText().length()== 0  || txtNombreProducto.getText().length()== 0 
					|| txtGarantia.getText().length()== 0  || txtIdProveedor.getText().length()== 0
					|| txtPrecio.getText().length()== 0  || txtCantProducto.getText().length()== 0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para modificar");
			}
			else {
				int idProveedor = Integer.parseInt(txtIdProveedor.getText());
				Proveedor proveedor = new Proveedor(idProveedor);
				 Producto p = new Producto(Integer.parseInt(txtIdProducto.getText()), 
						 txtCategoria.getText(), txtNombreProducto.getText(), 
						 txtGarantia.getText(), proveedor, Double.parseDouble(txtPrecio.getText()), 
						 Integer.parseInt(txtCantProducto.getText()));
					
				 MantProducto mp = new MantProducto();
				 mp.ModificarProducto(p);
				 ListarProducto(txtIdProducto.getText()); // Solo se mostrará ese producto
				 tablaProducto.setRowSelectionInterval(0, 0);
				 LimpiarProducto();
			}
		 } catch(Exception e2){
			 JOptionPane.showMessageDialog(this, "Verifique el ID ingresado. Intente de nuevo.");	 
		 }	 
	}
	void LimpiarProducto() {
		txtIdProducto.setText("");
		txtCategoria.setText("");
		txtNombreProducto.setText("");
		txtGarantia.setText("");
		txtPrecio.setText("");
		txtIdProveedor.setText("");
		txtCantProducto.setText("");
	}
	protected void do_btnRegistrarStock_actionPerformed(ActionEvent e) {	
		try {
			if(txtIdProdStock.getText().length() == 0 || txtCantStock.getText().length()== 0 ) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar el nuevo stock");
			}
			else {
			
			Producto p = new Producto(Integer.parseInt(txtIdProdStock.getText()), Integer.parseInt(txtCantStock.getText()));
			MantProducto mp = new MantProducto();
			if(	mp.BuscarProducto(Integer.parseInt(txtIdProdStock.getText())) == null) {
				JOptionPane.showMessageDialog(this, "Este producto no existe");	
            return;}
			if(Integer.parseInt(txtCantStock.getText()) <=0)
			{
	         	JOptionPane.showMessageDialog(this, "No se permite registrar un stock menor o igual a 0");	
            return;}
			mp.AumentarStock(p);
			ListarProducto("");
			LimpiarProductoStock();
			JOptionPane.showMessageDialog(this, "Stock registrado correctamente");	
			}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}

	}
	void LimpiarProductoStock() {
		txtIdProdStock.setText("");
		txtCantStock.setText("");
	}
	protected void do_txtIdProdBuscar_keyReleased(KeyEvent e) {
		String filtro = txtIdProdBuscar.getText();
		ListarProducto(filtro);
	}
	protected void do_btnMostrarProducto_actionPerformed(ActionEvent e) {
		ListarProducto("");
	}
	protected void do_btnBorrarProducto_actionPerformed(ActionEvent e) {
		LimpiarProducto();
		LimpiarProductoStock();
	}
	//                                                                                             HISTORIAL VENTA
	public void ListarHistorialVentas(String filtro) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    MantHistorialVentas mhv = new MantHistorialVentas();
	    ArrayList<HistorialVentas> lista = new ArrayList<HistorialVentas>();
		if(filtro.length() == 0) lista = mhv.ConsultarHistorialVentas(filtro);
		else lista = mhv.ConsultarHistorialVentas(filtro);

	    modelo.addColumn("Cód Venta");
	    modelo.addColumn("ID Detalle");
	    modelo.addColumn("DNI Cliente");
	    modelo.addColumn("Nombre Cliente");
	    modelo.addColumn("Teléfono Cliente");
	    modelo.addColumn("Fecha");
	    modelo.addColumn("Hora");
	    modelo.addColumn("ID Producto");
	    modelo.addColumn("Categoría Producto");
	    modelo.addColumn("Nombre Producto");
	    modelo.addColumn("Garantía");
	    modelo.addColumn("Precio");
	    modelo.addColumn("Cantidad");
	    modelo.addColumn("Tipo Pago");
	    modelo.addColumn("Comprobante");
	    modelo.addColumn("ID Vendedor");
	    modelo.addColumn("Vendedor");
	    modelo.addColumn("Subtotal");
	    modelo.addColumn("Total");

	    modelo.setRowCount(lista.size());
	    int i = 0;

	    for (HistorialVentas hv : lista) {
	    	modelo.setValueAt(hv.getVenta().getCodigoVenta(), i, 0);
	        modelo.setValueAt(hv.getDetalleVenta().getIdDetalleVenta(), i, 1);
	        modelo.setValueAt(hv.getVenta().getCliente().getDniCliente(), i, 2);
	        modelo.setValueAt(hv.getVenta().getCliente().getNombreCliente(), i, 3);
	        modelo.setValueAt(hv.getVenta().getCliente().getTelefonoCliente(), i, 4);
	        modelo.setValueAt(hv.getVenta().getFechaVenta(), i, 5);
	        modelo.setValueAt(hv.getVenta().getHoraVenta(), i, 6);
	        modelo.setValueAt(hv.getDetalleVenta().getProducto().getIdProducto(), i, 7);
	        modelo.setValueAt(hv.getDetalleVenta().getProducto().getCategoriaProducto(), i, 8);
	        modelo.setValueAt(hv.getDetalleVenta().getProducto().getNombreProducto(), i, 9);
	        modelo.setValueAt(hv.getDetalleVenta().getProducto().getGarantiaProducto(), i, 10);
	        modelo.setValueAt(hv.getDetalleVenta().getProducto().getPrecioProducto(), i, 11);
	        modelo.setValueAt(hv.getDetalleVenta().getCantidadDetalleVenta(), i, 12);
	        modelo.setValueAt(hv.getVenta().getTipopagoVenta(), i, 13);
	        modelo.setValueAt(hv.getVenta().getComprobanteVenta(), i, 14);
	        modelo.setValueAt(hv.getVenta().getEmpleado().getIdEmpleado(), i, 15);
	        modelo.setValueAt(hv.getVenta().getEmpleado().getNombreEmpleado(), i, 16);
	        modelo.setValueAt(hv.getDetalleVenta().getSubtotalDetalleVenta(), i, 17);
	        modelo.setValueAt(hv.getVenta().getTotalVenta(), i, 18);
	        i++;
	    }

	    tablaHistorialVentas.setModel(modelo);
	}
	protected void do_txtBuscarHistorialVentas_keyPressed(KeyEvent e) {
		String filtro = txtBuscarHistorialVentas.getText();
		ListarHistorialVentas(filtro);
	}
	protected void do_tablaHistorialVentas_mouseClicked(MouseEvent e) {
		int fila = tablaHistorialVentas.getSelectedRow();
		txtEliminarHistorial.setText(String.valueOf(tablaHistorialVentas.getValueAt(fila, 0)));

	}
	protected void do_btnEliminarVenta_actionPerformed(ActionEvent e) {
	    try {
	        if (txtEliminarHistorial.getText().trim().isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Ingrese una venta para eliminar.");
	            return;
	        }

	        int codVenta = Integer.parseInt(txtEliminarHistorial.getText());

	        int confirmacion = JOptionPane.showConfirmDialog(this,
	                "¿Está seguro de que desea eliminar esta venta y todos sus detalles?",
	                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

	        if (confirmacion == JOptionPane.YES_OPTION) {
	            MantVenta mv = new MantVenta();
	            mv.EliminarVentayDetalles(codVenta);
	            JOptionPane.showMessageDialog(this, "Venta eliminada correctamente.");
	            ListarHistorialVentas("");
	        }
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(this, "Error al eliminar la venta. Verifique.");
	    }
	}
	//                                                                                             PROVEEDOR
	protected void do_txtIDProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtRucProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtTelefonoProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}

	protected void do_txtNombreProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}

	protected void do_txtEstadoProveedor_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}
	public void ListarProveedor(String filtro) {
		DefaultTableModel modelo = new DefaultTableModel();
		MantProveedor mprov = new MantProveedor();
		ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
		if(filtro.length() == 0) lista = mprov.MostrarProveedor();
		else lista = mprov.ConsultarProveedor(filtro);
		modelo.setRowCount(lista.size());
		Iterator<Proveedor> it = lista.iterator();
		modelo.addColumn("ID");
		modelo.addColumn("RUC");
		modelo.addColumn("Nombre");
		modelo.addColumn("Teléfono");
		modelo.addColumn("Correo");
		modelo.addColumn("Dirección");
		modelo.addColumn("Estado");
		modelo.addColumn("Fecha");
		int i = 0;

		while (it.hasNext()) {
			Object obj = it.next();
			Proveedor pro = (Proveedor)obj;
			modelo.setValueAt(pro.getIdProveedor(), i, 0);
			modelo.setValueAt(pro.getRucProveedor(), i, 1);
			modelo.setValueAt(pro.getNombreProveedor(), i, 2);
			modelo.setValueAt(pro.getTelefonoProveedor(), i, 3);
			modelo.setValueAt(pro.getCorreoProveedor(), i, 4);
			modelo.setValueAt(pro.getDireccionProveedor(), i, 5);
			modelo.setValueAt(pro.getEstadoProveedor(), i, 6);
			modelo.setValueAt(pro.getFechaProveedor(), i, 7);
			i++;	
		}
		tablaProveedor.setModel(modelo); 
	}
	protected void do_tablaProveedor_mouseClicked(MouseEvent e) {
		int fila = tablaProveedor.getSelectedRow();
		txtIDProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 0)));
		txtRucProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 1)));
		txtNombreProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 2)));
		txtTelefonoProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 3)));
		txtCorreoProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 4)));
		txtDireccionProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 5)));
		txtEstadoProveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 6)));
	}
	protected void do_btnRegistrarProveedor_actionPerformed(ActionEvent e) {
		try {
			if(txtIDProveedor.getText().length() == 0 || txtRucProveedor.getText().length()== 0 ||
					txtNombreProveedor.getText().length() == 0 || txtTelefonoProveedor.getText().length()== 0 ||
					txtCorreoProveedor.getText().length() == 0 || txtDireccionProveedor.getText().length()== 0 ||
					txtEstadoProveedor.getText().length()== 0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar");
			}
			else {
			Date fecha = java.sql.Date.valueOf(LocalDate.now());
			Proveedor prov = new Proveedor(Integer.parseInt(txtIDProveedor.getText()), 
					txtRucProveedor.getText(), txtNombreProveedor.getText(), 
					txtTelefonoProveedor.getText(), txtCorreoProveedor.getText(), 
					txtDireccionProveedor.getText(), txtEstadoProveedor.getText(), fecha);
			if(txtRucProveedor.getText().length() != 11) {
				JOptionPane.showMessageDialog(this, "El ruc debe tener 11 dígitos");
				return;
			}
			if(txtTelefonoProveedor.getText().length() != 9) {
				JOptionPane.showMessageDialog(this, "El teléfono debe tener 9 dígitos");
				return;
			}
			MantProveedor mprov = new MantProveedor();
			if(	mprov.BuscarProveedor(Integer.parseInt(txtIDProveedor.getText())) != null) {
				JOptionPane.showMessageDialog(this, "ID ya registrado");
				return;}
			if(	mprov.BuscarProveedorporRuc(txtRucProveedor.getText()) != null) {
				JOptionPane.showMessageDialog(this, "RUC ya registrado");
				return;}
			mprov.AgregarProveedor(prov);
			ListarProveedor("");
			LimpiarProveedor();
			JOptionPane.showMessageDialog(this, "Proveedor Añadido");
			}				
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	protected void do_btnModificarProveedor_actionPerformed(ActionEvent e) {
		try {
			if(txtIDProveedor.getText().length() == 0 || txtRucProveedor.getText().length()== 0 ||
					txtNombreProveedor.getText().length() == 0 || txtTelefonoProveedor.getText().length()== 0 ||
					txtCorreoProveedor.getText().length() == 0 || txtDireccionProveedor.getText().length()== 0 ||
					txtEstadoProveedor.getText().length()== 0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar");
			}
			else {
				Date fecha = java.sql.Date.valueOf(LocalDate.now());
				Proveedor prov = new Proveedor(Integer.parseInt(txtIDProveedor.getText()), 
						txtRucProveedor.getText(), txtNombreProveedor.getText(), 
						txtTelefonoProveedor.getText(), txtCorreoProveedor.getText(), 
						txtDireccionProveedor.getText(), txtEstadoProveedor.getText(), fecha);
				
				MantProveedor mprov = new MantProveedor();
				mprov.ModificarProveedor(prov);
				LimpiarProveedor();
				ListarProveedor(""); 
			}	
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	
	void LimpiarProveedor() {
		txtIDProveedor.setText("");
		txtRucProveedor.setText("");
		txtNombreProveedor.setText("");
		txtTelefonoProveedor.setText("");
		txtCorreoProveedor.setText("");
		txtDireccionProveedor.setText("");
		txtEstadoProveedor.setText("");
	}
	protected void do_btnMostrarProveedor_actionPerformed(ActionEvent e) {
		ListarProveedor("");
	}
	protected void do_btnBorrarProveedor_actionPerformed(ActionEvent e) {
		LimpiarProveedor();
	}
	protected void do_txtBuscarProveedor_keyPressed(KeyEvent e) {
		String filtro = txtBuscarProveedor.getText();
		ListarProveedor(filtro);
	}
}
