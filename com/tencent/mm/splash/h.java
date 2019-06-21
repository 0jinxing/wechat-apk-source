package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class h
{
  static d ceX;
  public static final ArrayList<i> xGC;
  public static final ArrayList<Message> xGD;
  static Application xGE;
  static String xGF;
  static e xGG;
  static b xGH;
  static f xGI;
  static Set<SplashActivity> xGJ;
  private static boolean xGK;
  private static volatile boolean xGL;
  private static boolean xGM;
  private static o xGN;
  private static boolean xGO;
  static c xGP;
  private static Class<? extends SplashActivity> xGQ;
  private static Class<? extends Activity> xGR;
  private static n xGS;
  private static HashSet<String> xGT;
  private static boolean xGU;

  @SuppressLint({"HandlerLeak"})
  private static Handler xGV;

  static
  {
    AppMethodBeat.i(114859);
    xGC = new ArrayList();
    xGD = new ArrayList();
    xGJ = new HashSet();
    xGK = false;
    xGL = false;
    xGM = false;
    xGO = false;
    xGS = new n();
    xGT = new HashSet();
    xGU = false;
    xGV = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(114833);
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage.what == 0)
        {
          h.BK();
          AppMethodBeat.o(114833);
        }
        while (true)
        {
          return;
          a.he(h.xGE);
          a.a(new a.a()
          {
            public final void cmC()
            {
              AppMethodBeat.i(114831);
              h.g("WxSplash.Splash", "dexopt service return failed. kill self.", new Object[0]);
              h.bZk();
              AppMethodBeat.o(114831);
            }

            public final void dqV()
            {
              AppMethodBeat.i(114830);
              h.BK();
              AppMethodBeat.o(114830);
            }

            public final void dqW()
            {
              AppMethodBeat.i(114832);
              h.g("WxSplash.Splash", "dexopt service return timeout. kill self.", new Object[0]);
              h.bZk();
              AppMethodBeat.o(114832);
            }
          });
          AppMethodBeat.o(114833);
        }
      }
    };
    AppMethodBeat.o(114859);
  }

  static void a(SplashActivity paramSplashActivity)
  {
    AppMethodBeat.i(114838);
    xGJ.add(paramSplashActivity);
    AppMethodBeat.o(114838);
  }

  public static void a(b paramb)
  {
    xGH = paramb;
  }

  public static void a(c paramc)
  {
    xGP = paramc;
  }

  public static void a(d paramd)
  {
    ceX = paramd;
  }

  public static void a(e parame)
  {
    xGG = parame;
  }

  public static void a(f paramf)
  {
    xGI = paramf;
  }

  public static void a(i parami)
  {
    AppMethodBeat.i(114851);
    if (!cV(parami.xHe))
    {
      parami.recreate();
      g("WxSplash.Splash", "do recreate for %s", new Object[] { parami.xHe });
      AppMethodBeat.o(114851);
    }
    while (true)
    {
      return;
      parami.finish();
      g("WxSplash.Splash", "eat activity, %s", new Object[] { parami.xHe });
      AppMethodBeat.o(114851);
    }
  }

  public static void a(o paramo)
  {
    xGN = paramo;
  }

  public static void a(Throwable paramThrowable, String paramString)
  {
    AppMethodBeat.i(114854);
    if (xGP != null)
      xGP.a(paramThrowable, paramString);
    AppMethodBeat.o(114854);
  }

  public static String an(Activity paramActivity)
  {
    if ((paramActivity instanceof i));
    for (paramActivity = ((i)paramActivity).xHe; ; paramActivity = "")
      return paramActivity;
  }

  public static void aoa(String paramString)
  {
    AppMethodBeat.i(114840);
    xGT.add(paramString);
    AppMethodBeat.o(114840);
  }

  public static void aob(String paramString)
  {
    xGF = paramString;
  }

  public static void ay(Class<? extends SplashActivity> paramClass)
  {
    xGQ = paramClass;
  }

  public static void az(Class<? extends Activity> paramClass)
  {
    xGR = paramClass;
  }

  static void b(SplashActivity paramSplashActivity)
  {
    AppMethodBeat.i(114839);
    xGJ.remove(paramSplashActivity);
    AppMethodBeat.o(114839);
  }

  public static void bZk()
  {
    AppMethodBeat.i(114844);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(114844);
  }

  private static Object cS(Context paramContext)
  {
    AppMethodBeat.i(114852);
    Object localObject = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
    ((Method)localObject).setAccessible(true);
    localObject = ((Method)localObject).invoke(null, new Object[0]);
    if (localObject != null)
    {
      AppMethodBeat.o(114852);
      paramContext = (Context)localObject;
    }
    while (true)
    {
      return paramContext;
      localObject = paramContext.getClass().getField("mLoadedApk");
      ((Field)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(paramContext);
      paramContext = localObject.getClass().getDeclaredField("mActivityThread");
      paramContext.setAccessible(true);
      paramContext = paramContext.get(localObject);
      AppMethodBeat.o(114852);
    }
  }

  private static boolean cV(String paramString)
  {
    AppMethodBeat.i(114850);
    boolean bool;
    if (ceX != null)
    {
      bool = ceX.cV(paramString);
      AppMethodBeat.o(114850);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114850);
    }
  }

  public static void dqY()
  {
    boolean bool = true;
    AppMethodBeat.i(114843);
    if (xGM);
    while (true)
    {
      try
      {
        Handler.Callback localCallback = (Handler.Callback)l.xHz.get(l.xHt);
        if (localCallback == l.xHy)
        {
          g("WxSplash.Splash", "double check, callback %s %s", new Object[] { Boolean.valueOf(bool), localCallback });
          localObject = l.xHy;
          if (localCallback == localObject)
            AppMethodBeat.o(114843);
        }
        else
        {
          bool = false;
          continue;
        }
        g("WxSplash.Splash", "double check found problem!", new Object[0]);
        Object localObject = l.xHz;
        l.xHy.oUK = localCallback;
        ((Field)localObject).setAccessible(true);
        ((Field)localObject).set(l.xHt, l.xHy);
        xGS.m(675L, 31L, 1L);
        l.xHt.sendEmptyMessage(987654321);
        AppMethodBeat.o(114843);
        continue;
      }
      catch (Exception localException)
      {
        a(localException, "double check exception.");
      }
      AppMethodBeat.o(114843);
    }
  }

  public static boolean dqZ()
  {
    return true;
  }

  public static boolean dra()
  {
    if (xGK);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean drb()
  {
    return xGL;
  }

  public static void drc()
  {
    AppMethodBeat.i(114845);
    if (!g.wY)
    {
      xGV.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(114835);
          com.tencent.mm.sdk.g.d.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(114834);
              boolean bool = a.hc(h.xGE);
              Handler localHandler = h.dri();
              if (bool);
              for (int i = 1; ; i = 0)
              {
                localHandler.sendEmptyMessage(i);
                AppMethodBeat.o(114834);
                return;
              }
            }
          }
          , "checking-need-dexopt");
          AppMethodBeat.o(114835);
        }
      }
      , 150L);
      AppMethodBeat.o(114845);
    }
    while (true)
    {
      return;
      xGV.sendEmptyMessage(0);
      AppMethodBeat.o(114845);
    }
  }

  private static void drd()
  {
    AppMethodBeat.i(114847);
    g("WxSplash.Splash", "Gonna replay %s pending message(s).", new Object[] { Integer.valueOf(xGD.size()) });
    Iterator localIterator = xGD.iterator();
    while (localIterator.hasNext())
      u((Message)localIterator.next());
    xGD.clear();
    AppMethodBeat.o(114847);
  }

  private static void dre()
  {
    AppMethodBeat.i(114848);
    g("WxSplash.Splash", "splash done, do finally things. ", new Object[0]);
    xGK = false;
    int i = xGJ.size();
    Iterator localIterator = xGJ.iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      localObject1 = (SplashActivity)localIterator.next();
      g("WxSplash.Splash", "iterate splash activity %s.", new Object[] { localObject1 });
      ((SplashActivity)localObject1).drl();
    }
    if (i == 0)
    {
      g("WxSplash.Splash", "no splash activity found, so we terminate hacked activities manually.", new Object[0]);
      localObject1 = xGC.iterator();
      while (((Iterator)localObject1).hasNext())
        a((i)((Iterator)localObject1).next());
    }
    g("WxSplash.Splash", "resend all %s pending message. ", new Object[] { Integer.valueOf(xGD.size()) });
    if (!xGL)
      drd();
    xGN = null;
    g("WxSplash.Splash", "we need splash no more.", new Object[0]);
    while (true)
    {
      long l;
      try
      {
        xGO = false;
        localObject1 = xGS;
        if (((n)localObject1).mStartTimestamp <= 0L)
          break label275;
        l = System.currentTimeMillis() - ((n)localObject1).mStartTimestamp;
        if (g.wY)
        {
          ((n)localObject1).m(676L, 1L, 1L);
          ((n)localObject1).m(676L, 3L, l);
          AppMethodBeat.o(114848);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(114848);
      }
      localObject2.m(676L, 0L, 1L);
      localObject2.m(676L, 2L, l);
      label275: AppMethodBeat.o(114848);
    }
  }

  // ERROR //
  private static void drf()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 457
    //   6: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 211	com/tencent/mm/splash/h:xGE	Landroid/app/Application;
    //   12: invokestatic 463	com/tencent/mm/splash/a:hd	(Landroid/content/Context;)V
    //   15: ldc 2
    //   17: monitorenter
    //   18: getstatic 94	com/tencent/mm/splash/h:xGO	Z
    //   21: ifeq +16 -> 37
    //   24: ldc 2
    //   26: monitorexit
    //   27: ldc_w 457
    //   30: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: ldc 2
    //   35: monitorexit
    //   36: return
    //   37: iconst_1
    //   38: putstatic 94	com/tencent/mm/splash/h:xGO	Z
    //   41: ldc 2
    //   43: monitorexit
    //   44: getstatic 92	com/tencent/mm/splash/h:xGM	Z
    //   47: ifne +51 -> 98
    //   50: ldc 128
    //   52: ldc_w 465
    //   55: iconst_0
    //   56: anewarray 4	java/lang/Object
    //   59: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: getstatic 193	com/tencent/mm/splash/h:xGN	Lcom/tencent/mm/splash/o;
    //   65: ifnonnull +257 -> 322
    //   68: invokestatic 204	com/tencent/mm/splash/h:dre	()V
    //   71: ldc_w 457
    //   74: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: goto -44 -> 33
    //   80: astore_0
    //   81: ldc 2
    //   83: monitorexit
    //   84: aload_0
    //   85: athrow
    //   86: astore_0
    //   87: ldc 2
    //   89: monitorexit
    //   90: ldc_w 457
    //   93: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: athrow
    //   98: getstatic 378	com/tencent/mm/splash/g:wY	Z
    //   101: ifeq +42 -> 143
    //   104: ldc 128
    //   106: ldc_w 467
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: goto -54 -> 62
    //   119: astore_0
    //   120: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   123: ldc2_w 354
    //   126: ldc2_w 468
    //   129: lconst_1
    //   130: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   133: aload_0
    //   134: ldc_w 471
    //   137: invokestatic 265	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   140: goto -78 -> 62
    //   143: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   146: ifnull -84 -> 62
    //   149: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   152: invokeinterface 478 1 0
    //   157: ifeq -95 -> 62
    //   160: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   163: ldc2_w 354
    //   166: ldc2_w 479
    //   169: lconst_1
    //   170: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   173: getstatic 221	com/tencent/mm/splash/l:cfv	Ljava/lang/Object;
    //   176: astore_1
    //   177: aload_1
    //   178: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   181: ldc_w 482
    //   184: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   187: astore_0
    //   188: aload_0
    //   189: iconst_1
    //   190: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   193: aload_0
    //   194: aload_1
    //   195: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   198: astore_2
    //   199: aload_2
    //   200: checkcast 484	android/app/Application
    //   203: putstatic 487	com/tencent/mm/splash/l:xHv	Landroid/app/Application;
    //   206: aload_2
    //   207: astore_0
    //   208: aload_2
    //   209: ifnonnull +19 -> 228
    //   212: ldc 128
    //   214: ldc_w 489
    //   217: iconst_0
    //   218: anewarray 4	java/lang/Object
    //   221: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: getstatic 211	com/tencent/mm/splash/h:xGE	Landroid/app/Application;
    //   227: astore_0
    //   228: ldc_w 491
    //   231: invokestatic 309	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   234: pop
    //   235: ldc_w 493
    //   238: invokestatic 309	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   241: pop
    //   242: ldc 128
    //   244: ldc_w 495
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: ldc 128
    //   256: ldc_w 497
    //   259: iconst_0
    //   260: anewarray 4	java/lang/Object
    //   263: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: getstatic 501	com/tencent/mm/splash/l:xHx	Ljava/lang/reflect/Method;
    //   269: aload_1
    //   270: iconst_2
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: aload_0
    //   277: aastore
    //   278: dup
    //   279: iconst_1
    //   280: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   283: aastore
    //   284: invokevirtual 322	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   287: pop
    //   288: ldc 128
    //   290: ldc_w 503
    //   293: iconst_0
    //   294: anewarray 4	java/lang/Object
    //   297: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   303: invokeinterface 504 1 0
    //   308: goto -246 -> 62
    //   311: astore_2
    //   312: aload_2
    //   313: ldc_w 506
    //   316: invokestatic 265	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   319: goto -65 -> 254
    //   322: getstatic 193	com/tencent/mm/splash/h:xGN	Lcom/tencent/mm/splash/o;
    //   325: astore_0
    //   326: new 18	com/tencent/mm/splash/h$5
    //   329: astore_2
    //   330: aload_2
    //   331: invokespecial 507	com/tencent/mm/splash/h$5:<init>	()V
    //   334: aload_0
    //   335: aload_2
    //   336: invokeinterface 513 2 0
    //   341: ldc_w 457
    //   344: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: goto -314 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   3	18	80	finally
    //   27	33	80	finally
    //   44	62	80	finally
    //   62	77	80	finally
    //   90	98	80	finally
    //   98	116	80	finally
    //   120	140	80	finally
    //   143	206	80	finally
    //   212	228	80	finally
    //   228	254	80	finally
    //   254	308	80	finally
    //   312	319	80	finally
    //   322	347	80	finally
    //   18	27	86	finally
    //   37	44	86	finally
    //   87	90	86	finally
    //   44	62	119	java/lang/Exception
    //   98	116	119	java/lang/Exception
    //   143	206	119	java/lang/Exception
    //   212	228	119	java/lang/Exception
    //   228	254	119	java/lang/Exception
    //   254	308	119	java/lang/Exception
    //   312	319	119	java/lang/Exception
    //   228	254	311	java/lang/Throwable
  }

  public static Class<? extends Activity> drg()
  {
    return xGQ;
  }

  public static n drh()
  {
    return xGS;
  }

  public static void g(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(114853);
    if (xGP != null)
      xGP.g(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(114853);
  }

  public static void hh(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(114841);
    try
    {
      localObject1 = bo.gV(paramContext);
      if ((localObject1 != null) && (((ComponentName)localObject1).getPackageName().equals(paramContext.getPackageName())) && (xGF != null) && (((ComponentName)localObject1).getClassName().equals(xGF)))
        g("WxSplash.Splash", "it is LauncherUI", new Object[0]);
      while (i == 0)
      {
        g("WxSplash.Splash", "do nothing and return.", new Object[0]);
        AppMethodBeat.o(114841);
        return;
        if ((localObject1 == null) || (!((ComponentName)localObject1).getPackageName().startsWith("com.excelliance")))
          break label260;
        g("WxSplash.Splash", "it is dual open", new Object[0]);
      }
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        a(paramContext, "request fig leaf failed.");
        AppMethodBeat.o(114841);
        continue;
        xGS.m(675L, 36L, 1L);
        Object localObject1 = a.dqR();
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject1);
        if (!((File)localObject2).exists())
          ((File)localObject2).mkdirs();
        File localFile = new java/io/File;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localFile.<init>((String)localObject1 + "/main-process-blocking");
        if (localFile.exists())
          localFile.delete();
        if (localFile.createNewFile())
        {
          localObject1 = new android/content/Intent;
          ((Intent)localObject1).<init>(paramContext, xGR);
          ((Intent)localObject1).addFlags(268435456);
          paramContext.startActivity((Intent)localObject1);
        }
        AppMethodBeat.o(114841);
        continue;
        label260: i = 0;
      }
    }
  }

  // ERROR //
  public static boolean i(Application paramApplication)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 610
    //   6: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 92	com/tencent/mm/splash/h:xGM	Z
    //   12: ifeq +28 -> 40
    //   15: ldc 128
    //   17: ldc_w 612
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: iconst_1
    //   28: istore_1
    //   29: ldc_w 610
    //   32: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: ldc 2
    //   37: monitorexit
    //   38: iload_1
    //   39: ireturn
    //   40: invokestatic 448	java/lang/System:currentTimeMillis	()J
    //   43: lstore_2
    //   44: aload_0
    //   45: putstatic 211	com/tencent/mm/splash/h:xGE	Landroid/app/Application;
    //   48: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   51: ldc2_w 354
    //   54: ldc2_w 613
    //   57: lconst_1
    //   58: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   61: ldc_w 616
    //   64: invokestatic 309	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   67: astore 4
    //   69: aload 4
    //   71: ldc_w 618
    //   74: iconst_0
    //   75: anewarray 231	java/lang/Class
    //   78: invokevirtual 621	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   81: astore 5
    //   83: aload 5
    //   85: iconst_1
    //   86: invokevirtual 318	java/lang/reflect/Method:setAccessible	(Z)V
    //   89: aload 5
    //   91: aload 4
    //   93: iconst_0
    //   94: anewarray 4	java/lang/Object
    //   97: invokevirtual 322	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   100: astore 4
    //   102: aload 4
    //   104: ifnull +108 -> 212
    //   107: ldc 128
    //   109: ldc_w 623
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload 4
    //   120: aastore
    //   121: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload 4
    //   126: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   129: invokevirtual 626	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   132: ldc_w 628
    //   135: invokevirtual 557	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   138: ifeq +28 -> 166
    //   141: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   144: ldc2_w 354
    //   147: ldc2_w 629
    //   150: lconst_1
    //   151: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   154: ldc 128
    //   156: ldc_w 632
    //   159: iconst_0
    //   160: anewarray 4	java/lang/Object
    //   163: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: aload 4
    //   168: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   171: invokestatic 638	java/lang/reflect/Proxy:isProxyClass	(Ljava/lang/Class;)Z
    //   174: ifeq +38 -> 212
    //   177: new 578	java/lang/StringBuilder
    //   180: astore 5
    //   182: aload 5
    //   184: ldc_w 640
    //   187: invokespecial 641	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: ldc 128
    //   192: aload 5
    //   194: aload 4
    //   196: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   199: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   202: invokevirtual 588	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: iconst_0
    //   206: anewarray 4	java/lang/Object
    //   209: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: aload_0
    //   213: invokestatic 215	com/tencent/mm/splash/h:cS	(Landroid/content/Context;)Ljava/lang/Object;
    //   216: astore 4
    //   218: aload 4
    //   220: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   223: ldc_w 646
    //   226: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   229: astore 6
    //   231: aload 6
    //   233: iconst_1
    //   234: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   237: aload 6
    //   239: aload 4
    //   241: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   244: checkcast 648	android/app/Instrumentation
    //   247: astore 5
    //   249: ldc 4
    //   251: aload 5
    //   253: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   256: invokevirtual 651	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   259: if_acmpeq +104 -> 363
    //   262: aload 5
    //   264: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   267: invokevirtual 626	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   270: astore 7
    //   272: aload 7
    //   274: ldc_w 653
    //   277: invokevirtual 557	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   280: ifne +14 -> 294
    //   283: aload 7
    //   285: ldc_w 655
    //   288: invokevirtual 557	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   291: ifeq +72 -> 363
    //   294: ldc 128
    //   296: ldc_w 657
    //   299: iconst_0
    //   300: anewarray 4	java/lang/Object
    //   303: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: iconst_1
    //   307: istore 8
    //   309: iload 8
    //   311: ifeq +58 -> 369
    //   314: iconst_0
    //   315: istore_1
    //   316: ldc_w 610
    //   319: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: goto -287 -> 35
    //   325: astore_0
    //   326: ldc 2
    //   328: monitorexit
    //   329: aload_0
    //   330: athrow
    //   331: astore 4
    //   333: aload 4
    //   335: ldc_w 659
    //   338: invokestatic 265	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   341: goto -129 -> 212
    //   344: astore_0
    //   345: aload_0
    //   346: ldc_w 661
    //   349: invokestatic 265	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   352: iconst_0
    //   353: istore_1
    //   354: ldc_w 610
    //   357: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: goto -325 -> 35
    //   363: iconst_0
    //   364: istore 8
    //   366: goto -57 -> 309
    //   369: aload 5
    //   371: ifnonnull +22 -> 393
    //   374: new 663	java/lang/NullPointerException
    //   377: astore_0
    //   378: aload_0
    //   379: ldc_w 665
    //   382: invokespecial 666	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   385: ldc_w 610
    //   388: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: aload_0
    //   392: athrow
    //   393: ldc 4
    //   395: aload 5
    //   397: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   400: invokevirtual 651	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   403: if_acmpeq +194 -> 597
    //   406: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   409: ldc2_w 354
    //   412: ldc2_w 667
    //   415: lconst_1
    //   416: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   419: ldc 128
    //   421: ldc_w 670
    //   424: iconst_2
    //   425: anewarray 4	java/lang/Object
    //   428: dup
    //   429: iconst_0
    //   430: aload 5
    //   432: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   435: aastore
    //   436: dup
    //   437: iconst_1
    //   438: aload 5
    //   440: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   443: invokevirtual 651	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   446: aastore
    //   447: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   450: aload 5
    //   452: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   455: invokevirtual 626	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   458: astore_0
    //   459: new 672	java/lang/RuntimeException
    //   462: astore 4
    //   464: new 578	java/lang/StringBuilder
    //   467: astore 6
    //   469: aload 6
    //   471: ldc_w 674
    //   474: invokespecial 641	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   477: aload 4
    //   479: aload 6
    //   481: aload 5
    //   483: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   486: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   489: invokevirtual 588	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   492: invokespecial 675	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   495: aload_0
    //   496: bipush 7
    //   498: anewarray 542	java/lang/String
    //   501: dup
    //   502: iconst_0
    //   503: ldc_w 554
    //   506: aastore
    //   507: dup
    //   508: iconst_1
    //   509: ldc_w 677
    //   512: aastore
    //   513: dup
    //   514: iconst_2
    //   515: ldc_w 679
    //   518: aastore
    //   519: dup
    //   520: iconst_3
    //   521: ldc_w 681
    //   524: aastore
    //   525: dup
    //   526: iconst_4
    //   527: ldc_w 683
    //   530: aastore
    //   531: dup
    //   532: iconst_5
    //   533: ldc_w 685
    //   536: aastore
    //   537: dup
    //   538: bipush 6
    //   540: ldc_w 687
    //   543: aastore
    //   544: iconst_0
    //   545: aaload
    //   546: invokevirtual 557	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   549: ifeq +28 -> 577
    //   552: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   555: ldc2_w 354
    //   558: ldc2_w 688
    //   561: lconst_1
    //   562: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   565: ldc 128
    //   567: ldc_w 691
    //   570: iconst_0
    //   571: anewarray 4	java/lang/Object
    //   574: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   577: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   580: ldc2_w 354
    //   583: lconst_0
    //   584: lconst_1
    //   585: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   588: ldc_w 610
    //   591: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   594: aload 4
    //   596: athrow
    //   597: aload 5
    //   599: instanceof 693
    //   602: ifne +83 -> 685
    //   605: new 693	com/tencent/mm/splash/k
    //   608: astore 7
    //   610: aload 7
    //   612: aload 5
    //   614: invokespecial 696	com/tencent/mm/splash/k:<init>	(Landroid/app/Instrumentation;)V
    //   617: aload 6
    //   619: aload 4
    //   621: aload 7
    //   623: invokevirtual 353	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   626: aload 4
    //   628: putstatic 221	com/tencent/mm/splash/l:cfv	Ljava/lang/Object;
    //   631: aload 4
    //   633: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   636: ldc 229
    //   638: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   641: astore 5
    //   643: aload 5
    //   645: iconst_1
    //   646: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   649: aload 5
    //   651: aload 4
    //   653: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   656: checkcast 247	android/os/Handler
    //   659: astore 5
    //   661: aload 5
    //   663: ifnonnull +37 -> 700
    //   666: new 672	java/lang/RuntimeException
    //   669: astore_0
    //   670: aload_0
    //   671: ldc_w 698
    //   674: invokespecial 675	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   677: ldc_w 610
    //   680: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   683: aload_0
    //   684: athrow
    //   685: ldc 128
    //   687: ldc_w 700
    //   690: iconst_0
    //   691: anewarray 4	java/lang/Object
    //   694: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   697: goto -71 -> 626
    //   700: aload 5
    //   702: putstatic 250	com/tencent/mm/splash/l:xHt	Landroid/os/Handler;
    //   705: ldc 247
    //   707: ldc 254
    //   709: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   712: astore 9
    //   714: aload 9
    //   716: iconst_1
    //   717: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   720: aload 9
    //   722: aload 5
    //   724: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   727: checkcast 256	android/os/Handler$Callback
    //   730: astore 7
    //   732: aload 9
    //   734: putstatic 339	com/tencent/mm/splash/l:xHz	Ljava/lang/reflect/Field;
    //   737: aload 7
    //   739: ifnull +33 -> 772
    //   742: ldc 128
    //   744: ldc_w 702
    //   747: iconst_1
    //   748: anewarray 4	java/lang/Object
    //   751: dup
    //   752: iconst_0
    //   753: aload 7
    //   755: aastore
    //   756: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   759: getstatic 99	com/tencent/mm/splash/h:xGS	Lcom/tencent/mm/splash/n;
    //   762: ldc2_w 354
    //   765: ldc2_w 703
    //   768: lconst_1
    //   769: invokevirtual 361	com/tencent/mm/splash/n:m	(JJJ)V
    //   772: aload 7
    //   774: ifnull +11 -> 785
    //   777: aload 7
    //   779: instanceof 345
    //   782: ifne +326 -> 1108
    //   785: new 345	com/tencent/mm/splash/j
    //   788: astore 6
    //   790: aload 6
    //   792: aload_0
    //   793: aload 7
    //   795: invokespecial 707	com/tencent/mm/splash/j:<init>	(Landroid/content/Context;Landroid/os/Handler$Callback;)V
    //   798: aload 9
    //   800: iconst_1
    //   801: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   804: aload 9
    //   806: aload 5
    //   808: aload 6
    //   810: invokevirtual 353	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   813: aload 6
    //   815: putstatic 260	com/tencent/mm/splash/l:xHy	Lcom/tencent/mm/splash/j;
    //   818: new 247	android/os/Handler
    //   821: astore_0
    //   822: aload_0
    //   823: invokespecial 708	android/os/Handler:<init>	()V
    //   826: new 6	com/tencent/mm/splash/h$1
    //   829: astore 5
    //   831: aload 5
    //   833: aload_0
    //   834: invokespecial 711	com/tencent/mm/splash/h$1:<init>	(Landroid/os/Handler;)V
    //   837: aload 5
    //   839: invokestatic 715	com/tencent/mm/splash/j:av	(Ljava/lang/Runnable;)V
    //   842: getstatic 250	com/tencent/mm/splash/l:xHt	Landroid/os/Handler;
    //   845: ldc_w 362
    //   848: invokevirtual 366	android/os/Handler:sendEmptyMessage	(I)Z
    //   851: pop
    //   852: new 8	com/tencent/mm/splash/h$2
    //   855: astore 5
    //   857: aload 5
    //   859: invokespecial 716	com/tencent/mm/splash/h$2:<init>	()V
    //   862: aload_0
    //   863: aload 5
    //   865: ldc2_w 717
    //   868: invokevirtual 385	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   871: pop
    //   872: getstatic 101	com/tencent/mm/splash/h:xGT	Ljava/util/HashSet;
    //   875: invokevirtual 719	java/util/HashSet:size	()I
    //   878: ifgt +9 -> 887
    //   881: getstatic 378	com/tencent/mm/splash/g:wY	Z
    //   884: ifne +239 -> 1123
    //   887: aload 4
    //   889: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   892: ldc_w 721
    //   895: iconst_2
    //   896: anewarray 231	java/lang/Class
    //   899: dup
    //   900: iconst_0
    //   901: ldc_w 539
    //   904: aastore
    //   905: dup
    //   906: iconst_1
    //   907: ldc_w 477
    //   910: aastore
    //   911: invokevirtual 621	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   914: astore_0
    //   915: aload_0
    //   916: iconst_1
    //   917: invokevirtual 318	java/lang/reflect/Method:setAccessible	(Z)V
    //   920: aload_0
    //   921: putstatic 501	com/tencent/mm/splash/l:xHx	Ljava/lang/reflect/Method;
    //   924: aload 4
    //   926: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   929: ldc_w 723
    //   932: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   935: astore_0
    //   936: aload_0
    //   937: iconst_1
    //   938: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   941: aload_0
    //   942: aload 4
    //   944: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   947: astore_0
    //   948: aload_0
    //   949: putstatic 726	com/tencent/mm/splash/l:xHu	Ljava/lang/Object;
    //   952: aload_0
    //   953: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   956: ldc_w 728
    //   959: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   962: astore 4
    //   964: aload 4
    //   966: iconst_1
    //   967: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   970: getstatic 378	com/tencent/mm/splash/g:wY	Z
    //   973: ifne +12 -> 985
    //   976: aload 4
    //   978: aload_0
    //   979: getstatic 732	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   982: invokevirtual 353	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   985: aload_0
    //   986: invokevirtual 227	java/lang/Object:getClass	()Ljava/lang/Class;
    //   989: ldc_w 734
    //   992: invokevirtual 235	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   995: astore 4
    //   997: aload 4
    //   999: iconst_1
    //   1000: invokevirtual 241	java/lang/reflect/Field:setAccessible	(Z)V
    //   1003: aload 4
    //   1005: aload_0
    //   1006: invokevirtual 245	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1009: checkcast 477	java/util/List
    //   1012: putstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   1015: getstatic 101	com/tencent/mm/splash/h:xGT	Ljava/util/HashSet;
    //   1018: invokevirtual 735	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1021: astore 4
    //   1023: aload 4
    //   1025: invokeinterface 405 1 0
    //   1030: ifeq +93 -> 1123
    //   1033: aload 4
    //   1035: invokeinterface 409 1 0
    //   1040: checkcast 542	java/lang/String
    //   1043: astore 6
    //   1045: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   1048: invokeinterface 736 1 0
    //   1053: astore 5
    //   1055: aload 5
    //   1057: invokeinterface 405 1 0
    //   1062: ifeq +115 -> 1177
    //   1065: aload 5
    //   1067: invokeinterface 409 1 0
    //   1072: checkcast 738	android/content/pm/ProviderInfo
    //   1075: astore_0
    //   1076: aload_0
    //   1077: getfield 741	android/content/pm/ProviderInfo:name	Ljava/lang/String;
    //   1080: ifnull -25 -> 1055
    //   1083: aload_0
    //   1084: getfield 741	android/content/pm/ProviderInfo:name	Ljava/lang/String;
    //   1087: aload 6
    //   1089: invokevirtual 545	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1092: ifeq -37 -> 1055
    //   1095: getstatic 475	com/tencent/mm/splash/l:xHw	Ljava/util/List;
    //   1098: aload_0
    //   1099: invokeinterface 742 2 0
    //   1104: pop
    //   1105: goto -82 -> 1023
    //   1108: ldc 128
    //   1110: ldc_w 744
    //   1113: iconst_0
    //   1114: anewarray 4	java/lang/Object
    //   1117: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1120: goto -302 -> 818
    //   1123: iconst_1
    //   1124: putstatic 92	com/tencent/mm/splash/h:xGM	Z
    //   1127: iconst_1
    //   1128: putstatic 88	com/tencent/mm/splash/h:xGK	Z
    //   1131: ldc 128
    //   1133: ldc_w 746
    //   1136: iconst_0
    //   1137: anewarray 4	java/lang/Object
    //   1140: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1143: ldc 128
    //   1145: ldc_w 748
    //   1148: iconst_1
    //   1149: anewarray 4	java/lang/Object
    //   1152: dup
    //   1153: iconst_0
    //   1154: invokestatic 448	java/lang/System:currentTimeMillis	()J
    //   1157: lload_2
    //   1158: lsub
    //   1159: invokestatic 753	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1162: aastore
    //   1163: invokestatic 140	com/tencent/mm/splash/h:g	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1166: iconst_1
    //   1167: istore_1
    //   1168: ldc_w 610
    //   1171: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1174: goto -1139 -> 35
    //   1177: aconst_null
    //   1178: astore_0
    //   1179: goto -84 -> 1095
    //
    // Exception table:
    //   from	to	target	type
    //   3	27	325	finally
    //   29	35	325	finally
    //   40	61	325	finally
    //   61	102	325	finally
    //   107	166	325	finally
    //   166	212	325	finally
    //   212	294	325	finally
    //   294	306	325	finally
    //   316	322	325	finally
    //   333	341	325	finally
    //   345	352	325	finally
    //   354	360	325	finally
    //   374	393	325	finally
    //   393	577	325	finally
    //   577	597	325	finally
    //   597	626	325	finally
    //   626	661	325	finally
    //   666	685	325	finally
    //   685	697	325	finally
    //   700	737	325	finally
    //   742	772	325	finally
    //   777	785	325	finally
    //   785	818	325	finally
    //   818	887	325	finally
    //   887	985	325	finally
    //   985	1023	325	finally
    //   1023	1055	325	finally
    //   1055	1095	325	finally
    //   1095	1105	325	finally
    //   1108	1120	325	finally
    //   1123	1166	325	finally
    //   1168	1174	325	finally
    //   61	102	331	java/lang/Exception
    //   107	166	331	java/lang/Exception
    //   166	212	331	java/lang/Exception
    //   212	294	344	java/lang/Exception
    //   294	306	344	java/lang/Exception
    //   333	341	344	java/lang/Exception
    //   374	393	344	java/lang/Exception
    //   393	577	344	java/lang/Exception
    //   577	597	344	java/lang/Exception
    //   597	626	344	java/lang/Exception
    //   626	661	344	java/lang/Exception
    //   666	685	344	java/lang/Exception
    //   685	697	344	java/lang/Exception
    //   700	737	344	java/lang/Exception
    //   742	772	344	java/lang/Exception
    //   777	785	344	java/lang/Exception
    //   785	818	344	java/lang/Exception
    //   818	887	344	java/lang/Exception
    //   887	985	344	java/lang/Exception
    //   985	1023	344	java/lang/Exception
    //   1023	1055	344	java/lang/Exception
    //   1055	1095	344	java/lang/Exception
    //   1095	1105	344	java/lang/Exception
    //   1108	1120	344	java/lang/Exception
  }

  public static void u(Message paramMessage)
  {
    AppMethodBeat.i(114846);
    l.xHt.sendMessage(paramMessage);
    AppMethodBeat.o(114846);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.h
 * JD-Core Version:    0.6.2
 */