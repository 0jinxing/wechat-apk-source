package com.tencent.mm.plugin.hp.tinker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.protocal.protobuf.bhv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f extends com.tinkerboots.sdk.a.a.a
{
  public final void L(Map<String, String> paramMap)
  {
    AppMethodBeat.i(90659);
    super.L(paramMap);
    com.tencent.mm.plugin.hp.b.b.wW(2);
    String str1 = "tinker_id_" + com.tencent.mm.loader.j.a.Ul();
    if (com.tencent.mm.loader.j.a.eSh == null);
    LinkedList localLinkedList;
    for (String str2 = ""; ; str2 = "tinker_id_" + com.tencent.mm.loader.j.a.eSh)
    {
      localLinkedList = new LinkedList();
      localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        localObject = new bhv();
        ((bhv)localObject).key = str3;
        ((bhv)localObject).value = ((String)paramMap.get(str3));
        localLinkedList.add(localObject);
      }
    }
    Object localObject = new StringBuilder();
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramMap = (bhv)localIterator.next();
      ((StringBuilder)localObject).append(paramMap.key).append(":").append(paramMap.value).append("\n");
    }
    ab.i("Tinker.TinkerPatchRequestCallback", "checkAvailableUpdate BaseID:%s PatchID:%s config:%s", new Object[] { str1, str2, ((StringBuilder)localObject).toString() });
    paramMap = new com.tencent.mm.plugin.hp.c.b(str1, str2, localLinkedList);
    g.Rg().a(paramMap, 0);
    AppMethodBeat.o(90659);
  }

  public final boolean bGs()
  {
    AppMethodBeat.i(90658);
    boolean bool = super.bGs();
    AppMethodBeat.o(90658);
    return bool;
  }

  public final void bGt()
  {
    AppMethodBeat.i(90660);
    super.bGt();
    long l = com.tencent.mm.kernel.a.Ra();
    Object localObject = com.tinkerboots.sdk.a.dWj().iN("uin", String.valueOf(l & 0xFFFFFFFF));
    if (at.isWifi(ah.getContext()));
    for (int i = 3; ; i = 2)
    {
      ((com.tinkerboots.sdk.a)localObject).iN("network", String.valueOf(i));
      localObject = ((c)g.K(c.class)).aVJ();
      if (localObject == null)
        break;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (com.tencent.mm.plugin.boots.a.a)localIterator.next();
        com.tinkerboots.sdk.a.dWj().iN(Integer.toHexString(((com.tencent.mm.plugin.boots.a.a)localObject).field_key), String.valueOf(((com.tencent.mm.plugin.boots.a.a)localObject).field_dau));
      }
    }
    AppMethodBeat.o(90660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.f
 * JD-Core Version:    0.6.2
 */