package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class ao$1
  implements DialogInterface.OnClickListener
{
  ao$1(ao paramao, JSONObject paramJSONObject, long paramLong, bc.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6361);
    ao.a(this.uku, this.kOJ, this.kOw);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(6361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ao.1
 * JD-Core Version:    0.6.2
 */