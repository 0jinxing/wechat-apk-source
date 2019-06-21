package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

final class g$4 extends a
{
  g$4(String paramString, a parama)
  {
  }

  public final void a(BaseWepkgProcessTask paramBaseWepkgProcessTask)
  {
    AppMethodBeat.i(63553);
    String str = this.mXE;
    paramBaseWepkgProcessTask = this.uXp;
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3006;
    localWepkgCrossProcessTask.uWY.eBS = str;
    localWepkgCrossProcessTask.uWY.uXN = false;
    if (ah.bqo())
    {
      d.aNS().aa(new h.11(localWepkgCrossProcessTask, paramBaseWepkgProcessTask));
      AppMethodBeat.o(63553);
    }
    while (true)
    {
      return;
      localWepkgCrossProcessTask.hww = new h.12(paramBaseWepkgProcessTask, localWepkgCrossProcessTask);
      localWepkgCrossProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63553);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.g.4
 * JD-Core Version:    0.6.2
 */