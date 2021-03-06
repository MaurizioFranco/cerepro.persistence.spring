package centauri.academy.cerepro.persistence.entity.custom;

import centauri.academy.cerepro.persistence.entity.CeReProAbstractEntity;

/**
 * Provides a simple default error message class to return to rest api consumers.
 * @author maurizio
 *
 */
public class CustomErrorType extends CeReProAbstractEntity {
	private String errorMessage;

	public CustomErrorType(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

//	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
}
