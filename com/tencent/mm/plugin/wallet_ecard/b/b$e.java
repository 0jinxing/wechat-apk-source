package com.tencent.mm.plugin.wallet_ecard.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

final class b$e extends g
{
  public b$e(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48095);
    if ((paramm instanceof d))
    {
      this.Agm.ng(1985);
      paramm = (d)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.tQi.kdT == 0)
        {
          paramString = new Bundle();
          if (paramm.tQi.vLd != null)
          {
            ab.i("MicroMsg.OpenECardProcess", "no need verify sms");
            paramString.putBoolean(a.tPW, false);
          }
        }
    }
    while (true)
    {
      boolean bool;
      try
      {
        b.L(this.tQp).putByteArray(a.tQa, paramm.tQi.vLd.toByteArray());
        this.tQp.a(this.hwd, 0, paramString);
        AppMethodBeat.o(48095);
        bool = true;
        return bool;
      }
      catch (IOException paramm)
      {
        ab.printErrStackTrace("MicroMsg.OpenECardProcess", paramm, "", new Object[0]);
        continue;
      }
      ab.i("MicroMsg.OpenECardProcess", "need verfiy sms");
      paramString.putBoolean(a.tPW, true);
      paramString.putString(a.tPU, paramm.tQi.vLb);
      paramString.putString(a.tPV, paramm.tQi.wJO);
      continue;
      if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQi.vLc)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQi.kdT, paramm.tQi.kdU)))
      {
        paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQi.kdU, paramm.kCm, paramString });
        h.b(this.hwd, paramString, "", false);
        continue;
        ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
        paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
        h.b(this.hwd, paramString, "", false);
        continue;
        AppMethodBeat.o(48095);
        bool = false;
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48094);
    String str1 = ((ElementQuery)paramArrayOfObject[0]).pbn;
    String str2 = b.J(this.tQp).getString(a.tPR);
    paramArrayOfObject = b.K(this.tQp).getString(a.tPS);
    this.Agm.nf(1985);
    paramArrayOfObject = new d(b.b(this.tQp), b.e(this.tQp), str2, paramArrayOfObject, str1, b.m(this.tQp), false, 0, "");
    this.Agm.a(paramArrayOfObject, true);
    AppMethodBeat.o(48094);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.e
 * JD-Core Version:    0.6.2
 */