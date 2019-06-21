package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.sdk.platformtools.ab;

final class aw$5
  implements Runnable
{
  aw$5(aw paramaw, int paramInt1, String paramString, boolean paramBoolean, bav parambav, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36686);
    if (af.cnn())
    {
      ab.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
      AppMethodBeat.o(36686);
    }
    while (true)
    {
      return;
      z localz = new z(this.qNx, this.qNy, this.qNz, this.qNA);
      af.cnE().fk(this.qNx, localz.hashCode());
      g.RQ();
      g.RO().eJo.a(localz, 0);
      AppMethodBeat.o(36686);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aw.5
 * JD-Core Version:    0.6.2
 */