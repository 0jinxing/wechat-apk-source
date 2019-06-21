package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BindMobileOrQQHeaderView extends LinearLayout
{
  private ImageView iyo;
  private TextView oPI;
  private BindMobileOrQQHeaderView.a oPJ;
  private View.OnClickListener oPK;

  public BindMobileOrQQHeaderView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(55406);
    this.oPK = new BindMobileOrQQHeaderView.1(this);
    this.oPJ = BindMobileOrQQHeaderView.a.oPN;
    cA(paramContext);
    AppMethodBeat.o(55406);
  }

  public BindMobileOrQQHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55405);
    this.oPK = new BindMobileOrQQHeaderView.1(this);
    cA(paramContext);
    AppMethodBeat.o(55405);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(55407);
    paramContext = View.inflate(paramContext, 2130970286, this);
    this.oPI = ((TextView)paramContext.findViewById(2131826295));
    this.iyo = ((ImageView)paramContext.findViewById(2131826294));
    switch (BindMobileOrQQHeaderView.2.oPM[this.oPJ.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(55407);
      while (true)
      {
        return;
        setOnClickListener(this.oPK);
        this.iyo.setImageResource(2131231446);
        AppMethodBeat.o(55407);
      }
      setOnClickListener(this.oPK);
      this.iyo.setImageResource(2131231453);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView
 * JD-Core Version:    0.6.2
 */