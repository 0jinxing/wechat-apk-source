package com.tencent.mm.openim.room.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bgd;
import com.tencent.mm.protocal.protobuf.bge;
import com.tencent.mm.protocal.protobuf.qf;
import com.tencent.mm.storage.ad;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b$c
{
  public static ad a(ad paramad, bgd parambgd)
  {
    AppMethodBeat.i(78978);
    paramad.setUsername(parambgd.userName);
    paramad.iB(parambgd.bCu);
    AppMethodBeat.o(78978);
    return paramad;
  }

  public static LinkedList<qf> ao(List<bge> paramList)
  {
    AppMethodBeat.i(78979);
    LinkedList localLinkedList = new LinkedList();
    if (paramList == null)
      AppMethodBeat.o(78979);
    while (true)
    {
      return localLinkedList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        bge localbge = (bge)paramList.next();
        qf localqf = new qf();
        localqf.jBB = localbge.userName;
        localqf.jCH = localbge.bCu;
        localqf.vXl = localbge.eoz;
        localqf.vXm = localbge.wcj;
        localqf.vXn = localbge.wck;
        localqf.vXo = localbge.wKg;
        localqf.vXp = localbge.wKi;
        localLinkedList.add(localqf);
      }
      AppMethodBeat.o(78979);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.b.c
 * JD-Core Version:    0.6.2
 */