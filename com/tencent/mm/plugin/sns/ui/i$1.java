package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.i.6;
import com.tencent.mm.plugin.sns.ui.item.i.a;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.plugin.sns.ui.widget.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import java.util.LinkedList;

final class i$1 extends com.tencent.mm.plugin.sns.ui.d.b
{
  i$1(i parami, Activity paramActivity, ae paramae)
  {
    super(0, paramActivity, paramae);
  }

  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38167);
    if (paramInt2 >= 0)
      AppMethodBeat.o(38167);
    while (true)
    {
      return;
      new i.1.1(this, paramInt1, paramInt2, paramInt3, paramView).run();
      AppMethodBeat.o(38167);
    }
  }

  public final void cp(Object paramObject)
  {
    AppMethodBeat.i(38168);
    this.rhF.rhs.a((View)paramObject, 1, 0, this.rhF.rhn);
    AppMethodBeat.o(38168);
  }

  public final void crE()
  {
    AppMethodBeat.i(38169);
    if (this.rhF.qPr != null)
      this.rhF.qPr.cua();
    AppMethodBeat.o(38169);
  }

  public final void crF()
  {
    AppMethodBeat.i(38175);
    this.rhF.rhy.crv();
    AppMethodBeat.o(38175);
  }

  public final void dG(View paramView)
  {
    AppMethodBeat.i(38170);
    paramView = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
    if (this.rhF.qPr.ctX() == null)
      AppMethodBeat.o(38170);
    while (true)
    {
      return;
      this.rhF.qPr.ctX().crO();
      new n();
      n localn = this.rhF.qPr.DP(paramView.position);
      if (!localn.isValid())
      {
        AppMethodBeat.o(38170);
      }
      else
      {
        Object localObject1 = com.tencent.mm.modelsns.b.lY(741);
        Object localObject2 = aj.q(localn);
        Object localObject3 = ((com.tencent.mm.modelsns.b)localObject1).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(localn.field_userName);
        if (localObject2 == null)
        {
          i = 0;
          label147: localObject3 = ((com.tencent.mm.modelsns.b)localObject3).mb(i);
          if (localObject2 != null)
            break label358;
        }
        label358: for (int i = 0; ; i = ((cbf)localObject2).xar)
        {
          ((com.tencent.mm.modelsns.b)localObject3).mb(i);
          ((com.tencent.mm.modelsns.b)localObject1).ajK();
          if ((!localn.DI(32)) || ((localn.cqu().xfI.wbL & 0x8) == 0))
            break label368;
          localObject1 = this.rhF;
          localObject2 = new cat();
          ((i)localObject1).rhu = null;
          ab.i("MicroMsg.BaseTimeLine", "[performAdAtFriendClick] onCommentClick:  commentkey " + ((i)localObject1).rhu + " " + paramView.cFc + " position:" + paramView.position);
          ((i)localObject1).rhq.setTag(localn);
          ((i)localObject1).crC();
          ((i)localObject1).rhq.setVisibility(0);
          ((i)localObject1).rhq.setCommentFlag(0);
          ((i)localObject1).rhq.setCommentHint("");
          ((i)localObject1).rhq.setCommentInfo((cat)localObject2);
          ((i)localObject1).rhq.lk(true);
          ((i)localObject1).rhq.g(i.rhw, "");
          ((i)localObject1).c(paramView);
          AppMethodBeat.o(38170);
          break;
          i = ((cbf)localObject2).xao;
          break label147;
        }
        label368: localObject3 = this.rhF;
        localObject1 = new cat();
        localObject2 = paramView.cFc;
        ((i)localObject3).rhu = ((String)localObject2);
        ab.i("MicroMsg.BaseTimeLine", "[performCommentIconClick] onCommentClick:  commentkey " + ((i)localObject3).rhu + " " + paramView.cFc + " position:" + paramView.position);
        ((i)localObject3).rhq.setTag(localn);
        ((i)localObject3).crC();
        ((i)localObject3).rhq.setVisibility(0);
        ((i)localObject3).rhq.rrt = i.di((String)localObject2, 0);
        ((i)localObject3).rhq.setCommentInfo((cat)localObject1);
        ((i)localObject3).rhq.setCommentHint(((i)localObject3).context.getString(2131303840));
        ((i)localObject3).rhq.g(i.rhw, (String)localObject2);
        ((i)localObject3).rhq.lk(false);
        ((i)localObject3).c(paramView);
        AppMethodBeat.o(38170);
      }
    }
  }

  public final void dH(View paramView)
  {
    AppMethodBeat.i(38171);
    BaseTimeLineItem.BaseViewHolder localBaseViewHolder;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
    {
      localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
      if (this.rhF.qPr.ctX() == null)
        AppMethodBeat.o(38171);
      while (true)
      {
        return;
        this.rhF.qPr.ctX().crO();
        new n();
        paramView = this.rhF.qPr.DP(localBaseViewHolder.position);
        if (paramView.isValid())
          break;
        AppMethodBeat.o(38171);
      }
      localObject1 = com.tencent.mm.modelsns.b.lY(741);
      localObject2 = aj.q(paramView);
      localObject3 = ((com.tencent.mm.modelsns.b)localObject1).tx(com.tencent.mm.plugin.sns.data.i.j(paramView)).mb(paramView.field_type).cS(paramView.DI(32)).tx(paramView.crc()).tx(paramView.field_userName);
      if (localObject2 != null)
        break label393;
      i = 0;
      label160: localObject3 = ((com.tencent.mm.modelsns.b)localObject3).mb(i);
      if (localObject2 != null)
        break label403;
    }
    label393: label403: for (int i = 0; ; i = ((cbf)localObject2).xar)
    {
      ((com.tencent.mm.modelsns.b)localObject3).mb(i);
      ((com.tencent.mm.modelsns.b)localObject1).ajK();
      localObject1 = this.rhF;
      cat localcat = new cat();
      localObject2 = localBaseViewHolder.cFc + "@boss";
      ((i)localObject1).rhu = ((String)localObject2);
      ab.i("MicroMsg.BaseTimeLine", "[performAdAtBossClick] onCommentClick:  commentkey " + ((i)localObject1).rhu + " " + localBaseViewHolder.cFc + " position:" + localBaseViewHolder.position);
      com.tencent.mm.kernel.g.RQ();
      localObject3 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoM(paramView.field_userName).Oj();
      ((i)localObject1).rhq.setTag(paramView);
      ((i)localObject1).crC();
      ((i)localObject1).rhq.setVisibility(0);
      ((i)localObject1).rhq.setCommentFlag(i.di((String)localObject2, 1));
      ((i)localObject1).rhq.setCommentHint((String)localObject3);
      ((i)localObject1).rhq.setCommentInfo(localcat);
      ((i)localObject1).rhq.g(i.rhw, (String)localObject2);
      ((i)localObject1).c(localBaseViewHolder);
      AppMethodBeat.o(38171);
      break;
      i = ((cbf)localObject2).xao;
      break label160;
    }
  }

  public final void dI(View paramView)
  {
    AppMethodBeat.i(38172);
    if (this.rhF.qPr != null)
      this.rhF.qPr.dO(paramView);
    AppMethodBeat.o(38172);
  }

  public final void dJ(View paramView)
  {
    AppMethodBeat.i(38173);
    BaseTimeLineItem.BaseViewHolder localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
    n localn = af.cnF().YT(localBaseViewHolder.cwT);
    if ((localn == null) || (localn.cnn()) || (i.a(this.rhF)))
    {
      AppMethodBeat.o(38173);
      return;
    }
    int i = 0;
    int j = i;
    Object localObject1;
    label209: label353: long l;
    if (localn.DI(32))
    {
      j = i;
      if (localn.cqu().xfI.wbJ == 27)
      {
        j = i;
        if ((localBaseViewHolder.rIu instanceof com.tencent.mm.plugin.sns.ui.item.i))
        {
          localObject1 = (com.tencent.mm.plugin.sns.ui.item.i)localBaseViewHolder.rIu;
          Object localObject2 = ((i.b)localBaseViewHolder).rJh;
          if (((i.a)localObject2).rJe == null)
            break label617;
          Object localObject3 = ((i.a)localObject2).rJd;
          localObject2 = ((i.a)localObject2).ros;
          Object localObject4 = ((BaseTimeLineItem.BaseViewHolder)localObject3).timeLineObject;
          Object localObject5 = (i.b)localObject3;
          localObject3 = ((i.b)localObject5).rJh;
          if ((((TimeLineObject)localObject4).xfI.wbJ != 27) || (((TimeLineObject)localObject4).xfI.wbK.size() < 2))
            break label617;
          i = 0;
          if (((n)localObject2).field_likeFlag != 1)
            break label600;
          i = 1;
          j = 0;
          Object localObject6 = (bau)((TimeLineObject)localObject4).xfI.wbK.get(i);
          ((TimeLineObject)localObject4).xfI.wbK.get(j);
          localObject4 = ((i.b)localObject5).rJf;
          localObject6 = com.tencent.mm.plugin.sns.ui.item.i.u(((i.b)localObject5).rJf, i, ((bau)localObject6).jCt);
          localObject5 = com.tencent.mm.plugin.sns.ui.item.i.u(((i.b)localObject5).rJf, j, 2);
          int[] arrayOfInt = new int[2];
          ((View)localObject4).getLocationOnScreen(arrayOfInt);
          ((View)localObject4).setPivotY(((com.tencent.mm.plugin.sns.ui.item.i)localObject1).mScreenHeight / 2 - arrayOfInt[1]);
          ((View)localObject4).setCameraDistance(8000.0F);
          float f1 = ((View)localObject4).getWidth() / 2.0F;
          float f2 = ((View)localObject4).getHeight() / 2.0F;
          if (((n)localObject2).field_likeFlag != 1)
            break label606;
          j = -90;
          i = 90;
          localObject2 = new a(((View)localObject4).getContext(), 0.0F, i, f1, f2, true);
          ((a)localObject2).setDuration(187L);
          ((a)localObject2).setInterpolator(new AccelerateInterpolator());
          ((a)localObject2).setAnimationListener(new i.6((com.tencent.mm.plugin.sns.ui.item.i)localObject1, (View)localObject5, (View)localObject6, (i.a)localObject3, (View)localObject4, j, f1, f2));
          ((View)localObject4).startAnimation((Animation)localObject2);
          j = 374;
          label436: if (localn.field_likeFlag == 0)
            this.rhF.rhm.jP(localBaseViewHolder.rHt);
          if ((localn.cqu().xfI.wbK.size() > ((i.b)localBaseViewHolder).rJh.index) && (((bau)localn.cqu().xfI.wbK.get(((i.b)localBaseViewHolder).rJh.index)).jCt == 6))
          {
            localObject1 = this.rhF.rhm;
            l = localBaseViewHolder.rHt;
            if (((i.b)localBaseViewHolder).rJh.index <= 0)
              break label623;
          }
        }
      }
    }
    label600: label606: label617: label623: for (boolean bool = true; ; bool = false)
    {
      ((com.tencent.mm.plugin.sns.a.b.g)localObject1).x(l, bool);
      i.a(this.rhF, true);
      new ak().postDelayed(new i.1.2(this, localn, localBaseViewHolder, paramView), j);
      AppMethodBeat.o(38173);
      break;
      j = 1;
      break label209;
      j = 90;
      i = -90;
      break label353;
      j = 0;
      break label436;
    }
  }

  public final void dK(View paramView)
  {
    AppMethodBeat.i(38174);
    this.rhF.rhx.crO();
    this.rhF.rhy.iXr = true;
    this.rhF.rhy.dF(paramView);
    AppMethodBeat.o(38174);
  }

  public final void dL(View paramView)
  {
    AppMethodBeat.i(38176);
    this.rhF.rhy.cox();
    if (paramView.getTag() != null)
    {
      paramView = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
      this.rhF.rhm.j(paramView.position, paramView.cwT, 1);
    }
    AppMethodBeat.o(38176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.1
 * JD-Core Version:    0.6.2
 */