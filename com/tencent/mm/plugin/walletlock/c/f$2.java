package com.tencent.mm.plugin.walletlock.c;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ur;
import com.tencent.mm.g.a.ur.a;
import com.tencent.mm.plugin.walletlock.gesture.a.a;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class f$2 extends c<ur>
{
  f$2(f paramf)
  {
    AppMethodBeat.i(51708);
    this.xxI = ur.class.getName().hashCode();
    AppMethodBeat.o(51708);
  }

  private static boolean a(ur paramur)
  {
    AppMethodBeat.i(51709);
    ab.v("MicroMsg.WalletLockInitTask", "alvinluo gestureprotectListener request: %d, verfiyMaskOnCreate: %b, verfiyMaskOnResume: %b", new Object[] { Integer.valueOf(paramur.cRv.cRx), Boolean.valueOf(i.tXc.cUd()), Boolean.valueOf(i.tXc.cUe()) });
    switch (paramur.cRv.cRx)
    {
    default:
    case 0:
    case 1:
    case 4:
    case 2:
    case 3:
    }
    while (true)
    {
      paramur.cRv.activity = null;
      AppMethodBeat.o(51709);
      return false;
      long l1;
      long l2;
      if (!(paramur.cRv.activity instanceof GestureGuardLogicUI))
      {
        if (!i.tXc.cUd())
        {
          l1 = d.cTr();
          l2 = (SystemClock.elapsedRealtime() - l1) / 1000L;
          if ((l1 == -1L) || (l2 >= a.tVy) || ((b.cTA()) && (b.cTz())))
          {
            ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates needs verify.");
            paramur.cRw.data = Integer.valueOf(17);
          }
          else
          {
            ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
            paramur.cRw.data = Integer.valueOf(16);
            i.tXc.c(new WeakReference(paramur.cRv.activity));
          }
        }
        else
        {
          ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
          paramur.cRw.data = Integer.valueOf(16);
          i.tXc.c(new WeakReference(paramur.cRv.activity));
          i.tXc.nB(false);
        }
      }
      else
      {
        ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
        paramur.cRw.data = Integer.valueOf(16);
        continue;
        if (!(paramur.cRv.activity instanceof GestureGuardLogicUI))
        {
          if (i.tXc.cUd())
          {
            ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
            i.tXc.nB(false);
            i.tXc.nC(false);
            paramur.cRw.data = Integer.valueOf(16);
          }
          else if (i.tXc.cUe())
          {
            ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates reenter.");
            i.tXc.nB(false);
            i.tXc.nC(false);
            paramur.cRw.data = Integer.valueOf(18);
          }
          else
          {
            l2 = d.cTr();
            l1 = (SystemClock.elapsedRealtime() - l2) / 1000L;
            if (((l2 == -1L) || (l1 >= a.tVy) || (b.cTA())) && (b.cTz()))
              ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates needs verify.");
            for (paramur.cRw.data = Integer.valueOf(17); ; paramur.cRw.data = Integer.valueOf(16))
            {
              i.tXc.c(new WeakReference(paramur.cRv.activity));
              break;
              ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
            }
          }
        }
        else
        {
          ab.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
          paramur.cRw.data = Integer.valueOf(16);
          continue;
          i.tXc.cUf();
          continue;
          paramur.cRw.data = Boolean.valueOf(e.cTz());
          continue;
          paramur.cRw.data = Boolean.valueOf(b.cTA());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.f.2
 * JD-Core Version:    0.6.2
 */