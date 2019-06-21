package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

@TargetApi(14)
public class SightVideoTextureView extends SightCameraView
{
  private MediaPlayer ieC;
  private String ien;
  private boolean mMute;
  private TextureView qBN;
  private SurfaceTexture qBO;
  private Surface qBP;
  private boolean qBQ;

  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25124);
    this.qBN = null;
    this.qBO = null;
    this.qBP = null;
    this.qBN = ((TextureView)findViewById(2131827545));
    this.qBN.setSurfaceTextureListener(new SightVideoTextureView.1(this));
    AppMethodBeat.o(25124);
  }

  public final void bg(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(25126);
    ab.i("MicroMsg.SightVideoTextureView", "start play video, path %s, mute %B, wantPlay %B", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(this.qBQ) });
    this.ien = paramString;
    this.mMute = paramBoolean;
    if (this.qBO == null)
    {
      ab.w("MicroMsg.SightVideoTextureView", "play video fail, texture is null");
      this.qBQ = true;
      AppMethodBeat.o(25126);
    }
    while (true)
    {
      return;
      this.qBQ = false;
      aw.RS().aa(new SightVideoTextureView.2(this, paramString, paramBoolean));
      AppMethodBeat.o(25126);
    }
  }

  public final void clS()
  {
    AppMethodBeat.i(25128);
    ab.i("MicroMsg.SightVideoTextureView", "stop play video, wantPlay %B", new Object[] { Boolean.valueOf(this.qBQ) });
    if ((this.ieC == null) && (!this.qBQ))
    {
      ab.w("MicroMsg.SightVideoTextureView", "mediaplayer is null, do nothing when stop play video");
      AppMethodBeat.o(25128);
    }
    while (true)
    {
      return;
      aw.RS().aa(new SightVideoTextureView.3(this));
      AppMethodBeat.o(25128);
    }
  }

  protected Surface getPreviewSurface()
  {
    AppMethodBeat.i(25131);
    Surface localSurface;
    if (this.qBO != null)
    {
      localSurface = new Surface(this.qBO);
      AppMethodBeat.o(25131);
    }
    while (true)
    {
      return localSurface;
      localSurface = null;
      AppMethodBeat.o(25131);
    }
  }

  protected int getSurfaceHeight()
  {
    AppMethodBeat.i(25130);
    int i;
    if (this.qBN != null)
    {
      i = this.qBN.getHeight();
      AppMethodBeat.o(25130);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(25130);
    }
  }

  protected int getSurfaceWidth()
  {
    AppMethodBeat.i(25129);
    int i;
    if (this.qBN != null)
    {
      i = this.qBN.getWidth();
      AppMethodBeat.o(25129);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(25129);
    }
  }

  public final boolean isPlaying()
  {
    boolean bool1 = false;
    AppMethodBeat.i(25127);
    try
    {
      if (this.ieC == null)
        AppMethodBeat.o(25127);
      while (true)
      {
        return bool1;
        boolean bool2 = this.ieC.isPlaying();
        bool1 = bool2;
        AppMethodBeat.o(25127);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SightVideoTextureView", localException, "", new Object[0]);
        AppMethodBeat.o(25127);
      }
    }
  }

  public void setFixPreviewRate(float paramFloat)
  {
    AppMethodBeat.i(25132);
    ViewGroup.LayoutParams localLayoutParams = this.qBN.getLayoutParams();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    ab.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate [%f], dm[%d, %d]", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(localDisplayMetrics.widthPixels), Integer.valueOf(localDisplayMetrics.heightPixels) });
    localLayoutParams.width = localDisplayMetrics.widthPixels;
    localLayoutParams.height = ((int)(localDisplayMetrics.widthPixels / paramFloat));
    ab.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate width:%d, height:%d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
    this.qBN.setLayoutParams(localLayoutParams);
    super.setPreviewRate(paramFloat);
    AppMethodBeat.o(25132);
  }

  protected void setIsMute(boolean paramBoolean)
  {
    AppMethodBeat.i(25125);
    if (this.ieC == null)
      AppMethodBeat.o(25125);
    while (true)
    {
      return;
      try
      {
        boolean bool = this.ieC.isPlaying();
        if (bool)
          break label76;
        AppMethodBeat.o(25125);
      }
      catch (Exception localException1)
      {
        ab.w("MicroMsg.SightVideoTextureView", "setIsMute %B, check MediaPlayer playing Fail: %s", new Object[] { Boolean.valueOf(paramBoolean), localException1.getMessage() });
        AppMethodBeat.o(25125);
      }
      continue;
      label76: if (paramBoolean)
      {
        try
        {
          this.ieC.setVolume(0.0F, 0.0F);
          AppMethodBeat.o(25125);
        }
        catch (Exception localException2)
        {
          ab.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 0, 0 Fail: %s", new Object[] { localException2.getMessage() });
          AppMethodBeat.o(25125);
        }
      }
      else
      {
        clU();
        try
        {
          this.ieC.setVolume(1.0F, 1.0F);
          AppMethodBeat.o(25125);
        }
        catch (Exception localException3)
        {
          ab.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 1, 1 Fail: %s", new Object[] { localException3.getMessage() });
          AppMethodBeat.o(25125);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView
 * JD-Core Version:    0.6.2
 */