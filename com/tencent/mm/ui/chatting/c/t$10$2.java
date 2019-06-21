package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.LinkedList;

final class t$10$2
  implements ao.b.a
{
  t$10$2(t.10 param10, String paramString)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(31490);
    com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.yQH.yQA.cgL.yTx.getContext(), new t.10.2.1(this));
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(3));
    aw.ZK();
    paramString = c.XM().aoO(t.e(this.yQH.yQA));
    if (paramString != null);
    for (paramString = bo.bc(paramString.dus, ""); ; paramString = "")
    {
      locala.ajw(paramString);
      locala.c(t.e(this.yQH.yQA), this.pku, localLinkedList);
      AppMethodBeat.o(31490);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.10.2
 * JD-Core Version:    0.6.2
 */