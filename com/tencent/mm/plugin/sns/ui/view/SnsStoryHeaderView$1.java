package com.tencent.mm.plugin.sns.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class SnsStoryHeaderView$1
  implements View.OnClickListener
{
  SnsStoryHeaderView$1(SnsStoryHeaderView paramSnsStoryHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40420);
    if (SnsStoryHeaderView.a(this.rMu) != null)
      SnsStoryHeaderView.a(this.rMu).cun();
    h.pYm.k(1015L, 5L, 1L);
    SnsStoryHeaderView.b(this.rMu);
    AppMethodBeat.o(40420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.1
 * JD-Core Version:    0.6.2
 */