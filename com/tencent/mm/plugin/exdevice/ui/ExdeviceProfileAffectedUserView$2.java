package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.base.MMHorList;

final class ExdeviceProfileAffectedUserView$2
  implements View.OnClickListener
{
  ExdeviceProfileAffectedUserView$2(ExdeviceProfileAffectedUserView paramExdeviceProfileAffectedUserView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20010);
    paramView = r.Yz();
    if ((paramView != null) && (paramView.equals(ExdeviceProfileAffectedUserView.a(this.lBL))))
    {
      paramView = ExdeviceProfileAffectedUserView.b(this.lBL);
      if (ExdeviceProfileAffectedUserView.b(this.lBL).getVisibility() != 0)
        break label64;
    }
    label64: for (int i = 8; ; i = 0)
    {
      paramView.setVisibility(i);
      AppMethodBeat.o(20010);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView.2
 * JD-Core Version:    0.6.2
 */