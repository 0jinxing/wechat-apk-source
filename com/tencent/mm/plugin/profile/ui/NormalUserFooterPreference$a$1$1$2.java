package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;

final class NormalUserFooterPreference$a$1$1$2
  implements DialogInterface.OnClickListener
{
  NormalUserFooterPreference$a$1$1$2(NormalUserFooterPreference.a.1.1 param1, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23673);
    this.poU.poT.poS.cbr();
    if (NormalUserFooterPreference.a(this.poU.poT.poS.poR).getSource() == 18)
    {
      NormalUserFooterPreference.a(this.poU.poT.poS.poR, 9);
      if (this.pkD.isChecked())
        NormalUserFooterPreference.a.c(this.poU.poT.poS);
    }
    AppMethodBeat.o(23673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.1.1.2
 * JD-Core Version:    0.6.2
 */