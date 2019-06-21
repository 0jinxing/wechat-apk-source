package com.tencent.mm.plugin.appbrand.widget.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

public class d extends RelativeLayout
{
  private static final int jkW;
  private final int jkP;
  private final int jkQ;
  private b jkR;
  private FrameLayout jkS;
  private d.a jkT;
  private boolean jkU;
  d.b jkV;

  static
  {
    AppMethodBeat.i(126740);
    jkW = Color.parseColor("#F9F9F9");
    AppMethodBeat.o(126740);
  }

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126730);
    this.jkP = a.fromDPToPix(paramContext, 48);
    this.jkQ = a.fromDPToPix(paramContext, 240);
    setClickable(true);
    setLongClickable(true);
    Object localObject = new RelativeLayout.LayoutParams(-1, this.jkQ);
    ((RelativeLayout.LayoutParams)localObject).addRule(12);
    paramContext = new FrameLayout(getContext());
    paramContext.setId(2131820574);
    paramContext.setOnClickListener(new d.4(this));
    paramContext.setBackgroundColor(jkW);
    this.jkS = paramContext;
    addView(paramContext, (ViewGroup.LayoutParams)localObject);
    paramContext = new RelativeLayout.LayoutParams(-1, this.jkP);
    paramContext.addRule(2, 2131820574);
    localObject = new RelativeLayout(getContext());
    View localView = dv(2131301237, 2131690135);
    localView.setOnClickListener(new d.1(this));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(11);
    ((RelativeLayout)localObject).addView(localView, localLayoutParams);
    localView = dv(2131301236, 2131689817);
    localView.setOnClickListener(new d.2(this));
    localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(9);
    ((RelativeLayout)localObject).addView(localView, localLayoutParams);
    ((RelativeLayout)localObject).setOnClickListener(new d.3(this));
    ((RelativeLayout)localObject).setBackgroundColor(jkW);
    addView((View)localObject, paramContext);
    AppMethodBeat.o(126730);
  }

  private void aRL()
  {
    this.jkT = null;
    this.jkV = null;
  }

  private void c(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(126729);
    if ((!this.jkU) && (this.jkT != null))
    {
      this.jkU = true;
      this.jkT.b(paramBoolean, paramObject);
      this.jkU = false;
    }
    AppMethodBeat.o(126729);
  }

  private View dv(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126737);
    TextView localTextView = new TextView(new ContextThemeWrapper(getContext(), 2131493040));
    localTextView.setTextColor(getResources().getColor(paramInt2));
    localTextView.setText(paramInt1);
    localTextView.setGravity(17);
    AppMethodBeat.o(126737);
    return localTextView;
  }

  @SuppressLint({"WrongCall"})
  protected final void du(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126735);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(126735);
  }

  protected final int getPanelContentHeight()
  {
    return this.jkP + this.jkQ;
  }

  public b getPicker()
  {
    return this.jkR;
  }

  public void hide()
  {
    AppMethodBeat.i(126733);
    super.setVisibility(8);
    c(false, null);
    if (this.jkR != null)
      this.jkR.aEH();
    AppMethodBeat.o(126733);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(126738);
    super.onDetachedFromWindow();
    aRL();
    removeAllViews();
    AppMethodBeat.o(126738);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126736);
    if (!isShown())
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, -2147483648));
      AppMethodBeat.o(126736);
    }
    while (true)
    {
      return;
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(this.jkP + this.jkQ, 1073741824));
      AppMethodBeat.o(126736);
    }
  }

  public void setOnResultListener(d.a parama)
  {
    this.jkT = parama;
  }

  public void setOnValueUpdateListener(d.b paramb)
  {
    this.jkV = paramb;
  }

  protected void setPickerImpl(b paramb)
  {
    AppMethodBeat.i(126731);
    if (this.jkR != null)
      this.jkR.aEI();
    this.jkR = paramb;
    if (this.jkR != null)
      this.jkR.b(this);
    if ((this.jkS == null) || (this.jkR == null) || (this.jkR.getView() == null))
      AppMethodBeat.o(126731);
    while (true)
    {
      return;
      this.jkS.removeAllViews();
      aRL();
      paramb = new FrameLayout.LayoutParams(-1, -2);
      paramb.gravity = 17;
      this.jkS.addView(this.jkR.getView(), paramb);
      AppMethodBeat.o(126731);
    }
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(126734);
    if (paramInt != 0)
    {
      hide();
      AppMethodBeat.o(126734);
    }
    while (true)
    {
      return;
      super.setVisibility(paramInt);
      AppMethodBeat.o(126734);
    }
  }

  public void show()
  {
    AppMethodBeat.i(126732);
    if (this.jkR == null)
    {
      setVisibility(8);
      AppMethodBeat.o(126732);
    }
    while (true)
    {
      return;
      setVisibility(0);
      if (this.jkR != null)
        this.jkR.a(this);
      AppMethodBeat.o(126732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.d
 * JD-Core Version:    0.6.2
 */