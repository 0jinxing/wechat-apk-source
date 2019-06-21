package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.facebook.AccessToken;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.d;
import com.tencent.mm.ui.f.a.d.a;
import org.json.JSONObject;

final class FacebookLoginUI$5
  implements d.a
{
  FacebookLoginUI$5(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void g(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(124836);
    ab.i("MicroMsg.FacebookLoginUI", "facebook-android get name and picture completed!");
    if (paramJSONObject != null);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(this.gBp, RegByMobileRegAIOUI.class);
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (FacebookLoginUI.a(this.gBp).zxJ != null)
      {
        localObject2 = localObject1;
        if (FacebookLoginUI.a(this.gBp).zxJ.getToken() != null)
          localObject2 = FacebookLoginUI.a(this.gBp).zxJ.getToken().toString();
      }
      localIntent.putExtra("third_app_token", (String)localObject2);
      localIntent.putExtra("register_title", this.gBp.getString(2131298783));
      if (paramJSONObject.has("name"))
      {
        localIntent.putExtra("register_nick_name", paramJSONObject.getString("name"));
        ab.i("MicroMsg.FacebookLoginUI", "name %s", new Object[] { paramJSONObject.getString("name") });
      }
      if (paramJSONObject.has("picture"))
      {
        ab.i("MicroMsg.FacebookLoginUI", "picture %s", new Object[] { paramJSONObject.get("picture") });
        localIntent.putExtra("register_avatar", ((JSONObject)paramJSONObject.get("picture")).getJSONObject("data").getString("url"));
      }
      this.gBp.startActivity(localIntent);
      this.gBp.finish();
      FacebookLoginUI.c(this.gBp).daR = 1L;
      FacebookLoginUI.c(this.gBp).cVS = 4L;
      FacebookLoginUI.c(this.gBp).ajK();
      AppMethodBeat.o(124836);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FacebookLoginUI", paramJSONObject, "parse json error!", new Object[0]);
        h.b(this.gBp, "Retrieve Failed, Error Format!", "", true);
        AppMethodBeat.o(124836);
      }
    }
  }

  public final void onError(String paramString)
  {
    AppMethodBeat.i(124837);
    ab.i("MicroMsg.FacebookLoginUI", "facebook-android get name and picture error! %s", new Object[] { paramString });
    h.b(this.gBp, this.gBp.getString(2131299530), "", true);
    AppMethodBeat.o(124837);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.5
 * JD-Core Version:    0.6.2
 */