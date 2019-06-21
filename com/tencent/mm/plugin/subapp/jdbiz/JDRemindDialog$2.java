package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JDRemindDialog$2
  implements DialogInterface.OnClickListener
{
  JDRemindDialog$2(JDRemindDialog paramJDRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25180);
    this.ssm.finish();
    AppMethodBeat.o(25180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog.2
 * JD-Core Version:    0.6.2
 */