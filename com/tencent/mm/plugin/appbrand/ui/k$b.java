package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SuppressLint({"AppCompatCustomView"})
final class k$b extends TextView
{
  private String mTitle;
  private String mValue;

  public k$b(k paramk, Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(102337);
    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    setTextSize(1, 12.0F);
    setTextColor(-419430401);
    AppMethodBeat.o(102337);
  }

  private void update()
  {
    AppMethodBeat.i(102338);
    setText(String.format("%s: %s", new Object[] { this.mTitle, this.mValue }));
    AppMethodBeat.o(102338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.k.b
 * JD-Core Version:    0.6.2
 */