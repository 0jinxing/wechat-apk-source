package com.tencent.mm.ui.base.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class EditPreference$1
  implements DialogInterface.OnClickListener
{
  EditPreference$1(EditPreference paramEditPreference, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(107160);
    if (EditPreference.a(this.yBC) != null)
      EditPreference.a(this.yBC).dismiss();
    this.yBC.value = this.yBB.getText().toString();
    if (EditPreference.b(this.yBC) != null)
      EditPreference.b(this.yBC).dAx();
    if (EditPreference.c(this.yBC) != null)
      EditPreference.c(this.yBC).a(this.yBC, EditPreference.d(this.yBC));
    AppMethodBeat.o(107160);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.EditPreference.1
 * JD-Core Version:    0.6.2
 */