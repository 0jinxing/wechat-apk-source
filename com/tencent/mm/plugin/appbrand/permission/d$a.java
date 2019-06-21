package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;

final class d$a
{
  final HashMap<String, HashSet<String>> iwD;

  private d$a()
  {
    AppMethodBeat.i(102255);
    this.iwD = new HashMap();
    AppMethodBeat.o(102255);
  }

  final void K(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102258);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(102258);
    while (true)
    {
      return;
      try
      {
        paramString1 = (HashSet)this.iwD.get(paramString1);
        if (paramString1 != null)
          paramString1.remove(paramString2);
        AppMethodBeat.o(102258);
      }
      finally
      {
        AppMethodBeat.o(102258);
      }
    }
    throw paramString1;
  }

  final boolean cL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102256);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(102256);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramString1 = (HashSet)this.iwD.get(paramString1);
        if ((paramString1 != null) && (paramString1.contains(paramString2)));
        for (bool = true; ; bool = false)
        {
          AppMethodBeat.o(102256);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(102256);
      }
    }
    throw paramString1;
  }

  final void put(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102257);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(102257);
    while (true)
    {
      return;
      try
      {
        HashSet localHashSet1 = (HashSet)this.iwD.get(paramString1);
        HashSet localHashSet2 = localHashSet1;
        if (localHashSet1 == null)
        {
          localHashSet2 = new java/util/HashSet;
          localHashSet2.<init>();
          this.iwD.put(paramString1, localHashSet2);
        }
        localHashSet2.add(paramString2);
        AppMethodBeat.o(102257);
      }
      finally
      {
        AppMethodBeat.o(102257);
      }
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.a
 * JD-Core Version:    0.6.2
 */