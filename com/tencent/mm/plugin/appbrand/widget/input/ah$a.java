package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewParent;

abstract class ah$a<Source extends View, Target extends View>
{
  private Target Ov;

  abstract boolean cP(View paramView);

  abstract Target cQ(View paramView);

  final Target cR(Source paramSource)
  {
    if ((this.Ov != null) && (s.av(this.Ov)))
      paramSource = this.Ov;
    while (true)
    {
      return paramSource;
      if ((paramSource == null) || (!s.av(paramSource)))
      {
        paramSource = null;
      }
      else
      {
        for (paramSource = paramSource.getParent(); (paramSource instanceof View); paramSource = paramSource.getParent())
          if (cP((View)paramSource))
            break label78;
        paramSource = null;
        continue;
        label78: paramSource = cQ((View)paramSource);
        this.Ov = paramSource;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ah.a
 * JD-Core Version:    0.6.2
 */