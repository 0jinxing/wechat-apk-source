package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindMobileStatusUI$2
  implements View.OnClickListener
{
  BindMobileStatusUI$2(BindMobileStatusUI paramBindMobileStatusUI)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(13496);
    paramView = this.gse;
    if (!BindMobileStatusUI.b(this.gse).booleanValue())
    {
      bool2 = true;
      BindMobileStatusUI.a(paramView, Boolean.valueOf(bool2));
      if (!BindMobileStatusUI.b(this.gse).booleanValue())
        break label105;
      BindMobileStatusUI.c(this.gse).setImageResource(2131231117);
      label62: paramView = this.gse;
      if (BindMobileStatusUI.b(this.gse).booleanValue())
        break label120;
    }
    label105: label120: for (boolean bool2 = bool1; ; bool2 = false)
    {
      BindMobileStatusUI.a(paramView, bool2, 512, 8);
      AppMethodBeat.o(13496);
      return;
      bool2 = false;
      break;
      BindMobileStatusUI.c(this.gse).setImageResource(2131231120);
      break label62;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.2
 * JD-Core Version:    0.6.2
 */