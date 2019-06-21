package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingSnsBackgroundUI$4
  implements Runnable
{
  SettingSnsBackgroundUI$4(SettingSnsBackgroundUI paramSettingSnsBackgroundUI, int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38556);
    SettingSnsBackgroundUI.a(this.rmS, this.val$requestCode, this.val$data);
    AppMethodBeat.o(38556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.4
 * JD-Core Version:    0.6.2
 */