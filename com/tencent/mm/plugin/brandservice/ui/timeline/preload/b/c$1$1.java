package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.j;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Map;

final class c$1$1
  implements com.tencent.mm.vending.c.a<Void, String>
{
  c$1$1(c.1 param1, int paramInt1, int paramInt2, String paramString, Map paramMap, int paramInt3)
  {
  }

  private Void xQ(String paramString)
  {
    AppMethodBeat.i(14408);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.Preload.TmplDownloader", "url is null, err, return");
      AppMethodBeat.o(14408);
    }
    int i;
    while (true)
    {
      return null;
      com.tencent.mm.plugin.webview.preload.b localb = new com.tencent.mm.plugin.webview.preload.b();
      localb.startTime = System.currentTimeMillis();
      com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 3, 1, true);
      Object localObject = k.am(this.jTS, this.jTT);
      try
      {
        locala = c.aXE().a(this.gVS, paramString, this.jTU, (String)localObject);
        localb.jSu = this.jTV.jTP;
        if (locala.jTZ != null)
        {
          bool1 = true;
          localb.upH = bool1;
          localb.upG = this.gSl;
          localb.jSV = this.jTS;
          localb.upI = this.jTT;
          bool1 = false;
          if (locala.jRX)
          {
            i = this.gVS;
            if (!locala.success)
              break label848;
            j = 234;
            com.tencent.mm.plugin.webview.preload.a.e(i, j, 1, true);
          }
          if (!locala.success)
            break label1285;
          localFile1 = new File((String)localObject);
          localb.size = localFile1.length();
          if (locala.jTZ == null)
            break label1011;
          if (locala.jUa == null)
            break label952;
          if (locala.jRX)
            com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 237, 1, true);
          if (!c.c(locala.jUa, localFile1))
            break label914;
          if (!locala.jRX)
            break label856;
          paramString = k.q(this.jTS, locala.jTZ, "origin.zip");
          if (!new File(paramString).exists())
            break label872;
          boolean bool2 = c.a(locala, this.gVS, this.jTV.jTO.Md5, localFile1, paramString);
          bool1 = bool2;
          if (!locala.jRX)
            break label911;
          bool1 = bool2;
          if (bool2)
            break label911;
          com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 239, 1, true);
          bool1 = bool2;
          if (bool1)
            if (!locala.jRX)
              break label1150;
        }
      }
      catch (Exception paramString)
      {
        c.a locala;
        while (true)
        {
          try
          {
            paramString = k.q(this.jTS, this.jTT, "");
            c.di((String)localObject, paramString);
            File localFile1 = new java/io/File;
            localFile1.<init>((String)localObject);
            File localFile2 = new java/io/File;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            localFile2.<init>(paramString + "/origin.zip");
            localFile1.renameTo(localFile2);
            localb.endTime = System.currentTimeMillis();
            long l = localb.endTime - localb.startTime;
            if (!at.isWifi(ah.getContext()))
              break label1185;
            paramString = "wifi";
            ab.d("MicroMsg.Preload.Kv15870", "TemplateVersion:%d, IsDiffUpdate:%s, DownloadCostTime:%d, DownloadSize:%d NetworkType:%s tmplType:%d tmplUid:%s", new Object[] { Integer.valueOf(localb.upG), Boolean.valueOf(localb.upH), Long.valueOf(l), Long.valueOf(localb.size), paramString, Integer.valueOf(localb.jSV), localb.upI });
            localObject = h.pYm;
            i = localb.upG;
            if (!localb.upH)
              break label1240;
            j = 1;
            ((h)localObject).e(15870, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(Math.min(l, 3600000L)), Long.valueOf(localb.size), paramString, Integer.valueOf(localb.jSV), localb.upI, Integer.valueOf(localb.jSu) });
            paramString = b.sv(this.jTS);
            if (paramString.Version != 0)
            {
              if (paramString.Version >= this.jTV.jTO.Version)
                break label1246;
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 12, 1, true);
            }
            if (this.jTV.jTQ != null)
              this.jTV.jTQ.run();
            i = this.gVS;
            if (locala.jTZ == null)
              break label1277;
            j = 224;
            com.tencent.mm.plugin.webview.preload.a.e(i, j, 1, true);
            com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 4, 1, true);
            j.de("MicroMsg.Preload.TmplDownloader", "isDownloadSuccess:" + bool1 + " :" + String.format("%d,%s", new Object[] { Integer.valueOf(this.jTS), this.jTT }));
            AppMethodBeat.o(14408);
            break;
            paramString = paramString;
            locala = new c.a(this.jTV.jTR);
            ab.printErrStackTrace("MicroMsg.Preload.TmplDownloader", paramString, "downloadTmpl", new Object[0]);
            continue;
            boolean bool1 = false;
            continue;
            label848: j = 235;
            continue;
            label856: paramString = k.ak(this.jTS, locala.jTZ);
            continue;
            label872: ab.e("MicroMsg.Preload.TmplDownloader", "patch origin file not found:%s", new Object[] { paramString });
            if (locala.jRX)
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 238, 1, true);
            bool1 = false;
            label911: continue;
            label914: com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 220, 1, true);
            if (locala.jRX)
            {
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 236, 1, true);
              bool1 = false;
              continue;
              label952: ab.e("MicroMsg.Preload.TmplDownloader", "checkTmpl %d,%s, no patch MD5", new Object[] { Integer.valueOf(this.jTV.jTO.jCt), this.jTV.jTO.wld });
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 229, 1, true);
              bool1 = false;
              continue;
              label1011: if (c.c(this.jTV.jTO.Md5, localFile1))
              {
                ab.i("MicroMsg.Preload.TmplDownloader", "[checkTmplVer] download & MD5 verify success");
                bool1 = true;
                continue;
              }
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 6, 1, true);
              ab.e("MicroMsg.Preload.TmplDownloader", "checkTmpl %d,%s MD5 not match", new Object[] { Integer.valueOf(this.jTV.jTO.jCt), this.jTV.jTO.wld });
            }
            bool1 = false;
          }
          catch (Exception paramString)
          {
            com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 241, 1, true);
            if (locala.jTZ != null)
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 242, 1, true);
            ab.printErrStackTrace("MicroMsg.Preload.TmplDownloader", paramString, "zip", new Object[0]);
            continue;
          }
          label1150: paramString = k.ak(this.jTS, this.jTT);
          new File((String)localObject).renameTo(new File(paramString));
          continue;
          label1185: if (at.is4G(ah.getContext()))
          {
            paramString = "4g";
          }
          else if (at.is3G(ah.getContext()))
          {
            paramString = "3g";
          }
          else if (at.is2G(ah.getContext()))
          {
            paramString = "2g";
          }
          else
          {
            paramString = "none";
            continue;
            label1240: j = 0;
            continue;
            label1246: if (paramString.Version > this.jTV.jTO.Version)
            {
              com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 13, 1, true);
              continue;
              label1277: j = 226;
            }
          }
        }
        label1285: i = this.gVS;
        if (locala.jTZ == null);
      }
    }
    for (int j = 225; ; j = 227)
    {
      com.tencent.mm.plugin.webview.preload.a.e(i, j, 1, true);
      com.tencent.mm.plugin.webview.preload.a.e(this.gVS, 5, 1, true);
      ab.e("MicroMsg.Preload.TmplDownloader", "[checkTmplVer] download fail");
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.c.1.1
 * JD-Core Version:    0.6.2
 */