package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.k;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Map;

public final class ao
  implements Closeable
{
  public static final ByteOrder gUb = ByteOrder.BIG_ENDIAN;
  private volatile int cD;
  public final File gUc;
  private volatile FileChannel gUd;
  public volatile boolean gUe;
  private volatile int gUf;
  private volatile int gUg;
  private volatile int gUh;
  public volatile Map<String, ao.a> gUi;
  public volatile k gUj;

  public ao(File paramFile)
  {
    AppMethodBeat.i(105316);
    this.gUd = null;
    this.gUe = true;
    this.cD = -1;
    this.gUf = 0;
    this.gUg = 0;
    this.gUh = -1;
    this.gUi = null;
    this.gUc = paramFile;
    int i;
    if ((this.gUc == null) || (!this.gUc.exists()))
    {
      i = 0;
      if ((i == 0) || (!avX()))
        break label116;
    }
    while (true)
    {
      this.gUe = bool;
      AppMethodBeat.o(105316);
      return;
      if (this.gUc.length() <= 14L)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label116: bool = false;
    }
  }

  public ao(String paramString)
  {
    this(new File(paramString));
    AppMethodBeat.i(105317);
    AppMethodBeat.o(105317);
  }

  private static int C(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105324);
    if (paramArrayOfByte == null)
    {
      paramInt = 0;
      AppMethodBeat.o(105324);
    }
    while (true)
    {
      return paramInt;
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte, paramInt, 4);
      paramArrayOfByte.order(ByteOrder.BIG_ENDIAN);
      paramInt = paramArrayOfByte.getInt();
      AppMethodBeat.o(105324);
    }
  }

  // ERROR //
  private InputStream a(ao.a parama)
  {
    // Byte code:
    //   0: ldc 109
    //   2: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 111	java/io/RandomAccessFile
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: getfield 63	com/tencent/mm/plugin/appbrand/appcache/ao:gUc	Ljava/io/File;
    //   14: ldc 113
    //   16: invokespecial 116	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   19: aload_2
    //   20: astore_3
    //   21: aload_1
    //   22: getfield 119	com/tencent/mm/plugin/appbrand/appcache/ao$a:gUm	I
    //   25: newarray byte
    //   27: astore 4
    //   29: aload_2
    //   30: astore_3
    //   31: aload_2
    //   32: aload_1
    //   33: getfield 122	com/tencent/mm/plugin/appbrand/appcache/ao$a:gUl	I
    //   36: i2l
    //   37: invokevirtual 126	java/io/RandomAccessFile:seek	(J)V
    //   40: aload_2
    //   41: astore_3
    //   42: aload_2
    //   43: aload 4
    //   45: invokevirtual 130	java/io/RandomAccessFile:readFully	([B)V
    //   48: aload_2
    //   49: astore_3
    //   50: new 132	java/io/ByteArrayInputStream
    //   53: astore 5
    //   55: aload_2
    //   56: astore_3
    //   57: aload 5
    //   59: aload 4
    //   61: invokespecial 134	java/io/ByteArrayInputStream:<init>	([B)V
    //   64: aload_2
    //   65: invokestatic 140	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   68: ldc 109
    //   70: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload 5
    //   75: astore_1
    //   76: aload_1
    //   77: areturn
    //   78: astore 5
    //   80: aconst_null
    //   81: astore_2
    //   82: aload_2
    //   83: astore_3
    //   84: ldc 142
    //   86: ldc 144
    //   88: iconst_3
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: aload_0
    //   95: getfield 63	com/tencent/mm/plugin/appbrand/appcache/ao:gUc	Ljava/io/File;
    //   98: invokevirtual 148	java/io/File:getPath	()Ljava/lang/String;
    //   101: aastore
    //   102: dup
    //   103: iconst_1
    //   104: aload_1
    //   105: getfield 152	com/tencent/mm/plugin/appbrand/appcache/ao$a:fileName	Ljava/lang/String;
    //   108: aastore
    //   109: dup
    //   110: iconst_2
    //   111: aload 5
    //   113: aastore
    //   114: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload_2
    //   118: invokestatic 140	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   121: ldc 109
    //   123: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aconst_null
    //   127: astore_1
    //   128: goto -52 -> 76
    //   131: astore_1
    //   132: aconst_null
    //   133: astore_3
    //   134: aload_3
    //   135: invokestatic 140	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   138: ldc 109
    //   140: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_1
    //   144: athrow
    //   145: astore_1
    //   146: goto -12 -> 134
    //   149: astore 5
    //   151: goto -69 -> 82
    //
    // Exception table:
    //   from	to	target	type
    //   5	19	78	java/lang/Exception
    //   5	19	131	finally
    //   21	29	145	finally
    //   31	40	145	finally
    //   42	48	145	finally
    //   50	55	145	finally
    //   57	64	145	finally
    //   84	117	145	finally
    //   21	29	149	java/lang/Exception
    //   31	40	149	java/lang/Exception
    //   42	48	149	java/lang/Exception
    //   50	55	149	java/lang/Exception
    //   57	64	149	java/lang/Exception
  }

  private boolean avX()
  {
    boolean bool = false;
    AppMethodBeat.i(105323);
    if (this.gUd == null);
    while (true)
    {
      try
      {
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(this.gUc, "r");
        this.gUd = localRandomAccessFile.getChannel();
        if (this.gUd == null)
        {
          AppMethodBeat.o(105323);
          return bool;
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        ab.e("MicroMsg.AppBrandWxaPkg", "open(), exp = %s", new Object[] { bo.l(localFileNotFoundException) });
        continue;
      }
      try
      {
        this.gUd.position(0L);
        Object localObject = ByteBuffer.allocate(14);
        ((ByteBuffer)localObject).order(gUb);
        this.gUd.read((ByteBuffer)localObject);
        if (-66 == ((ByteBuffer)localObject).get(0))
        {
          int i = ((ByteBuffer)localObject).get(13);
          if (-19 == i);
        }
        else
        {
          AppMethodBeat.o(105323);
          continue;
        }
        localObject = ((ByteBuffer)localObject).array();
        this.cD = C((byte[])localObject, 1);
        this.gUf = C((byte[])localObject, 5);
        this.gUg = C((byte[])localObject, 9);
        AppMethodBeat.o(105323);
        bool = true;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.e("MicroMsg.AppBrandWxaPkg", "parseHeader, exp = %s", new Object[] { bo.l(localIOException) });
      }
    }
  }

  public final boolean avW()
  {
    boolean bool = true;
    AppMethodBeat.i(105322);
    if ((!this.gUe) || (this.gUd == null) || (this.gUf <= 4))
    {
      ab.e("MicroMsg.AppBrandWxaPkg", "readInfo, valid = %b, (null == mFileChannel) = %b, mBodyInfoLength = %d, skip", new Object[] { Boolean.valueOf(this.gUe), this.gUd, Integer.valueOf(this.gUg) });
      AppMethodBeat.o(105322);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((this.gUi != null) && (this.gUh >= 0) && (this.gUh == this.gUi.size()))
        AppMethodBeat.o(105322);
      else
        try
        {
          this.gUd.position(14L);
          Object localObject = ByteBuffer.allocate(this.gUf);
          ((ByteBuffer)localObject).order(gUb);
          this.gUd.read((ByteBuffer)localObject);
          byte[] arrayOfByte = ((ByteBuffer)localObject).array();
          this.gUh = C(arrayOfByte, 0);
          android.support.v4.f.a locala = new android/support/v4/f/a;
          locala.<init>();
          localObject = null;
          int i = 4;
          for (int j = 0; j < this.gUh; j++)
          {
            int k = C(arrayOfByte, i);
            i += 4;
            String str = new java/lang/String;
            str.<init>(arrayOfByte, i, k);
            i += k;
            k = C(arrayOfByte, i);
            i += 4;
            int m = C(arrayOfByte, i);
            i += 4;
            localObject = new com/tencent/mm/plugin/appbrand/appcache/ao$a;
            ((ao.a)localObject).<init>(this.gUc.getAbsolutePath(), str, k, m);
            locala.put(str, localObject);
          }
          this.gUi = locala;
          if ((localObject != null) && (((ao.a)localObject).gUl + ((ao.a)localObject).gUm > this.gUc.length()))
          {
            ab.e("MicroMsg.AppBrandWxaPkg", "readInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d)", new Object[] { Integer.valueOf(((ao.a)localObject).gUl), Integer.valueOf(((ao.a)localObject).gUm), Long.valueOf(this.gUc.length()) });
            AppMethodBeat.o(105322);
            bool = false;
          }
          else
          {
            AppMethodBeat.o(105322);
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.AppBrandWxaPkg", "readInfo, exp = %s", new Object[] { bo.l(localException) });
          AppMethodBeat.o(105322);
          bool = false;
        }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(105318);
    if (this.gUd != null);
    while (true)
    {
      try
      {
        this.gUd.close();
        this.gUd = null;
        AppMethodBeat.o(105318);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(105318);
    }
  }

  public final ao.a xx(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(105319);
    boolean bool;
    if ((this.gUi == null) || (bo.isNullOrNil(paramString)))
      if (this.gUi == null)
      {
        bool = true;
        if (this.gUi != null)
          break label81;
        label37: ab.e("MicroMsg.AppBrandWxaPkg", "openReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), paramString });
        paramString = null;
        AppMethodBeat.o(105319);
      }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label81: i = this.gUi.size();
      break label37;
      paramString = l.yk(paramString);
      paramString = (ao.a)this.gUi.get(paramString);
      AppMethodBeat.o(105319);
    }
  }

  public final InputStream xy(String paramString)
  {
    AppMethodBeat.i(105320);
    ao.a locala = xx(paramString);
    if (locala != null)
      if (Thread.currentThread().isInterrupted())
      {
        paramString = a(locala);
        AppMethodBeat.o(105320);
      }
    while (true)
    {
      return paramString;
      try
      {
        MappedByteBuffer localMappedByteBuffer = this.gUd.map(FileChannel.MapMode.READ_ONLY, locala.gUl, locala.gUm);
        localMappedByteBuffer.order(gUb);
        localMappedByteBuffer.limit(locala.gUm);
        com.tencent.luggage.g.a locala1 = new com/tencent/luggage/g/a;
        locala1.<init>(localMappedByteBuffer);
        AppMethodBeat.o(105320);
        paramString = locala1;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandWxaPkg", "openReadFile, fileName = %s, fileOffset = %d, fileLength = %d, exp = %s", new Object[] { paramString, Integer.valueOf(locala.gUl), Integer.valueOf(locala.gUm), bo.l(localException) });
        AppMethodBeat.o(105320);
        paramString = null;
      }
      continue;
      AppMethodBeat.o(105320);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ao
 * JD-Core Version:    0.6.2
 */