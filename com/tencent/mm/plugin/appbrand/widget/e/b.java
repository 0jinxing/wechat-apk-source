package com.tencent.mm.plugin.appbrand.widget.e;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends LinearLayout
{
  public static final int jjZ;
  public static final int jka;
  private TextView gsf;

  static
  {
    AppMethodBeat.i(51259);
    jjZ = Color.parseColor("#000000");
    jka = Color.parseColor("#000000");
    AppMethodBeat.o(51259);
  }

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(51251);
    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    setOrientation(1);
    setGravity(17);
    this.gsf = new TextView(paramContext);
    this.gsf.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    addView(this.gsf);
    AppMethodBeat.o(51251);
  }

  private void qO(int paramInt)
  {
    AppMethodBeat.i(51258);
    setPadding(paramInt, paramInt, paramInt, paramInt);
    AppMethodBeat.o(51258);
  }

  public final void setGravity(String paramString)
  {
    AppMethodBeat.i(51256);
    if (paramString.equals("left"))
    {
      this.gsf.setGravity(3);
      AppMethodBeat.o(51256);
    }
    while (true)
    {
      return;
      if (paramString.equals("right"))
      {
        this.gsf.setGravity(5);
        AppMethodBeat.o(51256);
      }
      else
      {
        paramString.equals("center");
        this.gsf.setGravity(17);
        AppMethodBeat.o(51256);
      }
    }
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(51252);
    this.gsf.setText(paramString);
    AppMethodBeat.o(51252);
  }

  public final void setTextColor(int paramInt)
  {
    AppMethodBeat.i(51254);
    this.gsf.setTextColor(paramInt);
    AppMethodBeat.o(51254);
  }

  public final void setTextSize(int paramInt)
  {
    AppMethodBeat.i(51253);
    this.gsf.setTextSize(paramInt);
    AppMethodBeat.o(51253);
  }

  public final void setTitlePadding(int paramInt)
  {
    AppMethodBeat.i(51255);
    this.gsf.setPadding(paramInt, paramInt, paramInt, paramInt);
    AppMethodBeat.o(51255);
  }

  public final void x(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(51257);
    qO(paramInt2);
    a locala = new a();
    locala.borderRadius = paramInt1;
    locala.setColor(paramInt4);
    locala.setStroke(paramInt2, paramInt3);
    setBackgroundDrawable(locala);
    AppMethodBeat.o(51257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.b
 * JD-Core Version:    0.6.2
 */