package com.tencent.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.e;
import java.util.HashMap;
import java.util.HashSet;

public class FilterPlus
{
  public static HashMap<Integer, String> FilterIdToResIdMap;
  private static final String TAG = "FilterPlus";
  public static HashSet<Integer> preInstallFilterId;
  private static HashMap<String, String> resIdSavePathMap;
  protected BaseFilter mFilter;

  static
  {
    AppMethodBeat.i(80645);
    resIdSavePathMap = new HashMap();
    preInstallFilterId = new FilterPlus.1();
    FilterIdToResIdMap = new FilterPlus.2();
    AppMethodBeat.o(80645);
  }

  public FilterPlus()
  {
    AppMethodBeat.i(80642);
    this.mFilter = e.createFilter(0);
    AppMethodBeat.o(80642);
  }

  // ERROR //
  public static BaseFilter createFilter(int paramInt)
  {
    // Byte code:
    //   0: ldc 61
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: getstatic 67	com/tencent/view/b:AIE	Z
    //   10: istore_2
    //   11: getstatic 39	com/tencent/ttpic/FilterPlus:preInstallFilterId	Ljava/util/HashSet;
    //   14: iload_0
    //   15: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: invokevirtual 79	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   21: ifeq +476 -> 497
    //   24: iload_0
    //   25: lookupswitch	default:+107->132, 1014:+301->326, 1016:+205->230, 1061:+253->278, 1065:+348->373, 1078:+396->421, 1079:+396->421, 1080:+396->421, 1081:+396->421, 1086:+396->421, 1089:+396->421, 1093:+396->421, 1100:+396->421
    //   133: astore_3
    //   134: iload_0
    //   135: sipush 1078
    //   138: if_icmplt +68 -> 206
    //   141: aload_1
    //   142: astore_3
    //   143: iload_0
    //   144: sipush 1099
    //   147: if_icmpgt +59 -> 206
    //   150: new 81	com/tencent/filter/a/ab
    //   153: astore_3
    //   154: aload_3
    //   155: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   158: iconst_1
    //   159: putstatic 67	com/tencent/view/b:AIE	Z
    //   162: getstatic 44	com/tencent/ttpic/FilterPlus:FilterIdToResIdMap	Ljava/util/HashMap;
    //   165: iload_0
    //   166: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: invokevirtual 86	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   172: checkcast 88	java/lang/String
    //   175: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   178: astore_1
    //   179: iload_2
    //   180: putstatic 67	com/tencent/view/b:AIE	Z
    //   183: new 94	com/tencent/filter/m$k
    //   186: astore 4
    //   188: aload 4
    //   190: ldc 96
    //   192: aload_1
    //   193: ldc 97
    //   195: iconst_1
    //   196: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   199: aload_3
    //   200: aload 4
    //   202: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   205: pop
    //   206: aload_3
    //   207: astore_1
    //   208: aload_3
    //   209: ifnonnull +14 -> 223
    //   212: new 102	com/tencent/filter/BaseFilter
    //   215: dup
    //   216: getstatic 112	com/tencent/filter/GLSLRender:bJB	I
    //   219: invokespecial 114	com/tencent/filter/BaseFilter:<init>	(I)V
    //   222: astore_1
    //   223: ldc 61
    //   225: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_1
    //   229: areturn
    //   230: new 81	com/tencent/filter/a/ab
    //   233: dup
    //   234: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   237: astore_3
    //   238: iconst_1
    //   239: putstatic 67	com/tencent/view/b:AIE	Z
    //   242: ldc 116
    //   244: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   247: astore_1
    //   248: iload_2
    //   249: putstatic 67	com/tencent/view/b:AIE	Z
    //   252: new 94	com/tencent/filter/m$k
    //   255: astore 4
    //   257: aload 4
    //   259: ldc 96
    //   261: aload_1
    //   262: ldc 97
    //   264: iconst_1
    //   265: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   268: aload_3
    //   269: aload 4
    //   271: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   274: pop
    //   275: goto -69 -> 206
    //   278: new 81	com/tencent/filter/a/ab
    //   281: dup
    //   282: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   285: astore_3
    //   286: iconst_1
    //   287: putstatic 67	com/tencent/view/b:AIE	Z
    //   290: ldc 118
    //   292: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   295: astore_1
    //   296: iload_2
    //   297: putstatic 67	com/tencent/view/b:AIE	Z
    //   300: new 94	com/tencent/filter/m$k
    //   303: astore 4
    //   305: aload 4
    //   307: ldc 96
    //   309: aload_1
    //   310: ldc 97
    //   312: iconst_1
    //   313: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   316: aload_3
    //   317: aload 4
    //   319: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   322: pop
    //   323: goto -117 -> 206
    //   326: new 81	com/tencent/filter/a/ab
    //   329: dup
    //   330: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   333: astore_3
    //   334: iconst_1
    //   335: putstatic 67	com/tencent/view/b:AIE	Z
    //   338: ldc 120
    //   340: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   343: astore 4
    //   345: iload_2
    //   346: putstatic 67	com/tencent/view/b:AIE	Z
    //   349: new 94	com/tencent/filter/m$k
    //   352: astore_1
    //   353: aload_1
    //   354: ldc 96
    //   356: aload 4
    //   358: ldc 97
    //   360: iconst_1
    //   361: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   364: aload_3
    //   365: aload_1
    //   366: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   369: pop
    //   370: goto -164 -> 206
    //   373: new 81	com/tencent/filter/a/ab
    //   376: dup
    //   377: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   380: astore_3
    //   381: iconst_1
    //   382: putstatic 67	com/tencent/view/b:AIE	Z
    //   385: ldc 122
    //   387: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   390: astore_1
    //   391: iload_2
    //   392: putstatic 67	com/tencent/view/b:AIE	Z
    //   395: new 94	com/tencent/filter/m$k
    //   398: astore 4
    //   400: aload 4
    //   402: ldc 96
    //   404: aload_1
    //   405: ldc 97
    //   407: iconst_1
    //   408: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   411: aload_3
    //   412: aload 4
    //   414: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   417: pop
    //   418: goto -212 -> 206
    //   421: aload_1
    //   422: astore_3
    //   423: iload_0
    //   424: sipush 1078
    //   427: if_icmplt -221 -> 206
    //   430: aload_1
    //   431: astore_3
    //   432: iload_0
    //   433: sipush 1099
    //   436: if_icmpgt -230 -> 206
    //   439: new 81	com/tencent/filter/a/ab
    //   442: dup
    //   443: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   446: astore_3
    //   447: iconst_1
    //   448: putstatic 67	com/tencent/view/b:AIE	Z
    //   451: getstatic 44	com/tencent/ttpic/FilterPlus:FilterIdToResIdMap	Ljava/util/HashMap;
    //   454: iload_0
    //   455: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   458: invokevirtual 86	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   461: checkcast 88	java/lang/String
    //   464: invokestatic 92	com/tencent/view/b:vt	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   467: astore 4
    //   469: iload_2
    //   470: putstatic 67	com/tencent/view/b:AIE	Z
    //   473: new 94	com/tencent/filter/m$k
    //   476: astore_1
    //   477: aload_1
    //   478: ldc 96
    //   480: aload 4
    //   482: ldc 97
    //   484: iconst_1
    //   485: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   488: aload_3
    //   489: aload_1
    //   490: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   493: pop
    //   494: goto -288 -> 206
    //   497: new 81	com/tencent/filter/a/ab
    //   500: dup
    //   501: invokespecial 82	com/tencent/filter/a/ab:<init>	()V
    //   504: astore_3
    //   505: getstatic 34	com/tencent/ttpic/FilterPlus:resIdSavePathMap	Ljava/util/HashMap;
    //   508: getstatic 44	com/tencent/ttpic/FilterPlus:FilterIdToResIdMap	Ljava/util/HashMap;
    //   511: iload_0
    //   512: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   515: invokevirtual 86	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   518: invokevirtual 86	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   521: checkcast 88	java/lang/String
    //   524: astore_1
    //   525: aload_1
    //   526: invokestatic 128	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   529: ifne +91 -> 620
    //   532: aload_1
    //   533: invokestatic 131	com/tencent/view/b:auB	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   536: astore 4
    //   538: aload 4
    //   540: ifnonnull +8 -> 548
    //   543: aconst_null
    //   544: astore_3
    //   545: goto -339 -> 206
    //   548: new 94	com/tencent/filter/m$k
    //   551: astore_1
    //   552: aload_1
    //   553: ldc 96
    //   555: aload 4
    //   557: ldc 97
    //   559: iconst_1
    //   560: invokespecial 100	com/tencent/filter/m$k:<init>	(Ljava/lang/String;Landroid/graphics/Bitmap;IZ)V
    //   563: aload_3
    //   564: aload_1
    //   565: invokevirtual 106	com/tencent/filter/BaseFilter:addParam	(Lcom/tencent/filter/m;)Lcom/tencent/filter/BaseFilter;
    //   568: pop
    //   569: goto -363 -> 206
    //   572: astore_1
    //   573: aconst_null
    //   574: astore_3
    //   575: new 133	java/lang/StringBuilder
    //   578: dup
    //   579: ldc 135
    //   581: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   584: aload_1
    //   585: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   588: pop
    //   589: goto -383 -> 206
    //   592: astore_1
    //   593: goto -18 -> 575
    //   596: astore_1
    //   597: goto -22 -> 575
    //   600: astore_1
    //   601: goto -26 -> 575
    //   604: astore_1
    //   605: goto -30 -> 575
    //   608: astore_1
    //   609: goto -34 -> 575
    //   612: astore_1
    //   613: goto -38 -> 575
    //   616: astore_1
    //   617: goto -42 -> 575
    //   620: goto -414 -> 206
    //
    // Exception table:
    //   from	to	target	type
    //   11	24	572	java/lang/OutOfMemoryError
    //   150	158	572	java/lang/OutOfMemoryError
    //   230	238	572	java/lang/OutOfMemoryError
    //   278	286	572	java/lang/OutOfMemoryError
    //   326	334	572	java/lang/OutOfMemoryError
    //   373	381	572	java/lang/OutOfMemoryError
    //   439	447	572	java/lang/OutOfMemoryError
    //   497	505	572	java/lang/OutOfMemoryError
    //   238	275	592	java/lang/OutOfMemoryError
    //   286	323	596	java/lang/OutOfMemoryError
    //   334	370	600	java/lang/OutOfMemoryError
    //   381	418	604	java/lang/OutOfMemoryError
    //   447	494	608	java/lang/OutOfMemoryError
    //   158	206	612	java/lang/OutOfMemoryError
    //   505	538	616	java/lang/OutOfMemoryError
    //   548	569	616	java/lang/OutOfMemoryError
  }

  public static void setResSavePath(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80643);
    resIdSavePathMap.put(paramString1, paramString2);
    AppMethodBeat.o(80643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.FilterPlus
 * JD-Core Version:    0.6.2
 */