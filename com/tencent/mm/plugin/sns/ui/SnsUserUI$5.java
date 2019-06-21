package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;

final class SnsUserUI$5
  implements DialogInterface.OnClickListener
{
  SnsUserUI$5(SnsUserUI paramSnsUserUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39789);
    af.cnF().DL(this.qNq);
    SnsUserUI.a(this.rDa).crP();
    AppMethodBeat.o(39789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.5
 * JD-Core Version:    0.6.2
 */