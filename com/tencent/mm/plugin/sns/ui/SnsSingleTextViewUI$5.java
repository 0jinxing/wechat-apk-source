package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class SnsSingleTextViewUI$5
  implements n.d
{
  SnsSingleTextViewUI$5(SnsSingleTextViewUI paramSnsSingleTextViewUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(39305);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(39305);
    case 0:
    case 1:
    case 6:
    case 14:
    case 16:
    case 15:
    case 17:
    }
    while (true)
    {
      return;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
      {
        SnsSingleTextViewUI.f(this.rxm).setText(SnsSingleTextViewUI.e(this.rxm).getText());
        h.bQ(this.rxm.mController.ylL, this.rxm.mController.ylL.getString(2131296876));
        if (SnsSingleTextViewUI.a(this.rxm) != null)
        {
          paramMenuItem = com.tencent.mm.plugin.secinforeport.a.a.qjm;
          com.tencent.mm.plugin.secinforeport.a.a.h(2, bo.mz(SnsSingleTextViewUI.a(this.rxm).field_snsId), bo.ana(SnsSingleTextViewUI.e(this.rxm).getText().toString()));
        }
      }
      AppMethodBeat.o(39305);
      continue;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
      {
        paramMenuItem = new cl();
        com.tencent.mm.plugin.sns.j.a.a(paramMenuItem, SnsSingleTextViewUI.g(this.rxm), SnsSingleTextViewUI.e(this.rxm).getText());
        paramMenuItem.cvA.activity = this.rxm;
        paramMenuItem.cvA.cvH = 18;
        com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
      }
      AppMethodBeat.o(39305);
      continue;
      Intent localIntent;
      n localn;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
      {
        localIntent = new Intent();
        localn = af.cnF().YT(SnsSingleTextViewUI.g(this.rxm));
        if (localn != null)
          break label432;
        paramMenuItem = "";
        label354: localIntent.putExtra("k_username", paramMenuItem);
        if (localn != null)
          break label441;
      }
      label432: label441: for (paramMenuItem = Integer.valueOf(0); ; paramMenuItem = localn.cqA())
      {
        localIntent.putExtra("k_expose_msg_id", paramMenuItem);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
        d.b(this.rxm, "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(39305);
        break;
        paramMenuItem = localn.field_userName;
        break label354;
      }
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
        ap.r(af.cnF().YT(SnsSingleTextViewUI.g(this.rxm)));
      AppMethodBeat.o(39305);
      continue;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
        ap.s(af.cnF().YT(SnsSingleTextViewUI.g(this.rxm)));
      AppMethodBeat.o(39305);
      continue;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
        ap.a(new l(null, SnsSingleTextViewUI.a(this.rxm).cqA(), SnsSingleTextViewUI.h(this.rxm), null, SnsSingleTextViewUI.h(this.rxm).ncM, null, 1));
      AppMethodBeat.o(39305);
      continue;
      if ((SnsSingleTextViewUI.e(this.rxm) != null) && (SnsSingleTextViewUI.e(this.rxm).getText() != null))
        ap.b(new l(null, SnsSingleTextViewUI.a(this.rxm).cqA(), SnsSingleTextViewUI.h(this.rxm), null, SnsSingleTextViewUI.h(this.rxm).ncM, null, 1));
      AppMethodBeat.o(39305);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.5
 * JD-Core Version:    0.6.2
 */