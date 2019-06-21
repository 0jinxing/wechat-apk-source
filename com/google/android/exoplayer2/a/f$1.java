package com.google.android.exoplayer2.a;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1 extends Thread
{
  f$1(f paramf, AudioTrack paramAudioTrack)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(94660);
    try
    {
      this.aQU.flush();
      this.aQU.release();
      return;
    }
    finally
    {
      f.a(this.aQV).open();
      AppMethodBeat.o(94660);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.f.1
 * JD-Core Version:    0.6.2
 */