package com.tencent.mm.loader.l;

import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String eSG = eSn + ".tmp";
  public static long eSH = 0L;
  public static final String eSl = h.getExternalStorageDirectory().getAbsolutePath();
  public static final String eSn = eSl + "/tencent/MicroMsg/";

  public static String Ur()
  {
    Object localObject = new StringBuilder().append(eSG).append("/");
    long l = System.currentTimeMillis();
    localObject = new SimpleDateFormat("yyyyMMdd").format(new Date(l));
    ab.d("MicroMsg.Loader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", new Object[] { localObject });
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(eSG);
    if (!localb.exists())
      localb.mkdirs();
    return localObject;
  }

  public static boolean Us()
  {
    long l = System.currentTimeMillis();
    if (l - eSH > 86400000L)
    {
      ab.d("MicroMsg.Loader.ImageTmpFilehUtils", "[cpan] need clean tmp file.");
      eSH = l;
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      ab.d("MicroMsg.Loader.ImageTmpFilehUtils", "[cpan] need not clean tmp file.");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.l.b
 * JD-Core Version:    0.6.2
 */