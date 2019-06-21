package com.tencent.mm.plugin.wepkg.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class c$2$1
  implements Runnable
{
  c$2$1(c.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63630);
    Object localObject = new WepkgCrossProcessTask();
    ((WepkgCrossProcessTask)localObject).Cn = 2003;
    if (ah.bqo())
      ((WepkgCrossProcessTask)localObject).asP();
    while (true)
    {
      localObject = ((WepkgCrossProcessTask)localObject).uWY;
      if ((localObject != null) && (!bo.isNullOrNil(((WepkgVersion)localObject).eBS)))
        i.dgD().bQ(((WepkgVersion)localObject).eBS, true);
      AppMethodBeat.o(63630);
      return;
      WepkgMainProcessService.b((WepkgMainProcessTask)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.c.2.1
 * JD-Core Version:    0.6.2
 */