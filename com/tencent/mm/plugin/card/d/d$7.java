package com.tencent.mm.plugin.card.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class d$7
  implements DialogInterface.OnClickListener
{
  d$7(MMActivity paramMMActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88832);
    paramDialogInterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    this.icV.startActivity(paramDialogInterface);
    AppMethodBeat.o(88832);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.d.7
 * JD-Core Version:    0.6.2
 */