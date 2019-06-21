package com.tencent.mm.plugin.aa.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AAEntranceUI$1
  implements View.OnClickListener
{
  AAEntranceUI$1(AAEntranceUI paramAAEntranceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40708);
    AAEntranceUI.a(this.gnc);
    AppMethodBeat.o(40708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAEntranceUI.1
 * JD-Core Version:    0.6.2
 */