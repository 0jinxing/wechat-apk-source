package com.tencent.mm.plugin.order.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class b
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private bz.a kBx;
  private List<WeakReference<Object>> kaD;
  private ak mHandler;
  com.tencent.mm.plugin.order.model.b pbB;
  private com.tencent.mm.plugin.order.b.b pbC;
  private com.tencent.mm.plugin.order.model.c pbD;
  private bz.a pbE;

  static
  {
    AppMethodBeat.i(43738);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("ORDERCOMMONMSGXML_TABLE".hashCode()), new b.1());
    com.tencent.mm.wallet_core.a.g("ShowOrdersInfoProcess", a.class);
    AppMethodBeat.o(43738);
  }

  public b()
  {
    AppMethodBeat.i(43731);
    this.mHandler = new ak(Looper.getMainLooper());
    this.pbB = null;
    this.pbD = null;
    this.kaD = new ArrayList();
    this.pbE = new b.2(this);
    this.kBx = new b.3(this);
    AppMethodBeat.o(43731);
  }

  public static String bKP()
  {
    AppMethodBeat.i(43737);
    String str;
    if (g.RK())
    {
      str = com.tencent.mm.plugin.i.c.XW() + "order";
      AppMethodBeat.o(43737);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(43737);
    }
  }

  public static b bYR()
  {
    AppMethodBeat.i(43732);
    b localb = (b)q.Y(b.class);
    AppMethodBeat.o(43732);
    return localb;
  }

  public static com.tencent.mm.plugin.order.b.b bYT()
  {
    AppMethodBeat.i(43735);
    g.RN().QU();
    if (bYR().pbC == null)
    {
      localObject = bYR();
      g.RQ();
      ((b)localObject).pbC = new com.tencent.mm.plugin.order.b.b(g.RP().eJN);
    }
    Object localObject = bYR().pbC;
    AppMethodBeat.o(43735);
    return localObject;
  }

  public static com.tencent.mm.plugin.order.model.c bYU()
  {
    AppMethodBeat.i(43736);
    g.RN().QU();
    if (bYR().pbD == null)
      bYR().pbD = new com.tencent.mm.plugin.order.model.c();
    com.tencent.mm.plugin.order.model.c localc = bYR().pbD;
    AppMethodBeat.o(43736);
    return localc;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void aVU()
  {
    AppMethodBeat.i(43734);
    if (this.kaD == null)
      AppMethodBeat.o(43734);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
          localWeakReference.get();
      }
      AppMethodBeat.o(43734);
    }
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bYS()
  {
    AppMethodBeat.i(43733);
    if (this.kaD == null)
      AppMethodBeat.o(43733);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
          localWeakReference.get();
      }
      AppMethodBeat.o(43733);
    }
  }

  public final void bz(boolean paramBoolean)
  {
    this.pbB = null;
    this.pbD = null;
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.a.b
 * JD-Core Version:    0.6.2
 */