package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;
import java.util.ArrayList;

final class SettingsPanel$4
  implements View.OnClickListener
{
  SettingsPanel$4(SettingsPanel paramSettingsPanel)
  {
  }

  public final void onClick(final View paramView)
  {
    AppMethodBeat.i(11193);
    paramView = new ArrayList();
    paramView.add("Normal");
    paramView.add("Minimal-json");
    paramView = new b(this.jqk.getContext(), paramView);
    paramView.Qq(((Integer)SettingsPanel.c(this.jqk).getTag()).intValue());
    paramView.zSq = new b.a()
    {
      public final void d(boolean paramAnonymousBoolean, Object paramAnonymousObject)
      {
        AppMethodBeat.i(11192);
        paramView.hide();
        if (paramAnonymousBoolean)
          SettingsPanel.c(SettingsPanel.4.this.jqk).setText((CharSequence)paramAnonymousObject);
        SettingsPanel.b(SettingsPanel.4.this.jqk, paramView.dLl());
        AppMethodBeat.o(11192);
      }
    };
    paramView.Qp(a.fromDPToPix(this.jqk.getContext(), 288));
    paramView.show();
    AppMethodBeat.o(11193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.4
 * JD-Core Version:    0.6.2
 */