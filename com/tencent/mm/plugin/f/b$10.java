package com.tencent.mm.plugin.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;

final class b$10
  implements Runnable
{
  b$10(b paramb, com.tencent.mm.vfs.b[] paramArrayOfb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18590);
    if ((this.kah == null) || (this.kah.length == 0))
    {
      ab.e("MicroMsg.CalcWxService", "apkList is null or 0");
      AppMethodBeat.o(18590);
    }
    while (true)
    {
      return;
      com.tencent.mm.vfs.b[] arrayOfb = this.kah;
      int i = arrayOfb.length;
      int j = 0;
      int k = 0;
      Object localObject1 = null;
      Object localObject2 = null;
      if (j < i)
      {
        com.tencent.mm.vfs.b localb = arrayOfb[j];
        Object localObject3;
        Object localObject4;
        int m;
        if (localb.getName().endsWith(".temp"))
          if (bo.gb(localb.lastModified()) > 86400000L)
          {
            localb.delete();
            localObject3 = localObject2;
            localObject4 = localObject1;
            m = k;
          }
        while (true)
        {
          j++;
          k = m;
          localObject1 = localObject4;
          localObject2 = localObject3;
          break;
          if (localObject1 == null)
          {
            m = k;
            localObject4 = localb;
            localObject3 = localObject2;
          }
          else if (localb.lastModified() > localObject1.lastModified())
          {
            localObject1.delete();
            m = k;
            localObject4 = localb;
            localObject3 = localObject2;
          }
          else
          {
            localb.delete();
            m = k;
            localObject4 = localObject1;
            localObject3 = localObject2;
            continue;
            m = k;
            localObject4 = localObject1;
            localObject3 = localObject2;
            if (localb.getName().endsWith(".apk"))
            {
              localObject3 = ah.getContext().getPackageManager().getPackageArchiveInfo(j.w(localb.dMD()), 128);
              if (localObject3 != null)
              {
                if ((((PackageInfo)localObject3).packageName != null) && (!((PackageInfo)localObject3).packageName.equals("com.tencent.mm")))
                {
                  localb.delete();
                  m = k;
                  localObject4 = localObject1;
                  localObject3 = localObject2;
                }
                else
                {
                  localObject3 = ((PackageInfo)localObject3).applicationInfo;
                  if ((localObject3 != null) && (((ApplicationInfo)localObject3).metaData != null))
                  {
                    m = ((ApplicationInfo)localObject3).metaData.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                    ab.d("MicroMsg.CalcWxService", "startCleanAPKFiles:%d, currentVersion;%d", new Object[] { Integer.valueOf(m), Integer.valueOf(d.vxo) });
                    if (m <= d.vxo)
                    {
                      localb.delete();
                      m = k;
                      localObject4 = localObject1;
                      localObject3 = localObject2;
                      continue;
                    }
                    if (localObject2 == null)
                    {
                      localObject4 = localObject1;
                      localObject3 = localb;
                      continue;
                    }
                    if (m > k)
                    {
                      localObject2.delete();
                      localObject4 = localObject1;
                      localObject3 = localb;
                      continue;
                    }
                    localb.delete();
                    m = k;
                    localObject4 = localObject1;
                    localObject3 = localObject2;
                  }
                }
              }
              else if (k != 0)
              {
                localb.delete();
                m = k;
                localObject4 = localObject1;
                localObject3 = localObject2;
              }
              else if (localObject2 == null)
              {
                m = k;
                localObject4 = localObject1;
                localObject3 = localb;
              }
              else if (localb.lastModified() > localObject2.lastModified())
              {
                localObject2.delete();
                m = k;
                localObject4 = localObject1;
                localObject3 = localb;
              }
              else
              {
                localb.delete();
                m = k;
                localObject4 = localObject1;
                localObject3 = localObject2;
              }
            }
          }
        }
      }
      AppMethodBeat.o(18590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.10
 * JD-Core Version:    0.6.2
 */