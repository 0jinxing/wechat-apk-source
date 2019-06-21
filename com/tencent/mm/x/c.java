package com.tencent.mm.x;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;

public final class c
  implements at
{
  private static c eFk;
  private a eFl;

  private c()
  {
    AppMethodBeat.i(77749);
    if (a.eEQ == null)
      a.eEQ = new a();
    this.eFl = a.eEQ;
    AppMethodBeat.o(77749);
  }

  private static c PJ()
  {
    try
    {
      AppMethodBeat.i(77750);
      if (eFk == null)
      {
        localc = new com/tencent/mm/x/c;
        localc.<init>();
        eFk = localc;
        localc.eFl.init();
      }
      c localc = eFk;
      AppMethodBeat.o(77750);
      return localc;
    }
    finally
    {
    }
  }

  public static a PK()
  {
    AppMethodBeat.i(77753);
    g.RN().QU();
    a locala = PJ().eFl;
    AppMethodBeat.o(77753);
    return locala;
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
    AppMethodBeat.i(77752);
    this.eFl.init();
    AppMethodBeat.o(77752);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(77751);
    a locala = this.eFl;
    locala.eES.clear();
    b localb = locala.eER;
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] decoder.clear()");
    localb.eFa.clear();
    localb.eFc.clear();
    localb.eFb.clear();
    localb.eFd.clear();
    locala.initialized = false;
    AppMethodBeat.o(77751);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.c
 * JD-Core Version:    0.6.2
 */