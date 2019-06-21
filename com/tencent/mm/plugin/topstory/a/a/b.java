package com.tencent.mm.plugin.topstory.a.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class b
{
  public static void cFr()
  {
    AppMethodBeat.i(96379);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      IDKey localIDKey1 = new com/tencent/mars/smc/IDKey;
      localIDKey1.<init>();
      localIDKey1.SetID(990);
      localIDKey1.SetValue(1L);
      localIDKey1.SetKey(0);
      IDKey localIDKey2 = new com/tencent/mars/smc/IDKey;
      localIDKey2.<init>();
      localIDKey2.SetID(990);
      localIDKey2.SetValue(1L);
      localIDKey2.SetKey(1);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.pYm.b(localArrayList, false);
      AppMethodBeat.o(96379);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(96379);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.a.b
 * JD-Core Version:    0.6.2
 */