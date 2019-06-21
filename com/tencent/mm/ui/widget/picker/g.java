package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker.Formatter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Formatter;
import java.util.Locale;

final class g
  implements NumberPicker.Formatter
{
  final StringBuilder mBuilder;
  final Object[] zSF;
  char zSG;
  Formatter zSH;

  g()
  {
    AppMethodBeat.i(112866);
    this.mBuilder = new StringBuilder();
    this.zSF = new Object[1];
    d(Locale.getDefault());
    AppMethodBeat.o(112866);
  }

  private void d(Locale paramLocale)
  {
    AppMethodBeat.i(112867);
    this.zSH = e(paramLocale);
    this.zSG = ((char)48);
    AppMethodBeat.o(112867);
  }

  private Formatter e(Locale paramLocale)
  {
    AppMethodBeat.i(112869);
    paramLocale = new Formatter(this.mBuilder, paramLocale);
    AppMethodBeat.o(112869);
    return paramLocale;
  }

  public final String format(int paramInt)
  {
    AppMethodBeat.i(112868);
    Object localObject = Locale.getDefault();
    if (this.zSG != '0')
      d((Locale)localObject);
    this.zSF[0] = Integer.valueOf(paramInt);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.zSH.format("%02d", this.zSF);
    localObject = this.zSH.toString();
    AppMethodBeat.o(112868);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.g
 * JD-Core Version:    0.6.2
 */