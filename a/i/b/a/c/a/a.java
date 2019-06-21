package a.i.b.a.c.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a<T extends g>
{
  private volatile T AZH;
  private volatile boolean AZI;
  private Throwable AZJ;
  private final a.f.a.a<T> AZK;

  public a(a.f.a.a<? extends T> parama)
  {
    AppMethodBeat.i(119068);
    this.AZK = parama;
    AppMethodBeat.o(119068);
  }

  private final void initialize()
  {
    try
    {
      AppMethodBeat.i(119066);
      if (this.AZH != null)
        break label192;
      if (this.AZJ != null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Built-in library initialization failed previously: ");
        Throwable localThrowable2 = this.AZJ;
        if (localThrowable2 == null)
          j.dWJ();
        localIllegalStateException.<init>(localThrowable2, this.AZJ);
        localThrowable2 = (Throwable)localIllegalStateException;
        AppMethodBeat.o(119066);
        throw localThrowable2;
      }
    }
    finally
    {
    }
    Object localObject2;
    if (this.AZI)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Built-in library initialization loop");
      localObject2 = (Throwable)localObject2;
      AppMethodBeat.o(119066);
      throw ((Throwable)localObject2);
    }
    this.AZI = true;
    while (true)
    {
      try
      {
        this.AZH = ((g)this.AZK.invoke());
        this.AZI = false;
        AppMethodBeat.o(119066);
        return;
      }
      catch (Throwable localThrowable1)
      {
        this.AZJ = localThrowable1;
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Built-in library initialization failed. Please ensure you have kotlin-stdlib.jar in the classpath: ".concat(String.valueOf(localThrowable1)), localThrowable1);
        localObject2 = (Throwable)localObject2;
        AppMethodBeat.o(119066);
        throw ((Throwable)localObject2);
      }
      finally
      {
        this.AZI = false;
        AppMethodBeat.o(119066);
      }
      label192: AppMethodBeat.o(119066);
    }
  }

  public final T dXD()
  {
    AppMethodBeat.i(119067);
    if (this.AZI)
    {
      try
      {
        Object localObject = this.AZH;
        if (localObject == null)
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>("Built-ins are not initialized (note: We are under the same lock as initializing and instance)");
          localObject = (Throwable)localObject;
          AppMethodBeat.o(119067);
          throw ((Throwable)localObject);
        }
      }
      finally
      {
        AppMethodBeat.o(119067);
      }
      AppMethodBeat.o(119067);
    }
    while (true)
    {
      return ?;
      if (this.AZH == null)
        initialize();
      g localg = this.AZH;
      if (localg == null)
        j.dWJ();
      AppMethodBeat.o(119067);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a
 * JD-Core Version:    0.6.2
 */