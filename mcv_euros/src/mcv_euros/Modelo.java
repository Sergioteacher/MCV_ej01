
package mcv_euros;
//Una edición en linea...
//2ª edición en linea off-line
//3º on-line

public class Modelo {
	 private Double moneda;
	 private Double cantidad;
	 private Double resultado;
	 
	 public void setMoneda(Double moneda) {
	  this.moneda = moneda;
	 }
	 public void setCantidad(Double cantidad) {
	  this.cantidad = cantidad;
	 }
	 public Double getResultado() {
	  return resultado;
	 }
	 public void convetirDolarAEuro() {
	  resultado = cantidad * moneda;
	 }
	 public void convertirEuroADolar() {
	  resultado = cantidad * moneda;
	 }

}
