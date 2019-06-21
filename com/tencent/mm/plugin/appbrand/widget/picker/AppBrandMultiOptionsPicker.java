package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

public final class AppBrandMultiOptionsPicker extends FrameLayout
  implements b<int[]>
{
  private boolean anv;
  private final Drawable jkE;
  public LinearLayout jkF;
  private boolean jkG;
  private d jkH;
  public final YANumberPicker.b jkI;

  @Keep
  public AppBrandMultiOptionsPicker(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126704);
    this.jkI = new AppBrandMultiOptionsPicker.1(this);
    this.jkE = paramContext.getResources().getDrawable(2130837747);
    this.jkF = new LinearLayout(paramContext);
    this.jkF.setPadding(a.fromDPToPix(paramContext, 2), 0, a.fromDPToPix(paramContext, 2), 0);
    this.jkF.setOrientation(0);
    addView(this.jkF, new FrameLayout.LayoutParams(-1, -1, 17));
    this.jkF.setDividerDrawable(this.jkE);
    this.jkF.setShowDividers(2);
    AppMethodBeat.o(126704);
  }

  public final void a(d paramd)
  {
    this.jkH = paramd;
  }

  public final void aEH()
  {
    AppMethodBeat.i(126712);
    int i = getPickersCount();
    for (int j = 0; j < i; j++)
    {
      c localc = qP(j);
      if (localc != null)
        localc.aRX();
    }
    AppMethodBeat.o(126712);
  }

  public final void aEI()
  {
    this.jkH = null;
  }

  public final void b(d paramd)
  {
    this.jkH = paramd;
  }

  public final int getPickersCount()
  {
    AppMethodBeat.i(126710);
    int i;
    if (this.jkF == null)
    {
      i = 0;
      AppMethodBeat.o(126710);
    }
    while (true)
    {
      return i;
      i = this.jkF.getChildCount();
      AppMethodBeat.o(126710);
    }
  }

  public final View getView()
  {
    return this;
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126707);
    boolean bool;
    if (this.anv)
    {
      bool = false;
      AppMethodBeat.o(126707);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(126707);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126708);
    boolean bool;
    if (this.anv)
    {
      bool = false;
      AppMethodBeat.o(126708);
    }
    while (true)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(126708);
    }
  }

  public final c qP(int paramInt)
  {
    c localc = null;
    AppMethodBeat.i(126709);
    if (paramInt < 0)
      AppMethodBeat.o(126709);
    while (true)
    {
      return localc;
      if (this.jkF == null)
      {
        AppMethodBeat.o(126709);
      }
      else
      {
        localc = (c)this.jkF.getChildAt(paramInt);
        AppMethodBeat.o(126709);
      }
    }
  }

  public final void qQ(int paramInt)
  {
    AppMethodBeat.i(126711);
    if (paramInt <= 0)
      AppMethodBeat.o(126711);
    while (true)
    {
      return;
      int i = getPickersCount() - 1;
      while (paramInt > 0)
      {
        this.jkF.removeViewAt(i);
        i--;
        paramInt--;
      }
      AppMethodBeat.o(126711);
    }
  }

  public final void requestLayout()
  {
    AppMethodBeat.i(126706);
    if (this.anv)
    {
      this.jkG = true;
      AppMethodBeat.o(126706);
    }
    while (true)
    {
      return;
      super.requestLayout();
      AppMethodBeat.o(126706);
    }
  }

  public final void setLayoutFrozen(boolean paramBoolean)
  {
    AppMethodBeat.i(126705);
    if (this.anv != paramBoolean)
    {
      this.anv = paramBoolean;
      if (paramBoolean)
      {
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        AppMethodBeat.o(126705);
      }
    }
    while (true)
    {
      return;
      if (this.jkG)
        requestLayout();
      AppMethodBeat.o(126705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker
 * JD-Core Version:    0.6.2
 */