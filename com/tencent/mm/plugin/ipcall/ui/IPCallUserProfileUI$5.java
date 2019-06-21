package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallUserProfileUI$5
  implements View.OnLongClickListener
{
  IPCallUserProfileUI$5(IPCallUserProfileUI paramIPCallUserProfileUI, TextView paramTextView)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(22375);
    IPCallUserProfileUI.a(this.nGq, this.nGs);
    AppMethodBeat.o(22375);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.5
 * JD-Core Version:    0.6.2
 */