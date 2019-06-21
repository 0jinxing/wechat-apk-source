package com.tencent.mm.plugin.appbrand.s.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Map;

final class b extends a.a
{
  private final Map<String, a.b> iSi;

  b()
  {
    AppMethodBeat.i(133604);
    this.iSi = new HashMap();
    this.iSi.put("xiaomi", new b.1(this));
    this.iSi.put("oppo", new b.2(this));
    this.iSi.put("vivo", new b.3(this));
    AppMethodBeat.o(133604);
  }

  private static String getManufacturer()
  {
    AppMethodBeat.i(133608);
    String str = q.bB(ah.getContext()).toLowerCase();
    AppMethodBeat.o(133608);
    return str;
  }

  // ERROR //
  public final int aOd()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 75
    //   6: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: invokestatic 59	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   12: astore_3
    //   13: invokestatic 77	com/tencent/mm/plugin/appbrand/s/c/b:getManufacturer	()Ljava/lang/String;
    //   16: astore 4
    //   18: ldc 79
    //   20: ldc 81
    //   22: iconst_1
    //   23: anewarray 83	java/lang/Object
    //   26: dup
    //   27: iconst_0
    //   28: aload 4
    //   30: aastore
    //   31: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload 4
    //   36: invokevirtual 91	java/lang/String:hashCode	()I
    //   39: lookupswitch	default:+49->88, -1206476313:+116->155, -759499589:+132->171, 3418016:+148->187, 3620012:+164->203, 99462250:+100->139
    //   89: istore 5
    //   91: iload 5
    //   93: tableswitch	default:+35 -> 128, 0:+126->219, 1:+126->219, 2:+137->230, 3:+148->241, 4:+295->388
    //   129: astore_0
    //   130: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: iconst_m1
    //   134: istore 5
    //   136: iload 5
    //   138: ireturn
    //   139: aload 4
    //   141: ldc 93
    //   143: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifeq -58 -> 88
    //   149: iconst_0
    //   150: istore 5
    //   152: goto -61 -> 91
    //   155: aload 4
    //   157: ldc 99
    //   159: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   162: ifeq -74 -> 88
    //   165: iconst_1
    //   166: istore 5
    //   168: goto -77 -> 91
    //   171: aload 4
    //   173: ldc 25
    //   175: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   178: ifeq -90 -> 88
    //   181: iconst_2
    //   182: istore 5
    //   184: goto -93 -> 91
    //   187: aload 4
    //   189: ldc 38
    //   191: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   194: ifeq -106 -> 88
    //   197: iconst_3
    //   198: istore 5
    //   200: goto -109 -> 91
    //   203: aload 4
    //   205: ldc 43
    //   207: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   210: ifeq -122 -> 88
    //   213: iconst_4
    //   214: istore 5
    //   216: goto -125 -> 91
    //   219: ldc 75
    //   221: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: iconst_m1
    //   225: istore 5
    //   227: goto -91 -> 136
    //   230: ldc 75
    //   232: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: iconst_m1
    //   236: istore 5
    //   238: goto -102 -> 136
    //   241: aload_3
    //   242: invokevirtual 105	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   245: ldc 107
    //   247: invokestatic 113	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   250: astore_1
    //   251: aload_1
    //   252: iconst_1
    //   253: aload_1
    //   254: invokevirtual 116	java/lang/String:length	()I
    //   257: iconst_1
    //   258: isub
    //   259: invokevirtual 120	java/lang/String:subSequence	(II)Ljava/lang/CharSequence;
    //   262: invokestatic 124	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   265: ldc 126
    //   267: invokevirtual 130	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   270: astore 4
    //   272: aload 4
    //   274: arraylength
    //   275: istore 6
    //   277: iconst_0
    //   278: istore 5
    //   280: aload_2
    //   281: astore_1
    //   282: iload 5
    //   284: iload 6
    //   286: if_icmpge +27 -> 313
    //   289: aload 4
    //   291: iload 5
    //   293: aaload
    //   294: astore_1
    //   295: aload_1
    //   296: aload_3
    //   297: invokevirtual 133	android/content/Context:getPackageName	()Ljava/lang/String;
    //   300: invokevirtual 137	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   303: ifeq +25 -> 328
    //   306: aload_1
    //   307: ldc 139
    //   309: invokevirtual 130	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   312: astore_1
    //   313: aload_1
    //   314: ifnonnull +20 -> 334
    //   317: ldc 75
    //   319: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: iconst_m1
    //   323: istore 5
    //   325: goto -189 -> 136
    //   328: iinc 5 1
    //   331: goto -51 -> 280
    //   334: aload_1
    //   335: iconst_1
    //   336: aaload
    //   337: invokevirtual 142	java/lang/String:trim	()Ljava/lang/String;
    //   340: invokestatic 147	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   343: invokevirtual 150	java/lang/Integer:intValue	()I
    //   346: istore 5
    //   348: iload 5
    //   350: iconst_1
    //   351: if_icmpne +14 -> 365
    //   354: ldc 75
    //   356: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   359: iconst_0
    //   360: istore 5
    //   362: goto -226 -> 136
    //   365: ldc 75
    //   367: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   370: iconst_1
    //   371: istore 5
    //   373: goto -237 -> 136
    //   376: astore_1
    //   377: ldc 75
    //   379: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   382: iconst_m1
    //   383: istore 5
    //   385: goto -249 -> 136
    //   388: ldc 152
    //   390: invokestatic 158	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   393: astore_2
    //   394: aload_3
    //   395: invokevirtual 105	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   398: astore_3
    //   399: new 160	java/lang/StringBuilder
    //   402: astore 4
    //   404: aload 4
    //   406: invokespecial 161	java/lang/StringBuilder:<init>	()V
    //   409: aload 4
    //   411: ldc 163
    //   413: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: ldc 169
    //   418: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: astore 7
    //   423: new 171	android/content/ComponentName
    //   426: astore 4
    //   428: aload 4
    //   430: invokestatic 59	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   433: ldc 173
    //   435: invokespecial 176	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   438: aload 7
    //   440: aload 4
    //   442: invokevirtual 179	android/content/ComponentName:flattenToString	()Ljava/lang/String;
    //   445: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: ldc 181
    //   450: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   456: astore 4
    //   458: aload_3
    //   459: aload_2
    //   460: iconst_2
    //   461: anewarray 67	java/lang/String
    //   464: dup
    //   465: iconst_0
    //   466: ldc 163
    //   468: aastore
    //   469: dup
    //   470: iconst_1
    //   471: ldc 186
    //   473: aastore
    //   474: aload 4
    //   476: aconst_null
    //   477: aconst_null
    //   478: invokevirtual 192	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   481: astore_2
    //   482: aload_2
    //   483: ifnonnull +24 -> 507
    //   486: aload_2
    //   487: ifnull +9 -> 496
    //   490: aload_2
    //   491: invokeinterface 197 1 0
    //   496: ldc 75
    //   498: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   501: iconst_m1
    //   502: istore 5
    //   504: goto -368 -> 136
    //   507: aload_2
    //   508: astore_1
    //   509: aload_2
    //   510: ldc 186
    //   512: invokeinterface 201 2 0
    //   517: istore 5
    //   519: aload_2
    //   520: astore_1
    //   521: aload_2
    //   522: invokeinterface 205 1 0
    //   527: pop
    //   528: aload_2
    //   529: astore_1
    //   530: aload_2
    //   531: iload 5
    //   533: invokeinterface 209 2 0
    //   538: istore 5
    //   540: aload_2
    //   541: astore_1
    //   542: ldc 79
    //   544: ldc 211
    //   546: iload 5
    //   548: invokestatic 214	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   551: invokevirtual 218	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   554: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   557: iload 5
    //   559: bipush 16
    //   561: if_icmpne +24 -> 585
    //   564: aload_2
    //   565: ifnull +9 -> 574
    //   568: aload_2
    //   569: invokeinterface 197 1 0
    //   574: ldc 75
    //   576: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   579: iconst_0
    //   580: istore 5
    //   582: goto -446 -> 136
    //   585: aload_2
    //   586: ifnull +9 -> 595
    //   589: aload_2
    //   590: invokeinterface 197 1 0
    //   595: ldc 75
    //   597: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   600: iconst_1
    //   601: istore 5
    //   603: goto -467 -> 136
    //   606: astore_3
    //   607: aconst_null
    //   608: astore_2
    //   609: aload_2
    //   610: astore_1
    //   611: new 160	java/lang/StringBuilder
    //   614: astore 4
    //   616: aload_2
    //   617: astore_1
    //   618: aload 4
    //   620: ldc 223
    //   622: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   625: aload_2
    //   626: astore_1
    //   627: ldc 79
    //   629: aload 4
    //   631: aload_3
    //   632: invokevirtual 229	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   635: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   641: invokestatic 232	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   644: aload_2
    //   645: ifnull +9 -> 654
    //   648: aload_2
    //   649: invokeinterface 197 1 0
    //   654: ldc 75
    //   656: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   659: iconst_m1
    //   660: istore 5
    //   662: goto -526 -> 136
    //   665: astore_2
    //   666: aload_1
    //   667: ifnull +9 -> 676
    //   670: aload_1
    //   671: invokeinterface 197 1 0
    //   676: ldc 75
    //   678: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   681: aload_2
    //   682: athrow
    //   683: astore_2
    //   684: goto -18 -> 666
    //   687: astore_3
    //   688: goto -79 -> 609
    //
    // Exception table:
    //   from	to	target	type
    //   241	277	376	java/lang/Exception
    //   295	313	376	java/lang/Exception
    //   334	348	376	java/lang/Exception
    //   388	482	606	java/lang/Exception
    //   388	482	665	finally
    //   509	519	683	finally
    //   521	528	683	finally
    //   530	540	683	finally
    //   542	557	683	finally
    //   611	616	683	finally
    //   618	625	683	finally
    //   627	644	683	finally
    //   509	519	687	java/lang/Exception
    //   521	528	687	java/lang/Exception
    //   530	540	687	java/lang/Exception
    //   542	557	687	java/lang/Exception
  }

  public final boolean aOe()
  {
    AppMethodBeat.i(133607);
    String str = getManufacturer();
    ab.i("MicroMsg.AppPermissionSettingAdapterFactory", "[canJumpSettingPage] manufacturer = %s", new Object[] { str });
    a.b localb = (a.b)this.iSi.get(str);
    if ((this.iSi.containsKey(str)) && (localb.aOf()))
      AppMethodBeat.o(133607);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(133607);
    }
  }

  public final void dc(Context paramContext)
  {
    AppMethodBeat.i(133606);
    Object localObject = q.bB(paramContext).toLowerCase();
    ab.i("MicroMsg.AppPermissionSettingAdapterFactory", "[jumpPermissionSettingPage] manufacturer = %s", new Object[] { localObject });
    localObject = (a.b)this.iSi.get(localObject);
    if (localObject != null)
      ((a.b)localObject).dd(paramContext);
    AppMethodBeat.o(133606);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c.b
 * JD-Core Version:    0.6.2
 */