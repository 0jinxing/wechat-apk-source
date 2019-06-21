package android.support.v4.a;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;

class e extends h
{
  private static File a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("/proc/self/fd/");
      localObject = Os.readlink(paramParcelFileDescriptor.getFd());
      if (OsConstants.S_ISREG(Os.stat((String)localObject).st_mode))
      {
        paramParcelFileDescriptor = new java/io/File;
        paramParcelFileDescriptor.<init>((String)localObject);
      }
      while (true)
      {
        return paramParcelFileDescriptor;
        paramParcelFileDescriptor = null;
      }
    }
    catch (ErrnoException paramParcelFileDescriptor)
    {
      while (true)
        paramParcelFileDescriptor = null;
    }
  }

  // ERROR //
  public android.graphics.Typeface a(android.content.Context paramContext, android.support.v4.d.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_2
    //   4: arraylength
    //   5: ifgt +8 -> 13
    //   8: aload 4
    //   10: astore_1
    //   11: aload_1
    //   12: areturn
    //   13: aload_0
    //   14: aload_2
    //   15: iload_3
    //   16: invokevirtual 67	android/support/v4/a/e:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   19: astore_2
    //   20: aload_1
    //   21: invokevirtual 73	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   24: astore 5
    //   26: aload 5
    //   28: aload_2
    //   29: getfield 79	android/support/v4/d/b$b:mUri	Landroid/net/Uri;
    //   32: ldc 81
    //   34: aconst_null
    //   35: invokevirtual 87	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   38: astore 5
    //   40: aload 5
    //   42: invokestatic 89	android/support/v4/a/e:a	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull +10 -> 57
    //   50: aload_2
    //   51: invokevirtual 93	java/io/File:canRead	()Z
    //   54: ifne +110 -> 164
    //   57: new 95	java/io/FileInputStream
    //   60: astore 6
    //   62: aload 6
    //   64: aload 5
    //   66: invokevirtual 99	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   69: invokespecial 102	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   72: aload_1
    //   73: aload 6
    //   75: invokestatic 105	android/support/v4/a/h:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   78: astore_1
    //   79: aload 6
    //   81: invokevirtual 108	java/io/FileInputStream:close	()V
    //   84: aload 5
    //   86: ifnull +8 -> 94
    //   89: aload 5
    //   91: invokevirtual 109	android/os/ParcelFileDescriptor:close	()V
    //   94: goto -83 -> 11
    //   97: astore_1
    //   98: aload_1
    //   99: athrow
    //   100: astore_2
    //   101: aload_1
    //   102: ifnull +54 -> 156
    //   105: aload 6
    //   107: invokevirtual 108	java/io/FileInputStream:close	()V
    //   110: aload_2
    //   111: athrow
    //   112: astore_1
    //   113: aload_1
    //   114: athrow
    //   115: astore_2
    //   116: aload 5
    //   118: ifnull +12 -> 130
    //   121: aload_1
    //   122: ifnull +71 -> 193
    //   125: aload 5
    //   127: invokevirtual 109	android/os/ParcelFileDescriptor:close	()V
    //   130: aload_2
    //   131: athrow
    //   132: astore_1
    //   133: aload 4
    //   135: astore_1
    //   136: goto -125 -> 11
    //   139: astore 6
    //   141: aload_1
    //   142: aload 6
    //   144: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   147: goto -37 -> 110
    //   150: astore_2
    //   151: aconst_null
    //   152: astore_1
    //   153: goto -37 -> 116
    //   156: aload 6
    //   158: invokevirtual 108	java/io/FileInputStream:close	()V
    //   161: goto -51 -> 110
    //   164: aload_2
    //   165: invokestatic 119	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   168: astore_1
    //   169: aload 5
    //   171: ifnull +8 -> 179
    //   174: aload 5
    //   176: invokevirtual 109	android/os/ParcelFileDescriptor:close	()V
    //   179: goto -168 -> 11
    //   182: astore 5
    //   184: aload_1
    //   185: aload 5
    //   187: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   190: goto -60 -> 130
    //   193: aload 5
    //   195: invokevirtual 109	android/os/ParcelFileDescriptor:close	()V
    //   198: goto -68 -> 130
    //   201: astore_2
    //   202: aconst_null
    //   203: astore_1
    //   204: goto -103 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   72	79	97	java/lang/Throwable
    //   98	100	100	finally
    //   40	46	112	java/lang/Throwable
    //   50	57	112	java/lang/Throwable
    //   57	72	112	java/lang/Throwable
    //   79	84	112	java/lang/Throwable
    //   110	112	112	java/lang/Throwable
    //   141	147	112	java/lang/Throwable
    //   156	161	112	java/lang/Throwable
    //   164	169	112	java/lang/Throwable
    //   113	115	115	finally
    //   26	40	132	java/io/IOException
    //   89	94	132	java/io/IOException
    //   125	130	132	java/io/IOException
    //   130	132	132	java/io/IOException
    //   174	179	132	java/io/IOException
    //   184	190	132	java/io/IOException
    //   193	198	132	java/io/IOException
    //   105	110	139	java/lang/Throwable
    //   40	46	150	finally
    //   50	57	150	finally
    //   57	72	150	finally
    //   79	84	150	finally
    //   105	110	150	finally
    //   110	112	150	finally
    //   141	147	150	finally
    //   156	161	150	finally
    //   164	169	150	finally
    //   125	130	182	java/lang/Throwable
    //   72	79	201	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.e
 * JD-Core Version:    0.6.2
 */