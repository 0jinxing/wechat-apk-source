package com.tencent.mm.plugin.qqmail.stub;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.m.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.plugin.qqmail.b.v.c;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.b;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.c;
import com.tencent.mm.pluginsdk.ui.tools.j.a;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class ReadMailProxy extends a
{
  private v.a puV;
  private v.a pvK;
  private ReadMailUI.b pvL;
  private ReadMailUI.c pvM;
  private k pvN;
  private j.a pvO;

  public ReadMailProxy(com.tencent.mm.remoteservice.d paramd, v.a parama)
  {
    super(paramd);
    AppMethodBeat.i(68096);
    this.pvN = new ReadMailProxy.1(this);
    this.pvO = new ReadMailProxy.2(this);
    this.puV = parama;
    this.pvK = new ReadMailProxy.3(this);
    AppMethodBeat.o(68096);
  }

  public ReadMailProxy(com.tencent.mm.remoteservice.d paramd, v.a parama, ReadMailUI.b paramb, ReadMailUI.c paramc)
  {
    super(paramd);
    AppMethodBeat.i(68097);
    this.pvN = new ReadMailProxy.1(this);
    this.pvO = new ReadMailProxy.2(this);
    this.puV = parama;
    this.pvL = paramb;
    this.pvM = paramc;
    this.pvK = new ReadMailProxy.4(this);
    AppMethodBeat.o(68097);
  }

  @f
  public void addDownloadCallback()
  {
    AppMethodBeat.i(68116);
    com.tencent.mm.plugin.downloader.model.d.bij();
    b.c(this.pvN);
    AppMethodBeat.o(68116);
  }

  @f
  public void cancel(long paramLong)
  {
    AppMethodBeat.i(68109);
    new ak().post(new ReadMailProxy.5(this, paramLong));
    AppMethodBeat.o(68109);
  }

  @f
  public void deleteMsgById(long paramLong)
  {
    AppMethodBeat.i(68114);
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jg(paramLong);
    AppMethodBeat.o(68114);
  }

  @f
  public long downloadQQMailApp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68118);
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString1);
      paramString1 = new java/net/URI;
      paramString1.<init>(((URL)localObject).getProtocol(), ((URL)localObject).getUserInfo(), ((URL)localObject).getHost(), ((URL)localObject).getPort(), ((URL)localObject).getPath(), ((URL)localObject).getQuery(), ((URL)localObject).getRef());
      paramString1 = paramString1.toURL();
      localObject = new com/tencent/mm/plugin/downloader/model/e$a;
      ((e.a)localObject).<init>();
      ((e.a)localObject).It(paramString1.toString());
      ((e.a)localObject).Iv("qqmail.apk");
      ((e.a)localObject).Iw(paramString2);
      ((e.a)localObject).ga(true);
      ((e.a)localObject).tN(1);
      l = com.tencent.mm.plugin.downloader.model.d.bij().a(((e.a)localObject).kNl);
      AppMethodBeat.o(68118);
      return l;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", new Object[] { paramString1.toString() });
        ab.printErrStackTrace("MicroMsg.ReadMailProxy", paramString1, "", new Object[0]);
        long l = -1L;
      }
    }
  }

  @f
  public long get(String paramString, Map paramMap, Bundle paramBundle)
  {
    AppMethodBeat.i(68107);
    v.c localc = new v.c();
    localc.fromBundle(paramBundle);
    long l = ac.ccC().b(paramString, paramMap, localc, this.pvK);
    AppMethodBeat.o(68107);
    return l;
  }

  @f
  public String getBindUin()
  {
    AppMethodBeat.i(68120);
    String str = new p(bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(9, null))).toString();
    AppMethodBeat.o(68120);
    return str;
  }

  @f
  public Map getCookie()
  {
    AppMethodBeat.i(68113);
    Map localMap = ac.ccC().getCookie();
    AppMethodBeat.o(68113);
    return localMap;
  }

  @f
  public double getMailAppDownloadProgress(long paramLong)
  {
    AppMethodBeat.i(68125);
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.bij().hm(paramLong);
    double d;
    if (localFileDownloadTaskInfo.jrb <= 0L)
    {
      d = 0.0D;
      AppMethodBeat.o(68125);
    }
    while (true)
    {
      return d;
      d = 1.0D * localFileDownloadTaskInfo.kNr / localFileDownloadTaskInfo.jrb;
      AppMethodBeat.o(68125);
    }
  }

  @f
  public Integer getMailAppDownloadStatus(long paramLong)
  {
    AppMethodBeat.i(68124);
    int i = com.tencent.mm.plugin.downloader.model.d.bij().hm(paramLong).status;
    AppMethodBeat.o(68124);
    return Integer.valueOf(i);
  }

  @f
  public String getMailAppEnterUlAndroid()
  {
    AppMethodBeat.i(68122);
    String str = com.tencent.mm.m.g.Nv().getMailAppEnterUlAndroid();
    AppMethodBeat.o(68122);
    return str;
  }

  @f
  public String getMailAppRedirectUrlAndroid()
  {
    AppMethodBeat.i(68123);
    String str = com.tencent.mm.m.g.Nv().Nm();
    AppMethodBeat.o(68123);
    return str;
  }

  @f
  public String getMsgContent(long paramLong)
  {
    AppMethodBeat.i(68111);
    String str = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong).field_content;
    AppMethodBeat.o(68111);
    return str;
  }

  @f
  public Object getUneradMailCountFromConfig()
  {
    AppMethodBeat.i(68129);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJW, Integer.valueOf(-1));
    AppMethodBeat.o(68129);
    return localObject;
  }

  @f
  public void getUnreadMailCount()
  {
    AppMethodBeat.i(68128);
    com.tencent.mm.pluginsdk.ui.tools.j.a(this.pvO);
    AppMethodBeat.o(68128);
  }

  @f
  public String getUserBindEmail()
  {
    AppMethodBeat.i(68115);
    String str = r.getUserBindEmail();
    AppMethodBeat.o(68115);
    return str;
  }

  @f
  public boolean isSDCardAvailable()
  {
    AppMethodBeat.i(68110);
    boolean bool = com.tencent.mm.kernel.g.RP().isSDCardAvailable();
    AppMethodBeat.o(68110);
    return bool;
  }

  @com.tencent.mm.remoteservice.e
  public void onComplete()
  {
    AppMethodBeat.i(68101);
    if (this.puV != null)
      this.puV.onComplete();
    AppMethodBeat.o(68101);
  }

  @com.tencent.mm.remoteservice.e
  public void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68100);
    if (this.puV != null)
      this.puV.onError(paramInt, paramString);
    AppMethodBeat.o(68100);
  }

  @com.tencent.mm.remoteservice.e
  public boolean onReady()
  {
    AppMethodBeat.i(68098);
    boolean bool;
    if (this.puV == null)
    {
      bool = true;
      AppMethodBeat.o(68098);
    }
    while (true)
    {
      return bool;
      bool = this.puV.onReady();
      AppMethodBeat.o(68098);
    }
  }

  @com.tencent.mm.remoteservice.e
  public void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68099);
    if (this.puV != null)
      this.puV.onSuccess(paramString, paramMap);
    AppMethodBeat.o(68099);
  }

  @com.tencent.mm.remoteservice.e
  public void onTaskFailed(long paramLong)
  {
    AppMethodBeat.i(68106);
    if (this.pvL != null)
      ab.d("MicroMsg.ReadMailUI", "onTaskFailed id:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68106);
  }

  @com.tencent.mm.remoteservice.e
  public void onTaskFinished(long paramLong)
  {
    AppMethodBeat.i(68105);
    if (this.pvL != null)
      ab.d("MicroMsg.ReadMailUI", "onTaskFinished id:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68105);
  }

  @com.tencent.mm.remoteservice.e
  public void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(68104);
    if (this.pvL != null)
      ab.d("MicroMsg.ReadMailUI", "onTaskPaused id:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68104);
  }

  @com.tencent.mm.remoteservice.e
  public void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(68103);
    if (this.pvL != null)
      ab.d("MicroMsg.ReadMailUI", "onTaskRemoved id:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68103);
  }

  @com.tencent.mm.remoteservice.e
  public void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(68102);
    if (this.pvL != null)
    {
      ReadMailUI.b localb = this.pvL;
      ab.d("MicroMsg.ReadMailUI", "onTaskStarted id:%d, saveFilePath:%s", new Object[] { Long.valueOf(paramLong), paramString });
      ReadMailUI.a(localb.pzZ, ah.getContext().getSharedPreferences("QQMAIL", com.tencent.mm.compatible.util.h.Mu()));
      if (ReadMailUI.o(localb.pzZ) != null)
        ReadMailUI.o(localb.pzZ).edit().putString("qqmail_downloadpath", paramString).commit();
    }
    AppMethodBeat.o(68102);
  }

  @f
  public long post(String paramString, Map paramMap, Bundle paramBundle)
  {
    AppMethodBeat.i(68108);
    v.c localc = new v.c();
    localc.fromBundle(paramBundle);
    long l = ac.ccC().a(paramString, paramMap, localc, this.pvK);
    AppMethodBeat.o(68108);
    return l;
  }

  @f
  public void removeDownloadCallback()
  {
    AppMethodBeat.i(68117);
    com.tencent.mm.plugin.downloader.model.d.bij();
    b.bif();
    AppMethodBeat.o(68117);
  }

  @f
  public int removeDownloadQQMailAppTask(long paramLong)
  {
    AppMethodBeat.i(68119);
    int i = com.tencent.mm.plugin.downloader.model.d.bij().hl(paramLong);
    AppMethodBeat.o(68119);
    return i;
  }

  @f
  public void replaceMsgContent(long paramLong, String paramString)
  {
    AppMethodBeat.i(68112);
    new ak().post(new ReadMailProxy.6(this, paramLong, paramString));
    AppMethodBeat.o(68112);
  }

  @f
  public void reportKvState(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(68126);
    com.tencent.mm.plugin.report.service.h.pYm.e(paramInt1, new Object[] { Integer.valueOf(paramInt2) });
    AppMethodBeat.o(68126);
  }

  @f
  public void reportKvStates(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(68127);
    com.tencent.mm.plugin.report.service.h.pYm.e(paramInt1, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(68127);
  }

  @f
  public Integer showMailAppRecommend()
  {
    AppMethodBeat.i(68121);
    Integer localInteger;
    if (com.tencent.mm.sdk.platformtools.g.cdf == 1)
    {
      localInteger = Integer.valueOf(0);
      AppMethodBeat.o(68121);
    }
    while (true)
    {
      return localInteger;
      localInteger = Integer.valueOf(bo.getInt(com.tencent.mm.m.g.Nv().O("MailApp", "ShowMailAppRecommend"), 0));
      AppMethodBeat.o(68121);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy
 * JD-Core Version:    0.6.2
 */