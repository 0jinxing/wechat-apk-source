package com.tencent.mm.plugin.appbrand.widget.picker;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class YANumberPicker$2 extends Handler
{
  YANumberPicker$2(YANumberPicker paramYANumberPicker)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(126758);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(126758);
      while (true)
      {
        return;
        this.jmw.requestLayout();
        AppMethodBeat.o(126758);
      }
      YANumberPicker.a(this.jmw, paramMessage.arg1, paramMessage.arg2, paramMessage.obj);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.2
 * JD-Core Version:    0.6.2
 */