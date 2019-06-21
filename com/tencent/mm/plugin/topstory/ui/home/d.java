package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public final class d
{
  private chn sDb;
  private com.tencent.mm.plugin.topstory.ui.webview.c sDc;
  private TopStoryWebView sDd;
  private com.tencent.mm.plugin.topstory.ui.webview.e sDe;
  boolean sDf;
  public HashMap<Integer, cho> sDg;
  HashMap<Integer, String> sDh;

  public d()
  {
    AppMethodBeat.i(1701);
    this.sDf = false;
    this.sDg = new HashMap();
    this.sDh = new HashMap();
    AppMethodBeat.o(1701);
  }

  private String a(chn paramchn, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(1704);
    String str = "";
    Object localObject;
    if (this.sDg.containsKey(Integer.valueOf(paramInt)))
    {
      localObject = (cho)this.sDg.get(Integer.valueOf(paramInt));
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadWebViewShowData SaveTs:%sms, DirectShowTs:%ss, ShowAndRefreshTs:%ss, curTs:%sms", new Object[] { Long.valueOf(((cho)localObject).xgq), Integer.valueOf(((cho)localObject).wSb), Integer.valueOf(((cho)localObject).xgr), Long.valueOf(System.currentTimeMillis()) });
      if (((cho)localObject).xgq + ((cho)localObject).wSb * 1000 > System.currentTimeMillis())
      {
        this.sDc.cHl();
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadWebViewShowData No Need Auto Refresh");
        localObject = ((cho)localObject).ncM;
      }
    }
    while (true)
    {
      AppMethodBeat.o(1704);
      return localObject;
      if (((cho)localObject).xgq + ((cho)localObject).xgr * 1000 > System.currentTimeMillis())
      {
        this.sDc.cHl();
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadWebViewShowData Need Auto Refresh");
        str = ((cho)localObject).ncM;
      }
      while (true)
      {
        paramchn.xgp.addAll(((cho)localObject).wSd);
        localObject = str;
        if (!paramBoolean)
          break;
        this.sDc.a(paramchn, false, false, 0);
        localObject = str;
        break;
        this.sDc.cHl();
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadWebViewShowData No Need Show CacheData");
      }
      this.sDc.cHl();
      localObject = str;
      if (paramBoolean)
      {
        this.sDc.a(paramchn, false, false, 0);
        localObject = str;
      }
    }
  }

  private boolean cFL()
  {
    AppMethodBeat.i(1705);
    boolean bool;
    if (this.sDg.containsKey(Integer.valueOf(100)))
    {
      cho localcho = (cho)this.sDg.get(Integer.valueOf(100));
      long l = localcho.xgq;
      if (localcho.wSb * 1000 + l > System.currentTimeMillis())
      {
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "needRefreshCache false");
        bool = false;
        AppMethodBeat.o(1705);
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "needRefreshCache true");
      bool = true;
      AppMethodBeat.o(1705);
    }
  }

  public final void a(chn paramchn, boolean paramBoolean)
  {
    AppMethodBeat.i(1702);
    int i;
    if (!this.sDf)
    {
      this.sDf = true;
      com.tencent.mm.plugin.topstory.ui.c.c(paramchn, "startCreateWB", System.currentTimeMillis());
      this.sDb = paramchn;
      this.sDc = new com.tencent.mm.plugin.topstory.ui.webview.c();
      if (paramchn.cdf > 0)
        break label253;
      i = 100;
      String str = a(paramchn, i, paramBoolean);
      this.sDd = new TopStoryWebView(ah.getContext());
      Object localObject = new com.tencent.mm.plugin.topstory.ui.webview.b();
      com.tencent.mm.plugin.topstory.ui.webview.d locald = new com.tencent.mm.plugin.topstory.ui.webview.d(paramchn, this.sDc);
      this.sDe = new com.tencent.mm.plugin.topstory.ui.webview.e(this.sDd, paramchn, this.sDc);
      this.sDd.a((com.tencent.mm.plugin.topstory.ui.webview.b)localObject, locald);
      this.sDd.addJavascriptInterface(this.sDe, "topStoryJSApi");
      if (this.sDc.sHw == null)
        break label261;
      localObject = (String)this.sDh.get(Integer.valueOf(i));
      this.sDc.y(str, (String)localObject, cFL());
      this.sDd.loadDataWithBaseURL(paramchn.url, new String(this.sDc.sHw), "text/html", "utf-8", null);
      this.sDc.sHw = null;
      com.tencent.mm.plugin.topstory.ui.c.c(paramchn, "endCreateWBWithLoadData", System.currentTimeMillis());
    }
    while (true)
    {
      if (100 == i)
        this.sDe.abM("");
      AppMethodBeat.o(1702);
      return;
      label253: i = paramchn.cdf;
      break;
      label261: this.sDd.loadUrl(paramchn.url);
      com.tencent.mm.plugin.topstory.ui.c.c(paramchn, "endCreateWBWithLoadURL", System.currentTimeMillis());
    }
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(1703);
    ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "attachWebViewToActivity %s", new Object[] { Integer.valueOf(paramb.hashCode()) });
    paramb.a(this.sDc, this.sDd, this.sDe, this.sDb);
    this.sDc = null;
    this.sDd = null;
    this.sDe = null;
    this.sDb = null;
    this.sDf = false;
    AppMethodBeat.o(1703);
  }

  public final void bp(int paramInt, String paramString)
  {
    AppMethodBeat.i(1706);
    this.sDh.put(Integer.valueOf(paramInt), paramString);
    try
    {
      paramString = paramString.getBytes("utf-8");
      Object localObject = new java/io/File;
      ((File)localObject).<init>(g.cFo());
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      com.tencent.mm.vfs.e.b(g.cFo() + paramInt, paramString, paramString.length);
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putNegDataCache write data key: %d length: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramString.length) });
      AppMethodBeat.o(1706);
      return;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", paramString, "putNegDataCache", new Object[0]);
        AppMethodBeat.o(1706);
      }
    }
  }

  public final void bq(int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(1707);
      if (bo.isNullOrNil(paramString))
        AppMethodBeat.o(1707);
      while (true)
      {
        return;
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId begin: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
        d.1 local1 = new com/tencent/mm/plugin/topstory/ui/home/d$1;
        local1.<init>(this, paramInt, paramString);
        com.tencent.mm.sdk.g.d.post(local1, "addNegDocId");
        AppMethodBeat.o(1707);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void cFM()
  {
    AppMethodBeat.i(1708);
    File localFile = new File(g.cFo());
    if (localFile.exists())
    {
      File[] arrayOfFile = localFile.listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          localFile = arrayOfFile[j];
          int k = bo.getInt(localFile.getName(), -1);
          if (k > 0);
          while (true)
          {
            try
            {
              byte[] arrayOfByte = com.tencent.mm.vfs.e.e(localFile.getAbsolutePath(), 0, -1);
              String str = new java/lang/String;
              str.<init>(arrayOfByte, "utf-8");
              this.sDh.put(Integer.valueOf(k), str);
              ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put neg cache key:%d size:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(arrayOfByte.length) });
              j++;
            }
            catch (Exception localException)
            {
              ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", localException, "loadNegDataCache %s", new Object[] { localFile.getAbsoluteFile() });
              continue;
            }
            ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Decode Key Error %s", new Object[] { localFile.getAbsolutePath() });
          }
        }
        AppMethodBeat.o(1708);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Files %s", new Object[] { localFile.getAbsolutePath() });
      AppMethodBeat.o(1708);
      continue;
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Exist %s", new Object[] { localFile.getAbsolutePath() });
      AppMethodBeat.o(1708);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.d
 * JD-Core Version:    0.6.2
 */