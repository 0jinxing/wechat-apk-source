package com.tencent.mm.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ServiceNotifySettingsUI$a$1
  implements View.OnClickListener
{
  ServiceNotifySettingsUI$a$1(ServiceNotifySettingsUI.a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29856);
    String str = (String)paramView.getTag();
    if (TextUtils.isEmpty(str))
    {
      AppMethodBeat.o(29856);
      return;
    }
    paramView = paramView.getContext();
    int i;
    if (this.yqg == 1)
    {
      i = 2131301849;
      label44: if (this.yqg != 1)
        break label102;
    }
    label102: for (int j = 2131301850; ; j = 2131296994)
    {
      h.a(paramView, i, 0, j, 2131297773, false, new ServiceNotifySettingsUI.a.1.1(this, str), new ServiceNotifySettingsUI.a.1.2(this), 2131690135);
      AppMethodBeat.o(29856);
      break;
      i = 2131301853;
      break label44;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI.a.1
 * JD-Core Version:    0.6.2
 */