package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract.Contacts;
import com.tencent.luggage.g.e;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 72;
  public static final String NAME = "chooseContact";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126271);
    Context localContext = paramc.getContext();
    if ((localContext == null) || (!(localContext instanceof Activity)))
    {
      ab.e("MicroMsg.JsApiChooseContact", "getPageContext failed, appid is %s", new Object[] { paramc.getAppId() });
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(126271);
    }
    while (true)
    {
      return;
      n.b(paramc.getAppId(), new c.2(this, paramc, paramJSONObject, paramInt));
      paramJSONObject = paramc.getContext();
      int i;
      if ((paramJSONObject == null) || (!(paramJSONObject instanceof Activity)))
      {
        paramc.M(paramInt, j("fail", null));
        i = 0;
      }
      while (true)
      {
        if (i != 0)
          break label183;
        ab.i("MicroMsg.JsApiChooseContact", "check permission");
        AppMethodBeat.o(126271);
        break;
        boolean bool = g.a((Activity)paramJSONObject, "android.permission.READ_CONTACTS", 48, "", "");
        i = bool;
        if (bool)
        {
          n.Dr(paramc.getAppId());
          i = bool;
        }
      }
      label183: paramJSONObject = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
      e.ax(localContext).a(paramJSONObject, new c.1(this, paramc, paramInt, localContext));
      AppMethodBeat.o(126271);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.c
 * JD-Core Version:    0.6.2
 */