package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.multitalk.model.a.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.MultiTalkRoomPopupNav;
import com.tencent.mm.ui.base.TalkRoomPopupNav;
import com.tencent.mm.ui.base.TalkRoomPopupNav.4;
import com.tencent.mm.ui.base.TalkRoomPopupNav.5;
import com.tencent.mm.ui.base.TalkRoomPopupNav.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=af.class)
public class an extends a
  implements com.tencent.mm.bg.a, com.tencent.mm.bh.c, a.a, af
{
  private final k.a yOu;
  public TalkRoomPopupNav ySA;
  public MultiTalkRoomPopupNav ySB;
  private TalkRoomPopupNav.a ySC;

  public an()
  {
    AppMethodBeat.i(31760);
    this.yOu = new an.1(this);
    this.ySC = new an.7(this);
    AppMethodBeat.o(31760);
  }

  private void a(TalkRoomPopupNav.a parama)
  {
    AppMethodBeat.i(31768);
    if (this.ySA == null)
    {
      i.a(this.cgL.yTx, 2131822382);
      this.ySA = ((TalkRoomPopupNav)this.cgL.findViewById(2131828228));
      if (this.ySA == null)
        AppMethodBeat.o(31768);
    }
    while (true)
    {
      return;
      if (this.ySA != null)
        this.ySA.setOnClickListener(parama);
      AppMethodBeat.o(31768);
    }
  }

  private void ars(String paramString)
  {
    AppMethodBeat.i(31776);
    Intent localIntent = new Intent();
    localIntent.putExtra("enter_room_username", paramString);
    localIntent.setFlags(268435456);
    com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "talkroom", ".ui.TalkRoomUI", localIntent);
    AppMethodBeat.o(31776);
  }

  private void dFd()
  {
    AppMethodBeat.i(31769);
    if (this.ySB == null)
    {
      i.a(this.cgL.yTx, 2131822383);
      this.ySB = ((MultiTalkRoomPopupNav)this.cgL.findViewById(2131826250));
    }
    AppMethodBeat.o(31769);
  }

  private void dFe()
  {
    AppMethodBeat.i(31771);
    if (this.ySA != null)
    {
      this.ySA.setVisibility(8);
      this.ySA.setIconAnim(-1);
      this.ySA.stop();
      ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(-1);
    }
    if (this.ySB != null)
    {
      if (!((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RV(this.cgL.getTalkerUserName()))
        this.ySB.dyV();
      this.ySB.setVisibility(8);
      ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(-1);
    }
    AppMethodBeat.o(31771);
  }

  private void dFf()
  {
    AppMethodBeat.i(31773);
    cg("fromBanner", false);
    AppMethodBeat.o(31773);
  }

  private void qs(boolean paramBoolean)
  {
    AppMethodBeat.i(31770);
    if (this.cgL == null)
    {
      ab.w("MicroMsg.ChattingUI.TrackRoomComponent", "[checkTalkroomBanner] isResume:%s mChattingContext == null! maybe chattingui has Exited! this event come from post msg", new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(31770);
    }
    while (true)
    {
      return;
      if ((((com.tencent.mm.ui.chatting.c.b.f)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.f.class)).dDF()) || (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDs()));
      for (boolean bool = true; ; bool = false)
      {
        if ((!t.kH(this.cgL.getTalkerUserName())) || (bool))
          break label171;
        if (this.ySA != null)
        {
          this.ySA.setVisibility(8);
          ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(-1);
        }
        if (this.ySB != null)
        {
          this.ySB.setInChatRoom(false);
          this.ySB.setVisibility(8);
        }
        AppMethodBeat.o(31770);
        break;
      }
      label171: dFe();
      Object localObject;
      if ((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.tQ(this.cgL.sRl.field_username)))
      {
        a(this.ySC);
        if (this.ySA == null)
        {
          AppMethodBeat.o(31770);
        }
        else
        {
          LinkedList localLinkedList = com.tencent.mm.bh.d.fUu.tP(this.cgL.sRl.field_username);
          localObject = "";
          if ((localLinkedList != null) && (localLinkedList.contains(this.cgL.dFu())))
          {
            this.ySA.setBgViewResource(2130840457);
            localObject = this.cgL.yTx.getMMResources().getString(2131304120);
            this.ySA.setIconRes(2131232035);
            this.ySA.setIconAnim(2131232037);
            this.ySA.start();
            this.ySA.setVisibility(0);
            this.ySA.setNavContent((String)localObject);
            ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(1);
            AppMethodBeat.o(31770);
          }
          else
          {
            this.ySA.setIconAnim(-1);
            this.ySA.stop();
            this.ySA.setBgViewResource(2130840458);
            if ((localLinkedList != null) && (localLinkedList.size() == 1))
              localObject = this.cgL.yTx.getMMResources().getString(2131304119, new Object[] { com.tencent.mm.model.s.mJ((String)localLinkedList.get(0)) });
            while (true)
            {
              this.ySA.setIconRes(2131232034);
              break;
              if (localLinkedList != null)
                localObject = this.cgL.yTx.getMMResources().getString(2131304121, new Object[] { Integer.valueOf(localLinkedList.size()) });
            }
          }
        }
      }
      else
      {
        if ((com.tencent.mm.bg.g.fUs != null) && (com.tencent.mm.bg.g.fUs.tN(this.cgL.getTalkerUserName())))
        {
          a(this.ySC);
          localObject = new sz();
          ((sz)localObject).cPf.cPh = true;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          if (this.cgL.getTalkerUserName().equals(((sz)localObject).cPg.cPj))
            this.ySA.setBgViewResource(2130840457);
          while (true)
          {
            localObject = this.cgL.yTx.getMMResources().getString(2131304011, new Object[] { Integer.valueOf(com.tencent.mm.bg.g.fUs.tM(this.cgL.getTalkerUserName()).size()) });
            this.ySA.setIconRes(2130840404);
            this.ySA.setIconAnim(-1);
            this.ySA.stop();
            this.ySA.setVisibility(0);
            this.ySA.setNavContent((String)localObject);
            ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(1);
            AppMethodBeat.o(31770);
            break;
            this.ySA.setBgViewResource(2130840458);
          }
        }
        if (t.kH(this.cgL.getTalkerUserName()))
        {
          localObject = ((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RW(this.cgL.getTalkerUserName());
          if ((localObject != null) && (((com.tencent.mm.bg.f)localObject).field_wxGroupId != null) && (((com.tencent.mm.bg.f)localObject).field_wxGroupId.equals(this.cgL.getTalkerUserName())))
          {
            dFd();
            if (this.ySB != null)
            {
              ab.i("MicroMsg.ChattingUI.TrackRoomComponent", "show multiTalkBanner! ");
              this.ySB.setGroupUserName(this.cgL.getTalkerUserName());
              this.ySB.setCurrentSenderUserName(this.cgL.dFu());
              this.ySB.setInChatRoom(bool);
              this.ySB.pV(paramBoolean);
              this.ySB.setMultiTalkInfo((com.tencent.mm.bg.f)localObject);
              ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).OB(1);
            }
          }
          AppMethodBeat.o(31770);
        }
        else
        {
          dFe();
          AppMethodBeat.o(31770);
        }
      }
    }
  }

  public final void Sf(String paramString)
  {
    AppMethodBeat.i(31767);
    if ((this.cgL != null) && (paramString.equals(this.cgL.getTalkerUserName())))
      qs(false);
    AppMethodBeat.o(31767);
  }

  public final void arr(String paramString)
  {
    AppMethodBeat.i(31775);
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 6);
    localIntent.putExtra("map_sender_name", this.cgL.dFu());
    localIntent.putExtra("map_talker_name", this.cgL.getTalkerUserName());
    localIntent.putExtra("fromWhereShare", paramString);
    com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "location", ".ui.RedirectUI", localIntent);
    AppMethodBeat.o(31775);
  }

  public final void ax(Runnable paramRunnable)
  {
    AppMethodBeat.i(31764);
    if ((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.aV(this.cgL.sRl.field_username, this.cgL.dFu())))
    {
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131304116), this.cgL.yTx.getMMResources().getString(2131297061), true, new an.5(this, paramRunnable), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      AppMethodBeat.o(31764);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(31764);
    }
  }

  public final void cg(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(31774);
    if (((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.tQ(this.cgL.sRl.field_username))) || (paramBoolean))
    {
      LinkedList localLinkedList = com.tencent.mm.bh.d.fUu.tP(this.cgL.sRl.field_username);
      if ((localLinkedList == null) || (!localLinkedList.contains(this.cgL.dFu())))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(10997, new Object[] { Integer.valueOf(13), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131299210), null, new an.3(this, paramString), new an.4(this));
        AppMethodBeat.o(31774);
      }
    }
    while (true)
    {
      return;
      arr(paramString);
      AppMethodBeat.o(31774);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31777);
    super.dDh();
    if (this.ySA != null)
      this.ySA.stop();
    AppMethodBeat.o(31777);
  }

  public final boolean dFa()
  {
    boolean bool = false;
    AppMethodBeat.i(31761);
    if (this.ySA == null)
      AppMethodBeat.o(31761);
    while (true)
    {
      return bool;
      if (this.ySA.getVisibility() == 0)
      {
        bool = true;
        AppMethodBeat.o(31761);
      }
      else
      {
        AppMethodBeat.o(31761);
      }
    }
  }

  public final boolean dFb()
  {
    boolean bool = false;
    AppMethodBeat.i(31762);
    if (this.ySB == null)
      AppMethodBeat.o(31762);
    while (true)
    {
      return bool;
      if (this.ySB.getVisibility() == 0)
      {
        bool = true;
        AppMethodBeat.o(31762);
      }
      else
      {
        AppMethodBeat.o(31762);
      }
    }
  }

  public final int dFc()
  {
    AppMethodBeat.i(31763);
    int i;
    if (this.ySA == null)
    {
      i = 0;
      AppMethodBeat.o(31763);
    }
    while (true)
    {
      return i;
      i = this.ySA.getHeight();
      AppMethodBeat.o(31763);
    }
  }

  public final void dxA()
  {
    AppMethodBeat.i(31778);
    ab.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingResume]");
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.a(this);
    if (com.tencent.mm.bh.d.fUu != null)
      com.tencent.mm.bh.d.fUu.a(this);
    ((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).a(this);
    qs(true);
    AppMethodBeat.o(31778);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31779);
    ab.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingPause]");
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.b(this);
    if (com.tencent.mm.bh.d.fUu != null)
      com.tencent.mm.bh.d.fUu.b(this);
    ((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).b(this);
    AppMethodBeat.o(31779);
  }

  public final void dxC()
  {
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(31765);
    if ((this.cgL != null) && (paramString1.equals(this.cgL.getTalkerUserName())))
      qs(false);
    AppMethodBeat.o(31765);
  }

  public final void qt(boolean paramBoolean)
  {
    AppMethodBeat.i(31772);
    int i;
    if ((((com.tencent.mm.ui.chatting.c.b.f)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.f.class)).dDF()) || (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDs()))
    {
      i = 1;
      if ((!t.kH(this.cgL.getTalkerUserName())) || (i != 0))
        break label109;
      com.tencent.mm.ui.base.h.b(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131304002), null, true);
      AppMethodBeat.o(31772);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label109: Object localObject1 = new sz();
      ((sz)localObject1).cPf.cPh = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      Object localObject2;
      if (!paramBoolean)
      {
        if ((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.tQ(this.cgL.sRl.field_username)))
        {
          localObject1 = com.tencent.mm.bh.d.fUu.tP(this.cgL.sRl.field_username);
          if ((localObject1 != null) && (((List)localObject1).contains(this.cgL.dFu())))
            localObject1 = this.cgL.yTx.getMMResources().getString(2131303997);
          for (i = 2131299207; ; i = 2131300857)
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(10997, new Object[] { Integer.valueOf(19), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            localObject2 = new c.a(this.cgL.yTx.getContext());
            ((c.a)localObject2).asE((String)localObject1);
            ((c.a)localObject2).Qc(2131296868).a(new an.8(this));
            ((c.a)localObject2).Qd(i).b(new an.9(this, paramBoolean));
            ((c.a)localObject2).aMb().show();
            AppMethodBeat.o(31772);
            break;
            localObject1 = this.cgL.yTx.getMMResources().getString(2131303998);
          }
        }
        if ((!bo.isNullOrNil(((sz)localObject1).cPg.cPj)) && (!this.cgL.getTalkerUserName().equals(((sz)localObject1).cPg.cPj)))
        {
          com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131303992), null, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(31757);
              paramAnonymousDialogInterface = new sz();
              paramAnonymousDialogInterface.cPf.cPi = true;
              com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousDialogInterface);
              an.a(an.this, an.this.cgL.getTalkerUserName());
              AppMethodBeat.o(31757);
            }
          }
          , new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(31758);
              paramAnonymousDialogInterface.dismiss();
              AppMethodBeat.o(31758);
            }
          });
          AppMethodBeat.o(31772);
        }
        else
        {
          ars(this.cgL.getTalkerUserName());
          AppMethodBeat.o(31772);
        }
      }
      else if ((bo.isNullOrNil(((sz)localObject1).cPg.cPj)) || (this.cgL.getTalkerUserName().equals(((sz)localObject1).cPg.cPj)))
      {
        ars(this.cgL.getTalkerUserName());
        AppMethodBeat.o(31772);
      }
      else if ((this.ySA == null) || (this.ySA.getVisibility() != 0))
      {
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131303992), null, new an.12(this), new an.2(this));
        AppMethodBeat.o(31772);
      }
      else
      {
        this.ySA.setDialogContent(this.cgL.yTx.getMMResources().getString(2131303992));
        localObject2 = this.ySA;
        if (((TalkRoomPopupNav)localObject2).yAJ == null)
        {
          ((TalkRoomPopupNav)localObject2).yAJ = new ScaleAnimation(1.0F, 1.0F, ((TalkRoomPopupNav)localObject2).yAL * 1.0F / ((TalkRoomPopupNav)localObject2).yAM, 1.0F);
          ((TalkRoomPopupNav)localObject2).yAJ.setDuration(300L);
          ((TalkRoomPopupNav)localObject2).yAJ.setAnimationListener(new TalkRoomPopupNav.4((TalkRoomPopupNav)localObject2));
        }
        if (((TalkRoomPopupNav)localObject2).yAK == null)
        {
          ((TalkRoomPopupNav)localObject2).yAK = AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject2).getContext(), 2131034181);
          ((TalkRoomPopupNav)localObject2).yAK.setFillAfter(true);
          ((TalkRoomPopupNav)localObject2).yAK.setAnimationListener(new TalkRoomPopupNav.5((TalkRoomPopupNav)localObject2));
        }
        localObject1 = ((TalkRoomPopupNav)localObject2).miL.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = ((TalkRoomPopupNav)localObject2).yAM;
        ((TalkRoomPopupNav)localObject2).miL.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        ((TalkRoomPopupNav)localObject2).miL.startAnimation(((TalkRoomPopupNav)localObject2).yAJ);
        ((TalkRoomPopupNav)localObject2).yoK.startAnimation(((TalkRoomPopupNav)localObject2).yAK);
        ((TalkRoomPopupNav)localObject2).yAF.startAnimation(AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject2).getContext(), 2131034180));
        ((TalkRoomPopupNav)localObject2).yAF.setVisibility(0);
        AppMethodBeat.o(31772);
      }
    }
  }

  public final void tR(String paramString)
  {
    AppMethodBeat.i(31766);
    if ((this.cgL != null) && (paramString.equals(this.cgL.getTalkerUserName())))
      qs(false);
    AppMethodBeat.o(31766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.an
 * JD-Core Version:    0.6.2
 */