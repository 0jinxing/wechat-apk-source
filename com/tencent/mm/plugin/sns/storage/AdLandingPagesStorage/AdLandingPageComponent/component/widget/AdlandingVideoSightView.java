package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.b;
import com.tencent.mm.pluginsdk.ui.tools.e.c;
import com.tencent.mm.pluginsdk.ui.tools.e.d;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public class AdlandingVideoSightView extends AdlandingSightPlayImageView
  implements com.tencent.mm.pluginsdk.ui.tools.e
{
  protected int duration;
  private boolean eif;
  protected String ien;
  private boolean rcC;
  private boolean rcD;

  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(37459);
    this.duration = 0;
    this.rcD = true;
    this.eif = false;
    init();
    AppMethodBeat.o(37459);
  }

  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(37458);
    this.duration = 0;
    this.rcD = true;
    this.eif = false;
    init();
    AppMethodBeat.o(37458);
  }

  private void init()
  {
    AppMethodBeat.i(37460);
    if (bo.bc(q.etn.esB, "").equals("other"))
      ab.i("MicroMsg.VideoSightView", "init::use other player");
    while (true)
    {
      setOnCompletionListener(new AdlandingVideoSightView.1(this));
      AppMethodBeat.o(37460);
      return;
      kA(true);
    }
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(37476);
    if (this.rcz != null)
    {
      b localb = this.rcz;
      ab.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bo.dpG().toString() });
      o.i(new b.2(localb, paramDouble), 0L);
    }
    AppMethodBeat.o(37476);
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(37479);
    B(paramDouble);
    AppMethodBeat.o(37479);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(37469);
    ab.v("MicroMsg.VideoSightView", "get current position");
    AppMethodBeat.o(37469);
    return 0;
  }

  public int getDuration()
  {
    AppMethodBeat.i(37470);
    int i = super.getDuration();
    ab.v("MicroMsg.VideoSightView", "get duration ".concat(String.valueOf(i)));
    AppMethodBeat.o(37470);
    return i;
  }

  public double getLastProgresstime()
  {
    AppMethodBeat.i(37475);
    b localb;
    double d;
    if (getController() != null)
    {
      localb = getController();
      if (localb.qxP != -1.0D)
      {
        d = localb.qxP;
        AppMethodBeat.o(37475);
      }
    }
    while (true)
    {
      return d;
      d = localb.qxM;
      AppMethodBeat.o(37475);
      continue;
      d = 0.0D;
      AppMethodBeat.o(37475);
    }
  }

  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(37464);
    boolean bool = this.rcz.cla();
    AppMethodBeat.o(37464);
    return bool;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(37463);
    super.onConfigurationChanged(paramConfiguration);
    if (this.rcD)
      setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
    AppMethodBeat.o(37463);
  }

  public final void onDetach()
  {
    AppMethodBeat.i(37471);
    a.xxA.d(this.rcz.cld());
    AppMethodBeat.o(37471);
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37462);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ab.v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.qyG) });
    if ((this.qyG) && (paramInt3 - paramInt1 > 0))
      setDrawableWidth(paramInt3 - paramInt1);
    AppMethodBeat.o(37462);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37461);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(37461);
  }

  public final void pause()
  {
    AppMethodBeat.i(37467);
    bf(this.ien, true);
    AppMethodBeat.o(37467);
  }

  public void setEnableConfigChanged(boolean paramBoolean)
  {
    this.rcD = paramBoolean;
  }

  public void setForceScaleFullScreen(boolean paramBoolean)
  {
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(37468);
    setLoopImp(paramBoolean);
    AppMethodBeat.o(37468);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(37478);
    this.eif = paramBoolean;
    if (!this.eif);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      kA(paramBoolean);
      AppMethodBeat.o(37478);
      return;
    }
  }

  public void setOnInfoCallback(e.b paramb)
  {
  }

  public void setOnSeekCompleteCallback(e.c paramc)
  {
  }

  public void setOnSurfaceCallback(e.d paramd)
  {
  }

  public void setOneTimeVideoTextureUpdateCallback(e.e parame)
  {
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
    AppMethodBeat.i(37477);
    if (paramBoolean)
    {
      setOnDecodeDurationListener(new AdlandingVideoSightView.2(this));
      AppMethodBeat.o(37477);
    }
    while (true)
    {
      return;
      setOnDecodeDurationListener(null);
      AppMethodBeat.o(37477);
    }
  }

  public void setThumb(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37474);
    V(paramBitmap);
    AppMethodBeat.o(37474);
  }

  public void setVideoCallback(e.a parama)
  {
    this.llE = parama;
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(37465);
    if (this.llE == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
      this.duration = 0;
      this.ien = paramString;
      if (this.llE != null)
        this.llE.pL();
      AppMethodBeat.o(37465);
      return;
    }
  }

  public final boolean start()
  {
    AppMethodBeat.i(37472);
    boolean bool = w(getContext(), false);
    AppMethodBeat.o(37472);
    return bool;
  }

  public final void stop()
  {
    AppMethodBeat.i(37466);
    this.rcz.clear();
    AppMethodBeat.o(37466);
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(37473);
    if (this.ien == null)
    {
      ab.e("MicroMsg.VideoSightView", "start::use path is null!");
      AppMethodBeat.o(37473);
      paramBoolean = bool2;
    }
    while (true)
    {
      return paramBoolean;
      if ((bo.bc(q.etn.esB, "").equals("other")) || (!com.tencent.mm.plugin.sight.decode.a.b.WS(this.ien)))
      {
        ab.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", new Object[] { this.ien, Boolean.valueOf(this.rcC) });
        if ((this.rcC) && (!paramBoolean))
        {
          AppMethodBeat.o(37473);
          paramBoolean = bool2;
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          com.tencent.mm.sdk.platformtools.k.a(paramContext, localIntent, com.tencent.mm.vfs.e.asY(this.ien), "video/*");
          try
          {
            paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(2131299761)));
            this.rcC = true;
            AppMethodBeat.o(37473);
            paramBoolean = bool2;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
              h.bQ(paramContext, paramContext.getResources().getString(2131304254));
            }
          }
        }
      }
      else
      {
        bf(this.ien, false);
        paramBoolean = bool1;
        if (!this.eif)
          paramBoolean = true;
        kA(paramBoolean);
        AppMethodBeat.o(37473);
        paramBoolean = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView
 * JD-Core Version:    0.6.2
 */