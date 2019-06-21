package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.plugin.record.a.f;
import java.util.HashMap;

public final class t
  implements at
{
  private static HashMap<Integer, h.d> eaA;

  static
  {
    AppMethodBeat.i(24189);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("RECORD_MSG_INFO_TABLE".hashCode()), new t.1());
    eaA.put(Integer.valueOf("RECORD_MSG_CDN_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return e.fnj;
      }
    });
    AppMethodBeat.o(24189);
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
    AppMethodBeat.i(24188);
    g.a(f.class, new k());
    AppMethodBeat.o(24188);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.t
 * JD-Core Version:    0.6.2
 */