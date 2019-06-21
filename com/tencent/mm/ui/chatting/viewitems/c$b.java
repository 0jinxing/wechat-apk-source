package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.h;
import com.tencent.mm.aj.h.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.protocal.protobuf.cwa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.d.a;
import java.util.LinkedList;

final class c$b
  implements h.a
{
  a cgL;
  private String uIG;

  protected c$b(a parama, String paramString)
  {
    this.uIG = paramString;
    this.cgL = parama;
  }

  public final String aeI()
  {
    return this.uIG;
  }

  public final void e(LinkedList<cwa> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(32791);
    z.aeS().b(this);
    ab.d("MicroMsg.ChattingItem", "onKFSceneEnd.");
    int j;
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      ab.i("MicroMsg.ChattingItem", "onKFSceneEnd, workers size : %d. callbackid=%s", new Object[] { Integer.valueOf(paramLinkedList.size()), this.uIG });
      if (this.cgL != null)
      {
        j = i;
        if (paramLinkedList != null)
        {
          if (paramLinkedList.size() != 0)
            break label103;
          j = i;
        }
        if (j != 0)
          al.d(new c.b.1(this));
      }
    }
    AppMethodBeat.o(32791);
    return;
    label103: for (int k = 0; ; k++)
    {
      j = i;
      if (k >= paramLinkedList.size())
        break;
      cwa localcwa = (cwa)paramLinkedList.get(k);
      if ((localcwa != null) && (!bo.isNullOrNil(localcwa.xrU)) && (localcwa.xrU.equals(this.uIG)))
      {
        ab.i("MicroMsg.ChattingItem", "needCallback find match kfopenid");
        if (!bo.isNullOrNil(localcwa.wCW))
        {
          ab.i("MicroMsg.ChattingItem", "needCallback: true");
          j = 1;
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.b
 * JD-Core Version:    0.6.2
 */