package com.tencent.mm.plugin.collect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.b;

final class CollectCreateQRCodeUI$4$1
  implements h.b
{
  CollectCreateQRCodeUI$4$1(CollectCreateQRCodeUI.4 param4)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(41233);
    if (!bo.isNullOrNil(paramCharSequence.toString()))
    {
      CollectCreateQRCodeUI.a(this.kGd.kGc, paramCharSequence.toString());
      CollectCreateQRCodeUI.c(this.kGd.kGc);
    }
    while (true)
    {
      AppMethodBeat.o(41233);
      return true;
      CollectCreateQRCodeUI.a(this.kGd.kGc, "");
      CollectCreateQRCodeUI.c(this.kGd.kGc);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeUI.4.1
 * JD-Core Version:    0.6.2
 */