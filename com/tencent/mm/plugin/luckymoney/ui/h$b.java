package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class h$b
  implements h.d
{
  h.c ogG;

  public final void a(Context paramContext, ViewGroup paramViewGroup, as paramas)
  {
    AppMethodBeat.i(42897);
    if (bo.isNullOrNil(paramas.name))
    {
      AppMethodBeat.o(42897);
      return;
    }
    TextView localTextView = new TextView(paramContext);
    if ((this.ogG != null) && (this.ogG.textColor != -2147483648))
    {
      localTextView.setTextColor(this.ogG.textColor);
      label62: if ((this.ogG == null) || (this.ogG.textSize == -2147483648))
        break label243;
      localTextView.setTextSize(0, this.ogG.textSize);
    }
    while (true)
    {
      localTextView.setGravity(17);
      localTextView.setText(paramas.name);
      if (!bo.isNullOrNil(paramas.content))
        localTextView.setOnClickListener(new h.b.1(this, paramas, paramContext));
      paramViewGroup.addView(localTextView, new ViewGroup.LayoutParams(-2, -2));
      paramViewGroup.setVisibility(0);
      h.pYm.e(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramas.nZn) });
      AppMethodBeat.o(42897);
      break;
      localTextView.setTextColor(paramContext.getResources().getColor(2131690631));
      break label62;
      label243: localTextView.setTextSize(0, paramContext.getResources().getDimensionPixelSize(2131427762));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.h.b
 * JD-Core Version:    0.6.2
 */