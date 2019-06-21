package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc, Context paramContext, d.a parama, d.b paramb, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(36776);
    c.a(this.qPD, this.val$context, paramView, this.qPz, this.qPA, this.qPB, this.qPC);
    AppMethodBeat.o(36776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.c.1
 * JD-Core Version:    0.6.2
 */