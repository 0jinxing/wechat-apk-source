package com.tencent.mm.plugin.profile.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;

final class b$1
  implements DialogInterface.OnClickListener
{
  b$1(b paramb, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23257);
    b.a(this.pkE);
    if (b.b(this.pkE).getSource() == 18)
    {
      b.c(this.pkE);
      if (this.pkD.isChecked())
        this.pkE.cax();
    }
    AppMethodBeat.o(23257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.b.1
 * JD-Core Version:    0.6.2
 */