package com.tencent.soter.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.c;
import com.tencent.soter.a.f.e.a;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.i;

final class k$1
  implements com.tencent.soter.a.e.a
{
  k$1(k paramk)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(10559);
    d.w("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate failed. errcode: %d, errmsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    k.eQ(com.tencent.soter.core.c.e.dQW().Avi, 0);
    this.Axe.b(new c(paramInt, paramString));
    AppMethodBeat.o(10559);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(10560);
    d.i("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate successfully. start upload ask", new Object[0]);
    k localk;
    i locali;
    if (this.Axe.Axc != null)
    {
      k.eQ(com.tencent.soter.core.c.e.dQW().Avi, 2);
      localk = this.Axe;
      locali = com.tencent.soter.core.a.dQS();
      if (locali != null)
        break label99;
      d.e("Soter.TaskPrepareAppSecureKey", "soter: ask model is null even after generation. fatal error", new Object[0]);
      com.tencent.soter.core.a.dQP();
      localk.b(new c(3, "ask model is null even after generation."));
      AppMethodBeat.o(10560);
    }
    while (true)
    {
      return;
      k.eQ(com.tencent.soter.core.c.e.dQW().Avi, 0);
      break;
      label99: if (localk.Axc != null)
      {
        localk.Axc.bR(new e.a(locali.signature, locali.Avn));
        localk.Axc.a(new k.2(localk, locali));
        localk.Axc.execute();
        AppMethodBeat.o(10560);
      }
      else
      {
        d.d("Soter.TaskPrepareAppSecureKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
        localk.b(new c("treat as normal because you do not provide the net wrapper", locali));
        AppMethodBeat.o(10560);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.k.1
 * JD-Core Version:    0.6.2
 */