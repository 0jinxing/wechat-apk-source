package com.tencent.mm.pluginsdk.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PermissionActivity$1
  implements DialogInterface.OnClickListener
{
  PermissionActivity$1(PermissionActivity paramPermissionActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79427);
    try
    {
      ab.i("MicroMsg.PermissionActivity", "START_SETTINGS_REQUEST click ok");
      this.vdp.startActivityForResult(PermissionActivity.a(this.vdp), 1);
      AppMethodBeat.o(79427);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", new Object[] { Integer.valueOf(PermissionActivity.b(this.vdp)), paramDialogInterface.getMessage() });
        AppMethodBeat.o(79427);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.PermissionActivity.1
 * JD-Core Version:    0.6.2
 */