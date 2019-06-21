package com.tencent.mm.plugin.sns.ui;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

final class AtContactWidget$2
  implements Runnable
{
  AtContactWidget$2(AtContactWidget paramAtContactWidget)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38151);
    int i = (int)(d.anS().density * 36.0F);
    if (i != 0)
    {
      i = (AtContactWidget.b(this.rhj).getWidth() - AtContactWidget.c(this.rhj).getWidth() - AtContactWidget.d(this.rhj).getWidth() - (int)(d.anS().density * 32.0F)) / i;
      if ((i > 0) && (i < 5))
      {
        AtContactWidget.e(this.rhj).setLineNum(i);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)AtContactWidget.e(this.rhj).getLayoutParams();
        localLayoutParams.alignWithParent = true;
        AtContactWidget.e(this.rhj).setLayoutParams(localLayoutParams);
      }
    }
    AppMethodBeat.o(38151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AtContactWidget.2
 * JD-Core Version:    0.6.2
 */