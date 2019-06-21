package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;

class jx$1
  implements ThreadFactory
{
  jx$1(jx paramjx)
  {
  }

  public Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(100136);
    paramRunnable = new Thread(paramRunnable);
    paramRunnable.setPriority(3);
    AppMethodBeat.o(100136);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jx.1
 * JD-Core Version:    0.6.2
 */