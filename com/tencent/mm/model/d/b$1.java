package com.tencent.mm.model.d;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;
import java.lang.reflect.Method;

public final class b$1
  implements Runnable
{
  public b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16391);
    File localFile = new File(b.access$000() + "MMSQL.trace");
    if (!localFile.exists())
    {
      ab.w("MicroMsg.SQLTraceManager", "SqlTrace file is not  exists");
      AppMethodBeat.o(16391);
    }
    while (true)
    {
      return;
      if (!g.RN().QY())
      {
        ab.w("MicroMsg.SQLTraceManager", "acc not ready ");
        AppMethodBeat.o(16391);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        long l2 = b.bO(ah.getContext());
        boolean bool1 = false;
        boolean bool2;
        label106: Object localObject1;
        Object localObject2;
        String str;
        if (l2 > l1)
        {
          bool2 = true;
          l2 = localFile.length();
          ab.i("MicroMsg.SQLTraceManager", "check need upload ,file size is %d,time out  %b", new Object[] { Long.valueOf(l2), Boolean.valueOf(bool2) });
          if ((bool2) && (l2 > b.c(this.fpv)))
          {
            localObject1 = this.fpv;
            localObject2 = ah.getContext();
            str = ah.getContext().getPackageName();
          }
        }
        else
        {
          try
          {
            Method localMethod = PackageManager.class.getMethod("getPackageSizeInfo", new Class[] { String.class, IPackageStatsObserver.class });
            localObject2 = ((Context)localObject2).getPackageManager();
            b.2 local2 = new com/tencent/mm/model/d/b$2;
            local2.<init>((b)localObject1);
            localMethod.invoke(localObject2, new Object[] { str, local2 });
            if ((b.d(this.fpv)[1] != 0L) || (b.e(this.fpv) > 1L))
            {
              ab.i("MicroMsg.SQLTraceManager", "start file upload ,file length is %d ", new Object[] { Long.valueOf(localFile.length()) });
              if (localFile.length() > b.f(this.fpv))
              {
                ab.e("MicroMsg.SQLTraceManager", "log file invaild format");
                ab.i("MicroMsg.SQLTraceManager", "set last Upload Time %d ", new Object[] { Long.valueOf(System.currentTimeMillis()) });
                b.a(this.fpv, localFile);
                b.g(this.fpv);
                b.h(this.fpv);
                b.c(ah.getContext(), System.currentTimeMillis());
                AppMethodBeat.o(16391);
                continue;
                if (l1 - l2 > 86400000L)
                {
                  bool2 = true;
                  break label106;
                }
                bool2 = bool1;
                if (l1 - l2 <= b.a(this.fpv))
                  break label106;
                bool2 = bool1;
                if (!b.b(this.fpv))
                  break label106;
                bool2 = true;
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ((b)localObject1).ceM[0] = -1L;
              ((b)localObject1).ceM[1] = -1L;
              ((b)localObject1).ceM[2] = -1L;
              continue;
              localObject1 = b.ph(b.access$000() + "MMSQL.trace");
              ab.i("MicroMsg.SQLTraceManager", "read content success");
              this.fpv.pg((String)localObject1);
            }
            ab.i("MicroMsg.SQLTraceManager", "wait for get packageStats");
            b.i(this.fpv);
          }
        }
        AppMethodBeat.o(16391);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.b.1
 * JD-Core Version:    0.6.2
 */