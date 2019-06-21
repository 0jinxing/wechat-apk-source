package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tenpay.android.wechat.TenpaySecureEditText;

final class EditHintView$8
  implements View.OnClickListener
{
  EditHintView$8(EditHintView paramEditHintView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49185);
    if (EditHintView.l(this.Ahi).getVisibility() == 0)
      if ((this.Ahi.gJL) && (!bo.isNullOrNil(this.Ahi.getText())))
      {
        this.Ahi.AgX.ClearInput();
        AppMethodBeat.o(49185);
      }
    while (true)
    {
      return;
      if (EditHintView.f(this.Ahi) == 1)
      {
        if ((EditHintView.m(this.Ahi) != null) && (EditHintView.n(this.Ahi)))
        {
          EditHintView.m(this.Ahi);
          AppMethodBeat.o(49185);
        }
      }
      else
      {
        EditHintView.o(this.Ahi);
        AppMethodBeat.o(49185);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.8
 * JD-Core Version:    0.6.2
 */