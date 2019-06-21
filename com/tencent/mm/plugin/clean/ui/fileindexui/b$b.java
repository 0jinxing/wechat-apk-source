package com.tencent.mm.plugin.clean.ui.fileindexui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.clean.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class b$b
  implements Runnable
{
  private b$b(b paramb)
  {
  }

  private void bn(List<com.tencent.mm.plugin.f.b.a> paramList)
  {
    AppMethodBeat.i(18753);
    int i = paramList.size();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    if (j < i)
    {
      com.tencent.mm.plugin.f.b.a locala = (com.tencent.mm.plugin.f.b.a)paramList.get(j);
      i locali1 = (i)localHashMap.get(Long.valueOf(locala.field_msgId));
      i locali2 = locali1;
      if (locali1 == null)
      {
        locali2 = new i();
        localHashMap.put(Long.valueOf(locala.field_msgId), locali2);
        localArrayList.add(locali2);
      }
      locali2.kwH.add(locala);
      locali2.fXb = locala.field_msgtime;
      locali2.userName = locala.field_username;
      locali2.cuQ = locala.field_msgId;
      if (!com.tencent.mm.plugin.f.a.sJ(locala.field_msgSubType))
        locali2.size += locala.field_size;
      switch (locala.field_msgSubType)
      {
      default:
      case 1:
      case 2:
      case 20:
      case 21:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      }
      while (true)
      {
        j++;
        break;
        locali2.filePath = (g.RP().eJL + locala.field_path);
        locali2.type = 3;
        continue;
        locali2.thumbPath = (g.RP().eJL + locala.field_path);
        locali2.type = 3;
        continue;
        locali2.filePath = (g.RP().eJL + locala.field_path);
        locali2.type = 1;
        continue;
        locali2.thumbPath = (g.RP().eJL + locala.field_path);
        locali2.type = 1;
        continue;
        locali2.filePath = (g.RP().eJL + locala.field_path);
        locali2.type = 1;
        continue;
        locali2.thumbPath = (g.RP().eJL + locala.field_path);
        locali2.type = 1;
        continue;
        locali2.filePath = (g.RP().eJL + locala.field_path);
        locali2.type = 4;
        continue;
        locali2.thumbPath = (g.RP().eJL + locala.field_path);
        locali2.type = 4;
        continue;
        locali2.filePath = (g.RP().eJL + locala.field_path);
        locali2.type = 4;
        continue;
        locali2.thumbPath = (g.RP().eJL + locala.field_path);
        locali2.type = 4;
      }
    }
    paramList = localArrayList.iterator();
    while (paramList.hasNext())
      if (((i)paramList.next()).size <= 0L)
        paramList.remove();
    b.d(this.kxq).addAll(localArrayList);
    AppMethodBeat.o(18753);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 18752
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 177	com/tencent/mm/pointers/PLong
    //   9: dup
    //   10: invokespecial 178	com/tencent/mm/pointers/PLong:<init>	()V
    //   13: astore_1
    //   14: new 177	com/tencent/mm/pointers/PLong
    //   17: dup
    //   18: invokespecial 178	com/tencent/mm/pointers/PLong:<init>	()V
    //   21: astore_2
    //   22: invokestatic 184	com/tencent/mm/plugin/f/b:aZc	()Lcom/tencent/mm/plugin/f/b;
    //   25: invokevirtual 188	com/tencent/mm/plugin/f/b:aZd	()Lcom/tencent/mm/plugin/f/b/b;
    //   28: astore_3
    //   29: aload_0
    //   30: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   33: invokestatic 192	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
    //   36: astore 4
    //   38: invokestatic 198	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   41: lstore 5
    //   43: new 110	java/lang/StringBuilder
    //   46: dup
    //   47: ldc 200
    //   49: invokespecial 203	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   52: aload 4
    //   54: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc 205
    //   59: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: astore 7
    //   67: aconst_null
    //   68: astore 8
    //   70: aconst_null
    //   71: astore 9
    //   73: aload_3
    //   74: getfield 211	com/tencent/mm/plugin/f/b/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   77: aload 7
    //   79: aconst_null
    //   80: invokeinterface 217 3 0
    //   85: astore_3
    //   86: aload_3
    //   87: ifnull +52 -> 139
    //   90: aload_3
    //   91: astore 9
    //   93: aload_3
    //   94: astore 8
    //   96: aload_3
    //   97: invokeinterface 222 1 0
    //   102: ifeq +37 -> 139
    //   105: aload_3
    //   106: astore 9
    //   108: aload_3
    //   109: astore 8
    //   111: aload_1
    //   112: aload_3
    //   113: iconst_0
    //   114: invokeinterface 226 2 0
    //   119: putfield 229	com/tencent/mm/pointers/PLong:value	J
    //   122: aload_3
    //   123: astore 9
    //   125: aload_3
    //   126: astore 8
    //   128: aload_2
    //   129: aload_3
    //   130: iconst_1
    //   131: invokeinterface 226 2 0
    //   136: putfield 229	com/tencent/mm/pointers/PLong:value	J
    //   139: aload_3
    //   140: ifnull +9 -> 149
    //   143: aload_3
    //   144: invokeinterface 232 1 0
    //   149: ldc 234
    //   151: ldc 236
    //   153: iconst_2
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload 4
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: lload 5
    //   166: invokestatic 240	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   169: invokestatic 58	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   172: aastore
    //   173: invokestatic 245	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: aload_2
    //   177: aload_2
    //   178: getfield 229	com/tencent/mm/pointers/PLong:value	J
    //   181: lconst_1
    //   182: lsub
    //   183: putfield 229	com/tencent/mm/pointers/PLong:value	J
    //   186: aload_1
    //   187: getfield 229	com/tencent/mm/pointers/PLong:value	J
    //   190: lstore 10
    //   192: lload 10
    //   194: ldc2_w 246
    //   197: lsub
    //   198: aload_2
    //   199: getfield 229	com/tencent/mm/pointers/PLong:value	J
    //   202: invokestatic 253	java/lang/Math:max	(JJ)J
    //   205: lstore 12
    //   207: aload_0
    //   208: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   211: invokestatic 256	com/tencent/mm/plugin/clean/ui/fileindexui/b:b	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Z
    //   214: istore 14
    //   216: iload 14
    //   218: ifeq +71 -> 289
    //   221: sipush 18752
    //   224: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: return
    //   228: astore_3
    //   229: aload 9
    //   231: astore 8
    //   233: ldc 234
    //   235: aload_3
    //   236: ldc_w 258
    //   239: iconst_1
    //   240: anewarray 4	java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload 7
    //   247: aastore
    //   248: invokestatic 262	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: aload 9
    //   253: ifnull -104 -> 149
    //   256: aload 9
    //   258: invokeinterface 232 1 0
    //   263: goto -114 -> 149
    //   266: astore 9
    //   268: aload 8
    //   270: ifnull +10 -> 280
    //   273: aload 8
    //   275: invokeinterface 232 1 0
    //   280: sipush 18752
    //   283: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: aload 9
    //   288: athrow
    //   289: lload 12
    //   291: lstore 5
    //   293: lload 12
    //   295: lload 10
    //   297: lcmp
    //   298: ifne +9 -> 307
    //   301: lload 12
    //   303: lconst_1
    //   304: lsub
    //   305: lstore 5
    //   307: aload_0
    //   308: invokestatic 184	com/tencent/mm/plugin/f/b:aZc	()Lcom/tencent/mm/plugin/f/b;
    //   311: invokevirtual 188	com/tencent/mm/plugin/f/b:aZd	()Lcom/tencent/mm/plugin/f/b/b;
    //   314: aload_0
    //   315: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   318: invokestatic 192	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
    //   321: lload 10
    //   323: lload 5
    //   325: invokevirtual 266	com/tencent/mm/plugin/f/b/b:k	(Ljava/lang/String;JJ)Ljava/util/List;
    //   328: invokespecial 268	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:bn	(Ljava/util/List;)V
    //   331: aload_0
    //   332: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   335: invokestatic 271	com/tencent/mm/plugin/clean/ui/fileindexui/b:c	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)V
    //   338: lload 5
    //   340: lstore 12
    //   342: aload_0
    //   343: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   346: invokestatic 256	com/tencent/mm/plugin/clean/ui/fileindexui/b:b	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Z
    //   349: ifne +84 -> 433
    //   352: lload 12
    //   354: aload_2
    //   355: getfield 229	com/tencent/mm/pointers/PLong:value	J
    //   358: lcmp
    //   359: ifle +74 -> 433
    //   362: lload 12
    //   364: ldc2_w 272
    //   367: lsub
    //   368: aload_2
    //   369: getfield 229	com/tencent/mm/pointers/PLong:value	J
    //   372: invokestatic 253	java/lang/Math:max	(JJ)J
    //   375: lstore 10
    //   377: lload 10
    //   379: lstore 5
    //   381: lload 10
    //   383: lload 12
    //   385: lcmp
    //   386: ifne +9 -> 395
    //   389: lload 10
    //   391: lconst_1
    //   392: lsub
    //   393: lstore 5
    //   395: aload_0
    //   396: invokestatic 184	com/tencent/mm/plugin/f/b:aZc	()Lcom/tencent/mm/plugin/f/b;
    //   399: invokevirtual 188	com/tencent/mm/plugin/f/b:aZd	()Lcom/tencent/mm/plugin/f/b/b;
    //   402: aload_0
    //   403: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   406: invokestatic 192	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
    //   409: lload 12
    //   411: lload 5
    //   413: invokevirtual 266	com/tencent/mm/plugin/f/b/b:k	(Ljava/lang/String;JJ)Ljava/util/List;
    //   416: invokespecial 268	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:bn	(Ljava/util/List;)V
    //   419: aload_0
    //   420: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:kxq	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
    //   423: invokestatic 271	com/tencent/mm/plugin/clean/ui/fileindexui/b:c	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)V
    //   426: lload 5
    //   428: lstore 12
    //   430: goto -88 -> 342
    //   433: sipush 18752
    //   436: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   439: goto -212 -> 227
    //   442: astore 8
    //   444: ldc_w 275
    //   447: aload 8
    //   449: ldc_w 277
    //   452: iconst_0
    //   453: anewarray 4	java/lang/Object
    //   456: invokestatic 262	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   459: sipush 18752
    //   462: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: goto -238 -> 227
    //
    // Exception table:
    //   from	to	target	type
    //   73	86	228	java/lang/Exception
    //   96	105	228	java/lang/Exception
    //   111	122	228	java/lang/Exception
    //   128	139	228	java/lang/Exception
    //   73	86	266	finally
    //   96	105	266	finally
    //   111	122	266	finally
    //   128	139	266	finally
    //   233	251	266	finally
    //   207	216	442	java/lang/Exception
    //   307	338	442	java/lang/Exception
    //   342	377	442	java/lang/Exception
    //   395	426	442	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.b.b
 * JD-Core Version:    0.6.2
 */