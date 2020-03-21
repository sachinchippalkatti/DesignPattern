package com.java.design.pattern.builderDesignPattern;

public class Phone {
	
	public static class Builder{
		
		private String frontPanel;
		private String backPanel;
		private String processor;
		private String camera;
		
		public Phone build() {
			return new Phone(this);
		}
		
		public Builder frontPanel(String frontPanel) {
			this.frontPanel=frontPanel;
			return this;
		}
		public Builder backPanel(String backPanel) {
			this.backPanel=backPanel;
			return this;
		}
		public Builder processor(String processor) {
			this.processor=processor;
			return this;
		}
		public Builder camera(String camera) {
			this.camera=camera;
			return this;
		}
	}
	private String frontPanel;
	private String backPanel;
	private String processor;
	private String camera;
	
	public Phone(Builder builder) {
		// TODO Auto-generated constructor stub
		this.frontPanel=builder.frontPanel;
		this.backPanel=builder.backPanel;
		this.camera=builder.camera;
		this.processor= builder.processor;
	}
	public String getFrontPanel() {
		return frontPanel;
	}
	public String getBackPanel() {
		return backPanel;
	}
	public String getProcessor() {
		return processor;
	}
	public String getCamera() {
		return camera;
	}
	
	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Phone [frontPanel=");
		builder2.append(frontPanel);
		builder2.append(", backPanel=");
		builder2.append(backPanel);
		builder2.append(", processor=");
		builder2.append(processor);
		builder2.append(", camera=");
		builder2.append(camera);
		builder2.append("]");
		return builder2.toString();
	}
	
	
	
}
