package org.osiam.shell.command.update.user;

import org.osiam.resources.scim.Role;
import org.osiam.resources.scim.Role.Type;
import org.osiam.shell.command.AbstractBuilderCommand;

import de.raysha.lib.jsimpleshell.annotation.Command;
import de.raysha.lib.jsimpleshell.annotation.Param;

/**
 * This class contains commands which can create {@link Role}s.
 * 
 * @author rainu
 */
public class RoleBuilder extends AbstractBuilderCommand<Role> {
	private Role.Builder builder = new Role.Builder();

	@Command(description = "Shows the role state. This state is not persisted yet!")
	public Role showState() {
		return _build();
	}

	@Command(description = "Set the display name of the role.")
	public void setDisplay(
			@Param(name = "display", description = "The display name.")
			String display) {
		
		builder.setDisplay(display);
	}

	@Command(description = "Sets the operation.")
	public void setOperation(
			@Param(name = "operation", description = "The operation.")
			String operation) {
		
		builder.setOperation(operation);
	}

	@Command(description = "Is this role primary?")
	public void setPrimary(
			@Param(name = "primary", description = "True if this role is primary. Otherwise false.")
			Boolean primary) {
		
		builder.setPrimary(primary);
	}

	@Command(description = "Sets the label indicating the attribute's function.")
	public void setType(
			@Param(name = "type", description = "The type of the attribute.")
			Type type) {
		
		builder.setType(type);
	}

	@Command(description = "Set the value of the role.")
	public void setValue(
			@Param(name = "value", description = "The value.")
			String value) {
		
		builder.setValue(value);
	}

	@Override
	protected Role _build() {
		return builder.build();
	}
}
