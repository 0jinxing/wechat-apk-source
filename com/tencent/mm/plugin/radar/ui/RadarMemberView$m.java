package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
final class RadarMemberView$m
  implements DialogInterface.OnClickListener
{
  RadarMemberView$m(RadarMemberView paramRadarMemberView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(102963);
    if (RadarMemberView.g(this.pCy) != null)
    {
      paramDialogInterface = RadarMemberView.g(this.pCy);
      if (paramDialogInterface != null)
        paramDialogInterface.dismiss();
      RadarMemberView.h(this.pCy);
    }
    RadarMemberView.i(this.pCy);
    AppMethodBeat.o(102963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.m
 * JD-Core Version:    0.6.2
 */