package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class a$4
  implements DialogInterface.OnClickListener
{
  a$4(a parama, Context paramContext, JSONObject paramJSONObject, bc.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6267);
    a.a(this.ujO, this.hsm, this.kOw);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(6267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.a.4
 * JD-Core Version:    0.6.2
 */