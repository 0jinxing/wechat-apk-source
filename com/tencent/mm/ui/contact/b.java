package com.tencent.mm.ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.MaskLayout;

public final class b extends RelativeLayout
{
  private TextView contentView;
  private Context context;
  private View gbS;
  private View gwR;

  public b(Context paramContext, a parama)
  {
    super(paramContext);
    AppMethodBeat.i(33537);
    this.gbS = null;
    this.gwR = null;
    this.contentView = null;
    this.context = paramContext;
    View.inflate(getContext(), 2130968640, this);
    this.gbS = findViewById(2131821064);
    this.gwR = this.gbS.findViewById(2131821065);
    paramContext = this.gwR.getLayoutParams();
    paramContext.height = ((int)(a.am(this.context, 2131427553) * a.fZ(this.context)));
    this.gwR.setLayoutParams(paramContext);
    this.contentView = ((TextView)this.gwR.findViewById(2131821068));
    this.gbS.setOnClickListener(new b.1(this, parama));
    this.gwR.setOnTouchListener(new b.2(this));
    paramContext = (ImageView)((MaskLayout)this.gwR.findViewById(2131821066)).getContentView();
    switch (b.3.zkC[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(33537);
      while (true)
      {
        return;
        this.contentView.setText(2131296440);
        d.a(getContext(), paramContext, 2131231175);
        AppMethodBeat.o(33537);
        continue;
        this.contentView.setText(2131296444);
        d.a(getContext(), paramContext, 2131231176);
        AppMethodBeat.o(33537);
      }
      this.gwR.setBackgroundResource(2130838396);
      this.contentView.setText(2131296443);
      d.a(getContext(), paramContext, 2131231182);
    }
  }

  public final void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(33538);
    View localView = this.gbS;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(33538);
      return;
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(33536);
      zkD = new a("Chatromm", 0);
      zkE = new a("ContactLabel", 1);
      zkF = new a("ContactIpCall", 2);
      zkG = new a[] { zkD, zkE, zkF };
      AppMethodBeat.o(33536);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.b
 * JD-Core Version:    0.6.2
 */