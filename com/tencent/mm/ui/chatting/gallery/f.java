package com.tencent.mm.ui.chatting.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.ui.base.WxImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

final class f
  implements ViewPager.OnPageChangeListener
{
  private static int mScreenHeight = 0;
  private static int mScreenWidth = 0;
  private static long yVq = 0L;
  private int aaF;
  private ak fbD;
  private az fwL;
  SparseArray<WeakReference<View>> mQG;
  HashMap<String, Integer> mQH;
  SparseArray<String> mQI;
  SparseArray<Bitmap> mQJ;
  protected com.tencent.mm.a.f<String, Bitmap> mQK;
  protected SparseIntArray mQL;
  private LinkedList<String> mQM;
  private boolean mQO;
  private int mScrollState;
  SparseArray<String> yVn;
  f.a yVo;
  protected com.tencent.mm.a.f<String, Bitmap> yVp;
  private LinkedList<Integer> yVr;
  private LinkedList<Integer> yVs;
  Bitmap yVt;

  public f(f.a parama)
  {
    AppMethodBeat.i(32145);
    this.fwL = new az(1, "chatting-image-gallery-lazy-loader");
    this.mQG = new SparseArray();
    this.mQH = new HashMap();
    this.mQI = new SparseArray();
    this.mQJ = new SparseArray();
    this.yVn = new SparseArray();
    this.mScrollState = 0;
    this.aaF = -1;
    this.yVp = new b(400, new f.1(this), getClass());
    this.mQK = new b(5, new f.2(this), getClass());
    this.yVr = new LinkedList();
    this.mQL = new SparseIntArray();
    this.mQM = new LinkedList();
    this.yVs = new LinkedList();
    this.fbD = new ak();
    this.mQO = false;
    this.yVo = parama;
    AppMethodBeat.o(32145);
  }

  private void Dp()
  {
    AppMethodBeat.i(32156);
    if (this.mQO)
      AppMethodBeat.o(32156);
    while (true)
    {
      return;
      if (this.mQM.size() == 0)
      {
        AppMethodBeat.o(32156);
      }
      else
      {
        Object localObject = (String)this.mQM.removeLast();
        int i = ((Integer)this.yVs.removeLast()).intValue();
        if (!this.mQH.containsKey(localObject))
        {
          AppMethodBeat.o(32156);
        }
        else
        {
          this.mQO = true;
          localObject = new f.6(this, (String)localObject, i);
          this.fwL.e((az.a)localObject);
          AppMethodBeat.o(32156);
        }
      }
    }
  }

  private void a(int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(32152);
    if (this.mQG.get(paramInt) == null)
      AppMethodBeat.o(32152);
    while (true)
    {
      return;
      View localView = (View)((WeakReference)this.mQG.get(paramInt)).get();
      this.mQI.get(paramInt);
      this.yVo.b(localView, paramBitmap);
      wA(paramInt);
      AppMethodBeat.o(32152);
    }
  }

  private void a(int paramInt, View paramView, String paramString)
  {
    AppMethodBeat.i(32151);
    this.mQH.put(paramString, Integer.valueOf(paramInt));
    this.mQI.put(paramInt, paramString);
    this.mQG.put(paramInt, new WeakReference(paramView));
    AppMethodBeat.o(32151);
  }

  private boolean bCI()
  {
    if (this.mScrollState == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void wA(int paramInt)
  {
    AppMethodBeat.i(32150);
    if (this.mQI.get(paramInt) != null)
    {
      String str = (String)this.mQI.get(paramInt);
      this.mQG.remove(paramInt);
      this.mQI.remove(paramInt);
      this.mQH.remove(str);
      this.mQJ.remove(paramInt);
    }
    AppMethodBeat.o(32150);
  }

  private void wB(int paramInt)
  {
    AppMethodBeat.i(32149);
    if (this.yVp.aj(String.valueOf(paramInt)))
      AppMethodBeat.o(32149);
    while (true)
    {
      return;
      aw.RS().m(new f.5(this, paramInt), 300L);
      AppMethodBeat.o(32149);
    }
  }

  public final void aW(Map<String, Bitmap> paramMap)
  {
    AppMethodBeat.i(32144);
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Bitmap localBitmap = (Bitmap)paramMap.get(str);
      if (localBitmap != null)
      {
        this.mQK.put(str, localBitmap);
        this.yVr.push(Integer.valueOf(localBitmap.hashCode()));
        ab.i("MicroMsg.ImageGalleryLazyLoader", "we got one cache from preload : %s %s", new Object[] { str, Integer.valueOf(localBitmap.hashCode()) });
      }
      else
      {
        ab.e("MicroMsg.ImageGalleryLazyLoader", "we got one null cache from preload");
      }
    }
    AppMethodBeat.o(32144);
  }

  public final void b(View paramView, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(32154);
    if (this.mQM.contains(paramString1))
      AppMethodBeat.o(32154);
    while (true)
    {
      return;
      int i = paramView.hashCode();
      wA(i);
      a(i, paramView, paramString1);
      if ((paramView instanceof WxImageView))
      {
        this.yVn.remove(i);
        this.yVn.put(i, paramString2);
      }
      this.mQM.add(paramString1);
      this.yVs.add(Integer.valueOf(paramInt));
      Dp();
      AppMethodBeat.o(32154);
    }
  }

  final void bCH()
  {
    AppMethodBeat.i(32146);
    this.yVp.a(new f.3(this));
    this.mQK.a(new f.4(this));
    AppMethodBeat.o(32146);
  }

  public final void c(int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(32157);
    if ((paramInt == this.aaF) || (this.aaF == -1))
    {
      ab.i("MicroMsg.ImageGalleryLazyLoader", "alvinluo notifyBitmapLoaded cache bitmap, position: %d", new Object[] { Integer.valueOf(paramInt) });
      this.yVt = paramBitmap;
    }
    AppMethodBeat.o(32157);
  }

  public final boolean c(ImageView paramImageView, int paramInt)
  {
    AppMethodBeat.i(32153);
    ab.i("MicroMsg.ImageGalleryLazyLoader", "loadThumb position %s", new Object[] { Integer.valueOf(paramInt) });
    Bitmap localBitmap = (Bitmap)this.yVp.ai(String.valueOf(paramInt));
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      this.yVo.b(paramImageView, localBitmap);
      AppMethodBeat.o(32153);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(32153);
    }
  }

  public final void g(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(32155);
    if (this.mQM.contains(paramString))
      AppMethodBeat.o(32155);
    while (true)
    {
      return;
      int i = paramImageView.hashCode();
      wA(i);
      a(i, paramImageView, paramString);
      this.mQM.add(paramString);
      this.yVs.add(Integer.valueOf(paramInt));
      Dp();
      AppMethodBeat.o(32155);
    }
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(32147);
    this.mScrollState = paramInt;
    if (bCI())
    {
      int[] arrayOfInt = new int[this.mQJ.size()];
      for (int j = 0; ; j++)
      {
        paramInt = i;
        if (j >= arrayOfInt.length)
          break;
        arrayOfInt[j] = this.mQJ.keyAt(j);
      }
      while (paramInt < arrayOfInt.length)
      {
        j = arrayOfInt[paramInt];
        a(j, (Bitmap)this.mQJ.get(j));
        paramInt++;
      }
    }
    AppMethodBeat.o(32147);
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(32148);
    if (!((e)this.yVo).yTG.yTJ.prepared)
      AppMethodBeat.o(32148);
    while (true)
    {
      return;
      if (this.aaF == -1)
      {
        int i = 0;
        if (i == 0)
          wB(paramInt);
        while (true)
        {
          i++;
          break;
          if ((paramInt + i > paramInt + 3) && (paramInt - i < Math.max(paramInt - 3, 0)))
            break label137;
          if (paramInt + i <= paramInt + 3)
            wB(paramInt + i);
          if (paramInt - i >= Math.max(paramInt - 3, 0))
            wB(paramInt - i);
        }
      }
      if (this.aaF > paramInt)
        wB(Math.max(paramInt - 3, 0));
      while (true)
      {
        label137: this.aaF = paramInt;
        localObject = (e)this.yVo;
        if (localObject == null)
          break label224;
        if (((e)localObject).yTG.wx(this.aaF) == null)
          break label200;
        this.yVt = null;
        AppMethodBeat.o(32148);
        break;
        if (this.aaF < paramInt)
          wB(paramInt + 3);
      }
      label200: Object localObject = ((e)localObject).yTG.wy(this.aaF);
      if (localObject != null)
        this.yVt = ((WxImageView)localObject).getFullImageBitmap();
      label224: AppMethodBeat.o(32148);
    }
  }

  protected final void u(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(32143);
    int i;
    if (paramBitmap != null)
    {
      long l1 = paramBitmap.getWidth();
      long l2 = paramBitmap.getHeight();
      if ((mScreenHeight == 0) || (mScreenWidth == 0))
      {
        mScreenWidth = ah.getContext().getResources().getDisplayMetrics().widthPixels;
        mScreenHeight = ah.getContext().getResources().getDisplayMetrics().heightPixels;
        yVq = mScreenWidth * yVq;
      }
      if (l1 * l2 > yVq * 2L)
      {
        i = 1;
        if (i == 0)
          break label121;
        ab.i("MicroMsg.ImageGalleryLazyLoader", "file %s too big to cache");
        AppMethodBeat.o(32143);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label121: this.mQK.k(paramString, paramBitmap);
      if (g.a.yVD.mQK.aj(paramString))
      {
        ab.i("MicroMsg.ImageGalleryLazyLoader", "update origCache and preload cache");
        try
        {
          g.a.yVD.mQK.k(paramString, paramBitmap);
          AppMethodBeat.o(32143);
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.ImageGalleryLazyLoader", paramString, "update preload cache failed", new Object[0]);
        }
      }
      else
      {
        AppMethodBeat.o(32143);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.f
 * JD-Core Version:    0.6.2
 */