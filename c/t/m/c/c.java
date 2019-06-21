package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
  implements Runnable
{
  private static int g = 0;
  private final int a;
  private final int b;
  private Context c;
  private List<a> d;
  private String e;
  private boolean f;

  public c(Context paramContext)
  {
    AppMethodBeat.i(136331);
    this.a = 30000;
    this.b = 20000;
    this.d = null;
    this.e = null;
    this.f = false;
    this.c = paramContext;
    this.e = (this.c.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp");
    paramContext = new File(this.c.getFilesDir().getAbsolutePath(), "TencentLocation/comp");
    if (!paramContext.exists())
      paramContext.mkdirs();
    AppMethodBeat.o(136331);
  }

  private void a()
  {
    while (true)
    {
      Object localObject1;
      int i;
      a locala;
      try
      {
        AppMethodBeat.i(136333);
        if ((this.d == null) || (this.d.size() <= 0))
          break label444;
        g = 1;
        q.f(this.c);
        if (q.d() < 10485760L)
        {
          g = 2;
          AppMethodBeat.o(136333);
          return;
        }
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Iterator localIterator1 = this.d.iterator();
        i = 1;
        if (localIterator1.hasNext())
        {
          locala = (a)localIterator1.next();
          if (!a(locala))
          {
            i = 0;
            continue;
          }
          ((List)localObject1).add(locala);
          continue;
        }
      }
      finally
      {
      }
      if (i == 0)
      {
        g = 2;
        b((List)localObject1);
        AppMethodBeat.o(136333);
      }
      else if (((List)localObject1).size() == this.d.size())
      {
        d.a(this.c).a("load");
        if (!q.a(this.c, this.d))
        {
          b((List)localObject1);
          g = 2;
          AppMethodBeat.o(136333);
        }
        else
        {
          Iterator localIterator2 = ((List)localObject1).iterator();
          while (localIterator2.hasNext())
          {
            locala = (a)localIterator2.next();
            if (!locala.c.contains(".dex"))
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              locala.c += ".dex";
            }
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(this.e, locala.c);
            if (((File)localObject1).exists())
              ((File)localObject1).delete();
            File localFile = new java/io/File;
            localFile.<init>(this.e, locala.c);
            localObject1 = new java/io/File;
            String str = this.e;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("tmp_");
            ((File)localObject1).<init>(str, locala.c);
            ((File)localObject1).renameTo(localFile);
          }
          g = 1;
          e.a(this.c).a("CPU", "down suc");
          d.a(this.c).b("load");
          AppMethodBeat.o(136333);
        }
      }
      else
      {
        e.a(this.c).a("CPU", "down failed");
        b((List)localObject1);
        g = 2;
        label444: AppMethodBeat.o(136333);
      }
    }
  }

  // ERROR //
  private boolean a(a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 187
    //   4: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 49	java/lang/StringBuilder
    //   10: astore_3
    //   11: aload_3
    //   12: ldc 189
    //   14: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_3
    //   18: aload_1
    //   19: getfield 190	c/t/m/c/a:e	Ljava/lang/String;
    //   22: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore 4
    //   30: aconst_null
    //   31: astore 5
    //   33: iconst_0
    //   34: istore 6
    //   36: iload 6
    //   38: iconst_3
    //   39: if_icmpge +410 -> 449
    //   42: aload 4
    //   44: invokestatic 195	c/t/m/c/p:a	(Ljava/lang/String;)[B
    //   47: astore 7
    //   49: aload 5
    //   51: astore_3
    //   52: aload 7
    //   54: ifnull +263 -> 317
    //   57: aload 7
    //   59: ldc 197
    //   61: invokestatic 202	c/t/m/c/m:b	([BLjava/lang/String;)[B
    //   64: invokestatic 205	c/t/m/c/q:a	([B)[B
    //   67: astore 7
    //   69: aload 5
    //   71: astore_3
    //   72: aload 7
    //   74: ifnull +243 -> 317
    //   77: new 58	java/io/File
    //   80: astore 8
    //   82: aload_0
    //   83: getfield 43	c/t/m/c/c:e	Ljava/lang/String;
    //   86: astore_3
    //   87: new 49	java/lang/StringBuilder
    //   90: astore 9
    //   92: aload 9
    //   94: ldc 160
    //   96: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload 8
    //   101: aload_3
    //   102: aload 9
    //   104: aload_1
    //   105: getfield 147	c/t/m/c/a:c	Ljava/lang/String;
    //   108: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokespecial 77	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: new 207	java/io/BufferedOutputStream
    //   120: astore_3
    //   121: new 209	java/io/FileOutputStream
    //   124: astore 9
    //   126: aload 9
    //   128: aload 8
    //   130: iconst_0
    //   131: invokespecial 212	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   134: aload_3
    //   135: aload 9
    //   137: sipush 1024
    //   140: invokespecial 215	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   143: aload_3
    //   144: astore 5
    //   146: aload_3
    //   147: aload 7
    //   149: invokevirtual 219	java/io/BufferedOutputStream:write	([B)V
    //   152: aload_3
    //   153: astore 5
    //   155: aload_0
    //   156: aload_1
    //   157: aload 8
    //   159: invokespecial 222	c/t/m/c/c:a	(Lc/t/m/c/a;Ljava/io/File;)Z
    //   162: ifeq +68 -> 230
    //   165: aload_3
    //   166: astore 5
    //   168: aload_0
    //   169: getfield 47	c/t/m/c/c:c	Landroid/content/Context;
    //   172: invokestatic 172	c/t/m/c/e:a	(Landroid/content/Context;)Lc/t/m/c/e;
    //   175: astore 7
    //   177: aload_3
    //   178: astore 5
    //   180: new 49	java/lang/StringBuilder
    //   183: astore 9
    //   185: aload_3
    //   186: astore 5
    //   188: aload 9
    //   190: ldc 224
    //   192: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   195: aload_3
    //   196: astore 5
    //   198: aload 7
    //   200: ldc 174
    //   202: aload 9
    //   204: aload_1
    //   205: getfield 190	c/t/m/c/a:e	Ljava/lang/String;
    //   208: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokevirtual 178	c/t/m/c/e:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_3
    //   218: invokevirtual 227	java/io/BufferedOutputStream:close	()V
    //   221: iconst_1
    //   222: istore_2
    //   223: ldc 187
    //   225: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: iload_2
    //   229: ireturn
    //   230: aload_3
    //   231: astore 5
    //   233: aload_0
    //   234: getfield 47	c/t/m/c/c:c	Landroid/content/Context;
    //   237: invokestatic 172	c/t/m/c/e:a	(Landroid/content/Context;)Lc/t/m/c/e;
    //   240: astore 7
    //   242: aload_3
    //   243: astore 5
    //   245: new 49	java/lang/StringBuilder
    //   248: astore 9
    //   250: aload_3
    //   251: astore 5
    //   253: aload 9
    //   255: ldc 229
    //   257: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   260: aload_3
    //   261: astore 5
    //   263: aload 7
    //   265: ldc 174
    //   267: aload 9
    //   269: aload_1
    //   270: getfield 190	c/t/m/c/a:e	Ljava/lang/String;
    //   273: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: invokevirtual 178	c/t/m/c/e:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: aload_3
    //   283: astore 5
    //   285: aload 8
    //   287: invokevirtual 81	java/io/File:exists	()Z
    //   290: ifeq +23 -> 313
    //   293: aload_3
    //   294: astore 5
    //   296: aload 8
    //   298: invokevirtual 232	java/io/File:isFile	()Z
    //   301: ifeq +12 -> 313
    //   304: aload_3
    //   305: astore 5
    //   307: aload 8
    //   309: invokevirtual 158	java/io/File:delete	()Z
    //   312: pop
    //   313: aload_3
    //   314: invokevirtual 227	java/io/BufferedOutputStream:close	()V
    //   317: ldc2_w 233
    //   320: invokestatic 237	c/t/m/c/q:a	(J)V
    //   323: iinc 6 1
    //   326: aload_3
    //   327: astore 5
    //   329: goto -293 -> 36
    //   332: astore 5
    //   334: goto -17 -> 317
    //   337: astore 7
    //   339: aload_3
    //   340: astore 5
    //   342: aload 8
    //   344: invokevirtual 81	java/io/File:exists	()Z
    //   347: ifeq +23 -> 370
    //   350: aload_3
    //   351: astore 5
    //   353: aload 8
    //   355: invokevirtual 232	java/io/File:isFile	()Z
    //   358: ifeq +12 -> 370
    //   361: aload_3
    //   362: astore 5
    //   364: aload 8
    //   366: invokevirtual 158	java/io/File:delete	()Z
    //   369: pop
    //   370: aload_3
    //   371: astore 5
    //   373: aload_0
    //   374: getfield 47	c/t/m/c/c:c	Landroid/content/Context;
    //   377: invokestatic 172	c/t/m/c/e:a	(Landroid/content/Context;)Lc/t/m/c/e;
    //   380: astore 8
    //   382: aload_3
    //   383: astore 5
    //   385: new 49	java/lang/StringBuilder
    //   388: astore 9
    //   390: aload_3
    //   391: astore 5
    //   393: aload 9
    //   395: ldc 229
    //   397: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   400: aload_3
    //   401: astore 5
    //   403: aload 8
    //   405: ldc 174
    //   407: aload 9
    //   409: aload 7
    //   411: invokevirtual 238	java/lang/Exception:toString	()Ljava/lang/String;
    //   414: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokevirtual 178	c/t/m/c/e:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload_3
    //   424: invokevirtual 227	java/io/BufferedOutputStream:close	()V
    //   427: goto -110 -> 317
    //   430: astore 5
    //   432: goto -115 -> 317
    //   435: astore_1
    //   436: aload 5
    //   438: invokevirtual 227	java/io/BufferedOutputStream:close	()V
    //   441: ldc 187
    //   443: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: aload_1
    //   447: athrow
    //   448: astore_1
    //   449: ldc 187
    //   451: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   454: goto -226 -> 228
    //   457: astore_1
    //   458: goto -237 -> 221
    //   461: astore_3
    //   462: goto -21 -> 441
    //   465: astore_1
    //   466: goto -30 -> 436
    //   469: astore 7
    //   471: aload 5
    //   473: astore_3
    //   474: goto -135 -> 339
    //
    // Exception table:
    //   from	to	target	type
    //   313	317	332	java/lang/Exception
    //   146	152	337	java/lang/Exception
    //   155	165	337	java/lang/Exception
    //   168	177	337	java/lang/Exception
    //   180	185	337	java/lang/Exception
    //   188	195	337	java/lang/Exception
    //   198	217	337	java/lang/Exception
    //   233	242	337	java/lang/Exception
    //   245	250	337	java/lang/Exception
    //   253	260	337	java/lang/Exception
    //   263	282	337	java/lang/Exception
    //   285	293	337	java/lang/Exception
    //   296	304	337	java/lang/Exception
    //   307	313	337	java/lang/Exception
    //   423	427	430	java/lang/Exception
    //   146	152	435	finally
    //   155	165	435	finally
    //   168	177	435	finally
    //   180	185	435	finally
    //   188	195	435	finally
    //   198	217	435	finally
    //   233	242	435	finally
    //   245	250	435	finally
    //   253	260	435	finally
    //   263	282	435	finally
    //   285	293	435	finally
    //   296	304	435	finally
    //   307	313	435	finally
    //   342	350	435	finally
    //   353	361	435	finally
    //   364	370	435	finally
    //   373	382	435	finally
    //   385	390	435	finally
    //   393	400	435	finally
    //   403	423	435	finally
    //   7	30	448	java/lang/Throwable
    //   42	49	448	java/lang/Throwable
    //   57	69	448	java/lang/Throwable
    //   77	117	448	java/lang/Throwable
    //   217	221	448	java/lang/Throwable
    //   313	317	448	java/lang/Throwable
    //   317	323	448	java/lang/Throwable
    //   423	427	448	java/lang/Throwable
    //   436	441	448	java/lang/Throwable
    //   441	448	448	java/lang/Throwable
    //   217	221	457	java/lang/Exception
    //   436	441	461	java/lang/Exception
    //   117	143	465	finally
    //   117	143	469	java/lang/Exception
  }

  private boolean a(a parama, File paramFile)
  {
    AppMethodBeat.i(136336);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramFile != null)
    {
      bool2 = bool1;
      if (paramFile.exists())
      {
        int i = (int)paramFile.length();
        paramFile = q.a(paramFile);
        bool2 = bool1;
        if (parama.d == i)
        {
          bool2 = bool1;
          if (parama.e.equals(paramFile))
            bool2 = true;
        }
      }
    }
    AppMethodBeat.o(136336);
    return bool2;
  }

  private void b(List<a> paramList)
  {
    AppMethodBeat.i(136334);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (a)paramList.next();
      localObject = new File(this.e, "tmp_" + ((a)localObject).c);
      if ((((File)localObject).exists()) && (((File)localObject).isFile()))
        ((File)localObject).delete();
    }
    AppMethodBeat.o(136334);
  }

  public void a(List<a> paramList)
  {
    AppMethodBeat.i(136337);
    this.d = paramList;
    if (g != 1)
      new Thread(this).start();
    AppMethodBeat.o(136337);
  }

  public void run()
  {
    AppMethodBeat.i(136332);
    a();
    e.a(this.c).c();
    AppMethodBeat.o(136332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     c.t.m.c.c
 * JD-Core Version:    0.6.2
 */