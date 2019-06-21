package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.dynamic.j.b.b;
import com.tencent.mm.plugin.appbrand.widget.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.xs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements b.a
{
  c$1(c paramc)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb)
  {
    AppMethodBeat.i(10660);
    ab.i("MicroMsg.DynamicPageViewIPCProxy", "getDynamicData result(errType : %s, errCode : %s, errMsg : %s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    u.i("MicroMsg.DynamicPageViewIPCProxy", "getDynamicData result(errType : %s, errCode : %s, errMsg : %s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    e locale = this.hlu.hll;
    long l;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      h.pYm.a(638L, 0L, 1L, false);
      if ((this.hlu.hlj == 1) && (!this.hlu.hlq))
      {
        v.kT(18);
        paramString = new ad().eZ(u.pr(this.hlu.eIq));
        paramString.cYw = u.pq(this.hlu.eIq);
        paramString.cYs = 10L;
        paramString.cYu = 2L;
        paramString = paramString.eY(this.hlu.eIq);
        paramString.cYt = System.currentTimeMillis();
        paramString.fa(at.gB(ah.getContext())).ajK();
      }
      if (locale != null)
      {
        l = locale.field_interval;
        b.j(this.hlu.hlt, l * 1000L);
        if ((this.hlu.hll == null) || (TextUtils.isEmpty(this.hlu.hll.field_data)))
          j.azE().E(this.hlu.eIq, 627, 2);
        AppMethodBeat.o(10660);
      }
    }
    while (true)
    {
      return;
      l = 10L;
      break;
      if ((this.hlu.hlj == 1) && (!this.hlu.hlq))
      {
        this.hlu.hlq = true;
        v.kT(17);
        paramString = new ad().eZ(u.pr(this.hlu.eIq));
        paramString.cYw = u.pq(this.hlu.eIq);
        paramString.cYs = 10L;
        paramString.cYu = 1L;
        paramString = paramString.eY(this.hlu.eIq);
        paramString.cYt = System.currentTimeMillis();
        paramString.fa(at.gB(ah.getContext())).ajK();
      }
      paramb = (xs)paramb.fsH.fsP;
      if (paramb.wdt != null);
      for (paramString = paramb.wdt.dlY(); ; paramString = "")
      {
        if (locale != null)
          break label455;
        AppMethodBeat.o(10660);
        break;
      }
      label455: if (!bo.isNullOrNil(paramString))
        locale.field_data = paramString;
      while (true)
      {
        locale.field_interval = paramb.eCL;
        locale.field_updateTime = System.currentTimeMillis();
        paramString = (Bundle)f.a("com.tencent.mm", locale.Hl(), b.b.class);
        if (paramString != null)
          paramString.getBoolean("result", false);
        if (this.hlu.apg)
          break label586;
        ab.i("MicroMsg.DynamicPageViewIPCProxy", "not running");
        AppMethodBeat.o(10660);
        break;
        if ((this.hlu.hll == null) || (TextUtils.isEmpty(this.hlu.hll.field_data)))
          j.azE().E(this.hlu.eIq, 627, 4);
      }
      label586: this.hlu.a(this.hlu.eIn, locale);
      if ((this.hlu.hlj == 1) && (!this.hlu.hlr))
        this.hlu.hlr = true;
      if (locale.field_interval > 0)
        this.hlu.azx();
      AppMethodBeat.o(10660);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.c.1
 * JD-Core Version:    0.6.2
 */