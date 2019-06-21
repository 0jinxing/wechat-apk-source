package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import java.util.Locale;

abstract class YADatePicker$a
  implements YADatePicker.b
{
  protected Context mContext;
  protected YADatePicker zSJ;
  protected Locale zSK;
  protected YADatePicker.d zSL;
  protected YADatePicker.e zSM;

  protected YADatePicker$a(YADatePicker paramYADatePicker, Context paramContext)
  {
    this.zSJ = paramYADatePicker;
    this.mContext = paramContext;
    f(Locale.getDefault());
  }

  protected void f(Locale paramLocale)
  {
    if (!paramLocale.equals(this.zSK))
      this.zSK = paramLocale;
  }

  public void setValidationCallback(YADatePicker.e parame)
  {
    this.zSM = parame;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker.a
 * JD-Core Version:    0.6.2
 */