package com.tencent.mm.plugin.traceroute.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  public static String sIs;
  public static c sIt;
  private final String TAG;
  public a.c sIA;
  public a.b sIB;
  private final int sIu;
  private boolean sIv;
  f sIw;
  public Map<String, Set<Integer>> sIx;
  public a.e sIy;
  public a.d sIz;
  String userName;

  public a(String paramString)
  {
    AppMethodBeat.i(25979);
    this.TAG = "MicroMsg.MMTraceRoute";
    this.sIu = 64;
    this.sIv = false;
    this.sIw = new f((byte)0);
    this.sIx = new HashMap();
    this.userName = paramString;
    sIs = h.getExternalStorageDirectory().getAbsolutePath() + "/tencent/traceroute_log_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString() + ".log";
    AppMethodBeat.o(25979);
  }

  final void a(String paramString1, String paramString2, Integer paramInteger)
  {
    while (true)
    {
      ConcurrentHashMap localConcurrentHashMap;
      StringBuilder localStringBuilder;
      try
      {
        AppMethodBeat.i(25982);
        if ((paramString1 == null) || (paramString2 == null) || (paramInteger.intValue() < 0))
        {
          AppMethodBeat.o(25982);
          return;
        }
        if (!this.sIw.containsKey(paramString1))
        {
          localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
          localConcurrentHashMap.<init>();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(paramString2);
          localConcurrentHashMap.put(paramInteger, localStringBuilder);
          this.sIw.put(paramString1, (ConcurrentHashMap)localConcurrentHashMap);
          AppMethodBeat.o(25982);
          continue;
        }
      }
      finally
      {
      }
      if (((ConcurrentHashMap)this.sIw.get(paramString1)).containsKey(paramInteger))
      {
        ((StringBuilder)((ConcurrentHashMap)this.sIw.get(paramString1)).get(paramInteger)).append(paramString2);
        AppMethodBeat.o(25982);
      }
      else
      {
        localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
        localConcurrentHashMap.<init>();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(paramString2);
        localConcurrentHashMap.put(paramInteger, localStringBuilder);
        paramString1 = (ConcurrentHashMap)this.sIw.get(paramString1);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(paramString2);
        paramString1.put(paramInteger, localStringBuilder);
        AppMethodBeat.o(25982);
      }
    }
  }

  public final void c(String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(25981);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      ab.e("MicroMsg.MMTraceRoute", "no ip contains");
      AppMethodBeat.o(25981);
    }
    while (true)
    {
      return;
      String str;
      int j;
      label61: Object localObject;
      String[] arrayOfString;
      if (paramBoolean)
      {
        str = "" + "long: ";
        int i = paramArrayOfString.length;
        j = 0;
        if (j >= i)
          break label266;
        localObject = paramArrayOfString[j];
        arrayOfString = ((String)localObject).split(":");
        if ((arrayOfString != null) && (arrayOfString.length == 3))
          break label140;
        ab.e("MicroMsg.MMTraceRoute", "err ip ".concat(String.valueOf(localObject)));
      }
      while (true)
      {
        j++;
        break label61;
        str = "" + "short: ";
        break;
        label140: if (!this.sIx.containsKey(arrayOfString[0]))
        {
          localObject = new HashSet();
          ((Set)localObject).add(Integer.valueOf(bo.getInt(arrayOfString[1], 0)));
          this.sIx.put(arrayOfString[0], localObject);
          str = str + arrayOfString[0] + " ";
        }
        else
        {
          ((Set)this.sIx.get(arrayOfString[0])).add(Integer.valueOf(bo.getInt(arrayOfString[1], 0)));
        }
      }
      label266: paramArrayOfString = str + "\n";
      e.e(sIs, paramArrayOfString.getBytes());
      AppMethodBeat.o(25981);
    }
  }

  final boolean cHu()
  {
    try
    {
      boolean bool = this.sIv;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final void cHv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 25983
    //   5: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 74	com/tencent/mm/plugin/traceroute/b/a:sIw	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   12: ifnull +609 -> 621
    //   15: aload_0
    //   16: getfield 74	com/tencent/mm/plugin/traceroute/b/a:sIw	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   19: astore_1
    //   20: new 92	java/io/File
    //   23: astore_2
    //   24: aload_2
    //   25: getstatic 125	com/tencent/mm/plugin/traceroute/b/a:sIs	Ljava/lang/String;
    //   28: invokespecial 229	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: aload_2
    //   32: invokevirtual 232	java/io/File:exists	()Z
    //   35: istore_3
    //   36: iload_3
    //   37: ifne +50 -> 87
    //   40: aload_2
    //   41: invokevirtual 235	java/io/File:createNewFile	()Z
    //   44: pop
    //   45: getstatic 125	com/tencent/mm/plugin/traceroute/b/a:sIs	Ljava/lang/String;
    //   48: astore_2
    //   49: new 83	java/lang/StringBuilder
    //   52: astore 4
    //   54: aload 4
    //   56: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   59: aload_2
    //   60: aload 4
    //   62: aload_1
    //   63: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   66: getfield 81	com/tencent/mm/plugin/traceroute/b/a:userName	Ljava/lang/String;
    //   69: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc 214
    //   74: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokevirtual 218	java/lang/String:getBytes	()[B
    //   83: invokestatic 223	com/tencent/mm/a/e:e	(Ljava/lang/String;[B)I
    //   86: pop
    //   87: aload_1
    //   88: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   91: getfield 74	com/tencent/mm/plugin/traceroute/b/a:sIw	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   94: invokevirtual 243	com/tencent/mm/plugin/traceroute/b/a$f:entrySet	()Ljava/util/Set;
    //   97: invokeinterface 247 1 0
    //   102: astore 5
    //   104: aload 5
    //   106: invokeinterface 252 1 0
    //   111: ifeq +373 -> 484
    //   114: aload 5
    //   116: invokeinterface 256 1 0
    //   121: checkcast 258	java/util/Map$Entry
    //   124: invokeinterface 261 1 0
    //   129: checkcast 117	java/lang/String
    //   132: astore 6
    //   134: aload 6
    //   136: invokestatic 265	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   139: ifne -35 -> 104
    //   142: aload_1
    //   143: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   146: getfield 74	com/tencent/mm/plugin/traceroute/b/a:sIw	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   149: aload 6
    //   151: invokevirtual 141	com/tencent/mm/plugin/traceroute/b/a$f:containsKey	(Ljava/lang/Object;)Z
    //   154: ifeq -50 -> 104
    //   157: aload_1
    //   158: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   161: getfield 74	com/tencent/mm/plugin/traceroute/b/a:sIw	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   164: aload 6
    //   166: invokevirtual 156	com/tencent/mm/plugin/traceroute/b/a$f:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   169: checkcast 147	java/util/Map
    //   172: astore 7
    //   174: aload 7
    //   176: ifnull -72 -> 104
    //   179: ldc 171
    //   181: astore_2
    //   182: aload 7
    //   184: invokeinterface 268 1 0
    //   189: iconst_1
    //   190: if_icmpne +170 -> 360
    //   193: aload 7
    //   195: iconst_1
    //   196: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: invokeinterface 212 2 0
    //   204: ifnull +156 -> 360
    //   207: new 83	java/lang/StringBuilder
    //   210: astore_2
    //   211: aload_2
    //   212: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   215: aload_2
    //   216: ldc 171
    //   218: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload 7
    //   223: iconst_1
    //   224: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   227: invokeinterface 212 2 0
    //   232: checkcast 83	java/lang/StringBuilder
    //   235: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: astore 4
    //   246: aload 4
    //   248: invokevirtual 271	java/lang/String:length	()I
    //   251: ifle -147 -> 104
    //   254: new 83	java/lang/StringBuilder
    //   257: astore_2
    //   258: aload_2
    //   259: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   262: ldc 63
    //   264: aload_2
    //   265: aload 6
    //   267: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 4
    //   272: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: invokestatic 273	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: getstatic 125	com/tencent/mm/plugin/traceroute/b/a:sIs	Ljava/lang/String;
    //   284: aload 4
    //   286: invokevirtual 218	java/lang/String:getBytes	()[B
    //   289: invokestatic 223	com/tencent/mm/a/e:e	(Ljava/lang/String;[B)I
    //   292: pop
    //   293: goto -189 -> 104
    //   296: astore_2
    //   297: aload_0
    //   298: monitorexit
    //   299: aload_2
    //   300: athrow
    //   301: astore_2
    //   302: new 83	java/lang/StringBuilder
    //   305: astore 4
    //   307: aload 4
    //   309: ldc_w 275
    //   312: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   315: ldc 63
    //   317: aload 4
    //   319: aload_2
    //   320: invokevirtual 278	java/io/IOException:getMessage	()Ljava/lang/String;
    //   323: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   332: ldc 63
    //   334: aload_2
    //   335: ldc 171
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 282	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: aload_1
    //   345: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   348: invokevirtual 285	com/tencent/mm/plugin/traceroute/b/a:cHw	()V
    //   351: sipush 25983
    //   354: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   357: aload_0
    //   358: monitorexit
    //   359: return
    //   360: iconst_0
    //   361: istore 8
    //   363: iconst_0
    //   364: istore 9
    //   366: aload_2
    //   367: astore 4
    //   369: iload 8
    //   371: aload 7
    //   373: invokeinterface 268 1 0
    //   378: if_icmpge -132 -> 246
    //   381: aload_2
    //   382: astore 4
    //   384: iload 9
    //   386: ifne -140 -> 246
    //   389: aload 7
    //   391: iload 8
    //   393: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   396: invokeinterface 212 2 0
    //   401: ifnull +229 -> 630
    //   404: aload 7
    //   406: iload 8
    //   408: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   411: invokeinterface 212 2 0
    //   416: checkcast 83	java/lang/StringBuilder
    //   419: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   422: astore 10
    //   424: aload 10
    //   426: invokestatic 265	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   429: ifne +201 -> 630
    //   432: new 83	java/lang/StringBuilder
    //   435: astore 4
    //   437: aload 4
    //   439: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   442: aload 4
    //   444: aload_2
    //   445: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: aload 10
    //   450: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   456: astore 4
    //   458: aload 4
    //   460: astore_2
    //   461: aload 10
    //   463: ldc_w 287
    //   466: invokevirtual 291	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   469: ifeq +9 -> 478
    //   472: iconst_1
    //   473: istore 9
    //   475: aload 4
    //   477: astore_2
    //   478: iinc 8 1
    //   481: goto -115 -> 366
    //   484: getstatic 125	com/tencent/mm/plugin/traceroute/b/a:sIs	Ljava/lang/String;
    //   487: iconst_0
    //   488: iconst_m1
    //   489: invokestatic 294	com/tencent/mm/a/e:e	(Ljava/lang/String;II)[B
    //   492: astore 4
    //   494: aload 4
    //   496: invokestatic 298	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   499: ifeq +27 -> 526
    //   502: ldc 63
    //   504: ldc_w 300
    //   507: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   510: aload_1
    //   511: getfield 239	com/tencent/mm/plugin/traceroute/b/a$f:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   514: invokevirtual 285	com/tencent/mm/plugin/traceroute/b/a:cHw	()V
    //   517: sipush 25983
    //   520: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: goto -166 -> 357
    //   526: aload 4
    //   528: arraylength
    //   529: istore 8
    //   531: ldc_w 302
    //   534: iconst_2
    //   535: anewarray 4	java/lang/Object
    //   538: dup
    //   539: iconst_0
    //   540: getstatic 307	com/tencent/mm/protocal/d:vxo	I
    //   543: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   546: aastore
    //   547: dup
    //   548: iconst_1
    //   549: iload 8
    //   551: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   554: aastore
    //   555: invokestatic 310	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   558: invokevirtual 218	java/lang/String:getBytes	()[B
    //   561: invokestatic 316	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   564: invokevirtual 319	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   567: astore_2
    //   568: aload 4
    //   570: invokestatic 325	com/tencent/mm/a/r:compress	([B)[B
    //   573: astore 6
    //   575: new 327	com/tencent/mm/pointers/PByteArray
    //   578: astore 4
    //   580: aload 4
    //   582: invokespecial 328	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   585: aload 4
    //   587: aload 6
    //   589: aload_2
    //   590: invokevirtual 218	java/lang/String:getBytes	()[B
    //   593: invokestatic 333	com/tencent/mm/a/c:a	(Lcom/tencent/mm/pointers/PByteArray;[B[B)I
    //   596: pop
    //   597: new 335	com/tencent/mm/plugin/traceroute/b/a$f$1
    //   600: astore 6
    //   602: aload 6
    //   604: aload_1
    //   605: iload 8
    //   607: aload_2
    //   608: aload 4
    //   610: invokespecial 338	com/tencent/mm/plugin/traceroute/b/a$f$1:<init>	(Lcom/tencent/mm/plugin/traceroute/b/a$f;ILjava/lang/String;Lcom/tencent/mm/pointers/PByteArray;)V
    //   613: aload 6
    //   615: ldc_w 340
    //   618: invokestatic 346	com/tencent/mm/sdk/g/d:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   621: sipush 25983
    //   624: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   627: goto -270 -> 357
    //   630: goto -152 -> 478
    //
    // Exception table:
    //   from	to	target	type
    //   2	36	296	finally
    //   40	87	296	finally
    //   87	104	296	finally
    //   104	174	296	finally
    //   182	246	296	finally
    //   246	293	296	finally
    //   302	357	296	finally
    //   369	381	296	finally
    //   389	458	296	finally
    //   461	472	296	finally
    //   484	523	296	finally
    //   526	621	296	finally
    //   621	627	296	finally
    //   40	87	301	java/io/IOException
  }

  final void cHw()
  {
    AppMethodBeat.i(25984);
    if (this.sIB != null)
      this.sIB.cHx();
    AppMethodBeat.o(25984);
  }

  final void mf(boolean paramBoolean)
  {
    try
    {
      this.sIv = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(25980);
    mf(true);
    if (sIt != null);
    while (true)
    {
      try
      {
        sIt.shutdownNow();
        AppMethodBeat.o(25980);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMTraceRoute", "failed to shutdown threadpool: " + localException.getMessage());
      }
      AppMethodBeat.o(25980);
    }
  }

  final class f extends ConcurrentHashMap<String, ConcurrentHashMap<Integer, StringBuilder>>
  {
    private f()
    {
    }
  }

  final class g
    implements Runnable
  {
    private String sII;
    private boolean sIJ;
    private Integer sIK;
    private String serverIP;

    public g(String paramString1, String paramBoolean, boolean paramInteger, Integer arg5)
    {
      this.sII = paramString1;
      this.serverIP = paramBoolean;
      this.sIJ = paramInteger;
      Object localObject;
      this.sIK = localObject;
    }

    public final void run()
    {
      AppMethodBeat.i(25975);
      a locala = a.this;
      String str1 = this.sII;
      String str2 = this.serverIP;
      Integer localInteger = this.sIK;
      int i = 1;
      if (i <= 3)
      {
        Object localObject1 = b.J(new String[] { "ping", "-c 1", "-t 64", str1 });
        if (((List)localObject1).size() != 2)
          if (i == 3)
            locala.a(str2, " router no response\n", localInteger);
        Object localObject2;
        while (true)
        {
          i++;
          break;
          locala.a(str2, " router no response", localInteger);
          continue;
          localObject2 = (String)((List)localObject1).get(0);
          if (!bo.isNullOrNil((String)localObject2))
            break label155;
          ab.e("MicroMsg.MMTraceRoute", "runcommand err ".concat(String.valueOf(str1)));
          locala.a(str2, "run command err ", localInteger);
        }
        label155: localObject1 = ((List)localObject1).get(1).toString();
        if (b.abP((String)localObject2) > 0)
        {
          localObject2 = b.abO((String)localObject2);
          if (!bo.isNullOrNil((String)localObject2))
            localObject1 = String.format(" %sms ", new Object[] { localObject2 });
        }
        while (true)
        {
          localObject2 = localObject1;
          if (i == 3)
            localObject2 = (String)localObject1 + "\n";
          locala.a(str2, (String)localObject2, localInteger);
          break;
          if (!bo.isNullOrNil((String)localObject1))
          {
            localObject1 = String.format(" %sms ", new Object[] { localObject1 });
          }
          else
          {
            localObject1 = String.format("unable to get time", new Object[0]);
            continue;
            localObject1 = String.format(" router no response ", new Object[0]);
          }
        }
      }
      AppMethodBeat.o(25975);
    }
  }

  final class h
    implements Runnable
  {
    private String ip;
    private int sIL;

    public h(String paramInt, int arg3)
    {
      this.ip = paramInt;
      int i;
      this.sIL = i;
    }

    public final void run()
    {
      int i = 1;
      AppMethodBeat.i(25976);
      ab.i("MicroMsg.MMTraceRoute", "ttl= " + this.sIL);
      a locala = a.this;
      String str1 = this.ip;
      int j = this.sIL;
      Object localObject = b.J(new String[] { "ping", "-c 1", "-t " + String.valueOf(j), str1 });
      int k;
      if (((List)localObject).size() != 2)
      {
        locala.a(str1, String.format("%d : can not get roupter ip\n", new Object[] { Integer.valueOf(j) }), Integer.valueOf(j + 1));
        k = 0;
        label137: if (k == 0)
          break label582;
        AppMethodBeat.o(25976);
      }
      while (true)
      {
        return;
        String str2 = (String)((List)localObject).get(0);
        if (str2.length() == 0)
        {
          ab.e("MicroMsg.MMTraceRoute", "runcommand err");
          break;
        }
        int m = str2.indexOf("From ");
        k = m;
        if (m < 0)
        {
          m = str2.indexOf("from ");
          k = m;
          if (m < 0)
            localObject = null;
        }
        while (true)
        {
          if (!bo.isNullOrNil((String)localObject))
            break label383;
          k = i;
          if (b.abP(str2) > 0)
            break label137;
          localObject = String.format("%d : can not get roupter ip\n", new Object[] { Integer.valueOf(j) });
          ab.e("MicroMsg.MMTraceRoute", "can not get route ip and ttl".concat(String.valueOf(str1)));
          locala.a(str1, (String)localObject, Integer.valueOf(j + 1));
          break;
          m = str2.indexOf(" ", k);
          if (m < 0)
          {
            m = str2.indexOf(":", k);
            k = m;
            if (m < 0)
              localObject = null;
          }
          else
          {
            k = m;
            m = k + 1;
            k = str2.indexOf(" ", m);
            if (k < 0)
              localObject = null;
            else
              localObject = str2.substring(m, k).replace(":", "");
          }
        }
        label383: if (str1.equals(localObject))
        {
          locala.a(str1, String.format("%d : FIN %s\n\n", new Object[] { Integer.valueOf(j), localObject }), Integer.valueOf(j + 1));
          k = i;
          break label137;
        }
        if (b.abP(str2) > 0)
        {
          locala.a(str1, String.format("%d : FIN %s\n\n ", new Object[] { Integer.valueOf(j), localObject }), Integer.valueOf(j + 1));
          k = i;
          if (a.sIt == null)
            break label137;
          a.sIt.execute(new a.g(locala, (String)localObject, str1, true, Integer.valueOf(j + 1)));
          k = i;
          break label137;
        }
        locala.a(str1, String.format("%d : %s", new Object[] { Integer.valueOf(j), localObject }), Integer.valueOf(j + 1));
        if (a.sIt == null)
          break;
        a.sIt.execute(new a.g(locala, (String)localObject, str1, false, Integer.valueOf(j + 1)));
        break;
        label582: AppMethodBeat.o(25976);
      }
    }
  }

  final class i
    implements Runnable
  {
    private String ip;

    public i(String arg2)
    {
      Object localObject;
      this.ip = localObject;
    }

    public final void run()
    {
      int i = 1;
      AppMethodBeat.i(25977);
      Object localObject1 = b.J(new String[] { "ping", "-c 1", "-t 64", this.ip });
      if (((List)localObject1).size() != 2)
      {
        a.this.a(this.ip, "failed to ping: \n" + this.ip, Integer.valueOf(0));
        AppMethodBeat.o(25977);
      }
      while (true)
      {
        return;
        Object localObject2 = (String)((List)localObject1).get(0);
        if (bo.isNullOrNil((String)localObject2))
        {
          a.this.a(this.ip, "failed to ping: \n" + this.ip, Integer.valueOf(0));
          ab.e("MicroMsg.MMTraceRoute", "runcommand err");
          AppMethodBeat.o(25977);
        }
        else
        {
          int j = b.abP((String)localObject2);
          if (j <= 0)
          {
            ab.e("MicroMsg.MMTraceRoute", "failed to touch server:" + this.ip);
            a.this.a(this.ip, "failed to touch server: " + this.ip + "\n", Integer.valueOf(0));
            AppMethodBeat.o(25977);
          }
          else
          {
            localObject1 = ((List)localObject1).get(1).toString();
            localObject2 = b.abO((String)localObject2);
            if (!bo.isNullOrNil((String)localObject2))
              localObject2 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(j), localObject2 });
            while (true)
            {
              a.this.a(this.ip, (String)localObject2 + "\n", Integer.valueOf(0));
              int k = 64 - j + 5;
              int m = k;
              j = i;
              if (k < 0)
                m = 64;
              for (j = i; (j < m) && (!a.this.cHu()); j++)
              {
                localObject2 = new a.h(a.this, this.ip, j);
                if (a.sIt != null)
                  a.sIt.execute((Runnable)localObject2);
              }
              if (!bo.isNullOrNil((String)localObject1))
                localObject2 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(j), localObject1 });
              else
                localObject2 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(j), "unknown" });
            }
            AppMethodBeat.o(25977);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.a
 * JD-Core Version:    0.6.2
 */