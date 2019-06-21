package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class a
{
  Handler handler;

  public a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(90626);
    this.handler = new Handler(Looper.getMainLooper());
    Boolean localBoolean = ca(paramContext);
    com.tencent.tinker.lib.util.a.i("Tinker.ScreenOffRetryPatch", "try post ScreenOffRetryPatch delay time: %d, screen: %b", new Object[] { Long.valueOf(6000L), localBoolean });
    IntentFilter localIntentFilter = new IntentFilter();
    parama = new a.1(this, parama);
    if ((localBoolean != null) && (!localBoolean.booleanValue()))
    {
      com.tencent.tinker.lib.util.a.i("Tinker.ScreenOffRetryPatch", "screen is just off now, we can send message directly", new Object[0]);
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      this.handler.postDelayed(parama, 6000L);
    }
    while (true)
    {
      paramContext.registerReceiver(new a.2(this, parama), localIntentFilter);
      AppMethodBeat.o(90626);
      return;
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    }
  }

  private static Boolean ca(Context paramContext)
  {
    AppMethodBeat.i(90627);
    try
    {
      paramContext = (Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)paramContext.getSystemService("power"), new Object[0]);
      AppMethodBeat.o(90627);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(90627);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.a
 * JD-Core Version:    0.6.2
 */