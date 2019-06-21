package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m extends PasswordTransformationMethod
{
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    AppMethodBeat.i(77427);
    paramCharSequence = new m.a(paramCharSequence);
    AppMethodBeat.o(77427);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.m
 * JD-Core Version:    0.6.2
 */