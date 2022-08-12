package br.com.clean.modules.client.contract;

import java.util.UUID;

public interface ServiceInterface {

	public Object create(Object object);

	public Object update(Object object);

	public Object list();

	public Object listById(UUID id);

	public void delete(UUID id);
}
