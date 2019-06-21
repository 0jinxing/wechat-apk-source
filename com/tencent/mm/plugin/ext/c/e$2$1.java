package com.tencent.mm.plugin.ext.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ext.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2$1
  implements f
{
  e$2$1(e.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20420);
    boolean bool;
    if (((a)paramm).lRf == 0)
    {
      bool = true;
      ab.i("MicroMsg.ExtQrCodeHandler", "hy: check url done. errType: %d, errCode: %d, errMsg %s, scene: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(bool) });
      g.RO().eJo.b(782, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label103;
      this.lRc.cC(Boolean.valueOf(bool));
      AppMethodBeat.o(20420);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label103: this.lRc.cC(Boolean.FALSE);
      AppMethodBeat.o(20420);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.e.2.1
 * JD-Core Version:    0.6.2
 */