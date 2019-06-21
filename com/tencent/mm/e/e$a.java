package com.tencent.mm.e;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class e$a extends TimerTask
{
  private b cko;
  private Handler mHandler;

  public e$a(e parame, b paramb)
  {
    AppMethodBeat.i(116184);
    this.mHandler = new Handler(Looper.getMainLooper());
    this.cko = paramb;
    AppMethodBeat.o(116184);
  }

  public final void run()
  {
    AppMethodBeat.i(116185);
    this.mHandler.post(new e.a.1(this));
    AppMethodBeat.o(116185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.e.a
 * JD-Core Version:    0.6.2
 */