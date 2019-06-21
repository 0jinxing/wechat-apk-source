package com.tencent.mm.ar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class c$7$1
  implements Runnable
{
  c$7$1(c.7 param7, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16476);
    ao.b.a locala1 = (ao.b.a)this.fCN.fCH.fCz.remove(this.cgF);
    if (bo.isNullOrNil(this.fCL));
    for (ao.b.a locala2 = null; ; locala2 = (ao.b.a)this.fCN.fCH.fCz.remove(this.fCL))
    {
      if (locala1 != null)
        locala1.o(this.cgF, this.fCM);
      if ((locala2 != null) && (!bo.isNullOrNil(this.fCL)))
        locala2.o(this.fCL, this.fCM);
      AppMethodBeat.o(16476);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c.7.1
 * JD-Core Version:    0.6.2
 */