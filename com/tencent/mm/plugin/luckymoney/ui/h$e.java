package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.g;
import com.tencent.mm.sdk.platformtools.bo;

final class h$e
  implements h.d
{
  h.c ogG;

  public final void a(Context paramContext, ViewGroup paramViewGroup, as paramas)
  {
    AppMethodBeat.i(42899);
    if (bo.isNullOrNil(paramas.name))
    {
      AppMethodBeat.o(42899);
      return;
    }
    Object localObject = LayoutInflater.from(paramContext).inflate(2130969999, paramViewGroup, true);
    TextView localTextView = (TextView)((View)localObject).findViewById(2131825669);
    localObject = (ImageView)((View)localObject).findViewById(2131825668);
    if (!bo.isNullOrNil(paramas.iconUrl))
    {
      x.h((ImageView)localObject, paramas.iconUrl);
      ((ImageView)localObject).setVisibility(0);
      label83: if ((this.ogG != null) && (this.ogG.textColor != -2147483648))
        localTextView.setTextColor(this.ogG.textColor);
      if ((this.ogG == null) || (this.ogG.textSize == -2147483648))
        break label289;
      localTextView.setTextSize(0, this.ogG.textSize);
    }
    while (true)
    {
      localTextView.setGravity(17);
      localTextView.setText(paramas.name);
      if (!bo.isNullOrNil(paramas.content))
        localTextView.setOnClickListener(new h.e.1(this, paramas, paramContext));
      paramViewGroup.setVisibility(0);
      h.pYm.e(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramas.nZn) });
      if (this.ogG != null)
        g.gu(this.ogG.ogM, 0);
      AppMethodBeat.o(42899);
      break;
      ((ImageView)localObject).setVisibility(8);
      break label83;
      label289: localTextView.setTextSize(0, paramContext.getResources().getDimensionPixelSize(2131427762));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.h.e
 * JD-Core Version:    0.6.2
 */