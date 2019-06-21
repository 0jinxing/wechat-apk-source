package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.luggage.a.e;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.n.a;
import java.util.ArrayList;

public final class c
{
  public static void cZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94180);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(762);
    localIDKey.SetKey(paramInt1);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(762);
    localIDKey.SetKey(paramInt2);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    ((a)e.C(a.class)).b(localArrayList, true);
    AppMethodBeat.o(94180);
  }

  public static void kT(int paramInt)
  {
    AppMethodBeat.i(94179);
    ((a)e.C(a.class)).f(762L, paramInt, 1L);
    AppMethodBeat.o(94179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c
 * JD-Core Version:    0.6.2
 */