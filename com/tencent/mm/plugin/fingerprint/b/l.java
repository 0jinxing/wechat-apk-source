package com.tencent.mm.plugin.fingerprint.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.aa;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.a;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.plugin.soter.b.f;
import com.tencent.mm.plugin.soter.d.d;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.wallet.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.soter.a.g.b.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends a
{
  private boolean mrT = false;
  private n mrU = null;
  private com.tencent.soter.a.d.a mrV = null;
  private com.tencent.soter.a.a.a mrW = null;

  public final int a(com.tencent.mm.pluginsdk.wallet.c paramc)
  {
    AppMethodBeat.i(41522);
    ab.i("MicroMsg.SoterAuthMgrImp", "start face auth: %s", new Object[] { Integer.valueOf(3000) });
    Object localObject = new l.2(this);
    this.mrW = new com.tencent.soter.a.a.a();
    com.tencent.soter.a.g.b localb = new b.a().Rj(1).iW(ah.getContext()).Rk(2).a(this.mrW).a((com.tencent.soter.a.a.b)localObject).aug(v.tCn.msn).Awk;
    localObject = new ap(new l.3(this, paramc), false);
    ((ap)localObject).ae(3000L, 3000L);
    com.tencent.soter.a.a.a(new l.4(this, (ap)localObject, paramc), localb);
    AppMethodBeat.o(41522);
    return 0;
  }

  @TargetApi(16)
  public final int a(com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(41521);
    if (paramBoolean)
    {
      ab.i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
      AppMethodBeat.o(41521);
    }
    while (true)
    {
      return 0;
      Object localObject = new l.1(this, paramc);
      this.mrV = new com.tencent.soter.a.d.a();
      localObject = new b.a().Rj(1).iW(ah.getContext()).a(this.mrV).aug(v.tCn.msn).a((com.tencent.soter.a.d.b)localObject).Awk;
      com.tencent.soter.a.a.a(new l.5(this, paramc), (com.tencent.soter.a.g.b)localObject);
      AppMethodBeat.o(41521);
    }
  }

  public final void a(lv paramlv, int paramInt)
  {
    AppMethodBeat.i(41525);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
    paramlv.cHE.cHI = bxi();
    lv.b localb = paramlv.cHE;
    if (!bo.isNullOrNil(paramlv.cHE.cHI));
    for (paramInt = 0; ; paramInt = 1)
    {
      localb.errCode = paramInt;
      paramlv.cHE.cHJ = 2;
      paramlv.cHE.cBU = "";
      paramlv.cHE.cBV = "";
      if (paramlv.cHD.cHH != null)
        paramlv.cHD.cHH.run();
      AppMethodBeat.o(41525);
      return;
    }
  }

  public final boolean a(boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    AppMethodBeat.i(41533);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b, extInfo: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramBundle });
    String str;
    int i;
    if (!paramBoolean1)
    {
      str = paramBundle.getString("pwd");
      i = paramBundle.getInt("key_open_biometric_type");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.SoterAuthMgrImp", "hy: no pwd. can not change auth key");
        AppMethodBeat.o(41533);
      }
    }
    while (true)
    {
      return false;
      if (v.tCn.mso)
      {
        ab.i("MicroMsg.SoterAuthMgrImp", "hy: need change auth key. start gen auth key");
        com.tencent.soter.a.a.a(new l.6(this), true, 1, new com.tencent.mm.plugin.fingerprint.c.c(str, i), new f());
      }
      AppMethodBeat.o(41533);
    }
  }

  public final boolean bxA()
  {
    boolean bool = true;
    AppMethodBeat.i(41536);
    int i = q.eti.eue;
    if ((!q.eti.cOQ) || ((i & 0x2) != 2))
    {
      ab.e("MicroMsg.SoterAuthMgrImp", "peteryan check isDeviceSupportFaceID from DeviceInfo.mSoterInfo return false typeis[%d]", new Object[] { Integer.valueOf(q.eti.eue) });
      AppMethodBeat.o(41536);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((com.tencent.soter.a.a.dRc()) && (com.tencent.soter.core.a.iQ(ah.getContext())))
      {
        AppMethodBeat.o(41536);
      }
      else
      {
        AppMethodBeat.o(41536);
        bool = false;
      }
    }
  }

  public final boolean bxB()
  {
    AppMethodBeat.i(41537);
    boolean bool = com.tencent.soter.core.a.iS(ah.getContext());
    AppMethodBeat.o(41537);
    return bool;
  }

  public final boolean bxf()
  {
    AppMethodBeat.i(41534);
    boolean bool = com.tencent.soter.core.a.iT(ah.getContext());
    AppMethodBeat.o(41534);
    return bool;
  }

  public final boolean bxg()
  {
    AppMethodBeat.i(41538);
    boolean bool = com.tencent.soter.core.a.aC(ah.getContext(), 2);
    AppMethodBeat.o(41538);
    return bool;
  }

  public final String bxi()
  {
    AppMethodBeat.i(41526);
    com.tencent.soter.core.c.j localj = v.tCn.tCp;
    if (localj != null);
    while (true)
    {
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("json", localj.Avx);
        ((JSONObject)localObject).put("signature", localj.signature);
        localObject = ((JSONObject)localObject).toString();
        AppMethodBeat.o(41526);
        return localObject;
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", new Object[] { localJSONException.toString() });
        ab.printErrStackTrace("MicroMsg.SoterAuthMgrImp", localJSONException, "", new Object[0]);
        str = "";
        AppMethodBeat.o(41526);
        continue;
      }
      ab.e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
      String str = "";
      AppMethodBeat.o(41526);
    }
  }

  public final void bxk()
  {
    AppMethodBeat.i(41535);
    if ((this.mrV != null) && (Build.VERSION.SDK_INT >= 16))
    {
      ab.i("MicroMsg.SoterAuthMgrImp", "alvinluo cancel fingeprint canceller");
      this.mrV.rr(true);
    }
    if (this.mrW != null)
    {
      ab.i("MicroMsg.SoterAuthMgrImp", "cancel biometric canceller");
      this.mrW.rp(true);
    }
    AppMethodBeat.o(41535);
  }

  public final com.tencent.mm.pluginsdk.wallet.j bxm()
  {
    AppMethodBeat.i(41528);
    this.mrU = new n();
    n localn = this.mrU;
    AppMethodBeat.o(41528);
    return localn;
  }

  public final boolean bxn()
  {
    boolean bool1 = true;
    AppMethodBeat.i(41515);
    if (q.etg.etr == 1)
    {
      bool2 = true;
      boolean bool3 = com.tencent.soter.a.a.dRc();
      ab.i("MicroMsg.SoterAuthMgrImp", "hy: config support: %b, device support: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((!bool2) || (!bool3) || (!com.tencent.soter.core.a.iP(ah.getContext())))
        break label82;
      AppMethodBeat.o(41515);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label82: AppMethodBeat.o(41515);
    }
  }

  public final boolean bxo()
  {
    AppMethodBeat.i(41516);
    boolean bool = com.tencent.soter.core.a.iR(ah.getContext());
    AppMethodBeat.o(41516);
    return bool;
  }

  public final void bxp()
  {
    AppMethodBeat.i(41517);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
    e.hu(true);
    e.ht(true);
    if (!this.mrT)
    {
      ab.w("MicroMsg.SoterAuthMgrImp", "SoterAuthMgrImp is set but still need to initSoter??? TaskInit had finished[%b]", new Object[] { Boolean.valueOf(com.tencent.soter.a.a.dRc()) });
      com.tencent.mm.plugin.soter.e.b.a(false, false, null);
      this.mrT = true;
    }
    AppMethodBeat.o(41517);
  }

  public final boolean bxr()
  {
    return false;
  }

  public final boolean bxs()
  {
    AppMethodBeat.i(41520);
    boolean bool = bxn();
    AppMethodBeat.o(41520);
    return bool;
  }

  @SuppressLint({"NewApi"})
  public final void bxt()
  {
    AppMethodBeat.i(41523);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
    AppMethodBeat.o(41523);
  }

  @SuppressLint({"NewApi"})
  public final void bxu()
  {
    AppMethodBeat.i(41524);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
    AppMethodBeat.o(41524);
  }

  public final void bxv()
  {
    AppMethodBeat.i(41527);
    if (com.tencent.soter.core.a.aua(e.bxC()))
      com.tencent.soter.core.a.cn(e.bxC(), false);
    AppMethodBeat.o(41527);
  }

  public final Map<String, String> bxw()
  {
    AppMethodBeat.i(41529);
    HashMap localHashMap = new HashMap();
    Object localObject = d.cvQ();
    String str = ((com.tencent.mm.plugin.soter.d.e)localObject).rOh;
    localObject = ((com.tencent.mm.plugin.soter.d.e)localObject).jSY;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    AppMethodBeat.o(41529);
    return localHashMap;
  }

  public final k bxx()
  {
    AppMethodBeat.i(41530);
    o localo = new o();
    AppMethodBeat.o(41530);
    return localo;
  }

  public final Map<String, String> bxy()
  {
    AppMethodBeat.i(41531);
    Map localMap = bxw();
    AppMethodBeat.o(41531);
    return localMap;
  }

  public final boolean bxz()
  {
    boolean bool1 = true;
    AppMethodBeat.i(41532);
    boolean bool2 = com.tencent.soter.core.a.aua(e.bxC());
    ab.i("MicroMsg.SoterAuthMgrImp", "py: hasAuthKey: %b", new Object[] { Boolean.valueOf(bool2) });
    if (!bool2)
    {
      ab.i("MicroMsg.SoterAuthMgrImp", "hy: no ask or auth key");
      v.tCn.mso = true;
    }
    if (!v.tCn.mso)
      AppMethodBeat.o(41532);
    while (true)
    {
      return bool1;
      AppMethodBeat.o(41532);
      bool1 = false;
    }
  }

  public final void dO(Context paramContext)
  {
    AppMethodBeat.i(41519);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
    AppMethodBeat.o(41519);
  }

  public final void dP(Context paramContext)
  {
    AppMethodBeat.i(41518);
    e.hu(true);
    e.ht(true);
    ab.i("MicroMsg.SoterAuthMgrImp", "hy: is soter. no need to init");
    AppMethodBeat.o(41518);
  }

  public final int type()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.l
 * JD-Core Version:    0.6.2
 */