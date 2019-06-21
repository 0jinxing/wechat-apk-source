package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class k$a
{
  public JsapiPermissionWrapper ulr;
  public GeneralControlWrapper uls;

  public k$a(JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    this.ulr = paramJsapiPermissionWrapper;
    this.uls = paramGeneralControlWrapper;
  }

  public final String toString()
  {
    AppMethodBeat.i(7687);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Permission: jsPerm = ");
    ((StringBuilder)localObject).append(this.ulr);
    ((StringBuilder)localObject).append(", genCtrl = ");
    ((StringBuilder)localObject).append(this.uls);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(7687);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.k.a
 * JD-Core Version:    0.6.2
 */