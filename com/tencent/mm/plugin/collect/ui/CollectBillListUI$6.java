package com.tencent.mm.plugin.collect.ui;

import android.support.design.widget.BottomSheetBehavior;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CollectBillListUI$6
  implements Runnable
{
  CollectBillListUI$6(CollectBillListUI paramCollectBillListUI, DatePickerDialogView paramDatePickerDialogView, BottomSheetBehavior paramBottomSheetBehavior)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41190);
    ab.d("MicroMsg.CollectBillListUI", "view height: %d", new Object[] { Integer.valueOf(this.kFI.getHeight()) });
    this.kFJ.K(this.kFI.getHeight());
    AppMethodBeat.o(41190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI.6
 * JD-Core Version:    0.6.2
 */