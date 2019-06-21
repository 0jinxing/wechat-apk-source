package com.tencent.mm.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bg;

public class c<T> extends bg<T>
{
  private final Object mLock;

  public c(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(51962);
    this.mLock = new Object();
    AppMethodBeat.o(51962);
  }

  public final T aA()
  {
    AppMethodBeat.i(51963);
    synchronized (this.mLock)
    {
      Object localObject2 = super.aA();
      AppMethodBeat.o(51963);
      return localObject2;
    }
  }

  public final boolean release(T paramT)
  {
    AppMethodBeat.i(51964);
    synchronized (this.mLock)
    {
      boolean bool = super.release(paramT);
      AppMethodBeat.o(51964);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c
 * JD-Core Version:    0.6.2
 */