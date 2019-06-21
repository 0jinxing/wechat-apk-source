package com.tencent.mm.ui.widget;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$b
{
  e$b(e parame)
  {
  }

  public final View e(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(107864);
    int j;
    View localView;
    if (paramViewGroup != null)
    {
      int i = paramViewGroup.getChildCount();
      j = 0;
      if (j < i)
      {
        localView = paramViewGroup.getChildAt(j);
        Class localClass = localView.getClass();
        ab.d("MicroMsg.MMDatePickerDialog", "NAME = ".concat(String.valueOf(localClass.getName())));
        ab.d("MicroMsg.MMDatePickerDialog", "SimpleName = " + localClass.getSimpleName());
        if (("NumberPicker".equals(localClass.getSimpleName())) && (j == paramInt))
        {
          AppMethodBeat.o(107864);
          paramViewGroup = localView;
        }
      }
    }
    while (true)
    {
      return paramViewGroup;
      if ((localView instanceof ViewGroup))
      {
        localView = e((ViewGroup)localView, paramInt);
        if (localView != null)
        {
          AppMethodBeat.o(107864);
          paramViewGroup = localView;
        }
      }
      else
      {
        j++;
        break;
        paramViewGroup = null;
        AppMethodBeat.o(107864);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.e.b
 * JD-Core Version:    0.6.2
 */