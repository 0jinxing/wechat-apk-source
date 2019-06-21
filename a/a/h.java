package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"asList", "", "T", "", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "binarySearch", "element", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;II)I", "([Ljava/lang/Object;Ljava/lang/Object;II)I", "contentDeepEquals", "other", "contentDeepEqualsInline", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepHashCode", "contentDeepHashCodeInline", "([Ljava/lang/Object;)I", "contentDeepToString", "", "contentDeepToStringInline", "([Ljava/lang/Object;)Ljava/lang/String;", "contentEquals", "contentHashCode", "contentToString", "copyInto", "destination", "destinationOffset", "startIndex", "endIndex", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "copyOf", "([Ljava/lang/Object;)[Ljava/lang/Object;", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRange", "copyOfRangeInline", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "copyOfRangeImpl", "fill", "", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "filterIsInstance", "R", "klass", "Ljava/lang/Class;", "([Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;", "filterIsInstanceTo", "C", "", "([Ljava/lang/Object;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "plus", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "elements", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "", "([Ljava/lang/Object;Ljava/util/Collection;)[Ljava/lang/Object;", "plusElement", "sort", "([Ljava/lang/Object;)V", "", "([Ljava/lang/Comparable;)V", "([Ljava/lang/Object;II)V", "sortWith", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "toSortedSet", "Ljava/util/SortedSet;", "([Ljava/lang/Comparable;)Ljava/util/SortedSet;", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/SortedSet;", "toTypedArray", "([Z)[Ljava/lang/Boolean;", "([B)[Ljava/lang/Byte;", "([C)[Ljava/lang/Character;", "([D)[Ljava/lang/Double;", "([F)[Ljava/lang/Float;", "([I)[Ljava/lang/Integer;", "([J)[Ljava/lang/Long;", "([S)[Ljava/lang/Short;", "kotlin-stdlib"}, dWr=1)
public class h extends g
{
  public static final List<Integer> I(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(56220);
    j.p(paramArrayOfInt, "receiver$0");
    paramArrayOfInt = (List)new h.a(paramArrayOfInt);
    AppMethodBeat.o(56220);
    return paramArrayOfInt;
  }

  public static final <T> void a(T[] paramArrayOfT, Comparator<? super T> paramComparator)
  {
    AppMethodBeat.i(56224);
    j.p(paramArrayOfT, "receiver$0");
    j.p(paramComparator, "comparator");
    if (paramArrayOfT.length > 1)
      Arrays.sort(paramArrayOfT, paramComparator);
    AppMethodBeat.o(56224);
  }

  public static final <T> List<T> asList(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56219);
    j.p(paramArrayOfT, "receiver$0");
    paramArrayOfT = Arrays.asList(paramArrayOfT);
    j.o(paramArrayOfT, "ArraysUtilJVM.asList(this)");
    AppMethodBeat.o(56219);
    return paramArrayOfT;
  }

  public static final <T> T[] copyOfRange(T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(56221);
    j.p(paramArrayOfT, "receiver$0");
    int i = paramArrayOfT.length;
    if (paramInt2 > i)
    {
      paramArrayOfT = (Throwable)new IndexOutOfBoundsException("toIndex (" + paramInt2 + ") is greater than size (" + i + ").");
      AppMethodBeat.o(56221);
      throw paramArrayOfT;
    }
    paramArrayOfT = Arrays.copyOfRange(paramArrayOfT, paramInt1, paramInt2);
    j.o(paramArrayOfT, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
    AppMethodBeat.o(56221);
    return paramArrayOfT;
  }

  public static final <T> void d(T[] paramArrayOfT, int paramInt)
  {
    AppMethodBeat.i(56222);
    j.p(paramArrayOfT, "receiver$0");
    Arrays.fill(paramArrayOfT, 0, paramInt, null);
    AppMethodBeat.o(56222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.a.h
 * JD-Core Version:    0.6.2
 */