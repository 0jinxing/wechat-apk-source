package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc, Context paramContext, d.a parama, d.b paramb, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(36777);
    c.a(this.qPD, this.val$context, paramView, this.qPz, this.qPA, this.qPB, this.qPC);
    AppMethodBeat.o(36777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.c.2
 * JD-Core Version:    0.6.2
 */