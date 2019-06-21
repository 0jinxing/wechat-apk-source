package com.b.a.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class t
{
  private static final a bGA;
  private static Context bGv;
  private static WeakReference<t.b> bGw;
  private static WeakReference<t.d> bGx;
  private static WeakReference<t.c> bGy;
  private static WeakReference<t.e> bGz;
  private static String imei;
  private static boolean isRunning;

  static
  {
    AppMethodBeat.i(55578);
    isRunning = false;
    bGA = new a((byte)0);
    AppMethodBeat.o(55578);
  }

  public static void a(Context paramContext, q paramq)
  {
    AppMethodBeat.i(55579);
    bGv = paramContext.getApplicationContext();
    try
    {
      w.wC().a(paramContext, new m[] { bGA });
      r.wg().bFP = paramq;
      r.wg().bFQ = imei;
      AppMethodBeat.o(55579);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(55579);
    }
  }

  // ERROR //
  public static boolean a(android.os.Handler paramHandler, long paramLong, t.b paramb, t.d paramd)
  {
    // Byte code:
    //   0: ldc 95
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 65	com/b/a/a/t:bGv	Landroid/content/Context;
    //   8: ifnonnull +14 -> 22
    //   11: ldc 95
    //   13: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: iconst_0
    //   17: istore 5
    //   19: iload 5
    //   21: ireturn
    //   22: getstatic 43	com/b/a/a/t:isRunning	Z
    //   25: ifeq +14 -> 39
    //   28: ldc 95
    //   30: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: iconst_1
    //   34: istore 5
    //   36: goto -17 -> 19
    //   39: new 97	java/lang/ref/WeakReference
    //   42: dup
    //   43: aload_3
    //   44: invokespecial 100	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   47: putstatic 102	com/b/a/a/t:bGw	Ljava/lang/ref/WeakReference;
    //   50: new 97	java/lang/ref/WeakReference
    //   53: dup
    //   54: aload 4
    //   56: invokespecial 100	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   59: putstatic 104	com/b/a/a/t:bGx	Ljava/lang/ref/WeakReference;
    //   62: new 97	java/lang/ref/WeakReference
    //   65: dup
    //   66: aconst_null
    //   67: invokespecial 100	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   70: putstatic 106	com/b/a/a/t:bGy	Ljava/lang/ref/WeakReference;
    //   73: invokestatic 71	com/b/a/a/w:wC	()Lcom/b/a/a/w;
    //   76: astore_3
    //   77: aload_0
    //   78: ifnull +205 -> 283
    //   81: new 108	com/b/a/a/n$c
    //   84: astore 4
    //   86: aload 4
    //   88: lload_1
    //   89: ldc2_w 109
    //   92: invokespecial 113	com/b/a/a/n$c:<init>	(JJ)V
    //   95: aload_3
    //   96: aload_0
    //   97: aload 4
    //   99: invokevirtual 116	com/b/a/a/w:a	(Landroid/os/Handler;Lcom/b/a/a/d$a;)V
    //   102: getstatic 121	com/b/a/a/y:bIM	Z
    //   105: ifeq +113 -> 218
    //   108: invokestatic 127	com/b/a/a/o:wf	()Ljava/lang/String;
    //   111: putstatic 130	com/b/a/a/y:bIT	Ljava/lang/String;
    //   114: new 132	java/lang/StringBuilder
    //   117: astore_0
    //   118: aload_0
    //   119: ldc 134
    //   121: invokespecial 137	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_0
    //   125: getstatic 130	com/b/a/a/y:bIT	Ljava/lang/String;
    //   128: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: ldc 146
    //   136: invokestatic 150	com/b/a/a/o:s	(Ljava/lang/String;Ljava/lang/String;)Z
    //   139: pop
    //   140: new 132	java/lang/StringBuilder
    //   143: astore_0
    //   144: aload_0
    //   145: ldc 152
    //   147: invokespecial 137	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_0
    //   151: getstatic 130	com/b/a/a/y:bIT	Ljava/lang/String;
    //   154: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: ldc 154
    //   162: invokestatic 150	com/b/a/a/o:s	(Ljava/lang/String;Ljava/lang/String;)Z
    //   165: pop
    //   166: new 132	java/lang/StringBuilder
    //   169: astore_0
    //   170: aload_0
    //   171: ldc 156
    //   173: invokespecial 137	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   176: aload_0
    //   177: getstatic 130	com/b/a/a/y:bIT	Ljava/lang/String;
    //   180: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: ldc 158
    //   188: invokestatic 150	com/b/a/a/o:s	(Ljava/lang/String;Ljava/lang/String;)Z
    //   191: pop
    //   192: new 132	java/lang/StringBuilder
    //   195: astore_0
    //   196: aload_0
    //   197: ldc 160
    //   199: invokespecial 137	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload_0
    //   203: getstatic 130	com/b/a/a/y:bIT	Ljava/lang/String;
    //   206: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: ldc 162
    //   214: invokestatic 150	com/b/a/a/o:s	(Ljava/lang/String;Ljava/lang/String;)Z
    //   217: pop
    //   218: getstatic 164	com/b/a/a/t:bGz	Ljava/lang/ref/WeakReference;
    //   221: ifnull +47 -> 268
    //   224: getstatic 164	com/b/a/a/t:bGz	Ljava/lang/ref/WeakReference;
    //   227: invokevirtual 168	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   230: checkcast 15	com/b/a/a/t$e
    //   233: ifnull +35 -> 268
    //   236: getstatic 65	com/b/a/a/t:bGv	Landroid/content/Context;
    //   239: ldc 170
    //   241: invokevirtual 174	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   244: checkcast 176	android/location/LocationManager
    //   247: astore_3
    //   248: aload_3
    //   249: ldc 178
    //   251: invokevirtual 182	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   254: istore 5
    //   256: iload 5
    //   258: ifne +10 -> 268
    //   261: aload_3
    //   262: ldc 184
    //   264: invokevirtual 182	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   267: pop
    //   268: iconst_1
    //   269: putstatic 43	com/b/a/a/t:isRunning	Z
    //   272: ldc 95
    //   274: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: iconst_1
    //   278: istore 5
    //   280: goto -261 -> 19
    //   283: new 186	android/os/Handler
    //   286: dup
    //   287: getstatic 65	com/b/a/a/t:bGv	Landroid/content/Context;
    //   290: invokevirtual 190	android/content/Context:getMainLooper	()Landroid/os/Looper;
    //   293: invokespecial 193	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   296: astore_0
    //   297: goto -216 -> 81
    //   300: astore_0
    //   301: iconst_0
    //   302: putstatic 43	com/b/a/a/t:isRunning	Z
    //   305: ldc 95
    //   307: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: iconst_0
    //   311: istore 5
    //   313: goto -294 -> 19
    //   316: astore_0
    //   317: iconst_0
    //   318: istore 5
    //   320: goto -64 -> 256
    //   323: astore_0
    //   324: goto -56 -> 268
    //
    // Exception table:
    //   from	to	target	type
    //   73	77	300	java/lang/Exception
    //   81	218	300	java/lang/Exception
    //   218	248	300	java/lang/Exception
    //   248	256	300	java/lang/Exception
    //   261	268	300	java/lang/Exception
    //   268	272	300	java/lang/Exception
    //   283	297	300	java/lang/Exception
    //   248	256	316	java/lang/SecurityException
    //   261	268	323	java/lang/SecurityException
  }

  public static void finish()
  {
    AppMethodBeat.i(55582);
    try
    {
      w.wC().vY();
      AppMethodBeat.o(55582);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(55582);
    }
  }

  public static void setImei(String paramString)
  {
    imei = paramString;
  }

  // ERROR //
  public static void wt()
  {
    // Byte code:
    //   0: ldc 201
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 71	com/b/a/a/w:wC	()Lcom/b/a/a/w;
    //   8: invokevirtual 204	com/b/a/a/w:stop	()V
    //   11: iconst_0
    //   12: putstatic 43	com/b/a/a/t:isRunning	Z
    //   15: ldc 201
    //   17: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: return
    //   21: astore_0
    //   22: iconst_0
    //   23: putstatic 43	com/b/a/a/t:isRunning	Z
    //   26: ldc 201
    //   28: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: goto -11 -> 20
    //   34: astore_0
    //   35: iconst_0
    //   36: putstatic 43	com/b/a/a/t:isRunning	Z
    //   39: ldc 201
    //   41: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_0
    //   45: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	21	java/lang/Exception
    //   5	11	34	finally
  }

  static final class a
    implements m
  {
    public final void a(p paramp)
    {
      AppMethodBeat.i(55577);
      switch (paramp.what)
      {
      default:
      case 9901:
      case 9902:
      case 8901:
      case 8902:
      }
      while (true)
      {
        AppMethodBeat.o(55577);
        Object localObject;
        while (true)
        {
          return;
          if (t.wu() == null)
            break;
          localObject = (t.b)t.wu().get();
          if (localObject == null)
            break;
          paramp = (n.a)paramp;
          ((t.b)localObject).onLocationUpdate(paramp.lat, paramp.lng, paramp.bFm, paramp.bFn, paramp.bFo);
          AppMethodBeat.o(55577);
          continue;
          if (t.wv() == null)
            break;
          localObject = (t.d)t.wv().get();
          if (localObject == null)
            break;
          paramp = (n.b)paramp;
          ((t.d)localObject).onMessage(paramp.code, paramp.message);
          AppMethodBeat.o(55577);
          continue;
          if (t.ww() == null)
            break;
          localObject = (t.c)t.ww().get();
          if (localObject == null)
            break;
          ((t.c)localObject).onRefAdded(((s.e)paramp).bGt);
          AppMethodBeat.o(55577);
        }
        if (t.ww() != null)
        {
          localObject = (t.c)t.ww().get();
          if (localObject != null)
            ((t.c)localObject).onTrackProcessed(((s.g)paramp).bGu);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.t
 * JD-Core Version:    0.6.2
 */