package com.tencent.mm.view;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.footer.SelectColorBar;

final class a$7
  implements CompoundButton.OnCheckedChangeListener
{
  a$7(a parama, SelectColorBar paramSelectColorBar)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(116378);
    if (paramBoolean)
    {
      this.zZV.setSelectColor(((Integer)a.c(this.zZU).getTag()).intValue());
      a.b(this.zZU).setTextBackground(((Integer)a.c(this.zZU).getTag()).intValue());
      AppMethodBeat.o(116378);
    }
    while (true)
    {
      return;
      a.c(this.zZU).setTag(Integer.valueOf(this.zZV.getCurColor()));
      a.b(this.zZU).setTextBackground(0);
      AppMethodBeat.o(116378);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.7
 * JD-Core Version:    0.6.2
 */