package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RangeWidget$1
  implements View.OnClickListener
{
  RangeWidget$1(RangeWidget paramRangeWidget)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38539);
    paramView = new Intent(RangeWidget.a(this.rmJ), SnsLabelUI.class);
    paramView.putExtra("KLabel_range_index", RangeWidget.b(this.rmJ));
    paramView.putExtra("Klabel_name_list", RangeWidget.c(this.rmJ));
    paramView.putExtra("Kother_user_name_list", RangeWidget.d(this.rmJ));
    paramView.putExtra("k_sns_label_ui_style", this.rmJ.style);
    RangeWidget.a(this.rmJ).startActivityForResult(paramView, 5);
    AppMethodBeat.o(38539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.RangeWidget.1
 * JD-Core Version:    0.6.2
 */