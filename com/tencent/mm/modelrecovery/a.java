package com.tencent.mm.modelrecovery;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.IOException;

public final class a
{
  public static void aiz()
  {
    AppMethodBeat.i(16543);
    b localb = new b(ah.getContext().getFilesDir(), "/recovery/recovery.log");
    String str = null;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localb.exists())
    {
      localObject2 = localObject1;
      if (localb.length() > 0L)
        localObject2 = str;
    }
    try
    {
      localObject1 = e.cy(j.w(localb.dMD()));
      localObject2 = localObject1;
      localb.delete();
      localObject2 = localObject1;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject2 = ((String)localObject2).split("​​");
        int i = localObject2.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label235;
          str = localObject2[j];
          localObject1 = str.split("​");
          if ((localObject1 == null) || (localObject1.length != 3))
            break;
          str = localObject1[0];
          k = -1;
          switch (str.hashCode())
          {
          default:
            switch (k)
            {
            default:
              ab.i(localObject1[1], localObject1[2]);
            case 0:
            }
            break;
          case 69:
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        int k;
        ab.printErrStackTrace("MicroMsg.Recovery.RecoveryLogUtil", localIOException, "recoveryLog", new Object[0]);
        continue;
        if (str.equals("E"))
        {
          k = 0;
          continue;
          ab.e(localIOException[1], localIOException[2]);
          continue;
          ab.i("MicroMsg.Recovery.RecoveryLogUtil", str);
        }
      }
      label235: AppMethodBeat.o(16543);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Recovery.RecoveryLogUtil", "not found recovery log");
      AppMethodBeat.o(16543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.a
 * JD-Core Version:    0.6.2
 */