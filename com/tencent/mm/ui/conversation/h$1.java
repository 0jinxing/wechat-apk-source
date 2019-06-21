package com.tencent.mm.ui.conversation;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.TextAppearanceSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.NoMeasuredTextView.c;

final class h$1
  implements NoMeasuredTextView.c
{
  h$1(h paramh)
  {
  }

  public final CharSequence a(NoMeasuredTextView paramNoMeasuredTextView, CharSequence paramCharSequence, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34353);
    float f1 = paramNoMeasuredTextView.getPaint().getTextSize();
    int i = a.fromDPToPix(h.a(this.ztS), paramInt2);
    paramNoMeasuredTextView.getPaint().setTextSize(i);
    float f2 = paramNoMeasuredTextView.getPaint().measureText(" ".concat(String.valueOf(paramString)));
    paramNoMeasuredTextView.getPaint().setTextSize(f1);
    paramInt2 = paramNoMeasuredTextView.getMeasuredWidth() - paramNoMeasuredTextView.getCompoundPaddingRight() - paramNoMeasuredTextView.getCompoundPaddingLeft();
    if (f2 >= paramInt2 * 0.6D)
    {
      paramCharSequence = TextUtils.ellipsize(paramCharSequence, paramNoMeasuredTextView.getPaint(), (float)(paramInt2 * 0.4D), TextUtils.TruncateAt.END);
      f2 = paramNoMeasuredTextView.getPaint().measureText(paramCharSequence.toString());
      paramNoMeasuredTextView.getPaint().setTextSize(i);
      paramString = TextUtils.ellipsize(paramString, paramNoMeasuredTextView.getPaint(), paramInt2 - f2 - 20.0F, TextUtils.TruncateAt.END);
      paramNoMeasuredTextView.getPaint().setTextSize(f1);
    }
    for (paramNoMeasuredTextView = paramCharSequence; ; paramNoMeasuredTextView = TextUtils.ellipsize(paramCharSequence, paramNoMeasuredTextView.getPaint(), paramInt2 - f2, TextUtils.TruncateAt.END))
    {
      SpannableString localSpannableString = j.b(h.b(this.ztS), paramNoMeasuredTextView + " " + paramString);
      paramCharSequence = a.h(h.c(this.ztS), paramInt1);
      localSpannableString.setSpan(new TextAppearanceSpan(null, 0, i, paramCharSequence, paramCharSequence), paramNoMeasuredTextView.length() + 1, paramNoMeasuredTextView.length() + 1 + paramString.length(), 33);
      AppMethodBeat.o(34353);
      return localSpannableString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.h.1
 * JD-Core Version:    0.6.2
 */