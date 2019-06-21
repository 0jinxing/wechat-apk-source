package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.widget.QFadeImageView;

final class as$d extends as.a
{
  TextView qZb;
  MaskImageView rvS;
  QFadeImageView rvT;
  QFadeImageView rvU;
  QFadeImageView rvV;
  TextView rvW;
  TextView rvX;
  TextView rvY;
  TextView rvZ;
  View rwa;
  TextView rwb;
  TextView rwc;
  TextView rwd;
  TextView rwe;
  TextView rwf;
  TextView rwg;
  MaskLinearLayout rwh;

  as$d(as paramas)
  {
    super(paramas);
  }

  public final void init()
  {
    AppMethodBeat.i(39209);
    super.init();
    this.rvS.setVisibility(8);
    this.rvU.setVisibility(8);
    this.rvV.setVisibility(8);
    this.qZb.setVisibility(8);
    this.rvW.setVisibility(8);
    this.rvX.setVisibility(8);
    this.rvY.setVisibility(8);
    this.rvZ.setVisibility(8);
    this.rwa.setVisibility(8);
    this.rvT.setVisibility(8);
    this.rwb.setVisibility(8);
    this.rwc.setVisibility(8);
    this.rwd.setVisibility(8);
    this.rwe.setVisibility(8);
    this.rwf.setVisibility(8);
    this.rwg.setVisibility(8);
    if (a.dm(as.a(this.rvF)) > 1.0F)
      this.qZb.setMaxLines(2);
    AppMethodBeat.o(39209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.d
 * JD-Core Version:    0.6.2
 */