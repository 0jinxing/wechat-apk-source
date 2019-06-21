package com.tencent.mm.plugin.topstory.ui.video;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.h;
import com.tencent.mm.i.h.a;
import com.tencent.mm.model.d.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.topstory.a.a.a;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.chx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r
{
  b sDo;
  private int sEV;
  private boolean sFA;
  private boolean sFB;
  private com.tencent.mm.model.d sFs;
  q sFt;
  public f sFu;
  public chw sFv;
  public boolean sFw;
  public boolean sFx;
  public boolean sFy;
  private d.a sFz;

  public r()
  {
    AppMethodBeat.i(1838);
    this.sEV = 0;
    this.sFy = false;
    this.sFz = new r.1(this);
    this.sFs = new com.tencent.mm.model.d();
    AppMethodBeat.o(1838);
  }

  public static boolean ab(long paramLong1, long paramLong2)
  {
    if ((paramLong1 >= 50L) || (paramLong2 > 5242880L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cGW()
  {
    AppMethodBeat.i(1841);
    if (this.sFt.getParent() != null)
      ((ViewGroup)this.sFt.getParent()).removeView(this.sFt);
    AppMethodBeat.o(1841);
  }

  private q cGX()
  {
    AppMethodBeat.i(1842);
    q localq = new q(this.sDo.bKU(), this.sDo);
    localq.setRootPath(this.sDo.cFS());
    localq.setIOnlineVideoProxy(new r.b(this, (byte)0));
    localq.setReporter(new c((byte)0));
    AppMethodBeat.o(1842);
    return localq;
  }

  private void cGY()
  {
    AppMethodBeat.i(1844);
    this.sFs.cy(false);
    AppMethodBeat.o(1844);
  }

  private void clU()
  {
    AppMethodBeat.i(1843);
    this.sFs.a(this.sFz);
    AppMethodBeat.o(1843);
  }

  public final void a(b paramb, chw paramchw, String paramString, int paramInt)
  {
    AppMethodBeat.i(1840);
    ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "replay video %s %s %s", new Object[] { paramchw.xgS, paramchw.title, paramString });
    paramb.cFR().b(paramb.cFT());
    paramb.cFR().cGS();
    paramb.cFR().a(paramchw, paramInt, paramString);
    this.sFt.setKeepScreenOn(true);
    this.sFt.cGV();
    this.sFt.abJ(paramString);
    this.sFv = paramchw;
    this.sFw = true;
    this.sFx = false;
    AppMethodBeat.o(1840);
  }

  public final void a(f paramf, h.d paramd)
  {
    AppMethodBeat.i(1839);
    if ((paramf == this.sFu) || (this.sDo == null))
      AppMethodBeat.o(1839);
    while (true)
    {
      return;
      if (this.sFt == null)
        this.sFt = cGX();
      cGW();
      paramf.getVideoViewParent().addView(this.sFt);
      this.sFt.setVideoFooterView(paramf.getControlBar());
      this.sFt.setScaleType(paramd);
      this.sFt.setIMMVideoViewCallback(paramf.getVideoViewCallback());
      this.sFs.a(this.sFz);
      this.sFu = paramf;
      AppMethodBeat.o(1839);
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(1852);
    this.sEV -= 1;
    ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onUIDestroy %d", new Object[] { Integer.valueOf(this.sEV) });
    if (this.sEV <= 0)
    {
      if (this.sFt != null)
      {
        stopPlay();
        this.sFt.aEX();
      }
      this.sDo = null;
    }
    AppMethodBeat.o(1852);
  }

  public final void abK(String paramString)
  {
    AppMethodBeat.i(1855);
    com.tencent.mm.plugin.topstory.a.b.a locala = this.sDo.cFR().sFp;
    if (locala != null)
      locala.sAI = 1L;
    if ((this.sFt != null) && (this.sFt.getSessionId().equals(paramString)))
      stopPlay();
    com.tencent.mm.plugin.websearch.api.a.a.kT(26);
    AppMethodBeat.o(1855);
  }

  public final void akV()
  {
    AppMethodBeat.i(1851);
    if (this.sFt != null)
      this.sFt.akV();
    AppMethodBeat.o(1851);
  }

  public final void akW()
  {
    AppMethodBeat.i(1850);
    if (this.sFt != null)
    {
      this.sFt.akW();
      if (this.sFu != null)
        this.sFu.cGs();
    }
    AppMethodBeat.o(1850);
  }

  public final void cEf()
  {
    AppMethodBeat.i(1847);
    if (this.sFt != null)
    {
      clU();
      this.sFt.setKeepScreenOn(true);
      this.sFt.play();
      this.sFx = false;
    }
    AppMethodBeat.o(1847);
  }

  public final boolean cGZ()
  {
    AppMethodBeat.i(1845);
    boolean bool;
    if (this.sFt != null)
    {
      bool = this.sFt.isPlaying();
      AppMethodBeat.o(1845);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1845);
    }
  }

  public final void cpN()
  {
    AppMethodBeat.i(1848);
    if (this.sFt != null)
    {
      cGY();
      this.sFt.setKeepScreenOn(false);
      this.sFt.pause();
      this.sFx = true;
    }
    AppMethodBeat.o(1848);
  }

  public final void d(b paramb)
  {
    this.sEV += 1;
    this.sDo = paramb;
  }

  public final void fT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1854);
    if (paramInt1 == 0)
    {
      if ((!this.sFw) || (!this.sFB))
        break label118;
      this.sFB = false;
      cEf();
      AppMethodBeat.o(1854);
    }
    while (true)
    {
      return;
      if (paramInt2 == 0)
      {
        if ((this.sFw) && (cGZ()))
        {
          this.sFB = true;
          cpN();
          AppMethodBeat.o(1854);
        }
      }
      else
      {
        if ((paramInt2 == 1) && (this.sFA) && (this.sFw) && (this.sFx))
        {
          this.sFA = false;
          cEf();
          this.sFu.cGp();
        }
        label118: AppMethodBeat.o(1854);
      }
    }
  }

  public final int getCurrPosMs()
  {
    AppMethodBeat.i(1858);
    int i;
    if (this.sFt != null)
    {
      i = this.sFt.getCurrPosMs();
      AppMethodBeat.o(1858);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(1858);
    }
  }

  public final int getCurrPosSec()
  {
    AppMethodBeat.i(1856);
    int i;
    if (this.sFt != null)
    {
      i = this.sFt.getCurrPosSec();
      AppMethodBeat.o(1856);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(1856);
    }
  }

  public final int getVideoDurationSec()
  {
    AppMethodBeat.i(1857);
    int i;
    if (this.sFt != null)
    {
      i = this.sFt.getVideoDurationSec();
      AppMethodBeat.o(1857);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(1857);
    }
  }

  public final void onError(String paramString)
  {
    AppMethodBeat.i(1853);
    if ((this.sFt != null) && (this.sFt.getSessionId().equals(paramString)))
      stopPlay();
    AppMethodBeat.o(1853);
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(1846);
    if (this.sFt != null)
      this.sFt.setMute(paramBoolean);
    AppMethodBeat.o(1846);
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(1849);
    if (this.sFt != null)
    {
      ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "stop play");
      cGY();
      this.sFt.cGU();
      this.sFt.setKeepScreenOn(false);
      this.sFt.stop();
      this.sFv = null;
      this.sFw = false;
      this.sFx = false;
      if (this.sDo != null)
      {
        this.sDo.cFR().b(this.sDo.cFT());
        this.sDo.cFR().cGS();
      }
      if (this.sFu != null)
        this.sFu.cGt();
    }
    AppMethodBeat.o(1849);
  }

  final class a
    implements h.a
  {
    boolean sFD;
    private boolean sFE;

    private a()
    {
    }

    public final void a(String paramString, int paramInt, com.tencent.mm.i.d paramd)
    {
      AppMethodBeat.i(1831);
      int i = paramInt;
      if (com.tencent.mm.plugin.topstory.a.g.cFm())
      {
        i = paramInt;
        if (r.this.sFy)
        {
          r.this.sFy = false;
          i = 404;
        }
      }
      ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFinish %s %d", new Object[] { paramString, Integer.valueOf(i) });
      Object localObject1;
      Object localObject2;
      if (r.this.sDo != null)
      {
        localObject1 = r.this.sDo.cFU();
        if (((m)localObject1).sET.containsKey(paramString))
        {
          localObject2 = (chx)((m)localObject1).sET.get(paramString);
          if (i == 0)
          {
            ((chx)localObject2).cHr = paramString;
            ((chx)localObject2).xhj = ((chx)localObject2).xha;
            ((chx)localObject2).xhk = m.aa(((chx)localObject2).xhj, ((chx)localObject2).xha);
            ((m)localObject1).sET.put(paramString, localObject2);
          }
          ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onCurrentVideoDownloadFinish onFinish %s %d %s %d", new Object[] { paramString, Long.valueOf(((chx)localObject2).xhk), bo.b(((chx)localObject2).xhj, 100.0D), Integer.valueOf(i) });
        }
      }
      int j = 0;
      try
      {
        paramInt = r.this.sDo.cGg().FL(r.this.sDo.cFY()).xhg;
        int k = n.Me();
        localObject1 = paramd;
        if (paramd == null)
          localObject1 = new com.tencent.mm.i.d();
        long l1 = ((com.tencent.mm.i.d)localObject1).field_startTime;
        long l2 = ((com.tencent.mm.i.d)localObject1).field_endTime;
        int m = ((com.tencent.mm.i.d)localObject1).field_averageSpeed;
        int n = ((com.tencent.mm.i.d)localObject1).field_averageConnectCost;
        int i1 = ((com.tencent.mm.i.d)localObject1).field_firstConnectCost;
        int i2 = ((com.tencent.mm.i.d)localObject1).field_moovFailReason;
        int i3 = ((com.tencent.mm.i.d)localObject1).field_httpStatusCode;
        String str = ((com.tencent.mm.i.d)localObject1).field_clientIP;
        localObject2 = ((com.tencent.mm.i.d)localObject1).field_serverIP;
        paramd = ((com.tencent.mm.i.d)localObject1).field_xErrorNo;
        int i4 = ((com.tencent.mm.i.d)localObject1).field_cSeqCheck;
        if (((com.tencent.mm.i.d)localObject1).field_isCrossNet)
        {
          j = 1;
          if (!((com.tencent.mm.i.d)localObject1).field_usePrivateProtocol)
            break label570;
        }
        label570: for (int i5 = 1; ; i5 = 0)
        {
          paramd = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), str, localObject2, paramd, Integer.valueOf(i4), Integer.valueOf(j), Integer.valueOf(i5), Integer.valueOf(k) });
          ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryCdnDownloadError 16270 %s", new Object[] { paramd });
          e.pXa.X(16270, paramd);
          al.d(new r.a.4(this, paramString, i));
          AppMethodBeat.o(1831);
          return;
          j = 0;
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
          paramInt = j;
      }
    }

    public final void cHa()
    {
      AppMethodBeat.i(1830);
      m localm;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if ((!this.sFE) && (r.this.sFv != null) && (r.this.sDo != null) && ((r.this.sDo.cFQ().bkJ()) || (com.tencent.mm.plugin.topstory.a.g.cFp())))
      {
        ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPreload");
        this.sFE = true;
        localm = r.this.sDo.cFU();
        localObject2 = r.this.sFv;
        localObject3 = localm.sDo.cGg();
        localObject4 = new ArrayList();
      }
      while (true)
      {
        int i;
        Object localObject5;
        String str1;
        try
        {
          i = ((n)localObject3).cGQ().size();
          j = 0;
          if (j >= i)
            break label681;
          if (((chw)localObject2).xgS.equals(((chw)((n)localObject3).cGQ().get(j)).xgS))
          {
            if ((j >= 0) && (j + 1 < i))
            {
              j++;
              if (j < i)
              {
                ((List)localObject4).add(((n)localObject3).cGQ().get(j));
                j++;
                continue;
              }
            }
          }
          else
          {
            j++;
            continue;
          }
          localObject2 = new HashMap();
          localObject4 = ((List)localObject4).iterator();
          if (((Iterator)localObject4).hasNext())
          {
            localObject5 = (chw)((Iterator)localObject4).next();
            str1 = c.au(((chw)localObject5).xgS, ((chw)localObject5).xgT);
            if (!localm.sET.containsKey(str1))
              break label607;
            localObject3 = (chx)localm.sET.get(str1);
            ((HashMap)localObject2).put(str1, localObject3);
            i = (int)m.aa(a.a.sAD.longValue(), ((chw)localObject5).xha);
            if (i >= 20)
              break label633;
            j = 20;
            if (((chx)localObject3).xhk >= j)
              break label651;
            String str2 = localm.sDo.cFS() + str1 + ".mp4";
            String str3 = ((chw)localObject5).videoUrl;
            localObject5 = new h();
            ((h)localObject5).field_mediaId = str1;
            ((h)localObject5).url = str3;
            ((h)localObject5).egx = 2;
            ((h)localObject5).egD = 2;
            ((h)localObject5).egy = 3;
            ((h)localObject5).egI = j;
            ((h)localObject5).field_preloadRatio = j;
            ((h)localObject5).concurrentCount = 4;
            ((h)localObject5).field_fullpath = str2;
            ((h)localObject5).egl = new m.d(localm, (byte)0);
            ((h)localObject5).egz = new m.c(localm, (byte)0);
            com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject5, -1);
            ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "Preload video %s from %s to %s", new Object[] { str1, Long.valueOf(((chx)localObject3).xhk), Integer.valueOf(j) });
            if (((HashMap)localObject2).size() != 6)
              continue;
          }
          localm.sEU.clear();
          localm.sEU.addAll(((HashMap)localObject2).keySet());
          localm.sET.putAll((Map)localObject2);
          com.tencent.mm.sdk.g.d.post(new m.a(localm, localm.sES), "TopStory.DeleteVideoCacheTask");
          AppMethodBeat.o(1830);
          return;
        }
        finally
        {
          AppMethodBeat.o(1830);
        }
        label607: localObject3 = new chx();
        ((chx)localObject3).cHr = str1;
        ((chx)localObject3).xha = ((chw)localObject5).xha;
        continue;
        label633: int j = i;
        if (i > 100)
        {
          j = 100;
          continue;
          label651: ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "Already Preload video %s %s", new Object[] { str1, Long.valueOf(((chx)localObject3).xhk) });
          continue;
          label681: j = -1;
        }
      }
    }

    public final void h(String paramString, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(1829);
      if (r.this.sDo != null)
      {
        m localm = r.this.sDo.cFU();
        long l1 = paramInt1;
        long l2 = paramInt2;
        if (localm.sET.containsKey(paramString))
        {
          chx localchx = (chx)localm.sET.get(paramString);
          localchx.cHr = paramString;
          localchx.xha = l2;
          localchx.xhj = l1;
          localchx.xhk = m.aa(localchx.xhj, localchx.xha);
          localm.sET.put(paramString, localchx);
        }
      }
      al.d(new r.a.3(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(1829);
    }

    public final void onDataAvailable(final String paramString, final int paramInt1, final int paramInt2)
    {
      AppMethodBeat.i(1828);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(1824);
          if (r.this.sFt != null)
            r.this.sFt.onDataAvailable(paramString, paramInt1, paramInt2);
          AppMethodBeat.o(1824);
        }
      });
      AppMethodBeat.o(1828);
    }

    public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(1827);
      if (!this.sFD)
      {
        this.sFD = true;
        al.d(new r.a.1(this, paramInt1, paramInt2, paramString));
        AppMethodBeat.o(1827);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(1827);
      }
    }
  }

  final class c
    implements h.c
  {
    private c()
    {
    }

    public final void gp(long paramLong)
    {
      AppMethodBeat.i(1836);
      e.pXa.a(600L, paramLong, 1L, false);
      AppMethodBeat.o(1836);
    }

    public final void wB(String paramString)
    {
      AppMethodBeat.i(1837);
      e.pXa.X(14349, paramString);
      AppMethodBeat.o(1837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.r
 * JD-Core Version:    0.6.2
 */