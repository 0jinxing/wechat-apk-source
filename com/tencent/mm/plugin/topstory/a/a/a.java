package com.tencent.mm.plugin.topstory.a.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import java.util.ArrayList;

public final class a
{
  public static int ID = 845;

  public static void a(com.tencent.mm.plugin.topstory.a.b.a parama)
  {
    AppMethodBeat.i(96378);
    ArrayList localArrayList;
    IDKey localIDKey;
    if (parama.sAP > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(ID);
      localIDKey.SetKey(0);
      localIDKey.SetValue(parama.sAP);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(ID);
      localIDKey.SetKey(1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      e.pXa.b(localArrayList, false);
    }
    if (parama.sAG > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(ID);
      localIDKey.SetKey(2);
      localIDKey.SetValue(parama.sAG);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(ID);
      localIDKey.SetKey(3);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      e.pXa.b(localArrayList, false);
    }
    if (parama.sAQ > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(ID);
      localIDKey.SetKey(4);
      localIDKey.SetValue(parama.sAQ);
      localArrayList.add(localIDKey);
      parama = new IDKey();
      parama.SetID(ID);
      parama.SetKey(5);
      parama.SetValue(1L);
      localArrayList.add(parama);
      e.pXa.b(localArrayList, false);
    }
    AppMethodBeat.o(96378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.a.a
 * JD-Core Version:    0.6.2
 */