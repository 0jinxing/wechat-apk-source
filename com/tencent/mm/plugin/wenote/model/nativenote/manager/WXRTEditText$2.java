package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class WXRTEditText$2
  implements TextWatcher
{
  WXRTEditText$2(WXRTEditText paramWXRTEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    try
    {
      AppMethodBeat.i(26787);
      ab.d("noteeditor.WXRTEditText", "afterTextChanged");
      Object localObject1 = paramEditable.toString();
      if (this.uQo.uPO == null);
      for (paramEditable = ""; ; paramEditable = this.uQo.uPO)
      {
        if (WXRTEditText.f(this.uQo) != 0)
          this.uQo.uPO = "";
        Object localObject2;
        if ((!WXRTEditText.d(this.uQo)) && (this.uQo.getSelection().aqm == this.uQo.getSelection().Ls))
        {
          if (!paramEditable.endsWith("\n"))
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            if ((paramEditable + "\n").equals(localObject1))
              break label148;
          }
          label148: if ((paramEditable.endsWith("\n")) && (!paramEditable.endsWith("\n\n")) && (paramEditable.equals(localObject1)) && (((ParagraphStyle[])this.uQo.getText().getSpans(paramEditable.length(), paramEditable.length(), ParagraphStyle.class)).length > 0))
          {
            int i = this.uQo.getSelectionStart();
            WXRTEditText.a(this.uQo, true);
            this.uQo.getText().append("\n");
            WXRTEditText.a(this.uQo, false);
            this.uQo.setSelection(i);
          }
        }
        if ((WXRTEditText.g(this.uQo) != null) && (!WXRTEditText.d(this.uQo)) && (!paramEditable.equals(localObject1)))
        {
          paramEditable = this.uQo.deK();
          this.uQo.uPO = ((String)localObject1);
          localObject1 = WXRTEditText.g(this.uQo);
          localObject2 = WXRTEditText.h(this.uQo);
          Spannable localSpannable = WXRTEditText.i(this.uQo);
          WXRTEditText.j(this.uQo);
          WXRTEditText.k(this.uQo);
          this.uQo.getSelectionStart();
          ((c)localObject1).a((WXRTEditText)localObject2, localSpannable, paramEditable, this.uQo.getSelectionEnd());
        }
        WXRTEditText.e(this.uQo);
        WXRTEditText.l(this.uQo);
        WXRTEditText.m(this.uQo);
        WXRTEditText.n(this.uQo);
        AppMethodBeat.o(26787);
        return;
      }
    }
    finally
    {
    }
    throw paramEditable;
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(26785);
      if (WXRTEditText.c(this.uQo) == null);
      for (String str = ""; ; str = WXRTEditText.c(this.uQo))
      {
        if ((!WXRTEditText.d(this.uQo)) && (!paramCharSequence.toString().equals(str)))
        {
          WXRTEditText.a(this.uQo, this.uQo.getSelectionStart());
          WXRTEditText.b(this.uQo, this.uQo.getSelectionEnd());
          WXRTEditText.a(this.uQo, paramCharSequence.toString());
          this.uQo.uPO = WXRTEditText.c(this.uQo);
          WXRTEditText.a(this.uQo, this.uQo.deK());
        }
        AppMethodBeat.o(26785);
        return;
      }
    }
    finally
    {
    }
    throw paramCharSequence;
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(26786);
      WXRTEditText.e(this.uQo);
      AppMethodBeat.o(26786);
      return;
    }
    finally
    {
      paramCharSequence = finally;
    }
    throw paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText.2
 * JD-Core Version:    0.6.2
 */