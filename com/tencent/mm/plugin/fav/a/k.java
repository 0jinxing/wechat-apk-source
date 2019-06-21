package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
  implements w
{
  public boolean mfm = true;

  public static boolean h(aar paramaar)
  {
    boolean bool = true;
    AppMethodBeat.i(102667);
    if (paramaar == null)
      AppMethodBeat.o(102667);
    while (true)
    {
      return bool;
      switch (paramaar.dataType)
      {
      case 5:
      case 6:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
        AppMethodBeat.o(102667);
        bool = false;
        break;
      case 2:
      case 8:
        if (!new com.tencent.mm.vfs.b(b.b(paramaar)).exists())
        {
          AppMethodBeat.o(102667);
        }
        else
        {
          AppMethodBeat.o(102667);
          bool = false;
        }
        break;
      case 15:
        if (bo.ank(com.tencent.mm.m.g.Nu().getValue("SIGHTCannotTransmitForFav")) != 0)
        {
          ab.w("MicroMsg.FavSendFilter", "can not retransmit short video");
          AppMethodBeat.o(102667);
        }
        else if (new com.tencent.mm.vfs.b(b.b(paramaar)).exists())
        {
          AppMethodBeat.o(102667);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(102667);
        }
        break;
      case 4:
        if (new com.tencent.mm.vfs.b(b.b(paramaar)).exists())
        {
          AppMethodBeat.o(102667);
          bool = false;
        }
        else
        {
          bool = bo.isNullOrNil(paramaar.wgg);
          AppMethodBeat.o(102667);
        }
        break;
      case 7:
        if ((bo.isNullOrNil(paramaar.wgg)) && (bo.isNullOrNil(paramaar.wgi)) && (bo.isNullOrNil(paramaar.wgk)) && (bo.isNullOrNil(paramaar.wgk)))
        {
          AppMethodBeat.o(102667);
        }
        else
        {
          AppMethodBeat.o(102667);
          bool = false;
        }
        break;
      case 3:
        AppMethodBeat.o(102667);
      }
    }
  }

  public static boolean u(g paramg)
  {
    AppMethodBeat.i(102668);
    boolean bool;
    if (paramg == null)
    {
      AppMethodBeat.o(102668);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramg.field_itemStatus > 0) && (!b.g(paramg)))
      {
        AppMethodBeat.o(102668);
        bool = false;
      }
      else
      {
        g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramg.field_localId);
        Object localObject = new com.tencent.mm.vfs.b(b.b(b.c(paramg)));
        switch (paramg.field_type)
        {
        default:
        case 14:
        case 18:
        case 2:
        case 8:
        case 16:
        case 4:
        }
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(102668);
              bool = false;
              break;
              if ((paramg.field_id <= 0) && (localg != null))
              {
                AppMethodBeat.o(102668);
                bool = false;
                break;
              }
              if ((paramg.field_favProto == null) || (paramg.field_favProto.wiv.size() <= 1))
              {
                AppMethodBeat.o(102668);
                bool = false;
                break;
              }
              localObject = paramg.field_favProto.wiv.iterator();
              do
              {
                if (!((Iterator)localObject).hasNext())
                  break;
                paramg = (aar)((Iterator)localObject).next();
              }
              while ((bo.isNullOrNil(paramg.wfZ)) || (bo.isNullOrNil(paramg.wgb)) || (com.tencent.mm.vfs.e.ct(b.b(paramg))));
              AppMethodBeat.o(102668);
              bool = true;
              break;
            }
            while (((com.tencent.mm.vfs.b)localObject).exists());
            AppMethodBeat.o(102668);
            bool = true;
            break;
            if (bo.ank(com.tencent.mm.m.g.Nu().getValue("SIGHTCannotTransmitForFav")) != 0)
            {
              ab.w("MicroMsg.FavSendFilter", "can not retransmit short video");
              AppMethodBeat.o(102668);
              bool = false;
              break;
            }
          }
          while (((com.tencent.mm.vfs.b)localObject).exists());
          AppMethodBeat.o(102668);
          bool = true;
          break;
        }
        while ((!bo.isNullOrNil(b.c(paramg).wgg)) || (((com.tencent.mm.vfs.b)localObject).exists()));
        AppMethodBeat.o(102668);
        bool = true;
      }
    }
  }

  // ERROR //
  public final boolean t(g paramg)
  {
    // Byte code:
    //   0: ldc 179
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnonnull +12 -> 18
    //   9: iconst_1
    //   10: istore_2
    //   11: ldc 179
    //   13: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: iload_2
    //   17: ireturn
    //   18: aload_1
    //   19: invokestatic 182	com/tencent/mm/plugin/fav/a/b:f	(Lcom/tencent/mm/plugin/fav/a/g;)Z
    //   22: ifeq +13 -> 35
    //   25: iconst_1
    //   26: istore_2
    //   27: ldc 179
    //   29: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: goto -16 -> 16
    //   35: ldc 105
    //   37: invokestatic 111	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   40: checkcast 105	com/tencent/mm/plugin/fav/a/ae
    //   43: invokeinterface 115 1 0
    //   48: aload_1
    //   49: getfield 119	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   52: invokeinterface 125 3 0
    //   57: astore_3
    //   58: aload_1
    //   59: getfield 132	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   62: tableswitch	default:+86 -> 148, 1:+316->378, 2:+335->397, 3:+992->1054, 4:+660->722, 5:+803->865, 6:+708->770, 7:+738->800, 8:+335->397, 9:+86->148, 10:+866->928, 11:+950->1012, 12:+86->148, 13:+86->148, 14:+96->158, 15:+908->970, 16:+375->437, 17:+86->148, 18:+96->158
    //   149: istore_2
    //   150: ldc 179
    //   152: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -139 -> 16
    //   158: aload_1
    //   159: getfield 135	com/tencent/mm/plugin/fav/a/g:field_id	I
    //   162: ifgt +17 -> 179
    //   165: aload_3
    //   166: ifnull +13 -> 179
    //   169: iconst_1
    //   170: istore_2
    //   171: ldc 179
    //   173: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: goto -160 -> 16
    //   179: aload_1
    //   180: getfield 132	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   183: bipush 18
    //   185: if_icmpne +34 -> 219
    //   188: aload_1
    //   189: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   192: ifnull +17 -> 209
    //   195: aload_1
    //   196: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   199: getfield 145	com/tencent/mm/protocal/protobuf/abf:wiv	Ljava/util/LinkedList;
    //   202: invokevirtual 151	java/util/LinkedList:size	()I
    //   205: iconst_1
    //   206: if_icmpgt +13 -> 219
    //   209: iconst_1
    //   210: istore_2
    //   211: ldc 179
    //   213: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: goto -200 -> 16
    //   219: aload_1
    //   220: getfield 132	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   223: bipush 18
    //   225: if_icmpne +59 -> 284
    //   228: aload_1
    //   229: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   232: getfield 145	com/tencent/mm/protocal/protobuf/abf:wiv	Ljava/util/LinkedList;
    //   235: iconst_0
    //   236: invokevirtual 186	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   239: checkcast 29	com/tencent/mm/protocal/protobuf/aar
    //   242: getfield 167	com/tencent/mm/protocal/protobuf/aar:wfZ	Ljava/lang/String;
    //   245: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   248: ifne +26 -> 274
    //   251: aload_1
    //   252: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   255: getfield 145	com/tencent/mm/protocal/protobuf/abf:wiv	Ljava/util/LinkedList;
    //   258: iconst_0
    //   259: invokevirtual 186	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   262: checkcast 29	com/tencent/mm/protocal/protobuf/aar
    //   265: getfield 170	com/tencent/mm/protocal/protobuf/aar:wgb	Ljava/lang/String;
    //   268: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   271: ifeq +13 -> 284
    //   274: iconst_1
    //   275: istore_2
    //   276: ldc 179
    //   278: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: goto -265 -> 16
    //   284: aload_1
    //   285: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   288: getfield 145	com/tencent/mm/protocal/protobuf/abf:wiv	Ljava/util/LinkedList;
    //   291: invokevirtual 155	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   294: astore_1
    //   295: aload_1
    //   296: invokeinterface 160 1 0
    //   301: ifeq +67 -> 368
    //   304: aload_1
    //   305: invokeinterface 164 1 0
    //   310: checkcast 29	com/tencent/mm/protocal/protobuf/aar
    //   313: astore_3
    //   314: aload_3
    //   315: getfield 33	com/tencent/mm/protocal/protobuf/aar:dataType	I
    //   318: iconst_2
    //   319: if_icmpeq +29 -> 348
    //   322: aload_3
    //   323: getfield 33	com/tencent/mm/protocal/protobuf/aar:dataType	I
    //   326: bipush 8
    //   328: if_icmpeq +20 -> 348
    //   331: aload_3
    //   332: getfield 33	com/tencent/mm/protocal/protobuf/aar:dataType	I
    //   335: bipush 15
    //   337: if_icmpeq +11 -> 348
    //   340: aload_3
    //   341: getfield 33	com/tencent/mm/protocal/protobuf/aar:dataType	I
    //   344: iconst_4
    //   345: if_icmpne -50 -> 295
    //   348: aload_3
    //   349: invokestatic 41	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   352: invokestatic 175	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   355: ifne -60 -> 295
    //   358: iconst_1
    //   359: istore_2
    //   360: ldc 179
    //   362: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: goto -349 -> 16
    //   368: iconst_0
    //   369: istore_2
    //   370: ldc 179
    //   372: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   375: goto -359 -> 16
    //   378: aload_1
    //   379: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   382: getfield 189	com/tencent/mm/protocal/protobuf/abf:desc	Ljava/lang/String;
    //   385: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   388: istore_2
    //   389: ldc 179
    //   391: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   394: goto -378 -> 16
    //   397: new 35	com/tencent/mm/vfs/b
    //   400: dup
    //   401: aload_1
    //   402: invokestatic 129	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   405: invokestatic 41	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   408: invokespecial 44	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   411: invokevirtual 48	com/tencent/mm/vfs/b:exists	()Z
    //   414: ifne +13 -> 427
    //   417: iconst_1
    //   418: istore_2
    //   419: ldc 179
    //   421: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   424: goto -408 -> 16
    //   427: iconst_0
    //   428: istore_2
    //   429: ldc 179
    //   431: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   434: goto -418 -> 16
    //   437: invokestatic 54	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   440: ldc 56
    //   442: invokevirtual 62	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   445: invokestatic 68	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   448: ifeq +20 -> 468
    //   451: ldc 70
    //   453: ldc 72
    //   455: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   458: iconst_1
    //   459: istore_2
    //   460: ldc 179
    //   462: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: goto -449 -> 16
    //   468: aload_1
    //   469: invokestatic 129	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   472: astore 4
    //   474: new 35	com/tencent/mm/vfs/b
    //   477: dup
    //   478: aload 4
    //   480: invokestatic 41	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   483: invokespecial 44	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   486: astore_3
    //   487: ldc 70
    //   489: ldc 191
    //   491: iconst_4
    //   492: anewarray 4	java/lang/Object
    //   495: dup
    //   496: iconst_0
    //   497: aload_1
    //   498: getfield 135	com/tencent/mm/plugin/fav/a/g:field_id	I
    //   501: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   504: aastore
    //   505: dup
    //   506: iconst_1
    //   507: aload_1
    //   508: getfield 119	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   511: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   514: aastore
    //   515: dup
    //   516: iconst_2
    //   517: aload_3
    //   518: invokevirtual 206	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   521: invokestatic 211	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   524: aastore
    //   525: dup
    //   526: iconst_3
    //   527: aload_3
    //   528: invokevirtual 48	com/tencent/mm/vfs/b:exists	()Z
    //   531: invokestatic 216	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   534: aastore
    //   535: invokestatic 220	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   538: aload_3
    //   539: invokevirtual 48	com/tencent/mm/vfs/b:exists	()Z
    //   542: ifeq +170 -> 712
    //   545: aload_3
    //   546: invokevirtual 224	com/tencent/mm/vfs/b:length	()J
    //   549: lstore 5
    //   551: aload 4
    //   553: getfield 227	com/tencent/mm/protocal/protobuf/aar:wgu	J
    //   556: lstore 7
    //   558: lload 7
    //   560: lload 5
    //   562: lsub
    //   563: invokestatic 233	java/lang/Math:abs	(J)J
    //   566: ldc2_w 234
    //   569: lcmp
    //   570: ifle +132 -> 702
    //   573: aload_3
    //   574: getfield 239	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   577: aconst_null
    //   578: invokestatic 242	com/tencent/mm/vfs/e:b	(Landroid/net/Uri;Lcom/tencent/mm/vfs/FileSystemManager$d;)Ljava/io/InputStream;
    //   581: astore_1
    //   582: aload_1
    //   583: sipush 4096
    //   586: invokestatic 247	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   589: astore 9
    //   591: aload 9
    //   593: astore_3
    //   594: aload_1
    //   595: ifnull +10 -> 605
    //   598: aload_1
    //   599: invokevirtual 252	java/io/InputStream:close	()V
    //   602: aload 9
    //   604: astore_3
    //   605: ldc 70
    //   607: ldc 254
    //   609: iconst_4
    //   610: anewarray 4	java/lang/Object
    //   613: dup
    //   614: iconst_0
    //   615: lload 5
    //   617: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   620: aastore
    //   621: dup
    //   622: iconst_1
    //   623: aload_3
    //   624: aastore
    //   625: dup
    //   626: iconst_2
    //   627: lload 7
    //   629: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   632: aastore
    //   633: dup
    //   634: iconst_3
    //   635: aload 4
    //   637: getfield 257	com/tencent/mm/protocal/protobuf/aar:wgq	Ljava/lang/String;
    //   640: aastore
    //   641: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   644: iconst_1
    //   645: istore_2
    //   646: ldc 179
    //   648: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   651: goto -635 -> 16
    //   654: astore_1
    //   655: aconst_null
    //   656: astore_1
    //   657: aconst_null
    //   658: astore 9
    //   660: aload 9
    //   662: astore_3
    //   663: aload_1
    //   664: ifnull -59 -> 605
    //   667: aload_1
    //   668: invokevirtual 252	java/io/InputStream:close	()V
    //   671: aload 9
    //   673: astore_3
    //   674: goto -69 -> 605
    //   677: astore_1
    //   678: aload 9
    //   680: astore_3
    //   681: goto -76 -> 605
    //   684: astore_1
    //   685: aconst_null
    //   686: astore_3
    //   687: aload_3
    //   688: ifnull +7 -> 695
    //   691: aload_3
    //   692: invokevirtual 252	java/io/InputStream:close	()V
    //   695: ldc 179
    //   697: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   700: aload_1
    //   701: athrow
    //   702: iconst_0
    //   703: istore_2
    //   704: ldc 179
    //   706: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   709: goto -693 -> 16
    //   712: iconst_1
    //   713: istore_2
    //   714: ldc 179
    //   716: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   719: goto -703 -> 16
    //   722: aload_1
    //   723: invokestatic 129	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   726: astore_1
    //   727: new 35	com/tencent/mm/vfs/b
    //   730: dup
    //   731: aload_1
    //   732: invokestatic 41	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   735: invokespecial 44	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   738: invokevirtual 48	com/tencent/mm/vfs/b:exists	()Z
    //   741: ifeq +13 -> 754
    //   744: iconst_0
    //   745: istore_2
    //   746: ldc 179
    //   748: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   751: goto -735 -> 16
    //   754: aload_1
    //   755: getfield 82	com/tencent/mm/protocal/protobuf/aar:wgg	Ljava/lang/String;
    //   758: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   761: istore_2
    //   762: ldc 179
    //   764: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   767: goto -751 -> 16
    //   770: aload_1
    //   771: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   774: getfield 263	com/tencent/mm/protocal/protobuf/abf:why	Lcom/tencent/mm/protocal/protobuf/aay;
    //   777: ifnonnull +13 -> 790
    //   780: iconst_1
    //   781: istore_2
    //   782: ldc 179
    //   784: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   787: goto -771 -> 16
    //   790: iconst_0
    //   791: istore_2
    //   792: ldc 179
    //   794: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   797: goto -781 -> 16
    //   800: aload_1
    //   801: invokestatic 129	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   804: astore_1
    //   805: aload_1
    //   806: getfield 82	com/tencent/mm/protocal/protobuf/aar:wgg	Ljava/lang/String;
    //   809: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   812: ifeq +43 -> 855
    //   815: aload_1
    //   816: getfield 89	com/tencent/mm/protocal/protobuf/aar:wgi	Ljava/lang/String;
    //   819: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   822: ifeq +33 -> 855
    //   825: aload_1
    //   826: getfield 92	com/tencent/mm/protocal/protobuf/aar:wgk	Ljava/lang/String;
    //   829: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   832: ifeq +23 -> 855
    //   835: aload_1
    //   836: getfield 92	com/tencent/mm/protocal/protobuf/aar:wgk	Ljava/lang/String;
    //   839: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   842: ifeq +13 -> 855
    //   845: iconst_1
    //   846: istore_2
    //   847: ldc 179
    //   849: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   852: goto -836 -> 16
    //   855: iconst_0
    //   856: istore_2
    //   857: ldc 179
    //   859: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   862: goto -846 -> 16
    //   865: aload_1
    //   866: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   869: getfield 267	com/tencent/mm/protocal/protobuf/abf:wit	Lcom/tencent/mm/protocal/protobuf/abl;
    //   872: astore 9
    //   874: aload_1
    //   875: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   878: getfield 271	com/tencent/mm/protocal/protobuf/abf:whA	Lcom/tencent/mm/protocal/protobuf/abu;
    //   881: astore_3
    //   882: aconst_null
    //   883: astore_1
    //   884: aload_3
    //   885: ifnull +8 -> 893
    //   888: aload_3
    //   889: getfield 276	com/tencent/mm/protocal/protobuf/abu:wiY	Ljava/lang/String;
    //   892: astore_1
    //   893: aload_1
    //   894: astore_3
    //   895: aload 9
    //   897: ifnull +18 -> 915
    //   900: aload_1
    //   901: astore_3
    //   902: aload_1
    //   903: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   906: ifeq +9 -> 915
    //   909: aload 9
    //   911: getfield 281	com/tencent/mm/protocal/protobuf/abl:link	Ljava/lang/String;
    //   914: astore_3
    //   915: aload_3
    //   916: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   919: istore_2
    //   920: ldc 179
    //   922: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   925: goto -909 -> 16
    //   928: aload_1
    //   929: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   932: getfield 285	com/tencent/mm/protocal/protobuf/abf:whC	Lcom/tencent/mm/protocal/protobuf/abe;
    //   935: astore_1
    //   936: aload_1
    //   937: ifnull +13 -> 950
    //   940: aload_1
    //   941: getfield 290	com/tencent/mm/protocal/protobuf/abe:info	Ljava/lang/String;
    //   944: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   947: ifeq +13 -> 960
    //   950: iconst_1
    //   951: istore_2
    //   952: ldc 179
    //   954: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   957: goto -941 -> 16
    //   960: iconst_0
    //   961: istore_2
    //   962: ldc 179
    //   964: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   967: goto -951 -> 16
    //   970: aload_1
    //   971: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   974: getfield 294	com/tencent/mm/protocal/protobuf/abf:whE	Lcom/tencent/mm/protocal/protobuf/abo;
    //   977: astore_1
    //   978: aload_1
    //   979: ifnull +13 -> 992
    //   982: aload_1
    //   983: getfield 297	com/tencent/mm/protocal/protobuf/abo:info	Ljava/lang/String;
    //   986: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   989: ifeq +13 -> 1002
    //   992: iconst_1
    //   993: istore_2
    //   994: ldc 179
    //   996: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   999: goto -983 -> 16
    //   1002: iconst_0
    //   1003: istore_2
    //   1004: ldc 179
    //   1006: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1009: goto -993 -> 16
    //   1012: aload_1
    //   1013: getfield 139	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   1016: getfield 285	com/tencent/mm/protocal/protobuf/abf:whC	Lcom/tencent/mm/protocal/protobuf/abe;
    //   1019: astore_1
    //   1020: aload_1
    //   1021: ifnull +13 -> 1034
    //   1024: aload_1
    //   1025: getfield 290	com/tencent/mm/protocal/protobuf/abe:info	Ljava/lang/String;
    //   1028: invokestatic 86	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1031: ifeq +13 -> 1044
    //   1034: iconst_1
    //   1035: istore_2
    //   1036: ldc 179
    //   1038: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1041: goto -1025 -> 16
    //   1044: iconst_0
    //   1045: istore_2
    //   1046: ldc 179
    //   1048: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1051: goto -1035 -> 16
    //   1054: aload_0
    //   1055: getfield 14	com/tencent/mm/plugin/fav/a/k:mfm	Z
    //   1058: ifeq +13 -> 1071
    //   1061: iconst_1
    //   1062: istore_2
    //   1063: ldc 179
    //   1065: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1068: goto -1052 -> 16
    //   1071: iconst_0
    //   1072: istore_2
    //   1073: ldc 179
    //   1075: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1078: goto -1062 -> 16
    //   1081: astore_1
    //   1082: aload 9
    //   1084: astore_3
    //   1085: goto -480 -> 605
    //   1088: astore_3
    //   1089: goto -394 -> 695
    //   1092: astore 9
    //   1094: aload_1
    //   1095: astore_3
    //   1096: aload 9
    //   1098: astore_1
    //   1099: goto -412 -> 687
    //   1102: astore_3
    //   1103: goto -446 -> 657
    //
    // Exception table:
    //   from	to	target	type
    //   573	582	654	java/io/IOException
    //   667	671	677	java/io/IOException
    //   573	582	684	finally
    //   598	602	1081	java/io/IOException
    //   691	695	1088	java/io/IOException
    //   582	591	1092	finally
    //   582	591	1102	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.k
 * JD-Core Version:    0.6.2
 */