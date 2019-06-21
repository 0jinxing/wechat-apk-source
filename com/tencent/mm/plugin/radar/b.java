package com.tencent.mm.plugin.radar;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.ui.i.a;
import java.util.HashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/SubCoreRadar;", "Lcom/tencent/mm/model/ISubCore;", "()V", "clearPluginData", "", "pluginFlag", "", "doRadar", "getBaseDBFactories", "Ljava/util/HashMap;", "Lcom/tencent/mm/storagebase/SqliteDB$IFactory;", "onAccountPostReset", "updated", "", "onAccountRelease", "onSdcardMount", "mounted", "Companion", "plugin-radar_release"})
public final class b
  implements at
{
  private static final String TAG = "MicroMsg.SubCoreRadar";
  public static final b.a pAH;

  static
  {
    AppMethodBeat.i(102860);
    pAH = new b.a((byte)0);
    TAG = "MicroMsg.SubCoreRadar";
    AppMethodBeat.o(102860);
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
    AppMethodBeat.i(102859);
    com.tencent.mm.plugin.radar.ui.b.a locala = com.tencent.mm.plugin.radar.ui.b.a.pCd;
    com.tencent.mm.plugin.radar.ui.b.a.a((i.a)new b.b());
    AppMethodBeat.o(102859);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b
 * JD-Core Version:    0.6.2
 */