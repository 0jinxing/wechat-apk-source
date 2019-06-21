package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;

public final class b extends a<c>
{
  public static final int CTRL_INDEX = 373;
  public static final String NAME = "canvasPutImageData";

  private static int[] n(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(103843);
    byte[] arrayOfByte = d.q(paramByteBuffer);
    paramByteBuffer = new int[arrayOfByte.length / 4];
    int i = 0;
    int k;
    for (int j = 0; i < paramByteBuffer.length; j = k + 1)
    {
      k = j + 1;
      j = arrayOfByte[j];
      int m = k + 1;
      int n = arrayOfByte[k];
      k = m + 1;
      m = arrayOfByte[m];
      paramByteBuffer[i] = ((arrayOfByte[k] & 0xFF) << 24 | (m & 0xFF | ((n & 0xFF) << 8 | (j & 0xFF) << 16)));
      i++;
    }
    AppMethodBeat.o(103843);
    return paramByteBuffer;
  }

  // ERROR //
  public final void a(c paramc, org.json.JSONObject paramJSONObject, int paramInt)
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_2
    //   6: ldc 42
    //   8: invokevirtual 48	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   11: istore 4
    //   13: aload_1
    //   14: ldc 50
    //   16: invokeinterface 56 2 0
    //   21: checkcast 50	com/tencent/mm/plugin/appbrand/jsapi/base/f
    //   24: aload_1
    //   25: invokeinterface 60 2 0
    //   30: astore 5
    //   32: aload 5
    //   34: ifnonnull +71 -> 105
    //   37: ldc 62
    //   39: ldc 64
    //   41: invokestatic 70	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: aload_1
    //   45: iload_3
    //   46: aload_0
    //   47: ldc 72
    //   49: aconst_null
    //   50: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   53: invokeinterface 82 3 0
    //   58: ldc 40
    //   60: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: return
    //   64: astore_2
    //   65: ldc 62
    //   67: ldc 84
    //   69: iconst_1
    //   70: anewarray 86	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: invokestatic 92	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_1
    //   84: iload_3
    //   85: aload_0
    //   86: ldc 97
    //   88: aconst_null
    //   89: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   92: invokeinterface 82 3 0
    //   97: ldc 40
    //   99: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: goto -39 -> 63
    //   105: aload 5
    //   107: invokeinterface 103 1 0
    //   112: iload 4
    //   114: invokevirtual 108	com/tencent/mm/plugin/appbrand/page/ac:q	(I)Landroid/view/View;
    //   117: astore 5
    //   119: aload 5
    //   121: ifnonnull +44 -> 165
    //   124: ldc 62
    //   126: ldc 110
    //   128: iconst_1
    //   129: anewarray 86	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: iload 4
    //   136: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   139: aastore
    //   140: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_1
    //   144: iload_3
    //   145: aload_0
    //   146: ldc 120
    //   148: aconst_null
    //   149: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   152: invokeinterface 82 3 0
    //   157: ldc 40
    //   159: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -99 -> 63
    //   165: aload 5
    //   167: instanceof 122
    //   170: ifne +44 -> 214
    //   173: ldc 62
    //   175: ldc 124
    //   177: iconst_1
    //   178: anewarray 86	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: iload 4
    //   185: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   188: aastore
    //   189: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_1
    //   193: iload_3
    //   194: aload_0
    //   195: ldc 126
    //   197: aconst_null
    //   198: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   201: invokeinterface 82 3 0
    //   206: ldc 40
    //   208: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: goto -148 -> 63
    //   214: aload 5
    //   216: checkcast 122	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer
    //   219: ldc 128
    //   221: invokevirtual 132	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer:ah	(Ljava/lang/Class;)Ljava/lang/Object;
    //   224: checkcast 128	android/view/View
    //   227: astore 5
    //   229: aload 5
    //   231: instanceof 134
    //   234: ifne +44 -> 278
    //   237: ldc 62
    //   239: ldc 136
    //   241: iconst_1
    //   242: anewarray 86	java/lang/Object
    //   245: dup
    //   246: iconst_0
    //   247: iload 4
    //   249: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   252: aastore
    //   253: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: aload_1
    //   257: iload_3
    //   258: aload_0
    //   259: ldc 126
    //   261: aconst_null
    //   262: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   265: invokeinterface 82 3 0
    //   270: ldc 40
    //   272: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: goto -212 -> 63
    //   278: invokestatic 142	com/tencent/mm/plugin/appbrand/r/g:aNQ	()F
    //   281: fstore 6
    //   283: aload_2
    //   284: ldc 144
    //   286: invokevirtual 147	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   289: istore 7
    //   291: aload_2
    //   292: ldc 149
    //   294: invokevirtual 147	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   297: istore 8
    //   299: aload_2
    //   300: ldc 151
    //   302: invokevirtual 147	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   305: istore 9
    //   307: aload_2
    //   308: ldc 153
    //   310: invokevirtual 147	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   313: istore 10
    //   315: iload 7
    //   317: i2f
    //   318: fload 6
    //   320: fmul
    //   321: invokestatic 159	java/lang/Math:round	(F)I
    //   324: pop
    //   325: iload 8
    //   327: i2f
    //   328: fload 6
    //   330: fmul
    //   331: invokestatic 159	java/lang/Math:round	(F)I
    //   334: pop
    //   335: iload 9
    //   337: i2f
    //   338: fload 6
    //   340: fmul
    //   341: invokestatic 159	java/lang/Math:round	(F)I
    //   344: pop
    //   345: fload 6
    //   347: iload 10
    //   349: i2f
    //   350: fmul
    //   351: invokestatic 159	java/lang/Math:round	(F)I
    //   354: pop
    //   355: iload 9
    //   357: ifeq +8 -> 365
    //   360: iload 10
    //   362: ifne +60 -> 422
    //   365: ldc 62
    //   367: ldc 161
    //   369: iconst_3
    //   370: anewarray 86	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: iload 9
    //   377: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: iload 10
    //   385: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: aastore
    //   389: dup
    //   390: iconst_2
    //   391: iload 4
    //   393: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   396: aastore
    //   397: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: aload_1
    //   401: iload_3
    //   402: aload_0
    //   403: ldc 163
    //   405: aconst_null
    //   406: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   409: invokeinterface 82 3 0
    //   414: ldc 40
    //   416: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   419: goto -356 -> 63
    //   422: iload 9
    //   424: ifge +314 -> 738
    //   427: iload 7
    //   429: iload 9
    //   431: iadd
    //   432: istore 7
    //   434: iload 9
    //   436: ineg
    //   437: istore 9
    //   439: iload 10
    //   441: ifge +294 -> 735
    //   444: iload 8
    //   446: iload 10
    //   448: iadd
    //   449: istore 8
    //   451: iload 10
    //   453: ineg
    //   454: istore 10
    //   456: aload_2
    //   457: ldc 165
    //   459: invokevirtual 169	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   462: astore_2
    //   463: aload_2
    //   464: instanceof 171
    //   467: ifne +32 -> 499
    //   470: ldc 62
    //   472: ldc 173
    //   474: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   477: aload_1
    //   478: iload_3
    //   479: aload_0
    //   480: ldc 177
    //   482: aconst_null
    //   483: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   486: invokeinterface 82 3 0
    //   491: ldc 40
    //   493: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   496: goto -433 -> 63
    //   499: aload_2
    //   500: checkcast 171	java/nio/ByteBuffer
    //   503: astore 11
    //   505: new 179	org/json/JSONArray
    //   508: dup
    //   509: invokespecial 180	org/json/JSONArray:<init>	()V
    //   512: astore_2
    //   513: aload 11
    //   515: invokestatic 182	com/tencent/mm/plugin/appbrand/jsapi/b/b:n	(Ljava/nio/ByteBuffer;)[I
    //   518: astore 11
    //   520: new 44	org/json/JSONObject
    //   523: dup
    //   524: invokespecial 183	org/json/JSONObject:<init>	()V
    //   527: astore 12
    //   529: new 179	org/json/JSONArray
    //   532: astore 13
    //   534: aload 13
    //   536: invokespecial 180	org/json/JSONArray:<init>	()V
    //   539: aload 13
    //   541: iload 7
    //   543: invokevirtual 187	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   546: pop
    //   547: aload 13
    //   549: iload 8
    //   551: invokevirtual 187	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   554: pop
    //   555: aload 13
    //   557: iload 9
    //   559: invokevirtual 187	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   562: pop
    //   563: aload 13
    //   565: iload 10
    //   567: invokevirtual 187	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   570: pop
    //   571: aload 13
    //   573: aload 11
    //   575: iload 9
    //   577: iload 10
    //   579: getstatic 193	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   582: invokestatic 199	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   585: invokevirtual 202	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   588: pop
    //   589: aload 12
    //   591: ldc 204
    //   593: ldc 206
    //   595: invokevirtual 209	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   598: pop
    //   599: aload 12
    //   601: ldc 165
    //   603: aload 13
    //   605: invokevirtual 209	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   608: pop
    //   609: aload_2
    //   610: aload 12
    //   612: invokevirtual 202	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   615: pop
    //   616: aload 5
    //   618: checkcast 134	com/tencent/mm/plugin/appbrand/canvas/widget/a
    //   621: astore 5
    //   623: aload 5
    //   625: aload_2
    //   626: new 211	com/tencent/mm/plugin/appbrand/jsapi/b/b$1
    //   629: dup
    //   630: aload_0
    //   631: aload_1
    //   632: iload_3
    //   633: invokespecial 214	com/tencent/mm/plugin/appbrand/jsapi/b/b$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/b/b;Lcom/tencent/mm/plugin/appbrand/jsapi/c;I)V
    //   636: invokeinterface 218 3 0
    //   641: aload 5
    //   643: invokeinterface 221 1 0
    //   648: ldc 40
    //   650: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   653: goto -590 -> 63
    //   656: astore_2
    //   657: ldc 62
    //   659: ldc 223
    //   661: iconst_1
    //   662: anewarray 86	java/lang/Object
    //   665: dup
    //   666: iconst_0
    //   667: aload_2
    //   668: invokestatic 92	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   671: aastore
    //   672: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   675: aload_1
    //   676: iload_3
    //   677: aload_0
    //   678: ldc 225
    //   680: aconst_null
    //   681: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   684: invokeinterface 82 3 0
    //   689: ldc 40
    //   691: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   694: goto -631 -> 63
    //   697: astore_2
    //   698: ldc 62
    //   700: ldc 227
    //   702: iconst_1
    //   703: anewarray 86	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: aload_2
    //   709: aastore
    //   710: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   713: aload_1
    //   714: iload_3
    //   715: aload_0
    //   716: ldc 229
    //   718: aconst_null
    //   719: invokevirtual 78	com/tencent/mm/plugin/appbrand/jsapi/m:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   722: invokeinterface 82 3 0
    //   727: ldc 40
    //   729: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   732: goto -669 -> 63
    //   735: goto -279 -> 456
    //   738: goto -299 -> 439
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	64	org/json/JSONException
    //   456	491	656	org/json/JSONException
    //   499	505	656	org/json/JSONException
    //   529	609	697	org/json/JSONException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.b
 * JD-Core Version:    0.6.2
 */