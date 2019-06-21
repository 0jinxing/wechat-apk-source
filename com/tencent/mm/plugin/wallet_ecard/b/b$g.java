package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.protocal.protobuf.jf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

final class b$g extends g
{
  public b$g(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48098);
    String str = this.hwd.getIntent().getStringExtra(a.tPV);
    AppMethodBeat.o(48098);
    return str;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48101);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_ecard.a.c))
    {
      this.Agm.ng(1986);
      paramm = (com.tencent.mm.plugin.wallet_ecard.a.c)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramm.tQh.kdT != 0)
          break label159;
        paramString = new Bundle();
        if (paramm.tQh.vLd != null)
          ab.i("MicroMsg.OpenECardProcess", "succ title: %s", new Object[] { paramm.tQh.vLd.title });
      }
    }
    while (true)
    {
      boolean bool;
      try
      {
        b.C(this.tQp).putByteArray(a.tQa, paramm.tQh.vLd.toByteArray());
        this.tQp.a(this.hwd, 0, paramString);
        AppMethodBeat.o(48101);
        bool = true;
        return bool;
      }
      catch (IOException paramm)
      {
        ab.printErrStackTrace("MicroMsg.OpenECardProcess", paramm, "", new Object[0]);
        continue;
      }
      label159: if (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQh.vLc))
      {
        paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQh.kdU, paramString });
        h.b(this.hwd, paramString, "", false);
        continue;
        if ((paramm instanceof d))
        {
          this.Agm.ng(1985);
          paramm = (d)paramm;
          if ((paramInt1 == 0) && (paramInt2 == 0))
            if (paramm.tQi.kdT == 0)
              this.hwd.getIntent().putExtra(a.tPU, paramm.tQi.vLb);
          while (true)
          {
            AppMethodBeat.o(48101);
            bool = true;
            break;
            if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQi.vLc)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQi.kdT, paramm.tQi.kdU)))
            {
              paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQi.kdU, paramm.kCm, paramString });
              h.b(this.hwd, paramString, "", false);
              continue;
              ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
              paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
              h.b(this.hwd, paramString, "", false);
            }
          }
        }
        AppMethodBeat.o(48101);
        bool = false;
      }
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48102);
    ab.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.tQp.b(this.hwd, new Bundle());
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(48102);
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48100);
    b.z(this.tQp).getString("key_pwd1");
    paramArrayOfObject = b.A(this.tQp).getString("key_verify_code");
    String str1 = b.e(this.tQp);
    int i = b.B(this.tQp).getInt(a.tPH);
    String str2 = this.hwd.getIntent().getStringExtra(a.tPU);
    paramArrayOfObject = new com.tencent.mm.plugin.wallet_ecard.a.c(b.b(this.tQp), str1, paramArrayOfObject, str2, i);
    this.Agm.nf(1986);
    this.Agm.a(paramArrayOfObject, true, 3);
    AppMethodBeat.o(48100);
    return true;
  }

  public final boolean x(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48099);
    int i = b.s(this.tQp).getInt(a.tPL);
    paramArrayOfObject = b.e(this.tQp);
    ab.i("MicroMsg.OpenECardProcess", "bind action: %s", new Object[] { Integer.valueOf(i) });
    String str1;
    String str2;
    String str3;
    if (i == a.tQc)
    {
      str1 = b.t(this.tQp).getString(a.tPO);
      str2 = b.u(this.tQp).getString(a.tPP);
      str3 = b.v(this.tQp).getString(a.tPQ);
    }
    for (paramArrayOfObject = new d(b.b(this.tQp), paramArrayOfObject, str1, str2, str3, b.m(this.tQp), true, true, 0, ""); ; paramArrayOfObject = new d(b.b(this.tQp), paramArrayOfObject, str1, str3, str2, b.m(this.tQp), false, true, 0, ""))
    {
      this.Agm.nf(1985);
      this.Agm.a(paramArrayOfObject, true);
      AppMethodBeat.o(48099);
      return true;
      str1 = b.w(this.tQp).getString(a.tPR);
      str3 = b.x(this.tQp).getString(a.tPS);
      str2 = b.y(this.tQp).getString(a.tPT);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.g
 * JD-Core Version:    0.6.2
 */