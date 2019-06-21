package com.tencent.mm.modelsfs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public final class FileOp
{
  private static ReentrantReadWriteLock fNT;
  private static TreeMap<String, SFSContextRec> fNU;
  private static String fNV;
  private static final EnumSet<g.a> fNW;

  static
  {
    AppMethodBeat.i(93199);
    fNT = new ReentrantReadWriteLock();
    fNU = new TreeMap();
    fNV = "";
    fNW = EnumSet.of(g.a.fOf, g.a.fOg);
    AppMethodBeat.o(93199);
  }

  private static boolean a(String paramString, SFSContextRec paramSFSContextRec)
  {
    boolean bool = false;
    AppMethodBeat.i(93181);
    if (paramSFSContextRec.fNZ == null)
      AppMethodBeat.o(93181);
    while (true)
    {
      return bool;
      paramString = paramString.substring(paramSFSContextRec.fNY.length());
      int i = paramString.lastIndexOf('/');
      if (i == -1)
      {
        AppMethodBeat.o(93181);
      }
      else
      {
        paramString = paramString.substring(i + 1);
        if (paramString.length() == 0)
        {
          AppMethodBeat.o(93181);
        }
        else
        {
          paramSFSContextRec = paramSFSContextRec.fNZ;
          int j = paramSFSContextRec.length;
          for (i = 0; ; i++)
          {
            if (i >= j)
              break label124;
            if (g.a(paramSFSContextRec[i], 0, paramString, 0, fNW))
            {
              bool = true;
              AppMethodBeat.o(93181);
              break;
            }
          }
          label124: AppMethodBeat.o(93181);
        }
      }
    }
  }

  @Deprecated
  private static OutputStream aP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93186);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      paramString1 = new FileNotFoundException("path == null");
      AppMethodBeat.o(93186);
      throw paramString1;
    }
    Object localObject = tb(paramString1);
    if (localObject == null);
    while (true)
    {
      try
      {
        if (!TextUtils.isEmpty(paramString2))
        {
          paramString2 = new c(paramString1, paramString2);
          fNT.readLock().unlock();
          if (localObject != null)
            break label160;
          localObject = "regular";
          ab.d("MicroMsg.FileOp", "openWrite: %s [%s, %s]", new Object[] { paramString1, "ok", localObject });
          AppMethodBeat.o(93186);
          return paramString2;
        }
        paramString2 = new FileOutputStream(paramString1);
        continue;
      }
      finally
      {
        fNT.readLock().unlock();
        AppMethodBeat.o(93186);
      }
      String str = paramString1.substring(((SFSContextRec)localObject).fNY.length());
      paramString2 = ((SFSContextRec)localObject).fOc.aR(str, paramString2);
      continue;
      label160: localObject = "SFS";
    }
  }

  @Deprecated
  public static boolean aQ(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(93197);
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      AppMethodBeat.o(93197);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = paramString1;
      String str1 = paramString2;
      if (ta(paramString1))
      {
        localObject = paramString1;
        str1 = paramString2;
        if (ta(paramString2))
        {
          String str2 = paramString1;
          if (f.th(paramString1))
            str2 = f.ti(paramString1);
          paramString1 = paramString2;
          if (f.th(paramString2))
            paramString1 = f.ti(paramString2);
          localObject = str2;
          str1 = paramString1;
          if (new File(str2).renameTo(new File(paramString1)))
            AppMethodBeat.o(93197);
        }
      }
      else if (y((String)localObject, str1) < 0L)
      {
        AppMethodBeat.o(93197);
        bool = false;
      }
      else
      {
        deleteFile((String)localObject);
        AppMethodBeat.o(93197);
      }
    }
  }

  public static Map<String, SFSContext.Statistics> aiP()
  {
    AppMethodBeat.i(93180);
    fNT.readLock().lock();
    TreeMap localTreeMap = new TreeMap();
    Iterator localIterator = fNU.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (SFSContextRec)localIterator.next();
      if ((localObject2 != null) && (!((SFSContextRec)localObject2).fOb))
      {
        if (((SFSContextRec)localObject2).fOc == null);
        try
        {
          SFSContext localSFSContext = ((SFSContextRec)localObject2).fOc;
          if (localSFSContext == null);
          try
          {
            ((SFSContextRec)localObject2).fOc = ((SFSContextRec)localObject2).fOd.create();
            localSFSContext = ((SFSContextRec)localObject2).fOc;
            if (localSFSContext.mNativePtr != 0L)
              break label172;
            localObject2 = new IllegalArgumentException("Reuse already released SFSContext.");
            AppMethodBeat.o(93180);
            throw ((Throwable)localObject2);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.FileOp", "Failed to create SFSContext for prefix '%s': %s", new Object[] { ((SFSContextRec)localObject2).fNY, localException.getMessage() });
            ((SFSContextRec)localObject2).fOb = true;
          }
          continue;
        }
        finally
        {
          AppMethodBeat.o(93180);
        }
        label172: SFSContext.Statistics localStatistics = SFSContext.nativeStatistics(localException.mNativePtr);
        localTreeMap.put(((SFSContextRec)localObject2).fOd.mName, localStatistics);
      }
    }
    fNT.readLock().unlock();
    AppMethodBeat.o(93180);
    return localTreeMap;
  }

  // ERROR //
  @Deprecated
  private static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 264
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +14 -> 23
    //   12: bipush 254
    //   14: istore_2
    //   15: ldc_w 264
    //   18: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_2
    //   22: ireturn
    //   23: aload_1
    //   24: arraylength
    //   25: iload_2
    //   26: iconst_0
    //   27: iadd
    //   28: if_icmpge +15 -> 43
    //   31: bipush 253
    //   33: istore_2
    //   34: ldc_w 264
    //   37: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: goto -19 -> 21
    //   43: aconst_null
    //   44: astore 4
    //   46: aconst_null
    //   47: astore 5
    //   49: aload_0
    //   50: invokestatic 268	com/tencent/mm/modelsfs/FileOp:pH	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   53: astore 6
    //   55: aload 6
    //   57: astore 5
    //   59: aload 6
    //   61: astore 4
    //   63: aload 6
    //   65: aload_1
    //   66: iconst_0
    //   67: iload_2
    //   68: invokevirtual 274	java/io/OutputStream:write	([BII)V
    //   71: aload 6
    //   73: ifnull +8 -> 81
    //   76: aload 6
    //   78: invokevirtual 277	java/io/OutputStream:close	()V
    //   81: ldc_w 264
    //   84: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: iload_3
    //   88: istore_2
    //   89: goto -68 -> 21
    //   92: astore_1
    //   93: aload 5
    //   95: astore 4
    //   97: ldc 131
    //   99: ldc_w 279
    //   102: iconst_2
    //   103: anewarray 4	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: aload_0
    //   109: aastore
    //   110: dup
    //   111: iconst_1
    //   112: aload_1
    //   113: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload 5
    //   122: ifnull +8 -> 130
    //   125: aload 5
    //   127: invokevirtual 277	java/io/OutputStream:close	()V
    //   130: iconst_m1
    //   131: istore_2
    //   132: ldc_w 264
    //   135: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: goto -117 -> 21
    //   141: astore_0
    //   142: aload 4
    //   144: ifnull +8 -> 152
    //   147: aload 4
    //   149: invokevirtual 277	java/io/OutputStream:close	()V
    //   152: ldc_w 264
    //   155: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload_0
    //   159: athrow
    //   160: astore_0
    //   161: goto -80 -> 81
    //   164: astore_0
    //   165: goto -35 -> 130
    //   168: astore_1
    //   169: goto -17 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   49	55	92	java/io/IOException
    //   63	71	92	java/io/IOException
    //   49	55	141	finally
    //   63	71	141	finally
    //   97	120	141	finally
    //   76	81	160	java/io/IOException
    //   125	130	164	java/io/IOException
    //   147	152	168	java/io/IOException
  }

  @Deprecated
  public static boolean ct(String paramString)
  {
    AppMethodBeat.i(93195);
    boolean bool1;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(93195);
      bool1 = false;
      return bool1;
    }
    Object localObject = tb(paramString);
    if (localObject != null)
    {
      boolean bool2 = ((SFSContextRec)localObject).fOc.exists(paramString.substring(((SFSContextRec)localObject).fNY.length()));
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (((SFSContextRec)localObject).fOa)
          bool1 = new File(paramString).exists();
      }
      label82: fNT.readLock().unlock();
      if (localObject != null)
        break label149;
    }
    label149: for (localObject = "regular"; ; localObject = "SFS")
    {
      ab.d("MicroMsg.FileOp", "fileExists: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), localObject });
      AppMethodBeat.o(93195);
      break;
      bool1 = new File(paramString).exists();
      break label82;
    }
  }

  // ERROR //
  @Deprecated
  public static String cy(String paramString)
  {
    // Byte code:
    //   0: ldc_w 300
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 302	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 303	java/lang/StringBuilder:<init>	()V
    //   13: astore_1
    //   14: new 305	java/io/InputStreamReader
    //   17: astore_2
    //   18: aload_2
    //   19: aload_0
    //   20: invokestatic 309	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   23: invokespecial 312	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   26: aload_2
    //   27: astore_3
    //   28: sipush 512
    //   31: newarray char
    //   33: astore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload_2
    //   38: aload 4
    //   40: invokevirtual 316	java/io/InputStreamReader:read	([C)I
    //   43: istore 5
    //   45: iload 5
    //   47: iconst_m1
    //   48: if_icmpeq +73 -> 121
    //   51: aload_2
    //   52: astore_3
    //   53: aload_1
    //   54: aload 4
    //   56: iconst_0
    //   57: iload 5
    //   59: invokevirtual 320	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: goto -28 -> 35
    //   66: astore_1
    //   67: aload_2
    //   68: astore_3
    //   69: ldc 131
    //   71: ldc_w 322
    //   74: iconst_2
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_0
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload_1
    //   85: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   88: aastore
    //   89: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_2
    //   93: astore_3
    //   94: ldc_w 300
    //   97: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_2
    //   101: astore_3
    //   102: aload_1
    //   103: athrow
    //   104: astore_0
    //   105: aload_3
    //   106: ifnull +7 -> 113
    //   109: aload_3
    //   110: invokevirtual 323	java/io/InputStreamReader:close	()V
    //   113: ldc_w 300
    //   116: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_0
    //   120: athrow
    //   121: aload_2
    //   122: invokevirtual 323	java/io/InputStreamReader:close	()V
    //   125: aload_1
    //   126: invokevirtual 326	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore_0
    //   130: ldc_w 300
    //   133: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_0
    //   137: areturn
    //   138: astore_0
    //   139: goto -14 -> 125
    //   142: astore_3
    //   143: goto -30 -> 113
    //   146: astore_0
    //   147: aconst_null
    //   148: astore_3
    //   149: goto -44 -> 105
    //   152: astore_1
    //   153: aconst_null
    //   154: astore_2
    //   155: goto -88 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   28	35	66	java/io/IOException
    //   37	45	66	java/io/IOException
    //   53	63	66	java/io/IOException
    //   28	35	104	finally
    //   37	45	104	finally
    //   53	63	104	finally
    //   69	92	104	finally
    //   94	100	104	finally
    //   102	104	104	finally
    //   121	125	138	java/io/IOException
    //   109	113	142	java/io/IOException
    //   14	26	146	finally
    //   14	26	152	java/io/IOException
  }

  @Deprecated
  public static boolean deleteFile(String paramString)
  {
    AppMethodBeat.i(93196);
    boolean bool1;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(93196);
      bool1 = false;
      return bool1;
    }
    SFSContextRec localSFSContextRec = tb(paramString);
    if (localSFSContextRec != null)
    {
      str = paramString.substring(localSFSContextRec.fNY.length());
      boolean bool2 = localSFSContextRec.fOc.pI(str);
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (localSFSContextRec.fOa)
          if (!f.th(paramString))
            break label190;
      }
    }
    label185: label190: for (String str = f.ti(paramString); ; str = paramString)
    {
      bool1 = new File(str).delete();
      fNT.readLock().unlock();
      if (localSFSContextRec == null)
      {
        str = "regular";
        label116: ab.d("MicroMsg.FileOp", "deleteFile: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), str });
        AppMethodBeat.o(93196);
        break;
        if (!f.th(paramString))
          break label185;
      }
      for (str = f.ti(paramString); ; str = paramString)
      {
        bool1 = new File(str).delete();
        break;
        str = "SFS";
        break label116;
      }
    }
  }

  @Deprecated
  public static InputStream openRead(String paramString)
  {
    AppMethodBeat.i(93184);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = new FileNotFoundException("path == null");
      AppMethodBeat.o(93184);
      throw paramString;
    }
    Object localObject1 = tb(paramString);
    if (localObject1 == null);
    while (true)
    {
      Object localObject2;
      try
      {
        if (f.th(paramString))
        {
          long l = f.tj(paramString);
          localObject2 = new b(f.ti(paramString), l);
          fNT.readLock().unlock();
          if (localObject1 != null)
            break label209;
          localObject1 = "regular";
          ab.d("MicroMsg.FileOp", "openRead: %s [%s, %s]", new Object[] { paramString, "ok", localObject1 });
          AppMethodBeat.o(93184);
          return localObject2;
        }
        localObject2 = new FileInputStream(paramString);
        continue;
      }
      finally
      {
        fNT.readLock().unlock();
        AppMethodBeat.o(93184);
      }
      try
      {
        localObject2 = paramString.substring(((SFSContextRec)localObject1).fNY.length());
        localObject2 = ((SFSContextRec)localObject1).fOc.openRead((String)localObject2);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        if (!((SFSContextRec)localObject1).fOa)
        {
          AppMethodBeat.o(93184);
          throw localFileNotFoundException;
        }
        FileInputStream localFileInputStream = new FileInputStream(paramString);
      }
      continue;
      label209: localObject1 = "SFS";
    }
  }

  @Deprecated
  public static OutputStream pH(String paramString)
  {
    AppMethodBeat.i(93185);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = new FileNotFoundException("path == null");
      AppMethodBeat.o(93185);
      throw paramString;
    }
    String str1 = "";
    String str2 = paramString;
    if (f.th(paramString))
    {
      str1 = f.tk(paramString);
      str2 = f.ti(paramString);
    }
    paramString = aP(str2, str1);
    AppMethodBeat.o(93185);
    return paramString;
  }

  @Deprecated
  public static int q(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93191);
    int i = b(paramString, paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.o(93191);
    return i;
  }

  private static boolean ta(String paramString)
  {
    AppMethodBeat.i(93182);
    fNT.readLock().lock();
    Object localObject = fNU.floorEntry(paramString);
    if ((localObject != null) && (paramString.startsWith((String)((Map.Entry)localObject).getKey())))
    {
      localObject = (SFSContextRec)((Map.Entry)localObject).getValue();
      if ((((SFSContextRec)localObject).fOb) || (a(paramString, (SFSContextRec)localObject)));
    }
    for (boolean bool = false; ; bool = true)
    {
      fNT.readLock().unlock();
      AppMethodBeat.o(93182);
      return bool;
    }
  }

  private static SFSContextRec tb(String paramString)
  {
    AppMethodBeat.i(93183);
    fNT.readLock().lock();
    Object localObject = fNU.floorEntry(paramString);
    if (localObject == null)
    {
      AppMethodBeat.o(93183);
      localObject = null;
      return localObject;
    }
    if (paramString.startsWith((String)((Map.Entry)localObject).getKey()))
    {
      SFSContextRec localSFSContextRec = (SFSContextRec)((Map.Entry)localObject).getValue();
      localObject = localSFSContextRec;
      if (!a(paramString, localSFSContextRec));
    }
    for (localObject = null; ; localObject = null)
    {
      while (true)
        if ((localObject != null) && (!((SFSContextRec)localObject).fOb))
        {
          if (((SFSContextRec)localObject).fOc == null);
          try
          {
            while (true)
            {
              paramString = ((SFSContextRec)localObject).fOc;
              if (paramString == null);
              try
              {
                ((SFSContextRec)localObject).fOc = ((SFSContextRec)localObject).fOd.create();
              }
              catch (Exception paramString)
              {
                ab.e("MicroMsg.FileOp", "Failed to create SFSContext for prefix '%s': %s", new Object[] { ((SFSContextRec)localObject).fNY, paramString.getMessage() });
                ((SFSContextRec)localObject).fOb = true;
                AppMethodBeat.o(93183);
                localObject = null;
              }
            }
            break;
          }
          finally
          {
            AppMethodBeat.o(93183);
          }
        }
      AppMethodBeat.o(93183);
      localObject = null;
      break;
    }
  }

  // ERROR //
  @Deprecated
  public static boolean tc(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc_w 383
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +10 -> 19
    //   12: aload_0
    //   13: invokevirtual 79	java/lang/String:length	()I
    //   16: ifne +13 -> 29
    //   19: ldc_w 383
    //   22: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: ireturn
    //   29: aload_0
    //   30: invokestatic 107	com/tencent/mm/modelsfs/FileOp:tb	(Ljava/lang/String;)Lcom/tencent/mm/modelsfs/FileOp$SFSContextRec;
    //   33: astore_2
    //   34: aload_2
    //   35: ifnonnull +21 -> 56
    //   38: getstatic 33	com/tencent/mm/modelsfs/FileOp:fNT	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   41: invokevirtual 122	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   44: invokevirtual 127	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   47: ldc_w 383
    //   50: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -26 -> 27
    //   56: aload_0
    //   57: aload_2
    //   58: getfield 73	com/tencent/mm/modelsfs/FileOp$SFSContextRec:fNY	Ljava/lang/String;
    //   61: invokevirtual 79	java/lang/String:length	()I
    //   64: invokevirtual 83	java/lang/String:substring	(I)Ljava/lang/String;
    //   67: astore_3
    //   68: aload_2
    //   69: getfield 148	com/tencent/mm/modelsfs/FileOp$SFSContextRec:fOc	Lcom/tencent/mm/modelsfs/SFSContext;
    //   72: aload_3
    //   73: invokevirtual 351	com/tencent/mm/modelsfs/SFSContext:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   76: astore_3
    //   77: new 174	java/io/File
    //   80: astore_2
    //   81: aload_2
    //   82: aload_0
    //   83: invokespecial 175	java/io/File:<init>	(Ljava/lang/String;)V
    //   86: aload_2
    //   87: invokevirtual 386	java/io/File:getParent	()Ljava/lang/String;
    //   90: astore_2
    //   91: aload_2
    //   92: invokestatic 391	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   95: ifne +20 -> 115
    //   98: new 174	java/io/File
    //   101: astore 4
    //   103: aload 4
    //   105: aload_2
    //   106: invokespecial 175	java/io/File:<init>	(Ljava/lang/String;)V
    //   109: aload 4
    //   111: invokevirtual 394	java/io/File:mkdirs	()Z
    //   114: pop
    //   115: new 143	java/io/FileOutputStream
    //   118: astore_2
    //   119: aload_2
    //   120: aload_0
    //   121: invokespecial 144	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   124: aload_2
    //   125: astore 5
    //   127: aload_3
    //   128: astore 4
    //   130: sipush 1024
    //   133: newarray byte
    //   135: astore 6
    //   137: aload_2
    //   138: astore 5
    //   140: aload_3
    //   141: astore 4
    //   143: aload_3
    //   144: aload 6
    //   146: invokevirtual 399	java/io/InputStream:read	([B)I
    //   149: istore 7
    //   151: iload 7
    //   153: iconst_m1
    //   154: if_icmpeq +89 -> 243
    //   157: aload_2
    //   158: astore 5
    //   160: aload_3
    //   161: astore 4
    //   163: aload_2
    //   164: aload 6
    //   166: iconst_0
    //   167: iload 7
    //   169: invokevirtual 274	java/io/OutputStream:write	([BII)V
    //   172: goto -35 -> 137
    //   175: astore 6
    //   177: aload_2
    //   178: astore 5
    //   180: aload_3
    //   181: astore 4
    //   183: ldc 131
    //   185: ldc_w 401
    //   188: iconst_2
    //   189: anewarray 4	java/lang/Object
    //   192: dup
    //   193: iconst_0
    //   194: aload_0
    //   195: aastore
    //   196: dup
    //   197: iconst_1
    //   198: aload 6
    //   200: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   203: aastore
    //   204: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: aload_3
    //   208: ifnull +7 -> 215
    //   211: aload_3
    //   212: invokevirtual 402	java/io/InputStream:close	()V
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 277	java/io/OutputStream:close	()V
    //   223: getstatic 33	com/tencent/mm/modelsfs/FileOp:fNT	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   226: invokevirtual 122	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   229: invokevirtual 127	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   232: ldc_w 383
    //   235: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: iconst_0
    //   239: istore_1
    //   240: goto -213 -> 27
    //   243: aload_3
    //   244: invokevirtual 402	java/io/InputStream:close	()V
    //   247: aload_2
    //   248: invokevirtual 277	java/io/OutputStream:close	()V
    //   251: getstatic 33	com/tencent/mm/modelsfs/FileOp:fNT	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   254: invokevirtual 122	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   257: invokevirtual 127	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   260: ldc_w 383
    //   263: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: goto -239 -> 27
    //   269: astore_0
    //   270: aconst_null
    //   271: astore 5
    //   273: aconst_null
    //   274: astore_3
    //   275: aload_3
    //   276: ifnull +7 -> 283
    //   279: aload_3
    //   280: invokevirtual 402	java/io/InputStream:close	()V
    //   283: aload 5
    //   285: ifnull +8 -> 293
    //   288: aload 5
    //   290: invokevirtual 277	java/io/OutputStream:close	()V
    //   293: getstatic 33	com/tencent/mm/modelsfs/FileOp:fNT	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   296: invokevirtual 122	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   299: invokevirtual 127	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   302: ldc_w 383
    //   305: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   308: aload_0
    //   309: athrow
    //   310: astore_0
    //   311: goto -64 -> 247
    //   314: astore_0
    //   315: goto -64 -> 251
    //   318: astore_0
    //   319: goto -104 -> 215
    //   322: astore_0
    //   323: goto -100 -> 223
    //   326: astore_3
    //   327: goto -44 -> 283
    //   330: astore_3
    //   331: goto -38 -> 293
    //   334: astore_0
    //   335: aconst_null
    //   336: astore 5
    //   338: goto -63 -> 275
    //   341: astore_0
    //   342: aload 4
    //   344: astore_3
    //   345: goto -70 -> 275
    //   348: astore 6
    //   350: aconst_null
    //   351: astore_2
    //   352: aconst_null
    //   353: astore_3
    //   354: goto -177 -> 177
    //   357: astore 6
    //   359: aconst_null
    //   360: astore_2
    //   361: goto -184 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   130	137	175	java/io/IOException
    //   143	151	175	java/io/IOException
    //   163	172	175	java/io/IOException
    //   56	77	269	finally
    //   243	247	310	java/io/IOException
    //   247	251	314	java/io/IOException
    //   211	215	318	java/io/IOException
    //   219	223	322	java/io/IOException
    //   279	283	326	java/io/IOException
    //   288	293	330	java/io/IOException
    //   77	115	334	finally
    //   115	124	334	finally
    //   130	137	341	finally
    //   143	151	341	finally
    //   163	172	341	finally
    //   183	207	341	finally
    //   56	77	348	java/io/IOException
    //   77	115	357	java/io/IOException
    //   115	124	357	java/io/IOException
  }

  @Deprecated
  public static long td(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(93188);
    if (paramString == null)
    {
      AppMethodBeat.o(93188);
      return l;
    }
    SFSContextRec localSFSContextRec = tb(paramString);
    if (localSFSContextRec != null)
    {
      localObject = paramString.substring(localSFSContextRec.fNY.length());
      localObject = localSFSContextRec.fOc.tm((String)localObject);
      if (localObject == null)
        if (localSFSContextRec.fOa)
          if (!f.th(paramString))
            break label196;
    }
    label183: label196: for (Object localObject = f.ti(paramString); ; localObject = paramString)
    {
      for (l = new File((String)localObject).length(); ; l = ((SFSContext.FileEntry)localObject).size)
      {
        fNT.readLock().unlock();
        if (localSFSContextRec != null)
          break label183;
        localObject = "regular";
        label108: ab.d("MicroMsg.FileOp", "readFileLength: %s [%d, %s]", new Object[] { paramString, Long.valueOf(l), localObject });
        AppMethodBeat.o(93188);
        break;
      }
      if (f.th(paramString));
      for (localObject = f.ti(paramString); ; localObject = paramString)
      {
        l = new File((String)localObject).length();
        break;
        localObject = "SFS";
        break label108;
      }
    }
  }

  // ERROR //
  @Deprecated
  public static byte[] te(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 426
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +13 -> 22
    //   12: ldc_w 426
    //   15: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_1
    //   19: astore_0
    //   20: aload_0
    //   21: areturn
    //   22: new 428	java/io/ByteArrayOutputStream
    //   25: dup
    //   26: sipush 2048
    //   29: invokespecial 430	java/io/ByteArrayOutputStream:<init>	(I)V
    //   32: astore_2
    //   33: aload_0
    //   34: invokestatic 309	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   37: astore_3
    //   38: aload_3
    //   39: astore 4
    //   41: sipush 1024
    //   44: newarray byte
    //   46: astore 5
    //   48: ldc_w 431
    //   51: istore 6
    //   53: aload_3
    //   54: astore 4
    //   56: aload_3
    //   57: aload 5
    //   59: iconst_0
    //   60: iload 6
    //   62: sipush 1024
    //   65: invokestatic 437	java/lang/Math:min	(II)I
    //   68: invokevirtual 440	java/io/InputStream:read	([BII)I
    //   71: istore 7
    //   73: iload 7
    //   75: iconst_m1
    //   76: if_icmpeq +30 -> 106
    //   79: iload 6
    //   81: ifle +25 -> 106
    //   84: aload_3
    //   85: astore 4
    //   87: aload_2
    //   88: aload 5
    //   90: iconst_0
    //   91: iload 7
    //   93: invokevirtual 441	java/io/ByteArrayOutputStream:write	([BII)V
    //   96: iload 6
    //   98: iload 7
    //   100: isub
    //   101: istore 6
    //   103: goto -50 -> 53
    //   106: aload_3
    //   107: ifnull +7 -> 114
    //   110: aload_3
    //   111: invokevirtual 402	java/io/InputStream:close	()V
    //   114: aload_2
    //   115: invokevirtual 445	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   118: astore 4
    //   120: aload_2
    //   121: invokevirtual 446	java/io/ByteArrayOutputStream:close	()V
    //   124: ldc 131
    //   126: ldc_w 448
    //   129: iconst_2
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_0
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload 4
    //   141: arraylength
    //   142: invokestatic 453	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   145: aastore
    //   146: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: ldc_w 426
    //   152: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload 4
    //   157: astore_0
    //   158: goto -138 -> 20
    //   161: astore_2
    //   162: aconst_null
    //   163: astore_3
    //   164: aload_3
    //   165: astore 4
    //   167: new 302	java/lang/StringBuilder
    //   170: astore 5
    //   172: aload_3
    //   173: astore 4
    //   175: aload 5
    //   177: ldc_w 455
    //   180: invokespecial 456	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   183: aload_3
    //   184: astore 4
    //   186: ldc 131
    //   188: aload 5
    //   190: aload_0
    //   191: invokevirtual 459	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc_w 461
    //   197: invokevirtual 459	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_2
    //   201: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   204: invokevirtual 459	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 326	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokestatic 464	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: aload_3
    //   214: ifnull +7 -> 221
    //   217: aload_3
    //   218: invokevirtual 402	java/io/InputStream:close	()V
    //   221: ldc_w 426
    //   224: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_1
    //   228: astore_0
    //   229: goto -209 -> 20
    //   232: astore_0
    //   233: aconst_null
    //   234: astore 4
    //   236: aload 4
    //   238: ifnull +8 -> 246
    //   241: aload 4
    //   243: invokevirtual 402	java/io/InputStream:close	()V
    //   246: ldc_w 426
    //   249: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload_0
    //   253: athrow
    //   254: astore 4
    //   256: goto -142 -> 114
    //   259: astore_0
    //   260: goto -39 -> 221
    //   263: astore 4
    //   265: goto -19 -> 246
    //   268: astore_3
    //   269: goto -145 -> 124
    //   272: astore_0
    //   273: goto -37 -> 236
    //   276: astore_2
    //   277: goto -113 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   33	38	161	java/io/IOException
    //   33	38	232	finally
    //   110	114	254	java/io/IOException
    //   217	221	259	java/io/IOException
    //   241	246	263	java/io/IOException
    //   120	124	268	java/io/IOException
    //   41	48	272	finally
    //   56	73	272	finally
    //   87	96	272	finally
    //   167	172	272	finally
    //   175	183	272	finally
    //   186	213	272	finally
    //   41	48	276	java/io/IOException
    //   56	73	276	java/io/IOException
    //   87	96	276	java/io/IOException
  }

  @Deprecated
  public static boolean tf(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(93193);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(93193);
      bool = false;
      return bool;
    }
    paramString = f.ti(paramString);
    fNT.readLock().lock();
    Object localObject = fNU.floorEntry(paramString);
    if ((localObject != null) && (paramString.startsWith((String)((Map.Entry)localObject).getKey())))
    {
      localObject = (SFSContextRec)((Map.Entry)localObject).getValue();
      if ((((SFSContextRec)localObject).fOb) || (((SFSContextRec)localObject).fNZ != null) || (((SFSContextRec)localObject).fOa));
    }
    for (int i = 0; ; i = 1)
    {
      fNT.readLock().unlock();
      if (i == 0)
      {
        AppMethodBeat.o(93193);
        break;
      }
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isDirectory()))
      {
        AppMethodBeat.o(93193);
        break;
      }
      bool = paramString.mkdirs();
      AppMethodBeat.o(93193);
      break;
    }
  }

  @Deprecated
  public static boolean tg(String paramString)
  {
    AppMethodBeat.i(93198);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(93198);
      bool = false;
      return bool;
    }
    Object localObject1 = tb(paramString);
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = paramString;
      try
      {
        if (paramString.equals(((SFSContextRec)localObject1).fNY))
        {
          localObject2 = paramString;
          localObject1 = ((SFSContextRec)localObject1).fOc;
          localObject2 = paramString;
          if (((SFSContext)localObject1).mNativePtr == 0L)
          {
            localObject2 = paramString;
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = paramString;
            ((IllegalArgumentException)localObject1).<init>("Reuse already released SFSContext.");
            localObject2 = paramString;
            AppMethodBeat.o(93198);
            localObject2 = paramString;
            throw ((Throwable)localObject1);
          }
        }
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.FileOp", paramString, "deleteDirIncludedFiles failed: ".concat(String.valueOf(localObject2)), new Object[0]);
        bool = false;
      }
      while (true)
      {
        fNT.readLock().unlock();
        AppMethodBeat.o(93198);
        break;
        localObject2 = paramString;
        if (SFSContext.nativeClear(((SFSContext)localObject1).mNativePtr) != 0)
        {
          localObject2 = paramString;
          localObject1 = new java/io/IOException;
          localObject2 = paramString;
          ((IOException)localObject1).<init>(SFSContext.nativeErrorMessage());
          localObject2 = paramString;
          AppMethodBeat.o(93198);
          localObject2 = paramString;
          throw ((Throwable)localObject1);
          localObject2 = paramString;
          paramString = paramString.substring(((SFSContextRec)localObject1).fNY.length());
          localObject2 = paramString;
          localObject3 = ((SFSContextRec)localObject1).fOc.tl(paramString).iterator();
          while (true)
          {
            localObject2 = paramString;
            if (!((Iterator)localObject3).hasNext())
              break;
            localObject2 = paramString;
            SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)((Iterator)localObject3).next();
            localObject2 = paramString;
            ((SFSContextRec)localObject1).fOc.pI(localFileEntry.name);
          }
        }
        bool = true;
      }
    }
    Object localObject2 = new File(paramString);
    paramString = new ArrayDeque();
    paramString.add(new FileOp.a((File)localObject2));
    label398: label404: 
    while (true)
    {
      localObject1 = (FileOp.a)paramString.getLast();
      if (((FileOp.a)localObject1).fNX == null)
        ((FileOp.a)localObject1).fNX = ((FileOp.a)localObject1).dir.listFiles();
      if (((FileOp.a)localObject1).fNX != null)
      {
        localObject3 = ((FileOp.a)localObject1).fNX;
        int i = ((FileOp.a)localObject1).pos;
        if (i >= localObject3.length)
          break label398;
        localObject2 = localObject3[i];
        if (((File)localObject2).isFile())
          ((File)localObject2).delete();
        while (!((File)localObject2).isDirectory())
        {
          i++;
          break;
        }
        ((FileOp.a)localObject1).pos = i;
        paramString.add(new FileOp.a((File)localObject2));
      }
      while (true)
      {
        if (!paramString.isEmpty())
          break label404;
        bool = true;
        break;
        paramString.removeLast();
      }
    }
  }

  // ERROR //
  @Deprecated
  public static long y(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 544
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +21 -> 28
    //   10: aload_0
    //   11: invokevirtual 79	java/lang/String:length	()I
    //   14: ifeq +14 -> 28
    //   17: aload_1
    //   18: ifnull +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 79	java/lang/String:length	()I
    //   25: ifne +15 -> 40
    //   28: ldc2_w 545
    //   31: lstore_2
    //   32: ldc_w 544
    //   35: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: lload_2
    //   39: lreturn
    //   40: lconst_0
    //   41: lstore_2
    //   42: aload_0
    //   43: invokestatic 309	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   46: astore 4
    //   48: aload_1
    //   49: invokestatic 268	com/tencent/mm/modelsfs/FileOp:pH	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   52: astore 5
    //   54: sipush 1024
    //   57: newarray byte
    //   59: astore 6
    //   61: aload 4
    //   63: aload 6
    //   65: invokevirtual 399	java/io/InputStream:read	([B)I
    //   68: istore 7
    //   70: iload 7
    //   72: iconst_m1
    //   73: if_icmpeq +22 -> 95
    //   76: aload 5
    //   78: aload 6
    //   80: iconst_0
    //   81: iload 7
    //   83: invokevirtual 274	java/io/OutputStream:write	([BII)V
    //   86: lload_2
    //   87: iload 7
    //   89: i2l
    //   90: ladd
    //   91: lstore_2
    //   92: goto -31 -> 61
    //   95: ldc 131
    //   97: ldc_w 548
    //   100: iconst_2
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload_0
    //   107: aastore
    //   108: dup
    //   109: iconst_1
    //   110: aload_1
    //   111: aastore
    //   112: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload 4
    //   117: ifnull +8 -> 125
    //   120: aload 4
    //   122: invokevirtual 402	java/io/InputStream:close	()V
    //   125: aload 5
    //   127: ifnull +8 -> 135
    //   130: aload 5
    //   132: invokevirtual 277	java/io/OutputStream:close	()V
    //   135: ldc_w 544
    //   138: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: goto -103 -> 38
    //   144: astore 6
    //   146: aconst_null
    //   147: astore 5
    //   149: aconst_null
    //   150: astore 4
    //   152: ldc 131
    //   154: ldc_w 550
    //   157: iconst_3
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload_0
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload_1
    //   168: aastore
    //   169: dup
    //   170: iconst_2
    //   171: aload 6
    //   173: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   176: aastore
    //   177: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   180: aload 4
    //   182: ifnull +8 -> 190
    //   185: aload 4
    //   187: invokevirtual 402	java/io/InputStream:close	()V
    //   190: aload 5
    //   192: ifnull +8 -> 200
    //   195: aload 5
    //   197: invokevirtual 277	java/io/OutputStream:close	()V
    //   200: ldc2_w 545
    //   203: lstore_2
    //   204: ldc_w 544
    //   207: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: goto -172 -> 38
    //   213: astore_0
    //   214: aconst_null
    //   215: astore 5
    //   217: aconst_null
    //   218: astore 4
    //   220: aload 4
    //   222: ifnull +8 -> 230
    //   225: aload 4
    //   227: invokevirtual 402	java/io/InputStream:close	()V
    //   230: aload 5
    //   232: ifnull +8 -> 240
    //   235: aload 5
    //   237: invokevirtual 277	java/io/OutputStream:close	()V
    //   240: ldc_w 544
    //   243: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: aload_0
    //   247: athrow
    //   248: astore_0
    //   249: goto -124 -> 125
    //   252: astore_0
    //   253: goto -118 -> 135
    //   256: astore_0
    //   257: goto -67 -> 190
    //   260: astore_0
    //   261: goto -61 -> 200
    //   264: astore_1
    //   265: goto -35 -> 230
    //   268: astore_1
    //   269: goto -29 -> 240
    //   272: astore_0
    //   273: aconst_null
    //   274: astore 5
    //   276: goto -56 -> 220
    //   279: astore_0
    //   280: goto -60 -> 220
    //   283: astore_0
    //   284: goto -64 -> 220
    //   287: astore 6
    //   289: aconst_null
    //   290: astore 5
    //   292: goto -140 -> 152
    //   295: astore 6
    //   297: goto -145 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	144	java/io/IOException
    //   42	48	213	finally
    //   120	125	248	java/io/IOException
    //   130	135	252	java/io/IOException
    //   185	190	256	java/io/IOException
    //   195	200	260	java/io/IOException
    //   225	230	264	java/io/IOException
    //   235	240	268	java/io/IOException
    //   48	54	272	finally
    //   54	61	279	finally
    //   61	70	279	finally
    //   76	86	279	finally
    //   95	115	279	finally
    //   152	180	283	finally
    //   48	54	287	java/io/IOException
    //   54	61	295	java/io/IOException
    //   61	70	295	java/io/IOException
    //   76	86	295	java/io/IOException
    //   95	115	295	java/io/IOException
  }

  static class SFSContextRec
    implements Parcelable
  {
    public static final Parcelable.Creator<SFSContextRec> CREATOR;
    String fNY;
    String[] fNZ;
    boolean fOa;
    boolean fOb;
    SFSContext fOc;
    SFSContext.Builder fOd;

    static
    {
      AppMethodBeat.i(93179);
      CREATOR = new FileOp.SFSContextRec.1();
      AppMethodBeat.o(93179);
    }

    public SFSContextRec()
    {
    }

    SFSContextRec(Parcel paramParcel)
    {
      AppMethodBeat.i(93178);
      this.fNY = paramParcel.readString();
      this.fNZ = paramParcel.createStringArray();
      if (paramParcel.readByte() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.fOa = bool;
        this.fOc = null;
        this.fOb = false;
        this.fOd = ((SFSContext.Builder)paramParcel.readParcelable(SFSContext.Builder.class.getClassLoader()));
        AppMethodBeat.o(93178);
        return;
      }
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(93177);
      paramParcel.writeString(this.fNY);
      paramParcel.writeStringArray(this.fNZ);
      if (this.fOa);
      for (int i = 1; ; i = 0)
      {
        paramParcel.writeByte((byte)i);
        paramParcel.writeParcelable(this.fOd, paramInt);
        AppMethodBeat.o(93177);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.FileOp
 * JD-Core Version:    0.6.2
 */