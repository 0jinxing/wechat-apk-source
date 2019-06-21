package com.tencent.mm.pluginsdk.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PermissionActivity$4
  implements DialogInterface.OnClickListener
{
  PermissionActivity$4(PermissionActivity paramPermissionActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79430);
    ab.i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations app_cancel");
    this.vdp.finish();
    AppMethodBeat.o(79430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.PermissionActivity.4
 * JD-Core Version:    0.6.2
 */