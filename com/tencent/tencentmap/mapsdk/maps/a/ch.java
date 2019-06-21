package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public final class ch
{
  private ThreadPoolExecutor a;

  private ch()
  {
    AppMethodBeat.i(98636);
    this.a = ((ThreadPoolExecutor)Executors.newCachedThreadPool(new bv("halley_" + bt.c() + "_" + "BusinessTaskPool")));
    AppMethodBeat.o(98636);
  }

  public static ch a()
  {
    AppMethodBeat.i(98637);
    ch localch = ch.a.a();
    AppMethodBeat.o(98637);
    return localch;
  }

  public final ThreadPoolExecutor b()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ch
 * JD-Core Version:    0.6.2
 */