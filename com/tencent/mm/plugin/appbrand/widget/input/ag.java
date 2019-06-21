package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.f;
import com.tencent.mm.plugin.appbrand.widget.base.a;
import java.util.Locale;

final class ag<Input extends EditText,  extends ab>
{
  final String TAG;
  final Input jgG;
  final float jgH;
  d.f jgI;
  MotionEvent jgJ;
  boolean jgK;
  final Runnable jgL;
  final Runnable jgM;

  ag(Input paramInput)
  {
    AppMethodBeat.i(123837);
    this.jgK = false;
    this.jgL = new ag.1(this);
    this.jgM = new ag.2(this);
    this.jgG = paramInput;
    this.TAG = ("MicroMsg.AppBrand.InputFakeTapEventEmitter" + String.format(Locale.US, "[%s]", new Object[] { paramInput.toString() }));
    this.jgH = ViewConfiguration.get(paramInput.getContext()).getScaledTouchSlop();
    AppMethodBeat.o(123837);
  }

  final boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    boolean bool = true;
    AppMethodBeat.i(123839);
    float f1 = paramMotionEvent1.getX(paramMotionEvent1.getActionIndex());
    float f2 = paramMotionEvent1.getY(paramMotionEvent1.getActionIndex());
    float f3 = paramMotionEvent2.getX(paramMotionEvent2.getActionIndex());
    float f4 = paramMotionEvent2.getY(paramMotionEvent2.getActionIndex());
    com.tencent.mm.sdk.platformtools.ab.v(this.TAG, "[apptouch] checkTapArea touchSlop %f, X[%f:%f], Y[%f:%f], [%s : %s]", new Object[] { Float.valueOf(this.jgH), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f4), a.D(paramMotionEvent1), a.D(paramMotionEvent2) });
    if ((Math.abs(f4 - f2) <= this.jgH) && (Math.abs(f3 - f1) <= this.jgH))
      AppMethodBeat.o(123839);
    while (true)
    {
      return bool;
      AppMethodBeat.o(123839);
      bool = false;
    }
  }

  final void aRq()
  {
    AppMethodBeat.i(123838);
    this.jgK = false;
    this.jgG.removeCallbacks(this.jgL);
    this.jgG.removeCallbacks(this.jgM);
    this.jgI = null;
    if (this.jgJ != null)
    {
      this.jgJ.recycle();
      this.jgJ = null;
    }
    AppMethodBeat.o(123838);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ag
 * JD-Core Version:    0.6.2
 */