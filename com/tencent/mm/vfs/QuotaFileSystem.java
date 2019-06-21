package com.tencent.mm.vfs;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.e.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class QuotaFileSystem extends FileSystemWrapper
  implements Handler.Callback
{
  public static final Parcelable.Creator<QuotaFileSystem> CREATOR;
  private final long inh;
  private HashMap<String, Long> zZA;
  private final Handler zZB;
  private final long zZC;
  private final long zZw;
  private final long zZx;
  private final boolean zZy;
  private final Object zZz;

  static
  {
    AppMethodBeat.i(54569);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(54569);
  }

  public QuotaFileSystem(FileSystem paramFileSystem)
  {
    super(paramFileSystem);
    AppMethodBeat.i(54560);
    this.zZz = new Object();
    this.zZC = 60000L;
    this.zZw = 402653184L;
    this.zZx = 536870912L;
    this.inh = 7776000000L;
    this.zZy = true;
    if (this.zZy)
      this.zZA = new HashMap();
    for (this.zZB = new Handler(FileSystemManager.dMv().zZe.getLooper(), this); ; this.zZB = null)
    {
      dMz();
      AppMethodBeat.o(54560);
      return;
      this.zZA = null;
    }
  }

  protected QuotaFileSystem(FileSystem paramFileSystem, Parcel paramParcel)
  {
    super(paramFileSystem);
    AppMethodBeat.i(54561);
    this.zZz = new Object();
    this.zZC = 60000L;
    this.zZw = paramParcel.readLong();
    this.zZx = paramParcel.readLong();
    this.inh = paramParcel.readLong();
    boolean bool;
    if (paramParcel.readByte() != 0)
    {
      bool = true;
      this.zZy = bool;
      if (!this.zZy)
        break label120;
      this.zZA = new HashMap();
    }
    for (this.zZB = new Handler(FileSystemManager.dMv().zZe.getLooper(), this); ; this.zZB = null)
    {
      dMz();
      AppMethodBeat.o(54561);
      return;
      bool = false;
      break;
      label120: this.zZA = null;
    }
  }

  private void dMz()
  {
    AppMethodBeat.i(54562);
    if (this.zZx < this.zZw)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Cleaning threshold must not less than target size.");
      AppMethodBeat.o(54562);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(54562);
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54564);
    OutputStream localOutputStream = this.zYO.L(paramString, paramBoolean);
    if (this.zZy);
    synchronized (this.zZz)
    {
      this.zZA.remove(paramString);
      AppMethodBeat.o(54564);
      return localOutputStream;
    }
  }

  // ERROR //
  public final void a(android.os.CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: ldc 148
    //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: lconst_0
    //   6: lstore_2
    //   7: iconst_0
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iconst_0
    //   17: istore 7
    //   19: iload 7
    //   21: istore 8
    //   23: iload 5
    //   25: istore 9
    //   27: lload_2
    //   28: lstore 10
    //   30: aload_0
    //   31: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   34: invokeinterface 152 1 0
    //   39: istore 12
    //   41: iload 12
    //   43: iconst_1
    //   44: iand
    //   45: ifne +84 -> 129
    //   48: iload 7
    //   50: istore 8
    //   52: iload 5
    //   54: istore 9
    //   56: lload_2
    //   57: lstore 10
    //   59: new 154	java/lang/StringBuilder
    //   62: astore 13
    //   64: iload 7
    //   66: istore 8
    //   68: iload 5
    //   70: istore 9
    //   72: lload_2
    //   73: lstore 10
    //   75: aload 13
    //   77: ldc 156
    //   79: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: iload 7
    //   84: istore 8
    //   86: iload 5
    //   88: istore 9
    //   90: lload_2
    //   91: lstore 10
    //   93: ldc 159
    //   95: aload 13
    //   97: aload_0
    //   98: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   101: invokevirtual 163	java/lang/Object:toString	()Ljava/lang/String;
    //   104: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 174	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   117: aload_1
    //   118: invokeinterface 176 2 0
    //   123: ldc 148
    //   125: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: return
    //   129: iload 12
    //   131: bipush 8
    //   133: iand
    //   134: ifne +185 -> 319
    //   137: iload 7
    //   139: istore 8
    //   141: iload 5
    //   143: istore 9
    //   145: lload_2
    //   146: lstore 10
    //   148: new 154	java/lang/StringBuilder
    //   151: astore 13
    //   153: iload 7
    //   155: istore 8
    //   157: iload 5
    //   159: istore 9
    //   161: lload_2
    //   162: lstore 10
    //   164: aload 13
    //   166: ldc 178
    //   168: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: iload 7
    //   173: istore 8
    //   175: iload 5
    //   177: istore 9
    //   179: lload_2
    //   180: lstore 10
    //   182: ldc 159
    //   184: aload 13
    //   186: aload_0
    //   187: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   190: invokevirtual 163	java/lang/Object:toString	()Ljava/lang/String;
    //   193: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokestatic 174	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: goto -89 -> 113
    //   205: astore_1
    //   206: iload 8
    //   208: istore 6
    //   210: aload_1
    //   211: instanceof 180
    //   214: ifeq +2192 -> 2406
    //   217: ldc 159
    //   219: new 154	java/lang/StringBuilder
    //   222: dup
    //   223: ldc 182
    //   225: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   228: iload 9
    //   230: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   233: ldc 187
    //   235: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: iload 6
    //   240: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   243: ldc 189
    //   245: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: lload 10
    //   250: invokevirtual 192	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   253: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: invokestatic 194	com/tencent/e/a/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: iconst_4
    //   260: istore 5
    //   262: aload_0
    //   263: iload 5
    //   265: bipush 6
    //   267: anewarray 54	java/lang/Object
    //   270: dup
    //   271: iconst_0
    //   272: ldc 196
    //   274: aastore
    //   275: dup
    //   276: iconst_1
    //   277: iload 9
    //   279: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: aastore
    //   283: dup
    //   284: iconst_2
    //   285: ldc 204
    //   287: aastore
    //   288: dup
    //   289: iconst_3
    //   290: iload 6
    //   292: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: aastore
    //   296: dup
    //   297: iconst_4
    //   298: ldc 206
    //   300: aastore
    //   301: dup
    //   302: iconst_5
    //   303: lload 10
    //   305: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   308: aastore
    //   309: invokevirtual 215	com/tencent/mm/vfs/QuotaFileSystem:j	(I[Ljava/lang/Object;)V
    //   312: ldc 148
    //   314: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: aload_1
    //   318: athrow
    //   319: iload 7
    //   321: istore 8
    //   323: iload 5
    //   325: istore 9
    //   327: lload_2
    //   328: lstore 10
    //   330: aload_1
    //   331: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   334: iload 7
    //   336: istore 8
    //   338: iload 5
    //   340: istore 9
    //   342: lload_2
    //   343: lstore 10
    //   345: aload_0
    //   346: iconst_1
    //   347: iconst_2
    //   348: anewarray 54	java/lang/Object
    //   351: dup
    //   352: iconst_0
    //   353: ldc 222
    //   355: aastore
    //   356: dup
    //   357: iconst_1
    //   358: aload_0
    //   359: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   362: aastore
    //   363: invokevirtual 215	com/tencent/mm/vfs/QuotaFileSystem:j	(I[Ljava/lang/Object;)V
    //   366: iload 7
    //   368: istore 8
    //   370: iload 5
    //   372: istore 9
    //   374: lload_2
    //   375: lstore 10
    //   377: aload_0
    //   378: getfield 75	com/tencent/mm/vfs/QuotaFileSystem:zZy	Z
    //   381: ifeq +239 -> 620
    //   384: aconst_null
    //   385: astore 13
    //   387: iload 7
    //   389: istore 8
    //   391: iload 5
    //   393: istore 9
    //   395: lload_2
    //   396: lstore 10
    //   398: aload_0
    //   399: getfield 57	com/tencent/mm/vfs/QuotaFileSystem:zZz	Ljava/lang/Object;
    //   402: astore 14
    //   404: iload 7
    //   406: istore 8
    //   408: iload 5
    //   410: istore 9
    //   412: lload_2
    //   413: lstore 10
    //   415: aload 14
    //   417: monitorenter
    //   418: aload_0
    //   419: getfield 80	com/tencent/mm/vfs/QuotaFileSystem:zZA	Ljava/util/HashMap;
    //   422: invokevirtual 226	java/util/HashMap:isEmpty	()Z
    //   425: ifne +25 -> 450
    //   428: aload_0
    //   429: getfield 80	com/tencent/mm/vfs/QuotaFileSystem:zZA	Ljava/util/HashMap;
    //   432: astore 13
    //   434: new 77	java/util/HashMap
    //   437: astore 15
    //   439: aload 15
    //   441: invokespecial 78	java/util/HashMap:<init>	()V
    //   444: aload_0
    //   445: aload 15
    //   447: putfield 80	com/tencent/mm/vfs/QuotaFileSystem:zZA	Ljava/util/HashMap;
    //   450: aload 14
    //   452: monitorexit
    //   453: aload 13
    //   455: ifnull +165 -> 620
    //   458: iload 7
    //   460: istore 8
    //   462: iload 5
    //   464: istore 9
    //   466: lload_2
    //   467: lstore 10
    //   469: aload 13
    //   471: invokevirtual 230	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   474: invokeinterface 236 1 0
    //   479: astore 13
    //   481: iload 7
    //   483: istore 8
    //   485: iload 5
    //   487: istore 9
    //   489: lload_2
    //   490: lstore 10
    //   492: aload 13
    //   494: invokeinterface 241 1 0
    //   499: ifeq +121 -> 620
    //   502: iload 7
    //   504: istore 8
    //   506: iload 5
    //   508: istore 9
    //   510: lload_2
    //   511: lstore 10
    //   513: aload 13
    //   515: invokeinterface 245 1 0
    //   520: checkcast 247	java/util/Map$Entry
    //   523: astore 14
    //   525: iload 7
    //   527: istore 8
    //   529: iload 5
    //   531: istore 9
    //   533: lload_2
    //   534: lstore 10
    //   536: aload_1
    //   537: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   540: iload 7
    //   542: istore 8
    //   544: iload 5
    //   546: istore 9
    //   548: lload_2
    //   549: lstore 10
    //   551: aload_0
    //   552: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   555: aload 14
    //   557: invokeinterface 250 1 0
    //   562: checkcast 252	java/lang/String
    //   565: aload 14
    //   567: invokeinterface 255 1 0
    //   572: checkcast 208	java/lang/Long
    //   575: invokevirtual 258	java/lang/Long:longValue	()J
    //   578: invokeinterface 262 4 0
    //   583: pop
    //   584: goto -103 -> 481
    //   587: astore_1
    //   588: aload 14
    //   590: monitorexit
    //   591: iload 7
    //   593: istore 8
    //   595: iload 5
    //   597: istore 9
    //   599: lload_2
    //   600: lstore 10
    //   602: ldc 148
    //   604: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   607: iload 7
    //   609: istore 8
    //   611: iload 5
    //   613: istore 9
    //   615: lload_2
    //   616: lstore 10
    //   618: aload_1
    //   619: athrow
    //   620: iload 7
    //   622: istore 8
    //   624: iload 5
    //   626: istore 9
    //   628: lload_2
    //   629: lstore 10
    //   631: aload_1
    //   632: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   635: iload 7
    //   637: istore 8
    //   639: iload 5
    //   641: istore 9
    //   643: lload_2
    //   644: lstore 10
    //   646: aload_0
    //   647: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   650: ldc_w 264
    //   653: iconst_1
    //   654: invokeinterface 268 3 0
    //   659: astore 16
    //   661: aload 16
    //   663: ifnonnull +69 -> 732
    //   666: iload 7
    //   668: istore 8
    //   670: iload 5
    //   672: istore 9
    //   674: lload_2
    //   675: lstore 10
    //   677: new 154	java/lang/StringBuilder
    //   680: astore 13
    //   682: iload 7
    //   684: istore 8
    //   686: iload 5
    //   688: istore 9
    //   690: lload_2
    //   691: lstore 10
    //   693: aload 13
    //   695: ldc_w 270
    //   698: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   701: iload 7
    //   703: istore 8
    //   705: iload 5
    //   707: istore 9
    //   709: lload_2
    //   710: lstore 10
    //   712: ldc 159
    //   714: aload 13
    //   716: aload_0
    //   717: invokevirtual 271	com/tencent/mm/vfs/QuotaFileSystem:toString	()Ljava/lang/String;
    //   720: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   726: invokestatic 274	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   729: goto -616 -> 113
    //   732: iload 7
    //   734: istore 8
    //   736: iload 5
    //   738: istore 9
    //   740: lload_2
    //   741: lstore 10
    //   743: aload 16
    //   745: invokeinterface 277 1 0
    //   750: astore 13
    //   752: iload 4
    //   754: istore 5
    //   756: iload 6
    //   758: istore 8
    //   760: iload 5
    //   762: istore 9
    //   764: lload_2
    //   765: lstore 10
    //   767: aload 13
    //   769: invokeinterface 241 1 0
    //   774: ifeq +130 -> 904
    //   777: iload 6
    //   779: istore 8
    //   781: iload 5
    //   783: istore 9
    //   785: lload_2
    //   786: lstore 10
    //   788: aload 13
    //   790: invokeinterface 245 1 0
    //   795: checkcast 279	com/tencent/mm/vfs/FileSystem$a
    //   798: astore 14
    //   800: iload 6
    //   802: istore 8
    //   804: iload 5
    //   806: istore 9
    //   808: lload_2
    //   809: lstore 10
    //   811: aload 14
    //   813: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   816: lconst_0
    //   817: lcmp
    //   818: ifge +55 -> 873
    //   821: iload 6
    //   823: istore 8
    //   825: iload 5
    //   827: istore 9
    //   829: lload_2
    //   830: lstore 10
    //   832: aload 14
    //   834: getfield 285	com/tencent/mm/vfs/FileSystem$a:size	J
    //   837: lstore 17
    //   839: lload 17
    //   841: lstore 10
    //   843: lload_2
    //   844: lload 10
    //   846: ladd
    //   847: lstore_2
    //   848: iload 6
    //   850: istore 8
    //   852: iload 5
    //   854: istore 9
    //   856: lload_2
    //   857: lstore 10
    //   859: aload 14
    //   861: getfield 288	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   864: ifeq +34 -> 898
    //   867: iinc 6 1
    //   870: goto -114 -> 756
    //   873: iload 6
    //   875: istore 8
    //   877: iload 5
    //   879: istore 9
    //   881: lload_2
    //   882: lstore 10
    //   884: aload 14
    //   886: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   889: lstore 17
    //   891: lload 17
    //   893: lstore 10
    //   895: goto -52 -> 843
    //   898: iinc 5 1
    //   901: goto -145 -> 756
    //   904: iload 6
    //   906: istore 8
    //   908: iload 5
    //   910: istore 9
    //   912: lload_2
    //   913: lstore 10
    //   915: new 154	java/lang/StringBuilder
    //   918: astore 13
    //   920: iload 6
    //   922: istore 8
    //   924: iload 5
    //   926: istore 9
    //   928: lload_2
    //   929: lstore 10
    //   931: aload 13
    //   933: ldc_w 290
    //   936: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   939: iload 6
    //   941: istore 8
    //   943: iload 5
    //   945: istore 9
    //   947: lload_2
    //   948: lstore 10
    //   950: ldc 159
    //   952: aload 13
    //   954: lload_2
    //   955: invokevirtual 192	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   958: ldc_w 292
    //   961: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: aload_0
    //   965: getfield 69	com/tencent/mm/vfs/QuotaFileSystem:zZx	J
    //   968: invokevirtual 192	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   971: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   974: invokestatic 194	com/tencent/e/a/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   977: iload 6
    //   979: istore 8
    //   981: iload 5
    //   983: istore 9
    //   985: lload_2
    //   986: lstore 10
    //   988: aload_0
    //   989: iconst_2
    //   990: bipush 6
    //   992: anewarray 54	java/lang/Object
    //   995: dup
    //   996: iconst_0
    //   997: ldc 196
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: iload 5
    //   1004: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1007: aastore
    //   1008: dup
    //   1009: iconst_2
    //   1010: ldc 204
    //   1012: aastore
    //   1013: dup
    //   1014: iconst_3
    //   1015: iload 6
    //   1017: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1020: aastore
    //   1021: dup
    //   1022: iconst_4
    //   1023: ldc 206
    //   1025: aastore
    //   1026: dup
    //   1027: iconst_5
    //   1028: lload_2
    //   1029: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1032: aastore
    //   1033: invokevirtual 215	com/tencent/mm/vfs/QuotaFileSystem:j	(I[Ljava/lang/Object;)V
    //   1036: iload 6
    //   1038: istore 8
    //   1040: iload 5
    //   1042: istore 9
    //   1044: lload_2
    //   1045: lstore 10
    //   1047: lload_2
    //   1048: aload_0
    //   1049: getfield 69	com/tencent/mm/vfs/QuotaFileSystem:zZx	J
    //   1052: lcmp
    //   1053: ifgt +85 -> 1138
    //   1056: iload 6
    //   1058: istore 8
    //   1060: iload 5
    //   1062: istore 9
    //   1064: lload_2
    //   1065: lstore 10
    //   1067: ldc 159
    //   1069: ldc_w 294
    //   1072: invokestatic 194	com/tencent/e/a/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1075: iload 6
    //   1077: istore 8
    //   1079: iload 5
    //   1081: istore 9
    //   1083: lload_2
    //   1084: lstore 10
    //   1086: aload_0
    //   1087: bipush 6
    //   1089: bipush 6
    //   1091: anewarray 54	java/lang/Object
    //   1094: dup
    //   1095: iconst_0
    //   1096: ldc 196
    //   1098: aastore
    //   1099: dup
    //   1100: iconst_1
    //   1101: iload 5
    //   1103: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1106: aastore
    //   1107: dup
    //   1108: iconst_2
    //   1109: ldc 204
    //   1111: aastore
    //   1112: dup
    //   1113: iconst_3
    //   1114: iload 6
    //   1116: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1119: aastore
    //   1120: dup
    //   1121: iconst_4
    //   1122: ldc 206
    //   1124: aastore
    //   1125: dup
    //   1126: iconst_5
    //   1127: lload_2
    //   1128: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1131: aastore
    //   1132: invokevirtual 215	com/tencent/mm/vfs/QuotaFileSystem:j	(I[Ljava/lang/Object;)V
    //   1135: goto -1022 -> 113
    //   1138: iload 6
    //   1140: istore 8
    //   1142: iload 5
    //   1144: istore 9
    //   1146: lload_2
    //   1147: lstore 10
    //   1149: aload_1
    //   1150: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   1153: iload 12
    //   1155: bipush 32
    //   1157: iand
    //   1158: ifeq +1286 -> 2444
    //   1161: iload 6
    //   1163: istore 8
    //   1165: iload 5
    //   1167: istore 9
    //   1169: lload_2
    //   1170: lstore 10
    //   1172: new 77	java/util/HashMap
    //   1175: astore 14
    //   1177: iload 6
    //   1179: istore 8
    //   1181: iload 5
    //   1183: istore 9
    //   1185: lload_2
    //   1186: lstore 10
    //   1188: aload 14
    //   1190: invokespecial 78	java/util/HashMap:<init>	()V
    //   1193: iload 6
    //   1195: istore 8
    //   1197: iload 5
    //   1199: istore 9
    //   1201: lload_2
    //   1202: lstore 10
    //   1204: aload 16
    //   1206: invokeinterface 277 1 0
    //   1211: astore 19
    //   1213: iload 6
    //   1215: istore 8
    //   1217: iload 5
    //   1219: istore 9
    //   1221: lload_2
    //   1222: lstore 10
    //   1224: aload 19
    //   1226: invokeinterface 241 1 0
    //   1231: ifeq +281 -> 1512
    //   1234: iload 6
    //   1236: istore 8
    //   1238: iload 5
    //   1240: istore 9
    //   1242: lload_2
    //   1243: lstore 10
    //   1245: aload 19
    //   1247: invokeinterface 245 1 0
    //   1252: checkcast 279	com/tencent/mm/vfs/FileSystem$a
    //   1255: astore 20
    //   1257: iload 6
    //   1259: istore 8
    //   1261: iload 5
    //   1263: istore 9
    //   1265: lload_2
    //   1266: lstore 10
    //   1268: aload 20
    //   1270: getfield 288	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   1273: ifeq +100 -> 1373
    //   1276: iload 6
    //   1278: istore 8
    //   1280: iload 5
    //   1282: istore 9
    //   1284: lload_2
    //   1285: lstore 10
    //   1287: aload 14
    //   1289: aload 20
    //   1291: getfield 298	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1294: invokevirtual 302	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1297: ifne +76 -> 1373
    //   1300: iload 6
    //   1302: istore 8
    //   1304: iload 5
    //   1306: istore 9
    //   1308: lload_2
    //   1309: lstore 10
    //   1311: aload 20
    //   1313: getfield 298	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1316: astore 15
    //   1318: iload 6
    //   1320: istore 8
    //   1322: iload 5
    //   1324: istore 9
    //   1326: lload_2
    //   1327: lstore 10
    //   1329: new 12	com/tencent/mm/vfs/QuotaFileSystem$a
    //   1332: astore 13
    //   1334: iload 6
    //   1336: istore 8
    //   1338: iload 5
    //   1340: istore 9
    //   1342: lload_2
    //   1343: lstore 10
    //   1345: aload 13
    //   1347: aload 20
    //   1349: invokespecial 305	com/tencent/mm/vfs/QuotaFileSystem$a:<init>	(Lcom/tencent/mm/vfs/FileSystem$a;)V
    //   1352: iload 6
    //   1354: istore 8
    //   1356: iload 5
    //   1358: istore 9
    //   1360: lload_2
    //   1361: lstore 10
    //   1363: aload 14
    //   1365: aload 15
    //   1367: aload 13
    //   1369: invokevirtual 309	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1372: pop
    //   1373: iload 6
    //   1375: istore 8
    //   1377: iload 5
    //   1379: istore 9
    //   1381: lload_2
    //   1382: lstore 10
    //   1384: aload 20
    //   1386: getfield 298	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1389: invokestatic 315	com/tencent/mm/vfs/j:ath	(Ljava/lang/String;)Ljava/lang/String;
    //   1392: astore 21
    //   1394: aload 21
    //   1396: ifnull -183 -> 1213
    //   1399: iload 6
    //   1401: istore 8
    //   1403: iload 5
    //   1405: istore 9
    //   1407: lload_2
    //   1408: lstore 10
    //   1410: aload 14
    //   1412: aload 21
    //   1414: invokevirtual 318	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1417: checkcast 12	com/tencent/mm/vfs/QuotaFileSystem$a
    //   1420: astore 15
    //   1422: aload 15
    //   1424: astore 13
    //   1426: aload 15
    //   1428: ifnonnull +58 -> 1486
    //   1431: iload 6
    //   1433: istore 8
    //   1435: iload 5
    //   1437: istore 9
    //   1439: lload_2
    //   1440: lstore 10
    //   1442: new 12	com/tencent/mm/vfs/QuotaFileSystem$a
    //   1445: astore 13
    //   1447: iload 6
    //   1449: istore 8
    //   1451: iload 5
    //   1453: istore 9
    //   1455: lload_2
    //   1456: lstore 10
    //   1458: aload 13
    //   1460: aload 20
    //   1462: invokespecial 305	com/tencent/mm/vfs/QuotaFileSystem$a:<init>	(Lcom/tencent/mm/vfs/FileSystem$a;)V
    //   1465: iload 6
    //   1467: istore 8
    //   1469: iload 5
    //   1471: istore 9
    //   1473: lload_2
    //   1474: lstore 10
    //   1476: aload 14
    //   1478: aload 21
    //   1480: aload 13
    //   1482: invokevirtual 309	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1485: pop
    //   1486: iload 6
    //   1488: istore 8
    //   1490: iload 5
    //   1492: istore 9
    //   1494: lload_2
    //   1495: lstore 10
    //   1497: aload 13
    //   1499: aload 13
    //   1501: getfield 322	com/tencent/mm/vfs/QuotaFileSystem$a:jJF	I
    //   1504: iconst_1
    //   1505: iadd
    //   1506: putfield 322	com/tencent/mm/vfs/QuotaFileSystem$a:jJF	I
    //   1509: goto -296 -> 1213
    //   1512: iload 6
    //   1514: istore 8
    //   1516: iload 5
    //   1518: istore 9
    //   1520: lload_2
    //   1521: lstore 10
    //   1523: aload_1
    //   1524: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   1527: aload 14
    //   1529: astore 13
    //   1531: iload 6
    //   1533: istore 8
    //   1535: iload 5
    //   1537: istore 9
    //   1539: lload_2
    //   1540: lstore 10
    //   1542: new 324	java/util/ArrayList
    //   1545: astore 15
    //   1547: iload 6
    //   1549: istore 8
    //   1551: iload 5
    //   1553: istore 9
    //   1555: lload_2
    //   1556: lstore 10
    //   1558: aload 15
    //   1560: aload 16
    //   1562: invokeinterface 326 1 0
    //   1567: invokespecial 328	java/util/ArrayList:<init>	(I)V
    //   1570: iload 6
    //   1572: istore 8
    //   1574: iload 5
    //   1576: istore 9
    //   1578: lload_2
    //   1579: lstore 10
    //   1581: aload 16
    //   1583: invokeinterface 277 1 0
    //   1588: astore 14
    //   1590: iload 6
    //   1592: istore 8
    //   1594: iload 5
    //   1596: istore 9
    //   1598: lload_2
    //   1599: lstore 10
    //   1601: aload 14
    //   1603: invokeinterface 241 1 0
    //   1608: ifeq +67 -> 1675
    //   1611: iload 6
    //   1613: istore 8
    //   1615: iload 5
    //   1617: istore 9
    //   1619: lload_2
    //   1620: lstore 10
    //   1622: aload 14
    //   1624: invokeinterface 245 1 0
    //   1629: checkcast 279	com/tencent/mm/vfs/FileSystem$a
    //   1632: astore 16
    //   1634: iload 6
    //   1636: istore 8
    //   1638: iload 5
    //   1640: istore 9
    //   1642: lload_2
    //   1643: lstore 10
    //   1645: aload 16
    //   1647: getfield 288	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   1650: ifne -60 -> 1590
    //   1653: iload 6
    //   1655: istore 8
    //   1657: iload 5
    //   1659: istore 9
    //   1661: lload_2
    //   1662: lstore 10
    //   1664: aload 15
    //   1666: aload 16
    //   1668: invokevirtual 331	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1671: pop
    //   1672: goto -82 -> 1590
    //   1675: iload 6
    //   1677: istore 8
    //   1679: iload 5
    //   1681: istore 9
    //   1683: lload_2
    //   1684: lstore 10
    //   1686: new 8	com/tencent/mm/vfs/QuotaFileSystem$1
    //   1689: astore 14
    //   1691: iload 6
    //   1693: istore 8
    //   1695: iload 5
    //   1697: istore 9
    //   1699: lload_2
    //   1700: lstore 10
    //   1702: aload 14
    //   1704: aload_0
    //   1705: invokespecial 334	com/tencent/mm/vfs/QuotaFileSystem$1:<init>	(Lcom/tencent/mm/vfs/QuotaFileSystem;)V
    //   1708: iload 6
    //   1710: istore 8
    //   1712: iload 5
    //   1714: istore 9
    //   1716: lload_2
    //   1717: lstore 10
    //   1719: aload 15
    //   1721: aload 14
    //   1723: invokestatic 340	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   1726: iload 6
    //   1728: istore 8
    //   1730: iload 5
    //   1732: istore 9
    //   1734: lload_2
    //   1735: lstore 10
    //   1737: aload 15
    //   1739: invokevirtual 341	java/util/ArrayList:size	()I
    //   1742: istore 7
    //   1744: iinc 7 255
    //   1747: lload_2
    //   1748: lstore 10
    //   1750: iload 5
    //   1752: istore 9
    //   1754: lload 10
    //   1756: aload_0
    //   1757: getfield 65	com/tencent/mm/vfs/QuotaFileSystem:zZw	J
    //   1760: lcmp
    //   1761: ifle +252 -> 2013
    //   1764: iload 7
    //   1766: iflt +247 -> 2013
    //   1769: aload_1
    //   1770: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   1773: aload 15
    //   1775: iload 7
    //   1777: invokevirtual 344	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1780: checkcast 279	com/tencent/mm/vfs/FileSystem$a
    //   1783: astore 16
    //   1785: aload 16
    //   1787: getfield 298	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1790: astore 14
    //   1792: aload_0
    //   1793: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   1796: aload 14
    //   1798: invokeinterface 348 2 0
    //   1803: ifeq +635 -> 2438
    //   1806: aload 16
    //   1808: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   1811: lconst_0
    //   1812: lcmp
    //   1813: ifge +169 -> 1982
    //   1816: aload 16
    //   1818: getfield 285	com/tencent/mm/vfs/FileSystem$a:size	J
    //   1821: lstore_2
    //   1822: lload 10
    //   1824: lload_2
    //   1825: lsub
    //   1826: lstore_2
    //   1827: iinc 9 255
    //   1830: aload 13
    //   1832: ifnull +603 -> 2435
    //   1835: iload 6
    //   1837: istore 5
    //   1839: lload_2
    //   1840: lstore 10
    //   1842: iload 9
    //   1844: istore 8
    //   1846: aload 14
    //   1848: invokestatic 315	com/tencent/mm/vfs/j:ath	(Ljava/lang/String;)Ljava/lang/String;
    //   1851: astore 14
    //   1853: aload 14
    //   1855: ifnull +149 -> 2004
    //   1858: aload 13
    //   1860: aload 14
    //   1862: invokevirtual 318	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1865: checkcast 12	com/tencent/mm/vfs/QuotaFileSystem$a
    //   1868: astore 16
    //   1870: aload 16
    //   1872: ifnull +132 -> 2004
    //   1875: aload 16
    //   1877: getfield 322	com/tencent/mm/vfs/QuotaFileSystem$a:jJF	I
    //   1880: iconst_1
    //   1881: isub
    //   1882: istore 5
    //   1884: aload 16
    //   1886: iload 5
    //   1888: putfield 322	com/tencent/mm/vfs/QuotaFileSystem$a:jJF	I
    //   1891: iload 5
    //   1893: ifne +111 -> 2004
    //   1896: aload_0
    //   1897: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   1900: aload 14
    //   1902: iconst_0
    //   1903: invokeinterface 352 3 0
    //   1908: ifeq +96 -> 2004
    //   1911: aload 16
    //   1913: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   1916: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   1919: lconst_0
    //   1920: lcmp
    //   1921: ifge +70 -> 1991
    //   1924: aload 16
    //   1926: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   1929: getfield 285	com/tencent/mm/vfs/FileSystem$a:size	J
    //   1932: lstore 10
    //   1934: lload_2
    //   1935: lload 10
    //   1937: lsub
    //   1938: lstore_2
    //   1939: iinc 6 255
    //   1942: iload 6
    //   1944: istore 5
    //   1946: lload_2
    //   1947: lstore 10
    //   1949: iload 9
    //   1951: istore 8
    //   1953: aload 13
    //   1955: aload 14
    //   1957: invokevirtual 144	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1960: pop
    //   1961: iload 6
    //   1963: istore 5
    //   1965: lload_2
    //   1966: lstore 10
    //   1968: iload 9
    //   1970: istore 8
    //   1972: aload 14
    //   1974: invokestatic 315	com/tencent/mm/vfs/j:ath	(Ljava/lang/String;)Ljava/lang/String;
    //   1977: astore 14
    //   1979: goto -126 -> 1853
    //   1982: aload 16
    //   1984: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   1987: lstore_2
    //   1988: goto -166 -> 1822
    //   1991: aload 16
    //   1993: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   1996: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   1999: lstore 10
    //   2001: goto -67 -> 1934
    //   2004: iinc 7 255
    //   2007: lload_2
    //   2008: lstore 10
    //   2010: goto -256 -> 1754
    //   2013: aload 13
    //   2015: ifnull +223 -> 2238
    //   2018: aload 13
    //   2020: invokevirtual 360	java/util/HashMap:values	()Ljava/util/Collection;
    //   2023: invokeinterface 363 1 0
    //   2028: astore 13
    //   2030: lload 10
    //   2032: lstore_2
    //   2033: iload 6
    //   2035: istore 7
    //   2037: lload_2
    //   2038: lstore 17
    //   2040: iload 6
    //   2042: istore 5
    //   2044: lload_2
    //   2045: lstore 10
    //   2047: iload 9
    //   2049: istore 8
    //   2051: aload 13
    //   2053: invokeinterface 241 1 0
    //   2058: ifeq +188 -> 2246
    //   2061: iload 6
    //   2063: istore 5
    //   2065: lload_2
    //   2066: lstore 10
    //   2068: iload 9
    //   2070: istore 8
    //   2072: aload 13
    //   2074: invokeinterface 245 1 0
    //   2079: checkcast 12	com/tencent/mm/vfs/QuotaFileSystem$a
    //   2082: astore 14
    //   2084: iload 6
    //   2086: istore 5
    //   2088: lload_2
    //   2089: lstore 10
    //   2091: iload 9
    //   2093: istore 8
    //   2095: aload 14
    //   2097: getfield 322	com/tencent/mm/vfs/QuotaFileSystem$a:jJF	I
    //   2100: ifne +332 -> 2432
    //   2103: iload 6
    //   2105: istore 5
    //   2107: lload_2
    //   2108: lstore 10
    //   2110: iload 9
    //   2112: istore 8
    //   2114: aload_1
    //   2115: invokevirtual 220	android/os/CancellationSignal:throwIfCanceled	()V
    //   2118: iload 6
    //   2120: istore 5
    //   2122: lload_2
    //   2123: lstore 10
    //   2125: iload 9
    //   2127: istore 8
    //   2129: aload_0
    //   2130: getfield 136	com/tencent/mm/vfs/QuotaFileSystem:zYO	Lcom/tencent/mm/vfs/FileSystem;
    //   2133: aload 14
    //   2135: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   2138: getfield 298	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   2141: iconst_0
    //   2142: invokeinterface 352 3 0
    //   2147: ifeq +285 -> 2432
    //   2150: iload 6
    //   2152: istore 5
    //   2154: lload_2
    //   2155: lstore 10
    //   2157: iload 9
    //   2159: istore 8
    //   2161: aload 14
    //   2163: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   2166: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   2169: lconst_0
    //   2170: lcmp
    //   2171: ifge +39 -> 2210
    //   2174: iload 6
    //   2176: istore 5
    //   2178: lload_2
    //   2179: lstore 10
    //   2181: iload 9
    //   2183: istore 8
    //   2185: aload 14
    //   2187: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   2190: getfield 285	com/tencent/mm/vfs/FileSystem$a:size	J
    //   2193: lstore 17
    //   2195: lload 17
    //   2197: lstore 10
    //   2199: lload_2
    //   2200: lload 10
    //   2202: lsub
    //   2203: lstore_2
    //   2204: iinc 6 255
    //   2207: goto -174 -> 2033
    //   2210: iload 6
    //   2212: istore 5
    //   2214: lload_2
    //   2215: lstore 10
    //   2217: iload 9
    //   2219: istore 8
    //   2221: aload 14
    //   2223: getfield 356	com/tencent/mm/vfs/QuotaFileSystem$a:zZF	Lcom/tencent/mm/vfs/FileSystem$a;
    //   2226: getfield 282	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   2229: lstore 17
    //   2231: lload 17
    //   2233: lstore 10
    //   2235: goto -36 -> 2199
    //   2238: lload 10
    //   2240: lstore 17
    //   2242: iload 6
    //   2244: istore 7
    //   2246: iload 7
    //   2248: istore 5
    //   2250: lload 17
    //   2252: lstore 10
    //   2254: iload 9
    //   2256: istore 8
    //   2258: new 154	java/lang/StringBuilder
    //   2261: astore 13
    //   2263: iload 7
    //   2265: istore 5
    //   2267: lload 17
    //   2269: lstore 10
    //   2271: iload 9
    //   2273: istore 8
    //   2275: aload 13
    //   2277: ldc_w 365
    //   2280: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2283: iload 7
    //   2285: istore 5
    //   2287: lload 17
    //   2289: lstore 10
    //   2291: iload 9
    //   2293: istore 8
    //   2295: ldc 159
    //   2297: aload 13
    //   2299: iload 9
    //   2301: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2304: ldc 187
    //   2306: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2309: iload 7
    //   2311: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2314: ldc 189
    //   2316: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2319: lload 17
    //   2321: invokevirtual 192	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2324: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2327: invokestatic 194	com/tencent/e/a/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2330: iload 7
    //   2332: istore 5
    //   2334: lload 17
    //   2336: lstore 10
    //   2338: iload 9
    //   2340: istore 8
    //   2342: aload_0
    //   2343: iconst_3
    //   2344: bipush 6
    //   2346: anewarray 54	java/lang/Object
    //   2349: dup
    //   2350: iconst_0
    //   2351: ldc 196
    //   2353: aastore
    //   2354: dup
    //   2355: iconst_1
    //   2356: iload 9
    //   2358: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2361: aastore
    //   2362: dup
    //   2363: iconst_2
    //   2364: ldc 204
    //   2366: aastore
    //   2367: dup
    //   2368: iconst_3
    //   2369: iload 7
    //   2371: invokestatic 202	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2374: aastore
    //   2375: dup
    //   2376: iconst_4
    //   2377: ldc 206
    //   2379: aastore
    //   2380: dup
    //   2381: iconst_5
    //   2382: lload 17
    //   2384: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2387: aastore
    //   2388: invokevirtual 215	com/tencent/mm/vfs/QuotaFileSystem:j	(I[Ljava/lang/Object;)V
    //   2391: goto -2278 -> 113
    //   2394: astore_1
    //   2395: iload 5
    //   2397: istore 6
    //   2399: iload 8
    //   2401: istore 9
    //   2403: goto -2193 -> 210
    //   2406: ldc 159
    //   2408: aload_1
    //   2409: ldc_w 367
    //   2412: invokestatic 371	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   2415: iconst_5
    //   2416: istore 5
    //   2418: goto -2156 -> 262
    //   2421: astore_1
    //   2422: goto -2212 -> 210
    //   2425: astore_1
    //   2426: lload_2
    //   2427: lstore 10
    //   2429: goto -2219 -> 210
    //   2432: goto -225 -> 2207
    //   2435: goto -431 -> 2004
    //   2438: lload 10
    //   2440: lstore_2
    //   2441: goto -611 -> 1830
    //   2444: aconst_null
    //   2445: astore 13
    //   2447: goto -916 -> 1531
    //
    // Exception table:
    //   from	to	target	type
    //   30	41	205	java/lang/Exception
    //   59	64	205	java/lang/Exception
    //   75	82	205	java/lang/Exception
    //   93	113	205	java/lang/Exception
    //   148	153	205	java/lang/Exception
    //   164	171	205	java/lang/Exception
    //   182	202	205	java/lang/Exception
    //   330	334	205	java/lang/Exception
    //   345	366	205	java/lang/Exception
    //   377	384	205	java/lang/Exception
    //   398	404	205	java/lang/Exception
    //   415	418	205	java/lang/Exception
    //   469	481	205	java/lang/Exception
    //   492	502	205	java/lang/Exception
    //   513	525	205	java/lang/Exception
    //   536	540	205	java/lang/Exception
    //   551	584	205	java/lang/Exception
    //   602	607	205	java/lang/Exception
    //   618	620	205	java/lang/Exception
    //   631	635	205	java/lang/Exception
    //   646	661	205	java/lang/Exception
    //   677	682	205	java/lang/Exception
    //   693	701	205	java/lang/Exception
    //   712	729	205	java/lang/Exception
    //   743	752	205	java/lang/Exception
    //   767	777	205	java/lang/Exception
    //   788	800	205	java/lang/Exception
    //   811	821	205	java/lang/Exception
    //   832	839	205	java/lang/Exception
    //   859	867	205	java/lang/Exception
    //   884	891	205	java/lang/Exception
    //   915	920	205	java/lang/Exception
    //   931	939	205	java/lang/Exception
    //   950	977	205	java/lang/Exception
    //   988	1036	205	java/lang/Exception
    //   1047	1056	205	java/lang/Exception
    //   1067	1075	205	java/lang/Exception
    //   1086	1135	205	java/lang/Exception
    //   1149	1153	205	java/lang/Exception
    //   1172	1177	205	java/lang/Exception
    //   1188	1193	205	java/lang/Exception
    //   1204	1213	205	java/lang/Exception
    //   1224	1234	205	java/lang/Exception
    //   1245	1257	205	java/lang/Exception
    //   1268	1276	205	java/lang/Exception
    //   1287	1300	205	java/lang/Exception
    //   1311	1318	205	java/lang/Exception
    //   1329	1334	205	java/lang/Exception
    //   1345	1352	205	java/lang/Exception
    //   1363	1373	205	java/lang/Exception
    //   1384	1394	205	java/lang/Exception
    //   1410	1422	205	java/lang/Exception
    //   1442	1447	205	java/lang/Exception
    //   1458	1465	205	java/lang/Exception
    //   1476	1486	205	java/lang/Exception
    //   1497	1509	205	java/lang/Exception
    //   1523	1527	205	java/lang/Exception
    //   1542	1547	205	java/lang/Exception
    //   1558	1570	205	java/lang/Exception
    //   1581	1590	205	java/lang/Exception
    //   1601	1611	205	java/lang/Exception
    //   1622	1634	205	java/lang/Exception
    //   1645	1653	205	java/lang/Exception
    //   1664	1672	205	java/lang/Exception
    //   1686	1691	205	java/lang/Exception
    //   1702	1708	205	java/lang/Exception
    //   1719	1726	205	java/lang/Exception
    //   1737	1744	205	java/lang/Exception
    //   418	450	587	finally
    //   450	453	587	finally
    //   588	591	587	finally
    //   1846	1853	2394	java/lang/Exception
    //   1953	1961	2394	java/lang/Exception
    //   1972	1979	2394	java/lang/Exception
    //   2051	2061	2394	java/lang/Exception
    //   2072	2084	2394	java/lang/Exception
    //   2095	2103	2394	java/lang/Exception
    //   2114	2118	2394	java/lang/Exception
    //   2129	2150	2394	java/lang/Exception
    //   2161	2174	2394	java/lang/Exception
    //   2185	2195	2394	java/lang/Exception
    //   2221	2231	2394	java/lang/Exception
    //   2258	2263	2394	java/lang/Exception
    //   2275	2283	2394	java/lang/Exception
    //   2295	2330	2394	java/lang/Exception
    //   2342	2391	2394	java/lang/Exception
    //   1754	1764	2421	java/lang/Exception
    //   1769	1822	2421	java/lang/Exception
    //   1982	1988	2421	java/lang/Exception
    //   2018	2030	2421	java/lang/Exception
    //   1858	1870	2425	java/lang/Exception
    //   1875	1891	2425	java/lang/Exception
    //   1896	1934	2425	java/lang/Exception
    //   1991	2001	2425	java/lang/Exception
  }

  public boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(54566);
    while (true)
    {
      synchronized (this.zZz)
      {
        if (this.zZA.isEmpty())
          break label154;
        paramMessage = this.zZA;
        Object localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        this.zZA = ((HashMap)localObject2);
        if (paramMessage == null)
          break label146;
        ??? = paramMessage.entrySet().iterator();
        if (((Iterator)???).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)???).next();
          this.zYO.t((String)((Map.Entry)localObject2).getKey(), ((Long)((Map.Entry)localObject2).getValue()).longValue());
        }
      }
      b.d("VFS.QuotaFileSystem", "Flush access time cache entries: " + paramMessage.size());
      label146: AppMethodBeat.o(54566);
      return true;
      label154: paramMessage = null;
    }
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54563);
    InputStream localInputStream = this.zYO.openRead(paramString);
    long l;
    if (this.zZy)
      l = System.currentTimeMillis();
    synchronized (this.zZz)
    {
      boolean bool = this.zZA.isEmpty();
      this.zZA.put(paramString, Long.valueOf(l));
      if (bool)
        this.zZB.sendMessageDelayed(Message.obtain(), 60000L);
      AppMethodBeat.o(54563);
      return localInputStream;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(54567);
    long l = this.zZw / 1024L / 1024L;
    String str = "QuotaFS [" + l + "MB | " + this.zYO.toString() + "]";
    AppMethodBeat.o(54567);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(54568);
    paramParcel.writeInt(1);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.zZw);
    paramParcel.writeLong(this.zZx);
    paramParcel.writeLong(this.inh);
    if (this.zZy);
    for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(54568);
      return;
    }
  }

  static final class a
  {
    int jJF;
    FileSystem.a zZF;

    a(FileSystem.a parama)
    {
      this.zZF = parama;
      this.jJF = 0;
    }

    public final String toString()
    {
      AppMethodBeat.i(54559);
      String str = "children: " + this.jJF + " [" + this.zZF + "]";
      AppMethodBeat.o(54559);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.QuotaFileSystem
 * JD-Core Version:    0.6.2
 */