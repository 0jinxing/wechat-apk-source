package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class f$3
  implements Runnable
{
  f$3(f paramf, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16265);
    ab.i("MicroMsg.BigBallSysCmdMsgConsumer", "[deleteLocalFile] id:%s type:%s", new Object[] { Long.valueOf(this.fkD.field_msgId), Integer.valueOf(this.fkD.getType()) });
    switch (this.fkD.getType())
    {
    default:
    case 3:
    case 34:
    case 43:
    case 44:
    case 49:
    case 62:
    case 268435505:
    }
    while (true)
    {
      AppMethodBeat.o(16265);
      return;
      bf.m(this.fkD);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.f.3
 * JD-Core Version:    0.6.2
 */