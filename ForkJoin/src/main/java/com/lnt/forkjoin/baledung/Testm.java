package com.lnt.forkjoin.baledung;

import java.util.logging.Logger;

public class Testm {

    public static void main(String[] args) {
        String string = "\n" +
                "Mac keyboard shortcuts\n" +
                "By pressing certain key combinations, you can do things that normally need a mouse, trackpad, or other input device.\n" +
                "\n" +
                "To use a keyboard shortcut, press and hold one or more modifier keys and then press the last key of the shortcut. For example, to use Command-C (copy), press and hold the Command key, then the C key, then release both keys. Mac menus and keyboards often use symbols for certain keys, including modifier keys:\n" +
                "\n" +
                "Command (or Cmd) ⌘\n" +
                "Shift ⇧\n" +
                "Option (or Alt) ⌥\n" +
                "Control (or Ctrl) ⌃\n" +
                "Caps Lock ⇪\n" +
                "Fn\n" +
                "\n" +
                "On keyboards made for Windows PCs, use the Alt key instead of Option, and the Windows logo key instead of Command.\n" +
                "\n" +
                "Some keys on some Apple keyboards have special symbols and functions, such as for display brightness , keyboard brightness , Mission Control, and more. If these functions aren't available on your keyboard, you might be able to reproduce some of them by creating your own keyboard shortcuts. To use these keys as F1, F2, F3, or other standard function keys, combine them with the Fn key.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Cut, copy, paste, and other common shortcuts\n" +
                "Command-X: Cut the selected item and copy it to the Clipboard.\n" +
                "Command-C: Copy the selected item to the Clipboard. This also works for files in the Finder.\n" +
                "Command-V: Paste the contents of the Clipboard into the current document or app. This also works for files in the Finder.\n" +
                "Command-Z: Undo the previous command. You can then press Shift-Command-Z to Redo, reversing the undo command. In some apps, you can undo and redo multiple commands.\n" +
                "Command-A: Select All items.\n" +
                "Command-F: Find items in a document or open a Find window.\n" +
                "Command-G: Find Again: Find the next occurrence of the item previously found. To find the previous occurrence, press Shift-Command-G.\n" +
                "Command-H: Hide the windows of the front app. To view the front app but hide all other apps, press Option-Command-H.\n" +
                "Command-M: Minimize the front window to the Dock. To minimize all windows of the front app, press Option-Command-M.\n" +
                "Command-O: Open the selected item, or open a dialog to select a file to open.\n" +
                "Command-P: Print the current document.\n" +
                "Command-S: Save the current document.\n" +
                "Command-T: Open a new tab.\n" +
                "Command-W: Close the front window. To close all windows of the app, press Option-Command-W.\n" +
                "Option-Command-Esc: Force quit an app.\n" +
                "Command–Space bar: Show or hide the Spotlight search field. To perform a Spotlight search from a Finder window, press Command–Option–Space bar. (If you use multiple input sources to type in different languages, these shortcuts change input sources instead of showing Spotlight. Learn how to change a conflicting keyboard shortcut.)\n" +
                "Control–Command–Space bar: Show the Character Viewer, from which you can choose emoji and other symbols.\n" +
                "Control-Command-F: Use the app in full screen, if supported by the app.\n" +
                "Space bar: Use Quick Look to preview the selected item.\n" +
                "Command-Tab: Switch to the next most recently used app among your open apps. \n" +
                "Shift-Command-5: In macOS Mojave or later, take a screenshot or make a screen recording. Or use Shift-Command-3 or Shift-Command-4 for screenshots. Learn more about screenshots.\n" +
                "Shift-Command-N: Create a new folder in the Finder.\n" +
                "Command-Comma (,): Open preferences for the front app.\n" +
                "\n" +
                "\n" +
                "Sleep, log out, and shut down shortcuts\n" +
                "You might need to press and hold some of these shortcuts for slightly longer than other shortcuts. This helps you to avoid using them unintentionally.\n" +
                "\n" +
                "Power button: Press to turn on your Mac or wake it from sleep. Press and hold for 1.5 seconds to put your Mac to sleep.* Continue holding to force your Mac to turn off.\n" +
                "Option–Command–Power button* or Option–Command–Media Eject : Put your Mac to sleep.\n" +
                "Control–Shift–Power button* or Control–Shift–Media Eject : Put your displays to sleep.\n" +
                "Control–Power button* or Control–Media Eject : Display a dialog asking whether you want to restart, sleep, or shut down.\n" +
                "Control–Command–Power button:* Force your Mac to restart, without prompting to save any open and unsaved documents.\n" +
                "Control–Command–Media Eject : Quit all apps, then restart your Mac. If any open documents have unsaved changes, you will be asked whether you want to save them.\n" +
                "Control–Option–Command–Power button* or Control–Option–Command–Media Eject : Quit all apps, then shut down your Mac. If any open documents have unsaved changes, you will be asked whether you want to save them.\n" +
                "Control-Command-Q: Immediately lock your screen.\n" +
                "Shift-Command-Q: Log out of your macOS user account. You will be asked to confirm. To log out immediately without confirming, press Option-Shift-Command-Q.\n" +
                "* Does not apply to the Touch ID sensor.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Finder and system shortcuts\n" +
                "Command-D: Duplicate the selected files.\n" +
                "Command-E: Eject the selected disk or volume.\n" +
                "Command-F: Start a Spotlight search in the Finder window.\n" +
                "Command-I: Show the Get Info window for a selected file.\n" +
                "Command-R: (1) When an alias is selected the Finder: show the original file for the selected alias. (2) In some apps, such as Calendar or Safari, refresh or reload the page. (3) In Software Update preferences, check for software updates again.\n" +
                "Shift-Command-C: Open the Computer window.\n" +
                "Shift-Command-D: Open the desktop folder.\n" +
                "Shift-Command-F: Open the Recents window, showing all of the files you viewed or changed recently.\n" +
                "Shift-Command-G: Open a Go to Folder window.\n" +
                "Shift-Command-H: Open the Home folder of the current macOS user account.\n" +
                "Shift-Command-I: Open iCloud Drive.\n" +
                "Shift-Command-K: Open the Network window.\n" +
                "Option-Command-L: Open the Downloads folder.\n" +
                "Shift-Command-N: Create a new folder.\n" +
                "Shift-Command-O: Open the Documents folder.\n" +
                "Shift-Command-P: Show or hide the Preview pane in Finder windows.\n" +
                "Shift-Command-R: Open the AirDrop window.\n" +
                "Shift-Command-T: Show or hide the tab bar in Finder windows. \n" +
                "Control-Shift-Command-T: Add selected Finder item to the Dock (OS X Mavericks or later)\n" +
                "Shift-Command-U: Open the Utilities folder.\n" +
                "Option-Command-D: Show or hide the Dock. \n" +
                "Control-Command-T: Add the selected item to the sidebar (OS X Mavericks or later).\n" +
                "Option-Command-P: Hide or show the path bar in Finder windows.\n" +
                "Option-Command-S: Hide or show the Sidebar in Finder windows.\n" +
                "Command–Slash (/): Hide or show the status bar in Finder windows.\n" +
                "Command-J: Show View Options.\n" +
                "Command-K: Open the Connect to Server window.\n" +
                "Command-L: Make an alias of the selected item.\n" +
                "Command-N: Open a new Finder window.\n" +
                "Option-Command-N: Create a new Smart Folder.\n" +
                "Command-T: Show or hide the tab bar when a single tab is open in the current Finder window.\n" +
                "Option-Command-T: Show or hide the toolbar when a single tab is open in the current Finder window.\n" +
                "Option-Command-V: Move: Move the files in the Clipboard from their original location to the current location.\n" +
                "Command-Y: Use Quick Look to preview the selected files.\n" +
                "Option-Command-Y: View a Quick Look slideshow of the selected files.\n" +
                "Command-1: View the items in the Finder window as icons.\n" +
                "Command-2: View the items in a Finder window as a list.\n" +
                "Command-3: View the items in a Finder window in columns. \n" +
                "Command-4: View the items in a Finder window in a gallery.\n" +
                "Command–Left Bracket ([): Go to the previous folder.\n" +
                "Command–Right Bracket (]): Go to the next folder.\n" +
                "Command–Up Arrow: Open the folder that contains the current folder.\n" +
                "Command–Control–Up Arrow: Open the folder that contains the current folder in a new window.\n" +
                "Command–Down Arrow: Open the selected item.\n" +
                "Right Arrow: Open the selected folder. This works only when in list view.\n" +
                "Left Arrow: Close the selected folder. This works only when in list view.\n" +
                "Command-Delete: Move the selected item to the Trash.\n" +
                "Shift-Command-Delete: Empty the Trash.\n" +
                "Option-Shift-Command-Delete: Empty the Trash without confirmation dialog.\n" +
                "Command–Brightness Up: Turn target display mode on or off.\n" +
                "Command–Brightness Down: Turn video mirroring on or off when your Mac is connected to more than one display.\n" +
                "Option–Brightness Up: Open Displays preferences. This works with either Brightness key.\n" +
                "Control–Brightness Up or Control–Brightness Down: Change the brightness of your external display, if supported by your display.\n" +
                "Option–Shift–Brightness Up or Option–Shift–Brightness Down: Adjust the display brightness in smaller steps. Add the Control key to this shortcut to make the adjustment on your external display, if supported by your display.\n" +
                "Option–Mission Control: Open Mission Control preferences.\n" +
                "Command–Mission Control: Show the desktop. \n" +
                "Control–Down Arrow: Show all windows of the front app.\n" +
                "Option–Volume Up: Open Sound preferences. This works with any of the volume keys.\n" +
                "Option–Shift–Volume Up or Option–Shift–Volume Down: Adjust the sound volume in smaller steps.\n" +
                "Option–Keyboard Brightness Up: Open Keyboard preferences. This works with either Keyboard Brightness key.\n" +
                "Option–Shift–Keyboard Brightness Up or Option–Shift–Keyboard Brightness Down: Adjust the keyboard brightness in smaller steps.\n" +
                "Option key while double-clicking: Open the item in a separate window, then close the original window.\n" +
                "Command key while double-clicking: Open a folder in a separate tab or window.\n" +
                "Command key while dragging to another volume: Move the dragged item to the other volume, instead of copying it. \n" +
                "Option key while dragging: Copy the dragged item. The pointer changes while you drag the item.\n" +
                "Option-Command while dragging: Make an alias of the dragged item. The pointer changes while you drag the item.\n" +
                "Option-click a disclosure triangle: Open all folders within the selected folder. This works only when in list view.\n" +
                "Command-click a window title: See the folders that contain the current folder.\n" +
                "Learn how to use Command or Shift to select multiple items in the Finder. \n" +
                "Click the Go menu in the Finder menu bar to see shortcuts for opening many commonly used folders, such as Applications, Documents, Downloads, Utilities, and iCloud Drive.\n" +
                "\n" +
                "\n" +
                "Document shortcuts\n" +
                "The behavior of these shortcuts may vary with the app you're using.\n" +
                "\n" +
                "Command-B: Boldface the selected text, or turn boldfacing on or off. \n" +
                "Command-I: Italicize the selected text, or turn italics on or off.\n" +
                "Command-K: Add a web link.\n" +
                "Command-U: Underline the selected text, or turn underlining on or off.\n" +
                "Command-T: Show or hide the Fonts window.\n" +
                "Command-D: Select the Desktop folder from within an Open dialog or Save dialog.\n" +
                "Control-Command-D: Show or hide the definition of the selected word.\n" +
                "Shift-Command-Colon (:): Display the Spelling and Grammar window.\n" +
                "Command-Semicolon (;): Find misspelled words in the document.\n" +
                "Option-Delete: Delete the word to the left of the insertion point.\n" +
                "Control-H: Delete the character to the left of the insertion point. Or use Delete.\n" +
                "Control-D: Delete the character to the right of the insertion point. Or use Fn-Delete.\n" +
                "Fn-Delete: Forward delete on keyboards that don't have a Forward Delete   key. Or use Control-D.\n" +
                "Control-K: Delete the text between the insertion point and the end of the line or paragraph.\n" +
                "Fn–Up Arrow: Page Up: Scroll up one page. \n" +
                "Fn–Down Arrow: Page Down: Scroll down one page.\n" +
                "Fn–Left Arrow: Home: Scroll to the beginning of a document.\n" +
                "Fn–Right Arrow: End: Scroll to the end of a document.\n" +
                "Command–Up Arrow: Move the insertion point to the beginning of the document.\n" +
                "Command–Down Arrow: Move the insertion point to the end of the document.\n" +
                "Command–Left Arrow: Move the insertion point to the beginning of the current line.\n" +
                "Command–Right Arrow: Move the insertion point to the end of the current line.\n" +
                "Option–Left Arrow: Move the insertion point to the beginning of the previous word.\n" +
                "Option–Right Arrow: Move the insertion point to the end of the next word.\n" +
                "Shift–Command–Up Arrow: Select the text between the insertion point and the beginning of the document.\n" +
                "Shift–Command–Down Arrow: Select the text between the insertion point and the end of the document.\n" +
                "Shift–Command–Left Arrow: Select the text between the insertion point and the beginning of the current line.\n" +
                "Shift–Command–Right Arrow: Select the text between the insertion point and the end of the current line.\n" +
                "Shift–Up Arrow: Extend text selection to the nearest character at the same horizontal location on the line above.\n" +
                "Shift–Down Arrow: Extend text selection to the nearest character at the same horizontal location on the line below.\n" +
                "Shift–Left Arrow: Extend text selection one character to the left.\n" +
                "Shift–Right Arrow: Extend text selection one character to the right.\n" +
                "Option–Shift–Up Arrow: Extend text selection to the beginning of the current paragraph, then to the beginning of the following paragraph if pressed again.\n" +
                "Option–Shift–Down Arrow: Extend text selection to the end of the current paragraph, then to the end of the following paragraph if pressed again.\n" +
                "Option–Shift–Left Arrow: Extend text selection to the beginning of the current word, then to the beginning of the following word if pressed again.\n" +
                "Option–Shift–Right Arrow: Extend text selection to the end of the current word, then to the end of the following word if pressed again.\n" +
                "Control-A: Move to the beginning of the line or paragraph.\n" +
                "Control-E: Move to the end of a line or paragraph.\n" +
                "Control-F: Move one character forward.\n" +
                "Control-B: Move one character backward.\n" +
                "Control-L: Center the cursor or selection in the visible area.\n" +
                "Control-P: Move up one line.\n" +
                "Control-N: Move down one line.\n" +
                "Control-O: Insert a new line after the insertion point.\n" +
                "Control-T: Swap the character behind the insertion point with the character in front of the insertion point.\n" +
                "Command–Left Curly Bracket ({): Left align.\n" +
                "Command–Right Curly Bracket (}): Right align.\n" +
                "Shift–Command–Vertical bar (|): Center align.\n" +
                "Option-Command-F: Go to the search field. \n" +
                "Option-Command-T: Show or hide a toolbar in the app.\n" +
                "Option-Command-C: Copy Style: Copy the formatting settings of the selected item to the Clipboard.\n" +
                "Option-Command-V: Paste Style: Apply the copied style to the selected item.\n" +
                "Option-Shift-Command-V: Paste and Match Style: Apply the style of the surrounding content to the item pasted within that content.\n" +
                "Option-Command-I: Show or hide the inspector window.\n" +
                "Shift-Command-P:  Page setup: Display a window for selecting document settings.\n" +
                "Shift-Command-S: Display the Save As dialog, or duplicate the current document.\n" +
                "Shift–Command–Minus sign (-): Decrease the size of the selected item.\n" +
                "Shift–Command–Plus sign (+): Increase the size of the selected item. Command–Equal sign (=) performs the same function.\n" +
                "Shift–Command–Question mark (?): Open the Help menu.\n" +
                "\n" +
                "\n" +
                "Other shortcuts\n" +
                "For more shortcuts, check the shortcut abbreviations shown in the menus of your apps. Every app can have its own shortcuts, and shortcuts that work in one app might not work in another. \n" +
                "\n" +
                "Accessibility shortcuts\n" +
                "Safari shortcuts\n" +
                "Spotlight shortcuts\n" +
                "Startup shortcuts\n" +
                "Apple Music shortcuts: Choose Help > Keyboard shortcuts from the menu bar in the Music app.\n" +
                "Other shortcuts: Choose Apple menu > System Preferences, click Keyboard, then click Shortcuts.\n" +
                "\n" +
                "\n" +
                "Learn more\n" +
                "Type emoji, accents, and symbols\n" +
                "Create your own shortcuts and resolve conflicts between shortcuts\n" +
                "Change the behavior of the function keys or modifier keys\n" +
                "Use a spoken command for a keyboard shortcut\n" +
                "Published Date: December 05, 2019\n" +
                "\n" +
                "Helpful?Yes No\n" +
                "Start a discussion in Apple Support Communities\n" +
                "Ask other users about this article\n" +
                "Ask other users about this article\n" +
                "See all questions on this article \n" +
                "Apple Footer\n" +
                "\uF8FF\n" +
                "Apple\n" +
                " Support Mac keyboard shortcuts\n" +
                "United States\n" +
                "Copyright © 2020 Apple Inc. All rights reserved.Privacy Policy Terms of Use Sales and Refunds Site Map";
//        CustomRecursiveAction customRecursiveAction = new CustomRecursiveAction(string);
//        customRecursiveAction.compute();

        int[] arr = new int[100001];
        for (int i=1;i<=100000;i++){
            arr[i] = i;
        }
        Logger logger =Logger.getLogger(String.valueOf(Testm.class));
        CustomRecursiveTask2 customRecursiveTask2 = new CustomRecursiveTask2(arr, logger);
        System.out.println("value" + customRecursiveTask2.compute());
    }
}
