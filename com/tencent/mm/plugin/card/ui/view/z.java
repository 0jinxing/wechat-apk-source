package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.ui.MMActivity;

public final class z extends i
{
  private View kru;

  public final void bes()
  {
    AppMethodBeat.i(88793);
    if (this.kru != null)
      this.kru.setVisibility(8);
    AppMethodBeat.o(88793);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88792);
    if (this.kru == null)
      this.kru = ((ViewStub)findViewById(2131822035)).inflate();
    tm localtm = this.kqK.bcv().aZW().vSg;
    int i;
    if (this.kru != null)
    {
      ((TextView)this.kru.findViewById(2131822322)).setText(localtm.title);
      ((TextView)this.kru.findViewById(2131822323)).setText(localtm.kbW);
      if ((!this.kqK.bcA().bdy()) || (!this.kqK.bcA().bdz()))
      {
        i = 1;
        if (i == 0)
          break label159;
        ((LinearLayout.LayoutParams)((LinearLayout)this.kru).getLayoutParams()).bottomMargin = 0;
        AppMethodBeat.o(88792);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label159: ((LinearLayout.LayoutParams)((LinearLayout)this.kru).getLayoutParams()).bottomMargin = this.kqK.bcy().getResources().getDimensionPixelSize(2131427848);
      AppMethodBeat.o(88792);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.z
 * JD-Core Version:    0.6.2
 */