package com.google.android.exoplayer2.a;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

class f$a
{
  private boolean aQW;
  private long aQX;
  private long aQY;
  private long aQZ;
  protected AudioTrack aQf;
  private long aRa;
  private long aRb;
  private long aRc;
  private int sampleRate;

  public final void L(long paramLong)
  {
    AppMethodBeat.i(94663);
    this.aRb = qx();
    this.aRa = (SystemClock.elapsedRealtime() * 1000L);
    this.aRc = paramLong;
    this.aQf.stop();
    AppMethodBeat.o(94663);
  }

  public void a(AudioTrack paramAudioTrack, boolean paramBoolean)
  {
    AppMethodBeat.i(94662);
    this.aQf = paramAudioTrack;
    this.aQW = paramBoolean;
    this.aRa = -9223372036854775807L;
    this.aQX = 0L;
    this.aQY = 0L;
    this.aQZ = 0L;
    if (paramAudioTrack != null)
      this.sampleRate = paramAudioTrack.getSampleRate();
    AppMethodBeat.o(94662);
  }

  public final void pause()
  {
    AppMethodBeat.i(94664);
    if (this.aRa != -9223372036854775807L)
      AppMethodBeat.o(94664);
    while (true)
    {
      return;
      this.aQf.pause();
      AppMethodBeat.o(94664);
    }
  }

  public long qA()
  {
    AppMethodBeat.i(94667);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(94667);
    throw localUnsupportedOperationException;
  }

  public long qB()
  {
    AppMethodBeat.i(94668);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(94668);
    throw localUnsupportedOperationException;
  }

  public final long qx()
  {
    AppMethodBeat.i(94665);
    long l1;
    if (this.aRa != -9223372036854775807L)
    {
      l1 = (SystemClock.elapsedRealtime() * 1000L - this.aRa) * this.sampleRate / 1000000L;
      l1 = Math.min(this.aRc, l1 + this.aRb);
      AppMethodBeat.o(94665);
    }
    while (true)
    {
      return l1;
      int i = this.aQf.getPlayState();
      if (i == 1)
      {
        AppMethodBeat.o(94665);
        l1 = 0L;
      }
      else
      {
        long l2 = 0xFFFFFFFF & this.aQf.getPlaybackHeadPosition();
        l1 = l2;
        if (this.aQW)
        {
          if ((i == 2) && (l2 == 0L))
            this.aQZ = this.aQX;
          l1 = l2 + this.aQZ;
        }
        if (this.aQX > l1)
          this.aQY += 1L;
        this.aQX = l1;
        l1 += (this.aQY << 32);
        AppMethodBeat.o(94665);
      }
    }
  }

  public final long qy()
  {
    AppMethodBeat.i(94666);
    long l = qx() * 1000000L / this.sampleRate;
    AppMethodBeat.o(94666);
    return l;
  }

  public boolean qz()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.f.a
 * JD-Core Version:    0.6.2
 */