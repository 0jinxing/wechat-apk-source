package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandNumberKeyboardView$2
  implements View.OnClickListener
{
  AppBrandNumberKeyboardView$2(AppBrandNumberKeyboardView paramAppBrandNumberKeyboardView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123756);
    if (AppBrandNumberKeyboardView.a(this.jfH) == null)
      AppMethodBeat.o(123756);
    String str1;
    while (true)
    {
      return;
      str1 = null;
      if (paramView.getId() != AppBrandNumberKeyboardView.a(this.jfH, "tenpay_keyboard_x"))
        break;
      switch (AppBrandNumberKeyboardView.b(this.jfH))
      {
      default:
        AppMethodBeat.o(123756);
      case 1:
      case 2:
      }
    }
    String str2 = "X";
    int i;
    while (true)
      if (TextUtils.isEmpty(str2))
      {
        AppMethodBeat.o(123756);
        break;
        str2 = ".";
        continue;
        i = 0;
        label103: str2 = str1;
        if (i < AppBrandNumberKeyboardView.c(this.jfH).size())
        {
          int j = AppBrandNumberKeyboardView.b(this.jfH, (String)AppBrandNumberKeyboardView.c(this.jfH).valueAt(i));
          if (paramView.getId() != j)
            break label203;
          str1 = String.valueOf(AppBrandNumberKeyboardView.c(this.jfH).keyAt(i));
        }
      }
    label203: 
    while (true)
    {
      i++;
      break label103;
      AppBrandNumberKeyboardView.a(this.jfH).commitText(str2, str2.length());
      AppMethodBeat.o(123756);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView.2
 * JD-Core Version:    0.6.2
 */