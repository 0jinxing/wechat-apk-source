package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.f.a;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.AlignmentSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.Set;

final class y$a
  implements TextWatcher
{
  final Map<TextWatcher, Object> jgt;

  private y$a(y paramy)
  {
    AppMethodBeat.i(123823);
    this.jgt = new a();
    AppMethodBeat.o(123823);
  }

  private static <T> void a(CharSequence paramCharSequence, int paramInt1, int paramInt2, Class<T> paramClass)
  {
    AppMethodBeat.i(123824);
    try
    {
      if ((paramCharSequence instanceof SpannableStringBuilder))
      {
        paramCharSequence = (SpannableStringBuilder)paramCharSequence;
        paramClass = paramCharSequence.getSpans(paramInt1, paramInt1 + paramInt2, paramClass);
        if ((paramClass != null) && (paramClass.length > 0))
        {
          paramInt2 = paramClass.length;
          for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
            paramCharSequence.removeSpan(paramClass[paramInt1]);
        }
      }
      AppMethodBeat.o(123824);
      return;
    }
    catch (Throwable paramCharSequence)
    {
      while (true)
        AppMethodBeat.o(123824);
    }
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(123827);
    f.aQv();
    Object localObject;
    int i;
    int j;
    if (f.aQw())
    {
      PBool localPBool = new PBool();
      PInt localPInt = new PInt();
      localObject = y.a(paramEditable, localPBool, localPInt);
      i = localPInt.value;
      if ((localPBool.value) && (!bo.isNullOrNil((String)localObject)))
      {
        j = Selection.getSelectionEnd(paramEditable);
        boolean bool = y.c(this.jgs);
        this.jgs.post(new y.a.1(this, bool, (String)localObject, j, i));
        AppMethodBeat.o(123827);
      }
    }
    while (true)
    {
      return;
      if (!y.c(this.jgs))
      {
        y.d(this.jgs);
        if (!this.jgt.isEmpty())
        {
          localObject = (TextWatcher[])this.jgt.keySet().toArray(new TextWatcher[this.jgt.size()]);
          i = localObject.length;
          for (j = 0; j < i; j++)
            localObject[j].afterTextChanged(paramEditable);
        }
      }
      AppMethodBeat.o(123827);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(123825);
    if ((!y.c(this.jgs)) && (!this.jgt.isEmpty()))
    {
      TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.jgt.keySet().toArray(new TextWatcher[this.jgt.size()]);
      int i = arrayOfTextWatcher.length;
      for (int j = 0; j < i; j++)
        arrayOfTextWatcher[j].beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    }
    AppMethodBeat.o(123825);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(123826);
    if (!y.c(this.jgs))
    {
      a(paramCharSequence, paramInt1, paramInt3, StyleSpan.class);
      a(paramCharSequence, paramInt1, paramInt3, RelativeSizeSpan.class);
      a(paramCharSequence, paramInt1, paramInt3, AlignmentSpan.class);
      if (!this.jgt.isEmpty())
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.jgt.keySet().toArray(new TextWatcher[this.jgt.size()]);
        int i = arrayOfTextWatcher.length;
        for (int j = 0; j < i; j++)
          arrayOfTextWatcher[j].onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
      }
    }
    AppMethodBeat.o(123826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.y.a
 * JD-Core Version:    0.6.2
 */