package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e.b;

final class ak$1
  implements e.b
{
  ak$1(ak paramak)
  {
  }

  public final void bZ(Object paramObject)
  {
    AppMethodBeat.i(46963);
    if ((paramObject != null) && ((paramObject instanceof Double)))
    {
      if (((Double)paramObject).doubleValue() < 0.0D)
        ab.v("MicroMsg.WalletUserInfoManger", "val is zero %s", new Object[] { bo.dpG().toString() });
      if (this.tDh.thy == null)
        break label111;
      this.tDh.thy.twS = ((Double)paramObject).doubleValue();
      AppMethodBeat.o(46963);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
      if (this.tDh.thy != null)
        this.tDh.thy.twS = -1.0D;
      label111: AppMethodBeat.o(46963);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ak.1
 * JD-Core Version:    0.6.2
 */