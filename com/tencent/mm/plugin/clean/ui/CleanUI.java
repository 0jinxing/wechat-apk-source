package com.tencent.mm.plugin.clean.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import org.json.JSONException;
import org.json.JSONObject;

@a(19)
public class CleanUI extends MMActivity
{
  private long kwP;
  private String kwQ = "com.tencent.qqpimsecure";
  private String kwR = "00B1208638DE0FCD3E920886D658DAF6";
  private String kwS = "11206657";
  private JSONObject kwT;

  private boolean bgf()
  {
    boolean bool = false;
    AppMethodBeat.i(18732);
    bgg();
    if (!p.u(this.mController.ylL, this.kwQ))
      AppMethodBeat.o(18732);
    while (true)
    {
      return bool;
      Object localObject = p.bx(this, this.kwQ);
      if ((localObject != null) && (localObject[0] != null))
      {
        localObject = g.x(localObject[0].toByteArray());
        if ((localObject != null) && (((String)localObject).equalsIgnoreCase(this.kwR)))
          try
          {
            Intent localIntent = getPackageManager().getLaunchIntentForPackage(this.kwQ);
            if (localIntent != null)
            {
              localObject = new android/os/Bundle;
              ((Bundle)localObject).<init>();
              p.j((Bundle)localObject, this.kwS);
              localIntent.putExtras((Bundle)localObject);
              localIntent.addFlags(268435456);
              startActivity(localIntent);
              h.pYm.a(282L, 6L, 1L, false);
              AppMethodBeat.o(18732);
              bool = true;
            }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.CleanUI", localException, "", new Object[0]);
            AppMethodBeat.o(18732);
            bool = true;
          }
      }
      else
      {
        AppMethodBeat.o(18732);
      }
    }
  }

  private boolean bgg()
  {
    AppMethodBeat.i(18733);
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xMI, "");
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(18733);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        this.kwT = localJSONObject;
        this.kwQ = this.kwT.getString("packageName");
        this.kwT.get("md5");
        this.kwS = this.kwT.getString("launcherID");
        this.kwR = this.kwT.getString("signature");
        this.kwT.get("url");
        this.kwP = this.kwT.getLong("size");
        bool = true;
        AppMethodBeat.o(18733);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.CleanUI", localJSONException, "", new Object[0]);
        AppMethodBeat.o(18733);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969145;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18731);
    super.onCreate(paramBundle);
    if ((getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) && (bgf()))
    {
      finish();
      AppMethodBeat.o(18731);
    }
    while (true)
    {
      return;
      startActivity(new Intent(this, CleanNewUI.class));
      finish();
      AppMethodBeat.o(18731);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.CleanUI
 * JD-Core Version:    0.6.2
 */