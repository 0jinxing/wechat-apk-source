package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/AccountReleasePromptMMTask$handleRequest$1", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "plugin-appbrand-integration_release"})
public final class a$a
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(134974);
    if (a.a(this.iFz))
    {
      paramDialogInterface = (Context)a.b(this.iFz);
      Intent localIntent = new Intent();
      localIntent.addFlags(268435456);
      localIntent.addFlags(67108864);
      localIntent.putExtra("Intro_Switch", true);
      d.f(paramDialogInterface, ".ui.LauncherUI", localIntent);
    }
    a.a(this.iFz, (AppBrandProxyUIProcessTask.ProcessResult)new AccountReleaseProxyUILaunchResult());
    AppMethodBeat.o(134974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.a.a
 * JD-Core Version:    0.6.2
 */