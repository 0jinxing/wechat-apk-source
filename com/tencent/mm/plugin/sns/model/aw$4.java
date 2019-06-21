package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

final class aw$4
  implements Runnable
{
  aw$4(aw paramaw, String paramString1, bav parambav, List paramList, TimeLineObject paramTimeLineObject, int paramInt, boolean paramBoolean, LinkedList paramLinkedList, com.tencent.mm.bt.b paramb, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36685);
    if (af.cnn())
    {
      ab.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
      AppMethodBeat.o(36685);
    }
    while (true)
    {
      return;
      aw.a(this.qNp, new s(this.fOH, this.qNr.wEJ, this.qNr.wFe, this.qNs, this.qNt, this.qNq, this.qNr.ptv, this.qNr.wFj, this.qNr.wFk, this.qNr.wFl, this.qNr, this.qNu, this.qNv, this.qNr.wFq, this.qNw, this.chV));
      g.RQ();
      g.RO().eJo.a(aw.d(this.qNp), 0);
      AppMethodBeat.o(36685);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aw.4
 * JD-Core Version:    0.6.2
 */