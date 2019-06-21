package com.tencent.mm.wallet_core.ui;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.widget.DatePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.DecimalFormat;

final class EditHintView$7$1
  implements DatePickerDialog.OnDateSetListener
{
  EditHintView$7$1(EditHintView.7 param7)
  {
  }

  public final void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(49183);
    if ((paramInt1 < EditHintView.i(this.Ahj.Ahi)) && (paramInt2 < EditHintView.j(this.Ahj.Ahi)))
    {
      h.b(this.Ahj.Ahi.getContext(), this.Ahj.Ahi.getContext().getString(2131304788), null, true);
      EditHintView.a(this.Ahj.Ahi, this.Ahj.Ahi.asa());
      if (EditHintView.d(this.Ahj.Ahi) != null)
      {
        ab.d("MicroMsg.EditHintView", "View:" + EditHintView.e(this.Ahj.Ahi) + ", editType:" + EditHintView.f(this.Ahj.Ahi) + " inputValid change to " + EditHintView.c(this.Ahj.Ahi));
        EditHintView.d(this.Ahj.Ahi);
        EditHintView.c(this.Ahj.Ahi);
      }
      AppMethodBeat.o(49183);
      return;
    }
    paramDatePicker = new DecimalFormat("00");
    if (r.YM())
      EditHintView.a(this.Ahj.Ahi, paramDatePicker.format(paramInt2 + 1) + paramInt1);
    while (true)
    {
      EditHintView.k(this.Ahj.Ahi).setText(paramDatePicker.format(paramInt2 + 1) + paramDatePicker.format(paramInt1).substring(2));
      break;
      EditHintView.a(this.Ahj.Ahi, paramDatePicker.format(paramInt1).substring(2) + paramDatePicker.format(paramInt2 + 1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.7.1
 * JD-Core Version:    0.6.2
 */