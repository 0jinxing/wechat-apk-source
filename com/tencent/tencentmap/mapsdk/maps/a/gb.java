package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.mapstructure.BlockRouteCityData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class gb extends Thread
  implements gc
{
  private long a;
  private gm b;
  private hf c;
  private boolean d;
  private boolean e;
  private boolean f;
  private List<Integer> g;

  public gb(gm paramgm, hf paramhf)
  {
    this.b = paramgm;
    this.c = paramhf;
    this.a = 0L;
    this.f = false;
    this.d = false;
    this.e = false;
  }

  private long a(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | paramArrayOfByte[1] << 8 & 0xFF00 | paramArrayOfByte[2] << 16 & 0xFF0000 | paramArrayOfByte[3] << 24 & 0xFF000000;
  }

  private File a(String paramString)
  {
    AppMethodBeat.i(98982);
    Object localObject = g();
    if (localObject == null)
    {
      AppMethodBeat.o(98982);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      File[] arrayOfFile;
      try
      {
        arrayOfFile = ((File)localObject).listFiles();
        if ((arrayOfFile != null) && (arrayOfFile.length != 0))
          break label58;
        AppMethodBeat.o(98982);
        paramString = null;
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(98982);
        paramString = null;
      }
      continue;
      label58: for (int i = 0; ; i++)
      {
        if (i >= arrayOfFile.length)
          break label116;
        localObject = arrayOfFile[i].getName().split("_|\\.");
        if ((localObject.length > 1) && (paramString.equals(localObject[0])))
        {
          paramString = arrayOfFile[i];
          AppMethodBeat.o(98982);
          break;
        }
      }
      label116: AppMethodBeat.o(98982);
      paramString = null;
    }
  }

  private String a(String paramString, File paramFile)
  {
    AppMethodBeat.i(98981);
    if (paramFile == null)
    {
      paramString = "0";
      AppMethodBeat.o(98981);
    }
    while (true)
    {
      return paramString;
      paramFile = paramFile.getName().split("_|\\.");
      if ((paramFile.length > 1) && (paramString.equals(paramFile[0])))
      {
        paramString = paramFile[1];
        AppMethodBeat.o(98981);
      }
      else
      {
        paramString = "0";
        AppMethodBeat.o(98981);
      }
    }
  }

  private String a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98980);
    if ((this.b == null) || (this.b.A() == null))
    {
      paramString1 = null;
      AppMethodBeat.o(98980);
    }
    while (true)
    {
      return paramString1;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.b.A());
      localStringBuilder.append("&citycode=".concat(String.valueOf(paramString1)));
      localStringBuilder.append("&version=".concat(String.valueOf(paramString2)));
      paramString1 = localStringBuilder.toString();
      AppMethodBeat.o(98980);
    }
  }

  private void a(List<Integer> paramList)
  {
    AppMethodBeat.i(98978);
    if (this.c == null)
      AppMethodBeat.o(98978);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      boolean bool = b(paramList);
      if ((!bool) && (System.currentTimeMillis() - this.a < 300000L))
      {
        AppMethodBeat.o(98978);
        continue;
      }
      int i = 0;
      this.g = paramList;
      int j = paramList.size() - 1;
      label77: int k;
      String str1;
      Object localObject;
      String str2;
      int m;
      if (j >= 0)
      {
        k = ((Integer)paramList.get(j)).intValue();
        str1 = Integer.toString(k);
        localObject = a(str1);
        str2 = a(str1, (File)localObject);
        if ((localObject != null) && (System.currentTimeMillis() - ((File)localObject).lastModified() < 300000L))
          m = 0;
      }
      try
      {
        n = Integer.parseInt(str2);
        localArrayList.add(new BlockRouteCityData(k, n));
        j--;
        break label77;
        arrayOfByte = this.c.a(a(str1, str2));
        if ((arrayOfByte != null) && (arrayOfByte.length >= 10))
          if (arrayOfByte[4] == 0)
            n = 0;
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            byte[] arrayOfByte;
            m = Integer.parseInt(str2);
            n = m;
            localArrayList.add(new BlockRouteCityData(k, n));
            ((File)localObject).setLastModified(System.currentTimeMillis());
            continue;
            localObject = new byte[4];
            System.arraycopy(arrayOfByte, 0, localObject, 0, 4);
            n = (int)a((byte[])localObject);
            System.arraycopy(arrayOfByte, 5, localObject, 0, 4);
            m = (int)a((byte[])localObject);
            if (!a(n, m, arrayOfByte))
              break;
            b(str1, str2);
            localArrayList.add(new BlockRouteCityData(n, m));
            i = 1;
          }
          n = 0;
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              m = Integer.parseInt(str2);
              int n = m;
              label361: localArrayList.add(new BlockRouteCityData(k, n));
              continue;
              if ((bool) || (i != 0))
              {
                this.b.a(localArrayList);
                this.b.w();
              }
              this.a = System.currentTimeMillis();
              AppMethodBeat.o(98978);
              break;
              localException1 = localException1;
              n = m;
            }
            localException2 = localException2;
          }
          catch (Exception localException3)
          {
            break label361;
          }
        }
      }
    }
  }

  // ERROR //
  private boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 202
    //   5: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_3
    //   9: ifnull +10 -> 19
    //   12: aload_3
    //   13: arraylength
    //   14: bipush 10
    //   16: if_icmpge +11 -> 27
    //   19: ldc 202
    //   21: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: iload 4
    //   26: ireturn
    //   27: aload_0
    //   28: invokespecial 54	com/tencent/tencentmap/mapsdk/maps/a/gb:g	()Ljava/io/File;
    //   31: astore 5
    //   33: aload 5
    //   35: ifnonnull +11 -> 46
    //   38: ldc 202
    //   40: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: goto -19 -> 24
    //   46: new 59	java/io/File
    //   49: dup
    //   50: new 92	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   57: aload 5
    //   59: invokevirtual 205	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   62: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: getstatic 209	java/io/File:separator	Ljava/lang/String;
    //   68: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_0
    //   72: iload_1
    //   73: invokestatic 148	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   76: iload_2
    //   77: invokestatic 148	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   80: invokespecial 211	com/tencent/tencentmap/mapsdk/maps/a/gb:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   83: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   92: astore 6
    //   94: aload 6
    //   96: invokevirtual 218	java/io/File:exists	()Z
    //   99: ifeq +16 -> 115
    //   102: aload 6
    //   104: invokevirtual 221	java/io/File:delete	()Z
    //   107: ifne +8 -> 115
    //   110: aload 6
    //   112: invokevirtual 224	java/io/File:deleteOnExit	()V
    //   115: aload 6
    //   117: invokevirtual 227	java/io/File:createNewFile	()Z
    //   120: pop
    //   121: aconst_null
    //   122: astore 7
    //   124: aconst_null
    //   125: astore 5
    //   127: aconst_null
    //   128: astore 8
    //   130: aload_3
    //   131: bipush 10
    //   133: aload_3
    //   134: arraylength
    //   135: bipush 10
    //   137: isub
    //   138: invokestatic 233	com/tencent/map/lib/util/ZipUtil:inflate	([BII)[B
    //   141: astore 9
    //   143: aload 9
    //   145: ifnonnull +20 -> 165
    //   148: ldc 202
    //   150: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -129 -> 24
    //   156: astore_3
    //   157: ldc 202
    //   159: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -138 -> 24
    //   165: new 235	java/io/FileOutputStream
    //   168: astore_3
    //   169: aload_3
    //   170: aload 6
    //   172: invokespecial 238	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   175: aload_3
    //   176: aload 9
    //   178: invokevirtual 242	java/io/FileOutputStream:write	([B)V
    //   181: aload_3
    //   182: invokevirtual 245	java/io/FileOutputStream:flush	()V
    //   185: aload_3
    //   186: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   189: iconst_1
    //   190: istore 4
    //   192: ldc 202
    //   194: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: goto -173 -> 24
    //   200: astore_3
    //   201: aconst_null
    //   202: astore_3
    //   203: aload_3
    //   204: ifnull +7 -> 211
    //   207: aload_3
    //   208: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   211: ldc 202
    //   213: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: goto -192 -> 24
    //   219: astore_3
    //   220: aload 8
    //   222: astore_3
    //   223: aload_3
    //   224: ifnull +7 -> 231
    //   227: aload_3
    //   228: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   231: ldc 202
    //   233: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: goto -212 -> 24
    //   239: astore_3
    //   240: aload 7
    //   242: astore_3
    //   243: aload_3
    //   244: ifnull +7 -> 251
    //   247: aload_3
    //   248: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   251: ldc 202
    //   253: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: goto -232 -> 24
    //   259: astore_3
    //   260: aload 5
    //   262: ifnull +8 -> 270
    //   265: aload 5
    //   267: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   270: ldc 202
    //   272: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: aload_3
    //   276: athrow
    //   277: astore_3
    //   278: goto -89 -> 189
    //   281: astore_3
    //   282: goto -71 -> 211
    //   285: astore_3
    //   286: goto -55 -> 231
    //   289: astore_3
    //   290: goto -39 -> 251
    //   293: astore 5
    //   295: goto -25 -> 270
    //   298: astore 5
    //   300: aload_3
    //   301: astore 8
    //   303: aload 5
    //   305: astore_3
    //   306: aload 8
    //   308: astore 5
    //   310: goto -50 -> 260
    //   313: astore 5
    //   315: goto -72 -> 243
    //   318: astore 5
    //   320: goto -97 -> 223
    //   323: astore 5
    //   325: goto -122 -> 203
    //
    // Exception table:
    //   from	to	target	type
    //   115	121	156	java/io/IOException
    //   130	143	200	java/io/FileNotFoundException
    //   165	175	200	java/io/FileNotFoundException
    //   130	143	219	java/io/IOException
    //   165	175	219	java/io/IOException
    //   130	143	239	java/lang/Exception
    //   165	175	239	java/lang/Exception
    //   130	143	259	finally
    //   165	175	259	finally
    //   185	189	277	java/io/IOException
    //   207	211	281	java/io/IOException
    //   227	231	285	java/io/IOException
    //   247	251	289	java/io/IOException
    //   265	270	293	java/io/IOException
    //   175	185	298	finally
    //   175	185	313	java/lang/Exception
    //   175	185	318	java/io/IOException
    //   175	185	323	java/io/FileNotFoundException
  }

  private void b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98985);
    File localFile = g();
    if (localFile == null)
      AppMethodBeat.o(98985);
    while (true)
    {
      return;
      paramString1 = new File(localFile.getAbsolutePath() + File.separator + c(paramString1, paramString2));
      if ((paramString1.exists()) && (!paramString1.delete()))
        paramString1.deleteOnExit();
      AppMethodBeat.o(98985);
    }
  }

  private boolean b(List<Integer> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(98979);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(98979);
    while (true)
    {
      return bool;
      if (this.g == null)
      {
        AppMethodBeat.o(98979);
        bool = true;
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramList.size())
            break label91;
          if (!this.g.contains(paramList.get(i)))
          {
            AppMethodBeat.o(98979);
            bool = true;
            break;
          }
        }
        label91: AppMethodBeat.o(98979);
      }
    }
  }

  private String c(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98986);
    paramString1 = paramString1 + "_" + paramString2 + ".kml";
    AppMethodBeat.o(98986);
    return paramString1;
  }

  private void f()
  {
    AppMethodBeat.i(98977);
    if ((this.b == null) || (this.b.a() == null) || (this.b.a().y() == null) || (this.b.a().m() < 11))
      AppMethodBeat.o(98977);
    while (true)
    {
      return;
      Object localObject = this.b.a();
      localObject = this.b.a(((gk)localObject).y(), ((gk)localObject).m());
      if ((localObject == null) || (((List)localObject).size() == 0))
      {
        AppMethodBeat.o(98977);
      }
      else
      {
        a((List)localObject);
        AppMethodBeat.o(98977);
      }
    }
  }

  private File g()
  {
    Object localObject1 = null;
    AppMethodBeat.i(98983);
    if ((this.b == null) || (this.b.D() == null))
      AppMethodBeat.o(98983);
    while (true)
    {
      return localObject1;
      Object localObject2 = this.b.D().e();
      if (localObject2 == null)
      {
        AppMethodBeat.o(98983);
      }
      else
      {
        localObject2 = new File((String)localObject2);
        if (!((File)localObject2).exists());
        try
        {
          ((File)localObject2).mkdirs();
          AppMethodBeat.o(98983);
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(98983);
        }
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(98971);
    if (this.b == null)
      AppMethodBeat.o(98971);
    while (true)
    {
      return;
      this.b.b(paramBoolean);
      this.d = paramBoolean;
      if (paramBoolean);
      try
      {
        start();
        label41: this.b.w();
        AppMethodBeat.o(98971);
      }
      catch (Exception localException)
      {
        break label41;
      }
    }
  }

  public boolean a()
  {
    return this.d;
  }

  public void b()
  {
    AppMethodBeat.i(98972);
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(98972);
    }
  }

  public void c()
  {
    AppMethodBeat.i(98973);
    this.e = false;
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(98973);
    }
  }

  public void d()
  {
    AppMethodBeat.i(98974);
    this.e = true;
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(98974);
    }
  }

  public void e()
  {
    AppMethodBeat.i(98975);
    this.f = true;
    this.e = true;
    this.d = false;
    try
    {
      notify();
      interrupt();
      AppMethodBeat.o(98975);
      return;
    }
    finally
    {
      AppMethodBeat.o(98975);
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc_w 311
    //   3: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 313	java/lang/Thread:run	()V
    //   10: aload_0
    //   11: getfield 32	com/tencent/tencentmap/mapsdk/maps/a/gb:f	Z
    //   14: ifne +56 -> 70
    //   17: aload_0
    //   18: getfield 36	com/tencent/tencentmap/mapsdk/maps/a/gb:e	Z
    //   21: ifne +14 -> 35
    //   24: aload_0
    //   25: getfield 34	com/tencent/tencentmap/mapsdk/maps/a/gb:d	Z
    //   28: ifeq +7 -> 35
    //   31: aload_0
    //   32: invokespecial 315	com/tencent/tencentmap/mapsdk/maps/a/gb:f	()V
    //   35: aload_0
    //   36: monitorenter
    //   37: aload_0
    //   38: ldc2_w 127
    //   41: invokevirtual 319	java/lang/Object:wait	(J)V
    //   44: aload_0
    //   45: monitorexit
    //   46: goto -36 -> 10
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: ldc_w 311
    //   55: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: athrow
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: ldc_w 311
    //   66: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: return
    //   70: ldc_w 311
    //   73: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: goto -7 -> 69
    //
    // Exception table:
    //   from	to	target	type
    //   37	44	49	finally
    //   44	46	49	finally
    //   50	52	49	finally
    //   61	63	49	finally
    //   37	44	60	java/lang/InterruptedException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gb
 * JD-Core Version:    0.6.2
 */