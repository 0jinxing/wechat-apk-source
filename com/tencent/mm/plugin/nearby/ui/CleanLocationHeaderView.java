package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CleanLocationHeaderView extends LinearLayout
{
  private ImageView iyo;
  private TextView oPI;

  public CleanLocationHeaderView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(55409);
    cA(paramContext);
    AppMethodBeat.o(55409);
  }

  public CleanLocationHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55408);
    cA(paramContext);
    AppMethodBeat.o(55408);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(55410);
    paramContext = View.inflate(paramContext, 2130970286, this);
    this.oPI = ((TextView)paramContext.findViewById(2131826295));
    this.oPI.setSingleLine(false);
    this.iyo = ((ImageView)paramContext.findViewById(2131826294));
    this.oPI.setText(2131298302);
    this.iyo.setImageResource(2131231804);
    AppMethodBeat.o(55410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.CleanLocationHeaderView
 * JD-Core Version:    0.6.2
 */