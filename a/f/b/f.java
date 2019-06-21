package a.f.b;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"})
public final class f
{
  private static final Object[] euk = new Object[0];

  public static final Object[] a(Collection<?> paramCollection, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56234);
    j.p(paramCollection, "collection");
    if (paramArrayOfObject == null)
    {
      paramCollection = (Throwable)new NullPointerException();
      AppMethodBeat.o(56234);
      throw paramCollection;
    }
    int j = paramCollection.size();
    if (j == 0)
    {
      if (paramArrayOfObject.length > 0)
        paramArrayOfObject[0] = null;
      AppMethodBeat.o(56234);
    }
    Iterator localIterator;
    while (true)
    {
      return paramArrayOfObject;
      localIterator = paramCollection.iterator();
      if (localIterator.hasNext())
        break;
      if (paramArrayOfObject.length > 0)
        paramArrayOfObject[0] = null;
      AppMethodBeat.o(56234);
    }
    if (j <= paramArrayOfObject.length)
      paramCollection = paramArrayOfObject;
    while (true)
    {
      j = i + 1;
      paramCollection[i] = localIterator.next();
      if (j >= paramCollection.length)
      {
        if (!localIterator.hasNext())
        {
          AppMethodBeat.o(56234);
          paramArrayOfObject = paramCollection;
          break;
          paramCollection = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), j);
          if (paramCollection == null)
          {
            paramCollection = new v("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            AppMethodBeat.o(56234);
            throw paramCollection;
          }
          paramCollection = (Object[])paramCollection;
          continue;
        }
        int k = j * 3 + 1 >>> 1;
        i = k;
        if (k <= j)
        {
          if (j >= 2147483645)
          {
            paramCollection = (Throwable)new OutOfMemoryError();
            AppMethodBeat.o(56234);
            throw paramCollection;
          }
          i = 2147483645;
        }
        paramCollection = Arrays.copyOf(paramCollection, i);
        j.o(paramCollection, "Arrays.copyOf(result, newSize)");
        i = j;
        continue;
      }
      if (!localIterator.hasNext())
      {
        if (paramCollection == paramArrayOfObject)
        {
          paramArrayOfObject[j] = null;
          AppMethodBeat.o(56234);
          break;
        }
        paramArrayOfObject = Arrays.copyOf(paramCollection, j);
        j.o(paramArrayOfObject, "Arrays.copyOf(result, size)");
        AppMethodBeat.o(56234);
        break;
      }
      i = j;
    }
  }

  public static final Object[] j(Collection<?> paramCollection)
  {
    AppMethodBeat.i(56233);
    j.p(paramCollection, "collection");
    int i = paramCollection.size();
    if (i == 0)
    {
      paramCollection = euk;
      AppMethodBeat.o(56233);
    }
    Iterator localIterator;
    while (true)
    {
      return paramCollection;
      localIterator = paramCollection.iterator();
      if (localIterator.hasNext())
        break;
      paramCollection = euk;
      AppMethodBeat.o(56233);
    }
    paramCollection = new Object[i];
    i = 0;
    while (true)
    {
      int j = i + 1;
      paramCollection[i] = localIterator.next();
      if (j >= paramCollection.length)
      {
        if (!localIterator.hasNext())
        {
          AppMethodBeat.o(56233);
          break;
        }
        int k = j * 3 + 1 >>> 1;
        i = k;
        if (k <= j)
        {
          if (j >= 2147483645)
          {
            paramCollection = (Throwable)new OutOfMemoryError();
            AppMethodBeat.o(56233);
            throw paramCollection;
          }
          i = 2147483645;
        }
        paramCollection = Arrays.copyOf(paramCollection, i);
        j.o(paramCollection, "Arrays.copyOf(result, newSize)");
        i = j;
        continue;
      }
      if (!localIterator.hasNext())
      {
        paramCollection = Arrays.copyOf(paramCollection, j);
        j.o(paramCollection, "Arrays.copyOf(result, size)");
        AppMethodBeat.o(56233);
        break;
      }
      i = j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.f.b.f
 * JD-Core Version:    0.6.2
 */