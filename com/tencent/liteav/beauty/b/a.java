package com.tencent.liteav.beauty.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  private boolean a = false;

  public void a()
  {
    try
    {
      AppMethodBeat.i(66976);
      this.a = true;
      notify();
      AppMethodBeat.o(66976);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void b()
  {
    try
    {
      AppMethodBeat.i(66977);
      while (!this.a)
        wait();
    }
    finally
    {
    }
    this.a = false;
    AppMethodBeat.o(66977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.a
 * JD-Core Version:    0.6.2
 */