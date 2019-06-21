package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Spannable;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ai
{
  static ai.a[] g(TextView paramTextView)
  {
    int i = 0;
    AppMethodBeat.i(77441);
    Spannable localSpannable = null;
    Object localObject = localSpannable;
    if (paramTextView != null)
    {
      localObject = localSpannable;
      if ((paramTextView.getText() instanceof Spannable))
      {
        localSpannable = (Spannable)paramTextView.getText();
        paramTextView = (ai.a[])localSpannable.getSpans(0, localSpannable.length(), ai.a.class);
        int j = paramTextView.length;
        while (true)
        {
          localObject = paramTextView;
          if (i >= j)
            break;
          localSpannable.removeSpan(paramTextView[i]);
          i++;
        }
      }
    }
    AppMethodBeat.o(77441);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ai
 * JD-Core Version:    0.6.2
 */