package com.javaex.ex08;

public class Tv {

	//************필드***********//
	private int channel;
	private int volume;
	private boolean power;
	//************필드***********//
	
	
	
	
	//************생성자***********//
	public Tv() {
	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//************생성자***********//
	
	
	//************전원 메소드***********//
	public void power(boolean power) {
		this.power = power;
	}
	//************전원 메소드***********//
	
	
	
	//************채널 메소드***********//
	public void channel(int channel) {
		if(channel>0 == channel<=255) {
			this.channel = channel;
		}else {
			if(channel<=0) {
				this.channel = 1;
			}else {
				if(channel>255) {
					this.channel = 255;
				}
			}
		}
	}
	public void channel(boolean channel) {
		if(channel == true) {
			this.channel +=1;
		}else {
			this.channel -=1;
		}
	}
	//************채널 메소드***********//
	
	
	//************볼륨 메소드***********//
	public void volume(int volume) {
		if(volume>0 == volume<=100) {
			this.volume = volume;
		}else {
			if(volume<0) {
				this.volume = 0;
			}else {
				if(volume>100) {
					this.volume = 100;
				}
			}
		}
	}
	
	public void volume(boolean volume) {
		if(volume == true) {
			this.volume +=1;
		}else {
			this.volume -=1;
		}
	}
	
	//************볼륨 메소드***********//
	
	
	
	
	//************출력 메소드***********//
	public void status() {
		if(power == true) {
		System.out.println("채널:"+this.channel+" 볼륨:"+this.volume+" 전원:"+this.power);
		}else {
			System.out.println("전원: off");
		}
	}
	//************출력 메소드***********//
}
