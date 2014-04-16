package net.jeeeyul.eclipse.themes.preference.preset;

import java.io.File;
import java.util.List;

import net.jeeeyul.eclipse.themes.preference.preset.internal.ContributedPreset;
import net.jeeeyul.eclipse.themes.preference.preset.internal.UserPreset;

/**
 * @since 2.1
 */
public interface IJTPresetManager {
	/**
	 * The id of default preset.
	 */
	public static final String DEFAULT_PRESET_ID = "net.jeeeyul.eclipse.themes.preset.default";

	/**
	 * @return All {@link ContributedPreset} through extension point.
	 * @see ContributedPreset
	 */
	public abstract List<ContributedPreset> getContributedPresets();

	/**
	 * 
	 * @return A java {@link File} that contains user preset files.
	 */
	public abstract File getUserPresetFolder();

	/**
	 * 
	 * @return All user defined presets.
	 */
	public abstract List<UserPreset> getUserPresets();

	/**
	 * Fire a invalidate event that describe changes of user presets.
	 * 
	 * @see #addListener(IUserPresetChangeListener)
	 * @see #removeListener(IUserPresetChangeListener)
	 */
	public abstract void invalidateUserPreset();

	public void addListener(IUserPresetChangeListener listener);

	public void removeListener(IUserPresetChangeListener listener);

	/**
	 * 
	 * @return default preset.
	 */
	public IJTPreset getDefaultPreset();

}