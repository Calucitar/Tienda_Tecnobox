package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clase.Cliente;
import clase.DetalleVenta;
import clase.Empleado;
import clase.HistorialVentas;
import clase.Producto;
import clase.Proveedor;
import clase.Venta;
import mantenimiento.MantCliente;
import mantenimiento.MantDetalleVenta;
import mantenimiento.MantEmpleado;
import mantenimiento.MantHistorialVentas;
import mantenimiento.MantProducto;
import mantenimiento.MantProveedor;
import mantenimiento.MantVenta;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class VenEmpleado extends JFrame implements ActionListener, KeyListener, MouseListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox cboTipoPago;
	private JComboBox cboComprobante;
	private JLabel lblNewLabel;
	private JLabel lblComprobante;
	private JLabel lblId;
	private JLabel lblDni;
	private JLabel lblCantidad;
	private JTextField txtCantidadVenta;
private JLabel lblVendedor;
	
	private JLabel lblRegistroDeVentas;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblclock;
	private JTabbedPane tabbedPane;
	private JPanel panelVenta;
	private JPanel panelProducto;
	private JTextField txtIdBuscarProducto;
	private JLabel lblIdProducto;
	private JScrollPane scrollPane_1;
	private JPanel panelCliente;
	private JLabel lblDniCliente;
	private JLabel lblIdNombreCliente;
	private JLabel lblTeleCliente;
	private JTextField txtDniCliente;
	private JTextField txtNombreCliente;
	private JTextField txtTelefonoCliente;
	private JScrollPane scrollPane_2;
	private JTable tablaCliente;
	private JButton btnRegistrarCliente;
	private JButton btnModificarCliente;
	private JTable tablaProducto;
	private JTextField txtBuscarCliente;
	private JLabel lblIdProducto_1;
	private JLabel lblCod;
	private JTextField txtCodEditable;
	private JLabel lblIdVendedor;
	private JComboBox cboIdVendedor;
	private JTextField txtNombreVendedor;
	private JTable tablaVenta;
	private JTextField txtDniClienteVenta;
	private JTextField txtIdProductoVenta;
	private JButton btnRegistrarDetalleVentas;
	private JButton btnModificarDetalleVenta;
	private JButton btnModificarVenta;
	private JPanel panelCalculadora;
	private JTextField txtPrecioVenta;
	private JTextField txtCantVenta;
	private JLabel lblPrecio;
	private JLabel lblCantidadVenta;
	private JButton btnSuma;
	private JScrollPane scrollPane_3;
	private JTextArea txtS;
	private JButton btnBorrar;
	private JButton btnRegistrarVenta;
	private JButton btnEliminarVenta;
	private JLabel lblCodNoEditable;
	private JTextField txtCodNoEditable;
	private JLabel lblIdDetalle;
	private JTextField txtIdDetalle;
	private JButton btnBorrarVenta;
	private JButton btnBorrarCliente;
	private JButton btnMostrarCliente;
	private JButton btnTotal;
	private JButton btnMostrarVenta;
	private JButton btnMostrarDetalleVenta;
	private JButton btnMostrarVentaCompleta;
	private JButton btnEliminarDetalleVenta;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VenEmpleado frame = new VenEmpleado();
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
				
					lblclock.setText("Fecha: "+ day+"/"+month+"/"+year+"  Hora: "+hour+":"+minute+":"+second+tmam);
					sleep(1000);
					fecha= day+"/"+month+"/"+year;
					hora= hour+":"+minute+":"+second+tmam;
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
	public VenEmpleado() {
		setAlwaysOnTop(true);
		setTitle("Empleado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1370, 770);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 13, 1336, 712);
			contentPane.add(tabbedPane);
			{
				panelVenta = new JPanel();
				panelVenta.addMouseListener(this);
				panelVenta.setBackground(SystemColor.activeCaption);
				tabbedPane.addTab("Venta", null, panelVenta, null);
				panelVenta.setLayout(null);
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 355, 1311, 320);
					panelVenta.add(scrollPane);
					{
						tablaVenta = new JTable();
						tablaVenta.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaVenta.addMouseListener(this);
						tablaVenta.setFillsViewportHeight(true);
						scrollPane.setViewportView(tablaVenta);
					}
				}
				{
					panelCalculadora = new JPanel();
					panelCalculadora.setBackground(SystemColor.activeCaption);
					panelCalculadora.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Calculadora", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
					panelCalculadora.setBounds(10, 54, 217, 254);
					panelVenta.add(panelCalculadora);
					panelCalculadora.setLayout(null);
					{
						txtPrecioVenta = new JTextField();
						txtPrecioVenta.setFont(new Font("Verdana", Font.PLAIN, 11));
						txtPrecioVenta.addKeyListener(this);
						txtPrecioVenta.setBounds(76, 30, 86, 19);
						panelCalculadora.add(txtPrecioVenta);
						txtPrecioVenta.setColumns(10);
					}
					{
						txtCantVenta = new JTextField();
						txtCantVenta.setFont(new Font("Verdana", Font.PLAIN, 11));
						txtCantVenta.addKeyListener(this);
						txtCantVenta.setColumns(10);
						txtCantVenta.setBounds(76, 59, 86, 19);
						panelCalculadora.add(txtCantVenta);
					}
					{
						lblPrecio = new JLabel("Precio:");
						lblPrecio.setForeground(new Color(255, 255, 255));
						lblPrecio.setFont(new Font("Verdana", Font.BOLD, 11));
						lblPrecio.setBounds(10, 33, 45, 13);
						panelCalculadora.add(lblPrecio);
					}
					{
						lblCantidadVenta = new JLabel("Cantidad:");
						lblCantidadVenta.setForeground(new Color(255, 255, 255));
						lblCantidadVenta.setFont(new Font("Verdana", Font.BOLD, 11));
						lblCantidadVenta.setBounds(10, 62, 66, 13);
						panelCalculadora.add(lblCantidadVenta);
					}
					{
						scrollPane_3 = new JScrollPane();
						scrollPane_3.setBounds(10, 131, 197, 112);
						panelCalculadora.add(scrollPane_3);
						{
							txtS = new JTextArea();
							txtS.setFont(new Font("Verdana", Font.PLAIN, 11));
							txtS.setBackground(new Color(220, 220, 220));
							scrollPane_3.setViewportView(txtS);
						}
					}
					{
						btnSuma = new JButton("+");
						btnSuma.setBackground(new Color(255, 218, 185));
						btnSuma.setBounds(164, 45, 43, 25);
						panelCalculadora.add(btnSuma);
						btnSuma.setFont(new Font("Verdana", Font.PLAIN, 10));
						{
							btnBorrar = new JButton("Borrar");
							btnBorrar.setBackground(new Color(255, 218, 185));
							btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 11));
							btnBorrar.addActionListener(this);
							btnBorrar.setBounds(110, 88, 85, 21);
							panelCalculadora.add(btnBorrar);
						}
						{
							btnTotal = new JButton("Total");
							btnTotal.setBackground(new Color(255, 218, 185));
							btnTotal.setFont(new Font("Verdana", Font.PLAIN, 11));
							btnTotal.addActionListener(this);
							btnTotal.setBounds(20, 88, 85, 21);
							panelCalculadora.add(btnTotal);
						}
						{
							btnBorrarVenta = new JButton("Borrar");
							btnBorrarVenta.addActionListener(this);
							btnBorrarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							btnBorrarVenta.setBounds(1205, 320, 116, 25);
							panelVenta.add(btnBorrarVenta);
						}
						{
							btnMostrarVentaCompleta = new JButton("Mostrar");
							btnMostrarVentaCompleta.addActionListener(this);
							btnMostrarVentaCompleta.setFont(new Font("Verdana", Font.PLAIN, 13));
							btnMostrarVentaCompleta.setBounds(1079, 318, 116, 25);
							panelVenta.add(btnMostrarVentaCompleta);
						}
						{
							panel = new JPanel();
							panel.setBackground(SystemColor.activeCaption);
							panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Datos de la Venta", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
							panel.setBounds(237, 54, 543, 254);
							panelVenta.add(panel);
							panel.setLayout(null);
							{
								lblCodNoEditable = new JLabel("Cód:");
								lblCodNoEditable.setBounds(37, 24, 44, 25);
								panel.add(lblCodNoEditable);
								lblCodNoEditable.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtCodNoEditable = new JTextField();
								txtCodNoEditable.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtCodNoEditable.setBounds(159, 27, 222, 25);
								panel.add(txtCodNoEditable);
								txtCodNoEditable.setEnabled(false);
								txtCodNoEditable.setColumns(10);
							}
							{
								lblDni = new JLabel("DNI:");
								lblDni.setBounds(37, 60, 44, 25);
								panel.add(lblDni);
								lblDni.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtDniClienteVenta = new JTextField();
								txtDniClienteVenta.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtDniClienteVenta.setBounds(159, 62, 222, 25);
								panel.add(txtDniClienteVenta);
								txtDniClienteVenta.addKeyListener(this);
								txtDniClienteVenta.setColumns(10);
							}
							{
								lblNewLabel = new JLabel("Tipo de pago:");
								lblNewLabel.setBounds(37, 96, 116, 25);
								panel.add(lblNewLabel);
								lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								cboTipoPago = new JComboBox();
								cboTipoPago.setBounds(159, 98, 222, 25);
								panel.add(cboTipoPago);
								cboTipoPago.setFont(new Font("Verdana", Font.PLAIN, 15));
								cboTipoPago.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Débito", "Crédito", "Yape/Plin"}));
							}
							{
								lblIdVendedor = new JLabel("ID Vendedor:");
								lblIdVendedor.setBounds(37, 134, 116, 25);
								panel.add(lblIdVendedor);
								lblIdVendedor.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								cboComprobante = new JComboBox();
								cboComprobante.setBounds(159, 134, 222, 25);
								panel.add(cboComprobante);
								cboComprobante.setFont(new Font("Verdana", Font.PLAIN, 15));
								cboComprobante.setModel(new DefaultComboBoxModel(new String[] {"Boleta", "Factura"}));
							}
							{
								lblVendedor = new JLabel("Vendedor:");
								lblVendedor.setBounds(37, 168, 84, 25);
								panel.add(lblVendedor);
								lblVendedor.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								cboIdVendedor = new JComboBox();
								cboIdVendedor.setBounds(159, 170, 222, 25);
								panel.add(cboIdVendedor);
								cboIdVendedor.addItemListener(this);
								cboIdVendedor.setFont(new Font("Verdana", Font.PLAIN, 15));
							}
							{
								lblComprobante = new JLabel("Comprobante:");
								lblComprobante.setBounds(37, 204, 129, 25);
								panel.add(lblComprobante);
								lblComprobante.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtNombreVendedor =  new JTextField();
								txtNombreVendedor.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtNombreVendedor.setBounds(159, 206, 222, 25);
								panel.add(txtNombreVendedor);
								txtNombreVendedor.setEnabled(false);
								txtNombreVendedor.setColumns(10);
							}
							{
								btnMostrarVenta = new JButton("Mostrar");
								btnMostrarVenta.setBounds(391, 64, 116, 25);
								panel.add(btnMostrarVenta);
								btnMostrarVenta.addActionListener(this);
								btnMostrarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnRegistrarVenta = new JButton("Registrar");
								btnRegistrarVenta.setBounds(391, 97, 116, 25);
								panel.add(btnRegistrarVenta);
								btnRegistrarVenta.addActionListener(this);
								btnRegistrarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnModificarVenta = new JButton("Modificar");
								btnModificarVenta.setBounds(391, 132, 116, 25);
								panel.add(btnModificarVenta);
								btnModificarVenta.addActionListener(this);
								btnModificarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnEliminarVenta = new JButton("Eliminar");
								btnEliminarVenta.setBounds(391, 168, 116, 25);
								panel.add(btnEliminarVenta);
								btnEliminarVenta.addActionListener(this);
								btnEliminarVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
						}
						{
							panel_1 = new JPanel();
							panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Detalles de la Venta", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
							panel_1.setBackground(SystemColor.activeCaption);
							panel_1.setBounds(790, 54, 531, 254);
							panelVenta.add(panel_1);
							panel_1.setLayout(null);
							{
								lblIdDetalle = new JLabel("ID Detalle:");
								lblIdDetalle.setBounds(37, 63, 90, 25);
								panel_1.add(lblIdDetalle);
								lblIdDetalle.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtIdDetalle = new JTextField();
								txtIdDetalle.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtIdDetalle.setBounds(146, 63, 222, 25);
								panel_1.add(txtIdDetalle);
								txtIdDetalle.setEnabled(false);
								txtIdDetalle.setColumns(10);
							}
							{
								lblCod = new JLabel("Cód:");
								lblCod.setBounds(37, 95, 44, 25);
								panel_1.add(lblCod);
								lblCod.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtCodEditable = new JTextField();
								txtCodEditable.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtCodEditable.setBounds(146, 97, 222, 25);
								panel_1.add(txtCodEditable);
								txtCodEditable.addKeyListener(this);
								txtCodEditable.setColumns(10);
							}
							{
								lblId = new JLabel("ID Producto:");
								lblId.setBounds(37, 133, 116, 25);
								panel_1.add(lblId);
								lblId.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtIdProductoVenta = new JTextField();
								txtIdProductoVenta.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtIdProductoVenta.setBounds(146, 133, 222, 25);
								panel_1.add(txtIdProductoVenta);
								txtIdProductoVenta.addKeyListener(this);
								txtIdProductoVenta.setColumns(10);
							}
							{
								lblCantidad = new JLabel("Cantidad:");
								lblCantidad.setBounds(37, 166, 99, 25);
								panel_1.add(lblCantidad);
								lblCantidad.setFont(new Font("Verdana", Font.BOLD, 15));
							}
							{
								txtCantidadVenta = new JTextField();
								txtCantidadVenta.setFont(new Font("Verdana", Font.PLAIN, 15));
								txtCantidadVenta.setBounds(146, 168, 222, 25);
								panel_1.add(txtCantidadVenta);
								txtCantidadVenta.addKeyListener(this);
								txtCantidadVenta.setColumns(10);
							}
							{
								btnMostrarDetalleVenta = new JButton("Mostrar");
								btnMostrarDetalleVenta.setBounds(378, 63, 116, 25);
								panel_1.add(btnMostrarDetalleVenta);
								btnMostrarDetalleVenta.addActionListener(this);
								btnMostrarDetalleVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnRegistrarDetalleVentas = new JButton("Registrar");
								btnRegistrarDetalleVentas.setBounds(378, 94, 116, 25);
								panel_1.add(btnRegistrarDetalleVentas);
								btnRegistrarDetalleVentas.addActionListener(this);
								btnRegistrarDetalleVentas.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnModificarDetalleVenta = new JButton("Modificar");
								btnModificarDetalleVenta.setBounds(378, 129, 116, 25);
								panel_1.add(btnModificarDetalleVenta);
								btnModificarDetalleVenta.addActionListener(this);
								btnModificarDetalleVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
							{
								btnEliminarDetalleVenta = new JButton("Eliminar");
								btnEliminarDetalleVenta.setBounds(378, 166, 116, 25);
								panel_1.add(btnEliminarDetalleVenta);
								btnEliminarDetalleVenta.addActionListener(this);
								btnEliminarDetalleVenta.setFont(new Font("Verdana", Font.PLAIN, 13));
							}
						}
						{
							panel_2 = new JPanel();
							panel_2.setBackground(new Color(25, 25, 112));
							panel_2.setBounds(0, 0, 1331, 51);
							panelVenta.add(panel_2);
							panel_2.setLayout(null);
							{
								lblRegistroDeVentas = new JLabel("REGISTRO DE VENTAS");
								lblRegistroDeVentas.setForeground(new Color(255, 255, 255));
								lblRegistroDeVentas.setBounds(562, 0, 335, 51);
								panel_2.add(lblRegistroDeVentas);
								lblRegistroDeVentas.setFont(new Font("Verdana", Font.BOLD, 25));
							}
							{
								lblNewLabel_1 = new JLabel("");
								lblNewLabel_1.setBounds(508, 0, 54, 47);
								panel_2.add(lblNewLabel_1);
								lblNewLabel_1.setIcon(new ImageIcon(VenEmpleado.class.getResource("/recursos/check.png")));
							}
						}
						btnSuma.addActionListener(this);
					}
				}
			}
			{
				panelProducto = new JPanel();
				panelProducto.addMouseListener(this);
				panelProducto.setBackground(SystemColor.activeCaption);
				tabbedPane.addTab("Producto", null, panelProducto, null);
				panelProducto.setLayout(null);
				{
					txtIdBuscarProducto = new JTextField();
					txtIdBuscarProducto.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtIdBuscarProducto.addKeyListener(this);
					txtIdBuscarProducto.setColumns(10);
					txtIdBuscarProducto.setBounds(427, 65, 894, 25);
					panelProducto.add(txtIdBuscarProducto);
				}
				{
					lblIdProducto = new JLabel("Buscar:");
					lblIdProducto.setFont(new Font("Verdana", Font.BOLD, 15));
					lblIdProducto.setBounds(348, 65, 69, 25);
					panelProducto.add(lblIdProducto);
				}
				{
					scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(348, 150, 973, 525);
					panelProducto.add(scrollPane_1);
					{
						tablaProducto = new JTable();
						tablaProducto.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaProducto.setFillsViewportHeight(true);
						scrollPane_1.setViewportView(tablaProducto);
					}
				}
				{
					panelP = new JPanel();
					panelP.setBounds(0, 0, 338, 684);
					panelProducto.add(panelP);
				}
			}
			{
				panelCliente = new JPanel();
				panelCliente.addMouseListener(this);
				panelCliente.setBackground(SystemColor.activeCaption);
				tabbedPane.addTab("Cliente", null, panelCliente, null);
				panelCliente.setLayout(null);
				{
					scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(387, 150, 934, 525);
					panelCliente.add(scrollPane_2);
					{
						tablaCliente = new JTable();
						tablaCliente.setFont(new Font("Verdana", Font.PLAIN, 11));
						tablaCliente.addMouseListener(this);
						tablaCliente.setFillsViewportHeight(true);
						scrollPane_2.setViewportView(tablaCliente);
					}
				}
				{
					txtBuscarCliente = new JTextField();
					txtBuscarCliente.setFont(new Font("Verdana", Font.PLAIN, 15));
					txtBuscarCliente.addKeyListener(this);
					txtBuscarCliente.setColumns(10);
					txtBuscarCliente.setBounds(453, 79, 868, 25);
					panelCliente.add(txtBuscarCliente);
				}
				{
					lblIdProducto_1 = new JLabel("Buscar:");
					lblIdProducto_1.setFont(new Font("Verdana", Font.BOLD, 15));
					lblIdProducto_1.setBounds(387, 77, 81, 25);
					panelCliente.add(lblIdProducto_1);
				}
				{
					btnMostrarCliente = new JButton("Mostrar");
					btnMostrarCliente.addActionListener(this);
					btnMostrarCliente.setFont(new Font("Verdana", Font.PLAIN, 13));
					btnMostrarCliente.setBounds(1205, 115, 116, 25);
					panelCliente.add(btnMostrarCliente);
				}
				{
					DatosPersonalesC = new JPanel();
					DatosPersonalesC.setBackground(SystemColor.activeCaption);
					DatosPersonalesC.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Datos personales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
					DatosPersonalesC.setBounds(10, 77, 367, 598);
					panelCliente.add(DatosPersonalesC);
					DatosPersonalesC.setLayout(null);
					{
						lblDniCliente = new JLabel("DNI:");
						lblDniCliente.setBounds(29, 278, 99, 25);
						DatosPersonalesC.add(lblDniCliente);
						lblDniCliente.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtDniCliente = new JTextField();
						txtDniCliente.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtDniCliente.setBounds(113, 278, 222, 25);
						DatosPersonalesC.add(txtDniCliente);
						txtDniCliente.addKeyListener(this);
						txtDniCliente.setColumns(10);
					}
					{
						lblIdNombreCliente = new JLabel("Nombre:");
						lblIdNombreCliente.setBounds(29, 325, 99, 25);
						DatosPersonalesC.add(lblIdNombreCliente);
						lblIdNombreCliente.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtNombreCliente = new JTextField();
						txtNombreCliente.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtNombreCliente.setBounds(113, 325, 222, 25);
						DatosPersonalesC.add(txtNombreCliente);
						txtNombreCliente.addKeyListener(this);
						txtNombreCliente.setColumns(10);
					}
					{
						lblTeleCliente = new JLabel("Teléfono:");
						lblTeleCliente.setBounds(29, 371, 99, 25);
						DatosPersonalesC.add(lblTeleCliente);
						lblTeleCliente.setFont(new Font("Verdana", Font.BOLD, 15));
					}
					{
						txtTelefonoCliente = new JTextField();
						txtTelefonoCliente.setFont(new Font("Verdana", Font.PLAIN, 15));
						txtTelefonoCliente.setBounds(113, 371, 222, 25);
						DatosPersonalesC.add(txtTelefonoCliente);
						txtTelefonoCliente.addKeyListener(this);
						txtTelefonoCliente.setColumns(10);
					}
					{
						btnRegistrarCliente = new JButton("Registrar");
						btnRegistrarCliente.setBounds(46, 440, 116, 25);
						DatosPersonalesC.add(btnRegistrarCliente);
						btnRegistrarCliente.addActionListener(this);
						btnRegistrarCliente.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						btnModificarCliente = new JButton("Modificar");
						btnModificarCliente.setBounds(198, 440, 116, 25);
						DatosPersonalesC.add(btnModificarCliente);
						btnModificarCliente.addActionListener(this);
						btnModificarCliente.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						btnBorrarCliente = new JButton("Limpiar");
						btnBorrarCliente.setBounds(121, 489, 116, 25);
						DatosPersonalesC.add(btnBorrarCliente);
						btnBorrarCliente.addActionListener(this);
						btnBorrarCliente.setFont(new Font("Verdana", Font.PLAIN, 13));
					}
					{
						lblNewLabel_3 = new JLabel("New label");
						lblNewLabel_3.setIcon(new ImageIcon(VenEmpleado.class.getResource("/recursos/clienteicon.png")));
						lblNewLabel_3.setBounds(69, 42, 226, 205);
						DatosPersonalesC.add(lblNewLabel_3);
					}
				}
				{
					lblNewLabel_2 = new JLabel("REGISTRO DE CLIENTES");
					lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 25));
					lblNewLabel_2.setBounds(498, 11, 354, 40);
					panelCliente.add(lblNewLabel_2);
				}
			}
		}
		{
			lblclock = new JLabel("");
			lblclock.setBounds(1062, 10, 284, 25);
			contentPane.add(lblclock);
			lblclock.setFont(new Font("Verdana", Font.PLAIN, 14));
		}
		 clock();
		 ListarProducto("");
		 ListarCliente("");
		 ListarVentasDelDia();
		 LlenarCombo();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminarDetalleVenta) {
			do_btnEliminarDetalleVenta_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarVenta) {
			do_btnEliminarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarDetalleVenta) {
			do_btnMostrarDetalleVenta_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarVenta) {
			do_btnMostrarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarVentaCompleta) {
			do_btnMostrarVentaCompleta_actionPerformed(e);
		}
		if (e.getSource() == btnTotal) {
			do_btnTotal_actionPerformed(e);
		}
		if (e.getSource() == btnBorrarCliente) {
			do_btnBorrarCliente_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarCliente) {
			do_btnMostrarCliente_actionPerformed(e);
		}
		if (e.getSource() == btnBorrarVenta) {
			do_btnBorrarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnModificarDetalleVenta) {
			do_btnModificarDetalleVenta_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarDetalleVentas) {
			do_btnRegistrarDetalleVentas_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarVenta) {
			do_btnRegistrarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnModificarVenta) {
			do_btnModificarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnBorrar) {
			do_btnBorrar_actionPerformed(e);
		}
		if (e.getSource() == btnSuma) {
			do_btnSuma_actionPerformed(e);
		}
		if (e.getSource() == btnModificarCliente) {
			do_btnModificarCliente_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarCliente) {
			do_btnRegistrarCliente_actionPerformed(e);
		}
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtBuscarCliente) {
			do_txtBuscarCliente_keyReleased(e);
		}
		if (e.getSource() == txtIdBuscarProducto) {
			do_txtIdProductoBuscar_keyReleased(e);
		}
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantVenta) {
			do_txtCantVenta_keyTyped(e);
		}
		if (e.getSource() == txtPrecioVenta) {
			do_txtPrecioVenta_keyTyped(e);
		}
		if (e.getSource() == txtCantidadVenta) {
			do_txtCantidadVenta_keyTyped(e);
		}
		if (e.getSource() == txtIdProductoVenta) {
			do_txtIdProductoVenta_keyTyped(e);
		}
		if (e.getSource() == txtCodEditable) {
			do_txtCodEditable_keyTyped(e);
		}
		if (e.getSource() == txtDniClienteVenta) {
			do_txtDniClienteVenta_keyTyped(e);
		}
		if (e.getSource() == txtTelefonoCliente) {
			do_txtTelefonoCliente_keyTyped(e);
		}
		if (e.getSource() == txtNombreCliente) {
			do_txtNombreCliente_keyTyped(e);
		}
		if (e.getSource() == txtDniCliente) {
			do_txtDniCliente_keyTyped(e);
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
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboIdVendedor) {
			do_cboIdVendedor_itemStateChanged(e);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tablaVenta) {
			do_tablaVenta_mouseClicked(e);
		}
		if (e.getSource() == tablaCliente) {
			do_tablaCliente_mouseClicked(e);
		}
	}
	//                                                                                             REGISTRO VENTAS
	protected void do_txtDniClienteVenta_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtCodEditable_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtIdProductoVenta_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtCantidadVenta_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtPrecioVenta_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtCantVenta_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_btnMostrarVentaCompleta_actionPerformed(ActionEvent e) {
		modoTabla = "COMPLETA";
		ListarVentasDelDia();
	}
	protected void do_btnMostrarVenta_actionPerformed(ActionEvent e) {
		modoTabla = "VENTA";
		ListarVenta();
	}
	protected void do_btnMostrarDetalleVenta_actionPerformed(ActionEvent e) {
		modoTabla = "DETALLE";
		ListarDetalleVenta();
	}
	public void ListarVentasDelDia() {
	    DefaultTableModel modelo = new DefaultTableModel();
	    MantHistorialVentas mhv = new MantHistorialVentas();
	    ArrayList<HistorialVentas> lista = mhv.MostrarVentasDelDia();

	    modelo.addColumn("Código Venta");
	    modelo.addColumn("Detalle");
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

	    tablaVenta.setModel(modelo);
	}
	
	private String modoTabla = "COMPLETA";
	
	protected void do_tablaVenta_mouseClicked(MouseEvent e) {
		int fila = tablaVenta.getSelectedRow();
	    if (fila == -1) return;
	    
	    LimpiarVentaCompleta();

	    switch (modoTabla) {
	        case "COMPLETA":
	            txtCodNoEditable.setText(String.valueOf(tablaVenta.getValueAt(fila, 0)));
	            txtIdDetalle.setText(String.valueOf(tablaVenta.getValueAt(fila, 1)));
	            txtDniClienteVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 2)));
	            cboTipoPago.setSelectedItem(String.valueOf(tablaVenta.getValueAt(fila, 13)));
	            cboComprobante.setSelectedItem(String.valueOf(tablaVenta.getValueAt(fila, 14)));
	            cboIdVendedor.setSelectedItem(Integer.parseInt(tablaVenta.getValueAt(fila, 15).toString()));
	            txtNombreVendedor.setText(String.valueOf(tablaVenta.getValueAt(fila, 16)));
	            txtCodEditable.setText(String.valueOf(tablaVenta.getValueAt(fila, 0)));
	            txtIdProductoVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 7)));
	            txtCantidadVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 12)));
	            break;

	        case "VENTA":
	            txtCodNoEditable.setText(String.valueOf(tablaVenta.getValueAt(fila, 0)));
	            txtDniClienteVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 1)));
	            cboTipoPago.setSelectedItem(String.valueOf(tablaVenta.getValueAt(fila, 6)));
	            cboComprobante.setSelectedItem(String.valueOf(tablaVenta.getValueAt(fila, 7)));
	            cboIdVendedor.setSelectedItem(Integer.parseInt(tablaVenta.getValueAt(fila, 8).toString()));
	            txtNombreVendedor.setText(String.valueOf(tablaVenta.getValueAt(fila, 9)));
	            break;

	        case "DETALLE":
	        	txtCodEditable.setText(String.valueOf(tablaVenta.getValueAt(fila, 0)));
	            txtIdDetalle.setText(String.valueOf(tablaVenta.getValueAt(fila, 1)));  
	            txtIdProductoVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 2))); 
	            txtCantidadVenta.setText(String.valueOf(tablaVenta.getValueAt(fila, 7))); 
	            break;
	    }
	}
	public void ListarVenta() {
	    DefaultTableModel modelo = new DefaultTableModel();
	    MantVenta mv = new MantVenta();
	    ArrayList<Venta> lista = mv.MostrarVenta();

	    modelo.addColumn("Código Venta");
	    modelo.addColumn("DNI Cliente");
	    modelo.addColumn("Nombre Cliente");
	    modelo.addColumn("Teléfono Cliente");
	    modelo.addColumn("Fecha");
	    modelo.addColumn("Hora");;
	    modelo.addColumn("Tipo Pago");
	    modelo.addColumn("Comprobante");
	    modelo.addColumn("ID Vendedor");
	    modelo.addColumn("Vendedor");
	    modelo.addColumn("Total");

	    modelo.setRowCount(lista.size());
	    int i = 0;

	    for (Venta v : lista) {
	        modelo.setValueAt(v.getCodigoVenta(), i, 0);
	        modelo.setValueAt(v.getCliente().getDniCliente(), i, 1);
	        modelo.setValueAt(v.getCliente().getNombreCliente(), i, 2);
	        modelo.setValueAt(v.getCliente().getTelefonoCliente(), i, 3);
	        modelo.setValueAt(v.getFechaVenta(), i, 4);
	        modelo.setValueAt(v.getHoraVenta(), i, 5);
	        modelo.setValueAt(v.getTipopagoVenta(), i, 6);
	        modelo.setValueAt(v.getComprobanteVenta(), i, 7);
	        modelo.setValueAt(v.getEmpleado().getIdEmpleado(), i, 8);
	        modelo.setValueAt(v.getEmpleado().getNombreEmpleado(), i, 9);
	        modelo.setValueAt(v.getTotalVenta(), i, 10);
	        i++;
	    }

	    tablaVenta.setModel(modelo);
	}
	public void ListarDetalleVenta() {
	    DefaultTableModel modelo = new DefaultTableModel();
	    MantDetalleVenta mdv = new MantDetalleVenta();
	    ArrayList<DetalleVenta> lista = mdv.MostrarDetalleVenta();

	    modelo.addColumn("Código Venta");
	    modelo.addColumn("Detalle");
	    modelo.addColumn("ID Producto");
	    modelo.addColumn("Categoría Producto");
	    modelo.addColumn("Nombre Producto");
	    modelo.addColumn("Garantía");
	    modelo.addColumn("Precio");
	    modelo.addColumn("Cantidad");
	    modelo.addColumn("Subtotal");

	    modelo.setRowCount(lista.size());
	    int i = 0;

	    for (DetalleVenta dv : lista) {
	    	
	        modelo.setValueAt(dv.getVenta().getCodigoVenta(), i, 0);
	        modelo.setValueAt(dv.getIdDetalleVenta(), i, 1);
	        modelo.setValueAt(dv.getProducto().getIdProducto(), i, 2);
	        modelo.setValueAt(dv.getProducto().getCategoriaProducto(), i, 3);
	        modelo.setValueAt(dv.getProducto().getNombreProducto(), i, 4);
	        modelo.setValueAt(dv.getProducto().getGarantiaProducto(), i, 5);
	        modelo.setValueAt(dv.getProducto().getPrecioProducto(), i, 6);
	        modelo.setValueAt(dv.getCantidadDetalleVenta(), i, 7);
	        modelo.setValueAt(dv.getSubtotalDetalleVenta(), i, 8);
	        i++;
	    }

	    tablaVenta.setModel(modelo);
	}
	protected void do_btnRegistrarVenta_actionPerformed(ActionEvent e) {
		try {
			modoTabla = "VENTA";
			if(txtDniClienteVenta.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar los datos.");
			}
			else {
				Cliente c = new Cliente(txtDniClienteVenta.getText());
				Empleado emple = new Empleado(Integer.parseInt(cboIdVendedor.getSelectedItem().toString()));
				MantCliente mc= new MantCliente();
				if(	mc.BuscarCliente(txtDniClienteVenta.getText()) == null) {
					JOptionPane.showMessageDialog(this, "Cliente no encontrado");
					return;}
				
				Venta v = new Venta(c, cboTipoPago.getSelectedItem().toString(), 
						cboComprobante.getSelectedItem().toString(), emple);
				
				MantVenta mv = new MantVenta();
				mv.AgregarVenta(v);
				JOptionPane.showMessageDialog(this, "Venta registrada correctamente.");
				ListarVenta();
			}
			
							
		} catch (Exception e2) {
		}
	}
	protected void do_btnRegistrarDetalleVentas_actionPerformed(ActionEvent e) {
		try {
			modoTabla = "DETALLE";
			if(txtCodEditable.getText().length() == 0 || txtIdProductoVenta.getText().length()==0||txtCantidadVenta.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para registrar los datos.");
			}
			else {
				Venta v = new Venta(Integer.parseInt(txtCodEditable.getText()));
				Producto p = new Producto(Integer.parseInt(txtIdProductoVenta.getText()));	
				DetalleVenta dv = new DetalleVenta(v, p, Integer.parseInt(txtCantidadVenta.getText()));
				MantProducto mp= new MantProducto();
				MantVenta mv = new MantVenta();
				
				if (!mv.BuscarVenta(Integer.parseInt(txtCodEditable.getText()))) {
	                JOptionPane.showMessageDialog(this, "Código de venta no encontrado");
	                return;
	            }
				if(	mp.BuscarProducto(Integer.parseInt(txtIdProductoVenta.getText())) == null) {
					JOptionPane.showMessageDialog(this, "Producto no encontrado");
					return;}
				if(	mp.BuscarProducto(Integer.parseInt(txtIdProductoVenta.getText())).getStockProducto() < Integer.parseInt(txtCantidadVenta.getText())) {
					JOptionPane.showMessageDialog(this, "Stock insuficiente, el stock actual es de: "+ mp.BuscarProducto(Integer.parseInt(txtIdProductoVenta.getText())).getStockProducto());
					return;}
				
				MantDetalleVenta mdv = new MantDetalleVenta();
				mdv.AgregarDetalleVenta(dv);
				
				mv.CalcularTotalVenta(v.getCodigoVenta());
				ListarProducto("");
				JOptionPane.showMessageDialog(this, "Detalle de Venta registrada correctamente");
				ListarDetalleVenta();
				LimpiarVentaCompleta();	
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	protected void do_btnModificarVenta_actionPerformed(ActionEvent e) {
		try {
			if(txtDniClienteVenta.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para poder modificar los datos.");
			}
			else {
				Cliente c = new Cliente(txtDniClienteVenta.getText());
				Empleado emple = new Empleado(Integer.parseInt(cboIdVendedor.getSelectedItem().toString()));
				
				Venta v = new Venta(Integer.parseInt(txtCodNoEditable.getText()), c, 
						cboTipoPago.getSelectedItem().toString(), 
						cboComprobante.getSelectedItem().toString(), emple);
				
				MantVenta mv = new MantVenta();
		        mv.ModificarVenta(v);
		        
		        switch (modoTabla) {
                case "VENTA":
                	JOptionPane.showMessageDialog(this, "Venta modificada correctamente");
                    ListarVenta();
                    break;
                case "COMPLETA":
                	JOptionPane.showMessageDialog(this, "Venta modificada correctamente");
                    ListarVentasDelDia();
                    break;
            }
		        LimpiarVentaCompleta();
			}
			 
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	protected void do_btnModificarDetalleVenta_actionPerformed(ActionEvent e) {
		try {
			if(txtCodEditable.getText().length() == 0 || txtIdProductoVenta.getText().length()==0||txtCantidadVenta.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Ingrese todos los datos para modificar los datos.");
			}
			else {
				Venta v = new Venta(Integer.parseInt(txtCodEditable.getText()));
				Producto p = new Producto(Integer.parseInt(txtIdProductoVenta.getText()));
				
				DetalleVenta dv = new DetalleVenta(Integer.parseInt(txtIdDetalle.getText()), v, p, 
						Integer.parseInt(txtCantidadVenta.getText()));
				
				MantDetalleVenta mdv = new MantDetalleVenta();
				mdv.ModificarDetalleVenta(dv);
				
				MantVenta mv = new MantVenta();
				mv.CalcularTotalVenta(v.getCodigoVenta());
				ListarProducto("");
				
				 switch (modoTabla) {
	                case "DETALLE":
	                	JOptionPane.showMessageDialog(this, "Detalle de Venta modificada correctamente");
	                    ListarDetalleVenta();
	                    break;
	                case "COMPLETA":
	                	JOptionPane.showMessageDialog(this, "Detalle de Venta modificada correctamente");
	                    ListarVentasDelDia();
	                    break;
	            }
				LimpiarVentaCompleta();
			}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos del detalle de venta. Intente nuevamente.");
		}
	}
	void LimpiarVentaCompleta() {
		txtCodNoEditable.setText("");
		txtDniClienteVenta.setText("");
		txtIdDetalle.setText("");
		txtCodEditable.setText("");
		txtIdProductoVenta.setText("");
		txtCantidadVenta.setText("");
	}
	protected void do_btnBorrarVenta_actionPerformed(ActionEvent e) {
		LimpiarVentaCompleta();
	}
	protected void do_btnEliminarVenta_actionPerformed(ActionEvent e) {
	    try {
	        if (txtCodNoEditable.getText().trim().isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Seleccione una venta para eliminar.");
	            return;
	        }

	        int codVenta = Integer.parseInt(txtCodNoEditable.getText());

	        int confirmacion = JOptionPane.showConfirmDialog(this,
	                "¿Está seguro de que desea eliminar esta venta y todos sus detalles?",
	                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

	        if (confirmacion == JOptionPane.YES_OPTION) {
	            MantVenta mv = new MantVenta();
	            mv.EliminarVentayDetalles(codVenta);
	            JOptionPane.showMessageDialog(this, "Venta eliminada correctamente.");

	            LimpiarVentaCompleta();

	            // Refrescar la tabla según el modo actual
	            switch (modoTabla) {
	                case "COMPLETA":
	                    ListarVentasDelDia();
	                    break;
	                case "VENTA":
	                    ListarVenta();
	                    break;
	                case "DETALLE":
	                    ListarDetalleVenta();
	                    break;
	            }
	        }
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(this, "Error al eliminar la venta. Verifique la selección.");
	    }
	}
	protected void do_btnEliminarDetalleVenta_actionPerformed(ActionEvent e) {
		  try {
		        if (txtIdDetalle.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(this, "Seleccione un detalle a eliminar.");
		            return;
		        }

		        int confirmacion = JOptionPane.showConfirmDialog(this,
		            "¿Está seguro de que desea eliminar este detalle de venta?",
		            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

		        if (confirmacion == JOptionPane.YES_OPTION) {
		            int idDetalle = Integer.parseInt(txtIdDetalle.getText());

		            MantDetalleVenta mdv = new MantDetalleVenta();
		            mdv.EliminarDetalleVenta(idDetalle);

		            JOptionPane.showMessageDialog(this, "Detalle de venta eliminado correctamente.");

		            // Refrescar tabla según el modo actual
		            switch (modoTabla) {
		                case "COMPLETA": 
		                	ListarVentasDelDia(); 
		                	break;
		                case "VENTA": 
		                	ListarVenta(); 
		                	break;
		                case "DETALLE": 
		                	ListarDetalleVenta(); 
		                	break;
		            }

		            LimpiarVentaCompleta();
		        }

		    } catch (Exception ex) {
		        JOptionPane.showMessageDialog(this, "Error al eliminar el detalle de venta.");
		        ex.printStackTrace();
		    }
	}
	//                                                                             LLENAR EL COMBO DEL VENDEDOR
	protected void do_cboIdVendedor_itemStateChanged(ItemEvent e) {
		String id = cboIdVendedor.getSelectedItem().toString();
		LlenarTexto(id); //para que se llenen los cuadros de texto del interfaz
	}
	public void LlenarTexto(String id) {
		ArrayList<Empleado>lista = new ArrayList<Empleado>();
		MantEmpleado me = new MantEmpleado();
		lista = me.ConsultarEmpleado(id);
		Iterator it = lista.iterator();
		int i = 0;
		while (it.hasNext()) {
			Object obj = it.next();
			Empleado e = (Empleado) obj;
			txtNombreVendedor.setText(e.getNombreEmpleado());
			i++;
		}
	}
	public void LlenarCombo() {
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		MantEmpleado me = new MantEmpleado();
		lista = me.MostrarEmpleado(); // trae todos los empleados

		for (Empleado e : lista) {
			// Solo agregar al combo si el estado es "Activo"
			if (e.getEstadoEmpleado().equalsIgnoreCase("Activo")) {
				cboIdVendedor.addItem(e.getIdEmpleado());
			}
		}
	}
	//                                                                               CALCULAR TOTAL DE VENTA
	private ArrayList<Double> listaSubtotales = new ArrayList<>();
	private JPanel DatosPersonalesC;
	private JLabel lblNewLabel_2;
	private JPanel panelP;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	
	protected void do_btnSuma_actionPerformed(ActionEvent e) {
		try {
			double precio = Double.parseDouble(txtPrecioVenta.getText());
	        int cantidad = Integer.parseInt(txtCantVenta.getText());
	        
	        double subtotal = precio * cantidad;
	        listaSubtotales.add(subtotal);
	        
	        txtS.append("Subtotal: S/. " + subtotal + "\n");
	        
	        txtPrecioVenta.setText("");
	        txtCantVenta.setText("");
	      
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese un precio y cantidad válidos.");
		}	
	}
	protected void do_btnTotal_actionPerformed(ActionEvent e) {
		if (listaSubtotales.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "No hay subtotales registrados.");
	        return;
	    } 
		
	    double total = 0;
	    for (double subtotal : listaSubtotales) {
	        total += subtotal;
	    }

	    txtS.append("TOTAL: S/. " + total + "\n");

	    listaSubtotales.clear(); 
	}
	protected void do_btnBorrar_actionPerformed(ActionEvent e) {
		txtS.setText("");
	}
	//                                                                                       PRODUCTO
	
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
			modelo.setValueAt(p.getPrecioProducto(), i, 4);
			modelo.setValueAt(p.getStockProducto(), i, 5);
			i++;
		}
		tablaProducto.setModel(modelo);
	}
	protected void do_txtIdProductoBuscar_keyReleased(KeyEvent e) {
		String filtro = txtIdBuscarProducto.getText();
		ListarProducto(filtro);
	}
	//                                                                                       CLIENTE
	protected void do_txtDniCliente_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	protected void do_txtNombreCliente_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar letras
		char validarLetras = e.getKeyChar();
		if(Character.isDigit(validarLetras)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite números");
		}
	}
	protected void do_txtTelefonoCliente_keyTyped(KeyEvent e) {
		//para que solamente acepte ingresar números
		char validarNumeros = e.getKeyChar();
		if(Character.isLetter(validarNumeros)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "No permite letras");
		}
	}
	public void ListarCliente(String filtro) {
		DefaultTableModel modelo = new DefaultTableModel();
		MantCliente mc = new MantCliente();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		if(filtro.length() == 0) lista = mc.MostrarCliente();
		else lista = mc.ConsultarCliente(filtro);
		
		modelo.setRowCount(lista.size());
		Iterator<Cliente> it = lista.iterator();
	    modelo.addColumn("DNI");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Teléfono");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Cliente c = (Cliente)obj;
	        modelo.setValueAt(c.getDniCliente(), i, 0);
	        modelo.setValueAt(c.getNombreCliente(), i, 1);
	        modelo.setValueAt(c.getTelefonoCliente(), i, 2);
	        i++;
		}
		tablaCliente.setModel(modelo);
	}
	protected void do_tablaCliente_mouseClicked(MouseEvent e) {
		int fila = tablaCliente.getSelectedRow();
		txtDniCliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 0)));
		txtNombreCliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 1)));
		txtTelefonoCliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 2)));
	}
	protected void do_btnRegistrarCliente_actionPerformed(ActionEvent e) {
		try {
			if(txtDniCliente.getText().length()==0 || txtNombreCliente.getText().length()==0 || txtTelefonoCliente.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Rellene todos los campos.");
			}
			
			else {
				if(txtDniCliente.getText().length()!=8) {
					JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos");
					return;
				}
				Cliente c = new Cliente(txtDniCliente.getText(), txtNombreCliente.getText(), txtTelefonoCliente.getText());
				MantCliente mc = new MantCliente();
				if(txtDniCliente.getText().length()!=8) {
					JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos");
					return;
					}
				if(txtTelefonoCliente.getText().length()!=9) {
					JOptionPane.showMessageDialog(this, "El Teléfono debe tener 9 dígitos");
					return;
					}

	         if(mc.BuscarCliente(txtDniCliente.getText()) != null) {
				JOptionPane.showMessageDialog(this, "Cliente ya registrado");
				return;}
				mc.AgregarCliente(c);
				ListarCliente("");
				LimpiarCliente();					
			}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	protected void do_btnModificarCliente_actionPerformed(ActionEvent e) {
		try {
			if(txtDniCliente.getText().length()==0 || txtNombreCliente.getText().length()==0 || txtTelefonoCliente.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "Rellene todos los campos.");
			}
			else {
				Cliente c = new Cliente(txtDniCliente.getText(), txtNombreCliente.getText(), txtTelefonoCliente.getText());
				
				MantCliente mc = new MantCliente();
				mc.ModificarCliente(c);
				ListarCliente(txtDniCliente.getText()); // Solo se mostrará ese cliente
				tablaCliente.setRowSelectionInterval(0, 0);
				LimpiarCliente();
			}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Verifique los datos ingresados. Intente de nuevo.");
		}
	}
	void LimpiarCliente() {
		txtDniCliente.setText("");
		txtNombreCliente.setText("");
		txtTelefonoCliente.setText("");
	}
	protected void do_txtBuscarCliente_keyReleased(KeyEvent e) {
		String filtro = txtBuscarCliente.getText();
		ListarCliente(filtro);
	}
	protected void do_btnMostrarCliente_actionPerformed(ActionEvent e) {
		ListarCliente("");
	}
	protected void do_btnBorrarCliente_actionPerformed(ActionEvent e) {
		LimpiarCliente();
	}
}

