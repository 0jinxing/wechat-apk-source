package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class kr
  implements kq
{
  static <T extends kv> T a(List<T> paramList1, List<T> paramList2, ky paramky)
  {
    AppMethodBeat.i(100264);
    Iterator localIterator = paramList1.iterator();
    paramList2 = null;
    paramList1 = null;
    if (localIterator.hasNext())
    {
      kv localkv = (kv)localIterator.next();
      double d = paramky.b(localkv.b().a()).g();
      if ((paramList2 != null) && (d >= paramList2.doubleValue()))
        break label91;
      paramList2 = Double.valueOf(d);
      paramList1 = localkv;
    }
    label91: 
    while (true)
    {
      break;
      AppMethodBeat.o(100264);
      return paramList1;
    }
  }

  static <T extends kv> la<T> a(List<T> paramList)
  {
    AppMethodBeat.i(100265);
    Iterator localIterator1 = paramList.iterator();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    while (localIterator1.hasNext())
    {
      kv localkv = (kv)localIterator1.next();
      Iterator localIterator2 = paramList.iterator();
      Object localObject4 = localObject3;
      Object localObject5 = localObject2;
      Object localObject6 = localObject1;
      localObject1 = localObject6;
      localObject2 = localObject5;
      localObject3 = localObject4;
      if (localIterator2.hasNext())
      {
        localObject3 = (kv)localIterator2.next();
        if (localkv == localObject3)
          break label216;
        double d = localkv.b().a().b(((kv)localObject3).b().a()).g();
        if ((localObject6 != null) && (d <= ((Double)localObject6).doubleValue()))
          break label216;
        localObject6 = Double.valueOf(d);
        localObject4 = localkv;
        localObject5 = localObject3;
      }
    }
    label216: 
    while (true)
    {
      break;
      if (localObject3 != null)
      {
        paramList = new la(localObject3, localObject2);
        AppMethodBeat.o(100265);
      }
      while (true)
      {
        return paramList;
        paramList = new la(paramList.get(0), paramList.get(1));
        AppMethodBeat.o(100265);
      }
    }
  }

  private <T extends kv> void a(List<T> paramList1, List<T> paramList2, List<T> paramList3, int paramInt)
  {
    AppMethodBeat.i(100263);
    ky localky1 = ks.a(paramList1);
    ky localky2 = ks.a(paramList2);
    kv localkv1 = a(paramList3, paramList1, localky1);
    kv localkv2 = a(paramList3, paramList2, localky2);
    int i;
    if (localkv1.b().a().b(localky1).g() <= localkv2.b().a().b(localky2).g())
    {
      i = 1;
      if (((i == 0) || (paramList2.size() + paramList3.size() - 1 < paramInt)) && ((i != 0) || (paramList1.size() + paramList3.size() != paramInt)))
        break label160;
      paramList1.add(localkv1);
      paramList3.remove(localkv1);
      AppMethodBeat.o(100263);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label160: paramList2.add(localkv2);
      paramList3.remove(localkv2);
      AppMethodBeat.o(100263);
    }
  }

  public final <T extends kv> kw<T> a(List<T> paramList, int paramInt)
  {
    AppMethodBeat.i(100262);
    if (paramList.size() < 2)
    {
      paramList = new IllegalArgumentException();
      AppMethodBeat.o(100262);
      throw paramList;
    }
    la localla = a(paramList);
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(localla.a());
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(localla.b());
    ArrayList localArrayList3 = new ArrayList(paramList);
    localArrayList3.remove(localla.a());
    localArrayList3.remove(localla.b());
    paramInt = paramList.size() / 2;
    while (localArrayList3.size() > 0)
      a(localArrayList1, localArrayList2, localArrayList3, paramInt);
    paramList = new kw(localArrayList1, localArrayList2);
    AppMethodBeat.o(100262);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kr
 * JD-Core Version:    0.6.2
 */