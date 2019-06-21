package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class bh extends n
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS  MediaDuplication  (md5 text , size int , path text , createtime long, remuxing text, duration int, status int);", "DROP INDEX IF EXISTS MediaDuplicationMD5Index ", "CREATE INDEX IF NOT EXISTS MD5Index ON MediaDuplication ( md5 )" };
  public com.tencent.mm.sdk.e.e bSd;

  // ERROR //
  public bh(com.tencent.mm.cd.h paramh)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokespecial 27	com/tencent/mm/sdk/e/n:<init>	()V
    //   6: ldc 28
    //   8: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: aload_1
    //   13: putfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   16: aload_0
    //   17: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   20: astore_1
    //   21: new 38	java/lang/StringBuilder
    //   24: astore_3
    //   25: aload_3
    //   26: ldc 40
    //   28: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: aload_3
    //   33: ldc 45
    //   35: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 51
    //   40: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: aconst_null
    //   47: iconst_2
    //   48: invokeinterface 61 4 0
    //   53: astore_3
    //   54: aload_3
    //   55: astore_1
    //   56: aload_3
    //   57: ldc 63
    //   59: invokeinterface 69 2 0
    //   64: istore 4
    //   66: iconst_0
    //   67: istore 5
    //   69: iconst_0
    //   70: istore 6
    //   72: iconst_0
    //   73: istore 7
    //   75: aload_3
    //   76: astore_1
    //   77: aload_3
    //   78: invokeinterface 73 1 0
    //   83: ifeq +74 -> 157
    //   86: iload 4
    //   88: iflt -13 -> 75
    //   91: aload_3
    //   92: astore_1
    //   93: aload_3
    //   94: iload 4
    //   96: invokeinterface 77 2 0
    //   101: astore 8
    //   103: aload_3
    //   104: astore_1
    //   105: ldc 79
    //   107: aload 8
    //   109: invokevirtual 83	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   112: ifeq +9 -> 121
    //   115: iconst_1
    //   116: istore 7
    //   118: goto -43 -> 75
    //   121: aload_3
    //   122: astore_1
    //   123: ldc 85
    //   125: aload 8
    //   127: invokevirtual 83	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   130: ifeq +9 -> 139
    //   133: iconst_1
    //   134: istore 6
    //   136: goto -61 -> 75
    //   139: aload_3
    //   140: astore_1
    //   141: ldc 87
    //   143: aload 8
    //   145: invokevirtual 83	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   148: ifeq -73 -> 75
    //   151: iconst_1
    //   152: istore 5
    //   154: goto -79 -> 75
    //   157: aload_3
    //   158: astore_1
    //   159: aload_3
    //   160: invokeinterface 90 1 0
    //   165: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   168: getfield 102	com/tencent/mm/kernel/e:eJN	Lcom/tencent/mm/cd/h;
    //   171: invokestatic 108	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   174: invokevirtual 112	java/lang/Thread:getId	()J
    //   177: invokevirtual 118	com/tencent/mm/cd/h:iV	(J)J
    //   180: lstore 9
    //   182: iload 7
    //   184: ifne +24 -> 208
    //   187: ldc 120
    //   189: ldc 122
    //   191: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload_0
    //   195: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   198: ldc 45
    //   200: ldc 129
    //   202: invokeinterface 133 3 0
    //   207: pop
    //   208: iload 6
    //   210: ifne +24 -> 234
    //   213: ldc 120
    //   215: ldc 135
    //   217: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload_0
    //   221: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   224: ldc 45
    //   226: ldc 137
    //   228: invokeinterface 133 3 0
    //   233: pop
    //   234: iload 5
    //   236: ifne +24 -> 260
    //   239: ldc 120
    //   241: ldc 139
    //   243: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: aload_0
    //   247: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   250: ldc 45
    //   252: ldc 141
    //   254: invokeinterface 133 3 0
    //   259: pop
    //   260: lload 9
    //   262: lconst_0
    //   263: lcmp
    //   264: ifle +15 -> 279
    //   267: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   270: getfield 102	com/tencent/mm/kernel/e:eJN	Lcom/tencent/mm/cd/h;
    //   273: lload 9
    //   275: invokevirtual 145	com/tencent/mm/cd/h:mB	(J)I
    //   278: pop
    //   279: lconst_0
    //   280: lstore 11
    //   282: aload_0
    //   283: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   286: ldc 147
    //   288: ldc 45
    //   290: invokestatic 151	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   293: invokevirtual 155	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   296: aconst_null
    //   297: iconst_2
    //   298: invokeinterface 61 4 0
    //   303: astore_3
    //   304: aload_3
    //   305: astore_2
    //   306: aload_3
    //   307: invokeinterface 158 1 0
    //   312: ifeq +328 -> 640
    //   315: aload_3
    //   316: astore_2
    //   317: aload_3
    //   318: iconst_0
    //   319: invokeinterface 162 2 0
    //   324: istore 7
    //   326: aload_3
    //   327: astore_2
    //   328: aload_3
    //   329: invokeinterface 90 1 0
    //   334: iload 7
    //   336: istore 6
    //   338: lload 11
    //   340: lstore 9
    //   342: iload 7
    //   344: sipush 5000
    //   347: if_icmplt +27 -> 374
    //   350: aload_0
    //   351: getfield 36	com/tencent/mm/storage/bh:bSd	Lcom/tencent/mm/sdk/e/e;
    //   354: ldc 45
    //   356: aconst_null
    //   357: aconst_null
    //   358: invokeinterface 166 4 0
    //   363: istore 6
    //   365: iload 6
    //   367: i2l
    //   368: lstore 9
    //   370: iload 7
    //   372: istore 6
    //   374: ldc 120
    //   376: ldc 168
    //   378: iconst_3
    //   379: anewarray 170	java/lang/Object
    //   382: dup
    //   383: iconst_0
    //   384: iload 6
    //   386: invokestatic 175	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   389: aastore
    //   390: dup
    //   391: iconst_1
    //   392: sipush 5000
    //   395: invokestatic 175	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   398: aastore
    //   399: dup
    //   400: iconst_2
    //   401: lload 9
    //   403: invokestatic 180	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   406: aastore
    //   407: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: ldc 28
    //   412: invokestatic 186	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   415: return
    //   416: astore_2
    //   417: aconst_null
    //   418: astore_3
    //   419: aload_3
    //   420: astore_1
    //   421: ldc 120
    //   423: aload_2
    //   424: ldc 188
    //   426: iconst_0
    //   427: anewarray 170	java/lang/Object
    //   430: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   433: aload_3
    //   434: astore_1
    //   435: new 38	java/lang/StringBuilder
    //   438: astore 8
    //   440: aload_3
    //   441: astore_1
    //   442: aload 8
    //   444: ldc 194
    //   446: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   449: aload_3
    //   450: astore_1
    //   451: ldc 120
    //   453: aload 8
    //   455: aload_2
    //   456: invokevirtual 195	java/lang/Exception:toString	()Ljava/lang/String;
    //   459: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   465: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   468: aload_3
    //   469: ifnull -190 -> 279
    //   472: aload_3
    //   473: invokeinterface 90 1 0
    //   478: goto -199 -> 279
    //   481: astore_1
    //   482: aload_2
    //   483: astore_3
    //   484: aload_3
    //   485: ifnull +9 -> 494
    //   488: aload_3
    //   489: invokeinterface 90 1 0
    //   494: ldc 28
    //   496: invokestatic 186	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   499: aload_1
    //   500: athrow
    //   501: astore_1
    //   502: iconst_0
    //   503: istore 7
    //   505: aconst_null
    //   506: astore_3
    //   507: aload_3
    //   508: astore_2
    //   509: ldc 120
    //   511: aload_1
    //   512: ldc 188
    //   514: iconst_0
    //   515: anewarray 170	java/lang/Object
    //   518: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   521: aload_3
    //   522: astore_2
    //   523: new 38	java/lang/StringBuilder
    //   526: astore 8
    //   528: aload_3
    //   529: astore_2
    //   530: aload 8
    //   532: ldc 200
    //   534: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   537: aload_3
    //   538: astore_2
    //   539: ldc 120
    //   541: aload 8
    //   543: aload_1
    //   544: invokevirtual 195	java/lang/Exception:toString	()Ljava/lang/String;
    //   547: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   553: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   556: iload 7
    //   558: istore 6
    //   560: lload 11
    //   562: lstore 9
    //   564: aload_3
    //   565: ifnull -191 -> 374
    //   568: aload_3
    //   569: invokeinterface 90 1 0
    //   574: iload 7
    //   576: istore 6
    //   578: lload 11
    //   580: lstore 9
    //   582: goto -208 -> 374
    //   585: astore_1
    //   586: aconst_null
    //   587: astore_2
    //   588: aload_2
    //   589: ifnull +9 -> 598
    //   592: aload_2
    //   593: invokeinterface 90 1 0
    //   598: ldc 28
    //   600: invokestatic 186	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   603: aload_1
    //   604: athrow
    //   605: astore_1
    //   606: goto -18 -> 588
    //   609: astore_1
    //   610: iconst_0
    //   611: istore 7
    //   613: goto -106 -> 507
    //   616: astore_1
    //   617: goto -110 -> 507
    //   620: astore_1
    //   621: aconst_null
    //   622: astore_3
    //   623: goto -116 -> 507
    //   626: astore_3
    //   627: aload_1
    //   628: astore_2
    //   629: aload_3
    //   630: astore_1
    //   631: aload_2
    //   632: astore_3
    //   633: goto -149 -> 484
    //   636: astore_2
    //   637: goto -218 -> 419
    //   640: iconst_0
    //   641: istore 7
    //   643: goto -317 -> 326
    //
    // Exception table:
    //   from	to	target	type
    //   16	54	416	java/lang/Exception
    //   165	182	416	java/lang/Exception
    //   187	208	416	java/lang/Exception
    //   213	234	416	java/lang/Exception
    //   239	260	416	java/lang/Exception
    //   267	279	416	java/lang/Exception
    //   16	54	481	finally
    //   165	182	481	finally
    //   187	208	481	finally
    //   213	234	481	finally
    //   239	260	481	finally
    //   267	279	481	finally
    //   282	304	501	java/lang/Exception
    //   282	304	585	finally
    //   350	365	585	finally
    //   306	315	605	finally
    //   317	326	605	finally
    //   328	334	605	finally
    //   509	521	605	finally
    //   523	528	605	finally
    //   530	537	605	finally
    //   539	556	605	finally
    //   306	315	609	java/lang/Exception
    //   317	326	609	java/lang/Exception
    //   328	334	616	java/lang/Exception
    //   350	365	620	java/lang/Exception
    //   56	66	626	finally
    //   77	86	626	finally
    //   93	103	626	finally
    //   105	115	626	finally
    //   123	133	626	finally
    //   141	151	626	finally
    //   159	165	626	finally
    //   421	433	626	finally
    //   435	440	626	finally
    //   442	449	626	finally
    //   451	468	626	finally
    //   56	66	636	java/lang/Exception
    //   77	86	636	java/lang/Exception
    //   93	103	636	java/lang/Exception
    //   105	115	636	java/lang/Exception
    //   123	133	636	java/lang/Exception
    //   141	151	636	java/lang/Exception
    //   159	165	636	java/lang/Exception
  }

  public final boolean P(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(80284);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but path is null. [%s, %s] ", new Object[] { paramString1, paramString2 });
      bool = false;
      AppMethodBeat.o(80284);
    }
    while (true)
    {
      return bool;
      int i = com.tencent.mm.a.e.cs(paramString1);
      int j = com.tencent.mm.a.e.cs(paramString2);
      if ((i <= 0) || (j <= 0))
      {
        ab.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but file size is zero.[%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        bool = false;
        AppMethodBeat.o(80284);
      }
      else
      {
        String str = g.cz(paramString1);
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.MediaCheckDuplicationStorage", "import file is not null, but md5 is null, path " + paramString1 + " size : " + i);
          bool = false;
          AppMethodBeat.o(80284);
        }
        else
        {
          long l1 = bo.yz();
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("md5", str);
          localContentValues.put("size", Integer.valueOf(i));
          localContentValues.put("createtime", Long.valueOf(bo.anU()));
          localContentValues.put("remuxing", paramString2);
          localContentValues.put("duration", Integer.valueOf(paramInt));
          localContentValues.put("status", Integer.valueOf(100));
          long l2 = this.bSd.insert("MediaDuplication", "", localContentValues);
          ab.i("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing ret[%d], size[%d], md5[%s], remuxingPath[%s], importPath[%s], duration[%d], cost time[%d]", new Object[] { Long.valueOf(l2), Integer.valueOf(i), str, paramString2, paramString1, Integer.valueOf(paramInt), Long.valueOf(bo.az(l1)) });
          if (l2 > 0L)
          {
            bool = true;
            AppMethodBeat.o(80284);
          }
          else
          {
            bool = false;
            AppMethodBeat.o(80284);
          }
        }
      }
    }
  }

  public final boolean a(String paramString, PString paramPString, PInt paramPInt)
  {
    AppMethodBeat.i(80285);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.d("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but import path is null.");
      bool = false;
      AppMethodBeat.o(80285);
    }
    while (true)
    {
      return bool;
      int i = com.tencent.mm.a.e.cs(paramString);
      if (i <= 0)
      {
        ab.w("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but file size is zero. path : ".concat(String.valueOf(paramString)));
        bool = false;
        AppMethodBeat.o(80285);
      }
      else
      {
        String str = g.cz(paramString);
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but md5 is null. path : ".concat(String.valueOf(paramString)));
          bool = false;
          AppMethodBeat.o(80285);
        }
        else
        {
          Object localObject1 = "select remuxing, duration from MediaDuplication  where md5 = '" + str + "' AND  size = " + i + " AND status = 100";
          long l = bo.yz();
          paramString = null;
          Object localObject2 = null;
          try
          {
            localObject1 = this.bSd.a((String)localObject1, null, 2);
            if (localObject1 != null)
            {
              localObject2 = localObject1;
              paramString = (String)localObject1;
              if (((Cursor)localObject1).moveToFirst())
              {
                localObject2 = localObject1;
                paramString = (String)localObject1;
                paramPString.value = ((Cursor)localObject1).getString(0);
                localObject2 = localObject1;
                paramString = (String)localObject1;
                paramPInt.value = ((Cursor)localObject1).getInt(1);
              }
            }
            if (localObject1 != null)
              ((Cursor)localObject1).close();
            if (bo.isNullOrNil(paramPString.value))
            {
              ab.d("MicroMsg.MediaCheckDuplicationStorage", "it has no remuxing path.");
              bool = false;
              AppMethodBeat.o(80285);
              continue;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              paramString = localObject2;
              ab.printErrStackTrace("MicroMsg.MediaCheckDuplicationStorage", localException, "", new Object[0]);
              paramString = localObject2;
              localObject1 = new java/lang/StringBuilder;
              paramString = localObject2;
              ((StringBuilder)localObject1).<init>("check video remuxing error: ");
              paramString = localObject2;
              ab.e("MicroMsg.MediaCheckDuplicationStorage", localException.toString());
              if (localObject2 != null)
                localObject2.close();
            }
          }
          finally
          {
            if (paramString != null)
              paramString.close();
            AppMethodBeat.o(80285);
          }
          if (com.tencent.mm.a.e.cs(paramPString.value) <= 0)
          {
            ab.w("MicroMsg.MediaCheckDuplicationStorage", "remuxing file size is zero, delete db record now. remuxing path : " + paramPString.value);
            this.bSd.delete("MediaDuplication", "md5=? AND size=? AND status=?", new String[] { str, String.valueOf(i), "100" });
            paramPString.value = null;
            bool = false;
            AppMethodBeat.o(80285);
          }
          else
          {
            ab.i("MicroMsg.MediaCheckDuplicationStorage", "check remuxing file success. remuxing path[%s], duration [%d], cost time[%d]", new Object[] { paramPString.value, Integer.valueOf(paramPInt.value), Long.valueOf(bo.az(l)) });
            bool = true;
            AppMethodBeat.o(80285);
          }
        }
      }
    }
  }

  public final boolean apK()
  {
    return false;
  }

  public final String es(String paramString, int paramInt)
  {
    AppMethodBeat.i(80283);
    Object localObject;
    if ((bo.isNullOrNil(paramString)) || (paramInt <= 0))
    {
      ab.e("MicroMsg.MediaCheckDuplicationStorage", "check  md5:%s size:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
      localObject = "";
      AppMethodBeat.o(80283);
    }
    while (true)
    {
      return localObject;
      String str = "select path from MediaDuplication where md5 = '" + paramString + "' and  size = " + paramInt + " and status != 100";
      localObject = this.bSd.a(str, null, 2);
      if (localObject == null)
      {
        ab.e("MicroMsg.MediaCheckDuplicationStorage", "check query return null sql:%s", new Object[] { str });
        localObject = null;
        AppMethodBeat.o(80283);
      }
      else
      {
        str = "";
        if (((Cursor)localObject).moveToNext())
          str = ((Cursor)localObject).getString(0);
        ((Cursor)localObject).close();
        localObject = str;
        if (!bo.isNullOrNil(str))
        {
          int i = com.tencent.mm.a.e.cs(str);
          localObject = str;
          if (i <= 0)
          {
            ab.w("MicroMsg.MediaCheckDuplicationStorage", "check file size is zero, delete db record now. path[%s], fileSize[%d], size[%d]", new Object[] { str, Integer.valueOf(i), Integer.valueOf(paramInt) });
            this.bSd.delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[] { paramString, String.valueOf(paramInt), "100" });
            localObject = "";
          }
        }
        AppMethodBeat.o(80283);
      }
    }
  }

  public final boolean y(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(80282);
    boolean bool;
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.MediaCheckDuplicationStorage", "insert path is null");
      AppMethodBeat.o(80282);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = paramInt;
      if (paramInt <= 0)
      {
        i = com.tencent.mm.a.e.cs(paramString2);
        if (i <= 0)
        {
          ab.e("MicroMsg.MediaCheckDuplicationStorage", "insert path insize:%d size:%d  path:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramString2 });
          AppMethodBeat.o(80282);
          bool = false;
        }
      }
      else
      {
        String str = paramString1;
        if (bo.isNullOrNil(paramString1))
        {
          paramString1 = g.cz(paramString2);
          str = paramString1;
          if (bo.isNullOrNil(paramString1))
          {
            ab.e("MicroMsg.MediaCheckDuplicationStorage", "insert path read md5 failed  path:%s", new Object[] { paramString2 });
            AppMethodBeat.o(80282);
            bool = false;
          }
        }
        else
        {
          paramString1 = new ContentValues();
          paramString1.put("md5", str);
          paramString1.put("size", Integer.valueOf(i));
          paramString1.put("path", paramString2);
          paramString1.put("createtime", Long.valueOf(bo.anU()));
          paramString1.put("status", Integer.valueOf(101));
          long l = this.bSd.insert("MediaDuplication", "", paramString1);
          ab.i("MicroMsg.MediaCheckDuplicationStorage", "insert Ret:%d size:%d md5:%s path:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), str, paramString2 });
          if (l > 0L)
          {
            AppMethodBeat.o(80282);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(80282);
            bool = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bh
 * JD-Core Version:    0.6.2
 */