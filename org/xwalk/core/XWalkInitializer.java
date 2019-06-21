package org.xwalk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class XWalkInitializer
{
  private static final String TAG = "XWalkLib";
  private Context mContext;
  private XWalkInitializer.XWalkInitListener mInitListener;
  private boolean mIsXWalkReady;

  public XWalkInitializer(XWalkInitializer.XWalkInitListener paramXWalkInitListener, Context paramContext)
  {
    AppMethodBeat.i(85658);
    this.mInitListener = paramXWalkInitListener;
    this.mContext = paramContext;
    XWalkLibraryLoader.prepareToInit(this.mContext);
    AppMethodBeat.o(85658);
  }

  public static void addXWalkInitializeLog(String paramString)
  {
    AppMethodBeat.i(85661);
    XWalkEnvironment.addXWalkInitializeLog(paramString);
    AppMethodBeat.o(85661);
  }

  public static void addXWalkInitializeLog(String paramString1, String paramString2)
  {
    AppMethodBeat.i(85660);
    XWalkEnvironment.addXWalkInitializeLog(paramString1, paramString2);
    AppMethodBeat.o(85660);
  }

  public static String getXWalkInitializeLog()
  {
    AppMethodBeat.i(85662);
    Object localObject = XWalkEnvironment.getSharedPreferencesForLog();
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(85662);
    }
    while (true)
    {
      return localObject;
      localObject = ((SharedPreferences)localObject).getString("log", "");
      AppMethodBeat.o(85662);
    }
  }

  public boolean initAsync_remove()
  {
    boolean bool = false;
    AppMethodBeat.i(85659);
    if (this.mIsXWalkReady)
      AppMethodBeat.o(85659);
    while (true)
    {
      return bool;
      if ((XWalkLibraryLoader.isInitializing()) || (XWalkLibraryLoader.isDownloading()))
      {
        Log.i("XWalkLib", "Other initialization or download is proceeding");
        AppMethodBeat.o(85659);
      }
      else
      {
        Log.i("XWalkLib", "Initialized by XWalkInitializer");
        this.mInitListener.onXWalkInitStarted();
        bool = true;
        AppMethodBeat.o(85659);
      }
    }
  }

  public boolean isDownloadMode()
  {
    AppMethodBeat.i(85665);
    boolean bool;
    if ((this.mIsXWalkReady) && (XWalkEnvironment.isDownloadMode()))
    {
      bool = true;
      AppMethodBeat.o(85665);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85665);
    }
  }

  public boolean isSharedMode()
  {
    AppMethodBeat.i(85664);
    boolean bool;
    if ((this.mIsXWalkReady) && (XWalkLibraryLoader.isSharedLibrary()))
    {
      bool = true;
      AppMethodBeat.o(85664);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85664);
    }
  }

  public boolean isXWalkReady()
  {
    return this.mIsXWalkReady;
  }

  public boolean tryInitSync()
  {
    boolean bool = false;
    AppMethodBeat.i(85663);
    if (!XWalkEnvironment.hasAvailableVersion())
      if (XWalkEnvironment.getAvailableVersion() == -1)
      {
        addXWalkInitializeLog("no available version ,need download");
        AppMethodBeat.o(85663);
      }
    while (true)
    {
      return bool;
      addXWalkInitializeLog("sdk not support this apk, need update new");
      break;
      if (XWalkCoreWrapper.attachXWalkCore(XWalkEnvironment.getAvailableVersion()) == 1);
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label105;
        XWalkCoreWrapper.dockXWalkCore();
        XWalkCoreWrapper.getInstance().initNotifyChannnel();
        RuntimeToSdkChannel.initRuntimeToSdkChannel();
        this.mIsXWalkReady = true;
        XWalkLibraryLoader.finishInit(this.mContext);
        this.mInitListener.onXWalkInitCompleted();
        AppMethodBeat.o(85663);
        bool = true;
        break;
      }
      label105: AppMethodBeat.o(85663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkInitializer
 * JD-Core Version:    0.6.2
 */