package a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
public final class p$b
  implements Serializable
{
  public final Throwable AUq;

  public p$b(Throwable paramThrowable)
  {
    AppMethodBeat.i(56420);
    this.AUq = paramThrowable;
    AppMethodBeat.o(56420);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56417);
    boolean bool;
    if (((paramObject instanceof b)) && (j.j(this.AUq, ((b)paramObject).AUq)))
    {
      bool = true;
      AppMethodBeat.o(56417);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56417);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56418);
    int i = this.AUq.hashCode();
    AppMethodBeat.o(56418);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(56419);
    String str = "Failure(" + this.AUq + ')';
    AppMethodBeat.o(56419);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.p.b
 * JD-Core Version:    0.6.2
 */