package com.tencent.mm.plugin.appbrand.report;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import com.tencent.luggage.sdk.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.jsapi.r;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.e.a;
import java.util.HashMap;

public final class b$a extends g
  implements a
{
  private b ivC;
  private Application izY;

  private b$a(b paramb)
  {
    AppMethodBeat.i(132543);
    this.ivC = paramb;
    this.ivC.keep(this);
    this.izY = paramb.getContext().getApplication();
    this.izY.registerComponentCallbacks(this);
    AppMethodBeat.o(132543);
  }

  public final void dead()
  {
    AppMethodBeat.i(132545);
    this.izY.unregisterComponentCallbacks(this);
    this.ivC = null;
    AppMethodBeat.o(132545);
  }

  @SuppressLint({"SwitchIntDef"})
  public final void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(132544);
    if (this.ivC == null)
    {
      AppMethodBeat.o(132544);
      return;
    }
    switch (paramInt)
    {
    default:
    case 10:
    case 15:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(132544);
      break;
      c.pH(paramInt);
      b localb = this.ivC;
      ab.i("MicroMsg.AppBrandOnMemoryWarningReceiveEvent", "memory warning receive event dispatch, appId:%s, initialized:%b, level:%d", new Object[] { localb.mAppId, Boolean.valueOf(localb.eMP), Integer.valueOf(paramInt) });
      if (localb.eMP)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("level", Integer.valueOf(paramInt));
        new r().i(localb.xT()).s(localHashMap).aCj();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.b.a
 * JD-Core Version:    0.6.2
 */