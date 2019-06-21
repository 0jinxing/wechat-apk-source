package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class NativeProtocol$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(72437);
    try
    {
      Iterator localIterator = NativeProtocol.access$900().iterator();
      while (localIterator.hasNext())
        NativeProtocol.NativeAppInfo.access$1000((NativeProtocol.NativeAppInfo)localIterator.next(), true);
    }
    finally
    {
      NativeProtocol.access$1100().set(false);
      AppMethodBeat.o(72437);
    }
    NativeProtocol.access$1100().set(false);
    AppMethodBeat.o(72437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol.1
 * JD-Core Version:    0.6.2
 */