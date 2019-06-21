package com.tencent.mm.plugin.exdevice.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankListHeaderView$2
  implements Runnable
{
  ExdeviceRankListHeaderView$2(ExdeviceRankListHeaderView paramExdeviceRankListHeaderView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20203);
    ExdeviceRankListHeaderView.e(this.lDK).startAnimation(ExdeviceRankListHeaderView.d(this.lDK));
    AppMethodBeat.o(20203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView.2
 * JD-Core Version:    0.6.2
 */