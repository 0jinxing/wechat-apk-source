package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d extends Thread
{
  private static HashMap<String, d.b> uPs;
  private static Object uPt;
  private static az uPu;
  public boolean isStop;
  private List<String> uPi;
  private List<Integer> uPj;
  private List<String> uPk;
  private List<String> uPl;
  private List<Integer> uPm;
  private d.a uPn;
  private k uPo;
  private String uPp;
  private String uPq;
  private boolean uPr;

  static
  {
    AppMethodBeat.i(26765);
    uPs = new HashMap();
    uPt = new byte[0];
    AppMethodBeat.o(26765);
  }

  public d(List<String> paramList, String paramString1, String paramString2, k paramk, d.a parama)
  {
    AppMethodBeat.i(26758);
    this.uPr = false;
    this.uPi = paramList;
    this.uPj = new ArrayList();
    this.uPk = new ArrayList();
    this.uPm = new ArrayList();
    this.uPl = new ArrayList();
    this.uPn = parama;
    this.uPo = paramk;
    this.uPq = paramString2;
    this.uPp = paramString1;
    AppMethodBeat.o(26758);
  }

  private void a(int paramInt1, String paramString1, String paramString2, int paramInt2, VideoTransPara paramVideoTransPara, Context arg6, String paramString3)
  {
    AppMethodBeat.i(26760);
    ab.i("MicroMsg.NoteVideoCompress", "finish to import %s to %s | ret %d | duration %d", new Object[] { paramString2, paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    e(paramInt1, paramString1, paramString2, paramInt2);
    if (paramInt1 == -50002)
      bs(???, ???.getString(2131304249));
    while (true)
    {
      if ((this.uPn != null) && (!this.isStop))
        al.d(new d.1(this, paramString3, paramInt1));
      AppMethodBeat.o(26760);
      return;
      if (paramInt1 == -50008)
      {
        bs(???, ???.getString(2131304247));
      }
      else
      {
        if (paramInt1 == -50006)
        {
          hr(paramString1, paramString2);
          if (uPu == null)
            uPu = new az(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
          d.b localb = new d.b((byte)0);
          synchronized (uPt)
          {
            uPs.put(paramString1, localb);
            localb.fileName = paramString1;
            localb.fUG = paramString2;
            localb.hzq = this.uPq;
            localb.fWR = paramVideoTransPara;
            localb.uPn = this.uPn;
            localb.uPo = this.uPo;
            uPu.e(localb);
          }
        }
        if (paramInt1 < 0)
          bs(???, ???.getString(2131304248));
        else
          this.uPr = true;
      }
    }
  }

  private void bs(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26761);
    al.d(new d.2(this, paramContext, paramString));
    AppMethodBeat.o(26761);
  }

  // ERROR //
  public static void c(String paramString, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: sipush 26763
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 214	android/media/MediaMetadataRetriever
    //   9: astore_2
    //   10: aload_2
    //   11: invokespecial 215	android/media/MediaMetadataRetriever:<init>	()V
    //   14: aload_2
    //   15: astore_3
    //   16: aload_2
    //   17: aload_0
    //   18: invokevirtual 218	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: astore_3
    //   23: aload_2
    //   24: bipush 18
    //   26: invokevirtual 221	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   29: iconst_0
    //   30: invokestatic 227	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   33: istore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload_2
    //   38: bipush 19
    //   40: invokevirtual 221	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   43: iconst_0
    //   44: invokestatic 227	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   47: istore 5
    //   49: aload_2
    //   50: invokevirtual 230	android/media/MediaMetadataRetriever:release	()V
    //   53: aload_1
    //   54: iconst_0
    //   55: iload 4
    //   57: iastore
    //   58: aload_1
    //   59: iconst_1
    //   60: iload 5
    //   62: iastore
    //   63: iconst_0
    //   64: istore 6
    //   66: iload 6
    //   68: iconst_3
    //   69: if_icmpge +125 -> 194
    //   72: iload 4
    //   74: iconst_2
    //   75: irem
    //   76: ifne +10 -> 86
    //   79: iload 5
    //   81: iconst_2
    //   82: irem
    //   83: ifeq +65 -> 148
    //   86: sipush 26763
    //   89: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: return
    //   93: astore 7
    //   95: iconst_0
    //   96: istore 4
    //   98: aconst_null
    //   99: astore_0
    //   100: aload_0
    //   101: astore_3
    //   102: ldc 86
    //   104: aload 7
    //   106: ldc 232
    //   108: iconst_0
    //   109: anewarray 90	java/lang/Object
    //   112: invokestatic 236	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 230	android/media/MediaMetadataRetriever:release	()V
    //   123: iconst_0
    //   124: istore 5
    //   126: goto -73 -> 53
    //   129: astore_0
    //   130: aconst_null
    //   131: astore_3
    //   132: aload_3
    //   133: ifnull +7 -> 140
    //   136: aload_3
    //   137: invokevirtual 230	android/media/MediaMetadataRetriever:release	()V
    //   140: sipush 26763
    //   143: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aload_0
    //   147: athrow
    //   148: iload 4
    //   150: iload 5
    //   152: if_icmplt +19 -> 171
    //   155: iload 4
    //   157: sipush 640
    //   160: if_icmple +34 -> 194
    //   163: iload 5
    //   165: sipush 480
    //   168: if_icmple +26 -> 194
    //   171: iload 4
    //   173: iload 5
    //   175: if_icmpgt +38 -> 213
    //   178: iload 4
    //   180: sipush 480
    //   183: if_icmple +11 -> 194
    //   186: iload 5
    //   188: sipush 640
    //   191: if_icmpgt +22 -> 213
    //   194: aload_1
    //   195: iconst_0
    //   196: iload 4
    //   198: iastore
    //   199: aload_1
    //   200: iconst_1
    //   201: iload 5
    //   203: iastore
    //   204: sipush 26763
    //   207: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: goto -118 -> 92
    //   213: iload 4
    //   215: iconst_2
    //   216: idiv
    //   217: istore 4
    //   219: iload 5
    //   221: iconst_2
    //   222: idiv
    //   223: istore 5
    //   225: iinc 6 1
    //   228: goto -162 -> 66
    //   231: astore_0
    //   232: goto -100 -> 132
    //   235: astore 7
    //   237: iconst_0
    //   238: istore 4
    //   240: aload_2
    //   241: astore_0
    //   242: goto -142 -> 100
    //   245: astore 7
    //   247: aload_2
    //   248: astore_0
    //   249: goto -149 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   6	14	93	java/lang/Exception
    //   6	14	129	finally
    //   16	21	231	finally
    //   23	35	231	finally
    //   37	49	231	finally
    //   102	115	231	finally
    //   16	21	235	java/lang/Exception
    //   23	35	235	java/lang/Exception
    //   37	49	245	java/lang/Exception
  }

  private void e(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(26764);
      this.uPj.add(Integer.valueOf(paramInt1));
      this.uPk.add(paramString1);
      this.uPl.add(paramString2);
      this.uPm.add(Integer.valueOf(paramInt2));
      AppMethodBeat.o(26764);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  private static void hr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(26762);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.NoteVideoCompress", "do insertVideoStorage, but file name is null");
      AppMethodBeat.o(26762);
    }
    while (true)
    {
      return;
      s locals = new s();
      locals.fileName = paramString1;
      locals.fXd = 1;
      locals.cIS = null;
      aw.ZK();
      locals.fWW = ((String)c.Ry().get(2, ""));
      locals.createTime = bo.anT();
      locals.fXb = bo.anT();
      locals.fXj = null;
      locals.fUG = paramString2;
      if (!bo.isNullOrNil(paramString2))
        locals.fXh = 1;
      locals.frO = 0;
      o.all().b(locals);
      AppMethodBeat.o(26762);
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 26759
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 60	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPi	Ljava/util/List;
    //   10: ifnull +1245 -> 1255
    //   13: aload_0
    //   14: getfield 60	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPi	Ljava/util/List;
    //   17: invokeinterface 325 1 0
    //   22: ifle +1233 -> 1255
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: aload_0
    //   29: getfield 60	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPi	Ljava/util/List;
    //   32: invokeinterface 325 1 0
    //   37: if_icmpge +1218 -> 1255
    //   40: aload_0
    //   41: getfield 119	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:isStop	Z
    //   44: ifne +1211 -> 1255
    //   47: ldc 86
    //   49: ldc_w 327
    //   52: iconst_1
    //   53: anewarray 90	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: aload_0
    //   59: getfield 60	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPi	Ljava/util/List;
    //   62: invokevirtual 328	java/lang/Object:toString	()Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: new 330	android/content/Intent
    //   72: dup
    //   73: invokespecial 331	android/content/Intent:<init>	()V
    //   76: astore_2
    //   77: aload_2
    //   78: new 143	java/lang/StringBuilder
    //   81: dup
    //   82: ldc_w 333
    //   85: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload_0
    //   89: getfield 60	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPi	Ljava/util/List;
    //   92: iload_1
    //   93: invokeinterface 336 2 0
    //   98: checkcast 286	java/lang/String
    //   101: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 345	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   110: invokevirtual 349	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   113: pop
    //   114: invokestatic 355	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   117: astore_3
    //   118: new 143	java/lang/StringBuilder
    //   121: dup
    //   122: ldc_w 357
    //   125: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: astore 4
    //   130: invokestatic 270	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   133: pop
    //   134: aload 4
    //   136: invokestatic 276	com/tencent/mm/model/c:Ry	()Lcom/tencent/mm/storage/z;
    //   139: iconst_2
    //   140: ldc_w 278
    //   143: invokevirtual 284	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   146: checkcast 286	java/lang/String
    //   149: invokestatic 361	com/tencent/mm/modelvideo/t:ug	(Ljava/lang/String;)Ljava/lang/String;
    //   152: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: astore 5
    //   160: aload_0
    //   161: getfield 79	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPp	Ljava/lang/String;
    //   164: invokestatic 248	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   167: ifne +13 -> 180
    //   170: aload_0
    //   171: getfield 77	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPq	Ljava/lang/String;
    //   174: invokestatic 248	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   177: ifeq +77 -> 254
    //   180: invokestatic 315	com/tencent/mm/modelvideo/o:all	()Lcom/tencent/mm/modelvideo/t;
    //   183: pop
    //   184: aload 5
    //   186: invokestatic 364	com/tencent/mm/modelvideo/t:ui	(Ljava/lang/String;)Ljava/lang/String;
    //   189: astore 6
    //   191: invokestatic 315	com/tencent/mm/modelvideo/o:all	()Lcom/tencent/mm/modelvideo/t;
    //   194: pop
    //   195: aload 5
    //   197: invokestatic 367	com/tencent/mm/modelvideo/t:uh	(Ljava/lang/String;)Ljava/lang/String;
    //   200: astore 7
    //   202: invokestatic 355	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   205: invokestatic 373	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   208: istore 8
    //   210: aload_3
    //   211: aload_2
    //   212: invokestatic 378	com/tencent/mm/compatible/j/a:i	(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;
    //   215: astore 9
    //   217: aload 9
    //   219: invokestatic 248	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   222: ifeq +75 -> 297
    //   225: ldc 86
    //   227: ldc_w 380
    //   230: invokestatic 382	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   233: aload_0
    //   234: ldc_w 383
    //   237: aload 5
    //   239: aload 9
    //   241: iconst_0
    //   242: aconst_null
    //   243: aload_3
    //   244: aconst_null
    //   245: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   248: iinc 1 1
    //   251: goto -224 -> 27
    //   254: aload_0
    //   255: getfield 79	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPp	Ljava/lang/String;
    //   258: astore 6
    //   260: aload_0
    //   261: getfield 77	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPq	Ljava/lang/String;
    //   264: aload_0
    //   265: getfield 77	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPq	Ljava/lang/String;
    //   268: ldc_w 387
    //   271: invokevirtual 391	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   274: iconst_1
    //   275: iadd
    //   276: aload_0
    //   277: getfield 77	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPq	Ljava/lang/String;
    //   280: invokevirtual 394	java/lang/String:length	()I
    //   283: invokevirtual 398	java/lang/String:substring	(II)Ljava/lang/String;
    //   286: astore 5
    //   288: aload_0
    //   289: getfield 77	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:uPq	Ljava/lang/String;
    //   292: astore 7
    //   294: goto -92 -> 202
    //   297: aload 9
    //   299: invokestatic 403	com/tencent/mm/plugin/a/c:vC	(Ljava/lang/String;)Z
    //   302: istore 10
    //   304: aload 9
    //   306: invokestatic 409	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   309: lstore 11
    //   311: iload 10
    //   313: ifeq +562 -> 875
    //   316: new 411	com/tencent/mm/pointers/PInt
    //   319: dup
    //   320: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   323: astore 13
    //   325: invokestatic 418	com/tencent/mm/modelcontrol/d:afF	()Lcom/tencent/mm/modelcontrol/d;
    //   328: aload 9
    //   330: invokevirtual 421	com/tencent/mm/modelcontrol/d:rT	(Ljava/lang/String;)Z
    //   333: ifeq +161 -> 494
    //   336: ldc 86
    //   338: ldc_w 423
    //   341: iconst_1
    //   342: anewarray 90	java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: aload 9
    //   349: aastore
    //   350: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: aload 13
    //   355: iconst_1
    //   356: putfield 426	com/tencent/mm/pointers/PInt:value	I
    //   359: aconst_null
    //   360: astore 4
    //   362: aload 13
    //   364: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   367: istore 14
    //   369: ldc 86
    //   371: ldc_w 428
    //   374: iconst_3
    //   375: anewarray 90	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: iload 14
    //   382: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   385: aastore
    //   386: dup
    //   387: iconst_1
    //   388: iload 10
    //   390: invokestatic 433	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   393: aastore
    //   394: dup
    //   395: iconst_2
    //   396: lload 11
    //   398: invokestatic 438	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   401: aastore
    //   402: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: iload 14
    //   407: tableswitch	default:+61 -> 468, -6:+616->1023, -5:+633->1040, -4:+616->1023, -3:+616->1023, -2:+616->1023, -1:+598->1005, 0:+589->996, 1:+514->921, 2:+514->921, 3:+514->921, 4:+514->921, 5:+514->921
    //   469: sastore
    //   470: ldc_w 440
    //   473: invokestatic 382	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   476: aload_0
    //   477: ldc_w 441
    //   480: aload 5
    //   482: aload 9
    //   484: iconst_0
    //   485: aconst_null
    //   486: aload_3
    //   487: aconst_null
    //   488: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   491: goto -243 -> 248
    //   494: new 443	com/tencent/mm/modelcontrol/VideoTransPara
    //   497: dup
    //   498: invokespecial 444	com/tencent/mm/modelcontrol/VideoTransPara:<init>	()V
    //   501: astore 15
    //   503: new 411	com/tencent/mm/pointers/PInt
    //   506: dup
    //   507: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   510: astore 4
    //   512: new 411	com/tencent/mm/pointers/PInt
    //   515: dup
    //   516: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   519: astore 16
    //   521: new 411	com/tencent/mm/pointers/PInt
    //   524: dup
    //   525: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   528: astore 17
    //   530: new 411	com/tencent/mm/pointers/PInt
    //   533: dup
    //   534: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   537: astore 18
    //   539: new 411	com/tencent/mm/pointers/PInt
    //   542: dup
    //   543: invokespecial 412	com/tencent/mm/pointers/PInt:<init>	()V
    //   546: astore 19
    //   548: aload 9
    //   550: aload 4
    //   552: aload 16
    //   554: aload 17
    //   556: aload 18
    //   558: aload 19
    //   560: invokestatic 449	com/tencent/mm/plugin/sight/base/d:a	(Ljava/lang/String;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Ljava/lang/String;
    //   563: pop
    //   564: aload 15
    //   566: aload 4
    //   568: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   571: sipush 1000
    //   574: idiv
    //   575: putfield 452	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   578: aload 15
    //   580: aload 16
    //   582: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   585: putfield 455	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   588: aload 15
    //   590: aload 17
    //   592: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   595: putfield 458	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   598: aload 15
    //   600: aload 18
    //   602: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   605: putfield 461	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   608: aload 15
    //   610: aload 19
    //   612: getfield 426	com/tencent/mm/pointers/PInt:value	I
    //   615: putfield 464	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   618: ldc 86
    //   620: ldc_w 466
    //   623: iconst_1
    //   624: anewarray 90	java/lang/Object
    //   627: dup
    //   628: iconst_0
    //   629: aload 15
    //   631: aastore
    //   632: invokestatic 468	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   635: invokestatic 418	com/tencent/mm/modelcontrol/d:afF	()Lcom/tencent/mm/modelcontrol/d;
    //   638: aload 15
    //   640: invokevirtual 471	com/tencent/mm/modelcontrol/d:b	(Lcom/tencent/mm/modelcontrol/VideoTransPara;)Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   643: astore 4
    //   645: aload 4
    //   647: ifnonnull +33 -> 680
    //   650: ldc 86
    //   652: ldc_w 473
    //   655: iconst_1
    //   656: anewarray 90	java/lang/Object
    //   659: dup
    //   660: iconst_0
    //   661: aload 15
    //   663: aastore
    //   664: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   667: aload 13
    //   669: bipush 251
    //   671: putfield 426	com/tencent/mm/pointers/PInt:value	I
    //   674: aconst_null
    //   675: astore 4
    //   677: goto -315 -> 362
    //   680: ldc 86
    //   682: ldc_w 475
    //   685: iconst_1
    //   686: anewarray 90	java/lang/Object
    //   689: dup
    //   690: iconst_0
    //   691: aload 4
    //   693: aastore
    //   694: invokestatic 468	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   697: aload 15
    //   699: getfield 464	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   702: ldc_w 476
    //   705: if_icmple +16 -> 721
    //   708: aload 4
    //   710: getfield 464	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   713: aload 15
    //   715: getfield 464	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   718: if_icmple +37 -> 755
    //   721: ldc 86
    //   723: ldc_w 478
    //   726: iconst_2
    //   727: anewarray 90	java/lang/Object
    //   730: dup
    //   731: iconst_0
    //   732: aload 4
    //   734: aastore
    //   735: dup
    //   736: iconst_1
    //   737: aload 15
    //   739: aastore
    //   740: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   743: aload 13
    //   745: iconst_1
    //   746: putfield 426	com/tencent/mm/pointers/PInt:value	I
    //   749: aconst_null
    //   750: astore 4
    //   752: goto -390 -> 362
    //   755: aload 15
    //   757: getfield 461	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   760: bipush 45
    //   762: if_icmplt +31 -> 793
    //   765: aload 15
    //   767: getfield 452	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   770: sipush 1000
    //   773: imul
    //   774: ldc_w 479
    //   777: if_icmplt +16 -> 793
    //   780: aload 13
    //   782: bipush 250
    //   784: putfield 426	com/tencent/mm/pointers/PInt:value	I
    //   787: aconst_null
    //   788: astore 4
    //   790: goto -428 -> 362
    //   793: invokestatic 355	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   796: invokestatic 373	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   799: istore 8
    //   801: aload 4
    //   803: getfield 455	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   806: istore 20
    //   808: aload 4
    //   810: getfield 458	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   813: istore 21
    //   815: iload 8
    //   817: ifeq +42 -> 859
    //   820: ldc_w 480
    //   823: istore 14
    //   825: iload 8
    //   827: ifeq +40 -> 867
    //   830: ldc2_w 481
    //   833: dstore 22
    //   835: aload 13
    //   837: aload 9
    //   839: iload 20
    //   841: iload 21
    //   843: iload 14
    //   845: dload 22
    //   847: ldc_w 483
    //   850: invokestatic 489	com/tencent/mm/plugin/sight/base/SightVideoJNI:shouldRemuxing	(Ljava/lang/String;IIIDI)I
    //   853: putfield 426	com/tencent/mm/pointers/PInt:value	I
    //   856: goto -494 -> 362
    //   859: ldc_w 490
    //   862: istore 14
    //   864: goto -39 -> 825
    //   867: ldc2_w 491
    //   870: dstore 22
    //   872: goto -37 -> 835
    //   875: iload 8
    //   877: ifeq +27 -> 904
    //   880: ldc_w 480
    //   883: istore 14
    //   885: lload 11
    //   887: iload 14
    //   889: i2l
    //   890: lcmp
    //   891: ifle +21 -> 912
    //   894: bipush 251
    //   896: istore 14
    //   898: aconst_null
    //   899: astore 4
    //   901: goto -532 -> 369
    //   904: ldc_w 490
    //   907: istore 14
    //   909: goto -24 -> 885
    //   912: iconst_1
    //   913: istore 14
    //   915: aconst_null
    //   916: astore 4
    //   918: goto -549 -> 369
    //   921: lload 11
    //   923: ldc2_w 493
    //   926: lcmp
    //   927: ifle +60 -> 987
    //   930: aload_0
    //   931: ldc 106
    //   933: aload 5
    //   935: aload 9
    //   937: iconst_0
    //   938: aconst_null
    //   939: aload_3
    //   940: aconst_null
    //   941: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   944: iconst_0
    //   945: istore 21
    //   947: ldc 106
    //   949: istore 14
    //   951: aload_3
    //   952: aload_2
    //   953: invokestatic 498	com/tencent/mm/compatible/j/a:j	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/j/a$a;
    //   956: astore_2
    //   957: aload_2
    //   958: ifnonnull +118 -> 1076
    //   961: ldc 86
    //   963: ldc_w 380
    //   966: invokestatic 382	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   969: aload_0
    //   970: ldc_w 383
    //   973: aload 5
    //   975: aload 9
    //   977: iconst_0
    //   978: aconst_null
    //   979: aload_3
    //   980: aconst_null
    //   981: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   984: goto -736 -> 248
    //   987: iconst_0
    //   988: istore 21
    //   990: iconst_0
    //   991: istore 14
    //   993: goto -42 -> 951
    //   996: iconst_1
    //   997: istore 21
    //   999: iconst_0
    //   1000: istore 14
    //   1002: goto -51 -> 951
    //   1005: aload_0
    //   1006: ldc_w 499
    //   1009: aload 5
    //   1011: aload 9
    //   1013: iconst_0
    //   1014: aconst_null
    //   1015: aload_3
    //   1016: aconst_null
    //   1017: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1020: goto -772 -> 248
    //   1023: aload_0
    //   1024: ldc 106
    //   1026: aload 5
    //   1028: aload 9
    //   1030: iconst_0
    //   1031: aconst_null
    //   1032: aload_3
    //   1033: aconst_null
    //   1034: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1037: goto -789 -> 248
    //   1040: aload_0
    //   1041: ldc 131
    //   1043: aload 5
    //   1045: aload 9
    //   1047: iconst_0
    //   1048: aconst_null
    //   1049: aload_3
    //   1050: aconst_null
    //   1051: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1054: goto -806 -> 248
    //   1057: astore_2
    //   1058: ldc 86
    //   1060: aload_2
    //   1061: ldc_w 278
    //   1064: iconst_0
    //   1065: anewarray 90	java/lang/Object
    //   1068: invokestatic 236	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1071: aconst_null
    //   1072: astore_2
    //   1073: goto -116 -> 957
    //   1076: iload 21
    //   1078: ifne +133 -> 1211
    //   1081: aload 9
    //   1083: aload 7
    //   1085: invokestatic 503	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1088: pop2
    //   1089: aload_2
    //   1090: getfield 506	com/tencent/mm/compatible/j/a$a:duration	I
    //   1093: i2l
    //   1094: invokestatic 510	com/tencent/mm/sdk/platformtools/bo:mA	(J)I
    //   1097: istore 24
    //   1099: aload_2
    //   1100: getfield 514	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   1103: ifnull +129 -> 1232
    //   1106: aload_2
    //   1107: getfield 514	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   1110: bipush 60
    //   1112: getstatic 520	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1115: aload 6
    //   1117: iconst_1
    //   1118: invokestatic 525	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1121: iconst_0
    //   1122: istore 20
    //   1124: iload 20
    //   1126: ifeq +26 -> 1152
    //   1129: ldc_w 526
    //   1132: sipush 320
    //   1135: sipush 480
    //   1138: invokestatic 530	com/tencent/mm/sdk/platformtools/d:au	(III)Landroid/graphics/Bitmap;
    //   1141: bipush 60
    //   1143: getstatic 520	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1146: aload 6
    //   1148: iconst_1
    //   1149: invokestatic 525	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1152: iload 14
    //   1154: istore 20
    //   1156: iload 21
    //   1158: ifne +20 -> 1178
    //   1161: iload 14
    //   1163: istore 20
    //   1165: aload 7
    //   1167: invokestatic 533	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   1170: ifne +8 -> 1178
    //   1173: ldc_w 534
    //   1176: istore 20
    //   1178: aload 6
    //   1180: invokestatic 533	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   1183: ifne +8 -> 1191
    //   1186: ldc_w 535
    //   1189: istore 20
    //   1191: aload_0
    //   1192: iload 20
    //   1194: aload 5
    //   1196: aload 9
    //   1198: iload 24
    //   1200: aload 4
    //   1202: aload_3
    //   1203: aload 6
    //   1205: invokespecial 385	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1208: goto -960 -> 248
    //   1211: ldc 133
    //   1213: istore 14
    //   1215: goto -126 -> 1089
    //   1218: astore_2
    //   1219: ldc 86
    //   1221: aload_2
    //   1222: ldc_w 278
    //   1225: iconst_0
    //   1226: anewarray 90	java/lang/Object
    //   1229: invokestatic 236	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1232: iconst_1
    //   1233: istore 20
    //   1235: goto -111 -> 1124
    //   1238: astore_2
    //   1239: ldc 86
    //   1241: aload_2
    //   1242: ldc_w 278
    //   1245: iconst_0
    //   1246: anewarray 90	java/lang/Object
    //   1249: invokestatic 236	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1252: goto -100 -> 1152
    //   1255: sipush 26759
    //   1258: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1261: return
    //
    // Exception table:
    //   from	to	target	type
    //   951	957	1057	java/lang/Exception
    //   1106	1121	1218	java/lang/Exception
    //   1129	1152	1238	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.d
 * JD-Core Version:    0.6.2
 */