package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;

final class au$5
  implements View.OnClickListener
{
  au$5(au paramau)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39407);
    ab.i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
    this.ryd.rxP.rhp = false;
    com.tencent.mm.plugin.sns.abtest.a.clW();
    if (!(paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
    {
      ab.e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
      AppMethodBeat.o(39407);
    }
    while (true)
    {
      return;
      BaseTimeLineItem.BaseViewHolder localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
      if ((localBaseViewHolder.timeLineObject != null) && (localBaseViewHolder.timeLineObject.xfI.wbJ == 21))
      {
        bav localbav = localBaseViewHolder.rfi;
        if ((!r.Yz().equals(localBaseViewHolder.timeLineObject.jBB)) && ((localbav == null) || (localbav.cRU == 0)))
        {
          com.tencent.mm.plugin.sns.lucky.ui.a.f(this.ryd.crP, localBaseViewHolder.rHT.DT(0));
          AppMethodBeat.o(39407);
        }
      }
      else
      {
        if ((this.ryd.crP instanceof t))
          ((t)this.ryd.crP).dM(paramView);
        AppMethodBeat.o(39407);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.5
 * JD-Core Version:    0.6.2
 */