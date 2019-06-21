package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.Map;

final class FTSMainUI$15
  implements Runnable
{
  FTSMainUI$15(FTSMainUI paramFTSMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61885);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100441");
    Map localMap;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localMap = ((com.tencent.mm.storage.c)localObject).dru();
      if (localMap != null)
        break label97;
    }
    label97: for (localObject = ""; ; localObject = localMap.toString())
    {
      ab.i("MicroMsg.FTS.FTSMainUI", "widget switch conf is %s", new Object[] { localObject });
      FTSMainUI.b(this.mJJ, "1".equals(localMap.get("isOpen")));
      FTSMainUI.b(this.mJJ, bo.anl((String)localMap.get("searchBarWaitTimeoutMs")));
      AppMethodBeat.o(61885);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.15
 * JD-Core Version:    0.6.2
 */