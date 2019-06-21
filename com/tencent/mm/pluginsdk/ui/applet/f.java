package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.at.a.b.e;
import com.tencent.mm.at.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class f
  implements com.tencent.mm.at.a.c.b
{
  private final byte[] vkf;

  public f()
  {
    AppMethodBeat.i(11689);
    com.tencent.mm.kernel.g.RN().QU();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    this.vkf = com.tencent.mm.a.g.y((a.QG() + "mmbiz").getBytes());
    AppMethodBeat.o(11689);
  }

  public final com.tencent.mm.at.a.d.b sE(String paramString)
  {
    AppMethodBeat.i(11690);
    ab.d("MicroMsg.ChattingBizImgDownloader", "get image data from url:%s", new Object[] { paramString });
    try
    {
      long l1 = System.currentTimeMillis();
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramString);
      Object localObject2 = (HttpURLConnection)((URL)localObject1).openConnection();
      ((HttpURLConnection)localObject2).setConnectTimeout(15000);
      ((HttpURLConnection)localObject2).setReadTimeout(20000);
      if (q.sz(paramString))
        ((HttpURLConnection)localObject2).setRequestProperty("Referer", q.lH(d.vxo));
      int i;
      if (((HttpURLConnection)localObject2).getResponseCode() < 300)
      {
        if ((paramString != null) && ((paramString.startsWith("http://mmbiz.qpic.cn")) || (paramString.startsWith("http://mmbiz.qlogo.cn")) || (paramString.startsWith("https://mmbiz.qpic.cn")) || (paramString.startsWith("https://mmbiz.qlogo.cn"))))
        {
          i = 1;
          if ((i == 0) || (c.b((HttpURLConnection)localObject2) == 0))
            break label308;
        }
      }
      else
      {
        ((HttpURLConnection)localObject2).disconnect();
        ab.w("MicroMsg.ChattingBizImgDownloader.HttpClientFactory", "httpURLConnectionGet 300");
      }
      for (localObject1 = null; ; localObject1 = new com.tencent.mm.at.a.d.b(e.y((InputStream)localObject1), (String)localObject2, (byte)0))
      {
        if (localObject1 != null)
        {
          long l2 = System.currentTimeMillis();
          if ((!q.ahs()) || (bo.isNullOrNil(((com.tencent.mm.at.a.d.b)localObject1).bqF)) || (!q.sz(paramString)) || (!((com.tencent.mm.at.a.d.b)localObject1).bqF.equals("image/webp")))
            break label382;
          bool = true;
          ab.d("MicroMsg.ChattingBizImgDownloader", "getImageData, isDownloadWebp: %b", new Object[] { Boolean.valueOf(bool) });
          l2 -= l1;
          ab.d("MicroMsg.ChattingBizImgDownloader", "download used %d ms", new Object[] { Long.valueOf(l2) });
          h.pYm.a(86L, 4L, l2, false);
          if (bool)
            h.pYm.a(86L, 17L, l2, false);
        }
        AppMethodBeat.o(11690);
        return localObject1;
        i = 0;
        break;
        label308: localObject1 = ((HttpURLConnection)localObject2).getInputStream();
        localObject2 = ((HttpURLConnection)localObject2).getContentType();
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", new Object[] { paramString.toString() });
        Object localObject1 = new com.tencent.mm.at.a.d.b(null, null, (byte)0);
        AppMethodBeat.o(11690);
        continue;
        label382: boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.f
 * JD-Core Version:    0.6.2
 */