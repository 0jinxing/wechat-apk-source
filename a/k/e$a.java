package a.k;

import a.f.b.a.a;
import a.h.d;
import a.l;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
public final class e$a
  implements a, Iterator<d>
{
  private int BOS;
  private int BOT;
  private d BOU;
  private int BOw;
  private int counter;

  e$a()
  {
    AppMethodBeat.i(56263);
    this.BOw = -1;
    this.BOS = a.h.e.aQ(localObject.jaQ, 0, localObject.BOQ.length());
    this.BOT = this.BOS;
    AppMethodBeat.o(56263);
  }

  private final void ekK()
  {
    AppMethodBeat.i(56260);
    if (this.BOT < 0)
    {
      this.BOw = 0;
      this.BOU = null;
      AppMethodBeat.o(56260);
      return;
    }
    if (this.BOV.limit > 0)
    {
      this.counter += 1;
      if (this.counter >= this.BOV.limit);
    }
    else
    {
      if (this.BOT <= this.BOV.BOQ.length())
        break label124;
    }
    this.BOU = new d(this.BOS, m.at(this.BOV.BOQ));
    label124: o localo;
    for (this.BOT = -1; ; this.BOT = -1)
    {
      this.BOw = 1;
      AppMethodBeat.o(56260);
      break;
      localo = (o)this.BOV.BOR.m(this.BOV.BOQ, Integer.valueOf(this.BOT));
      if (localo != null)
        break label191;
      this.BOU = new d(this.BOS, m.at(this.BOV.BOQ));
    }
    label191: int i = ((Number)localo.first).intValue();
    int j = ((Number)localo.second).intValue();
    this.BOU = a.h.e.il(this.BOS, i);
    this.BOS = (i + j);
    i = this.BOS;
    if (j == 0);
    for (j = 1; ; j = 0)
    {
      this.BOT = (j + i);
      break;
    }
  }

  public final boolean hasNext()
  {
    boolean bool = true;
    AppMethodBeat.i(56262);
    if (this.BOw == -1)
      ekK();
    if (this.BOw == 1)
      AppMethodBeat.o(56262);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56262);
    }
  }

  public final void remove()
  {
    AppMethodBeat.i(56264);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56264);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.k.e.a
 * JD-Core Version:    0.6.2
 */