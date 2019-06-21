package a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
public final class t<A, B, C>
  implements Serializable
{
  public final C AUw;
  public final A first;
  public final B second;

  public t(A paramA, B paramB, C paramC)
  {
    this.first = paramA;
    this.second = paramB;
    this.AUw = paramC;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56024);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof t))
      {
        paramObject = (t)paramObject;
        if ((!j.j(this.first, paramObject.first)) || (!j.j(this.second, paramObject.second)) || (!j.j(this.AUw, paramObject.AUw)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(56024);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56024);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(56023);
    Object localObject = this.first;
    int j;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.second;
      if (localObject == null)
        break label73;
    }
    label73: for (int k = localObject.hashCode(); ; k = 0)
    {
      localObject = this.AUw;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(56023);
      return (k + j * 31) * 31 + i;
      j = 0;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56022);
    String str = "(" + this.first + ", " + this.second + ", " + this.AUw + ')';
    AppMethodBeat.o(56022);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.t
 * JD-Core Version:    0.6.2
 */