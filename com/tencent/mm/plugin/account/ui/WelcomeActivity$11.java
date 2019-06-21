package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.c;
import org.json.JSONObject;

final class WelcomeActivity$11
  implements al.a
{
  JSONObject gBq = null;

  WelcomeActivity$11(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(125648);
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("fields", "name,picture.type(large)");
    try
    {
      localObject = WelcomeActivity.e(this.gIu).q("me", (Bundle)localObject);
      ab.i("MicroMsg.WelcomeActivity", "result json %s", new Object[] { localObject });
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      this.gBq = localJSONObject;
      AppMethodBeat.o(125648);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WelcomeActivity", localException, "get name and picture error!", new Object[0]);
        h.b(this.gIu, "Retrieve Failed, Error Format!", "", true);
      }
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(125649);
    if (this.gBq != null);
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(this.gIu, RegByMobileRegAIOUI.class);
      localIntent.putExtra("third_app_token", WelcomeActivity.e(this.gIu).gqE.toString());
      localIntent.putExtra("reg_3d_app_type", 1);
      localIntent.putExtra("register_title", this.gIu.getString(2131298783));
      localIntent.putExtra("register_nick_name", this.gBq.getString("name"));
      localIntent.putExtra("register_avatar", ((JSONObject)this.gBq.get("picture")).getJSONObject("data").getString("url"));
      this.gIu.startActivity(localIntent);
      WelcomeActivity.a(this.gIu).daR = 1L;
      WelcomeActivity.a(this.gIu).cVS = 3L;
      WelcomeActivity.a(this.gIu).ajK();
      AppMethodBeat.o(125649);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WelcomeActivity", localException, "parse json error!", new Object[0]);
        h.b(this.gIu, "Retrieve Failed, Error Format!", "", true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.11
 * JD-Core Version:    0.6.2
 */