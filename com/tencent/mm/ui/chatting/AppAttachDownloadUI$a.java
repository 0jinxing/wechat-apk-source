package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.model.cb;

final class AppAttachDownloadUI$a
{
  private TextView exj;
  private Button tOx;

  public AppAttachDownloadUI$a(AppAttachDownloadUI paramAppAttachDownloadUI, Button paramButton, TextView paramTextView)
  {
    AppMethodBeat.i(30276);
    this.tOx = paramButton;
    this.exj = paramTextView;
    if (paramTextView != null)
    {
      int i = g.Nu().getInt("MsgFileExpiredInterval", 432000);
      long l = AppAttachDownloadUI.A(paramAppAttachDownloadUI).field_createTime / 1000L;
      Math.floor((i - cb.fp(l)) * 1.0D / 86400.0D);
      paramTextView.setText("");
    }
    AppMethodBeat.o(30276);
  }

  public final void dBo()
  {
    AppMethodBeat.i(30278);
    if (this.tOx != null)
      this.tOx.setVisibility(4);
    if (this.exj != null)
    {
      this.exj.setVisibility(0);
      this.exj.setText(2131299789);
      this.exj.setTextColor(this.yGh.getResources().getColor(2131689604));
      AppAttachDownloadUI.B(this.yGh).setVisibility(8);
      AppAttachDownloadUI.m(this.yGh).setVisibility(8);
    }
    AppMethodBeat.o(30278);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(30279);
    this.tOx.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(30279);
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(30277);
    if (this.tOx != null)
      this.tOx.setVisibility(paramInt);
    if (this.exj != null)
      this.exj.setVisibility(paramInt);
    AppMethodBeat.o(30277);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.a
 * JD-Core Version:    0.6.2
 */