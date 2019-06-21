package com.tencent.mm.plugin.scanner.util;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.pr.b;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$6
  implements Runnable
{
  e$6(e parame, pr parampr, int paramInt1, String paramString, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81398);
    if (!bo.isNullOrNil(this.kCL.cLT.aIm))
      Toast.makeText(this.qhD.getContext(), this.kCL.cLT.aIm, 1).show();
    while (true)
    {
      if (this.qhD.qhA != null)
        this.qhD.qhA.o(3, null);
      AppMethodBeat.o(81398);
      return;
      if (bo.isNullOrNil(this.kCL.cLT.cLV))
      {
        ab.w("MicroMsg.QBarStringHandler", "resp url is null!");
      }
      else if (this.kCL.cLT.actionType == 1)
      {
        h.a(this.qhD.getContext(), this.kCL.cLT.cLV, this.cgg, this.qhF, this.fwD);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", this.kCL.cLT.cLV);
        c.gkE.i(localIntent, this.qhD.getContext());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.6
 * JD-Core Version:    0.6.2
 */