package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.b.a;
import java.util.LinkedList;

final class SnsCommentDetailUI$b extends BaseAdapter
{
  Activity activity;
  String cwT;
  public LinkedList<cat> rrj;
  LinkedList<cat> rrk;

  public SnsCommentDetailUI$b(LinkedList<cat> paramLinkedList1, LinkedList<cat> paramLinkedList2, Activity paramActivity, String paramString)
  {
    this.rrj = paramLinkedList2;
    this.rrk = paramActivity;
    this.activity = paramString;
    Object localObject;
    this.cwT = localObject;
  }

  public final int getCount()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(38831);
    if (this.rrk.size() > 0)
      if (this.rrj == null)
      {
        j++;
        AppMethodBeat.o(38831);
      }
    while (true)
    {
      return j;
      j = this.rrj.size();
      break;
      if (this.rrj == null)
      {
        AppMethodBeat.o(38831);
        j = i;
      }
      else
      {
        j = this.rrj.size();
        AppMethodBeat.o(38831);
      }
    }
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(38832);
    int i = paramInt;
    if (this.rrk.size() > 0)
    {
      if (paramInt == 0)
      {
        paramView = SnsCommentDetailUI.H(this.rqN);
        AppMethodBeat.o(38832);
        return paramView;
      }
      i = paramInt - 1;
    }
    cat localcat = (cat)this.rrj.get(i);
    if ((paramView == null) || (!(paramView.getTag() instanceof SnsCommentDetailUI.b.a)))
    {
      paramView = v.hu(this.activity).inflate(2130970754, null);
      paramView.setOnTouchListener(SnsCommentDetailUI.I(this.rqN));
      paramViewGroup = new SnsCommentDetailUI.b.a(this);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131827731));
      paramViewGroup.ejo.setOnClickListener(SnsCommentDetailUI.J(this.rqN));
      paramViewGroup.pnE = ((TextView)paramView.findViewById(2131827733));
      paramViewGroup.pnE.setOnTouchListener(new aa());
      paramViewGroup.pnE.setOnClickListener(new SnsCommentDetailUI.b.2(this));
      paramViewGroup.timeTv = ((TextView)paramView.findViewById(2131827732));
      paramViewGroup.gKl = ((TextView)paramView.findViewById(2131827734));
      paramViewGroup.gKl.setOnTouchListener(new aa());
      paramViewGroup.rrm = ((SnsTranslateResultView)paramView.findViewById(2131827715));
      paramViewGroup.rrm.setVisibility(8);
      if (SnsCommentDetailUI.C(this.rqN) != 10)
        break label1272;
      paramView.findViewById(2131827728).setBackgroundResource(2130838855);
    }
    label258: label317: label474: label885: label1272: 
    while (true)
    {
      paramViewGroup.rrn = localcat;
      paramViewGroup.userName = localcat.vHl;
      ((SnsAvatarImageView)paramViewGroup.ejo).dk(localcat.vHl, 3);
      ((SnsAvatarImageView)paramViewGroup.ejo).setWeakContext(this.activity);
      Object localObject1;
      long l;
      if (SnsCommentDetailUI.C(this.rqN) == 10)
      {
        paramInt = 3;
        SnsCommentDetailUI.C(this.rqN);
        g.RQ();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(paramViewGroup.userName);
        if ((i != 0) || (!this.rrk.isEmpty()))
          break label1107;
        if (SnsCommentDetailUI.C(this.rqN) != 10)
          break label1097;
        paramView.setBackgroundResource(2130838856);
        if (i != 0)
          break label1139;
        paramView.findViewById(2131827730).setVisibility(0);
        paramView.findViewById(2131827729).setVisibility(8);
        if (SnsCommentDetailUI.C(this.rqN) == 10)
          ((ImageView)paramView.findViewById(2131827730)).setImageResource(2131231333);
        a.b.t(paramViewGroup.ejo, localcat.vHl);
        paramViewGroup.ejo.setTag(localcat.vHl);
        if (localObject1 == null)
          break label1162;
        localObject1 = ((ad)localObject1).Oj();
        Object localObject2 = h.YS(SnsCommentDetailUI.o(this.rqN));
        if (localObject2 != null)
        {
          paramViewGroup.gKl.setText(localcat.ncM + " ");
          localObject2 = d.a(this.rqN, localcat, SnsCommentDetailUI.K(this.rqN), ((n)localObject2).field_type, ((n)localObject2).field_userName, 2);
          paramViewGroup.pnE.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
          com.tencent.mm.pluginsdk.ui.e.j.h(paramViewGroup.pnE, paramInt);
          k localk = new k(paramViewGroup.pnE.getText());
          ab.i("MicroMsg.SnsCommentDetailUI", "test %s,%s", new Object[] { localcat.vHl, localObject1 });
          localk.a(new o(localcat.vHl, SnsCommentDetailUI.K(this.rqN), paramInt), (CharSequence)localObject1, 0);
          paramViewGroup.pnE.setText(localk, TextView.BufferType.SPANNABLE);
          paramViewGroup.timeTv.setText(aw.m(this.activity, localcat.pcX * 1000L));
          paramViewGroup.gKl.setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
          paramViewGroup.gKl.setVisibility(0);
          SnsCommentDetailUI.L(this.rqN).c(paramView, SnsCommentDetailUI.B(this.rqN).rJU, SnsCommentDetailUI.B(this.rqN).rJH);
          SnsCommentDetailUI.L(this.rqN).c(paramViewGroup.gKl, SnsCommentDetailUI.B(this.rqN).rJU, SnsCommentDetailUI.B(this.rqN).rJH);
          if (localcat.wZG == 0)
            break label1190;
          l = localcat.wZG;
          localObject2 = ap.ga(SnsCommentDetailUI.o(this.rqN), String.valueOf(l));
          if ((ap.db((String)localObject2, 4)) && (paramViewGroup.rrm != null))
          {
            localObject2 = ap.Ye((String)localObject2);
            if (localObject2 == null)
              break label1223;
            paramViewGroup.rrm.setVisibility(0);
            if (!((ap.b)localObject2).foa)
              break label1212;
            if (((ap.b)localObject2).aAR)
              break label1200;
            paramViewGroup.rrm.a((ap.b)localObject2, 2, ((ap.b)localObject2).result, ((ap.b)localObject2).fwM, ((ap.b)localObject2).qMV);
          }
          paramView.setClickable(true);
          ab.d("MicroMsg.SnsCommentDetailUI", "position " + localcat.vHl + " self " + SnsCommentDetailUI.M(this.rqN) + " commentid " + localcat.wZG + " snsid " + SnsCommentDetailUI.o(this.rqN));
          if (!SnsCommentDetailUI.M(this.rqN).equals(localcat.vHl))
            break label1235;
        }
      }
      for (paramViewGroup.info = localcat; ; paramViewGroup.info = new Object[] { Integer.valueOf(i), localcat, localcat.vHl, localObject1 })
      {
        localObject1 = new l(SnsCommentDetailUI.k(this.rqN), SnsCommentDetailUI.o(this.rqN), localcat, localcat.vHl, localcat.ncM, paramViewGroup.gKl, 2);
        ((l)localObject1).tag = paramViewGroup;
        paramView.setTag(localObject1);
        paramViewGroup.gKl.setTag(localObject1);
        paramView.setOnClickListener(SnsCommentDetailUI.N(this.rqN));
        paramViewGroup.gKl.setOnClickListener(SnsCommentDetailUI.N(this.rqN));
        AppMethodBeat.o(38832);
        break;
        paramViewGroup = (SnsCommentDetailUI.b.a)paramView.getTag();
        break label258;
        paramInt = 2;
        break label317;
        paramView.setBackgroundResource(2130840260);
        break label386;
        if (SnsCommentDetailUI.C(this.rqN) == 10)
        {
          paramView.setBackgroundResource(2130840265);
          break label386;
        }
        paramView.setBackgroundResource(2130840264);
        break label386;
        paramView.findViewById(2131827730).setVisibility(4);
        paramView.findViewById(2131827729).setVisibility(0);
        break label438;
        if (localcat.wCW != null)
        {
          localObject1 = localcat.wCW;
          break label474;
        }
        localObject1 = localcat.vHl;
        break label474;
        l = localcat.wZJ;
        break label791;
        paramViewGroup.rrm.setVisibility(8);
        break label885;
        paramViewGroup.rrm.El(2);
        break label885;
        paramViewGroup.rrm.setVisibility(8);
        break label885;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.b
 * JD-Core Version:    0.6.2
 */