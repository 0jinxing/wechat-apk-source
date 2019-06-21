package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import org.json.JSONObject;

public final class b$1
  implements a
{
  public b$1(b paramb, String paramString, b.a parama)
  {
  }

  public final void CI(String paramString)
  {
    AppMethodBeat.i(108132);
    this.iox.iot.remove(paramString);
    AppMethodBeat.o(108132);
  }

  public final void E(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(108130);
    ab.e("MicroMsg.AppBrandNetworkDownload", "download error! errorMessage:%s, filename %s, url %s", new Object[] { paramString3, paramString1, paramString2 });
    b.a(this.iox, this.hvm);
    paramString1 = this.iow;
    int i = b.FAILED;
    paramString1.AD(paramString3);
    AppMethodBeat.o(108130);
  }

  public final void a(String paramString, int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(108129);
    this.iow.g(paramInt, paramLong1, paramLong2);
    AppMethodBeat.o(108129);
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(108127);
    b.a(this.iox, this.hvm);
    this.iow.c(b.SUCCESS, paramString2, paramString1, paramInt);
    ab.i("MicroMsg.AppBrandNetworkDownload", "download success! filename %s, url %s", new Object[] { paramString1, paramString3 });
    AppMethodBeat.o(108127);
  }

  public final void cH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108131);
    ab.i("MicroMsg.AppBrandNetworkDownload", "download start! filename %s, url %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(108131);
  }

  public final void p(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108128);
    this.iow.p(paramJSONObject);
    AppMethodBeat.o(108128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.b.1
 * JD-Core Version:    0.6.2
 */