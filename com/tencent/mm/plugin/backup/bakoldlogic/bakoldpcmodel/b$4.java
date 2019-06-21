package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.DataOutputStream;

final class b$4
  implements Runnable
{
  b$4(b paramb, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17810);
    try
    {
      synchronized (b.a(this.jzi))
      {
        b.b(this.jzi).write(this.cgh);
        b.b(this.jzi).flush();
        AppMethodBeat.o(17810);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.BakOldJavaEngine", "send_error %s", new Object[] { localException });
        b.c(this.jzi);
        b.a(this.jzi, 10008, "send_error ".concat(String.valueOf(localException)).getBytes());
        AppMethodBeat.o(17810);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.b.4
 * JD-Core Version:    0.6.2
 */