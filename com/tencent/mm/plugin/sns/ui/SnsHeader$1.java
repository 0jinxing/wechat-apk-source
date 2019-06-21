package com.tencent.mm.plugin.sns.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class SnsHeader$1
  implements View.OnClickListener
{
  SnsHeader$1(SnsHeader paramSnsHeader, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38947);
    ab.d("MicroMsg.SnsHeader", "change backGround");
    if ((SnsHeader.a(this.rsb) != null) && (SnsHeader.a(this.rsb).isShowing()))
    {
      AppMethodBeat.o(38947);
      return;
    }
    if (SnsHeader.b(this.rsb) != null)
      SnsHeader.b(this.rsb).ctk();
    if (SnsHeader.c(this.rsb) == 1);
    long l;
    for (paramView = SnsHeader.d(this.rsb); ; paramView = SnsHeader.e(this.rsb))
    {
      paramView = af.cnJ().YX(paramView);
      l = paramView.field_snsBgId;
      if ((SnsHeader.f(this.rsb)) || (l != 0L))
        break label131;
      AppMethodBeat.o(38947);
      break;
    }
    label131: SnsHeader.a(this.rsb, paramView.cqJ());
    label206: String str;
    if ((SnsHeader.c(this.rsb) == 1) || (SnsHeader.d(this.rsb).trim().equals(SnsHeader.e(this.rsb).trim())))
    {
      paramView = new String[1];
      paramView[0] = this.val$context.getString(2131303841);
      SnsHeader.a(this.rsb, false);
      if (!SnsHeader.g(this.rsb))
        break label323;
      str = this.val$context.getString(2131303765);
      label227: if (!SnsHeader.g(this.rsb))
        break label330;
      this.val$context.getString(2131296994);
    }
    while (true)
    {
      SnsHeader.a(this.rsb, h.a(this.rsb.getContext(), str, paramView, new SnsHeader.1.1(this, l)));
      AppMethodBeat.o(38947);
      break;
      if (SnsHeader.g(this.rsb))
      {
        paramView = new String[0];
        break label206;
      }
      paramView = new String[1];
      paramView[0] = this.val$context.getString(2131303693);
      break label206;
      label323: str = "";
      break label227;
      label330: this.val$context.getString(2131296868);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsHeader.1
 * JD-Core Version:    0.6.2
 */