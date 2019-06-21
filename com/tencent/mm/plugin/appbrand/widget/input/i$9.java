package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$9
  implements TextView.OnEditorActionListener
{
  i$9(i parami, int paramInt)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(123635);
    boolean bool;
    if (paramInt == this.jej)
    {
      this.jeg.jdR = i.d.jel;
      i.f(this.jeg);
      this.jeg.jdR = null;
      bool = true;
      AppMethodBeat.o(123635);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.9
 * JD-Core Version:    0.6.2
 */