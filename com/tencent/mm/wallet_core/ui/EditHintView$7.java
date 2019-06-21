package com.tencent.mm.wallet_core.ui;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.e;
import java.util.Calendar;

final class EditHintView$7
  implements View.OnClickListener
{
  EditHintView$7(EditHintView paramEditHintView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49184);
    if (EditHintView.h(this.Ahi) == null)
    {
      paramView = Calendar.getInstance();
      paramView.setTimeInMillis(System.currentTimeMillis());
      paramView.add(2, 1);
      EditHintView.a(this.Ahi, paramView.get(1));
      EditHintView.b(this.Ahi, paramView.get(2));
      EditHintView.a(this.Ahi, new e(this.Ahi.getContext(), new EditHintView.7.1(this), EditHintView.i(this.Ahi), EditHintView.j(this.Ahi), paramView.get(5), paramView.getTimeInMillis()));
    }
    EditHintView.h(this.Ahi).show();
    AppMethodBeat.o(49184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.7
 * JD-Core Version:    0.6.2
 */