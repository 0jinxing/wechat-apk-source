package a.j;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"})
public final class f<T, R, E>
  implements h<E>
{
  final b<R, Iterator<E>> BOA;
  final h<T> BOr;
  final b<T, R> BOz;

  public f(h<? extends T> paramh, b<? super T, ? extends R> paramb, b<? super R, ? extends Iterator<? extends E>> paramb1)
  {
    AppMethodBeat.i(55931);
    this.BOr = paramh;
    this.BOz = paramb;
    this.BOA = paramb1;
    AppMethodBeat.o(55931);
  }

  public final Iterator<E> iterator()
  {
    AppMethodBeat.i(55930);
    Iterator localIterator = (Iterator)new f.a(this);
    AppMethodBeat.o(55930);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.j.f
 * JD-Core Version:    0.6.2
 */