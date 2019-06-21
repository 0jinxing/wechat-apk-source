package com.tencent.mm.plugin.qqmail.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.bi;

final class ReadMailProxy$6
  implements Runnable
{
  ReadMailProxy$6(ReadMailProxy paramReadMailProxy, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68095);
    bi localbi = ((j)g.K(j.class)).bOr().jf(this.cgB);
    localbi.setContent(localbi.field_content.replaceFirst("<digest>.*</digest>", "<digest>" + this.hWg + "</digest>"));
    ((j)g.K(j.class)).bOr().a(this.cgB, localbi);
    AppMethodBeat.o(68095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy.6
 * JD-Core Version:    0.6.2
 */