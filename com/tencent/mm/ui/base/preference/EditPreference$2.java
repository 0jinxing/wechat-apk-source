package com.tencent.mm.ui.base.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class EditPreference$2
  implements DialogInterface.OnClickListener
{
  EditPreference$2(EditPreference paramEditPreference)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(107161);
    if (EditPreference.a(this.yBC) != null)
      EditPreference.a(this.yBC).dismiss();
    AppMethodBeat.o(107161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.EditPreference.2
 * JD-Core Version:    0.6.2
 */