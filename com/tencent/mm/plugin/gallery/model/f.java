package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aun;
import com.tencent.mm.protocal.protobuf.auo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
{
  boolean dirty;
  private File mNW;
  List<RandomAccessFile> mNX;
  SparseArray<auo> mNY;
  int mNZ;

  f(File paramFile)
  {
    AppMethodBeat.i(21262);
    this.dirty = true;
    if (!paramFile.isDirectory())
    {
      boolean bool = paramFile.mkdirs();
      ab.d("MicroMsg.DiskCache", "dir[%s] not exist, try to create it, result[%B]", new Object[] { paramFile.getAbsolutePath(), Boolean.valueOf(bool) });
    }
    this.mNW = paramFile;
    this.mNY = new SparseArray();
    AppMethodBeat.o(21262);
  }

  static void d(Closeable paramCloseable)
  {
    AppMethodBeat.i(21266);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(21266);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.DiskCache", "want close %s fail: %s", new Object[] { paramCloseable.getClass().getName(), localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
      }
      AppMethodBeat.o(21266);
    }
  }

  private static String wo(int paramInt)
  {
    AppMethodBeat.i(21270);
    StringBuilder localStringBuilder = new StringBuilder("cache.data");
    if (paramInt == 0);
    for (String str = ""; ; str = ".".concat(String.valueOf(paramInt)))
    {
      str = str;
      AppMethodBeat.o(21270);
      return str;
    }
  }

  final void bCh()
  {
    AppMethodBeat.i(21263);
    File localFile = new File(this.mNW, "cache.idx");
    Object localObject1 = new aun();
    String str = localFile.getAbsolutePath();
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(str));
    try
    {
      ((aun)localObject1).parseFrom(bo.readFromFile(str));
      localObject2 = localObject1;
      this.mNY.clear();
      localObject2 = ((aun)localObject2).wyI.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (auo)((Iterator)localObject2).next();
        this.mNY.put(((auo)localObject1).key, localObject1);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.DiskCache", "load index file error");
        ab.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        wm(-1);
        aun localaun1 = new aun();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", new Object[] { Long.valueOf(localFile.length()) });
        ab.printErrStackTrace("MicroMsg.DiskCache", localOutOfMemoryError, "", new Object[0]);
        wm(-1);
        aun localaun2 = new aun();
      }
      AppMethodBeat.o(21263);
    }
  }

  final void bCi()
  {
    AppMethodBeat.i(21267);
    aun localaun = new aun();
    for (int i = 0; i < this.mNY.size(); i++)
    {
      localObject = (auo)this.mNY.valueAt(i);
      localaun.wyI.add(0, localObject);
      ab.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d] file_suffix[%d]}", new Object[] { Integer.valueOf(((auo)localObject).key), Long.valueOf(((auo)localObject).wyJ), Integer.valueOf(((auo)localObject).length), Integer.valueOf(((auo)localObject).wyK) });
    }
    Object localObject = new File(this.mNW, "cache.idx");
    try
    {
      bo.z(((File)localObject).getAbsolutePath(), localaun.toByteArray());
      AppMethodBeat.o(21267);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.DiskCache", "save index data error: %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        AppMethodBeat.o(21267);
      }
    }
  }

  final void bCj()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(21268);
        if ((this.mNX == null) || (this.mNX.size() <= 0))
        {
          AppMethodBeat.o(21268);
          return;
        }
        Iterator localIterator = this.mNX.iterator();
        if (localIterator.hasNext())
        {
          d((RandomAccessFile)localIterator.next());
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(21268);
    }
  }

  // ERROR //
  final int bCk()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 21271
    //   7: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   14: ifnull +15 -> 29
    //   17: aload_0
    //   18: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   21: invokeinterface 248 1 0
    //   26: ifgt +13 -> 39
    //   29: sipush 21271
    //   32: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_0
    //   36: monitorexit
    //   37: iload_1
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   43: invokeinterface 249 1 0
    //   48: astore_2
    //   49: iconst_m1
    //   50: istore_1
    //   51: aload_2
    //   52: invokeinterface 169 1 0
    //   57: ifeq +53 -> 110
    //   60: aload_2
    //   61: invokeinterface 173 1 0
    //   66: checkcast 251	java/io/RandomAccessFile
    //   69: astore_3
    //   70: iload_1
    //   71: iconst_1
    //   72: iadd
    //   73: istore 4
    //   75: aload_3
    //   76: invokevirtual 257	java/io/RandomAccessFile:length	()J
    //   79: lstore 5
    //   81: iload 4
    //   83: istore_1
    //   84: lload 5
    //   86: ldc2_w 258
    //   89: lcmp
    //   90: ifge -39 -> 51
    //   93: iload 4
    //   95: istore_1
    //   96: sipush 21271
    //   99: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: goto -67 -> 35
    //   105: astore_2
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: iconst_m1
    //   111: istore_1
    //   112: goto -16 -> 96
    //   115: astore_2
    //   116: ldc 40
    //   118: aload_2
    //   119: ldc 96
    //   121: iconst_0
    //   122: anewarray 4	java/lang/Object
    //   125: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: iconst_m1
    //   129: istore_1
    //   130: goto -34 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   4	29	105	finally
    //   29	35	105	finally
    //   39	49	105	finally
    //   51	70	105	finally
    //   75	81	105	finally
    //   96	102	105	finally
    //   116	128	105	finally
    //   39	49	115	java/io/IOException
    //   51	70	115	java/io/IOException
    //   75	81	115	java/io/IOException
  }

  public final void bCl()
  {
    AppMethodBeat.i(21272);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", this.mNZ).commit();
    AppMethodBeat.o(21272);
  }

  // ERROR //
  final void wl(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 21264
    //   7: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: iload_1
    //   11: iflt +10 -> 21
    //   14: aload_0
    //   15: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   18: ifnonnull +81 -> 99
    //   21: new 297	java/util/ArrayList
    //   24: astore_3
    //   25: aload_3
    //   26: invokespecial 298	java/util/ArrayList:<init>	()V
    //   29: aload_0
    //   30: aload_3
    //   31: putfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   34: iload_2
    //   35: istore_1
    //   36: iload_1
    //   37: bipush 25
    //   39: if_icmpge +51 -> 90
    //   42: new 251	java/io/RandomAccessFile
    //   45: astore_3
    //   46: new 31	java/io/File
    //   49: astore 4
    //   51: aload 4
    //   53: aload_0
    //   54: getfield 60	com/tencent/mm/plugin/gallery/model/f:mNW	Ljava/io/File;
    //   57: iload_1
    //   58: invokestatic 300	com/tencent/mm/plugin/gallery/model/f:wo	(I)Ljava/lang/String;
    //   61: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   64: aload_3
    //   65: aload 4
    //   67: ldc_w 302
    //   70: invokespecial 303	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   73: aload_0
    //   74: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   77: aload_3
    //   78: invokeinterface 306 2 0
    //   83: pop
    //   84: iinc 1 1
    //   87: goto -51 -> 36
    //   90: sipush 21264
    //   93: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: new 251	java/io/RandomAccessFile
    //   102: astore_3
    //   103: new 31	java/io/File
    //   106: astore 4
    //   108: aload 4
    //   110: aload_0
    //   111: getfield 60	com/tencent/mm/plugin/gallery/model/f:mNW	Ljava/io/File;
    //   114: iload_1
    //   115: invokestatic 300	com/tencent/mm/plugin/gallery/model/f:wo	(I)Ljava/lang/String;
    //   118: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   121: aload_3
    //   122: aload 4
    //   124: ldc_w 302
    //   127: invokespecial 303	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   130: aload_0
    //   131: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   134: iload_1
    //   135: invokeinterface 309 2 0
    //   140: pop
    //   141: aload_0
    //   142: getfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   145: iload_1
    //   146: aload_3
    //   147: invokeinterface 310 3 0
    //   152: sipush 21264
    //   155: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: goto -62 -> 96
    //   161: astore_3
    //   162: aload_0
    //   163: monitorexit
    //   164: aload_3
    //   165: athrow
    //   166: astore_3
    //   167: ldc 40
    //   169: ldc_w 312
    //   172: iconst_1
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_3
    //   179: invokevirtual 91	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   182: aastore
    //   183: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: ldc 40
    //   188: aload_3
    //   189: ldc 96
    //   191: iconst_0
    //   192: anewarray 4	java/lang/Object
    //   195: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 245	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
    //   203: sipush 21264
    //   206: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -113 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   4	10	161	finally
    //   14	21	161	finally
    //   21	34	161	finally
    //   42	84	161	finally
    //   90	96	161	finally
    //   99	152	161	finally
    //   152	158	161	finally
    //   167	209	161	finally
    //   14	21	166	java/lang/Exception
    //   21	34	166	java/lang/Exception
    //   42	84	166	java/lang/Exception
    //   90	96	166	java/lang/Exception
    //   99	152	166	java/lang/Exception
  }

  final void wm(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(21265);
    if ((this.mNX == null) || (this.mNX.size() <= 0))
      AppMethodBeat.o(21265);
    while (true)
    {
      return;
      if (paramInt < 0)
      {
        new File(this.mNW, "cache.idx").delete();
        this.mNY.clear();
      }
      while (true)
        if (paramInt < 0)
        {
          bCj();
          paramInt = i;
          while (true)
            if (paramInt < 25)
            {
              new File(this.mNW, wo(25)).delete();
              paramInt++;
              continue;
              SparseArray localSparseArray = new SparseArray();
              for (int j = 0; j < this.mNY.size(); j++)
              {
                auo localauo = (auo)this.mNY.valueAt(j);
                if (localauo.wyK != paramInt)
                  localSparseArray.put(this.mNY.keyAt(j), localauo);
                ab.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d]}", new Object[] { Integer.valueOf(localauo.key), Long.valueOf(localauo.wyJ), Integer.valueOf(localauo.length) });
              }
              this.mNY = localSparseArray;
              bCi();
              break;
            }
          AppMethodBeat.o(21265);
          break;
        }
      d((Closeable)this.mNX.get(paramInt));
      new File(this.mNW, wo(paramInt)).delete();
      AppMethodBeat.o(21265);
    }
  }

  public final Bitmap wn(int paramInt)
  {
    AppMethodBeat.i(21269);
    Object localObject1;
    if ((this.mNX == null) || (this.mNX.size() <= 0))
    {
      ab.e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
      AppMethodBeat.o(21269);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = (auo)this.mNY.get(paramInt);
      if (localObject1 != null)
      {
        byte[] arrayOfByte = new byte[((auo)localObject1).length];
        while (true)
        {
          try
          {
            ab.d("MicroMsg.DiskCache", "read data, beg pos %d, length %d", new Object[] { Long.valueOf(((auo)localObject1).wyJ), Integer.valueOf(((auo)localObject1).length) });
            RandomAccessFile localRandomAccessFile = (RandomAccessFile)this.mNX.get(((auo)localObject1).wyK);
            localRandomAccessFile.seek(((auo)localObject1).wyJ);
            localRandomAccessFile.read(arrayOfByte, 0, ((auo)localObject1).length);
            localObject1 = d.bQ(arrayOfByte);
            if (localObject1 == null)
              break label245;
            ab.d("MicroMsg.DiskCache", "get bitmap from disk cache ok, wh[%d, %d]", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
            AppMethodBeat.o(21269);
          }
          catch (Exception localException)
          {
            ab.w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
            ab.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
            this.mNY.remove(paramInt);
            AppMethodBeat.o(21269);
            localObject2 = null;
          }
          break;
          label245: this.mNY.remove(paramInt);
        }
      }
      AppMethodBeat.o(21269);
      Object localObject2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.f
 * JD-Core Version:    0.6.2
 */