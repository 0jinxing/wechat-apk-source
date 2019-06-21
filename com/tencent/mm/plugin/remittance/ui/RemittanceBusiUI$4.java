package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.c;
import com.tencent.mm.protocal.protobuf.abw;
import java.util.List;

final class RemittanceBusiUI$4
  implements c
{
  RemittanceBusiUI$4(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void cR(List<abw> paramList)
  {
    AppMethodBeat.i(44896);
    if (paramList.size() > 0)
      RemittanceBusiUI.a(this.pUd, paramList);
    AppMethodBeat.o(44896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.4
 * JD-Core Version:    0.6.2
 */