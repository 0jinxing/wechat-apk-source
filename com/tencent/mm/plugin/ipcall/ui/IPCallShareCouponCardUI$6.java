package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;

final class IPCallShareCouponCardUI$6 extends ClickableSpan
{
  IPCallShareCouponCardUI$6(IPCallShareCouponCardUI paramIPCallShareCouponCardUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22287);
    ((TextView)paramView).setHighlightColor(this.nFb.getResources().getColor(2131690597));
    com.tencent.mm.plugin.report.service.h.pYm.e(13340, new Object[] { Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(1) });
    com.tencent.mm.ui.base.h.b(this.nFb.mController.ylL, this.nFg, this.nFb.getString(2131300843), true).a(2131300715, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(22287);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(22288);
    paramTextPaint.setColor(this.nFb.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(22288);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.6
 * JD-Core Version:    0.6.2
 */