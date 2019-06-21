package com.tencent.mm.sandbox.monitor;

import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sandbox.b;
import com.tencent.mm.sandbox.updater.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public abstract class c
  implements b
{
  public static final String xvv = com.tencent.mm.compatible.util.e.eSn;
  private boolean xvA = false;
  protected int xvw;
  public int xvx;
  public int xvy;
  public String xvz;

  public c(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    this.xvx = paramInt1;
    this.xvz = paramString;
    this.xvw = paramInt2;
    this.xvA = paramBoolean;
    this.xvy = com.tencent.mm.a.e.cs(alN());
    paramString = new File(xvv);
    if (!paramString.exists())
      paramString.mkdirs();
    ab.d("MM.GetUpdatePack", "NetSceneGetUpdatePack : temp path = " + alN() + " packOffset = " + this.xvy);
  }

  public static String RP(String paramString)
  {
    return bY(paramString, false);
  }

  public static boolean alZ(String paramString)
  {
    if (com.tencent.mm.a.e.ct(xvv + paramString + ".temp"));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String ama(String paramString)
  {
    paramString = xvv + paramString + ".apk";
    if ((com.tencent.mm.a.e.ct(paramString)) && (a.cM(paramString)));
    while (true)
    {
      return paramString;
      paramString = null;
    }
  }

  public static String bY(String paramString, boolean paramBoolean)
  {
    Object localObject1 = xvv + paramString + ".temp";
    String str = xvv + paramString + ".apk";
    if ((com.tencent.mm.a.e.ct((String)localObject1)) && (!paramBoolean) && ((a.cM((String)localObject1)) || (paramString.equalsIgnoreCase(g.cz((String)localObject1)))))
    {
      com.tencent.mm.a.e.h(xvv, paramString + ".temp", paramString + ".apk");
      paramString = str;
    }
    while (true)
    {
      return paramString;
      if (com.tencent.mm.a.e.ct(str))
      {
        if (a.cM(str))
        {
          ab.i("MM.GetUpdatePack", "summertoken getReadyPack checkApkMd5 update pack ok");
          paramString = str;
        }
        else
        {
          Object localObject2 = null;
          localObject1 = localObject2;
          try
          {
            Object localObject4 = new java/io/File;
            localObject1 = localObject2;
            ((File)localObject4).<init>(str);
            localObject1 = localObject2;
            localObject4 = com.tencent.mm.c.c.y((File)localObject4);
            localObject2 = localObject4;
            localObject1 = localObject4;
            if (bo.isNullOrNil((String)localObject4))
            {
              localObject1 = localObject4;
              h.pYm.a(322L, 10L, 1L, false);
              localObject1 = localObject4;
              h.pYm.e(11098, new Object[] { Integer.valueOf(4010) });
              localObject2 = localObject4;
            }
            ab.i("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode pkgsig[%s]", new Object[] { localObject2 });
            if (bo.isNullOrNil(localObject2))
            {
              if (!paramString.equalsIgnoreCase(g.cz(str)))
                break label480;
              ab.i("MM.GetUpdatePack", "summertoken getReadyPack no pkgsig getMD5 update pack ok");
              paramString = str;
            }
          }
          catch (Exception localException)
          {
            Object localObject3;
            while (true)
            {
              ab.w("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode e:" + localException.getMessage());
              h.pYm.a(322L, 9L, 1L, false);
              h.pYm.e(11098, new Object[] { Integer.valueOf(4009), localException.getMessage() });
              localObject3 = localObject1;
            }
            paramString = i.dns();
            ab.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig[%s], downloadedSig[%s]", new Object[] { localObject3, paramString });
            if (localObject3.equals(paramString))
            {
              ab.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check update pack ok");
              paramString = str;
              continue;
            }
            ab.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check invalid");
            h.pYm.a(322L, 11L, 1L, false);
            h.pYm.e(11098, new Object[] { Integer.valueOf(4011), String.format("%s,%s", new Object[] { paramString, localObject3 }) });
            label480: ab.e("MM.GetUpdatePack", "summertoken getReadyPack: update pack MD5 not same");
            com.tencent.mm.a.e.deleteFile(str);
          }
        }
      }
      else
        paramString = null;
    }
  }

  public String alN()
  {
    return xvv + this.xvz + ".temp";
  }

  public final void deleteTempFile()
  {
    try
    {
      ab.d("MM.GetUpdatePack", "deleteTempFile");
      File localFile = new java/io/File;
      localFile.<init>(alN());
      if (localFile.exists())
        localFile.delete();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MM.GetUpdatePack", "error in deleteTempFile");
    }
  }

  public String dne()
  {
    return xvv + this.xvz + ".apk";
  }

  public final boolean dnf()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.xvA)
    {
      bool2 = bool1;
      if (!at.isWifi(ah.getContext()))
        bool2 = true;
    }
    return bool2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.c
 * JD-Core Version:    0.6.2
 */