package com.tencent.mm.plugin.appbrand.widget.picker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.widget.p;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class YANumberPicker$1 extends Handler
{
  YANumberPicker$1(YANumberPicker paramYANumberPicker, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 0;
    AppMethodBeat.i(126757);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(126757);
      while (true)
      {
        return;
        if (!YANumberPicker.a(this.jmw).qN.isFinished())
        {
          if (YANumberPicker.b(this.jmw) == 0)
            YANumberPicker.b(this.jmw, 1);
          YANumberPicker.c(this.jmw).sendMessageDelayed(YANumberPicker.c(1, 0, 0, paramMessage.obj), 32L);
          AppMethodBeat.o(126757);
        }
        else
        {
          int k;
          if (YANumberPicker.d(this.jmw) != 0)
          {
            if (YANumberPicker.b(this.jmw) == 0)
              YANumberPicker.b(this.jmw, 1);
            if (YANumberPicker.d(this.jmw) < -YANumberPicker.e(this.jmw) / 2)
            {
              i = (int)((YANumberPicker.e(this.jmw) + YANumberPicker.d(this.jmw)) * 300.0F / YANumberPicker.e(this.jmw));
              p localp = YANumberPicker.a(this.jmw);
              int j = YANumberPicker.f(this.jmw);
              k = YANumberPicker.e(this.jmw);
              localp.startScroll(0, j, 0, YANumberPicker.d(this.jmw) + k, i * 3);
              k = YANumberPicker.c(this.jmw, YANumberPicker.f(this.jmw) + YANumberPicker.e(this.jmw) + YANumberPicker.d(this.jmw));
              label261: this.jmw.postInvalidate();
            }
          }
          while (true)
          {
            paramMessage = YANumberPicker.c(2, YANumberPicker.g(this.jmw), k, paramMessage.obj);
            if (!YANumberPicker.h(this.jmw))
              break label426;
            YANumberPicker.i(this.jmw).sendMessageDelayed(paramMessage, i * 2);
            AppMethodBeat.o(126757);
            break;
            i = (int)(-YANumberPicker.d(this.jmw) * 300.0F / YANumberPicker.e(this.jmw));
            YANumberPicker.a(this.jmw).startScroll(0, YANumberPicker.f(this.jmw), 0, YANumberPicker.d(this.jmw), i * 3);
            k = YANumberPicker.c(this.jmw, YANumberPicker.f(this.jmw) + YANumberPicker.d(this.jmw));
            break label261;
            YANumberPicker.b(this.jmw, 0);
            k = YANumberPicker.c(this.jmw, YANumberPicker.f(this.jmw));
          }
          label426: YANumberPicker.c(this.jmw).sendMessageDelayed(paramMessage, i * 2);
          AppMethodBeat.o(126757);
        }
      }
      YANumberPicker.a(this.jmw, paramMessage.arg1, paramMessage.arg2, paramMessage.obj);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.1
 * JD-Core Version:    0.6.2
 */