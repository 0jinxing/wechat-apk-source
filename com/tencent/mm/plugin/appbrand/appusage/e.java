package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ai;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionRecordTableUpgradeIssueDataTransfer;", "Lcom/tencent/mm/model/IDataTransfer;", "()V", "getTag", "", "needTransfer", "", "sVer", "", "transfer", "", "transferIfNeed", "Companion", "plugin-appbrand-integration_release"})
public final class e extends ai
{

  @Deprecated
  public static final e.a gYT;

  static
  {
    AppMethodBeat.i(134508);
    gYT = new e.a((byte)0);
    AppMethodBeat.o(134508);
  }

  public final String getTag()
  {
    return "MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(134507);
    com.tencent.mm.kernel.e locale = g.RP();
    j.o(locale, "MMKernel.storage()");
    boolean bool2 = locale.Ry().getBoolean(ac.a.xOu, false);
    ab.d("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", "needTransfer doneIssue ".concat(String.valueOf(bool2)));
    if (!bool2)
    {
      bool1 = true;
      AppMethodBeat.o(134507);
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(134507);
    }
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(134506);
    try
    {
      f.auL().auM().hY("AppBrandStarApp", "update AppBrandStarApp set orderSequence = updateTime");
      com.tencent.mm.kernel.e locale = g.RP();
      j.o(locale, "MMKernel.storage()");
      locale.Ry().set(ac.a.xOu, Boolean.TRUE);
      AppMethodBeat.o(134506);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", localThrowable, "transfer failed", new Object[0]);
        AppMethodBeat.o(134506);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.e
 * JD-Core Version:    0.6.2
 */