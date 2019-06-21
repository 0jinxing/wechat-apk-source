package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends p
{
  private static final int CTRL_INDEX = 523;
  private static final String NAME = "onBackgroundFetchData";

  public static void k(o paramo)
  {
    AppMethodBeat.i(129808);
    String str = paramo.mAppId;
    f.1 local1 = new f.1(str);
    MMToClientEvent.a(str, local1);
    ab.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "app start listening, appId:%s", new Object[] { str });
    paramo.gNN.a(new f.2(local1));
    AppMethodBeat.o(129808);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.f
 * JD-Core Version:    0.6.2
 */