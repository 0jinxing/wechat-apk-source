package com.google.firebase.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicReference;

public final class b
{
  private static final AtomicReference<b> buH;

  static
  {
    AppMethodBeat.i(10636);
    buH = new AtomicReference();
    AppMethodBeat.o(10636);
  }

  public static b uY()
  {
    AppMethodBeat.i(10635);
    buH.compareAndSet(null, new b());
    b localb = (b)buH.get();
    AppMethodBeat.o(10635);
    return localb;
  }

  public static void uZ()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.b.b
 * JD-Core Version:    0.6.2
 */