package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.appstorage.r;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.g.d;

public class n extends a<h>
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorage";
  private n.a hXr;

  public n()
  {
    AppMethodBeat.i(102075);
    this.hXr = new n.1(this);
    AppMethodBeat.o(102075);
  }

  private void a(final h paramh, final int paramInt1, final int paramInt2, final String paramString1, final String paramString2, final String paramString3, final String paramString4, final n.a parama)
  {
    AppMethodBeat.i(102076);
    d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(102073);
        Object localObject = f.gXv;
        localObject = p.a(f.b(paramInt2, paramString4, paramString1, paramString2, paramString3));
        if (parama != null)
          parama.a((String)localObject, paramh, paramInt1);
        n.b(2, r.by(paramString1, paramString2), this.fEG, paramh);
        AppMethodBeat.o(102073);
      }
    }
    , "JsApiSetStorage");
    AppMethodBeat.o(102076);
  }

  private void b(h paramh, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, n.a parama)
  {
    AppMethodBeat.i(102077);
    long l = System.currentTimeMillis();
    JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paramString4;
    localJsApiSetStorageTask.hXg = paramInt2;
    localJsApiSetStorageTask.C(paramString1, paramString2, paramString3);
    localJsApiSetStorageTask.hww = new n.3(this, parama, localJsApiSetStorageTask, paramh, paramInt1, paramString1, paramString2, l);
    localJsApiSetStorageTask.aBV();
    AppBrandMainProcessService.a(localJsApiSetStorageTask);
    AppMethodBeat.o(102077);
  }

  protected String c(h paramh)
  {
    AppMethodBeat.i(102078);
    paramh = paramh.getRuntime().mAppId;
    AppMethodBeat.o(102078);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.n
 * JD-Core Version:    0.6.2
 */