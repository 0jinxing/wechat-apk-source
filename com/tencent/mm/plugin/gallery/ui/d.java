package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;

final class d
{
  private az fwL;
  SparseArray<WeakReference<MultiTouchImageView>> mQG;
  HashMap<String, Integer> mQH;
  SparseArray<String> mQI;
  SparseArray<Bitmap> mQJ;
  protected f<String, Bitmap> mQK;
  protected SparseIntArray mQL;
  LinkedList<String> mQM;
  c mQN;
  boolean mQO;
  private int mScrollState;

  public d(c paramc)
  {
    AppMethodBeat.i(21488);
    this.fwL = new az(1, "album-image-gallery-lazy-loader");
    this.mQG = new SparseArray();
    this.mQH = new HashMap();
    this.mQI = new SparseArray();
    this.mQJ = new SparseArray();
    this.mScrollState = 0;
    this.mQK = new b(5, new d.1(this), getClass());
    this.mQL = new SparseIntArray();
    this.mQM = new LinkedList();
    this.mQO = false;
    this.mQN = paramc;
    AppMethodBeat.o(21488);
  }

  private void a(int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(21493);
    if (this.mQG.get(paramInt) == null)
      AppMethodBeat.o(21493);
    while (true)
    {
      return;
      MultiTouchImageView localMultiTouchImageView = (MultiTouchImageView)((WeakReference)this.mQG.get(paramInt)).get();
      String str = (String)this.mQI.get(paramInt);
      if ((paramBitmap != null) && (localMultiTouchImageView != null))
      {
        int i = paramBitmap.hashCode();
        int j = this.mQL.indexOfValue(paramInt);
        if (j >= 0)
          this.mQL.removeAt(j);
        this.mQL.put(i, paramInt);
      }
      this.mQN.a(localMultiTouchImageView, str, paramBitmap);
      wA(paramInt);
      AppMethodBeat.o(21493);
    }
  }

  private void bCH()
  {
    AppMethodBeat.i(21490);
    this.mQK.a(new d.2(this));
    AppMethodBeat.o(21490);
  }

  final void Dp()
  {
    AppMethodBeat.i(21494);
    if (this.mQO)
      AppMethodBeat.o(21494);
    while (true)
    {
      return;
      if (this.mQM.size() == 0)
      {
        AppMethodBeat.o(21494);
      }
      else
      {
        Object localObject = (String)this.mQM.removeLast();
        if (!this.mQH.containsKey(localObject))
        {
          AppMethodBeat.o(21494);
        }
        else
        {
          this.mQO = true;
          localObject = new d.3(this, (String)localObject);
          this.fwL.e((az.a)localObject);
          AppMethodBeat.o(21494);
        }
      }
    }
  }

  final boolean bCI()
  {
    if (this.mScrollState == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void detach()
  {
    AppMethodBeat.i(21489);
    this.mQN = null;
    this.mQG.clear();
    this.mQJ.clear();
    this.mQI.clear();
    this.mQH.clear();
    bCH();
    AppMethodBeat.o(21489);
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(21491);
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
    AppMethodBeat.o(21491);
  }

  final void wA(int paramInt)
  {
    AppMethodBeat.i(21492);
    if (this.mQI.get(paramInt) != null)
    {
      String str = (String)this.mQI.get(paramInt);
      this.mQG.remove(paramInt);
      this.mQI.remove(paramInt);
      this.mQH.remove(str);
      this.mQJ.remove(paramInt);
    }
    AppMethodBeat.o(21492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.d
 * JD-Core Version:    0.6.2
 */