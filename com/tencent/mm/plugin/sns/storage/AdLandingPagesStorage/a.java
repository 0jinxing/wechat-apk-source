package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.f.b;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  public volatile b qHp;
  public volatile boolean qVA;
  private IntentFilter qVB;
  ConcurrentHashMap<String, a.c> qVC;
  public ConcurrentHashMap<String, a.d> qVD;
  public k qVE;
  private ak qVF;
  public a.a qVz;

  private a()
  {
    AppMethodBeat.i(36930);
    this.qVC = new ConcurrentHashMap();
    this.qVD = new ConcurrentHashMap();
    this.qVE = new a.1(this);
    this.qVz = new a.a(this, (byte)0);
    this.qVB = new IntentFilter();
    this.qVB.addAction("android.intent.action.PACKAGE_ADDED");
    this.qVB.addAction("android.intent.action.PACKAGE_REMOVED");
    this.qVB.addDataScheme("package");
    this.qVF = new a.2(this, Looper.getMainLooper());
    AppMethodBeat.o(36930);
  }

  private void f(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36935);
    System.currentTimeMillis();
    a.d locald = (a.d)this.qVD.get(paramString1);
    String str = paramString2;
    if (!TextUtils.isEmpty(paramString2))
      str = paramString2.replaceAll("\\.", "_");
    if (locald == null);
    for (paramString2 = ""; ; paramString2 = locald.qTL + "." + locald.hcx + "." + str + ".0.20.0")
    {
      paramString1 = q(new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, paramString2 });
      ab.i("MicroMsg.AdDownloadApkMgr", "reporting %d  %s", new Object[] { Integer.valueOf(14542), paramString1 });
      ab.d("MicroMsg.AdDownloadApkMgr", "14542  extinfo : ".concat(String.valueOf(paramString2)));
      h.pYm.a(14542, paramString1, true, false);
      AppMethodBeat.o(36935);
      return;
    }
  }

  private static String q(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(36934);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 4; i++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i])).append(',');
    localStringBuilder.append(System.currentTimeMillis() / 1000L);
    paramArrayOfObject = localStringBuilder.toString();
    AppMethodBeat.o(36934);
    return paramArrayOfObject;
  }

  public static long queryIdByAppid(String paramString)
  {
    AppMethodBeat.i(36931);
    paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
    long l;
    if (paramString != null)
    {
      l = paramString.id;
      AppMethodBeat.o(36931);
    }
    while (true)
    {
      return l;
      l = 9223372036854775807L;
      AppMethodBeat.o(36931);
    }
  }

  public final void Z(int paramInt, long paramLong)
  {
    AppMethodBeat.i(36933);
    com.tencent.mm.plugin.downloader.f.a locala = ((com.tencent.mm.plugin.downloader.a.d)g.K(com.tencent.mm.plugin.downloader.a.d.class)).XS().hC(paramLong);
    if (locala == null)
      AppMethodBeat.o(36933);
    while (true)
    {
      return;
      reportDownloadInfo(paramInt, locala.field_appId);
      AppMethodBeat.o(36933);
    }
  }

  public final void a(String paramString, a.c paramc)
  {
    AppMethodBeat.i(36932);
    this.qVC.put(paramString, paramc);
    ab.i("MicroMsg.AdDownloadApkMgr", "register package receiver");
    ah.getContext().registerReceiver(this.qVz, this.qVB);
    this.qVA = true;
    this.qVF.removeMessages(10008);
    this.qVF.sendEmptyMessageDelayed(10008, 300000L);
    AppMethodBeat.o(36932);
  }

  public final void reportDownloadInfo(int paramInt, String paramString)
  {
    AppMethodBeat.i(36936);
    com.tencent.mm.plugin.downloader.f.a locala = ((com.tencent.mm.plugin.downloader.a.d)g.K(com.tencent.mm.plugin.downloader.a.d.class)).XS().In(paramString);
    if (locala == null)
    {
      ab.i("MicroMsg.AdDownloadApkMgr", "downloadinfo not found");
      AppMethodBeat.o(36936);
    }
    while (true)
    {
      return;
      f(paramInt, paramString, locala.field_packageName, locala.field_downloadUrl);
      AppMethodBeat.o(36936);
    }
  }

  public static abstract interface b
  {
    public abstract void failed(long paramLong);

    public abstract void paused(long paramLong);

    public abstract void progress(long paramLong, int paramInt);

    public abstract void resumed(long paramLong);

    public abstract void stopped(long paramLong);

    public abstract void succeed(long paramLong);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a
 * JD-Core Version:    0.6.2
 */