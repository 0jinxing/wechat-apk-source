package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "i", "", "onClick"})
final class RadarViewController$g
  implements DialogInterface.OnClickListener
{
  RadarViewController$g(RadarViewController paramRadarViewController)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103098);
    d.bX(this.pEg.getContext());
    AppMethodBeat.o(103098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.g
 * JD-Core Version:    0.6.2
 */