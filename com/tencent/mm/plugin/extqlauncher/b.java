package com.tencent.mm.plugin.extqlauncher;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.l;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import java.util.HashMap;
import java.util.List;

public final class b
  implements at
{
  private b.a lRI;
  private b.b lRJ;
  boolean lRK;
  private n.b lRL;
  boolean lRM;
  long lRN;
  private final long lRO;
  private final long lRP;
  private final String lRQ;
  int lRR;
  private ak lRS;

  public b()
  {
    AppMethodBeat.i(20483);
    this.lRK = false;
    this.lRL = new b.1(this);
    this.lRM = false;
    this.lRN = 0L;
    this.lRO = 300000L;
    this.lRP = 4000L;
    this.lRQ = "fun1";
    this.lRR = 0;
    this.lRS = new b.3(this, Looper.getMainLooper());
    AppMethodBeat.o(20483);
  }

  public static b bsa()
  {
    AppMethodBeat.i(20484);
    aw.ZE();
    b localb1 = (b)bw.oJ("plugin.extqlauncher");
    b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = new b();
      aw.ZE().a("plugin.extqlauncher", localb2);
    }
    AppMethodBeat.o(20484);
    return localb2;
  }

  public static int bsb()
  {
    AppMethodBeat.i(20487);
    int i;
    if (!aw.RK())
    {
      ab.w("MicroMsg.SubCoreExtQLauncher", "getMMUnread account not ready");
      i = 0;
      AppMethodBeat.o(20487);
    }
    while (true)
    {
      return i;
      int j = u.nR(t.fkP);
      int k = l.Yv();
      i = j;
      if ((r.YD() & 0x8000) == 0)
        i = j - k;
      AppMethodBeat.o(20487);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bsc()
  {
    AppMethodBeat.i(20488);
    this.lRS.removeMessages(0);
    this.lRS.sendEmptyMessageDelayed(0, 4000L);
    AppMethodBeat.o(20488);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(20485);
    aw.ZK();
    c.XR().a(this.lRL);
    if (this.lRI == null)
      this.lRI = new b.a();
    a.xxA.c(this.lRI);
    if (this.lRJ == null)
      this.lRJ = new b.b(this, (byte)0);
    a.xxA.c(this.lRJ);
    AppMethodBeat.o(20485);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(20486);
    if (this.lRI != null)
      a.xxA.d(this.lRI);
    if (this.lRJ != null)
      a.xxA.d(this.lRJ);
    aw.ZK();
    c.XR().b(this.lRL);
    this.lRS.removeMessages(0);
    AppMethodBeat.o(20486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.b
 * JD-Core Version:    0.6.2
 */