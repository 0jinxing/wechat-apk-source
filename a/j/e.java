package a.j;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
public final class e<T>
  implements h<T>
{
  final h<T> BOr;
  final boolean BOu;
  final b<T, Boolean> BOv;

  public e(h<? extends T> paramh, boolean paramBoolean, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(55923);
    this.BOr = paramh;
    this.BOu = paramBoolean;
    this.BOv = paramb;
    AppMethodBeat.o(55923);
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(55922);
    Iterator localIterator = (Iterator)new e.a(this);
    AppMethodBeat.o(55922);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.j.e
 * JD-Core Version:    0.6.2
 */