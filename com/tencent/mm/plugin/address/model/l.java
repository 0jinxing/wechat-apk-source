package com.tencent.mm.plugin.address.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.address.d.a;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.protocal.protobuf.bpk;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class l
{
  private static final Pattern gIU;
  public a gIQ;
  public final List<RcptItem> gIR;
  public final HashMap<String, List<RcptItem>> gIS;
  public final HashMap<String, List<RcptItem>> gIT;
  public String path;

  static
  {
    AppMethodBeat.i(16777);
    gIU = Pattern.compile("(-|\\s)+");
    AppMethodBeat.o(16777);
  }

  public l()
  {
    AppMethodBeat.i(16760);
    this.gIQ = new a();
    this.gIR = new ArrayList();
    this.gIS = new HashMap();
    this.gIT = new HashMap();
    AppMethodBeat.o(16760);
  }

  private byte[] arV()
  {
    AppMethodBeat.i(16766);
    byte[] arrayOfByte = g.x(("addrmgr" + this.path).toString().getBytes()).substring(8, 16).getBytes();
    AppMethodBeat.o(16766);
    return arrayOfByte;
  }

  private static boolean bm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(16773);
    boolean bool;
    if (paramString1.substring(6).startsWith(paramString2))
    {
      bool = true;
      AppMethodBeat.o(16773);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16773);
    }
  }

  private static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(16768);
    try
    {
      Object localObject = new javax/crypto/spec/DESKeySpec;
      ((DESKeySpec)localObject).<init>(paramArrayOfByte2);
      SecretKey localSecretKey = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      localObject = Cipher.getInstance("DES/CBC/PKCS5Padding");
      paramArrayOfByte2 = new javax/crypto/spec/IvParameterSpec;
      paramArrayOfByte2.<init>("12345678".getBytes());
      ((Cipher)localObject).init(2, localSecretKey, paramArrayOfByte2);
      paramArrayOfByte1 = ((Cipher)localObject).doFinal(paramArrayOfByte1);
      AppMethodBeat.o(16768);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletAddrMgr", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }

  private static RcptItem e(List<RcptItem> paramList, String paramString)
  {
    AppMethodBeat.i(16775);
    if ((paramList == null) || (paramList.isEmpty()) || (TextUtils.isEmpty(paramString)))
    {
      AppMethodBeat.o(16775);
      paramList = null;
      return paramList;
    }
    int i = 0;
    label38: RcptItem localRcptItem;
    if (i < paramList.size())
    {
      localRcptItem = (RcptItem)paramList.get(i);
      if ((localRcptItem == null) || (!paramString.equals(localRcptItem.name)));
    }
    for (paramList = localRcptItem; ; paramList = null)
    {
      AppMethodBeat.o(16775);
      break;
      i++;
      break label38;
    }
  }

  private static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(16767);
    try
    {
      Object localObject = new javax/crypto/spec/DESKeySpec;
      ((DESKeySpec)localObject).<init>(paramArrayOfByte2);
      localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      paramArrayOfByte2 = new javax/crypto/spec/IvParameterSpec;
      paramArrayOfByte2.<init>("12345678".getBytes());
      localCipher.init(1, (Key)localObject, paramArrayOfByte2);
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      AppMethodBeat.o(16767);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletAddrMgr", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }

  public final boolean a(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(16763);
    if (this.gIQ == null)
      this.gIQ = new a();
    int i = 0;
    if (i < this.gIQ.gIY.size())
      if (((b)this.gIQ.gIY.get(i)).id == paramb.id)
      {
        this.gIQ.gIY.remove(i);
        bool = true;
        AppMethodBeat.o(16763);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(16763);
    }
  }

  // ERROR //
  public final void arT()
  {
    // Byte code:
    //   0: sipush 16761
    //   3: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 215	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   9: pop
    //   10: invokestatic 220	com/tencent/mm/model/c:getAccPath	()Ljava/lang/String;
    //   13: astore_1
    //   14: ldc 146
    //   16: ldc 222
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_1
    //   25: aastore
    //   26: invokestatic 225	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: ldc 146
    //   31: ldc 227
    //   33: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: invokestatic 237	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   39: invokevirtual 243	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: aconst_null
    //   46: astore 4
    //   48: aconst_null
    //   49: astore 5
    //   51: new 49	java/util/ArrayList
    //   54: astore 6
    //   56: aload 6
    //   58: invokespecial 50	java/util/ArrayList:<init>	()V
    //   61: iconst_0
    //   62: istore 7
    //   64: new 245	java/io/FileReader
    //   67: astore 8
    //   69: new 63	java/lang/StringBuilder
    //   72: astore 9
    //   74: aload 9
    //   76: invokespecial 246	java/lang/StringBuilder:<init>	()V
    //   79: aload 8
    //   81: aload 9
    //   83: aload_1
    //   84: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: ldc 248
    //   89: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokespecial 249	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   98: aload 8
    //   100: astore 10
    //   102: aload 4
    //   104: astore_3
    //   105: new 251	java/io/BufferedReader
    //   108: astore 9
    //   110: aload 8
    //   112: astore 10
    //   114: aload 4
    //   116: astore_3
    //   117: aload 9
    //   119: aload 8
    //   121: invokespecial 254	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   124: aload 6
    //   126: invokeinterface 257 1 0
    //   131: aload 9
    //   133: invokevirtual 260	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   136: astore_3
    //   137: aload_3
    //   138: ifnull +385 -> 523
    //   141: aload 6
    //   143: aload_3
    //   144: invokeinterface 263 2 0
    //   149: pop
    //   150: goto -19 -> 131
    //   153: astore 4
    //   155: aload 8
    //   157: astore 10
    //   159: aload 9
    //   161: astore_3
    //   162: ldc 146
    //   164: aload 4
    //   166: ldc 148
    //   168: iconst_0
    //   169: anewarray 4	java/lang/Object
    //   172: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload 8
    //   177: ifnull +8 -> 185
    //   180: aload 8
    //   182: invokevirtual 266	java/io/FileReader:close	()V
    //   185: aload 9
    //   187: ifnull +8 -> 195
    //   190: aload 9
    //   192: invokevirtual 267	java/io/BufferedReader:close	()V
    //   195: iload 7
    //   197: ifne +112 -> 309
    //   200: aload 6
    //   202: invokeinterface 257 1 0
    //   207: aload_2
    //   208: ldc 248
    //   210: invokevirtual 273	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   213: astore 10
    //   215: new 251	java/io/BufferedReader
    //   218: astore_3
    //   219: new 275	java/io/InputStreamReader
    //   222: astore 8
    //   224: aload 8
    //   226: aload 10
    //   228: ldc_w 277
    //   231: invokespecial 280	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   234: aload_3
    //   235: aload 8
    //   237: invokespecial 254	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   240: aload_3
    //   241: astore 8
    //   243: aload_3
    //   244: invokevirtual 260	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   247: astore 9
    //   249: aload 9
    //   251: ifnull +491 -> 742
    //   254: aload_3
    //   255: astore 8
    //   257: aload 6
    //   259: aload 9
    //   261: invokeinterface 263 2 0
    //   266: pop
    //   267: goto -27 -> 240
    //   270: astore 8
    //   272: aload_3
    //   273: astore 9
    //   275: aload 8
    //   277: astore_3
    //   278: aload 9
    //   280: astore 8
    //   282: ldc 146
    //   284: aload_3
    //   285: ldc 148
    //   287: iconst_0
    //   288: anewarray 4	java/lang/Object
    //   291: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   294: aload 9
    //   296: ifnull +8 -> 304
    //   299: aload 9
    //   301: invokevirtual 267	java/io/BufferedReader:close	()V
    //   304: aload 10
    //   306: ifnull +3 -> 309
    //   309: ldc 146
    //   311: ldc_w 282
    //   314: iload 7
    //   316: invokestatic 286	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   319: invokevirtual 290	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   322: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: aload 6
    //   327: invokeinterface 171 1 0
    //   332: istore 11
    //   334: ldc 148
    //   336: astore 9
    //   338: ldc 148
    //   340: astore 8
    //   342: iconst_0
    //   343: istore 12
    //   345: iload 12
    //   347: iload 11
    //   349: if_icmpge +276 -> 625
    //   352: aload 6
    //   354: iload 12
    //   356: invokeinterface 175 2 0
    //   361: checkcast 80	java/lang/String
    //   364: astore 10
    //   366: iload 12
    //   368: iconst_1
    //   369: iadd
    //   370: iload 11
    //   372: if_icmpge +477 -> 849
    //   375: aload 6
    //   377: iload 12
    //   379: iconst_1
    //   380: iadd
    //   381: invokeinterface 175 2 0
    //   386: checkcast 80	java/lang/String
    //   389: astore_3
    //   390: aload 10
    //   392: ldc_w 292
    //   395: ldc_w 294
    //   398: invokevirtual 298	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   401: ldc_w 300
    //   404: ldc_w 294
    //   407: invokevirtual 298	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   410: astore 10
    //   412: aload_3
    //   413: ldc_w 292
    //   416: ldc_w 294
    //   419: invokevirtual 298	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   422: ldc_w 300
    //   425: ldc_w 294
    //   428: invokevirtual 298	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   431: astore 4
    //   433: aload 10
    //   435: iconst_0
    //   436: bipush 6
    //   438: invokevirtual 94	java/lang/String:substring	(II)Ljava/lang/String;
    //   441: astore_3
    //   442: aload 10
    //   444: bipush 6
    //   446: invokevirtual 99	java/lang/String:substring	(I)Ljava/lang/String;
    //   449: astore 5
    //   451: ldc_w 294
    //   454: aload 5
    //   456: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   459: invokevirtual 290	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   462: astore 10
    //   464: getstatic 35	com/tencent/mm/plugin/address/model/l:gIU	Ljava/util/regex/Pattern;
    //   467: aload 10
    //   469: invokevirtual 307	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   472: astore_2
    //   473: aload_2
    //   474: arraylength
    //   475: iconst_3
    //   476: if_icmpne +379 -> 855
    //   479: new 177	com/tencent/mm/plugin/address/model/RcptItem
    //   482: astore 10
    //   484: aload 10
    //   486: aload_2
    //   487: iconst_1
    //   488: aaload
    //   489: aload_3
    //   490: aload_2
    //   491: iconst_2
    //   492: aaload
    //   493: invokespecial 310	com/tencent/mm/plugin/address/model/RcptItem:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   496: aload 10
    //   498: ifnonnull +363 -> 861
    //   501: ldc 146
    //   503: ldc_w 312
    //   506: aload 5
    //   508: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   511: invokevirtual 290	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   514: invokestatic 315	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   517: iinc 12 1
    //   520: goto -175 -> 345
    //   523: aload 8
    //   525: invokevirtual 266	java/io/FileReader:close	()V
    //   528: aload 9
    //   530: invokevirtual 267	java/io/BufferedReader:close	()V
    //   533: iconst_1
    //   534: istore 7
    //   536: goto -341 -> 195
    //   539: astore 8
    //   541: ldc 146
    //   543: aload 8
    //   545: ldc 148
    //   547: iconst_0
    //   548: anewarray 4	java/lang/Object
    //   551: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   554: iconst_1
    //   555: istore 7
    //   557: goto -362 -> 195
    //   560: astore 8
    //   562: ldc 146
    //   564: aload 8
    //   566: ldc 148
    //   568: iconst_0
    //   569: anewarray 4	java/lang/Object
    //   572: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   575: goto -380 -> 195
    //   578: astore 9
    //   580: aconst_null
    //   581: astore 8
    //   583: aload 8
    //   585: ifnull +8 -> 593
    //   588: aload 8
    //   590: invokevirtual 266	java/io/FileReader:close	()V
    //   593: aload_3
    //   594: ifnull +7 -> 601
    //   597: aload_3
    //   598: invokevirtual 267	java/io/BufferedReader:close	()V
    //   601: sipush 16761
    //   604: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   607: aload 9
    //   609: athrow
    //   610: astore 9
    //   612: ldc 146
    //   614: aload 9
    //   616: ldc 148
    //   618: iconst_0
    //   619: anewarray 4	java/lang/Object
    //   622: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   625: aload_0
    //   626: new 63	java/lang/StringBuilder
    //   629: dup
    //   630: invokespecial 246	java/lang/StringBuilder:<init>	()V
    //   633: aload_1
    //   634: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: ldc 65
    //   639: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   642: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   645: putfield 70	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   648: new 317	java/io/File
    //   651: dup
    //   652: aload_0
    //   653: getfield 70	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   656: invokespecial 318	java/io/File:<init>	(Ljava/lang/String;)V
    //   659: astore 9
    //   661: aload 9
    //   663: invokevirtual 321	java/io/File:exists	()Z
    //   666: ifne +9 -> 675
    //   669: aload 9
    //   671: invokevirtual 324	java/io/File:mkdir	()Z
    //   674: pop
    //   675: aload_0
    //   676: getfield 70	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   679: iconst_0
    //   680: iconst_m1
    //   681: invokestatic 329	com/tencent/mm/a/e:e	(Ljava/lang/String;II)[B
    //   684: aload_0
    //   685: invokespecial 331	com/tencent/mm/plugin/address/model/l:arV	()[B
    //   688: invokestatic 333	com/tencent/mm/plugin/address/model/l:decrypt	([B[B)[B
    //   691: astore 9
    //   693: new 44	com/tencent/mm/plugin/address/d/a
    //   696: astore 8
    //   698: aload 8
    //   700: invokespecial 45	com/tencent/mm/plugin/address/d/a:<init>	()V
    //   703: aload_0
    //   704: aload 8
    //   706: aload 9
    //   708: invokevirtual 337	com/tencent/mm/plugin/address/d/a:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   711: checkcast 44	com/tencent/mm/plugin/address/d/a
    //   714: putfield 47	com/tencent/mm/plugin/address/model/l:gIQ	Lcom/tencent/mm/plugin/address/d/a;
    //   717: sipush 16761
    //   720: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   723: return
    //   724: astore 8
    //   726: ldc 146
    //   728: aload 8
    //   730: ldc 148
    //   732: iconst_0
    //   733: anewarray 4	java/lang/Object
    //   736: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   739: goto -138 -> 601
    //   742: aload_3
    //   743: astore 8
    //   745: aload_3
    //   746: invokevirtual 267	java/io/BufferedReader:close	()V
    //   749: aload_3
    //   750: astore 8
    //   752: aload 10
    //   754: invokevirtual 340	java/io/InputStream:close	()V
    //   757: aload_3
    //   758: invokevirtual 267	java/io/BufferedReader:close	()V
    //   761: aload 10
    //   763: ifnull -454 -> 309
    //   766: goto -457 -> 309
    //   769: astore 9
    //   771: ldc 146
    //   773: aload 9
    //   775: ldc 148
    //   777: iconst_0
    //   778: anewarray 4	java/lang/Object
    //   781: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   784: goto -23 -> 761
    //   787: astore 9
    //   789: ldc 146
    //   791: aload 9
    //   793: ldc 148
    //   795: iconst_0
    //   796: anewarray 4	java/lang/Object
    //   799: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   802: goto -498 -> 304
    //   805: astore 8
    //   807: aload 9
    //   809: astore_3
    //   810: aload 8
    //   812: astore 9
    //   814: aload_3
    //   815: ifnull +7 -> 822
    //   818: aload_3
    //   819: invokevirtual 267	java/io/BufferedReader:close	()V
    //   822: sipush 16761
    //   825: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   828: aload 9
    //   830: athrow
    //   831: astore 8
    //   833: ldc 146
    //   835: aload 8
    //   837: ldc 148
    //   839: iconst_0
    //   840: anewarray 4	java/lang/Object
    //   843: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   846: goto -24 -> 822
    //   849: ldc 148
    //   851: astore_3
    //   852: goto -462 -> 390
    //   855: aconst_null
    //   856: astore 10
    //   858: goto -362 -> 496
    //   861: aload 5
    //   863: ldc_w 342
    //   866: invokevirtual 103	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   869: ifeq +75 -> 944
    //   872: aload_0
    //   873: getfield 59	com/tencent/mm/plugin/address/model/l:gIT	Ljava/util/HashMap;
    //   876: aload 9
    //   878: invokevirtual 345	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   881: ifne +27 -> 908
    //   884: aload_0
    //   885: getfield 59	com/tencent/mm/plugin/address/model/l:gIT	Ljava/util/HashMap;
    //   888: astore_3
    //   889: new 49	java/util/ArrayList
    //   892: astore 4
    //   894: aload 4
    //   896: invokespecial 50	java/util/ArrayList:<init>	()V
    //   899: aload_3
    //   900: aload 9
    //   902: aload 4
    //   904: invokevirtual 349	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   907: pop
    //   908: aload_0
    //   909: getfield 59	com/tencent/mm/plugin/address/model/l:gIT	Ljava/util/HashMap;
    //   912: aload 9
    //   914: invokevirtual 352	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   917: checkcast 158	java/util/List
    //   920: astore_3
    //   921: aload_3
    //   922: aload 10
    //   924: invokeinterface 263 2 0
    //   929: pop
    //   930: aload_0
    //   931: getfield 59	com/tencent/mm/plugin/address/model/l:gIT	Ljava/util/HashMap;
    //   934: aload 9
    //   936: aload_3
    //   937: invokevirtual 349	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   940: pop
    //   941: goto -424 -> 517
    //   944: aload 5
    //   946: ldc_w 354
    //   949: invokevirtual 103	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   952: ifeq +100 -> 1052
    //   955: aload_0
    //   956: getfield 57	com/tencent/mm/plugin/address/model/l:gIS	Ljava/util/HashMap;
    //   959: aload 8
    //   961: invokevirtual 345	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   964: ifne +29 -> 993
    //   967: aload_0
    //   968: getfield 57	com/tencent/mm/plugin/address/model/l:gIS	Ljava/util/HashMap;
    //   971: astore 5
    //   973: new 49	java/util/ArrayList
    //   976: astore 9
    //   978: aload 9
    //   980: invokespecial 50	java/util/ArrayList:<init>	()V
    //   983: aload 5
    //   985: aload 8
    //   987: aload 9
    //   989: invokevirtual 349	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   992: pop
    //   993: aload_0
    //   994: getfield 57	com/tencent/mm/plugin/address/model/l:gIS	Ljava/util/HashMap;
    //   997: aload 8
    //   999: invokevirtual 352	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1002: checkcast 158	java/util/List
    //   1005: astore 9
    //   1007: aload 4
    //   1009: ldc_w 342
    //   1012: invokestatic 356	com/tencent/mm/plugin/address/model/l:bm	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1015: ifeq +9 -> 1024
    //   1018: aload 10
    //   1020: iconst_1
    //   1021: putfield 360	com/tencent/mm/plugin/address/model/RcptItem:gIP	Z
    //   1024: aload 9
    //   1026: aload 10
    //   1028: invokeinterface 263 2 0
    //   1033: pop
    //   1034: aload_0
    //   1035: getfield 57	com/tencent/mm/plugin/address/model/l:gIS	Ljava/util/HashMap;
    //   1038: aload 8
    //   1040: aload 9
    //   1042: invokevirtual 349	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1045: pop
    //   1046: aload_3
    //   1047: astore 9
    //   1049: goto -532 -> 517
    //   1052: aload 5
    //   1054: ldc_w 294
    //   1057: invokevirtual 103	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1060: ifeq +123 -> 1183
    //   1063: aload 4
    //   1065: ldc_w 354
    //   1068: invokestatic 356	com/tencent/mm/plugin/address/model/l:bm	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1071: ifeq +9 -> 1080
    //   1074: aload 10
    //   1076: iconst_1
    //   1077: putfield 360	com/tencent/mm/plugin/address/model/RcptItem:gIP	Z
    //   1080: aload_0
    //   1081: getfield 52	com/tencent/mm/plugin/address/model/l:gIR	Ljava/util/List;
    //   1084: aload 10
    //   1086: invokeinterface 263 2 0
    //   1091: pop
    //   1092: aload_3
    //   1093: astore 8
    //   1095: goto -578 -> 517
    //   1098: astore 9
    //   1100: ldc 146
    //   1102: aload 9
    //   1104: ldc 148
    //   1106: iconst_0
    //   1107: anewarray 4	java/lang/Object
    //   1110: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1113: sipush 16761
    //   1116: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1119: goto -396 -> 723
    //   1122: astore 9
    //   1124: aload 8
    //   1126: astore_3
    //   1127: goto -313 -> 814
    //   1130: astore_3
    //   1131: aconst_null
    //   1132: astore 10
    //   1134: goto -856 -> 278
    //   1137: astore_3
    //   1138: goto -860 -> 278
    //   1141: astore 9
    //   1143: aload 10
    //   1145: astore 8
    //   1147: goto -564 -> 583
    //   1150: astore 10
    //   1152: aload 9
    //   1154: astore_3
    //   1155: aload 10
    //   1157: astore 9
    //   1159: goto -576 -> 583
    //   1162: astore 4
    //   1164: aconst_null
    //   1165: astore 8
    //   1167: aload 5
    //   1169: astore 9
    //   1171: goto -1016 -> 155
    //   1174: astore 4
    //   1176: aload 5
    //   1178: astore 9
    //   1180: goto -1025 -> 155
    //   1183: goto -666 -> 517
    //
    // Exception table:
    //   from	to	target	type
    //   124	131	153	java/io/IOException
    //   131	137	153	java/io/IOException
    //   141	150	153	java/io/IOException
    //   243	249	270	java/io/IOException
    //   257	267	270	java/io/IOException
    //   745	749	270	java/io/IOException
    //   752	757	270	java/io/IOException
    //   523	533	539	java/lang/Exception
    //   180	185	560	java/lang/Exception
    //   190	195	560	java/lang/Exception
    //   64	98	578	finally
    //   29	43	610	java/lang/Exception
    //   51	61	610	java/lang/Exception
    //   299	304	610	java/lang/Exception
    //   309	334	610	java/lang/Exception
    //   352	366	610	java/lang/Exception
    //   375	390	610	java/lang/Exception
    //   390	496	610	java/lang/Exception
    //   501	517	610	java/lang/Exception
    //   541	554	610	java/lang/Exception
    //   562	575	610	java/lang/Exception
    //   601	610	610	java/lang/Exception
    //   726	739	610	java/lang/Exception
    //   757	761	610	java/lang/Exception
    //   771	784	610	java/lang/Exception
    //   789	802	610	java/lang/Exception
    //   818	822	610	java/lang/Exception
    //   822	831	610	java/lang/Exception
    //   833	846	610	java/lang/Exception
    //   861	908	610	java/lang/Exception
    //   908	941	610	java/lang/Exception
    //   944	993	610	java/lang/Exception
    //   993	1024	610	java/lang/Exception
    //   1024	1046	610	java/lang/Exception
    //   1052	1080	610	java/lang/Exception
    //   1080	1092	610	java/lang/Exception
    //   588	593	724	java/lang/Exception
    //   597	601	724	java/lang/Exception
    //   757	761	769	java/io/IOException
    //   299	304	787	java/io/IOException
    //   200	215	805	finally
    //   215	240	805	finally
    //   818	822	831	java/io/IOException
    //   693	717	1098	java/lang/Exception
    //   243	249	1122	finally
    //   257	267	1122	finally
    //   282	294	1122	finally
    //   745	749	1122	finally
    //   752	757	1122	finally
    //   200	215	1130	java/io/IOException
    //   215	240	1137	java/io/IOException
    //   105	110	1141	finally
    //   117	124	1141	finally
    //   162	175	1141	finally
    //   124	131	1150	finally
    //   131	137	1150	finally
    //   141	150	1150	finally
    //   64	98	1162	java/io/IOException
    //   105	110	1174	java/io/IOException
    //   117	124	1174	java/io/IOException
  }

  public final void arU()
  {
    AppMethodBeat.i(16765);
    try
    {
      byte[] arrayOfByte = this.gIQ.toByteArray();
      long l = System.currentTimeMillis();
      arrayOfByte = encrypt(arrayOfByte, arV());
      e.deleteFile(this.path);
      e.b(this.path, arrayOfByte, arrayOfByte.length);
      ab.d("MicroMsg.WalletAddrMgr", "hakon saveAddr time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(16765);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletAddrMgr", localException, "", new Object[0]);
        AppMethodBeat.o(16765);
      }
    }
  }

  public final RcptItem bl(String paramString1, String paramString2)
  {
    AppMethodBeat.i(16772);
    paramString1 = wC(paramString1);
    if ((paramString1 == null) || (paramString1.size() == 0))
    {
      AppMethodBeat.o(16772);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      Iterator localIterator = paramString1.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramString1 = (RcptItem)localIterator.next();
          if (paramString1.name.startsWith(paramString2))
          {
            AppMethodBeat.o(16772);
            break;
          }
        }
      AppMethodBeat.o(16772);
      paramString1 = null;
    }
  }

  public final b ne(int paramInt)
  {
    AppMethodBeat.i(16762);
    int i = 0;
    b localb;
    if (i < this.gIQ.gIY.size())
    {
      localb = (b)this.gIQ.gIY.get(i);
      if (localb.id == paramInt)
        AppMethodBeat.o(16762);
    }
    while (true)
    {
      return localb;
      i++;
      break;
      localb = null;
      AppMethodBeat.o(16762);
    }
  }

  public final boolean s(LinkedList<bpk> paramLinkedList)
  {
    AppMethodBeat.i(16764);
    this.gIQ.gIY.clear();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bpk localbpk = (bpk)paramLinkedList.next();
      b localb = new b();
      localb.id = localbpk.id;
      localb.gJh = localbpk.wRW.wVI;
      localb.gJb = localbpk.wRQ.wVI;
      localb.gJe = localbpk.wRT.wVI;
      localb.gJc = localbpk.wRR.wVI;
      localb.gJf = localbpk.wRU.wVI;
      localb.gJg = localbpk.wRV.wVI;
      localb.gJa = localbpk.wRP.wVI;
      localb.gJd = localbpk.wRS.wVI;
      this.gIQ.gIY.add(localb);
    }
    AppMethodBeat.o(16764);
    return true;
  }

  public final List<RcptItem> wC(String paramString)
  {
    AppMethodBeat.i(16769);
    if (this.gIS.containsKey(paramString))
    {
      paramString = (List)this.gIS.get(paramString);
      AppMethodBeat.o(16769);
    }
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      AppMethodBeat.o(16769);
    }
  }

  public final List<RcptItem> wD(String paramString)
  {
    AppMethodBeat.i(16770);
    if (this.gIT.containsKey(paramString))
    {
      paramString = (List)this.gIT.get(paramString);
      AppMethodBeat.o(16770);
    }
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      AppMethodBeat.o(16770);
    }
  }

  public final RcptItem wE(String paramString)
  {
    AppMethodBeat.i(16771);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(16771);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.gIR.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          RcptItem localRcptItem = (RcptItem)localIterator.next();
          if (localRcptItem.name.startsWith(paramString))
          {
            AppMethodBeat.o(16771);
            paramString = localRcptItem;
            break;
          }
        }
      AppMethodBeat.o(16771);
      paramString = null;
    }
  }

  public final RcptItem y(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(16774);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      AppMethodBeat.o(16774);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      paramString1 = e(this.gIR, paramString1);
      if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
      {
        AppMethodBeat.o(16774);
        paramString1 = null;
      }
      else
      {
        paramString1 = e(wC(paramString1.code), paramString2);
        if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
        {
          AppMethodBeat.o(16774);
          paramString1 = null;
        }
        else if (TextUtils.isEmpty(paramString3))
        {
          AppMethodBeat.o(16774);
        }
        else
        {
          paramString2 = e(wD(paramString1.code), paramString3);
          if (paramString2 == null)
          {
            AppMethodBeat.o(16774);
          }
          else
          {
            AppMethodBeat.o(16774);
            paramString1 = paramString2;
          }
        }
      }
    }
  }

  public final boolean z(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = true;
    AppMethodBeat.i(16776);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      AppMethodBeat.o(16776);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString1 = e(this.gIR, paramString1);
      if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
      {
        AppMethodBeat.o(16776);
        bool = false;
      }
      else
      {
        paramString1 = e(wC(paramString1.code), paramString2);
        if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
        {
          AppMethodBeat.o(16776);
          bool = false;
        }
        else if (TextUtils.isEmpty(paramString3))
        {
          AppMethodBeat.o(16776);
        }
        else if (e(wD(paramString1.code), paramString3) == null)
        {
          AppMethodBeat.o(16776);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(16776);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.l
 * JD-Core Version:    0.6.2
 */