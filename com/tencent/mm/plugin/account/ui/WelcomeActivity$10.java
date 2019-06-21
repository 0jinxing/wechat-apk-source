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

final class WelcomeActivity$10
  implements d.a
{
  WelcomeActivity$10(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final void g(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(125646);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android get name and picture completed!");
    if (paramJSONObject != null);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(this.gIu, RegByMobileRegAIOUI.class);
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (WelcomeActivity.d(this.gIu).zxJ != null)
      {
        localObject2 = localObject1;
        if (WelcomeActivity.d(this.gIu).zxJ.getToken() != null)
          localObject2 = WelcomeActivity.d(this.gIu).zxJ.getToken().toString();
      }
      localIntent.putExtra("third_app_token", (String)localObject2);
      localIntent.putExtra("reg_3d_app_type", 1);
      localIntent.putExtra("register_title", this.gIu.getString(2131298783));
      if (paramJSONObject.has("name"))
      {
        localIntent.putExtra("register_nick_name", paramJSONObject.getString("name"));
        ab.i("MicroMsg.WelcomeActivity", "name %s", new Object[] { paramJSONObject.getString("name") });
      }
      if (paramJSONObject.has("picture"))
      {
        ab.i("MicroMsg.WelcomeActivity", "picture %s", new Object[] { paramJSONObject.get("picture") });
        localIntent.putExtra("register_avatar", ((JSONObject)paramJSONObject.get("picture")).getJSONObject("data").getString("url"));
      }
      this.gIu.startActivity(localIntent);
      WelcomeActivity.a(this.gIu).daR = 1L;
      WelcomeActivity.a(this.gIu).cVS = 3L;
      WelcomeActivity.a(this.gIu).ajK();
      AppMethodBeat.o(125646);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WelcomeActivity", paramJSONObject, "parse json error!", new Object[0]);
        h.b(this.gIu, "Retrieve Failed, Error Format!", "", true);
        AppMethodBeat.o(125646);
      }
    }
  }

  public final void onError(String paramString)
  {
    AppMethodBeat.i(125647);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android get name and picture error! %s", new Object[] { paramString });
    h.b(this.gIu, this.gIu.getString(2131299530), "", true);
    AppMethodBeat.o(125647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.10
 * JD-Core Version:    0.6.2
 */