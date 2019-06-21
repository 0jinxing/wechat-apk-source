package com.tencent.mm.plugin.label;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ai;
import java.util.HashMap;

public class e
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private ai nHt;
  private d nHu;

  static
  {
    AppMethodBeat.i(22519);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("CONTACT_LABEL_TABLE".hashCode()), new e.1());
    eaA.put(Integer.valueOf("CONTACT_LABEL_CACHE_TABLE".hashCode()), new e.2());
    AppMethodBeat.o(22519);
  }

  public e()
  {
    AppMethodBeat.i(22514);
    this.nHu = new d();
    AppMethodBeat.o(22514);
  }

  private static e bIY()
  {
    AppMethodBeat.i(22515);
    aw.ZE();
    e locale1 = (e)bw.oJ("plugin.label");
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = locale1;
      if (locale1 != null);
    }
    try
    {
      locale2 = new com/tencent/mm/plugin/label/e;
      locale2.<init>();
      aw.ZE().a("plugin.label", locale2);
      return locale2;
    }
    finally
    {
      AppMethodBeat.o(22515);
    }
  }

  public static ai bIZ()
  {
    AppMethodBeat.i(22518);
    g.RN().QU();
    if (bIY().nHt == null)
    {
      localObject = bIY();
      aw.ZK();
      ((e)localObject).nHt = new ai(c.Ru());
    }
    Object localObject = bIY().nHt;
    AppMethodBeat.o(22518);
    return localObject;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(22516);
    b localb = new b();
    com.tencent.mm.plugin.label.a.a.nHv = localb;
    com.tencent.mm.av.b.fHH = localb;
    com.tencent.mm.sdk.b.a.xxA.c(this.nHu);
    AppMethodBeat.o(22516);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(22517);
    com.tencent.mm.plugin.label.a.a.nHv = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.nHu);
    AppMethodBeat.o(22517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.e
 * JD-Core Version:    0.6.2
 */