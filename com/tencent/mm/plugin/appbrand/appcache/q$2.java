package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.cwk;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Locale;

final class q$2 extends c
{
  q$2(q paramq)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(129353);
    super.enter();
    ab.i("MicroMsg.LibIncrementalTestCase[incremental]", "DownloadMockLibInfo enter");
    cwk localcwk = new cwk();
    localcwk.url = String.format(Locale.US, "https://res.servicewechat.com/weapp/public/commlib/%d.wxapkg", new Object[] { Integer.valueOf(q.a(this.gSK)) });
    localcwk.version = q.a(this.gSK);
    localcwk.cvZ = q.c(this.gSK);
    localcwk.wPu = 1;
    f.auV().a(localcwk, new PInt());
    az.a(localcwk.url, localcwk.version, new q.2.1(this));
    AppMethodBeat.o(129353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.q.2
 * JD-Core Version:    0.6.2
 */