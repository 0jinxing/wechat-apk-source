package a.k;

import a.f.b.j;
import a.h.d;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"})
public final class f
{
  private final d BOW;
  private final String value;

  public f(String paramString, d paramd)
  {
    AppMethodBeat.i(56348);
    this.value = paramString;
    this.BOW = paramd;
    AppMethodBeat.o(56348);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56351);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if ((!j.j(this.value, paramObject.value)) || (!j.j(this.BOW, paramObject.BOW)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(56351);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56351);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(56350);
    Object localObject = this.value;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BOW;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(56350);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56349);
    String str = "MatchGroup(value=" + this.value + ", range=" + this.BOW + ")";
    AppMethodBeat.o(56349);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.k.f
 * JD-Core Version:    0.6.2
 */