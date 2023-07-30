package current_converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DebugGraphics;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana_Comverter {

	private JFrame frame;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JLabel lblRes;
	private static final DecimalFormat df=new DecimalFormat("0.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Comverter window = new Ventana_Comverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana_Comverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		JPanel panelEjecucion = new JPanel();
		panelEjecucion.setBounds(10, 11, 640, 314);
		frame.getContentPane().add(panelEjecucion);
		panelEjecucion.setBackground(new Color(55,58,60,255));
		panelEjecucion.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Area de Calculo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(245, 2, 385, 60);
		panelEjecucion.add(lblNewLabel_1);
		
		tfNumero1 = new JTextField();
		tfNumero1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfNumero1.setForeground(SystemColor.activeCaptionBorder);
		tfNumero1.setBackground(new Color(55,58,60,255));
		tfNumero1.setBounds(384, 150, 210, 20);
		panelEjecucion.add(tfNumero1);
		tfNumero1.setColumns(10);
		
		tfNumero2 = new JTextField();
		tfNumero2.setVisible(false);
		tfNumero2.setForeground(SystemColor.activeCaptionBorder);
		tfNumero2.setBounds(384, 181, 210, 20);
		tfNumero2.setBackground(new Color(55,58,60,255));
		panelEjecucion.add(tfNumero2);
		tfNumero2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dato");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel_2.setBackground(SystemColor.activeCaptionBorder);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(260, 149, 114, 20);
		panelEjecucion.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero 2");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(260, 180, 114, 20);
		panelEjecucion.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel_4.setBounds(260, 71, 114, 20);
		panelEjecucion.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KM-MILLA", "METRO-PIE"}));
		comboBox.setForeground(SystemColor.activeCaptionBorder);
		comboBox.setBounds(384, 73, 210, 22);
		comboBox.setBackground(new Color(55,58,60,255));
		panelEjecucion.add(comboBox);
		
	
		
		JLabel lblRes=new JLabel("NINGUNA OPERACION REALIZADA");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setForeground(SystemColor.activeCaptionBorder);
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRes.setBounds(260, 269, 334, 34);
		panelEjecucion.add(lblRes);
		//-----------------------------------------------BOTON CALCULAR-------------------------------------------------------------
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//---------------------------------------KM A MILLA-------------------------------------------------------------
					if(comboBox.getSelectedItem()=="KM-MILLA") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.62);
						lblRes.setText("El Resultado es : "+res+" Millas.");
					}
					//--------------------------------------- METRO A PIE-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="METRO-PIE") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1/0.3048);
						lblRes.setText("El Resultado es : "+df.format(res)+" Pie.");
					}
					
					//---------------------PRESIONES---------------------------------------PRESIONES-----------------------------------
					
					
					//---------------------------------------BAR A PSI-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="BAR-PSI") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*14.51);
						lblRes.setText("El Resultado es : "+df.format(res)+" Psi.");
						
					}
					
					//---------------------------------------KGcm/2 PSI-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="KGcm/2-PSI") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*14.22);
						lblRes.setText("El Resultado es : "+df.format(res)+" Psi.");
						
					}
					
					//---------------------------------------KPA PSI-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="KPA-PSI") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.15);
						lblRes.setText("El Resultado es : "+df.format(res)+" Psi.");
						
					}
					
					//--------------------------------------PSI BAR-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="PSI-BAR") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.068);
						lblRes.setText("El Resultado es : "+df.format(res)+" bar.");
						
					}
					
					//---------------------------------------PSI KGcm/2-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="PSI-KGcm/2") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.070);
						lblRes.setText("El Resultado es : "+df.format(res)+" kg cm/2.");
						
					}
					
					//---------------------------------------PSI KPA-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="PSI-KPA") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*6.90);
						lblRes.setText("El Resultado es : "+df.format(res)+" Kpa.");
						
					}
				
					
					
					
				//MONEDAS----------------------------------------------------------------MONEDAS-----------------------------------------	
					
					
					//---------------------------------------DOLLAR LEMPIRAS-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="DOLLAR-LEMPIRAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*24.96);
						lblRes.setText("El Resultado es : "+df.format(res)+" LPS.");
					}
					
					//---------------------------------------EURO LEMPIRAS-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="EURO-LEMPIRAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*27.41);
						lblRes.setText("El Resultado es : "+df.format(res)+" LPS.");
					}
					//---------------------------------------YEN LEMPIRAS-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="YEN-LEMPIRAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1/0.18);
						lblRes.setText("El Resultado es : "+df.format(res)+" LPS.");
					}
					//---------------------------------------LIBRA ESTERLINA-LEMPIRAS-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="LIBRA ESTERLINA-LEMPIRAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*31.94);
						lblRes.setText("El Resultado es : "+df.format(res)+" LPS.");
					}
					//---------------------------------------WON LEMPIRAS-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="WON-LEMPIRAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*.020);
						lblRes.setText("El Resultado es : "+df.format(res)+" LPS.");
					}
					
				//REVERSED|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
					

					//---------------------------------------LEMPIRAS A DOLLAR-------------------------------------------------------------
					else if(comboBox.getSelectedItem()=="LEMPIRAS-DOLLAR") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.04);
						lblRes.setText("El Resultado es : "+df.format(res)+" $.");
					}
					
					//---------------------------------------LEMPIRAS A EURO-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="LEMPIRAS-EURO") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.036);
						lblRes.setText("El Resultado es : "+df.format(res)+" E.");
					}
					//---------------------------------------KM A MILLA-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="LEMPIRAS-YEN") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*5.57);
						lblRes.setText("El Resultado es : "+df.format(res)+" YEN.");
					}
					//---------------------------------------KM A MILLA-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="LEMPIRAS-LIBRAS ESTERLINAS") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*0.031);
						lblRes.setText("El Resultado es : "+df.format(res)+" LB.");
					}
					//---------------------------------------KM A MILLA-------------------------------------------------------------
					
					else if(comboBox.getSelectedItem()=="LEMPIRAS-WON") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1*51.27);
						lblRes.setText("El Resultado es : "+df.format(res)+" WONES.");
					}
					
					
					//--------------------------------------TEMPERATURAS----------------------------------------------------
					else if(comboBox.getSelectedItem()=="CELSIUS-KELVIN") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1+273.15);
						lblRes.setText("El Resultado es : "+res+" grados Kelvin.");
					}
					else if(comboBox.getSelectedItem()=="CELSIUS-FARENHEIT") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1+32);
						lblRes.setText("El Resultado es : "+res+" grados Farenheit.");
					}
					else if(comboBox.getSelectedItem()=="FARENHEIT-KELVIN") {
						Float dato1=Float.parseFloat(tfNumero1.getText().toString());
						Float res=(float) (dato1+255.37);
						lblRes.setText("El Resultado es : "+res+" grados Kelvin.");
					}
					
					
					
			
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(panelEjecucion, "Favor rellena los campos, SOLO SE ACEPTAN NUMEROS");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(472, 222, 114, 23);
		panelEjecucion.add(btnNewButton);
	//-------------------------------------------BOTONES DE ELECCION(PRESIONES)--------------------------------------------	
		JButton btnPresion = new JButton("Presiones");
		btnPresion.setBounds(22, 160, 158, 23);
		panelEjecucion.add(btnPresion);
		btnPresion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPresion.setBackground(SystemColor.inactiveCaption);
		btnPresion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"BAR-PSI", "KGcm/2-PSI","KPA-PSI","PSI-BAR", "PSI-KGcm/2","PSI-KPA"}));
				tfNumero1.setText("");
				lblRes.setText("NINGUNA OPERACION REALIZADA");
				
			}
		});
		
	//-------------------------------------------TEMPERATURA--------------------------------------------------------------	
	
		
		JButton btnTemperatura = new JButton("Temperaturas");
		btnTemperatura.setBounds(22, 125, 158, 23);
		panelEjecucion.add(btnTemperatura);
		btnTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		btnTemperatura.setBackground(SystemColor.inactiveCaption);
		
		btnTemperatura.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"CELSIUS-KELVIN", "CELSIUS-FARENHEIT","FARENHEIT-KELVIN"}));
				tfNumero1.setText("");
				lblRes.setText("NINGUNA OPERACION REALIZADA");
			}
		});
	//-----------------------------------------DISTANCIAS----------------------------------------------------------------	
		JButton btnVelocidades = new JButton("Distancias");
		btnVelocidades.setBounds(22, 57, 158, 23);
		btnVelocidades.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"KM-MILLA", "METRO-PIE"}));
				tfNumero1.setText("");
				lblRes.setText("NINGUNA OPERACION REALIZADA");
				
			
				
			}
		});
		panelEjecucion.add(btnVelocidades);
		btnVelocidades.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVelocidades.setBackground(SystemColor.inactiveCaption);
		btnVelocidades.setSelected(true);
	//----------------------------------------MONEDAS--------------------------------------------------------------------	
		JButton btnMonedas = new JButton("Monedas");
		btnMonedas.setBounds(22, 91, 158, 23);
		panelEjecucion.add(btnMonedas);
		btnMonedas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"DOLLAR-LEMPIRAS", "EURO-LEMPIRAS","YEN-LEMPIRAS","LIBRA ESTERLINA-LEMPIRAS","WON-LEMPIRAS","LEMPIRAS-DOLLAR", "LEMPIRAS-EURO","LEMPIRAS-YEN","LEMPIRAS-LIBRAS ESTERLINAS","LEMPIRAS-WON"}));
				tfNumero1.setText("");
				lblRes.setText("NINGUNA OPERACION REALIZADA");
			}
			
			
		});
		btnMonedas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMonedas.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblNewLabel = new JLabel("Selecciona Calculo a Realizar");
		lblNewLabel.setBounds(10, 7, 178, 48);
		panelEjecucion.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(206, 25, 20, 278);
		panelEjecucion.add(separator);
	//-----------------------------------------------------------------------------------------------------	
		
	}
	
	
	
}
