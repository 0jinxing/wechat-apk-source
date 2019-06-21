package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
final class RadarSearchUI$b
  implements DialogInterface.OnClickListener
{
  RadarSearchUI$b(RadarSearchUI paramRadarSearchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(102989);
    this.pCG.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    RadarSearchUI.a(this.pCG);
    this.pCG.finish();
    AppMethodBeat.o(102989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSearchUI.b
 * JD-Core Version:    0.6.2
 */