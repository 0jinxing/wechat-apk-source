package com.tencent.mm.pluginsdk.ui.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1$2
  implements DialogInterface.OnClickListener
{
  a$1$2(a.1 param1, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28026);
    paramDialogInterface = this.vqr.getText().toString().trim();
    if ((paramDialogInterface != null) && (paramDialogInterface.length() > 0))
      a.a(this.vqq.vqo, paramDialogInterface);
    AppMethodBeat.o(28026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.a.1.2
 * JD-Core Version:    0.6.2
 */