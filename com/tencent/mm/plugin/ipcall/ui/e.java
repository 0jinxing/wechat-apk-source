package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

public final class e
{
  ListView nAS;
  h nAT;
  View nAU;
  IPCallAddressUI nAV;
  boolean nAW = false;
  TextView nAX = null;
  TextView nAY = null;
  LinearLayout nAZ = null;
  TextView nBa = null;
  ImageView nBb = null;

  public e(IPCallAddressUI paramIPCallAddressUI, ListView paramListView, View paramView)
  {
    this.nAS = paramListView;
    this.nAV = paramIPCallAddressUI;
    this.nAU = paramView;
  }

  public final void bIh()
  {
    AppMethodBeat.i(22042);
    al.d(new e.6(this));
    AppMethodBeat.o(22042);
  }

  public final void bIi()
  {
    AppMethodBeat.i(22043);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(22039);
        aqq localaqq = c.bIU();
        if (localaqq != null)
        {
          e.this.nAX.setText(localaqq.wuw);
          if (!bo.isNullOrNil(localaqq.wuE))
          {
            e.this.nAY.setText(localaqq.wuE);
            e.this.nAY.setVisibility(0);
            AppMethodBeat.o(22039);
          }
        }
        while (true)
        {
          return;
          e.this.nAY.setText("");
          e.this.nAY.setVisibility(8);
          AppMethodBeat.o(22039);
          continue;
          e.this.nAX.setText("");
          e.this.nAY.setText("");
          e.this.nAY.setVisibility(8);
          AppMethodBeat.o(22039);
        }
      }
    });
    AppMethodBeat.o(22043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e
 * JD-Core Version:    0.6.2
 */