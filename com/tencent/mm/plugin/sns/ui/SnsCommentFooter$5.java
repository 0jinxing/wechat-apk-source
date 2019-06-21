package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.Iterator;
import java.util.List;

final class SnsCommentFooter$5
  implements TextWatcher
{
  int rrF = 0;

  SnsCommentFooter$5(SnsCommentFooter paramSnsCommentFooter, List paramList)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(38883);
    if (SnsCommentFooter.b(this.rrD).getText() == null)
    {
      AppMethodBeat.o(38883);
      return;
    }
    if ((d.fF(SnsCommentFooter.c(this.rrD), 8)) && (!bo.isNullOrNil(SnsCommentFooter.d(this.rrD))) && (!bo.isNullOrNil(SnsCommentFooter.b(this.rrD).getText().toString())) && (!SnsCommentFooter.b(this.rrD).getText().toString().startsWith(SnsCommentFooter.d(this.rrD))))
    {
      ab.i("MicroMsg.SnsCommentFooter", "commentAtPrefix [%s], curTxt [%s]", new Object[] { SnsCommentFooter.d(this.rrD), SnsCommentFooter.b(this.rrD).getText() });
      SnsCommentFooter.a(this.rrD, "");
      SnsCommentFooter.e(this.rrD);
      this.rrD.DW(8);
      SnsCommentFooter.a(this.rrD, 0);
    }
    ab.d("MicroMsg.SnsCommentFooter", "update commentkey:" + SnsCommentFooter.f(this.rrD));
    if (!bo.isNullOrNil(SnsCommentFooter.f(this.rrD)))
    {
      Iterator localIterator = this.rrG.iterator();
      while (localIterator.hasNext())
      {
        paramEditable = (k)localIterator.next();
        if (SnsCommentFooter.f(this.rrD).equals(paramEditable.key))
        {
          ab.d("MicroMsg.SnsCommentFooter", "afterTextChanged update");
          paramEditable.text = SnsCommentFooter.b(this.rrD).getText().toString();
          paramEditable.bJt = SnsCommentFooter.c(this.rrD);
        }
      }
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        ab.d("MicroMsg.SnsCommentFooter", "afterTextChanged add");
        paramEditable = new k();
        paramEditable.key = SnsCommentFooter.f(this.rrD);
        paramEditable.text = SnsCommentFooter.b(this.rrD).getText().toString();
        paramEditable.bJt = SnsCommentFooter.c(this.rrD);
        if ((paramEditable.text != null) && (paramEditable.text.length() > 0))
          this.rrG.add(paramEditable);
      }
      if (this.rrG.size() > 5)
      {
        ab.d("MicroMsg.SnsCommentFooter", "comments remove");
        this.rrG.remove(0);
      }
      SnsCommentFooter.b(this.rrD).requestFocus();
      if (SnsCommentFooter.b(this.rrD).getText().toString().trim().length() > 0);
      for (boolean bool = true; ; bool = false)
      {
        if ((bool) && (this.rrD.oio))
        {
          SnsCommentFooter.a(this.rrD, bool);
          this.rrD.oio = false;
        }
        if (!bool)
        {
          SnsCommentFooter.a(this.rrD, bool);
          this.rrD.oio = true;
        }
        AppMethodBeat.o(38883);
        break;
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38882);
    if (paramCharSequence == null);
    for (paramInt1 = 0; ; paramInt1 = paramCharSequence.length())
    {
      this.rrF = paramInt1;
      AppMethodBeat.o(38882);
      return;
    }
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38881);
    if ((paramCharSequence == null) || (paramCharSequence.length() < a.qFE))
    {
      this.rrD.DW(16);
      ab.d("MicroMsg.SnsCommentFooter", "clean SNS_COMMENT_FLAG_FOLD");
      AppMethodBeat.o(38881);
    }
    while (true)
    {
      return;
      if (paramCharSequence.length() - this.rrF > a.qFE)
      {
        this.rrD.setCommentFlag(16);
        ab.d("MicroMsg.SnsCommentFooter", "add SNS_COMMENT_FLAG_FOLD");
      }
      AppMethodBeat.o(38881);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.5
 * JD-Core Version:    0.6.2
 */