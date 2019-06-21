package com.tencent.mm.plugin.gai.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class a
  implements at
{
  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(21214);
    ab.i("MicroMsg.SubCoreGai", "SubCoreGai onAccountPostReset!");
    AppMethodBeat.o(21214);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(21215);
    ab.i("MicroMsg.SubCoreGai", "SubCoreGai onAccountRelease!");
    AppMethodBeat.o(21215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gai.b.a
 * JD-Core Version:    0.6.2
 */