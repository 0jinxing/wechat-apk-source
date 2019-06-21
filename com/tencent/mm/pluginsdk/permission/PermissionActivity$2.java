package com.tencent.mm.pluginsdk.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PermissionActivity$2
  implements DialogInterface.OnClickListener
{
  PermissionActivity$2(PermissionActivity paramPermissionActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79428);
    this.vdp.finish();
    AppMethodBeat.o(79428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.PermissionActivity.2
 * JD-Core Version:    0.6.2
 */