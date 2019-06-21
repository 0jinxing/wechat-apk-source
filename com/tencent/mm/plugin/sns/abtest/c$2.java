package com.tencent.mm.plugin.sns.abtest;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.bo;

final class c$2
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(35681);
    if ((paramView.getTag() instanceof n))
    {
      n localn = (n)paramView.getTag();
      if ((localn != null) && (!bo.isNullOrNil(localn.cqA())))
        c.S(paramView.getContext(), localn.cqA());
    }
    AppMethodBeat.o(35681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.c.2
 * JD-Core Version:    0.6.2
 */