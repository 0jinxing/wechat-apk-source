package com.tencent.mm.pluginsdk.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;

final class RequestFloatWindowPermissionDialog$2
  implements DialogInterface.OnClickListener
{
  RequestFloatWindowPermissionDialog$2(RequestFloatWindowPermissionDialog paramRequestFloatWindowPermissionDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79438);
    if (com.tencent.mm.compatible.util.d.iW(23));
    while (true)
    {
      try
      {
        if (!bo.isNullOrNil((String)Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(Settings.class)))
        {
          localObject = this.vds;
          Intent localIntent = new android/content/Intent;
          paramDialogInterface = new java/lang/StringBuilder;
          paramDialogInterface.<init>("package:");
          localIntent.<init>("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(ah.getPackageName()));
          ((RequestFloatWindowPermissionDialog)localObject).startActivityForResult(localIntent, RequestFloatWindowPermissionDialog.vdq);
          AppMethodBeat.o(79438);
          return;
        }
      }
      catch (Exception paramDialogInterface)
      {
        ab.e("MicroMsg.RequestFloatWindowPermissionDialog", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", new Object[] { paramDialogInterface.getMessage(), paramDialogInterface.getClass().getCanonicalName() });
      }
      Object localObject = this.vds.getString(2131299900);
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("rawUrl", (String)localObject);
      paramDialogInterface.putExtra("useJs", true);
      paramDialogInterface.putExtra("vertical_scroll", true);
      com.tencent.mm.bp.d.b(this.vds, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
      this.vds.finish();
      AppMethodBeat.o(79438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.2
 * JD-Core Version:    0.6.2
 */