package com.tencent.mm.plugin.ipcall.ui;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class j$11
  implements IPCallFuncButton.a
{
  j$11(j paramj)
  {
  }

  public final void iv(boolean paramBoolean)
  {
    AppMethodBeat.i(22409);
    if (paramBoolean)
    {
      localj = this.nGR;
      if (localj.nGl == null)
        localj.eks.setVisibility(8);
      while (true)
      {
        localj.eks.setVisibility(8);
        localj.nGw.setVisibility(8);
        localj.nGu.setText("");
        localj.nGv.setText("");
        localj.nzR.setVisibility(0);
        h.pYm.e(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
        AppMethodBeat.o(22409);
        return;
        localj.eks.setVisibility(4);
      }
    }
    j localj = this.nGR;
    if (localj.nGl != null)
    {
      localj.eks.setVisibility(0);
      localj.nGw.setVisibility(8);
    }
    while (true)
    {
      localj.Pm(localj.nGF);
      localj.nzR.setVisibility(4);
      break;
      localj.nGw.setVisibility(0);
      localj.eks.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.j.11
 * JD-Core Version:    0.6.2
 */