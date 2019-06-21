package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.h;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.z;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BizChatroomInfoUI$7
  implements ContactListExpandPreference.a
{
  BizChatroomInfoUI$7(BizChatroomInfoUI paramBizChatroomInfoUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(30205);
    if (BizChatroomInfoUI.b(this.yFp) != null)
      BizChatroomInfoUI.b(this.yFp).djD();
    AppMethodBeat.o(30205);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(30203);
    BizChatroomInfoUI.a(this.yFp, paramInt);
    AppMethodBeat.o(30203);
  }

  public final void iB(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(30204);
    j localj = this.yFp.Oa(paramInt);
    if ((localj == null) || (bo.isNullOrNil(localj.field_profileUrl)))
      if (localj == null)
      {
        ab.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(30204);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick Url:%s", new Object[] { localj.field_profileUrl });
      z.aeZ();
      h.a(localj.field_userId, localj.field_brandUserName, this.yFp);
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", localj.field_profileUrl);
      localIntent.putExtra("useJs", true);
      d.b(this.yFp.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(30204);
    }
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(30206);
    BizChatroomInfoUI.c(this.yFp);
    AppMethodBeat.o(30206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.7
 * JD-Core Version:    0.6.2
 */