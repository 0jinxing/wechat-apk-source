package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class MobileVerifyUI$8$1
  implements n.c
{
  MobileVerifyUI$8$1(MobileVerifyUI.8 param8)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(125273);
    paraml.e(0, this.gFs.gFn.getString(2131301477));
    if (b.sM(this.gFs.gFn.cFl))
      paraml.e(1, this.gFs.gFn.getString(2131297593));
    if ((MobileVerifyUI.f(this.gFs.gFn) == 2) && (this.gFs.gFn.gFi))
      paraml.e(2, this.gFs.gFn.getString(2131302272));
    AppMethodBeat.o(125273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.8.1
 * JD-Core Version:    0.6.2
 */