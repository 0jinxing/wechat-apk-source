package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bw
{
  public static String a;
  private static String b;
  private static Map<Integer, bw.a> c;
  private static Map<String, bw.a> d;
  private static ce.a e;

  static
  {
    AppMethodBeat.i(98598);
    b = "AccessIpMgr";
    c = new ConcurrentHashMap();
    d = new ConcurrentHashMap();
    e = new ce.a();
    AppMethodBeat.o(98598);
  }

  public static cc a(String paramString)
  {
    AppMethodBeat.i(98595);
    Object localObject = (bw.a)d.get(paramString);
    if (localObject != null)
    {
      paramString = new cc(((bw.a)localObject).b, ((bw.a)localObject).d);
      paramString.c = ((bw.a)localObject).a();
      AppMethodBeat.o(98595);
    }
    while (true)
    {
      return paramString;
      localObject = new bu(paramString, -1);
      ((bu)localObject).a((byte)3);
      paramString = new cc(paramString, "");
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject);
      paramString.c = localArrayList;
      AppMethodBeat.o(98595);
    }
  }

  public static void a()
  {
    AppMethodBeat.i(98592);
    bt.j().post(new ca());
    AppMethodBeat.o(98592);
  }

  public static void a(String paramString, bu parambu, int paramInt)
  {
    AppMethodBeat.i(98596);
    paramString = (bw.a)d.get(paramString);
    if ((paramString != null) && (paramInt != 0))
      paramString.b(parambu);
    AppMethodBeat.o(98596);
  }

  public static void b()
  {
    AppMethodBeat.i(98593);
    en.d().f();
    AppMethodBeat.o(98593);
  }

  public static void c()
  {
    AppMethodBeat.i(98594);
    Object localObject1 = en.d().f().a();
    if (localObject1 != null)
    {
      d.clear();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        cc localcc = (cc)localIterator.next();
        localObject1 = new bw.a(a);
        ((bw.a)localObject1).b = localcc.a;
        ((bw.a)localObject1).d = localcc.b;
        Object localObject2 = localcc.c.iterator();
        while (((Iterator)localObject2).hasNext())
          ((bw.a)localObject1).a((bu)((Iterator)localObject2).next());
        localObject2 = new bu(localcc.a, -1);
        ((bu)localObject2).a((byte)3);
        ((bw.a)localObject1).a((bu)localObject2);
        d.put(localcc.a, localObject1);
      }
    }
    AppMethodBeat.o(98594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bw
 * JD-Core Version:    0.6.2
 */