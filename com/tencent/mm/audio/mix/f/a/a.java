package com.tencent.mm.audio.mix.f.a;

import android.media.AudioTrack;
import com.tencent.mm.audio.mix.a.c;
import com.tencent.mm.audio.mix.f.f;
import com.tencent.mm.audio.mix.h.b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a
{
  protected static volatile AtomicInteger cod = new AtomicInteger(0);
  protected static volatile AtomicInteger coe = new AtomicInteger(0);
  protected AudioTrack aQf;
  protected byte[] byteBuffer;
  protected int channels = 0;
  protected c cll;
  protected int cnZ = 0;
  protected int coa = 0;
  protected f cob;
  protected int coc = 0;
  protected int sampleRate = 0;

  public a(int paramInt1, int paramInt2, c paramc, f paramf)
  {
    this.sampleRate = paramInt1;
    this.channels = paramInt2;
    this.cll = paramc;
    this.cob = paramf;
  }

  public final void DL()
  {
    try
    {
      if ((this.aQf != null) && ((this.aQf.getState() == 1) || (this.aQf.getState() == 2)))
        this.aQf.setStereoVolume(0.0F, 0.0F);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", localIllegalStateException, "setVolume", new Object[0]);
    }
    catch (Exception localException)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", localException, "setVolume", new Object[0]);
    }
  }

  protected final void Er()
  {
    try
    {
      if ((this.aQf != null) && (this.aQf.getState() != 0))
      {
        this.aQf.stop();
        this.aQf.flush();
      }
      if (this.aQf != null)
      {
        this.aQf.release();
        this.aQf = null;
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", localException, "releaseAudioTrack", new Object[0]);
    }
  }

  public void Eu()
  {
  }

  public void G(byte[] paramArrayOfByte)
  {
  }

  protected abstract boolean createAudioTrack();

  public void pause()
  {
  }

  public final void release()
  {
    Er();
    this.cob = null;
    this.cll = null;
    this.byteBuffer = null;
    this.cnZ = 0;
    this.coa = 0;
  }

  public void reset()
  {
    this.cnZ = 0;
    this.coa = 0;
    if (this.byteBuffer != null)
      Arrays.fill(this.byteBuffer, 0, this.byteBuffer.length, (byte)0);
  }

  public void resume()
  {
  }

  public final void seek(int paramInt)
  {
    b.i("MicroMsg.Mix.AudioPcmBasePlayComponent", "seek startPos:%d", new Object[] { Integer.valueOf(this.coc) });
    this.coc = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.a.a
 * JD-Core Version:    0.6.2
 */