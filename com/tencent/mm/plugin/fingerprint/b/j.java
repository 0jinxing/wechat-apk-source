package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.k;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends com.tencent.mm.sdk.b.c<lv>
{
  private String czZ;
  private j.a mrO;
  lv mrP;
  private k mrQ;
  private Runnable mrR;
  boolean mru;

  public j()
  {
    AppMethodBeat.i(41491);
    this.mrQ = null;
    this.mrR = null;
    this.mru = false;
    this.czZ = "";
    this.xxI = lv.class.getName().hashCode();
    AppMethodBeat.o(41491);
  }

  public static void bxK()
  {
    AppMethodBeat.i(41493);
    a.bwM();
    if (a.bwN() != null)
    {
      a.bwM();
      a.bwN();
      c.abort();
      a.bwM();
      a.bwN();
      c.release();
      a.bwM();
      a.bwN();
      if (((l)g.K(l.class)).type() != 2)
        break label88;
    }
    label88: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "stopIdentify() isSoter: %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(41493);
      return;
    }
  }

  final void R(int paramInt, String paramString)
  {
    AppMethodBeat.i(41495);
    ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "onFail()");
    a.bwM();
    a.bwN();
    c.a(this.mrP, paramInt, paramString);
    if (this.mru)
      this.mrP = null;
    ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onFail()");
    AppMethodBeat.o(41495);
  }

  final boolean hv(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(41494);
    bxK();
    a.bwM();
    a.bwN();
    if (!c.bxl())
    {
      ab.e("MicroMsg.OpenFingerPrintAuthEventListener", "no fingerprints enrolled, use settings to enroll fingerprints first");
      release();
      this.mru = true;
      R(1, "");
      AppMethodBeat.o(41494);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      a.bwM();
      a.bwN();
      if (c.a(this.mrO, paramBoolean) != 0)
      {
        ab.e("MicroMsg.OpenFingerPrintAuthEventListener", "failed to start identify");
        release();
        this.mru = true;
        R(1, "");
        AppMethodBeat.o(41494);
        paramBoolean = bool;
      }
      else
      {
        ab.i("MicroMsg.OpenFingerPrintAuthEventListener", "startIdentify()");
        AppMethodBeat.o(41494);
        paramBoolean = true;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(41492);
    a.bwM();
    if (a.bwN() != null)
    {
      a.bwM();
      a.bwN();
      c.release();
    }
    this.mrP = null;
    AppMethodBeat.o(41492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.j
 * JD-Core Version:    0.6.2
 */