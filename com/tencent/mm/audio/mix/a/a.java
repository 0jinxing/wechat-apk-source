package com.tencent.mm.audio.mix.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class a
{
  private String appId;
  private String fileName;
  private String mUrl;
  private RandomAccessFile randomAccessFile;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136952);
    this.randomAccessFile = null;
    this.appId = paramString1;
    this.mUrl = paramString2;
    this.fileName = com.tencent.mm.audio.mix.h.a.F(paramString1, this.mUrl);
    b.i("MicroMsg.Mix.AudioPcmCacheFile", "AudioPcmCacheFile mUrl:%s, fileName:%s,", new Object[] { this.mUrl, this.fileName });
    AppMethodBeat.o(136952);
  }

  public final void CZ()
  {
    AppMethodBeat.i(136959);
    b.i("MicroMsg.Mix.AudioPcmCacheFile", "deleteFile");
    Object localObject = this.fileName;
    b.i("MicroMsg.Mix.AudioPcmCacheFile", "deleteFile, fileName:".concat(String.valueOf(localObject)));
    localObject = new File((String)localObject);
    if (((File)localObject).exists())
    {
      b.i("MicroMsg.Mix.AudioPcmCacheFile", "delete the piece File");
      ((File)localObject).delete();
      AppMethodBeat.o(136959);
    }
    while (true)
    {
      return;
      b.e("MicroMsg.Mix.AudioPcmCacheFile", "file not exist, delete piece File fail");
      AppMethodBeat.o(136959);
    }
  }

  public final int b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = -1;
    while (true)
    {
      try
      {
        AppMethodBeat.i(136955);
        if (paramInt == 0)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "read error, length == 0");
          AppMethodBeat.o(136955);
          paramInt = i;
          return paramInt;
        }
        if (this.randomAccessFile == null)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "read error, randomAccessFile is null");
          AppMethodBeat.o(136955);
          paramInt = i;
          continue;
        }
      }
      finally
      {
      }
      try
      {
        this.randomAccessFile.seek(paramLong);
        int j = this.randomAccessFile.read(paramArrayOfByte, 0, paramInt);
        paramInt = j;
        AppMethodBeat.o(136955);
      }
      catch (IOException localIOException)
      {
        b.e("MicroMsg.Mix.AudioPcmCacheFile", String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(getLength()), Integer.valueOf(paramArrayOfByte.length) }));
        AppMethodBeat.o(136955);
        paramInt = i;
      }
    }
  }

  public final boolean c(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(136956);
        if (paramInt == 0)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "write error, length == 0");
          AppMethodBeat.o(136956);
          return bool;
        }
        if (this.randomAccessFile == null)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "write error, randomAccessFile is null");
          AppMethodBeat.o(136956);
          continue;
        }
      }
      finally
      {
      }
      try
      {
        this.randomAccessFile.seek(paramLong);
        this.randomAccessFile.write(paramArrayOfByte, 0, paramInt);
        AppMethodBeat.o(136956);
        bool = true;
      }
      catch (IOException localIOException)
      {
        b.e("MicroMsg.Mix.AudioPcmCacheFile", String.format("Error writing %d bytes to from buffer with size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) }));
        AppMethodBeat.o(136956);
      }
    }
  }

  public final void close()
  {
    try
    {
      AppMethodBeat.i(136954);
      b.i("MicroMsg.Mix.AudioPcmCacheFile", "close");
      Object localObject1 = this.randomAccessFile;
      if (localObject1 != null);
      while (true)
      {
        try
        {
          this.randomAccessFile.close();
          AppMethodBeat.o(136954);
          return;
        }
        catch (IOException localIOException)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "close RandomAccessFile error ", new Object[] { localIOException.getMessage() });
        }
        AppMethodBeat.o(136954);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public final int getLength()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 162
    //   6: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: getfield 24	com/tencent/mm/audio/mix/a/a:randomAccessFile	Ljava/io/RandomAccessFile;
    //   13: ifnonnull +19 -> 32
    //   16: ldc 38
    //   18: ldc 164
    //   20: invokestatic 86	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc 162
    //   25: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_1
    //   31: ireturn
    //   32: aload_0
    //   33: getfield 24	com/tencent/mm/audio/mix/a/a:randomAccessFile	Ljava/io/RandomAccessFile;
    //   36: invokevirtual 168	java/io/RandomAccessFile:length	()J
    //   39: lstore_2
    //   40: lload_2
    //   41: l2i
    //   42: istore_1
    //   43: ldc 162
    //   45: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: goto -20 -> 28
    //   51: astore 4
    //   53: aload_0
    //   54: monitorexit
    //   55: aload 4
    //   57: athrow
    //   58: astore 4
    //   60: new 145	java/lang/StringBuilder
    //   63: astore 5
    //   65: aload 5
    //   67: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   70: ldc 38
    //   72: ldc 170
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload 5
    //   82: aload 4
    //   84: invokevirtual 152	java/io/IOException:getMessage	()Ljava/lang/String;
    //   87: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: aastore
    //   94: invokestatic 161	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: ldc 162
    //   99: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: goto -74 -> 28
    //
    // Exception table:
    //   from	to	target	type
    //   4	28	51	finally
    //   32	40	51	finally
    //   43	48	51	finally
    //   60	102	51	finally
    //   32	40	58	java/io/IOException
  }

  public final boolean open()
  {
    boolean bool = true;
    AppMethodBeat.i(136953);
    b.i("MicroMsg.Mix.AudioPcmCacheFile", "open");
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(this.fileName);
      if (!localFile.exists())
        b.i("MicroMsg.Mix.AudioPcmCacheFile", "create file:%b", new Object[] { Boolean.valueOf(localFile.createNewFile()) });
      while (true)
      {
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(localFile, "rws");
        this.randomAccessFile = localRandomAccessFile;
        return bool;
        localFile.delete();
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        b.e("MicroMsg.Mix.AudioPcmCacheFile", "file not found", new Object[] { localFileNotFoundException });
        b.e("MicroMsg.Mix.AudioPcmCacheFile", "create RandomAccessFile file  %s  success", new Object[] { this.fileName });
        AppMethodBeat.o(136953);
        bool = false;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        b.e("MicroMsg.Mix.AudioPcmCacheFile", "io ", new Object[] { localIOException });
        b.e("MicroMsg.Mix.AudioPcmCacheFile", "create RandomAccessFile file  %s  success", new Object[] { this.fileName });
        AppMethodBeat.o(136953);
        bool = false;
      }
    }
    finally
    {
      b.e("MicroMsg.Mix.AudioPcmCacheFile", "create RandomAccessFile file  %s  success", new Object[] { this.fileName });
      AppMethodBeat.o(136953);
    }
  }

  public final void setLength(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(136958);
        if (this.randomAccessFile == null)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "setLength error, randomAccessFile is null");
          AppMethodBeat.o(136958);
          return;
        }
        if (paramLong <= 0L)
        {
          b.e("MicroMsg.Mix.AudioPcmCacheFile", "setLength error, length is ".concat(String.valueOf(paramLong)));
          AppMethodBeat.o(136958);
          continue;
        }
      }
      finally
      {
      }
      b.e("MicroMsg.Mix.AudioPcmCacheFile", "set file length %s ", new Object[] { String.valueOf(paramLong) });
      try
      {
        this.randomAccessFile.setLength(paramLong);
        AppMethodBeat.o(136958);
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        b.e("MicroMsg.Mix.AudioPcmCacheFile", "Error set length of file, err %s", new Object[] { localIOException.getMessage() });
        AppMethodBeat.o(136958);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.a.a
 * JD-Core Version:    0.6.2
 */