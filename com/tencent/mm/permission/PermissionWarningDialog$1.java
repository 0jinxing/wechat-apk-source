package com.tencent.mm.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PermissionWarningDialog$1
  implements DialogInterface.OnCancelListener
{
  PermissionWarningDialog$1(PermissionWarningDialog paramPermissionWarningDialog)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(16646);
    this.ggG.finish();
    AppMethodBeat.o(16646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.permission.PermissionWarningDialog.1
 * JD-Core Version:    0.6.2
 */