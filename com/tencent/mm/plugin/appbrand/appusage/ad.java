package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ai;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class ad extends ai
{
  public final String getTag()
  {
    return "MicroMsg.AppBrand.DuplicateUsageUsernameSetFlagDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    int i = 1;
    int j;
    if (paramInt != 0)
    {
      j = 1;
      if (paramInt >= 637927936)
        break label25;
    }
    label25: for (paramInt = i; ; paramInt = 0)
    {
      return paramInt & j;
      j = 0;
      break;
    }
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(129715);
    if (kw(paramInt))
    {
      ac.a locala = ac.a.xOy;
      g.RP().Ry().set(locala, Boolean.FALSE);
    }
    AppMethodBeat.o(129715);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.ad
 * JD-Core Version:    0.6.2
 */