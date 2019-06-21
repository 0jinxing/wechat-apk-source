package com.tencent.mm.ca;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class f
{
  private static final List<String> xuJ;
  private static f xuK;
  private static g xuL;
  private static c xuM;
  private static e xuN;
  private static String xuO;
  private static boolean xuP;
  private static boolean xuQ;
  private static ArrayList<Integer> xuR;

  static
  {
    AppMethodBeat.i(105933);
    xuJ = Arrays.asList(new String[] { "zh_CN", "en" });
    xuO = "";
    xuP = false;
    xuQ = true;
    xuR = new ArrayList();
    AppMethodBeat.o(105933);
  }

  private static int a(DataInputStream paramDataInputStream, SparseArray<c.a> paramSparseArray, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(105931);
    try
    {
      int j = paramDataInputStream.readByte();
      if (j < 0)
      {
        AppMethodBeat.o(105931);
        paramInt2 = i;
      }
      while (true)
      {
        return paramInt2;
        int[] arrayOfInt1 = new int[j];
        int[] arrayOfInt2 = new int[j];
        int k = 0;
        int m = 0;
        int n = paramInt2;
        paramInt2 = k;
        while (m < j)
        {
          arrayOfInt1[m] = paramDataInputStream.readByte();
          arrayOfInt2[m] = n;
          k = paramDataInputStream.readShort();
          paramInt2 += k;
          n += k;
          m++;
        }
        paramDataInputStream = new com/tencent/mm/ca/c$a;
        paramDataInputStream.<init>(paramInt1, arrayOfInt1, arrayOfInt2);
        paramSparseArray.append(paramInt1, paramDataInputStream);
        AppMethodBeat.o(105931);
      }
    }
    catch (IOException paramDataInputStream)
    {
      while (true)
      {
        ab.e("MicroMsg.language.StringResouces", "exception:%s", new Object[] { bo.l(paramDataInputStream) });
        AppMethodBeat.o(105931);
        paramInt2 = i;
      }
    }
  }

  // ERROR //
  private static void a(AssetManager paramAssetManager)
  {
    // Byte code:
    //   0: ldc 112
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 94
    //   7: ldc 114
    //   9: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: getstatic 61	com/tencent/mm/ca/f:xuR	Ljava/util/ArrayList;
    //   15: ifnonnull +13 -> 28
    //   18: new 56	java/util/ArrayList
    //   21: dup
    //   22: invokespecial 59	java/util/ArrayList:<init>	()V
    //   25: putstatic 61	com/tencent/mm/ca/f:xuR	Ljava/util/ArrayList;
    //   28: getstatic 61	com/tencent/mm/ca/f:xuR	Ljava/util/ArrayList;
    //   31: invokevirtual 120	java/util/ArrayList:clear	()V
    //   34: invokestatic 126	java/lang/System:currentTimeMillis	()J
    //   37: lstore_1
    //   38: aload_0
    //   39: ldc 128
    //   41: invokevirtual 134	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   44: astore_0
    //   45: new 73	java/io/DataInputStream
    //   48: astore_3
    //   49: aload_3
    //   50: aload_0
    //   51: invokespecial 137	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   54: aload_3
    //   55: astore 4
    //   57: aload_0
    //   58: astore 5
    //   60: aload_3
    //   61: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   64: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: astore 6
    //   69: aload_3
    //   70: astore 4
    //   72: aload_0
    //   73: astore 5
    //   75: ldc 94
    //   77: ldc 149
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 6
    //   87: aastore
    //   88: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: iconst_0
    //   92: istore 7
    //   94: aload_3
    //   95: astore 4
    //   97: aload_0
    //   98: astore 5
    //   100: iload 7
    //   102: aload 6
    //   104: invokevirtual 155	java/lang/Integer:intValue	()I
    //   107: if_icmpge +61 -> 168
    //   110: aload_3
    //   111: astore 4
    //   113: aload_0
    //   114: astore 5
    //   116: aload_3
    //   117: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   120: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: astore 8
    //   125: aload_3
    //   126: astore 4
    //   128: aload_0
    //   129: astore 5
    //   131: getstatic 61	com/tencent/mm/ca/f:xuR	Ljava/util/ArrayList;
    //   134: aload 8
    //   136: invokevirtual 159	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   139: pop
    //   140: aload_3
    //   141: astore 4
    //   143: aload_0
    //   144: astore 5
    //   146: ldc 94
    //   148: ldc 161
    //   150: iconst_1
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload 8
    //   158: aastore
    //   159: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: iinc 7 1
    //   165: goto -71 -> 94
    //   168: aload_0
    //   169: ifnull +7 -> 176
    //   172: aload_0
    //   173: invokevirtual 166	java/io/InputStream:close	()V
    //   176: aload_3
    //   177: invokevirtual 167	java/io/DataInputStream:close	()V
    //   180: ldc 94
    //   182: new 169	java/lang/StringBuilder
    //   185: dup
    //   186: ldc 171
    //   188: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: invokestatic 126	java/lang/System:currentTimeMillis	()J
    //   194: lload_1
    //   195: lsub
    //   196: invokevirtual 177	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   199: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   205: ldc 112
    //   207: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: return
    //   211: astore_0
    //   212: ldc 94
    //   214: ldc 96
    //   216: iconst_1
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload_0
    //   223: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   226: aastore
    //   227: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: goto -54 -> 176
    //   233: astore_0
    //   234: ldc 94
    //   236: ldc 96
    //   238: iconst_1
    //   239: anewarray 4	java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: aload_0
    //   245: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   248: aastore
    //   249: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: goto -72 -> 180
    //   255: astore_0
    //   256: aconst_null
    //   257: astore_3
    //   258: aconst_null
    //   259: astore_0
    //   260: aload_3
    //   261: astore 4
    //   263: aload_0
    //   264: astore 5
    //   266: ldc 94
    //   268: ldc 183
    //   270: invokestatic 186	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload_0
    //   274: ifnull +7 -> 281
    //   277: aload_0
    //   278: invokevirtual 166	java/io/InputStream:close	()V
    //   281: aload_3
    //   282: ifnull -102 -> 180
    //   285: aload_3
    //   286: invokevirtual 167	java/io/DataInputStream:close	()V
    //   289: goto -109 -> 180
    //   292: astore_0
    //   293: ldc 94
    //   295: ldc 96
    //   297: iconst_1
    //   298: anewarray 4	java/lang/Object
    //   301: dup
    //   302: iconst_0
    //   303: aload_0
    //   304: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   307: aastore
    //   308: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: goto -131 -> 180
    //   314: astore_0
    //   315: ldc 94
    //   317: ldc 96
    //   319: iconst_1
    //   320: anewarray 4	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload_0
    //   326: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   329: aastore
    //   330: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: goto -52 -> 281
    //   336: astore_0
    //   337: aconst_null
    //   338: astore_3
    //   339: aconst_null
    //   340: astore 5
    //   342: aload 5
    //   344: ifnull +8 -> 352
    //   347: aload 5
    //   349: invokevirtual 166	java/io/InputStream:close	()V
    //   352: aload_3
    //   353: ifnull +7 -> 360
    //   356: aload_3
    //   357: invokevirtual 167	java/io/DataInputStream:close	()V
    //   360: ldc 112
    //   362: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: aload_0
    //   366: athrow
    //   367: astore 5
    //   369: ldc 94
    //   371: ldc 96
    //   373: iconst_1
    //   374: anewarray 4	java/lang/Object
    //   377: dup
    //   378: iconst_0
    //   379: aload 5
    //   381: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   384: aastore
    //   385: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: goto -36 -> 352
    //   391: astore_3
    //   392: ldc 94
    //   394: ldc 96
    //   396: iconst_1
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: aload_3
    //   403: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   406: aastore
    //   407: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: goto -50 -> 360
    //   413: astore_3
    //   414: aconst_null
    //   415: astore 4
    //   417: aload_0
    //   418: astore 5
    //   420: aload_3
    //   421: astore_0
    //   422: aload 4
    //   424: astore_3
    //   425: goto -83 -> 342
    //   428: astore_0
    //   429: aload 4
    //   431: astore_3
    //   432: goto -90 -> 342
    //   435: astore_3
    //   436: aconst_null
    //   437: astore_3
    //   438: goto -178 -> 260
    //   441: astore 5
    //   443: goto -183 -> 260
    //
    // Exception table:
    //   from	to	target	type
    //   172	176	211	java/io/IOException
    //   176	180	233	java/io/IOException
    //   38	45	255	java/io/IOException
    //   285	289	292	java/io/IOException
    //   277	281	314	java/io/IOException
    //   38	45	336	finally
    //   347	352	367	java/io/IOException
    //   356	360	391	java/io/IOException
    //   45	54	413	finally
    //   60	69	428	finally
    //   75	91	428	finally
    //   100	110	428	finally
    //   116	125	428	finally
    //   131	140	428	finally
    //   146	162	428	finally
    //   266	273	428	finally
    //   45	54	435	java/io/IOException
    //   60	69	441	java/io/IOException
    //   75	91	441	java/io/IOException
    //   100	110	441	java/io/IOException
    //   116	125	441	java/io/IOException
    //   131	140	441	java/io/IOException
    //   146	162	441	java/io/IOException
  }

  private static boolean alX(String paramString)
  {
    AppMethodBeat.i(105920);
    boolean bool;
    if (xuJ.contains(paramString))
    {
      bool = false;
      AppMethodBeat.o(105920);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(105920);
    }
  }

  public static f bG(Context paramContext, String paramString)
  {
    AppMethodBeat.i(105923);
    if (paramContext.getResources() == null)
    {
      ab.e("MicroMsg.language.StringResouces", "the resource is null! why?");
      AppMethodBeat.o(105923);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      AssetManager localAssetManager = paramContext.getAssets();
      if (localAssetManager != null)
      {
        dmU();
        a(localAssetManager);
      }
      if (localAssetManager != null)
      {
        dmU();
        if (xuQ);
      }
      else
      {
        AppMethodBeat.o(105923);
        paramContext = null;
        continue;
      }
      if ((bo.isNullOrNil(paramString)) || (paramString.equalsIgnoreCase("language_default")))
      {
        paramString = Locale.getDefault();
        aa.a(paramContext, paramString);
      }
      for (paramContext = paramString; ; paramContext = aa.amw(paramString))
      {
        paramContext = paramContext.toString();
        dmU();
        boolean bool = alX(paramContext);
        xuP = bool;
        if (!bool)
          break label147;
        dmU();
        c(localAssetManager, paramContext);
        paramContext = dmU();
        AppMethodBeat.o(105923);
        break;
      }
      label147: clean();
      xuO = paramContext;
      AppMethodBeat.o(105923);
      paramContext = null;
    }
  }

  // ERROR //
  private static void c(AssetManager paramAssetManager, String paramString)
  {
    // Byte code:
    //   0: ldc 251
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 220	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   9: ifeq +16 -> 25
    //   12: ldc 94
    //   14: ldc 253
    //   16: invokestatic 186	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 251
    //   21: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: return
    //   25: aload_1
    //   26: getstatic 50	com/tencent/mm/ca/f:xuO	Ljava/lang/String;
    //   29: invokevirtual 256	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   32: ifeq +27 -> 59
    //   35: ldc 94
    //   37: ldc_w 258
    //   40: iconst_1
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_1
    //   47: aastore
    //   48: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: ldc 251
    //   53: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: goto -32 -> 24
    //   59: aload_1
    //   60: ldc_w 262
    //   63: invokevirtual 266	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   66: istore_2
    //   67: aload_1
    //   68: astore_3
    //   69: iload_2
    //   70: ifle +48 -> 118
    //   73: aload_1
    //   74: iconst_0
    //   75: iload_2
    //   76: invokevirtual 270	java/lang/String:substring	(II)Ljava/lang/String;
    //   79: astore 4
    //   81: aload_1
    //   82: astore_3
    //   83: aload 4
    //   85: ldc_w 272
    //   88: invokevirtual 225	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   91: ifne +27 -> 118
    //   94: ldc 94
    //   96: ldc_w 274
    //   99: iconst_2
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_1
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: aload 4
    //   111: aastore
    //   112: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload 4
    //   117: astore_3
    //   118: invokestatic 250	com/tencent/mm/ca/f:clean	()V
    //   121: aload_3
    //   122: putstatic 50	com/tencent/mm/ca/f:xuO	Ljava/lang/String;
    //   125: ldc 94
    //   127: ldc_w 276
    //   130: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: invokestatic 126	java/lang/System:currentTimeMillis	()J
    //   136: lstore 5
    //   138: aconst_null
    //   139: astore 7
    //   141: aconst_null
    //   142: astore 8
    //   144: aload 8
    //   146: astore 4
    //   148: aload 7
    //   150: astore_1
    //   151: new 169	java/lang/StringBuilder
    //   154: astore 9
    //   156: aload 8
    //   158: astore 4
    //   160: aload 7
    //   162: astore_1
    //   163: aload 9
    //   165: ldc_w 278
    //   168: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: aload 8
    //   173: astore 4
    //   175: aload 7
    //   177: astore_1
    //   178: aload_0
    //   179: aload 9
    //   181: aload_3
    //   182: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: ldc_w 283
    //   188: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokevirtual 134	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   197: astore_0
    //   198: aload_0
    //   199: astore 4
    //   201: aload_0
    //   202: astore_1
    //   203: new 73	java/io/DataInputStream
    //   206: astore 8
    //   208: aload_0
    //   209: astore 4
    //   211: aload_0
    //   212: astore_1
    //   213: aload 8
    //   215: aload_0
    //   216: invokespecial 137	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   219: aload 8
    //   221: astore 4
    //   223: aload_0
    //   224: astore_1
    //   225: aload 8
    //   227: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   230: pop
    //   231: aload 8
    //   233: astore 4
    //   235: aload_0
    //   236: astore_1
    //   237: aload 8
    //   239: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   242: pop
    //   243: aload 8
    //   245: astore 4
    //   247: aload_0
    //   248: astore_1
    //   249: aload 8
    //   251: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   254: istore 10
    //   256: aload 8
    //   258: astore 4
    //   260: aload_0
    //   261: astore_1
    //   262: ldc 94
    //   264: ldc_w 285
    //   267: iload 10
    //   269: invokestatic 288	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   272: invokevirtual 292	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   275: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: aload 8
    //   280: astore 4
    //   282: aload_0
    //   283: astore_1
    //   284: new 294	android/util/SparseIntArray
    //   287: astore 7
    //   289: aload 8
    //   291: astore 4
    //   293: aload_0
    //   294: astore_1
    //   295: aload 7
    //   297: iload 10
    //   299: invokespecial 296	android/util/SparseIntArray:<init>	(I)V
    //   302: aload 8
    //   304: astore 4
    //   306: aload_0
    //   307: astore_1
    //   308: aload 8
    //   310: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   313: istore 11
    //   315: iconst_0
    //   316: istore_2
    //   317: iconst_0
    //   318: istore 12
    //   320: iload_2
    //   321: iload 10
    //   323: if_icmpge +56 -> 379
    //   326: aload 8
    //   328: astore 4
    //   330: aload_0
    //   331: astore_1
    //   332: iload 11
    //   334: aload 8
    //   336: invokevirtual 81	java/io/DataInputStream:readShort	()S
    //   339: iadd
    //   340: istore 11
    //   342: aload 8
    //   344: astore 4
    //   346: aload_0
    //   347: astore_1
    //   348: aload 7
    //   350: iload 11
    //   352: iload 12
    //   354: invokevirtual 299	android/util/SparseIntArray:append	(II)V
    //   357: aload 8
    //   359: astore 4
    //   361: aload_0
    //   362: astore_1
    //   363: iload 12
    //   365: aload 8
    //   367: invokevirtual 81	java/io/DataInputStream:readShort	()S
    //   370: iadd
    //   371: istore 12
    //   373: iinc 2 1
    //   376: goto -56 -> 320
    //   379: aload 8
    //   381: astore 4
    //   383: aload_0
    //   384: astore_1
    //   385: aload 7
    //   387: aload 8
    //   389: iload 12
    //   391: invokestatic 304	com/tencent/mm/ca/g:a	(Landroid/util/SparseIntArray;Ljava/io/InputStream;I)Lcom/tencent/mm/ca/g;
    //   394: putstatic 306	com/tencent/mm/ca/f:xuL	Lcom/tencent/mm/ca/g;
    //   397: iconst_0
    //   398: istore 12
    //   400: aload 8
    //   402: astore 4
    //   404: aload_0
    //   405: astore_1
    //   406: aload 8
    //   408: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   411: istore 10
    //   413: aload 8
    //   415: astore 4
    //   417: aload_0
    //   418: astore_1
    //   419: ldc 94
    //   421: ldc_w 308
    //   424: iconst_1
    //   425: anewarray 4	java/lang/Object
    //   428: dup
    //   429: iconst_0
    //   430: iload 10
    //   432: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: aastore
    //   436: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   439: iload 10
    //   441: ifle +107 -> 548
    //   444: aload 8
    //   446: astore 4
    //   448: aload_0
    //   449: astore_1
    //   450: new 88	android/util/SparseArray
    //   453: astore 7
    //   455: aload 8
    //   457: astore 4
    //   459: aload_0
    //   460: astore_1
    //   461: aload 7
    //   463: iload 10
    //   465: invokespecial 309	android/util/SparseArray:<init>	(I)V
    //   468: aload 8
    //   470: astore 4
    //   472: aload_0
    //   473: astore_1
    //   474: aload 8
    //   476: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   479: istore 11
    //   481: iconst_0
    //   482: istore_2
    //   483: iload 12
    //   485: iload 10
    //   487: if_icmpge +44 -> 531
    //   490: aload 8
    //   492: astore 4
    //   494: aload_0
    //   495: astore_1
    //   496: iload 11
    //   498: aload 8
    //   500: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   503: iadd
    //   504: istore 11
    //   506: aload 8
    //   508: astore 4
    //   510: aload_0
    //   511: astore_1
    //   512: iload_2
    //   513: aload 8
    //   515: aload 7
    //   517: iload 11
    //   519: iload_2
    //   520: invokestatic 311	com/tencent/mm/ca/f:a	(Ljava/io/DataInputStream;Landroid/util/SparseArray;II)I
    //   523: iadd
    //   524: istore_2
    //   525: iinc 12 1
    //   528: goto -45 -> 483
    //   531: aload 8
    //   533: astore 4
    //   535: aload_0
    //   536: astore_1
    //   537: aload 7
    //   539: aload 8
    //   541: iload_2
    //   542: invokestatic 316	com/tencent/mm/ca/c:a	(Landroid/util/SparseArray;Ljava/io/InputStream;I)Lcom/tencent/mm/ca/c;
    //   545: putstatic 318	com/tencent/mm/ca/f:xuM	Lcom/tencent/mm/ca/c;
    //   548: aload 8
    //   550: astore 4
    //   552: aload_0
    //   553: astore_1
    //   554: aload 8
    //   556: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   559: istore 13
    //   561: aload 8
    //   563: astore 4
    //   565: aload_0
    //   566: astore_1
    //   567: aload 8
    //   569: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   572: istore 11
    //   574: aload 8
    //   576: astore 4
    //   578: aload_0
    //   579: astore_1
    //   580: ldc 94
    //   582: ldc_w 320
    //   585: iconst_1
    //   586: anewarray 4	java/lang/Object
    //   589: dup
    //   590: iconst_0
    //   591: iload 13
    //   593: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   596: aastore
    //   597: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   600: iload 13
    //   602: ifle +187 -> 789
    //   605: aload 8
    //   607: astore 4
    //   609: aload_0
    //   610: astore_1
    //   611: new 88	android/util/SparseArray
    //   614: astore 14
    //   616: aload 8
    //   618: astore 4
    //   620: aload_0
    //   621: astore_1
    //   622: aload 14
    //   624: iload 13
    //   626: invokespecial 309	android/util/SparseArray:<init>	(I)V
    //   629: iconst_0
    //   630: istore 12
    //   632: iconst_0
    //   633: istore_2
    //   634: iload_2
    //   635: iload 13
    //   637: if_icmpge +134 -> 771
    //   640: aload 8
    //   642: astore 4
    //   644: aload_0
    //   645: astore_1
    //   646: aload 8
    //   648: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   651: iload 11
    //   653: iadd
    //   654: istore 10
    //   656: aload 8
    //   658: astore 4
    //   660: aload_0
    //   661: astore_1
    //   662: aload 8
    //   664: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   667: istore 15
    //   669: aload 8
    //   671: astore 4
    //   673: aload_0
    //   674: astore_1
    //   675: iload 15
    //   677: newarray int
    //   679: astore 9
    //   681: iconst_0
    //   682: istore 11
    //   684: iload 11
    //   686: iload 15
    //   688: if_icmpge +32 -> 720
    //   691: aload 9
    //   693: iload 11
    //   695: iload 12
    //   697: iastore
    //   698: aload 8
    //   700: astore 4
    //   702: aload_0
    //   703: astore_1
    //   704: iload 12
    //   706: aload 8
    //   708: invokevirtual 81	java/io/DataInputStream:readShort	()S
    //   711: iadd
    //   712: istore 12
    //   714: iinc 11 1
    //   717: goto -33 -> 684
    //   720: aload 8
    //   722: astore 4
    //   724: aload_0
    //   725: astore_1
    //   726: new 322	com/tencent/mm/ca/e$a
    //   729: astore 7
    //   731: aload 8
    //   733: astore 4
    //   735: aload_0
    //   736: astore_1
    //   737: aload 7
    //   739: iload 10
    //   741: aload 9
    //   743: invokespecial 325	com/tencent/mm/ca/e$a:<init>	(I[I)V
    //   746: aload 8
    //   748: astore 4
    //   750: aload_0
    //   751: astore_1
    //   752: aload 14
    //   754: iload 10
    //   756: aload 7
    //   758: invokevirtual 92	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   761: iinc 2 1
    //   764: iload 10
    //   766: istore 11
    //   768: goto -134 -> 634
    //   771: aload 8
    //   773: astore 4
    //   775: aload_0
    //   776: astore_1
    //   777: aload 14
    //   779: aload 8
    //   781: iload 12
    //   783: invokestatic 331	com/tencent/mm/ca/e:b	(Landroid/util/SparseArray;Ljava/io/InputStream;I)Lcom/tencent/mm/ca/e;
    //   786: putstatic 333	com/tencent/mm/ca/f:xuN	Lcom/tencent/mm/ca/e;
    //   789: aload_0
    //   790: ifnull +7 -> 797
    //   793: aload_0
    //   794: invokevirtual 166	java/io/InputStream:close	()V
    //   797: aload 8
    //   799: invokevirtual 167	java/io/DataInputStream:close	()V
    //   802: ldc 94
    //   804: new 169	java/lang/StringBuilder
    //   807: dup
    //   808: ldc_w 335
    //   811: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   814: invokestatic 126	java/lang/System:currentTimeMillis	()J
    //   817: lload 5
    //   819: lsub
    //   820: invokevirtual 177	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   823: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   826: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   829: ldc 251
    //   831: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   834: goto -810 -> 24
    //   837: astore_0
    //   838: ldc 94
    //   840: ldc 96
    //   842: iconst_1
    //   843: anewarray 4	java/lang/Object
    //   846: dup
    //   847: iconst_0
    //   848: aload_0
    //   849: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   852: aastore
    //   853: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   856: goto -59 -> 797
    //   859: astore_0
    //   860: ldc 94
    //   862: ldc 96
    //   864: iconst_1
    //   865: anewarray 4	java/lang/Object
    //   868: dup
    //   869: iconst_0
    //   870: aload_0
    //   871: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   874: aastore
    //   875: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   878: goto -76 -> 802
    //   881: astore 7
    //   883: aconst_null
    //   884: astore 8
    //   886: aload 4
    //   888: astore_0
    //   889: aload 8
    //   891: astore 4
    //   893: aload_0
    //   894: astore_1
    //   895: ldc 94
    //   897: aload 7
    //   899: ldc_w 337
    //   902: iconst_1
    //   903: anewarray 4	java/lang/Object
    //   906: dup
    //   907: iconst_0
    //   908: aload_3
    //   909: aastore
    //   910: invokestatic 341	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   913: aload_0
    //   914: ifnull +7 -> 921
    //   917: aload_0
    //   918: invokevirtual 166	java/io/InputStream:close	()V
    //   921: aload 8
    //   923: ifnull -121 -> 802
    //   926: aload 8
    //   928: invokevirtual 167	java/io/DataInputStream:close	()V
    //   931: goto -129 -> 802
    //   934: astore_0
    //   935: ldc 94
    //   937: ldc 96
    //   939: iconst_1
    //   940: anewarray 4	java/lang/Object
    //   943: dup
    //   944: iconst_0
    //   945: aload_0
    //   946: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   949: aastore
    //   950: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   953: goto -151 -> 802
    //   956: astore_0
    //   957: ldc 94
    //   959: ldc 96
    //   961: iconst_1
    //   962: anewarray 4	java/lang/Object
    //   965: dup
    //   966: iconst_0
    //   967: aload_0
    //   968: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   971: aastore
    //   972: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   975: goto -54 -> 921
    //   978: astore_0
    //   979: aconst_null
    //   980: astore 4
    //   982: aload_1
    //   983: ifnull +7 -> 990
    //   986: aload_1
    //   987: invokevirtual 166	java/io/InputStream:close	()V
    //   990: aload 4
    //   992: ifnull +8 -> 1000
    //   995: aload 4
    //   997: invokevirtual 167	java/io/DataInputStream:close	()V
    //   1000: ldc 251
    //   1002: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1005: aload_0
    //   1006: athrow
    //   1007: astore_1
    //   1008: ldc 94
    //   1010: ldc 96
    //   1012: iconst_1
    //   1013: anewarray 4	java/lang/Object
    //   1016: dup
    //   1017: iconst_0
    //   1018: aload_1
    //   1019: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1022: aastore
    //   1023: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1026: goto -36 -> 990
    //   1029: astore_1
    //   1030: ldc 94
    //   1032: ldc 96
    //   1034: iconst_1
    //   1035: anewarray 4	java/lang/Object
    //   1038: dup
    //   1039: iconst_0
    //   1040: aload_1
    //   1041: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1044: aastore
    //   1045: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1048: goto -48 -> 1000
    //   1051: astore_0
    //   1052: goto -70 -> 982
    //   1055: astore 7
    //   1057: goto -168 -> 889
    //
    // Exception table:
    //   from	to	target	type
    //   793	797	837	java/io/IOException
    //   797	802	859	java/io/IOException
    //   151	156	881	java/io/IOException
    //   163	171	881	java/io/IOException
    //   178	198	881	java/io/IOException
    //   203	208	881	java/io/IOException
    //   213	219	881	java/io/IOException
    //   926	931	934	java/io/IOException
    //   917	921	956	java/io/IOException
    //   151	156	978	finally
    //   163	171	978	finally
    //   178	198	978	finally
    //   203	208	978	finally
    //   213	219	978	finally
    //   986	990	1007	java/io/IOException
    //   995	1000	1029	java/io/IOException
    //   225	231	1051	finally
    //   237	243	1051	finally
    //   249	256	1051	finally
    //   262	278	1051	finally
    //   284	289	1051	finally
    //   295	302	1051	finally
    //   308	315	1051	finally
    //   332	342	1051	finally
    //   348	357	1051	finally
    //   363	373	1051	finally
    //   385	397	1051	finally
    //   406	413	1051	finally
    //   419	439	1051	finally
    //   450	455	1051	finally
    //   461	468	1051	finally
    //   474	481	1051	finally
    //   496	506	1051	finally
    //   512	525	1051	finally
    //   537	548	1051	finally
    //   554	561	1051	finally
    //   567	574	1051	finally
    //   580	600	1051	finally
    //   611	616	1051	finally
    //   622	629	1051	finally
    //   646	656	1051	finally
    //   662	669	1051	finally
    //   675	681	1051	finally
    //   704	714	1051	finally
    //   726	731	1051	finally
    //   737	746	1051	finally
    //   752	761	1051	finally
    //   777	789	1051	finally
    //   895	913	1051	finally
    //   225	231	1055	java/io/IOException
    //   237	243	1055	java/io/IOException
    //   249	256	1055	java/io/IOException
    //   262	278	1055	java/io/IOException
    //   284	289	1055	java/io/IOException
    //   295	302	1055	java/io/IOException
    //   308	315	1055	java/io/IOException
    //   332	342	1055	java/io/IOException
    //   348	357	1055	java/io/IOException
    //   363	373	1055	java/io/IOException
    //   385	397	1055	java/io/IOException
    //   406	413	1055	java/io/IOException
    //   419	439	1055	java/io/IOException
    //   450	455	1055	java/io/IOException
    //   461	468	1055	java/io/IOException
    //   474	481	1055	java/io/IOException
    //   496	506	1055	java/io/IOException
    //   512	525	1055	java/io/IOException
    //   537	548	1055	java/io/IOException
    //   554	561	1055	java/io/IOException
    //   567	574	1055	java/io/IOException
    //   580	600	1055	java/io/IOException
    //   611	616	1055	java/io/IOException
    //   622	629	1055	java/io/IOException
    //   646	656	1055	java/io/IOException
    //   662	669	1055	java/io/IOException
    //   675	681	1055	java/io/IOException
    //   704	714	1055	java/io/IOException
    //   726	731	1055	java/io/IOException
    //   737	746	1055	java/io/IOException
    //   752	761	1055	java/io/IOException
    //   777	789	1055	java/io/IOException
  }

  private static void clean()
  {
    AppMethodBeat.i(105921);
    Object localObject;
    if (xuL != null)
    {
      localObject = xuL;
      if (((g)localObject).xuS != null)
        ((g)localObject).xuS.clear();
      if (((g)localObject).xuT != null)
        ((g)localObject).xuT = null;
    }
    if (xuM != null)
    {
      localObject = xuM;
      if (((c)localObject).xuC != null)
        ((c)localObject).xuC.clear();
      if (((c)localObject).mData != null)
        ((c)localObject).mData = null;
    }
    if (xuN != null)
    {
      localObject = xuN;
      if (((e)localObject).xuH != null)
        ((e)localObject).xuH.clear();
      if (((e)localObject).mData != null)
        ((e)localObject).mData = null;
    }
    AppMethodBeat.o(105921);
  }

  public static CharSequence d(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105932);
    if (paramCharSequence == null)
      AppMethodBeat.o(105932);
    while (true)
    {
      return paramCharSequence;
      if ((xuR == null) || (xuR.isEmpty()))
      {
        AppMethodBeat.o(105932);
      }
      else if (xuR.contains(Integer.valueOf(paramInt)))
      {
        paramCharSequence = a.x(paramCharSequence.toString(), com.tencent.mm.a.g.x("lucky".getBytes()).substring(0, 16));
        AppMethodBeat.o(105932);
      }
      else
      {
        AppMethodBeat.o(105932);
      }
    }
  }

  public static boolean dmT()
  {
    return xuQ;
  }

  public static f dmU()
  {
    AppMethodBeat.i(105919);
    try
    {
      if (xuK == null)
      {
        localf = new com/tencent/mm/ca/f;
        localf.<init>();
        xuK = localf;
      }
      f localf = xuK;
      return localf;
    }
    finally
    {
      AppMethodBeat.o(105919);
    }
  }

  public static boolean dmV()
  {
    boolean bool = false;
    AppMethodBeat.i(105926);
    int i;
    if ((!xuQ) || (!xuP))
    {
      if ((xuR != null) && (!xuR.isEmpty()))
      {
        i = 1;
        if (i == 0)
          break label56;
      }
    }
    else
    {
      AppMethodBeat.o(105926);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label56: AppMethodBeat.o(105926);
    }
  }

  public static String getQuantityString(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105928);
    String str;
    if (xuM == null)
    {
      str = null;
      AppMethodBeat.o(105928);
    }
    while (true)
    {
      return str;
      str = xuM.getQuantityString(paramInt1, paramInt2, new Object[0]);
      AppMethodBeat.o(105928);
    }
  }

  public static String getQuantityString(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105929);
    if (xuM == null)
    {
      paramArrayOfObject = null;
      AppMethodBeat.o(105929);
    }
    while (true)
    {
      return paramArrayOfObject;
      paramArrayOfObject = xuM.getQuantityString(paramInt1, paramInt2, paramArrayOfObject);
      AppMethodBeat.o(105929);
    }
  }

  public static String getString(int paramInt)
  {
    AppMethodBeat.i(105927);
    String str;
    if (xuL == null)
    {
      str = null;
      AppMethodBeat.o(105927);
    }
    while (true)
    {
      return str;
      str = xuL.getString(paramInt);
      AppMethodBeat.o(105927);
    }
  }

  public static String[] getStringArray(int paramInt)
  {
    int i = 0;
    String[] arrayOfString = null;
    AppMethodBeat.i(105930);
    if (xuN == null)
      AppMethodBeat.o(105930);
    e locale;
    int j;
    while (true)
    {
      return arrayOfString;
      locale = xuN;
      j = locale.xuH.indexOfKey(paramInt);
      if (j >= 0)
        break;
      AppMethodBeat.o(105930);
    }
    e.a locala;
    if (j < locale.xuH.size() - 1)
    {
      paramInt = ((e.a)locale.xuH.valueAt(j + 1)).xuI[0];
      locala = (e.a)locale.xuH.valueAt(j);
      j = locala.xuI.length;
      if (j <= 0)
        break label228;
      arrayOfString = new String[j];
      label119: if (i >= j)
        break label219;
      if (i >= j - 1)
        break label186;
      arrayOfString[i] = new String(locale.mData, locala.xuI[i], locala.xuI[(i + 1)] - locala.xuI[i]);
    }
    while (true)
    {
      i++;
      break label119;
      paramInt = locale.mData.length;
      break;
      label186: arrayOfString[i] = new String(locale.mData, locala.xuI[i], paramInt - locala.xuI[i]);
    }
    while (true)
    {
      label219: AppMethodBeat.o(105930);
      break;
      label228: arrayOfString = null;
    }
  }

  public static f gf(Context paramContext)
  {
    AppMethodBeat.i(105922);
    paramContext = bG(paramContext, aa.g(paramContext.getSharedPreferences(ah.doA(), 0)));
    AppMethodBeat.o(105922);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.f
 * JD-Core Version:    0.6.2
 */