package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.al;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$2
  implements al
{
  public a$2(a parama)
  {
  }

  public final void kx(int paramInt)
  {
    AppMethodBeat.i(126837);
    if ((paramInt < 0) || (paramInt >= 100))
    {
      b.a(null);
      this.qjD.fPO = false;
    }
    ab.d("MicroMsg.FixToolsUplogModel", "ipxx progress:%d, isUploading:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.qjD.fPO) });
    a.qjB.Ci(paramInt);
    AppMethodBeat.o(126837);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.a.2
 * JD-Core Version:    0.6.2
 */