package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class ViewPagerLayoutManager extends LinearLayoutManager
{
  private boolean alC = false;
  private boolean alD = false;
  private boolean alF = true;
  private int alG = -1;
  private boolean alI;
  private boolean alm = false;
  public int mOrientation;
  public SparseArray<View> obh = new SparseArray();
  protected int obi;
  protected int obk;
  protected int obl;
  protected int obm;
  protected float obn;
  protected b obo;
  private ViewPagerLayoutManager.SavedState obp = null;
  protected float obq;
  private boolean obr;
  private int obs;
  private int obt;
  int obu = -1;
  private Interpolator obv;
  int obw = 2147483647;
  private View obx;

  public ViewPagerLayoutManager(int paramInt, boolean paramBoolean)
  {
    setOrientation(paramInt);
    ah(paramBoolean);
    this.aoE = true;
    an(false);
  }

  private boolean aK(float paramFloat)
  {
    if ((paramFloat > bMc()) || (paramFloat < bMd()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int aL(float paramFloat)
  {
    if (this.mOrientation == 1);
    for (int i = 0; ; i = (int)paramFloat)
      return i;
  }

  private int aM(float paramFloat)
  {
    if (this.mOrientation == 1);
    for (int i = (int)paramFloat; ; i = 0)
      return i;
  }

  private int b(int paramInt, RecyclerView.o paramo)
  {
    if ((getChildCount() == 0) || (paramInt == 0));
    for (int i = 0; ; i = 0)
    {
      return i;
      iJ();
      f = paramInt / bLU();
      if (Math.abs(f) >= 1.0E-008F)
        break;
    }
    float f = this.obn + f;
    if ((!this.alm) && (f < bMb()))
      i = (int)(paramInt - (f - bMb()) * bLU());
    while (true)
    {
      this.obn = (i / bLU() + this.obn);
      e(paramo);
      break;
      i = paramInt;
      if (!this.alm)
      {
        i = paramInt;
        if (f > bMa())
          i = (int)((bMa() - this.obn) * bLU());
      }
    }
  }

  private int bLW()
  {
    int i;
    if (getChildCount() == 0)
      i = 0;
    while (true)
    {
      return i;
      if (!this.alF)
      {
        if (!this.alD)
          i = getCurrentPosition();
        else
          i = getItemCount() - getCurrentPosition() - 1;
      }
      else
      {
        float f = bMf();
        if (!this.alD)
          i = (int)f;
        else
          i = (int)(f + (getItemCount() - 1) * this.obq);
      }
    }
  }

  private int bLX()
  {
    int i;
    if (getChildCount() == 0)
      i = 0;
    while (true)
    {
      return i;
      if (!this.alF)
        i = 1;
      else
        i = (int)this.obq;
    }
  }

  private int bLY()
  {
    int i;
    if (getChildCount() == 0)
      i = 0;
    while (true)
    {
      return i;
      if (!this.alF)
        i = getItemCount();
      else
        i = (int)(getItemCount() * this.obq);
    }
  }

  private boolean bLZ()
  {
    if (this.obu != -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private float bMa()
  {
    if (!this.alD);
    for (float f = (getItemCount() - 1) * this.obq; ; f = 0.0F)
      return f;
  }

  private float bMb()
  {
    if (!this.alD);
    for (float f = 0.0F; ; f = -(getItemCount() - 1) * this.obq)
      return f;
  }

  private float bMc()
  {
    return this.obo.jg() - this.obl;
  }

  private float bMd()
  {
    return -this.obi - this.obo.je() - this.obl;
  }

  private int bMe()
  {
    if (this.obq == 0.0F);
    for (int i = 0; ; i = Math.round(this.obn / this.obq))
      return i;
  }

  private float bMf()
  {
    float f;
    if (this.alD)
      if (this.alm)
        if (this.obn <= 0.0F)
          f = this.obn % (this.obq * getItemCount());
    while (true)
    {
      return f;
      f = getItemCount() * -this.obq + this.obn % (this.obq * getItemCount());
      continue;
      f = this.obn;
      continue;
      if (this.alm)
      {
        if (this.obn >= 0.0F)
          f = this.obn % (this.obq * getItemCount());
        else
          f = getItemCount() * this.obq + this.obn % (this.obq * getItemCount());
      }
      else
        f = this.obn;
    }
  }

  private static View d(RecyclerView.o paramo, RecyclerView.s params, int paramInt)
  {
    while (true)
    {
      if ((paramInt >= params.getItemCount()) || (paramInt < 0))
        paramo = null;
      while (true)
      {
        return paramo;
        try
        {
          View localView = paramo.cq(paramInt);
          paramo = localView;
        }
        catch (Exception localException)
        {
          paramInt++;
        }
      }
    }
  }

  private static void jdMethod_do(View paramView)
  {
    paramView.setRotation(0.0F);
    paramView.setRotationY(0.0F);
    paramView.setRotationX(0.0F);
    paramView.setScaleX(1.0F);
    paramView.setScaleY(1.0F);
    paramView.setAlpha(1.0F);
  }

  private void e(RecyclerView.o paramo)
  {
    b(paramo);
    this.obh.clear();
    int i = getItemCount();
    if (i == 0)
      return;
    int j;
    label35: int k;
    int m;
    label70: label99: int n;
    int i1;
    int i2;
    int i3;
    if (this.alD)
    {
      j = -bMe();
      k = j - this.obs;
      m = this.obt + j;
      if (bLZ())
      {
        if (this.obu % 2 != 0)
          break label317;
        m = 1;
        if (m == 0)
          break label323;
        m = this.obu / 2;
        k = j - m + 1;
        m = m + j + 1;
      }
      n = m;
      i1 = k;
      if (!this.alm)
      {
        i2 = m;
        i3 = k;
        if (k < 0)
        {
          if (!bLZ())
            break label426;
          i2 = this.obu;
          i3 = 0;
        }
      }
    }
    while (true)
    {
      n = i2;
      i1 = i3;
      if (i2 > i)
      {
        n = i;
        i1 = i3;
      }
      float f1 = 1.4E-45F;
      m = i1;
      label172: if (m < n)
      {
        if ((!bLZ()) && (aK(xS(m) - this.obn)))
          break label412;
        if (m >= i)
          k = m % i;
      }
      while (true)
      {
        label216: View localView = paramo.cq(k);
        bu(localView);
        jdMethod_do(localView);
        n(localView, xS(m) - this.obn);
        float f2;
        if (this.obr)
        {
          f2 = 0.0F;
          label262: if (f2 <= f1)
            break label391;
          addView(localView);
          label276: if (m == j)
            this.obx = localView;
          this.obh.put(m, localView);
        }
        while (true)
        {
          m++;
          f1 = f2;
          break label172;
          j = bMe();
          break label35;
          label317: m = 0;
          break label70;
          label323: m = (this.obu - 1) / 2;
          k = j - m;
          m = m + j + 1;
          break label99;
          if (m >= 0)
            break label419;
          i3 = -m % i;
          k = i3;
          if (i3 == 0)
            k = i;
          k = i - k;
          break label216;
          f2 = k;
          break label262;
          label391: addView(localView, 0);
          break label276;
          this.obx.requestFocus();
          break;
          label412: f2 = f1;
        }
        label419: k = m;
      }
      label426: i3 = 0;
      i2 = m;
    }
  }

  private int getCurrentPosition()
  {
    if (getItemCount() == 0);
    for (int i = 0; ; i = Math.abs(i))
    {
      return i;
      i = bMe();
      if (this.alm)
        break;
    }
    int j;
    if (!this.alD)
      if (i >= 0)
        j = i % getItemCount();
    while (true)
    {
      i = j;
      if (j != getItemCount())
        break;
      i = 0;
      break;
      j = getItemCount();
      j = i % getItemCount() + j;
      continue;
      if (i > 0)
        j = getItemCount() - i % getItemCount();
      else
        j = -i % getItemCount();
    }
  }

  private void n(View paramView, float paramFloat)
  {
    int i = aL(paramFloat);
    int j = aM(paramFloat);
    if (this.mOrientation == 1)
      j(paramView, this.obm + i, this.obl + j, i + this.obm + this.obk, j + this.obl + this.obi);
    while (true)
    {
      m(paramView, paramFloat);
      return;
      j(paramView, this.obl + i, this.obm + j, i + this.obl + this.obi, j + this.obm + this.obk);
    }
  }

  private float xS(int paramInt)
  {
    if (this.alD);
    for (float f = paramInt * -this.obq; ; f = paramInt * this.obq)
      return f;
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 1);
    for (paramInt = 0; ; paramInt = b(paramInt, paramo))
      return paramInt;
  }

  public final View a(View paramView, int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return null;
  }

  public final void a(RecyclerView.s params)
  {
    super.a(params);
    this.obp = null;
    this.alG = -1;
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    int i;
    int j;
    int k;
    if (this.alm)
    {
      i = getCurrentPosition();
      j = getItemCount();
      if (paramInt < i)
      {
        k = i - paramInt;
        paramInt = j - i + paramInt;
        if (k < paramInt)
        {
          paramInt = i - k;
          paramInt = qY(paramInt);
          label52: if (this.mOrientation != 1)
            break label120;
          paramRecyclerView.a(0, paramInt, this.obv);
        }
      }
    }
    while (true)
    {
      return;
      paramInt = i + paramInt;
      break;
      k = paramInt - i;
      paramInt = j + i - paramInt;
      if (k < paramInt)
      {
        paramInt = i + k;
        break;
      }
      paramInt = i - paramInt;
      break;
      paramInt = qY(paramInt);
      break label52;
      label120: paramRecyclerView.a(paramInt, 0, this.obv);
    }
  }

  public final void a(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
    super.a(paramRecyclerView, paramo);
    if (this.alI)
    {
      d(paramo);
      paramo.clear();
    }
  }

  public final boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = getCurrentPosition();
    View localView = bW(j);
    if (localView == null);
    while (true)
    {
      return true;
      if (paramRecyclerView.hasFocus())
      {
        if (this.mOrientation == 1)
          if (paramInt1 == 33)
            if (this.alD)
            {
              paramInt1 = i;
              label55: if (paramInt1 == -1)
                break label156;
              if (paramInt1 != 1)
                break label158;
            }
        label156: label158: for (paramInt1 = j - 1; ; paramInt1 = j + 1)
        {
          d.a(paramRecyclerView, this, paramInt1);
          break;
          paramInt1 = 1;
          break label55;
          if (paramInt1 == 130)
          {
            paramInt1 = i;
            if (!this.alD)
              break label55;
            paramInt1 = 1;
            break label55;
          }
          paramInt1 = -1;
          break label55;
          if (paramInt1 == 17)
          {
            paramInt1 = i;
            if (this.alD)
              break label55;
            paramInt1 = 1;
            break label55;
          }
          if (paramInt1 == 66)
          {
            paramInt1 = i;
            if (!this.alD)
              break label55;
            paramInt1 = 1;
            break label55;
          }
          paramInt1 = -1;
          break label55;
          break;
        }
      }
      localView.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }

  public final void ah(boolean paramBoolean)
  {
    T(null);
    if (paramBoolean == this.alC);
    while (true)
    {
      return;
      this.alC = paramBoolean;
      removeAllViews();
    }
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 0);
    for (paramInt = 0; ; paramInt = b(paramInt, paramo))
      return paramInt;
  }

  protected abstract float bLT();

  protected float bLU()
  {
    return 1.0F;
  }

  protected void bLV()
  {
  }

  public final View bW(int paramInt)
  {
    int i = getItemCount();
    View localView;
    if (i == 0)
      localView = null;
    while (true)
    {
      return localView;
      for (int j = 0; ; j++)
      {
        if (j >= this.obh.size())
          break label117;
        int k = this.obh.keyAt(j);
        if (k >= 0)
        {
          if (paramInt != k % i)
            continue;
          localView = (View)this.obh.valueAt(j);
          break;
        }
        int m = k % i;
        k = m;
        if (m == 0)
          k = -i;
        if (k + i == paramInt)
        {
          localView = (View)this.obh.valueAt(j);
          break;
        }
      }
      label117: localView = null;
    }
  }

  public final void bY(int paramInt)
  {
    if ((!this.alm) && ((paramInt < 0) || (paramInt >= getItemCount())))
      return;
    this.alG = paramInt;
    if (this.alD);
    for (float f = paramInt * -this.obq; ; f = paramInt * this.obq)
    {
      this.obn = f;
      requestLayout();
      break;
    }
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    if (params.getItemCount() == 0)
    {
      d(paramo);
      this.obn = 0.0F;
      return;
    }
    iJ();
    boolean bool;
    if ((this.mOrientation == 1) || (!ib()))
      bool = this.alC;
    while (true)
    {
      this.alD = bool;
      params = d(paramo, params, 0);
      if (params != null)
        break label88;
      d(paramo);
      this.obn = 0.0F;
      break;
      if (!this.alC)
        bool = true;
      else
        bool = false;
    }
    label88: bu(params);
    this.obi = this.obo.bj(params);
    this.obk = this.obo.bk(params);
    this.obl = ((this.obo.jg() - this.obi) / 2);
    if (this.obw == 2147483647)
    {
      this.obm = ((this.obo.bLR() - this.obk) / 2);
      label162: this.obq = bLT();
      bLV();
      if (this.obq != 0.0F)
        break label299;
      this.obs = 1;
      this.obt = 1;
      label193: if (this.obp != null)
      {
        this.alD = this.obp.oby;
        this.alG = this.obp.position;
        this.obn = this.obp.offset;
      }
      if (this.alG != -1)
        if (!this.alD)
          break label340;
    }
    label299: label340: for (float f = this.alG * -this.obq; ; f = this.alG * this.obq)
    {
      this.obn = f;
      e(paramo);
      break;
      this.obm = (this.obo.bLR() - this.obk - this.obw);
      break label162;
      this.obs = ((int)Math.abs(bMd() / this.obq) + 1);
      this.obt = ((int)Math.abs(bMc() / this.obq) + 1);
      break label193;
    }
  }

  public final int d(RecyclerView.s params)
  {
    return bLW();
  }

  public final int e(RecyclerView.s params)
  {
    return bLW();
  }

  public final int f(RecyclerView.s params)
  {
    return bLX();
  }

  public final int g(RecyclerView.s params)
  {
    return bLX();
  }

  public final int getOrientation()
  {
    return this.mOrientation;
  }

  public final int h(RecyclerView.s params)
  {
    return bLY();
  }

  public final int i(RecyclerView.s params)
  {
    return bLY();
  }

  public final RecyclerView.LayoutParams iA()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }

  public final boolean iG()
  {
    if (this.mOrientation == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean iH()
  {
    boolean bool = true;
    if (this.mOrientation == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void iJ()
  {
    if (this.obo == null)
      this.obo = b.a(this, this.mOrientation);
  }

  public final void jW()
  {
    removeAllViews();
    this.obn = 0.0F;
  }

  protected abstract void m(View paramView, float paramFloat);

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ViewPagerLayoutManager.SavedState))
    {
      this.obp = new ViewPagerLayoutManager.SavedState((ViewPagerLayoutManager.SavedState)paramParcelable);
      requestLayout();
    }
  }

  public final Parcelable onSaveInstanceState()
  {
    ViewPagerLayoutManager.SavedState localSavedState;
    if (this.obp != null)
      localSavedState = new ViewPagerLayoutManager.SavedState(this.obp);
    while (true)
    {
      return localSavedState;
      localSavedState = new ViewPagerLayoutManager.SavedState();
      localSavedState.position = this.alG;
      localSavedState.offset = this.obn;
      localSavedState.oby = this.alD;
    }
  }

  public final int qY(int paramInt)
  {
    if (this.alm)
    {
      int i = bMe();
      if (!this.alD)
        paramInt -= bMe();
      while (true)
      {
        paramInt = (int)(((paramInt + i) * this.obq - this.obn) * bLU());
        return paramInt;
        paramInt = -bMe() - paramInt;
      }
    }
    float f1 = paramInt;
    if (!this.alD);
    for (float f2 = this.obq; ; f2 = -this.obq)
    {
      paramInt = (int)((f2 * f1 - this.obn) * bLU());
      break;
    }
  }

  public final void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(paramInt)));
    T(null);
    if (paramInt == this.mOrientation);
    while (true)
    {
      return;
      this.mOrientation = paramInt;
      this.obo = null;
      this.obw = 2147483647;
      removeAllViews();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager
 * JD-Core Version:    0.6.2
 */