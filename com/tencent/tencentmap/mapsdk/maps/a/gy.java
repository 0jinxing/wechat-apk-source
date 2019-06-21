package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class gy extends Thread
{
  private gm a;
  private boolean b = false;
  private boolean c = false;
  private byte[] d = null;

  public gy(gm paramgm)
  {
    this.a = paramgm;
  }

  private boolean d()
  {
    AppMethodBeat.i(99502);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.j();
      AppMethodBeat.o(99502);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99502);
    }
  }

  public void a()
  {
    this.c = true;
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99500);
    this.d = paramArrayOfByte;
    this.b = true;
    interrupt();
    AppMethodBeat.o(99500);
  }

  public void b()
  {
    AppMethodBeat.i(99501);
    this.c = false;
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(99501);
    }
  }

  public void c()
  {
  }

  public void run()
  {
    AppMethodBeat.i(99499);
    while (!this.b)
      if (!this.c)
      {
        if (!d())
          try
          {
            sleep(160L);
          }
          catch (InterruptedException localInterruptedException1)
          {
          }
      }
      else
        try
        {
          try
          {
            wait();
          }
          finally
          {
            AppMethodBeat.o(99499);
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
        }
    c();
    if (this.d != null);
    while (true)
    {
      synchronized (this.d)
      {
        this.d.notify();
        AppMethodBeat.o(99499);
        return;
      }
      AppMethodBeat.o(99499);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gy
 * JD-Core Version:    0.6.2
 */