package a.k;

import a.f.a.m;
import a.h.d;
import a.j.h;
import a.l;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"})
final class e
  implements h<d>
{
  final CharSequence BOQ;
  final m<CharSequence, Integer, o<Integer, Integer>> BOR;
  final int jaQ;
  final int limit;

  public e(CharSequence paramCharSequence, m<? super CharSequence, ? super Integer, o<Integer, Integer>> paramm)
  {
    AppMethodBeat.i(56301);
    this.BOQ = paramCharSequence;
    this.jaQ = 0;
    this.limit = 0;
    this.BOR = paramm;
    AppMethodBeat.o(56301);
  }

  public final Iterator<d> iterator()
  {
    AppMethodBeat.i(56300);
    Iterator localIterator = (Iterator)new e.a(this);
    AppMethodBeat.o(56300);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.k.e
 * JD-Core Version:    0.6.2
 */