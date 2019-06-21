package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.blink.b;
import com.tencent.mm.booter.c;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class e
  implements ServiceConnection
{
  private static boolean cea;
  private static Object lock;
  private ReentrantLock ceb;
  private boolean cec;
  private IBinder ced;
  private Runnable cee;

  static
  {
    AppMethodBeat.i(57676);
    cea = false;
    lock = new Object();
    AppMethodBeat.o(57676);
  }

  public e()
  {
    AppMethodBeat.i(57667);
    this.ceb = new ReentrantLock();
    this.cec = false;
    this.ced = null;
    this.cee = new e.6(this);
    AppMethodBeat.o(57667);
  }

  public static void Bc()
  {
    AppMethodBeat.i(57672);
    ab.e("MicroMsg.CoreServiceConnection", "killPushProcess() pid = %s, stack[%s]", new Object[] { Integer.valueOf(cS("com.tencent.mm:push")), bo.dpG() });
    Process.killProcess(cS("com.tencent.mm:push"));
    AppMethodBeat.o(57672);
  }

  public static int cS(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(57671);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processName == null");
      AppMethodBeat.o(57671);
    }
    while (true)
    {
      return i;
      localObject = ((ActivityManager)ah.getContext().getSystemService("activity")).getRunningAppProcesses();
      if (localObject != null)
        break;
      ab.i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processes == null");
      AppMethodBeat.o(57671);
    }
    Object localObject = ((List)localObject).iterator();
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    do
    {
      if (!((Iterator)localObject).hasNext())
        break;
      localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
    }
    while (!localRunningAppProcessInfo.processName.equals(paramString));
    for (i = localRunningAppProcessInfo.pid; ; i = -1)
    {
      AppMethodBeat.o(57671);
      break;
    }
  }

  // ERROR //
  public final void aU(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 601
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 603
    //   9: invokestatic 157	com/tencent/mm/blink/a:jD	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   16: invokevirtual 605	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   19: aload_0
    //   20: getfield 47	com/tencent/mm/app/e:ced	Landroid/os/IBinder;
    //   23: ifnull +100 -> 123
    //   26: aload_0
    //   27: getfield 47	com/tencent/mm/app/e:ced	Landroid/os/IBinder;
    //   30: invokeinterface 610 1 0
    //   35: ifeq +88 -> 123
    //   38: iconst_1
    //   39: istore_2
    //   40: ldc 58
    //   42: ldc_w 612
    //   45: iconst_2
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_0
    //   52: getfield 45	com/tencent/mm/app/e:cec	Z
    //   55: invokestatic 419	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: iload_2
    //   62: invokestatic 419	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   65: aastore
    //   66: invokestatic 460	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: getfield 45	com/tencent/mm/app/e:cec	Z
    //   73: ifne +7 -> 80
    //   76: iload_2
    //   77: ifeq +51 -> 128
    //   80: ldc 58
    //   82: ldc_w 614
    //   85: iconst_2
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: aload_0
    //   92: getfield 45	com/tencent/mm/app/e:cec	Z
    //   95: invokestatic 419	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   98: aastore
    //   99: dup
    //   100: iconst_1
    //   101: iload_2
    //   102: invokestatic 419	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   105: aastore
    //   106: invokestatic 421	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   113: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   116: ldc_w 601
    //   119: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: return
    //   123: iconst_0
    //   124: istore_2
    //   125: goto -85 -> 40
    //   128: aload_0
    //   129: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   132: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   135: invokestatic 622	com/tencent/mm/booter/c:Ij	()Z
    //   138: ifeq +186 -> 324
    //   141: new 624	android/content/Intent
    //   144: dup
    //   145: aload_1
    //   146: ldc_w 626
    //   149: invokespecial 629	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   152: astore_3
    //   153: ldc 58
    //   155: ldc_w 631
    //   158: invokestatic 556	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload_1
    //   162: aload_3
    //   163: aload_0
    //   164: iconst_1
    //   165: invokevirtual 635	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   168: ifne +65 -> 233
    //   171: ldc 58
    //   173: ldc_w 637
    //   176: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: ldc_w 601
    //   182: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -63 -> 122
    //   188: astore_1
    //   189: aload_0
    //   190: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   193: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   196: ldc_w 601
    //   199: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: aload_1
    //   203: athrow
    //   204: astore_1
    //   205: ldc 58
    //   207: ldc_w 639
    //   210: iconst_1
    //   211: anewarray 4	java/lang/Object
    //   214: dup
    //   215: iconst_0
    //   216: aload_1
    //   217: invokevirtual 642	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   220: aastore
    //   221: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: ldc_w 601
    //   227: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: goto -108 -> 122
    //   233: aload_0
    //   234: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   237: invokevirtual 605	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   240: aload_0
    //   241: iconst_1
    //   242: putfield 45	com/tencent/mm/app/e:cec	Z
    //   245: aload_0
    //   246: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   249: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   252: getstatic 33	com/tencent/mm/app/e:lock	Ljava/lang/Object;
    //   255: astore_1
    //   256: aload_1
    //   257: monitorenter
    //   258: getstatic 28	com/tencent/mm/app/e:cea	Z
    //   261: ifne +25 -> 286
    //   264: iconst_1
    //   265: putstatic 28	com/tencent/mm/app/e:cea	Z
    //   268: ldc 58
    //   270: ldc_w 644
    //   273: invokestatic 556	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   276: aload_0
    //   277: getfield 54	com/tencent/mm/app/e:cee	Ljava/lang/Runnable;
    //   280: ldc2_w 645
    //   283: invokestatic 652	com/tencent/mm/sdk/platformtools/al:n	(Ljava/lang/Runnable;J)V
    //   286: aload_1
    //   287: monitorexit
    //   288: ldc_w 601
    //   291: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: goto -172 -> 122
    //   297: astore_1
    //   298: aload_0
    //   299: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   302: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   305: ldc_w 601
    //   308: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload_1
    //   312: athrow
    //   313: astore_3
    //   314: aload_1
    //   315: monitorexit
    //   316: ldc_w 601
    //   319: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: aload_3
    //   323: athrow
    //   324: aload_1
    //   325: ldc_w 654
    //   328: iconst_0
    //   329: invokestatic 659	com/tencent/mm/booter/b:c	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   332: ifne +20 -> 352
    //   335: ldc 58
    //   337: ldc_w 661
    //   340: invokestatic 556	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   343: ldc_w 601
    //   346: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   349: goto -227 -> 122
    //   352: aload_0
    //   353: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   356: invokevirtual 605	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   359: aload_0
    //   360: iconst_1
    //   361: putfield 45	com/tencent/mm/app/e:cec	Z
    //   364: aload_0
    //   365: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   368: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   371: getstatic 33	com/tencent/mm/app/e:lock	Ljava/lang/Object;
    //   374: astore_3
    //   375: aload_3
    //   376: monitorenter
    //   377: getstatic 28	com/tencent/mm/app/e:cea	Z
    //   380: ifne +25 -> 405
    //   383: iconst_1
    //   384: putstatic 28	com/tencent/mm/app/e:cea	Z
    //   387: ldc 58
    //   389: ldc_w 644
    //   392: invokestatic 556	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   395: aload_0
    //   396: getfield 54	com/tencent/mm/app/e:cee	Ljava/lang/Runnable;
    //   399: ldc2_w 662
    //   402: invokestatic 652	com/tencent/mm/sdk/platformtools/al:n	(Ljava/lang/Runnable;J)V
    //   405: aload_3
    //   406: monitorexit
    //   407: new 624	android/content/Intent
    //   410: dup
    //   411: aload_1
    //   412: ldc_w 626
    //   415: invokespecial 629	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   418: astore_3
    //   419: ldc 58
    //   421: ldc_w 631
    //   424: invokestatic 556	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: aload_1
    //   428: aload_3
    //   429: aload_0
    //   430: iconst_1
    //   431: invokevirtual 635	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   434: ifne +47 -> 481
    //   437: ldc 58
    //   439: ldc_w 637
    //   442: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   445: ldc_w 601
    //   448: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   451: goto -329 -> 122
    //   454: astore_1
    //   455: aload_0
    //   456: getfield 43	com/tencent/mm/app/e:ceb	Ljava/util/concurrent/locks/ReentrantLock;
    //   459: invokevirtual 617	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   462: ldc_w 601
    //   465: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   468: aload_1
    //   469: athrow
    //   470: astore_1
    //   471: aload_3
    //   472: monitorexit
    //   473: ldc_w 601
    //   476: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   479: aload_1
    //   480: athrow
    //   481: ldc_w 601
    //   484: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   487: goto -365 -> 122
    //   490: astore_1
    //   491: ldc 58
    //   493: ldc_w 665
    //   496: iconst_1
    //   497: anewarray 4	java/lang/Object
    //   500: dup
    //   501: iconst_0
    //   502: aload_1
    //   503: invokevirtual 642	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   506: aastore
    //   507: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   510: ldc_w 601
    //   513: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   516: goto -394 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   12	38	188	finally
    //   40	76	188	finally
    //   80	109	188	finally
    //   161	179	204	java/lang/Exception
    //   233	245	297	finally
    //   258	286	313	finally
    //   286	288	313	finally
    //   314	316	313	finally
    //   352	364	454	finally
    //   377	405	470	finally
    //   405	407	470	finally
    //   471	473	470	finally
    //   427	445	490	java/lang/Exception
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(57668);
    ab.w("MicroMsg.CoreServiceConnection", "onServiceConnected ");
    cS("com.tencent.mm:push");
    if (c.Ij())
      if (paramIBinder == null)
      {
        ab.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == null");
        AppMethodBeat.o(57668);
      }
    while (true)
    {
      return;
      if (((h)g.RM().Rn()).SG())
      {
        synchronized (lock)
        {
          ab.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
          al.af(this.cee);
          cea = false;
        }
        try
        {
          this.ceb.lock();
          this.cec = false;
          if ((this.ced != null) && (bo.gW(this.ced.hashCode(), paramIBinder.hashCode())))
          {
            ab.w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == serviceBinder");
            this.ceb.unlock();
            AppMethodBeat.o(57668);
            continue;
            paramComponentName = finally;
            AppMethodBeat.o(57668);
            throw paramComponentName;
          }
          this.ced = paramIBinder;
          this.ceb.unlock();
          b.HQ().o(new e.1(this, paramComponentName, paramIBinder));
          AppMethodBeat.o(57668);
          continue;
        }
        finally
        {
          this.ceb.unlock();
          AppMethodBeat.o(57668);
        }
        synchronized (lock)
        {
          ab.i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
          al.af(this.cee);
          cea = false;
        }
      }
      else
      {
        try
        {
          this.ceb.lock();
          this.cec = false;
          this.ced = paramIBinder;
          this.ceb.unlock();
          b.HQ().o(new e.2(this, paramComponentName, paramIBinder));
          AppMethodBeat.o(57668);
          continue;
          paramComponentName = finally;
          AppMethodBeat.o(57668);
          throw paramComponentName;
        }
        finally
        {
          this.ceb.unlock();
        }
      }
    }
    throw paramComponentName;
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(57669);
    ab.w("MicroMsg.CoreServiceConnection", "onServiceDisconnected ");
    if (((h)g.RM().Rn()).SG());
    try
    {
      this.ceb.lock();
      this.cec = false;
      this.ced = null;
      this.ceb.unlock();
      b.HQ().o(new e.5(this, paramComponentName));
      AppMethodBeat.o(57669);
      return;
    }
    finally
    {
      this.ceb.unlock();
      AppMethodBeat.o(57669);
    }
    throw paramComponentName;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.e
 * JD-Core Version:    0.6.2
 */