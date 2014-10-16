package de.codecentric.jenkins.dashboard;

import org.jvnet.localizer.Localizable;

/**
 * Enum for all available Environment Types that can be configured on the Dashboard View config page.
 *
 */
public enum EnvironmentType {

	TEST(Messages._EnvironmentType_test()),
	STAGING(Messages._EnvironmentType_staging()),
    PRODUCTION(Messages._EnvironmentType_production());

	private Localizable localizable;

	private EnvironmentType(Localizable localizerId) {
		this.localizable = localizerId;
	}
	
	public String getDescription() {
		return localizable.toString();
	}

}