package com.tencent.mm.plugin.fingerprint.faceid.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$1
  implements c
{
  b$a$1(b.a parama)
  {
  }

  public final void bJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(41396);
    ab.i("MicroMsg.WalletFaceIdDialog", "auth result: %s, retry: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(b.a.b(this.mrr)) });
    switch (paramInt1)
    {
    default:
    case 0:
    case 2000:
    case 2001:
    case 2002:
    case 2005:
    case 2007:
    case 2009:
    case 10308:
    }
    while (true)
    {
      AppMethodBeat.o(41396);
      while (true)
      {
        return;
        ab.i("MicroMsg.WalletFaceIdDialog", "identify success");
        b.a.a(this.mrr, paramInt2);
        b.a.c(this.mrr);
        b.a.b(this.mrr, paramInt2);
        AppMethodBeat.o(41396);
        continue;
        b.a.c(this.mrr);
        if (b.a.b(this.mrr) >= 2)
          break;
        b.a.d(this.mrr);
        AppMethodBeat.o(41396);
      }
      b.a.c(this.mrr, paramInt1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.a.1
 * JD-Core Version:    0.6.2
 */