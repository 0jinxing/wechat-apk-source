package com.google.android.exoplayer2.a;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(19)
final class f$b extends f.a
{
  private final AudioTimestamp aRd;
  private long aRe;
  private long aRf;
  private long aRg;

  public f$b()
  {
    super((byte)0);
    AppMethodBeat.i(94669);
    this.aRd = new AudioTimestamp();
    AppMethodBeat.o(94669);
  }

  public final void a(AudioTrack paramAudioTrack, boolean paramBoolean)
  {
    AppMethodBeat.i(94670);
    super.a(paramAudioTrack, paramBoolean);
    this.aRe = 0L;
    this.aRf = 0L;
    this.aRg = 0L;
    AppMethodBeat.o(94670);
  }

  public final long qA()
  {
    return this.aRd.nanoTime;
  }

  public final long qB()
  {
    return this.aRg;
  }

  public final boolean qz()
  {
    AppMethodBeat.i(94671);
    boolean bool = this.aQf.getTimestamp(this.aRd);
    if (bool)
    {
      long l = this.aRd.framePosition;
      if (this.aRf > l)
        this.aRe += 1L;
      this.aRf = l;
      this.aRg = (l + (this.aRe << 32));
    }
    AppMethodBeat.o(94671);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.f.b
 * JD-Core Version:    0.6.2
 */