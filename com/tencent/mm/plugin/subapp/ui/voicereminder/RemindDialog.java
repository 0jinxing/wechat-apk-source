package com.tencent.mm.plugin.subapp.ui.voicereminder;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.ao.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.subapp.c.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@a(3)
public class RemindDialog extends Activity
{
  private static boolean cui;
  private static List<String> svG;
  private c gud;
  private ak handler;
  private List<String> svF;
  private ao.d svH;
  private String talker;

  static
  {
    AppMethodBeat.i(25571);
    svG = new ArrayList();
    cui = false;
    AppMethodBeat.o(25571);
  }

  public RemindDialog()
  {
    AppMethodBeat.i(25564);
    this.talker = "";
    this.svF = new ArrayList();
    this.handler = new ak();
    this.svH = new RemindDialog.1(this);
    AppMethodBeat.o(25564);
  }

  private void cDQ()
  {
    AppMethodBeat.i(25566);
    this.handler.post(new RemindDialog.5(this));
    AppMethodBeat.o(25566);
  }

  public static void y(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(25569);
    ab.d("MicroMsg.RemindDialog", "show " + cui + " remind " + paramString2);
    if (cui)
    {
      svG.add(paramString2);
      AppMethodBeat.o(25569);
    }
    while (true)
    {
      return;
      svG.clear();
      cui = true;
      Intent localIntent;
      if (aw.Rg().foreground)
      {
        localIntent = new Intent(paramContext, RemindDialog.class);
        localIntent.putExtra("_RemindDialog_User", paramString1);
        localIntent.putExtra("_RemindDialog_Remind", paramString2);
        localIntent.setFlags(603979776);
        localIntent.addFlags(268435456);
        paramContext.startActivity(localIntent);
        AppMethodBeat.o(25569);
      }
      else
      {
        localIntent = new Intent(paramContext, RemindDialog.class);
        localIntent.putExtra("_RemindDialog_User", paramString1);
        localIntent.putExtra("_RemindDialog_Remind", paramString2);
        localIntent.setFlags(604012544);
        localIntent.addFlags(268435456);
        paramContext.startActivity(localIntent);
        AppMethodBeat.o(25569);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25565);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = new c.a(this);
    paramBundle.PV(2131304321);
    paramBundle.asE(" ");
    paramBundle.Qc(2131304318).a(new RemindDialog.2(this));
    paramBundle.Qd(2131304320).b(new RemindDialog.3(this));
    paramBundle.a(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(25562);
        RemindDialog.this.finish();
        AppMethodBeat.o(25562);
      }
    });
    this.talker = getIntent().getStringExtra("_RemindDialog_User");
    Object localObject = getIntent().getStringExtra("_RemindDialog_Remind");
    this.svF.clear();
    this.svF.add(localObject);
    localObject = svG.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      this.svF.add(str);
    }
    this.gud = paramBundle.aMb();
    this.gud.setCanceledOnTouchOutside(false);
    this.gud.show();
    cDQ();
    AppMethodBeat.o(25565);
  }

  public void onPause()
  {
    AppMethodBeat.i(25568);
    cui = false;
    d locald = d.cDD();
    if (locald != null)
      locald.b(this.svH);
    super.onPause();
    AppMethodBeat.o(25568);
  }

  public void onResume()
  {
    AppMethodBeat.i(25567);
    cui = true;
    d locald = d.cDD();
    if (locald != null)
      locald.a(this.svH);
    super.onResume();
    AppMethodBeat.o(25567);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog
 * JD-Core Version:    0.6.2
 */