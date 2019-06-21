package com.tencent.mm.plugin.location.ui.impl;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.ui.l;
import com.tencent.mm.plugin.location.ui.l.3;
import com.tencent.mm.plugin.location.ui.l.4;
import com.tencent.mm.ui.base.h;

final class g$7
  implements View.OnClickListener
{
  g$7(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113676);
    paramView = this.nQT.nQI;
    h.d(paramView.mContext, paramView.mResources.getString(2131300992), "", paramView.mResources.getString(2131296901), paramView.mResources.getString(2131296868), new l.3(paramView), new l.4(paramView));
    AppMethodBeat.o(113676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g.7
 * JD-Core Version:    0.6.2
 */