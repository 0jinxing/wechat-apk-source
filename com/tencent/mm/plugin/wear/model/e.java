package com.tencent.mm.plugin.wear.model;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;

public final class e
{
  com.tencent.mm.sdk.b.c edy;
  ap gyS;
  com.tencent.mm.sdk.b.c ilT;
  h.a lPn;
  com.tencent.mm.sdk.b.c nZv;
  com.tencent.mm.sdk.b.c ryO;
  private PowerManager tXN;
  private KeyguardManager tXO;
  com.tencent.mm.sdk.b.c tXP;
  com.tencent.mm.sdk.b.c tXQ;
  com.tencent.mm.sdk.b.c tXR;
  com.tencent.mm.sdk.b.c tXS;
  com.tencent.mm.sdk.b.c tXT;

  public e()
  {
    AppMethodBeat.i(26318);
    this.ryO = new e.1(this);
    this.tXP = new e.4(this);
    this.tXQ = new e.5(this);
    this.ilT = new e.6(this);
    this.gyS = new ap(Looper.getMainLooper(), new e.7(this), true);
    this.tXR = new e.8(this);
    this.tXS = new e.9(this);
    this.tXT = new e.10(this);
    this.edy = new e.11(this);
    this.lPn = new e.2(this);
    this.nZv = new e.3(this);
    ab.i("MicroMsg.Wear.WearLogic", "Create!");
    this.ryO.dnU();
    this.tXP.dnU();
    this.tXQ.dnU();
    this.ilT.dnU();
    this.tXR.dnU();
    this.tXS.dnU();
    this.tXT.dnU();
    this.edy.dnU();
    this.nZv.dnU();
    this.gyS.ae(1800000L, 1800000L);
    this.tXN = ((PowerManager)ah.getContext().getSystemService("power"));
    this.tXO = ((KeyguardManager)ah.getContext().getSystemService("keyguard"));
    aw.ZK();
    com.tencent.mm.model.c.XO().a(this.lPn, null);
    AppMethodBeat.o(26318);
  }

  public static void s(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(26319);
    a.cUn().tXz.a(new com.tencent.mm.plugin.wear.model.f.j(paramString, paramInt, paramBoolean));
    AppMethodBeat.o(26319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e
 * JD-Core Version:    0.6.2
 */