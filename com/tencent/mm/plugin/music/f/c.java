package com.tencent.mm.plugin.music.f;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.f.a.g;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

@TargetApi(16)
public final class c extends com.tencent.mm.plugin.music.f.a.b
{
  AudioTrack aQf;
  MediaCodec bek;
  int channels;
  int clN;
  String clO;
  MediaExtractor clX;
  String clY;
  long duration;
  private Runnable oNy;
  private boolean ovl;
  long presentationTimeUs;
  int sampleRate;

  public c()
  {
    AppMethodBeat.i(137563);
    this.ovl = true;
    this.clY = null;
    this.sampleRate = 0;
    this.channels = 0;
    this.presentationTimeUs = 0L;
    this.duration = 0L;
    this.clN = 0;
    this.oNy = new c.1(this);
    AppMethodBeat.o(137563);
  }

  private void Eq()
  {
    try
    {
      AppMethodBeat.i(137566);
      ab.i("MicroMsg.Music.MMPlayer", "sync notify");
      try
      {
        notify();
        AppMethodBeat.o(137566);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Music.MMPlayer", localException, "syncNotify", new Object[0]);
          AppMethodBeat.o(137566);
        }
      }
    }
    finally
    {
    }
  }

  public final void Tr(String paramString)
  {
    this.clO = paramString;
  }

  public final int bUA()
  {
    return (int)(this.presentationTimeUs / 1000L);
  }

  public final String bUB()
  {
    return this.clY;
  }

  public final void bUC()
  {
    try
    {
      AppMethodBeat.i(137570);
      while (bUz())
      {
        boolean bool = this.oNR.bUH();
        if (!bool)
          break;
        try
        {
          ab.i("MicroMsg.Music.MMPlayer", "wait play");
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.printErrStackTrace("MicroMsg.Music.MMPlayer", localInterruptedException, "waitPlay", new Object[0]);
        }
      }
    }
    finally
    {
    }
    AppMethodBeat.o(137570);
  }

  public final boolean bUz()
  {
    if (!this.ovl);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean createAudioTrack()
  {
    boolean bool = true;
    AppMethodBeat.i(137564);
    ab.i("MicroMsg.Music.MMPlayer", "createAudioTrack");
    int i;
    if (this.channels == 1)
      i = 4;
    while (true)
    {
      int j = AudioTrack.getMinBufferSize(this.sampleRate, i, 2);
      com.tencent.mm.plugin.music.e.b localb = (com.tencent.mm.plugin.music.e.b)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.b.class);
      if (localb != null)
      {
        this.aQf = localb.ac(this.sampleRate, i, j);
        label66: if (this.aQf == null)
        {
          ab.e("MicroMsg.Music.MMPlayer", "audioTrack is null, new AudioTrack");
          this.aQf = new AudioTrack(3, this.sampleRate, i, 2, j, 1);
        }
        if ((this.aQf != null) && (this.aQf.getState() == 1))
          break label164;
        ab.e("MicroMsg.Music.MMPlayer", "audio track not initialized");
        if (this.aQf == null);
      }
      try
      {
        this.aQf.release();
        label139: bool = false;
        AppMethodBeat.o(137564);
        while (true)
        {
          return bool;
          i = 12;
          break;
          ab.e("MicroMsg.Music.MMPlayer", "mediaResService null");
          break label66;
          label164: AppMethodBeat.o(137564);
        }
      }
      catch (Exception localException)
      {
        break label139;
      }
    }
  }

  public final int getDuration()
  {
    return (int)(this.duration / 1000L);
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(137571);
    boolean bool = this.oNR.isPlaying();
    AppMethodBeat.o(137571);
    return bool;
  }

  public final void jy(boolean paramBoolean)
  {
    AppMethodBeat.i(137572);
    this.oNR.oNV = 4;
    this.ovl = true;
    super.jy(paramBoolean);
    AppMethodBeat.o(137572);
  }

  public final void jz(boolean paramBoolean)
  {
    AppMethodBeat.i(137573);
    this.oNR.oNV = 4;
    this.ovl = true;
    super.jz(paramBoolean);
    AppMethodBeat.o(137573);
  }

  public final void pause()
  {
    AppMethodBeat.i(137568);
    ab.i("MicroMsg.Music.MMPlayer", "pause");
    if (!bUz())
      AppMethodBeat.o(137568);
    while (true)
    {
      return;
      this.oNR.oNV = 2;
      AppMethodBeat.o(137568);
    }
  }

  public final void play()
  {
    AppMethodBeat.i(137565);
    ab.i("MicroMsg.Music.MMPlayer", "play");
    if (!bUz())
    {
      this.ovl = false;
      d.post(this.oNy, "music_player");
      AppMethodBeat.o(137565);
    }
    while (true)
    {
      return;
      if ((bUz()) && (this.oNR.bUH()))
      {
        this.oNR.oNV = 3;
        Eq();
      }
      AppMethodBeat.o(137565);
    }
  }

  public final void seek(long paramLong)
  {
    AppMethodBeat.i(137569);
    this.clX.seekTo(1000L * paramLong, 2);
    AppMethodBeat.o(137569);
  }

  public final void stop()
  {
    AppMethodBeat.i(137567);
    ab.i("MicroMsg.Music.MMPlayer", "stop");
    this.ovl = true;
    if (this.oNR.bUH())
      Eq();
    AppMethodBeat.o(137567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.c
 * JD-Core Version:    0.6.2
 */