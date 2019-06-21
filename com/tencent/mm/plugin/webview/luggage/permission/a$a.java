package com.tencent.mm.plugin.webview.luggage.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class a$a
{
  public JsapiPermissionWrapper ulr;
  public GeneralControlWrapper uls;

  public a$a(JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    this.ulr = paramJsapiPermissionWrapper;
    this.uls = paramGeneralControlWrapper;
  }

  public final String toString()
  {
    AppMethodBeat.i(6481);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Permission: jsPerm = ");
    ((StringBuilder)localObject).append(this.ulr);
    ((StringBuilder)localObject).append(", genCtrl = ");
    ((StringBuilder)localObject).append(this.uls);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(6481);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.a.a
 * JD-Core Version:    0.6.2
 */