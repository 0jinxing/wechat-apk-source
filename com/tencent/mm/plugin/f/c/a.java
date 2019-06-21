package com.tencent.mm.plugin.f.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

public final class a
  implements Runnable
{
  private bi csG;
  private int opType;

  public a(bi parambi, int paramInt)
  {
    AppMethodBeat.i(18641);
    this.csG = parambi;
    this.opType = paramInt;
    ab.d("MicroMsg.MsgEventTask", "%d msg id[%d %d] optype[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.csG.field_msgId), Integer.valueOf(this.csG.getType()), Integer.valueOf(this.opType) });
    AppMethodBeat.o(18641);
  }

  public final void run()
  {
    AppMethodBeat.i(18642);
    switch (this.opType)
    {
    default:
      ab.w("MicroMsg.MsgEventTask", "%d unknow op type [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.opType) });
      AppMethodBeat.o(18642);
    case 1:
    }
    while (true)
    {
      return;
      b.aZc().O(this.csG);
      AppMethodBeat.o(18642);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.a
 * JD-Core Version:    0.6.2
 */