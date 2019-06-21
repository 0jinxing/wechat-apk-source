package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.appbrand.s.o;
import com.tencent.mm.plugin.appbrand.s.o.a;
import com.tencent.mm.plugin.appbrand.s.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends e
{
  f(q paramq, com.tencent.mm.plugin.appbrand.h.q paramq1)
  {
    super(paramq, paramq1);
  }

  protected final void a(g paramg, String paramString1, String paramString2)
  {
    AppMethodBeat.i(128934);
    ab.i("MicroMsg.AppBrandJSContextInterfaceWC", "hy: injectSdkScript %s", new Object[] { paramString1 });
    long l = System.currentTimeMillis();
    boolean bool = this.gMN.atU();
    o.a(this.gMN, paramg, paramString1, paramString1, "v" + WxaCommLibRuntimeReader.avQ().gVu, paramString2, o.a.iRz, new f.2(this, bool, l, paramString1, paramString2));
    u.a(this.gMN.getRuntime(), paramg);
    AppMethodBeat.o(128934);
  }

  protected final void a(g paramg, String paramString1, String paramString2, n.a parama)
  {
    AppMethodBeat.i(128933);
    long l = System.currentTimeMillis();
    o.a(this.gMN.getRuntime(), paramg, paramString1, paramString1.replace('/', '_') + "_" + this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.cvZ, paramString2, o.a.iRA, new f.1(this, paramString1, paramString2, l, parama));
    AppMethodBeat.o(128933);
  }

  protected final g asI()
  {
    AppMethodBeat.i(128938);
    g localg = super.asI();
    if (localg != null)
      localg.setJsExceptionHandler(new f.3(this, localg));
    AppMethodBeat.o(128938);
    return localg;
  }

  protected final String asJ()
  {
    return "WASubContext.js";
  }

  protected final String asK()
  {
    AppMethodBeat.i(128935);
    String str = WxaCommLibRuntimeReader.xu("WASubContext.js");
    AppMethodBeat.o(128935);
    return str;
  }

  protected final int asL()
  {
    AppMethodBeat.i(138685);
    int i = WxaCommLibRuntimeReader.avQ().gVu;
    AppMethodBeat.o(138685);
    return i;
  }

  protected final void asM()
  {
    AppMethodBeat.i(128939);
    com.tencent.mm.plugin.report.service.h.pYm.a(370L, 39L, 1L, false);
    c.a(this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.gVu, this.gMN.getRuntime().ye().hhd.gVt, 370, 39);
    AppMethodBeat.o(128939);
  }

  protected final void asN()
  {
    AppMethodBeat.i(128941);
    com.tencent.mm.plugin.report.service.h.pYm.a(370L, 48L, 1L, false);
    c.a(this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.gVu, this.gMN.getRuntime().ye().hhd.gVt, 370, 48);
    AppMethodBeat.o(128941);
  }

  public final int create(String paramString)
  {
    AppMethodBeat.i(128937);
    int i = super.create(paramString);
    ab.i("MicroMsg.AppBrandJSContextInterfaceWC", "hy: on create new context, id is %d", new Object[] { Integer.valueOf(i) });
    AppMethodBeat.o(128937);
    return i;
  }

  protected final void ds(boolean paramBoolean)
  {
    AppMethodBeat.i(128940);
    com.tencent.mm.plugin.report.service.h.pYm.a(370L, 40L, 1L, false);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(370L, 41L, 1L, false);
      AppMethodBeat.o(128940);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(370L, 42L, 1L, false);
      if (this.gMN.getRuntime() == null)
      {
        AppMethodBeat.o(128940);
      }
      else
      {
        c.a(this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.gVu, this.gMN.getRuntime().ye().hhd.gVt, 370, 42);
        AppMethodBeat.o(128940);
      }
    }
  }

  protected final void dt(boolean paramBoolean)
  {
    AppMethodBeat.i(128942);
    com.tencent.mm.plugin.report.service.h.pYm.a(370L, 44L, 1L, false);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(370L, 45L, 1L, false);
      AppMethodBeat.o(128942);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(370L, 46L, 1L, false);
      c.a(this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.gVu, this.gMN.getRuntime().ye().hhd.gVt, 370, 46);
      AppMethodBeat.o(128942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f
 * JD-Core Version:    0.6.2
 */