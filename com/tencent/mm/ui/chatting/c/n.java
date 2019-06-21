package com.tencent.mm.ui.chatting.c;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.l;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.c.b.z;

@com.tencent.mm.ui.chatting.c.a.a(dFp=l.class)
public class n extends a
  implements l
{
  @TargetApi(11)
  public final void cuB()
  {
    AppMethodBeat.i(31389);
    boolean bool1 = ((z)this.cgL.aF(z.class)).dES();
    boolean bool2 = ((z)this.cgL.aF(z.class)).dET();
    if ((bool1) || (bool2))
      AppMethodBeat.o(31389);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 11)
      {
        ab.d("MicroMsg.ChattingUI.DragDropComponent", "sdk not support dragdrop event");
        AppMethodBeat.o(31389);
      }
      else
      {
        new n.1(this).run();
        AppMethodBeat.o(31389);
      }
    }
  }

  @TargetApi(11)
  public final void dDV()
  {
    AppMethodBeat.i(31388);
    if (Build.VERSION.SDK_INT < 11)
    {
      ab.d("MicroMsg.ChattingUI.DragDropComponent", "sdk not support dragdrop event");
      AppMethodBeat.o(31388);
    }
    while (true)
    {
      return;
      if (this.cgL.getListView() != null)
        this.cgL.getListView().setOnDragListener(null);
      ChatFooter localChatFooter = ((o)this.cgL.aF(o.class)).dDX();
      if (localChatFooter != null)
      {
        localChatFooter.setOnDragListener(null);
        localChatFooter.setEditTextOnDragListener(null);
      }
      AppMethodBeat.o(31388);
    }
  }

  public final void dxC()
  {
    AppMethodBeat.i(31391);
    dDV();
    AppMethodBeat.o(31391);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31390);
    cuB();
    AppMethodBeat.o(31390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.n
 * JD-Core Version:    0.6.2
 */