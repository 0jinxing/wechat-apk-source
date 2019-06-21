package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bg;

final class NearbySayHiListUI$5$1
  implements DialogInterface.OnClickListener
{
  NearbySayHiListUI$5$1(NearbySayHiListUI.5 param5)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(55497);
    NearbySayHiListUI.e(this.oQQ.oQP).axQ();
    NearbySayHiListUI.b(this.oQQ.oQP).KC();
    paramDialogInterface = (TextView)this.oQQ.oQP.findViewById(2131821807);
    paramDialogInterface.setText(2131302720);
    paramDialogInterface.setVisibility(0);
    this.oQQ.oQP.enableOptionMenu(false);
    AppMethodBeat.o(55497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.5.1
 * JD-Core Version:    0.6.2
 */