package com.tencent.mm.plugin.nearlife.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.story.api.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class d
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
    AppMethodBeat.i(22935);
    ab.i("MicroMsg.SubCoreNearLife", "onAccountPostReset SubCoreNearLife");
    g.a(a.class, new a()
    {
    });
    AppMethodBeat.o(22935);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.b.d
 * JD-Core Version:    0.6.2
 */