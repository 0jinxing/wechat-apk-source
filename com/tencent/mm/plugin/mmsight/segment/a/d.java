package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;

public final class d
  implements a
{
  private MediaPlayer gaq;

  public d()
  {
    AppMethodBeat.i(3749);
    this.gaq = new k();
    AppMethodBeat.o(3749);
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(3766);
    if (parama == null)
    {
      this.gaq.setOnErrorListener(null);
      AppMethodBeat.o(3766);
    }
    while (true)
    {
      return;
      this.gaq.setOnErrorListener(new d.4(this, parama));
      AppMethodBeat.o(3766);
    }
  }

  public final void a(a.b paramb)
  {
    AppMethodBeat.i(3763);
    if (paramb == null)
    {
      this.gaq.setOnPreparedListener(null);
      AppMethodBeat.o(3763);
    }
    while (true)
    {
      return;
      this.gaq.setOnPreparedListener(new d.1(this, paramb));
      AppMethodBeat.o(3763);
    }
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(3764);
    if (paramc == null)
    {
      this.gaq.setOnSeekCompleteListener(null);
      AppMethodBeat.o(3764);
    }
    while (true)
    {
      return;
      this.gaq.setOnSeekCompleteListener(new d.2(this, paramc));
      AppMethodBeat.o(3764);
    }
  }

  public final void a(a.d paramd)
  {
    AppMethodBeat.i(3765);
    if (paramd == null)
    {
      this.gaq.setOnVideoSizeChangedListener(null);
      AppMethodBeat.o(3765);
    }
    while (true)
    {
      return;
      this.gaq.setOnVideoSizeChangedListener(new d.3(this, paramd));
      AppMethodBeat.o(3765);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(3758);
    int i = this.gaq.getCurrentPosition();
    AppMethodBeat.o(3758);
    return i;
  }

  public final int getDuration()
  {
    AppMethodBeat.i(3759);
    int i = this.gaq.getDuration();
    AppMethodBeat.o(3759);
    return i;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(3756);
    boolean bool = this.gaq.isPlaying();
    AppMethodBeat.o(3756);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(3755);
    this.gaq.pause();
    AppMethodBeat.o(3755);
  }

  public final void prepareAsync()
  {
    AppMethodBeat.i(3752);
    this.gaq.prepareAsync();
    AppMethodBeat.o(3752);
  }

  public final void release()
  {
    AppMethodBeat.i(3760);
    this.gaq.release();
    AppMethodBeat.o(3760);
  }

  public final void seekTo(int paramInt)
  {
    AppMethodBeat.i(3757);
    this.gaq.seekTo(paramInt);
    AppMethodBeat.o(3757);
  }

  public final void setAudioStreamType(int paramInt)
  {
    AppMethodBeat.i(3761);
    this.gaq.setAudioStreamType(paramInt);
    AppMethodBeat.o(3761);
  }

  public final void setDataSource(String paramString)
  {
    AppMethodBeat.i(3751);
    this.gaq.setDataSource(paramString);
    AppMethodBeat.o(3751);
  }

  public final void setLoop(int paramInt1, int paramInt2)
  {
  }

  public final void setLooping(boolean paramBoolean)
  {
    AppMethodBeat.i(3762);
    this.gaq.setLooping(paramBoolean);
    AppMethodBeat.o(3762);
  }

  public final void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(3750);
    this.gaq.setSurface(paramSurface);
    AppMethodBeat.o(3750);
  }

  public final void start()
  {
    AppMethodBeat.i(3753);
    this.gaq.start();
    AppMethodBeat.o(3753);
  }

  public final void stop()
  {
    AppMethodBeat.i(3754);
    this.gaq.stop();
    AppMethodBeat.o(3754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.d
 * JD-Core Version:    0.6.2
 */