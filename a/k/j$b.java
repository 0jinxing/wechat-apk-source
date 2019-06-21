package a.k;

import a.a.a;
import a.f.a.b;
import a.j.i;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.regex.MatchResult;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"})
public final class j$b extends a<f>
  implements h
{
  public final int getSize()
  {
    AppMethodBeat.i(56288);
    int i = this.BPd.BOZ.groupCount();
    AppMethodBeat.o(56288);
    return i + 1;
  }

  public final boolean isEmpty()
  {
    return false;
  }

  public final Iterator<f> iterator()
  {
    AppMethodBeat.i(56289);
    Iterator localIterator = i.d(a.a.j.t((Iterable)a.a.j.g(this)), (b)new j.b.a(this)).iterator();
    AppMethodBeat.o(56289);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.k.j.b
 * JD-Core Version:    0.6.2
 */