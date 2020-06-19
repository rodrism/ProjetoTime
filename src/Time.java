
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	
	public String exibirHoraUniversal() {
		return formataNumero(hora)+":"+formataNumero(minu)+":"+formataNumero(segu);
	}
	
	public String exibirHoraPadrao() {
		String strHora;
		String sufixo;
		if (hora == 12) {                   // meio dia
			strHora = formataNumero(12);
			sufixo = "PM";
		}
		else if (hora == 0) {               // meia noite
			strHora = formataNumero(12);
			sufixo = "AM";
		}
		else if (hora >=1 && hora <= 11) {  // manha
			strHora = formataNumero(hora);
			sufixo = "AM";
		}
		else {                              // tarde/noite
			strHora = formataNumero(hora-12);
			sufixo = "PM";
		}
		return strHora+":"+formataNumero(minu)+":"+formataNumero(segu)+sufixo;
	}
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}
		else {
			return num+"";
		}
	}
	
	// vou fazer a versao 2 do formata
	private String fmtNum(int num) {
		return (num<10) ? "0"+num : String.valueOf(num);
	}

}
