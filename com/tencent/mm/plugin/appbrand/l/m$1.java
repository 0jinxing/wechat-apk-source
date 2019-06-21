package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

final class m$1
  implements a
{
  m$1(m paramm, String paramString, b.a parama)
  {
  }

  public final void CI(String paramString)
  {
    AppMethodBeat.i(108248);
    this.iph.iot.remove(paramString);
    AppMethodBeat.o(108248);
  }

  public final void E(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(108246);
    ab.e("MicroMsg.AppBrandPreloadNetworkDownload", "download error! filename %s, url %s", new Object[] { paramString1, paramString2 });
    paramString1 = ((ConcurrentLinkedQueue)m.a(this.iph).get(paramString2)).iterator();
    while (paramString1.hasNext())
    {
      paramString2 = (b.a)paramString1.next();
      int i = m.FAILED;
      paramString2.AD(paramString3);
    }
    m.a(this.iph, this.hvm);
    AppMethodBeat.o(108246);
  }

  public final void a(String paramString, int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(108245);
    paramString = ((ConcurrentLinkedQueue)m.a(this.iph).get(paramString)).iterator();
    while (paramString.hasNext())
      ((b.a)paramString.next()).g(paramInt, paramLong1, paramLong2);
    AppMethodBeat.o(108245);
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(108243);
    m.a(this.iph, this.hvm);
    Iterator localIterator = ((ConcurrentLinkedQueue)m.a(this.iph).get(paramString3)).iterator();
    while (localIterator.hasNext())
      ((b.a)localIterator.next()).c(m.SUCCESS, paramString2, paramString1, paramInt);
    ab.i("MicroMsg.AppBrandPreloadNetworkDownload", "download success! filename %s, url %s", new Object[] { paramString1, paramString3 });
    AppMethodBeat.o(108243);
  }

  public final void cH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108247);
    ab.i("MicroMsg.AppBrandPreloadNetworkDownload", "download start! filename %s, url %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(108247);
  }

  public final void p(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108244);
    this.iow.p(paramJSONObject);
    AppMethodBeat.o(108244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.m.1
 * JD-Core Version:    0.6.2
 */