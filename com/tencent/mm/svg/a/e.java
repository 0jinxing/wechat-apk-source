package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.svg.b.b;
import com.tencent.mm.svg.b.c.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class e
{
  private static Class<?> cff;
  protected static Application cfh;
  protected static Resources cfi;
  protected static String sPackageName;
  private static Method xuA;
  private static Method xuB;
  private static boolean ydf;
  private static volatile a ydg;
  private static LongSparseArray<Drawable.ConstantState>[] ydh;
  private static LongSparseArray<Drawable.ConstantState> ydi;
  private static c<Drawable.ConstantState> ydj;
  private static c<Drawable.ConstantState> ydk;
  protected static Class<d> ydl;
  private static volatile boolean ydm;
  private static Map<WeakReference<Resources>, Map<Long, Integer>> ydn;
  private static boolean ydo;
  private static ThreadLocal<Boolean> ydp;

  static
  {
    AppMethodBeat.i(70118);
    ydf = false;
    cff = null;
    ydm = false;
    ydn = new HashMap();
    ydo = false;
    ydp = new ThreadLocal();
    xuA = null;
    xuB = null;
    AppMethodBeat.o(70118);
  }

  public static void G(Class<?> paramClass)
  {
    cff = paramClass;
  }

  @TargetApi(16)
  private static void a(Application arg0, Resources paramResources, int paramInt, TypedValue paramTypedValue)
  {
    AppMethodBeat.i(70111);
    if (paramInt == 0)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "preloadDrawable Why this id is %d. TypedValue %s", new Object[] { Integer.valueOf(paramInt), paramTypedValue });
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", Log.getStackTraceString(new Throwable()), new Object[0]);
    }
    paramResources.getValue(paramInt, paramTypedValue, true);
    long l = paramTypedValue.assetCookie << 32 | paramTypedValue.data;
    paramResources = new b(paramInt, ???.getResources(), l);
    synchronized (ydi)
    {
      ydi.put(l, paramResources);
      AppMethodBeat.o(70111);
      return;
    }
  }

  // ERROR //
  public static void a(Application paramApplication, Resources paramResources, String paramString)
  {
    // Byte code:
    //   0: ldc 166
    //   2: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_2
    //   7: invokestatic 170	com/tencent/mm/svg/a/e:d	(Landroid/app/Application;Ljava/lang/String;)V
    //   10: getstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   13: ifeq +20 -> 33
    //   16: ldc 98
    //   18: ldc 172
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: ldc 166
    //   29: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: return
    //   33: new 174	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 175	java/lang/StringBuilder:<init>	()V
    //   40: getstatic 177	com/tencent/mm/svg/a/e:sPackageName	Ljava/lang/String;
    //   43: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc 183
    //   48: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore_3
    //   55: ldc 98
    //   57: ldc 189
    //   59: iconst_0
    //   60: anewarray 4	java/lang/Object
    //   63: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: aload_3
    //   67: invokestatic 195	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   70: astore_2
    //   71: invokestatic 201	java/lang/System:nanoTime	()J
    //   74: lstore 4
    //   76: aload_0
    //   77: putstatic 203	com/tencent/mm/svg/a/e:cfh	Landroid/app/Application;
    //   80: aload_2
    //   81: putstatic 205	com/tencent/mm/svg/a/e:ydl	Ljava/lang/Class;
    //   84: aload_1
    //   85: putstatic 207	com/tencent/mm/svg/a/e:cfi	Landroid/content/res/Resources;
    //   88: getstatic 205	com/tencent/mm/svg/a/e:ydl	Ljava/lang/Class;
    //   91: astore 6
    //   93: aload 6
    //   95: ifnonnull +48 -> 143
    //   98: iconst_1
    //   99: istore 7
    //   101: iconst_1
    //   102: istore 8
    //   104: ldc 98
    //   106: ldc 209
    //   108: iconst_1
    //   109: anewarray 4	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: invokestatic 201	java/lang/System:nanoTime	()J
    //   117: lload 4
    //   119: lsub
    //   120: ldc2_w 210
    //   123: ldiv
    //   124: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   127: aastore
    //   128: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: iconst_1
    //   132: putstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   135: ldc 166
    //   137: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: goto -108 -> 32
    //   143: aload_2
    //   144: invokevirtual 220	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   147: checkcast 222	com/tencent/mm/svg/a/d
    //   150: aload_0
    //   151: getstatic 207	com/tencent/mm/svg/a/e:cfi	Landroid/content/res/Resources;
    //   154: invokestatic 225	com/tencent/mm/svg/a/e:b	(Landroid/app/Application;Landroid/content/res/Resources;)Lcom/tencent/mm/svg/a/e$a;
    //   157: invokeinterface 229 2 0
    //   162: ldc 98
    //   164: ldc 231
    //   166: iconst_1
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload_0
    //   173: getstatic 207	com/tencent/mm/svg/a/e:cfi	Landroid/content/res/Resources;
    //   176: invokestatic 225	com/tencent/mm/svg/a/e:b	(Landroid/app/Application;Landroid/content/res/Resources;)Lcom/tencent/mm/svg/a/e$a;
    //   179: getfield 234	com/tencent/mm/svg/a/e$a:ycP	Ljava/util/Map;
    //   182: invokeinterface 240 1 0
    //   187: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: iconst_1
    //   195: putstatic 60	com/tencent/mm/svg/a/e:ydf	Z
    //   198: goto -100 -> 98
    //   201: astore_2
    //   202: iconst_0
    //   203: istore 8
    //   205: iload 8
    //   207: istore 7
    //   209: ldc 98
    //   211: ldc 242
    //   213: iconst_1
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: aload_3
    //   220: aastore
    //   221: invokestatic 112	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: iload 8
    //   226: ifne +189 -> 415
    //   229: ldc 98
    //   231: ldc 244
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: invokestatic 201	java/lang/System:nanoTime	()J
    //   243: lstore 4
    //   245: aload_0
    //   246: invokestatic 248	com/tencent/mm/svg/a/e:hm	(Landroid/content/Context;)V
    //   249: aload_0
    //   250: aload_1
    //   251: invokestatic 251	com/tencent/mm/svg/a/e:c	(Landroid/app/Application;Landroid/content/res/Resources;)V
    //   254: ldc 98
    //   256: ldc 253
    //   258: iconst_1
    //   259: anewarray 4	java/lang/Object
    //   262: dup
    //   263: iconst_0
    //   264: invokestatic 201	java/lang/System:nanoTime	()J
    //   267: lload 4
    //   269: lsub
    //   270: ldc2_w 210
    //   273: ldiv
    //   274: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   277: aastore
    //   278: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: ldc 166
    //   283: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: goto -254 -> 32
    //   289: astore_2
    //   290: ldc 98
    //   292: aload_2
    //   293: ldc 255
    //   295: iconst_0
    //   296: anewarray 4	java/lang/Object
    //   299: invokestatic 259	com/tencent/mm/svg/b/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: iconst_0
    //   303: putstatic 60	com/tencent/mm/svg/a/e:ydf	Z
    //   306: goto -208 -> 98
    //   309: astore_2
    //   310: iconst_0
    //   311: istore 8
    //   313: iload 8
    //   315: istore 7
    //   317: ldc 98
    //   319: aload_2
    //   320: ldc_w 261
    //   323: iconst_0
    //   324: anewarray 4	java/lang/Object
    //   327: invokestatic 259	com/tencent/mm/svg/b/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: iload 8
    //   332: istore 7
    //   334: ldc 98
    //   336: ldc_w 263
    //   339: iconst_1
    //   340: anewarray 4	java/lang/Object
    //   343: dup
    //   344: iconst_0
    //   345: aload_3
    //   346: aastore
    //   347: invokestatic 112	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: iload 8
    //   352: ifne +75 -> 427
    //   355: ldc 98
    //   357: ldc 244
    //   359: iconst_0
    //   360: anewarray 4	java/lang/Object
    //   363: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: invokestatic 201	java/lang/System:nanoTime	()J
    //   369: lstore 4
    //   371: aload_0
    //   372: invokestatic 248	com/tencent/mm/svg/a/e:hm	(Landroid/content/Context;)V
    //   375: aload_0
    //   376: aload_1
    //   377: invokestatic 251	com/tencent/mm/svg/a/e:c	(Landroid/app/Application;Landroid/content/res/Resources;)V
    //   380: ldc 98
    //   382: ldc 253
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: invokestatic 201	java/lang/System:nanoTime	()J
    //   393: lload 4
    //   395: lsub
    //   396: ldc2_w 210
    //   399: ldiv
    //   400: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   403: aastore
    //   404: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   407: ldc 166
    //   409: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   412: goto -380 -> 32
    //   415: iconst_1
    //   416: putstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   419: ldc 166
    //   421: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   424: goto -392 -> 32
    //   427: iconst_1
    //   428: putstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   431: ldc 166
    //   433: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   436: goto -404 -> 32
    //   439: astore_2
    //   440: iconst_0
    //   441: istore 8
    //   443: iload 8
    //   445: istore 7
    //   447: ldc 98
    //   449: ldc_w 265
    //   452: iconst_1
    //   453: anewarray 4	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: aload_3
    //   459: aastore
    //   460: invokestatic 112	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   463: iload 8
    //   465: istore 7
    //   467: ldc 98
    //   469: aload_2
    //   470: ldc_w 261
    //   473: iconst_0
    //   474: anewarray 4	java/lang/Object
    //   477: invokestatic 259	com/tencent/mm/svg/b/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   480: iload 8
    //   482: ifne +63 -> 545
    //   485: ldc 98
    //   487: ldc 244
    //   489: iconst_0
    //   490: anewarray 4	java/lang/Object
    //   493: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   496: invokestatic 201	java/lang/System:nanoTime	()J
    //   499: lstore 4
    //   501: aload_0
    //   502: invokestatic 248	com/tencent/mm/svg/a/e:hm	(Landroid/content/Context;)V
    //   505: aload_0
    //   506: aload_1
    //   507: invokestatic 251	com/tencent/mm/svg/a/e:c	(Landroid/app/Application;Landroid/content/res/Resources;)V
    //   510: ldc 98
    //   512: ldc 253
    //   514: iconst_1
    //   515: anewarray 4	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: invokestatic 201	java/lang/System:nanoTime	()J
    //   523: lload 4
    //   525: lsub
    //   526: ldc2_w 210
    //   529: ldiv
    //   530: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   533: aastore
    //   534: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   537: ldc 166
    //   539: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   542: goto -510 -> 32
    //   545: iconst_1
    //   546: putstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   549: ldc 166
    //   551: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   554: goto -522 -> 32
    //   557: astore_2
    //   558: iconst_0
    //   559: istore 7
    //   561: iload 7
    //   563: ifne +62 -> 625
    //   566: ldc 98
    //   568: ldc 244
    //   570: iconst_0
    //   571: anewarray 4	java/lang/Object
    //   574: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   577: invokestatic 201	java/lang/System:nanoTime	()J
    //   580: lstore 4
    //   582: aload_0
    //   583: invokestatic 248	com/tencent/mm/svg/a/e:hm	(Landroid/content/Context;)V
    //   586: aload_0
    //   587: aload_1
    //   588: invokestatic 251	com/tencent/mm/svg/a/e:c	(Landroid/app/Application;Landroid/content/res/Resources;)V
    //   591: ldc 98
    //   593: ldc 253
    //   595: iconst_1
    //   596: anewarray 4	java/lang/Object
    //   599: dup
    //   600: iconst_0
    //   601: invokestatic 201	java/lang/System:nanoTime	()J
    //   604: lload 4
    //   606: lsub
    //   607: ldc2_w 210
    //   610: ldiv
    //   611: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   614: aastore
    //   615: invokestatic 123	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   618: ldc 166
    //   620: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   623: aload_2
    //   624: athrow
    //   625: iconst_1
    //   626: putstatic 64	com/tencent/mm/svg/a/e:ydm	Z
    //   629: goto -11 -> 618
    //   632: astore_0
    //   633: goto -379 -> 254
    //   636: astore_0
    //   637: goto -257 -> 380
    //   640: astore_0
    //   641: goto -131 -> 510
    //   644: astore_0
    //   645: goto -54 -> 591
    //   648: astore_2
    //   649: goto -88 -> 561
    //   652: astore_2
    //   653: goto -92 -> 561
    //   656: astore_2
    //   657: iconst_1
    //   658: istore 8
    //   660: goto -217 -> 443
    //   663: astore_2
    //   664: iconst_1
    //   665: istore 8
    //   667: goto -354 -> 313
    //   670: astore_2
    //   671: goto -466 -> 205
    //
    // Exception table:
    //   from	to	target	type
    //   55	88	201	java/lang/ClassNotFoundException
    //   88	93	201	java/lang/ClassNotFoundException
    //   143	194	201	java/lang/ClassNotFoundException
    //   194	198	201	java/lang/ClassNotFoundException
    //   290	306	201	java/lang/ClassNotFoundException
    //   88	93	289	android/content/res/Resources$NotFoundException
    //   143	194	289	android/content/res/Resources$NotFoundException
    //   55	88	309	java/lang/InstantiationException
    //   88	93	309	java/lang/InstantiationException
    //   143	194	309	java/lang/InstantiationException
    //   194	198	309	java/lang/InstantiationException
    //   290	306	309	java/lang/InstantiationException
    //   55	88	439	java/lang/IllegalAccessException
    //   88	93	439	java/lang/IllegalAccessException
    //   143	194	439	java/lang/IllegalAccessException
    //   194	198	439	java/lang/IllegalAccessException
    //   290	306	439	java/lang/IllegalAccessException
    //   55	88	557	finally
    //   88	93	557	finally
    //   143	194	557	finally
    //   194	198	557	finally
    //   290	306	557	finally
    //   249	254	632	java/lang/ClassNotFoundException
    //   375	380	636	java/lang/ClassNotFoundException
    //   505	510	640	java/lang/ClassNotFoundException
    //   586	591	644	java/lang/ClassNotFoundException
    //   104	131	648	finally
    //   209	224	648	finally
    //   317	330	652	finally
    //   334	350	652	finally
    //   447	463	652	finally
    //   467	480	652	finally
    //   104	131	656	java/lang/IllegalAccessException
    //   104	131	663	java/lang/InstantiationException
    //   104	131	670	java/lang/ClassNotFoundException
  }

  @TargetApi(16)
  private static void a(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(70110);
    paramObject = new com.tencent.mm.svg.b.a(paramObject, "sPreloadedDrawables").get();
    int i;
    long l;
    if (paramObject != null)
      if ((paramObject instanceof LongSparseArray[]))
      {
        ydh = (LongSparseArray[])paramObject;
        com.tencent.mm.svg.b.c.d("MicroMsg.SVGResourceLoader", "sPreloadDrawable content: %s ", new Object[] { ydh[0] });
        for (i = 0; i < ydh[0].size(); i++)
        {
          l = ydh[0].keyAt(i);
          ydj.put(l, ydh[0].get(l));
        }
        for (i = 0; i < ydh[1].size(); i++)
        {
          l = ydh[1].keyAt(i);
          ydk.put(l, ydh[1].get(l));
        }
        ydh[0] = ydj;
        ydh[1] = ydk;
        AppMethodBeat.o(70110);
      }
    while (true)
    {
      return;
      if ((paramObject instanceof LongSparseArray))
      {
        paramContext = new com.tencent.mm.svg.b.a(paramContext.getResources(), "sPreloadedDrawables");
        paramObject = (LongSparseArray)paramContext.get();
        for (i = 0; i < paramObject.size(); i++)
        {
          l = paramObject.keyAt(i);
          ydj.put(l, paramObject.get(l));
        }
        paramObject = ydj;
        paramContext.prepare();
        if (paramContext.eum == null)
        {
          paramContext = new NoSuchFieldException();
          AppMethodBeat.o(70110);
          throw paramContext;
        }
        paramContext.eum.set(paramContext.obj, paramObject);
        if (paramContext.get() == null)
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "resourcePreloadDrawable is null!! OMG!!", new Object[0]);
        AppMethodBeat.o(70110);
      }
      else
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is others!! OMG!", new Object[0]);
        AppMethodBeat.o(70110);
        continue;
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is null!! OMG!!!", new Object[0]);
        AppMethodBeat.o(70110);
      }
    }
  }

  public static void a(Resources paramResources, Map<Long, Integer> paramMap)
  {
    AppMethodBeat.i(70104);
    com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "addFilterResources:".concat(String.valueOf(paramResources)), new Object[0]);
    Iterator localIterator = ydn.keySet().iterator();
    do
      if (!localIterator.hasNext())
        break;
    while (((WeakReference)localIterator.next()).get() != paramResources);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        ydn.put(new WeakReference(paramResources), paramMap);
      AppMethodBeat.o(70104);
      return;
    }
  }

  public static void a(c.a parama)
  {
    AppMethodBeat.i(70105);
    com.tencent.mm.svg.b.c.b(parama);
    AppMethodBeat.o(70105);
  }

  private static a b(Application paramApplication, Resources paramResources)
  {
    AppMethodBeat.i(70108);
    if (ydg == null);
    try
    {
      if (ydg == null)
      {
        a locala = new com/tencent/mm/svg/a/e$a;
        locala.<init>(a.dvD(), paramApplication, paramResources);
        ydg = locala;
      }
      paramApplication = ydg;
      AppMethodBeat.o(70108);
      return paramApplication;
    }
    finally
    {
      AppMethodBeat.o(70108);
    }
    throw paramApplication;
  }

  private static void c(Application paramApplication, Resources paramResources)
  {
    AppMethodBeat.i(70113);
    Object localObject = dvI();
    if (localObject == null)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "Raw class is null!", new Object[0]);
      AppMethodBeat.o(70113);
    }
    while (true)
    {
      return;
      localObject = ((Class)localObject).getDeclaredFields();
      a locala = b(paramApplication, paramResources);
      try
      {
        paramResources = new com/tencent/mm/svg/a/a;
        paramResources.<init>();
        for (int i = 0; i < localObject.length; i++)
        {
          int j = localObject[i].getInt(null);
          if (paramResources.g(paramApplication.getResources(), j))
            b(locala.ydq, locala.mResources, j, locala.ycK);
        }
      }
      catch (IllegalAccessException paramApplication)
      {
        ydf = false;
        AppMethodBeat.o(70113);
      }
      catch (IllegalArgumentException paramApplication)
      {
        ydf = false;
        AppMethodBeat.o(70113);
      }
      continue;
      ydf = true;
      AppMethodBeat.o(70113);
    }
  }

  public static Drawable d(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(70114);
    ydp.set(Boolean.TRUE);
    paramResources = paramResources.getDrawable(paramInt);
    ydp.set(Boolean.FALSE);
    AppMethodBeat.o(70114);
    return paramResources;
  }

  public static void d(Application paramApplication, String paramString)
  {
    AppMethodBeat.i(70106);
    if (ydo)
    {
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "svg initiated.", new Object[0]);
      AppMethodBeat.o(70106);
    }
    while (true)
    {
      return;
      sPackageName = paramString;
      a.cY(paramString);
      b.cY(paramString);
      cfh = paramApplication;
      hm(paramApplication);
      AppMethodBeat.o(70106);
    }
  }

  private static Class<?> dvI()
  {
    AppMethodBeat.i(70112);
    Object localObject;
    if (cff != null)
    {
      localObject = cff;
      AppMethodBeat.o(70112);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = Class.forName(sPackageName + ".R$raw");
        if (localObject != null)
          AppMethodBeat.o(70112);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Class localClass = b.dvL();
        if (localClass != null)
        {
          AppMethodBeat.o(70112);
        }
        else
        {
          localClass = null;
          AppMethodBeat.o(70112);
        }
      }
    }
  }

  // ERROR //
  public static Drawable e(Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc_w 462
    //   5: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 131	android/util/TypedValue
    //   11: dup
    //   12: invokespecial 463	android/util/TypedValue:<init>	()V
    //   15: astore_3
    //   16: aload_0
    //   17: iload_1
    //   18: aload_3
    //   19: iconst_1
    //   20: invokevirtual 129	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_3
    //   27: getfield 466	android/util/TypedValue:type	I
    //   30: bipush 28
    //   32: if_icmplt +516 -> 548
    //   35: aload_3
    //   36: getfield 466	android/util/TypedValue:type	I
    //   39: bipush 31
    //   41: if_icmpgt +507 -> 548
    //   44: iload_2
    //   45: ifeq +16 -> 61
    //   48: new 468	android/graphics/drawable/ColorDrawable
    //   51: dup
    //   52: aload_3
    //   53: getfield 138	android/util/TypedValue:data	I
    //   56: invokespecial 470	android/graphics/drawable/ColorDrawable:<init>	(I)V
    //   59: astore 4
    //   61: getstatic 80	com/tencent/mm/svg/a/e:xuA	Ljava/lang/reflect/Method;
    //   64: ifnonnull +52 -> 116
    //   67: ldc 125
    //   69: ldc_w 472
    //   72: iconst_4
    //   73: anewarray 191	java/lang/Class
    //   76: dup
    //   77: iconst_0
    //   78: ldc_w 332
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: getstatic 475	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   87: aastore
    //   88: dup
    //   89: iconst_2
    //   90: getstatic 475	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   93: aastore
    //   94: dup
    //   95: iconst_3
    //   96: ldc_w 332
    //   99: aastore
    //   100: invokevirtual 479	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   103: astore 5
    //   105: aload 5
    //   107: putstatic 80	com/tencent/mm/svg/a/e:xuA	Ljava/lang/reflect/Method;
    //   110: aload 5
    //   112: iconst_1
    //   113: invokevirtual 485	java/lang/reflect/Method:setAccessible	(Z)V
    //   116: getstatic 82	com/tencent/mm/svg/a/e:xuB	Ljava/lang/reflect/Method;
    //   119: ifnonnull +47 -> 166
    //   122: ldc_w 487
    //   125: ldc_w 489
    //   128: iconst_3
    //   129: anewarray 191	java/lang/Class
    //   132: dup
    //   133: iconst_0
    //   134: getstatic 475	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc_w 332
    //   143: aastore
    //   144: dup
    //   145: iconst_2
    //   146: getstatic 475	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   149: aastore
    //   150: invokevirtual 479	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   153: astore 5
    //   155: aload 5
    //   157: putstatic 82	com/tencent/mm/svg/a/e:xuB	Ljava/lang/reflect/Method;
    //   160: aload 5
    //   162: iconst_1
    //   163: invokevirtual 485	java/lang/reflect/Method:setAccessible	(Z)V
    //   166: aload 4
    //   168: astore 5
    //   170: aload 4
    //   172: ifnonnull +192 -> 364
    //   175: aload_3
    //   176: getfield 493	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   179: ifnonnull +107 -> 286
    //   182: new 165	android/content/res/Resources$NotFoundException
    //   185: dup
    //   186: ldc_w 495
    //   189: aload_3
    //   190: invokestatic 335	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   193: invokevirtual 339	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   196: invokespecial 497	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   199: astore_0
    //   200: ldc_w 462
    //   203: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_0
    //   207: athrow
    //   208: astore_0
    //   209: ldc 98
    //   211: aload_0
    //   212: ldc_w 261
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 500	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: ldc 98
    //   224: aload_0
    //   225: ldc_w 261
    //   228: iconst_0
    //   229: anewarray 4	java/lang/Object
    //   232: invokestatic 500	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aconst_null
    //   236: astore 5
    //   238: ldc_w 462
    //   241: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload 5
    //   246: areturn
    //   247: astore_0
    //   248: ldc 98
    //   250: aload_0
    //   251: ldc_w 261
    //   254: iconst_0
    //   255: anewarray 4	java/lang/Object
    //   258: invokestatic 500	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: ldc 98
    //   263: aload_0
    //   264: ldc_w 261
    //   267: iconst_0
    //   268: anewarray 4	java/lang/Object
    //   271: invokestatic 500	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: aconst_null
    //   275: astore 5
    //   277: ldc_w 462
    //   280: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: goto -39 -> 244
    //   286: aload_3
    //   287: getfield 493	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   290: invokeinterface 503 1 0
    //   295: astore 4
    //   297: aload 4
    //   299: ldc_w 505
    //   302: invokevirtual 509	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   305: ifeq +125 -> 430
    //   308: getstatic 80	com/tencent/mm/svg/a/e:xuA	Ljava/lang/reflect/Method;
    //   311: aload_0
    //   312: iconst_4
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload 4
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: iload_1
    //   324: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   327: aastore
    //   328: dup
    //   329: iconst_2
    //   330: aload_3
    //   331: getfield 135	android/util/TypedValue:assetCookie	I
    //   334: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   337: aastore
    //   338: dup
    //   339: iconst_3
    //   340: ldc_w 511
    //   343: aastore
    //   344: invokevirtual 515	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   347: checkcast 517	android/content/res/XmlResourceParser
    //   350: astore_3
    //   351: aload_0
    //   352: aload_3
    //   353: invokestatic 523	android/graphics/drawable/Drawable:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/graphics/drawable/Drawable;
    //   356: astore 5
    //   358: aload_3
    //   359: invokeinterface 526 1 0
    //   364: ldc_w 462
    //   367: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   370: goto -126 -> 244
    //   373: astore_0
    //   374: new 165	android/content/res/Resources$NotFoundException
    //   377: dup
    //   378: new 174	java/lang/StringBuilder
    //   381: dup
    //   382: ldc_w 528
    //   385: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   388: aload 4
    //   390: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: ldc_w 531
    //   396: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: iload_1
    //   400: invokestatic 535	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   403: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   409: invokespecial 497	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   412: astore 5
    //   414: aload 5
    //   416: aload_0
    //   417: invokevirtual 539	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   420: pop
    //   421: ldc_w 462
    //   424: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   427: aload 5
    //   429: athrow
    //   430: getstatic 82	com/tencent/mm/svg/a/e:xuB	Ljava/lang/reflect/Method;
    //   433: aload_0
    //   434: invokevirtual 543	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   437: iconst_3
    //   438: anewarray 4	java/lang/Object
    //   441: dup
    //   442: iconst_0
    //   443: aload_3
    //   444: getfield 135	android/util/TypedValue:assetCookie	I
    //   447: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   450: aastore
    //   451: dup
    //   452: iconst_1
    //   453: aload 4
    //   455: aastore
    //   456: dup
    //   457: iconst_2
    //   458: iconst_2
    //   459: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   462: aastore
    //   463: invokevirtual 515	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   466: checkcast 545	java/io/InputStream
    //   469: astore 6
    //   471: aload_0
    //   472: aload_3
    //   473: aload 6
    //   475: aload 4
    //   477: aconst_null
    //   478: invokestatic 549	android/graphics/drawable/Drawable:createFromResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/drawable/Drawable;
    //   481: astore 5
    //   483: aload 6
    //   485: invokevirtual 550	java/io/InputStream:close	()V
    //   488: goto -124 -> 364
    //   491: astore_0
    //   492: new 165	android/content/res/Resources$NotFoundException
    //   495: dup
    //   496: new 174	java/lang/StringBuilder
    //   499: dup
    //   500: ldc_w 528
    //   503: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   506: aload 4
    //   508: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: ldc_w 531
    //   514: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: iload_1
    //   518: invokestatic 535	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   521: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokespecial 497	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   530: astore 5
    //   532: aload 5
    //   534: aload_0
    //   535: invokevirtual 539	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: pop
    //   539: ldc_w 462
    //   542: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   545: aload 5
    //   547: athrow
    //   548: iconst_0
    //   549: istore_2
    //   550: goto -506 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   67	116	208	java/lang/NoSuchMethodException
    //   122	166	247	java/lang/NoSuchMethodException
    //   308	364	373	java/lang/Exception
    //   430	488	491	java/lang/Exception
  }

  @TargetApi(16)
  private static void hm(Context paramContext)
  {
    AppMethodBeat.i(70109);
    if (ydj == null);
    while (true)
    {
      try
      {
        Object localObject = new android/util/LongSparseArray;
        ((LongSparseArray)localObject).<init>();
        ydi = (LongSparseArray)localObject;
        localObject = new com/tencent/mm/svg/a/e$c;
        ((c)localObject).<init>();
        ydj = (c)localObject;
        ((c)localObject).ydi = ydi;
        localObject = new com/tencent/mm/svg/a/e$c;
        ((c)localObject).<init>();
        ydk = (c)localObject;
        ((c)localObject).ydi = ydi;
        if (Build.VERSION.SDK_INT >= 23)
        {
          localObject = new com/tencent/mm/svg/b/a;
          ((com.tencent.mm.svg.b.a)localObject).<init>(paramContext.getResources(), "mResourcesImpl");
          if (((com.tencent.mm.svg.b.a)localObject).Mg())
          {
            localObject = ((com.tencent.mm.svg.b.a)localObject).get();
            a(paramContext, localObject);
            com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "SVG this resources %s", new Object[] { paramContext.getResources() });
            AppMethodBeat.o(70109);
            return;
          }
          localObject = paramContext.getResources();
          continue;
        }
        localObject = paramContext.getResources();
        continue;
      }
      catch (NoSuchFieldException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : NoSuchFieldException.", new Object[0]);
        AppMethodBeat.o(70109);
        continue;
      }
      catch (IllegalAccessException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : IllegalAccessException.", new Object[0]);
        AppMethodBeat.o(70109);
        continue;
      }
      catch (IllegalArgumentException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : IllegalArgumentException.", new Object[0]);
      }
      AppMethodBeat.o(70109);
    }
  }

  public static final class a
  {
    Resources mResources;
    TypedValue ycK;
    Map<Integer, com.tencent.mm.svg.c> ycP;
    Application ydq;

    public a(Map<Integer, com.tencent.mm.svg.c> paramMap, Application paramApplication, Resources paramResources)
    {
      AppMethodBeat.i(70094);
      this.ycK = new TypedValue();
      this.ycP = paramMap;
      this.ydq = paramApplication;
      this.mResources = paramResources;
      AppMethodBeat.o(70094);
    }

    public final void a(Integer paramInteger, com.tencent.mm.svg.c paramc)
    {
      AppMethodBeat.i(70095);
      this.ycP.put(paramInteger, paramc);
      e.b(this.ydq, this.mResources, paramInteger.intValue(), this.ycK);
      AppMethodBeat.o(70095);
    }
  }

  protected static final class b extends Drawable.ConstantState
  {
    private Resources mResources;
    private int sLo;
    private long ydr;

    public b(int paramInt, Resources paramResources, long paramLong)
    {
      AppMethodBeat.i(70096);
      this.sLo = 0;
      this.ydr = 0L;
      if (paramInt == 0)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "SVGConstantState Why this id is %d. TypedValue %s", new Object[] { Integer.valueOf(paramInt) });
        com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", Log.getStackTraceString(new Throwable()), new Object[0]);
      }
      this.sLo = paramInt;
      this.mResources = paramResources;
      this.ydr = paramLong;
      AppMethodBeat.o(70096);
    }

    public final int getChangingConfigurations()
    {
      return 0;
    }

    public final Drawable newDrawable()
    {
      AppMethodBeat.i(70097);
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "newDrawable mResources %s %s", new Object[] { this.mResources, Integer.valueOf(this.sLo) });
      Drawable localDrawable = a.f(this.mResources, this.sLo);
      AppMethodBeat.o(70097);
      return localDrawable;
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      AppMethodBeat.i(70098);
      try
      {
        Object localObject = e.g(paramResources);
        if (localObject != null)
        {
          int i = ((Integer)((Map)localObject).get(Long.valueOf(this.ydr))).intValue();
          paramResources = e.e(paramResources, i);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("loadDrawableSkipCache id:");
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", Integer.toHexString(i) + ",drawable:" + paramResources, new Object[0]);
          AppMethodBeat.o(70098);
          return paramResources;
        }
      }
      catch (Exception paramResources)
      {
        while (true)
        {
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "newDrawable loadDrawableSkipCache error:" + paramResources.getMessage(), new Object[0]);
          paramResources = newDrawable();
          AppMethodBeat.o(70098);
        }
      }
    }

    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      AppMethodBeat.i(70099);
      paramResources = newDrawable(paramResources);
      AppMethodBeat.o(70099);
      return paramResources;
    }
  }

  @TargetApi(16)
  public static final class c<T> extends LongSparseArray<T>
  {
    public static boolean yds = false;
    LongSparseArray<T> ydi = null;

    public final void clear()
    {
      AppMethodBeat.i(70103);
      super.clear();
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! clear.", new Object[0]);
      AppMethodBeat.o(70103);
    }

    public final void delete(long paramLong)
    {
      AppMethodBeat.i(70101);
      super.delete(paramLong);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! delete key %s", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(70101);
    }

    public final T get(long paramLong, T paramT)
    {
      AppMethodBeat.i(70100);
      if ((e.dpO().get() == null) || (!((Boolean)e.dpO().get()).booleanValue()));
      while (true)
      {
        synchronized (this.ydi)
        {
          if (this.ydi.indexOfKey(paramLong) >= 0)
          {
            paramT = this.ydi.get(paramLong, paramT);
            AppMethodBeat.o(70100);
            return paramT;
          }
          paramT = super.get(paramLong, paramT);
          AppMethodBeat.o(70100);
        }
        com.tencent.mm.svg.b.c.d("MicroMsg.SVGLongSparseArray", "Skip svg this time for key %s", new Object[] { Long.valueOf(paramLong) });
      }
    }

    public final void remove(long paramLong)
    {
      AppMethodBeat.i(70102);
      super.remove(paramLong);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! remove key %s", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(70102);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.a.e
 * JD-Core Version:    0.6.2
 */