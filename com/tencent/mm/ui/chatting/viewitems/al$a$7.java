package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class al$a$7
  implements DialogInterface.OnClickListener
{
  al$a$7(al.a parama, String paramString, a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33293);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("rawUrl", this.zgN);
    paramDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    paramDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    d.b(this.zbG.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    AppMethodBeat.o(33293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.7
 * JD-Core Version:    0.6.2
 */