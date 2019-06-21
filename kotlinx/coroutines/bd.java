package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CancellationException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "equals", "", "other", "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"})
public final class bd extends CancellationException
{
  public final bc BQz;

  public bd(String paramString, Throwable paramThrowable, bc parambc)
  {
    super(paramString);
    AppMethodBeat.i(118468);
    this.BQz = parambc;
    if (paramThrowable != null)
      initCause(paramThrowable);
    AppMethodBeat.o(118468);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118466);
    boolean bool;
    if ((paramObject == (bd)this) || (((paramObject instanceof bd)) && (j.j(((bd)paramObject).getMessage(), getMessage())) && (j.j(((bd)paramObject).BQz, this.BQz)) && (j.j(((bd)paramObject).getCause(), getCause()))))
    {
      bool = true;
      AppMethodBeat.o(118466);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118466);
    }
  }

  public final Throwable fillInStackTrace()
  {
    AppMethodBeat.i(118464);
    Throwable localThrowable;
    if (af.ela())
    {
      localThrowable = super.fillInStackTrace();
      j.o(localThrowable, "super.fillInStackTrace()");
      AppMethodBeat.o(118464);
    }
    while (true)
    {
      return localThrowable;
      localThrowable = (Throwable)this;
      AppMethodBeat.o(118464);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118467);
    Object localObject = getMessage();
    if (localObject == null)
      j.dWJ();
    int i = ((String)localObject).hashCode();
    int j = this.BQz.hashCode();
    localObject = getCause();
    if (localObject != null);
    for (int k = ((Throwable)localObject).hashCode(); ; k = 0)
    {
      AppMethodBeat.o(118467);
      return k + (i * 31 + j) * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(118465);
    String str = super.toString() + "; job=" + this.BQz;
    AppMethodBeat.o(118465);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bd
 * JD-Core Version:    0.6.2
 */