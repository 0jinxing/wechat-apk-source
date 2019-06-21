package com.tencent.mm.plugin.aa;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.i;
import com.tencent.mm.plugin.aa.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.g.d.a;

final class b$3$1
  implements d.a
{
  b$3$1(b.3 param3, j paramj)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40577);
    if ((paramObject instanceof String))
      Toast.makeText(ah.getContext(), paramObject.toString(), 0).show();
    while (true)
    {
      this.gkP.aoo().aon();
      AppMethodBeat.o(40577);
      return;
      ab.e("MicroMsg.SubCoreAA", "close aa failed: %s", new Object[] { paramObject });
      Toast.makeText(ah.getContext(), 2131298339, 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.b.3.1
 * JD-Core Version:    0.6.2
 */