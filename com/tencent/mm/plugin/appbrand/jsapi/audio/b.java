package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static volatile al hzV;
  private static String hzW;
  private static AtomicInteger hzX;
  private static Object lockObj;
  private static ak mHandler;

  static
  {
    AppMethodBeat.i(137714);
    hzW = "app_brand_audio_player";
    lockObj = new Object();
    hzX = new AtomicInteger(0);
    AppMethodBeat.o(137714);
  }

  public static void AO(String paramString)
  {
    AppMethodBeat.i(137712);
    ab.i("MicroMsg.Audio.AudioApiTaskExecutor", "onDestroy:%s", new Object[] { paramString });
    if (hzX.decrementAndGet() == 0);
    while (true)
    {
      synchronized (lockObj)
      {
        if ((hzV != null) && (hzV != null))
        {
          g.asT(hzW);
          hzV.oAl.quit();
          hzV = null;
          mHandler = null;
        }
        AppMethodBeat.o(137712);
        return;
      }
      AppMethodBeat.o(137712);
    }
  }

  public static void I(Runnable paramRunnable)
  {
    AppMethodBeat.i(137713);
    synchronized (lockObj)
    {
      if (mHandler != null)
      {
        mHandler.post(paramRunnable);
        AppMethodBeat.o(137713);
        return;
      }
      ab.w("MicroMsg.Audio.AudioApiTaskExecutor", "mHandler is null, recreate");
      aCt();
      mHandler.post(paramRunnable);
    }
  }

  private static void aCt()
  {
    AppMethodBeat.i(137711);
    if (hzV == null)
    {
      hzV = new al(hzW);
      h localh = new h(hzV.oAl.getLooper(), hzW);
      g.a(hzW, localh);
    }
    mHandler = new ak(hzV.oAl.getLooper());
    AppMethodBeat.o(137711);
  }

  public static void onCreate(String paramString)
  {
    AppMethodBeat.i(137710);
    ab.i("MicroMsg.Audio.AudioApiTaskExecutor", "onCreate %s", new Object[] { paramString });
    if (hzX.incrementAndGet() == 1);
    while (true)
    {
      synchronized (lockObj)
      {
        aCt();
        AppMethodBeat.o(137710);
        return;
      }
      AppMethodBeat.o(137710);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.b
 * JD-Core Version:    0.6.2
 */