package com.tencent.mm.ca;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.svg.a.c;
import com.tencent.mm.svg.a.e;
import java.lang.reflect.Method;

public final class b extends Resources
{
  private static Method xuA = null;
  private static Method xuB = null;
  private Resources mResources;
  private f xuw;
  private d xux;
  private boolean xuy;
  private a xuz;

  // ERROR //
  private b(Resources paramResources, f paramf, d paramd, a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 42	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   5: aload 4
    //   7: invokevirtual 48	com/tencent/mm/ca/a:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   10: aload 4
    //   12: aload_1
    //   13: invokevirtual 52	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   16: invokevirtual 56	com/tencent/mm/ca/a:b	(Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   19: invokespecial 59	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    //   22: ldc 60
    //   24: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   27: aload_0
    //   28: aload 4
    //   30: putfield 68	com/tencent/mm/ca/b:xuz	Lcom/tencent/mm/ca/a;
    //   33: aload_0
    //   34: aload_2
    //   35: putfield 70	com/tencent/mm/ca/b:xuw	Lcom/tencent/mm/ca/f;
    //   38: aload_1
    //   39: instanceof 2
    //   42: ifeq +140 -> 182
    //   45: aload_0
    //   46: aload_1
    //   47: checkcast 2	com/tencent/mm/ca/b
    //   50: getfield 72	com/tencent/mm/ca/b:mResources	Landroid/content/res/Resources;
    //   53: putfield 72	com/tencent/mm/ca/b:mResources	Landroid/content/res/Resources;
    //   56: aload_0
    //   57: aload_3
    //   58: putfield 74	com/tencent/mm/ca/b:xux	Lcom/tencent/mm/ca/d;
    //   61: ldc 76
    //   63: invokestatic 82	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   66: astore 4
    //   68: aload 4
    //   70: ifnull +120 -> 190
    //   73: ldc 84
    //   75: ldc 86
    //   77: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: aload 4
    //   82: ldc 93
    //   84: invokevirtual 97	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   87: astore_3
    //   88: aload_3
    //   89: astore_2
    //   90: aload_3
    //   91: ifnull +101 -> 192
    //   94: aload_3
    //   95: iconst_1
    //   96: invokevirtual 103	java/lang/reflect/Field:setAccessible	(Z)V
    //   99: aload_3
    //   100: aconst_null
    //   101: getstatic 109	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   104: invokevirtual 113	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   107: new 115	com/tencent/mm/compatible/loader/c
    //   110: dup
    //   111: aload_0
    //   112: invokevirtual 116	com/tencent/mm/ca/b:getAssets	()Landroid/content/res/AssetManager;
    //   115: ldc 118
    //   117: aconst_null
    //   118: invokespecial 121	com/tencent/mm/compatible/loader/c:<init>	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   121: astore_2
    //   122: aload_2
    //   123: invokevirtual 125	com/tencent/mm/compatible/loader/c:Mg	()Z
    //   126: ifeq +16 -> 142
    //   129: new 6	com/tencent/mm/ca/b$a
    //   132: astore_3
    //   133: aload_3
    //   134: invokespecial 127	com/tencent/mm/ca/b$a:<init>	()V
    //   137: aload_2
    //   138: aload_3
    //   139: invokevirtual 130	com/tencent/mm/compatible/loader/c:set	(Ljava/lang/Object;)V
    //   142: aload_0
    //   143: invokestatic 136	com/tencent/mm/sdk/platformtools/ah:doB	()Landroid/content/SharedPreferences;
    //   146: ldc 138
    //   148: iconst_0
    //   149: invokeinterface 144 3 0
    //   154: putfield 146	com/tencent/mm/ca/b:xuy	Z
    //   157: ldc 84
    //   159: ldc 148
    //   161: iconst_2
    //   162: anewarray 150	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_1
    //   168: aastore
    //   169: dup
    //   170: iconst_1
    //   171: aload_0
    //   172: aastore
    //   173: invokestatic 153	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: ldc 60
    //   178: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: return
    //   182: aload_0
    //   183: aload_1
    //   184: putfield 72	com/tencent/mm/ca/b:mResources	Landroid/content/res/Resources;
    //   187: goto -131 -> 56
    //   190: aconst_null
    //   191: astore_2
    //   192: ldc 84
    //   194: ldc 158
    //   196: iconst_2
    //   197: anewarray 150	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload 4
    //   204: aastore
    //   205: dup
    //   206: iconst_1
    //   207: aload_2
    //   208: aastore
    //   209: invokestatic 161	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: goto -105 -> 107
    //   215: astore_2
    //   216: ldc 84
    //   218: ldc 163
    //   220: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: goto -116 -> 107
    //   226: astore_2
    //   227: ldc 84
    //   229: ldc 165
    //   231: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: goto -127 -> 107
    //   237: astore_2
    //   238: ldc 84
    //   240: ldc 167
    //   242: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: goto -138 -> 107
    //   248: astore_2
    //   249: ldc 84
    //   251: ldc 169
    //   253: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   256: goto -149 -> 107
    //   259: astore_2
    //   260: ldc 84
    //   262: aload_2
    //   263: ldc 171
    //   265: iconst_0
    //   266: anewarray 150	java/lang/Object
    //   269: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: goto -130 -> 142
    //   275: astore_2
    //   276: ldc 84
    //   278: aload_2
    //   279: ldc 171
    //   281: iconst_0
    //   282: anewarray 150	java/lang/Object
    //   285: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -146 -> 142
    //   291: astore_2
    //   292: ldc 84
    //   294: aload_2
    //   295: ldc 171
    //   297: iconst_0
    //   298: anewarray 150	java/lang/Object
    //   301: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -162 -> 142
    //   307: astore_2
    //   308: ldc 84
    //   310: aload_2
    //   311: invokevirtual 179	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   314: invokestatic 181	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   317: goto -160 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   61	68	215	java/lang/ClassNotFoundException
    //   73	88	215	java/lang/ClassNotFoundException
    //   94	107	215	java/lang/ClassNotFoundException
    //   192	212	215	java/lang/ClassNotFoundException
    //   61	68	226	java/lang/NoSuchFieldException
    //   73	88	226	java/lang/NoSuchFieldException
    //   94	107	226	java/lang/NoSuchFieldException
    //   192	212	226	java/lang/NoSuchFieldException
    //   61	68	237	java/lang/IllegalAccessException
    //   73	88	237	java/lang/IllegalAccessException
    //   94	107	237	java/lang/IllegalAccessException
    //   192	212	237	java/lang/IllegalAccessException
    //   61	68	248	java/lang/IllegalArgumentException
    //   73	88	248	java/lang/IllegalArgumentException
    //   94	107	248	java/lang/IllegalArgumentException
    //   192	212	248	java/lang/IllegalArgumentException
    //   122	142	259	java/lang/NoSuchFieldException
    //   122	142	275	java/lang/IllegalAccessException
    //   122	142	291	java/lang/IllegalArgumentException
    //   142	157	307	java/lang/Exception
  }

  public static Resources a(Resources paramResources, Context paramContext)
  {
    AppMethodBeat.i(105891);
    paramResources = new b(paramResources, f.gf(paramContext), new d(), new a(paramResources.getDisplayMetrics()));
    AppMethodBeat.o(105891);
    return paramResources;
  }

  public static Resources a(Resources paramResources, Context paramContext, String paramString)
  {
    AppMethodBeat.i(105892);
    paramResources = new b(paramResources, f.bG(paramContext, paramString), new d(), new a(paramResources.getDisplayMetrics()));
    AppMethodBeat.o(105892);
    return paramResources;
  }

  public static Drawable d(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(105908);
    paramResources = e.d(paramResources, paramInt);
    AppMethodBeat.o(105908);
    return paramResources;
  }

  private Drawable d(Drawable paramDrawable, int paramInt)
  {
    AppMethodBeat.i(105907);
    Object localObject = paramDrawable;
    if (paramDrawable == null)
      ab.c("MicroMsg.MMResources", "Notice!!! drawable == null!!!", new Object[0]);
    try
    {
      if (this.xux.xuG.g(this, paramInt))
        ab.e("MicroMsg.MMResources", "resources name = %s, this resource %s", new Object[] { getResourceName(paramInt), this });
      localObject = new c(new Picture(), 0);
      AppMethodBeat.o(105907);
      return localObject;
    }
    catch (Exception paramDrawable)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMResources", paramDrawable, "WTF", new Object[0]);
    }
  }

  private boolean dmT()
  {
    AppMethodBeat.i(105893);
    boolean bool;
    if ((this.xuw != null) && (f.dmT()))
    {
      bool = true;
      AppMethodBeat.o(105893);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105893);
    }
  }

  // ERROR //
  public static Drawable e(Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 252
    //   4: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 254	android/util/TypedValue
    //   10: dup
    //   11: invokespecial 255	android/util/TypedValue:<init>	()V
    //   14: astore_3
    //   15: aload_0
    //   16: iload_1
    //   17: aload_3
    //   18: iconst_1
    //   19: invokevirtual 259	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   22: aconst_null
    //   23: astore 4
    //   25: aload_3
    //   26: getfield 263	android/util/TypedValue:type	I
    //   29: bipush 28
    //   31: if_icmplt +506 -> 537
    //   34: aload_3
    //   35: getfield 263	android/util/TypedValue:type	I
    //   38: bipush 31
    //   40: if_icmpgt +497 -> 537
    //   43: iload_2
    //   44: ifeq +16 -> 60
    //   47: new 265	android/graphics/drawable/ColorDrawable
    //   50: dup
    //   51: aload_3
    //   52: getfield 268	android/util/TypedValue:data	I
    //   55: invokespecial 270	android/graphics/drawable/ColorDrawable:<init>	(I)V
    //   58: astore 4
    //   60: getstatic 23	com/tencent/mm/ca/b:xuA	Ljava/lang/reflect/Method;
    //   63: ifnonnull +52 -> 115
    //   66: ldc 4
    //   68: ldc_w 272
    //   71: iconst_4
    //   72: anewarray 78	java/lang/Class
    //   75: dup
    //   76: iconst_0
    //   77: ldc_w 274
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: getstatic 280	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   86: aastore
    //   87: dup
    //   88: iconst_2
    //   89: getstatic 280	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   92: aastore
    //   93: dup
    //   94: iconst_3
    //   95: ldc_w 274
    //   98: aastore
    //   99: invokevirtual 284	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   102: astore 5
    //   104: aload 5
    //   106: putstatic 23	com/tencent/mm/ca/b:xuA	Ljava/lang/reflect/Method;
    //   109: aload 5
    //   111: iconst_1
    //   112: invokevirtual 287	java/lang/reflect/Method:setAccessible	(Z)V
    //   115: getstatic 25	com/tencent/mm/ca/b:xuB	Ljava/lang/reflect/Method;
    //   118: ifnonnull +47 -> 165
    //   121: ldc_w 289
    //   124: ldc_w 291
    //   127: iconst_3
    //   128: anewarray 78	java/lang/Class
    //   131: dup
    //   132: iconst_0
    //   133: getstatic 280	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: ldc_w 274
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: getstatic 280	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   148: aastore
    //   149: invokevirtual 284	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   152: astore 5
    //   154: aload 5
    //   156: putstatic 25	com/tencent/mm/ca/b:xuB	Ljava/lang/reflect/Method;
    //   159: aload 5
    //   161: iconst_1
    //   162: invokevirtual 287	java/lang/reflect/Method:setAccessible	(Z)V
    //   165: aload 4
    //   167: astore 5
    //   169: aload 4
    //   171: ifnonnull +185 -> 356
    //   174: aload_3
    //   175: getfield 295	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   178: ifnonnull +100 -> 278
    //   181: new 297	android/content/res/Resources$NotFoundException
    //   184: dup
    //   185: ldc_w 299
    //   188: aload_3
    //   189: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 307	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   195: invokespecial 310	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   198: astore_0
    //   199: ldc 252
    //   201: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: aload_0
    //   205: athrow
    //   206: astore_0
    //   207: ldc 84
    //   209: aload_0
    //   210: ldc 171
    //   212: iconst_0
    //   213: anewarray 150	java/lang/Object
    //   216: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: ldc 84
    //   221: aload_0
    //   222: ldc 171
    //   224: iconst_0
    //   225: anewarray 150	java/lang/Object
    //   228: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: aconst_null
    //   232: astore 5
    //   234: ldc 252
    //   236: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: aload 5
    //   241: areturn
    //   242: astore_0
    //   243: ldc 84
    //   245: aload_0
    //   246: ldc 171
    //   248: iconst_0
    //   249: anewarray 150	java/lang/Object
    //   252: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: ldc 84
    //   257: aload_0
    //   258: ldc 171
    //   260: iconst_0
    //   261: anewarray 150	java/lang/Object
    //   264: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: aconst_null
    //   268: astore 5
    //   270: ldc 252
    //   272: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: goto -36 -> 239
    //   278: aload_3
    //   279: getfield 295	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   282: invokeinterface 315 1 0
    //   287: astore 4
    //   289: aload 4
    //   291: ldc_w 317
    //   294: invokevirtual 321	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   297: ifeq +123 -> 420
    //   300: getstatic 23	com/tencent/mm/ca/b:xuA	Ljava/lang/reflect/Method;
    //   303: aload_0
    //   304: iconst_4
    //   305: anewarray 150	java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload 4
    //   312: aastore
    //   313: dup
    //   314: iconst_1
    //   315: iload_1
    //   316: invokestatic 324	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: aload_3
    //   323: getfield 327	android/util/TypedValue:assetCookie	I
    //   326: invokestatic 324	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   329: aastore
    //   330: dup
    //   331: iconst_3
    //   332: ldc_w 329
    //   335: aastore
    //   336: invokevirtual 333	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   339: checkcast 335	android/content/res/XmlResourceParser
    //   342: astore_3
    //   343: aload_0
    //   344: aload_3
    //   345: invokestatic 341	android/graphics/drawable/Drawable:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/graphics/drawable/Drawable;
    //   348: astore 5
    //   350: aload_3
    //   351: invokeinterface 344 1 0
    //   356: ldc 252
    //   358: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: goto -122 -> 239
    //   364: astore_0
    //   365: new 297	android/content/res/Resources$NotFoundException
    //   368: dup
    //   369: new 346	java/lang/StringBuilder
    //   372: dup
    //   373: ldc_w 348
    //   376: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   379: aload 4
    //   381: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: ldc_w 355
    //   387: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: iload_1
    //   391: invokestatic 358	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   394: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: invokevirtual 359	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   400: invokespecial 310	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   403: astore 5
    //   405: aload 5
    //   407: aload_0
    //   408: invokevirtual 363	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: pop
    //   412: ldc 252
    //   414: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   417: aload 5
    //   419: athrow
    //   420: getstatic 25	com/tencent/mm/ca/b:xuB	Ljava/lang/reflect/Method;
    //   423: aload_0
    //   424: invokevirtual 42	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   427: iconst_3
    //   428: anewarray 150	java/lang/Object
    //   431: dup
    //   432: iconst_0
    //   433: aload_3
    //   434: getfield 327	android/util/TypedValue:assetCookie	I
    //   437: invokestatic 324	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   440: aastore
    //   441: dup
    //   442: iconst_1
    //   443: aload 4
    //   445: aastore
    //   446: dup
    //   447: iconst_2
    //   448: iconst_2
    //   449: invokestatic 324	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   452: aastore
    //   453: invokevirtual 333	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   456: checkcast 365	java/io/InputStream
    //   459: astore 6
    //   461: aload_0
    //   462: aload_3
    //   463: aload 6
    //   465: aload 4
    //   467: aconst_null
    //   468: invokestatic 369	android/graphics/drawable/Drawable:createFromResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/drawable/Drawable;
    //   471: astore 5
    //   473: aload 6
    //   475: invokevirtual 370	java/io/InputStream:close	()V
    //   478: goto -122 -> 356
    //   481: astore_0
    //   482: new 297	android/content/res/Resources$NotFoundException
    //   485: dup
    //   486: new 346	java/lang/StringBuilder
    //   489: dup
    //   490: ldc_w 348
    //   493: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   496: aload 4
    //   498: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: ldc_w 355
    //   504: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: iload_1
    //   508: invokestatic 358	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   511: invokevirtual 353	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: invokevirtual 359	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   517: invokespecial 310	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   520: astore 5
    //   522: aload 5
    //   524: aload_0
    //   525: invokevirtual 363	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: pop
    //   529: ldc 252
    //   531: invokestatic 156	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   534: aload 5
    //   536: athrow
    //   537: iconst_0
    //   538: istore_2
    //   539: goto -496 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   66	115	206	java/lang/NoSuchMethodException
    //   121	165	242	java/lang/NoSuchMethodException
    //   300	356	364	java/lang/Exception
    //   420	478	481	java/lang/Exception
  }

  public final DisplayMetrics getDisplayMetrics()
  {
    AppMethodBeat.i(105888);
    DisplayMetrics localDisplayMetrics = this.xuz.getDisplayMetrics();
    AppMethodBeat.o(105888);
    return localDisplayMetrics;
  }

  public final Drawable getDrawable(int paramInt)
  {
    AppMethodBeat.i(105903);
    Drawable localDrawable;
    if (paramInt != 0)
    {
      localDrawable = this.xux.f(this.mResources, paramInt);
      if (localDrawable != null)
        AppMethodBeat.o(105903);
    }
    while (true)
    {
      return localDrawable;
      localDrawable = d(super.getDrawable(paramInt), paramInt);
      AppMethodBeat.o(105903);
    }
  }

  @TargetApi(21)
  public final Drawable getDrawable(int paramInt, Resources.Theme paramTheme)
  {
    AppMethodBeat.i(105904);
    if (paramInt != 0)
    {
      Drawable localDrawable = this.xux.f(this.mResources, paramInt);
      if (localDrawable != null)
      {
        AppMethodBeat.o(105904);
        paramTheme = localDrawable;
      }
    }
    while (true)
    {
      return paramTheme;
      paramTheme = d(super.getDrawable(paramInt, paramTheme), paramInt);
      AppMethodBeat.o(105904);
    }
  }

  public final Drawable getDrawableForDensity(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105905);
    Drawable localDrawable;
    if (paramInt1 != 0)
    {
      localDrawable = this.xux.f(this.mResources, paramInt1);
      if (localDrawable != null)
        AppMethodBeat.o(105905);
    }
    while (true)
    {
      return localDrawable;
      localDrawable = d(super.getDrawableForDensity(paramInt1, paramInt2), paramInt1);
      AppMethodBeat.o(105905);
    }
  }

  @TargetApi(22)
  public final Drawable getDrawableForDensity(int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    AppMethodBeat.i(105906);
    if (paramInt1 != 0)
    {
      Drawable localDrawable = this.xux.f(this.mResources, paramInt1);
      if (localDrawable != null)
      {
        AppMethodBeat.o(105906);
        paramTheme = localDrawable;
      }
    }
    while (true)
    {
      return paramTheme;
      paramTheme = d(super.getDrawableForDensity(paramInt1, paramInt2, paramTheme), paramInt1);
      AppMethodBeat.o(105906);
    }
  }

  public final String getQuantityString(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105897);
    if (this.xuy);
    while (true)
    {
      String str2;
      try
      {
        String str1 = this.mResources.getResourceEntryName(paramInt1);
        AppMethodBeat.o(105897);
        return str1;
      }
      catch (Exception localException)
      {
        str2 = "";
        AppMethodBeat.o(105897);
        continue;
      }
      if (dmT())
      {
        str2 = f.getQuantityString(paramInt1, paramInt2);
        if (str2 != null)
        {
          str2 = str2.toString();
          AppMethodBeat.o(105897);
        }
      }
      else
      {
        str2 = this.mResources.getQuantityString(paramInt1, paramInt2);
        AppMethodBeat.o(105897);
      }
    }
  }

  public final String getQuantityString(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105898);
    if (this.xuy);
    while (true)
    {
      try
      {
        paramArrayOfObject = this.mResources.getResourceEntryName(paramInt1);
        AppMethodBeat.o(105898);
        return paramArrayOfObject;
      }
      catch (Exception paramArrayOfObject)
      {
        paramArrayOfObject = "";
        AppMethodBeat.o(105898);
        continue;
      }
      if (dmT())
      {
        String str = f.getQuantityString(paramInt1, paramInt2, paramArrayOfObject);
        if (str != null)
        {
          paramArrayOfObject = str.toString();
          AppMethodBeat.o(105898);
        }
      }
      else
      {
        paramArrayOfObject = this.mResources.getQuantityString(paramInt1, paramInt2, paramArrayOfObject);
        AppMethodBeat.o(105898);
      }
    }
  }

  public final CharSequence getQuantityText(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105899);
    if (this.xuy);
    while (true)
    {
      String str2;
      try
      {
        String str1 = this.mResources.getResourceEntryName(paramInt1);
        AppMethodBeat.o(105899);
        return str1;
      }
      catch (Exception localException)
      {
        str2 = "";
        AppMethodBeat.o(105899);
        continue;
      }
      if (dmT())
      {
        str2 = f.getQuantityString(paramInt1, paramInt2);
        if (str2 != null)
        {
          str2 = str2.toString();
          AppMethodBeat.o(105899);
        }
      }
      else
      {
        str2 = this.mResources.getQuantityString(paramInt1, paramInt2);
        AppMethodBeat.o(105899);
      }
    }
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(105896);
    if (this.xuy);
    while (true)
    {
      Object localObject;
      try
      {
        String str1 = this.mResources.getResourceEntryName(paramInt);
        AppMethodBeat.o(105896);
        return str1;
      }
      catch (Exception localException1)
      {
        localObject = "";
        AppMethodBeat.o(105896);
        continue;
      }
      if (dmT())
      {
        localObject = f.getString(paramInt);
        if (localObject != null)
        {
          localObject = f.d(paramInt, ((CharSequence)localObject).toString()).toString();
          AppMethodBeat.o(105896);
        }
      }
      else
      {
        try
        {
          localObject = f.d(paramInt, this.mResources.getString(paramInt));
          if (localObject != null)
          {
            localObject = ((CharSequence)localObject).toString();
            AppMethodBeat.o(105896);
          }
          else
          {
            localObject = this.mResources.getString(paramInt);
            AppMethodBeat.o(105896);
          }
        }
        catch (Exception localException2)
        {
          String str2 = "";
          AppMethodBeat.o(105896);
        }
      }
    }
  }

  public final String[] getStringArray(int paramInt)
  {
    AppMethodBeat.i(105900);
    String[] arrayOfString;
    if (dmT())
    {
      arrayOfString = f.getStringArray(paramInt);
      if (arrayOfString != null)
        AppMethodBeat.o(105900);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = super.getStringArray(paramInt);
      AppMethodBeat.o(105900);
    }
  }

  public final CharSequence getText(int paramInt)
  {
    AppMethodBeat.i(105894);
    if (this.xuy);
    while (true)
    {
      Object localObject;
      try
      {
        String str = this.mResources.getResourceEntryName(paramInt);
        AppMethodBeat.o(105894);
        return str;
      }
      catch (Exception localException)
      {
        localObject = "";
        AppMethodBeat.o(105894);
        continue;
      }
      if (dmT())
      {
        localObject = f.d(paramInt, f.getString(paramInt));
        if (localObject != null)
          AppMethodBeat.o(105894);
      }
      else
      {
        localObject = f.d(paramInt, this.mResources.getString(paramInt));
        if (localObject != null)
        {
          localObject = ((CharSequence)localObject).toString();
          AppMethodBeat.o(105894);
        }
        else
        {
          localObject = this.mResources.getString(paramInt);
          AppMethodBeat.o(105894);
        }
      }
    }
  }

  public final CharSequence getText(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105895);
    if (this.xuy);
    while (true)
    {
      try
      {
        paramCharSequence = this.mResources.getResourceEntryName(paramInt);
        AppMethodBeat.o(105895);
        return paramCharSequence;
      }
      catch (Exception paramCharSequence)
      {
        paramCharSequence = "";
        AppMethodBeat.o(105895);
        continue;
      }
      if (dmT())
      {
        paramCharSequence = f.d(paramInt, f.getString(paramInt));
        if (paramCharSequence != null)
          AppMethodBeat.o(105895);
      }
      else
      {
        paramCharSequence = f.d(paramInt, this.mResources.getString(paramInt));
        if (paramCharSequence != null)
        {
          paramCharSequence = paramCharSequence.toString();
          AppMethodBeat.o(105895);
        }
        else
        {
          paramCharSequence = this.mResources.getString(paramInt);
          AppMethodBeat.o(105895);
        }
      }
    }
  }

  public final CharSequence[] getTextArray(int paramInt)
  {
    AppMethodBeat.i(105901);
    Object localObject = getStringArray(paramInt);
    if (localObject != null)
      AppMethodBeat.o(105901);
    while (true)
    {
      return localObject;
      localObject = super.getTextArray(paramInt);
      AppMethodBeat.o(105901);
    }
  }

  public final TypedArray obtainTypedArray(int paramInt)
  {
    AppMethodBeat.i(105902);
    TypedArray localTypedArray = this.mResources.obtainTypedArray(paramInt);
    AppMethodBeat.o(105902);
    return localTypedArray;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(105889);
    ab.i("MicroMsg.MMResources", "locale %s, orientation %s", new Object[] { paramConfiguration.locale, Integer.valueOf(paramConfiguration.orientation) });
    a locala = this.xuz;
    DisplayMetrics localDisplayMetrics = this.mResources.getDisplayMetrics();
    if (locala.dmR())
    {
      localDisplayMetrics.density = locala.aDu.density;
      localDisplayMetrics.densityDpi = locala.aDu.densityDpi;
      localDisplayMetrics.scaledDensity = locala.aDu.scaledDensity;
      locala.aDu.setTo(localDisplayMetrics);
    }
    super.updateConfiguration(this.xuz.b(paramConfiguration), getDisplayMetrics());
    AppMethodBeat.o(105889);
  }

  public final void updateConfiguration(Configuration paramConfiguration, DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(105890);
    super.updateConfiguration(paramConfiguration, paramDisplayMetrics);
    if (this.mResources != null)
      this.mResources.updateConfiguration(paramConfiguration, paramDisplayMetrics);
    if (this.xuz != null)
    {
      a locala = this.xuz;
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = as.amF(ah.doA()).getInt(a.xus, 0);
      int j = localDisplayMetrics.densityDpi;
      if (i == 0)
        as.amF(ah.doA()).putInt(a.xus, j);
      if ((i != 0) && (i != j))
      {
        ab.i("MicroMsg.MMDensityManager", "checkDensity density change, mDensityDpi:%s, mCurrentDensityDpi:%s, mIcheckDensitylistener:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), a.xuv });
        as.amF(ah.doA()).putInt(a.xus, j);
        if (a.xuv != null)
          a.xuv.Bj();
      }
      if (!as.amF(ah.doA()).getBoolean(a.xut, false))
      {
        localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        j = localDisplayMetrics.widthPixels;
        int k = localDisplayMetrics.heightPixels;
        float f1 = localDisplayMetrics.density;
        float f2 = locala.getDisplayMetrics().density;
        i = (int)(Math.min(j, k) / f1);
        h.pYm.e(17089, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Float.toString(f1), Float.toString(f2), Integer.valueOf(i) });
        as.amF(ah.doA()).putBoolean(a.xut, true);
      }
      if (locala.dmR())
      {
        locala.dmQ();
        localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        ab.i("MicroMsg.MMDensityManager", " \n************************************************************************* \nTarget -> %s \nCurrent -> %s \nWindowManager -> %s \nConfiguration -> %s fontScale -> %s", new Object[] { a.e(locala.aDu), a.e(paramDisplayMetrics), a.e(localDisplayMetrics), Integer.valueOf(paramConfiguration.densityDpi), Float.valueOf(paramConfiguration.fontScale) });
      }
    }
    AppMethodBeat.o(105890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.b
 * JD-Core Version:    0.6.2
 */