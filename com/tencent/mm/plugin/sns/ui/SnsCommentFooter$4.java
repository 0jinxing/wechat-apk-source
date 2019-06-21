package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsCommentFooter$4
  implements TextWatcher
{
  private int rrF = 0;

  SnsCommentFooter$4(SnsCommentFooter paramSnsCommentFooter)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(38880);
    if (SnsCommentFooter.b(this.rrD).getText() == null)
    {
      AppMethodBeat.o(38880);
      return;
    }
    if ((d.fF(SnsCommentFooter.c(this.rrD), 8)) && (!bo.isNullOrNil(SnsCommentFooter.d(this.rrD))) && (SnsCommentFooter.b(this.rrD).getText() != null) && (!SnsCommentFooter.b(this.rrD).getText().toString().startsWith(SnsCommentFooter.d(this.rrD))))
    {
      ab.i("MicroMsg.SnsCommentFooter", "cur text %s", new Object[] { SnsCommentFooter.b(this.rrD).getText() });
      SnsCommentFooter.a(this.rrD, "");
      SnsCommentFooter.e(this.rrD);
      this.rrD.DW(8);
      SnsCommentFooter.a(this.rrD, 0);
    }
    SnsCommentFooter.b(this.rrD).requestFocus();
    if (SnsCommentFooter.b(this.rrD).getText().toString().trim().length() > 0);
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (this.rrD.oio))
      {
        SnsCommentFooter.a(this.rrD, true);
        this.rrD.oio = false;
      }
      if (i == 0)
      {
        SnsCommentFooter.a(this.rrD, false);
        this.rrD.oio = true;
      }
      AppMethodBeat.o(38880);
      break;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38878);
    if (paramCharSequence == null);
    for (paramInt1 = 0; ; paramInt1 = paramCharSequence.length())
    {
      this.rrF = paramInt1;
      AppMethodBeat.o(38878);
      return;
    }
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38879);
    if ((paramCharSequence == null) || (paramCharSequence.length() < a.qFE))
    {
      this.rrD.DW(16);
      ab.d("MicroMsg.SnsCommentFooter", "clean SNS_COMMENT_FLAG_FOLD");
      AppMethodBeat.o(38879);
    }
    while (true)
    {
      return;
      if (paramCharSequence.length() - this.rrF > a.qFE)
      {
        this.rrD.setCommentFlag(16);
        ab.d("MicroMsg.SnsCommentFooter", "add SNS_COMMENT_FLAG_FOLD");
      }
      AppMethodBeat.o(38879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.4
 * JD-Core Version:    0.6.2
 */