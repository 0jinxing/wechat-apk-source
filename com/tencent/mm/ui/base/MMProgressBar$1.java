package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class MMProgressBar$1
  implements ap.a
{
  MMProgressBar$1(MMProgressBar paramMMProgressBar)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(106704);
    int i = MMProgressBar.a(this.ywf) - MMProgressBar.b(this.ywf);
    int j;
    Object localObject;
    int k;
    if (i > 0)
    {
      j = (int)(i * 0.6D);
      localObject = this.ywf;
      k = MMProgressBar.b(this.ywf);
      if (j <= 0)
        break label120;
    }
    while (true)
    {
      MMProgressBar.a((MMProgressBar)localObject, j + k);
      MMProgressBar.b(this.ywf, MMProgressBar.b(this.ywf));
      localObject = MMProgressBar.d(this.ywf);
      long l = (MMProgressBar.c(this.ywf) - i) * 40 / MMProgressBar.c(this.ywf);
      ((ap)localObject).ae(l, l);
      AppMethodBeat.o(106704);
      return false;
      label120: j = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMProgressBar.1
 * JD-Core Version:    0.6.2
 */