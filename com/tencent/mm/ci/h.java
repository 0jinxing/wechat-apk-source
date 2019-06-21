package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h<T>
{
  private c<T> Aix;
  private byte[] eHH;
  private volatile T mInstance;

  public h(c<T> paramc)
  {
    AppMethodBeat.i(59239);
    this.eHH = new byte[0];
    this.Aix = paramc;
    AppMethodBeat.o(59239);
  }

  public final T get()
  {
    AppMethodBeat.i(59240);
    if (this.mInstance == null);
    synchronized (this.eHH)
    {
      if (this.mInstance == null)
        this.mInstance = this.Aix.get();
      ??? = this.mInstance;
      AppMethodBeat.o(59240);
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.h
 * JD-Core Version:    0.6.2
 */