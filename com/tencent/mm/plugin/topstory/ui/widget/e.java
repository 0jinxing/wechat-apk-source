package com.tencent.mm.plugin.topstory.ui.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends PopupWindow
{
  private Activity activity;
  d sIe;
  private int sIf;
  private int sIg;
  private View sIh;
  View sIi;

  public e(Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(2236);
    this.activity = paramActivity;
    this.sIh = ((LayoutInflater)paramActivity.getSystemService("layout_inflater")).inflate(2130969912, null, false);
    setContentView(this.sIh);
    setSoftInputMode(21);
    setInputMethodMode(1);
    this.sIi = paramActivity.findViewById(16908290);
    setWidth(0);
    setHeight(-1);
    this.sIh.getViewTreeObserver().addOnGlobalLayoutListener(new e.1(this));
    AppMethodBeat.o(2236);
  }

  private void fV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2238);
    if (this.sIe != null)
      this.sIe.fU(paramInt1, paramInt2);
    AppMethodBeat.o(2238);
  }

  public final void close()
  {
    AppMethodBeat.i(2237);
    this.sIe = null;
    dismiss();
    AppMethodBeat.o(2237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.e
 * JD-Core Version:    0.6.2
 */