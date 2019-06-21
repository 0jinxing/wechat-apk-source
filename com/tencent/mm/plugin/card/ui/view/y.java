package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public final class y extends i
{
  private MMActivity jiE;
  private b kaS;
  private View krt;

  public final void bes()
  {
    AppMethodBeat.i(88791);
    if (this.krt != null)
      this.krt.setVisibility(8);
    AppMethodBeat.o(88791);
  }

  public final void initView()
  {
    AppMethodBeat.i(88789);
    this.jiE = this.kqK.bcy();
    AppMethodBeat.o(88789);
  }

  public final void update()
  {
    AppMethodBeat.i(88790);
    this.kaS = this.kqK.bcv();
    if (this.krt == null)
      this.krt = ((ViewStub)findViewById(2131822024)).inflate();
    if (this.kaS.aZF())
      this.krt.setBackgroundDrawable(l.H(this.jiE, this.jiE.getResources().getColor(2131689824)));
    TextView localTextView = (TextView)this.krt.findViewById(2131822320);
    if (this.kaS.aZW() == null)
    {
      ab.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
      localTextView.setVisibility(8);
      AppMethodBeat.o(88790);
    }
    while (true)
    {
      return;
      localTextView.setVisibility(0);
      localTextView.setTextColor(this.jiE.getResources().getColor(2131690139));
      if (!TextUtils.isEmpty(this.kaS.aZV().vUu))
      {
        localTextView.setText(this.kaS.aZV().vUu);
        AppMethodBeat.o(88790);
      }
      else
      {
        m.c(localTextView, this.kaS.aZW().status);
        AppMethodBeat.o(88790);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.y
 * JD-Core Version:    0.6.2
 */