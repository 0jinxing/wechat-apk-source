package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavRecordDetailUI$3
  implements Runnable
{
  FavRecordDetailUI$3(FavRecordDetailUI paramFavRecordDetailUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24208);
    this.mhZ.dismiss();
    b.i(this.pKi, this.pKi.getString(2131299884));
    AppMethodBeat.o(24208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.3
 * JD-Core Version:    0.6.2
 */