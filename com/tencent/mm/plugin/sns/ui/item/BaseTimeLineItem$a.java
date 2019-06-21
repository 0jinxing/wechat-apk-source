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

final class BaseTimeLineItem$a extends o
{
  BaseTimeLineItem$a(BaseTimeLineItem paramBaseTimeLineItem)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40121);
    this.rHr.qPr.rqg.rDC.onClick(paramView);
    AppMethodBeat.o(40121);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(40122);
    int i = this.rHr.mActivity.getResources().getColor(2131690480);
    if (this.ozq)
    {
      paramTextPaint.bgColor = i;
      AppMethodBeat.o(40122);
    }
    while (true)
    {
      return;
      paramTextPaint.bgColor = 0;
      AppMethodBeat.o(40122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.a
 * JD-Core Version:    0.6.2
 */