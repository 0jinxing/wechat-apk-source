package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelmulti.h;
import com.tencent.mm.plugin.bbom.i;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.c.b.t;
import java.util.Arrays;

@com.tencent.mm.ui.chatting.c.a.a(dFp=t.class)
public class y extends a
  implements t
{
  String cEr;
  private String jEs;
  boolean vnc;
  private boolean yQO;
  private Runnable yQP;
  private Runnable yQQ;
  private com.tencent.mm.sdk.b.c yQR;

  public y()
  {
    AppMethodBeat.i(31555);
    this.vnc = false;
    this.jEs = null;
    this.yQO = false;
    this.cEr = null;
    this.yQP = new y.1(this);
    this.yQQ = new y.2(this);
    this.yQR = new y.3(this);
    AppMethodBeat.o(31555);
  }

  private void dDi()
  {
    AppMethodBeat.i(31556);
    com.tencent.mm.sdk.b.a.xxA.d(this.yQR);
    AppMethodBeat.o(31556);
  }

  public final void OC(int paramInt)
  {
    AppMethodBeat.i(31559);
    Object localObject;
    if (this.jEs != null)
    {
      localObject = String.format(this.cgL.yTx.getMMResources().getString(2131297497), new Object[] { bo.nullAsNil(com.tencent.mm.model.r.YB()) });
      localObject = new com.tencent.mm.pluginsdk.model.m(2, Arrays.asList(new String[] { this.cEr }), Arrays.asList(new Integer[] { Integer.valueOf(18) }), (String)localObject, "");
      aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      this.yQO = true;
    }
    while (true)
    {
      ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).dEr();
      AppMethodBeat.o(31559);
      return;
      localObject = d.akQ().apA(this.cEr);
      aw.Rg().a(new com.tencent.mm.pluginsdk.model.m(this.cEr, ((bf)localObject).field_ticket, paramInt, (byte)0), 0);
      ((bf)localObject).field_flag = 2;
      d.akQ().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    }
  }

  public final void a(Button paramButton, LinearLayout paramLinearLayout1, LinearLayout paramLinearLayout2)
  {
    AppMethodBeat.i(31558);
    if (this.jEs != null)
      if (this.yQO)
      {
        ((TextView)paramLinearLayout1.findViewById(2131822689)).setText(2131298146);
        paramButton.setVisibility(8);
        AppMethodBeat.o(31558);
      }
    while (true)
    {
      return;
      ((TextView)paramLinearLayout1.findViewById(2131822689)).setText(2131298147);
      ((Button)paramLinearLayout1.findViewById(2131822690)).setText(2131298145);
      AppMethodBeat.o(31558);
      continue;
      paramButton = d.akQ().apA(this.cEr);
      if (paramButton != null)
      {
        ((TextView)paramLinearLayout1.findViewById(2131822689)).setText(paramButton.field_sayhicontent);
        ((Button)paramLinearLayout1.findViewById(2131822690)).setText(2131298144);
        AppMethodBeat.o(31558);
      }
      else
      {
        paramLinearLayout2.setVisibility(8);
        AppMethodBeat.o(31558);
      }
    }
  }

  public final void aV(Intent paramIntent)
  {
    AppMethodBeat.i(31560);
    paramIntent.putExtra("Contact_IsLBSFriend", true);
    paramIntent.putExtra("Contact_IsLbsChattingProfile", true);
    paramIntent.putExtra("Contact_Scene", 18);
    AppMethodBeat.o(31560);
  }

  public final String aro(String paramString)
  {
    AppMethodBeat.i(31561);
    if (this.vnc)
    {
      ab.i("MicroMsg.ChattingUI.LbsComponent", "[oneliang]encrypt:" + this.cEr + ",raw:" + this.cgL.getTalkerUserName());
      if (bo.isNullOrNil(this.cEr))
        paramString = this.cgL.getTalkerUserName();
    }
    while (true)
    {
      AppMethodBeat.o(31561);
      return paramString;
      paramString = this.cEr;
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31568);
    super.dDh();
    dDi();
    AppMethodBeat.o(31568);
  }

  public final boolean dEF()
  {
    return this.vnc;
  }

  public final boolean dEG()
  {
    AppMethodBeat.i(31557);
    boolean bool;
    if (this.vnc)
    {
      bf localbf = d.akQ().apA(this.cEr);
      if ((this.jEs != null) || (localbf != null))
        ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).dEr();
      bool = true;
      AppMethodBeat.o(31557);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31557);
    }
  }

  public final void dxA()
  {
  }

  public final void dxB()
  {
    AppMethodBeat.i(31566);
    al.af(this.yQP);
    al.af(this.yQQ);
    AppMethodBeat.o(31566);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31567);
    dDi();
    AppMethodBeat.o(31567);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31563);
    this.vnc = this.cgL.yTx.getBooleanExtra("lbs_mode", false).booleanValue();
    if (bo.isNullOrNil(this.cgL.sRl.field_encryptUsername));
    for (String str = this.cgL.getTalkerUserName(); ; str = this.cgL.sRl.field_encryptUsername)
    {
      this.cEr = str;
      this.jEs = this.cgL.yTx.getStringExtra("lbs_ticket");
      AppMethodBeat.o(31563);
      return;
    }
  }

  public final void dxy()
  {
    AppMethodBeat.i(31564);
    if (this.vnc)
    {
      Object localObject = (o)this.cgL.aF(o.class);
      ((o)localObject).dDX().setLbsMode(true);
      ChatFooter localChatFooter = ((o)localObject).dDX();
      if (localChatFooter.vmS != null)
        localChatFooter.vmS.setVisibility(8);
      localObject = ((o)localObject).dDX();
      if (((ChatFooter)localObject).vmP != null)
        ((ChatFooter)localObject).vmP.setVisibility(8);
    }
    AppMethodBeat.o(31564);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31565);
    com.tencent.mm.sdk.b.a.xxA.c(this.yQR);
    AppMethodBeat.o(31565);
  }

  public final void g(h paramh)
  {
    Object localObject1 = null;
    AppMethodBeat.i(31562);
    Object localObject2;
    Object localObject3;
    if (this.vnc)
    {
      localObject2 = this.jEs;
      bg localbg = d.akQ();
      String str = this.cEr;
      localObject3 = "SELECT * FROM " + localbg.getTableName() + " where sayhiencryptuser=? and isSend=0 and flag=0 ORDER BY createtime desc LIMIT 1";
      localObject3 = localbg.bSd.a((String)localObject3, new String[] { str }, 2);
      if (localObject3 != null)
        break label185;
    }
    while (true)
    {
      localObject3 = localObject2;
      if (localObject1 != null)
      {
        localObject3 = localObject2;
        if (!bo.isNullOrNil(((bf)localObject1).field_ticket))
          localObject3 = ((bf)localObject1).field_ticket;
      }
      localObject1 = localObject3;
      if (bo.isNullOrNil((String)localObject3))
      {
        localObject2 = d.akQ().apA(this.cEr);
        localObject1 = localObject3;
        if (localObject2 != null)
        {
          localObject1 = localObject3;
          if (!bo.isNullOrNil(((bf)localObject2).field_ticket))
            localObject1 = ((bf)localObject2).field_ticket;
        }
      }
      if (localObject1 != null)
        paramh.fIr = new i((String)localObject1);
      AppMethodBeat.o(31562);
      return;
      label185: if (!((Cursor)localObject3).moveToFirst())
      {
        ((Cursor)localObject3).close();
      }
      else
      {
        localObject1 = new bf();
        ((bf)localObject1).d((Cursor)localObject3);
        ((Cursor)localObject3).close();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.y
 * JD-Core Version:    0.6.2
 */