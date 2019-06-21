package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class q extends MMVideoView
{
  private String cvF = "";
  private chw sAX;
  private b sDo;

  public q(Context paramContext, b paramb)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.sDo = paramb;
  }

  private static boolean bwE()
  {
    boolean bool1 = false;
    AppMethodBeat.i(1803);
    try
    {
      g.RQ();
      bool2 = g.RP().Ry().getBoolean(ac.a.xQl, false);
      AppMethodBeat.o(1803);
      return bool2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", localException, "check need reset error", new Object[0]);
        AppMethodBeat.o(1803);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean C(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(1808);
    int i = paramInt;
    if (this.fUQ != null)
    {
      int j = this.fUQ.anZ();
      i = paramInt;
      if (paramInt > j)
      {
        i = paramInt;
        if (j > 0)
        {
          ab.i("MicroMsg.TopStory.TopStoryVideoView", "%s seek to reset time ori[%d] last key frame[%d]", new Object[] { aZk(), Integer.valueOf(paramInt), Integer.valueOf(j) });
          i = j;
        }
      }
    }
    paramBoolean = super.C(i, paramBoolean);
    AppMethodBeat.o(1808);
    return paramBoolean;
  }

  public final boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(1809);
    paramPInt1.value = Math.max(paramInt, this.fUV);
    boolean bool2;
    if ((this.fUP == 1) || (this.fUP == 0))
      if ((this.fUQ != null) && (bwE()))
      {
        paramPInt2.value = 0;
        paramPInt1.value = 0;
        bool2 = this.fUQ.b(paramInt + 1, paramPInt1, paramPInt2);
        bool3 = bool2;
        if (!bool2)
        {
          paramPInt1.value = paramInt;
          paramPInt1.value += 4;
        }
      }
    for (boolean bool3 = bool2; ; bool3 = false)
    {
      bool2 = bool3;
      if (this.fUP == 2)
      {
        if (this.fUQ != null)
        {
          bool3 = this.fUQ.b(paramInt, paramPInt1, paramPInt2);
          paramPInt2.value += 4;
        }
        bool2 = bool3;
        if (!bool3)
        {
          paramPInt1.value = (paramInt - 8);
          if (paramPInt1.value < 0)
            paramPInt1.value = 0;
          paramPInt2.value = (paramPInt1.value + this.fUW + 8);
          bool2 = bool3;
        }
      }
      if ((this.fUP == 3) || (this.fUP == 4))
      {
        paramPInt1.value = this.fUV;
        paramPInt2.value = (this.fUR + 1);
      }
      if (paramPInt2.value >= this.fUR + 1)
        paramPInt2.value = (this.fUR + 1);
      if (paramPInt2.value < paramPInt1.value)
      {
        paramPInt1.value += 2;
        AppMethodBeat.o(1809);
      }
      for (bool3 = bool1; ; bool3 = true)
      {
        return bool3;
        ab.d("MicroMsg.TopStory.TopStoryVideoView", "%s calcDownloadRange2 range[%d, %d, %b] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", new Object[] { aZk(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Boolean.valueOf(bool2), Integer.valueOf(paramInt), Integer.valueOf(this.fUP), Integer.valueOf(this.fUV), Integer.valueOf(this.fUW), this.fUL });
        AppMethodBeat.o(1809);
      }
      bool2 = false;
      break;
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(1811);
    super.aEX();
    this.sDo = null;
    AppMethodBeat.o(1811);
  }

  public final void abJ(String paramString)
  {
    AppMethodBeat.i(1810);
    this.cvF = paramString;
    start();
    AppMethodBeat.o(1810);
  }

  public final void ad(String paramString, int paramInt)
  {
    AppMethodBeat.i(1816);
    super.ad(paramString, paramInt);
    if ((paramInt != 0) && (this.rcd != null))
      this.rcd.c(getSessionId(), getMediaId(), "download error", paramInt, 0);
    AppMethodBeat.o(1816);
  }

  public final void akT()
  {
    this.fVa.fVf = 4;
    this.fVa.fVg = 2;
  }

  public final void akV()
  {
    AppMethodBeat.i(1819);
    ab.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIPause", new Object[] { aZk() });
    if (this.vgk)
    {
      this.vgr = getCurrPosSec();
      this.vgs = isPlaying();
      this.vgy = 0;
      this.vgx = 0L;
      pause();
      stopTimer();
      this.vgk = false;
      gp(getReportIdkey() + 11);
    }
    AppMethodBeat.o(1819);
  }

  public final void akW()
  {
    AppMethodBeat.i(1818);
    ab.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIResume", new Object[] { aZk() });
    if (!this.vgk)
    {
      this.vgk = true;
      if (this.klq != null)
      {
        if (!this.vgs)
          break label74;
        play();
      }
    }
    while (true)
    {
      gp(getReportIdkey() + 10);
      AppMethodBeat.o(1818);
      return;
      label74: ((VideoPlayerTextureView)this.klq).bPd();
    }
  }

  public final boolean cGT()
  {
    return false;
  }

  public final void cGU()
  {
    AppMethodBeat.i(1820);
    ((TopStoryVideoPlayTextureView)this.klq).setAlpha(0.0F);
    AppMethodBeat.o(1820);
  }

  public final void cGV()
  {
    AppMethodBeat.i(1821);
    ((TopStoryVideoPlayTextureView)this.klq).setAlpha(1.0F);
    AppMethodBeat.o(1821);
  }

  public final com.tencent.mm.pluginsdk.ui.tools.e cf(Context paramContext)
  {
    AppMethodBeat.i(1802);
    paramContext = new TopStoryVideoPlayTextureView(paramContext);
    paramContext.setOpenWithNoneSurface(true);
    paramContext.setNeedResetExtractor(bwE());
    paramContext.setIsOnlineVideoType(true);
    AppMethodBeat.o(1802);
    return paramContext;
  }

  public final int getCurrPosMs()
  {
    AppMethodBeat.i(1814);
    int i = 0;
    if (this.klq != null)
      i = this.klq.getCurrentPosition();
    if (this.fUS > 0)
      i = this.fUS * 1000;
    AppMethodBeat.o(1814);
    return i;
  }

  public final int getCurrPosSec()
  {
    AppMethodBeat.i(1815);
    int i = 0;
    if (this.klq != null)
      i = Math.round(this.klq.getCurrentPosition() * 1.0F / 1000.0F);
    if (this.fUS > 0)
      i = this.fUS;
    AppMethodBeat.o(1815);
    return i;
  }

  public final String getSessionId()
  {
    return this.cvF;
  }

  public final void h(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1807);
    if (!bo.isEqual(this.fUL, paramString))
      AppMethodBeat.o(1807);
    while (true)
    {
      return;
      ab.d("MicroMsg.TopStory.TopStoryVideoView", "%s download  onProgress [%d, %d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((this.fUU) && (this.fUP == 3))
        mm(getCurrPosSec());
      AppMethodBeat.o(1807);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(1805);
    super.initView();
    AppMethodBeat.o(1805);
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(1813);
    boolean bool1 = super.isPlaying();
    if ((bool1) && (this.fUP == 3));
    for (boolean bool2 = true; ; bool2 = false)
    {
      ab.d("MicroMsg.TopStory.TopStoryVideoView", "%s result [%b] is playing[%b] playStatus[%d]", new Object[] { aZk(), Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(this.fUP) });
      AppMethodBeat.o(1813);
      return bool1;
    }
  }

  public final boolean mn(int paramInt)
  {
    AppMethodBeat.i(1806);
    boolean bool1;
    if (this.fUO == 3)
    {
      AppMethodBeat.o(1806);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      try
      {
        PInt localPInt3 = new com/tencent/mm/pointers/PInt;
        localPInt3.<init>();
        PInt localPInt4 = new com/tencent/mm/pointers/PInt;
        localPInt4.<init>();
        if ((paramInt == 0) && (this.fUQ != null) && (bwE()))
        {
          localPInt4.value = 0;
          localPInt3.value = 0;
          bool1 = this.fUQ.b(paramInt + 1, localPInt3, localPInt4);
          if (bool1)
          {
            i = localPInt4.value;
            if ((this.fUK != null) && (this.fUQ != null) && (this.fUQ.a(paramInt, i, localPInt1, localPInt2)))
            {
              bool2 = this.fUK.isVideoDataAvailable(this.fUL, localPInt1.value, localPInt2.value);
              bool1 = bool2;
              if (!bool2);
            }
          }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          try
          {
            this.fUV = i;
            bool1 = bool2;
            AppMethodBeat.o(1806);
            break;
            localException1 = localException1;
            bool1 = false;
            ab.e("MicroMsg.TopStory.TopStoryVideoView", "%s check video data error %s ", new Object[] { aZk(), localException1.toString() });
            continue;
          }
          catch (Exception localException2)
          {
            boolean bool2;
            bool1 = bool2;
            continue;
          }
          bool1 = false;
          continue;
          int i = paramInt + 1;
          continue;
          bool1 = false;
        }
      }
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1817);
    super.onError(paramInt1, paramInt2);
    switch (paramInt2)
    {
    default:
    case -2:
    case -1:
    case -3:
    }
    while (true)
    {
      AppMethodBeat.o(1817);
      while (true)
      {
        return;
        try
        {
          g.RQ();
          g.RP().Ry().set(ac.a.xQl, Boolean.TRUE);
          if ((this.klq instanceof TopStoryVideoPlayTextureView))
            ((TopStoryVideoPlayTextureView)this.klq).setNeedResetExtractor(true);
          com.tencent.mm.plugin.websearch.api.a.b.kT(com.tencent.mm.plugin.websearch.api.a.b.ubK);
          AppMethodBeat.o(1817);
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", localException, "%s onError [%s]", new Object[] { aZk(), localException.toString() });
        }
        com.tencent.mm.plugin.websearch.api.a.b.kT(com.tencent.mm.plugin.websearch.api.a.b.ubJ);
        AppMethodBeat.o(1817);
      }
      com.tencent.mm.plugin.websearch.api.a.b.kT(com.tencent.mm.plugin.websearch.api.a.b.ubL);
    }
  }

  public final void setVideoInfo(chw paramchw)
  {
    AppMethodBeat.i(1804);
    super.c(false, paramchw.videoUrl, paramchw.xgR);
    this.sAX = paramchw;
    this.fUL = c.au(paramchw.xgS, paramchw.xgT);
    this.fUM = (this.sDo.cFS() + this.fUL + ".mp4");
    AppMethodBeat.o(1804);
  }

  public final void start()
  {
    AppMethodBeat.i(1812);
    super.start();
    a.kT(5);
    AppMethodBeat.o(1812);
  }

  public final void stop()
  {
    AppMethodBeat.i(1822);
    super.stop();
    this.sAX = null;
    AppMethodBeat.o(1822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.q
 * JD-Core Version:    0.6.2
 */