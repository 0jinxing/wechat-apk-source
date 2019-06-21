package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.numberpad.a;

public final class s extends r
  implements a
{
  private InputConnection jfm;

  public s(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(123727);
    super.setKeyListener(new s.1(this));
    AppMethodBeat.o(123727);
  }

  public final void aQR()
  {
    AppMethodBeat.i(123734);
    ((v)getInputPanel()).setInputEditText(this);
    AppMethodBeat.o(123734);
  }

  public final InputConnection aQU()
  {
    AppMethodBeat.i(123731);
    InputConnection localInputConnection = super.onCreateInputConnection(new EditorInfo());
    this.jfm = localInputConnection;
    AppMethodBeat.o(123731);
    return localInputConnection;
  }

  public final void clearFocus()
  {
    AppMethodBeat.i(123728);
    aRo();
    AppMethodBeat.o(123728);
  }

  public final View getInputPanel()
  {
    AppMethodBeat.i(123733);
    v localv = v.cL(this);
    AppMethodBeat.o(123733);
    return localv;
  }

  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return null;
  }

  public final boolean requestFocus(int paramInt, Rect paramRect)
  {
    AppMethodBeat.i(123729);
    boolean bool = a(paramInt, paramRect);
    AppMethodBeat.o(123729);
    return bool;
  }

  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    AppMethodBeat.i(123730);
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (paramArrayOfInputFilter == null)
      arrayOfInputFilter = new InputFilter[0];
    paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
    while (i < arrayOfInputFilter.length)
    {
      paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
      i++;
    }
    paramArrayOfInputFilter[i] = new InputFilter.AllCaps();
    super.setFilters(paramArrayOfInputFilter);
    AppMethodBeat.o(123730);
  }

  public final void setPasswordMode(boolean paramBoolean)
  {
    AppMethodBeat.i(123732);
    aRm();
    int i = getInputType() | 0x2;
    if (paramBoolean)
      i |= 16;
    while (true)
    {
      setInputType(i);
      super.setPasswordMode(paramBoolean);
      aRn();
      AppMethodBeat.o(123732);
      return;
      i &= -17;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.s
 * JD-Core Version:    0.6.2
 */