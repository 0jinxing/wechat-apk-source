package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class h
{
  public String fileName;
  private String mUrl;
  public RandomAccessFile randomAccessFile;

  public h(String paramString)
  {
    AppMethodBeat.i(137445);
    this.randomAccessFile = null;
    this.mUrl = paramString;
    this.fileName = b.Tv(this.mUrl);
    ab.i("MicroMsg.Music.PieceFileCache", "PieceFileCache mUrl:%s, fileName:%s,", new Object[] { this.mUrl, this.fileName });
    AppMethodBeat.o(137445);
  }

  public static void HS(String paramString)
  {
    AppMethodBeat.i(137453);
    Logger.i("MicroMsg.Music.PieceFileCache", "deleteFile, fileName:".concat(String.valueOf(paramString)));
    paramString = new File(paramString);
    if (paramString.exists())
    {
      Logger.i("MicroMsg.Music.PieceFileCache", "delete the piece File");
      paramString.delete();
      AppMethodBeat.o(137453);
    }
    while (true)
    {
      return;
      Logger.e("MicroMsg.Music.PieceFileCache", "file not exist, delete piece File fail");
      AppMethodBeat.o(137453);
    }
  }

  public static boolean Td(String paramString)
  {
    AppMethodBeat.i(137454);
    Logger.i("MicroMsg.Music.PieceFileCache", "existFileByUrl");
    boolean bool = Te(b.Tv(paramString));
    AppMethodBeat.o(137454);
    return bool;
  }

  private static boolean Te(String paramString)
  {
    AppMethodBeat.i(137455);
    Logger.i("MicroMsg.Music.PieceFileCache", "existFile, fileName:".concat(String.valueOf(paramString)));
    boolean bool = new File(paramString).exists();
    ab.i("MicroMsg.Music.PieceFileCache", "the piece File exist:%b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(137455);
    return bool;
  }

  public static long ek(String paramString)
  {
    AppMethodBeat.i(137452);
    paramString = new File(b.Tv(paramString));
    long l;
    if (paramString.exists())
    {
      l = paramString.length();
      AppMethodBeat.o(137452);
    }
    while (true)
    {
      return l;
      l = -1L;
      AppMethodBeat.o(137452);
    }
  }

  public final int b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = -1;
    while (true)
    {
      try
      {
        AppMethodBeat.i(137447);
        if (paramInt == 0)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "read error, length == 0");
          AppMethodBeat.o(137447);
          paramInt = i;
          return paramInt;
        }
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "read error, randomAccessFile is null");
          AppMethodBeat.o(137447);
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
        AppMethodBeat.o(137447);
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.Music.PieceFileCache", String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(getLength()), Integer.valueOf(paramArrayOfByte.length) }));
        AppMethodBeat.o(137447);
        paramInt = i;
      }
    }
  }

  public final long bTH()
  {
    try
    {
      AppMethodBeat.i(137451);
      File localFile = new java/io/File;
      localFile.<init>(this.fileName);
      long l;
      if (localFile.exists())
      {
        l = localFile.length();
        AppMethodBeat.o(137451);
      }
      while (true)
      {
        return l;
        l = -1L;
        AppMethodBeat.o(137451);
      }
    }
    finally
    {
    }
  }

  public final boolean c(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(137448);
        if (paramInt == 0)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "write error, length == 0");
          AppMethodBeat.o(137448);
          return bool;
        }
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "write error, randomAccessFile is null");
          AppMethodBeat.o(137448);
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
        AppMethodBeat.o(137448);
        bool = true;
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.Music.PieceFileCache", String.format("Error writing %d bytes to from buffer with size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) }));
        AppMethodBeat.o(137448);
      }
    }
  }

  public final void close()
  {
    try
    {
      AppMethodBeat.i(137446);
      Logger.i("MicroMsg.Music.PieceFileCache", "close");
      Object localObject1 = this.randomAccessFile;
      if (localObject1 != null);
      while (true)
      {
        try
        {
          this.randomAccessFile.close();
          AppMethodBeat.o(137446);
          return;
        }
        catch (IOException localIOException)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Logger.e("MicroMsg.Music.PieceFileCache", "close RandomAccessFile error ", new Object[] { localIOException.getMessage() });
        }
        AppMethodBeat.o(137446);
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
    //   4: ldc 187
    //   6: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: getfield 23	com/tencent/mm/plugin/music/cache/h:randomAccessFile	Ljava/io/RandomAccessFile;
    //   13: ifnonnull +19 -> 32
    //   16: ldc 35
    //   18: ldc 189
    //   20: invokestatic 82	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc 187
    //   25: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_1
    //   31: ireturn
    //   32: aload_0
    //   33: getfield 23	com/tencent/mm/plugin/music/cache/h:randomAccessFile	Ljava/io/RandomAccessFile;
    //   36: invokevirtual 190	java/io/RandomAccessFile:length	()J
    //   39: lstore_2
    //   40: lload_2
    //   41: l2i
    //   42: istore_1
    //   43: ldc 187
    //   45: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: goto -20 -> 28
    //   51: astore 4
    //   53: aload_0
    //   54: monitorexit
    //   55: aload 4
    //   57: athrow
    //   58: astore 4
    //   60: new 170	java/lang/StringBuilder
    //   63: astore 5
    //   65: aload 5
    //   67: invokespecial 171	java/lang/StringBuilder:<init>	()V
    //   70: ldc 35
    //   72: ldc 192
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload 5
    //   82: aload 4
    //   84: invokevirtual 177	java/io/IOException:getMessage	()Ljava/lang/String;
    //   87: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: aastore
    //   94: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: ldc 187
    //   99: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final void setLength(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(137450);
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "setLength error, randomAccessFile is null");
          AppMethodBeat.o(137450);
          return;
        }
        if (paramLong <= 0L)
        {
          Logger.e("MicroMsg.Music.PieceFileCache", "setLength error, length is ".concat(String.valueOf(paramLong)));
          AppMethodBeat.o(137450);
          continue;
        }
      }
      finally
      {
      }
      Logger.e("MicroMsg.Music.PieceFileCache", "set file length %s ", new Object[] { String.valueOf(paramLong) });
      try
      {
        this.randomAccessFile.setLength(paramLong);
        AppMethodBeat.o(137450);
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Logger.e("MicroMsg.Music.PieceFileCache", "Error set length of file, err %s", new Object[] { localIOException.getMessage() });
        AppMethodBeat.o(137450);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.h
 * JD-Core Version:    0.6.2
 */