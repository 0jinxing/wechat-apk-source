package com.tencent.mm.ui.widget.picker;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.ai;

public final class e
{
  public static void a(NumberPicker paramNumberPicker, Drawable paramDrawable)
  {
    AppMethodBeat.i(112852);
    if (paramNumberPicker != null);
    try
    {
      ad localad = new com/tencent/mm/ui/ad;
      localad.<init>(paramNumberPicker, "mSelectionDivider");
      localad.set(paramDrawable);
      AppMethodBeat.o(112852);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      while (true)
        AppMethodBeat.o(112852);
    }
  }

  public static EditText b(NumberPicker paramNumberPicker)
  {
    AppMethodBeat.i(112853);
    if (paramNumberPicker == null)
    {
      AppMethodBeat.o(112853);
      paramNumberPicker = null;
    }
    while (true)
    {
      return paramNumberPicker;
      try
      {
        ad localad = new com/tencent/mm/ui/ad;
        localad.<init>(paramNumberPicker, "mInputText");
        paramNumberPicker = (EditText)localad.get();
        AppMethodBeat.o(112853);
      }
      catch (IllegalAccessException paramNumberPicker)
      {
        ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "getInputText IllegalAccessException", new Object[0]);
        AppMethodBeat.o(112853);
        paramNumberPicker = null;
      }
      catch (NoSuchFieldException paramNumberPicker)
      {
        while (true)
          ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "getInputText NoSuchFieldException", new Object[0]);
      }
    }
  }

  public static void c(NumberPicker paramNumberPicker)
  {
    AppMethodBeat.i(112854);
    if (paramNumberPicker == null)
      AppMethodBeat.o(112854);
    while (true)
    {
      return;
      paramNumberPicker.setDescendantFocusability(393216);
      AppMethodBeat.o(112854);
    }
  }

  public static void d(NumberPicker paramNumberPicker)
  {
    AppMethodBeat.i(112855);
    if (paramNumberPicker == null)
      AppMethodBeat.o(112855);
    while (true)
    {
      return;
      try
      {
        ad localad = new com/tencent/mm/ui/ad;
        localad.<init>(paramNumberPicker, "mInputText");
        paramNumberPicker = (EditText)localad.get();
        if (paramNumberPicker != null)
          paramNumberPicker.setFilters(new InputFilter[0]);
        AppMethodBeat.o(112855);
      }
      catch (IllegalAccessException paramNumberPicker)
      {
        ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "fixDefaultValueDisplaying IllegalAccessException", new Object[0]);
        AppMethodBeat.o(112855);
      }
      catch (NoSuchFieldException paramNumberPicker)
      {
        ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "fixDefaultValueDisplaying NoSuchFieldException", new Object[0]);
        AppMethodBeat.o(112855);
      }
    }
  }

  public static void e(NumberPicker paramNumberPicker)
  {
    AppMethodBeat.i(112856);
    if (paramNumberPicker == null)
      AppMethodBeat.o(112856);
    while (true)
    {
      return;
      try
      {
        Object localObject = new com/tencent/mm/ui/ad;
        ((ad)localObject).<init>(paramNumberPicker, "mSetSelectionCommand");
        localObject = (Runnable)((ad)localObject).get();
        if (localObject != null)
          paramNumberPicker.removeCallbacks((Runnable)localObject);
        AppMethodBeat.o(112856);
      }
      catch (IllegalAccessException paramNumberPicker)
      {
        ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "removePendingSetSelectionCommand IllegalAccessException", new Object[0]);
        AppMethodBeat.o(112856);
      }
      catch (NoSuchFieldException paramNumberPicker)
      {
        ai.printErrStackTrace("NumberPickerUtil", paramNumberPicker, "removePendingSetSelectionCommand NoSuchFieldException", new Object[0]);
        AppMethodBeat.o(112856);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.e
 * JD-Core Version:    0.6.2
 */