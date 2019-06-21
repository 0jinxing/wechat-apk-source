package com.tencent.mm.plugin.appbrand.widget.input;

import android.os.Looper;
import android.text.Editable;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.c.b;
import com.tencent.mm.sdk.platformtools.ak;

public final class z
{
  final ak iGP;
  final Runnable jgA;
  public b jgz;
  private final EditText tc;

  public z(EditText paramEditText)
  {
    AppMethodBeat.i(123833);
    this.jgA = new z.1(this);
    this.tc = paramEditText;
    this.iGP = new ak(Looper.getMainLooper());
    AppMethodBeat.o(123833);
  }

  public final Editable c(Editable paramEditable)
  {
    AppMethodBeat.i(123834);
    paramEditable.setSpan(new z.2(this), 0, paramEditable.length(), 18);
    paramEditable.setSpan(new z.3(this), 0, paramEditable.length(), 18);
    AppMethodBeat.o(123834);
    return paramEditable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.z
 * JD-Core Version:    0.6.2
 */