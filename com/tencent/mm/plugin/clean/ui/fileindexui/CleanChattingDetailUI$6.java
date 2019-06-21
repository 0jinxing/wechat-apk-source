package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class CleanChattingDetailUI$6
  implements Runnable
{
  CleanChattingDetailUI$6(CleanChattingDetailUI paramCleanChattingDetailUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18771);
    CleanChattingDetailUI.c(this.kxE).dismiss();
    Intent localIntent = new Intent();
    localIntent.putExtra("key_pos", CleanChattingDetailUI.d(this.kxE));
    localIntent.putExtra("key_delete_size", CleanChattingDetailUI.e(this.kxE));
    this.kxE.setResult(1000, localIntent);
    h.b(this.kxE, this.kxE.getString(2131298296, new Object[] { bo.ga(this.kxG) }), "", true);
    AppMethodBeat.o(18771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.6
 * JD-Core Version:    0.6.2
 */