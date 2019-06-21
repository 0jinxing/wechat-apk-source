package com.tencent.mm.plugin.music.f;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends com.tencent.mm.plugin.music.f.a.b
{
  MediaPlayer gaq;
  b.a oNw;
  boolean ovl;

  public b()
  {
    AppMethodBeat.i(137553);
    this.ovl = true;
    com.tencent.mm.plugin.music.e.b localb = (com.tencent.mm.plugin.music.e.b)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.b.class);
    if (localb != null)
      this.gaq = localb.bTR();
    while (true)
    {
      if (this.gaq == null)
        this.gaq = new MediaPlayer();
      this.gaq.setAudioStreamType(3);
      this.gaq.setOnCompletionListener(new b.1(this));
      this.gaq.setOnSeekCompleteListener(new b.2(this));
      this.gaq.setOnPreparedListener(new b.3(this));
      this.gaq.setOnErrorListener(new b.4(this));
      AppMethodBeat.o(137553);
      return;
      ab.e("MicroMsg.Music.MMMediaPlayer", "mediaResService is null");
    }
  }

  public final void Tr(String paramString)
  {
    AppMethodBeat.i(137555);
    ab.i("MicroMsg.Music.MMMediaPlayer", "setSourcePath, sourcePath:%s", new Object[] { paramString });
    try
    {
      this.gaq.setDataSource(paramString);
      AppMethodBeat.o(137555);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", paramString, "setSourcePath", new Object[0]);
        AppMethodBeat.o(137555);
      }
    }
  }

  public final int bUA()
  {
    int i = 0;
    AppMethodBeat.i(137556);
    try
    {
      int j = this.gaq.getCurrentPosition();
      i = j;
      AppMethodBeat.o(137556);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "getCurrentPos", new Object[0]);
        AppMethodBeat.o(137556);
      }
    }
  }

  public final String bUB()
  {
    return null;
  }

  public final boolean bUz()
  {
    if (!this.ovl);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int getDuration()
  {
    int i = 0;
    AppMethodBeat.i(137557);
    try
    {
      int j = this.gaq.getDuration();
      i = j;
      AppMethodBeat.o(137557);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "getDuration", new Object[0]);
        AppMethodBeat.o(137557);
      }
    }
  }

  public final boolean isPlaying()
  {
    boolean bool1 = false;
    AppMethodBeat.i(137554);
    try
    {
      boolean bool2 = this.gaq.isPlaying();
      bool1 = bool2;
      AppMethodBeat.o(137554);
      return bool1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "setSourcePath", new Object[0]);
        AppMethodBeat.o(137554);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137560);
    ab.i("MicroMsg.Music.MMMediaPlayer", "pause");
    if (!bUz())
      AppMethodBeat.o(137560);
    while (true)
    {
      return;
      this.gaq.pause();
      AppMethodBeat.o(137560);
    }
  }

  public final void play()
  {
    AppMethodBeat.i(137558);
    ab.i("MicroMsg.Music.MMMediaPlayer", "play");
    if (bUz());
    while (true)
    {
      try
      {
        if (!this.gaq.isPlaying())
        {
          this.gaq.start();
          AppMethodBeat.o(137558);
          return;
        }
        AppMethodBeat.o(137558);
        continue;
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException1, "start", new Object[0]);
        AppMethodBeat.o(137558);
        continue;
      }
      try
      {
        this.gaq.prepareAsync();
        AppMethodBeat.o(137558);
      }
      catch (Exception localException2)
      {
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException2, "prepareAsync", new Object[0]);
        AppMethodBeat.o(137558);
      }
    }
  }

  public final void seek(long paramLong)
  {
    AppMethodBeat.i(137561);
    ab.i("MicroMsg.Music.MMMediaPlayer", "seek %d", new Object[] { Long.valueOf(paramLong) });
    this.gaq.seekTo((int)paramLong);
    AppMethodBeat.o(137561);
  }

  public final void stop()
  {
    AppMethodBeat.i(137559);
    ab.i("MicroMsg.Music.MMMediaPlayer", "stop");
    this.ovl = true;
    try
    {
      if (this.gaq != null)
      {
        this.gaq.stop();
        this.gaq.release();
      }
      if (this.oNw != null)
      {
        this.oNw.isStop = true;
        this.oNw = null;
      }
      jz(false);
      AppMethodBeat.o(137559);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "stop", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.b
 * JD-Core Version:    0.6.2
 */