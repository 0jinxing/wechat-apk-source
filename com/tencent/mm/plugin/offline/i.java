package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.a.l;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import java.util.ArrayList;

public final class i
  implements com.tencent.mm.ai.f
{
  public ak mHandler;
  ap oXA;
  private boolean oXr;
  private boolean oXs;
  private int oXt;
  private int oXu;
  private String oXv;
  i.a oXw;
  private com.tencent.mm.plugin.offline.a.m oXx;
  public i.b oXy;
  int oXz;

  public i()
  {
    AppMethodBeat.i(43340);
    this.oXr = false;
    this.oXs = false;
    this.oXt = 10;
    this.oXu = 0;
    this.oXv = "";
    this.mHandler = new ak();
    this.oXy = new i.b(this, (byte)0);
    this.oXz = 14400000;
    this.oXA = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(43337);
        if (!g.RK())
        {
          localObject = i.this.oXA;
          l = i.this.oXz;
          ((ap)localObject).ae(l, l);
          AppMethodBeat.o(43337);
          return false;
        }
        i.this.eO(5, 5);
        ap localap = i.this.oXA;
        Object localObject = i.this;
        long l = a.bYy();
        if (l <= 0L);
        for (l = ((i)localObject).oXz; ; l = 1000L * l)
        {
          localap.ae(l, l);
          AppMethodBeat.o(43337);
          break;
          ab.i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:".concat(String.valueOf(l)));
        }
      }
    }
    , false);
    try
    {
      com.tencent.mm.wallet_core.c.b.dNJ();
      com.tencent.mm.wallet_core.c.b.init(ah.getContext());
      g.RQ();
      g.RO().eJo.a(385, this);
      k.bXg();
      str1 = k.Ax(196649);
      if ((TextUtils.isEmpty(str1)) || (!a.isNumeric(str1)))
      {
        ab.i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        ab.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=".concat(String.valueOf(l1)));
        ap localap = this.oXA;
        l1 *= 1000L;
        localap.ae(l1, l1);
        AppMethodBeat.o(43340);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str1;
        ab.e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", new Object[] { localException });
        continue;
        String str2 = a.bYm();
        ab.i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is ".concat(String.valueOf(str2)));
        long l2 = Long.valueOf(str1).longValue();
        if (TextUtils.isEmpty(str2))
        {
          ab.i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
        }
        else
        {
          long l3 = Long.valueOf(str2).longValue();
          l1 = System.currentTimeMillis() / 1000L;
          ab.i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + l1 + ";");
          l1 = l2 - (l1 - l3);
        }
      }
    }
  }

  private static void Aw(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(43347);
    boolean bool1 = a.eA(ah.getContext());
    boolean bool2 = at.isNetworkConnected(ah.getContext());
    Object localObject = com.tencent.mm.plugin.report.service.h.pYm;
    int j;
    int k;
    if (bool1)
    {
      j = 0;
      if (!bool2)
        break label414;
      k = 1;
      label40: if (k.oXK)
        i = 1;
      ((com.tencent.mm.plugin.report.service.h)localObject).e(14163, new Object[] { Integer.valueOf(4), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(0), Integer.valueOf(paramInt), Integer.valueOf(i) });
      localObject = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2)
        break label420;
      j = 36;
      label145: localIDKey.SetKey(j);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1)
        break label427;
      j = 38;
      label191: localIDKey.SetKey(j);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.oXK)
        break label434;
      j = 40;
      label239: localIDKey.SetKey(j);
      ((ArrayList)localObject).add(localIDKey);
      if (paramInt != 2)
        break label459;
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.oXK)
        break label441;
      paramInt = 42;
      label291: localIDKey.SetKey(paramInt);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1)
        break label447;
      paramInt = 44;
      label335: localIDKey.SetKey(paramInt);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2)
        break label453;
      paramInt = 46;
      label379: localIDKey.SetKey(paramInt);
      ((ArrayList)localObject).add(localIDKey);
    }
    label414: label420: label427: label434: label441: label447: label453: label459: label497: 
    do
    {
      com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject, true);
      AppMethodBeat.o(43347);
      return;
      j = 1;
      break;
      k = 0;
      break label40;
      j = 37;
      break label145;
      j = 39;
      break label191;
      j = 41;
      break label239;
      paramInt = 43;
      break label291;
      paramInt = 45;
      break label335;
      paramInt = 47;
      break label379;
      if (paramInt == 6)
      {
        localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        if (k.oXK)
        {
          paramInt = 48;
          localIDKey.SetKey(paramInt);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool1)
            break label608;
          paramInt = 50;
          localIDKey.SetKey(paramInt);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool2)
            break label614;
        }
        for (paramInt = 52; ; paramInt = 53)
        {
          localIDKey.SetKey(paramInt);
          ((ArrayList)localObject).add(localIDKey);
          break;
          paramInt = 49;
          break label497;
          paramInt = 51;
          break label541;
        }
      }
    }
    while (paramInt != 6);
    label541: label608: label614: IDKey localIDKey = new IDKey();
    localIDKey.SetID(135);
    localIDKey.SetValue(1L);
    if (bool1);
    for (paramInt = 54; ; paramInt = 55)
    {
      localIDKey.SetKey(paramInt);
      ((ArrayList)localObject).add(localIDKey);
      break;
    }
  }

  public static int bXf()
  {
    AppMethodBeat.i(43341);
    k.bXg();
    String str = k.Ax(196617);
    com.tencent.mm.wallet_core.c.b.dNJ();
    int i = com.tencent.mm.wallet_core.c.b.atn(str);
    ab.i("MicroMsg.OfflineTokensMgr", "offline tokens count:".concat(String.valueOf(i)));
    AppMethodBeat.o(43341);
    return i;
  }

  public final void Av(int paramInt)
  {
    AppMethodBeat.i(43344);
    if (bXf() > 2)
    {
      this.mHandler.postDelayed(new i.2(this, paramInt), 3000L);
      AppMethodBeat.o(43344);
    }
    while (true)
    {
      return;
      eP(2, paramInt);
      AppMethodBeat.o(43344);
    }
  }

  public final void eO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43342);
    if ((at.isNetworkConnected(ah.getContext())) && (a.bYd()))
    {
      ab.i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
      eP(paramInt1, paramInt2);
      AppMethodBeat.o(43342);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(43342);
    }
  }

  public final void eP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43345);
    if (this.oXr)
      AppMethodBeat.o(43345);
    while (true)
    {
      return;
      this.oXr = true;
      com.tencent.mm.plugin.offline.a.m localm = new com.tencent.mm.plugin.offline.a.m(System.currentTimeMillis() / 1000L, paramInt1, paramInt2);
      g.RQ();
      g.RO().eJo.a(localm, 0);
      Aw(paramInt1);
      AppMethodBeat.o(43345);
    }
  }

  public final boolean jF(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(43343);
    if (!a.bYd())
    {
      ab.e("MicroMsg.OfflineTokensMgr", "offline is not create!");
      AppMethodBeat.o(43343);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (bXf() < k.oXL)
      {
        ab.i("MicroMsg.OfflineTokensMgr", "getTokenCount < %s, do doNetSceneToken", new Object[] { Integer.valueOf(k.oXL) });
        com.tencent.mm.wallet_core.c.b.dNJ();
        int i = com.tencent.mm.wallet_core.c.b.getLastError();
        if (i != 0)
        {
          ab.e("MicroMsg.OfflineTokensMgr", "getTokenCount occurs error, the error is " + i + ", don't  doNetSceneToken");
          AppMethodBeat.o(43343);
          paramBoolean = bool;
        }
        else
        {
          ab.i("MicroMsg.OfflineTokensMgr", "getTokenCount is success! do doNetSceneToken");
          if (paramBoolean)
            Av(9);
          while (true)
          {
            AppMethodBeat.o(43343);
            paramBoolean = true;
            break;
            Av(2);
          }
        }
      }
      else
      {
        if (a.bYz())
        {
          ab.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken");
          if (paramBoolean)
            eP(5, 9);
          while (true)
          {
            AppMethodBeat.o(43343);
            paramBoolean = true;
            break;
            eP(5, 5);
          }
        }
        if (!a.bYw())
        {
          ab.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, bindserial is change, do doNetSceneToken");
          if (paramBoolean)
            eP(3, 9);
          while (true)
          {
            AppMethodBeat.o(43343);
            paramBoolean = true;
            break;
            eP(3, 3);
          }
        }
        AppMethodBeat.o(43343);
        paramBoolean = bool;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = 6;
    AppMethodBeat.i(43346);
    if ((!(paramm instanceof com.tencent.mm.plugin.offline.a.h)) && (!(paramm instanceof com.tencent.mm.plugin.offline.a.f)))
      AppMethodBeat.o(43346);
    while (true)
    {
      return;
      paramString = new ArrayList();
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.m))
      {
        IDKey localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        localIDKey.SetKey(2);
        paramString.add(localIDKey);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          localIDKey.SetKey(3);
          paramString.add(localIDKey);
        }
        com.tencent.mm.plugin.report.service.h.pYm.b(paramString, true);
      }
      if (((paramm instanceof com.tencent.mm.plugin.offline.a.f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
      {
        ab.i("MicroMsg.OfflineTokensMgr", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (this.oXx != null)
        {
          boolean bool = this.oXx.bXn();
          this.oXx = null;
          if ((bool) && (this.oXw != null))
            this.oXw.bXa();
        }
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((paramm instanceof com.tencent.mm.plugin.offline.a.m))
        {
          this.oXu = 0;
          this.oXr = false;
          this.mHandler.removeCallbacks(this.oXy);
          this.oXx = ((com.tencent.mm.plugin.offline.a.m)paramm);
          paramString = this.oXx.oYz;
          k.bXg();
          paramString = new com.tencent.mm.plugin.offline.a.f(paramString, k.Ax(196617));
          g.RQ();
          g.RO().eJo.a(paramString, 0);
          AppMethodBeat.o(43346);
        }
        else if ((paramm instanceof l))
        {
          this.oXs = false;
          this.oXv = ((l)paramm).oXv;
          if (this.oXw != null)
            this.oXw.bXa();
          AppMethodBeat.o(43346);
        }
        else
        {
          if (!(paramm instanceof com.tencent.mm.plugin.offline.a.f))
            break label561;
          AppMethodBeat.o(43346);
        }
      }
      else
      {
        if (!(paramm instanceof com.tencent.mm.plugin.offline.a.m))
          break label526;
        ab.e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
        this.oXu += 1;
        this.oXr = false;
        if (paramInt2 != 411)
          break;
        ab.i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
        a.bYo();
        AppMethodBeat.o(43346);
      }
    }
    if (this.oXu < this.oXt)
    {
      this.mHandler.removeCallbacks(this.oXy);
      paramInt1 = this.oXu - 1;
      if (paramInt1 <= 6)
        break label570;
      paramInt1 = i;
    }
    label526: label561: label570: 
    while (true)
    {
      paramInt1 = (int)Math.pow(2.0D, paramInt1);
      this.mHandler.postDelayed(this.oXy, paramInt1 * 60 * 1000);
      AppMethodBeat.o(43346);
      break;
      if ((paramm instanceof l))
      {
        this.oXs = false;
        AppMethodBeat.o(43346);
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.f))
        this.oXx = null;
      AppMethodBeat.o(43346);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.i
 * JD-Core Version:    0.6.2
 */