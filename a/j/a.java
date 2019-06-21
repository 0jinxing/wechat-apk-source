package a.j;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/sequences/Sequence;)V", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "iterator", "", "kotlin-stdlib"})
public final class a<T>
  implements h<T>
{
  private final AtomicReference<h<T>> BOq;

  public a(h<? extends T> paramh)
  {
    AppMethodBeat.i(55952);
    this.BOq = new AtomicReference(paramh);
    AppMethodBeat.o(55952);
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(55951);
    Object localObject = (h)this.BOq.getAndSet(null);
    if (localObject == null)
    {
      localObject = (Throwable)new IllegalStateException("This sequence can be consumed only once.");
      AppMethodBeat.o(55951);
      throw ((Throwable)localObject);
    }
    localObject = ((h)localObject).iterator();
    AppMethodBeat.o(55951);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.j.a
 * JD-Core Version:    0.6.2
 */