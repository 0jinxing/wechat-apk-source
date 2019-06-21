package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.ui.base.h;

final class SnsLabelUI$9
  implements DialogInterface.OnClickListener
{
  SnsLabelUI$9(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39019);
    SnsLabelUI.i(this.rtz);
    a.bJa().ce(SnsLabelUI.b(this.rtz));
    SnsLabelUI.a(this.rtz, h.b(this.rtz, this.rtz.getString(2131303676), false, null));
    AppMethodBeat.o(39019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.9
 * JD-Core Version:    0.6.2
 */