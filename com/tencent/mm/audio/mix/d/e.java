package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.c.g;
import com.tencent.mm.audio.mix.f.a.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends d
{
  private Object cli;
  private a cmd;

  public e(com.tencent.mm.audio.mix.f.d paramd, com.tencent.mm.audio.mix.g.b paramb)
  {
    super(paramd, paramb);
    AppMethodBeat.i(137062);
    this.cli = new Object();
    AppMethodBeat.o(137062);
  }

  protected final void DJ()
  {
    AppMethodBeat.i(137067);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playBefore");
    super.DJ();
    if (this.cmd != null)
      this.cmd.reset();
    AppMethodBeat.o(137067);
  }

  protected final void DK()
  {
    AppMethodBeat.i(137069);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playAfter");
    super.DK();
    if (this.cmd != null)
    {
      this.cmd.Eu();
      if ((this.cmd instanceof com.tencent.mm.audio.mix.f.a.b))
        do
        {
          boolean bool = this.clS.get();
          DD();
          if (this.clT.get())
            break;
          if (bool)
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "need resume if not stop");
            this.cmd.resume();
          }
        }
        while ((!this.clT.get()) && (this.clS.get()));
    }
    AppMethodBeat.o(137069);
  }

  public final void DL()
  {
    AppMethodBeat.i(137072);
    synchronized (this.cli)
    {
      if (this.cmd != null)
        this.cmd.DL();
      AppMethodBeat.o(137072);
      return;
    }
  }

  public final void Dx()
  {
    AppMethodBeat.i(137065);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "pauseOnBackground");
    gy(5);
    this.clT.set(true);
    this.clV.set(false);
    DE();
    AppMethodBeat.o(137065);
  }

  public final void Dy()
  {
  }

  protected final void a(com.tencent.mm.audio.mix.a.c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(137070);
    b(paramc, paramByteBuffer, paramInt);
    AppMethodBeat.o(137070);
  }

  protected final void b(com.tencent.mm.audio.mix.a.c paramc)
  {
    AppMethodBeat.i(137071);
    if (this.clM != null)
      this.clM.Ds();
    c(paramc);
    paramc.complete();
    AppMethodBeat.o(137071);
  }

  protected final void c(com.tencent.mm.audio.mix.a.d paramd)
  {
    AppMethodBeat.i(137068);
    byte[] arrayOfByte;
    com.tencent.mm.audio.mix.a.c localc;
    if (DC().ckA)
    {
      this.sampleRate = 44100;
      this.channels = 2;
      arrayOfByte = paramd.ckv;
      if (!this.clQ.get())
        if (this.cmd == null)
        {
          localc = DC();
          if ((!localc.cky) || (localc.duration > 2000L))
            break label139;
        }
    }
    label139: for (this.cmd = new com.tencent.mm.audio.mix.f.a.b(this.sampleRate, this.channels, localc, this); ; this.cmd = new com.tencent.mm.audio.mix.f.a.c(this.sampleRate, this.channels, localc, this))
    {
      this.cmd.G(arrayOfByte);
      if (paramd.ckH)
        com.tencent.mm.audio.mix.b.b.Di().b(paramd);
      AppMethodBeat.o(137068);
      return;
      this.sampleRate = paramd.sampleRate;
      this.channels = paramd.channels;
      break;
    }
  }

  public final void onRelease()
  {
    AppMethodBeat.i(137063);
    super.onRelease();
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "releasePlayComponent");
    synchronized (this.cli)
    {
      if (this.cmd != null)
      {
        this.cmd.release();
        this.cmd = null;
      }
      AppMethodBeat.o(137063);
      return;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137064);
    super.pause();
    synchronized (this.cli)
    {
      if (this.cmd != null)
        this.cmd.pause();
      AppMethodBeat.o(137064);
      return;
    }
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(137066);
    super.seek(paramInt);
    synchronized (this.cli)
    {
      if (this.cmd != null)
        this.cmd.seek(paramInt);
      AppMethodBeat.o(137066);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.e
 * JD-Core Version:    0.6.2
 */