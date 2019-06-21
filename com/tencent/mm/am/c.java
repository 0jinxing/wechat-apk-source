package com.tencent.mm.am;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ai;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.z;

public final class c extends ai
{
  public final String getTag()
  {
    return "MicroMsg.BizTimeLineDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 637929471));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16431);
    ab.d("MicroMsg.BizTimeLineDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 637929471))
      if ((((Integer)g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue() & 0x2) <= 0)
        break label96;
    label96: for (boolean bool = true; ; bool = false)
    {
      if (bool)
        s.pp(true);
      ab.i("MicroMsg.BizTimeLineDataTransfer", "transfer end %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(16431);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.c
 * JD-Core Version:    0.6.2
 */