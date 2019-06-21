package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;

public class d
{
  static d c = null;
  Context a;
  Map<String, FileChannel> b;

  protected d(Context paramContext)
  {
    AppMethodBeat.i(136338);
    this.a = null;
    this.b = null;
    this.a = paramContext;
    this.b = new HashMap(5);
    AppMethodBeat.o(136338);
  }

  public static d a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(136339);
      if (c == null)
      {
        d locald = new c/t/m/c/d;
        locald.<init>(paramContext);
        c = locald;
      }
      paramContext = c;
      AppMethodBeat.o(136339);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public boolean a(String paramString)
  {
    try
    {
      AppMethodBeat.i(136340);
      boolean bool;
      if ((paramString == null) || (paramString.trim().length() <= 0))
      {
        AppMethodBeat.o(136340);
        bool = false;
      }
      while (true)
      {
        return bool;
        File localFile = c(paramString);
        if (localFile == null)
        {
          AppMethodBeat.o(136340);
          bool = true;
        }
        else
        {
          try
          {
            FileChannel localFileChannel = (FileChannel)this.b.get(paramString);
            Object localObject;
            if (localFileChannel != null)
            {
              localObject = localFileChannel;
              if (localFileChannel.isOpen());
            }
            else
            {
              localObject = new java/io/FileOutputStream;
              ((FileOutputStream)localObject).<init>(localFile);
              localObject = ((FileOutputStream)localObject).getChannel();
              this.b.put(paramString, localObject);
            }
            paramString = ((FileChannel)localObject).lock();
            if (paramString != null)
            {
              bool = paramString.isValid();
              if (bool)
              {
                AppMethodBeat.o(136340);
                bool = true;
              }
            }
          }
          catch (Throwable paramString)
          {
            AppMethodBeat.o(136340);
            bool = false;
          }
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  public void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 95
    //   4: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: ifnull +13 -> 21
    //   11: aload_1
    //   12: invokevirtual 52	java/lang/String:trim	()Ljava/lang/String;
    //   15: invokevirtual 56	java/lang/String:length	()I
    //   18: ifgt +11 -> 29
    //   21: ldc 95
    //   23: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 31	c/t/m/c/d:b	Ljava/util/Map;
    //   33: aload_1
    //   34: invokeinterface 65 2 0
    //   39: checkcast 67	java/nio/channels/FileChannel
    //   42: astore_1
    //   43: aload_1
    //   44: ifnull +7 -> 51
    //   47: aload_1
    //   48: invokevirtual 98	java/nio/channels/FileChannel:close	()V
    //   51: ldc 95
    //   53: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: goto -30 -> 26
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    //   64: astore_1
    //   65: ldc 95
    //   67: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: goto -44 -> 26
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	59	finally
    //   11	21	59	finally
    //   21	26	59	finally
    //   29	43	59	finally
    //   47	51	59	finally
    //   51	56	59	finally
    //   65	70	59	finally
    //   29	43	64	java/lang/Throwable
    //   47	51	64	java/lang/Throwable
  }

  protected File c(String paramString)
  {
    try
    {
      AppMethodBeat.i(136342);
      try
      {
        File localFile1 = new java/io/File;
        File localFile2 = this.a.getFilesDir();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("TencentLocationCoverSDK_");
        localFile1.<init>(localFile2, paramString + ".lock");
        paramString = localFile1;
        if (!localFile1.exists())
        {
          localFile1.createNewFile();
          paramString = localFile1;
        }
        AppMethodBeat.o(136342);
        return paramString;
      }
      catch (IOException paramString)
      {
        while (true)
          paramString = null;
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     c.t.m.c.d
 * JD-Core Version:    0.6.2
 */