package com.tencent.mm.plugin.appbrand.permission;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.b;
import com.tencent.mm.plugin.appbrand.jsapi.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.report.model.j;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;

public final class a extends com.tencent.mm.plugin.appbrand.c
{
  private final o iwd;
  private final h iwe;
  private final com.tencent.mm.plugin.appbrand.jsapi.o.a iwf;

  public a(o paramo, h paramh)
  {
    super(paramo, paramh, paramo.xY());
    AppMethodBeat.i(132501);
    this.iwf = new com.tencent.mm.plugin.appbrand.jsapi.o.a();
    this.iwd = paramo;
    this.iwe = paramh;
    AppMethodBeat.o(132501);
  }

  public final void D(int paramInt, String paramString)
  {
    AppMethodBeat.i(132503);
    super.D(paramInt, paramString);
    this.iwf.W(paramInt, paramString);
    AppMethodBeat.o(132503);
  }

  public final void a(m paramm, String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(132504);
    super.a(paramm, paramString1, paramInt, paramString2);
    if (!TextUtils.isEmpty(paramString2))
    {
      if (((f.IS_FLAVOR_RED) || (d.vxs) || (d.vxr)) && ("fail:internal error invalid js component".equals(paramString2)))
      {
        paramm = new ClassCastException(String.format("Mismatch api(%s) component", new Object[] { paramm.getName() }));
        AppMethodBeat.o(132504);
        throw paramm;
      }
      this.iwf.W(paramInt, paramString2);
    }
    AppMethodBeat.o(132504);
  }

  public final boolean a(m paramm, String paramString, int paramInt, c.a parama)
  {
    AppMethodBeat.i(132502);
    com.tencent.mm.plugin.appbrand.jsapi.o.a locala = this.iwf;
    Object localObject1 = this.iwe;
    ??? = this.iwd.atJ();
    if ((??? == null) || (((q)???).getCurrentPage() == null))
      ??? = "";
    while (true)
    {
      if (!j.DD(paramm.getName()))
        localObject1 = new com.tencent.mm.plugin.appbrand.jsapi.o.c((h)localObject1, paramm, paramString, bo.yz(), (String)???);
      synchronized (locala.hVp)
      {
        locala.hVp.put(paramInt, localObject1);
        boolean bool = super.a(paramm, paramString, paramInt, parama);
        AppMethodBeat.o(132502);
        return bool;
        ??? = ((q)???).getCurrentPage().getCurrentUrl();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.a
 * JD-Core Version:    0.6.2
 */