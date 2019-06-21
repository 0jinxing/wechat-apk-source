package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a zYw;
  public HandlerThread a;
  private Handler b;

  static
  {
    AppMethodBeat.i(126144);
    zYw = new a();
    AppMethodBeat.o(126144);
  }

  private a()
  {
    AppMethodBeat.i(126143);
    this.a = new HandlerThread("Vending-HeavyWorkThread", 10);
    this.a.start();
    this.b = new Handler(this.a.getLooper());
    AppMethodBeat.o(126143);
  }

  public static a dMr()
  {
    return zYw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.i.a
 * JD-Core Version:    0.6.2
 */