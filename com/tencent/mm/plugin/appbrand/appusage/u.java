package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.j.a;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.protocal.protobuf.cwq;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

 enum u
{
  static void a(int paramInt, LinkedList<cwq> paramLinkedList)
  {
    AppMethodBeat.i(129665);
    HashSet localHashSet = new HashSet();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      localObject = (cwq)paramLinkedList.next();
      if (!bo.isNullOrNil(((cwq)localObject).username))
        localHashSet.add(((cwq)localObject).username);
    }
    Object localObject = new ArrayList(localHashSet.size());
    ((List)localObject).addAll(localHashSet);
    if (paramInt == 3);
    for (paramLinkedList = j.a.hhl; ; paramLinkedList = j.a.hhk)
    {
      r.a((List)localObject, paramLinkedList);
      AppMethodBeat.o(129665);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.u
 * JD-Core Version:    0.6.2
 */