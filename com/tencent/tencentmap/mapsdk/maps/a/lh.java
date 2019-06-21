package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.map.lib.basemap.data.a;
import com.tencent.map.lib.d;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class lh
  implements le
{
  private static List<lp> A;
  private static ConcurrentHashMap<String, Bitmap> B;
  private static List<String> C;
  private static ReentrantReadWriteLock F;
  private static final int[] H;
  private String D;
  private AtomicInteger E;
  private int G;
  private String I;
  private int J;
  private int K;
  private float L;
  private int M;
  private double N;
  private b O;
  private boolean P;
  private LinearLayout Q;
  private LinearLayout R;
  private final int S;
  private final int T;
  private final int U;
  private float V;
  private Animation W;
  private int X;
  private List<a> Y;
  private int Z;
  private final int a;
  private int aa;
  private int ab;
  private int ac;
  private boolean ad;
  private final int b;
  private Context c;
  private ImageView d;
  private Bitmap e;
  private Bitmap f;
  private le.b g;
  private le.b h;
  private boolean i;
  private ViewGroup j;
  private float[] k;
  private int[] l;
  private int[] m;
  private int[] n;
  private int[] o;
  private float[] p;
  private float[] q;
  private float[] r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private boolean y;
  private TextView z;

  static
  {
    AppMethodBeat.i(100411);
    A = new CopyOnWriteArrayList();
    B = new ConcurrentHashMap();
    C = new CopyOnWriteArrayList();
    F = new ReentrantReadWriteLock();
    H = new int[] { 1, 2, 5 };
    AppMethodBeat.o(100411);
  }

  public lh(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100369);
    this.a = 500;
    this.b = 1000;
    this.g = le.b.c;
    this.h = le.b.a;
    this.i = true;
    this.k = new float[] { -1.0F, -1.0F, -1.0F, -1.0F };
    this.l = new int[] { -1, -1, -1, -1 };
    this.m = new int[] { -1, -1, -1, -1 };
    this.n = new int[le.a.values().length];
    this.o = new int[le.a.values().length];
    this.p = new float[] { 0.02F, 0.02F, 0.012F, 0.012F };
    this.q = new float[] { 0.022F, 0.022F, 0.0125F, 0.0125F };
    this.r = new float[] { 0.0185F, 0.0185F, 0.0104F, 0.0104F };
    this.s = 0;
    this.t = 0;
    this.u = 0;
    this.v = 0;
    this.w = 0;
    this.x = 0;
    this.y = false;
    this.D = null;
    this.E = new AtomicInteger(0);
    this.G = 0;
    this.I = "50m";
    this.J = 11;
    this.K = 109;
    this.L = 1.0F;
    this.P = true;
    this.U = 18;
    this.V = 1.4E-45F;
    this.X = 40;
    this.Y = new ArrayList();
    this.Z = -1;
    this.aa = -1;
    this.ab = -1;
    this.ac = -1;
    this.ad = true;
    this.c = paramContext;
    this.S = paramInt1;
    this.T = paramInt2;
    this.L = paramContext.getResources().getDisplayMetrics().density;
    this.X = ((int)(40.0F * this.L + 0.5D));
    this.d = new ImageView(paramContext);
    this.O = new b(this.c);
    this.z = new TextView(this.c);
    this.z.setText(this.I);
    this.z.setContentDescription("地图");
    this.z.setTextSize(12.0F);
    this.z.setTextColor(-16777216);
    this.z.setGravity(1);
    if (this.L <= 0.0F)
      this.L = 1.0F;
    this.Q = new LinearLayout(this.c);
    this.Q.setOrientation(1);
    this.Q.setGravity(16);
    this.R = new LinearLayout(this.c);
    this.R.setOrientation(1);
    this.R.setGravity(16);
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    paramContext.gravity = 3;
    this.R.addView(this.z, paramContext);
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    paramContext.gravity = 3;
    this.R.addView(this.O, paramContext);
    this.R.setVisibility(8);
    o();
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    paramContext.gravity = 3;
    this.Q.addView(this.d, paramContext);
    a(lq.g());
    AppMethodBeat.o(100369);
  }

  private void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(100382);
    try
    {
      this.e = paramBitmap;
      if (this.e != null)
      {
        this.u = this.e.getWidth();
        this.v = this.e.getHeight();
      }
      u();
      v();
      AppMethodBeat.o(100382);
      return;
    }
    catch (Exception paramBitmap)
    {
      while (true)
        AppMethodBeat.o(100382);
    }
  }

  private void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(100374);
    if (C.contains(paramString2))
      AppMethodBeat.o(100374);
    while (true)
    {
      return;
      C.add(paramString2);
      new lh.2(this, paramString1, paramString2).start();
      AppMethodBeat.o(100374);
    }
  }

  // ERROR //
  private boolean a(String paramString, Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: ldc_w 375
    //   8: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   14: invokevirtual 379	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   17: invokevirtual 384	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   20: aload_2
    //   21: ifnonnull +12 -> 33
    //   24: ldc_w 375
    //   27: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: iload 4
    //   32: ireturn
    //   33: aload_0
    //   34: aload_1
    //   35: invokespecial 387	com/tencent/tencentmap/mapsdk/maps/a/lh:b	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_1
    //   39: new 389	java/io/File
    //   42: astore 5
    //   44: aload 5
    //   46: aload_1
    //   47: invokespecial 391	java/io/File:<init>	(Ljava/lang/String;)V
    //   50: aload 5
    //   52: invokevirtual 395	java/io/File:exists	()Z
    //   55: istore 6
    //   57: iload 6
    //   59: ifeq +25 -> 84
    //   62: aconst_null
    //   63: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   66: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   69: invokevirtual 379	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   72: invokevirtual 403	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   75: ldc_w 375
    //   78: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -51 -> 30
    //   84: new 405	java/io/FileOutputStream
    //   87: astore_1
    //   88: aload_1
    //   89: aload 5
    //   91: invokespecial 408	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   94: aload_2
    //   95: getstatic 414	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   98: bipush 100
    //   100: aload_1
    //   101: invokevirtual 418	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   104: istore 6
    //   106: iload 6
    //   108: istore 4
    //   110: aload_1
    //   111: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   114: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   117: invokevirtual 379	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   120: invokevirtual 403	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   123: ldc_w 375
    //   126: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -99 -> 30
    //   132: astore_1
    //   133: aconst_null
    //   134: astore_1
    //   135: aload_1
    //   136: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   139: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   142: invokevirtual 379	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   145: invokevirtual 403	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   148: ldc_w 375
    //   151: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -124 -> 30
    //   157: astore_2
    //   158: aload_3
    //   159: astore_1
    //   160: aload_1
    //   161: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   164: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   167: invokevirtual 379	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   170: invokevirtual 403	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   173: ldc_w 375
    //   176: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_2
    //   180: athrow
    //   181: astore_2
    //   182: goto -22 -> 160
    //   185: astore_2
    //   186: goto -51 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   39	57	132	java/lang/Throwable
    //   84	94	132	java/lang/Throwable
    //   39	57	157	finally
    //   84	94	157	finally
    //   94	106	181	finally
    //   94	106	185	java/lang/Throwable
  }

  private String b(String paramString)
  {
    AppMethodBeat.i(100377);
    String str = q();
    v.a(str);
    paramString = str + "/" + paramString;
    AppMethodBeat.o(100377);
    return paramString;
  }

  private int[] b(int paramInt1, int paramInt2)
  {
    float f1 = 1.0F;
    float f2;
    if (this.V != 1.4E-45F)
      f2 = this.V;
    while (true)
    {
      return new int[] { (int)(paramInt1 * f2), (int)(f2 * paramInt2) };
      f2 = f1;
      switch (this.G)
      {
      case 0:
      default:
        f2 = f1;
        break;
      case -3:
        f2 = 0.7F;
        break;
      case 1:
        f2 = 1.2F;
        break;
      case -1:
        f2 = 0.8333333F;
        break;
      case -2:
        f2 = 0.8F;
      }
    }
  }

  // ERROR //
  private Bitmap c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 445
    //   5: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   11: invokevirtual 449	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   14: invokevirtual 452	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   17: aload_0
    //   18: aload_1
    //   19: invokespecial 387	com/tencent/tencentmap/mapsdk/maps/a/lh:b	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_1
    //   23: new 389	java/io/File
    //   26: astore_3
    //   27: aload_3
    //   28: aload_1
    //   29: invokespecial 391	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: aload_3
    //   33: invokevirtual 395	java/io/File:exists	()Z
    //   36: istore 4
    //   38: iload 4
    //   40: ifne +24 -> 64
    //   43: aconst_null
    //   44: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   47: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   50: invokevirtual 449	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   53: invokevirtual 453	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   56: ldc_w 445
    //   59: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: aload_2
    //   63: areturn
    //   64: new 455	java/io/FileInputStream
    //   67: astore_1
    //   68: aload_1
    //   69: aload_3
    //   70: invokespecial 456	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   73: aload_1
    //   74: invokestatic 462	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_1
    //   81: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   84: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   87: invokevirtual 449	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   90: invokevirtual 453	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   93: ldc_w 445
    //   96: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: goto -37 -> 62
    //   102: astore_1
    //   103: aconst_null
    //   104: astore_1
    //   105: aload_1
    //   106: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   109: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   112: invokevirtual 449	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   115: invokevirtual 453	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   118: ldc_w 445
    //   121: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: goto -62 -> 62
    //   127: astore_2
    //   128: aconst_null
    //   129: astore_1
    //   130: aload_1
    //   131: invokestatic 400	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   134: getstatic 113	com/tencent/tencentmap/mapsdk/maps/a/lh:F	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   137: invokevirtual 449	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   140: invokevirtual 453	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   143: ldc_w 445
    //   146: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload_2
    //   150: athrow
    //   151: astore_2
    //   152: goto -22 -> 130
    //   155: astore_3
    //   156: goto -51 -> 105
    //
    // Exception table:
    //   from	to	target	type
    //   17	38	102	java/lang/Throwable
    //   64	73	102	java/lang/Throwable
    //   17	38	127	finally
    //   64	73	127	finally
    //   73	78	151	finally
    //   73	78	155	java/lang/Throwable
  }

  private void o()
  {
    AppMethodBeat.i(100370);
    this.W = new AlphaAnimation(1.0F, 0.0F);
    this.W.setDuration(1000L);
    this.W.setStartOffset(500L);
    this.W.setAnimationListener(new lh.1(this));
    AppMethodBeat.o(100370);
  }

  private void p()
  {
    AppMethodBeat.i(100372);
    a(this.j);
    AppMethodBeat.o(100372);
  }

  private String q()
  {
    AppMethodBeat.i(100375);
    String str = this.c.getFilesDir().getAbsolutePath() + "/tencentMapSdk/logos";
    AppMethodBeat.o(100375);
    return str;
  }

  private String r()
  {
    AppMethodBeat.i(100376);
    String str = this.c.getFilesDir().getAbsolutePath() + "/tencentMapSdk/oldLogos";
    AppMethodBeat.o(100376);
    return str;
  }

  private FrameLayout.LayoutParams s()
  {
    AppMethodBeat.i(100387);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    if (this.f == null)
    {
      AppMethodBeat.o(100387);
      return localLayoutParams;
    }
    switch (lh.4.a[this.g.ordinal()])
    {
    default:
      d.b("Unknown position:" + this.g);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(100387);
      break;
      localLayoutParams.gravity = 83;
      localLayoutParams.bottomMargin = this.n[le.a.c.e];
      localLayoutParams.leftMargin = this.n[le.a.a.e];
      this.aa = (this.t - localLayoutParams.bottomMargin - this.f.getHeight());
      this.Z = localLayoutParams.leftMargin;
      continue;
      localLayoutParams.gravity = 81;
      localLayoutParams.bottomMargin = this.n[le.a.c.e];
      this.aa = (this.t - localLayoutParams.bottomMargin - this.f.getHeight());
      this.Z = ((this.s - this.f.getWidth()) / 2);
      continue;
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = this.n[le.a.c.e];
      localLayoutParams.rightMargin = this.n[le.a.b.e];
      this.aa = (this.t - localLayoutParams.bottomMargin - this.f.getHeight());
      this.Z = (this.s - localLayoutParams.rightMargin - this.f.getWidth());
      continue;
      localLayoutParams.gravity = 51;
      localLayoutParams.topMargin = this.n[le.a.d.e];
      localLayoutParams.leftMargin = this.n[le.a.a.e];
      this.aa = localLayoutParams.topMargin;
      this.Z = localLayoutParams.leftMargin;
      continue;
      localLayoutParams.gravity = 49;
      localLayoutParams.topMargin = this.n[le.a.d.e];
      this.aa = localLayoutParams.topMargin;
      this.Z = ((this.s - this.f.getWidth()) / 2);
      continue;
      localLayoutParams.gravity = 53;
      localLayoutParams.topMargin = this.n[le.a.d.e];
      localLayoutParams.rightMargin = this.n[le.a.b.e];
      this.aa = localLayoutParams.topMargin;
      this.Z = (this.s - localLayoutParams.rightMargin - this.f.getWidth());
    }
  }

  private FrameLayout.LayoutParams t()
  {
    AppMethodBeat.i(100388);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    if (this.R == null)
    {
      AppMethodBeat.o(100388);
      return localLayoutParams;
    }
    int i1 = this.R.getMeasuredWidth();
    int i2 = this.R.getMeasuredHeight();
    switch (lh.4.a[this.h.ordinal()])
    {
    default:
      d.b("Unknown positionScale:" + this.h);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(100388);
      break;
      localLayoutParams.gravity = 83;
      localLayoutParams.bottomMargin = this.o[le.a.c.e];
      localLayoutParams.leftMargin = this.o[le.a.a.e];
      this.ac = (this.t - localLayoutParams.bottomMargin - i2);
      this.ab = localLayoutParams.leftMargin;
      continue;
      localLayoutParams.gravity = 81;
      localLayoutParams.bottomMargin = this.o[le.a.c.e];
      this.ac = (this.t - localLayoutParams.bottomMargin - i2);
      this.ab = ((this.s - i1) / 2);
      continue;
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = this.o[le.a.c.e];
      localLayoutParams.rightMargin = this.o[le.a.b.e];
      this.ac = (this.t - localLayoutParams.bottomMargin - i2);
      this.ab = (this.s - localLayoutParams.rightMargin - i1);
      continue;
      localLayoutParams.gravity = 51;
      localLayoutParams.topMargin = this.o[le.a.d.e];
      localLayoutParams.leftMargin = this.o[le.a.a.e];
      this.ac = localLayoutParams.topMargin;
      this.ab = localLayoutParams.leftMargin;
      continue;
      localLayoutParams.gravity = 49;
      localLayoutParams.topMargin = this.o[le.a.d.e];
      this.ac = localLayoutParams.topMargin;
      this.ab = ((this.s - i1) / 2);
      continue;
      localLayoutParams.gravity = 53;
      localLayoutParams.topMargin = this.o[le.a.d.e];
      localLayoutParams.rightMargin = this.o[le.a.b.e];
      this.ac = localLayoutParams.topMargin;
      this.ab = (this.s - localLayoutParams.rightMargin - i1);
    }
  }

  private void u()
  {
    AppMethodBeat.i(100394);
    if ((this.s == 0) || (this.t == 0))
    {
      AppMethodBeat.o(100394);
      return;
    }
    this.w = ((int)(this.u * this.L / 3.0F));
    this.x = ((int)(this.v * this.L / 3.0F));
    float[] arrayOfFloat = this.p;
    if (this.s >= 1080)
      arrayOfFloat = this.r;
    while (true)
    {
      int i1 = le.a.a.e;
      float f1 = arrayOfFloat[i1];
      if (this.k[i1] >= 0.0F)
        f1 = this.k[i1];
      this.n[i1] = ((int)(f1 * this.s));
      if (this.ad)
        this.m[le.a.c.e] = this.x;
      if ((this.l[i1] >= 0) && (this.l[i1] < this.s - this.w))
        this.n[i1] = this.l[i1];
      i1 = le.a.b.e;
      f1 = arrayOfFloat[i1];
      if (this.k[i1] >= 0.0F)
        f1 = this.k[i1];
      this.n[i1] = ((int)(f1 * this.s));
      if ((this.l[i1] >= 0) && (this.l[i1] < this.s - this.w))
        this.n[i1] = this.l[i1];
      i1 = le.a.c.e;
      f1 = arrayOfFloat[i1];
      if (this.k[i1] >= 0.0F)
        f1 = this.k[i1];
      this.n[i1] = ((int)(f1 * this.t));
      if ((this.l[i1] >= 0) && (this.l[i1] < this.t - this.x))
        this.n[i1] = this.l[i1];
      i1 = le.a.d.e;
      f1 = arrayOfFloat[i1];
      if (this.k[i1] >= 0.0F)
        f1 = this.k[i1];
      this.n[i1] = ((int)(f1 * this.t));
      if ((this.l[i1] >= 0) && (this.l[i1] < this.t - this.x))
        this.n[i1] = this.l[i1];
      this.y = true;
      p();
      AppMethodBeat.o(100394);
      break;
      if (this.s >= 720)
        arrayOfFloat = this.q;
    }
  }

  private void v()
  {
    AppMethodBeat.i(100395);
    if ((this.s == 0) || (this.t == 0))
    {
      AppMethodBeat.o(100395);
      return;
    }
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.R.measure(i1, i2);
    i1 = this.R.getMeasuredHeight();
    i2 = this.R.getMeasuredWidth();
    float[] arrayOfFloat = this.p;
    if (this.s >= 1080)
      arrayOfFloat = this.r;
    while (true)
    {
      int i3 = le.a.a.e;
      float f1 = arrayOfFloat[i3];
      if (this.k[i3] >= 0.0F)
        f1 = this.k[i3];
      this.o[i3] = ((int)(f1 * this.s));
      if ((this.m[i3] >= 0) && (this.m[i3] < this.s - i2))
        this.o[i3] = this.m[i3];
      i3 = le.a.b.e;
      f1 = arrayOfFloat[i3];
      if (this.k[i3] >= 0.0F)
        f1 = this.k[i3];
      this.o[i3] = ((int)(f1 * this.s));
      if ((this.m[i3] >= 0) && (this.m[i3] < this.s - i2))
        this.o[i3] = this.m[i3];
      i2 = le.a.c.e;
      f1 = arrayOfFloat[i2];
      if (this.k[i2] >= 0.0F)
        f1 = this.k[i2];
      this.o[i2] = ((int)(f1 * this.t));
      if ((this.m[i2] >= 0) && (this.m[i2] < this.t - i1))
        this.o[i2] = this.m[i2];
      i2 = le.a.d.e;
      f1 = arrayOfFloat[i2];
      if (this.k[i2] >= 0.0F)
        f1 = this.k[i2];
      this.o[i2] = ((int)(f1 * this.t));
      if ((this.m[i2] >= 0) && (this.m[i2] < this.t - i1))
        this.o[i2] = this.m[i2];
      p();
      AppMethodBeat.o(100395);
      break;
      if (this.s >= 720)
        arrayOfFloat = this.q;
    }
  }

  private void w()
  {
    int i1 = 0;
    AppMethodBeat.i(100401);
    int i2 = (int)Math.log10(this.X * this.N);
    int i3 = (int)(H[0] * Math.pow(10.0D, i2));
    int i4 = (int)(i3 / this.N);
    if ((i4 <= 0) || (Double.isNaN(this.N)))
      AppMethodBeat.o(100401);
    while (true)
    {
      return;
      while (i4 < this.X)
      {
        i1++;
        i3 = H.length;
        i3 = (int)(H[(i1 % i3)] * Math.pow(10.0D, i1 / H.length + i2));
        i4 = (int)(i3 / this.N);
      }
      String str = "m";
      i1 = i3;
      if (i3 >= 1000)
      {
        i1 = i3 / 1000;
        str = "km";
      }
      this.I = (i1 + str);
      this.K = i4;
      this.z.setText(this.I);
      AppMethodBeat.o(100401);
    }
  }

  public void a()
  {
    AppMethodBeat.i(100384);
    if (this.E.decrementAndGet() == 0)
    {
      if (Build.VERSION.SDK_INT < 11)
      {
        Iterator localIterator = B.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Bitmap localBitmap = (Bitmap)((Map.Entry)localIterator.next()).getValue();
          if ((localBitmap != null) && (!localBitmap.isRecycled()))
            localBitmap.recycle();
        }
      }
      B.clear();
    }
    v.a(this.f);
    AppMethodBeat.o(100384);
  }

  public void a(float paramFloat)
  {
    float f1 = 1.3F;
    float f2 = 0.7F;
    AppMethodBeat.i(100403);
    if (paramFloat > 1.3F)
      paramFloat = f1;
    while (true)
    {
      if (paramFloat < 0.7F)
        paramFloat = f2;
      while (true)
      {
        this.G = 0;
        this.V = paramFloat;
        d();
        AppMethodBeat.o(100403);
        return;
      }
    }
  }

  @Deprecated
  public void a(int paramInt)
  {
    AppMethodBeat.i(100402);
    this.G = paramInt;
    this.V = 1.4E-45F;
    d();
    AppMethodBeat.o(100402);
  }

  public void a(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(100400);
    this.M = paramInt;
    this.N = paramDouble;
    w();
    p();
    AppMethodBeat.o(100400);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100383);
    this.s = paramInt1;
    this.t = paramInt2;
    u();
    v();
    AppMethodBeat.o(100383);
  }

  public void a(a parama, int paramInt)
  {
    AppMethodBeat.i(100373);
    int i1 = (int)parama.c();
    int i2 = i1;
    if (i1 > 18)
      i2 = 18;
    Object localObject1 = A.iterator();
    Object localObject2;
    do
    {
      if (!((Iterator)localObject1).hasNext())
        break;
      localObject2 = (lp)((Iterator)localObject1).next();
    }
    while ((i2 < ((lp)localObject2).a()) || (i2 > ((lp)localObject2).b()));
    while (true)
    {
      if (localObject2 == null)
        AppMethodBeat.o(100373);
      while (true)
      {
        return;
        localObject2 = ((lp)localObject2).a(parama, paramInt);
        if (localObject2 == null)
        {
          AppMethodBeat.o(100373);
        }
        else
        {
          parama = localObject2[0];
          localObject2 = localObject2[1];
          if (!StringUtil.isEqual(parama, this.D))
            paramInt = 1;
          while (true)
            if (paramInt != 0)
            {
              localObject1 = (Bitmap)B.get(parama);
              if (localObject1 != null)
              {
                if (!((Bitmap)localObject1).isRecycled())
                {
                  a((Bitmap)localObject1);
                  this.D = parama;
                  AppMethodBeat.o(100373);
                  break;
                  paramInt = 0;
                  continue;
                }
                B.remove(parama);
              }
              localObject1 = c(parama);
              if (localObject1 != null)
              {
                this.D = parama;
                B.put(this.D, localObject1);
                a((Bitmap)localObject1);
                AppMethodBeat.o(100373);
                break;
              }
              this.D = null;
              a((String)localObject2, parama);
            }
          AppMethodBeat.o(100373);
        }
      }
      localObject2 = null;
    }
  }

  public void a(le.a parama, int paramInt)
  {
    this.l[parama.e] = paramInt;
  }

  public void a(le.b paramb)
  {
    AppMethodBeat.i(100385);
    if (this.g != paramb)
      p();
    this.g = paramb;
    AppMethodBeat.o(100385);
  }

  public void a(a parama)
  {
    AppMethodBeat.i(100406);
    if ((this.Y != null) && (parama != null))
      this.Y.add(parama);
    AppMethodBeat.o(100406);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(100380);
    if (paramString == null)
      AppMethodBeat.o(100380);
    while (true)
    {
      return;
      A.clear();
      try
      {
        JSONArray localJSONArray1 = new org/json/JSONArray;
        localJSONArray1.<init>(paramString);
        for (int i1 = 0; i1 < localJSONArray1.length(); i1++)
        {
          Object localObject1 = localJSONArray1.getJSONObject(i1);
          paramString = ((JSONObject)localObject1).getJSONArray("level");
          int i2 = paramString.getInt(0);
          int i3 = paramString.getInt(1);
          paramString = new java/util/ArrayList;
          paramString.<init>();
          JSONArray localJSONArray2 = ((JSONObject)localObject1).getJSONArray("districts");
          for (int i4 = 0; i4 < localJSONArray2.length(); i4++)
          {
            Object localObject2 = localJSONArray2.getJSONObject(i4);
            int i5 = ((JSONObject)localObject2).getInt("rule");
            int i6 = ((JSONObject)localObject2).getInt("priority");
            localObject1 = ((JSONObject)localObject2).getString("frontier");
            localObject3 = ((JSONObject)localObject2).getString("logo_name");
            String str1 = ((JSONObject)localObject2).getString("logo");
            String str2 = ((JSONObject)localObject2).optString("logo_night");
            localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/lm;
            ((lm)localObject2).<init>(i5, i6, (String)localObject3, str1, str2, (String)localObject1);
            paramString.add(localObject2);
          }
          Object localObject3 = A;
          localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/lp;
          ((lp)localObject1).<init>(i2, i3, paramString);
          ((List)localObject3).add(localObject1);
        }
        AppMethodBeat.o(100380);
      }
      catch (Throwable paramString)
      {
        AppMethodBeat.o(100380);
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100390);
    this.i = paramBoolean;
    ImageView localImageView;
    if (this.d != null)
    {
      localImageView = this.d;
      if (!paramBoolean)
        break label41;
    }
    label41: for (int i1 = 0; ; i1 = 4)
    {
      localImageView.setVisibility(i1);
      AppMethodBeat.o(100390);
      return;
    }
  }

  public boolean a(ViewGroup paramViewGroup)
  {
    boolean bool = false;
    AppMethodBeat.i(100371);
    if (paramViewGroup == null)
      AppMethodBeat.o(100371);
    while (true)
    {
      return bool;
      Object localObject;
      if (this.y)
      {
        this.y = false;
        v.a(this.f);
        localObject = b(this.w, this.x);
        this.f = ht.a(this.e, this.c, localObject[0], localObject[1]);
      }
      try
      {
        this.d.setImageBitmap(this.f);
        this.j = paramViewGroup;
        localObject = s();
        if (paramViewGroup.indexOfChild(this.Q) < 0)
        {
          paramViewGroup.addView(this.Q, (ViewGroup.LayoutParams)localObject);
          localObject = t();
          if (paramViewGroup.indexOfChild(this.R) >= 0)
            break label402;
          paramViewGroup.addView(this.R, (ViewGroup.LayoutParams)localObject);
          if ((this.z != null) && (this.O != null))
          {
            localObject = (LinearLayout.LayoutParams)this.z.getLayoutParams();
            this.O.measure(0, 0);
            this.z.measure(0, 0);
            ((LinearLayout.LayoutParams)localObject).leftMargin = ((int)((this.K + 6.0F * this.L - this.z.getWidth()) / 2.0F));
            this.R.updateViewLayout(this.z, (ViewGroup.LayoutParams)localObject);
            this.R.updateViewLayout(this.O, this.O.getLayoutParams());
          }
          localObject = this.d;
          if (!this.i)
            break label414;
          i1 = 0;
          ((ImageView)localObject).setVisibility(i1);
          if (this.Y == null)
            break label420;
          this.Q.requestLayout();
          this.R.requestLayout();
          Iterator localIterator = this.Y.iterator();
          while (localIterator.hasNext())
          {
            localObject = (a)localIterator.next();
            ((a)localObject).a(this.Q, new Rect(this.Z, this.aa, 0, 0), this.i);
            ((a)localObject).b(this.R, new Rect(this.ab, this.ac, 0, 0), this.P);
          }
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          Log.getStackTraceString(localThrowable);
          continue;
          paramViewGroup.updateViewLayout(this.Q, localThrowable);
          continue;
          label402: paramViewGroup.updateViewLayout(this.R, localThrowable);
          continue;
          label414: int i1 = 4;
        }
        label420: paramViewGroup.requestLayout();
        AppMethodBeat.o(100371);
        bool = true;
      }
    }
  }

  public void b()
  {
    AppMethodBeat.i(100381);
    F.writeLock().lock();
    B.clear();
    try
    {
      Object localObject1 = new java/io/File;
      ((File)localObject1).<init>(q());
      if (((File)localObject1).exists())
      {
        File localFile = new java/io/File;
        localFile.<init>(r());
        if (!((File)localObject1).renameTo(localFile))
          break label90;
        localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/lh$3;
        ((lh.3)localObject1).<init>(this, localFile);
        ((lh.3)localObject1).start();
      }
      while (true)
      {
        return;
        label90: v.c(((File)localObject1).getAbsolutePath());
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        F.writeLock().unlock();
        AppMethodBeat.o(100381);
      }
    }
    finally
    {
      F.writeLock().unlock();
      AppMethodBeat.o(100381);
    }
  }

  public void b(le.a parama, int paramInt)
  {
    AppMethodBeat.i(100391);
    if (this.ad)
      this.ad = false;
    this.m[parama.e] = paramInt;
    v();
    AppMethodBeat.o(100391);
  }

  public void b(le.b paramb)
  {
    AppMethodBeat.i(100386);
    if (this.h != paramb)
      p();
    this.h = paramb;
    AppMethodBeat.o(100386);
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100396);
    this.P = paramBoolean;
    if ((this.O != null) && (!paramBoolean))
      this.R.setVisibility(8);
    if (this.Y != null)
    {
      Iterator localIterator = this.Y.iterator();
      while (localIterator.hasNext())
        ((a)localIterator.next()).b(this.R, new Rect(this.ab, this.ac, 0, 0), this.P);
    }
    AppMethodBeat.o(100396);
  }

  public Rect c()
  {
    AppMethodBeat.i(100389);
    Rect localRect = new Rect();
    if (this.Q != null)
    {
      localRect.left = this.Q.getLeft();
      localRect.bottom = this.Q.getBottom();
      localRect.right = this.Q.getRight();
      localRect.top = this.Q.getTop();
    }
    AppMethodBeat.o(100389);
    return localRect;
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(100397);
    LinearLayout localLinearLayout;
    if (this.O != null)
    {
      localLinearLayout = this.R;
      if (!paramBoolean)
        break label36;
    }
    label36: for (int i1 = 0; ; i1 = 8)
    {
      localLinearLayout.setVisibility(i1);
      AppMethodBeat.o(100397);
      return;
    }
  }

  public void d()
  {
    AppMethodBeat.i(100392);
    u();
    AppMethodBeat.o(100392);
  }

  public void e()
  {
    AppMethodBeat.i(100393);
    v();
    AppMethodBeat.o(100393);
  }

  public boolean f()
  {
    return this.P;
  }

  public void g()
  {
    AppMethodBeat.i(100398);
    if (!this.P)
      AppMethodBeat.o(100398);
    while (true)
    {
      return;
      if (this.O != null)
        this.O.postInvalidate();
      if (this.R != null)
      {
        if (this.R.getVisibility() != 0)
        {
          this.R.setVisibility(0);
          AppMethodBeat.o(100398);
        }
        else
        {
          this.R.clearAnimation();
        }
      }
      else
        AppMethodBeat.o(100398);
    }
  }

  public void h()
  {
    AppMethodBeat.i(100399);
    if (this.R.getVisibility() != 0)
      AppMethodBeat.o(100399);
    while (true)
    {
      return;
      this.R.clearAnimation();
      this.W.reset();
      this.R.startAnimation(this.W);
      AppMethodBeat.o(100399);
    }
  }

  public Bitmap i()
  {
    AppMethodBeat.i(100404);
    Object localObject;
    if (this.d == null)
    {
      AppMethodBeat.o(100404);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = this.d.getDrawable();
      if (localObject == null)
      {
        AppMethodBeat.o(100404);
        localObject = null;
      }
      else
      {
        localObject = ((BitmapDrawable)localObject).getBitmap();
        AppMethodBeat.o(100404);
      }
    }
  }

  public boolean j()
  {
    boolean bool = true;
    AppMethodBeat.i(100405);
    if (StringUtil.isEmpty(this.D))
      AppMethodBeat.o(100405);
    while (true)
    {
      return bool;
      if ((this.D.contains("tencent")) || (this.D.contains("taiwan")))
      {
        AppMethodBeat.o(100405);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(100405);
      }
    }
  }

  public void k()
  {
    AppMethodBeat.i(100407);
    if (this.Y != null)
    {
      Iterator localIterator = this.Y.iterator();
      while (localIterator.hasNext())
        ((a)localIterator.next()).a(this);
    }
    AppMethodBeat.o(100407);
  }

  public void l()
  {
    AppMethodBeat.i(100408);
    if (this.Y != null)
    {
      Iterator localIterator = this.Y.iterator();
      while (localIterator.hasNext())
        ((a)localIterator.next()).b(this);
    }
    AppMethodBeat.o(100408);
  }

  public static abstract interface a
  {
    public abstract void a(View paramView, Rect paramRect, boolean paramBoolean);

    public abstract void a(lh paramlh);

    public abstract void b(View paramView, Rect paramRect, boolean paramBoolean);

    public abstract void b(lh paramlh);
  }

  class b extends View
  {
    private Paint b;
    private Paint c;

    public b(Context arg2)
    {
      super();
      AppMethodBeat.i(100365);
      this.b = new Paint();
      this.b.setAntiAlias(true);
      this.b.setColor(-16777216);
      this.b.setStrokeWidth(1.0F * lh.c(lh.this));
      this.b.setStyle(Paint.Style.STROKE);
      this.c = new Paint(65);
      this.c.setStyle(Paint.Style.FILL);
      this.c.setColor(0);
      AppMethodBeat.o(100365);
    }

    private void a(Canvas paramCanvas, int paramInt)
    {
      AppMethodBeat.i(100368);
      int i = (int)(6.0F * lh.c(lh.this));
      paramInt /= 2;
      paramCanvas.drawPaint(this.c);
      paramCanvas.drawLine(i, paramInt, lh.d(lh.this) + i, paramInt, this.b);
      paramCanvas.drawLine(i, paramInt - lh.c(lh.this) * 3.0F, i, paramInt + 1, this.b);
      paramCanvas.drawLine(lh.d(lh.this) + i, paramInt - lh.c(lh.this) * 3.0F, lh.d(lh.this) + i, paramInt + 1, this.b);
      AppMethodBeat.o(100368);
    }

    public void draw(Canvas paramCanvas)
    {
      AppMethodBeat.i(100366);
      super.draw(paramCanvas);
      a(paramCanvas, getHeight());
      AppMethodBeat.o(100366);
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(100367);
      super.onMeasure(paramInt1, paramInt2);
      setMeasuredDimension(Math.min(Math.round(lh.d(lh.this) + 12.0F * lh.c(lh.this)), lh.e(lh.this) / 2), Math.round(lh.f(lh.this) * lh.c(lh.this)));
      AppMethodBeat.o(100367);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lh
 * JD-Core Version:    0.6.2
 */