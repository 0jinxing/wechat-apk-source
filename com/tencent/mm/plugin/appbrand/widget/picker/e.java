package com.tencent.mm.plugin.appbrand.widget.picker;

import android.text.Editable;
import android.text.Editable.Factory;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;

final class e
{
  static void a(NumberPicker paramNumberPicker)
  {
    AppMethodBeat.i(126754);
    if (paramNumberPicker == null)
      AppMethodBeat.o(126754);
    while (true)
    {
      return;
      try
      {
        Object localObject = new com/tencent/mm/compatible/loader/c;
        ((c)localObject).<init>(paramNumberPicker, "mInputText", null);
        localObject = (EditText)((c)localObject).get();
        if (localObject != null)
        {
          paramNumberPicker = new com/tencent/mm/plugin/appbrand/widget/picker/e$1;
          paramNumberPicker.<init>();
          ((EditText)localObject).setEditableFactory(paramNumberPicker);
        }
        AppMethodBeat.o(126754);
      }
      catch (Exception paramNumberPicker)
      {
        AppMethodBeat.o(126754);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.e
 * JD-Core Version:    0.6.2
 */