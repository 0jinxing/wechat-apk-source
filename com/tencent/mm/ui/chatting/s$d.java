package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$d
  implements View.OnLongClickListener
{
  private a yJI;

  public s$d(a parama)
  {
    this.yJI = parama;
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(30720);
    if (((o)this.yJI.aF(o.class)).dDX().dkx())
    {
      ab.w("changelcai", "ChattingUI isScrolling!!!");
      AppMethodBeat.o(30720);
    }
    Object localObject1;
    int i;
    while (true)
    {
      return true;
      localObject1 = (ay)paramView.getTag();
      i = ((o)this.yJI.aF(o.class)).dDX().getSelectionStart();
      if ((((ay)localObject1).userName.equals(r.Yz())) || (((ay)localObject1).userName.equals("notifymessage")))
      {
        AppMethodBeat.o(30720);
      }
      else
      {
        if (!((o)this.yJI.aF(o.class)).dDX().getIsVoiceInputPanleShow())
          break;
        ab.i("MicroMsg.ChattingListAvatarListener", "ChatFooter VoiceInputPanel Show NOW!!!");
        AppMethodBeat.o(30720);
      }
    }
    Object localObject2 = (d)this.yJI.aF(d.class);
    Object localObject3;
    if ((t.kH(this.yJI.getTalkerUserName())) || (((d)localObject2).dDn()))
    {
      h.pYm.e(10976, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
      aw.ZK();
      localObject3 = c.XV().oa(((ay)localObject1).chatroomName);
      if (((d)localObject2).dDn())
        localObject3 = ((f)this.yJI.aF(f.class)).arj(((ay)localObject1).userName);
    }
    label268: label686: 
    while (true)
    {
      localObject2 = (o)this.yJI.aF(o.class);
      Object localObject4 = new StringBuffer(((o)localObject2).dDX().getLastText());
      ((StringBuffer)localObject4).insert(i, "@" + localObject3 + ' ');
      ((o)localObject2).dDX().u(((StringBuffer)localObject4).toString(), i + ((CharSequence)localObject3).length() + 2, true);
      ChatFooter localChatFooter = ((o)localObject2).dDX();
      localObject4 = ((ay)localObject1).chatroomName;
      localObject1 = ((ay)localObject1).userName;
      if (localObject3 == null)
      {
        localObject3 = null;
        localChatFooter.ax((String)localObject4, (String)localObject1, (String)localObject3);
        ((o)localObject2).dDX().setMode(1);
        paramView.postDelayed(new Runnable()
        {
          public final void run()
          {
          }
        }
        , 2000L);
      }
      do
      {
        AppMethodBeat.o(30720);
        break;
        localObject3 = AtSomeoneUI.a((u)localObject3, ((ay)localObject1).userName);
        if (!bo.ac((CharSequence)localObject3))
          break label686;
        localObject3 = s.mH(((ay)localObject1).userName);
        break label268;
        localObject3 = ((CharSequence)localObject3).toString();
        break label386;
      }
      while ((!t.mY(this.yJI.getTalkerUserName())) || (this.yJI.getTalkerUserName().contains("@")));
      h.pYm.e(10976, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
      if ((((d)localObject2).dDm()) && (!((d)localObject2).dDn()));
      for (localObject3 = ((f)this.yJI.aF(f.class)).arj(((ay)localObject1).userName); ; localObject3 = s.mH(((ay)localObject1).userName))
      {
        localObject2 = (o)this.yJI.aF(o.class);
        localObject1 = new StringBuffer(((o)localObject2).dDX().getLastText());
        ((StringBuffer)localObject1).insert(i, (CharSequence)localObject3);
        ((o)localObject2).dDX().u(((StringBuffer)localObject1).toString(), ((CharSequence)localObject3).length() + i, true);
        ((o)localObject2).dDX().setMode(1);
        paramView.postDelayed(new s.d.2(this), 2000L);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.d
 * JD-Core Version:    0.6.2
 */