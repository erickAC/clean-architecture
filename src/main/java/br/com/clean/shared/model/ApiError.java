package br.com.clean.shared.model;

public class ApiError extends RuntimeException {

	public ApiError(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

	private Integer status;
	private String path;
	private String message;

	public ApiError(Integer status, String path, String message) {
		super();
		this.status = status;
		this.path = path;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
