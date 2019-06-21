package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class y$2 extends InputConnectionWrapper
{
  y$2(y paramy, InputConnection paramInputConnection)
  {
    super(paramInputConnection, false);
  }

  public final boolean commitText(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(123818);
    if (!TextUtils.isEmpty(paramCharSequence))
      this.jgs.jgr = paramCharSequence.charAt(paramCharSequence.length() - 1);
    boolean bool = super.commitText(paramCharSequence, paramInt);
    AppMethodBeat.o(123818);
    return bool;
  }

  public final boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123819);
    this.jgs.jgr = ((char)8);
    boolean bool = super.deleteSurroundingText(paramInt1, paramInt2);
    AppMethodBeat.o(123819);
    return bool;
  }

  public final boolean finishComposingText()
  {
    AppMethodBeat.i(123820);
    boolean bool = super.finishComposingText();
    z localz = y.b(this.jgs);
    localz.iGP.removeCallbacks(localz.jgA);
    localz.jgA.run();
    AppMethodBeat.o(123820);
    return bool;
  }

  public final boolean setComposingText(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(123817);
    if (!TextUtils.isEmpty(paramCharSequence))
      this.jgs.jgr = paramCharSequence.charAt(paramCharSequence.length() - 1);
    boolean bool = super.setComposingText(paramCharSequence, paramInt);
    AppMethodBeat.o(123817);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.y.2
 * JD-Core Version:    0.6.2
 */