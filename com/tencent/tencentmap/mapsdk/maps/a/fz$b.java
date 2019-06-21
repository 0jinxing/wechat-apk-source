package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class fz$b extends Thread
{
  private boolean b;
  private boolean c;

  private fz$b(fz paramfz)
  {
  }

  public void a()
  {
    try
    {
      this.c = true;
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
      this.c = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void destroy()
  {
    try
    {
      AppMethodBeat.i(98951);
      this.b = false;
      interrupt();
      AppMethodBeat.o(98951);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void run()
  {
    AppMethodBeat.i(98952);
    while (this.b)
    {
      if (!this.c)
      {
        if (fz.a(this.a) != null)
          fz.a(this.a).a(fx.h);
        if ((fz.b(this.a)) && (System.currentTimeMillis() - fz.c(this.a) > 500L))
        {
          fz.a(this.a, false);
          if (fz.d(this.a) != null)
            fz.d(this.a).a();
        }
      }
      try
      {
        try
        {
          wait(this.a.h());
        }
        finally
        {
          AppMethodBeat.o(98952);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    AppMethodBeat.o(98952);
  }

  public void start()
  {
    try
    {
      AppMethodBeat.i(98950);
      this.b = true;
      super.start();
      AppMethodBeat.o(98950);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fz.b
 * JD-Core Version:    0.6.2
 */