package com.tencent.matrix.resource.e;

import android.content.Context;
import android.os.Environment;
import com.tencent.matrix.d.c;
import java.io.File;
import java.io.FilenameFilter;

public final class d
{
  protected final int bYk;
  protected final Context mContext;

  public d(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private d(Context paramContext, byte paramByte)
  {
    this.mContext = paramContext;
    this.bYk = 5;
  }

  final File zt()
  {
    File localFile1;
    if ("mounted".equals(Environment.getExternalStorageState()))
    {
      localFile1 = this.mContext.getExternalCacheDir();
      localFile1 = new File(localFile1, "matrix_resource");
      c.i("Matrix.DumpStorageManager", "path to store hprof and result: %s", new Object[] { localFile1.getAbsolutePath() });
      if ((localFile1.exists()) || ((localFile1.mkdirs()) && (localFile1.canWrite())))
        break label102;
      c.w("Matrix.DumpStorageManager", "failed to allocate new hprof file since path: %s is not writable.", new Object[] { localFile1.getAbsolutePath() });
      localFile1 = null;
    }
    while (true)
    {
      return localFile1;
      localFile1 = this.mContext.getCacheDir();
      break;
      label102: File[] arrayOfFile = localFile1.listFiles(new FilenameFilter()
      {
        public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
        {
          return paramAnonymousString.endsWith(".hprof");
        }
      });
      if ((arrayOfFile != null) && (arrayOfFile.length > this.bYk))
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
        {
          File localFile2 = arrayOfFile[j];
          if ((localFile2.exists()) && (!localFile2.delete()))
            c.w("Matrix.DumpStorageManager", "faile to delete hprof file: " + localFile2.getAbsolutePath(), new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.e.d
 * JD-Core Version:    0.6.2
 */