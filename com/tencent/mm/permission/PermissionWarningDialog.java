package com.tencent.mm.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;

public class PermissionWarningDialog extends MMBaseActivity
{
  private DialogInterface.OnCancelListener Ue;
  private c ggF;

  public PermissionWarningDialog()
  {
    AppMethodBeat.i(16650);
    this.Ue = new PermissionWarningDialog.1(this);
    this.ggF = null;
    AppMethodBeat.o(16650);
  }

  private boolean anB()
  {
    boolean bool = false;
    AppMethodBeat.i(16655);
    if (getIntent() == null)
    {
      ab.e("MicroMsg.PermissionWarningDialog", "Intent is null");
      AppMethodBeat.o(16655);
    }
    while (true)
    {
      return bool;
      Object localObject = getIntent().getExtras();
      if (localObject == null)
      {
        ab.e("MicroMsg.PermissionWarningDialog", "invalid params");
        AppMethodBeat.o(16655);
      }
      else
      {
        int i = ((Bundle)localObject).getInt("warning_type", 0);
        c.a locala;
        if (1 == i)
        {
          locala = new c.a(this);
          locala.asD(((Bundle)localObject).getString("warning_title"));
          locala.asE(((Bundle)localObject).getString("warning_content"));
          locala.Qc(2131296955).a(new PermissionWarningDialog.2(this));
          locala.f(this.Ue);
          this.ggF = locala.aMb();
          this.ggF.setCanceledOnTouchOutside(false);
          this.ggF.show();
        }
        while (true)
        {
          AppMethodBeat.o(16655);
          bool = true;
          break;
          if (2 == i)
          {
            locala = new c.a(this);
            ((Bundle)localObject).getBoolean("warning_filter", false);
            ((Bundle)localObject).getBoolean("warning_due2Exception", false);
            locala.PV(2131297011);
            locala.asE(getString(2131297006));
            locala.Qc(2131297000).a(new PermissionWarningDialog.3(this));
            locala.f(this.Ue);
            this.ggF = locala.aMb();
            this.ggF.setCanceledOnTouchOutside(false);
            this.ggF.show();
          }
          else
          {
            if (3 != i)
              break label345;
            localObject = new e.a(this);
            ((e.a)localObject).re(false);
            localObject = ((e.a)localObject).asL(getString(2131296973));
            ((e.a)localObject).zQK = getString(2131296957);
            ((e.a)localObject).zQJ = getString(2131296974);
            ((e.a)localObject).c(new PermissionWarningDialog.4(this)).show();
          }
        }
        label345: AppMethodBeat.o(16655);
      }
    }
  }

  public static void b(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(16656);
    Intent localIntent = new Intent(paramContext, PermissionWarningDialog.class);
    localIntent.putExtra("warning_type", 2);
    localIntent.putExtra("warning_filter", paramBoolean1);
    localIntent.putExtra("warning_due2Exception", paramBoolean2);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(16656);
  }

  public static void ci(Context paramContext)
  {
    AppMethodBeat.i(16657);
    Intent localIntent = new Intent(paramContext, PermissionWarningDialog.class);
    localIntent.putExtra("warning_type", 3);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(16657);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16651);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (!anB())
      finish();
    AppMethodBeat.o(16651);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(16653);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.ggF != null)
    {
      this.ggF.dismiss();
      this.ggF = null;
    }
    if (!anB())
      finish();
    AppMethodBeat.o(16653);
  }

  public void onPause()
  {
    AppMethodBeat.i(16654);
    super.onPause();
    y.activateBroadcast(false);
    AppMethodBeat.o(16654);
  }

  public void onResume()
  {
    AppMethodBeat.i(16652);
    super.onResume();
    y.activateBroadcast(true);
    AppMethodBeat.o(16652);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.permission.PermissionWarningDialog
 * JD-Core Version:    0.6.2
 */