package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class CommonVideoView extends AbstractVideoView
{
  protected boolean bkJ;
  protected int hZs = 0;
  protected int iad;
  protected String url;

  public CommonVideoView(Context paramContext)
  {
    super(paramContext);
  }

  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void EA()
  {
    AppMethodBeat.i(117957);
    if (isLive())
    {
      ab.i(this.TAG, "%s it is live video, do not completion", new Object[] { aZk() });
      stop();
      start();
      AppMethodBeat.o(117957);
    }
    while (true)
    {
      return;
      super.EA();
      AppMethodBeat.o(117957);
    }
  }

  public final int KM(int paramInt)
  {
    this.hZs = paramInt;
    return paramInt;
  }

  public void akV()
  {
    AppMethodBeat.i(117955);
    super.akV();
    AppMethodBeat.o(117955);
  }

  public void akW()
  {
    AppMethodBeat.i(117954);
    super.akW();
    if ((this.klq != null) && ((this.klq instanceof VideoTextureView)))
      if (this.vgs)
      {
        play();
        AppMethodBeat.o(117954);
      }
    while (true)
    {
      return;
      ((VideoTextureView)this.klq).bPd();
      AppMethodBeat.o(117954);
    }
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(117950);
    ab.i(this.TAG, "%s set play rate [%f]", new Object[] { aZk(), Float.valueOf(paramFloat) });
    if ((this.klq instanceof VideoTextureView))
    {
      gp(getReportIdkey() + 13);
      bool = ((VideoTextureView)this.klq).as(paramFloat);
      AppMethodBeat.o(117950);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(117950);
    }
  }

  public void c(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(117946);
    ab.i(this.TAG, "%s set video path isLive [%b] url [%s] durationSec [%d]", new Object[] { aZk(), Boolean.valueOf(paramBoolean), paramString, Integer.valueOf(paramInt) });
    this.bkJ = paramBoolean;
    this.url = paramString;
    this.iad = paramInt;
    ajo(paramString);
    AppMethodBeat.o(117946);
  }

  protected e cf(Context paramContext)
  {
    AppMethodBeat.i(117947);
    this.vgt = 0;
    paramContext = new VideoTextureView(paramContext);
    AppMethodBeat.o(117947);
    return paramContext;
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(117953);
    if (isLive())
    {
      ab.w(this.TAG, "%s it is live, don't seek ", new Object[] { aZk() });
      AppMethodBeat.o(117953);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = super.e(paramDouble, paramBoolean);
      AppMethodBeat.o(117953);
    }
  }

  public final void gO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117956);
    ab.d(this.TAG, "%s onInfo [%d %d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 701)
    {
      aNt();
      diQ();
      diO();
      gp(getReportIdkey() + 40);
      AppMethodBeat.o(117956);
    }
    while (true)
    {
      return;
      if (paramInt1 == 702)
      {
        bJc();
        diP();
        diR();
      }
      AppMethodBeat.o(117956);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(117952);
    try
    {
      if ((this.klq instanceof VideoTextureView))
      {
        i = ((VideoTextureView)this.klq).getDownloadPercent();
        int j = super.getVideoDurationSec();
        float f = j;
        i = (int)(i * 1.0F / 100.0F * f);
        AppMethodBeat.o(117952);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, localException, "%s get cache time sec error", new Object[] { aZk() });
        AppMethodBeat.o(117952);
        int i = 0;
      }
    }
  }

  protected int getReportIdkey()
  {
    return 0;
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(117951);
    int i;
    if (this.iad <= 0)
    {
      i = super.getVideoDurationSec();
      AppMethodBeat.o(117951);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(117951);
    }
  }

  public int getVideoSource()
  {
    return this.hZs;
  }

  protected void initView()
  {
    AppMethodBeat.i(117945);
    super.initView();
    this.TAG = "MicroMsg.CommonVideoView";
    AppMethodBeat.o(117945);
  }

  public boolean isLive()
  {
    AppMethodBeat.i(117958);
    boolean bool = bTd();
    int i;
    if (this.klq != null)
    {
      i = this.klq.getDuration();
      if (!this.bkJ)
        break label102;
      bool = true;
    }
    while (true)
    {
      ab.d(this.TAG, "%s is live video result [%b] isPrepared[%b] durationMs[%d] isLive[%b]", new Object[] { aZk(), Boolean.valueOf(bool), Boolean.valueOf(bTd()), Integer.valueOf(i), Boolean.valueOf(this.bkJ) });
      AppMethodBeat.o(117958);
      return bool;
      i = 0;
      break;
      label102: if ((bool) && (i <= 0))
        bool = true;
      else
        bool = false;
    }
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(117949);
    if ((this.klq instanceof VideoTextureView))
    {
      ((VideoTextureView)this.klq).setScaleType(paramd);
      gp(getReportIdkey() + 14);
    }
    AppMethodBeat.o(117949);
  }

  public void start()
  {
    AppMethodBeat.i(117948);
    if (this.klq != null)
    {
      ab.i(this.TAG, "%s start path [%s] [%s]", new Object[] { aZk(), this.klq.getVideoPath(), bo.dpG() });
      if (!bo.isNullOrNil(this.klq.getVideoPath()))
        break label103;
      this.klq.setVideoPath(this.url);
      aNt();
      cso();
    }
    while (true)
    {
      gp(getReportIdkey() + 1);
      AppMethodBeat.o(117948);
      return;
      label103: play();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.CommonVideoView
 * JD-Core Version:    0.6.2
 */