package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundConfig;", "", "()V", "BAN_FPS", "", "CURRENT_DRAW_FPS", "", "DEFAULT_DRAW_FPS", "FRAME_PER_SECOND", "HIGH_FPS", "LAST_APP_FPS", "LOWEST_DRAW_FPS", "LOW_FPS", "MIDDLE_FPS", "MONITOR_CHECK_FPS_DURATION", "", "MONITOR_LAST_CHECK_FPS_TIME", "SLEEP_TIME_IN_MS_PER_FRAME", "", "getSLEEP_TIME_IN_MS_PER_FRAME", "()F", "setSLEEP_TIME_IN_MS_PER_FRAME", "(F)V", "TAG", "lastAppFps", "lastCheckTime", "adjustDynamicBackgroundDrawFps", "", "appFps", "", "computeSleepTimePerFrame", "init", "needMonitorFps", "", "plugin-appbrand-integration_release"})
public final class b
{
  public static int iZd;
  private static float iZe;
  public static int iZf;
  public static final b iZg;
  private static long lastCheckTime;

  static
  {
    AppMethodBeat.i(135223);
    iZg = new b();
    iZd = 20;
    iZe = 16.0F;
    lastCheckTime = -1L;
    AppMethodBeat.o(135223);
  }

  public static boolean aPA()
  {
    AppMethodBeat.i(135221);
    SharedPreferences localSharedPreferences = ah.doB();
    boolean bool;
    if (localSharedPreferences != null)
    {
      long l = localSharedPreferences.getLong("monitory_last_check_time", -1L);
      if (iZf == 0)
        iZf = localSharedPreferences.getInt("current_app_fps", 0);
      ab.d("MicroMsg.DynamicBackgroundConfig", "alvinluo needMonitorFps lastAppFps: %d, lastCheckTime: %d", new Object[] { Integer.valueOf(iZf), Long.valueOf(l) });
      if ((l == -1L) || (iZf <= 45) || (System.currentTimeMillis() - l > 3600000L))
      {
        localSharedPreferences.edit().putLong("monitory_last_check_time", System.currentTimeMillis()).apply();
        bool = true;
        ab.i("MicroMsg.DynamicBackgroundConfig", "alvinluo needMonitorFps needCheck: %b", new Object[] { Boolean.valueOf(bool) });
      }
    }
    while (true)
    {
      AppMethodBeat.o(135221);
      return bool;
      bool = false;
      break;
      bool = false;
    }
  }

  public static void aPB()
  {
    AppMethodBeat.i(135222);
    Object localObject = ah.doB();
    if (localObject != null);
    for (int i = ((SharedPreferences)localObject).getInt("current_draw_fps", 20); ; i = 20)
    {
      iZd = i;
      iZe = 1000.0F / iZd - 20.0F;
      if (iZd == 2)
      {
        localObject = DynamicBackgroundGLSurfaceView.b.iZv;
        ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo updateAlphaAnimation %d", new Object[] { Long.valueOf(1500L) });
        DynamicBackgroundGLSurfaceView.b.aPH();
      }
      ab.i("MicroMsg.DynamicBackgroundConfig", "alvinluo computeSleepTimePerFrame: %f, fps: %d, DEFAULT_DRAW_FPS: %d", new Object[] { Float.valueOf(iZe), Integer.valueOf(iZd), Integer.valueOf(20) });
      AppMethodBeat.o(135222);
      return;
    }
  }

  public static float aPz()
  {
    return iZe;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b
 * JD-Core Version:    0.6.2
 */