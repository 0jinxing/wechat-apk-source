package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class h$1
  implements Runnable
{
  h$1(h paramh, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(59966);
    new aa(5, "", "", "", "", false, 1, false).a(h.a(this.fIt), new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(59965);
        paramAnonymousm.ftk = true;
        ab.i("MicroMsg.NetSceneSendMsg", "summerdktext verifypsw onSceneEnd[%d, %d] needVerifyPswList size[%d] errMsg[%s] verifyingPsw[%b], retryVerifyCount[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(h.b(h.1.this.fIt).size()), paramAnonymousString, Boolean.valueOf(h.c(h.1.this.fIt)), Integer.valueOf(h.d(h.1.this.fIt)) });
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          h.b(h.1.this.fIt).clear();
          h.a(h.1.this.fIt, paramAnonymousString);
        }
        while (true)
        {
          h.f(h.1.this.fIt);
          com.tencent.mm.platformtools.ae.gjg = false;
          AppMethodBeat.o(59965);
          return;
          h.ab(h.b(h.1.this.fIt));
          h.e(h.1.this.fIt).onSceneEnd(4, -49, h.1.this.fIs, h.1.this.fIt);
          h.ac(h.b(h.1.this.fIt));
          h.b(h.1.this.fIt).clear();
        }
      }
    });
    AppMethodBeat.o(59966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.h.1
 * JD-Core Version:    0.6.2
 */