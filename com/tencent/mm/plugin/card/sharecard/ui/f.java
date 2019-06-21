package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.ui.MMActivity;

public final class f
{
  View jcl;
  private MMActivity jiE;
  b kha;
  ImageView khe;
  TextView khf;
  TextView khg;

  public f(MMActivity paramMMActivity, View paramView)
  {
    this.jiE = paramMMActivity;
    this.jcl = paramView;
  }

  public final void cu()
  {
    AppMethodBeat.i(88157);
    this.khf.setVisibility(0);
    this.khe.setImageDrawable(this.jiE.getResources().getDrawable(2130838084));
    this.khf.setText(2131297959);
    this.khg.setText(2131297958);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.khe.getLayoutParams();
    localLayoutParams.topMargin = this.jiE.getResources().getDimensionPixelOffset(2131428189);
    this.khe.setLayoutParams(localLayoutParams);
    this.khe.invalidate();
    AppMethodBeat.o(88157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.f
 * JD-Core Version:    0.6.2
 */