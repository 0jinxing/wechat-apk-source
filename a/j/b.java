package a.j;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
public final class b<T>
  implements c<T>, h<T>
{
  final h<T> BOr;
  final int count;

  public b(h<? extends T> paramh, int paramInt)
  {
    AppMethodBeat.i(55972);
    this.BOr = paramh;
    this.count = paramInt;
    if (this.count >= 0);
    for (paramInt = 1; paramInt == 0; paramInt = 0)
    {
      paramh = (Throwable)new IllegalArgumentException(("count must be non-negative, but was " + this.count + '.').toString());
      AppMethodBeat.o(55972);
      throw paramh;
    }
    AppMethodBeat.o(55972);
  }

  public final h<T> ekJ()
  {
    AppMethodBeat.i(55970);
    int i = this.count + 1;
    h localh;
    if (i < 0)
    {
      localh = (h)new b((h)this, 1);
      AppMethodBeat.o(55970);
    }
    while (true)
    {
      return localh;
      localh = (h)new b(this.BOr, i);
      AppMethodBeat.o(55970);
    }
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(55971);
    Iterator localIterator = (Iterator)new b.a(this);
    AppMethodBeat.o(55971);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.j.b
 * JD-Core Version:    0.6.2
 */