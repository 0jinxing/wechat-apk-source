package com.tencent.mm.openim.room.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bgc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b$a
{
  public static LinkedList<bgc> an(List<String> paramList)
  {
    AppMethodBeat.i(78975);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      bgc localbgc = new bgc();
      localbgc.userName = str;
      localLinkedList.add(localbgc);
    }
    AppMethodBeat.o(78975);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.b.a
 * JD-Core Version:    0.6.2
 */