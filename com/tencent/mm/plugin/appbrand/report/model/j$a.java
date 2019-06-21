package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.c;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.h;
import com.tencent.mm.aa.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class j$a
  implements Runnable
{
  String appId;
  String cBp;
  String csu;
  String hAP;
  String iBt;
  int iBu;
  long iBv;

  private String aLt()
  {
    AppMethodBeat.i(132618);
    Object localObject1 = "";
    if ((bo.isNullOrNil(this.cBp)) || (bo.isNullOrNil(this.iBt)))
      AppMethodBeat.o(132618);
    while (true)
    {
      return localObject1;
      try
      {
        Object localObject2 = this.iBt;
        int i = -1;
        int j = ((String)localObject2).hashCode();
        switch (j)
        {
        default:
          label68: switch (i)
          {
          default:
          case 0:
          }
          break;
        case -316023509:
        }
        while (true)
        {
          AppMethodBeat.o(132618);
          break;
          if (!((String)localObject2).equals("getLocation"))
            break label68;
          i = 0;
          break label68;
          localObject2 = h.lx(this.cBp);
          localObject2 = String.format("%s;%s;%s;%s;%s;%s;%s", new Object[] { ((c)localObject2).optString("latitude"), ((c)localObject2).optString("longitude"), ((c)localObject2).optString("speed"), ((c)localObject2).optString("accuracy"), ((c)localObject2).optString("altitude"), ((c)localObject2).optString("verticalAccuracy"), ((c)localObject2).optString("horizontalAccuracy") });
          localObject1 = localObject2;
        }
      }
      catch (g localg)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", localg, "get keyParam error!", new Object[0]);
      }
    }
  }

  private String b(c paramc)
  {
    AppMethodBeat.i(132619);
    Object localObject = new i();
    try
    {
      str = this.iBt;
      i = -1;
      int j = str.hashCode();
      switch (j)
      {
      default:
        switch (i)
        {
        default:
          paramc = null;
        case 0:
        }
        break;
      case -1701611132:
      }
    }
    catch (g paramc)
    {
      try
      {
        while (true)
        {
          String str;
          int i;
          localObject = URLEncoder.encode(((i)localObject).toString(), "UTF-8");
          paramc = (c)localObject;
          label82: AppMethodBeat.o(132619);
          return paramc;
          if (str.equals("chooseImage"))
          {
            i = 0;
            continue;
            ((i)localObject).g("sizeType", paramc.optString("sizeType"));
          }
        }
        paramc = paramc;
        ab.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", paramc, "get keyParam error!", new Object[0]);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label82;
      }
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 137
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   9: invokestatic 145	com/tencent/mm/plugin/appbrand/a:wK	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull +16 -> 30
    //   17: ldc 98
    //   19: ldc 147
    //   21: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc 137
    //   26: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: return
    //   30: invokestatic 155	com/tencent/mm/plugin/appbrand/report/model/j:aLr	()Ljava/util/Set;
    //   33: aload_0
    //   34: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   37: invokeinterface 160 2 0
    //   42: ifne +822 -> 864
    //   45: ldc 39
    //   47: astore_2
    //   48: ldc 39
    //   50: astore_3
    //   51: aload_2
    //   52: astore 4
    //   54: aload_3
    //   55: astore 5
    //   57: aload_0
    //   58: getfield 162	com/tencent/mm/plugin/appbrand/report/model/j$a:hAP	Ljava/lang/String;
    //   61: invokestatic 47	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   64: ifne +172 -> 236
    //   67: aload_2
    //   68: astore 4
    //   70: aload_3
    //   71: astore 5
    //   73: aload_0
    //   74: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   77: invokestatic 47	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   80: ifne +156 -> 236
    //   83: aload_0
    //   84: getfield 162	com/tencent/mm/plugin/appbrand/report/model/j$a:hAP	Ljava/lang/String;
    //   87: invokestatic 70	com/tencent/mm/aa/h:lx	(Ljava/lang/String;)Lcom/tencent/mm/aa/c;
    //   90: astore 6
    //   92: aload_0
    //   93: aload 6
    //   95: invokespecial 164	com/tencent/mm/plugin/appbrand/report/model/j$a:b	(Lcom/tencent/mm/aa/c;)Ljava/lang/String;
    //   98: astore 5
    //   100: aload_2
    //   101: astore 4
    //   103: aload 6
    //   105: ldc 166
    //   107: invokeinterface 169 2 0
    //   112: ifeq +760 -> 872
    //   115: aload_2
    //   116: astore 4
    //   118: aload_0
    //   119: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   122: ldc 171
    //   124: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   127: ifne +93 -> 220
    //   130: aload_2
    //   131: astore 4
    //   133: aload_0
    //   134: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   137: ldc 173
    //   139: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   142: ifne +78 -> 220
    //   145: aload_2
    //   146: astore 4
    //   148: aload_0
    //   149: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   152: ldc 175
    //   154: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   157: ifne +63 -> 220
    //   160: aload_2
    //   161: astore 4
    //   163: aload_0
    //   164: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   167: ldc 177
    //   169: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   172: ifne +48 -> 220
    //   175: aload_2
    //   176: astore 4
    //   178: aload_0
    //   179: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   182: ldc 179
    //   184: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   187: ifne +33 -> 220
    //   190: aload_2
    //   191: astore 4
    //   193: aload_0
    //   194: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   197: ldc 181
    //   199: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   202: ifne +18 -> 220
    //   205: aload_2
    //   206: astore 4
    //   208: aload_0
    //   209: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   212: ldc 183
    //   214: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: ifeq +655 -> 872
    //   220: aload_2
    //   221: astore 4
    //   223: aload 6
    //   225: ldc 166
    //   227: invokeinterface 80 2 0
    //   232: astore_2
    //   233: aload_2
    //   234: astore 4
    //   236: aload_0
    //   237: invokespecial 185	com/tencent/mm/plugin/appbrand/report/model/j$a:aLt	()Ljava/lang/String;
    //   240: astore 7
    //   242: ldc 39
    //   244: astore_3
    //   245: aload_3
    //   246: astore_2
    //   247: aload_0
    //   248: getfield 187	com/tencent/mm/plugin/appbrand/report/model/j$a:csu	Ljava/lang/String;
    //   251: invokestatic 47	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   254: ifne +37 -> 291
    //   257: aload_3
    //   258: astore_2
    //   259: aload_0
    //   260: getfield 187	com/tencent/mm/plugin/appbrand/report/model/j$a:csu	Ljava/lang/String;
    //   263: ldc 189
    //   265: invokevirtual 192	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   268: ifeq +23 -> 291
    //   271: aload_0
    //   272: getfield 187	com/tencent/mm/plugin/appbrand/report/model/j$a:csu	Ljava/lang/String;
    //   275: iconst_0
    //   276: aload_0
    //   277: getfield 187	com/tencent/mm/plugin/appbrand/report/model/j$a:csu	Ljava/lang/String;
    //   280: ldc 189
    //   282: invokevirtual 196	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   285: iconst_5
    //   286: iadd
    //   287: invokevirtual 200	java/lang/String:substring	(II)Ljava/lang/String;
    //   290: astore_2
    //   291: ldc 39
    //   293: astore_3
    //   294: aload_2
    //   295: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   298: ldc 119
    //   300: invokestatic 125	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   303: astore 6
    //   305: aload 6
    //   307: astore_3
    //   308: ldc 39
    //   310: astore 6
    //   312: aload 4
    //   314: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   317: ldc 119
    //   319: invokestatic 125	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   322: astore 8
    //   324: aload 8
    //   326: astore 6
    //   328: ldc 39
    //   330: astore 8
    //   332: aload 7
    //   334: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   337: ldc 119
    //   339: invokestatic 125	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   342: astore 9
    //   344: aload 9
    //   346: astore 8
    //   348: aload_0
    //   349: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   352: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   355: astore 9
    //   357: aload_0
    //   358: getfield 41	com/tencent/mm/plugin/appbrand/report/model/j$a:cBp	Ljava/lang/String;
    //   361: invokestatic 206	com/tencent/mm/plugin/appbrand/report/model/j:DE	(Ljava/lang/String;)Ljava/lang/String;
    //   364: astore 10
    //   366: aload 10
    //   368: invokestatic 209	com/tencent/mm/plugin/appbrand/report/model/j:DF	(Ljava/lang/String;)I
    //   371: istore 11
    //   373: aload_1
    //   374: getfield 214	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:cst	Ljava/lang/String;
    //   377: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   380: astore 12
    //   382: invokestatic 220	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   385: invokestatic 226	com/tencent/mm/plugin/appbrand/report/c:cV	(Landroid/content/Context;)Ljava/lang/String;
    //   388: astore 13
    //   390: aload_1
    //   391: getfield 229	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   394: ifne +10 -> 404
    //   397: aload_1
    //   398: sipush 1000
    //   401: putfield 229	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   404: aload_0
    //   405: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   408: invokestatic 233	com/tencent/mm/plugin/appbrand/a:wJ	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;
    //   411: astore 14
    //   413: aload 14
    //   415: ifnull +449 -> 864
    //   418: aload 14
    //   420: getfield 239	com/tencent/mm/plugin/appbrand/config/h:hhd	Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   423: getfield 244	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVu	I
    //   426: istore 15
    //   428: aload 14
    //   430: getfield 239	com/tencent/mm/plugin/appbrand/config/h:hhd	Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   433: getfield 247	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVt	I
    //   436: iconst_1
    //   437: iadd
    //   438: istore 16
    //   440: aload_0
    //   441: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   444: invokestatic 250	com/tencent/mm/plugin/appbrand/report/c:Dw	(Ljava/lang/String;)I
    //   447: istore 17
    //   449: ldc 98
    //   451: ldc 252
    //   453: bipush 19
    //   455: anewarray 4	java/lang/Object
    //   458: dup
    //   459: iconst_0
    //   460: aload_1
    //   461: getfield 229	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   464: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   467: aastore
    //   468: dup
    //   469: iconst_1
    //   470: aload 12
    //   472: aastore
    //   473: dup
    //   474: iconst_2
    //   475: aload_0
    //   476: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   479: aastore
    //   480: dup
    //   481: iconst_3
    //   482: iload 15
    //   484: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: aastore
    //   488: dup
    //   489: iconst_4
    //   490: iload 16
    //   492: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   495: aastore
    //   496: dup
    //   497: iconst_5
    //   498: aload_2
    //   499: aastore
    //   500: dup
    //   501: bipush 6
    //   503: aload 13
    //   505: aastore
    //   506: dup
    //   507: bipush 7
    //   509: aload 9
    //   511: aastore
    //   512: dup
    //   513: bipush 8
    //   515: aload 4
    //   517: aastore
    //   518: dup
    //   519: bipush 9
    //   521: iload 11
    //   523: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   526: aastore
    //   527: dup
    //   528: bipush 10
    //   530: aload_0
    //   531: getfield 260	com/tencent/mm/plugin/appbrand/report/model/j$a:iBu	I
    //   534: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   537: aastore
    //   538: dup
    //   539: bipush 11
    //   541: iconst_0
    //   542: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   545: aastore
    //   546: dup
    //   547: bipush 12
    //   549: aload_0
    //   550: getfield 262	com/tencent/mm/plugin/appbrand/report/model/j$a:iBv	J
    //   553: invokestatic 267	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   556: aastore
    //   557: dup
    //   558: bipush 13
    //   560: iconst_0
    //   561: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   564: aastore
    //   565: dup
    //   566: bipush 14
    //   568: aload 10
    //   570: aastore
    //   571: dup
    //   572: bipush 15
    //   574: aload_1
    //   575: getfield 270	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:iAo	I
    //   578: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   581: aastore
    //   582: dup
    //   583: bipush 16
    //   585: iload 17
    //   587: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   590: aastore
    //   591: dup
    //   592: bipush 17
    //   594: aload 7
    //   596: aastore
    //   597: dup
    //   598: bipush 18
    //   600: aload 5
    //   602: aastore
    //   603: invokestatic 274	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   606: bipush 21
    //   608: anewarray 4	java/lang/Object
    //   611: astore 4
    //   613: aload 4
    //   615: iconst_0
    //   616: aload_1
    //   617: getfield 229	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   620: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   623: aastore
    //   624: aload 4
    //   626: iconst_1
    //   627: aload 12
    //   629: aastore
    //   630: aload 4
    //   632: iconst_2
    //   633: aload_0
    //   634: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   637: aastore
    //   638: aload 4
    //   640: iconst_3
    //   641: iload 15
    //   643: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   646: aastore
    //   647: aload 4
    //   649: iconst_4
    //   650: iload 16
    //   652: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   655: aastore
    //   656: aload 4
    //   658: iconst_5
    //   659: aload_3
    //   660: aastore
    //   661: aload 4
    //   663: bipush 6
    //   665: aload 13
    //   667: aastore
    //   668: aload 4
    //   670: bipush 7
    //   672: aload 9
    //   674: aastore
    //   675: aload 4
    //   677: bipush 8
    //   679: aload 6
    //   681: aastore
    //   682: aload 4
    //   684: bipush 9
    //   686: iload 11
    //   688: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   691: aastore
    //   692: aload 4
    //   694: bipush 10
    //   696: aload_0
    //   697: getfield 260	com/tencent/mm/plugin/appbrand/report/model/j$a:iBu	I
    //   700: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   703: aastore
    //   704: aload 4
    //   706: bipush 11
    //   708: iconst_0
    //   709: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   712: aastore
    //   713: aload 4
    //   715: bipush 12
    //   717: aload_0
    //   718: getfield 262	com/tencent/mm/plugin/appbrand/report/model/j$a:iBv	J
    //   721: invokestatic 267	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   724: aastore
    //   725: aload 4
    //   727: bipush 13
    //   729: iconst_0
    //   730: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   733: aastore
    //   734: aload 4
    //   736: bipush 14
    //   738: aload 10
    //   740: aastore
    //   741: aload 4
    //   743: bipush 15
    //   745: aload_1
    //   746: getfield 270	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:iAo	I
    //   749: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   752: aastore
    //   753: aload 4
    //   755: bipush 16
    //   757: aload_1
    //   758: getfield 277	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:cOq	I
    //   761: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   764: aastore
    //   765: aload 4
    //   767: bipush 17
    //   769: aload_1
    //   770: getfield 280	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:cOr	Ljava/lang/String;
    //   773: aastore
    //   774: aload 4
    //   776: bipush 18
    //   778: iload 17
    //   780: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   783: aastore
    //   784: aload 4
    //   786: bipush 19
    //   788: aload 8
    //   790: aastore
    //   791: aload 4
    //   793: bipush 20
    //   795: aload 5
    //   797: aastore
    //   798: getstatic 286	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   801: astore 5
    //   803: aload 4
    //   805: invokestatic 290	com/tencent/mm/plugin/report/service/h:s	([Ljava/lang/Object;)Ljava/lang/String;
    //   808: astore 5
    //   810: invokestatic 294	com/tencent/mm/sdk/platformtools/ah:bqo	()Z
    //   813: ifeq +709 -> 1522
    //   816: getstatic 300	com/tencent/mm/plugin/report/a/c:pXd	Z
    //   819: ifeq +689 -> 1508
    //   822: getstatic 303	com/tencent/mm/plugin/report/a/c:pXe	Z
    //   825: istore 18
    //   827: ldc2_w 304
    //   830: aload 5
    //   832: iload 18
    //   834: iload 18
    //   836: iconst_1
    //   837: invokestatic 310	com/tencent/mm/plugin/report/service/e:a	(JLjava/lang/String;ZZZ)V
    //   840: invokestatic 313	com/tencent/mm/plugin/appbrand/report/model/j:aLs	()Ljava/util/Set;
    //   843: aload 9
    //   845: invokeinterface 160 2 0
    //   850: ifeq +14 -> 864
    //   853: getstatic 286	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   856: sipush 15761
    //   859: aload 4
    //   861: invokevirtual 316	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   864: ldc 137
    //   866: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   869: goto -840 -> 29
    //   872: aload_2
    //   873: astore 4
    //   875: aload_0
    //   876: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   879: ldc_w 318
    //   882: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   885: istore 18
    //   887: iload 18
    //   889: ifeq +122 -> 1011
    //   892: aload_2
    //   893: astore 4
    //   895: aload 6
    //   897: ldc_w 320
    //   900: invokeinterface 80 2 0
    //   905: invokestatic 324	com/tencent/mm/aa/h:ly	(Ljava/lang/String;)Lcom/tencent/mm/aa/a;
    //   908: astore_3
    //   909: aload_2
    //   910: astore 4
    //   912: new 326	java/util/LinkedList
    //   915: astore 6
    //   917: aload_2
    //   918: astore 4
    //   920: aload 6
    //   922: invokespecial 327	java/util/LinkedList:<init>	()V
    //   925: iconst_0
    //   926: istore 17
    //   928: aload_2
    //   929: astore 4
    //   931: iload 17
    //   933: aload_3
    //   934: invokeinterface 332 1 0
    //   939: if_icmpge +57 -> 996
    //   942: aload_2
    //   943: astore 4
    //   945: aload 6
    //   947: aload_3
    //   948: iload 17
    //   950: invokeinterface 335 2 0
    //   955: invokevirtual 338	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   958: pop
    //   959: iinc 17 1
    //   962: goto -34 -> 928
    //   965: astore_3
    //   966: aload_2
    //   967: astore 4
    //   969: ldc 98
    //   971: ldc_w 340
    //   974: iconst_1
    //   975: anewarray 4	java/lang/Object
    //   978: dup
    //   979: iconst_0
    //   980: aload_3
    //   981: invokevirtual 343	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   984: aastore
    //   985: invokestatic 345	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   988: ldc 137
    //   990: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   993: goto -964 -> 29
    //   996: aload_2
    //   997: astore 4
    //   999: aload 6
    //   1001: invokevirtual 346	java/util/LinkedList:toString	()Ljava/lang/String;
    //   1004: astore_2
    //   1005: aload_2
    //   1006: astore 4
    //   1008: goto -772 -> 236
    //   1011: aload_2
    //   1012: astore 4
    //   1014: aload_0
    //   1015: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1018: ldc_w 348
    //   1021: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1024: istore 18
    //   1026: iload 18
    //   1028: ifeq +48 -> 1076
    //   1031: aload_2
    //   1032: astore 4
    //   1034: aload 6
    //   1036: invokevirtual 349	java/lang/Object:toString	()Ljava/lang/String;
    //   1039: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   1042: ldc 119
    //   1044: invokestatic 125	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1047: astore_3
    //   1048: aload_3
    //   1049: astore 4
    //   1051: goto -815 -> 236
    //   1054: astore_3
    //   1055: aload_2
    //   1056: astore 4
    //   1058: ldc 98
    //   1060: aload_3
    //   1061: ldc 39
    //   1063: iconst_0
    //   1064: anewarray 4	java/lang/Object
    //   1067: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1070: aload_2
    //   1071: astore 4
    //   1073: goto -837 -> 236
    //   1076: aload_2
    //   1077: astore 4
    //   1079: aload_0
    //   1080: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1083: ldc_w 351
    //   1086: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1089: ifeq +23 -> 1112
    //   1092: aload_2
    //   1093: astore 4
    //   1095: aload 6
    //   1097: ldc_w 353
    //   1100: invokeinterface 80 2 0
    //   1105: astore_2
    //   1106: aload_2
    //   1107: astore 4
    //   1109: goto -873 -> 236
    //   1112: aload_2
    //   1113: astore 4
    //   1115: aload_0
    //   1116: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1119: ldc_w 355
    //   1122: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1125: ifeq +23 -> 1148
    //   1128: aload_2
    //   1129: astore 4
    //   1131: aload_0
    //   1132: getfield 139	com/tencent/mm/plugin/appbrand/report/model/j$a:appId	Ljava/lang/String;
    //   1135: invokestatic 361	com/tencent/mm/plugin/appbrand/n:xa	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/n;
    //   1138: getfield 364	com/tencent/mm/plugin/appbrand/n:gPc	Ljava/lang/String;
    //   1141: astore_2
    //   1142: aload_2
    //   1143: astore 4
    //   1145: goto -909 -> 236
    //   1148: aload_2
    //   1149: astore 4
    //   1151: aload_0
    //   1152: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1155: ldc_w 366
    //   1158: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1161: ifeq +23 -> 1184
    //   1164: aload_2
    //   1165: astore 4
    //   1167: aload 6
    //   1169: ldc_w 368
    //   1172: invokeinterface 80 2 0
    //   1177: astore_2
    //   1178: aload_2
    //   1179: astore 4
    //   1181: goto -945 -> 236
    //   1184: aload_2
    //   1185: astore 4
    //   1187: aload_0
    //   1188: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1191: ldc_w 370
    //   1194: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1197: ifeq +23 -> 1220
    //   1200: aload_2
    //   1201: astore 4
    //   1203: aload 6
    //   1205: ldc_w 372
    //   1208: invokeinterface 80 2 0
    //   1213: astore_2
    //   1214: aload_2
    //   1215: astore 4
    //   1217: goto -981 -> 236
    //   1220: aload_2
    //   1221: astore 4
    //   1223: aload_0
    //   1224: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1227: ldc_w 374
    //   1230: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1233: ifeq +61 -> 1294
    //   1236: aload_2
    //   1237: astore 4
    //   1239: aload 6
    //   1241: ldc_w 376
    //   1244: invokeinterface 80 2 0
    //   1249: astore_2
    //   1250: aload_2
    //   1251: astore 4
    //   1253: aload 6
    //   1255: ldc_w 376
    //   1258: invokeinterface 80 2 0
    //   1263: ldc 119
    //   1265: invokestatic 125	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1268: astore_3
    //   1269: aload_3
    //   1270: astore 4
    //   1272: goto -1036 -> 236
    //   1275: astore_3
    //   1276: aload_2
    //   1277: astore 4
    //   1279: ldc 98
    //   1281: aload_3
    //   1282: invokevirtual 377	java/lang/Exception:toString	()Ljava/lang/String;
    //   1285: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1288: aload_2
    //   1289: astore 4
    //   1291: goto -1055 -> 236
    //   1294: aload_2
    //   1295: astore 4
    //   1297: aload_0
    //   1298: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1301: ldc_w 379
    //   1304: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1307: ifeq +23 -> 1330
    //   1310: aload_2
    //   1311: astore 4
    //   1313: aload 6
    //   1315: ldc_w 381
    //   1318: invokeinterface 80 2 0
    //   1323: astore_2
    //   1324: aload_2
    //   1325: astore 4
    //   1327: goto -1091 -> 236
    //   1330: aload_2
    //   1331: astore_3
    //   1332: aload_2
    //   1333: astore 4
    //   1335: aload_0
    //   1336: getfield 49	com/tencent/mm/plugin/appbrand/report/model/j$a:iBt	Ljava/lang/String;
    //   1339: ldc_w 383
    //   1342: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1345: ifeq +76 -> 1421
    //   1348: aload_2
    //   1349: astore 4
    //   1351: aload 6
    //   1353: ldc_w 385
    //   1356: invokeinterface 80 2 0
    //   1361: astore_3
    //   1362: aload_3
    //   1363: astore 4
    //   1365: aload_3
    //   1366: invokestatic 47	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1369: ifne +16 -> 1385
    //   1372: aload_3
    //   1373: astore 4
    //   1375: aload_3
    //   1376: ldc_w 387
    //   1379: invokevirtual 390	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1382: ifeq +24 -> 1406
    //   1385: aload_3
    //   1386: astore 4
    //   1388: getstatic 286	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1391: ldc2_w 391
    //   1394: lconst_1
    //   1395: lconst_1
    //   1396: iconst_0
    //   1397: invokevirtual 395	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1400: aload_3
    //   1401: astore 4
    //   1403: goto -1167 -> 236
    //   1406: aload_3
    //   1407: astore 4
    //   1409: getstatic 286	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1412: ldc2_w 391
    //   1415: lconst_0
    //   1416: lconst_1
    //   1417: iconst_0
    //   1418: invokevirtual 395	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1421: aload_3
    //   1422: astore 4
    //   1424: goto -1188 -> 236
    //   1427: astore 6
    //   1429: aload_3
    //   1430: astore 5
    //   1432: aload_2
    //   1433: astore 4
    //   1435: ldc 98
    //   1437: aload 6
    //   1439: ldc 100
    //   1441: iconst_0
    //   1442: anewarray 4	java/lang/Object
    //   1445: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1448: goto -1212 -> 236
    //   1451: astore 6
    //   1453: ldc 98
    //   1455: aload 6
    //   1457: ldc_w 397
    //   1460: iconst_0
    //   1461: anewarray 4	java/lang/Object
    //   1464: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1467: goto -1159 -> 308
    //   1470: astore 8
    //   1472: ldc 98
    //   1474: aload 8
    //   1476: ldc_w 399
    //   1479: iconst_0
    //   1480: anewarray 4	java/lang/Object
    //   1483: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1486: goto -1158 -> 328
    //   1489: astore 9
    //   1491: ldc 98
    //   1493: aload 9
    //   1495: ldc_w 401
    //   1498: iconst_0
    //   1499: anewarray 4	java/lang/Object
    //   1502: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1505: goto -1157 -> 348
    //   1508: ldc2_w 304
    //   1511: aload 5
    //   1513: iconst_0
    //   1514: iconst_0
    //   1515: iconst_1
    //   1516: invokestatic 310	com/tencent/mm/plugin/report/service/e:a	(JLjava/lang/String;ZZZ)V
    //   1519: goto -679 -> 840
    //   1522: sipush 13542
    //   1525: aload 5
    //   1527: iconst_0
    //   1528: iconst_1
    //   1529: invokestatic 404	com/tencent/mm/plugin/report/service/h:b	(ILjava/lang/String;ZZ)V
    //   1532: goto -692 -> 840
    //   1535: astore_2
    //   1536: aload_2
    //   1537: astore 6
    //   1539: goto -104 -> 1435
    //
    // Exception table:
    //   from	to	target	type
    //   895	909	965	java/lang/Exception
    //   1034	1048	1054	java/io/UnsupportedEncodingException
    //   1253	1269	1275	java/lang/Exception
    //   83	100	1427	com/tencent/mm/aa/g
    //   294	305	1451	java/io/UnsupportedEncodingException
    //   312	324	1470	java/io/UnsupportedEncodingException
    //   332	344	1489	java/io/UnsupportedEncodingException
    //   103	115	1535	com/tencent/mm/aa/g
    //   118	130	1535	com/tencent/mm/aa/g
    //   133	145	1535	com/tencent/mm/aa/g
    //   148	160	1535	com/tencent/mm/aa/g
    //   163	175	1535	com/tencent/mm/aa/g
    //   178	190	1535	com/tencent/mm/aa/g
    //   193	205	1535	com/tencent/mm/aa/g
    //   208	220	1535	com/tencent/mm/aa/g
    //   223	233	1535	com/tencent/mm/aa/g
    //   875	887	1535	com/tencent/mm/aa/g
    //   895	909	1535	com/tencent/mm/aa/g
    //   912	917	1535	com/tencent/mm/aa/g
    //   920	925	1535	com/tencent/mm/aa/g
    //   931	942	1535	com/tencent/mm/aa/g
    //   945	959	1535	com/tencent/mm/aa/g
    //   969	988	1535	com/tencent/mm/aa/g
    //   999	1005	1535	com/tencent/mm/aa/g
    //   1014	1026	1535	com/tencent/mm/aa/g
    //   1034	1048	1535	com/tencent/mm/aa/g
    //   1058	1070	1535	com/tencent/mm/aa/g
    //   1079	1092	1535	com/tencent/mm/aa/g
    //   1095	1106	1535	com/tencent/mm/aa/g
    //   1115	1128	1535	com/tencent/mm/aa/g
    //   1131	1142	1535	com/tencent/mm/aa/g
    //   1151	1164	1535	com/tencent/mm/aa/g
    //   1167	1178	1535	com/tencent/mm/aa/g
    //   1187	1200	1535	com/tencent/mm/aa/g
    //   1203	1214	1535	com/tencent/mm/aa/g
    //   1223	1236	1535	com/tencent/mm/aa/g
    //   1239	1250	1535	com/tencent/mm/aa/g
    //   1253	1269	1535	com/tencent/mm/aa/g
    //   1279	1288	1535	com/tencent/mm/aa/g
    //   1297	1310	1535	com/tencent/mm/aa/g
    //   1313	1324	1535	com/tencent/mm/aa/g
    //   1335	1348	1535	com/tencent/mm/aa/g
    //   1351	1362	1535	com/tencent/mm/aa/g
    //   1365	1372	1535	com/tencent/mm/aa/g
    //   1375	1385	1535	com/tencent/mm/aa/g
    //   1388	1400	1535	com/tencent/mm/aa/g
    //   1409	1421	1535	com/tencent/mm/aa/g
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.j.a
 * JD-Core Version:    0.6.2
 */