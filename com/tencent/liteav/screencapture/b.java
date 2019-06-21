package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.video.TXScreenCapture.TXScreenCaptureAssistantActivity;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(21)
public class b
{
  private static final String b;
  private static b c;
  MediaProjection.Callback a;
  private HashMap<Surface, VirtualDisplay> d;
  private Context e;
  private MediaProjectionManager f;
  private MediaProjection g;
  private HashSet<b.b> h;
  private int i;
  private Handler j;
  private HashSet<Object> k;
  private boolean l;
  private WeakReference<a> m;
  private HandlerThread n;
  private Handler o;
  private int p;
  private HashSet<b.a> q;
  private Runnable r;
  private BroadcastReceiver s;

  static
  {
    AppMethodBeat.i(66789);
    b = b.class.getSimpleName();
    c = new b();
    AppMethodBeat.o(66789);
  }

  private b()
  {
    AppMethodBeat.i(66771);
    this.d = new HashMap();
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = new HashSet();
    this.i = 1;
    this.j = null;
    this.k = new HashSet();
    this.l = false;
    this.m = null;
    this.n = new HandlerThread("TXCScreenCaptureImplSingleton");
    this.o = null;
    this.p = 0;
    this.q = new HashSet();
    this.r = new b.1(this);
    this.a = new b.2(this);
    this.s = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(66764);
        if ((paramAnonymousIntent != null) && (paramAnonymousIntent.getAction().equalsIgnoreCase("TXScreenCapture.OnAssistantActivityResult")))
          b.a(b.this, paramAnonymousIntent.getIntExtra("TXScreenCapture.RequestCode", 0), paramAnonymousIntent.getIntExtra("TXScreenCapture.ResultCode", 0), (Intent)paramAnonymousIntent.getParcelableExtra("TXScreenCapture.ResultData"));
        AppMethodBeat.o(66764);
      }
    };
    this.j = new Handler(Looper.getMainLooper());
    this.n.start();
    this.o = new Handler(this.n.getLooper());
    AppMethodBeat.o(66771);
  }

  public static b a()
  {
    return c;
  }

  // ERROR //
  @TargetApi(21)
  private void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc 159
    //   2: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 87	com/tencent/liteav/screencapture/b:e	Landroid/content/Context;
    //   11: ifnull +14 -> 25
    //   14: aload_0
    //   15: getfield 87	com/tencent/liteav/screencapture/b:e	Landroid/content/Context;
    //   18: aload_0
    //   19: getfield 136	com/tencent/liteav/screencapture/b:s	Landroid/content/BroadcastReceiver;
    //   22: invokevirtual 165	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   25: iload_1
    //   26: sipush 1001
    //   29: if_icmpne +16 -> 45
    //   32: iload_2
    //   33: iconst_m1
    //   34: if_icmpne +11 -> 45
    //   37: aload_0
    //   38: getfield 98	com/tencent/liteav/screencapture/b:i	I
    //   41: iconst_2
    //   42: if_icmpeq +28 -> 70
    //   45: aload_0
    //   46: iconst_1
    //   47: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   50: aload_0
    //   51: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   54: sipush -1308
    //   57: ldc 167
    //   59: invokestatic 172	com/tencent/liteav/basic/util/b:a	(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V
    //   62: aload_0
    //   63: monitorexit
    //   64: ldc 159
    //   66: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: return
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 89	com/tencent/liteav/screencapture/b:f	Landroid/media/projection/MediaProjectionManager;
    //   75: iload_2
    //   76: aload_3
    //   77: invokevirtual 178	android/media/projection/MediaProjectionManager:getMediaProjection	(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;
    //   80: putfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   83: aload_0
    //   84: getfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   87: aload_0
    //   88: getfield 133	com/tencent/liteav/screencapture/b:a	Landroid/media/projection/MediaProjection$Callback;
    //   91: aload_0
    //   92: getfield 100	com/tencent/liteav/screencapture/b:j	Landroid/os/Handler;
    //   95: invokevirtual 184	android/media/projection/MediaProjection:registerCallback	(Landroid/media/projection/MediaProjection$Callback;Landroid/os/Handler;)V
    //   98: aload_0
    //   99: iconst_1
    //   100: putfield 104	com/tencent/liteav/screencapture/b:l	Z
    //   103: aload_0
    //   104: getfield 96	com/tencent/liteav/screencapture/b:h	Ljava/util/HashSet;
    //   107: invokevirtual 188	java/util/HashSet:size	()I
    //   110: ifne +30 -> 140
    //   113: aload_0
    //   114: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   117: sipush -1308
    //   120: ldc 167
    //   122: invokestatic 172	com/tencent/liteav/basic/util/b:a	(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V
    //   125: aload_0
    //   126: iconst_1
    //   127: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   130: aload_0
    //   131: monitorexit
    //   132: ldc 159
    //   134: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: goto -68 -> 69
    //   140: aload_0
    //   141: getfield 96	com/tencent/liteav/screencapture/b:h	Ljava/util/HashSet;
    //   144: invokevirtual 192	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   147: astore 4
    //   149: aload 4
    //   151: invokeinterface 198 1 0
    //   156: ifeq +157 -> 313
    //   159: aload 4
    //   161: invokeinterface 202 1 0
    //   166: checkcast 12	com/tencent/liteav/screencapture/b$b
    //   169: astore 5
    //   171: aload 5
    //   173: ifnull -24 -> 149
    //   176: aload 5
    //   178: getfield 205	com/tencent/liteav/screencapture/b$b:a	Landroid/view/Surface;
    //   181: ifnull -32 -> 149
    //   184: aload 5
    //   186: getfield 207	com/tencent/liteav/screencapture/b$b:b	I
    //   189: ifeq -40 -> 149
    //   192: aload 5
    //   194: getfield 209	com/tencent/liteav/screencapture/b$b:c	I
    //   197: ifeq -48 -> 149
    //   200: aload_0
    //   201: getfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   204: ldc 211
    //   206: aload 5
    //   208: getfield 207	com/tencent/liteav/screencapture/b$b:b	I
    //   211: aload 5
    //   213: getfield 209	com/tencent/liteav/screencapture/b$b:c	I
    //   216: iconst_1
    //   217: iconst_1
    //   218: aload 5
    //   220: getfield 205	com/tencent/liteav/screencapture/b$b:a	Landroid/view/Surface;
    //   223: aconst_null
    //   224: aconst_null
    //   225: invokevirtual 215	android/media/projection/MediaProjection:createVirtualDisplay	(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;
    //   228: astore_3
    //   229: aload_3
    //   230: ifnonnull +30 -> 260
    //   233: aload_0
    //   234: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   237: sipush -1308
    //   240: ldc 167
    //   242: invokestatic 172	com/tencent/liteav/basic/util/b:a	(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V
    //   245: aload_0
    //   246: iconst_1
    //   247: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   250: aload_0
    //   251: monitorexit
    //   252: ldc 159
    //   254: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: goto -188 -> 69
    //   260: aload_0
    //   261: getfield 85	com/tencent/liteav/screencapture/b:d	Ljava/util/HashMap;
    //   264: aload 5
    //   266: getfield 205	com/tencent/liteav/screencapture/b$b:a	Landroid/view/Surface;
    //   269: aload_3
    //   270: invokevirtual 219	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   273: pop
    //   274: goto -125 -> 149
    //   277: astore_3
    //   278: aload_0
    //   279: monitorexit
    //   280: ldc 159
    //   282: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: aload_3
    //   286: athrow
    //   287: astore_3
    //   288: aload_0
    //   289: iconst_1
    //   290: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   293: aload_0
    //   294: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   297: sipush -1308
    //   300: ldc 167
    //   302: invokestatic 172	com/tencent/liteav/basic/util/b:a	(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V
    //   305: ldc 159
    //   307: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: goto -241 -> 69
    //   313: aload_0
    //   314: getfield 96	com/tencent/liteav/screencapture/b:h	Ljava/util/HashSet;
    //   317: invokevirtual 222	java/util/HashSet:clear	()V
    //   320: aload_0
    //   321: iconst_3
    //   322: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   325: aload_0
    //   326: monitorexit
    //   327: aload_0
    //   328: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   331: ifnull +25 -> 356
    //   334: new 138	android/os/Handler
    //   337: dup
    //   338: invokestatic 144	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   341: invokespecial 147	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   344: new 224	com/tencent/liteav/screencapture/b$6
    //   347: dup
    //   348: aload_0
    //   349: invokespecial 225	com/tencent/liteav/screencapture/b$6:<init>	(Lcom/tencent/liteav/screencapture/b;)V
    //   352: invokevirtual 229	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   355: pop
    //   356: ldc 159
    //   358: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: goto -292 -> 69
    //   364: astore 5
    //   366: goto -341 -> 25
    //
    // Exception table:
    //   from	to	target	type
    //   7	25	277	finally
    //   37	45	277	finally
    //   45	64	277	finally
    //   70	132	277	finally
    //   140	149	277	finally
    //   149	171	277	finally
    //   176	229	277	finally
    //   233	252	277	finally
    //   260	274	277	finally
    //   278	280	277	finally
    //   313	327	277	finally
    //   5	7	287	java/lang/Exception
    //   280	287	287	java/lang/Exception
    //   7	25	364	java/lang/Exception
  }

  private void d()
  {
    AppMethodBeat.i(66777);
    this.i = 4;
    this.j.postDelayed(new b.3(this), 1000L);
    AppMethodBeat.o(66777);
  }

  private void e()
  {
    AppMethodBeat.i(66778);
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
    {
      VirtualDisplay localVirtualDisplay = (VirtualDisplay)localIterator.next();
      if (localVirtualDisplay != null)
        localVirtualDisplay.release();
    }
    this.d.clear();
    this.k.clear();
    i();
    AppMethodBeat.o(66778);
  }

  private void f()
  {
    AppMethodBeat.i(66779);
    this.o.postDelayed(this.r, 50L);
    AppMethodBeat.o(66779);
  }

  private void g()
  {
    AppMethodBeat.i(66780);
    this.o.removeCallbacks(this.r);
    AppMethodBeat.o(66780);
  }

  @TargetApi(21)
  private boolean h()
  {
    boolean bool = true;
    AppMethodBeat.i(66783);
    if (this.i != 1)
      AppMethodBeat.o(66783);
    while (true)
    {
      return bool;
      if ((this.e == null) || (this.f == null))
      {
        bool = false;
        AppMethodBeat.o(66783);
      }
      else
      {
        f();
        this.i = 2;
        Object localObject = new IntentFilter();
        ((IntentFilter)localObject).addAction("TXScreenCapture.OnAssistantActivityResult");
        this.e.registerReceiver(this.s, (IntentFilter)localObject);
        localObject = new Intent(this.e, TXScreenCapture.TXScreenCaptureAssistantActivity.class);
        ((Intent)localObject).addFlags(268435456);
        ((Intent)localObject).putExtra("TXScreenCapture.ScreenCaptureIntent", this.f.createScreenCaptureIntent());
        this.e.startActivity((Intent)localObject);
        AppMethodBeat.o(66783);
      }
    }
  }

  @TargetApi(21)
  private void i()
  {
    AppMethodBeat.i(66784);
    if (!this.k.isEmpty())
      AppMethodBeat.o(66784);
    while (true)
    {
      return;
      this.l = false;
      if (this.g != null)
      {
        this.g.stop();
        this.g.unregisterCallback(this.a);
      }
      try
      {
        if (this.e != null)
          this.e.unregisterReceiver(this.s);
        label71: this.g = null;
        this.i = 1;
        g();
        AppMethodBeat.o(66784);
      }
      catch (Exception localException)
      {
        break label71;
      }
    }
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(66773);
    try
    {
      if (this.e != paramContext)
      {
        b();
        this.f = null;
        this.e = paramContext;
        if (this.e != null);
      }
      while (true)
      {
        return;
        if (this.f == null)
          this.f = ((MediaProjectionManager)this.e.getSystemService("media_projection"));
        AppMethodBeat.o(66773);
      }
    }
    finally
    {
      AppMethodBeat.o(66773);
    }
    throw paramContext;
  }

  public void a(Surface paramSurface)
  {
    AppMethodBeat.i(66775);
    try
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        b.b localb = (b.b)localIterator.next();
        if ((localb != null) && (localb.a != null) && (localb.b != 0) && (localb.c != 0) && (localb.a == paramSurface))
          this.h.remove(localb);
      }
      if (!this.d.containsKey(paramSurface));
      while (true)
      {
        return;
        ((VirtualDisplay)this.d.get(paramSurface)).release();
        this.d.remove(paramSurface);
        d();
        AppMethodBeat.o(66775);
      }
    }
    finally
    {
      AppMethodBeat.o(66775);
    }
    throw paramSurface;
  }

  public void a(a parama)
  {
    AppMethodBeat.i(66772);
    if (parama == null)
    {
      this.m = null;
      AppMethodBeat.o(66772);
    }
    while (true)
    {
      return;
      this.m = new WeakReference(parama);
      AppMethodBeat.o(66772);
    }
  }

  public void a(b.a parama)
  {
    AppMethodBeat.i(66781);
    this.j.post(new b.4(this, parama));
    AppMethodBeat.o(66781);
  }

  // ERROR //
  @TargetApi(21)
  public boolean a(Surface paramSurface, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc_w 374
    //   6: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 98	com/tencent/liteav/screencapture/b:i	I
    //   15: iconst_3
    //   16: if_icmpeq +11 -> 27
    //   19: aload_0
    //   20: getfield 98	com/tencent/liteav/screencapture/b:i	I
    //   23: iconst_4
    //   24: if_icmpne +95 -> 119
    //   27: aload_0
    //   28: getfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   31: ifnonnull +3 -> 34
    //   34: aload_0
    //   35: getfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   38: ifnull +149 -> 187
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield 104	com/tencent/liteav/screencapture/b:l	Z
    //   46: aload_0
    //   47: getfield 91	com/tencent/liteav/screencapture/b:g	Landroid/media/projection/MediaProjection;
    //   50: ldc 211
    //   52: iload_2
    //   53: iload_3
    //   54: iconst_1
    //   55: iconst_1
    //   56: aload_1
    //   57: aconst_null
    //   58: aconst_null
    //   59: invokevirtual 215	android/media/projection/MediaProjection:createVirtualDisplay	(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;
    //   62: astore 5
    //   64: aload 5
    //   66: ifnonnull +31 -> 97
    //   69: iload 4
    //   71: ifne +15 -> 86
    //   74: aload_0
    //   75: getfield 106	com/tencent/liteav/screencapture/b:m	Ljava/lang/ref/WeakReference;
    //   78: sipush -1308
    //   81: ldc 167
    //   83: invokestatic 172	com/tencent/liteav/basic/util/b:a	(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V
    //   86: aload_0
    //   87: monitorexit
    //   88: ldc_w 374
    //   91: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: iload 4
    //   96: ireturn
    //   97: aload_0
    //   98: iconst_3
    //   99: putfield 98	com/tencent/liteav/screencapture/b:i	I
    //   102: aload_0
    //   103: getfield 85	com/tencent/liteav/screencapture/b:d	Ljava/util/HashMap;
    //   106: aload_1
    //   107: aload 5
    //   109: invokevirtual 219	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   112: pop
    //   113: iconst_1
    //   114: istore 4
    //   116: goto -47 -> 69
    //   119: new 12	com/tencent/liteav/screencapture/b$b
    //   122: astore 5
    //   124: aload 5
    //   126: aload_0
    //   127: aconst_null
    //   128: invokespecial 377	com/tencent/liteav/screencapture/b$b:<init>	(Lcom/tencent/liteav/screencapture/b;Lcom/tencent/liteav/screencapture/b$1;)V
    //   131: aload 5
    //   133: iload_3
    //   134: putfield 209	com/tencent/liteav/screencapture/b$b:c	I
    //   137: aload 5
    //   139: iload_2
    //   140: putfield 207	com/tencent/liteav/screencapture/b$b:b	I
    //   143: aload 5
    //   145: aload_1
    //   146: putfield 205	com/tencent/liteav/screencapture/b$b:a	Landroid/view/Surface;
    //   149: aload_0
    //   150: getfield 96	com/tencent/liteav/screencapture/b:h	Ljava/util/HashSet;
    //   153: aload 5
    //   155: invokevirtual 380	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   158: pop
    //   159: aload_0
    //   160: invokespecial 382	com/tencent/liteav/screencapture/b:h	()Z
    //   163: istore 6
    //   165: iload 6
    //   167: istore 4
    //   169: goto -100 -> 69
    //   172: astore_1
    //   173: aload_0
    //   174: monitorexit
    //   175: ldc_w 374
    //   178: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_1
    //   182: athrow
    //   183: astore_1
    //   184: goto -115 -> 69
    //   187: iconst_0
    //   188: istore 4
    //   190: goto -21 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   11	27	172	finally
    //   27	34	172	finally
    //   34	64	172	finally
    //   74	86	172	finally
    //   86	88	172	finally
    //   97	113	172	finally
    //   119	165	172	finally
    //   173	175	172	finally
    //   11	27	183	java/lang/Exception
    //   27	34	183	java/lang/Exception
    //   34	64	183	java/lang/Exception
    //   97	113	183	java/lang/Exception
    //   119	165	183	java/lang/Exception
  }

  public void b()
  {
    AppMethodBeat.i(66776);
    try
    {
      e();
      return;
    }
    finally
    {
      AppMethodBeat.o(66776);
    }
  }

  public void b(final b.a parama)
  {
    AppMethodBeat.i(66782);
    this.j.post(new Runnable()
    {
      public void run()
      {
        AppMethodBeat.i(66763);
        b.d(b.this).remove(parama);
        AppMethodBeat.o(66763);
      }
    });
    AppMethodBeat.o(66782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.b
 * JD-Core Version:    0.6.2
 */