package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  private static int iWl;
  public static float iWm;
  public static int iWn;
  public static float iWo;
  public static int iWp;
  public static final int iWq;
  private static float iWr;
  private static int iWs;
  private static int iWt;
  private static boolean iWu;

  static
  {
    AppMethodBeat.i(133712);
    iWl = 1;
    iWm = 4.5F;
    iWn = 4;
    iWo = 3.5F;
    iWp = 3;
    iWq = AppBrandGlobalSystemConfig.ayC().hfT;
    iWr = iWm;
    iWs = iWn;
    iWt = 0;
    iWu = true;
    AppMethodBeat.o(133712);
  }

  public static boolean aPd()
  {
    if (iWl == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean aPe()
  {
    AppMethodBeat.i(133708);
    ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo isEnableNativeDynamicBackground %b, thread: %d", new Object[] { Boolean.valueOf(iWu), Long.valueOf(Thread.currentThread().getId()) });
    boolean bool = iWu;
    AppMethodBeat.o(133708);
    return bool;
  }

  public static boolean aPf()
  {
    return true;
  }

  public static void aPg()
  {
    AppMethodBeat.i(133711);
    SharedPreferences localSharedPreferences = ah.doB();
    if (localSharedPreferences == null)
    {
      AppMethodBeat.o(133711);
      return;
    }
    iWu = localSharedPreferences.getBoolean("enable_dynamic_background", true);
    boolean bool1 = com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.d.aPJ();
    boolean bool2 = bool1;
    if (bool1)
    {
      int i = localSharedPreferences.getInt("dynamic_background_version", -1);
      ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo localVersion %d, currentVersion: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
      if (i == 1)
        break label169;
      ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo ignore crash because of new version", new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
      localSharedPreferences.edit().putInt("dynamic_background_version", 1).apply();
      com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.d.aPK();
      eT(true);
    }
    for (bool2 = false; ; bool2 = bool1)
    {
      ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo AppBrandDesktopConfig initEnableNativeDynamicBackground: %b, willCrash: %b", new Object[] { Boolean.valueOf(iWu), Boolean.valueOf(bool2) });
      AppMethodBeat.o(133711);
      break;
      label169: ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo disable dynamicBackground because of crash");
      eT(false);
    }
  }

  public static int axI()
  {
    AppMethodBeat.i(133707);
    if (iWt == 0)
      iWt = ((af)g.K(af.class)).awY();
    int i = iWt;
    AppMethodBeat.o(133707);
    return i;
  }

  public static void eT(boolean paramBoolean)
  {
    AppMethodBeat.i(133709);
    ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo setEnableNativeDynamicBackground enable: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (iWu != paramBoolean)
    {
      SharedPreferences localSharedPreferences = ah.doB();
      if (localSharedPreferences != null)
        localSharedPreferences.edit().putBoolean("enable_dynamic_background", paramBoolean).apply();
    }
    iWu = paramBoolean;
    AppMethodBeat.o(133709);
  }

  public static int getCompletelyCountPerPage()
  {
    return iWs;
  }

  public static float getShowCountPerPage()
  {
    return iWr;
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(133710);
    ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo DesktopConfig init mCurrentType: %d", new Object[] { Integer.valueOf(iWl) });
    if (iWl == 1)
    {
      iWm = 4.0F;
      iWn = 4;
      iWo = 3.0F;
      iWp = 3;
      iWr = iWm;
      iWs = iWn;
    }
    int i = d.d(paramContext, iWr);
    int j = i;
    if (iWl == 1)
      j = (int)(i + paramContext.getResources().getDimensionPixelSize(2131427858) * 2 * d.dm(paramContext));
    if (j <= a.fromDPToPix(paramContext, 10))
      iWr = iWo;
    for (iWs = iWp; ; iWs = iWn)
    {
      ab.i("MicroMsg.AppBrandDesktopConfig", "alvinluo DesktopConfig init showCountPerPage: %f, completelyShowCountPerPage: %d", new Object[] { Float.valueOf(iWr), Integer.valueOf(iWs), Boolean.valueOf(iWu) });
      AppMethodBeat.o(133710);
      return;
      iWr = iWm;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.b
 * JD-Core Version:    0.6.2
 */