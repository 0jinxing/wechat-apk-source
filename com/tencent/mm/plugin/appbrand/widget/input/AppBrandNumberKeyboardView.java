package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView;
import com.tencent.mm.plugin.appbrand.widget.input.numberpad.a;

final class AppBrandNumberKeyboardView extends BaseNumberKeyboardView
{
  private int jfD;
  private final SparseArray<String> jfE;
  InputConnection jfF;
  a jfG;

  AppBrandNumberKeyboardView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(123759);
    this.jfD = 0;
    this.jfE = new AppBrandNumberKeyboardView.1(this);
    init();
    AppMethodBeat.o(123759);
  }

  public AppBrandNumberKeyboardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(123760);
    this.jfD = 0;
    this.jfE = new AppBrandNumberKeyboardView.1(this);
    init();
    AppMethodBeat.o(123760);
  }

  private void init()
  {
    AppMethodBeat.i(123761);
    AppBrandNumberKeyboardView.2 local2 = new AppBrandNumberKeyboardView.2(this);
    for (int i = 0; i < this.jfE.size(); i++)
      findViewById(getId((String)this.jfE.valueAt(i))).setOnClickListener(local2);
    findViewById(getId("tenpay_keyboard_x")).setOnClickListener(local2);
    findViewById(getId("tenpay_keyboard_d")).setOnClickListener(null);
    findViewById(getId("tenpay_keyboard_d")).setOnTouchListener(new AppBrandNumberKeyboardView.3(this));
    AppMethodBeat.o(123761);
  }

  public final void onDetachedFromWindow()
  {
    AppMethodBeat.i(123763);
    super.onDetachedFromWindow();
    setInputEditText(null);
    AppMethodBeat.o(123763);
  }

  public final void setXMode(int paramInt)
  {
    AppMethodBeat.i(123762);
    super.setXMode(paramInt);
    this.jfD = paramInt;
    AppMethodBeat.o(123762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView
 * JD-Core Version:    0.6.2
 */