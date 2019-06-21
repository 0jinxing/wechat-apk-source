package com.tencent.mm.plugin.hp.tinker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelmulti.l.a;

final class TinkerPatchResultService$2
  implements l.a
{
  TinkerPatchResultService$2(TinkerPatchResultService paramTinkerPatchResultService)
  {
  }

  public final void cO(boolean paramBoolean)
  {
    AppMethodBeat.i(90662);
    boolean bool1 = TinkerPatchResultService.access$000();
    boolean bool2 = com.tencent.mm.r.a.Oo();
    if ((!paramBoolean) && (!bool1) && (!bool2))
    {
      TinkerPatchResultService.a(this.nuf);
      AppMethodBeat.o(90662);
    }
    while (true)
    {
      return;
      com.tencent.tinker.lib.util.a.w("Tinker.TinkerPatchResultService", "not hit condition, skip suicide this time. cond: screenOn: %s, voip: %s, multiTalk: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      AppMethodBeat.o(90662);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.2
 * JD-Core Version:    0.6.2
 */