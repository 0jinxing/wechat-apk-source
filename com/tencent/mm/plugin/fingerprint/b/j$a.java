package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class j$a
  implements c
{
  public j$a(j paramj)
  {
  }

  public final void bJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(41490);
    if (this.mrS.mru)
    {
      ab.e("MicroMsg.OpenFingerPrintAuthEventListener", "hy: event already end. ignore");
      AppMethodBeat.o(41490);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 0:
    case 2002:
    case 2001:
    case 2000:
    case 2004:
    case 2005:
    case 2007:
    case 10308:
    case 2009:
    }
    while (true)
    {
      AppMethodBeat.o(41490);
      break;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_SUCCESS");
      Object localObject1 = this.mrS;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "onSuccess()");
      ((j)localObject1).mru = true;
      com.tencent.mm.plugin.fingerprint.a.bwM();
      com.tencent.mm.plugin.fingerprint.a.bwN();
      Object localObject2 = ((j)localObject1).mrP;
      ((l)g.K(l.class)).a((lv)localObject2, paramInt2);
      if (((j)localObject1).mru)
        ((j)localObject1).mrP = null;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onSuccess()");
      j.bxK();
      AppMethodBeat.o(41490);
      break;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_NO_MATCH");
      this.mrS.mru = false;
      j.bxK();
      this.mrS.hv(true);
      this.mrS.R(1, "");
      AppMethodBeat.o(41490);
      break;
      this.mrS.hv(false);
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_TIMEOUT");
      AppMethodBeat.o(41490);
      break;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify timeout");
      AppMethodBeat.o(41490);
      break;
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      this.mrS.mru = true;
      localObject1 = ah.getContext().getString(2131303883);
      if (paramInt1 == 10308)
        localObject2 = ah.getContext().getString(2131303884);
      while (true)
      {
        j.bxK();
        this.mrS.R(2, (String)localObject2);
        AppMethodBeat.o(41490);
        break;
        localObject2 = localObject1;
        if (paramInt1 == 2007)
        {
          v.tCn.mso = true;
          localObject2 = localObject1;
        }
      }
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      if (this.mrS.mrP != null)
        com.tencent.mm.plugin.soter.d.a.EE(this.mrS.mrP.cHD.cHG);
      this.mrS.mru = true;
      localObject2 = ah.getContext().getString(2131303883);
      j.bxK();
      this.mrS.R(paramInt1, (String)localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.j.a
 * JD-Core Version:    0.6.2
 */