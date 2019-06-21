package com.tencent.mm.plugin.hp.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.a.ip.a;
import com.tencent.mm.plugin.hp.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends com.tencent.mm.sdk.b.c<ip>
  implements com.tencent.mm.sdk.g.a.d
{
  private static final String eSG;
  private a ntB;

  static
  {
    AppMethodBeat.i(90583);
    eSG = com.tencent.mm.compatible.util.e.eSj + "_temp.hp";
    AppMethodBeat.o(90583);
  }

  public c()
  {
    AppMethodBeat.i(90578);
    this.ntB = null;
    this.xxI = ip.class.getName().hashCode();
    AppMethodBeat.o(90578);
  }

  public static void OF(String paramString)
  {
    AppMethodBeat.i(90579);
    ab.w("Tinker.HotPatchApplyService", "hp_apply from file %s", new Object[] { paramString });
    com.tencent.mm.plugin.hp.tinker.d.OG(paramString);
    AppMethodBeat.o(90579);
  }

  private boolean a(ip paramip)
  {
    AppMethodBeat.i(90581);
    if (this.ntB != null)
    {
      ab.e("Tinker.HotPatchApplyService", "hp_apply processing busy, ignore new event");
      AppMethodBeat.o(90581);
    }
    while (true)
    {
      return false;
      if (1 == paramip.cDI.cuy)
      {
        com.tencent.mm.plugin.hp.tinker.d.bGr();
        AppMethodBeat.o(90581);
        continue;
      }
      if (paramip.cDI.cDN != null)
      {
        OF(paramip.cDI.cDN);
        AppMethodBeat.o(90581);
        continue;
      }
      b.wW(1);
      if (paramip.cDI.cDL != null);
      try
      {
        byte[] arrayOfByte = Base64.decode(paramip.cDI.cDL, 0);
        ip.a locala = paramip.cDI;
        String str = new java/lang/String;
        str.<init>(arrayOfByte);
        locala.cDL = str;
        label124: if ((!bo.isNullOrNil(paramip.cDI.cDL)) && (!bo.isNullOrNil(paramip.cDI.cDM)))
        {
          ab.i("Tinker.HotPatchApplyService", "hp_apply request url=%s, signature=%s", new Object[] { paramip.cDI.cDL, paramip.cDI.cDM });
          this.ntB = new a(paramip.cDI.cDL, eSG, paramip.cDI.cDM);
        }
        while ((!bo.isNullOrNil(paramip.cDI.cDJ)) && (!bo.isNullOrNil(paramip.cDI.cDK)))
        {
          com.tencent.mm.sdk.g.d.xDG.a(this.ntB, "hp_apply_download", this);
          AppMethodBeat.o(90581);
          break;
        }
        AppMethodBeat.o(90581);
      }
      catch (Error localError)
      {
        break label124;
      }
    }
  }

  public final void a(Runnable paramRunnable, int paramInt)
  {
  }

  public final void b(Runnable paramRunnable, int paramInt)
  {
    AppMethodBeat.i(90580);
    if (paramRunnable == this.ntB)
    {
      ab.d("Tinker.HotPatchApplyService", "hp_apply download url=%s, file=%s, failed=%b", new Object[] { this.ntB.url, this.ntB.ghD, Boolean.valueOf(this.ntB.aAR) });
      if (this.ntB.aAR)
        break label92;
      b.wX(1);
      OF(this.ntB.ghD);
    }
    while (true)
    {
      this.ntB = null;
      AppMethodBeat.o(90580);
      return;
      label92: b.wY(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.c
 * JD-Core Version:    0.6.2
 */