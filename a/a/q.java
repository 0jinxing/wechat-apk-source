package a.a;

import a.f.a.b;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "shuffle", "random", "Lkotlin/random/Random;", "shuffled", "", "kotlin-stdlib"}, dWr=1)
public class q extends p
{
  public static final <T> boolean a(Iterable<? extends T> paramIterable, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(56202);
    j.p(paramIterable, "receiver$0");
    j.p(paramb, "predicate");
    paramIterable = paramIterable.iterator();
    boolean bool = false;
    if (paramIterable.hasNext())
    {
      if (((Boolean)paramb.am(paramIterable.next())).booleanValue())
        break label74;
      paramIterable.remove();
      bool = true;
    }
    label74: 
    while (true)
    {
      break;
      AppMethodBeat.o(56202);
      return bool;
    }
  }

  public static final <T> boolean a(Collection<? super T> paramCollection, Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56201);
    j.p(paramCollection, "receiver$0");
    j.p(paramIterable, "elements");
    boolean bool;
    if ((paramIterable instanceof Collection))
    {
      bool = paramCollection.addAll((Collection)paramIterable);
      AppMethodBeat.o(56201);
    }
    while (true)
    {
      return bool;
      bool = false;
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
        if (paramCollection.add(paramIterable.next()))
          bool = true;
      AppMethodBeat.o(56201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.a.q
 * JD-Core Version:    0.6.2
 */