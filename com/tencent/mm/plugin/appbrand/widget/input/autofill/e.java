package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Resources;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends AutoFillListPopupWindowBase
{
  private final Context mContext;

  e(Context paramContext)
  {
    super(paramContext, null, 0);
    AppMethodBeat.i(123905);
    this.mContext = paramContext;
    this.amH.setInputMethodMode(2);
    paramContext = paramContext.getResources().getDrawable(2130837573);
    this.amH.setBackgroundDrawable(paramContext);
    this.amG = true;
    this.amH.setFocusable(false);
    this.ams = false;
    this.amt = true;
    this.amH.setAnimationStyle(2131034135);
    AppMethodBeat.o(123905);
  }

  public final void show()
  {
    AppMethodBeat.i(123906);
    super.show();
    AppMethodBeat.o(123906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.e
 * JD-Core Version:    0.6.2
 */