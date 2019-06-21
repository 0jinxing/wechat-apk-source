package com.tencent.mm.plugin.collect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CollectMainUI$10$1
  implements DialogInterface.OnClickListener
{
  CollectMainUI$10$1(CollectMainUI.10 param10)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41260);
    ab.i("MicroMsg.CollectMainUI", "RealnameVerifyUtil cancel");
    AppMethodBeat.o(41260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.10.1
 * JD-Core Version:    0.6.2
 */