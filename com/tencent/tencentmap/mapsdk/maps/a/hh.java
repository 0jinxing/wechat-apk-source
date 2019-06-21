package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class hh
{
  private ExecutorService a;
  private ExecutorService b;
  private hf c;
  private hg d;

  private void a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99537);
    if (this.d == null)
      AppMethodBeat.o(99537);
    while (true)
    {
      return;
      if (this.b == null)
        this.b = Executors.newSingleThreadExecutor();
      if (!this.b.isShutdown())
        this.b.execute(new hh.2(this, paramArrayOfByte, paramString));
      AppMethodBeat.o(99537);
    }
  }

  private void b(String paramString)
  {
    AppMethodBeat.i(99536);
    try
    {
      byte[] arrayOfByte1 = this.c.a(paramString);
      byte[] arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1 != null)
      {
        arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1.length == 0)
          arrayOfByte2 = null;
      }
      a(paramString, arrayOfByte2);
      AppMethodBeat.o(99536);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        a(paramString, null);
        AppMethodBeat.o(99536);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(99533);
    a(null);
    AppMethodBeat.o(99533);
  }

  public void a(hf paramhf)
  {
    this.c = paramhf;
  }

  public void a(hg paramhg)
  {
    this.d = paramhg;
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(99534);
    this.c = null;
    if (this.a != null)
    {
      this.a.shutdown();
      this.a = null;
    }
    if (this.b != null)
    {
      this.b.shutdown();
      this.b = null;
    }
    if (paramRunnable != null)
      paramRunnable.run();
    AppMethodBeat.o(99534);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(99535);
    if (this.c == null)
      AppMethodBeat.o(99535);
    while (true)
    {
      return;
      if (this.a == null)
        this.a = Executors.newFixedThreadPool(5);
      try
      {
        if (!this.a.isShutdown())
        {
          ExecutorService localExecutorService = this.a;
          Runnable local1 = new com/tencent/tencentmap/mapsdk/maps/a/hh$1;
          local1.<init>(this, paramString);
          localExecutorService.execute(local1);
        }
        AppMethodBeat.o(99535);
      }
      catch (IllegalMonitorStateException paramString)
      {
        AppMethodBeat.o(99535);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hh
 * JD-Core Version:    0.6.2
 */