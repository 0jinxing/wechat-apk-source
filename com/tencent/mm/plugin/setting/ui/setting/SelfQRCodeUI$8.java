package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.model.t;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class SelfQRCodeUI$8
  implements n.c
{
  SelfQRCodeUI$8(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(127020);
    boolean bool1 = t.mN(SelfQRCodeUI.c(this.qly));
    boolean bool2 = f.rc(SelfQRCodeUI.c(this.qly));
    if ((!bool2) && (!bool1))
      paraml.hi(2, 2131302913);
    paraml.hi(1, 2131302917);
    if (!bool2)
      paraml.hi(3, 2131302933);
    if (SelfQRCodeUI.d(this.qly))
      paraml.hi(4, 2131302932);
    AppMethodBeat.o(127020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.8
 * JD-Core Version:    0.6.2
 */