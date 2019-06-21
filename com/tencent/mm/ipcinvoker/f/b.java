package com.tencent.mm.ipcinvoker.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{
  private static final Set<Object> eGD;
  private static final Map<String, Set<c>> eGg;

  static
  {
    AppMethodBeat.i(114115);
    eGD = new HashSet();
    eGg = new HashMap();
    AppMethodBeat.o(114115);
  }

  public static boolean a(String paramString, c paramc)
  {
    AppMethodBeat.i(114112);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(114112);
      bool = false;
      return bool;
    }
    label133: 
    while (true)
      while (true)
      {
        Object localObject;
        synchronized (eGg)
        {
          localObject = (Set)eGg.get(paramString);
          if (localObject != null)
            break label133;
          localObject = new java/util/HashSet;
          ((HashSet)localObject).<init>();
          eGg.put(paramString, localObject);
          com.tencent.mm.ipcinvoker.h.b.i("IPC.ObjectRecycler", "addIntoSet(%s)", new Object[] { paramString });
        }
        try
        {
          bool = ((Set)localObject).add(paramc);
          AppMethodBeat.o(114112);
          break;
          paramString = finally;
          throw paramString;
        }
        finally
        {
          AppMethodBeat.o(114112);
        }
      }
  }

  public static void as(Object paramObject)
  {
    AppMethodBeat.i(114110);
    eGD.add(paramObject);
    AppMethodBeat.o(114110);
  }

  public static void at(Object paramObject)
  {
    AppMethodBeat.i(114111);
    eGD.remove(paramObject);
    AppMethodBeat.o(114111);
  }

  public static boolean b(String paramString, c paramc)
  {
    AppMethodBeat.i(114113);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(114113);
      bool = false;
    }
    while (true)
    {
      return bool;
      Set localSet;
      synchronized (eGg)
      {
        localSet = (Set)eGg.get(paramString);
        if (localSet == null)
        {
          AppMethodBeat.o(114113);
          bool = false;
        }
      }
      com.tencent.mm.ipcinvoker.h.b.i("IPC.ObjectRecycler", "removeFromSet(%s)", new Object[] { paramString });
      try
      {
        bool = localSet.remove(paramc);
        AppMethodBeat.o(114113);
      }
      finally
      {
        AppMethodBeat.o(114113);
      }
    }
  }

  public static void lk(String paramString)
  {
    AppMethodBeat.i(114114);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(114114);
    while (true)
    {
      return;
      Set localSet;
      synchronized (eGg)
      {
        localSet = (Set)eGg.remove(paramString);
        if (localSet == null)
          AppMethodBeat.o(114114);
      }
      com.tencent.mm.ipcinvoker.h.b.i("IPC.ObjectRecycler", "recycleAll(%s)", new Object[] { paramString });
      try
      {
        paramString = localSet.iterator();
        while (paramString.hasNext())
        {
          ??? = (c)paramString.next();
          com.tencent.mm.ipcinvoker.h.b.i("IPC.ObjectRecycler", "recycle(%s)", new Object[] { Integer.valueOf(???.hashCode()) });
          ((c)???).recycle();
        }
      }
      finally
      {
        AppMethodBeat.o(114114);
      }
      localSet.clear();
      AppMethodBeat.o(114114);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.f.b
 * JD-Core Version:    0.6.2
 */