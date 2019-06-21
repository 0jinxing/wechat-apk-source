package a.j;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"})
public final class p<T, R>
  implements h<R>
{
  public final h<T> BOr;
  public final b<T, R> BOz;

  public p(h<? extends T> paramh, b<? super T, ? extends R> paramb)
  {
    AppMethodBeat.i(55937);
    this.BOr = paramh;
    this.BOz = paramb;
    AppMethodBeat.o(55937);
  }

  public final Iterator<R> iterator()
  {
    AppMethodBeat.i(55936);
    Iterator localIterator = (Iterator)new p.a(this);
    AppMethodBeat.o(55936);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.j.p
 * JD-Core Version:    0.6.2
 */