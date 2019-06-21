package com.tencent.mm.plugin.hardwareopt.c;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asz;
import com.tencent.mm.protocal.protobuf.bbg;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements com.tencent.mm.vending.c.a<asz, Context>
{
  private Context mContext = null;

  private static String OB(String paramString)
  {
    AppMethodBeat.i(59277);
    Object localObject1 = null;
    String str1 = null;
    String str2 = str1;
    Object localObject2 = localObject1;
    try
    {
      if (Build.VERSION.SDK_INT >= 18)
      {
        str2 = str1;
        localObject2 = localObject1;
        paramString = MediaCodec.createEncoderByType(paramString);
        str2 = paramString;
        localObject2 = paramString;
        str1 = paramString.getName();
        str2 = str1;
        if (paramString != null)
          paramString.release();
        AppMethodBeat.o(59277);
        paramString = str2;
      }
      while (true)
      {
        return paramString;
        paramString = "too low version";
        AppMethodBeat.o(59277);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        localObject2 = str2;
        ab.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", paramString, "hy: error in handle media codec", new Object[0]);
        paramString = "undefined";
        if (str2 != null)
          str2.release();
        AppMethodBeat.o(59277);
      }
    }
    finally
    {
      if (localObject2 != null)
        ((MediaCodec)localObject2).release();
      AppMethodBeat.o(59277);
    }
    throw paramString;
  }

  private static LinkedList<bbg> bFU()
  {
    AppMethodBeat.i(59278);
    int i = MediaCodecList.getCodecCount();
    LinkedList localLinkedList = new LinkedList();
    HashMap localHashMap = new HashMap();
    Map.Entry localEntry;
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      if (localMediaCodecInfo.isEncoder())
        for (localEntry : localMediaCodecInfo.getSupportedTypes())
        {
          localObject2 = (Set)localHashMap.get(localEntry.toLowerCase());
          localObject3 = localObject2;
          if (localObject2 == null)
            localObject3 = new HashSet();
          ((Set)localObject3).add(localMediaCodecInfo.getName());
          localHashMap.put(localEntry.toLowerCase(), localObject3);
        }
    }
    ab.i("MicroMsg.TaskFindHardwareInfo", "hy: allCodecNames: %s", new Object[] { localHashMap });
    Object localObject3 = localHashMap.entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localEntry = (Map.Entry)((Iterator)localObject3).next();
      ??? = new bbg();
      ((bbg)???).clY = ((String)localEntry.getKey());
      localObject2 = new LinkedList();
      if (localEntry.getValue() != null)
        ((LinkedList)localObject2).addAll((Collection)localEntry.getValue());
      ((bbg)???).wFX = ((LinkedList)localObject2);
      localLinkedList.add(???);
    }
    AppMethodBeat.o(59278);
    return localLinkedList;
  }

  // ERROR //
  private asz ek(Context paramContext)
  {
    // Byte code:
    //   0: ldc 176
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: putfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   10: invokestatic 182	java/lang/System:nanoTime	()J
    //   13: lstore_2
    //   14: new 184	com/tencent/mm/protocal/protobuf/hj
    //   17: astore_1
    //   18: aload_1
    //   19: invokespecial 185	com/tencent/mm/protocal/protobuf/hj:<init>	()V
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   27: invokestatic 191	com/tencent/mm/sdk/platformtools/bo:gN	(Landroid/content/Context;)Ljava/lang/String;
    //   30: putfield 194	com/tencent/mm/protocal/protobuf/hj:imei	Ljava/lang/String;
    //   33: aload_1
    //   34: getfield 194	com/tencent/mm/protocal/protobuf/hj:imei	Ljava/lang/String;
    //   37: invokestatic 198	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   40: ifeq +62 -> 102
    //   43: ldc 55
    //   45: ldc 200
    //   47: invokestatic 204	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: new 9	com/tencent/mm/plugin/hardwareopt/c/a$a
    //   53: astore_1
    //   54: aload_1
    //   55: invokespecial 205	com/tencent/mm/plugin/hardwareopt/c/a$a:<init>	()V
    //   58: ldc 176
    //   60: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: ldc 55
    //   68: aload_1
    //   69: ldc 207
    //   71: iconst_0
    //   72: anewarray 5	java/lang/Object
    //   75: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: invokestatic 213	com/tencent/mm/vending/g/f:dMo	()Lcom/tencent/mm/vending/g/b;
    //   81: astore_1
    //   82: aload_1
    //   83: ifnull +10 -> 93
    //   86: aload_1
    //   87: aconst_null
    //   88: invokeinterface 219 2 0
    //   93: aconst_null
    //   94: astore_1
    //   95: ldc 176
    //   97: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: areturn
    //   102: aload_1
    //   103: getstatic 224	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   106: putfield 227	com/tencent/mm/protocal/protobuf/hj:vJX	Ljava/lang/String;
    //   109: aload_1
    //   110: getstatic 230	android/os/Build:MODEL	Ljava/lang/String;
    //   113: putfield 233	com/tencent/mm/protocal/protobuf/hj:vJY	Ljava/lang/String;
    //   116: aload_1
    //   117: getstatic 236	android/os/Build$VERSION:INCREMENTAL	Ljava/lang/String;
    //   120: putfield 239	com/tencent/mm/protocal/protobuf/hj:vJZ	Ljava/lang/String;
    //   123: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   126: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   129: aload_1
    //   130: putfield 255	com/tencent/mm/protocal/protobuf/asz:wwG	Lcom/tencent/mm/protocal/protobuf/hj;
    //   133: ldc 55
    //   135: ldc_w 257
    //   138: iconst_4
    //   139: anewarray 5	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_1
    //   145: getfield 194	com/tencent/mm/protocal/protobuf/hj:imei	Ljava/lang/String;
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: aload_1
    //   152: getfield 227	com/tencent/mm/protocal/protobuf/hj:vJX	Ljava/lang/String;
    //   155: aastore
    //   156: dup
    //   157: iconst_2
    //   158: aload_1
    //   159: getfield 233	com/tencent/mm/protocal/protobuf/hj:vJY	Ljava/lang/String;
    //   162: aastore
    //   163: dup
    //   164: iconst_3
    //   165: aload_1
    //   166: getfield 239	com/tencent/mm/protocal/protobuf/hj:vJZ	Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: new 262	com/tencent/mm/protocal/protobuf/na
    //   176: astore 4
    //   178: aload 4
    //   180: invokespecial 263	com/tencent/mm/protocal/protobuf/na:<init>	()V
    //   183: aload 4
    //   185: getstatic 266	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   188: putfield 269	com/tencent/mm/protocal/protobuf/na:vRD	Ljava/lang/String;
    //   191: invokestatic 275	com/tencent/mm/compatible/e/n:LA	()Ljava/util/Map;
    //   194: astore_1
    //   195: aload 4
    //   197: aload_1
    //   198: ldc_w 277
    //   201: invokeinterface 105 2 0
    //   206: checkcast 96	java/lang/String
    //   209: ldc_w 279
    //   212: invokestatic 283	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   215: putfield 286	com/tencent/mm/protocal/protobuf/na:vRB	Ljava/lang/String;
    //   218: aload 4
    //   220: aload_1
    //   221: ldc_w 288
    //   224: invokeinterface 105 2 0
    //   229: checkcast 96	java/lang/String
    //   232: putfield 289	com/tencent/mm/protocal/protobuf/na:vJY	Ljava/lang/String;
    //   235: aload 4
    //   237: aload_1
    //   238: ldc_w 291
    //   241: invokeinterface 105 2 0
    //   246: checkcast 96	java/lang/String
    //   249: putfield 294	com/tencent/mm/protocal/protobuf/na:vRE	Ljava/lang/String;
    //   252: new 296	java/io/RandomAccessFile
    //   255: astore 5
    //   257: aload 5
    //   259: ldc_w 298
    //   262: ldc_w 300
    //   265: invokespecial 302	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   268: aload 5
    //   270: astore_1
    //   271: aload 4
    //   273: aload 5
    //   275: invokevirtual 305	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   278: iconst_m1
    //   279: invokestatic 309	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   282: sipush 1000
    //   285: idiv
    //   286: putfield 312	com/tencent/mm/protocal/protobuf/na:vRC	I
    //   289: aload 5
    //   291: invokevirtual 315	java/io/RandomAccessFile:close	()V
    //   294: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   297: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   300: aload 4
    //   302: putfield 319	com/tencent/mm/protocal/protobuf/asz:wwH	Lcom/tencent/mm/protocal/protobuf/na;
    //   305: ldc 55
    //   307: ldc_w 321
    //   310: iconst_5
    //   311: anewarray 5	java/lang/Object
    //   314: dup
    //   315: iconst_0
    //   316: aload 4
    //   318: getfield 269	com/tencent/mm/protocal/protobuf/na:vRD	Ljava/lang/String;
    //   321: aastore
    //   322: dup
    //   323: iconst_1
    //   324: aload 4
    //   326: getfield 286	com/tencent/mm/protocal/protobuf/na:vRB	Ljava/lang/String;
    //   329: aastore
    //   330: dup
    //   331: iconst_2
    //   332: aload 4
    //   334: getfield 312	com/tencent/mm/protocal/protobuf/na:vRC	I
    //   337: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: aload 4
    //   345: getfield 289	com/tencent/mm/protocal/protobuf/na:vJY	Ljava/lang/String;
    //   348: aastore
    //   349: dup
    //   350: iconst_4
    //   351: aload 4
    //   353: getfield 294	com/tencent/mm/protocal/protobuf/na:vRE	Ljava/lang/String;
    //   356: aastore
    //   357: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: aload_0
    //   361: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   364: ldc_w 329
    //   367: invokevirtual 335	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   370: checkcast 337	android/app/ActivityManager
    //   373: astore 5
    //   375: new 339	android/app/ActivityManager$MemoryInfo
    //   378: astore_1
    //   379: aload_1
    //   380: invokespecial 340	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   383: aload 5
    //   385: aload_1
    //   386: invokevirtual 344	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   389: new 346	com/tencent/mm/protocal/protobuf/bba
    //   392: astore 5
    //   394: aload 5
    //   396: invokespecial 347	com/tencent/mm/protocal/protobuf/bba:<init>	()V
    //   399: aload 5
    //   401: aload_1
    //   402: getfield 351	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   405: ldc2_w 352
    //   408: ldiv
    //   409: ldc2_w 352
    //   412: ldiv
    //   413: l2i
    //   414: putfield 356	com/tencent/mm/protocal/protobuf/bba:wFN	I
    //   417: aload 5
    //   419: aload_1
    //   420: getfield 359	android/app/ActivityManager$MemoryInfo:threshold	J
    //   423: ldc2_w 352
    //   426: ldiv
    //   427: ldc2_w 352
    //   430: ldiv
    //   431: l2i
    //   432: putfield 362	com/tencent/mm/protocal/protobuf/bba:wFO	I
    //   435: aload 5
    //   437: aload_0
    //   438: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   441: ldc_w 329
    //   444: invokevirtual 335	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   447: checkcast 337	android/app/ActivityManager
    //   450: invokevirtual 365	android/app/ActivityManager:getLargeMemoryClass	()I
    //   453: putfield 368	com/tencent/mm/protocal/protobuf/bba:wFP	I
    //   456: aload 5
    //   458: aload_0
    //   459: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   462: ldc_w 329
    //   465: invokevirtual 335	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   468: checkcast 337	android/app/ActivityManager
    //   471: invokevirtual 371	android/app/ActivityManager:getMemoryClass	()I
    //   474: putfield 374	com/tencent/mm/protocal/protobuf/bba:ggb	I
    //   477: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   480: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   483: aload 5
    //   485: putfield 378	com/tencent/mm/protocal/protobuf/asz:wwI	Lcom/tencent/mm/protocal/protobuf/bba;
    //   488: ldc 55
    //   490: ldc_w 380
    //   493: iconst_4
    //   494: anewarray 5	java/lang/Object
    //   497: dup
    //   498: iconst_0
    //   499: aload 5
    //   501: getfield 356	com/tencent/mm/protocal/protobuf/bba:wFN	I
    //   504: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   507: aastore
    //   508: dup
    //   509: iconst_1
    //   510: aload 5
    //   512: getfield 362	com/tencent/mm/protocal/protobuf/bba:wFO	I
    //   515: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   518: aastore
    //   519: dup
    //   520: iconst_2
    //   521: aload 5
    //   523: getfield 368	com/tencent/mm/protocal/protobuf/bba:wFP	I
    //   526: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   529: aastore
    //   530: dup
    //   531: iconst_3
    //   532: aload 5
    //   534: getfield 374	com/tencent/mm/protocal/protobuf/bba:ggb	I
    //   537: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   540: aastore
    //   541: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   544: new 382	android/os/StatFs
    //   547: astore_1
    //   548: aload_1
    //   549: getstatic 387	com/tencent/mm/compatible/util/e:eSl	Ljava/lang/String;
    //   552: invokespecial 390	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   555: new 392	com/tencent/mm/protocal/protobuf/cdp
    //   558: astore 5
    //   560: aload 5
    //   562: invokespecial 393	com/tencent/mm/protocal/protobuf/cdp:<init>	()V
    //   565: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   568: bipush 18
    //   570: if_icmplt +1280 -> 1850
    //   573: aload 5
    //   575: aload_1
    //   576: invokevirtual 396	android/os/StatFs:getTotalBytes	()J
    //   579: ldc2_w 352
    //   582: ldiv
    //   583: ldc2_w 352
    //   586: ldiv
    //   587: l2i
    //   588: putfield 399	com/tencent/mm/protocal/protobuf/cdp:xdo	I
    //   591: aload 5
    //   593: invokestatic 404	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   596: ldc_w 406
    //   599: invokevirtual 409	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   602: putfield 413	com/tencent/mm/protocal/protobuf/cdp:xdp	Z
    //   605: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   608: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   611: aload 5
    //   613: putfield 417	com/tencent/mm/protocal/protobuf/asz:wwJ	Lcom/tencent/mm/protocal/protobuf/cdp;
    //   616: ldc 55
    //   618: ldc_w 419
    //   621: iconst_2
    //   622: anewarray 5	java/lang/Object
    //   625: dup
    //   626: iconst_0
    //   627: aload 5
    //   629: getfield 399	com/tencent/mm/protocal/protobuf/cdp:xdo	I
    //   632: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   635: aastore
    //   636: dup
    //   637: iconst_1
    //   638: aload 5
    //   640: getfield 413	com/tencent/mm/protocal/protobuf/cdp:xdp	Z
    //   643: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   646: aastore
    //   647: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   650: aload_0
    //   651: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   654: ldc_w 329
    //   657: invokevirtual 335	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   660: checkcast 337	android/app/ActivityManager
    //   663: invokevirtual 428	android/app/ActivityManager:getDeviceConfigurationInfo	()Landroid/content/pm/ConfigurationInfo;
    //   666: astore 5
    //   668: new 430	com/tencent/mm/protocal/protobuf/acu
    //   671: astore 6
    //   673: aload 6
    //   675: invokespecial 431	com/tencent/mm/protocal/protobuf/acu:<init>	()V
    //   678: aload 5
    //   680: getfield 436	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   683: ldc_w 437
    //   686: if_icmplt +1192 -> 1878
    //   689: iconst_1
    //   690: istore 7
    //   692: aload 6
    //   694: iload 7
    //   696: putfield 440	com/tencent/mm/protocal/protobuf/acu:wkx	Z
    //   699: aload 5
    //   701: getfield 436	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   704: ldc_w 441
    //   707: if_icmplt +1177 -> 1884
    //   710: iconst_1
    //   711: istore 7
    //   713: aload 6
    //   715: iload 7
    //   717: putfield 444	com/tencent/mm/protocal/protobuf/acu:wky	Z
    //   720: ldc_w 446
    //   723: invokestatic 452	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   726: pop
    //   727: aload 6
    //   729: iconst_0
    //   730: putfield 455	com/tencent/mm/protocal/protobuf/acu:wkz	Z
    //   733: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   736: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   739: aload 6
    //   741: putfield 459	com/tencent/mm/protocal/protobuf/asz:wwN	Lcom/tencent/mm/protocal/protobuf/acu;
    //   744: ldc 55
    //   746: ldc_w 461
    //   749: iconst_4
    //   750: anewarray 5	java/lang/Object
    //   753: dup
    //   754: iconst_0
    //   755: aload 6
    //   757: getfield 440	com/tencent/mm/protocal/protobuf/acu:wkx	Z
    //   760: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   763: aastore
    //   764: dup
    //   765: iconst_1
    //   766: aload 6
    //   768: getfield 444	com/tencent/mm/protocal/protobuf/acu:wky	Z
    //   771: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   774: aastore
    //   775: dup
    //   776: iconst_2
    //   777: aload 5
    //   779: getfield 436	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   782: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   785: aastore
    //   786: dup
    //   787: iconst_3
    //   788: aload 6
    //   790: getfield 455	com/tencent/mm/protocal/protobuf/acu:wkz	Z
    //   793: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   796: aastore
    //   797: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   800: aload_0
    //   801: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   804: ldc_w 463
    //   807: invokevirtual 335	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   810: checkcast 465	android/view/WindowManager
    //   813: invokeinterface 469 1 0
    //   818: astore 5
    //   820: new 471	android/graphics/Point
    //   823: astore_1
    //   824: aload_1
    //   825: invokespecial 472	android/graphics/Point:<init>	()V
    //   828: aload 5
    //   830: aload_1
    //   831: invokevirtual 478	android/view/Display:getSize	(Landroid/graphics/Point;)V
    //   834: aload_1
    //   835: getfield 481	android/graphics/Point:x	I
    //   838: istore 8
    //   840: aload_1
    //   841: getfield 484	android/graphics/Point:y	I
    //   844: istore 9
    //   846: new 486	com/tencent/mm/protocal/protobuf/buk
    //   849: astore_1
    //   850: aload_1
    //   851: invokespecial 487	com/tencent/mm/protocal/protobuf/buk:<init>	()V
    //   854: new 489	java/lang/StringBuilder
    //   857: astore 5
    //   859: aload 5
    //   861: invokespecial 490	java/lang/StringBuilder:<init>	()V
    //   864: aload_1
    //   865: aload 5
    //   867: iload 8
    //   869: invokestatic 493	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   872: invokevirtual 497	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   875: ldc_w 498
    //   878: invokevirtual 497	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   881: iload 9
    //   883: invokevirtual 501	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   886: invokevirtual 504	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   889: putfield 507	com/tencent/mm/protocal/protobuf/buk:wWb	Ljava/lang/String;
    //   892: aload_1
    //   893: aload_0
    //   894: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   897: invokevirtual 511	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   900: invokevirtual 517	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   903: getfield 523	android/util/DisplayMetrics:density	F
    //   906: f2i
    //   907: putfield 525	com/tencent/mm/protocal/protobuf/buk:density	I
    //   910: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   913: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   916: aload_1
    //   917: putfield 529	com/tencent/mm/protocal/protobuf/asz:wwK	Lcom/tencent/mm/protocal/protobuf/buk;
    //   920: ldc 55
    //   922: ldc_w 531
    //   925: iconst_2
    //   926: anewarray 5	java/lang/Object
    //   929: dup
    //   930: iconst_0
    //   931: aload_1
    //   932: getfield 507	com/tencent/mm/protocal/protobuf/buk:wWb	Ljava/lang/String;
    //   935: aastore
    //   936: dup
    //   937: iconst_1
    //   938: aload_1
    //   939: getfield 525	com/tencent/mm/protocal/protobuf/buk:density	I
    //   942: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   945: aastore
    //   946: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   949: new 533	com/tencent/mm/protocal/protobuf/td
    //   952: astore 5
    //   954: aload 5
    //   956: invokespecial 534	com/tencent/mm/protocal/protobuf/td:<init>	()V
    //   959: aload 5
    //   961: ldc_w 536
    //   964: invokestatic 538	com/tencent/mm/plugin/hardwareopt/c/a:OB	(Ljava/lang/String;)Ljava/lang/String;
    //   967: putfield 541	com/tencent/mm/protocal/protobuf/td:wav	Ljava/lang/String;
    //   970: aload 5
    //   972: ldc_w 543
    //   975: invokestatic 538	com/tencent/mm/plugin/hardwareopt/c/a:OB	(Ljava/lang/String;)Ljava/lang/String;
    //   978: putfield 546	com/tencent/mm/protocal/protobuf/td:waw	Ljava/lang/String;
    //   981: aload 5
    //   983: invokestatic 548	com/tencent/mm/plugin/hardwareopt/c/a:bFU	()Ljava/util/LinkedList;
    //   986: putfield 551	com/tencent/mm/protocal/protobuf/td:wax	Ljava/util/LinkedList;
    //   989: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   992: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   995: aload 5
    //   997: putfield 555	com/tencent/mm/protocal/protobuf/asz:wwL	Lcom/tencent/mm/protocal/protobuf/td;
    //   1000: aload 5
    //   1002: getfield 541	com/tencent/mm/protocal/protobuf/td:wav	Ljava/lang/String;
    //   1005: astore 6
    //   1007: aload 5
    //   1009: getfield 546	com/tencent/mm/protocal/protobuf/td:waw	Ljava/lang/String;
    //   1012: astore_1
    //   1013: aload 5
    //   1015: getfield 551	com/tencent/mm/protocal/protobuf/td:wax	Ljava/util/LinkedList;
    //   1018: ifnull +895 -> 1913
    //   1021: aload 5
    //   1023: getfield 551	com/tencent/mm/protocal/protobuf/td:wax	Ljava/util/LinkedList;
    //   1026: invokevirtual 558	java/util/LinkedList:size	()I
    //   1029: istore 8
    //   1031: ldc 55
    //   1033: ldc_w 560
    //   1036: iconst_3
    //   1037: anewarray 5	java/lang/Object
    //   1040: dup
    //   1041: iconst_0
    //   1042: aload 6
    //   1044: aastore
    //   1045: dup
    //   1046: iconst_1
    //   1047: aload_1
    //   1048: aastore
    //   1049: dup
    //   1050: iconst_2
    //   1051: iload 8
    //   1053: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1056: aastore
    //   1057: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1060: new 562	com/tencent/mm/protocal/protobuf/abx
    //   1063: astore_1
    //   1064: aload_1
    //   1065: invokespecial 563	com/tencent/mm/protocal/protobuf/abx:<init>	()V
    //   1068: aload_1
    //   1069: aload_0
    //   1070: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1073: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1076: ldc_w 569
    //   1079: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1082: putfield 577	com/tencent/mm/protocal/protobuf/abx:wjw	Z
    //   1085: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   1088: bipush 18
    //   1090: if_icmplt +829 -> 1919
    //   1093: aload_1
    //   1094: aload_0
    //   1095: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1098: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1101: ldc_w 579
    //   1104: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1107: putfield 582	com/tencent/mm/protocal/protobuf/abx:wjx	Z
    //   1110: aload_1
    //   1111: aload_0
    //   1112: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1115: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1118: ldc_w 584
    //   1121: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1124: putfield 587	com/tencent/mm/protocal/protobuf/abx:wjy	Z
    //   1127: aload_1
    //   1128: aload_0
    //   1129: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1132: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1135: ldc_w 589
    //   1138: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1141: putfield 592	com/tencent/mm/protocal/protobuf/abx:wjz	Z
    //   1144: aload_1
    //   1145: aload_0
    //   1146: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1149: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1152: ldc_w 594
    //   1155: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1158: putfield 597	com/tencent/mm/protocal/protobuf/abx:wjA	Z
    //   1161: aload_1
    //   1162: aload_0
    //   1163: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1166: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1169: ldc_w 599
    //   1172: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1175: putfield 602	com/tencent/mm/protocal/protobuf/abx:wjB	Z
    //   1178: aload_1
    //   1179: aload_0
    //   1180: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1183: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1186: ldc_w 604
    //   1189: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1192: putfield 607	com/tencent/mm/protocal/protobuf/abx:wjC	Z
    //   1195: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   1198: bipush 19
    //   1200: if_icmplt +727 -> 1927
    //   1203: aload_1
    //   1204: aload_0
    //   1205: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1208: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1211: ldc_w 609
    //   1214: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1217: putfield 612	com/tencent/mm/protocal/protobuf/abx:wjN	Z
    //   1220: aload_1
    //   1221: aload_0
    //   1222: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1225: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1228: ldc_w 604
    //   1231: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1234: putfield 615	com/tencent/mm/protocal/protobuf/abx:wjD	Z
    //   1237: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   1240: bipush 23
    //   1242: if_icmplt +693 -> 1935
    //   1245: aload_1
    //   1246: aload_0
    //   1247: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1250: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1253: ldc_w 617
    //   1256: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1259: putfield 620	com/tencent/mm/protocal/protobuf/abx:wjE	Z
    //   1262: aload_1
    //   1263: aload_0
    //   1264: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1267: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1270: ldc_w 622
    //   1273: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1276: putfield 625	com/tencent/mm/protocal/protobuf/abx:wjF	Z
    //   1279: aload_1
    //   1280: aload_0
    //   1281: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1284: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1287: ldc_w 627
    //   1290: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1293: putfield 630	com/tencent/mm/protocal/protobuf/abx:wjG	Z
    //   1296: aload_1
    //   1297: aload_0
    //   1298: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1301: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1304: ldc_w 632
    //   1307: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1310: putfield 635	com/tencent/mm/protocal/protobuf/abx:wjH	Z
    //   1313: aload_1
    //   1314: aload_0
    //   1315: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1318: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1321: ldc_w 637
    //   1324: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1327: putfield 640	com/tencent/mm/protocal/protobuf/abx:wjI	Z
    //   1330: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   1333: bipush 19
    //   1335: if_icmplt +626 -> 1961
    //   1338: aload_1
    //   1339: aload_0
    //   1340: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1343: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1346: ldc_w 642
    //   1349: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1352: putfield 645	com/tencent/mm/protocal/protobuf/abx:wjJ	Z
    //   1355: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   1358: bipush 19
    //   1360: if_icmplt +609 -> 1969
    //   1363: aload_1
    //   1364: aload_0
    //   1365: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1368: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1371: ldc_w 647
    //   1374: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1377: putfield 650	com/tencent/mm/protocal/protobuf/abx:wjK	Z
    //   1380: aload_1
    //   1381: aload_0
    //   1382: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1385: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1388: ldc_w 652
    //   1391: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1394: putfield 655	com/tencent/mm/protocal/protobuf/abx:wjL	Z
    //   1397: aload_1
    //   1398: aload_0
    //   1399: getfield 17	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1402: invokevirtual 567	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1405: ldc_w 657
    //   1408: invokevirtual 574	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1411: putfield 660	com/tencent/mm/protocal/protobuf/abx:wjM	Z
    //   1414: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   1417: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   1420: aload_1
    //   1421: putfield 664	com/tencent/mm/protocal/protobuf/asz:wwM	Lcom/tencent/mm/protocal/protobuf/abx;
    //   1424: ldc 55
    //   1426: ldc_w 666
    //   1429: bipush 18
    //   1431: anewarray 5	java/lang/Object
    //   1434: dup
    //   1435: iconst_0
    //   1436: aload_1
    //   1437: getfield 577	com/tencent/mm/protocal/protobuf/abx:wjw	Z
    //   1440: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1443: aastore
    //   1444: dup
    //   1445: iconst_1
    //   1446: aload_1
    //   1447: getfield 582	com/tencent/mm/protocal/protobuf/abx:wjx	Z
    //   1450: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1453: aastore
    //   1454: dup
    //   1455: iconst_2
    //   1456: aload_1
    //   1457: getfield 587	com/tencent/mm/protocal/protobuf/abx:wjy	Z
    //   1460: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1463: aastore
    //   1464: dup
    //   1465: iconst_3
    //   1466: aload_1
    //   1467: getfield 592	com/tencent/mm/protocal/protobuf/abx:wjz	Z
    //   1470: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1473: aastore
    //   1474: dup
    //   1475: iconst_4
    //   1476: aload_1
    //   1477: getfield 597	com/tencent/mm/protocal/protobuf/abx:wjA	Z
    //   1480: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1483: aastore
    //   1484: dup
    //   1485: iconst_5
    //   1486: aload_1
    //   1487: getfield 602	com/tencent/mm/protocal/protobuf/abx:wjB	Z
    //   1490: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1493: aastore
    //   1494: dup
    //   1495: bipush 6
    //   1497: aload_1
    //   1498: getfield 607	com/tencent/mm/protocal/protobuf/abx:wjC	Z
    //   1501: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1504: aastore
    //   1505: dup
    //   1506: bipush 7
    //   1508: aload_1
    //   1509: getfield 612	com/tencent/mm/protocal/protobuf/abx:wjN	Z
    //   1512: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1515: aastore
    //   1516: dup
    //   1517: bipush 8
    //   1519: aload_1
    //   1520: getfield 615	com/tencent/mm/protocal/protobuf/abx:wjD	Z
    //   1523: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1526: aastore
    //   1527: dup
    //   1528: bipush 9
    //   1530: aload_1
    //   1531: getfield 620	com/tencent/mm/protocal/protobuf/abx:wjE	Z
    //   1534: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1537: aastore
    //   1538: dup
    //   1539: bipush 10
    //   1541: aload_1
    //   1542: getfield 625	com/tencent/mm/protocal/protobuf/abx:wjF	Z
    //   1545: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1548: aastore
    //   1549: dup
    //   1550: bipush 11
    //   1552: aload_1
    //   1553: getfield 630	com/tencent/mm/protocal/protobuf/abx:wjG	Z
    //   1556: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1559: aastore
    //   1560: dup
    //   1561: bipush 12
    //   1563: aload_1
    //   1564: getfield 635	com/tencent/mm/protocal/protobuf/abx:wjH	Z
    //   1567: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1570: aastore
    //   1571: dup
    //   1572: bipush 13
    //   1574: aload_1
    //   1575: getfield 640	com/tencent/mm/protocal/protobuf/abx:wjI	Z
    //   1578: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1581: aastore
    //   1582: dup
    //   1583: bipush 14
    //   1585: aload_1
    //   1586: getfield 645	com/tencent/mm/protocal/protobuf/abx:wjJ	Z
    //   1589: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1592: aastore
    //   1593: dup
    //   1594: bipush 15
    //   1596: aload_1
    //   1597: getfield 650	com/tencent/mm/protocal/protobuf/abx:wjK	Z
    //   1600: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1603: aastore
    //   1604: dup
    //   1605: bipush 16
    //   1607: aload_1
    //   1608: getfield 655	com/tencent/mm/protocal/protobuf/abx:wjL	Z
    //   1611: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1614: aastore
    //   1615: dup
    //   1616: bipush 17
    //   1618: aload_1
    //   1619: getfield 660	com/tencent/mm/protocal/protobuf/abx:wjM	Z
    //   1622: invokestatic 424	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1625: aastore
    //   1626: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1629: ldc 55
    //   1631: ldc_w 668
    //   1634: iconst_1
    //   1635: anewarray 5	java/lang/Object
    //   1638: dup
    //   1639: iconst_0
    //   1640: invokestatic 182	java/lang/System:nanoTime	()J
    //   1643: lload_2
    //   1644: lsub
    //   1645: ldc2_w 669
    //   1648: ldiv
    //   1649: ldc2_w 669
    //   1652: ldiv
    //   1653: invokestatic 675	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1656: aastore
    //   1657: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1660: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   1663: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   1666: astore_1
    //   1667: aload_1
    //   1668: ifnull +61 -> 1729
    //   1671: aload_1
    //   1672: getfield 319	com/tencent/mm/protocal/protobuf/asz:wwH	Lcom/tencent/mm/protocal/protobuf/na;
    //   1675: ifnull +25 -> 1700
    //   1678: invokestatic 679	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1681: invokevirtual 685	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1684: getstatic 691	com/tencent/mm/storage/ac$a:xUF	Lcom/tencent/mm/storage/ac$a;
    //   1687: aload_1
    //   1688: getfield 319	com/tencent/mm/protocal/protobuf/asz:wwH	Lcom/tencent/mm/protocal/protobuf/na;
    //   1691: getfield 312	com/tencent/mm/protocal/protobuf/na:vRC	I
    //   1694: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1697: invokevirtual 697	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1700: aload_1
    //   1701: getfield 378	com/tencent/mm/protocal/protobuf/asz:wwI	Lcom/tencent/mm/protocal/protobuf/bba;
    //   1704: ifnull +25 -> 1729
    //   1707: invokestatic 679	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1710: invokevirtual 685	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1713: getstatic 700	com/tencent/mm/storage/ac$a:xUG	Lcom/tencent/mm/storage/ac$a;
    //   1716: aload_1
    //   1717: getfield 378	com/tencent/mm/protocal/protobuf/asz:wwI	Lcom/tencent/mm/protocal/protobuf/bba;
    //   1720: getfield 356	com/tencent/mm/protocal/protobuf/bba:wFN	I
    //   1723: invokestatic 327	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1726: invokevirtual 697	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1729: invokestatic 245	com/tencent/mm/plugin/hardwareopt/b/a:bFS	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   1732: invokevirtual 249	com/tencent/mm/plugin/hardwareopt/b/a:bFT	()Lcom/tencent/mm/protocal/protobuf/asz;
    //   1735: astore_1
    //   1736: ldc 176
    //   1738: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1741: goto -1641 -> 100
    //   1744: astore_1
    //   1745: ldc 55
    //   1747: aload_1
    //   1748: ldc_w 702
    //   1751: iconst_0
    //   1752: anewarray 5	java/lang/Object
    //   1755: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1758: goto -1464 -> 294
    //   1761: astore 6
    //   1763: aconst_null
    //   1764: astore 5
    //   1766: aload 5
    //   1768: astore_1
    //   1769: ldc 55
    //   1771: aload 6
    //   1773: ldc_w 704
    //   1776: iconst_0
    //   1777: anewarray 5	java/lang/Object
    //   1780: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1783: aload 5
    //   1785: ifnull -1491 -> 294
    //   1788: aload 5
    //   1790: invokevirtual 315	java/io/RandomAccessFile:close	()V
    //   1793: goto -1499 -> 294
    //   1796: astore_1
    //   1797: ldc 55
    //   1799: aload_1
    //   1800: ldc_w 702
    //   1803: iconst_0
    //   1804: anewarray 5	java/lang/Object
    //   1807: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1810: goto -1516 -> 294
    //   1813: astore 5
    //   1815: aconst_null
    //   1816: astore_1
    //   1817: aload_1
    //   1818: ifnull +7 -> 1825
    //   1821: aload_1
    //   1822: invokevirtual 315	java/io/RandomAccessFile:close	()V
    //   1825: ldc 176
    //   1827: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1830: aload 5
    //   1832: athrow
    //   1833: astore_1
    //   1834: ldc 55
    //   1836: aload_1
    //   1837: ldc_w 702
    //   1840: iconst_0
    //   1841: anewarray 5	java/lang/Object
    //   1844: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1847: goto -22 -> 1825
    //   1850: aload 5
    //   1852: aload_1
    //   1853: invokevirtual 707	android/os/StatFs:getBlockSize	()I
    //   1856: i2l
    //   1857: aload_1
    //   1858: invokevirtual 710	android/os/StatFs:getAvailableBlocks	()I
    //   1861: i2l
    //   1862: lmul
    //   1863: ldc2_w 352
    //   1866: ldiv
    //   1867: ldc2_w 352
    //   1870: ldiv
    //   1871: l2i
    //   1872: putfield 399	com/tencent/mm/protocal/protobuf/cdp:xdo	I
    //   1875: goto -1284 -> 591
    //   1878: iconst_0
    //   1879: istore 7
    //   1881: goto -1189 -> 692
    //   1884: iconst_0
    //   1885: istore 7
    //   1887: goto -1174 -> 713
    //   1890: astore_1
    //   1891: ldc 55
    //   1893: aload_1
    //   1894: ldc_w 712
    //   1897: iconst_0
    //   1898: anewarray 5	java/lang/Object
    //   1901: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1904: aload 6
    //   1906: iconst_0
    //   1907: putfield 455	com/tencent/mm/protocal/protobuf/acu:wkz	Z
    //   1910: goto -1177 -> 733
    //   1913: iconst_0
    //   1914: istore 8
    //   1916: goto -885 -> 1031
    //   1919: aload_1
    //   1920: iconst_0
    //   1921: putfield 582	com/tencent/mm/protocal/protobuf/abx:wjx	Z
    //   1924: goto -814 -> 1110
    //   1927: aload_1
    //   1928: iconst_0
    //   1929: putfield 612	com/tencent/mm/protocal/protobuf/abx:wjN	Z
    //   1932: goto -712 -> 1220
    //   1935: getstatic 718	com/tencent/mm/compatible/e/q:etg	Lcom/tencent/mm/compatible/e/s;
    //   1938: getfield 723	com/tencent/mm/compatible/e/s:etr	I
    //   1941: iconst_1
    //   1942: if_icmpne +11 -> 1953
    //   1945: aload_1
    //   1946: iconst_1
    //   1947: putfield 620	com/tencent/mm/protocal/protobuf/abx:wjE	Z
    //   1950: goto -688 -> 1262
    //   1953: aload_1
    //   1954: iconst_0
    //   1955: putfield 620	com/tencent/mm/protocal/protobuf/abx:wjE	Z
    //   1958: goto -696 -> 1262
    //   1961: aload_1
    //   1962: iconst_0
    //   1963: putfield 645	com/tencent/mm/protocal/protobuf/abx:wjJ	Z
    //   1966: goto -611 -> 1355
    //   1969: aload_1
    //   1970: iconst_0
    //   1971: putfield 650	com/tencent/mm/protocal/protobuf/abx:wjK	Z
    //   1974: goto -594 -> 1380
    //   1977: astore_1
    //   1978: ldc 55
    //   1980: aload_1
    //   1981: ldc_w 725
    //   1984: iconst_0
    //   1985: anewarray 5	java/lang/Object
    //   1988: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1991: goto -262 -> 1729
    //   1994: astore 5
    //   1996: goto -179 -> 1817
    //   1999: astore 6
    //   2001: goto -235 -> 1766
    //
    // Exception table:
    //   from	to	target	type
    //   14	65	65	java/lang/Exception
    //   102	252	65	java/lang/Exception
    //   289	294	65	java/lang/Exception
    //   294	591	65	java/lang/Exception
    //   591	689	65	java/lang/Exception
    //   692	710	65	java/lang/Exception
    //   713	720	65	java/lang/Exception
    //   720	733	65	java/lang/Exception
    //   733	1031	65	java/lang/Exception
    //   1031	1110	65	java/lang/Exception
    //   1110	1220	65	java/lang/Exception
    //   1220	1262	65	java/lang/Exception
    //   1262	1355	65	java/lang/Exception
    //   1355	1380	65	java/lang/Exception
    //   1380	1660	65	java/lang/Exception
    //   1729	1736	65	java/lang/Exception
    //   1745	1758	65	java/lang/Exception
    //   1788	1793	65	java/lang/Exception
    //   1797	1810	65	java/lang/Exception
    //   1821	1825	65	java/lang/Exception
    //   1825	1833	65	java/lang/Exception
    //   1834	1847	65	java/lang/Exception
    //   1850	1875	65	java/lang/Exception
    //   1891	1910	65	java/lang/Exception
    //   1919	1924	65	java/lang/Exception
    //   1927	1932	65	java/lang/Exception
    //   1935	1950	65	java/lang/Exception
    //   1953	1958	65	java/lang/Exception
    //   1961	1966	65	java/lang/Exception
    //   1969	1974	65	java/lang/Exception
    //   1978	1991	65	java/lang/Exception
    //   289	294	1744	java/io/IOException
    //   252	268	1761	java/io/IOException
    //   1788	1793	1796	java/io/IOException
    //   252	268	1813	finally
    //   1821	1825	1833	java/io/IOException
    //   720	733	1890	java/lang/Throwable
    //   1660	1667	1977	java/lang/Exception
    //   1671	1700	1977	java/lang/Exception
    //   1700	1729	1977	java/lang/Exception
    //   271	289	1994	finally
    //   1769	1783	1994	finally
    //   271	289	1999	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardwareopt.c.a
 * JD-Core Version:    0.6.2
 */