package com.tencent.mm.plugin.sight.decode.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class b
{
  private static HashMap<String, WeakReference<Bitmap>> qxK = new HashMap();
  private static Map<String, Integer> qxO = new ConcurrentHashMap();
  private boolean fNO = false;
  public boolean fVc = true;
  public String ien = "";
  private ak lda;
  private Surface mSurface;
  public int position;
  private volatile b.h qxA;
  private volatile b.b qxB;
  public volatile b.i qxC;
  private volatile b.c qxD;
  private b.k qxE;
  private b.j qxF;
  private b.d qxG;
  public boolean qxH = true;
  public boolean qxI = true;
  public boolean qxJ = false;
  public boolean qxL = false;
  public double qxM = -1.0D;
  boolean qxN = false;
  public double qxP = -1.0D;
  private boolean qxQ = false;
  public boolean qxR = false;
  private b.a qxS;
  public volatile b.e qxT;
  public volatile b.f qxU;
  public volatile b.g qxV;
  private int qxl = 0;
  private int qxm = 0;
  private String qxn = "";
  private int qxo = -1;
  private Queue<Integer> qxp = new ConcurrentLinkedQueue();
  protected int qxq = 41;
  private Bitmap qxr;
  public Bitmap qxs;
  private Bitmap qxt;
  private WeakReference<View> qxu;
  private WeakReference<TextView> qxv;
  private long qxw;
  public WeakReference<View> qxx;
  private Animation qxy;
  private Animation qxz;

  public b(int paramInt, View paramView)
  {
    this.qxm = paramInt;
    this.lda = new ak(Looper.getMainLooper());
    this.qxx = new WeakReference(paramView);
    ab.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", new Object[] { Integer.valueOf(paramInt) });
  }

  private void CE(int paramInt)
  {
    com.tencent.mm.modelvideo.o.i(new b.2(this, paramInt), 0L);
  }

  public static boolean WS(String paramString)
  {
    boolean bool;
    if (bo.isNullOrNil(paramString))
      bool = false;
    while (true)
    {
      return bool;
      paramString = (Integer)qxO.get(paramString);
      if ((paramString != null) && (2 == paramString.intValue()))
        bool = false;
      else
        bool = true;
    }
  }

  public static void WY()
  {
    com.tencent.mm.modelvideo.o.i(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(70226);
        long l = System.currentTimeMillis();
        try
        {
          SightVideoJNI.freeAll();
          ab.i("MicroMsg.SightPlayController", "free all, use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(70226);
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.SightPlayController", "free all sight error");
            ab.printErrStackTrace("MicroMsg.SightPlayController", localException, "", new Object[0]);
          }
        }
      }
    }
    , 0L);
  }

  public static Bitmap b(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = String.format("%s-%s-%s-%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Object localObject = (WeakReference)qxK.get(str);
    if ((localObject != null) && (((WeakReference)localObject).get() != null))
      paramContext = (Bitmap)((WeakReference)localObject).get();
    while (true)
    {
      return paramContext;
      if (paramContext == null)
      {
        ab.w("MicroMsg.SightPlayController", "get mask bmp, but context is null");
        paramContext = null;
      }
      else if (paramInt1 <= 0)
      {
        ab.w("MicroMsg.SightPlayController", "get mask bmp, but mask id error");
        paramContext = null;
      }
      else if ((paramInt2 <= 0) || (paramInt4 <= 0) || (paramInt3 <= 0))
      {
        ab.w("MicroMsg.SightPlayController", "get mask bmp, but size error");
        paramContext = null;
      }
      else
      {
        long l = bo.yz();
        paramInt3 = paramInt2 * paramInt4 / paramInt3;
        localObject = (NinePatchDrawable)paramContext.getResources().getDrawable(paramInt1);
        ((NinePatchDrawable)localObject).setBounds(0, 0, paramInt2, paramInt3);
        paramContext = Bitmap.createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888);
        ((NinePatchDrawable)localObject).draw(new Canvas(paramContext));
        qxK.put(str, new WeakReference(paramContext));
        ab.d("MicroMsg.SightPlayController", "create mask bmp use %dms", new Object[] { Long.valueOf(bo.az(l)) });
      }
    }
  }

  private void d(Queue<Integer> paramQueue)
  {
    while (true)
    {
      Integer localInteger = (Integer)paramQueue.poll();
      if (localInteger == null)
        break;
      CE(localInteger.intValue());
    }
  }

  public final void T(Bitmap paramBitmap)
  {
    boolean bool = true;
    if (paramBitmap == null);
    while (true)
    {
      ab.v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.modelvideo.o.y(this.qxE);
      if (this.qxE == null)
        this.qxE = new b.k(this, (byte)0);
      this.qxE.qyh = new WeakReference(paramBitmap);
      com.tencent.mm.modelvideo.o.i(this.qxE, 0L);
      return;
      bool = false;
    }
  }

  public abstract void U(Bitmap paramBitmap);

  public final void bf(String paramString, boolean paramBoolean)
  {
    ab.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", new Object[] { Integer.valueOf(hashCode()), paramString, this.ien, Boolean.valueOf(paramBoolean), Integer.valueOf(this.qxo), Boolean.valueOf(this.qxR), Boolean.valueOf(this.qxI) });
    if (this.qxR)
      kz(false);
    while (true)
    {
      return;
      if (clb())
      {
        ab.e("MicroMsg.SightPlayController", "is bad fps, do nothing when set video path");
        clear();
      }
      else if (!this.qxI)
      {
        clear();
      }
      else if (paramBoolean)
      {
        this.qxn = paramString;
        kz(false);
      }
      else if (this.ien.equals(paramString))
      {
        this.qxn = "ERROR#PATH";
        kz(false);
        restart();
      }
      else
      {
        clear();
        String str = paramString;
        if (paramString == null)
          str = "";
        this.ien = str;
        if (bo.isNullOrNil(this.ien))
        {
          ab.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
          T(null);
        }
        else if (!WS(this.ien))
        {
          ab.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
          clear();
        }
        else
        {
          this.qxA = new b.h(this, (byte)0);
          com.tencent.mm.modelvideo.o.i(this.qxA, 0L);
        }
      }
    }
  }

  protected int ckZ()
  {
    return -1;
  }

  public final boolean cla()
  {
    boolean bool = true;
    if (1 == this.qxm)
      if ((this.qxB == null) || (this.qxB.ovl));
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((this.qxD == null) || (this.qxD.ovl) || (this.qxB == null) || (this.qxB.ovl))
        bool = false;
    }
  }

  public final boolean clb()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.qxL)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool2 = bool1;
        if (this.qxl >= 3)
        {
          ab.v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
          this.qxl = 0;
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = bool1;
        if (this.qxl >= 3)
          bool2 = true;
      }
    }
  }

  protected final void clc()
  {
    int i = Math.max(1, (int)SightVideoJNI.getVideoRate(this.qxo));
    this.qxq = (1000 / i);
    ab.d("MicroMsg.SightPlayController", "#0x%x update video rate to %d fps, delay %d ms", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.qxq) });
  }

  public final c cld()
  {
    if (this.qxS == null)
      this.qxS = new b.a(this);
    return this.qxS;
  }

  public final double cle()
  {
    if (this.qxo == -1);
    for (double d = 0.0D; ; d = SightVideoJNI.getVideoDuration(this.qxo))
      return d;
  }

  public final void clear()
  {
    ab.i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.qxo), Boolean.valueOf(cla()) });
    kz(true);
    this.qxw = 0L;
    d(this.qxp);
    this.qxo = -1;
    this.ien = "";
    this.qxn = "ERROR#PATH";
    this.qxt = null;
    this.qxM = 0.0D;
    this.qxN = false;
    com.tencent.mm.memory.o.fdT.f(this.qxr);
    this.qxr = null;
  }

  public abstract void dH(int paramInt1, int paramInt2);

  public final void g(Surface paramSurface)
  {
    ab.v("MicroMsg.SightPlayController", "set play surface %s", new Object[] { paramSurface });
    this.mSurface = paramSurface;
    com.tencent.mm.modelvideo.o.i(this.qxE, 0L);
  }

  public final void kz(boolean paramBoolean)
  {
    if (this.qxA != null)
    {
      com.tencent.mm.modelvideo.o.y(this.qxA);
      this.qxA.ovl = true;
    }
    if (this.qxD != null)
    {
      this.lda.removeCallbacks(this.qxD);
      this.qxD.ovl = true;
    }
    if (this.qxB != null)
    {
      com.tencent.mm.modelvideo.o.y(this.qxB);
      this.qxB.ovl = true;
    }
    b.i locali;
    if (this.qxC != null)
    {
      locali = this.qxC;
      if (!paramBoolean)
        break label105;
    }
    label105: for (int i = 0; ; i = 2)
    {
      locali.type = i;
      com.tencent.mm.modelvideo.o.i(this.qxC, 0L);
      return;
    }
  }

  public final void restart()
  {
    ab.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.qxI), this.ien, Integer.valueOf(this.qxo) });
    if (!this.qxI)
      clear();
    while (true)
    {
      return;
      if (cla())
      {
        ab.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.ien });
      }
      else
      {
        if (this.qxo < 0);
        for (boolean bool = true; ; bool = false)
        {
          kz(bool);
          this.qxw = 0L;
          if (!clb())
            break label156;
          ab.e("MicroMsg.SightPlayController", "#0x%x is bad fps, do nothing when restart", new Object[] { Integer.valueOf(hashCode()) });
          break;
        }
        label156: if (this.qxo < 0)
        {
          ab.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.ien });
          if (!bo.isNullOrNil(this.ien))
            if (!WS(this.ien))
            {
              ab.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
              clear();
            }
            else
            {
              this.qxA = new b.h(this, (byte)0);
              com.tencent.mm.modelvideo.o.i(this.qxA, 0L);
            }
        }
        else if (1 == this.qxm)
        {
          this.qxB = new b.b(this, (byte)0);
          this.qxD = null;
          com.tencent.mm.modelvideo.o.i(this.qxB, 0L);
        }
        else
        {
          this.qxB = new b.b(this, (byte)0);
          this.qxD = new b.c(this);
          this.qxB.qyb = this.qxD;
          this.qxD.qye = this.qxB;
          com.tencent.mm.modelvideo.o.i(this.qxB, 0L);
        }
      }
    }
  }

  public final void setSightInfoView(TextView paramTextView)
  {
    this.qxv = new WeakReference(paramTextView);
  }

  public final void setThumbBgView(View paramView)
  {
    this.qxu = new WeakReference(paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b
 * JD-Core Version:    0.6.2
 */