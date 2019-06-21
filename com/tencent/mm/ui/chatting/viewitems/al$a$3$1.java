package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class al$a$3$1
  implements DialogInterface.OnClickListener
{
  al$a$3$1(al.a.3 param3, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33287);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("rawUrl", this.zgN);
    paramDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    paramDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    d.b(this.zgO.val$context, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    AppMethodBeat.o(33287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.3.1
 * JD-Core Version:    0.6.2
 */