package com.tencent.mm.plugin.aa.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.a.e.a;

final class PaylistAAUI$8
  implements a.a
{
  PaylistAAUI$8(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void aos()
  {
    AppMethodBeat.i(40873);
    if (!t.kH(PaylistAAUI.a(this.gpC)));
    for (int i = 2131304185; ; i = 2131304184)
    {
      e.a locala = new e.a(this.gpC);
      locala.al(this.gpC.getString(2131304186));
      View localView = v.hu(this.gpC).inflate(2130970982, null);
      ImageView localImageView = (ImageView)localView.findViewById(2131820629);
      TextView localTextView = (TextView)localView.findViewById(2131820674);
      localImageView.setImageResource(2130839794);
      localTextView.setText(i);
      locala.fo(localView);
      locala.Qg(2131297041);
      locala.zQK = this.gpC.getString(2131296868);
      locala.zQM = false;
      locala.a(new PaylistAAUI.8.1(this), new PaylistAAUI.8.2(this));
      locala.show();
      h.pYm.e(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(7) });
      AppMethodBeat.o(40873);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.8
 * JD-Core Version:    0.6.2
 */