package a.j;

import a.a.e;
import a.f.a.b;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, dWr=1)
public class l extends k
{
  public static final <T> h<T> Z(T[] paramArrayOfT)
  {
    AppMethodBeat.i(55979);
    j.p(paramArrayOfT, "elements");
    int i;
    if (paramArrayOfT.length == 0)
    {
      i = 1;
      if (i == 0)
        break label41;
      paramArrayOfT = (h)d.BOt;
      AppMethodBeat.o(55979);
    }
    while (true)
    {
      return paramArrayOfT;
      i = 0;
      break;
      label41: paramArrayOfT = e.T(paramArrayOfT);
      AppMethodBeat.o(55979);
    }
  }

  public static final <T> h<T> a(h<? extends T> paramh)
  {
    AppMethodBeat.i(55980);
    j.p(paramh, "receiver$0");
    paramh = (h)new a(paramh);
    AppMethodBeat.o(55980);
    return paramh;
  }

  public static final <T> h<T> a(T paramT, b<? super T, ? extends T> paramb)
  {
    AppMethodBeat.i(55982);
    j.p(paramb, "nextFunction");
    if (paramT == null)
    {
      paramT = (h)d.BOt;
      AppMethodBeat.o(55982);
    }
    while (true)
    {
      return paramT;
      paramT = (h)new g((a.f.a.a)new l.d(paramT), paramb);
      AppMethodBeat.o(55982);
    }
  }

  public static final <T> h<T> k(a.f.a.a<? extends T> parama)
  {
    AppMethodBeat.i(55981);
    j.p(parama, "nextFunction");
    parama = i.a((h)new g(parama, (b)new l.c(parama)));
    AppMethodBeat.o(55981);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.j.l
 * JD-Core Version:    0.6.2
 */