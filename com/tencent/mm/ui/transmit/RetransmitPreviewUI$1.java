package com.tencent.mm.ui.transmit;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RetransmitPreviewUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RetransmitPreviewUI$1(RetransmitPreviewUI paramRetransmitPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35120);
    this.zJJ.finish();
    AppMethodBeat.o(35120);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.RetransmitPreviewUI.1
 * JD-Core Version:    0.6.2
 */