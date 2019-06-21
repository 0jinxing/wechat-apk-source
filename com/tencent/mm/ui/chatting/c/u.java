package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.x;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.chatting.c.b.p;
import com.tencent.mm.ui.chatting.c.b.s;

@com.tencent.mm.ui.chatting.c.a.a(dFp=s.class)
public class u extends a
  implements s
{
  private Runnable auF;
  private View yQJ;
  private TextView yQK;
  private int yQL;
  private int yQM = 0;

  private boolean dED()
  {
    AppMethodBeat.i(31546);
    com.tencent.mm.ui.chatting.c.b.d locald = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    boolean bool;
    if (t.nD(this.cgL.getTalkerUserName()))
    {
      AppMethodBeat.o(31546);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((this.cgL.sRl.dsf()) && (locald.dDj() != null) && (((locald.dDj().adN()) && (!((b)g.K(b.class)).aVO())) || (locald.dDj().adM())))
      {
        AppMethodBeat.o(31546);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(31546);
      }
    }
  }

  public final void OB(int paramInt)
  {
    AppMethodBeat.i(31545);
    if (dED());
    for (int i = 5; (this.yQL < i) || (this.yQJ == null); i = 10)
    {
      AppMethodBeat.o(31545);
      return;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.yQJ.getLayoutParams();
    switch (paramInt)
    {
    case -1:
    case 2:
    default:
    case 3:
    case 1:
    case 0:
    case -2:
    }
    while (true)
    {
      AppMethodBeat.o(31545);
      break;
      localLayoutParams.setMargins(0, this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427776) * 3, 0, 0);
      AppMethodBeat.o(31545);
      break;
      af localaf = (af)this.cgL.aF(af.class);
      if (localaf.dFa())
      {
        paramInt = localaf.dFc();
        label166: if (!localaf.dFb())
          break label242;
      }
      label242: for (i = this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427807); ; i = 0)
      {
        int j = paramInt;
        if (i > paramInt)
          j = i;
        localLayoutParams.setMargins(0, this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427776) + j, 0, 0);
        AppMethodBeat.o(31545);
        break;
        paramInt = 0;
        break label166;
      }
      localLayoutParams.setMargins(0, this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427776), 0, 0);
      AppMethodBeat.o(31545);
      break;
      if (!((af)this.cgL.aF(af.class)).dFa())
        localLayoutParams.setMargins(0, this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427776), 0, 0);
    }
  }

  public final void dEA()
  {
    AppMethodBeat.i(31543);
    int i;
    if (dED())
    {
      i = 5;
      if (this.yQL > i)
        break label59;
      ab.w("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] mUnreadMessageCount is smaller than threshold:".concat(String.valueOf(i)));
      this.yQJ.setVisibility(8);
      AppMethodBeat.o(31543);
    }
    while (true)
    {
      return;
      i = 10;
      break;
      label59: if (this.yQJ.getVisibility() == 0)
      {
        ab.w("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] has show!!!");
        AppMethodBeat.o(31543);
      }
      else
      {
        this.yQJ.removeCallbacks(this.auF);
        View localView = this.yQJ;
        u.2 local2 = new u.2(this);
        this.auF = local2;
        localView.postDelayed(local2, 100L);
        AppMethodBeat.o(31543);
      }
    }
  }

  public final void dEB()
  {
    this.yQM = 0;
  }

  public final int dEC()
  {
    return this.yQM;
  }

  public final int dEy()
  {
    return this.yQL;
  }

  public final void dEz()
  {
    AppMethodBeat.i(31542);
    if (this.yQJ == null)
      AppMethodBeat.o(31542);
    while (true)
    {
      return;
      this.yQL = -1;
      if (this.yQJ.getVisibility() == 0)
      {
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.yQJ.getWidth(), 0.0F, 0.0F);
        localTranslateAnimation.setDuration(300L);
        localTranslateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.cgL.yTx.getContext(), 17432581));
        this.yQJ.startAnimation(localTranslateAnimation);
      }
      this.yQJ.setVisibility(8);
      AppMethodBeat.o(31542);
    }
  }

  public final void dxx()
  {
    AppMethodBeat.i(31547);
    super.dxx();
    this.yQJ = this.cgL.findViewById(2131822388);
    this.yQJ.setVisibility(8);
    aw.ZK();
    ak localak = c.XR().aoZ(this.cgL.getTalkerUserName());
    if (localak != null)
    {
      this.yQL = localak.field_unReadCount;
      ab.i("MicroMsg.HistoryMsgTongueComponent", "[onChattingInit] getUnDeliverCount:%s mUnreadMessageCount:%s", new Object[] { Integer.valueOf(localak.field_UnDeliverCount), Integer.valueOf(this.yQL) });
    }
    AppMethodBeat.o(31547);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31548);
    super.dxz();
    com.tencent.mm.ui.chatting.c.b.d locald = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    if (locald.dDm())
      this.yQL = locald.dDv();
    Object localObject = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    if (((!bo.isNullOrNil(this.cgL.getTalkerUserName())) && (!this.cgL.dFv()) && (!t.nG(this.cgL.getTalkerUserName())) && (!t.mZ(this.cgL.getTalkerUserName())) && (!t.nB(this.cgL.getTalkerUserName())) && (!t.nc(this.cgL.getTalkerUserName()))) || (this.cgL.dFw()) || (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDm()) || (dED()));
    for (int i = 1; i == 0; i = 0)
    {
      ab.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowTongue] no show tongue! username:%s unreadCount:%s isBizChat:%s", new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(this.yQL), Boolean.valueOf(locald.dDm()) });
      this.yQJ.setVisibility(8);
      this.yQM = 0;
      AppMethodBeat.o(31548);
      return;
    }
    int j = this.yQL;
    if (dED())
    {
      i = 5;
      label247: ab.i("MicroMsg.HistoryMsgTongueComponent", "[update] threshold:%s fixUnreadMessage:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (j >= i)
      {
        ab.i("MicroMsg.HistoryMsgTongueComponent", "[update] mGoBackToHistoryMsgLayout VISIBLE");
        this.yQK = ((TextView)this.cgL.findViewById(2131822389));
        localObject = x.ecN;
        if (((x)localObject).ecR != null)
          break label462;
        ((x)localObject).ecS = 1;
        label321: if (j <= 999)
          break label473;
        this.yQK.setText(String.format(this.cgL.yTx.getMMResources().getString(2131298115), new Object[] { Integer.valueOf(999) }));
        label368: if (!locald.dDm())
          break label514;
        aw.ZK();
      }
    }
    for (i = c.XP().aQ(this.cgL.getTalkerUserName(), locald.dDz()) - this.yQL; ; i = c.XO().Rp(this.cgL.getTalkerUserName()) - this.yQL)
    {
      this.yQJ.setOnClickListener(new u.1(this, i));
      if (!((p)this.cgL.aF(p.class)).dEi())
        dEA();
      AppMethodBeat.o(31548);
      break;
      i = 10;
      break label247;
      label462: ((x)localObject).ecR.edj = 1;
      break label321;
      label473: this.yQK.setText(String.format(this.cgL.yTx.getMMResources().getString(2131298115), new Object[] { Integer.valueOf(j) }));
      break label368;
      label514: aw.ZK();
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(31544);
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if ((this.yQL > 0) && (paramInt3 - (paramInt1 + 1) >= this.yQL) && (this.yQJ != null) && (this.yQJ.getVisibility() == 0))
    {
      ab.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr jacks onScroll dismissMsgTongue mUnreadMessage[%d] [%d,%d]", new Object[] { Integer.valueOf(this.yQL), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1) });
      dEz();
    }
    AppMethodBeat.o(31544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.u
 * JD-Core Version:    0.6.2
 */