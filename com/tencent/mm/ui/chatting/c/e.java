package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.chatroom.ui.DelChatroomMemberUI;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.u.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.LinkedList<Ljava.lang.String;>;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.f.class)
public class e extends a
  implements com.tencent.mm.ai.f, n.b, com.tencent.mm.ui.chatting.c.b.f
{
  protected boolean yOr;
  protected Map<String, String> yOs;
  private com.tencent.mm.sdk.b.c yOt;
  private final k.a yOu;
  private com.tencent.mm.sdk.b.c yOv;
  com.tencent.mm.roomsdk.a.c.d yOw;
  private boolean yOx;
  private boolean yoR;

  public e()
  {
    AppMethodBeat.i(31258);
    this.yOr = false;
    this.yOs = new HashMap();
    this.yOt = new e.1(this);
    this.yOu = new e.7(this);
    this.yOv = new e.8(this);
    this.yoR = false;
    this.yOx = false;
    AppMethodBeat.o(31258);
  }

  protected static boolean b(Activity paramActivity, int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(31274);
    if (u.a.a(paramActivity, paramInt1, paramInt2, paramString, 7))
      AppMethodBeat.o(31274);
    while (true)
    {
      return bool;
      if (com.tencent.mm.ui.u.a(paramActivity, paramInt1, paramInt2, new Intent().setClass(paramActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
      {
        AppMethodBeat.o(31274);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(31274);
      }
    }
  }

  private void dBr()
  {
    AppMethodBeat.i(31263);
    Object localObject = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    if (t.kH(this.cgL.getTalkerUserName()))
    {
      this.yOr = com.tencent.mm.model.n.mq(this.cgL.getTalkerUserName());
      if (this.yOr)
      {
        com.tencent.mm.model.n.f(this.cgL.getTalkerUserName(), this.yOs);
        StringBuilder localStringBuilder = new StringBuilder("chatroom display  ");
        if (!this.yOr)
          break label120;
        localObject = "show ";
        label88: ab.d("MicroMsg.ChattingUI.ChatroomComponent", (String)localObject);
        AppMethodBeat.o(31263);
      }
    }
    while (true)
    {
      return;
      this.yOs.clear();
      break;
      label120: localObject = "not show";
      break label88;
      if (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDn())
      {
        this.yOr = true;
        AppMethodBeat.o(31263);
      }
      else
      {
        this.yOr = false;
        this.yOs.clear();
        AppMethodBeat.o(31263);
      }
    }
  }

  private void dDG()
  {
    AppMethodBeat.i(31265);
    if (this.cgL.sRl == null)
    {
      ab.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomMemberDetail() talker == null");
      AppMethodBeat.o(31265);
    }
    while (true)
    {
      return;
      if (t.mN(this.cgL.getTalkerUserName()))
      {
        ab.d("MicroMsg.ChattingUI.ChatroomComponent", "cpan[changeTalker]");
        new com.tencent.mm.sdk.platformtools.ak().postDelayed(new e.6(this), 1000L);
      }
      AppMethodBeat.o(31265);
    }
  }

  private void dDi()
  {
    AppMethodBeat.i(31264);
    aw.Rg().b(610, this);
    aw.ZK();
    com.tencent.mm.model.c.XM().b(this);
    aw.Rg().b(551, this);
    if (this.yOw != null)
      this.yOw.dead();
    if (aw.RK())
    {
      aw.ZK();
      com.tencent.mm.model.c.XV().d(this.yOu);
      com.tencent.mm.sdk.b.a.xxA.d(this.yOt);
      com.tencent.mm.sdk.b.a.xxA.d(this.yOv);
    }
    AppMethodBeat.o(31264);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(31273);
    if (this.cgL == null)
    {
      ab.e("MicroMsg.ChattingUI.ChatroomComponent", "[onNotifyChange] mChattingContext is null!");
      AppMethodBeat.o(31273);
    }
    while (true)
    {
      return;
      if (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn())
      {
        this.yoR = com.tencent.mm.aj.a.e.c(((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDk());
        AppMethodBeat.o(31273);
      }
      else
      {
        this.yoR = com.tencent.mm.model.n.ms(this.cgL.getTalkerUserName());
        AppMethodBeat.o(31273);
      }
    }
  }

  public final void a(List<String> paramList, String paramString, bi parambi)
  {
    AppMethodBeat.i(31262);
    com.tencent.mm.roomsdk.a.a.a locala = com.tencent.mm.roomsdk.a.b.alY(this.cgL.getTalkerUserName());
    if (this.cgL.dFw());
    for (String str = this.cgL.getTalkerUserName(); ; str = "")
    {
      paramString = locala.a(str, paramList, paramString, parambi);
      paramString.b(new e.2(this, paramString)).c(new com.tencent.mm.roomsdk.a.b.b()
      {
      });
      paramList = this.cgL.yTx.getContext();
      this.cgL.yTx.getMMResources().getString(2131297061);
      paramString.a(paramList, this.cgL.yTx.getMMResources().getString(2131302554), true, new e.3(this, paramString));
      AppMethodBeat.o(31262);
      return;
    }
  }

  public final void aJ(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(31261);
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.XV().oa(this.cgL.getTalkerUserName());
    if (localObject1 == null)
    {
      h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302540), null, this.cgL.yTx.getMMResources().getString(2131302535), new e.9(this));
      AppMethodBeat.o(31261);
    }
    while (true)
    {
      return;
      this.cgL.getTalkerUserName();
      LinkedList localLinkedList = new LinkedList();
      Object localObject2 = ((com.tencent.mm.storage.u)localObject1).afg();
      localObject1 = paramLinkedList.iterator();
      Object localObject3;
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        if ((localObject2 != null) && (((List)localObject2).contains(localObject3)))
          localLinkedList.add(localObject3);
      }
      if (localLinkedList.size() == 0)
      {
        if (paramLinkedList.size() == 1)
        {
          h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302534), null, this.cgL.yTx.getMMResources().getString(2131302535), new e.10(this));
          AppMethodBeat.o(31261);
        }
        else
        {
          h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302529), null, this.cgL.yTx.getMMResources().getString(2131302535), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
            }
          });
          AppMethodBeat.o(31261);
        }
      }
      else
      {
        if (paramLinkedList.size() == 1)
        {
          localObject2 = this.cgL.yTx.getMMResources();
          localObject1 = (String)paramLinkedList.get(0);
          if ((!((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()) && (!this.cgL.dFw()))
            paramLinkedList = null;
          do
          {
            do
            {
              paramLinkedList = ((Resources)localObject2).getString(2131302528, new Object[] { paramLinkedList });
              h.a(this.cgL.yTx.getContext(), paramLinkedList, null, this.cgL.yTx.getMMResources().getString(2131302536), this.cgL.yTx.getMMResources().getString(2131296868), true, new e.12(this, localLinkedList), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(31261);
              break;
              aw.ZK();
              localObject3 = com.tencent.mm.model.c.XM().aoO((String)localObject1);
              paramLinkedList = (LinkedList<String>)localObject1;
            }
            while (localObject3 == null);
            paramLinkedList = (LinkedList<String>)localObject1;
          }
          while ((int)((com.tencent.mm.n.a)localObject3).ewQ == 0);
          if (!bo.isNullOrNil(((ap)localObject3).field_conRemark))
            paramLinkedList = ((ap)localObject3).field_conRemark;
          while (true)
          {
            localObject1 = paramLinkedList;
            if (bo.isNullOrNil(paramLinkedList))
              localObject1 = ((ap)localObject3).field_conRemark;
            paramLinkedList = (LinkedList<String>)localObject1;
            if (!bo.isNullOrNil((String)localObject1))
              break;
            paramLinkedList = ((ad)localObject3).Oi();
            break;
            aw.ZK();
            paramLinkedList = com.tencent.mm.model.c.XV().oa(this.cgL.getTalkerUserName());
            if (paramLinkedList == null)
              paramLinkedList = null;
            else
              paramLinkedList = paramLinkedList.mJ(((ap)localObject3).field_username);
          }
        }
        paramLinkedList = new Intent(this.cgL.yTx.getContext(), DelChatroomMemberUI.class);
        paramLinkedList.putExtra("members", bo.c(localLinkedList, ","));
        paramLinkedList.putExtra("RoomInfo_Id", this.cgL.getTalkerUserName());
        paramLinkedList.putExtra("scene", 1);
        this.cgL.startActivity(paramLinkedList);
        AppMethodBeat.o(31261);
      }
    }
  }

  public final CharSequence arj(String paramString)
  {
    AppMethodBeat.i(31259);
    com.tencent.mm.ui.chatting.c.b.d locald = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
    String str = s.mK(paramString);
    if ((!locald.dDm()) && (!bo.isNullOrNil(str)))
    {
      paramString = com.tencent.mm.openim.room.a.a.a(localad, str);
      AppMethodBeat.o(31259);
    }
    while (true)
    {
      return paramString;
      if (this.yOs.containsKey(paramString))
      {
        str = (String)this.yOs.get(paramString);
        if (!bo.isNullOrNil(str))
        {
          AppMethodBeat.o(31259);
          paramString = str;
        }
      }
      else if (locald.dDm())
      {
        paramString = locald.dDk().mJ(paramString);
        AppMethodBeat.o(31259);
      }
      else
      {
        paramString = com.tencent.mm.openim.room.a.a.a(localad, s.mJ(paramString));
        AppMethodBeat.o(31259);
      }
    }
  }

  public final boolean dDE()
  {
    return this.yOr;
  }

  public final boolean dDF()
  {
    AppMethodBeat.i(31260);
    boolean bool;
    if ((this.yoR) || (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDs()))
    {
      bool = true;
      AppMethodBeat.o(31260);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31260);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31270);
    super.dDh();
    dDi();
    AppMethodBeat.o(31270);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31269);
    if (!this.yOx)
      dBr();
    this.yOx = false;
    AppMethodBeat.o(31269);
  }

  public final void dxB()
  {
  }

  public final void dxC()
  {
    AppMethodBeat.i(31271);
    dDi();
    AppMethodBeat.o(31271);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31266);
    if (this.cgL.dFw())
      this.yoR = com.tencent.mm.model.n.ms(this.cgL.getTalkerUserName());
    AppMethodBeat.o(31266);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31267);
    this.yOx = true;
    dBr();
    AppMethodBeat.o(31267);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31268);
    Object localObject;
    if ((!t.nI(this.cgL.getTalkerUserName())) && (t.kH(this.cgL.getTalkerUserName())))
    {
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
      if ((localObject != null) && ((((at)localObject).field_showTips & 0x2) <= 0))
        break label359;
      ab.d("MicroMsg.ChattingUI.ChatroomComponent", "jacks ont need auto display name because : already tips");
    }
    while (true)
    {
      aw.Rg().a(610, this);
      aw.Rg().a(551, this);
      aw.ZK();
      com.tencent.mm.model.c.XM().a(this);
      aw.ZK();
      com.tencent.mm.model.c.XV().c(this.yOu);
      if (this.yOw != null)
        this.yOw.dead();
      this.yOw = com.tencent.mm.roomsdk.a.b.alY(this.cgL.getTalkerUserName()).Ju().e(new e.5(this)).f(new e.4(this)).dmY();
      com.tencent.mm.sdk.b.a.xxA.c(this.yOt);
      com.tencent.mm.sdk.b.a.xxA.c(this.yOv);
      if ((t.mN(this.cgL.getTalkerUserName())) && (com.tencent.mm.model.n.mt(this.cgL.getTalkerUserName())))
      {
        ab.d("MicroMsg.ChattingUI.ChatroomComponent", "chattingui find chatroom contact need update %s", new Object[] { this.cgL.getTalkerUserName() });
        ao.a.flu.ai(this.cgL.getTalkerUserName(), "");
      }
      if ((com.tencent.mm.bh.d.fUv != null) && (!this.cgL.getTalkerUserName().equals(com.tencent.mm.bh.d.fUv.akN())))
      {
        ab.i("MicroMsg.ChattingUI.ChatroomComponent", "chatting oncreate end track %s", new Object[] { com.tencent.mm.bh.d.fUv.akN() });
        localObject = new ez();
        ((ez)localObject).cys.username = this.cgL.getTalkerUserName();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      dDG();
      AppMethodBeat.o(31268);
      return;
      label359: aw.ZK();
      com.tencent.mm.storage.u localu = com.tencent.mm.model.c.XV().oa(this.cgL.getTalkerUserName());
      if ((localu == null) || (localu.afg().size() < 20))
      {
        ab.d("MicroMsg.ChattingUI.ChatroomComponent", "jacks ont need auto display name because : member nums too few");
      }
      else if ((localu != null) && (!localu.drX()))
      {
        com.tencent.mm.model.n.a(this.cgL.getTalkerUserName(), localu, true);
        ((at)localObject).field_showTips = 2;
        ((at)localObject).duQ = true;
        aw.ZK();
        com.tencent.mm.model.c.XR().a((com.tencent.mm.storage.ak)localObject, this.cgL.getTalkerUserName());
        ab.i("MicroMsg.ChattingUI.ChatroomComponent", "Jacks Show auto Display name tips");
        com.tencent.mm.model.m.a(this.cgL.getTalkerUserName(), null, this.cgL.yTx.getMMResources().getString(2131298245), false, "", 0);
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(31272);
    ab.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramm.getType());
    this.cgL.dismissDialog();
    if (!this.cgL.caA)
    {
      ab.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd fragment not foreground, return");
      AppMethodBeat.o(31272);
    }
    while (true)
    {
      return;
      if (!bo.cv(this.cgL.yTx.getContext()))
      {
        AppMethodBeat.o(31272);
      }
      else
      {
        if (!b(this.cgL.yTx.getContext(), paramInt1, paramInt2, paramString))
          break;
        AppMethodBeat.o(31272);
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
      case 551:
      }
    while (true)
    {
      AppMethodBeat.o(31272);
      break;
      ab.i("MicroMsg.ChattingUI.ChatroomComponent", "cpan[refresh top btn]");
      this.yoR = com.tencent.mm.model.n.ms(this.cgL.getTalkerUserName());
      ((r)this.cgL.aF(r.class)).dEp();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.e
 * JD-Core Version:    0.6.2
 */