package com.tencent.mm.vfs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MigrationFileSystem extends AbstractFileSystem
{
  public static final Parcelable.Creator<MigrationFileSystem> CREATOR;
  private final FileSystem[] zYB;
  private final boolean zZv;

  static
  {
    AppMethodBeat.i(54555);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(54555);
  }

  protected MigrationFileSystem(Parcel paramParcel)
  {
    AppMethodBeat.i(54537);
    j.a(paramParcel, getClass());
    int i = paramParcel.readInt();
    this.zYB = new FileSystem[i];
    for (int j = 0; j < i; j++)
      this.zYB[j] = ((FileSystem)paramParcel.readParcelable(getClass().getClassLoader()));
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.zZv = bool;
      AppMethodBeat.o(54537);
      return;
    }
  }

  public MigrationFileSystem(FileSystem paramFileSystem, FileSystem[] paramArrayOfFileSystem)
  {
    AppMethodBeat.i(54536);
    this.zZv = true;
    FileSystem[] arrayOfFileSystem = new FileSystem[2];
    arrayOfFileSystem[0] = paramFileSystem;
    int i = 0;
    int k;
    for (int j = 1; i <= 0; j = k)
    {
      paramFileSystem = paramArrayOfFileSystem[0];
      k = j;
      if (paramFileSystem != null)
      {
        k = j + 1;
        arrayOfFileSystem[1] = paramFileSystem;
      }
      i++;
    }
    if (j == 2);
    for (paramFileSystem = arrayOfFileSystem; ; paramFileSystem = (FileSystem[])Arrays.copyOf(arrayOfFileSystem, 1))
    {
      this.zYB = paramFileSystem;
      AppMethodBeat.o(54536);
      return;
    }
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54541);
    paramString = this.zYB[0].L(paramString, paramBoolean);
    AppMethodBeat.o(54541);
    return paramString;
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54546);
    ArrayList localArrayList = new ArrayList();
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    for (int j = 0; j < i; j++)
    {
      List localList = arrayOfFileSystem[j].M(paramString, paramBoolean);
      if ((localList != null) && (localList.size() > 0))
        localArrayList.addAll(localList);
    }
    AppMethodBeat.o(54546);
    return localArrayList;
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54548);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2 | bool1)
    {
      bool2 = arrayOfFileSystem[j].N(paramString, paramBoolean);
      j++;
    }
    AppMethodBeat.o(54548);
    return bool1;
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54550);
    if (paramBoolean)
    {
      paramString = this.zYB[0].O(paramString, true);
      AppMethodBeat.o(54550);
    }
    while (true)
    {
      return paramString;
      FileSystem[] arrayOfFileSystem = this.zYB;
      int i = arrayOfFileSystem.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label90;
        FileSystem localFileSystem = arrayOfFileSystem[j];
        if (localFileSystem.exists(paramString))
        {
          paramString = localFileSystem.O(paramString, false);
          AppMethodBeat.o(54550);
          break;
        }
      }
      label90: paramString = this.zYB[0].O(paramString, false);
      AppMethodBeat.o(54550);
    }
  }

  // ERROR //
  public final void a(android.os.CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: ldc 125
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 72	com/tencent/mm/vfs/MigrationFileSystem:zZv	Z
    //   9: ifeq +2102 -> 2111
    //   12: iconst_0
    //   13: istore_2
    //   14: iconst_0
    //   15: istore_3
    //   16: iconst_0
    //   17: istore 4
    //   19: iconst_0
    //   20: istore 5
    //   22: iconst_0
    //   23: istore 6
    //   25: iconst_0
    //   26: istore 7
    //   28: iconst_0
    //   29: istore 8
    //   31: iconst_0
    //   32: istore 9
    //   34: iconst_0
    //   35: istore 10
    //   37: iconst_0
    //   38: istore 11
    //   40: iconst_0
    //   41: istore 12
    //   43: iconst_0
    //   44: istore 13
    //   46: iconst_0
    //   47: istore 14
    //   49: lconst_0
    //   50: lstore 15
    //   52: iload 13
    //   54: istore 17
    //   56: iload 11
    //   58: istore 18
    //   60: iload 9
    //   62: istore 19
    //   64: lload 15
    //   66: lstore 20
    //   68: iload 7
    //   70: istore 22
    //   72: iload 5
    //   74: istore 23
    //   76: aload_0
    //   77: getfield 56	com/tencent/mm/vfs/MigrationFileSystem:zYB	[Lcom/tencent/mm/vfs/FileSystem;
    //   80: iconst_0
    //   81: aaload
    //   82: astore 24
    //   84: iload 13
    //   86: istore 17
    //   88: iload 11
    //   90: istore 18
    //   92: iload 9
    //   94: istore 19
    //   96: lload 15
    //   98: lstore 20
    //   100: iload 7
    //   102: istore 22
    //   104: iload 5
    //   106: istore 23
    //   108: new 127	java/util/HashSet
    //   111: astore 25
    //   113: iload 13
    //   115: istore 17
    //   117: iload 11
    //   119: istore 18
    //   121: iload 9
    //   123: istore 19
    //   125: lload 15
    //   127: lstore 20
    //   129: iload 7
    //   131: istore 22
    //   133: iload 5
    //   135: istore 23
    //   137: aload 25
    //   139: invokespecial 128	java/util/HashSet:<init>	()V
    //   142: iload 13
    //   144: istore 17
    //   146: iload 11
    //   148: istore 18
    //   150: iload 9
    //   152: istore 19
    //   154: lload 15
    //   156: lstore 20
    //   158: iload 7
    //   160: istore 22
    //   162: iload 5
    //   164: istore 23
    //   166: sipush 4096
    //   169: newarray byte
    //   171: astore 26
    //   173: iload 13
    //   175: istore 17
    //   177: iload 11
    //   179: istore 18
    //   181: iload 9
    //   183: istore 19
    //   185: lload 15
    //   187: lstore 20
    //   189: iload 7
    //   191: istore 22
    //   193: iload 5
    //   195: istore 23
    //   197: aload_1
    //   198: invokevirtual 133	android/os/CancellationSignal:throwIfCanceled	()V
    //   201: iload 13
    //   203: istore 17
    //   205: iload 11
    //   207: istore 18
    //   209: iload 9
    //   211: istore 19
    //   213: lload 15
    //   215: lstore 20
    //   217: iload 7
    //   219: istore 22
    //   221: iload 5
    //   223: istore 23
    //   225: aload_0
    //   226: iconst_1
    //   227: iconst_2
    //   228: anewarray 36	java/lang/Object
    //   231: dup
    //   232: iconst_0
    //   233: ldc 135
    //   235: aastore
    //   236: dup
    //   237: iconst_1
    //   238: aload 24
    //   240: aastore
    //   241: invokevirtual 139	com/tencent/mm/vfs/MigrationFileSystem:j	(I[Ljava/lang/Object;)V
    //   244: iload 13
    //   246: istore 17
    //   248: iload 11
    //   250: istore 18
    //   252: iload 9
    //   254: istore 19
    //   256: lload 15
    //   258: lstore 20
    //   260: iload 7
    //   262: istore 22
    //   264: iload 5
    //   266: istore 23
    //   268: aload_0
    //   269: getfield 56	com/tencent/mm/vfs/MigrationFileSystem:zYB	[Lcom/tencent/mm/vfs/FileSystem;
    //   272: arraylength
    //   273: istore 9
    //   275: iconst_1
    //   276: istore 7
    //   278: iload 7
    //   280: iload 9
    //   282: if_icmpge +1649 -> 1931
    //   285: iload 14
    //   287: istore 17
    //   289: iload 12
    //   291: istore 18
    //   293: iload 10
    //   295: istore 19
    //   297: lload 15
    //   299: lstore 20
    //   301: iload 8
    //   303: istore 22
    //   305: iload 6
    //   307: istore 23
    //   309: aload_1
    //   310: invokevirtual 133	android/os/CancellationSignal:throwIfCanceled	()V
    //   313: iload 14
    //   315: istore 17
    //   317: iload 12
    //   319: istore 18
    //   321: iload 10
    //   323: istore 19
    //   325: lload 15
    //   327: lstore 20
    //   329: iload 8
    //   331: istore 22
    //   333: iload 6
    //   335: istore 23
    //   337: aload_0
    //   338: getfield 56	com/tencent/mm/vfs/MigrationFileSystem:zYB	[Lcom/tencent/mm/vfs/FileSystem;
    //   341: iload 7
    //   343: aaload
    //   344: astore 27
    //   346: iload 14
    //   348: istore 17
    //   350: iload 12
    //   352: istore 18
    //   354: iload 10
    //   356: istore 19
    //   358: lload 15
    //   360: lstore 20
    //   362: iload 8
    //   364: istore 22
    //   366: iload 6
    //   368: istore 23
    //   370: aload 27
    //   372: ldc 141
    //   374: iconst_1
    //   375: invokeinterface 94 3 0
    //   380: astore 28
    //   382: aload 28
    //   384: ifnull +1854 -> 2238
    //   387: iload 14
    //   389: istore 17
    //   391: iload 12
    //   393: istore 18
    //   395: iload 10
    //   397: istore 19
    //   399: lload 15
    //   401: lstore 20
    //   403: iload 8
    //   405: istore 22
    //   407: iload 6
    //   409: istore 23
    //   411: aload 28
    //   413: invokeinterface 145 1 0
    //   418: ifne +1820 -> 2238
    //   421: iload 14
    //   423: istore 17
    //   425: iload 12
    //   427: istore 18
    //   429: iload 10
    //   431: istore 19
    //   433: lload 15
    //   435: lstore 20
    //   437: iload 8
    //   439: istore 22
    //   441: iload 6
    //   443: istore 23
    //   445: aload 28
    //   447: invokeinterface 149 1 0
    //   452: astore 29
    //   454: iload 4
    //   456: istore 5
    //   458: iload 14
    //   460: istore 17
    //   462: iload 12
    //   464: istore 18
    //   466: iload 10
    //   468: istore 19
    //   470: lload 15
    //   472: lstore 20
    //   474: iload 8
    //   476: istore 22
    //   478: iload 6
    //   480: istore 23
    //   482: aload 29
    //   484: invokeinterface 154 1 0
    //   489: ifeq +119 -> 608
    //   492: iload 14
    //   494: istore 17
    //   496: iload 12
    //   498: istore 18
    //   500: iload 10
    //   502: istore 19
    //   504: lload 15
    //   506: lstore 20
    //   508: iload 8
    //   510: istore 22
    //   512: iload 6
    //   514: istore 23
    //   516: aload 29
    //   518: invokeinterface 158 1 0
    //   523: checkcast 160	com/tencent/mm/vfs/FileSystem$a
    //   526: astore 30
    //   528: iload 14
    //   530: istore 17
    //   532: iload 12
    //   534: istore 18
    //   536: iload 10
    //   538: istore 19
    //   540: lload 15
    //   542: lstore 20
    //   544: iload 8
    //   546: istore 22
    //   548: iload 6
    //   550: istore 23
    //   552: aload 30
    //   554: getfield 163	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   557: ifeq +45 -> 602
    //   560: iinc 3 1
    //   563: iload 14
    //   565: istore 17
    //   567: iload 12
    //   569: istore 18
    //   571: iload 10
    //   573: istore 19
    //   575: lload 15
    //   577: lstore 20
    //   579: iload 8
    //   581: istore 22
    //   583: iload 6
    //   585: istore 23
    //   587: iload 5
    //   589: i2l
    //   590: aload 30
    //   592: getfield 167	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   595: ladd
    //   596: l2i
    //   597: istore 5
    //   599: goto -141 -> 458
    //   602: iinc 2 1
    //   605: goto -42 -> 563
    //   608: iload 14
    //   610: istore 17
    //   612: iload 12
    //   614: istore 18
    //   616: iload 10
    //   618: istore 19
    //   620: lload 15
    //   622: lstore 20
    //   624: iload 8
    //   626: istore 22
    //   628: iload 6
    //   630: istore 23
    //   632: aload 27
    //   634: invokeinterface 170 1 0
    //   639: bipush 33
    //   641: iand
    //   642: bipush 33
    //   644: if_icmpne +236 -> 880
    //   647: iload 14
    //   649: istore 17
    //   651: iload 12
    //   653: istore 18
    //   655: iload 10
    //   657: istore 19
    //   659: lload 15
    //   661: lstore 20
    //   663: iload 8
    //   665: istore 22
    //   667: iload 6
    //   669: istore 23
    //   671: new 172	java/util/TreeSet
    //   674: astore 31
    //   676: iload 14
    //   678: istore 17
    //   680: iload 12
    //   682: istore 18
    //   684: iload 10
    //   686: istore 19
    //   688: lload 15
    //   690: lstore 20
    //   692: iload 8
    //   694: istore 22
    //   696: iload 6
    //   698: istore 23
    //   700: aload 31
    //   702: invokespecial 173	java/util/TreeSet:<init>	()V
    //   705: iload 14
    //   707: istore 17
    //   709: iload 12
    //   711: istore 18
    //   713: iload 10
    //   715: istore 19
    //   717: lload 15
    //   719: lstore 20
    //   721: iload 8
    //   723: istore 22
    //   725: iload 6
    //   727: istore 23
    //   729: aload 28
    //   731: invokeinterface 149 1 0
    //   736: astore 32
    //   738: iload 10
    //   740: istore 4
    //   742: iload 6
    //   744: istore 10
    //   746: iload 4
    //   748: istore 6
    //   750: iload 10
    //   752: istore 23
    //   754: aload 32
    //   756: invokeinterface 154 1 0
    //   761: ifeq +1084 -> 1845
    //   764: iload 10
    //   766: istore 23
    //   768: aload 32
    //   770: invokeinterface 158 1 0
    //   775: checkcast 160	com/tencent/mm/vfs/FileSystem$a
    //   778: astore 33
    //   780: iload 10
    //   782: istore 23
    //   784: aload_1
    //   785: invokevirtual 133	android/os/CancellationSignal:throwIfCanceled	()V
    //   788: iload 10
    //   790: istore 23
    //   792: aload 33
    //   794: getfield 163	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   797: ifeq +89 -> 886
    //   800: iload 10
    //   802: istore 23
    //   804: aload 25
    //   806: aload 33
    //   808: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   811: invokevirtual 181	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   814: ifeq +1421 -> 2235
    //   817: iload 10
    //   819: istore 23
    //   821: aload 24
    //   823: aload 33
    //   825: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   828: invokeinterface 184 2 0
    //   833: pop
    //   834: iinc 10 1
    //   837: iload 14
    //   839: istore 22
    //   841: iload 12
    //   843: istore 18
    //   845: iload 10
    //   847: istore 23
    //   849: aload 31
    //   851: ifnull +979 -> 1830
    //   854: iload 14
    //   856: istore 23
    //   858: iload 12
    //   860: istore 22
    //   862: iload 10
    //   864: istore 19
    //   866: aload 31
    //   868: aload 33
    //   870: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   873: invokevirtual 185	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   876: pop
    //   877: goto -127 -> 750
    //   880: aconst_null
    //   881: astore 31
    //   883: goto -178 -> 705
    //   886: iload 10
    //   888: istore 23
    //   890: aload 33
    //   892: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   895: invokestatic 189	com/tencent/mm/vfs/j:ath	(Ljava/lang/String;)Ljava/lang/String;
    //   898: astore 34
    //   900: iload 10
    //   902: istore 23
    //   904: aload 34
    //   906: ifnull +66 -> 972
    //   909: iload 10
    //   911: istore 4
    //   913: iload 10
    //   915: istore 23
    //   917: aload 25
    //   919: aload 34
    //   921: invokevirtual 181	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   924: ifeq +23 -> 947
    //   927: iload 10
    //   929: istore 23
    //   931: aload 24
    //   933: aload 34
    //   935: invokeinterface 184 2 0
    //   940: pop
    //   941: iload 10
    //   943: iconst_1
    //   944: iadd
    //   945: istore 4
    //   947: iload 4
    //   949: istore 23
    //   951: aload 31
    //   953: ifnull +19 -> 972
    //   956: iload 4
    //   958: istore 23
    //   960: aload 31
    //   962: aload 34
    //   964: invokevirtual 185	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   967: pop
    //   968: iload 4
    //   970: istore 23
    //   972: iload 23
    //   974: istore 10
    //   976: iload 14
    //   978: istore 23
    //   980: iload 12
    //   982: istore 22
    //   984: iload 10
    //   986: istore 19
    //   988: aload 24
    //   990: aload 33
    //   992: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   995: invokeinterface 119 2 0
    //   1000: ifeq +34 -> 1034
    //   1003: iload 14
    //   1005: istore 23
    //   1007: iload 12
    //   1009: istore 22
    //   1011: iload 10
    //   1013: istore 19
    //   1015: aload 27
    //   1017: aload 33
    //   1019: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1022: invokeinterface 192 2 0
    //   1027: pop
    //   1028: iinc 6 1
    //   1031: goto -281 -> 750
    //   1034: aconst_null
    //   1035: astore 35
    //   1037: aconst_null
    //   1038: astore 29
    //   1040: aconst_null
    //   1041: astore 36
    //   1043: aconst_null
    //   1044: astore 37
    //   1046: iload 12
    //   1048: istore 4
    //   1050: aload 37
    //   1052: astore 28
    //   1054: iload 14
    //   1056: istore 17
    //   1058: iload 12
    //   1060: istore 18
    //   1062: aload 36
    //   1064: astore 30
    //   1066: aload 27
    //   1068: aload 33
    //   1070: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1073: invokeinterface 196 2 0
    //   1078: astore 38
    //   1080: iload 12
    //   1082: istore 4
    //   1084: aload 37
    //   1086: astore 28
    //   1088: aload 38
    //   1090: astore 29
    //   1092: iload 14
    //   1094: istore 17
    //   1096: iload 12
    //   1098: istore 18
    //   1100: aload 36
    //   1102: astore 30
    //   1104: aload 38
    //   1106: astore 35
    //   1108: aload 24
    //   1110: aload 33
    //   1112: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1115: iconst_0
    //   1116: invokeinterface 86 3 0
    //   1121: astore 37
    //   1123: iload 12
    //   1125: istore 4
    //   1127: aload 37
    //   1129: astore 28
    //   1131: aload 38
    //   1133: astore 29
    //   1135: iload 14
    //   1137: istore 17
    //   1139: iload 12
    //   1141: istore 18
    //   1143: aload 37
    //   1145: astore 30
    //   1147: aload 38
    //   1149: astore 35
    //   1151: aload 38
    //   1153: aload 26
    //   1155: invokevirtual 202	java/io/InputStream:read	([B)I
    //   1158: istore 23
    //   1160: iload 23
    //   1162: ifle +208 -> 1370
    //   1165: iload 12
    //   1167: istore 4
    //   1169: aload 37
    //   1171: astore 28
    //   1173: aload 38
    //   1175: astore 29
    //   1177: iload 14
    //   1179: istore 17
    //   1181: iload 12
    //   1183: istore 18
    //   1185: aload 37
    //   1187: astore 30
    //   1189: aload 38
    //   1191: astore 35
    //   1193: aload 37
    //   1195: aload 26
    //   1197: iconst_0
    //   1198: iload 23
    //   1200: invokevirtual 208	java/io/OutputStream:write	([BII)V
    //   1203: goto -80 -> 1123
    //   1206: astore 30
    //   1208: iinc 14 1
    //   1211: iload 14
    //   1213: istore 17
    //   1215: iload 4
    //   1217: istore 18
    //   1219: aload 28
    //   1221: astore 30
    //   1223: aload 29
    //   1225: astore 35
    //   1227: new 210	java/lang/StringBuilder
    //   1230: astore 37
    //   1232: iload 14
    //   1234: istore 17
    //   1236: iload 4
    //   1238: istore 18
    //   1240: aload 28
    //   1242: astore 30
    //   1244: aload 29
    //   1246: astore 35
    //   1248: aload 37
    //   1250: ldc 212
    //   1252: invokespecial 215	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1255: iload 14
    //   1257: istore 17
    //   1259: iload 4
    //   1261: istore 18
    //   1263: aload 28
    //   1265: astore 30
    //   1267: aload 29
    //   1269: astore 35
    //   1271: ldc 217
    //   1273: aload 37
    //   1275: aload 33
    //   1277: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1280: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1283: ldc 223
    //   1285: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: aload_0
    //   1289: invokevirtual 227	com/tencent/mm/vfs/MigrationFileSystem:toString	()Ljava/lang/String;
    //   1292: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: ldc 229
    //   1297: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1300: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1303: invokestatic 236	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1306: aload 31
    //   1308: ifnull +229 -> 1537
    //   1311: aload 34
    //   1313: astore 37
    //   1315: aload 37
    //   1317: ifnull +220 -> 1537
    //   1320: iload 14
    //   1322: istore 17
    //   1324: iload 4
    //   1326: istore 18
    //   1328: aload 28
    //   1330: astore 30
    //   1332: aload 29
    //   1334: astore 35
    //   1336: aload 31
    //   1338: aload 37
    //   1340: invokevirtual 239	java/util/TreeSet:remove	(Ljava/lang/Object;)Z
    //   1343: pop
    //   1344: iload 14
    //   1346: istore 17
    //   1348: iload 4
    //   1350: istore 18
    //   1352: aload 28
    //   1354: astore 30
    //   1356: aload 29
    //   1358: astore 35
    //   1360: aload 37
    //   1362: invokestatic 189	com/tencent/mm/vfs/j:ath	(Ljava/lang/String;)Ljava/lang/String;
    //   1365: astore 37
    //   1367: goto -52 -> 1315
    //   1370: iload 12
    //   1372: istore 4
    //   1374: aload 37
    //   1376: astore 28
    //   1378: aload 38
    //   1380: astore 29
    //   1382: iload 14
    //   1384: istore 17
    //   1386: iload 12
    //   1388: istore 18
    //   1390: aload 37
    //   1392: astore 30
    //   1394: aload 38
    //   1396: astore 35
    //   1398: aload 38
    //   1400: invokevirtual 242	java/io/InputStream:close	()V
    //   1403: aconst_null
    //   1404: astore 36
    //   1406: aconst_null
    //   1407: astore 38
    //   1409: iload 12
    //   1411: istore 4
    //   1413: aload 37
    //   1415: astore 28
    //   1417: aload 38
    //   1419: astore 29
    //   1421: iload 14
    //   1423: istore 17
    //   1425: iload 12
    //   1427: istore 18
    //   1429: aload 37
    //   1431: astore 30
    //   1433: aload 36
    //   1435: astore 35
    //   1437: aload 37
    //   1439: invokevirtual 243	java/io/OutputStream:close	()V
    //   1442: aconst_null
    //   1443: astore 39
    //   1445: aconst_null
    //   1446: astore 37
    //   1448: iload 12
    //   1450: istore 4
    //   1452: aload 37
    //   1454: astore 28
    //   1456: aload 38
    //   1458: astore 29
    //   1460: iload 14
    //   1462: istore 17
    //   1464: iload 12
    //   1466: istore 18
    //   1468: aload 39
    //   1470: astore 30
    //   1472: aload 36
    //   1474: astore 35
    //   1476: aload 27
    //   1478: aload 33
    //   1480: getfield 177	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   1483: invokeinterface 192 2 0
    //   1488: pop
    //   1489: iinc 12 1
    //   1492: iload 12
    //   1494: istore 4
    //   1496: aload 37
    //   1498: astore 28
    //   1500: aload 38
    //   1502: astore 29
    //   1504: iload 14
    //   1506: istore 17
    //   1508: iload 12
    //   1510: istore 18
    //   1512: aload 39
    //   1514: astore 30
    //   1516: aload 36
    //   1518: astore 35
    //   1520: aload 33
    //   1522: getfield 167	com/tencent/mm/vfs/FileSystem$a:zYL	J
    //   1525: lstore 20
    //   1527: lload 15
    //   1529: lload 20
    //   1531: ladd
    //   1532: lstore 15
    //   1534: goto -784 -> 750
    //   1537: aload 29
    //   1539: ifnull +20 -> 1559
    //   1542: iload 14
    //   1544: istore 23
    //   1546: iload 4
    //   1548: istore 22
    //   1550: iload 10
    //   1552: istore 19
    //   1554: aload 29
    //   1556: invokevirtual 242	java/io/InputStream:close	()V
    //   1559: iload 14
    //   1561: istore 22
    //   1563: iload 4
    //   1565: istore 18
    //   1567: iload 10
    //   1569: istore 23
    //   1571: aload 28
    //   1573: ifnull +257 -> 1830
    //   1576: iload 14
    //   1578: istore 23
    //   1580: iload 4
    //   1582: istore 22
    //   1584: iload 10
    //   1586: istore 19
    //   1588: aload 28
    //   1590: invokevirtual 243	java/io/OutputStream:close	()V
    //   1593: iload 4
    //   1595: istore 12
    //   1597: goto -847 -> 750
    //   1600: astore 28
    //   1602: iload 4
    //   1604: istore 12
    //   1606: goto -856 -> 750
    //   1609: astore_1
    //   1610: aload 35
    //   1612: ifnull +20 -> 1632
    //   1615: iload 17
    //   1617: istore 23
    //   1619: iload 18
    //   1621: istore 22
    //   1623: iload 10
    //   1625: istore 19
    //   1627: aload 35
    //   1629: invokevirtual 242	java/io/InputStream:close	()V
    //   1632: aload 30
    //   1634: ifnull +20 -> 1654
    //   1637: iload 17
    //   1639: istore 23
    //   1641: iload 18
    //   1643: istore 22
    //   1645: iload 10
    //   1647: istore 19
    //   1649: aload 30
    //   1651: invokevirtual 243	java/io/OutputStream:close	()V
    //   1654: iload 17
    //   1656: istore 23
    //   1658: iload 18
    //   1660: istore 22
    //   1662: iload 10
    //   1664: istore 19
    //   1666: ldc 125
    //   1668: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1671: iload 17
    //   1673: istore 23
    //   1675: iload 18
    //   1677: istore 22
    //   1679: iload 10
    //   1681: istore 19
    //   1683: aload_1
    //   1684: athrow
    //   1685: astore_1
    //   1686: iload 19
    //   1688: istore 10
    //   1690: iload 22
    //   1692: istore 12
    //   1694: iload 23
    //   1696: istore 14
    //   1698: aload_1
    //   1699: instanceof 245
    //   1702: ifeq +455 -> 2157
    //   1705: iconst_4
    //   1706: istore 4
    //   1708: aload_0
    //   1709: iload 4
    //   1711: bipush 14
    //   1713: anewarray 36	java/lang/Object
    //   1716: dup
    //   1717: iconst_0
    //   1718: ldc 135
    //   1720: aastore
    //   1721: dup
    //   1722: iconst_1
    //   1723: aload_0
    //   1724: getfield 56	com/tencent/mm/vfs/MigrationFileSystem:zYB	[Lcom/tencent/mm/vfs/FileSystem;
    //   1727: iconst_0
    //   1728: aaload
    //   1729: aastore
    //   1730: dup
    //   1731: iconst_2
    //   1732: ldc 247
    //   1734: aastore
    //   1735: dup
    //   1736: iconst_3
    //   1737: iload 10
    //   1739: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1742: aastore
    //   1743: dup
    //   1744: iconst_4
    //   1745: ldc 255
    //   1747: aastore
    //   1748: dup
    //   1749: iconst_5
    //   1750: iload 8
    //   1752: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1755: aastore
    //   1756: dup
    //   1757: bipush 6
    //   1759: ldc_w 257
    //   1762: aastore
    //   1763: dup
    //   1764: bipush 7
    //   1766: iload 6
    //   1768: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1771: aastore
    //   1772: dup
    //   1773: bipush 8
    //   1775: ldc_w 259
    //   1778: aastore
    //   1779: dup
    //   1780: bipush 9
    //   1782: iload 12
    //   1784: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1787: aastore
    //   1788: dup
    //   1789: bipush 10
    //   1791: ldc_w 261
    //   1794: aastore
    //   1795: dup
    //   1796: bipush 11
    //   1798: iload 14
    //   1800: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1803: aastore
    //   1804: dup
    //   1805: bipush 12
    //   1807: ldc_w 263
    //   1810: aastore
    //   1811: dup
    //   1812: bipush 13
    //   1814: lload 15
    //   1816: invokestatic 268	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1819: aastore
    //   1820: invokevirtual 139	com/tencent/mm/vfs/MigrationFileSystem:j	(I[Ljava/lang/Object;)V
    //   1823: ldc 125
    //   1825: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1828: aload_1
    //   1829: athrow
    //   1830: iload 22
    //   1832: istore 14
    //   1834: iload 23
    //   1836: istore 10
    //   1838: iload 18
    //   1840: istore 12
    //   1842: goto -1092 -> 750
    //   1845: aload 31
    //   1847: ifnull +377 -> 2224
    //   1850: iload 10
    //   1852: istore 23
    //   1854: aload 31
    //   1856: invokevirtual 272	java/util/TreeSet:descendingSet	()Ljava/util/NavigableSet;
    //   1859: invokeinterface 275 1 0
    //   1864: astore 28
    //   1866: aload 28
    //   1868: invokeinterface 154 1 0
    //   1873: ifeq +36 -> 1909
    //   1876: aload 28
    //   1878: invokeinterface 158 1 0
    //   1883: checkcast 277	java/lang/String
    //   1886: astore 29
    //   1888: aload_1
    //   1889: invokevirtual 133	android/os/CancellationSignal:throwIfCanceled	()V
    //   1892: aload 27
    //   1894: aload 29
    //   1896: iconst_0
    //   1897: invokeinterface 110 3 0
    //   1902: pop
    //   1903: iinc 8 1
    //   1906: goto -40 -> 1866
    //   1909: iload 6
    //   1911: istore 4
    //   1913: iload 10
    //   1915: istore 6
    //   1917: iinc 7 1
    //   1920: iload 4
    //   1922: istore 10
    //   1924: iload 5
    //   1926: istore 4
    //   1928: goto -1650 -> 278
    //   1931: iload 14
    //   1933: istore 17
    //   1935: iload 12
    //   1937: istore 18
    //   1939: iload 10
    //   1941: istore 19
    //   1943: lload 15
    //   1945: lstore 20
    //   1947: iload 8
    //   1949: istore 22
    //   1951: iload 6
    //   1953: istore 23
    //   1955: aload_0
    //   1956: iconst_3
    //   1957: bipush 20
    //   1959: anewarray 36	java/lang/Object
    //   1962: dup
    //   1963: iconst_0
    //   1964: ldc 135
    //   1966: aastore
    //   1967: dup
    //   1968: iconst_1
    //   1969: aload 24
    //   1971: aastore
    //   1972: dup
    //   1973: iconst_2
    //   1974: ldc_w 279
    //   1977: aastore
    //   1978: dup
    //   1979: iconst_3
    //   1980: iload_2
    //   1981: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1984: aastore
    //   1985: dup
    //   1986: iconst_4
    //   1987: ldc_w 281
    //   1990: aastore
    //   1991: dup
    //   1992: iconst_5
    //   1993: iload_3
    //   1994: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1997: aastore
    //   1998: dup
    //   1999: bipush 6
    //   2001: ldc_w 283
    //   2004: aastore
    //   2005: dup
    //   2006: bipush 7
    //   2008: iload 4
    //   2010: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2013: aastore
    //   2014: dup
    //   2015: bipush 8
    //   2017: ldc 247
    //   2019: aastore
    //   2020: dup
    //   2021: bipush 9
    //   2023: iload 6
    //   2025: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2028: aastore
    //   2029: dup
    //   2030: bipush 10
    //   2032: ldc 255
    //   2034: aastore
    //   2035: dup
    //   2036: bipush 11
    //   2038: iload 8
    //   2040: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2043: aastore
    //   2044: dup
    //   2045: bipush 12
    //   2047: ldc_w 257
    //   2050: aastore
    //   2051: dup
    //   2052: bipush 13
    //   2054: iload 10
    //   2056: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2059: aastore
    //   2060: dup
    //   2061: bipush 14
    //   2063: ldc_w 259
    //   2066: aastore
    //   2067: dup
    //   2068: bipush 15
    //   2070: iload 12
    //   2072: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2075: aastore
    //   2076: dup
    //   2077: bipush 16
    //   2079: ldc_w 261
    //   2082: aastore
    //   2083: dup
    //   2084: bipush 17
    //   2086: iload 14
    //   2088: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2091: aastore
    //   2092: dup
    //   2093: bipush 18
    //   2095: ldc_w 263
    //   2098: aastore
    //   2099: dup
    //   2100: bipush 19
    //   2102: lload 15
    //   2104: invokestatic 268	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2107: aastore
    //   2108: invokevirtual 139	com/tencent/mm/vfs/MigrationFileSystem:j	(I[Ljava/lang/Object;)V
    //   2111: aload_0
    //   2112: getfield 56	com/tencent/mm/vfs/MigrationFileSystem:zYB	[Lcom/tencent/mm/vfs/FileSystem;
    //   2115: astore 29
    //   2117: aload 29
    //   2119: arraylength
    //   2120: istore 12
    //   2122: iconst_0
    //   2123: istore 10
    //   2125: iload 10
    //   2127: iload 12
    //   2129: if_icmpge +34 -> 2163
    //   2132: aload 29
    //   2134: iload 10
    //   2136: aaload
    //   2137: astore 28
    //   2139: aload_1
    //   2140: invokevirtual 133	android/os/CancellationSignal:throwIfCanceled	()V
    //   2143: aload 28
    //   2145: aload_1
    //   2146: invokeinterface 285 2 0
    //   2151: iinc 10 1
    //   2154: goto -29 -> 2125
    //   2157: iconst_5
    //   2158: istore 4
    //   2160: goto -452 -> 1708
    //   2163: ldc 125
    //   2165: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2168: return
    //   2169: astore 29
    //   2171: goto -612 -> 1559
    //   2174: astore 28
    //   2176: goto -544 -> 1632
    //   2179: astore 28
    //   2181: goto -527 -> 1654
    //   2184: astore_1
    //   2185: iload 19
    //   2187: istore 6
    //   2189: iload 17
    //   2191: istore 14
    //   2193: iload 18
    //   2195: istore 12
    //   2197: lload 20
    //   2199: lstore 15
    //   2201: iload 22
    //   2203: istore 8
    //   2205: iload 23
    //   2207: istore 10
    //   2209: goto -511 -> 1698
    //   2212: astore_1
    //   2213: iload 23
    //   2215: istore 10
    //   2217: goto -519 -> 1698
    //   2220: astore_1
    //   2221: goto -523 -> 1698
    //   2224: iload 6
    //   2226: istore 4
    //   2228: iload 10
    //   2230: istore 6
    //   2232: goto -315 -> 1917
    //   2235: goto -1398 -> 837
    //   2238: iload 4
    //   2240: istore 5
    //   2242: iload 10
    //   2244: istore 4
    //   2246: goto -329 -> 1917
    //
    // Exception table:
    //   from	to	target	type
    //   1066	1080	1206	java/io/IOException
    //   1108	1123	1206	java/io/IOException
    //   1151	1160	1206	java/io/IOException
    //   1193	1203	1206	java/io/IOException
    //   1398	1403	1206	java/io/IOException
    //   1437	1442	1206	java/io/IOException
    //   1476	1489	1206	java/io/IOException
    //   1520	1527	1206	java/io/IOException
    //   1588	1593	1600	java/io/IOException
    //   1066	1080	1609	finally
    //   1108	1123	1609	finally
    //   1151	1160	1609	finally
    //   1193	1203	1609	finally
    //   1227	1232	1609	finally
    //   1248	1255	1609	finally
    //   1271	1306	1609	finally
    //   1336	1344	1609	finally
    //   1360	1367	1609	finally
    //   1398	1403	1609	finally
    //   1437	1442	1609	finally
    //   1476	1489	1609	finally
    //   1520	1527	1609	finally
    //   866	877	1685	java/lang/Exception
    //   988	1003	1685	java/lang/Exception
    //   1015	1028	1685	java/lang/Exception
    //   1554	1559	1685	java/lang/Exception
    //   1588	1593	1685	java/lang/Exception
    //   1627	1632	1685	java/lang/Exception
    //   1649	1654	1685	java/lang/Exception
    //   1666	1671	1685	java/lang/Exception
    //   1683	1685	1685	java/lang/Exception
    //   1554	1559	2169	java/io/IOException
    //   1627	1632	2174	java/io/IOException
    //   1649	1654	2179	java/io/IOException
    //   76	84	2184	java/lang/Exception
    //   108	113	2184	java/lang/Exception
    //   137	142	2184	java/lang/Exception
    //   166	173	2184	java/lang/Exception
    //   197	201	2184	java/lang/Exception
    //   225	244	2184	java/lang/Exception
    //   268	275	2184	java/lang/Exception
    //   309	313	2184	java/lang/Exception
    //   337	346	2184	java/lang/Exception
    //   370	382	2184	java/lang/Exception
    //   411	421	2184	java/lang/Exception
    //   445	454	2184	java/lang/Exception
    //   482	492	2184	java/lang/Exception
    //   516	528	2184	java/lang/Exception
    //   552	560	2184	java/lang/Exception
    //   587	599	2184	java/lang/Exception
    //   632	647	2184	java/lang/Exception
    //   671	676	2184	java/lang/Exception
    //   700	705	2184	java/lang/Exception
    //   729	738	2184	java/lang/Exception
    //   1955	2111	2184	java/lang/Exception
    //   754	764	2212	java/lang/Exception
    //   768	780	2212	java/lang/Exception
    //   784	788	2212	java/lang/Exception
    //   792	800	2212	java/lang/Exception
    //   804	817	2212	java/lang/Exception
    //   821	834	2212	java/lang/Exception
    //   890	900	2212	java/lang/Exception
    //   917	927	2212	java/lang/Exception
    //   931	941	2212	java/lang/Exception
    //   960	968	2212	java/lang/Exception
    //   1854	1866	2212	java/lang/Exception
    //   1866	1903	2220	java/lang/Exception
  }

  public final boolean aS(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(54549);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    if (j < i)
      if (arrayOfFileSystem[j].aS(paramString1, paramString2))
      {
        bool = true;
        AppMethodBeat.o(54549);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(54549);
    }
  }

  public final int aiR()
  {
    AppMethodBeat.i(54538);
    int i = this.zYB[0].aiR();
    AppMethodBeat.o(54538);
    return i;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(54542);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    if (j < i)
      if (arrayOfFileSystem[j].exists(paramString))
      {
        bool = true;
        AppMethodBeat.o(54542);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(54542);
    }
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54540);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = arrayOfFileSystem[j];
      try
      {
        localObject = ((FileSystem)localObject).openRead(paramString);
        if (localObject != null)
        {
          AppMethodBeat.o(54540);
          return localObject;
        }
      }
      catch (IOException localIOException)
      {
        j++;
      }
    }
    paramString = new FileNotFoundException(paramString + " not found on all file systems.");
    AppMethodBeat.o(54540);
    throw paramString;
  }

  public final void p(Map<String, String> paramMap)
  {
    AppMethodBeat.i(54551);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    for (int j = 0; j < i; j++)
      arrayOfFileSystem[j].p(paramMap);
    AppMethodBeat.o(54551);
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(54545);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2 | bool1)
    {
      bool2 = arrayOfFileSystem[j].pI(paramString);
      j++;
    }
    AppMethodBeat.o(54545);
    return bool1;
  }

  public final boolean t(String paramString, long paramLong)
  {
    AppMethodBeat.i(54544);
    boolean bool = this.zYB[0].t(paramString, paramLong);
    AppMethodBeat.o(54544);
    return bool;
  }

  public final boolean tf(String paramString)
  {
    AppMethodBeat.i(54547);
    boolean bool = this.zYB[0].tf(paramString);
    AppMethodBeat.o(54547);
    return bool;
  }

  public final FileSystem.b tn(String paramString)
  {
    AppMethodBeat.i(54539);
    paramString = this.zYB[0].tn(paramString);
    AppMethodBeat.o(54539);
    return paramString;
  }

  public final FileSystem.a to(String paramString)
  {
    AppMethodBeat.i(54543);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    if (j < i)
    {
      FileSystem.a locala = arrayOfFileSystem[j].to(paramString);
      if (locala != null)
      {
        AppMethodBeat.o(54543);
        paramString = locala;
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(54543);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(54553);
    Object localObject = new StringBuilder("MigrationFS [").append(this.zYB[0].toString()).append(" <= ");
    for (int i = 1; i < this.zYB.length; i++)
      ((StringBuilder)localObject).append(this.zYB[i].toString()).append(", ");
    ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 2);
    localObject = ']';
    AppMethodBeat.o(54553);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(54554);
    paramParcel.writeInt(1);
    paramParcel.writeInt(this.zYB.length);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int j = arrayOfFileSystem.length;
    for (int k = 0; k < j; k++)
      paramParcel.writeParcelable(arrayOfFileSystem[k], paramInt);
    if (this.zZv);
    for (paramInt = i; ; paramInt = 1)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(54554);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.MigrationFileSystem
 * JD-Core Version:    0.6.2
 */