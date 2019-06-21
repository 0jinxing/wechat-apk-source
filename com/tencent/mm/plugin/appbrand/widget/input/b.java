package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.d.c;
import com.tencent.mm.plugin.appbrand.widget.input.d.g;
import com.tencent.mm.plugin.appbrand.widget.input.d.h;
import com.tencent.mm.sdk.platformtools.bo;

 enum b
{
  static <Input extends EditText,  extends ab> void a(Input paramInput, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123576);
    if ((paramInput == null) || (paramInput.getEditableText() == null))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.AppBrandInputCommStyleHelper", "applySelection, invalid input %s", new Object[] { paramInput });
      AppMethodBeat.o(123576);
      return;
    }
    if (paramInt1 <= -2)
      paramInt1 = paramInput.getSelectionStart();
    label154: 
    while (true)
    {
      label48: if (paramInt2 <= -2)
        paramInt2 = paramInput.getSelectionEnd();
      while (true)
      {
        int i = paramInt1;
        if (paramInt1 > paramInt2)
          i = paramInt2;
        Selection.removeSelection(paramInput.getEditableText());
        paramInput.setSelection(i, paramInt2);
        AppMethodBeat.o(123576);
        break;
        if ((paramInt1 != -1) && (paramInt1 <= paramInput.getText().length()))
          break label154;
        paramInt1 = paramInput.getText().length();
        break label48;
        if ((paramInt2 == -1) || (paramInt2 > paramInput.getText().length()))
          paramInt2 = paramInput.getText().length();
      }
    }
  }

  static <Input extends EditText,  extends ab> void a(Input paramInput, h paramh)
  {
    AppMethodBeat.i(123575);
    if ((paramInput == null) || (paramh == null))
    {
      AppMethodBeat.o(123575);
      return;
    }
    if ((paramh.jjx != null) && (paramh.jjx.floatValue() != paramInput.getTextSize()))
      paramInput.setTextSize(paramh.jjx.floatValue());
    if (paramh.jjw != null)
      paramInput.setTextColor(paramh.jjw.intValue());
    label132: ab localab;
    if (paramh.jjv != null)
    {
      if ((paramInput.getBackground() == null) || (!(paramInput.getBackground() instanceof ColorDrawable)) || (((ColorDrawable)paramInput.getBackground()).getColor() != paramh.jjv.intValue()))
        paramInput.setBackground(new ColorDrawable(paramh.jjv.intValue()));
      if (!bo.isNullOrNil(paramh.jjz))
      {
        localObject = new SpannableStringBuilder(paramh.jjz);
        i = paramh.jjz.length();
        ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(c.EJ(paramh.jjA).style), 0, i, 18);
        if (paramh.jjC != null)
          ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(paramh.jjC.intValue()), 0, i, 18);
        if (paramh.jjB != null)
          ((SpannableStringBuilder)localObject).setSpan(new AbsoluteSizeSpan(paramh.jjB.intValue(), false), 0, i, 18);
        paramInput.setHint((CharSequence)localObject);
      }
      if (paramh.hdi != null)
      {
        localObject = Typeface.create("sans-serif", c.EJ(paramh.hdi).style);
        if (localObject != null)
          paramInput.setTypeface((Typeface)localObject);
      }
      Object localObject = g.EK(paramh.hdq);
      localab = (ab)paramInput;
      if (localab != null);
      switch (com.tencent.mm.plugin.appbrand.widget.input.d.g.1.jjT[localObject.ordinal()])
      {
      default:
        label336: if (!aj.g(paramh.jjE))
          break;
      case 1:
      case 2:
      case 3:
      }
    }
    for (int i = 8; ; i = 0)
    {
      paramInput.setVisibility(i);
      ((ab)paramInput).setFixed(aj.g(paramh.jjI));
      AppMethodBeat.o(123575);
      break;
      paramInput.setBackground(null);
      break label132;
      localab.aRi();
      break label336;
      localab.aRj();
      break label336;
      localab.aRk();
      break label336;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.b
 * JD-Core Version:    0.6.2
 */