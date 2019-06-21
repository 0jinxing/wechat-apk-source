package com.tencent.mm.pluginsdk.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class RequestFloatWindowPermissionDialog extends MMBaseActivity
{
  public static int vdq = 1234;
  private static RequestFloatWindowPermissionDialog.a vdr;
  private c ggF = null;

  public static void a(Context paramContext, String paramString, RequestFloatWindowPermissionDialog.a parama)
  {
    AppMethodBeat.i(79445);
    vdr = parama;
    parama = new Intent(paramContext, RequestFloatWindowPermissionDialog.class);
    parama.putExtra("warning_content", paramString);
    parama.addFlags(805306368);
    paramContext.startActivity(parama);
    AppMethodBeat.o(79445);
  }

  private void aVh()
  {
    AppMethodBeat.i(79443);
    if (getIntent() == null)
    {
      ab.e("MicroMsg.RequestFloatWindowPermissionDialog", "Intent is null");
      AppMethodBeat.o(79443);
    }
    Bundle localBundle;
    while (true)
    {
      return;
      localBundle = getIntent().getExtras();
      if (localBundle != null)
        break;
      ab.e("MicroMsg.RequestFloatWindowPermissionDialog", "invalid params");
      AppMethodBeat.o(79443);
    }
    c.a locala = new c.a(this);
    locala.PV(2131299899);
    locala.asE(localBundle.getString("warning_content"));
    locala.f(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(79437);
        RequestFloatWindowPermissionDialog.this.finish();
        AppMethodBeat.o(79437);
      }
    });
    if (d.iW(23));
    for (int i = 2131299898; ; i = 2131299897)
    {
      locala.Qc(i).a(new RequestFloatWindowPermissionDialog.2(this));
      this.ggF = locala.aMb();
      this.ggF.setCanceledOnTouchOutside(false);
      this.ggF.show();
      AppMethodBeat.o(79443);
      break;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(79444);
    if (vdr == null)
      AppMethodBeat.o(79444);
    while (true)
    {
      return;
      if (paramInt1 == vdq)
      {
        if (b.bF(ah.getContext()))
        {
          vdr.a(this);
          AppMethodBeat.o(79444);
        }
        else
        {
          vdr.b(this);
          AppMethodBeat.o(79444);
        }
      }
      else
      {
        vdr.b(this);
        AppMethodBeat.o(79444);
      }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(79439);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    aVh();
    AppMethodBeat.o(79439);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(79441);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.ggF != null)
    {
      this.ggF.dismiss();
      this.ggF = null;
    }
    aVh();
    AppMethodBeat.o(79441);
  }

  public void onPause()
  {
    AppMethodBeat.i(79442);
    super.onPause();
    y.activateBroadcast(false);
    AppMethodBeat.o(79442);
  }

  public void onResume()
  {
    AppMethodBeat.i(79440);
    super.onResume();
    y.activateBroadcast(true);
    AppMethodBeat.o(79440);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog
 * JD-Core Version:    0.6.2
 */