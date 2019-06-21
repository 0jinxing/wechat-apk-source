package com.tencent.mm.plugin.sns.ui.widget;

import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class SnsCardAdTagListView$1
  implements ViewTreeObserver.OnPreDrawListener
{
  SnsCardAdTagListView$1(SnsCardAdTagListView paramSnsCardAdTagListView, TextView paramTextView, View paramView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(40464);
    if ((this.rML.getLayout() != null) && (!bo.ac(this.rML.getLayout().getText())) && (this.rML.getLayout().getText().charAt(0) == '…'))
    {
      this.rMN.removeView(this.rMM);
      SnsCardAdTagListView.a(this.rMN).remove(this.rMM);
    }
    this.rMN.getViewTreeObserver().removeOnPreDrawListener(this);
    AppMethodBeat.o(40464);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView.1
 * JD-Core Version:    0.6.2
 */