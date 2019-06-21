package com.tencent.mm.modelappbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class b$d
{
  private final ak fqr;
  final Map<String, List<b.d.a>> fqs;
  final Map<String, Boolean> fqt;

  private b$d(ak paramak)
  {
    AppMethodBeat.i(77333);
    this.fqs = new HashMap();
    this.fqt = new HashMap();
    this.fqr = paramak;
    AppMethodBeat.o(77333);
  }

  final void a(String paramString, b.d.a parama)
  {
    AppMethodBeat.i(77337);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77337);
    while (true)
    {
      return;
      paramString = (List)this.fqs.get(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(77337);
      }
      else
      {
        paramString.remove(parama);
        AppMethodBeat.o(77337);
      }
    }
  }

  final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(77339);
    this.fqr.post(paramRunnable);
    AppMethodBeat.o(77339);
  }

  final void pJ(String paramString)
  {
    AppMethodBeat.i(77334);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77334);
    while (true)
    {
      return;
      paramString = (List)this.fqs.remove(paramString);
      if (bo.ek(paramString))
      {
        AppMethodBeat.o(77334);
      }
      else
      {
        paramString = paramString.iterator();
        while (paramString.hasNext())
          ((b.d.a)paramString.next()).abV();
        AppMethodBeat.o(77334);
      }
    }
  }

  final boolean pK(String paramString)
  {
    AppMethodBeat.i(77335);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(77335);
    }
    while (true)
    {
      return bool;
      bool = this.fqt.containsKey(paramString);
      AppMethodBeat.o(77335);
    }
  }

  final void pL(String paramString)
  {
    AppMethodBeat.i(77336);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77336);
    while (true)
    {
      return;
      this.fqt.remove(paramString);
      AppMethodBeat.o(77336);
    }
  }

  final void pM(String paramString)
  {
    AppMethodBeat.i(77338);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77338);
    while (true)
    {
      return;
      paramString = (List)this.fqs.remove(paramString);
      if (!bo.ek(paramString))
      {
        Iterator localIterator = paramString.iterator();
        while (localIterator.hasNext())
          ((b.d.a)localIterator.next()).abW();
        paramString.clear();
      }
      AppMethodBeat.o(77338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.d
 * JD-Core Version:    0.6.2
 */