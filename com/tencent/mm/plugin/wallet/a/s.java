package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.uj;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashMap;

public class s
  implements at
{
  private int cQG;
  private int tnA;
  private r tnB;
  private y tnC;
  private k tnD;
  private n.b tnE;
  private c tnF;
  private o tnG;
  private l tnH;

  static
  {
    AppMethodBeat.i(45859);
    com.tencent.mm.wallet_core.a.g("ForgotPwdProcess", com.tencent.mm.plugin.wallet.pwd.a.class);
    com.tencent.mm.wallet_core.a.g("BindCardProcess", com.tencent.mm.plugin.wallet_core.b.b.class);
    AppMethodBeat.o(45859);
  }

  public s()
  {
    AppMethodBeat.i(45852);
    this.tnA = 0;
    this.cQG = 0;
    this.tnB = new r();
    this.tnC = new y();
    this.tnD = new k();
    this.tnE = new s.1(this);
    this.tnF = new c()
    {
    };
    this.tnG = new s.3(this);
    this.tnH = new l();
    File localFile = new File(com.tencent.mm.plugin.wallet_core.d.b.cRb());
    if (!localFile.exists())
      localFile.mkdir();
    AppMethodBeat.o(45852);
  }

  public static String agi()
  {
    AppMethodBeat.i(45857);
    g.RQ();
    String str1 = (String)g.RP().Ry().get(6, null);
    String str2 = av.Ps(str1);
    if (bo.isNullOrNil(str1))
    {
      str2 = "";
      AppMethodBeat.o(45857);
    }
    while (true)
    {
      return str2;
      str2 = str1.substring(str2.length() + 1);
      AppMethodBeat.o(45857);
    }
  }

  public static s cNC()
  {
    AppMethodBeat.i(45853);
    s locals = (s)q.Y(s.class);
    AppMethodBeat.o(45853);
    return locals;
  }

  public static ak cND()
  {
    AppMethodBeat.i(45856);
    ak localak = com.tencent.mm.plugin.wallet_core.model.r.cPI();
    AppMethodBeat.o(45856);
    return localak;
  }

  public static String cNE()
  {
    AppMethodBeat.i(45858);
    g.RQ();
    String str1 = (String)g.RP().Ry().get(6, null);
    if (bo.isNullOrNil(str1))
    {
      str1 = "";
      str2 = str1;
      if (bo.isNullOrNil(str1))
        if (!com.tencent.mm.model.r.YM())
          break label75;
    }
    label75: for (String str2 = "27"; ; str2 = "86")
    {
      AppMethodBeat.o(45858);
      return str2;
      str1 = av.Ps(str1.replace("+", ""));
      break;
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(45854);
    g.RQ();
    this.tnA = ((Integer)g.RP().Ry().get(339975, Integer.valueOf(0))).intValue();
    g.RQ();
    this.cQG = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("paymsg", this.tnG);
    com.tencent.mm.sdk.b.a.xxA.c(this.tnB);
    com.tencent.mm.sdk.b.a.xxA.c(this.tnC);
    com.tencent.mm.sdk.b.a.xxA.c(this.tnD);
    this.tnF.dnU();
    this.tnH.dnU();
    g.RQ();
    g.RP().Ry().a(this.tnE);
    g.RQ();
    g.RP().Ry().set(ac.a.xUU, Boolean.FALSE);
    AppMethodBeat.o(45854);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(45855);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("paymsg", this.tnG);
    com.tencent.mm.sdk.b.a.xxA.d(this.tnB);
    com.tencent.mm.sdk.b.a.xxA.d(this.tnC);
    com.tencent.mm.sdk.b.a.xxA.d(this.tnD);
    this.tnF.dead();
    this.tnH.dead();
    g.RQ();
    g.RP().Ry().b(this.tnE);
    AppMethodBeat.o(45855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.s
 * JD-Core Version:    0.6.2
 */