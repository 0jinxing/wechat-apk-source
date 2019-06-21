package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
{
  e$a(e parame)
  {
  }

  @TargetApi(11)
  public final NumberPicker x(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107863);
    int j;
    View localView;
    NumberPicker localNumberPicker;
    if (paramViewGroup != null)
    {
      int i = paramViewGroup.getChildCount();
      j = 0;
      if (j < i)
      {
        localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof NumberPicker))
        {
          localNumberPicker = (NumberPicker)localView;
          if ((localNumberPicker.getMaxValue() >= 28) && (localNumberPicker.getMaxValue() <= 31))
          {
            AppMethodBeat.o(107863);
            paramViewGroup = localNumberPicker;
          }
        }
      }
    }
    while (true)
    {
      return paramViewGroup;
      if ((localView instanceof ViewGroup))
      {
        localNumberPicker = x((ViewGroup)localView);
        if (localNumberPicker != null)
        {
          AppMethodBeat.o(107863);
          paramViewGroup = localNumberPicker;
        }
      }
      else
      {
        j++;
        break;
        paramViewGroup = null;
        AppMethodBeat.o(107863);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.e.a
 * JD-Core Version:    0.6.2
 */