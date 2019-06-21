package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;

final class SettingsPanel$3
  implements View.OnClickListener
{
  SettingsPanel$3(SettingsPanel paramSettingsPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11191);
    paramView = new ArrayList();
    paramView.add("MHADrawableView");
    paramView.add("MTextureView");
    paramView.add("MSurfaceView");
    paramView.add("MCanvasView");
    paramView.add("MDrawableView");
    paramView = new b(this.jqk.getContext(), paramView);
    paramView.Qq(((Integer)SettingsPanel.b(this.jqk).getTag()).intValue());
    paramView.zSq = new SettingsPanel.3.1(this, paramView);
    paramView.Qp(a.fromDPToPix(this.jqk.getContext(), 288));
    paramView.show();
    AppMethodBeat.o(11191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.3
 * JD-Core Version:    0.6.2
 */