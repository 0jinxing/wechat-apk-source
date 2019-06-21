package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class RegSetInfoUI$18
  implements AdapterView.OnItemClickListener
{
  RegSetInfoUI$18(RegSetInfoUI paramRegSetInfoUI, String[] paramArrayOfString)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(125526);
    if (RegSetInfoUI.t(this.gHM) != null)
    {
      RegSetInfoUI.t(this.gHM).dismiss();
      RegSetInfoUI.u(this.gHM);
    }
    RegSetInfoUI.a(this.gHM).setText(this.gHR[paramInt]);
    RegSetInfoUI.a(this.gHM).postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125525);
        RegSetInfoUI.a(RegSetInfoUI.18.this.gHM).clearFocus();
        RegSetInfoUI.a(RegSetInfoUI.18.this.gHM).requestFocus();
        AppMethodBeat.o(125525);
      }
    }
    , 50L);
    RegSetInfoUI.r(this.gHM).setText(this.gHM.getString(2131302345));
    AppMethodBeat.o(125526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.18
 * JD-Core Version:    0.6.2
 */