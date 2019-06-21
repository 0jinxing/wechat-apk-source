package com.tencent.mm.plugin.aa.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class LaunchAAUI$5
  implements View.OnClickListener
{
  LaunchAAUI$5(LaunchAAUI paramLaunchAAUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40827);
    this.gpj.aoB();
    this.gpj.aqX();
    LaunchAAUI.a(this.gpj, this.gpk);
    AppMethodBeat.o(40827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.5
 * JD-Core Version:    0.6.2
 */