package com.tencent.mm.loader.b.a;

import a.f.b.j;
import a.l;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import java.io.OutputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/disk/DiskFunction;", "", "()V", "TAG", "", "compress", "", "bm", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "", "stream", "Ljava/io/OutputStream;", "obtainOutputStream", "filePath", "ctx", "Lcom/tencent/mm/modelsfs/SFSContext;", "save", "data", "", "libimageloader_release"})
public final class c
{
  private static final String TAG = "MicroMsg.Loader.DiskFunction";
  public static final c ePl = new c();

  public static OutputStream a(String paramString, SFSContext paramSFSContext)
  {
    j.p(paramString, "filePath");
    int i;
    if (((CharSequence)paramString).length() == 0)
    {
      i = 1;
      if (i == 0)
        break label33;
      paramString = null;
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label33: if (paramSFSContext == null)
      {
        paramSFSContext = new b(paramString).dMC();
        if ((paramSFSContext != null) && (!paramSFSContext.exists()))
          paramSFSContext.mkdirs();
        paramString = e.pH(paramString);
      }
      else
      {
        paramString = paramSFSContext.pH(paramString);
      }
    }
  }

  // ERROR //
  public static boolean a(String paramString, OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ldc 48
    //   5: invokestatic 54	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   8: aload_1
    //   9: ldc 94
    //   11: invokestatic 54	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokestatic 133	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   18: ifeq +77 -> 95
    //   21: aload_0
    //   22: invokestatic 137	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   25: astore_0
    //   26: aload_0
    //   27: ifnull +68 -> 95
    //   30: aload_0
    //   31: checkcast 139	java/io/Closeable
    //   34: astore_3
    //   35: aload_3
    //   36: checkcast 141	java/io/InputStream
    //   39: astore_0
    //   40: sipush 4096
    //   43: newarray byte
    //   45: astore 4
    //   47: aload_0
    //   48: aload 4
    //   50: invokevirtual 145	java/io/InputStream:read	([B)I
    //   53: istore 5
    //   55: iload 5
    //   57: iconst_m1
    //   58: if_icmpeq +26 -> 84
    //   61: aload_1
    //   62: aload 4
    //   64: iconst_0
    //   65: iload 5
    //   67: invokevirtual 151	java/io/OutputStream:write	([BII)V
    //   70: goto -23 -> 47
    //   73: astore_1
    //   74: aload_1
    //   75: athrow
    //   76: astore_0
    //   77: aload_3
    //   78: aload_1
    //   79: invokestatic 156	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   82: aload_0
    //   83: athrow
    //   84: aload_3
    //   85: aconst_null
    //   86: invokestatic 156	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   89: iconst_1
    //   90: istore 6
    //   92: iload 6
    //   94: ireturn
    //   95: iconst_0
    //   96: istore 6
    //   98: goto -6 -> 92
    //   101: astore_0
    //   102: aload_2
    //   103: astore_1
    //   104: goto -27 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   35	47	73	java/lang/Throwable
    //   47	55	73	java/lang/Throwable
    //   61	70	73	java/lang/Throwable
    //   74	76	76	finally
    //   35	47	101	finally
    //   47	55	101	finally
    //   61	70	101	finally
  }

  public static boolean a(byte[] paramArrayOfByte, OutputStream paramOutputStream)
  {
    j.p(paramArrayOfByte, "data");
    j.p(paramOutputStream, "stream");
    paramOutputStream.write(paramArrayOfByte);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.a.c
 * JD-Core Version:    0.6.2
 */