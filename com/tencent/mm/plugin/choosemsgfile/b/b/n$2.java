package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$2
  implements View.OnClickListener
{
  n$2(n paramn)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54332);
    paramView = (a)paramView.getTag();
    if (paramView == null)
    {
      AppMethodBeat.o(54332);
      return;
    }
    if (!this.kuS.kuN.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      if (paramView.isEnable())
      {
        this.kuS.kuN.setChecked(bool);
        paramView.a(bool, paramView, this.kuS);
      }
      AppMethodBeat.o(54332);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.n.2
 * JD-Core Version:    0.6.2
 */