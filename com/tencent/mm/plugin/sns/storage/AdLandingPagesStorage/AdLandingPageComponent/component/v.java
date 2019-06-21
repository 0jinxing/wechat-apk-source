package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;

public final class v extends h
{
  TextView exj;
  private RelativeLayout rbB;
  ImageView rbC;

  public v(Context paramContext, t paramt, ViewGroup paramViewGroup)
  {
    super(paramContext, paramt, paramViewGroup);
    this.qZo = paramt;
  }

  public final void coZ()
  {
    AppMethodBeat.i(37258);
    super.coZ();
    AppMethodBeat.o(37258);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37261);
    super.cpa();
    AppMethodBeat.o(37261);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37262);
    super.cpb();
    AppMethodBeat.o(37262);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37260);
    View localView = this.contentView;
    localView.setBackgroundColor(this.backgroundColor);
    this.exj = ((TextView)localView.findViewById(2131827638));
    this.rbB = ((RelativeLayout)localView.findViewById(2131827639));
    this.rbC = ((ImageView)localView.findViewById(2131827640));
    AppMethodBeat.o(37260);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37259);
    this.exj.setText(((t)this.qZo).label);
    this.exj.setTextSize(0, ((t)this.qZo).fontSize);
    if ((((t)this.qZo).hfo != null) && (((t)this.qZo).hfo.length() > 0))
    {
      int i = Color.parseColor(((t)this.qZo).hfo);
      this.rbB.setBackgroundColor(i);
    }
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(((t)this.qZo).qXe, ((t)this.qZo).qWP, new v.1(this));
    AppMethodBeat.o(37259);
  }

  protected final int getLayout()
  {
    return 2130970727;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v
 * JD-Core Version:    0.6.2
 */