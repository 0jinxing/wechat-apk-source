package com.tencent.mm.ui.i;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import org.b.d.i;
import org.b.d.k;
import org.b.e.b;

final class a$4
  implements Runnable
{
  a$4(a parama, Bundle paramBundle)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(80345);
    if (this.zLa.zKV == null)
      AppMethodBeat.o(80345);
    while (true)
    {
      return;
      a.qT(true);
      String str = this.zLb.getString("oauth_verifier");
      Object localObject2 = localObject1;
      if (str != null)
        localObject2 = new k(str);
      try
      {
        localObject2 = this.zLa.zKT.a(this.zLa.zKV, (k)localObject2);
        if (localObject2 != null)
        {
          this.zLa.zKU = ((i)localObject2);
          a.a(this.zLa.zKU);
          new ak(Looper.getMainLooper()).post(new a.4.1(this));
          AppMethodBeat.o(80345);
          continue;
        }
        new ak(Looper.getMainLooper()).post(new a.4.2(this));
        AppMethodBeat.o(80345);
      }
      catch (org.b.b.a locala)
      {
        while (true)
          Object localObject3 = localObject1;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(80346);
    String str = super.toString() + "|onComplete";
    AppMethodBeat.o(80346);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.a.4
 * JD-Core Version:    0.6.2
 */