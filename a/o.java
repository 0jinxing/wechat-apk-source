package a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
public final class o<A, B>
  implements Serializable
{
  public final A first;
  public final B second;

  public o(A paramA, B paramB)
  {
    this.first = paramA;
    this.second = paramB;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56423);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof o))
      {
        paramObject = (o)paramObject;
        if ((!j.j(this.first, paramObject.first)) || (!j.j(this.second, paramObject.second)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(56423);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56423);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(56422);
    Object localObject = this.first;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.second;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(56422);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56421);
    String str = "(" + this.first + ", " + this.second + ')';
    AppMethodBeat.o(56421);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.o
 * JD-Core Version:    0.6.2
 */