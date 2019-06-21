package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.base.preference.Preference;

final class NormalUserFooterPreference$i$2
  implements DialogInterface.OnCancelListener
{
  NormalUserFooterPreference$i$2(NormalUserFooterPreference.i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23717);
    this.ppc.onStop();
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Intro_Switch", true).addFlags(67108864);
    b.gkE.p(paramDialogInterface, this.ppc.poR.mContext);
    AppMethodBeat.o(23717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.i.2
 * JD-Core Version:    0.6.2
 */