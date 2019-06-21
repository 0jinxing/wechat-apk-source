package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ks
{
  public static ky a(Collection<? extends kv> paramCollection)
  {
    AppMethodBeat.i(100266);
    if (paramCollection.isEmpty())
    {
      paramCollection = new IllegalArgumentException();
      AppMethodBeat.o(100266);
      throw paramCollection;
    }
    Iterator localIterator = paramCollection.iterator();
    float f1 = 1.4E-45F;
    float f2 = 1.4E-45F;
    float f3 = 3.4028235E+38F;
    float f4 = 3.4028235E+38F;
    if (localIterator.hasNext())
    {
      paramCollection = ((kv)localIterator.next()).b().a();
      if (paramCollection.c() >= f4)
        break label177;
      f4 = paramCollection.c();
    }
    label177: 
    while (true)
    {
      float f5 = f3;
      if (paramCollection.d() < f3)
        f5 = paramCollection.d();
      f3 = f2;
      if (paramCollection.e() > f2)
        f3 = paramCollection.e();
      if (paramCollection.f() > f1)
        f1 = paramCollection.f();
      while (true)
      {
        f2 = f3;
        f3 = f5;
        break;
        paramCollection = ky.a(f4, f3, f2, f1);
        AppMethodBeat.o(100266);
        return paramCollection;
      }
    }
  }

  static <T> List<T> a(List<T> paramList, T paramT)
  {
    AppMethodBeat.i(100267);
    ArrayList localArrayList = new ArrayList(paramList.size() + 2);
    localArrayList.addAll(paramList);
    localArrayList.add(paramT);
    AppMethodBeat.o(100267);
    return localArrayList;
  }

  static <T> List<? extends T> a(List<? extends T> paramList, T paramT, List<T> paramList1)
  {
    AppMethodBeat.i(100268);
    ArrayList localArrayList = new ArrayList(paramList.size() + paramList1.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = localIterator.next();
      if (paramList != paramT)
        localArrayList.add(paramList);
    }
    localArrayList.addAll(paramList1);
    AppMethodBeat.o(100268);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ks
 * JD-Core Version:    0.6.2
 */