package com.tencent.mm.ipcinvoker.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class c
{
  private static volatile c eGt;
  Map<String, List<e>> eGu;

  private c()
  {
    AppMethodBeat.i(114074);
    this.eGu = new ConcurrentHashMap();
    AppMethodBeat.o(114074);
  }

  public static c PT()
  {
    AppMethodBeat.i(114073);
    if (eGt == null);
    try
    {
      if (eGt == null)
      {
        localc = new com/tencent/mm/ipcinvoker/d/c;
        localc.<init>();
        eGt = localc;
      }
      c localc = eGt;
      AppMethodBeat.o(114073);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(114073);
    }
  }

  public final boolean a(String paramString, e parame)
  {
    AppMethodBeat.i(114076);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(114076);
      bool = false;
    }
    while (true)
    {
      return bool;
      List localList = (List)this.eGu.get(paramString);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new LinkedList();
        this.eGu.put(paramString, localObject);
      }
      if (((List)localObject).contains(parame))
      {
        AppMethodBeat.o(114076);
        bool = false;
      }
      else
      {
        try
        {
          bool = ((List)localObject).add(parame);
          AppMethodBeat.o(114076);
        }
        finally
        {
          AppMethodBeat.o(114076);
        }
      }
    }
    throw paramString;
  }

  public final boolean b(String paramString, e parame)
  {
    AppMethodBeat.i(114077);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(114077);
      bool = false;
      return bool;
    }
    List localList = (List)this.eGu.get(paramString);
    if (localList != null);
    while (true)
    {
      try
      {
        bool = localList.remove(parame);
        if (localList.isEmpty())
          this.eGu.remove(paramString);
        AppMethodBeat.o(114077);
        break;
      }
      finally
      {
        AppMethodBeat.o(114077);
      }
      bool = false;
    }
  }

  public final boolean k(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(114075);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = false;
      AppMethodBeat.o(114075);
    }
    while (true)
    {
      return bool;
      paramString = (List)this.eGu.get(paramString);
      if ((paramString == null) || (paramString.isEmpty()))
      {
        AppMethodBeat.o(114075);
        bool = true;
      }
      else
      {
        try
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(paramString);
          paramString = localArrayList.iterator();
          while (paramString.hasNext())
            ((e)paramString.next()).ao(paramBundle);
        }
        finally
        {
          AppMethodBeat.o(114075);
        }
        AppMethodBeat.o(114075);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.d.c
 * JD-Core Version:    0.6.2
 */