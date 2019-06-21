package com.tencent.mm.plugin.normsg.b;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b
{
  private static final ClassLoader oUb;
  private static final String oUc;
  private static final String oUd;
  private static final String oUe;
  private static final String oUf;
  private static final String oUg;
  private static final String oUh;
  private static final String oUi;
  private static final String oUj;
  private static final String oUk;
  private static final String oUl;
  private static final String oUm;
  private static final String oUn;
  private static final String oUo;
  private static final String oUp;
  private static final String oUq;
  private static final String oUr;
  private static final String oUs;
  private static final String oUt;
  private static final String oUu;
  private static final String oUv;
  private static final String oUw;
  private volatile boolean eMP;
  private final Handler oUA;
  private IInterface oUB;
  public final Queue<g> oUx;
  private final Map<Object, IBinder> oUy;
  private final Map<IBinder, Integer> oUz;

  static
  {
    AppMethodBeat.i(10431);
    oUb = b.class.getClassLoader();
    oUc = d.TQ("");
    oUd = d.TQ("\021p\036z\bg\016jD+Xv%@2D-N+f\007i\bo\nx");
    oUe = d.TQ("\007t7V5]8");
    oUf = d.TQ("\027v\005L\"V3A'F%@");
    oUg = d.TQ("\ng$E)E'F%N");
    oUh = d.TQ("\016c5\\9N\034s\034h!L<P");
    oUi = d.TQ("Ñ°ÞºÈ§Îªòþ§Æ¥Æ£Ð£Ê¨Á­Ä°Éç®ïïùãèíà©Ç³Ö¤Å¦Ò»Ôºùøóäâ");
    oUj = d.TQ("Ù¸Ü¸ùùïõþûö¿Ñ¥À²Ó°Ä­Â¬ïîåòô");
    oUk = d.TQ("éëÞ½Þ»È»Ò°ÙµÜ¨ÑöçôãåÈ§É½Ï Ì Å·");
    oUl = d.TQ("\032k\036{\tp<S0Q=t\032n\013y\037~\035x");
    oUm = d.TQ("?Y0^:l\005`\027U,m\016m\b{\ba\003j\006o\033b+O");
    oUn = d.TQ("+M$J.o\fo\ny\nc\001h\004m\031`.A%@\tg\001n,U\024w\024q\002q\030z\023\026b\033R6");
    oUo = d.TQ("");
    oUp = d.TQ("÷ðÕ¶Õ°Ã°Ù»Ò¾×£Úûú³Ý»Ô§åÊ£Æ±ø");
    oUq = d.TQ("±×¾Ð´õõãùò÷ú´Û¿ÚýôÅ¼èõ");
    oUr = d.TQ("\rk\002l\bN!B7D");
    oUs = d.TQ("\"D+H=N\035x\031k\b`");
    oUt = d.TQ("m\035x\nl\003q\034]>]8K8Q3Z6_+R\023p\004m\002l");
    oUu = d.TQ("Ì¿Ú®èïÊ©Ê¯Ü¯Æ¤Í¡È¼Åäå¬Â¤Ëüúâ");
    oUv = d.TQ("¬ßºÎáëªÉªÏ¼Ï¦Ä­Á¨Ü¥ëàÌ¢Ä«Øïéñ");
    oUw = d.TQ("îøÜ¹Ë­Â°Ýÿùùò÷êÒ±Å¬Ã­ÿéð");
    AppMethodBeat.o(10431);
  }

  private b()
  {
    AppMethodBeat.i(10423);
    this.oUx = new ConcurrentLinkedQueue();
    this.oUy = new WeakHashMap();
    this.oUz = new ConcurrentHashMap();
    this.oUA = new Handler(Looper.getMainLooper());
    this.oUB = null;
    this.eMP = false;
    AppMethodBeat.o(10423);
  }

  private void b(int paramInt, View paramView, List<AccessibilityNodeInfo> paramList)
  {
    AppMethodBeat.i(10419);
    Iterator localIterator = this.oUx.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).a(paramInt, paramView, paramList);
    AppMethodBeat.o(10419);
  }

  private boolean b(int paramInt1, int paramInt2, View paramView)
  {
    AppMethodBeat.i(10420);
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      bool = c(paramInt1, paramInt2, paramView);
      AppMethodBeat.o(10420);
    }
    while (true)
    {
      return bool;
      boolean[] arrayOfBoolean = new boolean[2];
      boolean[] tmp40_38 = arrayOfBoolean;
      tmp40_38[0] = 1;
      boolean[] tmp46_40 = tmp40_38;
      tmp46_40[1] = 0;
      tmp46_40;
      this.oUA.post(new b.2(this, arrayOfBoolean, paramInt1, paramInt2, paramView));
      label77: int i = arrayOfBoolean[1];
      if (i == 0);
      try
      {
        arrayOfBoolean.wait();
        break label77;
      }
      catch (InterruptedException paramView)
      {
        break label77;
        i = arrayOfBoolean[0];
        AppMethodBeat.o(10420);
      }
      finally
      {
        AppMethodBeat.o(10420);
      }
    }
    throw paramView;
  }

  public static b bWc()
  {
    return b.h.oUS;
  }

  private boolean c(int paramInt1, int paramInt2, View paramView)
  {
    AppMethodBeat.i(10421);
    Iterator localIterator = this.oUx.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (!((g)localIterator.next()).a(paramInt1, paramInt2, paramView))
      {
        bool = false;
        AppMethodBeat.o(10421);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(10421);
    }
  }

  private void k(Throwable paramThrowable)
  {
    AppMethodBeat.i(10422);
    Iterator localIterator = this.oUx.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).onError(paramThrowable);
    AppMethodBeat.o(10422);
  }

  public final void ensureInitialized()
  {
    try
    {
      AppMethodBeat.i(10418);
      if (!this.eMP)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("you must call initialize first.");
        AppMethodBeat.o(10418);
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    AppMethodBeat.o(10418);
  }

  // ERROR //
  public final void initialize(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 10417
    //   5: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 207	com/tencent/mm/plugin/normsg/b/b:eMP	Z
    //   12: ifeq +12 -> 24
    //   15: sipush 10417
    //   18: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: getstatic 363	android/os/Build$VERSION:SDK_INT	I
    //   27: bipush 15
    //   29: if_icmpge +45 -> 74
    //   32: new 17	com/tencent/mm/plugin/normsg/b/b$f
    //   35: astore_2
    //   36: new 365	java/lang/StringBuilder
    //   39: astore_1
    //   40: aload_1
    //   41: ldc_w 367
    //   44: invokespecial 368	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: aload_2
    //   48: aload_1
    //   49: getstatic 363	android/os/Build$VERSION:SDK_INT	I
    //   52: invokevirtual 372	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokespecial 376	com/tencent/mm/plugin/normsg/b/b$f:<init>	(Ljava/lang/String;)V
    //   61: sipush 10417
    //   64: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: aload_2
    //   68: athrow
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: getstatic 92	com/tencent/mm/plugin/normsg/b/b:oUd	Ljava/lang/String;
    //   77: ldc_w 378
    //   80: iconst_1
    //   81: anewarray 72	java/lang/Class
    //   84: dup
    //   85: iconst_0
    //   86: ldc_w 380
    //   89: aastore
    //   90: invokestatic 385	com/tencent/mm/plugin/normsg/b/h:b	([Ljava/lang/Class;)[Ljava/lang/Class;
    //   93: iconst_1
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: ldc_w 387
    //   102: aastore
    //   103: invokestatic 390	com/tencent/mm/plugin/normsg/b/h:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   106: checkcast 392	android/os/IBinder
    //   109: astore_2
    //   110: getstatic 88	com/tencent/mm/plugin/normsg/b/b:oUc	Ljava/lang/String;
    //   113: getstatic 100	com/tencent/mm/plugin/normsg/b/b:oUf	Ljava/lang/String;
    //   116: iconst_1
    //   117: anewarray 72	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc_w 392
    //   125: aastore
    //   126: invokestatic 385	com/tencent/mm/plugin/normsg/b/h:b	([Ljava/lang/Class;)[Ljava/lang/Class;
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_2
    //   136: aastore
    //   137: invokestatic 390	com/tencent/mm/plugin/normsg/b/h:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   140: checkcast 394	android/os/IInterface
    //   143: astore_2
    //   144: getstatic 78	com/tencent/mm/plugin/normsg/b/b:oUb	Ljava/lang/ClassLoader;
    //   147: astore_3
    //   148: aload_2
    //   149: invokevirtual 397	java/lang/Object:getClass	()Ljava/lang/Class;
    //   152: invokevirtual 401	java/lang/Class:getInterfaces	()[Ljava/lang/Class;
    //   155: astore 4
    //   157: new 10	com/tencent/mm/plugin/normsg/b/b$c
    //   160: astore 5
    //   162: aload 5
    //   164: aload_0
    //   165: aload_2
    //   166: invokespecial 404	com/tencent/mm/plugin/normsg/b/b$c:<init>	(Lcom/tencent/mm/plugin/normsg/b/b;Landroid/os/IInterface;)V
    //   169: aload_0
    //   170: aload_3
    //   171: aload 4
    //   173: aload 5
    //   175: invokestatic 410	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   178: checkcast 394	android/os/IInterface
    //   181: putfield 205	com/tencent/mm/plugin/normsg/b/b:oUB	Landroid/os/IInterface;
    //   184: getstatic 92	com/tencent/mm/plugin/normsg/b/b:oUd	Ljava/lang/String;
    //   187: getstatic 96	com/tencent/mm/plugin/normsg/b/b:oUe	Ljava/lang/String;
    //   190: invokestatic 414	com/tencent/mm/plugin/normsg/b/h:fx	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   193: checkcast 416	java/util/Map
    //   196: ldc_w 387
    //   199: aload_0
    //   200: getfield 205	com/tencent/mm/plugin/normsg/b/b:oUB	Landroid/os/IInterface;
    //   203: invokeinterface 420 1 0
    //   208: invokeinterface 424 3 0
    //   213: pop
    //   214: ldc_w 426
    //   217: ldc_w 428
    //   220: iconst_1
    //   221: anewarray 72	java/lang/Class
    //   224: dup
    //   225: iconst_0
    //   226: ldc_w 430
    //   229: aastore
    //   230: invokestatic 385	com/tencent/mm/plugin/normsg/b/h:b	([Ljava/lang/Class;)[Ljava/lang/Class;
    //   233: iconst_1
    //   234: anewarray 4	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: aload_1
    //   240: aastore
    //   241: invokestatic 433	com/tencent/mm/plugin/normsg/b/h:b	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   244: astore_2
    //   245: aload_2
    //   246: ldc_w 435
    //   249: invokestatic 439	com/tencent/mm/plugin/normsg/b/h:f	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   252: astore_1
    //   253: aload_1
    //   254: ifnull +85 -> 339
    //   257: aload_1
    //   258: monitorenter
    //   259: aload_2
    //   260: ldc_w 441
    //   263: aload_0
    //   264: getfield 205	com/tencent/mm/plugin/normsg/b/b:oUB	Landroid/os/IInterface;
    //   267: invokestatic 444	com/tencent/mm/plugin/normsg/b/h:b	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    //   270: aload_1
    //   271: monitorexit
    //   272: aload_0
    //   273: iconst_1
    //   274: putfield 207	com/tencent/mm/plugin/normsg/b/b:eMP	Z
    //   277: sipush 10417
    //   280: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: goto -262 -> 21
    //   286: astore_2
    //   287: new 17	com/tencent/mm/plugin/normsg/b/b$f
    //   290: astore_1
    //   291: aload_1
    //   292: aload_2
    //   293: invokespecial 446	com/tencent/mm/plugin/normsg/b/b$f:<init>	(Ljava/lang/Throwable;)V
    //   296: sipush 10417
    //   299: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: aload_1
    //   303: athrow
    //   304: astore_1
    //   305: aconst_null
    //   306: astore_1
    //   307: goto -54 -> 253
    //   310: astore_2
    //   311: aload_1
    //   312: monitorexit
    //   313: sipush 10417
    //   316: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   319: aload_2
    //   320: athrow
    //   321: astore_1
    //   322: new 17	com/tencent/mm/plugin/normsg/b/b$f
    //   325: astore_2
    //   326: aload_2
    //   327: aload_1
    //   328: invokespecial 446	com/tencent/mm/plugin/normsg/b/b$f:<init>	(Ljava/lang/Throwable;)V
    //   331: sipush 10417
    //   334: invokestatic 171	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   337: aload_2
    //   338: athrow
    //   339: aload_2
    //   340: ldc_w 441
    //   343: aload_0
    //   344: getfield 205	com/tencent/mm/plugin/normsg/b/b:oUB	Landroid/os/IInterface;
    //   347: invokestatic 444	com/tencent/mm/plugin/normsg/b/h:b	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    //   350: goto -78 -> 272
    //
    // Exception table:
    //   from	to	target	type
    //   2	21	69	finally
    //   24	69	69	finally
    //   74	214	69	finally
    //   214	245	69	finally
    //   245	253	69	finally
    //   257	259	69	finally
    //   272	283	69	finally
    //   287	304	69	finally
    //   313	321	69	finally
    //   322	339	69	finally
    //   339	350	69	finally
    //   74	214	286	java/lang/Throwable
    //   245	253	304	java/lang/Throwable
    //   259	272	310	finally
    //   311	313	310	finally
    //   214	245	321	java/lang/Throwable
    //   257	259	321	java/lang/Throwable
    //   313	321	321	java/lang/Throwable
    //   339	350	321	java/lang/Throwable
  }

  class d extends Binder
  {
    protected final IBinder oUQ;

    d(IBinder arg2)
    {
      Object localObject;
      this.oUQ = localObject;
    }

    public void dump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
    {
      AppMethodBeat.i(10405);
      try
      {
        this.oUQ.dump(paramFileDescriptor, paramArrayOfString);
        AppMethodBeat.o(10405);
        return;
      }
      catch (RemoteException paramFileDescriptor)
      {
        while (true)
          AppMethodBeat.o(10405);
      }
    }

    public void dumpAsync(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
    {
      AppMethodBeat.i(10406);
      try
      {
        this.oUQ.dumpAsync(paramFileDescriptor, paramArrayOfString);
        AppMethodBeat.o(10406);
        return;
      }
      catch (RemoteException paramFileDescriptor)
      {
        while (true)
          AppMethodBeat.o(10406);
      }
    }

    public String getInterfaceDescriptor()
    {
      AppMethodBeat.i(10402);
      try
      {
        String str1 = this.oUQ.getInterfaceDescriptor();
        AppMethodBeat.o(10402);
        return str1;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          String str2 = "<failure>";
          AppMethodBeat.o(10402);
        }
      }
    }

    public boolean isBinderAlive()
    {
      AppMethodBeat.i(10404);
      boolean bool = this.oUQ.isBinderAlive();
      AppMethodBeat.o(10404);
      return bool;
    }

    public void linkToDeath(IBinder.DeathRecipient paramDeathRecipient, int paramInt)
    {
      AppMethodBeat.i(10408);
      try
      {
        this.oUQ.linkToDeath(paramDeathRecipient, paramInt);
        AppMethodBeat.o(10408);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          paramDeathRecipient.binderDied();
          AppMethodBeat.o(10408);
        }
      }
    }

    protected boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool1 = false;
      AppMethodBeat.i(10407);
      try
      {
        if (this.oUQ.isBinderAlive())
        {
          bool2 = this.oUQ.transact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          AppMethodBeat.o(10407);
        }
        while (true)
        {
          return bool2;
          AppMethodBeat.o(10407);
          bool2 = bool1;
        }
      }
      catch (RemoteException paramParcel1)
      {
        AppMethodBeat.o(10407);
        throw paramParcel1;
      }
      catch (Throwable paramParcel1)
      {
        while (true)
        {
          b.a(b.this, paramParcel1);
          AppMethodBeat.o(10407);
          boolean bool2 = bool1;
        }
      }
    }

    public boolean pingBinder()
    {
      AppMethodBeat.i(10403);
      boolean bool = this.oUQ.pingBinder();
      AppMethodBeat.o(10403);
      return bool;
    }

    public IInterface queryLocalInterface(String paramString)
    {
      return null;
    }

    public boolean unlinkToDeath(IBinder.DeathRecipient paramDeathRecipient, int paramInt)
    {
      AppMethodBeat.i(10409);
      boolean bool = this.oUQ.unlinkToDeath(paramDeathRecipient, paramInt);
      AppMethodBeat.o(10409);
      return bool;
    }
  }

  public static abstract interface g
  {
    public abstract void a(int paramInt, View paramView, List<AccessibilityNodeInfo> paramList);

    public abstract boolean a(int paramInt1, int paramInt2, View paramView);

    public abstract void onError(Throwable paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b
 * JD-Core Version:    0.6.2
 */