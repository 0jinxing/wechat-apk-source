package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class at extends a
{
  public static final int CTRL_INDEX = 62;
  public static final String NAME = "openAddress";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130513);
    Intent localIntent = new Intent();
    localIntent.putExtra("req_app_id", paramc.getAppId());
    localIntent.putExtra("launch_from_appbrand", true);
    if ((paramc instanceof q))
    {
      paramJSONObject = ((q)paramc).ad(Activity.class);
      if ((paramJSONObject != null) && ((paramJSONObject instanceof MMActivity)))
        break label101;
      paramJSONObject = null;
      label67: if (paramJSONObject != null)
        break label109;
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(130513);
    }
    while (true)
    {
      return;
      paramJSONObject = paramc.getContext();
      break;
      label101: paramJSONObject = (MMActivity)paramJSONObject;
      break label67;
      label109: paramJSONObject.ifE = new at.1(this, paramc, paramInt);
      d.a(paramJSONObject, "address", ".ui.WalletSelectAddrUI", localIntent, hashCode() & 0xFFFF, false);
      AppMethodBeat.o(130513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.at
 * JD-Core Version:    0.6.2
 */