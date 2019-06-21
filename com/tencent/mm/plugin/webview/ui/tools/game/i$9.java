package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.pointers.PBool;
import org.json.JSONException;
import org.json.JSONObject;

final class i$9
  implements DialogInterface.OnClickListener
{
  i$9(PBool paramPBool, JSONObject paramJSONObject, a parama, i.a parama1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(8789);
    this.uEq.value = true;
    try
    {
      this.uEr.put("reserve_for_wifi", 0);
      label25: paramDialogInterface = this.kMF;
      this.kMF.field_downloadInWifi = false;
      paramDialogInterface.field_reserveInWifi = false;
      c.e(this.kMF);
      if (this.kMF.field_status == 0)
        ((d)g.K(d.class)).kP(this.kMF.field_appId);
      this.uEo.d(null, this.uEr);
      AppMethodBeat.o(8789);
      return;
    }
    catch (JSONException paramDialogInterface)
    {
      break label25;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.9
 * JD-Core Version:    0.6.2
 */