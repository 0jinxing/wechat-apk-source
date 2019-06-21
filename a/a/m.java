package a.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, dWr=1)
public class m extends l
{
  public static final <T> int d(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56029);
    j.p(paramIterable, "receiver$0");
    int i;
    if ((paramIterable instanceof Collection))
    {
      i = ((Collection)paramIterable).size();
      AppMethodBeat.o(56029);
    }
    while (true)
    {
      return i;
      i = 10;
      AppMethodBeat.o(56029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.m
 * JD-Core Version:    0.6.2
 */