package com.tencent.mm.kiss.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a eMK;
  public HandlerThread eMJ;
  private Handler mHandler;

  static
  {
    AppMethodBeat.i(105675);
    eMK = new a();
    AppMethodBeat.o(105675);
  }

  private a()
  {
    AppMethodBeat.i(105674);
    this.eMJ = new HandlerThread("InflateThread", 5);
    this.eMJ.start();
    this.mHandler = new Handler(this.eMJ.getLooper());
    AppMethodBeat.o(105674);
  }

  public static a SL()
  {
    return eMK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.a.a
 * JD-Core Version:    0.6.2
 */