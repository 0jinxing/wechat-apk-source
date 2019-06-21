package com.tencent.mm.ui.i;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import org.b.e.b;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80341);
    try
    {
      this.zLa.zKV = this.zLa.zKT.enj();
      Object localObject1 = this.zLa.zKT.b(this.zLa.zKV);
      localObject1 = this.zLa.rgT.obtainMessage(1000, localObject1);
      this.zLa.rgT.sendMessage((Message)localObject1);
      AppMethodBeat.o(80341);
      return;
    }
    catch (org.b.b.a locala)
    {
      while (true)
        Object localObject2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.a.2
 * JD-Core Version:    0.6.2
 */