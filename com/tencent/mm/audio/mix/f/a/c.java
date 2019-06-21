package com.tencent.mm.audio.mix.f.a;

import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.f.f;
import com.tencent.mm.audio.mix.h.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class c extends a
{
  private static long cof = 0L;
  private static long cog = 0L;

  public c(int paramInt1, int paramInt2, com.tencent.mm.audio.mix.a.c paramc, f paramf)
  {
    super(paramInt1, paramInt2, paramc, paramf);
  }

  public final void Eu()
  {
    AppMethodBeat.i(137204);
    super.Eu();
    b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "playFlush");
    AppMethodBeat.o(137204);
  }

  public final void G(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137203);
    if (this.aQf == null)
    {
      b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "create AudioTrack before");
      if (!createAudioTrack())
      {
        if (this.cob != null)
          this.cob.onError(707);
        b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "create AudioTrack fail");
        AppMethodBeat.o(137203);
      }
    }
    while (true)
    {
      return;
      b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "create AudioTrack success");
      try
      {
        this.aQf.play();
        this.aQf.setStereoVolume(1.0F, 1.0F);
        b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "create AudioTrack after");
        if (this.cob != null)
          this.cob.DI();
        this.aQf.setStereoVolume(1.0F, 1.0F);
        this.aQf.write(paramArrayOfByte, 0, paramArrayOfByte.length);
        AppMethodBeat.o(137203);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
          b.printErrStackTrace("MicroMsg.Mix.AudioPcmStreamPlayComponent", localIllegalStateException, "setStereoVolume", new Object[0]);
      }
    }
  }

  protected final boolean createAudioTrack()
  {
    boolean bool = true;
    AppMethodBeat.i(137202);
    b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "createAudioTrack");
    if (this.cnZ > 1)
    {
      b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "createAudioTrack fail count reach MAX COUNT");
      AppMethodBeat.o(137202);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.channels == 1);
      int j;
      for (int i = 4; ; i = 12)
      {
        j = AudioTrack.getMinBufferSize(this.sampleRate, i, 2);
        if (j > 0)
          break label96;
        b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "createAudioTrack miniBufferSize %d is illegal", new Object[] { Integer.valueOf(j) });
        AppMethodBeat.o(137202);
        bool = false;
        break;
      }
      label96: if (this.aQf == null)
      {
        b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "new AudioTrack");
        System.currentTimeMillis();
        this.aQf = new AudioTrack(3, this.sampleRate, i, 2, j, 1);
        this.cnZ += 1;
        coe.incrementAndGet();
      }
      if ((this.aQf == null) || (this.aQf.getState() != 1))
      {
        cod.incrementAndGet();
        b.i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "play_count:%d, fail_count:%d", new Object[] { Integer.valueOf(coe.get()), Integer.valueOf(cod.get()) });
        b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "audio track not initialized");
        if (this.aQf != null)
          b.e("MicroMsg.Mix.AudioPcmStreamPlayComponent", "AudioTrack getState:%d", new Object[] { Integer.valueOf(this.aQf.getState()) });
        try
        {
          this.aQf.release();
          this.aQf = null;
          AppMethodBeat.o(137202);
          bool = false;
        }
        catch (Exception localException)
        {
          while (true)
            b.printErrStackTrace("MicroMsg.Mix.AudioPcmStreamPlayComponent", localException, "AudioTrack release", new Object[0]);
        }
      }
      else
      {
        AppMethodBeat.o(137202);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.a.c
 * JD-Core Version:    0.6.2
 */