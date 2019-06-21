package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.h.c;

final class FMessageListView$4$1
  implements h.c
{
  FMessageListView$4$1(FMessageListView.4 param4)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(28040);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(28040);
      return;
      ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(this.vqB.vqA.fjz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.FMessageListView.4.1
 * JD-Core Version:    0.6.2
 */