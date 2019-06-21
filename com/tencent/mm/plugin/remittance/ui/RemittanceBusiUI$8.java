package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.a;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.picker.d.b;

final class RemittanceBusiUI$8
  implements d.b
{
  RemittanceBusiUI$8(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void kg(boolean paramBoolean)
  {
    AppMethodBeat.i(44900);
    if (paramBoolean)
    {
      localObject = RemittanceBusiUI.A(this.pUd).pQG;
      if (localObject != null)
        break label56;
    }
    label56: for (Object localObject = ""; ; localObject = a.a((abv)localObject))
    {
      ab.i("MicroMsg.RemittanceBusiUI", "onFavorSelected %s ", new Object[] { localObject });
      RemittanceBusiUI.B(this.pUd);
      AppMethodBeat.o(44900);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.8
 * JD-Core Version:    0.6.2
 */