package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

class c extends com.tencent.mm.plugin.appbrand.s.h<a>
  implements b, d
{
  private static final Map<String, c> hBH;
  private static final c hBI;

  static
  {
    AppMethodBeat.i(130828);
    hBH = new a();
    hBI = new c.1();
    AppMethodBeat.o(130828);
  }

  private c(i parami)
  {
  }

  public static c v(i parami)
  {
    AppMethodBeat.i(130820);
    Object localObject;
    if ((parami == null) || (parami.mFinished))
    {
      localObject = hBI;
      AppMethodBeat.o(130820);
    }
    while (true)
    {
      return localObject;
      synchronized (hBH)
      {
        c localc = (c)hBH.get(parami.mAppId);
        localObject = localc;
        if (localc == null)
        {
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/auth/c;
          ((c)localObject).<init>(parami);
          hBH.put(parami.mAppId, localObject);
        }
        AppMethodBeat.o(130820);
      }
    }
  }

  protected final void a(a parama)
  {
    AppMethodBeat.i(130823);
    ab.d(this.mName, "about to executeTask %s", new Object[] { parama.toString() });
    parama.aqU();
    AppMethodBeat.o(130823);
  }

  public final void a(f paramf, com.tencent.mm.plugin.appbrand.jsapi.h paramh, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130824);
    ab.i("MicroMsg.AppBrandAuthJsApiQueue", "execute name[%s], callbackId[%d], appId[%s]", new Object[] { paramf.getName(), Integer.valueOf(paramInt), paramh.getAppId() });
    super.bF(new c.3(this, paramh, paramf, this, paramJSONObject, paramInt));
    AppMethodBeat.o(130824);
  }

  public final void aCB()
  {
    AppMethodBeat.i(130822);
    sendMessage(2);
    AppMethodBeat.o(130822);
  }

  protected boolean aCC()
  {
    return false;
  }

  static abstract interface a
  {
    public abstract void aqU();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.c
 * JD-Core Version:    0.6.2
 */