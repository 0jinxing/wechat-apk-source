package com.tencent.mm.plugin.card.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class d$6
  implements DialogInterface.OnClickListener
{
  d$6(boolean paramBoolean, MMActivity paramMMActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88831);
    paramDialogInterface.dismiss();
    if (this.krL)
      this.icV.finish();
    AppMethodBeat.o(88831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.d.6
 * JD-Core Version:    0.6.2
 */