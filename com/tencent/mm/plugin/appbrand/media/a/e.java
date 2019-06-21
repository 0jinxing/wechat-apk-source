package com.tencent.mm.plugin.appbrand.media.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appcache.ao.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.RandomAccessFile;

public final class e
  implements com.tencent.mm.ag.e
{
  private static ae<String, Integer> ikK;
  private static ae<String, Integer> ikL;
  private static ae<String, Integer> ikM;
  private long currentPosition;
  private String filePath;
  private String gSP;
  private int gUl;
  private int ikN;
  public RandomAccessFile randomAccessFile;

  static
  {
    AppMethodBeat.i(137819);
    ikK = new ae(50);
    ikL = new ae(50);
    ikM = new ae(50);
    AppMethodBeat.o(137819);
  }

  public e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137812);
    this.ikN = -1;
    this.gUl = -1;
    this.filePath = paramString1;
    this.gSP = paramString2;
    this.randomAccessFile = cB(paramString1, paramString2);
    if ((ikK.aj(paramString1)) && (ikL.aj(paramString1)))
    {
      this.ikN = ((Integer)ikK.get(paramString1)).intValue();
      this.gUl = ((Integer)ikL.get(paramString1)).intValue();
      AppMethodBeat.o(137812);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString2))
      {
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "pkgpath is null, return");
        AppMethodBeat.o(137812);
      }
      else
      {
        ao localao = new ao(paramString2);
        if (!localao.gUe)
        {
          localao.close();
          ab.e("MicroMsg.WxaAudioDataSourceBelow19", "pkg invalid");
          AppMethodBeat.o(137812);
        }
        else if (!localao.avW())
        {
          localao.close();
          ab.e("MicroMsg.WxaAudioDataSourceBelow19", "pkg readInfo failed");
          AppMethodBeat.o(137812);
        }
        else
        {
          paramString2 = localao.xx(paramString1);
          if (paramString2 == null)
          {
            localao.close();
            ab.e("MicroMsg.WxaAudioDataSourceBelow19", "info is null, err");
            AppMethodBeat.o(137812);
          }
          else if ((paramString2.gUm <= 0) || (paramString2.gUl <= 0))
          {
            localao.close();
            ab.e("MicroMsg.WxaAudioDataSourceBelow19", "info.resLength or info.fileOffset, err");
            AppMethodBeat.o(137812);
          }
          else
          {
            this.ikN = paramString2.gUm;
            this.gUl = paramString2.gUl;
            ikK.put(paramString1, Integer.valueOf(this.ikN));
            ikL.put(paramString1, Integer.valueOf(this.gUl));
            localao.close();
            AppMethodBeat.o(137812);
          }
        }
      }
    }
  }

  // ERROR //
  private RandomAccessFile cB(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 139
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_2
    //   8: invokestatic 83	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +19 -> 30
    //   14: ldc 85
    //   16: ldc 87
    //   18: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc 139
    //   23: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_3
    //   27: astore_1
    //   28: aload_1
    //   29: areturn
    //   30: ldc 85
    //   32: ldc 141
    //   34: iconst_3
    //   35: anewarray 4	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: aload_1
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: aload_0
    //   45: getfield 51	com/tencent/mm/plugin/appbrand/media/a/e:ikN	I
    //   48: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: aastore
    //   52: dup
    //   53: iconst_2
    //   54: aload_0
    //   55: getfield 53	com/tencent/mm/plugin/appbrand/media/a/e:gUl	I
    //   58: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: aastore
    //   62: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: new 146	com/tencent/mm/vfs/b
    //   68: astore_1
    //   69: aload_1
    //   70: aload_2
    //   71: invokespecial 147	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokevirtual 150	com/tencent/mm/vfs/b:exists	()Z
    //   78: ifne +28 -> 106
    //   81: ldc 85
    //   83: ldc 152
    //   85: iconst_1
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: aload_2
    //   92: aastore
    //   93: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: ldc 139
    //   98: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: aload_3
    //   102: astore_1
    //   103: goto -75 -> 28
    //   106: aload_2
    //   107: iconst_0
    //   108: invokestatic 160	com/tencent/mm/vfs/e:ck	(Ljava/lang/String;Z)Ljava/io/RandomAccessFile;
    //   111: astore_2
    //   112: ldc 85
    //   114: ldc 162
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_2
    //   123: invokevirtual 168	java/io/RandomAccessFile:length	()J
    //   126: invokestatic 173	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   129: aastore
    //   130: invokestatic 176	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: ldc 139
    //   135: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload_2
    //   139: astore_1
    //   140: goto -112 -> 28
    //   143: astore_1
    //   144: ldc 85
    //   146: aload_1
    //   147: ldc 178
    //   149: iconst_0
    //   150: anewarray 4	java/lang/Object
    //   153: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: ldc 139
    //   158: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_3
    //   162: astore_1
    //   163: goto -135 -> 28
    //   166: astore_1
    //   167: aconst_null
    //   168: astore_2
    //   169: ldc 85
    //   171: aload_1
    //   172: ldc 178
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_2
    //   182: ifnull +7 -> 189
    //   185: aload_2
    //   186: invokevirtual 183	java/io/RandomAccessFile:close	()V
    //   189: ldc 139
    //   191: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_3
    //   195: astore_1
    //   196: goto -168 -> 28
    //   199: astore_1
    //   200: goto -11 -> 189
    //   203: astore_1
    //   204: goto -35 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   65	96	143	java/io/FileNotFoundException
    //   106	112	143	java/io/FileNotFoundException
    //   112	133	143	java/io/FileNotFoundException
    //   65	96	166	java/io/IOException
    //   106	112	166	java/io/IOException
    //   185	189	199	java/io/IOException
    //   112	133	203	java/io/IOException
  }

  public final int acc()
  {
    int i = 0;
    AppMethodBeat.i(137817);
    if (this.randomAccessFile == null)
      this.randomAccessFile = cB(this.filePath, this.gSP);
    if (ikM.aj(this.filePath))
    {
      i = ((Integer)ikM.get(this.filePath)).intValue();
      AppMethodBeat.o(137817);
    }
    while (true)
    {
      return i;
      if (this.randomAccessFile == null)
      {
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] inputStream is null");
        AppMethodBeat.o(137817);
      }
      else if (this.filePath.toLowerCase().endsWith(".mp3"))
      {
        ab.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] mp3");
        i = 2;
        AppMethodBeat.o(137817);
      }
      else if (this.filePath.toLowerCase().contains(".wav"))
      {
        ab.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] wav");
        i = 3;
        AppMethodBeat.o(137817);
      }
      else if (this.filePath.toLowerCase().contains(".ogg"))
      {
        ab.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] ogg");
        i = 4;
        AppMethodBeat.o(137817);
      }
      else
      {
        try
        {
          byte[] arrayOfByte = new byte[64];
          this.randomAccessFile.seek(this.gUl);
          this.randomAccessFile.read(arrayOfByte);
          String str = new java/lang/String;
          str.<init>(arrayOfByte);
          this.randomAccessFile.seek(this.gUl);
          if ((str != null) && (str.contains("ftyp")))
          {
            ab.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] aac");
            ikM.put(this.filePath, Integer.valueOf(1));
            AppMethodBeat.o(137817);
            i = 1;
            continue;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.WxaAudioDataSourceBelow19", "getAudioType", new Object[] { localException });
            this.randomAccessFile.seek(this.gUl);
            Object localObject1 = null;
          }
        }
        finally
        {
          this.randomAccessFile.seek(this.gUl);
          AppMethodBeat.o(137817);
        }
        AppMethodBeat.o(137817);
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(137818);
    if (this.randomAccessFile != null)
    {
      ab.i("MicroMsg.WxaAudioDataSourceBelow19", "close %d", new Object[] { Integer.valueOf(hashCode()) });
      this.randomAccessFile.close();
      this.randomAccessFile = null;
    }
    AppMethodBeat.o(137818);
  }

  public final long getSize()
  {
    AppMethodBeat.i(137816);
    long l;
    if (this.randomAccessFile == null)
    {
      ab.e("MicroMsg.WxaAudioDataSourceBelow19", "[getSize] randomAccessFile is null");
      l = 0L;
      AppMethodBeat.o(137816);
    }
    while (true)
    {
      return l;
      l = this.ikN;
      AppMethodBeat.o(137816);
    }
  }

  public final boolean isOpen()
  {
    if ((this.randomAccessFile != null) || (this.ikN == -1) || (this.gUl == -1));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void open()
  {
    AppMethodBeat.i(137813);
    ab.i("MicroMsg.WxaAudioDataSourceBelow19", "open %d", new Object[] { Integer.valueOf(hashCode()) });
    if (this.randomAccessFile == null)
      this.randomAccessFile = cB(this.filePath, this.gSP);
    this.currentPosition = 0L;
    if (this.randomAccessFile != null)
      this.randomAccessFile.seek(this.gUl);
    AppMethodBeat.o(137813);
  }

  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(137815);
    if (this.randomAccessFile == null)
    {
      ab.e("MicroMsg.WxaAudioDataSourceBelow19", "[readAt]randomAccessFile is null");
      AppMethodBeat.o(137815);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      if (this.currentPosition != paramLong)
      {
        this.randomAccessFile.seek(this.gUl + paramLong);
        this.currentPosition = paramLong;
      }
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "[readAt]bytes is null");
        AppMethodBeat.o(137815);
        paramInt1 = i;
      }
      else if ((paramLong < 0L) || (paramInt1 < 0) || (paramInt2 <= 0))
      {
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d, offset:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(137815);
        paramInt1 = i;
      }
      else if ((paramArrayOfByte != null) && (paramInt1 + paramInt2 > paramArrayOfByte.length))
      {
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "offset:%d, size:%d, bytes.length:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.length) });
        AppMethodBeat.o(137815);
        paramInt1 = i;
      }
      else
      {
        if (paramLong < this.ikN)
          break;
        ab.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d resLength:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.ikN) });
        AppMethodBeat.o(137815);
        paramInt1 = i;
      }
    }
    i = paramInt2;
    if (paramInt2 + paramLong >= this.ikN)
    {
      ab.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d, size:%d, resLength:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(this.ikN) });
      i = (int)(this.ikN - paramLong);
    }
    paramInt1 = this.randomAccessFile.read(paramArrayOfByte, paramInt1, i);
    if (paramInt1 >= 0)
      this.currentPosition += paramInt1;
    while (true)
    {
      AppMethodBeat.o(137815);
      break;
      ab.e("MicroMsg.WxaAudioDataSourceBelow19", "read:%d err", new Object[] { Integer.valueOf(paramInt1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.a.e
 * JD-Core Version:    0.6.2
 */