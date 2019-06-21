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

final class b$4$1
  implements Runnable
{
  b$4$1(b.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16080);
    try
    {
      Object localObject1 = this.ewk.bOC.substring(10);
      Object localObject2 = com.tencent.mm.compatible.util.e.eSl;
      aw.ZK();
      Object localObject3 = c.getAccPath();
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = (String)localObject3 + (String)localObject1;
      String str = ((String)localObject4).substring(((String)localObject2).length());
      ab.i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", new Object[] { localObject1, localObject2, localObject3, localObject4, str });
      int i = 0;
      if (i < this.ewk.ewg)
      {
        localObject3 = ((bd.a)this.ewk.ewh.get(i)).xBt;
        if ((!bo.isNullOrNil((String)localObject3)) && (!((String)localObject2).contains((CharSequence)localObject3)))
        {
          localObject1 = new com/tencent/mm/vfs/b;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ((b)localObject1).<init>((String)localObject3 + str);
          if ((((b)localObject1).exists()) && (((b)localObject1).isDirectory()))
          {
            localObject3 = new com/tencent/mm/vfs/b;
            ((b)localObject3).<init>((String)localObject4);
            if (!((b)localObject3).exists())
              ((b)localObject3).mkdirs();
            boolean bool = com.tencent.mm.vfs.e.is(j.w(((b)localObject1).dMD()), j.w(((b)localObject3).dMD()));
            ab.i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", new Object[] { j.w(((b)localObject3).dMD()), j.w(((b)localObject1).dMD()), Boolean.valueOf(bool) });
            if (bool)
            {
              localObject4 = new com/tencent/mm/sdk/platformtools/ak;
              ((ak)localObject4).<init>(Looper.getMainLooper());
              localObject2 = new com/tencent/mm/console/b$4$1$1;
              ((b.4.1.1)localObject2).<init>(this);
              ((ak)localObject4).post((Runnable)localObject2);
              AppMethodBeat.o(16080);
            }
          }
        }
      }
      while (true)
      {
        return;
        i++;
        break;
        localObject2 = new com/tencent/mm/sdk/platformtools/ak;
        ((ak)localObject2).<init>(Looper.getMainLooper());
        localObject4 = new com/tencent/mm/console/b$4$1$2;
        ((2)localObject4).<init>(this);
        ((ak)localObject2).post((Runnable)localObject4);
        AppMethodBeat.o(16080);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(16080);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.4.1
 * JD-Core Version:    0.6.2
 */