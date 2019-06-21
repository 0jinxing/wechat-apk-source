package com.tencent.mm.plugin.wallet_ecard.b;

import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.balance.a.a.ad;
import com.tencent.mm.protocal.protobuf.bhd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$f extends g
{
  public b$f(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48097);
    if ((paramm instanceof ad))
    {
      ab.i("MicroMsg.OpenECardProcess", "openLqbAccount scene end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      ad localad = (ad)paramm;
      Bundle localBundle = new Bundle();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = localad.tgw;
        if (paramString.kdT == 0)
        {
          b.M(this.tQp).putBoolean("key_goto_lqt_detail", true);
          localBundle.putInt("key_process_result_code", -1);
          this.tQp.b(this.hwd, localBundle);
          AppMethodBeat.o(48097);
        }
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      ab.i("MicroMsg.OpenECardProcess", "toast: %s", new Object[] { paramString.kdU });
      Toast.makeText(this.hwd, paramString.kdU, 1).show();
      break;
      ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
      h.b(this.hwd, paramString, "", false);
      break;
      AppMethodBeat.o(48097);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48096);
    ((Integer)paramArrayOfObject[0]).intValue();
    paramArrayOfObject = (String)paramArrayOfObject[1];
    this.Agm.nf(2996);
    paramArrayOfObject = new ad(b.b(this.tQp), paramArrayOfObject);
    this.Agm.a(paramArrayOfObject, true);
    AppMethodBeat.o(48096);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.f
 * JD-Core Version:    0.6.2
 */