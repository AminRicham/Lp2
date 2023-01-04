package equipamento;

public class EquipamentoSonoro extends Equipamento{
	public short volume;
	public boolean stereo;
	
	public EquipamentoSonoro() {
		
	}
	public EquipamentoSonoro(String nome, short volume) {
		super(nome);
		this.volume=volume;
		
	}
	
	public void ativarMono() {
		stereo=false;
	}
	public void ativarStereo() {
		stereo=true;
	}
	
	public String toString() {
		return(super.toString()+"\nVolume:"+volume+"\nStero:"+stereo);
	}
	
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		if(volume<=10 && volume>=0) {
			this.volume=volume;
		}else {
			System.out.println("Volume indisponivel.");
		}
	}
	
	public boolean getStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	public void liga() {
		super.liga();
		this.volume=5;
	}
}
