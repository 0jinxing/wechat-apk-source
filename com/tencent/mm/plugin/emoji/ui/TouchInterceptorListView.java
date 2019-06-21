package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;

public class TouchInterceptorListView extends ListView
{
  private int aaI;
  private int aaJ;
  private GestureDetector iay;
  private int kSf;
  private ImageView lbZ;
  private WindowManager lca;
  private WindowManager.LayoutParams lcb;
  private int lcc;
  private int lcd;
  private int lce;
  private int lcf;
  private TouchInterceptorListView.a lcg;
  private TouchInterceptorListView.b lch;
  private TouchInterceptorListView.c lci;
  private int lcj;
  private int lck;
  private int lcl;
  private Bitmap lcm;
  private int lcn;
  private int lco;
  private Drawable lcp;
  private int lcq;
  private int mHeight;
  private Rect mTempRect;
  private final int mTouchSlop;

  public TouchInterceptorListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53527);
    this.lcl = -1;
    this.mTempRect = new Rect();
    this.lcq = 0;
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    paramContext = getResources();
    this.kSf = (paramContext.getDimensionPixelSize(2131428357) + 1);
    this.lco = (this.kSf / 2);
    this.lcn = (this.kSf * 2);
    this.lcq = paramContext.getDimensionPixelOffset(2131428364);
    AppMethodBeat.o(53527);
  }

  private void blU()
  {
    AppMethodBeat.i(53532);
    if (this.lbZ != null)
    {
      this.lbZ.setVisibility(8);
      ((WindowManager)getContext().getSystemService("window")).removeView(this.lbZ);
      this.lbZ.setImageDrawable(null);
      this.lbZ = null;
    }
    if (this.lcm != null)
    {
      ab.i("MicroMsg.emoji.TouchInterceptorListView", "bitmap recycle %s", new Object[] { this.lcm });
      this.lcm.recycle();
      this.lcm = null;
    }
    if (this.lcp != null)
      this.lcp.setLevel(0);
    AppMethodBeat.o(53532);
  }

  private int dT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53529);
    int i;
    if (paramInt2 < 0)
    {
      i = dT(paramInt1, this.kSf + paramInt2);
      if (i > 0)
      {
        paramInt1 = i - 1;
        AppMethodBeat.o(53529);
      }
    }
    while (true)
    {
      return paramInt1;
      Rect localRect = this.mTempRect;
      for (i = getChildCount() - 1; ; i--)
      {
        if (i < 0)
          break label94;
        getChildAt(i).getHitRect(localRect);
        if (localRect.contains(paramInt1, paramInt2))
        {
          paramInt1 = i + getFirstVisiblePosition();
          AppMethodBeat.o(53529);
          break;
        }
      }
      label94: paramInt1 = -1;
      AppMethodBeat.o(53529);
    }
  }

  private void gr(boolean paramBoolean)
  {
    AppMethodBeat.i(53530);
    int i = 0;
    while (true)
    {
      Object localObject1 = getChildAt(i);
      Object localObject2 = localObject1;
      if (localObject1 == null)
        if (paramBoolean)
        {
          int j = getFirstVisiblePosition();
          int k = getChildAt(0).getTop();
          setAdapter(getAdapter());
          setSelectionFromTop(j, k);
        }
      try
      {
        layoutChildren();
        localObject2 = getChildAt(i);
        localObject1 = localObject2;
        label70: localObject2 = localObject1;
        if (localObject1 == null)
        {
          AppMethodBeat.o(53530);
          return;
        }
        localObject1 = ((View)localObject2).getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = this.kSf;
        ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        ((View)localObject2).setVisibility(0);
        i++;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        break label70;
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(53528);
    if ((this.lci != null) && (this.iay == null) && (this.lcl == 0))
      this.iay = new GestureDetector(getContext(), new TouchInterceptorListView.1(this));
    if ((this.lcg != null) || (this.lch != null))
      switch (paramMotionEvent.getAction())
      {
      default:
      case 0:
      }
    while (true)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53528);
      while (true)
      {
        return bool;
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        int k = pointToPosition(i, j);
        if (k == -1)
          break;
        Object localObject = (ViewGroup)getChildAt(k - getFirstVisiblePosition());
        this.lce = (i - ((ViewGroup)localObject).getLeft());
        this.lcf = (j - ((ViewGroup)localObject).getTop());
        this.aaI = ((int)paramMotionEvent.getRawX() - i);
        this.aaJ = ((int)paramMotionEvent.getRawY() - j);
        if (i >= this.lcq)
          break label485;
        ((ViewGroup)localObject).setDrawingCacheEnabled(true);
        paramMotionEvent = Bitmap.createBitmap(((ViewGroup)localObject).getDrawingCache());
        blU();
        this.lcb = new WindowManager.LayoutParams();
        this.lcb.gravity = 49;
        this.lcb.x = (i - this.lce + this.aaI);
        this.lcb.y = (j - this.lcf + this.aaJ);
        this.lcb.height = -2;
        this.lcb.width = -2;
        this.lcb.flags = 920;
        this.lcb.format = -3;
        this.lcb.windowAnimations = 0;
        Context localContext = getContext();
        localObject = new ImageView(localContext);
        ((ImageView)localObject).setBackgroundColor(localContext.getResources().getColor(2131690691));
        ((ImageView)localObject).setBackgroundResource(2130838602);
        ((ImageView)localObject).setPadding(0, 0, 0, 0);
        ((ImageView)localObject).setImageBitmap(paramMotionEvent);
        this.lcm = paramMotionEvent;
        this.lca = ((WindowManager)localContext.getSystemService("window"));
        this.lca.addView((View)localObject, this.lcb);
        this.lbZ = ((ImageView)localObject);
        this.lcc = k;
        this.lcd = this.lcc;
        this.mHeight = getHeight();
        i = this.mTouchSlop;
        this.lcj = Math.min(j - i, this.mHeight / 3);
        this.lck = Math.max(i + j, this.mHeight * 2 / 3);
        AppMethodBeat.o(53528);
        bool = false;
      }
      label485: blU();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 4;
    boolean bool = true;
    int j = 0;
    AppMethodBeat.i(53531);
    if (this.iay != null)
      this.iay.onTouchEvent(paramMotionEvent);
    int k;
    if (((this.lcg != null) || (this.lch != null)) && (this.lbZ != null))
    {
      k = paramMotionEvent.getAction();
      switch (k)
      {
      default:
        AppMethodBeat.o(53531);
      case 1:
      case 3:
      case 0:
      case 2:
      }
    }
    while (true)
    {
      return bool;
      Object localObject = this.mTempRect;
      this.lbZ.getDrawingRect((Rect)localObject);
      blU();
      if ((this.lcl == 1) && (paramMotionEvent.getX() > ((Rect)localObject).right * 3 / 4))
      {
        gr(true);
        break;
      }
      if ((this.lch != null) && (this.lcc >= 0))
        getCount();
      gr(false);
      break;
      int m = (int)paramMotionEvent.getX();
      int n = (int)paramMotionEvent.getY();
      if (this.lcl == 1)
      {
        float f = 1.0F;
        i1 = this.lbZ.getWidth();
        if (m > i1 / 2)
          f = (i1 - m) / (i1 / 2);
        this.lcb.alpha = f;
      }
      label276: label350: int i2;
      label397: int i3;
      int i4;
      if ((this.lcl == 0) || (this.lcl == 2))
      {
        this.lcb.x = (m - this.lce + this.aaI);
        this.lcb.y = (n - this.lcf + this.aaJ);
        this.lca.updateViewLayout(this.lbZ, this.lcb);
        if (this.lcp != null)
        {
          i1 = this.lbZ.getWidth();
          if (n <= getHeight() * 3 / 4)
            break label629;
          this.lcp.setLevel(2);
        }
        i2 = n - this.lcf - this.lco;
        i1 = dT(0, i2);
        if (i1 < 0)
          break label667;
        m = i1;
        if (i1 <= this.lcd)
          m = i1 + 1;
        if (m < 0)
          break label680;
        if ((k != 0) && (m == this.lcc))
          break label849;
        this.lcc = m;
        ab.d("MicroMsg.emoji.TouchInterceptorListView", "doExpansion mDragPos:%d mSrcDragPos:%d", new Object[] { Integer.valueOf(this.lcc), Integer.valueOf(this.lcd) });
        ab.d("MicroMsg.emoji.TouchInterceptorListView", "getFirstVisiblePosition:%d", new Object[] { Integer.valueOf(getFirstVisiblePosition()) });
        ab.d("MicroMsg.emoji.TouchInterceptorListView", "getHeaderViewsCount:%d", new Object[] { Integer.valueOf(getHeaderViewsCount()) });
        i2 = this.lcc;
        i3 = getFirstVisiblePosition();
        i4 = getHeaderViewsCount();
        localObject = getChildAt(this.lcd - getFirstVisiblePosition());
        k = 0;
        label534: paramMotionEvent = getChildAt(k);
        if (paramMotionEvent == null)
          break label849;
        i1 = this.kSf;
        if ((this.lcc >= i4) || (k != i4))
          break label702;
        if (!paramMotionEvent.equals(localObject))
          break label682;
        ab.d("MicroMsg.emoji.TouchInterceptorListView", "1. visibility = View.INVISIBLE");
        m = 4;
      }
      while (true)
      {
        ViewGroup.LayoutParams localLayoutParams = paramMotionEvent.getLayoutParams();
        localLayoutParams.height = i1;
        paramMotionEvent.setLayoutParams(localLayoutParams);
        paramMotionEvent.setVisibility(m);
        k++;
        break label534;
        this.lcb.x = 0;
        break label276;
        label629: if ((i1 > 0) && (m > i1 / 4))
        {
          this.lcp.setLevel(1);
          break label350;
        }
        this.lcp.setLevel(0);
        break label350;
        label667: m = i1;
        if (i2 >= 0)
          break label397;
        m = 0;
        break label397;
        label680: break;
        label682: i1 = this.lcn;
        ab.d("MicroMsg.emoji.TouchInterceptorListView", "1. height = mItemHeightExpanded");
        m = 0;
        continue;
        label702: if (paramMotionEvent.equals(localObject))
        {
          if ((this.lcc == this.lcd) || (getPositionForView(paramMotionEvent) == getCount()))
          {
            i1 = this.kSf;
            ab.d("MicroMsg.emoji.TouchInterceptorListView", "2. visibility = View.INVISIBLE");
            m = 4;
          }
          else
          {
            ab.d("MicroMsg.emoji.TouchInterceptorListView", "2. height = 1");
            m = 0;
            i1 = 1;
          }
        }
        else if (k == i2 - i3)
        {
          if ((this.lcc >= i4) && (this.lcc < getCount()))
          {
            i1 = this.lcn;
            ab.d("MicroMsg.emoji.TouchInterceptorListView", "3. height = mItemHeightExpanded;");
            m = 0;
          }
          else
          {
            ab.d("MicroMsg.emoji.TouchInterceptorListView", "3. ");
            m = 0;
          }
        }
        else
        {
          ab.d("MicroMsg.emoji.TouchInterceptorListView", "4");
          m = 0;
        }
      }
      label849: if (n >= this.mHeight / 3)
        this.lcj = (this.mHeight / 3);
      if (n <= this.mHeight * 2 / 3)
        this.lck = (this.mHeight * 2 / 3);
      if (n > this.lck)
        if (getLastVisiblePosition() < getCount() - 1)
        {
          m = i;
          if (n > (this.mHeight + this.lck) / 2)
            m = 16;
        }
      while (true)
        label940: if ((m != 0) && (!d.fP(8)))
        {
          smoothScrollBy(m, 30);
          break;
          m = 1;
          continue;
          m = j;
          if (n < this.lcj)
            if (n >= this.lcj / 2)
              break label1031;
        }
      label1031: for (int i1 = -16; ; i1 = -4)
      {
        if (getFirstVisiblePosition() == 0)
        {
          m = j;
          if (getChildAt(0).getTop() >= getPaddingTop())
            break label940;
        }
        m = i1;
        break label940;
        break;
      }
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53531);
    }
  }

  public void setDragListener(TouchInterceptorListView.a parama)
  {
    this.lcg = parama;
  }

  public void setDropListener(TouchInterceptorListView.b paramb)
  {
    this.lch = paramb;
  }

  public void setRemoveListener(TouchInterceptorListView.c paramc)
  {
    this.lci = paramc;
  }

  public void setTrashcan(Drawable paramDrawable)
  {
    this.lcp = paramDrawable;
    this.lcl = 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView
 * JD-Core Version:    0.6.2
 */