package a.h;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
public final class d extends b
  implements a<Integer>
{
  private static final d AVP;
  public static final d.a AVQ;

  static
  {
    AppMethodBeat.i(55992);
    AVQ = new d.a((byte)0);
    AVP = new d(1, 0);
    AppMethodBeat.o(55992);
  }

  public d(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2, 1);
  }

  public final boolean contains(int paramInt)
  {
    if ((this.AVJ <= paramInt) && (paramInt <= this.AVK));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(55989);
    boolean bool;
    if (((paramObject instanceof d)) && (((isEmpty()) && (((d)paramObject).isEmpty())) || ((this.AVJ == ((d)paramObject).AVJ) && (this.AVK == ((d)paramObject).AVK))))
    {
      bool = true;
      AppMethodBeat.o(55989);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55989);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(55990);
    int i;
    if (isEmpty())
    {
      i = -1;
      AppMethodBeat.o(55990);
    }
    while (true)
    {
      return i;
      i = this.AVJ * 31 + this.AVK;
      AppMethodBeat.o(55990);
    }
  }

  public final boolean isEmpty()
  {
    if (this.AVJ > this.AVK);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(55991);
    String str = this.AVJ + ".." + this.AVK;
    AppMethodBeat.o(55991);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.h.d
 * JD-Core Version:    0.6.2
 */