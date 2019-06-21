package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class f
  implements c
{
  public boolean czr;
  public String eUu;
  private boolean isVisible;
  private String nJq;
  private double nJu;
  private double nJv;
  private boolean nLW;
  private View nLX;
  private d nLY;
  private TextView nLZ;
  private String nLw;
  private TextView nMa;
  public ImageButton nMb;

  public f(d paramd, Context paramContext)
  {
    AppMethodBeat.i(113459);
    this.czr = false;
    this.nLW = true;
    this.nJu = 1000000.0D;
    this.nJv = 1000000.0D;
    this.isVisible = true;
    this.nLw = "";
    paramContext = ((Activity)paramContext).findViewById(2131826350);
    this.nLZ = ((TextView)paramContext.findViewById(2131826351));
    this.nMa = ((TextView)paramContext.findViewById(2131826352));
    this.nMb = ((ImageButton)paramContext.findViewById(2131826353));
    this.nLY = paramd;
    this.nLX = paramContext;
    AppMethodBeat.o(113459);
  }

  public final String getPreText()
  {
    return this.nLw;
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(113460);
    this.nJq = paramString;
    paramString = this.nJq;
    ab.d("NewItemOverlay", "popView " + this.nLX.getWidth() + " " + this.nLX.getHeight());
    if ((paramString != null) && (!paramString.equals("")))
      this.nMa.setText(paramString);
    if ((this.eUu != null) && (!this.eUu.equals("")))
      this.nLZ.setText(this.eUu);
    while (true)
    {
      if (this.nLW)
      {
        this.nLX.setVisibility(0);
        this.nLX.invalidate();
      }
      AppMethodBeat.o(113460);
      return;
      this.nLZ.setText(2131300970);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.f
 * JD-Core Version:    0.6.2
 */