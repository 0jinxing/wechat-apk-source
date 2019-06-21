package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.plugin.wallet_ecard.a.e;
import com.tencent.mm.protocal.protobuf.bfw;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

final class b$c extends g
{
  public b$c(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48085);
    if ((paramm instanceof e))
    {
      this.Agm.ng(1958);
      paramm = (e)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.tQm.kdT == 0)
        {
          paramString = new Bundle();
          ab.i("MicroMsg.OpenECardProcess", "req_serial: %s", new Object[] { paramm.tQm.vLa });
          b.f(this.tQp).putString(a.tPJ, paramm.tQm.vLa);
          ab.i("MicroMsg.OpenECardProcess", "authScene.token: %s, is_token_invalid: %s, is_reuse_existing_ecard: %s", new Object[] { paramm.token, Boolean.valueOf(paramm.tQm.wJI), Boolean.valueOf(paramm.tQm.wJJ) });
          if (!bo.isNullOrNil(paramm.token))
            paramString.putBoolean(a.tPK, paramm.tQm.wJI);
          if (paramm.tQm.wJJ)
            paramString.putBoolean(a.tPZ, true);
          paramString.putInt("key_ecard_proxy_action", 1);
          this.tQp.a(this.hwd, 0, paramString);
          AppMethodBeat.o(48085);
        }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if ((com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQm.vLc)) || (com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQm.kdT, paramm.tQm.kdU)))
        break;
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQm.kdU, paramm.kCm, paramString });
      h.a(this.hwd, paramString, "", false, new b.c.1(this));
      break;
      ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
      h.a(this.hwd, paramString, "", false, new b.c.2(this));
      break;
      if ((paramm instanceof d))
      {
        this.Agm.ng(1985);
        paramm = (d)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
          if (paramm.tQi.kdT == 0)
          {
            b.g(this.tQp).putInt(a.tPL, a.tQc);
            b.h(this.tQp).putString(a.tPO, paramm.tQj);
            b.i(this.tQp).putString(a.tPP, paramm.tQk);
            b.j(this.tQp).putString(a.tPQ, paramm.tQl);
            paramString = new Bundle();
            if (paramm.tQi.vLd != null)
            {
              ab.i("MicroMsg.OpenECardProcess", "no need verify sms");
              paramString.putBoolean(a.tPW, false);
            }
          }
        while (true)
        {
          try
          {
            b.k(this.tQp).putByteArray(a.tQa, paramm.tQi.vLd.toByteArray());
            paramString.putInt("key_ecard_proxy_action", 2);
            this.tQp.a(this.hwd, 0, paramString);
            AppMethodBeat.o(48085);
            bool = true;
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
            h.a(this.hwd, paramString, "", false, new b.c.3(this));
            continue;
            ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
            h.a(this.hwd, paramString, "", false, new b.c.4(this));
          }
        }
      }
      AppMethodBeat.o(48085);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48086);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramIntent = new Bundle();
    paramIntent.putInt("key_process_result_code", 0);
    this.tQp.b(this.hwd, paramIntent);
    AppMethodBeat.o(48086);
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48084);
    int i;
    if (((Integer)paramArrayOfObject[0]).intValue() == 1)
    {
      ab.i("MicroMsg.OpenECardProcess", "onNext do ecard auth");
      i = ((Integer)paramArrayOfObject[1]).intValue();
      paramArrayOfObject = (String)paramArrayOfObject[2];
      this.Agm.nf(1958);
      paramArrayOfObject = new e(b.b(this.tQp), null, i, paramArrayOfObject);
      this.Agm.a(paramArrayOfObject, true);
    }
    while (true)
    {
      AppMethodBeat.o(48084);
      return true;
      ab.i("MicroMsg.OpenECardProcess", "onNext do ecard open");
      i = ((Integer)paramArrayOfObject[1]).intValue();
      this.Agm.nf(1985);
      paramArrayOfObject = new d(b.b(this.tQp), b.e(this.tQp), i);
      this.Agm.a(paramArrayOfObject, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.c
 * JD-Core Version:    0.6.2
 */