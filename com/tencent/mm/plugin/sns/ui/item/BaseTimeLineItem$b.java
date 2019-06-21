package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.bc;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.pluginsdk.ui.e.o;

final class BaseTimeLineItem$b extends o
{
  BaseTimeLineItem$b(BaseTimeLineItem paramBaseTimeLineItem)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40123);
    this.rHr.qPr.rqg.rDs.onClick(paramView);
    AppMethodBeat.o(40123);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(40124);
    int i = this.rHr.mActivity.getResources().getColor(2131690480);
    if (this.ozq)
    {
      paramTextPaint.bgColor = i;
      AppMethodBeat.o(40124);
    }
    while (true)
    {
      return;
      paramTextPaint.bgColor = 0;
      AppMethodBeat.o(40124);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.b
 * JD-Core Version:    0.6.2
 */