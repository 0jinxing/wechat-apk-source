package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTimeLineUI$51
  implements DialogInterface.OnClickListener
{
  SnsTimeLineUI$51(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39525);
    if (SnsTimeLineUI.L(this.rzs).scene != 3)
    {
      if (paramInt != 0)
        break label50;
      SnsTimeLineUI.L(this.rzs).Ek(3);
    }
    while (true)
    {
      SnsTimeLineUI.b(SnsTimeLineUI.L(this.rzs));
      AppMethodBeat.o(39525);
      return;
      label50: SnsTimeLineUI.L(this.rzs).Ek(2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.51
 * JD-Core Version:    0.6.2
 */