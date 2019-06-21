package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.ServiceNotifySettingsUI;
import com.tencent.mm.ui.SingleChatInfoUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class t$a extends com.tencent.mm.ui.t
{
  t$a(t paramt)
  {
  }

  public final void Kp()
  {
    AppMethodBeat.i(31492);
    Object localObject;
    if (com.tencent.mm.model.t.mP(this.yQA.cgL.getTalkerUserName()))
    {
      localObject = new com.tencent.mm.g.b.a.t();
      ((com.tencent.mm.g.b.a.t)localObject).eO(this.yQA.cgL.getTalkerUserName());
      ((com.tencent.mm.g.b.a.t)localObject).cXP = 4L;
      ((com.tencent.mm.g.b.a.t)localObject).ajK();
    }
    this.yQA.cgL.aqX();
    if (com.tencent.mm.model.t.nD(this.yQA.cgL.getTalkerUserName()))
    {
      this.yQA.cgL.yTx.getContext().startActivity(new Intent(this.yQA.cgL.yTx.getContext(), ServiceNotifySettingsUI.class));
      AppMethodBeat.o(31492);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.model.t.mV(this.yQA.cgL.getTalkerUserName()))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Contact_User", this.yQA.cgL.getTalkerUserName());
        com.tencent.mm.bp.d.b(this.yQA.cgL.yTx.getContext(), "profile", ".ui.ContactInfoUI", (Intent)localObject);
        AppMethodBeat.o(31492);
      }
      else if (((com.tencent.mm.ui.chatting.c.b.t)this.yQA.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).dEF())
      {
        t.a(this.yQA);
        AppMethodBeat.o(31492);
      }
      else if (((com.tencent.mm.ui.chatting.c.b.d)this.yQA.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDx())
      {
        AppMethodBeat.o(31492);
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).setClass(this.yQA.cgL.yTx.getContext(), SingleChatInfoUI.class);
        ((Intent)localObject).putExtra("Single_Chat_Talker", this.yQA.cgL.getTalkerUserName());
        ((Intent)localObject).putExtra("fromChatting", true);
        this.yQA.cgL.yTx.startActivity((Intent)localObject);
        AppMethodBeat.o(31492);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.a
 * JD-Core Version:    0.6.2
 */