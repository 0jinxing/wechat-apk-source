package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;

public final class l
{
  Boolean fIW;

  public l(Context paramContext, l.a parama)
  {
    AppMethodBeat.i(78415);
    this.fIW = null;
    this.fIW = ca(paramContext);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(new l.1(this, parama), localIntentFilter);
    AppMethodBeat.o(78415);
  }

  private Boolean ca(Context paramContext)
  {
    AppMethodBeat.i(78416);
    try
    {
      paramContext = (Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)paramContext.getSystemService("power"), new Object[0]);
      ab.i("MicroMsg.ScreenState", "reflectScreenOn: byReflect:%s isScreenOn:%s", new Object[] { paramContext, this.fIW });
      AppMethodBeat.o(78416);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        h.pYm.a(99L, 154L, 1L, false);
        ab.e("MicroMsg.ScreenState", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { this.fIW, bo.l(paramContext) });
        paramContext = null;
        AppMethodBeat.o(78416);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.l
 * JD-Core Version:    0.6.2
 */