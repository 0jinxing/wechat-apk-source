package com.tencent.mm.openim.room.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bgd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b$b
{
  public final List<String> cGa;
  public final List<String> cGc;
  public final List<String> cGd;
  public final List<String> ehj;
  public final List<String> ehk;
  public final List<String> ehl;

  public b$b()
  {
    AppMethodBeat.i(78976);
    this.ehj = new ArrayList();
    this.cGa = new ArrayList();
    this.ehk = new ArrayList();
    this.cGc = new ArrayList();
    this.cGd = new ArrayList();
    this.ehl = new ArrayList();
    AppMethodBeat.o(78976);
  }

  public final void q(LinkedList<bgd> paramLinkedList)
  {
    AppMethodBeat.i(78977);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bgd localbgd = (bgd)paramLinkedList.next();
      int i = localbgd.status;
      if (i == 0)
      {
        this.ehj.add(localbgd.userName);
      }
      else if (i == 3)
      {
        ab.d("OpenIMChatRoomMember.Classifier", " blacklist : " + localbgd.userName);
        this.ehk.add(localbgd.userName);
      }
      else if (i == 1)
      {
        ab.d("OpenIMChatRoomMember.Classifier", " not user : " + localbgd.userName);
        this.cGc.add(localbgd.userName);
      }
      else if (i == 2)
      {
        ab.d("OpenIMChatRoomMember.Classifier", " invalid username : " + localbgd.userName);
        this.cGa.add(localbgd.userName);
      }
      else if (i == 4)
      {
        ab.d("OpenIMChatRoomMember.Classifier", " verify user : " + localbgd.userName);
        this.cGd.add(localbgd.userName);
      }
      else if (i != 5)
      {
        if (i == 6)
          this.ehl.add(localbgd.userName);
        else
          ab.w("OpenIMChatRoomMember.Classifier", "unknown member status : status = ".concat(String.valueOf(i)));
      }
    }
    AppMethodBeat.o(78977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.b.b
 * JD-Core Version:    0.6.2
 */