package com.tencent.mm.plugin.mmsight.segment.a;

import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.ac.a;

public final class c
  implements a
{
  private ap fJs;
  int oAd;
  int oAe;
  private a oAk;
  private HandlerThread oAl;
  a.c oAm;
  private a.c oAn;
  private ap.a oAo;
  public c.a ozL;
  boolean released;

  public c()
  {
    AppMethodBeat.i(3726);
    this.oAl = com.tencent.mm.sdk.g.d.ek("check auto job", 10);
    this.oAm = null;
    this.oAn = new c.1(this);
    this.oAo = new c.2(this);
    int i = CaptureMMProxy.getInstance().getInt(ac.a.xPn, -1);
    if (i == 1)
    {
      ab.i("MicroMsg.SectionRepeatMediaPlayer", "used system media player");
      this.oAk = new d();
    }
    while (true)
    {
      this.oAl.start();
      this.fJs = new ap(this.oAl.getLooper(), this.oAo, true);
      AppMethodBeat.o(3726);
      return;
      if (i == 2)
      {
        ab.i("MicroMsg.SectionRepeatMediaPlayer", "used mm video player");
        this.oAk = new b();
      }
      else if (CaptureMMProxy.getInstance().checkUseMMVideoPlayer())
      {
        ab.i("MicroMsg.SectionRepeatMediaPlayer", "default used mm video player");
        this.oAk = new b();
      }
      else
      {
        ab.i("MicroMsg.SectionRepeatMediaPlayer", "default used system media player");
        this.oAk = new d();
      }
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(3742);
    this.oAk.a(parama);
    AppMethodBeat.o(3742);
  }

  public final void a(a.b paramb)
  {
    AppMethodBeat.i(3744);
    this.oAk.a(paramb);
    AppMethodBeat.o(3744);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(3733);
    this.oAk.a(paramc);
    AppMethodBeat.o(3733);
  }

  public final void a(a.d paramd)
  {
    AppMethodBeat.i(3743);
    this.oAk.a(paramd);
    AppMethodBeat.o(3743);
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(3735);
    int i = this.oAk.getCurrentPosition();
    AppMethodBeat.o(3735);
    return i;
  }

  public final int getDuration()
  {
    AppMethodBeat.i(3736);
    int i;
    if (this.oAk != null)
    {
      i = this.oAk.getDuration();
      AppMethodBeat.o(3736);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(3736);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(3738);
    boolean bool = this.oAk.isPlaying();
    AppMethodBeat.o(3738);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(3731);
    this.oAk.pause();
    this.fJs.stopTimer();
    AppMethodBeat.o(3731);
  }

  public final void prepareAsync()
  {
    AppMethodBeat.i(3740);
    this.oAk.prepareAsync();
    AppMethodBeat.o(3740);
  }

  public final void release()
  {
    AppMethodBeat.i(3729);
    this.released = true;
    this.oAk.release();
    if (this.fJs != null)
      this.fJs.stopTimer();
    if (this.oAl != null)
      this.oAl.quit();
    AppMethodBeat.o(3729);
  }

  public final void seekTo(int paramInt)
  {
    AppMethodBeat.i(3739);
    this.oAk.seekTo(paramInt);
    AppMethodBeat.o(3739);
  }

  public final void setAudioStreamType(int paramInt)
  {
    AppMethodBeat.i(3734);
    this.oAk.setAudioStreamType(paramInt);
    AppMethodBeat.o(3734);
  }

  public final void setDataSource(String paramString)
  {
    AppMethodBeat.i(3728);
    this.oAk.setDataSource(paramString);
    AppMethodBeat.o(3728);
  }

  public final void setLoop(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3727);
    this.oAd = paramInt1;
    this.oAe = paramInt2;
    if (this.oAk != null)
      this.oAk.setLoop(this.oAd, this.oAe);
    AppMethodBeat.o(3727);
  }

  public final void setLooping(boolean paramBoolean)
  {
    AppMethodBeat.i(3741);
    this.oAk.setLooping(paramBoolean);
    AppMethodBeat.o(3741);
  }

  public final void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(3737);
    this.oAk.setSurface(paramSurface);
    AppMethodBeat.o(3737);
  }

  public final void start()
  {
    AppMethodBeat.i(3730);
    this.oAk.start();
    this.fJs.ae(30L, 30L);
    AppMethodBeat.o(3730);
  }

  public final void stop()
  {
    AppMethodBeat.i(3732);
    this.oAk.stop();
    this.fJs.stopTimer();
    AppMethodBeat.o(3732);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.c
 * JD-Core Version:    0.6.2
 */