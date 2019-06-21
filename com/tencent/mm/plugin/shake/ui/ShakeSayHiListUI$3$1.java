package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bu;

final class ShakeSayHiListUI$3$1
  implements DialogInterface.OnClickListener
{
  ShakeSayHiListUI$3$1(ShakeSayHiListUI.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24875);
    ShakeSayHiListUI.e(this.qwu.qwt).axQ();
    ShakeSayHiListUI.b(this.qwu.qwt).KC();
    paramDialogInterface = (TextView)this.qwu.qwt.findViewById(2131821807);
    paramDialogInterface.setText(2131302720);
    paramDialogInterface.setVisibility(0);
    this.qwu.qwt.enableOptionMenu(false);
    AppMethodBeat.o(24875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.3.1
 * JD-Core Version:    0.6.2
 */