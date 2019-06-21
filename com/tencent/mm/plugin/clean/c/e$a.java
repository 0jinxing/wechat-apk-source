package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.storage.bi;
import java.io.File;

final class e$a extends com.tencent.mm.plugin.clean.c.a.a
{
  private a kwD;

  public e$a(e parame, a parama)
  {
    super(parame);
    this.kwD = parama;
  }

  public final void execute()
  {
    AppMethodBeat.i(18702);
    aw.ZK();
    Object localObject = c.XO().jf(this.kwD.cuQ);
    if (((cy)localObject).field_msgId != 0L)
    {
      ((bi)localObject).dtI();
      aw.ZK();
      c.XO().a(this.kwD.cuQ, (bi)localObject);
    }
    localObject = new File(this.kwD.filePath);
    e.a(this.kwC, (int)(e.d(this.kwC) + ((File)localObject).length()));
    ((File)localObject).delete();
    AppMethodBeat.o(18702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.e.a
 * JD-Core Version:    0.6.2
 */