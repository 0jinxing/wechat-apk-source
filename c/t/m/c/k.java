package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class k
{
  private static boolean a = false;
  private File b;
  private File c;
  private Context d;

  public k(Context paramContext)
  {
    AppMethodBeat.i(136374);
    if (paramContext == null)
      AppMethodBeat.o(136374);
    while (true)
    {
      return;
      this.d = paramContext.getApplicationContext();
      try
      {
        File localFile = new java/io/File;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localFile.<init>(paramContext.getExternalFilesDir("data").getAbsolutePath() + "/d_l");
        this.b = localFile;
        AppMethodBeat.o(136374);
      }
      catch (Throwable paramContext)
      {
        this.b = null;
        AppMethodBeat.o(136374);
      }
    }
  }

  private File a()
  {
    AppMethodBeat.i(136376);
    try
    {
      File localFile1 = this.b;
      if (!localFile1.exists())
        localFile1.mkdirs();
      String str = q.a(String.valueOf(System.currentTimeMillis()));
      File localFile2 = new java/io/File;
      localFile2.<init>(localFile1, "d_".concat(String.valueOf(str)));
      AppMethodBeat.o(136376);
      return localFile2;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(136376);
      }
    }
  }

  // ERROR //
  public void a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 110
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +10 -> 16
    //   9: aload_1
    //   10: arraylength
    //   11: istore_2
    //   12: iload_2
    //   13: ifne +9 -> 22
    //   16: ldc 110
    //   18: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: return
    //   22: aload_0
    //   23: getfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   26: ifnonnull +11 -> 37
    //   29: aload_0
    //   30: aload_0
    //   31: invokespecial 114	c/t/m/c/k:a	()Ljava/io/File;
    //   34: putfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   37: aload_0
    //   38: getfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnonnull +11 -> 54
    //   46: ldc 110
    //   48: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: goto -30 -> 21
    //   54: new 116	java/io/BufferedOutputStream
    //   57: astore 4
    //   59: new 118	java/io/FileOutputStream
    //   62: astore_3
    //   63: aload_3
    //   64: aload_0
    //   65: getfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   68: iconst_1
    //   69: invokespecial 121	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   72: aload 4
    //   74: aload_3
    //   75: invokespecial 124	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   78: aload 4
    //   80: astore_3
    //   81: aload 4
    //   83: aload_1
    //   84: invokevirtual 127	java/io/BufferedOutputStream:write	([B)V
    //   87: aload 4
    //   89: astore_3
    //   90: aload 4
    //   92: invokevirtual 130	java/io/BufferedOutputStream:flush	()V
    //   95: aload 4
    //   97: invokevirtual 133	java/io/BufferedOutputStream:close	()V
    //   100: aload_0
    //   101: aconst_null
    //   102: putfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   105: ldc 110
    //   107: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -89 -> 21
    //   113: astore_1
    //   114: aconst_null
    //   115: astore_1
    //   116: aload_1
    //   117: astore_3
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield 112	c/t/m/c/k:c	Ljava/io/File;
    //   123: aload_1
    //   124: ifnull +25 -> 149
    //   127: aload_1
    //   128: invokevirtual 133	java/io/BufferedOutputStream:close	()V
    //   131: ldc 110
    //   133: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -115 -> 21
    //   139: astore_1
    //   140: ldc 110
    //   142: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -124 -> 21
    //   148: astore_1
    //   149: ldc 110
    //   151: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -133 -> 21
    //   157: astore_1
    //   158: aconst_null
    //   159: astore_3
    //   160: aload_3
    //   161: ifnull +7 -> 168
    //   164: aload_3
    //   165: invokevirtual 133	java/io/BufferedOutputStream:close	()V
    //   168: ldc 110
    //   170: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: goto -76 -> 100
    //   179: astore_3
    //   180: goto -12 -> 168
    //   183: astore_1
    //   184: goto -24 -> 160
    //   187: astore_1
    //   188: aload 4
    //   190: astore_1
    //   191: goto -75 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   54	78	113	java/io/IOException
    //   9	12	139	java/lang/Throwable
    //   22	37	139	java/lang/Throwable
    //   37	42	139	java/lang/Throwable
    //   95	100	139	java/lang/Throwable
    //   100	105	139	java/lang/Throwable
    //   127	131	139	java/lang/Throwable
    //   131	136	139	java/lang/Throwable
    //   164	168	139	java/lang/Throwable
    //   168	175	139	java/lang/Throwable
    //   127	131	148	java/io/IOException
    //   54	78	157	finally
    //   95	100	175	java/io/IOException
    //   164	168	179	java/io/IOException
    //   81	87	183	finally
    //   90	95	183	finally
    //   118	123	183	finally
    //   81	87	187	java/io/IOException
    //   90	95	187	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     c.t.m.c.k
 * JD-Core Version:    0.6.2
 */