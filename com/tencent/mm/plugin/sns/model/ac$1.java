package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.g.a.rs.b;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;

final class ac$1
  implements Runnable
{
  ac$1(ac paramac, rs paramrs, baa parambaa)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36371);
    ab.i("MicroMsg.SightCdnUpload", "event callback errcode %d", new Object[] { Integer.valueOf(this.qKv.cNI.result) });
    if (this.qKv.cNI.result >= 0)
    {
      ac.a(this.qKx);
      this.qKx.a(this.qKw);
      AppMethodBeat.o(36371);
    }
    while (true)
    {
      return;
      this.qKx.onError();
      AppMethodBeat.o(36371);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ac.1
 * JD-Core Version:    0.6.2
 */