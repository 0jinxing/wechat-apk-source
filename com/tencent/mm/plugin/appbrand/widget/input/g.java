package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.ad;
import com.tencent.mm.plugin.appbrand.page.af;
import com.tencent.mm.plugin.appbrand.page.ao;
import com.tencent.mm.plugin.appbrand.page.ao.a;
import com.tencent.mm.plugin.appbrand.page.ar;
import com.tencent.mm.plugin.appbrand.page.au;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.y.b;
import com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import com.tencent.mm.plugin.appbrand.widget.base.e;
import com.tencent.mm.plugin.appbrand.widget.base.e.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class g extends AbsoluteLayout
  implements ad, af, ao, ar, y.b, com.tencent.mm.plugin.appbrand.widget.base.d
{
  private final List<ao.a> jdA;
  final e jdB;
  private final AbsoluteLayout jdC;
  private final u jdD;
  private boolean jdE;
  private int jdF;
  private int jdG;

  public g(u paramu)
  {
    super(paramu.mContext);
    AppMethodBeat.i(123600);
    this.jdA = new LinkedList();
    super.setId(2131820570);
    this.jdD = paramu;
    this.jdC = this;
    this.jdB = new e(this.jdC);
    AppMethodBeat.o(123600);
  }

  private void a(com.tencent.mm.plugin.appbrand.page.aj paramaj)
  {
    AppMethodBeat.i(123603);
    paramaj = paramaj.getWrapperView();
    if ((this.jdC.getWidth() != paramaj.getWidth()) || (this.jdC.getHeight() != paramaj.getHeight()))
    {
      ViewGroup.LayoutParams localLayoutParams = this.jdC.getLayoutParams();
      localLayoutParams.width = paramaj.getWidth();
      localLayoutParams.height = paramaj.getHeight();
      this.jdC.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(123603);
  }

  private <Input extends View,  extends ab> boolean b(com.tencent.mm.plugin.appbrand.page.aj paramaj, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123602);
    boolean bool;
    if ((paramaj == null) || (paramaj.getWrapperView() == null) || (paramInput == null))
    {
      bool = false;
      AppMethodBeat.o(123602);
    }
    while (true)
    {
      return bool;
      a(paramaj);
      paramaj = new AbsoluteLayout.LayoutParams(paramInt1, paramInt2, paramInt3, paramInt4);
      this.jdC.addView(paramInput, paramaj);
      ((ab)paramInput).y(this.jdD);
      bool = true;
      AppMethodBeat.o(123602);
    }
  }

  private boolean c(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123616);
    if (this.jdC == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(123616);
    }
    while (true)
    {
      return paramBoolean;
      ViewGroup.LayoutParams localLayoutParams = this.jdC.getLayoutParams();
      if (localLayoutParams == null)
      {
        localLayoutParams = new ViewGroup.LayoutParams(paramInt1, paramInt2);
        this.jdC.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(123616);
        paramBoolean = true;
      }
      else if ((paramInt1 != localLayoutParams.width) || (paramInt2 != localLayoutParams.height))
      {
        localLayoutParams.width = paramInt1;
        localLayoutParams.height = paramInt2;
        this.jdC.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(123616);
        paramBoolean = true;
      }
      else
      {
        AppMethodBeat.o(123616);
      }
    }
  }

  private <Input extends View,  extends ab> boolean cE(Input paramInput)
  {
    boolean bool = false;
    AppMethodBeat.i(123605);
    if (paramInput == null)
      AppMethodBeat.o(123605);
    while (true)
    {
      return bool;
      if (this.jdC == null)
      {
        AppMethodBeat.o(123605);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= this.jdC.getChildCount())
            break label74;
          if (paramInput == this.jdC.getChildAt(i))
          {
            bool = true;
            AppMethodBeat.o(123605);
            break;
          }
        }
        label74: AppMethodBeat.o(123605);
      }
    }
  }

  public final boolean E(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(123610);
    if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0))
      AppMethodBeat.o(123610);
    while (true)
    {
      return bool;
      e locale = this.jdB;
      if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0) || (locale.iVl == null))
      {
        AppMethodBeat.o(123610);
      }
      else if ((paramMotionEvent.getDownTime() == locale.iVl.iVm) && (paramMotionEvent.getEventTime() == locale.iVl.iVn))
      {
        bool = true;
        AppMethodBeat.o(123610);
      }
      else
      {
        AppMethodBeat.o(123610);
      }
    }
  }

  public final void a(ao.a parama)
  {
    AppMethodBeat.i(123611);
    if (parama == null)
      AppMethodBeat.o(123611);
    while (true)
    {
      return;
      if (this.jdA.contains(parama))
      {
        AppMethodBeat.o(123611);
      }
      else
      {
        this.jdA.add(parama);
        AppMethodBeat.o(123611);
      }
    }
  }

  public final <Input extends View,  extends ab> boolean a(com.tencent.mm.plugin.appbrand.page.aj paramaj, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123601);
    boolean bool = b(paramaj, paramInput, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(123601);
    return bool;
  }

  public final boolean aOQ()
  {
    boolean bool = false;
    AppMethodBeat.i(123609);
    if (getChildCount() <= 0)
      AppMethodBeat.o(123609);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i > getChildCount())
          break label58;
        if (AppBrandViewMotionCompat.cB(getChildAt(i)))
        {
          bool = true;
          AppMethodBeat.o(123609);
          break;
        }
      }
      label58: AppMethodBeat.o(123609);
    }
  }

  public final void b(ao.a parama)
  {
    AppMethodBeat.i(123612);
    if (parama == null)
      AppMethodBeat.o(123612);
    while (true)
    {
      return;
      this.jdA.remove(parama);
      AppMethodBeat.o(123612);
    }
  }

  public final void c(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123615);
    if (c(paramBoolean, paramInt3 - paramInt1, paramInt4 - paramInt2))
      post(new g.1(this));
    AppMethodBeat.o(123615);
  }

  public final <Input extends View,  extends ab> boolean c(com.tencent.mm.plugin.appbrand.page.aj paramaj, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = false;
    AppMethodBeat.i(123604);
    if ((paramaj == null) || (paramaj.getWrapperView() == null) || (paramInput == null))
      AppMethodBeat.o(123604);
    while (true)
    {
      return bool;
      if (!cE(paramInput))
      {
        AppMethodBeat.o(123604);
      }
      else
      {
        a(paramaj);
        if ((paramInput.getLayoutParams() == null) || (!(paramInput.getLayoutParams() instanceof AbsoluteLayout.LayoutParams)))
        {
          AppMethodBeat.o(123604);
        }
        else
        {
          if ((paramInput.getWidth() != paramInt1) || (paramInput.getHeight() != paramInt2) || (paramInput.getLeft() != paramInt3) || (paramInput.getTop() != paramInt4))
          {
            paramaj = (AbsoluteLayout.LayoutParams)paramInput.getLayoutParams();
            paramaj.x = paramInt3;
            paramaj.y = paramInt4;
            paramaj.width = paramInt1;
            paramaj.height = paramInt2;
            paramInput.setLayoutParams(paramaj);
          }
          bool = true;
          AppMethodBeat.o(123604);
        }
      }
    }
  }

  public final <Input extends View,  extends ab> void cF(Input paramInput)
  {
    AppMethodBeat.i(123606);
    if (paramInput == null)
      AppMethodBeat.o(123606);
    while (true)
    {
      return;
      paramInput.setVisibility(8);
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputContainer", "clearWebView imm active = %b", new Object[] { Boolean.valueOf(aj.cS(this).isActive()) });
      this.jdC.removeView(paramInput);
      ((ab)paramInput).z(this.jdD);
      AppMethodBeat.o(123606);
    }
  }

  public final boolean g(Canvas paramCanvas)
  {
    AppMethodBeat.i(123617);
    paramCanvas.save();
    paramCanvas.translate(-getScrollX(), -getScrollY());
    if (au.i(this))
      au.a(paramCanvas, this, 0.0F, 0.0F);
    while (true)
    {
      paramCanvas.restore();
      AppMethodBeat.o(123617);
      return true;
      com.tencent.mm.sdk.platformtools.d.a(paramCanvas, this);
    }
  }

  protected final void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123614);
    if (this.jdE)
      paramView.forceLayout();
    super.measureChild(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(123614);
  }

  public final void nT(int paramInt)
  {
    AppMethodBeat.i(123608);
    setTranslationY(paramInt);
    AppMethodBeat.o(123608);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123613);
    if ((isLayoutRequested()) || (paramInt1 != this.jdF) || (paramInt2 != this.jdG));
    for (boolean bool = true; ; bool = false)
    {
      this.jdE = bool;
      this.jdF = paramInt1;
      this.jdG = paramInt2;
      super.onMeasure(paramInt1, paramInt2);
      this.jdE = false;
      AppMethodBeat.o(123613);
      return;
    }
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(123607);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputContainer", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.jdC != null)
    {
      c(false, paramView.getWidth(), paramView.getHeight());
      this.jdC.scrollTo(paramInt1, paramInt2);
    }
    paramView = this.jdA.iterator();
    while (paramView.hasNext())
      ((ao.a)paramView.next()).dk(paramInt1, paramInt2);
    AppMethodBeat.o(123607);
  }

  public final void setId(int paramInt)
  {
  }

  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.g
 * JD-Core Version:    0.6.2
 */