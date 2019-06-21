package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

public abstract class ac extends FrameLayout
{
  private aj a = null;

  public ac(Context paramContext, ak paramak)
  {
    super(paramContext);
    setClickable(true);
    if (isInEditMode());
    while (true)
    {
      return;
      a(paramContext, paramak);
    }
  }

  private void a(Context paramContext, ak paramak)
  {
    setBackgroundColor(Color.rgb(222, 215, 214));
    setEnabled(true);
    this.a = new aj(this, paramContext, paramak);
  }

  public void a()
  {
    if (this.a != null)
      this.a.p();
  }

  public void b()
  {
    if (this.a != null)
      this.a.q();
  }

  public void c()
  {
    if (this.a != null)
    {
      this.a.s();
      this.a = null;
    }
  }

  public void d()
  {
    if (this.a != null)
      this.a.o();
  }

  public void e()
  {
    if (this.a != null)
      this.a.r();
  }

  public void f()
  {
    if (this.a != null)
      this.a.n();
  }

  public final aj getMap()
  {
    return this.a;
  }

  public int[] getMapPadding()
  {
    return new int[] { getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() };
  }

  public abstract int getMapViewType();

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.b().b().onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.a != null) && (this.a.c() != null) && (this.a.c().l() != null));
    for (boolean bool = this.a.c().l().a(paramMotionEvent); ; bool = super.onTouchEvent(paramMotionEvent))
      return bool;
  }

  public void setOnTop(boolean paramBoolean)
  {
    if (this.a != null)
      this.a.d(paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ac
 * JD-Core Version:    0.6.2
 */