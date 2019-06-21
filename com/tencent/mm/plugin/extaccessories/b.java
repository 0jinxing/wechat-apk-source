package com.tencent.mm.plugin.extaccessories;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.File;
import java.util.HashMap;

public final class b
  implements at
{
  String eJM;
  private b.a lRE;

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(20468);
    aw.ZK();
    this.eJM = c.getAccPath();
    File localFile = new File(this.eJM);
    if (!localFile.exists())
      localFile.mkdirs();
    localFile = new File(this.eJM + "image/spen/");
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(20468);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(20469);
    ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "SubCoreExtAccessories reset");
    if (this.lRE == null)
      this.lRE = new b.a();
    a.xxA.c(this.lRE);
    aw.RS().m(new b.1(this), 5000L);
    AppMethodBeat.o(20469);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(20470);
    ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "SubCoreExtAccessories release");
    if (this.lRE != null)
      a.xxA.d(this.lRE);
    AppMethodBeat.o(20470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extaccessories.b
 * JD-Core Version:    0.6.2
 */