package com.tencent.mm.ui.i;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import org.b.d.c;
import org.b.d.g;
import org.b.d.j;
import org.b.e.b;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80342);
    Object localObject = a.c.zLd;
    if (this.zLa.zKU == null)
      localObject = a.c.zLe;
    while (true)
    {
      localObject = this.zLa.rgT.obtainMessage(1010, localObject);
      this.zLa.rgT.sendMessage((Message)localObject);
      AppMethodBeat.o(80342);
      return;
      c localc1 = new c(j.BZa, "https://api.twitter.com/1.1/account/verify_credentials.json");
      this.zLa.zKT.a(this.zLa.zKU, localc1);
      try
      {
        if (localc1.enc().code != 200)
          localObject = a.c.zLe;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Twitter", localException, "request error.", new Object[0]);
        a.c localc = a.c.zLe;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.a.3
 * JD-Core Version:    0.6.2
 */