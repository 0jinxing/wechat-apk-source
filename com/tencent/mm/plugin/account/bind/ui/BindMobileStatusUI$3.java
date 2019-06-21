package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindMobileStatusUI$3
  implements View.OnClickListener
{
  BindMobileStatusUI$3(BindMobileStatusUI paramBindMobileStatusUI)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(13497);
    paramView = this.gse;
    if (!BindMobileStatusUI.d(this.gse).booleanValue())
    {
      bool2 = true;
      BindMobileStatusUI.b(paramView, Boolean.valueOf(bool2));
      if (!BindMobileStatusUI.d(this.gse).booleanValue())
        break label131;
      BindMobileStatusUI.e(this.gse).setImageResource(2131231117);
      label62: paramView = this.gse;
      if (BindMobileStatusUI.d(this.gse).booleanValue())
        break label146;
    }
    label131: label146: for (boolean bool2 = bool1; ; bool2 = false)
    {
      BindMobileStatusUI.a(paramView, bool2, 256, 7);
      if (!BindMobileStatusUI.d(this.gse).booleanValue())
        BindMobileStatusUI.a(this.gse, false, 2097152, 32);
      AppMethodBeat.o(13497);
      return;
      bool2 = false;
      break;
      BindMobileStatusUI.e(this.gse).setImageResource(2131231120);
      break label62;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.3
 * JD-Core Version:    0.6.2
 */