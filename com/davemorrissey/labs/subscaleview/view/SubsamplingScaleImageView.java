package com.davemorrissey.labs.subscaleview.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView extends View
{
  private static final List<Integer> aIN;
  private static final List<Integer> aIO;
  private static final List<Integer> aIP;
  private static final List<Integer> aIQ;
  private static final List<Integer> aIR;
  public static int aJk;
  private static Bitmap.Config aKp;
  private static com.davemorrissey.labs.subscaleview.c.a aKq;
  private static com.davemorrissey.labs.subscaleview.c.d aKr;
  private static com.davemorrissey.labs.subscaleview.c.c aKs;
  private final String TAG;
  public int aIJ;
  public int aIK;
  private Rect aIL;
  private boolean aIS;
  private boolean aIT;
  private boolean aIU;
  private int aIV;
  private int aIW;
  private boolean aIX;
  private int aIY;
  private boolean aIZ;
  private final ReadWriteLock aIo;
  private com.davemorrissey.labs.subscaleview.a.d aIw;
  private PointF aJA;
  private PointF aJB;
  private boolean aJC;
  private a aJD;
  private a aJE;
  private int aJF;
  private int aJG;
  private Rect aJH;
  private boolean aJI;
  private boolean aJJ;
  private boolean aJK;
  private int aJL;
  private GestureDetector aJM;
  private GestureDetector.SimpleOnGestureListener aJN;
  private GestureDetector aJO;
  private com.davemorrissey.labs.subscaleview.a.b<? extends com.davemorrissey.labs.subscaleview.a.d> aJP;
  private com.davemorrissey.labs.subscaleview.a.b<? extends com.davemorrissey.labs.subscaleview.a.d> aJQ;
  private PointF aJR;
  private float aJS;
  private final float aJT;
  private float aJU;
  private boolean aJV;
  private PointF aJW;
  private PointF aJX;
  private PointF aJY;
  private SubsamplingScaleImageView.a aJZ;
  private long aJa;
  private long aJb;
  private Bitmap aJc;
  private Map<Integer, List<com.davemorrissey.labs.subscaleview.c.e>> aJd;
  private boolean aJe;
  private float aJf;
  private float aJg;
  private int aJh;
  private int aJi;
  private int aJj;
  private int aJl;
  private int aJm;
  private boolean aJn;
  private boolean aJo;
  private boolean aJp;
  private boolean aJq;
  private float aJr;
  private int aJs;
  private int aJt;
  private int aJu;
  private float aJv;
  private PointF aJw;
  private PointF aJx;
  private PointF aJy;
  private Float aJz;
  private float aKA;
  private float aKB;
  private float aKC;
  private boolean aKD;
  private boolean aKE;
  private PointF aKF;
  private View.OnAttachStateChangeListener aKG;
  private com.davemorrissey.labs.subscaleview.d.a aKH;
  private SubsamplingScaleImageView.c aKI;
  private boolean aKJ;
  private boolean aKK;
  private boolean aKL;
  private float aKM;
  private float aKN;
  private boolean aKa;
  private boolean aKb;
  private SubsamplingScaleImageView.e aKc;
  private SubsamplingScaleImageView.f aKd;
  private View.OnLongClickListener aKe;
  private Paint aKf;
  private Paint aKg;
  private Paint aKh;
  private Paint aKi;
  private SubsamplingScaleImageView.g aKj;
  private Matrix aKk;
  private RectF aKl;
  private float[] aKm;
  private float[] aKn;
  private Matrix aKo;
  private LinkedList<com.davemorrissey.labs.subscaleview.c.b> aKt;
  private int aKu;
  private int aKv;
  private float aKw;
  private float aKx;
  public float aKy;
  private float aKz;
  private Bitmap bitmap;
  private boolean cancelled;
  private float density;
  public Executor executor;
  private Handler handler;
  private int orientation;
  private float scale;
  private Uri uri;

  static
  {
    AppMethodBeat.i(115738);
    aIN = Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(90), Integer.valueOf(180), Integer.valueOf(270), Integer.valueOf(-1) });
    aIO = Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) });
    aIP = Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(1) });
    aIQ = Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) });
    aIR = Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(4) });
    aJk = 2147483647;
    aKp = Bitmap.Config.ARGB_8888;
    aKq = new com.davemorrissey.labs.subscaleview.b.a();
    aKr = new com.davemorrissey.labs.subscaleview.b.c();
    aKs = new com.davemorrissey.labs.subscaleview.b.b();
    AppMethodBeat.o(115738);
  }

  public SubsamplingScaleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(115659);
    this.TAG = (SubsamplingScaleImageView.class.getSimpleName() + hashCode());
    this.aIZ = true;
    this.aJa = -1L;
    this.aJb = -1L;
    this.aJe = false;
    this.orientation = -1;
    this.aJf = 2.0F;
    this.aJg = oJ();
    this.aJh = -1;
    this.aJi = 1;
    this.aJj = 3;
    this.aJl = aJk;
    this.aJm = aJk;
    this.aJn = true;
    this.aJo = true;
    this.aJp = true;
    this.aJq = true;
    this.aJr = 2.0F;
    this.aJs = 1;
    this.aJt = 200;
    this.aJu = 200;
    this.aJG = 0;
    this.aIo = new ReentrantReadWriteLock(true);
    this.aJP = new com.davemorrissey.labs.subscaleview.a.a(com.davemorrissey.labs.subscaleview.a.e.class);
    this.aJQ = new com.davemorrissey.labs.subscaleview.a.a(com.davemorrissey.labs.subscaleview.a.e.class);
    this.aKm = new float[8];
    this.aKn = new float[8];
    this.aKt = new LinkedList();
    this.cancelled = false;
    this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
    this.aKB = 1.0F;
    this.aKC = 20.0F;
    this.aKD = true;
    this.aKE = false;
    this.aKH = new com.davemorrissey.labs.subscaleview.d.a();
    this.aKI = new SubsamplingScaleImageView.1(this);
    this.aKJ = false;
    this.aKK = false;
    this.aKL = false;
    this.density = getResources().getDisplayMetrics().density;
    setDoubleTapZoomScale(2.0F);
    setMinimumTileDpi(320);
    setGestureDetector(paramContext);
    this.aKo = new Matrix();
    this.handler = new Handler(new SubsamplingScaleImageView.2(this));
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, a.a.SubsamplingScaleImageView);
      if (paramAttributeSet.hasValue(1))
      {
        String str = paramAttributeSet.getString(1);
        if ((str != null) && (str.length() > 0))
        {
          if (str == null)
          {
            paramContext = new NullPointerException("Asset name must not be null");
            AppMethodBeat.o(115659);
            throw paramContext;
          }
          setImage(a.af("file:///android_asset/".concat(String.valueOf(str))).ox());
        }
      }
      if (paramAttributeSet.hasValue(0))
      {
        int i = paramAttributeSet.getResourceId(0, 0);
        if (i > 0)
          setImage(new a(i).ox());
      }
      if (paramAttributeSet.hasValue(2))
        setPanEnabled(paramAttributeSet.getBoolean(2, true));
      if (paramAttributeSet.hasValue(3))
        setZoomEnabled(paramAttributeSet.getBoolean(3, true));
      if (paramAttributeSet.hasValue(4))
        setQuickScaleEnabled(paramAttributeSet.getBoolean(4, true));
      if (paramAttributeSet.hasValue(5))
        setTileBackgroundColor(paramAttributeSet.getColor(5, Color.argb(0, 0, 0, 0)));
      paramAttributeSet.recycle();
    }
    this.aJT = TypedValue.applyDimension(1, 20.0F, paramContext.getResources().getDisplayMetrics());
    float f = getContext().getResources().getDisplayMetrics().widthPixels / 720.0F;
    if (f > 1.0F)
      this.aKB = f;
    AppMethodBeat.o(115659);
  }

  private int N(float paramFloat)
  {
    AppMethodBeat.i(115685);
    float f = paramFloat;
    if (this.aJh > 0)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      f = localDisplayMetrics.xdpi;
      f = (localDisplayMetrics.ydpi + f) / 2.0F;
      f = paramFloat * (this.aJh / f);
    }
    int i = (int)(oH() * f);
    int j = (int)(oI() * f);
    if ((i == 0) || (j == 0))
    {
      i = 32;
      AppMethodBeat.o(115685);
      return i;
    }
    if ((oI() > j) || (oH() > i))
    {
      j = Math.round(oI() / j);
      i = Math.round(oH() / i);
      if (j >= i);
    }
    while (true)
    {
      i = 1;
      while (true)
        if (i * 2 < j)
        {
          i *= 2;
          continue;
          j = i;
          break;
        }
      AppMethodBeat.o(115685);
      break;
      j = 1;
    }
  }

  private float O(float paramFloat)
  {
    if (this.aJw == null);
    for (paramFloat = (0.0F / 0.0F); ; paramFloat = (paramFloat - this.aJw.x) / this.scale)
      return paramFloat;
  }

  private float P(float paramFloat)
  {
    if (this.aJw == null);
    for (paramFloat = (0.0F / 0.0F); ; paramFloat = (paramFloat - this.aJw.y) / this.scale)
      return paramFloat;
  }

  private float Q(float paramFloat)
  {
    if (this.aJw == null);
    for (paramFloat = (0.0F / 0.0F); ; paramFloat = this.scale * paramFloat + this.aJw.x)
      return paramFloat;
  }

  private float R(float paramFloat)
  {
    if (this.aJw == null);
    for (paramFloat = (0.0F / 0.0F); ; paramFloat = this.scale * paramFloat + this.aJw.y)
      return paramFloat;
  }

  private float S(float paramFloat)
  {
    AppMethodBeat.i(115707);
    paramFloat = Math.max(oJ(), paramFloat);
    AppMethodBeat.o(115707);
    return paramFloat;
  }

  private static float a(int paramInt, long paramLong1, float paramFloat1, float paramFloat2, long paramLong2)
  {
    AppMethodBeat.i(115708);
    switch (paramInt)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException("Unexpected easing type: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(115708);
      throw localIllegalStateException;
    case 2:
      paramFloat1 = d(paramLong1, paramFloat1, paramFloat2, paramLong2);
      AppMethodBeat.o(115708);
    case 1:
    }
    while (true)
    {
      return paramFloat1;
      paramFloat1 = c(paramLong1, paramFloat1, paramFloat2, paramLong2);
      AppMethodBeat.o(115708);
    }
  }

  private PointF a(float paramFloat1, float paramFloat2, PointF paramPointF)
  {
    AppMethodBeat.i(115702);
    if (this.aJw == null)
    {
      paramPointF = null;
      AppMethodBeat.o(115702);
    }
    while (true)
    {
      return paramPointF;
      paramPointF.set(O(paramFloat1), P(paramFloat2));
      AppMethodBeat.o(115702);
    }
  }

  private void a(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(115676);
    float f1;
    int i;
    label98: float f2;
    if (!this.aJo)
    {
      if (this.aJB != null)
      {
        paramPointF1.x = this.aJB.x;
        paramPointF1.y = this.aJB.y;
      }
    }
    else
    {
      f1 = getDoubleTapZoomScale();
      ab.i(this.TAG, "alvinluo doubleTapZoom %f", new Object[] { Float.valueOf(f1) });
      if ((this.scale > f1 * 0.9D) && (this.scale != this.aKy))
        break label157;
      i = 1;
      if (i == 0)
        break label163;
      f2 = f1;
      label106: if (this.aJs != 3)
        break label172;
      a(f2, paramPointF1);
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(115676);
      return;
      paramPointF1.x = (oH() / 2);
      paramPointF1.y = (oI() / 2);
      break;
      label157: i = 0;
      break label98;
      label163: f2 = this.aKy;
      break label106;
      label172: if ((this.aJs == 2) || (i == 0) || (!this.aJo))
      {
        paramPointF1 = new SubsamplingScaleImageView.b(this, f2, paramPointF1, (byte)0);
        paramPointF1.aLa = false;
        paramPointF1.duration = this.aJt;
        paramPointF1.aLc = 4;
        paramPointF1.start();
      }
      else if (this.aJs == 1)
      {
        paramPointF1 = new SubsamplingScaleImageView.b(this, f1, paramPointF1, paramPointF2, (byte)0);
        paramPointF1.aLa = false;
        paramPointF1.duration = this.aJt;
        paramPointF1.aLc = 4;
        paramPointF1.start();
      }
    }
  }

  private void a(com.davemorrissey.labs.subscaleview.c.e parame)
  {
    AppMethodBeat.i(115658);
    if (this.cancelled)
    {
      ab.i(this.TAG, "alvinluo newLoadTask, has cancelled and ignore");
      AppMethodBeat.o(115658);
    }
    while (true)
    {
      return;
      parame = aKr.a(this, this.aIw, parame);
      parame.ou();
      this.aKt.add(parame);
      AppMethodBeat.o(115658);
    }
  }

  private void a(boolean paramBoolean, SubsamplingScaleImageView.g paramg)
  {
    float f1 = 0.5F;
    AppMethodBeat.i(115686);
    boolean bool = paramBoolean;
    if (this.aJi == 2)
    {
      bool = paramBoolean;
      if (this.aKa)
        bool = false;
    }
    PointF localPointF = paramg.aJw;
    float f2 = S(paramg.scale);
    float f3 = f2 * oH();
    float f4 = f2 * oI();
    float f5;
    if ((this.aJi == 3) && (this.aKa))
    {
      localPointF.x = Math.max(localPointF.x, getWidth() / 2 - f3);
      localPointF.y = Math.max(localPointF.y, getHeight() / 2 - f4);
      if ((getPaddingLeft() <= 0) && (getPaddingRight() <= 0))
        break label361;
      f5 = getPaddingLeft() / (getPaddingLeft() + getPaddingRight());
      label163: if ((getPaddingTop() > 0) || (getPaddingBottom() > 0))
        f1 = getPaddingTop() / (getPaddingTop() + getPaddingBottom());
      if ((this.aJi != 3) || (!this.aKa))
        break label369;
      f1 = Math.max(0, getWidth() / 2);
      f5 = Math.max(0, getHeight() / 2);
    }
    while (true)
    {
      localPointF.x = Math.min(localPointF.x, f1);
      localPointF.y = Math.min(localPointF.y, f5);
      paramg.scale = f2;
      AppMethodBeat.o(115686);
      return;
      if (bool)
      {
        localPointF.x = Math.max(localPointF.x, getWidth() - f3);
        localPointF.y = Math.max(localPointF.y, getHeight() - f4);
        break;
      }
      localPointF.x = Math.max(localPointF.x, -f3);
      localPointF.y = Math.max(localPointF.y, -f4);
      break;
      label361: f5 = 0.5F;
      break label163;
      label369: if (bool)
      {
        f3 = Math.max(0.0F, (getWidth() - f3) * f5);
        f5 = Math.max(0.0F, (getHeight() - f4) * f1);
        f1 = f3;
      }
      else
      {
        f1 = Math.max(0, getWidth());
        f5 = Math.max(0, getHeight());
      }
    }
  }

  private static void a(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    paramArrayOfFloat[0] = paramFloat1;
    paramArrayOfFloat[1] = paramFloat2;
    paramArrayOfFloat[2] = paramFloat3;
    paramArrayOfFloat[3] = paramFloat4;
    paramArrayOfFloat[4] = paramFloat5;
    paramArrayOfFloat[5] = paramFloat6;
    paramArrayOfFloat[6] = paramFloat7;
    paramArrayOfFloat[7] = paramFloat8;
  }

  private void aA(boolean paramBoolean)
  {
    AppMethodBeat.i(115687);
    int i;
    if (this.aJw == null)
    {
      i = 1;
      this.aJw = new PointF(0.0F, 0.0F);
    }
    while (true)
    {
      if (this.aKj == null)
        this.aKj = new SubsamplingScaleImageView.g(0.0F, new PointF(0.0F, 0.0F), (byte)0);
      this.aKj.scale = this.scale;
      this.aKj.aJw.set(this.aJw);
      a(paramBoolean, this.aKj);
      this.scale = this.aKj.scale;
      this.aJw.set(this.aKj.aJw);
      if ((i != 0) && (this.aJj != 4))
        this.aJw.set(g(oH() / 2, oI() / 2, this.scale));
      AppMethodBeat.o(115687);
      return;
      i = 0;
    }
  }

  private void az(boolean paramBoolean)
  {
    AppMethodBeat.i(115683);
    if ((this.aIw == null) || (this.aJd == null))
      AppMethodBeat.o(115683);
    while (true)
    {
      return;
      int i = Math.min(this.aIY, N(this.scale));
      Iterator localIterator1 = this.aJd.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((List)((Map.Entry)localIterator1.next()).getValue()).iterator();
        while (localIterator2.hasNext())
        {
          com.davemorrissey.labs.subscaleview.c.e locale = (com.davemorrissey.labs.subscaleview.c.e)localIterator2.next();
          if ((locale.sampleSize < i) || ((locale.sampleSize > i) && (locale.sampleSize != this.aIY)))
          {
            locale.aIB = false;
            if (locale.bitmap != null)
            {
              locale.bitmap.recycle();
              locale.bitmap = null;
            }
          }
          if (locale.sampleSize == i)
          {
            float f1 = O(0.0F);
            float f2 = O(getWidth());
            float f3 = P(0.0F);
            float f4 = P(getHeight());
            if ((f1 <= locale.aIz.right) && (locale.aIz.left <= f2) && (f3 <= locale.aIz.bottom) && (locale.aIz.top <= f4));
            for (int j = 1; ; j = 0)
            {
              if (j == 0)
                break label325;
              locale.aIB = true;
              if ((locale.aIA) || (locale.bitmap != null) || (!paramBoolean))
                break;
              a(locale);
              break;
            }
            label325: if (locale.sampleSize != this.aIY)
            {
              locale.aIB = false;
              if (locale.bitmap != null)
              {
                locale.bitmap.recycle();
                locale.bitmap = null;
              }
            }
          }
          else if (locale.sampleSize == this.aIY)
          {
            locale.aIB = true;
          }
        }
      }
      AppMethodBeat.o(115683);
    }
  }

  private static float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(115700);
    paramFloat1 -= paramFloat2;
    paramFloat2 = paramFloat3 - paramFloat4;
    paramFloat1 = (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
    AppMethodBeat.o(115700);
    return paramFloat1;
  }

  private PointF b(float paramFloat1, float paramFloat2, PointF paramPointF)
  {
    AppMethodBeat.i(115704);
    if (this.aJw == null)
    {
      paramPointF = null;
      AppMethodBeat.o(115704);
    }
    while (true)
    {
      return paramPointF;
      paramPointF.set(Q(paramFloat1), R(paramFloat2));
      AppMethodBeat.o(115704);
    }
  }

  private void b(Point paramPoint)
  {
    try
    {
      AppMethodBeat.i(115682);
      j("initialiseBaseLayer maxTileDimensions=%dx%d", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y) });
      SubsamplingScaleImageView.g localg = new com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$g;
      Object localObject = new android/graphics/PointF;
      ((PointF)localObject).<init>(0.0F, 0.0F);
      localg.<init>(0.0F, (PointF)localObject, (byte)0);
      this.aKj = localg;
      a(true, this.aKj);
      this.aIY = N(this.aKj.scale);
      c(paramPoint);
      localObject = ((List)this.aJd.get(Integer.valueOf(this.aIY))).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramPoint = (com.davemorrissey.labs.subscaleview.c.e)((Iterator)localObject).next();
        ab.i(this.TAG, "alvinluo tile fullSampleSize: %d", new Object[] { Integer.valueOf(this.aIY) });
        a(paramPoint);
      }
    }
    finally
    {
    }
    az(true);
    AppMethodBeat.o(115682);
  }

  private void b(PointF paramPointF1, PointF paramPointF2, float paramFloat)
  {
    AppMethodBeat.i(115677);
    paramPointF1 = new SubsamplingScaleImageView.b(this, paramFloat, paramPointF1, paramPointF2, (byte)0);
    paramPointF1.aLa = false;
    paramPointF1.duration = this.aJu;
    paramPointF1.aLc = 2;
    paramPointF1.start();
    AppMethodBeat.o(115677);
  }

  private static float c(long paramLong1, float paramFloat1, float paramFloat2, long paramLong2)
  {
    float f = (float)paramLong1 / (float)paramLong2;
    return (f - 2.0F) * (-paramFloat2 * f) + paramFloat1;
  }

  private void c(Point paramPoint)
  {
    AppMethodBeat.i(115688);
    j("initialiseTileMap maxTileDimensions=%dx%d", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y) });
    this.aJd = new LinkedHashMap();
    int i = this.aIY;
    int j = 1;
    int k = 1;
    int m = oH() / j;
    int n = oI() / k;
    int i1 = m / i;
    int i2 = n / i;
    while ((i1 + j + 1 > paramPoint.x) || ((i1 > getWidth() * 1.25D) && (i < this.aIY)))
    {
      j++;
      m = oH() / j;
      i1 = m / i;
    }
    while (true)
      if ((i2 + k + 1 > paramPoint.y) || ((i2 > getHeight() * 1.25D) && (i < this.aIY)))
      {
        k++;
        i1 = oI() / k;
        i2 = i1 / i;
      }
      else
      {
        ArrayList localArrayList = new ArrayList(j * k);
        for (i2 = 0; i2 < j; i2++)
        {
          n = 0;
          if (n < k)
          {
            com.davemorrissey.labs.subscaleview.c.e locale = new com.davemorrissey.labs.subscaleview.c.e();
            locale.sampleSize = i;
            boolean bool;
            label261: int i3;
            if (i == this.aIY)
            {
              bool = true;
              locale.aIB = bool;
              if (i2 != j - 1)
                break label378;
              i3 = oH();
              label282: if (n != k - 1)
                break label390;
            }
            label390: for (int i4 = oI(); ; i4 = (n + 1) * i1)
            {
              locale.aIz = new Rect(i2 * m, n * i1, i3, i4);
              locale.aIC = new Rect(0, 0, 0, 0);
              locale.aID = new Rect(locale.aIz);
              localArrayList.add(locale);
              n++;
              break;
              bool = false;
              break label261;
              label378: i3 = (i2 + 1) * m;
              break label282;
            }
          }
        }
        this.aJd.put(Integer.valueOf(i), localArrayList);
        if (i != 1)
        {
          i /= 2;
          break;
        }
        AppMethodBeat.o(115688);
        return;
        i1 = n;
      }
  }

  private static float d(long paramLong1, float paramFloat1, float paramFloat2, long paramLong2)
  {
    float f = (float)paramLong1 / ((float)paramLong2 / 2.0F);
    if (f < 1.0F);
    for (paramFloat1 = f * (paramFloat2 / 2.0F * f) + paramFloat1; ; paramFloat1 = (f * (f - 2.0F) - 1.0F) * (-paramFloat2 / 2.0F) + paramFloat1)
    {
      return paramFloat1;
      f -= 1.0F;
    }
  }

  private void d(PointF paramPointF)
  {
    AppMethodBeat.i(115730);
    if ((this.aKd != null) && (!this.aJw.equals(paramPointF)))
      getCenter();
    AppMethodBeat.o(115730);
  }

  private PointF g(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(115705);
    int i = getPaddingLeft();
    int j = (getWidth() - getPaddingRight() - getPaddingLeft()) / 2;
    int k = getPaddingTop();
    int m = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2;
    if (this.aKj == null)
      this.aKj = new SubsamplingScaleImageView.g(0.0F, new PointF(0.0F, 0.0F), (byte)0);
    this.aKj.scale = paramFloat3;
    this.aKj.aJw.set(i + j - paramFloat1 * paramFloat3, k + m - paramFloat2 * paramFloat3);
    a(true, this.aKj);
    PointF localPointF = this.aKj.aJw;
    AppMethodBeat.o(115705);
    return localPointF;
  }

  private float getDoubleTapZoomScale()
  {
    float f1 = this.aKy;
    if (this.aKw * 0.7F > f1)
      f1 = this.aKw;
    while (true)
    {
      float f2 = f1;
      if (f1 < 1.0D)
        f2 = 1.0F;
      f1 = f2;
      if (f2 > this.aJf)
        f1 = this.aJf;
      return f1;
      if (this.aKx * 0.7F > f1)
        f1 = this.aKx;
      else
        f1 = this.aKy * this.aJr;
    }
  }

  public static Bitmap.Config getPreferredBitmapConfig()
  {
    return aKp;
  }

  private void oA()
  {
    AppMethodBeat.i(115665);
    this.aJg = Math.min(oJ(), this.aKy * 0.75F);
    AppMethodBeat.o(115665);
  }

  private boolean oB()
  {
    boolean bool1 = true;
    AppMethodBeat.i(115679);
    if ((this.bitmap != null) && (!this.aIS))
      AppMethodBeat.o(115679);
    while (true)
    {
      return bool1;
      if (this.aJd != null)
      {
        Iterator localIterator1 = this.aJd.entrySet().iterator();
        boolean bool2;
        for (bool1 = true; localIterator1.hasNext(); bool1 = bool2)
        {
          Object localObject = (Map.Entry)localIterator1.next();
          bool2 = bool1;
          if (((Integer)((Map.Entry)localObject).getKey()).intValue() == this.aIY)
          {
            Iterator localIterator2 = ((List)((Map.Entry)localObject).getValue()).iterator();
            while (true)
            {
              bool2 = bool1;
              if (!localIterator2.hasNext())
                break;
              localObject = (com.davemorrissey.labs.subscaleview.c.e)localIterator2.next();
              if ((((com.davemorrissey.labs.subscaleview.c.e)localObject).aIA) || (((com.davemorrissey.labs.subscaleview.c.e)localObject).bitmap == null))
                bool1 = false;
            }
          }
        }
        AppMethodBeat.o(115679);
      }
      else
      {
        AppMethodBeat.o(115679);
        bool1 = false;
      }
    }
  }

  private boolean oC()
  {
    AppMethodBeat.i(115680);
    if ((getWidth() > 0) && (getHeight() > 0) && (this.aIJ > 0) && (this.aIK > 0) && ((this.bitmap != null) || (oB())));
    for (boolean bool = true; ; bool = false)
    {
      if ((!this.aKa) && (bool))
      {
        oE();
        this.aKa = true;
      }
      AppMethodBeat.o(115680);
      return bool;
    }
  }

  private boolean oD()
  {
    AppMethodBeat.i(115681);
    boolean bool = oB();
    if ((!this.aKb) && (bool))
    {
      oE();
      this.aKb = true;
      ab.i(this.TAG, "alvinluo onImageLoaded");
      oy();
      a(this.aKy, new PointF(0.0F, 0.0F));
      if (this.aJa != -1L)
      {
        this.aJb = System.currentTimeMillis();
        dq((int)(this.aJb - this.aJa));
      }
      com.tencent.mm.sdk.g.d.post(new SubsamplingScaleImageView.7(this), "rotateAndScaleFullImageBitmap");
    }
    AppMethodBeat.o(115681);
    return bool;
  }

  private void oE()
  {
    AppMethodBeat.i(115684);
    if ((getWidth() == 0) || (getHeight() == 0) || (this.aIJ <= 0) || (this.aIK <= 0))
      AppMethodBeat.o(115684);
    while (true)
    {
      return;
      if ((this.aJA != null) && (this.aJz != null))
      {
        this.scale = this.aJz.floatValue();
        if (this.aJw == null)
          this.aJw = new PointF();
        this.aJw.x = (getWidth() / 2 - this.scale * this.aJA.x);
        this.aJw.y = (getHeight() / 2 - this.scale * this.aJA.y);
        this.aJA = null;
        this.aJz = null;
        this.aJC = false;
        aA(true);
        az(true);
      }
      aA(false);
      AppMethodBeat.o(115684);
    }
  }

  private int oF()
  {
    AppMethodBeat.i(115696);
    int i;
    if ((this.bitmap == null) || (!this.aIS))
    {
      i = 0;
      AppMethodBeat.o(115696);
    }
    while (true)
    {
      return i;
      i = this.aJG;
      if ((i == 90) || (i == 270))
      {
        i = this.bitmap.getHeight();
        AppMethodBeat.o(115696);
      }
      else
      {
        i = this.bitmap.getWidth();
        AppMethodBeat.o(115696);
      }
    }
  }

  private int oG()
  {
    AppMethodBeat.i(115697);
    int i;
    if ((this.bitmap == null) || (!this.aIS))
    {
      i = 0;
      AppMethodBeat.o(115697);
    }
    while (true)
    {
      return i;
      i = this.aJG;
      if ((i == 90) || (i == 270))
      {
        i = this.bitmap.getWidth();
        AppMethodBeat.o(115697);
      }
      else
      {
        i = this.bitmap.getHeight();
        AppMethodBeat.o(115697);
      }
    }
  }

  private int oH()
  {
    AppMethodBeat.i(115698);
    int i = getRequiredRotation();
    if ((i == 90) || (i == 270))
    {
      i = this.aIK;
      AppMethodBeat.o(115698);
    }
    while (true)
    {
      return i;
      i = this.aIJ;
      AppMethodBeat.o(115698);
    }
  }

  private int oI()
  {
    AppMethodBeat.i(115699);
    int i = getRequiredRotation();
    if ((i == 90) || (i == 270))
    {
      i = this.aIJ;
      AppMethodBeat.o(115699);
    }
    while (true)
    {
      return i;
      i = this.aIK;
      AppMethodBeat.o(115699);
    }
  }

  private float oJ()
  {
    AppMethodBeat.i(115706);
    int i = getPaddingBottom() + getPaddingTop();
    int j = getPaddingLeft() + getPaddingRight();
    float f;
    if ((this.aJj == 2) || (this.aJj == 4))
    {
      f = Math.max((getWidth() - j) / oH(), (getHeight() - i) / oI());
      AppMethodBeat.o(115706);
    }
    while (true)
    {
      return f;
      if ((this.aJj == 3) && (this.aJg > 0.0F))
      {
        f = this.aJg;
        AppMethodBeat.o(115706);
      }
      else
      {
        f = Math.min((getWidth() - j) / oH(), (getHeight() - i) / oI());
        AppMethodBeat.o(115706);
      }
    }
  }

  private void oy()
  {
    AppMethodBeat.i(115663);
    ab.i(this.TAG, "alvinluo initScaleRate: %f", new Object[] { Float.valueOf(this.aKy) });
    oz();
    oA();
    AppMethodBeat.o(115663);
  }

  private void oz()
  {
    AppMethodBeat.i(115664);
    this.aJf = (getDoubleTapZoomScale() * 2.0F * this.aKB);
    AppMethodBeat.o(115664);
  }

  private int px(int paramInt)
  {
    return (int)(this.density * paramInt);
  }

  private void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    AppMethodBeat.i(115675);
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
    {
      ab.i(this.TAG, "alvinluo requestDisallowInterceptTouchEvent disallow: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    AppMethodBeat.o(115675);
  }

  private void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(115669);
    j("reset newImage=".concat(String.valueOf(paramBoolean)), new Object[0]);
    this.scale = 0.0F;
    this.aJv = 0.0F;
    this.aJw = null;
    this.aJx = null;
    this.aJy = null;
    this.aJz = Float.valueOf(0.0F);
    this.aJA = null;
    this.aJB = null;
    this.aJI = false;
    this.aJJ = false;
    this.aJK = false;
    this.aJL = 0;
    this.aIY = 0;
    this.aJR = null;
    this.aJS = 0.0F;
    this.aJU = 0.0F;
    this.aJV = false;
    this.aJX = null;
    this.aJW = null;
    this.aJY = null;
    this.aJZ = null;
    this.aKj = null;
    this.aKk = null;
    this.aKl = null;
    Object localObject1;
    if (paramBoolean)
    {
      if (this.aKH != null)
      {
        localObject1 = this.aKH;
        ((com.davemorrissey.labs.subscaleview.d.a)localObject1).aIG = 0;
        ((com.davemorrissey.labs.subscaleview.d.a)localObject1).aIE = 0;
        ((com.davemorrissey.labs.subscaleview.d.a)localObject1).aIG = 0;
      }
      this.uri = null;
      this.aIo.writeLock().lock();
    }
    try
    {
      if (this.aIw != null)
      {
        this.aIw.recycle();
        this.aIw = null;
      }
      this.aIo.writeLock().unlock();
      if ((this.bitmap != null) && (!this.aIX))
        this.bitmap.recycle();
      if ((this.bitmap != null) && (this.aIX) && (this.aKc != null))
        this.aKc.oM();
      this.aIJ = 0;
      this.aIK = 0;
      this.aJF = 0;
      this.aIL = null;
      this.aJH = null;
      this.aKa = false;
      this.aKb = false;
      this.bitmap = null;
      this.aIS = false;
      this.aIX = false;
      this.aIT = false;
      this.aIU = false;
      this.aIZ = true;
      if (this.aJd != null)
      {
        com.davemorrissey.labs.subscaleview.c.e locale;
        do
        {
          localObject1 = this.aJd.entrySet().iterator();
          Iterator localIterator;
          while (!localIterator.hasNext())
          {
            if (!((Iterator)localObject1).hasNext())
              break;
            localIterator = ((List)((Map.Entry)((Iterator)localObject1).next()).getValue()).iterator();
          }
          locale = (com.davemorrissey.labs.subscaleview.c.e)localIterator.next();
          locale.aIB = false;
        }
        while (locale.bitmap == null);
        locale.bitmap.recycle();
        locale.bitmap = null;
      }
    }
    finally
    {
      this.aIo.writeLock().unlock();
      AppMethodBeat.o(115669);
    }
    AppMethodBeat.o(115669);
  }

  public static void setBitmapLoaderImp(com.davemorrissey.labs.subscaleview.c.a parama)
  {
    aKq = parama;
  }

  private void setFullImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115690);
    com.tencent.mm.sdk.g.d.post(new SubsamplingScaleImageView.5(this, paramBitmap), "rotateAndScaleBitmap");
    AppMethodBeat.o(115690);
  }

  private void setGestureDetector(Context paramContext)
  {
    AppMethodBeat.i(115670);
    this.aJM = new GestureDetector(paramContext, new SubsamplingScaleImageView.3(this, paramContext));
    this.aJO = new GestureDetector(paramContext, new SubsamplingScaleImageView.4(this));
    AppMethodBeat.o(115670);
  }

  public static void setPreferredBitmapConfig(Bitmap.Config paramConfig)
  {
    aKp = paramConfig;
  }

  public static void setTileInitLoaderImp(com.davemorrissey.labs.subscaleview.c.c paramc)
  {
    aKs = paramc;
  }

  public static void setTileLoaderImp(com.davemorrissey.labs.subscaleview.c.d paramd)
  {
    aKr = paramd;
  }

  public final Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(115692);
    if (paramBitmap == null)
    {
      ab.e(this.TAG, "alvinluo rotateAndScaleBitmap bitmap is null");
      AppMethodBeat.o(115692);
      paramBitmap = null;
    }
    while (true)
    {
      return paramBitmap;
      Matrix localMatrix = new Matrix();
      localMatrix.postScale(1.0F, 1.0F);
      if (paramInt != 0)
        localMatrix.postRotate(paramInt);
      ab.d(this.TAG, "alvinluo rotateAndScaleBitmap matrix.isIdentify: %b", new Object[] { Boolean.valueOf(localMatrix.isIdentity()) });
      if ((paramBitmap.getWidth() > 0) && (paramBitmap.getHeight() > 0))
      {
        if (localMatrix.isIdentity())
          AppMethodBeat.o(115692);
        else
          try
          {
            paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
            AppMethodBeat.o(115692);
          }
          catch (OutOfMemoryError paramBitmap)
          {
            ab.printErrStackTrace(this.TAG, paramBitmap, "alvinluo createBitmap oom", new Object[0]);
            aKp = Bitmap.Config.RGB_565;
            AppMethodBeat.o(115692);
            paramBitmap = null;
          }
      }
      else
      {
        AppMethodBeat.o(115692);
        paramBitmap = null;
      }
    }
  }

  public final void a(float paramFloat, PointF paramPointF)
  {
    AppMethodBeat.i(115721);
    this.aJZ = null;
    this.aJC = true;
    this.aJz = Float.valueOf(paramFloat);
    this.aJA = paramPointF;
    this.aJB = paramPointF;
    invalidate();
    AppMethodBeat.o(115721);
  }

  public final void a(Bitmap paramBitmap, Integer paramInteger)
  {
    boolean bool1 = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(115693);
        ab.i(this.TAG, "alvinluo onPreviewLoaded");
        long l = System.currentTimeMillis();
        if (this.aKb)
        {
          if (this.bitmap != null)
            this.bitmap.recycle();
          AppMethodBeat.o(115693);
          return;
        }
        if (this.aJH != null)
        {
          if ((this.aJH.width() > 0) && (this.aJH.height() > 0))
          {
            this.bitmap = Bitmap.createBitmap(paramBitmap, this.aJH.left, this.aJH.top, this.aJH.width(), this.aJH.height());
            this.aJG = 0;
          }
          this.aIS = true;
          this.aIU = false;
          this.aIV = this.bitmap.getWidth();
          this.aIW = this.bitmap.getHeight();
          if ((this.bitmap != null) && (this.aIS))
          {
            int i = oH();
            int j = oI();
            if (i <= j * 2.2F)
              break label456;
            k = 1;
            if (j <= i * 2.2F)
              break label462;
            m = 1;
            if ((k == 0) || (i <= this.aKu))
              break label468;
            bool2 = true;
            if ((m == 0) || (j <= this.aKv))
              break label474;
            oy();
            if (!bool1)
              break label479;
            this.aKz = (this.aKu * 1.0F / oF());
            this.aKA = (this.aKv * 1.0F / oG());
            ab.i(this.TAG, "alvinluo initPreviewScaleRate previewWidthScale: %f, previewHeightScale: %f, previewHeight: %d, previewWidth: %d, verticalLong: %b, horizontalLong: %b", new Object[] { Float.valueOf(this.aKz), Float.valueOf(this.aKA), Integer.valueOf(oG()), Integer.valueOf(oF()), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          }
          this.aIU = true;
          if (oC())
          {
            invalidate();
            requestLayout();
          }
          dp((int)(System.currentTimeMillis() - l));
          ab.i(this.TAG, "alvinluo onPreviewLoaded");
          if ((!this.aIT) && (this.aKc != null))
            this.aKc.oL();
          AppMethodBeat.o(115693);
          continue;
        }
      }
      finally
      {
      }
      if (paramInteger != null)
        this.aJG = paramInteger.intValue();
      this.bitmap = paramBitmap;
      continue;
      label456: int k = 0;
      continue;
      label462: int m = 0;
      continue;
      label468: boolean bool2 = false;
      continue;
      label474: bool1 = false;
      continue;
      label479: if (bool2)
      {
        this.aKz = (this.aKu * 1.0F / oF());
        this.aKA = (this.aKy * oI() / oG());
      }
      else
      {
        this.aKz = (this.aKy * oH() / oF());
        this.aKA = (this.aKy * oI() / oG());
      }
    }
  }

  public final void a(com.davemorrissey.labs.subscaleview.a.d paramd, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(115689);
      j("alvinluo onTilesInited sWidth: %d, sHeight: %d, this.sWidth: %d, this.sHeight: %d, sOrientation: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.aIJ), Integer.valueOf(this.aIK), Integer.valueOf(paramInt3) });
      if ((this.aIJ > 0) && (this.aIK > 0) && ((this.aIJ != paramInt1) || (this.aIK != paramInt2)))
      {
        reset(false);
        if (this.bitmap != null)
        {
          if (!this.aIX)
            this.bitmap.recycle();
          this.bitmap = null;
          if ((this.aKc != null) && (this.aIX))
            this.aKc.oM();
          this.aIS = false;
          this.aIX = false;
        }
      }
      this.aIw = paramd;
      this.aIJ = paramInt1;
      this.aIK = paramInt2;
      this.aJF = paramInt3;
      oC();
      if ((!oD()) && (this.aJl > 0) && (this.aJl != aJk) && (this.aJm > 0) && (this.aJm != aJk) && (getWidth() > 0) && (getHeight() > 0))
      {
        paramd = new android/graphics/Point;
        paramd.<init>(this.aJl, this.aJm);
        b(paramd);
      }
      invalidate();
      requestLayout();
      System.currentTimeMillis();
      AppMethodBeat.o(115689);
      return;
    }
    finally
    {
    }
    throw paramd;
  }

  public final void a(a parama1, a parama2)
  {
    AppMethodBeat.i(115668);
    if (parama1 == null)
    {
      parama1 = new NullPointerException("imageSource must not be null");
      AppMethodBeat.o(115668);
      throw parama1;
    }
    reset(true);
    this.aJD = parama1;
    this.aJE = parama2;
    if (parama1.uri != null)
      this.aJF = h(getContext(), parama1.uri.toString());
    if (parama2 != null)
    {
      if ((parama1.aIJ <= 0) || (parama1.aIK <= 0))
        ab.e(this.TAG, "alvinluo Preview image cannot be used unless dimensions are provided for the main image");
    }
    else
    {
      if ((parama1.bitmap == null) || (parama1.aIL == null))
        break label305;
      b(Bitmap.createBitmap(parama1.bitmap, parama1.aIL.left, parama1.aIL.top, parama1.aIL.width(), parama1.aIL.height()), 0, false);
      AppMethodBeat.o(115668);
    }
    while (true)
    {
      return;
      this.aIJ = parama1.aIJ;
      this.aIK = parama1.aIK;
      this.aJH = parama2.aIL;
      if (parama2.bitmap != null)
      {
        this.aIX = parama2.aIM;
        a(parama2.bitmap, Integer.valueOf(0));
        break;
      }
      Uri localUri1 = parama2.uri;
      Uri localUri2 = localUri1;
      if (localUri1 == null)
      {
        localUri2 = localUri1;
        if (parama2.aIH != null)
          localUri2 = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + parama2.aIH);
      }
      aKq.a(this, getContext(), this.aJP, localUri2, true).ou();
      break;
      label305: if (parama1.bitmap != null)
      {
        b(parama1.bitmap, 0, parama1.aIM);
        AppMethodBeat.o(115668);
      }
      else
      {
        this.aIL = parama1.aIL;
        this.uri = parama1.uri;
        if ((this.uri == null) && (parama1.aIH != null))
          this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + parama1.aIH);
        if ((parama1.aII) || (this.aIL != null))
        {
          aKs.a(this, getContext(), this.aJQ, this.uri).ou();
          AppMethodBeat.o(115668);
        }
        else
        {
          aKq.a(this, getContext(), this.aJP, this.uri, false).ou();
          AppMethodBeat.o(115668);
        }
      }
    }
  }

  public final PointF b(PointF paramPointF)
  {
    AppMethodBeat.i(115701);
    paramPointF = a(paramPointF.x, paramPointF.y, new PointF());
    AppMethodBeat.o(115701);
    return paramPointF;
  }

  public final void b(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(115694);
      j("onImageLoaded has bitmap", new Object[0]);
      if ((this.aIJ > 0) && (this.aIK > 0) && ((this.aIJ != paramBitmap.getWidth()) || (this.aIK != paramBitmap.getHeight())))
        reset(false);
      if ((this.bitmap != null) && (!this.aIX))
        this.bitmap.recycle();
      if ((this.bitmap != null) && (this.aIX) && (this.aKc != null))
        this.aKc.oM();
      this.aIS = false;
      this.aIX = paramBoolean;
      this.bitmap = paramBitmap;
      this.aIJ = paramBitmap.getWidth();
      this.aIK = paramBitmap.getHeight();
      this.aJF = paramInt;
      paramBoolean = oC();
      boolean bool = oD();
      SubsamplingScaleImageView.6 local6 = new com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$6;
      local6.<init>(this, paramInt, paramBitmap, paramBoolean, bool);
      com.tencent.mm.sdk.g.d.post(local6, "rotateAndScaleBitmap");
      AppMethodBeat.o(115694);
      return;
    }
    finally
    {
    }
    throw paramBitmap;
  }

  public final void b(com.davemorrissey.labs.subscaleview.c.e parame)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(115691);
      this.aJa = System.currentTimeMillis();
      String str = this.TAG;
      int i = parame.sampleSize;
      if (parame.bitmap == null);
      while (true)
      {
        ab.d(str, "alvinluo onTileLoaded sampleSize: %d, bitmap == null: %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
        if ((parame.sampleSize == this.aIY) && (parame.bitmap != null) && (this.aIZ))
        {
          ab.i(this.TAG, "alvinluo onTileLoaded set fullImageBitmap");
          this.aIZ = false;
          this.aJc = parame.bitmap;
        }
        oC();
        oD();
        if ((oB()) && (this.bitmap != null))
        {
          if (!this.aIX)
            this.bitmap.recycle();
          this.bitmap = null;
          if ((this.aKc != null) && (this.aIX))
            this.aKc.oM();
          this.aIS = false;
          this.aIX = false;
        }
        invalidate();
        AppMethodBeat.o(115691);
        return;
        bool = false;
      }
    }
    finally
    {
    }
    throw parame;
  }

  public final PointF c(PointF paramPointF)
  {
    AppMethodBeat.i(115703);
    paramPointF = b(paramPointF.x, paramPointF.y, new PointF());
    AppMethodBeat.o(115703);
    return paramPointF;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115673);
    ab.d(this.TAG, "alvinluo SubsamplingScaleImageView dispatchTouchEvent");
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(115673);
    return bool;
  }

  public final void jdMethod_do(int paramInt)
  {
    try
    {
      AppMethodBeat.i(115653);
      if (this.aKH != null)
      {
        com.davemorrissey.labs.subscaleview.d.a locala = this.aKH;
        locala.aIF += paramInt;
        ab.d("MicroMsg.ImageDecodeRecord", "alvinluo addTileInitTime: %d, total: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locala.aIF) });
      }
      AppMethodBeat.o(115653);
      return;
    }
    finally
    {
    }
  }

  public final void dp(int paramInt)
  {
    try
    {
      AppMethodBeat.i(115654);
      if (this.aKH != null)
      {
        com.davemorrissey.labs.subscaleview.d.a locala = this.aKH;
        locala.aIE += paramInt;
        ab.d("MicroMsg.ImageDecodeRecord", "alvinluo addPreviewLoadedTime: %d, total: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locala.aIE) });
      }
      AppMethodBeat.o(115654);
      return;
    }
    finally
    {
    }
  }

  public final void dq(int paramInt)
  {
    try
    {
      AppMethodBeat.i(115655);
      if (this.aKH != null)
      {
        com.davemorrissey.labs.subscaleview.d.a locala = this.aKH;
        locala.aIG += paramInt;
        ab.d("MicroMsg.ImageDecodeRecord", "alvinluo addTileDecodeTime: %d, total: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locala.aIG) });
      }
      AppMethodBeat.o(115655);
      return;
    }
    finally
    {
    }
  }

  public final int getAppliedOrientation()
  {
    AppMethodBeat.i(115722);
    int i = getRequiredRotation();
    AppMethodBeat.o(115722);
    return i;
  }

  public final PointF getCenter()
  {
    AppMethodBeat.i(115720);
    int i = getWidth() / 2;
    int j = getHeight() / 2;
    PointF localPointF = a(i, j, new PointF());
    AppMethodBeat.o(115720);
    return localPointF;
  }

  public ReadWriteLock getDecoderLock()
  {
    return this.aIo;
  }

  public Bitmap getFullImageBitmap()
  {
    return this.aJc;
  }

  public int getFullImageSampleSize()
  {
    return this.aIY;
  }

  public com.davemorrissey.labs.subscaleview.d.a getImageDecodeRecord()
  {
    try
    {
      com.davemorrissey.labs.subscaleview.d.a locala = this.aKH;
      return locala;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public float getMaxScale()
  {
    return this.aJf;
  }

  public final float getMinScale()
  {
    AppMethodBeat.i(115718);
    float f = oJ();
    AppMethodBeat.o(115718);
    return f;
  }

  public SubsamplingScaleImageView.e getOnImageEventListener()
  {
    return this.aKc;
  }

  public final int getOrientation()
  {
    return this.orientation;
  }

  public int getPreviewHeight()
  {
    return this.aIW;
  }

  public int getPreviewOrientation()
  {
    return this.aJG;
  }

  public int getPreviewWidth()
  {
    return this.aIV;
  }

  public int getRequiredRotation()
  {
    if (this.orientation == -1);
    for (int i = this.aJF; ; i = this.orientation)
      return i;
  }

  public final int getSHeight()
  {
    return this.aIK;
  }

  public final int getSWidth()
  {
    return this.aIJ;
  }

  public final float getScale()
  {
    return this.scale;
  }

  public final b getState()
  {
    AppMethodBeat.i(115723);
    b localb;
    if ((this.aJw != null) && (this.aIJ > 0) && (this.aIK > 0))
    {
      localb = new b(getScale(), getCenter(), getOrientation());
      AppMethodBeat.o(115723);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(115723);
    }
  }

  public Rect getsRegion()
  {
    return this.aIL;
  }

  // ERROR //
  public final int h(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: ldc_w 1401
    //   8: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_2
    //   12: ldc_w 1403
    //   15: invokevirtual 1407	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   18: ifeq +184 -> 202
    //   21: aload_1
    //   22: invokevirtual 1411	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   25: aload_2
    //   26: invokestatic 1305	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   29: iconst_1
    //   30: anewarray 452	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc_w 1412
    //   38: aastore
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: invokevirtual 1418	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   45: astore_1
    //   46: aload_1
    //   47: ifnull +88 -> 135
    //   50: aload_1
    //   51: invokeinterface 1423 1 0
    //   56: ifeq +79 -> 135
    //   59: aload_1
    //   60: iconst_0
    //   61: invokeinterface 1426 2 0
    //   66: istore 5
    //   68: getstatic 202	com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView:aIN	Ljava/util/List;
    //   71: iload 5
    //   73: invokestatic 194	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: invokeinterface 1429 2 0
    //   81: istore 6
    //   83: iload 6
    //   85: ifeq +32 -> 117
    //   88: iload 5
    //   90: iconst_m1
    //   91: if_icmpeq +26 -> 117
    //   94: iload 5
    //   96: istore 4
    //   98: aload_1
    //   99: ifnull +96 -> 195
    //   102: aload_1
    //   103: invokeinterface 1432 1 0
    //   108: ldc_w 1401
    //   111: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: iload 5
    //   116: ireturn
    //   117: aload_0
    //   118: getfield 272	com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView:TAG	Ljava/lang/String;
    //   121: ldc_w 1434
    //   124: iload 5
    //   126: invokestatic 585	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   129: invokevirtual 471	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   132: invokestatic 1436	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: iconst_0
    //   136: istore 5
    //   138: goto -44 -> 94
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_1
    //   144: aload_0
    //   145: getfield 272	com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView:TAG	Ljava/lang/String;
    //   148: ldc_w 1438
    //   151: invokestatic 1436	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: aload_1
    //   155: ifnull +37 -> 192
    //   158: aload_1
    //   159: invokeinterface 1432 1 0
    //   164: iload 4
    //   166: istore 5
    //   168: goto -60 -> 108
    //   171: astore_1
    //   172: aload_3
    //   173: astore_2
    //   174: aload_2
    //   175: ifnull +9 -> 184
    //   178: aload_2
    //   179: invokeinterface 1432 1 0
    //   184: ldc_w 1401
    //   187: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_1
    //   191: athrow
    //   192: iconst_0
    //   193: istore 4
    //   195: iload 4
    //   197: istore 5
    //   199: goto -91 -> 108
    //   202: iload 4
    //   204: istore 5
    //   206: aload_2
    //   207: ldc_w 1440
    //   210: invokevirtual 1407	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   213: ifeq -105 -> 108
    //   216: iload 4
    //   218: istore 5
    //   220: aload_2
    //   221: ldc_w 464
    //   224: invokevirtual 1407	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   227: ifne -119 -> 108
    //   230: new 1442	android/support/d/a
    //   233: astore_1
    //   234: aload_1
    //   235: aload_2
    //   236: bipush 7
    //   238: invokevirtual 1445	java/lang/String:substring	(I)Ljava/lang/String;
    //   241: invokespecial 1446	android/support/d/a:<init>	(Ljava/lang/String;)V
    //   244: aload_1
    //   245: ldc_w 1448
    //   248: iconst_1
    //   249: invokevirtual 1452	android/support/d/a:getAttributeInt	(Ljava/lang/String;I)I
    //   252: istore 7
    //   254: iload 4
    //   256: istore 5
    //   258: iload 7
    //   260: iconst_1
    //   261: if_icmpeq -153 -> 108
    //   264: iload 4
    //   266: istore 5
    //   268: iload 7
    //   270: ifeq -162 -> 108
    //   273: iload 7
    //   275: bipush 6
    //   277: if_icmpne +10 -> 287
    //   280: bipush 90
    //   282: istore 5
    //   284: goto -176 -> 108
    //   287: iload 7
    //   289: iconst_3
    //   290: if_icmpne +11 -> 301
    //   293: sipush 180
    //   296: istore 5
    //   298: goto -190 -> 108
    //   301: iload 7
    //   303: bipush 8
    //   305: if_icmpne +11 -> 316
    //   308: sipush 270
    //   311: istore 5
    //   313: goto -205 -> 108
    //   316: aload_0
    //   317: getfield 272	com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView:TAG	Ljava/lang/String;
    //   320: ldc_w 1454
    //   323: iload 7
    //   325: invokestatic 585	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   328: invokevirtual 471	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   331: invokestatic 1436	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: iload 4
    //   336: istore 5
    //   338: goto -230 -> 108
    //   341: astore_1
    //   342: aload_0
    //   343: getfield 272	com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView:TAG	Ljava/lang/String;
    //   346: ldc_w 1456
    //   349: invokestatic 1436	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   352: iload 4
    //   354: istore 5
    //   356: goto -248 -> 108
    //   359: astore_3
    //   360: aload_1
    //   361: astore_2
    //   362: aload_3
    //   363: astore_1
    //   364: goto -190 -> 174
    //   367: astore_2
    //   368: aload_1
    //   369: astore_3
    //   370: aload_2
    //   371: astore_1
    //   372: aload_3
    //   373: astore_2
    //   374: goto -200 -> 174
    //   377: astore_2
    //   378: goto -234 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   21	46	141	java/lang/Exception
    //   21	46	171	finally
    //   230	254	341	java/lang/Exception
    //   316	334	341	java/lang/Exception
    //   50	83	359	finally
    //   117	135	359	finally
    //   144	154	367	finally
    //   50	83	377	java/lang/Exception
    //   117	135	377	java/lang/Exception
  }

  public final void j(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115709);
    ab.d(this.TAG, String.format(paramString, paramArrayOfObject));
    AppMethodBeat.o(115709);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(115656);
    super.onAttachedToWindow();
    if (this.aKG != null)
      this.aKG.onViewAttachedToWindow(this);
    this.cancelled = false;
    AppMethodBeat.o(115656);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(115657);
    super.onDetachedFromWindow();
    if (!this.cancelled)
    {
      this.cancelled = true;
      ab.i(this.TAG, "alvinluo cancelAllTileLoadTask, task size: %d", new Object[] { Integer.valueOf(this.aKt.size()) });
      Iterator localIterator = this.aKt.iterator();
      while (localIterator.hasNext())
        ((com.davemorrissey.labs.subscaleview.c.b)localIterator.next()).cancel();
      this.aKt.clear();
    }
    if (this.aKG != null)
      this.aKG.onViewDetachedFromWindow(this);
    AppMethodBeat.o(115657);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(115678);
    super.onDraw(paramCanvas);
    System.currentTimeMillis();
    if (this.aKf == null)
    {
      this.aKf = new Paint();
      this.aKf.setAntiAlias(true);
      this.aKf.setFilterBitmap(true);
      this.aKf.setDither(true);
    }
    if (((this.aKg == null) || (this.aKh == null)) && (this.aJe))
    {
      this.aKg = new Paint();
      this.aKg.setTextSize(px(20));
      this.aKg.setColor(-65281);
      this.aKg.setStyle(Paint.Style.FILL);
      this.aKh = new Paint();
      this.aKh.setColor(-65281);
      this.aKh.setStyle(Paint.Style.STROKE);
      this.aKh.setStrokeWidth(px(1));
    }
    if ((this.aIJ == 0) || (this.aIK == 0) || (getWidth() == 0) || (getHeight() == 0))
      AppMethodBeat.o(115678);
    int i;
    int j;
    while (true)
    {
      return;
      if ((this.aJd == null) && (this.aIw != null))
      {
        i = Math.min(paramCanvas.getMaximumBitmapWidth(), this.aJl);
        j = Math.min(paramCanvas.getMaximumBitmapHeight(), this.aJm);
        k = i;
        if (i > 10000)
          k = 10000;
        i = j;
        if (j > 10000)
          i = 10000;
        ab.i(this.TAG, "alvinluo getMaxBitmapDimensions %d, %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        b(new Point(k, i));
      }
      if (oC())
        break;
      AppMethodBeat.o(115678);
    }
    oE();
    boolean bool1;
    float f1;
    boolean bool2;
    if ((this.aJZ != null) && (this.aJZ.aKY != null))
    {
      if (this.aJy == null)
        this.aJy = new PointF(0.0F, 0.0F);
      this.aJy.set(this.aJw);
      long l = System.currentTimeMillis() - this.aJZ.time;
      if (l > this.aJZ.duration)
      {
        bool1 = true;
        l = Math.min(l, this.aJZ.duration);
        this.scale = a(this.aJZ.aLb, l, this.aJZ.aJv, this.aJZ.aKU - this.aJZ.aJv, this.aJZ.duration);
        f1 = a(this.aJZ.aLb, l, this.aJZ.aKY.x, this.aJZ.aKZ.x - this.aJZ.aKY.x, this.aJZ.duration);
        f2 = a(this.aJZ.aLb, l, this.aJZ.aKY.y, this.aJZ.aKZ.y - this.aJZ.aKY.y, this.aJZ.duration);
        localObject1 = this.aJw;
        ((PointF)localObject1).x -= Q(this.aJZ.aKW.x) - f1;
        localObject1 = this.aJw;
        ((PointF)localObject1).y -= R(this.aJZ.aKW.y) - f2;
        if ((!bool1) && (this.aJZ.aJv != this.aJZ.aKU))
          break label875;
        bool2 = true;
        label665: aA(bool2);
        d(this.aJy);
        az(bool1);
        if (bool1)
          this.aJZ = null;
        invalidate();
      }
    }
    else
    {
      if ((this.aJd == null) || (!oB()) || (!this.aKD))
        break label1787;
      j = Math.min(this.aIY, N(this.scale));
      localObject1 = this.aJd.entrySet().iterator();
    }
    Object localObject2;
    Object localObject3;
    for (int k = 0; ; k = i)
    {
      if (!((Iterator)localObject1).hasNext())
        break label887;
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      i = k;
      if (((Integer)((Map.Entry)localObject2).getKey()).intValue() == j)
      {
        localObject3 = ((List)((Map.Entry)localObject2).getValue()).iterator();
        while (true)
        {
          i = k;
          if (!((Iterator)localObject3).hasNext())
            break;
          localObject2 = (com.davemorrissey.labs.subscaleview.c.e)((Iterator)localObject3).next();
          if ((((com.davemorrissey.labs.subscaleview.c.e)localObject2).aIB) && ((((com.davemorrissey.labs.subscaleview.c.e)localObject2).aIA) || (((com.davemorrissey.labs.subscaleview.c.e)localObject2).bitmap == null)))
            k = 1;
        }
        bool1 = false;
        break;
        label875: bool2 = false;
        break label665;
      }
    }
    label887: Object localObject1 = this.aJd.entrySet().iterator();
    while (true)
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        label2084: if ((((Integer)((Map.Entry)localObject2).getKey()).intValue() == j) || (k != 0))
        {
          localObject2 = ((List)((Map.Entry)localObject2).getValue()).iterator();
          label964: label1239: label1785: 
          while (true)
          {
            com.davemorrissey.labs.subscaleview.c.e locale;
            if (((Iterator)localObject2).hasNext())
            {
              locale = (com.davemorrissey.labs.subscaleview.c.e)((Iterator)localObject2).next();
              localObject3 = locale.aIz;
              locale.aIC.set((int)Q(((Rect)localObject3).left), (int)R(((Rect)localObject3).top), (int)Q(((Rect)localObject3).right), (int)R(((Rect)localObject3).bottom));
              if ((locale.aIA) || (locale.bitmap == null))
                break label1727;
              if (this.aKi != null)
                paramCanvas.drawRect(locale.aIC, this.aKi);
              if (this.aKk == null)
                this.aKk = new Matrix();
              this.aKk.reset();
              a(this.aKm, 0.0F, 0.0F, locale.bitmap.getWidth(), 0.0F, locale.bitmap.getWidth(), locale.bitmap.getHeight(), 0.0F, locale.bitmap.getHeight());
              if (getRequiredRotation() != 0)
                break label1452;
              a(this.aKn, locale.aIC.left, locale.aIC.top, locale.aIC.right, locale.aIC.top, locale.aIC.right, locale.aIC.bottom, locale.aIC.left, locale.aIC.bottom);
              this.aKk.setPolyToPoly(this.aKm, 0, this.aKn, 0, 4);
              if (!locale.bitmap.isRecycled())
                paramCanvas.drawBitmap(locale.bitmap, this.aKk, this.aKf);
              if (this.aJe)
                paramCanvas.drawRect(locale.aIC, this.aKh);
            }
            while (true)
            {
              if ((!locale.aIB) || (!this.aJe))
                break label1785;
              paramCanvas.drawText("ISS " + locale.sampleSize + " RECT " + locale.aIz.top + "," + locale.aIz.left + "," + locale.aIz.bottom + "," + locale.aIz.right, locale.aIC.left + px(5), locale.aIC.top + px(15), this.aKg);
              break label964;
              break;
              if (getRequiredRotation() == 90)
              {
                a(this.aKn, locale.aIC.right, locale.aIC.top, locale.aIC.right, locale.aIC.bottom, locale.aIC.left, locale.aIC.bottom, locale.aIC.left, locale.aIC.top);
                break label1239;
              }
              if (getRequiredRotation() == 180)
              {
                a(this.aKn, locale.aIC.right, locale.aIC.bottom, locale.aIC.left, locale.aIC.bottom, locale.aIC.left, locale.aIC.top, locale.aIC.right, locale.aIC.top);
                break label1239;
              }
              if (getRequiredRotation() != 270)
                break label1239;
              a(this.aKn, locale.aIC.left, locale.aIC.bottom, locale.aIC.left, locale.aIC.top, locale.aIC.right, locale.aIC.top, locale.aIC.right, locale.aIC.bottom);
              break label1239;
              if ((locale.aIA) && (this.aJe))
                paramCanvas.drawText("LOADING", locale.aIC.left + px(5), locale.aIC.top + px(35), this.aKg);
            }
          }
          label1452: label1727: label1787: if ((this.bitmap != null) && (!this.bitmap.isRecycled()))
          {
            ab.d(this.TAG, "alvinluo onDraw bitmap scale: %f", new Object[] { Float.valueOf(this.scale) });
            if ((!this.aIS) || (this.aIU))
            {
              if (this.aKk == null)
                this.aKk = new Matrix();
              this.aKk.reset();
              i = this.bitmap.getWidth();
              k = this.bitmap.getHeight();
              if ((this.aJG == 90) || (this.aJG == 270))
              {
                i = this.bitmap.getHeight();
                k = this.bitmap.getWidth();
              }
              if (this.aIS)
              {
                f2 = i / 2.0F;
                f1 = k / 2.0F;
                this.aKk.postScale(this.aKz, this.aKA, f2, f1);
              }
              f1 = (this.aKu - this.bitmap.getWidth()) / 2;
              f2 = (this.aKv - this.bitmap.getHeight()) / 2;
              this.aKk.postTranslate(f1, f2);
              ab.d(this.TAG, "alvinluo onDraw offsetX: %f, offsetY: %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
              if (this.aKi != null)
              {
                if (this.aKl == null)
                  this.aKl = new RectF();
                localObject1 = this.aKl;
                if (!this.aIS)
                  break label2879;
                f1 = this.bitmap.getWidth();
                if (!this.aIS)
                  break label2889;
              }
            }
          }
        }
      }
    label2879: label2889: for (float f2 = this.bitmap.getHeight(); ; f2 = this.aIK)
    {
      ((RectF)localObject1).set(0.0F, 0.0F, f1, f2);
      this.aKk.mapRect(this.aKl);
      paramCanvas.drawRect(this.aKl, this.aKi);
      paramCanvas.drawBitmap(this.bitmap, this.aKk, this.aKf);
      if (this.aJe)
      {
        ab.d(this.TAG, "alvinluo onDraw debug vTranslate %f, %f", new Object[] { Float.valueOf(this.aJw.x), Float.valueOf(this.aJw.y) });
        paramCanvas.drawText("Scale: " + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(this.scale) }) + " (" + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(oJ()) }) + " - " + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(this.aJf) }) + ")", px(5), px(15), this.aKg);
        paramCanvas.drawText("Translate: " + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(this.aJw.x) }) + ":" + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(this.aJw.y) }), px(5), px(30), this.aKg);
        localObject1 = getCenter();
        paramCanvas.drawText("Source center: " + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(((PointF)localObject1).x) }) + ":" + String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(((PointF)localObject1).y) }), px(5), px(45), this.aKg);
        if (this.aJZ != null)
        {
          localObject3 = c(this.aJZ.aKV);
          localObject1 = c(this.aJZ.aKX);
          localObject2 = c(this.aJZ.aKW);
          paramCanvas.drawCircle(((PointF)localObject3).x, ((PointF)localObject3).y, px(10), this.aKh);
          this.aKh.setColor(-65536);
          paramCanvas.drawCircle(((PointF)localObject1).x, ((PointF)localObject1).y, px(20), this.aKh);
          this.aKh.setColor(-16776961);
          paramCanvas.drawCircle(((PointF)localObject2).x, ((PointF)localObject2).y, px(25), this.aKh);
          this.aKh.setColor(-16711681);
          paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, px(30), this.aKh);
        }
        if (this.aJR != null)
        {
          this.aKh.setColor(-65536);
          paramCanvas.drawCircle(this.aJR.x, this.aJR.y, px(20), this.aKh);
        }
        if (this.aJX != null)
        {
          this.aKh.setColor(-16776961);
          paramCanvas.drawCircle(Q(this.aJX.x), R(this.aJX.y), px(35), this.aKh);
        }
        if ((this.aJY != null) && (this.aJK))
        {
          this.aKh.setColor(-16711681);
          paramCanvas.drawCircle(this.aJY.x, this.aJY.y, px(30), this.aKh);
        }
        this.aKh.setColor(-65281);
      }
      AppMethodBeat.o(115678);
      break;
      f1 = this.aIJ;
      break label2084;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115672);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i != 1073741824)
    {
      paramInt2 = 1;
      if (j == 1073741824)
        break label161;
      j = 1;
      label48: if ((this.aIJ <= 0) || (this.aIK <= 0))
        break label218;
      if ((paramInt2 == 0) || (j == 0))
        break label167;
      paramInt2 = oH();
      paramInt1 = oI();
    }
    while (true)
    {
      paramInt2 = Math.max(paramInt2, getSuggestedMinimumWidth());
      paramInt1 = Math.max(paramInt1, getSuggestedMinimumHeight());
      setMeasuredDimension(paramInt2, paramInt1);
      this.aKu = paramInt2;
      this.aKv = paramInt1;
      ab.d(this.TAG, "alvinluo SubsamplingImageView onMeasure mViewWidth: %d, mViewHeight: %d", new Object[] { Integer.valueOf(this.aKu), Integer.valueOf(this.aKu) });
      AppMethodBeat.o(115672);
      return;
      paramInt2 = 0;
      break;
      label161: j = 0;
      break label48;
      label167: if (j != 0)
      {
        paramInt1 = (int)(oI() / oH() * k);
        paramInt2 = k;
      }
      else if (paramInt2 != 0)
      {
        paramInt2 = (int)(oH() / oI() * paramInt1);
      }
      else
      {
        label218: paramInt2 = k;
      }
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(115671);
    j("onSizeChanged %dx%d -> %dx%d scale: %f, pendingScale: %f, needPendingScale: %b", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Float.valueOf(this.scale), this.aJz, Boolean.valueOf(this.aJC) });
    oy();
    PointF localPointF = getCenter();
    if (((this.aKa) || (this.aJC)) && (localPointF != null))
    {
      this.aJZ = null;
      if (!this.aJC)
      {
        this.aJz = Float.valueOf(this.scale);
        this.aJA = localPointF;
      }
    }
    AppMethodBeat.o(115671);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115674);
    ab.d(this.TAG, "alvinluo SubSamplingScaleImageView onTouchEvent: %d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
    if ((this.aJZ != null) && (!this.aJZ.aLa))
    {
      requestDisallowInterceptTouchEvent(true);
      bool1 = true;
      AppMethodBeat.o(115674);
    }
    int i;
    while (true)
    {
      return bool1;
      this.aJZ = null;
      if (this.aJw == null)
      {
        if (this.aJO != null)
          this.aJO.onTouchEvent(paramMotionEvent);
        bool1 = true;
        AppMethodBeat.o(115674);
      }
      else if ((!this.aJK) && ((this.aJM == null) || (this.aJM.onTouchEvent(paramMotionEvent))))
      {
        this.aJI = false;
        this.aJJ = false;
        this.aJL = 0;
        bool1 = true;
        AppMethodBeat.o(115674);
      }
      else
      {
        if (this.aJx == null)
          this.aJx = new PointF(0.0F, 0.0F);
        if (this.aJy == null)
          this.aJy = new PointF(0.0F, 0.0F);
        if (this.aJR == null)
          this.aJR = new PointF(0.0F, 0.0F);
        this.aJy.set(this.aJw);
        i = paramMotionEvent.getPointerCount();
        switch (paramMotionEvent.getAction())
        {
        default:
          bool1 = false;
          label302: d(this.aJy);
          bool2 = super.onTouchEvent(paramMotionEvent);
          ab.i(this.TAG, "alvinluo onTouchEvent super: %b, handled: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
          if ((!bool1) && (!bool2))
            break label2757;
          bool1 = true;
          AppMethodBeat.o(115674);
        case 0:
        case 5:
        case 261:
        case 2:
        case 1:
        case 6:
        case 262:
        }
      }
    }
    this.aKM = paramMotionEvent.getRawX();
    this.aKN = paramMotionEvent.getRawY();
    this.aJZ = null;
    requestDisallowInterceptTouchEvent(true);
    this.aJL = Math.max(this.aJL, i);
    float f1;
    if (i >= 2)
      if (this.aJp)
      {
        f1 = b(paramMotionEvent.getX(0), paramMotionEvent.getX(1), paramMotionEvent.getY(0), paramMotionEvent.getY(1));
        this.aJv = this.scale;
        this.aJS = f1;
        this.aJx.set(this.aJw.x, this.aJw.y);
        this.aJR.set((paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2.0F, (paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2.0F);
        label509: this.handler.removeMessages(1);
      }
    while (true)
    {
      bool1 = true;
      break;
      this.aJL = 0;
      break label509;
      if (!this.aJK)
      {
        this.aJx.set(this.aJw.x, this.aJw.y);
        this.aJR.set(paramMotionEvent.getX(), paramMotionEvent.getY());
        this.handler.sendEmptyMessageDelayed(1, 600L);
      }
    }
    boolean bool2 = false;
    boolean bool1 = bool2;
    float f2;
    float f3;
    float f4;
    double d;
    float f5;
    if (this.aJL > 0)
    {
      if (i < 2)
        break label1313;
      f2 = b(paramMotionEvent.getX(0), paramMotionEvent.getX(1), paramMotionEvent.getY(0), paramMotionEvent.getY(1));
      f3 = (paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2.0F;
      f4 = (paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2.0F;
      this.aKF = new PointF(f3, f4);
      bool1 = bool2;
      if (this.aJp)
        if ((b(this.aJR.x, f3, this.aJR.y, f4) <= 5.0F) && (Math.abs(f2 - this.aJS) <= 5.0F))
        {
          bool1 = bool2;
          if (!this.aJJ);
        }
        else
        {
          this.aJI = true;
          this.aJJ = true;
          d = this.scale;
          f5 = f2 / this.aJS * this.aJv;
          f1 = f5;
          if (f5 >= this.aJf * 2.0F)
          {
            f1 = this.aJf;
            f1 = (f5 - this.aJf) * 0.1F + f1 * 2.0F;
          }
          this.scale = f1;
          ab.i(this.TAG, "alvinluo zoom preScale: %f, scale: %f, minScale: %f, maxScale: %f", new Object[] { Double.valueOf(d), Float.valueOf(this.scale), Float.valueOf(oJ()), Float.valueOf(this.aJf) });
          if (this.scale > oJ())
            break label975;
          this.aJS = f2;
          this.aJv = oJ();
          this.aJR.set(f3, f4);
          this.aJx.set(this.aJw);
        }
    }
    label933: label975: float f6;
    float f8;
    while (true)
    {
      aA(true);
      az(this.aJn);
      bool1 = true;
      ab.d(this.TAG, "alvinluo Action_Move consumed: %b", new Object[] { Boolean.valueOf(bool1) });
      if (!bool1)
        break;
      this.handler.removeMessages(1);
      invalidate();
      bool1 = true;
      break label302;
      if (this.aJo)
      {
        f6 = this.aJR.x;
        float f7 = this.aJx.x;
        f8 = this.aJR.y;
        f5 = this.aJx.y;
        float f9 = this.scale / this.aJv;
        f1 = this.scale / this.aJv;
        this.aJw.x = (f3 - (f6 - f7) * f9);
        this.aJw.y = (f4 - (f8 - f5) * f1);
        if (((oI() * d < getHeight()) && (this.scale * oI() >= getHeight())) || ((d * oH() < getWidth()) && (this.scale * oH() >= getWidth())))
        {
          aA(true);
          this.aJR.set(f3, f4);
          this.aJx.set(this.aJw);
          this.aJv = this.scale;
          this.aJS = f2;
        }
      }
      else if (this.aJB != null)
      {
        this.aJw.x = (getWidth() / 2 - this.scale * this.aJB.x);
        this.aJw.y = (getHeight() / 2 - this.scale * this.aJB.y);
      }
      else
      {
        this.aJw.x = (getWidth() / 2 - this.scale * (oH() / 2));
        this.aJw.y = (getHeight() / 2 - this.scale * (oI() / 2));
      }
    }
    label1313: if (this.aJK)
    {
      f5 = Math.abs(this.aJY.y - paramMotionEvent.getY()) * 2.0F + this.aJT;
      if (this.aJU == -1.0F)
        this.aJU = f5;
      if (paramMotionEvent.getY() > this.aJW.y)
      {
        i = 1;
        label1378: this.aJW.set(0.0F, paramMotionEvent.getY());
        f2 = 0.5F * Math.abs(1.0F - f5 / this.aJU);
        if (f2 <= 0.03F)
        {
          f1 = f5;
          if (!this.aJV);
        }
        else
        {
          this.aJV = true;
          if (this.aJU <= 0.0F)
            break label2775;
          if (i == 0)
            break label1738;
          f1 = 1.0F + f2;
        }
      }
    }
    while (true)
    {
      label1452: d = this.scale;
      this.scale = Math.max(oJ(), Math.min(this.aJf, f1 * this.scale));
      if (this.aJo)
      {
        f4 = this.aJR.x;
        f6 = this.aJx.x;
        f1 = this.aJR.y;
        f8 = this.aJx.y;
        f3 = this.scale / this.aJv;
        f2 = this.scale / this.aJv;
        this.aJw.x = (this.aJR.x - (f4 - f6) * f3);
        this.aJw.y = (this.aJR.y - (f1 - f8) * f2);
        if (((oI() * d >= getHeight()) || (this.scale * oI() < getHeight())) && ((oH() * d >= getWidth()) || (this.scale * oH() < getWidth())))
          break label2768;
        aA(true);
        this.aJR.set(c(this.aJX));
        this.aJx.set(this.aJw);
        this.aJv = this.scale;
        f1 = 0.0F;
      }
      while (true)
      {
        this.aJU = f1;
        aA(true);
        az(this.aJn);
        bool1 = true;
        break label933;
        i = 0;
        break label1378;
        label1738: f1 = 1.0F - f2;
        break label1452;
        if (this.aJB != null)
        {
          this.aJw.x = (getWidth() / 2 - this.scale * this.aJB.x);
          this.aJw.y = (getHeight() / 2 - this.scale * this.aJB.y);
          f1 = f5;
        }
        else
        {
          this.aJw.x = (getWidth() / 2 - this.scale * (oH() / 2));
          this.aJw.y = (getHeight() / 2 - this.scale * (oI() / 2));
          f1 = f5;
          continue;
          bool1 = bool2;
          if (this.aJI)
            break label933;
          f5 = Math.abs(paramMotionEvent.getX() - this.aJR.x);
          f4 = Math.abs(paramMotionEvent.getY() - this.aJR.y);
          f3 = this.density * 5.0F;
          if ((f5 <= f3) && (f4 <= f3))
          {
            bool1 = bool2;
            if (!this.aJJ)
              break label933;
          }
          this.aJw.x = (this.aJx.x + (paramMotionEvent.getX() - this.aJR.x));
          this.aJw.y = (this.aJx.y + (paramMotionEvent.getY() - this.aJR.y));
          f2 = this.aJw.x;
          f1 = this.aJw.y;
          aA(true);
          label2048: label2064: boolean bool3;
          label2086: boolean bool4;
          label2109: boolean bool5;
          if (f2 != this.aJw.x)
          {
            bool1 = true;
            if (f1 == this.aJw.y)
              break label2322;
            bool2 = true;
            if ((!bool1) || (f5 <= f4) || (this.aJJ))
              break label2328;
            bool3 = true;
            if ((!bool2) || (f4 <= f5) || (this.aJJ))
              break label2334;
            bool4 = true;
            if ((f1 != this.aJw.y) || (f4 <= 3.0F * f3))
              break label2340;
            bool5 = true;
            label2137: ab.i(this.TAG, "alvinluo Action_Move edge atXEdge: %b, atYEdge: %b, edgeXSwipe: %b, edgeYSwipe: %b, yPan: %b, isPanning: %b,dx: %f, dy: %f, offset: %f", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(this.aJJ), Float.valueOf(f5), Float.valueOf(f4), Float.valueOf(f3) });
            if ((bool3) || (bool4) || ((bool1) && (bool2) && (!bool5) && (!this.aJJ)))
              break label2346;
            this.aJJ = true;
          }
          while (true)
          {
            if (!this.aJo)
            {
              this.aJw.x = this.aJx.x;
              this.aJw.y = this.aJx.y;
              requestDisallowInterceptTouchEvent(false);
            }
            az(this.aJn);
            bool1 = true;
            break;
            bool1 = false;
            break label2048;
            label2322: bool2 = false;
            break label2064;
            label2328: bool3 = false;
            break label2086;
            label2334: bool4 = false;
            break label2109;
            label2340: bool5 = false;
            break label2137;
            label2346: if ((f5 > f3) || (f4 > f3))
            {
              this.aJL = 0;
              this.handler.removeMessages(1);
              requestDisallowInterceptTouchEvent(false);
            }
          }
          this.handler.removeMessages(1);
          if (this.aJK)
          {
            this.aJK = false;
            if (!this.aJV)
              a(this.aJX, this.aJR);
          }
          if ((this.aJL > 0) && ((this.aJI) || (this.aJJ)))
          {
            if ((this.aJI) && (i == 2))
            {
              this.aJJ = true;
              this.aJx.set(this.aJw.x, this.aJw.y);
              if (paramMotionEvent.getActionIndex() != 1)
                break label2627;
              this.aJR.set(paramMotionEvent.getX(0), paramMotionEvent.getY(0));
              label2506: if (this.scale > this.aKy)
                break label2647;
              ab.i(this.TAG, "alvinluo scale %f less than %f, and need to reset", new Object[] { Float.valueOf(this.scale), Float.valueOf(this.aKy) });
              PointF localPointF = new PointF(this.aKu / 2, this.aKv / 2);
              b(localPointF, localPointF, this.aKy);
              this.aJJ = false;
            }
            while (true)
            {
              if (i < 3)
                this.aJI = false;
              if (i < 2)
              {
                this.aJJ = false;
                this.aJL = 0;
              }
              az(true);
              bool1 = true;
              break;
              label2627: this.aJR.set(paramMotionEvent.getX(1), paramMotionEvent.getY(1));
              break label2506;
              label2647: if (this.scale > getDoubleTapZoomScale() * 2.0F)
              {
                ab.i(this.TAG, "alvinluo current scale %f larger than maxScale: %f, and reset to scale: %f", new Object[] { Float.valueOf(this.scale), Float.valueOf(this.aJf), Float.valueOf(getDoubleTapZoomScale() * 2.0F) });
                b(b(this.aKF), this.aKF, getDoubleTapZoomScale() * 2.0F);
              }
            }
          }
          if (i == 1)
          {
            this.aJI = false;
            this.aJJ = false;
            this.aJL = 0;
          }
          bool1 = false;
          break label302;
          label2757: bool1 = false;
          AppMethodBeat.o(115674);
          break;
          label2768: f1 = f5;
        }
      }
      label2775: f1 = 1.0F;
    }
  }

  public final void setBitmapDecoderClass(Class<? extends com.davemorrissey.labs.subscaleview.a.d> paramClass)
  {
    AppMethodBeat.i(115712);
    if (paramClass == null)
    {
      paramClass = new IllegalArgumentException("Decoder class cannot be set to null");
      AppMethodBeat.o(115712);
      throw paramClass;
    }
    this.aJP = new com.davemorrissey.labs.subscaleview.a.a(paramClass);
    AppMethodBeat.o(115712);
  }

  public final void setBitmapDecoderFactory(com.davemorrissey.labs.subscaleview.a.b<? extends com.davemorrissey.labs.subscaleview.a.d> paramb)
  {
    AppMethodBeat.i(115713);
    if (paramb == null)
    {
      paramb = new IllegalArgumentException("Decoder factory cannot be set to null");
      AppMethodBeat.o(115713);
      throw paramb;
    }
    this.aJP = paramb;
    AppMethodBeat.o(115713);
  }

  public final void setDebug(boolean paramBoolean)
  {
    this.aJe = paramBoolean;
  }

  public final void setDoubleTapZoomDpi(int paramInt)
  {
    AppMethodBeat.i(115726);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = localDisplayMetrics.xdpi;
    setDoubleTapZoomScale((localDisplayMetrics.ydpi + f) / 2.0F / paramInt);
    AppMethodBeat.o(115726);
  }

  public final void setDoubleTapZoomDuration(int paramInt)
  {
    AppMethodBeat.i(115728);
    this.aJt = Math.max(0, paramInt);
    AppMethodBeat.o(115728);
  }

  public final void setDoubleTapZoomScale(float paramFloat)
  {
    this.aJr = paramFloat;
  }

  public final void setDoubleTapZoomStyle(int paramInt)
  {
    AppMethodBeat.i(115727);
    if (!aIO.contains(Integer.valueOf(paramInt)))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid zoom style: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(115727);
      throw localIllegalArgumentException;
    }
    this.aJs = paramInt;
    AppMethodBeat.o(115727);
  }

  public void setEagerLoadingEnabled(boolean paramBoolean)
  {
    this.aJn = paramBoolean;
  }

  public void setEdgeSwipeListener(SubsamplingScaleImageView.c paramc)
  {
    this.aKI = paramc;
  }

  public void setExecutor(Executor paramExecutor)
  {
    AppMethodBeat.i(115729);
    if (paramExecutor == null)
    {
      paramExecutor = new NullPointerException("Executor must not be null");
      AppMethodBeat.o(115729);
      throw paramExecutor;
    }
    this.executor = paramExecutor;
    AppMethodBeat.o(115729);
  }

  public void setGestureDetectorListener(GestureDetector.SimpleOnGestureListener paramSimpleOnGestureListener)
  {
    this.aJN = paramSimpleOnGestureListener;
  }

  public final void setImage(a parama)
  {
    AppMethodBeat.i(115667);
    a(parama, null);
    AppMethodBeat.o(115667);
  }

  public void setImageMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(115666);
    Matrix localMatrix = paramMatrix;
    if (paramMatrix != null)
    {
      localMatrix = paramMatrix;
      if (paramMatrix.isIdentity())
        localMatrix = null;
    }
    if (((localMatrix == null) && (!this.aKo.isIdentity())) || ((localMatrix != null) && (!this.aKo.equals(localMatrix))))
    {
      this.aKo.set(localMatrix);
      invalidate();
    }
    AppMethodBeat.o(115666);
  }

  public final void setMaxScale(float paramFloat)
  {
    this.aJf = paramFloat;
  }

  public void setMaxTileSize(int paramInt)
  {
    this.aJl = paramInt;
    this.aJm = paramInt;
  }

  public final void setMaximumDpi(int paramInt)
  {
    AppMethodBeat.i(115717);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = localDisplayMetrics.xdpi;
    setMinScale((localDisplayMetrics.ydpi + f) / 2.0F / paramInt);
    AppMethodBeat.o(115717);
  }

  public final void setMinScale(float paramFloat)
  {
    this.aJg = paramFloat;
  }

  public final void setMinimumDpi(int paramInt)
  {
    AppMethodBeat.i(115716);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = localDisplayMetrics.xdpi;
    setMaxScale((localDisplayMetrics.ydpi + f) / 2.0F / paramInt);
    AppMethodBeat.o(115716);
  }

  public final void setMinimumScaleType(int paramInt)
  {
    AppMethodBeat.i(115715);
    if (!aIR.contains(Integer.valueOf(paramInt)))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid scale type: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(115715);
      throw localIllegalArgumentException;
    }
    this.aJj = paramInt;
    if (this.aKa)
    {
      aA(true);
      invalidate();
    }
    AppMethodBeat.o(115715);
  }

  public void setMinimumTileDpi(int paramInt)
  {
    AppMethodBeat.i(115719);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = localDisplayMetrics.xdpi;
    this.aJh = ((int)Math.min((localDisplayMetrics.ydpi + f) / 2.0F, paramInt));
    if (this.aKa)
    {
      reset(false);
      invalidate();
    }
    AppMethodBeat.o(115719);
  }

  public void setOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    this.aKG = paramOnAttachStateChangeListener;
  }

  public void setOnImageEventListener(SubsamplingScaleImageView.e parame)
  {
    this.aKc = parame;
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.aKe = paramOnLongClickListener;
  }

  public void setOnStateChangedListener(SubsamplingScaleImageView.f paramf)
  {
    this.aKd = paramf;
  }

  public final void setOrientation(int paramInt)
  {
    AppMethodBeat.i(115661);
    if (!aIN.contains(Integer.valueOf(paramInt)))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid orientation: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(115661);
      throw localIllegalArgumentException;
    }
    this.orientation = paramInt;
    reset(false);
    invalidate();
    requestLayout();
    AppMethodBeat.o(115661);
  }

  public final void setPanEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(115724);
    this.aJo = paramBoolean;
    if ((!paramBoolean) && (this.aJw != null))
    {
      this.aJw.x = (getWidth() / 2 - this.scale * (oH() / 2));
      this.aJw.y = (getHeight() / 2 - this.scale * (oI() / 2));
      if (this.aKa)
      {
        az(true);
        invalidate();
      }
    }
    AppMethodBeat.o(115724);
  }

  public final void setPanLimit(int paramInt)
  {
    AppMethodBeat.i(115714);
    if (!aIQ.contains(Integer.valueOf(paramInt)))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid pan limit: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(115714);
      throw localIllegalArgumentException;
    }
    this.aJi = paramInt;
    if (this.aKa)
    {
      aA(true);
      invalidate();
    }
    AppMethodBeat.o(115714);
  }

  public void setPreviewDone(boolean paramBoolean)
  {
    AppMethodBeat.i(115660);
    this.aKD = paramBoolean;
    invalidate();
    AppMethodBeat.o(115660);
  }

  public final void setQuickScaleEnabled(boolean paramBoolean)
  {
    this.aJq = paramBoolean;
  }

  public final void setRegionDecoderClass(Class<? extends com.davemorrissey.labs.subscaleview.a.d> paramClass)
  {
    AppMethodBeat.i(115710);
    if (paramClass == null)
    {
      paramClass = new IllegalArgumentException("Decoder class cannot be set to null");
      AppMethodBeat.o(115710);
      throw paramClass;
    }
    this.aJQ = new com.davemorrissey.labs.subscaleview.a.a(paramClass);
    AppMethodBeat.o(115710);
  }

  public final void setRegionDecoderFactory(com.davemorrissey.labs.subscaleview.a.b<? extends com.davemorrissey.labs.subscaleview.a.d> paramb)
  {
    AppMethodBeat.i(115711);
    if (paramb == null)
    {
      paramb = new IllegalArgumentException("Decoder factory cannot be set to null");
      AppMethodBeat.o(115711);
      throw paramb;
    }
    this.aJQ = paramb;
    AppMethodBeat.o(115711);
  }

  public void setScaleRate(float paramFloat)
  {
    AppMethodBeat.i(115662);
    this.aKy = paramFloat;
    this.aJf = 2.0F;
    this.aJg = 1.0F;
    oz();
    oA();
    AppMethodBeat.o(115662);
  }

  public final void setTileBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(115725);
    if (Color.alpha(paramInt) == 0)
      this.aKi = null;
    while (true)
    {
      invalidate();
      AppMethodBeat.o(115725);
      return;
      this.aKi = new Paint();
      this.aKi.setStyle(Paint.Style.FILL);
      this.aKi.setColor(paramInt);
    }
  }

  public final void setZoomEnabled(boolean paramBoolean)
  {
    this.aJp = paramBoolean;
  }

  public void setsRegion(Rect paramRect)
  {
    this.aIL = paramRect;
  }

  public static abstract interface d
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView
 * JD-Core Version:    0.6.2
 */