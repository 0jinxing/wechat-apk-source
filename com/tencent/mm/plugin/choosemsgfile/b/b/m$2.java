package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$2
  implements View.OnClickListener
{
  m$2(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54328);
    paramView = (a)paramView.getTag();
    if (paramView == null)
      AppMethodBeat.o(54328);
    while (true)
    {
      return;
      boolean bool;
      if (!this.kuQ.kuN.isChecked())
        bool = true;
      while (true)
        if (paramView.isEnable())
        {
          this.kuQ.kuN.setChecked(bool);
          paramView.a(bool, paramView, this.kuQ);
          if (!bool)
          {
            this.kuQ.kuM.setVisibility(0);
            AppMethodBeat.o(54328);
            break;
            bool = false;
            continue;
          }
          this.kuQ.kuM.setVisibility(8);
        }
      AppMethodBeat.o(54328);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.m.2
 * JD-Core Version:    0.6.2
 */