package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.sdk.platformtools.ab;

final class b$37
  implements View.OnClickListener
{
  b$37(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40299);
    Object localObject;
    int i;
    if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
    {
      localObject = ((BaseTimeLineItem.BaseViewHolder)paramView.getTag()).cwT;
      localObject = af.cnF().YT((String)localObject);
      if (localObject == null)
      {
        AppMethodBeat.o(40299);
        return;
      }
      if (((n)localObject).DI(32))
      {
        ab.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
        i = this.rKt.cvd;
        if (this.rKt.cvd != 0)
          break label117;
      }
    }
    label117: for (int j = 1; ; j = 2)
    {
      i.a(new SnsAdClick(i, j, ((n)localObject).field_snsId, 24, 0));
      this.rKt.dH(paramView);
      AppMethodBeat.o(40299);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.37
 * JD-Core Version:    0.6.2
 */