package com.google.android.exoplayer2.h;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class s$e extends Handler
  implements Runnable
{
  private final s.d bqT;

  public s$e(s.d paramd)
  {
    this.bqT = paramd;
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(95850);
    this.bqT.rZ();
    AppMethodBeat.o(95850);
  }

  public final void run()
  {
    AppMethodBeat.i(95849);
    sendEmptyMessage(0);
    AppMethodBeat.o(95849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.s.e
 * JD-Core Version:    0.6.2
 */