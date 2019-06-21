package com.tencent.mm.ar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class d
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private b fCQ;
  private c fCR;

  static
  {
    AppMethodBeat.i(16491);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("GETCONTACTINFO_TABLE".hashCode()), new d.1());
    AppMethodBeat.o(16491);
  }

  private static d agL()
  {
    AppMethodBeat.i(16488);
    aw.ZE();
    com.tencent.mm.plugin.subapp.a locala = (com.tencent.mm.plugin.subapp.a)bw.oJ("plugin.subapp");
    d locald;
    if (locala == null)
    {
      locald = null;
      if (locald != null)
        break label71;
      locald = new d();
      locala.b(d.class.getName(), locald);
    }
    label71: 
    while (true)
    {
      AppMethodBeat.o(16488);
      return locald;
      locald = (d)locala.abh(d.class.getName());
      break;
    }
  }

  public static b agM()
  {
    AppMethodBeat.i(16489);
    com.tencent.mm.kernel.g.RN().QU();
    if (agL().fCQ == null)
    {
      localObject = agL();
      aw.ZK();
      ((d)localObject).fCQ = new b(com.tencent.mm.model.c.Ru());
    }
    Object localObject = agL().fCQ;
    AppMethodBeat.o(16489);
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
    AppMethodBeat.i(16490);
    if (this.fCR == null)
      this.fCR = new c();
    com.tencent.mm.model.ao.a.flu = this.fCR;
    ab.i("SubCoreGetContact", "summergetcontac onAccountPostReset setGetContact[%s]", new Object[] { this.fCR });
    com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.g.class, new com.tencent.mm.pluginsdk.ui.applet.c());
    com.tencent.mm.kernel.g.a(i.class, new h());
    AppMethodBeat.o(16490);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.d
 * JD-Core Version:    0.6.2
 */