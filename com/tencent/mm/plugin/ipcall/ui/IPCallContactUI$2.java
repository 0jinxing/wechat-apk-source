package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.os.Looper;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.sdk.platformtools.ak;

final class IPCallContactUI$2 extends ak
{
  IPCallContactUI$2(IPCallContactUI paramIPCallContactUI, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22072);
    if (paramMessage.what == 1)
    {
      if (IPCallContactUI.k(this.nBH) != null)
        IPCallContactUI.k(this.nBH).dismiss();
      IPCallContactUI.l(this.nBH).setVisibility(0);
      IPCallContactUI.d(this.nBH);
      c.nzw = b.bHW();
      IPCallContactUI.d(this.nBH).KC();
      IPCallContactUI.d(this.nBH).notifyDataSetChanged();
      IPCallContactUI.b(this.nBH).invalidateViews();
      IPCallContactUI.c(this.nBH).setAddressCount(IPCallContactUI.d(this.nBH).getCount());
      a.bGG().bGH();
      AppMethodBeat.o(22072);
      return;
    }
    if (paramMessage.what == 2)
    {
      if (IPCallContactUI.d(this.nBH).getCount() != 0)
        break label196;
      IPCallContactUI.m(this.nBH).setVisibility(0);
    }
    while (true)
    {
      if ((IPCallContactUI.d(this.nBH).getCount() != 0) && (IPCallContactUI.e(this.nBH)))
        IPCallContactUI.d(this.nBH).notifyDataSetChanged();
      AppMethodBeat.o(22072);
      break;
      label196: IPCallContactUI.m(this.nBH).setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.2
 * JD-Core Version:    0.6.2
 */