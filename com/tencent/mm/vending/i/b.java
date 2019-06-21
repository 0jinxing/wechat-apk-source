package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static b zYx;
  public HandlerThread a;
  private Handler b;

  static
  {
    AppMethodBeat.i(126146);
    zYx = new b();
    AppMethodBeat.o(126146);
  }

  private b()
  {
    AppMethodBeat.i(126145);
    this.a = new HandlerThread("Vending-LogicThread");
    this.a.start();
    this.b = new Handler(this.a.getLooper());
    AppMethodBeat.o(126145);
  }

  public static b dMs()
  {
    return zYx;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.i.b
 * JD-Core Version:    0.6.2
 */