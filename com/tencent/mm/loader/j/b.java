package com.tencent.mm.loader.j;

import android.content.Context;
import android.os.Environment;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

public class b
{
  public static final String eSi = ((Context)localObject).getFilesDir().getParentFile().getAbsolutePath() + "/";
  public static final String eSj = eSi + "MicroMsg/";
  public static final String eSk;
  public static String eSl;
  public static String eSm;
  public static String eSn;
  public static String eSo;

  static
  {
    Object localObject = ah.getContext();
    if (localObject == null)
      throw new RuntimeException("MMApplicationContext not initialized.");
    try
    {
      localObject = new java/io/File;
      ((File)localObject).<init>(eSj);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      label96: eSk = eSi + "files/public/";
      eSl = Environment.getExternalStorageDirectory().getAbsolutePath();
      eSm = "/tencent/MicroMsg/";
      eSn = eSl + eSm;
      eSo = eSn + "crash/";
      return;
    }
    catch (Error localError)
    {
      break label96;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.j.b
 * JD-Core Version:    0.6.2
 */