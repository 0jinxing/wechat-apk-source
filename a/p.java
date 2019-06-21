package a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"})
public final class p<T>
  implements Serializable
{
  public static final a AUp;
  private final Object value;

  static
  {
    AppMethodBeat.i(56250);
    AUp = new a((byte)0);
    AppMethodBeat.o(56250);
  }

  public static final boolean dj(Object paramObject)
  {
    if (!(paramObject instanceof p.b));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final Throwable dk(Object paramObject)
  {
    if ((paramObject instanceof p.b));
    for (paramObject = ((p.b)paramObject).AUq; ; paramObject = null)
      return paramObject;
  }

  public static Object dl(Object paramObject)
  {
    return paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56252);
    Object localObject = this.value;
    boolean bool;
    if (((paramObject instanceof p)) && (j.j(localObject, ((p)paramObject).value)))
    {
      bool = true;
      AppMethodBeat.o(56252);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56252);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56251);
    Object localObject = this.value;
    int i;
    if (localObject != null)
    {
      i = localObject.hashCode();
      AppMethodBeat.o(56251);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(56251);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56249);
    Object localObject = this.value;
    if ((localObject instanceof p.b))
    {
      localObject = localObject.toString();
      AppMethodBeat.o(56249);
    }
    while (true)
    {
      return localObject;
      localObject = "Success(" + localObject + ')';
      AppMethodBeat.o(56249);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/Result$Companion;", "", "()V", "failure", "Lkotlin/Result;", "T", "exception", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "success", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.p
 * JD-Core Version:    0.6.2
 */