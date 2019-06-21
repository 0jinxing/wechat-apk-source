package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class SnsOnlineVideoActivity$13
  implements View.OnLongClickListener
{
  SnsOnlineVideoActivity$13(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(39160);
    SnsOnlineVideoActivity.a(this.rvf, new d(this.rvf.mController.ylL, 1, false));
    SnsOnlineVideoActivity.o(this.rvf).rBl = this.rvf.rve;
    SnsOnlineVideoActivity.o(this.rvf).rBm = this.rvf.jOb;
    SnsOnlineVideoActivity.o(this.rvf).zQf = new SnsOnlineVideoActivity.13.1(this);
    SnsOnlineVideoActivity.o(this.rvf).cpD();
    AppMethodBeat.o(39160);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.13
 * JD-Core Version:    0.6.2
 */