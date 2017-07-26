/**
 * \defgroup System
 * Module that handles system related utilities.
 */ 

/**
 * I/O attributes to use with ::System.openFile.
 * \ingroup System
 */
public enum IOFlags{
	FREAD,  //!< Read attribute.
	FWRITE, //!< Write attribute.
	FRDWR,  //!< Read/Write attribute.
	FCREATE //!< Create/Write attribute.
}

/**
 * I/O seek modes to use with ::System.seekFile.
 * \ingroup System
 */
public enum IOSeek{
	SET,  //!< Starts from the begin of the file.
	CUR,  //!< Starts from current position.
	END  //!< Starts from the end of the file.
}

/**
 * Power management timer features.
 * \ingroup System
 */
public enum PowerTimer{
	AUTO_SUSPEND_TIMER,   //!< Automatic console suspension.
	SCREEN_OFF_TIMER,     //!< Automatic screen disabling.
	SCREEN_DIMMING_TIMER  //!< Automatic screen dimming.
}

/**
 * Buttons schemes for ::System.setMessage.
 * \ingroup System
 */
public enum BtnMode{
	BUTTON_NONE,       //!< No buttons.
	BUTTON_OK,         //!< OK button only.
	BUTTON_CANCEL      //!< CANCEL button only.
	BUTTON_OK_CANCEL,  //!< OK and CANCEL buttons.
	BUTTON_YES_NO,     //!< YES and NO buttons.
}

/**
 * Dialog states for system messages and system keyboard.
 * \ingroup System
 */
public enum DlgState{
	RUNNING,   //!< Dialog running.
	FINISHED,  //!< Dialog finished successfully.
	CANCELED   //!< Dialog canceled by user.
}

public class System{

	/**
	 * Open a file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * handle = System.openFile("ux0:/data/file.txt", FREAD)
	 * @endcode
	 *
	 * @param filename - Filename to be opened.
	 * @param flags - An attribute flag.
	 *
	 * @return A valid file handle.
	 */
	public int openFile(string filename, IOFlags flags){}
	
	/**
	 * Write into an opened file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.writeFile(handle, "Test", 4)
	 * @endcode
	 *
	 * @param handle - A file handle opened with ::System.openFile.
	 * @param text - The text to write on file.
	 * @param len - Length of the text.
	 */
	public void writeFile(int handle, string text, int len){}
	
	/**
	 * Read from an opened file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * text = System.readFile(handle, 4)
	 * @endcode
	 *
	 * @param handle - A file handle opened with ::System.openFile.
	 * @param len - Length of the string to read in bytes.
	 *
	 * @return The read string.
	 */
	public string readFile(int handle, int len){}
	
	/**
	 * Move cursor of an opened file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.seekFile(handle, 0, END)
	 * @endcode
	 *
	 * @param handle - A file handle opened with ::System.openFile.
	 * @param pos - Position to set.
	 * @param seek - Start point for the position.
	 */
	public void seekFile(int handle, int pos, IOSeek seek){}
	
	/**
	 * Calculate size of an opened file in bytes.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * size = System.sizeFile(handle)
	 * @endcode
	 *
	 * @param handle - A file handle opened with ::System.openFile.
	 *
	 * @return Filesize in bytes.
	 */
	public int sizeFile(int handle){}
	
	/**
	 * Close an opened file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.closeFile(handle)
	 * @endcode
	 *
	 * @param handle - A file handle opened with ::System.openFile.
	 */
	public void closeFile(int handle){}
	
	/**
	 * Check if a file exists.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * if System.doesFileExist("ux0:/data/file.txt") then
	 * 	handle = System.openFile("ux0:/data/file.txt", FREAD)
	 * end
	 * @endcode
	 *
	 * @param filename - Filename to be checked.
	 *
	 * @return true if exists, false otherwise.
	 */
	public bool doesFileExist(string filename){}
	
	/**
	 * Rename or move a file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.rename("ux0:/data/old.txt", "ux0:/data/new.txt")
	 * @endcode
	 *
	 * @param filename - Filename to be renamed.
	 * @param filename2 - New filename.
	 */
	public void rename(string filename, string filename2){}
	
	/**
	 * Delete a file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.deleteFile("ux0:/data/file.txt")
	 * @endcode
	 *
	 * @param filename - Filename to be removed.
	 */
	public void deleteFile(string filename){}
	
	/**
	 * Delete a directory.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.deleteDirectory("ux0:/data/dir")
	 * @endcode
	 *
	 * @param dirname - Path to be removed.
	 */
	public void deleteDirectory(string dirname){}
	
	/**
	 * Create a new directory.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.createDirectory("ux0:/data/dir")
	 * @endcode
	 *
	 * @param dirname - Path to be created.
	 */
	public void createDirectory(string dirname){}
	
	/**
	 * List a directory contents.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * files = System.listDirectory("ux0:/data/dir")
	 * name = files[0].name
	 * size = files[0].size
	 * is_directory = files[0].directory
	 * @endcode
	 *
	 * @param dirname - Path to be listed.
	 *
	 * @return A table with the listed files info (See the example above).
	 */
	public table listDirectory(string dirname){}
	
	/**
	 * Close the interpreter.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.exit()
	 * @endcode
	 */
	public void exit(void){}
	
	/**
	 * Sleep the application for a certain time.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.wait(1000000)
	 * @endcode
	 *
	 * @param msecs - Time to wait in microseconds.
	 */
	public void wait(int msecs){}
	
	/**
	 * Check if the battery is under charge.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * if System.isBatteryCharging() then
	 * 	Graphics.debugPrint(0, 0, "Battery is charging", Color.new(255, 255, 255))
	 * end
	 * @endcode
	 *
	 * @return true if charging, false otherwise.
	 */
	public bool isBatteryCharging(void){}
	
	/**
	 * Get current battery life percentage.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * life = System.getBatteryPercentage()
	 * @endcode
	 *
	 * @return The battery life percentage.
	 */
	public int getBatteryPercentage(void){}
	
	/**
	 * Get current battery life.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * life = System.getBatteryLife()
	 * @endcode
	 *
	 * @return The battery life in seconds.
	 */
	public int getBatteryLife(void){}
	
	/**
	 * Get current battery capacity.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * cap = System.getBatteryCapacity()
	 * @endcode
	 *
	 * @return The battery capacity in mAh.
	 */
	public int getBatteryCapacity(void){}
	
	/**
	 * Get full battery capacity.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * cap_max = System.getBatteryFullCapacity()
	 * @endcode
	 *
	 * @return The battery full capacity in mAh.
	 */
	public int getBatteryFullCapacity(void){}
	
	/**
	 * Get battery temperature.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * temp = System.getBatteryTemp()
	 * @endcode
	 *
	 * @return The battery temperature in Celsius.
	 */
	public int getBatteryTemp(void){}
	
	/**
	 * Get battery voltage.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * voltage = System.getBatteryVolt()
	 * @endcode
	 *
	 * @return The battery voltage in mV.
	 */
	public int getBatteryVolt(void){}
	
	/**
	 * Get battery state of health percentage.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * soh = System.getBatteryHealth()
	 * @endcode
	 *
	 * @return The battery state of health percentage.
	 */
	public int getBatteryHealth(void){}
	
	/**
	 * Get battery cycles count.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * cycles = System.getBatteryCycles()
	 * @endcode
	 *
	 * @return The battery cycles count.
	 */
	public int getBatteryCycles(void){}
	
	/**
	 * Disables a power management timer feature.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.disableTimer(SCREEN_DIMMING_TIMER)
	 * @endcode
	 *
	 * @param timer - The timer feature to disable.
	 */
	public void disableTimer(PowerTimer timer){}
	
	/**
	 * Enables a power management timer feature.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.enableTimer(SCREEN_DIMMING_TIMER)
	 * @endcode
	 *
	 * @param timer - The timer feature to enable.
	 */
	public void enableTimer(PowerTimer timer){}
	
	/**
	 * Set CPU clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setCpuSpeed(444)
	 * @endcode
	 *
	 * @param clock - The clock to set in Mhz.
	 *
	 * @note Clock must be between 0 and 444.
	 */
	public void setCpuSpeed(int clock){}
	
	/**
	 * Set GPU clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setGpuSpeed(222)
	 * @endcode
	 *
	 * @param clock - The clock to set in Mhz.
	 *
	 * @note Clock must be between 0 and 222.
	 */
	public void setGpuSpeed(int clock){}
	
	/**
	 * Set BUS clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setBusSpeed(222)
	 * @endcode
	 *
	 * @param clock - The clock to set in Mhz.
	 *
	 * @note Clock must be between 0 and 222.
	 */
	public void setBusSpeed(int clock){}
	
	/**
	 * Set GPU Crossbar clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setGpuXbarSpeed(166)
	 * @endcode
	 *
	 * @param clock - The clock to set in Mhz.
	 *
	 * @note Clock must be between 0 and 166.
	 */
	public void setBusSpeed(int clock){}
	
	/**
	 * Get CPU clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * clock = System.getCpuSpeed()
	 * @endcode
	 *
	 * @return The CPU clock speed in Mhz.
	 */
	public int getCpuSpeed(void){}
	
	/**
	 * Get GPU clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * clock = System.getGpuSpeed()
	 * @endcode
	 *
	 * @return The GPU clock speed in Mhz.
	 */
	public int getGpuSpeed(void){}
	
	/**
	 * Get BUS clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * clock = System.getBusSpeed()
	 * @endcode
	 *
	 * @return The BUS clock speed in Mhz.
	 */
	public int getBusSpeed(void){}
	
	/**
	 * Get GPU Crossbar clock speed.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * clock = System.getGpuXbarSpeed()
	 * @endcode
	 *
	 * @return The GPU Crossbar clock speed in Mhz.
	 */
	public int getGpuXbarSpeed(void){}
	
	/**
	 * Launches a binary file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.launchEboot("app0:/updater.bin")
	 * @endcode
	 *
	 * @param filename - The file to start.
	 *
	 * @note The binary file to launch must be in app0 partition.
	 */
	public void launchEboot(string filename){}
	
	/**
	 * Launches an installed application.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.launchApp("MLCL00001")
	 * @endcode
	 *
	 * @param titleid - The title ID of the application to start.
	 */
	public void launchApp(string titleid){}
	
	/**
	 * Get console time.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * h,m,s = System.getTime()
	 * @endcode
	 *
	 * @return Three values owning hours, minutes and seconds.
	 */
	public int[] getTime(void){}
	
	/**
	 * Get console date.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * day_num, d, m, y = System.getDate()
	 * if day_num == 1 then
	 * 	day_name = "Monday"
	 * end
	 * @endcode
	 *
	 * @return Four values owning day value, day, month, year.
	 */
	public int[] getDate(void){}
	
	/**
	 * Get account username.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * username = System.getUsername()
	 * @endcode
	 *
	 * @return The username set on the running console account.
	 */
	public string getUsername(void){}
	
	/**
	 * Get console language.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * lang = System.getLanguage()
	 * @endcode
	 *
	 * @return The language ID currently set on the console.
	 *
	 * @note For the available language IDs look at <a href="https://www.vitadevwiki.com/vita/Languages">this</a>.
	 */
	public int getLanguage(void){}
	
	/**
	 * Get console model.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * model = System.getModel()
	 * @endcode
	 *
	 * @return 0x10000 if PSVITA, 0x20000 if PSTV.
	 */
	public int getModel(void){}
	
	/**
	 * Get running application title.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * title = System.getTitle()
	 * @endcode
	 *
	 * @return The running application title.
	 */
	public string getTitle(void){}
	
	/**
	 * Get running application title ID.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * title_id = System.getTitleID()
	 * @endcode
	 *
	 * @return The running application title ID.
	 */
	public string getTitleID(void){}
	
	/**
	 * Extract info from an SFO file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * info = System.extractSFO("app0:/sce_sys/param.sfo")
	 * app_version = info.version
	 * app_title = info.title
	 * app_category = info.category
	 * app_titleid = info.titleid
	 * @endcode
	 *
	 * @param filename - The filename to extract info from.
	 *
	 * @return A table with a proper set of info (Look at the sample above).
	 */
	public table extractSFO(string filename){}
	
	/**
	 * Extract a ZIP file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.extractZIP("app0:/files.zip", "ux0:/data/app_files")
	 * @endcode
	 *
	 * @param filename - The filename to extract.
	 * @param dirname - The path where to extract files.
	 * @param password - The password of the archive <b>(optional)</b>.
	 *
	 * @return 0 if extraction completed, <0 otherwise.
	 *
	 * @note If <b>dirname</b> doesn't exist, it will be automatically created.
	 */
	public int extractZIP(string filename, string dirname, string password){}
	
	/**
	 * Extract a specific file from a ZIP file.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.extractFromZIP("app0:/files.zip", "image.jpg" "ux0:/data/app_files")
	 * @endcode
	 *
	 * @param filename - The filename of the ZIP archive.
	 * @param file - The file to extract.
	 * @param dirname - The path where to extract file.
	 * @param password - The password of the archive <b>(optional)</b>.
	 *
	 * @return true if file extraced, false otherwise.
	 *
	 * @note If <b>dirname</b> doesn't exist, it will be automatically created.
	 */
	public bool extractFromZIP(string filename, string file, string dirname, string password){}
	
	/**
	 * Take a screenshot.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.takeScreenshot("ux0:/data/shot.jpg", true, 255)
	 * @endcode
	 *
	 * @param filename - The filename of the screenshot output.
	 * @param use_jpg - JPG compression feature <b>(optional)</b>.
	 * @param ratio - Compression ratio for JPG compression <b>(optional)</b>.
	 *
	 * @note <b>ratio</b> must be between 0 and 255.
	 */
	public void takeScreenshot(string filename, bool use_jpg, int ratio){}
	
	/**
	 * Execute an URI call.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.executeURI("psgm:play?titleid=MLCL00001")
	 * @endcode
	 *
	 * @param uri - URI to exec.
	 */
	public void executeUri(string uri){}
	
	/**
	 * Reboot the console.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.reboot()
	 * @endcode
	 */
	public int reboot(void){}
	
	/**
	 * Get if application is running in safe mode.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * if System.isSafeMode() then
	 * 	mode = "safe"
	 * end
	 * @endcode
	 *
	 * @return true if in safe mode, false otherwise.
	 */
	public bool isSafeMode(void){}
	
	/**
	 * Start a system message instance.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setMessage("Do you want to start this app?", false, BUTTON_YES_NO)
	 * @endcode
	 *
	 * @param text - The text of the system message.
	 * @param progressbar - Progressbar mode.
	 * @param buttons - Buttons scheme to use <b>(optional)</b>.
	 *
	 * @note If <b>progressbar</b> is true, <b>buttons</b> will not affect the system message.
	 */
	public void setMessage(string text, bool progressbar, BtnMode buttons){}
	
	/**
	 * Get current system message instance state.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * state = System.getMessageState()
	 * @endcode
	 *
	 * @return Current state of the system message instance.
	 */
	public DlgState getMessageState(void){}
	
	/**
	 * Set current progress for the system message instance.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setMessageProgress(10)
	 * @endcode
	 *
	 * @param progress - Progress percentage.
	 *
	 * @note This function affects only progressbar system messages.
	 * @note <b>progress</b> must be between 0 and 100.
	 */
	public void setMessageProgress(int progress){}
	
	/**
	 * Set a submessage for the system message instance.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.setMessageProgMsg("10%%")
	 * @endcode
	 *
	 * @param text - Submessage text to set.
	 *
	 * @note This function affects only progressbar system messages.
	 */
	public void setMessageProgMsg(string text){}
	
	/**
	 * Close the current system message instance.
	 * \ingroup System
	 *
	 * @par Usage example:
	 * @code
	 * System.closeMessage()
	 * @endcode
	 */
	public void closeMessage(void){}

}