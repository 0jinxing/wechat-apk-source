package com.tencent.mm.plugin.subapp.jdbiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class JDRemindDialog extends MMBaseActivity
{
  private c ggF = null;

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(25186);
    Intent localIntent = new Intent(paramContext, JDRemindDialog.class);
    localIntent.putExtra("alertcontent", paramString1);
    localIntent.putExtra("alertconfirm", paramString2);
    localIntent.putExtra("alert_cancel", paramString3);
    localIntent.putExtra("alertjumpurl", paramString4);
    localIntent.putExtra("alert_activityid", paramString5);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(25186);
  }

  private void aVh()
  {
    AppMethodBeat.i(25185);
    if (getIntent() == null)
      AppMethodBeat.o(25185);
    while (true)
    {
      return;
      Bundle localBundle = getIntent().getExtras();
      if (localBundle == null)
      {
        AppMethodBeat.o(25185);
      }
      else
      {
        c.a locala = new c.a(this);
        locala.asD("");
        locala.asE(localBundle.getString("alertcontent"));
        locala.asJ(localBundle.getString("alertconfirm")).a(new JDRemindDialog.1(this));
        locala.asK(localBundle.getString("alert_cancel")).b(new JDRemindDialog.2(this));
        this.ggF = locala.aMb();
        this.ggF.setCanceledOnTouchOutside(false);
        this.ggF.show();
        AppMethodBeat.o(25185);
      }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25181);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    aVh();
    AppMethodBeat.o(25181);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(25183);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.ggF != null)
    {
      this.ggF.dismiss();
      this.ggF = null;
    }
    aVh();
    AppMethodBeat.o(25183);
  }

  public void onPause()
  {
    AppMethodBeat.i(25184);
    super.onPause();
    y.activateBroadcast(false);
    AppMethodBeat.o(25184);
  }

  public void onResume()
  {
    AppMethodBeat.i(25182);
    super.onResume();
    y.activateBroadcast(true);
    AppMethodBeat.o(25182);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog
 * JD-Core Version:    0.6.2
 */