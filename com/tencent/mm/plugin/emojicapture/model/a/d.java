package com.tencent.mm.plugin.emojicapture.model.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.c.a;
import com.tencent.mm.plugin.emojicapture.model.c.a.a;
import com.tencent.mm.plugin.emojicapture.model.c.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"checkStickerValid", "", "item", "Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensItem;", "plugin-emojicapture_release"})
public final class d
{
  public static final boolean a(com.tencent.mm.plugin.emojicapture.model.c.d paramd)
  {
    AppMethodBeat.i(2646);
    j.p(paramd, "item");
    Object localObject = e.lii;
    localObject = e.uw(paramd.ljp);
    i locali = new i();
    a.a locala = a.ljn;
    a.a.a((String)localObject, (a)locali);
    boolean bool;
    if (locali.ljI >= paramd.ljr)
    {
      bool = true;
      AppMethodBeat.o(2646);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2646);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a.d
 * JD-Core Version:    0.6.2
 */