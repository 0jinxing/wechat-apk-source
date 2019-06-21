package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

public final class i$a
  implements View.OnClickListener
{
  private String eoz;
  private cat qJj;
  private BaseTimeLineItem.BaseViewHolder rgW;
  private CharSequence rhM = "";

  public i$a(i parami, cat paramcat, String paramString, CharSequence paramCharSequence, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    this.eoz = paramString;
    this.qJj = paramcat;
    this.rgW = paramBaseViewHolder;
    this.rhM = paramCharSequence;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38187);
    if (!v.Zo(this.rgW.cFc))
      AppMethodBeat.o(38187);
    while (true)
    {
      return;
      this.rgW.rHN = paramView;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if ((this.qJj == null) || (this.qJj.vHl == null) || (!this.qJj.vHl.equals(this.rhF.ecX)))
      {
        new n();
        localObject1 = this.rhF.qPr.DP(this.rgW.position);
        if (((n)localObject1).cnn())
        {
          AppMethodBeat.o(38187);
        }
        else if (!m.k((n)localObject1))
        {
          com.tencent.mm.plugin.sns.lucky.ui.a.f(this.rgW.rHT.getContext(), this.rgW.rHT.DT(0));
          AppMethodBeat.o(38187);
        }
        else
        {
          localObject2 = b.lY(742);
          localObject3 = aj.q((n)localObject1);
          localObject4 = ((b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j((n)localObject1)).mb(((n)localObject1).field_type).cS(((n)localObject1).DI(32)).tx(((n)localObject1).crc());
          if (this.qJj.wZG == 0)
          {
            paramView = this.qJj.wZJ;
            label227: paramView = ((b)localObject4).tx(paramView).tx(this.qJj.vHl);
            if (localObject3 != null)
              break label541;
            i = 0;
            label252: paramView = paramView.mb(i);
            if (localObject3 != null)
              break label551;
          }
          label541: label551: for (int i = 0; ; i = ((cbf)localObject3).xar)
          {
            paramView.mb(i);
            ((b)localObject2).ajK();
            paramView = this.rhF;
            localObject3 = this.rgW;
            localObject4 = i.c(this.rhF).getString(2131303752) + this.eoz;
            cat localcat = this.qJj;
            localObject2 = ((BaseTimeLineItem.BaseViewHolder)localObject3).cFc + (String)localObject4;
            paramView.rhu = ((String)localObject2);
            ab.i("MicroMsg.BaseTimeLine", "[performCommentClick] onCommentClick:  commentkey " + paramView.rhu + " " + ((BaseTimeLineItem.BaseViewHolder)localObject3).cFc + " position:" + ((BaseTimeLineItem.BaseViewHolder)localObject3).position);
            paramView.rhq.setTag(localObject1);
            paramView.crC();
            paramView.rhq.setVisibility(0);
            paramView.rhq.rrt = i.di((String)localObject2, 0);
            paramView.rhq.setCommentHint((String)localObject4 + paramView.context.getString(2131303593));
            paramView.rhq.setCommentInfo(localcat);
            paramView.rhq.g(i.rhw, (String)localObject2);
            paramView.rhq.lk(false);
            paramView.c((BaseTimeLineItem.BaseViewHolder)localObject3);
            AppMethodBeat.o(38187);
            break;
            paramView = this.qJj.wZG;
            break label227;
            i = ((cbf)localObject3).xao;
            break label252;
          }
        }
      }
      else
      {
        if (this.rhF.rhr.rDP)
        {
          this.rhF.crD();
          this.rhF.rhr.rDP = false;
        }
        localObject3 = new com.tencent.mm.ui.widget.b.a(i.c(this.rhF));
        localObject4 = new i.a.1(this);
        localObject2 = new i.a.2(this);
        localObject1 = new int[2];
        if ((paramView.getTag(2131820679) instanceof int[]))
          localObject1 = (int[])paramView.getTag(2131820679);
        ((com.tencent.mm.ui.widget.b.a)localObject3).a(paramView, (View.OnCreateContextMenuListener)localObject4, (n.d)localObject2, localObject1[0], localObject1[1]);
        AppMethodBeat.o(38187);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.a
 * JD-Core Version:    0.6.2
 */