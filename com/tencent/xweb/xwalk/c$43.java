package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$43
  implements View.OnClickListener
{
  c$43(c paramc, CheckBox paramCheckBox)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85171);
    paramView = this.ARD;
    if (!this.ARD.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramView.setChecked(bool);
      AppMethodBeat.o(85171);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.43
 * JD-Core Version:    0.6.2
 */