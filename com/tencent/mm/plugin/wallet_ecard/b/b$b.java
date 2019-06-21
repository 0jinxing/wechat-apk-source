package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.e;
import com.tencent.mm.protocal.protobuf.bfw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$b extends g
{
  public b$b(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48078);
    if ((paramm instanceof e))
    {
      this.Agm.ng(1958);
      paramm = (e)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.tQm.kdT == 0)
        {
          paramString = new Bundle();
          ab.i("MicroMsg.OpenECardProcess", "req_serial: %s, is_reuse_existing_ecard: %s", new Object[] { paramm.tQm.vLa, Boolean.valueOf(paramm.tQm.wJJ) });
          b.d(this.tQp).putString(a.tPJ, paramm.tQm.vLa);
          paramm.tQm.wJJ = false;
          if (paramm.tQm.wJJ)
            paramString.putBoolean(a.tPZ, true);
          this.tQp.a(this.hwd, 0, paramString);
          AppMethodBeat.o(48078);
        }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if ((com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQm.vLc)) || (com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQm.kdT, paramm.tQm.kdU)))
        break;
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQm.kdU, paramm.kCm, paramString });
      h.a(this.hwd, paramString, "", false, new b.b.1(this));
      break;
      ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
      h.a(this.hwd, paramString, "", false, new b.b.2(this));
      break;
      AppMethodBeat.o(48078);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48079);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramIntent = new Bundle();
    paramIntent.putInt("key_process_result_code", 0);
    this.tQp.b(this.hwd, paramIntent);
    AppMethodBeat.o(48079);
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48077);
    String str = (String)paramArrayOfObject[0];
    int i = b.a(this.tQp).getInt(a.tPH);
    this.Agm.nf(1958);
    paramArrayOfObject = new e(b.b(this.tQp), str, i, null);
    this.Agm.a(paramArrayOfObject, true);
    b.c(this.tQp).putString("key_pwd1", str);
    AppMethodBeat.o(48077);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.b
 * JD-Core Version:    0.6.2
 */