package com.tencent.toybrick.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public final class a$a extends com.tencent.toybrick.f.a
{
  public TextView AGb;
  public ImageView AGc;
  public ImageView AGd;
  public MMSwitchBtn AGe;
  public TextView gne;
  public TextView pnu;

  public a$a(a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(113196);
    this.gne = ((TextView)paramView.findViewById(16908310));
    this.AGd = ((ImageView)paramView.findViewById(2131822736));
    this.AGb = ((TextView)paramView.findViewById(2131822349));
    this.AGc = ((ImageView)paramView.findViewById(2131822737));
    this.pnu = ((TextView)paramView.findViewById(2131821841));
    this.AGe = ((MMSwitchBtn)paramView.findViewById(2131820932));
    this.AGe.setSwitchListener(new a.a.1(this, parama));
    AppMethodBeat.o(113196);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.c.a.a
 * JD-Core Version:    0.6.2
 */