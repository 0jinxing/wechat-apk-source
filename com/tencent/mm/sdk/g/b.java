package com.tencent.mm.sdk.g;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class b<R>
{
  private HashMap<String, LinkedList<R>> cS;

  static
  {
    AppMethodBeat.i(52529);
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(52529);
      return;
    }
  }

  public b()
  {
    AppMethodBeat.i(52523);
    this.cS = new HashMap();
    AppMethodBeat.o(52523);
  }

  private boolean i(R paramR, String paramString)
  {
    try
    {
      AppMethodBeat.i(52526);
      boolean bool;
      if (paramR == null)
      {
        AppMethodBeat.o(52526);
        bool = false;
      }
      while (true)
      {
        return bool;
        LinkedList localLinkedList = (LinkedList)this.cS.get(paramString);
        if (localLinkedList != null)
        {
          bool = localLinkedList.remove(paramR);
          if ((bool) && (localLinkedList.size() == 0))
            this.cS.remove(paramString);
          AppMethodBeat.o(52526);
        }
        else
        {
          AppMethodBeat.o(52526);
          bool = false;
        }
      }
    }
    finally
    {
    }
    throw paramR;
  }

  public final LinkedList<R> anK(String paramString)
  {
    try
    {
      AppMethodBeat.i(52528);
      if ((paramString == null) || ("".equals(paramString)) || (!this.cS.containsKey(paramString)))
      {
        paramString = new java/util/LinkedList;
        paramString.<init>();
        AppMethodBeat.o(52528);
      }
      while (true)
      {
        return paramString;
        paramString = (LinkedList)this.cS.remove(paramString);
        AppMethodBeat.o(52528);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final R g(R paramR, String paramString)
  {
    try
    {
      AppMethodBeat.i(52524);
      i(paramR, paramString);
      paramR = (LinkedList)this.cS.get(paramString);
      if ((paramR == null) || (paramR.size() <= 0))
      {
        paramR = null;
        AppMethodBeat.o(52524);
      }
      while (true)
      {
        return paramR;
        paramR = paramR.getFirst();
        AppMethodBeat.o(52524);
      }
    }
    finally
    {
    }
    throw paramR;
  }

  public final boolean h(R paramR, String paramString)
  {
    try
    {
      AppMethodBeat.i(52525);
      if ((!$assertionsDisabled) && (paramR == null))
      {
        paramR = new java/lang/AssertionError;
        paramR.<init>();
        AppMethodBeat.o(52525);
        throw paramR;
      }
    }
    finally
    {
    }
    if ((!$assertionsDisabled) && (TextUtils.isEmpty(paramString)))
    {
      paramR = new java/lang/AssertionError;
      paramR.<init>();
      AppMethodBeat.o(52525);
      throw paramR;
    }
    LinkedList localLinkedList = (LinkedList)this.cS.get(paramString);
    if (localLinkedList == null)
    {
      HashMap localHashMap = this.cS;
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      localHashMap.put(paramString, localLinkedList);
    }
    for (paramString = localLinkedList; ; paramString = localLinkedList)
    {
      if (paramString.size() == 0);
      for (boolean bool = true; ; bool = false)
      {
        paramString.add(paramR);
        AppMethodBeat.o(52525);
        return bool;
      }
    }
  }

  public final boolean remove(R paramR)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(52527);
        if (paramR == null)
        {
          AppMethodBeat.o(52527);
          bool1 = false;
          return bool1;
        }
        Iterator localIterator1 = this.cS.values().iterator();
        boolean bool1 = false;
        if (localIterator1.hasNext())
        {
          Iterator localIterator2 = ((LinkedList)localIterator1.next()).iterator();
          int i = 1;
          boolean bool2 = bool1;
          if (localIterator2.hasNext())
          {
            if (paramR == localIterator2.next())
            {
              localIterator2.remove();
              bool2 = true;
              continue;
            }
            i = 0;
            continue;
          }
          bool1 = bool2;
          if (i == 0)
            continue;
          localIterator1.remove();
          bool1 = bool2;
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(52527);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b
 * JD-Core Version:    0.6.2
 */