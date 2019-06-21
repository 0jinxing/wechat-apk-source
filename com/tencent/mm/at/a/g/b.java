package com.tencent.mm.at.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String eSG;
  public static long eSH;
  public static final String eSl;
  public static final String eSn;

  static
  {
    AppMethodBeat.i(116126);
    eSl = h.getExternalStorageDirectory().getAbsolutePath();
    eSn = eSl + "/tencent/MicroMsg/";
    eSG = eSn + ".tmp";
    eSH = 0L;
    AppMethodBeat.o(116126);
  }

  public static String Ur()
  {
    AppMethodBeat.i(116120);
    Object localObject = new StringBuilder().append(eSG).append("/");
    long l = System.currentTimeMillis();
    localObject = new SimpleDateFormat("yyyyMMdd").format(new Date(l));
    ab.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", new Object[] { localObject });
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(eSG);
    if (!localb.exists())
      localb.mkdirs();
    AppMethodBeat.o(116120);
    return localObject;
  }

  public static boolean Us()
  {
    AppMethodBeat.i(116121);
    long l = System.currentTimeMillis();
    boolean bool;
    if (l - eSH > 86400000L)
    {
      ab.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need clean tmp file.");
      eSH = l;
      bool = true;
      AppMethodBeat.o(116121);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need not clean tmp file.");
      bool = false;
      AppMethodBeat.o(116121);
    }
  }

  private static void a(com.tencent.mm.vfs.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(116125);
    if ((paramb != null) && (paramb.exists()) && (paramb.isDirectory()))
    {
      com.tencent.mm.vfs.b[] arrayOfb = paramb.dMF();
      if ((arrayOfb != null) && (arrayOfb.length > 0))
      {
        int i = arrayOfb.length;
        int j = 0;
        if (j < i)
        {
          com.tencent.mm.vfs.b localb = arrayOfb[j];
          if ((localb != null) && (localb.exists()))
          {
            if (!localb.isFile())
              break label87;
            e(localb);
          }
          while (true)
          {
            j++;
            break;
            label87: if ((fO(localb.lastModified())) && (paramBoolean))
              a(localb, false);
          }
        }
      }
      paramb.delete();
    }
    AppMethodBeat.o(116125);
  }

  public static boolean ahJ()
  {
    boolean bool = true;
    AppMethodBeat.i(116122);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(eSG);
    try
    {
      if ((localb.exists()) && (!localb.isFile()))
        a(localb, true);
      AppMethodBeat.o(116122);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] clean tmp file path exception.");
        bool = false;
        AppMethodBeat.o(116122);
      }
    }
  }

  private static void e(com.tencent.mm.vfs.b paramb)
  {
    AppMethodBeat.i(116124);
    if ((paramb != null) && (paramb.isFile()) && (paramb.exists()))
      paramb.delete();
    AppMethodBeat.o(116124);
  }

  private static boolean fO(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(116123);
    long l = System.currentTimeMillis();
    ab.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] can delete current time:%d,listModified:%d", new Object[] { Long.valueOf(l), Long.valueOf(paramLong) });
    if (l - paramLong >= 259200000L)
      AppMethodBeat.o(116123);
    while (true)
    {
      return bool;
      AppMethodBeat.o(116123);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.g.b
 * JD-Core Version:    0.6.2
 */