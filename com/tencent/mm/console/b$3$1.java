package com.tencent.mm.console;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bd.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.util.ArrayList;

final class b$3$1
  implements Runnable
{
  b$3$1(b.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16076);
    try
    {
      Object localObject1 = com.tencent.mm.compatible.util.e.eSl;
      aw.ZK();
      String str1 = c.Yd();
      aw.ZK();
      Object localObject2 = c.XH();
      Object localObject3 = str1.substring(((String)localObject1).length());
      ab.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", new Object[] { Integer.valueOf(this.ewi.ewg), localObject1, str1, localObject2, localObject3 });
      int i = 0;
      if (i < this.ewi.ewg)
      {
        String str2 = ((bd.a)this.ewi.ewh.get(i)).xBt;
        if ((!bo.isNullOrNil(str2)) && (!((String)localObject1).contains(str2)))
        {
          localObject2 = new com/tencent/mm/vfs/b;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ((b)localObject2).<init>(str2 + (String)localObject3);
          if ((((b)localObject2).exists()) && (((b)localObject2).isDirectory()))
          {
            boolean bool = com.tencent.mm.vfs.e.is(j.w(((b)localObject2).dMD()), str1);
            ab.i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", new Object[] { str1, j.w(((b)localObject2).dMD()), Boolean.valueOf(bool) });
            if (bool)
            {
              localObject3 = new com/tencent/mm/sdk/platformtools/ak;
              ((ak)localObject3).<init>(Looper.getMainLooper());
              localObject1 = new com/tencent/mm/console/b$3$1$1;
              ((b.3.1.1)localObject1).<init>(this);
              ((ak)localObject3).post((Runnable)localObject1);
              AppMethodBeat.o(16076);
            }
          }
        }
      }
      while (true)
      {
        return;
        i++;
        break;
        localObject3 = new com/tencent/mm/sdk/platformtools/ak;
        ((ak)localObject3).<init>(Looper.getMainLooper());
        localObject1 = new com/tencent/mm/console/b$3$1$2;
        ((2)localObject1).<init>(this);
        ((ak)localObject3).post((Runnable)localObject1);
        AppMethodBeat.o(16076);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(16076);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.3.1
 * JD-Core Version:    0.6.2
 */