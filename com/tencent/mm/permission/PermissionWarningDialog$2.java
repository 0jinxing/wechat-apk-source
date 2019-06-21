package com.tencent.mm.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PermissionWarningDialog$2
  implements DialogInterface.OnClickListener
{
  PermissionWarningDialog$2(PermissionWarningDialog paramPermissionWarningDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16647);
    this.ggG.finish();
    AppMethodBeat.o(16647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.permission.PermissionWarningDialog.2
 * JD-Core Version:    0.6.2
 */