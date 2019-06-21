package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$9
  implements View.OnClickListener
{
  UnfamiliarContactDetailUI$9(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127646);
    paramView = (CheckBox)UnfamiliarContactDetailUI.i(this.qpX).findViewById(2131820932);
    if (!paramView.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramView.setChecked(bool);
      if (!paramView.isChecked())
        break;
      for (int i = 0; i < UnfamiliarContactDetailUI.f(this.qpX).size(); i++)
        UnfamiliarContactDetailUI.b(this.qpX).add(Integer.valueOf(i));
    }
    UnfamiliarContactDetailUI.b(this.qpX).clear();
    if (UnfamiliarContactDetailUI.b(this.qpX).size() > 0)
    {
      UnfamiliarContactDetailUI.d(this.qpX).setEnabled(true);
      UnfamiliarContactDetailUI.c(this.qpX).setEnabled(true);
    }
    while (true)
    {
      UnfamiliarContactDetailUI.j(this.qpX).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(127645);
          UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.9.this.qpX).aop.notifyChanged();
          AppMethodBeat.o(127645);
        }
      });
      AppMethodBeat.o(127646);
      return;
      UnfamiliarContactDetailUI.d(this.qpX).setEnabled(false);
      UnfamiliarContactDetailUI.c(this.qpX).setEnabled(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.9
 * JD-Core Version:    0.6.2
 */