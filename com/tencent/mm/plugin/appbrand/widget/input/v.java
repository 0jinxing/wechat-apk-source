package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v extends LinearLayout
  implements ac
{
  private static final int huq = 2131820560;
  private v.a jfA;
  private AppBrandNumberKeyboardView jfB;
  private boolean jfz;
  EditText tc;

  private v(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(123744);
    this.jfz = false;
    super.setId(huq);
    setOrientation(1);
    setBackgroundColor(-1);
    paramContext = new ViewGroup.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(getContext(), 30));
    RelativeLayout localRelativeLayout = new RelativeLayout(getContext());
    localRelativeLayout.setOnClickListener(new v.1(this));
    localRelativeLayout.setBackgroundResource(2130840442);
    Object localObject = new ImageView(getContext());
    ((ImageView)localObject).setImageResource(2130840441);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(13);
    localRelativeLayout.addView((View)localObject, localLayoutParams);
    addView(localRelativeLayout, paramContext);
    paramContext = new ViewGroup.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(getContext(), 240));
    localObject = new AppBrandNumberKeyboardView(getContext());
    this.jfB = ((AppBrandNumberKeyboardView)localObject);
    addView((View)localObject, paramContext);
    AppMethodBeat.o(123744);
  }

  public static v cL(View paramView)
  {
    AppMethodBeat.i(123742);
    paramView = (v)paramView.getRootView().findViewById(huq);
    AppMethodBeat.o(123742);
    return paramView;
  }

  public static v cM(View paramView)
  {
    AppMethodBeat.i(123743);
    Object localObject1 = cL(paramView);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = n.cG(paramView);
      if (localObject1 == null)
      {
        localObject2 = null;
        AppMethodBeat.o(123743);
      }
    }
    while (true)
    {
      return localObject2;
      localObject2 = new v(paramView.getContext());
      ((n)localObject1).n((View)localObject2, false);
      AppMethodBeat.o(123743);
    }
  }

  private void onDone()
  {
    AppMethodBeat.i(123746);
    if ((!this.jfz) && (this.jfA != null))
    {
      this.jfz = true;
      this.jfA.onDone();
      this.jfz = false;
    }
    AppMethodBeat.o(123746);
  }

  public final boolean aQV()
  {
    AppMethodBeat.i(123745);
    boolean bool = s.as(this);
    AppMethodBeat.o(123745);
    return bool;
  }

  final void aQW()
  {
    AppMethodBeat.i(123751);
    if (this.tc != null)
    {
      this.tc.clearFocus();
      this.tc = null;
      this.jfA = null;
      this.jfz = false;
    }
    AppMethodBeat.o(123751);
  }

  public final EditText getAttachedEditText()
  {
    return this.tc;
  }

  public final int getPanelHeight()
  {
    AppMethodBeat.i(123748);
    int i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 270);
    AppMethodBeat.o(123748);
    return i;
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(123753);
    super.onDetachedFromWindow();
    removeAllViews();
    AppMethodBeat.o(123753);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123752);
    if (isShown())
      paramInt2 = View.MeasureSpec.makeMeasureSpec(getPanelHeight(), 1073741824);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(123752);
  }

  public final void setId(int paramInt)
  {
  }

  public final <_Input extends EditText,  extends com.tencent.mm.plugin.appbrand.widget.input.numberpad.a> void setInputEditText(_Input param_Input)
  {
    AppMethodBeat.i(123749);
    this.tc = param_Input;
    AppBrandNumberKeyboardView localAppBrandNumberKeyboardView = this.jfB;
    param_Input = (com.tencent.mm.plugin.appbrand.widget.input.numberpad.a)param_Input;
    if (localAppBrandNumberKeyboardView.jfG != param_Input)
      if (param_Input == null)
      {
        localAppBrandNumberKeyboardView.jfF = null;
        AppMethodBeat.o(123749);
      }
    while (true)
    {
      return;
      if ((param_Input instanceof View))
        ((View)param_Input).requestFocus();
      if ((param_Input instanceof EditText))
      {
        aj.a.setNoSystemInputOnEditText((EditText)param_Input);
        aj.a.c((EditText)param_Input);
      }
      localAppBrandNumberKeyboardView.jfF = param_Input.aQU();
      AppMethodBeat.o(123749);
    }
  }

  public final void setOnDoneListener(v.a parama)
  {
    this.jfA = parama;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(123747);
    if ((getVisibility() == paramInt) && ((getVisibility() == 0) || (getVisibility() == 8)))
      AppMethodBeat.o(123747);
    while (true)
    {
      return;
      if (paramInt != 0)
      {
        super.setVisibility(8);
        onDone();
        AppMethodBeat.o(123747);
      }
      else
      {
        super.setVisibility(paramInt);
        AppMethodBeat.o(123747);
      }
    }
  }

  public final void setXMode(int paramInt)
  {
    AppMethodBeat.i(123750);
    this.jfB.setXMode(paramInt);
    AppMethodBeat.o(123750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.v
 * JD-Core Version:    0.6.2
 */