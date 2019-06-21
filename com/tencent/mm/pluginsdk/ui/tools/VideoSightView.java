package com.tencent.mm.pluginsdk.ui.tools;

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
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.3;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class VideoSightView extends SightPlayImageView
  implements e
{
  protected int duration;
  private boolean eif;
  protected String ien;
  private boolean rcC;
  private boolean rcD;

  public VideoSightView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(70419);
    this.duration = 0;
    this.rcD = true;
    this.eif = false;
    init();
    AppMethodBeat.o(70419);
  }

  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(70418);
    this.duration = 0;
    this.rcD = true;
    this.eif = false;
    init();
    AppMethodBeat.o(70418);
  }

  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(70417);
    this.duration = 0;
    this.rcD = true;
    this.eif = false;
    init();
    AppMethodBeat.o(70417);
  }

  public void B(double paramDouble)
  {
    AppMethodBeat.i(70436);
    if (this.qyA != null)
    {
      b localb = this.qyA;
      ab.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bo.dpG().toString() });
      o.i(new b.3(localb, paramDouble), 0L);
    }
    AppMethodBeat.o(70436);
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(70439);
    B(paramDouble);
    AppMethodBeat.o(70439);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(70429);
    ab.v("MicroMsg.VideoSightView", "get current position");
    AppMethodBeat.o(70429);
    return 0;
  }

  public int getDuration()
  {
    AppMethodBeat.i(70430);
    int i = super.getDuration();
    ab.v("MicroMsg.VideoSightView", "get duration ".concat(String.valueOf(i)));
    AppMethodBeat.o(70430);
    return i;
  }

  public double getLastProgresstime()
  {
    AppMethodBeat.i(70435);
    b localb;
    double d;
    if (getController() != null)
    {
      localb = getController();
      if (localb.qxP != -1.0D)
      {
        d = localb.qxP;
        AppMethodBeat.o(70435);
      }
    }
    while (true)
    {
      return d;
      d = localb.qxM;
      AppMethodBeat.o(70435);
      continue;
      d = 0.0D;
      AppMethodBeat.o(70435);
    }
  }

  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }

  protected void init()
  {
    AppMethodBeat.i(70420);
    if (bo.bc(q.etn.esB, "").equals("other"))
      ab.i("MicroMsg.VideoSightView", "init::use other player");
    while (true)
    {
      setOnCompletionListener(new VideoSightView.1(this));
      AppMethodBeat.o(70420);
      return;
      kA(true);
    }
  }

  public boolean isPlaying()
  {
    AppMethodBeat.i(70424);
    boolean bool = this.qyA.cla();
    AppMethodBeat.o(70424);
    return bool;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(70423);
    super.onConfigurationChanged(paramConfiguration);
    if (this.rcD)
      setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
    AppMethodBeat.o(70423);
  }

  public final void onDetach()
  {
    AppMethodBeat.i(70431);
    a.xxA.d(this.qyA.cld());
    AppMethodBeat.o(70431);
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(70422);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ab.v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.qyG) });
    if ((this.qyG) && (paramInt3 - paramInt1 > 0))
      setDrawableWidth(paramInt3 - paramInt1);
    AppMethodBeat.o(70422);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70421);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(70421);
  }

  public void pause()
  {
    AppMethodBeat.i(70427);
    bf(this.ien, true);
    AppMethodBeat.o(70427);
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
    AppMethodBeat.i(70428);
    setLoopImp(paramBoolean);
    AppMethodBeat.o(70428);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(70438);
    this.eif = paramBoolean;
    if (!this.eif);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      kA(paramBoolean);
      AppMethodBeat.o(70438);
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
    AppMethodBeat.i(70437);
    if (paramBoolean)
    {
      setOnDecodeDurationListener(new b.f()
      {
        public final void b(b paramAnonymousb, long paramAnonymousLong)
        {
          AppMethodBeat.i(70416);
          if (VideoSightView.this.duration == 0)
            VideoSightView.this.duration = VideoSightView.this.getDuration();
          if (VideoSightView.this.llE != null)
          {
            ab.v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(VideoSightView.this.duration) });
            VideoSightView.this.llE.dG((int)paramAnonymousLong, VideoSightView.this.duration);
          }
          AppMethodBeat.o(70416);
        }
      });
      AppMethodBeat.o(70437);
    }
    while (true)
    {
      return;
      setOnDecodeDurationListener(null);
      AppMethodBeat.o(70437);
    }
  }

  public void setThumb(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70434);
    V(paramBitmap);
    AppMethodBeat.o(70434);
  }

  public void setVideoCallback(e.a parama)
  {
    this.llE = parama;
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(70425);
    if (this.llE == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
      this.duration = 0;
      this.ien = paramString;
      if (this.llE != null)
        this.llE.pL();
      AppMethodBeat.o(70425);
      return;
    }
  }

  public boolean start()
  {
    AppMethodBeat.i(70432);
    boolean bool = w(getContext(), false);
    AppMethodBeat.o(70432);
    return bool;
  }

  public void stop()
  {
    AppMethodBeat.i(70426);
    this.qyA.clear();
    AppMethodBeat.o(70426);
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(70433);
    if (this.ien == null)
    {
      ab.e("MicroMsg.VideoSightView", "start::use path is null!");
      AppMethodBeat.o(70433);
      paramBoolean = bool2;
    }
    while (true)
    {
      return paramBoolean;
      if ((bo.bc(q.etn.esB, "").equals("other")) || (!b.WS(this.ien)))
      {
        ab.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", new Object[] { this.ien, Boolean.valueOf(this.rcC) });
        if ((this.rcC) && (!paramBoolean))
        {
          AppMethodBeat.o(70433);
          paramBoolean = bool2;
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          com.tencent.mm.sdk.platformtools.k.a(paramContext, localIntent, new File(this.ien), "video/*");
          try
          {
            paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(2131297077)));
            this.rcC = true;
            AppMethodBeat.o(70433);
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
        AppMethodBeat.o(70433);
        paramBoolean = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSightView
 * JD-Core Version:    0.6.2
 */