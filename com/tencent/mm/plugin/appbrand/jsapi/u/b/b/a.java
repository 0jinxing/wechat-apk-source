package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.PlaybackParams;
import android.os.Build.VERSION;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends b
{
  int ieB;
  MediaPlayer ieC;
  private MediaPlayer.OnPreparedListener ieD;
  private MediaPlayer.OnVideoSizeChangedListener ieE;
  private MediaPlayer.OnCompletionListener ieF;
  private MediaPlayer.OnInfoListener ieG;
  private MediaPlayer.OnSeekCompleteListener ieH;
  private MediaPlayer.OnErrorListener ieI;
  private MediaPlayer.OnBufferingUpdateListener ieJ;
  boolean ief;

  public a()
  {
    AppMethodBeat.i(117433);
    this.ieD = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        AppMethodBeat.i(117426);
        a.this.mCurrentState = 2;
        if (a.this.ieN != null)
          a.this.ieN.onPrepared(a.this.ieC);
        int i = a.this.ieB;
        if (i != 0)
        {
          a.this.seekTo(i);
          a.this.ieB = 0;
        }
        if (a.this.ief)
          a.this.start();
        AppMethodBeat.o(117426);
      }
    };
    this.ieE = new a.2(this);
    this.ieF = new a.3(this);
    this.ieG = new a.4(this);
    this.ieH = new a.5(this);
    this.ieI = new a.6(this);
    this.ieJ = new a.7(this);
    this.ieC = new k();
    AppMethodBeat.o(117433);
  }

  private boolean aGO()
  {
    if (this.ieC != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void aGP()
  {
    AppMethodBeat.i(117452);
    if (this.ieC == null)
      AppMethodBeat.o(117452);
    while (true)
    {
      return;
      this.ieC.setOnInfoListener(null);
      this.ieC.setOnErrorListener(null);
      this.ieC.setOnPreparedListener(null);
      this.ieC.setOnCompletionListener(null);
      this.ieC.setOnSeekCompleteListener(null);
      this.ieC.setOnBufferingUpdateListener(null);
      this.ieC.setOnVideoSizeChangedListener(null);
      AppMethodBeat.o(117452);
    }
  }

  private void oN(int paramInt)
  {
    AppMethodBeat.i(117453);
    if (this.ieI != null)
      this.ieI.onError(this.ieC, -1024, paramInt);
    AppMethodBeat.o(117453);
  }

  private void setVolume(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(117436);
    try
    {
      if (aGO())
        this.ieC.setVolume(paramFloat1, paramFloat2);
      AppMethodBeat.o(117436);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setVolume fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-13);
        AppMethodBeat.o(117436);
      }
    }
  }

  public final boolean at(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(117437);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(117437);
    while (true)
    {
      return bool;
      try
      {
        if ((aGO()) && (Build.VERSION.SDK_INT >= 23))
        {
          PlaybackParams localPlaybackParams = this.ieC.getPlaybackParams();
          localPlaybackParams.setSpeed(paramFloat);
          if (!this.ieC.isPlaying())
          {
            this.ieC.setPlaybackParams(localPlaybackParams);
            this.ieC.pause();
          }
          while (true)
          {
            AppMethodBeat.o(117437);
            bool = true;
            break;
            this.ieC.setPlaybackParams(localPlaybackParams);
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setSpeed fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-14);
      }
    }
    while (true)
    {
      AppMethodBeat.o(117437);
      break;
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setSpeed, current system(%d) not support play speed setting", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(Build.VERSION.SDK_INT) });
    }
  }

  public final void eu(boolean paramBoolean)
  {
    this.ief = paramBoolean;
  }

  public final int getCurrentPosition()
  {
    int i = 0;
    AppMethodBeat.i(117441);
    try
    {
      if ((aGO()) && ((this.mCurrentState == 2) || (this.mCurrentState == 3) || (this.mCurrentState == 4) || (this.mCurrentState == 6)))
      {
        j = this.ieC.getCurrentPosition();
        AppMethodBeat.o(117441);
        return j;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s getCurrentPosition fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-15);
        AppMethodBeat.o(117441);
        int j = i;
      }
    }
  }

  public final int getDuration()
  {
    int i = 0;
    AppMethodBeat.i(117442);
    try
    {
      if ((aGO()) && (this.mCurrentState != -1) && (this.mCurrentState != 1) && (this.mCurrentState != 0))
      {
        int j = this.ieC.getDuration();
        i = j;
        AppMethodBeat.o(117442);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s getDuration fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-16);
        AppMethodBeat.o(117442);
      }
    }
  }

  public final int getVideoHeight()
  {
    int i = 0;
    AppMethodBeat.i(117444);
    try
    {
      if (aGO())
      {
        j = this.ieC.getVideoHeight();
        AppMethodBeat.o(117444);
        return j;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s getVideoHeight fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-18);
        AppMethodBeat.o(117444);
        int j = i;
      }
    }
  }

  public final int getVideoWidth()
  {
    int i = 0;
    AppMethodBeat.i(117443);
    try
    {
      if (aGO())
      {
        int j = this.ieC.getVideoWidth();
        i = j;
        AppMethodBeat.o(117443);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s getVideoWidth fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-17);
        AppMethodBeat.o(117443);
      }
    }
  }

  public final boolean isPlaying()
  {
    boolean bool1 = false;
    AppMethodBeat.i(117440);
    try
    {
      if ((aGO()) && (this.mCurrentState != -1))
      {
        bool2 = this.ieC.isPlaying();
        AppMethodBeat.o(117440);
        return bool2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s isPlaying fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-9);
        AppMethodBeat.o(117440);
        boolean bool2 = bool1;
      }
    }
  }

  public final void oM(int paramInt)
  {
    if (paramInt <= 0);
    while (true)
    {
      return;
      this.ieB = paramInt;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(117447);
    try
    {
      if (aGO())
      {
        this.ieC.pause();
        this.mCurrentState = 4;
      }
      AppMethodBeat.o(117447);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s pause fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-2);
        AppMethodBeat.o(117447);
      }
    }
  }

  public final void prepareAsync()
  {
    AppMethodBeat.i(117445);
    try
    {
      if (aGO())
        this.ieC.prepareAsync();
      AppMethodBeat.o(117445);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s prepareAsync fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-6);
        AppMethodBeat.o(117445);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(117451);
    try
    {
      if (aGO())
      {
        aGP();
        this.ieC.release();
        this.mCurrentState = -2;
      }
      AppMethodBeat.o(117451);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s release fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-8);
        AppMethodBeat.o(117451);
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(117450);
    try
    {
      if (aGO())
      {
        this.ieC.reset();
        this.mCurrentState = 0;
      }
      AppMethodBeat.o(117450);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s reset fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-7);
        AppMethodBeat.o(117450);
      }
    }
  }

  public final void seekTo(int paramInt)
  {
    AppMethodBeat.i(117448);
    try
    {
      if ((aGO()) && ((this.mCurrentState == 2) || (this.mCurrentState == 3) || (this.mCurrentState == 4) || (this.mCurrentState == 6)))
        this.ieC.seekTo(paramInt);
      AppMethodBeat.o(117448);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s seekTo fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-3);
        AppMethodBeat.o(117448);
      }
    }
  }

  public final void setDataSource(String paramString)
  {
    AppMethodBeat.i(117434);
    try
    {
      if (this.ieC == null)
      {
        k localk = new com/tencent/mm/compatible/b/k;
        localk.<init>();
        this.ieC = localk;
      }
      while (true)
      {
        this.ieC.setScreenOnWhilePlaying(true);
        this.ieC.setAudioStreamType(3);
        this.ieC.setOnInfoListener(this.ieG);
        this.ieC.setOnErrorListener(this.ieI);
        this.ieC.setOnPreparedListener(this.ieD);
        this.ieC.setOnCompletionListener(this.ieF);
        this.ieC.setOnSeekCompleteListener(this.ieH);
        this.ieC.setOnVideoSizeChangedListener(this.ieE);
        this.ieC.setOnBufferingUpdateListener(this.ieJ);
        if (aGO())
        {
          this.ieC.setDataSource(paramString);
          this.mCurrentState = 1;
        }
        AppMethodBeat.o(117434);
        return;
        stop();
        reset();
        aGP();
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setDataSource fail", new Object[] { Integer.valueOf(hashCode()), paramString });
        oN(-11);
        AppMethodBeat.o(117434);
      }
    }
  }

  public final void setLooping(boolean paramBoolean)
  {
    AppMethodBeat.i(117439);
    try
    {
      if (aGO())
        this.ieC.setLooping(paramBoolean);
      AppMethodBeat.o(117439);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setLooping fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-10);
        AppMethodBeat.o(117439);
      }
    }
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(117438);
    if (aGO())
      if (paramBoolean)
      {
        setVolume(0.0F, 0.0F);
        AppMethodBeat.o(117438);
      }
    while (true)
    {
      return;
      setVolume(1.0F, 1.0F);
      AppMethodBeat.o(117438);
    }
  }

  public final void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(117435);
    try
    {
      if (aGO())
        this.ieC.setSurface(paramSurface);
      AppMethodBeat.o(117435);
      return;
    }
    catch (Exception paramSurface)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s setSurface fail", new Object[] { Integer.valueOf(hashCode()), paramSurface });
        oN(-12);
        AppMethodBeat.o(117435);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(117446);
    try
    {
      if ((aGO()) && ((this.mCurrentState == 2) || (this.mCurrentState == 4) || (this.mCurrentState == 6)))
      {
        this.ieC.start();
        this.mCurrentState = 3;
      }
      AppMethodBeat.o(117446);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s start fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-1);
        AppMethodBeat.o(117446);
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(117449);
    try
    {
      if ((aGO()) && ((this.mCurrentState == 2) || (this.mCurrentState == 3) || (this.mCurrentState == 4) || (this.mCurrentState == 6)))
      {
        this.ieC.stop();
        this.mCurrentState = 5;
      }
      AppMethodBeat.o(117449);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMediaPlayer", "%s stop fail", new Object[] { Integer.valueOf(hashCode()), localException });
        oN(-4);
        AppMethodBeat.o(117449);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a
 * JD-Core Version:    0.6.2
 */