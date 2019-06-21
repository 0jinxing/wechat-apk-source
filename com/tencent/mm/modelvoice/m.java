package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.audio.b.i;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.cd;
import java.util.HashMap;
import junit.framework.Assert;

public class m
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private u fZZ;
  private cd gaa;
  private i gab;
  private r gac;
  private c gad;

  static
  {
    AppMethodBeat.i(116604);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("VOICE_TABLE".hashCode()), new m.2());
    eaA.put(Integer.valueOf("VOICETRANSTEXT_TABLE".hashCode()), new m.3());
    AppMethodBeat.o(116604);
  }

  public m()
  {
    AppMethodBeat.i(116597);
    this.gac = new r();
    this.gad = new m.1(this);
    AppMethodBeat.o(116597);
  }

  private static m alZ()
  {
    AppMethodBeat.i(116598);
    m localm = (m)q.Y(m.class);
    AppMethodBeat.o(116598);
    return localm;
  }

  public static u ama()
  {
    AppMethodBeat.i(116599);
    g.RN().QU();
    if (alZ().fZZ == null)
      if (g.RP().eJN == null)
        break label70;
    label70: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      alZ().fZZ = new u(g.RP().eJN);
      u localu = alZ().fZZ;
      AppMethodBeat.o(116599);
      return localu;
    }
  }

  public static cd amb()
  {
    AppMethodBeat.i(116600);
    g.RN().QU();
    if (alZ().gaa == null)
      if (g.RP().eJN == null)
        break label70;
    label70: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      alZ().gaa = new cd(g.RP().eJN);
      cd localcd = alZ().gaa;
      AppMethodBeat.o(116600);
      return localcd;
    }
  }

  public static i amc()
  {
    AppMethodBeat.i(116601);
    g.RN().QU();
    if (alZ().gab == null)
      alZ().gab = new i();
    i locali = alZ().gab;
    AppMethodBeat.o(116601);
    return locali;
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
    AppMethodBeat.i(116603);
    e.d.a(Integer.valueOf(34), this.gac);
    com.tencent.mm.sdk.b.a.xxA.c(this.gad);
    b.a(new m.a(), new String[] { "//voicetrymore" });
    AppMethodBeat.o(116603);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(116602);
    if (alZ().gab != null)
      alZ().gab.cqV = 0;
    e.d.b(Integer.valueOf(34), this.gac);
    com.tencent.mm.sdk.b.a.xxA.d(this.gad);
    b.N(new String[] { "//voicetrymore" });
    AppMethodBeat.o(116602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.m
 * JD-Core Version:    0.6.2
 */