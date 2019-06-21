package com.tencent.mm.plugin.gwallet;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public class GWalletQueryProvider extends ContentProvider
{
  public static final String[] COLUMNS = { "_id", "product_id", "full_price", "product_state", "price_currency", "price_amount" };
  private final String TAG = "MicroMsg.GWalletQueryProvider";
  private Context mContext = null;
  private ArrayList<String> npA;
  private int npB;
  private b npw = null;
  private boolean npx;
  private boolean npy;
  private ArrayList<String> npz;

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    AppMethodBeat.i(41671);
    ab.d("MicroMsg.GWalletQueryProvider", "successfully loaded");
    AppMethodBeat.o(41671);
    return true;
  }

  // ERROR //
  public android.database.Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    // Byte code:
    //   0: ldc 113
    //   2: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 2
    //   7: monitorenter
    //   8: ldc 45
    //   10: ldc 115
    //   12: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload 4
    //   17: ifnull +9 -> 26
    //   20: aload 4
    //   22: arraylength
    //   23: ifne +38 -> 61
    //   26: ldc 45
    //   28: ldc 117
    //   30: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: new 119	java/lang/IllegalArgumentException
    //   36: astore_1
    //   37: aload_1
    //   38: ldc 117
    //   40: invokespecial 122	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   43: ldc 113
    //   45: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: ldc 2
    //   53: monitorexit
    //   54: ldc 113
    //   56: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_1
    //   60: athrow
    //   61: aload_0
    //   62: aload_0
    //   63: invokevirtual 126	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:getContext	()Landroid/content/Context;
    //   66: putfield 51	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:mContext	Landroid/content/Context;
    //   69: new 81	com/tencent/mm/plugin/gwallet/a/b
    //   72: astore_1
    //   73: aload_1
    //   74: aload_0
    //   75: getfield 51	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:mContext	Landroid/content/Context;
    //   78: invokespecial 129	com/tencent/mm/plugin/gwallet/a/b:<init>	(Landroid/content/Context;)V
    //   81: aload_0
    //   82: aload_1
    //   83: putfield 49	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npw	Lcom/tencent/mm/plugin/gwallet/a/b;
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield 61	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npx	Z
    //   91: aload_0
    //   92: iconst_0
    //   93: putfield 90	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npy	Z
    //   96: new 131	java/util/ArrayList
    //   99: astore_1
    //   100: aload_1
    //   101: invokespecial 132	java/util/ArrayList:<init>	()V
    //   104: aload_0
    //   105: aload_1
    //   106: putfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   109: aload 4
    //   111: arraylength
    //   112: istore 6
    //   114: iconst_0
    //   115: istore 7
    //   117: iload 7
    //   119: iload 6
    //   121: if_icmpge +24 -> 145
    //   124: aload 4
    //   126: iload 7
    //   128: aaload
    //   129: astore_1
    //   130: aload_0
    //   131: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   134: aload_1
    //   135: invokevirtual 136	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   138: pop
    //   139: iinc 7 1
    //   142: goto -25 -> 117
    //   145: ldc 45
    //   147: ldc 138
    //   149: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 49	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npw	Lcom/tencent/mm/plugin/gwallet/a/b;
    //   156: astore_1
    //   157: new 140	com/tencent/mm/plugin/gwallet/GWalletQueryProvider$1
    //   160: astore_2
    //   161: aload_2
    //   162: aload_0
    //   163: invokespecial 141	com/tencent/mm/plugin/gwallet/GWalletQueryProvider$1:<init>	(Lcom/tencent/mm/plugin/gwallet/GWalletQueryProvider;)V
    //   166: aload_1
    //   167: aload_2
    //   168: invokevirtual 144	com/tencent/mm/plugin/gwallet/a/b:a	(Lcom/tencent/mm/plugin/gwallet/a/b$a;)V
    //   171: lconst_0
    //   172: lstore 8
    //   174: lload 8
    //   176: ldc2_w 145
    //   179: lcmp
    //   180: ifgt +51 -> 231
    //   183: aload_0
    //   184: getfield 61	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npx	Z
    //   187: ifeq +44 -> 231
    //   190: aload_0
    //   191: getfield 90	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npy	Z
    //   194: istore 10
    //   196: iload 10
    //   198: ifne +33 -> 231
    //   201: ldc2_w 147
    //   204: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   207: lload 8
    //   209: ldc2_w 147
    //   212: ladd
    //   213: lstore 8
    //   215: goto -41 -> 174
    //   218: astore_1
    //   219: ldc 45
    //   221: aload_1
    //   222: invokevirtual 158	java/lang/InterruptedException:toString	()Ljava/lang/String;
    //   225: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: goto -54 -> 174
    //   231: aload_0
    //   232: getfield 61	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npx	Z
    //   235: ifne +103 -> 338
    //   238: ldc 45
    //   240: ldc 162
    //   242: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: new 164	android/database/MatrixCursor
    //   248: astore_1
    //   249: aload_1
    //   250: getstatic 39	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:COLUMNS	[Ljava/lang/String;
    //   253: invokespecial 167	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   256: aload_0
    //   257: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   260: invokevirtual 171	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   263: astore_2
    //   264: aload_2
    //   265: invokeinterface 176 1 0
    //   270: ifeq +58 -> 328
    //   273: aload_1
    //   274: bipush 6
    //   276: anewarray 178	java/lang/Object
    //   279: dup
    //   280: iconst_0
    //   281: iconst_0
    //   282: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   285: aastore
    //   286: dup
    //   287: iconst_1
    //   288: aload_2
    //   289: invokeinterface 188 1 0
    //   294: checkcast 25	java/lang/String
    //   297: aastore
    //   298: dup
    //   299: iconst_2
    //   300: ldc 190
    //   302: aastore
    //   303: dup
    //   304: iconst_3
    //   305: sipush 10234
    //   308: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_4
    //   314: ldc 190
    //   316: aastore
    //   317: dup
    //   318: iconst_5
    //   319: ldc 190
    //   321: aastore
    //   322: invokevirtual 194	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   325: goto -61 -> 264
    //   328: ldc 2
    //   330: monitorexit
    //   331: ldc 113
    //   333: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   336: aload_1
    //   337: areturn
    //   338: lload 8
    //   340: ldc2_w 145
    //   343: lcmp
    //   344: ifle +104 -> 448
    //   347: ldc 45
    //   349: ldc 196
    //   351: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   354: new 164	android/database/MatrixCursor
    //   357: astore_1
    //   358: aload_1
    //   359: getstatic 39	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:COLUMNS	[Ljava/lang/String;
    //   362: invokespecial 167	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   365: aload_0
    //   366: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   369: invokevirtual 171	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   372: astore_2
    //   373: aload_2
    //   374: invokeinterface 176 1 0
    //   379: ifeq +58 -> 437
    //   382: aload_1
    //   383: bipush 6
    //   385: anewarray 178	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: iconst_0
    //   391: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   394: aastore
    //   395: dup
    //   396: iconst_1
    //   397: aload_2
    //   398: invokeinterface 188 1 0
    //   403: checkcast 25	java/lang/String
    //   406: aastore
    //   407: dup
    //   408: iconst_2
    //   409: ldc 190
    //   411: aastore
    //   412: dup
    //   413: iconst_3
    //   414: sipush 10235
    //   417: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   420: aastore
    //   421: dup
    //   422: iconst_4
    //   423: ldc 190
    //   425: aastore
    //   426: dup
    //   427: iconst_5
    //   428: ldc 190
    //   430: aastore
    //   431: invokevirtual 194	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   434: goto -61 -> 373
    //   437: ldc 2
    //   439: monitorexit
    //   440: ldc 113
    //   442: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   445: goto -109 -> 336
    //   448: ldc 45
    //   450: ldc 198
    //   452: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   455: new 164	android/database/MatrixCursor
    //   458: astore_2
    //   459: aload_2
    //   460: getstatic 39	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:COLUMNS	[Ljava/lang/String;
    //   463: invokespecial 167	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   466: aload_0
    //   467: getfield 55	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npB	I
    //   470: ifne +256 -> 726
    //   473: iconst_0
    //   474: istore 7
    //   476: aload_0
    //   477: getfield 58	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npz	Ljava/util/ArrayList;
    //   480: ifnull +170 -> 650
    //   483: aload_0
    //   484: getfield 58	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npz	Ljava/util/ArrayList;
    //   487: invokevirtual 171	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   490: astore_3
    //   491: iconst_0
    //   492: istore 7
    //   494: aload_3
    //   495: invokeinterface 176 1 0
    //   500: ifeq +150 -> 650
    //   503: aload_3
    //   504: invokeinterface 188 1 0
    //   509: checkcast 25	java/lang/String
    //   512: astore_1
    //   513: aload_1
    //   514: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   517: istore 10
    //   519: iload 10
    //   521: ifne +298 -> 819
    //   524: new 206	org/json/JSONObject
    //   527: astore 4
    //   529: aload 4
    //   531: aload_1
    //   532: invokespecial 207	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   535: aload 4
    //   537: ldc 209
    //   539: invokevirtual 213	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   542: astore_1
    //   543: aload 4
    //   545: ldc 215
    //   547: invokevirtual 213	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   550: astore 11
    //   552: aload 4
    //   554: ldc 217
    //   556: invokevirtual 213	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   559: astore 5
    //   561: aload 4
    //   563: ldc 219
    //   565: invokevirtual 213	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   568: astore 4
    //   570: iload 7
    //   572: iconst_1
    //   573: iadd
    //   574: istore 6
    //   576: aload_2
    //   577: bipush 6
    //   579: anewarray 178	java/lang/Object
    //   582: dup
    //   583: iconst_0
    //   584: iload 7
    //   586: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   589: aastore
    //   590: dup
    //   591: iconst_1
    //   592: aload_1
    //   593: aastore
    //   594: dup
    //   595: iconst_2
    //   596: aload 11
    //   598: aastore
    //   599: dup
    //   600: iconst_3
    //   601: sipush 10232
    //   604: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   607: aastore
    //   608: dup
    //   609: iconst_4
    //   610: aload 5
    //   612: aastore
    //   613: dup
    //   614: iconst_5
    //   615: aload 4
    //   617: aastore
    //   618: invokevirtual 194	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   621: aload_0
    //   622: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   625: aload_1
    //   626: invokevirtual 222	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   629: pop
    //   630: iload 6
    //   632: istore 7
    //   634: goto -140 -> 494
    //   637: astore_1
    //   638: ldc 45
    //   640: aload_1
    //   641: invokevirtual 223	org/json/JSONException:toString	()Ljava/lang/String;
    //   644: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   647: goto -153 -> 494
    //   650: aload_0
    //   651: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   654: invokevirtual 171	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   657: astore_1
    //   658: aload_1
    //   659: invokeinterface 176 1 0
    //   664: ifeq +134 -> 798
    //   667: aload_2
    //   668: bipush 6
    //   670: anewarray 178	java/lang/Object
    //   673: dup
    //   674: iconst_0
    //   675: iload 7
    //   677: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   680: aastore
    //   681: dup
    //   682: iconst_1
    //   683: aload_1
    //   684: invokeinterface 188 1 0
    //   689: checkcast 25	java/lang/String
    //   692: aastore
    //   693: dup
    //   694: iconst_2
    //   695: ldc 190
    //   697: aastore
    //   698: dup
    //   699: iconst_3
    //   700: sipush 10233
    //   703: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   706: aastore
    //   707: dup
    //   708: iconst_4
    //   709: ldc 190
    //   711: aastore
    //   712: dup
    //   713: iconst_5
    //   714: ldc 190
    //   716: aastore
    //   717: invokevirtual 194	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   720: iinc 7 1
    //   723: goto -65 -> 658
    //   726: aload_0
    //   727: getfield 75	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:npA	Ljava/util/ArrayList;
    //   730: invokevirtual 171	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   733: astore_1
    //   734: aload_1
    //   735: invokeinterface 176 1 0
    //   740: ifeq +58 -> 798
    //   743: aload_2
    //   744: bipush 6
    //   746: anewarray 178	java/lang/Object
    //   749: dup
    //   750: iconst_0
    //   751: iconst_0
    //   752: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   755: aastore
    //   756: dup
    //   757: iconst_1
    //   758: aload_1
    //   759: invokeinterface 188 1 0
    //   764: checkcast 25	java/lang/String
    //   767: aastore
    //   768: dup
    //   769: iconst_2
    //   770: ldc 190
    //   772: aastore
    //   773: dup
    //   774: iconst_3
    //   775: sipush 10236
    //   778: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   781: aastore
    //   782: dup
    //   783: iconst_4
    //   784: ldc 190
    //   786: aastore
    //   787: dup
    //   788: iconst_5
    //   789: ldc 190
    //   791: aastore
    //   792: invokevirtual 194	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   795: goto -61 -> 734
    //   798: ldc 2
    //   800: monitorexit
    //   801: ldc 113
    //   803: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   806: aload_2
    //   807: astore_1
    //   808: goto -472 -> 336
    //   811: astore_1
    //   812: iload 6
    //   814: istore 7
    //   816: goto -178 -> 638
    //   819: goto -172 -> 647
    //
    // Exception table:
    //   from	to	target	type
    //   8	15	50	finally
    //   20	26	50	finally
    //   26	50	50	finally
    //   51	54	50	finally
    //   61	114	50	finally
    //   130	139	50	finally
    //   145	171	50	finally
    //   183	196	50	finally
    //   201	207	50	finally
    //   219	228	50	finally
    //   231	264	50	finally
    //   264	325	50	finally
    //   328	331	50	finally
    //   347	373	50	finally
    //   373	434	50	finally
    //   437	440	50	finally
    //   448	473	50	finally
    //   476	491	50	finally
    //   494	519	50	finally
    //   524	570	50	finally
    //   576	630	50	finally
    //   638	647	50	finally
    //   650	658	50	finally
    //   658	720	50	finally
    //   726	734	50	finally
    //   734	795	50	finally
    //   798	801	50	finally
    //   201	207	218	java/lang/InterruptedException
    //   524	570	637	org/json/JSONException
    //   576	630	811	org/json/JSONException
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletQueryProvider
 * JD-Core Version:    0.6.2
 */