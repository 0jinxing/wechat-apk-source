package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class VideoSightCenterView extends VideoSightView
{
  private boolean cFy = false;
  private int rat = 0;
  private volatile boolean vvw = false;
  private MediaMetadataRetriever vvx;

  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void dlB()
  {
    AppMethodBeat.i(70401);
    if ((getLayoutParams() instanceof RelativeLayout.LayoutParams))
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      localLayoutParams.addRule(13);
      setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(70401);
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(70410);
    ab.v("MicroMsg.VideoSightCenterView", "seekTo, time: %s, isStart: %s, currentPosition: %s, getLastProgresstime: %s", new Object[] { Double.valueOf(paramDouble), Boolean.valueOf(this.cFy), Integer.valueOf(this.rat), Double.valueOf(getLastProgresstime()) });
    if ((this.cFy) && (getLastProgresstime() > 0.0D))
      super.B(paramDouble / 1000.0D);
    AppMethodBeat.o(70410);
  }

  public final void fi(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70400);
    super.fi(paramInt1, paramInt2);
    dlB();
    AppMethodBeat.o(70400);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(70405);
    ab.v("MicroMsg.VideoSightCenterView", "getCurrentPosition: %s", new Object[] { Integer.valueOf(this.rat) });
    int i = this.rat;
    AppMethodBeat.o(70405);
    return i;
  }

  public int getDuration()
  {
    AppMethodBeat.i(70404);
    ab.i("MicroMsg.VideoSightCenterView", "getDuration");
    if (!bo.isNullOrNil(this.ien));
    while (true)
    {
      try
      {
        if (this.vvx == null)
        {
          MediaMetadataRetriever localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
          localMediaMetadataRetriever.<init>();
          this.vvx = localMediaMetadataRetriever;
          this.vvx.setDataSource(this.ien);
        }
        i = Integer.valueOf(this.vvx.extractMetadata(9)).intValue();
        ab.i("MicroMsg.VideoSightCenterView", "getDuration: %s", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(70404);
        return i;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.VideoSightCenterView", "getDuration error: %s", new Object[] { localException.getMessage() });
      }
      int i = super.getDuration();
      AppMethodBeat.o(70404);
    }
  }

  public double getLastProgresstime()
  {
    AppMethodBeat.i(70409);
    double d = super.getLastProgresstime();
    AppMethodBeat.o(70409);
    return d;
  }

  protected final void init()
  {
    AppMethodBeat.i(70402);
    if (bo.bc(q.etn.esB, "").equals("other"))
      ab.i("MicroMsg.VideoSightCenterView", "init::use other player");
    while (true)
    {
      setOnCompletionListener(new VideoSightCenterView.1(this));
      AppMethodBeat.o(70402);
      return;
      kA(true);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(70411);
    ab.v("MicroMsg.VideoSightCenterView", "isPlaying, isStart: %s, currentPosition: %s", new Object[] { Boolean.valueOf(this.cFy), Integer.valueOf(this.rat) });
    boolean bool = this.cFy;
    AppMethodBeat.o(70411);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(70408);
    ab.v("MicroMsg.VideoSightCenterView", "pause");
    super.pause();
    AppMethodBeat.o(70408);
  }

  public void setDrawableWidth(int paramInt)
  {
    AppMethodBeat.i(70399);
    super.setDrawableWidth(paramInt);
    dlB();
    AppMethodBeat.o(70399);
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
    AppMethodBeat.i(70403);
    if (paramBoolean)
    {
      setOnDecodeDurationListener(new b.f()
      {
        public final void b(b paramAnonymousb, long paramAnonymousLong)
        {
          AppMethodBeat.i(70398);
          if (VideoSightCenterView.this.duration == 0)
            VideoSightCenterView.this.duration = VideoSightCenterView.this.getDuration();
          if (VideoSightCenterView.this.llE != null)
          {
            ab.v("MicroMsg.VideoSightCenterView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(VideoSightCenterView.this.duration) });
            VideoSightCenterView.a(VideoSightCenterView.this, (int)(1000L * paramAnonymousLong));
            VideoSightCenterView.this.llE.dG((int)paramAnonymousLong, VideoSightCenterView.this.duration);
          }
          AppMethodBeat.o(70398);
        }
      });
      AppMethodBeat.o(70403);
    }
    while (true)
    {
      return;
      setOnDecodeDurationListener(null);
      AppMethodBeat.o(70403);
    }
  }

  public final boolean start()
  {
    AppMethodBeat.i(70406);
    ab.v("MicroMsg.VideoSightCenterView", "start");
    this.cFy = true;
    boolean bool = super.start();
    AppMethodBeat.o(70406);
    return bool;
  }

  public final void stop()
  {
    AppMethodBeat.i(70407);
    ab.v("MicroMsg.VideoSightCenterView", "stop");
    super.stop();
    this.rat = 0;
    this.cFy = false;
    AppMethodBeat.o(70407);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView
 * JD-Core Version:    0.6.2
 */