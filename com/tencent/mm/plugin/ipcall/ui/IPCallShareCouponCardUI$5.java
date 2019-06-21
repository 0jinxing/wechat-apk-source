package com.tencent.mm.plugin.ipcall.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelmulti.g;
import com.tencent.mm.pluginsdk.ui.applet.q.b;
import com.tencent.mm.ui.base.h;

final class IPCallShareCouponCardUI$5
  implements q.b
{
  IPCallShareCouponCardUI$5(IPCallShareCouponCardUI paramIPCallShareCouponCardUI, EditText paramEditText, String paramString, int paramInt)
  {
  }

  public final void iw(boolean paramBoolean)
  {
    AppMethodBeat.i(22286);
    Object localObject;
    if (paramBoolean)
      if (this.nFc == null)
      {
        localObject = this.gUV;
        g localg = new g(this.nFd, (String)localObject);
        localObject = this.nFb;
        IPCallShareCouponCardUI localIPCallShareCouponCardUI = this.nFb;
        this.nFb.getString(2131297061);
        IPCallShareCouponCardUI.b((IPCallShareCouponCardUI)localObject, h.b(localIPCallShareCouponCardUI, this.nFb.getString(2131297043), true, new IPCallShareCouponCardUI.5.1(this, localg)));
        aw.Rg().a(localg, 0);
        AppMethodBeat.o(22286);
      }
    while (true)
    {
      return;
      localObject = this.nFc.getText().toString();
      break;
      AppMethodBeat.o(22286);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.5
 * JD-Core Version:    0.6.2
 */