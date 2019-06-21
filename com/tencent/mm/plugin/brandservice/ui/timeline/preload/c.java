package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import android.os.Looper;
import android.os.MessageQueue;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static HashSet<Long> jQP;
  private static HashSet<String> jQQ;
  private static Boolean jQV;
  private static Boolean jQW;
  public BizTimeLineUI jNd;
  private int jQM;
  private int jQN;
  public int jQO;
  public List<com.tencent.mm.storage.q> jQR;
  private List<com.tencent.mm.storage.q> jQS;
  private boolean jQT;
  public boolean jQU;

  static
  {
    AppMethodBeat.i(14388);
    jQP = new HashSet();
    jQQ = new HashSet();
    jQV = null;
    jQW = null;
    AppMethodBeat.o(14388);
  }

  public c(BizTimeLineUI paramBizTimeLineUI, int paramInt1, int paramInt2, List<com.tencent.mm.storage.q> paramList)
  {
    AppMethodBeat.i(14368);
    this.jQO = 0;
    this.jQR = new LinkedList();
    this.jQT = false;
    this.jQU = false;
    this.jNd = paramBizTimeLineUI;
    this.jQM = paramInt1;
    this.jQN = paramInt2;
    this.jQS = paramList;
    if (this.jQS.size() <= 10)
      Looper.myQueue().addIdleHandler(new c.1(this));
    AppMethodBeat.o(14368);
  }

  public static boolean a(com.tencent.mm.storage.q paramq, p paramp)
  {
    boolean bool = false;
    AppMethodBeat.i(14381);
    if ((paramq == null) || (paramp == null))
      AppMethodBeat.o(14381);
    while (true)
    {
      return bool;
      if ((paramp.type == 5) || (paramp.type == 10) || (com.tencent.mm.plugin.brandservice.ui.b.a.e(paramq)))
      {
        bool = true;
        AppMethodBeat.o(14381);
      }
      else
      {
        AppMethodBeat.o(14381);
      }
    }
  }

  private static boolean a(String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(14377);
    if (jQQ.contains(paramLong + "_" + paramInt2))
      AppMethodBeat.o(14377);
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString1))
      {
        AppMethodBeat.o(14377);
        bool = false;
      }
      else
      {
        String str = paramString1;
        if (com.tencent.mm.at.q.ahs())
          str = com.tencent.mm.at.q.sy(paramString1);
        if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.pluginsdk.model.q.v(str, paramInt1, paramString2)))
        {
          AppMethodBeat.o(14377);
          bool = false;
        }
        else
        {
          jQQ.add(paramLong + "_" + paramInt2);
          AppMethodBeat.o(14377);
        }
      }
    }
  }

  private boolean a(String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(14373);
    if (a(paramString1, paramInt1, paramString2, paramLong, paramInt2))
    {
      paramBoolean = false;
      AppMethodBeat.o(14373);
      return paramBoolean;
    }
    ab.v("MicroMsg.BizTimeLineImgLoader", "doPreLoadNext pos %d", new Object[] { Integer.valueOf(paramInt2) });
    ImageView localImageView = new ImageView(this.jNd);
    this.jQO += 1;
    if ((paramInt2 == 0) && (paramBoolean))
      a(paramString1, localImageView, paramInt1, this.jQM, new c.3(this, paramLong, paramInt2), false);
    while (true)
    {
      paramBoolean = true;
      AppMethodBeat.o(14373);
      break;
      a(paramString1, localImageView, paramInt1, this.jQN, this.jQN, paramString2, new c.4(this, paramLong, paramInt2));
    }
  }

  private com.tencent.mm.storage.q aWS()
  {
    AppMethodBeat.i(14375);
    int i = 0;
    try
    {
      while (i < this.jQS.size() + this.jQR.size())
      {
        com.tencent.mm.storage.q localq = sg(i);
        if ((localq != null) && (localq.drC()) && (localq.field_isRead != 1) && (!jQP.contains(Long.valueOf(localq.field_msgId))))
        {
          ab.v("MicroMsg.BizTimeLineImgLoader", "getNextPreloadInfo pos=%d,msg id=%d", new Object[] { Integer.valueOf(i), Long.valueOf(localq.field_msgId) });
          AppMethodBeat.o(14375);
          return localq;
        }
        i++;
        gL(localq.field_msgId);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.BizTimeLineImgLoader", "getNextPreloadInfo %s", new Object[] { localException.getMessage() });
        Object localObject = null;
        AppMethodBeat.o(14375);
      }
    }
  }

  private static boolean aWU()
  {
    AppMethodBeat.i(14382);
    if (jQV == null)
      aWW();
    boolean bool = jQV.booleanValue();
    AppMethodBeat.o(14382);
    return bool;
  }

  public static boolean aWV()
  {
    AppMethodBeat.i(14383);
    if (jQW == null)
      aWW();
    boolean bool = jQW.booleanValue();
    AppMethodBeat.o(14383);
    return bool;
  }

  private static void aWW()
  {
    AppMethodBeat.i(14384);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100461");
    if ((localc.isValid()) && ("1".equals(localc.dru().get("isOpenBizMsgPreDownloadCover"))))
    {
      bool = true;
      jQV = Boolean.valueOf(bool);
      if ((!localc.isValid()) || (!"1".equals(localc.dru().get("isOnlyPreloadInWifi"))))
        break label126;
    }
    label126: for (boolean bool = true; ; bool = false)
    {
      jQW = Boolean.valueOf(bool);
      ab.i("MicroMsg.BizTimeLineImgLoader", "BizTimeLineImg initABTest %b/%b", new Object[] { jQV, jQW });
      AppMethodBeat.o(14384);
      return;
      bool = false;
      break;
    }
  }

  private static void gL(long paramLong)
  {
    AppMethodBeat.i(14374);
    jQP.add(Long.valueOf(paramLong));
    AppMethodBeat.o(14374);
  }

  private com.tencent.mm.storage.q sg(int paramInt)
  {
    AppMethodBeat.i(14380);
    try
    {
      com.tencent.mm.storage.q localq;
      if (paramInt < this.jQS.size())
      {
        localq = (com.tencent.mm.storage.q)this.jQS.get(paramInt);
        AppMethodBeat.o(14380);
      }
      while (true)
      {
        return localq;
        if (paramInt >= this.jQS.size() + this.jQR.size())
          break;
        localq = (com.tencent.mm.storage.q)this.jQR.get(paramInt - this.jQS.size());
        AppMethodBeat.o(14380);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.w("MicroMsg.BizTimeLineImgLoader", "getItem error %s", new Object[] { localThrowable.getMessage() });
        Object localObject = null;
        AppMethodBeat.o(14380);
      }
    }
  }

  public final void KB()
  {
    AppMethodBeat.i(14378);
    if (!aWU())
      AppMethodBeat.o(14378);
    while (true)
    {
      return;
      b.a("BizTimeLineImgLoaderThread", new c.5(this), 0L);
      AppMethodBeat.o(14378);
    }
  }

  public final void a(String paramString1, ImageView paramImageView, int paramInt1, int paramInt2, int paramInt3, String paramString2, e.a parama)
  {
    AppMethodBeat.i(14370);
    paramImageView.setContentDescription(this.jNd.getString(2131298119));
    if (com.tencent.mm.at.q.ahs())
      paramString1 = com.tencent.mm.at.q.sy(paramString1);
    while (true)
    {
      com.tencent.mm.at.a.a locala = o.ahp();
      c.a locala1 = new c.a();
      locala1.ePV = 2131689876;
      locala1.ePH = true;
      locala1 = locala1.ct(paramInt2, paramInt3);
      locala1.fGV = new f();
      locala1.ePJ = com.tencent.mm.pluginsdk.model.q.v(paramString1, paramInt1, paramString2);
      locala.a(paramString1, paramImageView, locala1.ahG(), null, new com.tencent.mm.pluginsdk.ui.applet.e(0, 0, 0, parama));
      AppMethodBeat.o(14370);
      return;
    }
  }

  public final void a(String paramString, ImageView paramImageView, int paramInt1, int paramInt2, e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(14369);
    paramImageView.setContentDescription(this.jNd.getString(2131298119));
    if (com.tencent.mm.at.q.ahs())
      paramString = com.tencent.mm.at.q.sy(paramString);
    while (true)
    {
      int i;
      if (paramBoolean)
      {
        i = 2130837927;
        if (!paramBoolean)
          break label170;
      }
      label170: for (int j = 2130837928; ; j = 2130837932)
      {
        int k = getContentWidth();
        com.tencent.mm.at.a.a locala = o.ahp();
        c.a locala1 = new c.a();
        locala1.ePV = j;
        locala1.ePH = true;
        locala1 = locala1.ct(k, paramInt2);
        locala1.ePX = String.valueOf(i);
        locala1.fGV = new f();
        locala1.ePJ = com.tencent.mm.pluginsdk.model.q.v(paramString, paramInt1, "@T");
        locala.a(paramString, paramImageView, locala1.ahG(), null, new com.tencent.mm.pluginsdk.ui.applet.e(i, k, paramInt2, parama));
        AppMethodBeat.o(14369);
        return;
        i = 0;
        break;
      }
    }
  }

  public final void aWR()
  {
    AppMethodBeat.i(14372);
    if (!aWU())
      AppMethodBeat.o(14372);
    while (true)
    {
      return;
      if ((this.jQT) || (this.jQU))
      {
        ab.v("MicroMsg.BizTimeLineImgLoader", "preLoadNext loading %b, onPause %b", new Object[] { Boolean.valueOf(this.jQT), Boolean.valueOf(this.jQU) });
        AppMethodBeat.o(14372);
      }
      else
      {
        this.jQT = true;
        ab.v("MicroMsg.BizTimeLineImgLoader", "preLoadNext");
        b.a("BizTimeLineImgLoaderThread", new c.2(this), 500L);
        AppMethodBeat.o(14372);
      }
    }
  }

  public final com.tencent.mm.storage.q aWT()
  {
    AppMethodBeat.i(14379);
    try
    {
      if (this.jQS.size() > 0)
      {
        com.tencent.mm.storage.q localq = (com.tencent.mm.storage.q)this.jQS.get(this.jQS.size() - 1);
        AppMethodBeat.o(14379);
        return localq;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.w("MicroMsg.BizTimeLineImgLoader", "getItem error %s", new Object[] { localThrowable.getMessage() });
        Object localObject = null;
        AppMethodBeat.o(14379);
      }
    }
  }

  public final int getContentWidth()
  {
    AppMethodBeat.i(14371);
    int i = com.tencent.mm.bz.a.gd(this.jNd);
    int j = (int)(com.tencent.mm.bz.a.getDensity(this.jNd) * 16.0F);
    AppMethodBeat.o(14371);
    return i - j;
  }

  public final void m(long paramLong, int paramInt)
  {
    AppMethodBeat.i(14376);
    ab.v("MicroMsg.BizTimeLineImgLoader", "onLoadFinish mLoadingCount %d", new Object[] { Integer.valueOf(this.jQO) });
    jQQ.add(paramLong + "_" + paramInt);
    if (this.jQO <= 0)
      aWR();
    AppMethodBeat.o(14376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.c
 * JD-Core Version:    0.6.2
 */