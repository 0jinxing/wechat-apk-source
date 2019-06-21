package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$c$1
  implements View.OnClickListener
{
  UnfamiliarContactDetailUI$c$1(UnfamiliarContactDetailUI.c paramc, UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127658);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = this.qqk.moo;
    boolean bool;
    if (!this.qqk.moo.isChecked())
    {
      bool = true;
      paramView.setChecked(bool);
      if (!this.qqk.moo.isChecked())
        break label130;
      UnfamiliarContactDetailUI.b(this.qqk.qpX).add(Integer.valueOf(i));
      label75: if (UnfamiliarContactDetailUI.b(this.qqk.qpX).size() != 0)
        break label151;
      UnfamiliarContactDetailUI.d(this.qqk.qpX).setEnabled(false);
      UnfamiliarContactDetailUI.c(this.qqk.qpX).setEnabled(false);
      AppMethodBeat.o(127658);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label130: UnfamiliarContactDetailUI.b(this.qqk.qpX).remove(Integer.valueOf(i));
      break label75;
      label151: UnfamiliarContactDetailUI.d(this.qqk.qpX).setEnabled(true);
      UnfamiliarContactDetailUI.c(this.qqk.qpX).setEnabled(true);
      AppMethodBeat.o(127658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.c.1
 * JD-Core Version:    0.6.2
 */