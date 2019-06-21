package com.tencent.mm.audio.mix.f.a;

import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.c;
import com.tencent.mm.audio.mix.f.f;
import java.util.concurrent.atomic.AtomicInteger;

public final class b extends a
{
  private static long cof = 0L;
  private static long cog = 0L;
  private Thread aAA;

  public b(int paramInt1, int paramInt2, c paramc, f paramf)
  {
    super(paramInt1, paramInt2, paramc, paramf);
  }

  public final void Eu()
  {
    AppMethodBeat.i(137198);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "playFlush play_count:%d, fail_count:%d", new Object[] { Integer.valueOf(coe.get()), Integer.valueOf(cod.get()) });
    if (this.aQf != null)
    {
      if (this.cob != null)
        this.cob.DI();
      if ((this.aQf.getState() == 2) && (this.aQf.write(this.byteBuffer, 0, this.byteBuffer.length) <= 0))
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "AudioTrack write fail, should write length:%d", new Object[] { Integer.valueOf(this.byteBuffer.length) });
        this.cob.onError(708);
        AppMethodBeat.o(137198);
      }
    }
    while (true)
    {
      return;
      if (this.aQf.getState() == 1)
      {
        this.aQf.reloadStaticData();
        this.aQf.play();
        this.aAA = Thread.currentThread();
        try
        {
          long l1 = this.cll.duration;
          long l2 = l1;
          if (l1 <= 0L)
            l2 = 2000L;
          Thread.sleep(l2);
          AppMethodBeat.o(137198);
        }
        catch (Exception localException)
        {
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep");
        }
      }
      else
      {
        AppMethodBeat.o(137198);
      }
    }
  }

  public final void G(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137197);
    if (this.aQf == null)
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "create AudioTrack before");
      if (!createAudioTrack())
      {
        if (this.cob != null)
          this.cob.onError(707);
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "create AudioTrack fail");
        AppMethodBeat.o(137197);
      }
    }
    while (true)
    {
      return;
      try
      {
        this.aQf.setStereoVolume(1.0F, 1.0F);
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "create AudioTrack after and success!");
        if (this.byteBuffer == null)
        {
          if (this.cll != null)
          {
            i = this.cll.size() * 3536;
            int j = i;
            if (i == 0)
              j = 3536;
            i = j;
            if (paramArrayOfByte.length == 3536)
              i = j + 1;
            this.byteBuffer = new byte[i];
          }
        }
        else
        {
          if (this.coa + paramArrayOfByte.length <= this.byteBuffer.length)
          {
            System.arraycopy(paramArrayOfByte, 0, this.byteBuffer, this.coa, paramArrayOfByte.length);
            this.coa += paramArrayOfByte.length;
          }
          AppMethodBeat.o(137197);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", localIllegalStateException, "setStereoVolume", new Object[0]);
          continue;
          int i = 3536;
        }
      }
    }
  }

  protected final boolean createAudioTrack()
  {
    boolean bool = false;
    AppMethodBeat.i(137196);
    if (this.cnZ > 1)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "createAudioTrack fail count reach MAX COUNT");
      AppMethodBeat.o(137196);
    }
    while (true)
    {
      return bool;
      int i;
      if (this.channels == 1)
      {
        i = 4;
        int j = AudioTrack.getMinBufferSize(this.sampleRate, i, 2);
        int k = j;
        if (this.cll != null)
        {
          k = j;
          if (this.cll.size() > 0)
            k = this.cll.size() * 3536;
        }
        if (this.aQf == null)
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "new AudioTrack");
          System.currentTimeMillis();
          this.aQf = new AudioTrack(3, this.sampleRate, i, 2, k, 0);
          this.cnZ += 1;
          coe.incrementAndGet();
        }
        if ((this.aQf != null) && (this.aQf.getState() == 2))
          break label248;
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "audio track not initialized");
        cod.incrementAndGet();
        if (this.aQf != null)
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "AudioTrack getState:%d", new Object[] { Integer.valueOf(this.aQf.getState()) });
      }
      try
      {
        this.aQf.release();
        this.aQf = null;
        AppMethodBeat.o(137196);
        continue;
        i = 12;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", localException, "AudioTrack release", new Object[0]);
      }
      label248: AppMethodBeat.o(137196);
      bool = true;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137200);
    if (this.aQf != null)
    {
      int i = this.aQf.getState();
      int j = this.aQf.getPlayState();
      if ((i != 1) || (j != 3));
    }
    while (true)
    {
      try
      {
        this.aQf.pause();
        this.coc = this.aQf.getPlaybackHeadPosition();
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "pause startPos :%d", new Object[] { Integer.valueOf(this.coc) });
        if (this.aAA != null)
          this.aAA.interrupt();
        AppMethodBeat.o(137200);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", localException, "pause", new Object[0]);
      }
      AppMethodBeat.o(137200);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(137201);
    super.reset();
    Er();
    this.aAA = null;
    AppMethodBeat.o(137201);
  }

  public final void resume()
  {
    AppMethodBeat.i(137199);
    if ((this.aQf != null) && (this.aQf.getState() == 1))
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "resume");
      if (this.cob != null)
        this.cob.DI();
    }
    while (true)
    {
      try
      {
        this.aQf.setStereoVolume(1.0F, 1.0F);
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play startPos:%d", new Object[] { Integer.valueOf(this.coc) });
        this.aQf.setPlaybackHeadPosition(this.coc);
        this.aQf.play();
      }
      catch (IllegalStateException localIllegalStateException)
      {
        try
        {
          long l1 = this.cll.duration;
          long l2 = l1;
          if (l1 <= 0L)
            l2 = 2000L;
          Thread.sleep(l2);
          AppMethodBeat.o(137199);
          return;
          localIllegalStateException = localIllegalStateException;
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", localIllegalStateException, "setStereoVolume", new Object[0]);
        }
        catch (Exception localException)
        {
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep");
        }
      }
      AppMethodBeat.o(137199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.a.b
 * JD-Core Version:    0.6.2
 */