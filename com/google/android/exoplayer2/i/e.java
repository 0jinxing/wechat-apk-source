package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  private boolean RP;

  public final void block()
  {
    try
    {
      AppMethodBeat.i(95874);
      while (!this.RP)
        wait();
    }
    finally
    {
    }
    AppMethodBeat.o(95874);
  }

  public final boolean open()
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(95873);
      if (this.RP)
      {
        bool = false;
        AppMethodBeat.o(95873);
      }
      while (true)
      {
        return bool;
        this.RP = true;
        notifyAll();
        AppMethodBeat.o(95873);
      }
    }
    finally
    {
    }
  }

  public final boolean tw()
  {
    try
    {
      boolean bool = this.RP;
      this.RP = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.e
 * JD-Core Version:    0.6.2
 */