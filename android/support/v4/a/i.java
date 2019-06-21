package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class i
{
  public static File T(Context paramContext)
  {
    String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
    int i = 0;
    File localFile;
    if (i < 100)
      localFile = new File(paramContext.getCacheDir(), str + i);
    while (true)
    {
      try
      {
        boolean bool = localFile.createNewFile();
        if (bool)
        {
          paramContext = localFile;
          return paramContext;
        }
      }
      catch (IOException localIOException)
      {
        i++;
      }
      break;
      paramContext = null;
    }
  }

  public static ByteBuffer a(Context paramContext, Resources paramResources, int paramInt)
  {
    Object localObject = null;
    File localFile = T(paramContext);
    if (localFile == null)
      paramContext = localObject;
    while (true)
    {
      return paramContext;
      try
      {
        boolean bool = a(localFile, paramResources, paramInt);
        if (!bool)
        {
          localFile.delete();
          paramContext = localObject;
        }
        else
        {
          paramContext = j(localFile);
          localFile.delete();
        }
      }
      finally
      {
        localFile.delete();
      }
    }
    throw paramContext;
  }

  public static boolean a(File paramFile, Resources paramResources, int paramInt)
  {
    Resources localResources = null;
    try
    {
      paramResources = paramResources.openRawResource(paramInt);
      localResources = paramResources;
      boolean bool = a(paramFile, paramResources);
      return bool;
    }
    finally
    {
      closeQuietly(localResources);
    }
    throw paramFile;
  }

  // ERROR //
  public static boolean a(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new 86	java/io/FileOutputStream
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: iconst_0
    //   9: invokespecial 89	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   12: aload_3
    //   13: astore_0
    //   14: sipush 1024
    //   17: newarray byte
    //   19: astore 4
    //   21: aload_3
    //   22: astore_0
    //   23: aload_1
    //   24: aload 4
    //   26: invokevirtual 95	java/io/InputStream:read	([B)I
    //   29: istore 5
    //   31: iload 5
    //   33: iconst_m1
    //   34: if_icmpeq +56 -> 90
    //   37: aload_3
    //   38: astore_0
    //   39: aload_3
    //   40: aload 4
    //   42: iconst_0
    //   43: iload 5
    //   45: invokevirtual 99	java/io/FileOutputStream:write	([BII)V
    //   48: goto -27 -> 21
    //   51: astore_0
    //   52: aload_3
    //   53: astore_1
    //   54: aload_0
    //   55: astore_3
    //   56: aload_1
    //   57: astore_0
    //   58: new 10	java/lang/StringBuilder
    //   61: astore 4
    //   63: aload_1
    //   64: astore_0
    //   65: aload 4
    //   67: ldc 101
    //   69: invokespecial 16	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: astore_0
    //   74: aload 4
    //   76: aload_3
    //   77: invokevirtual 104	java/io/IOException:getMessage	()Ljava/lang/String;
    //   80: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_1
    //   85: invokestatic 84	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   88: iload_2
    //   89: ireturn
    //   90: aload_3
    //   91: invokestatic 84	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   94: iconst_1
    //   95: istore_2
    //   96: goto -8 -> 88
    //   99: astore_1
    //   100: aconst_null
    //   101: astore_0
    //   102: aload_0
    //   103: invokestatic 84	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   106: aload_1
    //   107: athrow
    //   108: astore_1
    //   109: goto -7 -> 102
    //   112: astore_3
    //   113: aconst_null
    //   114: astore_1
    //   115: goto -59 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	51	java/io/IOException
    //   23	31	51	java/io/IOException
    //   39	48	51	java/io/IOException
    //   2	12	99	finally
    //   14	21	108	finally
    //   23	31	108	finally
    //   39	48	108	finally
    //   58	63	108	finally
    //   65	72	108	finally
    //   74	84	108	finally
    //   2	12	112	java/io/IOException
  }

  // ERROR //
  public static ByteBuffer b(Context paramContext, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 112	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_1
    //   7: ldc 114
    //   9: aconst_null
    //   10: invokevirtual 120	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +15 -> 30
    //   18: aload_2
    //   19: ifnull +7 -> 26
    //   22: aload_2
    //   23: invokevirtual 125	android/os/ParcelFileDescriptor:close	()V
    //   26: aconst_null
    //   27: astore_0
    //   28: aload_0
    //   29: areturn
    //   30: new 127	java/io/FileInputStream
    //   33: astore_3
    //   34: aload_3
    //   35: aload_2
    //   36: invokevirtual 131	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   39: invokespecial 134	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   42: aload_3
    //   43: invokevirtual 138	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   46: astore_0
    //   47: aload_0
    //   48: invokevirtual 144	java/nio/channels/FileChannel:size	()J
    //   51: lstore 4
    //   53: aload_0
    //   54: getstatic 150	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   57: lconst_0
    //   58: lload 4
    //   60: invokevirtual 154	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 155	java/io/FileInputStream:close	()V
    //   68: aload_1
    //   69: astore_0
    //   70: aload_2
    //   71: ifnull -43 -> 28
    //   74: aload_2
    //   75: invokevirtual 125	android/os/ParcelFileDescriptor:close	()V
    //   78: aload_1
    //   79: astore_0
    //   80: goto -52 -> 28
    //   83: astore_0
    //   84: aconst_null
    //   85: astore_0
    //   86: goto -58 -> 28
    //   89: astore_1
    //   90: aload_1
    //   91: athrow
    //   92: astore_0
    //   93: aload_1
    //   94: ifnull +42 -> 136
    //   97: aload_3
    //   98: invokevirtual 155	java/io/FileInputStream:close	()V
    //   101: aload_0
    //   102: athrow
    //   103: astore_1
    //   104: aload_1
    //   105: athrow
    //   106: astore_0
    //   107: aload_2
    //   108: ifnull +11 -> 119
    //   111: aload_1
    //   112: ifnull +40 -> 152
    //   115: aload_2
    //   116: invokevirtual 125	android/os/ParcelFileDescriptor:close	()V
    //   119: aload_0
    //   120: athrow
    //   121: astore_3
    //   122: aload_1
    //   123: aload_3
    //   124: invokevirtual 159	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   127: goto -26 -> 101
    //   130: astore_0
    //   131: aconst_null
    //   132: astore_1
    //   133: goto -26 -> 107
    //   136: aload_3
    //   137: invokevirtual 155	java/io/FileInputStream:close	()V
    //   140: goto -39 -> 101
    //   143: astore_2
    //   144: aload_1
    //   145: aload_2
    //   146: invokevirtual 159	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   149: goto -30 -> 119
    //   152: aload_2
    //   153: invokevirtual 125	android/os/ParcelFileDescriptor:close	()V
    //   156: goto -37 -> 119
    //   159: astore_0
    //   160: aconst_null
    //   161: astore_1
    //   162: goto -69 -> 93
    //
    // Exception table:
    //   from	to	target	type
    //   5	14	83	java/io/IOException
    //   22	26	83	java/io/IOException
    //   74	78	83	java/io/IOException
    //   115	119	83	java/io/IOException
    //   119	121	83	java/io/IOException
    //   144	149	83	java/io/IOException
    //   152	156	83	java/io/IOException
    //   42	64	89	java/lang/Throwable
    //   90	92	92	finally
    //   30	42	103	java/lang/Throwable
    //   64	68	103	java/lang/Throwable
    //   101	103	103	java/lang/Throwable
    //   122	127	103	java/lang/Throwable
    //   136	140	103	java/lang/Throwable
    //   104	106	106	finally
    //   97	101	121	java/lang/Throwable
    //   30	42	130	finally
    //   64	68	130	finally
    //   97	101	130	finally
    //   101	103	130	finally
    //   122	127	130	finally
    //   136	140	130	finally
    //   115	119	143	java/lang/Throwable
    //   42	64	159	finally
  }

  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      label10: return;
    }
    catch (IOException paramCloseable)
    {
      break label10;
    }
  }

  // ERROR //
  private static ByteBuffer j(File paramFile)
  {
    // Byte code:
    //   0: new 127	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: aload_1
    //   10: invokevirtual 138	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_0
    //   14: aload_0
    //   15: invokevirtual 144	java/nio/channels/FileChannel:size	()J
    //   18: lstore_2
    //   19: aload_0
    //   20: getstatic 150	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   23: lconst_0
    //   24: lload_2
    //   25: invokevirtual 154	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 155	java/io/FileInputStream:close	()V
    //   33: aload_0
    //   34: areturn
    //   35: astore 4
    //   37: aload 4
    //   39: athrow
    //   40: astore_0
    //   41: aload 4
    //   43: ifnull +25 -> 68
    //   46: aload_1
    //   47: invokevirtual 155	java/io/FileInputStream:close	()V
    //   50: aload_0
    //   51: athrow
    //   52: astore_0
    //   53: aconst_null
    //   54: astore_0
    //   55: goto -22 -> 33
    //   58: astore_1
    //   59: aload 4
    //   61: aload_1
    //   62: invokevirtual 159	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   65: goto -15 -> 50
    //   68: aload_1
    //   69: invokevirtual 155	java/io/FileInputStream:close	()V
    //   72: goto -22 -> 50
    //   75: astore_0
    //   76: aconst_null
    //   77: astore 4
    //   79: goto -38 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   9	29	35	java/lang/Throwable
    //   37	40	40	finally
    //   0	9	52	java/io/IOException
    //   29	33	52	java/io/IOException
    //   46	50	52	java/io/IOException
    //   50	52	52	java/io/IOException
    //   59	65	52	java/io/IOException
    //   68	72	52	java/io/IOException
    //   46	50	58	java/lang/Throwable
    //   9	29	75	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.i
 * JD-Core Version:    0.6.2
 */