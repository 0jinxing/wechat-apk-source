package com.tencent.mm.plugin.nfc_open;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.nfc_open.a.b;
import com.tencent.mm.protocal.protobuf.bel;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;

public final class a
  implements at
{
  private com.tencent.mm.plugin.nfc_open.b.a oTu;

  private static a bVB()
  {
    AppMethodBeat.i(23054);
    aw.ZE();
    a locala1 = (a)bw.oJ("plugin.nfc_open");
    a locala2 = locala1;
    if (locala1 == null)
    {
      ab.w("MicroMsg.SubCoreCpuCard", "[NFC]not found in MMCore, new one");
      locala2 = new a();
      aw.ZE().a("plugin.nfc_open", locala2);
    }
    AppMethodBeat.o(23054);
    return locala2;
  }

  private static void jC(boolean paramBoolean)
  {
    AppMethodBeat.i(23056);
    if (paramBoolean)
    {
      ah.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      AppMethodBeat.o(23056);
    }
    while (true)
    {
      return;
      ah.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
      AppMethodBeat.o(23056);
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
    AppMethodBeat.i(23055);
    ab.i("MicroMsg.SubCoreCpuCard", "alvinluo process: %s", new Object[] { bo.aw(ah.getContext(), Process.myPid()) });
    g.RN().QU();
    if (bVB().oTu == null)
      bVB().oTu = new com.tencent.mm.plugin.nfc_open.b.a();
    com.tencent.mm.plugin.nfc_open.b.a locala = bVB().oTu;
    if (locala.bGv())
    {
      ab.i("MicroMsg.CpuCardConfigManager", "do update cpu card config");
      aw.Rg().a(1561, locala);
      aw.Rg().a(new b(locala.oTw.version), 0);
    }
    aw.ZK();
    int i = ((Integer)c.Ry().get(ac.a.xLb, Integer.valueOf(0))).intValue();
    if (i == 0)
    {
      aw.ZK();
      if (((Integer)c.Ry().get(ac.a.xLc, Integer.valueOf(0))).intValue() == 1)
        jC(true);
    }
    while (true)
    {
      ab.i("MicroMsg.SubCoreCpuCard", "doNFCReport start");
      d.post(new a.1(this), getClass().getName());
      AppMethodBeat.o(23055);
      return;
      jC(false);
      continue;
      if (i == 1)
        jC(true);
      else
        jC(false);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.a
 * JD-Core Version:    0.6.2
 */