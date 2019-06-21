package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class ShareFileLockHelper
  implements Closeable
{
  private final FileLock AEH;
  private final FileOutputStream outputStream;

  private ShareFileLockHelper(File paramFile)
  {
    this.outputStream = new FileOutputStream(paramFile);
    Throwable localThrowable = null;
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    while (true)
    {
      localObject2 = localObject1;
      int j;
      if (i < 3)
      {
        j = i + 1;
        localObject2 = localObject1;
      }
      try
      {
        localObject1 = this.outputStream.getChannel().lock();
        if (localObject1 != null);
        for (i = 1; i != 0; i = 0)
        {
          localObject2 = localObject1;
          if (localObject2 != null)
            break label133;
          throw new IOException("Tinker Exception:FileLockHelper lock file failed: " + paramFile.getAbsolutePath(), localThrowable);
        }
        localObject2 = localObject1;
        Thread.sleep(10L);
        i = j;
      }
      catch (Exception localException)
      {
        localObject1 = localObject2;
        i = j;
      }
    }
    label133: this.AEH = localObject2;
  }

  public static ShareFileLockHelper ao(File paramFile)
  {
    return new ShareFileLockHelper(paramFile);
  }

  public void close()
  {
    try
    {
      if (this.AEH != null)
        this.AEH.release();
      return;
    }
    finally
    {
      if (this.outputStream != null)
        this.outputStream.close();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareFileLockHelper
 * JD-Core Version:    0.6.2
 */