package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.util.Arrays;

public class mh<T> extends ly<T>
{
  boolean a = false;
  private final ly<? super T> b;

  public mh(ly<? super T> paramly)
  {
    super(paramly);
    this.b = paramly;
  }

  private void c(Throwable paramThrowable)
  {
    AppMethodBeat.i(100512);
    System.err.println("RxJavaErrorHandler threw an Exception. It shouldn't. => " + paramThrowable.getMessage());
    AppMethodBeat.o(100512);
  }

  public void a()
  {
    AppMethodBeat.i(100508);
    if (!this.a)
      this.a = true;
    while (true)
    {
      try
      {
        this.b.a();
        return;
      }
      catch (Throwable localThrowable)
      {
        mb.a(localThrowable);
        b(localThrowable);
        b();
        AppMethodBeat.o(100508);
        continue;
      }
      finally
      {
        b();
        AppMethodBeat.o(100508);
      }
      AppMethodBeat.o(100508);
    }
  }

  public void a(T paramT)
  {
    AppMethodBeat.i(100510);
    try
    {
      if (!this.a)
        this.b.a(paramT);
      AppMethodBeat.o(100510);
      return;
    }
    catch (Throwable paramT)
    {
      while (true)
      {
        mb.a(paramT);
        a(paramT);
        AppMethodBeat.o(100510);
      }
    }
  }

  public void a(Throwable paramThrowable)
  {
    AppMethodBeat.i(100509);
    mb.a(paramThrowable);
    if (!this.a)
    {
      this.a = true;
      b(paramThrowable);
    }
    AppMethodBeat.o(100509);
  }

  protected void b(Throwable paramThrowable)
  {
    AppMethodBeat.i(100511);
    try
    {
      ml.a().b().a(paramThrowable);
    }
    catch (Throwable localThrowable6)
    {
      try
      {
        this.b.a(paramThrowable);
      }
      catch (Throwable localThrowable6)
      {
        try
        {
          while (true)
          {
            b();
            AppMethodBeat.o(100511);
            return;
            localThrowable1 = localThrowable1;
            c(localThrowable1);
          }
          localThrowable2 = localThrowable2;
          if ((localThrowable2 instanceof md))
          {
            try
            {
              b();
              paramThrowable = (md)localThrowable2;
              AppMethodBeat.o(100511);
              throw paramThrowable;
            }
            catch (Throwable localThrowable3)
            {
            }
            try
            {
              ml.a().b().a(localThrowable3);
              paramThrowable = new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new ma(Arrays.asList(new Throwable[] { paramThrowable, localThrowable3 })));
              AppMethodBeat.o(100511);
              throw paramThrowable;
            }
            catch (Throwable localThrowable5)
            {
              while (true)
                c(localThrowable5);
            }
          }
          try
          {
            ml.a().b().a(localThrowable3);
          }
          catch (Throwable localThrowable6)
          {
            try
            {
              while (true)
              {
                b();
                paramThrowable = new mc("Error occurred when trying to propagate error to Observer.onError", new ma(Arrays.asList(new Throwable[] { paramThrowable, localThrowable3 })));
                AppMethodBeat.o(100511);
                throw paramThrowable;
                localThrowable6 = localThrowable6;
                c(localThrowable6);
              }
            }
            catch (Throwable localThrowable7)
            {
              try
              {
                ml.a().b().a(localThrowable7);
                paramThrowable = new mc("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new ma(Arrays.asList(new Throwable[] { paramThrowable, localThrowable3, localThrowable7 })));
                AppMethodBeat.o(100511);
                throw paramThrowable;
              }
              catch (Throwable localThrowable8)
              {
                while (true)
                  c(localThrowable8);
              }
            }
          }
        }
        catch (RuntimeException paramThrowable)
        {
        }
      }
    }
    try
    {
      ml.a().b().a(paramThrowable);
      paramThrowable = new mc(paramThrowable);
      AppMethodBeat.o(100511);
      throw paramThrowable;
    }
    catch (Throwable localThrowable4)
    {
      while (true)
        c(localThrowable4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.mh
 * JD-Core Version:    0.6.2
 */