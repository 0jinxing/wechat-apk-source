package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankListHeaderView$1
  implements View.OnClickListener
{
  ExdeviceRankListHeaderView$1(ExdeviceRankListHeaderView paramExdeviceRankListHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20202);
    if (ExdeviceRankListHeaderView.a(this.lDK))
      ExdeviceRankListHeaderView.b(this.lDK);
    if (ExdeviceRankListHeaderView.c(this.lDK) != null)
      ExdeviceRankListHeaderView.c(this.lDK).onClick(this.lDK);
    AppMethodBeat.o(20202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView.1
 * JD-Core Version:    0.6.2
 */