package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;

 enum aj$a
{
  static int a(EditText paramEditText, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(123847);
    int i = paramEditText.getPaddingTop();
    Layout localLayout = paramEditText.getLayout();
    if (localLayout == null)
    {
      j = -1;
      AppMethodBeat.o(123847);
    }
    Editable localEditable;
    while (true)
    {
      return j;
      localEditable = paramEditText.getEditableText();
      if (localEditable == null)
      {
        j = -1;
        AppMethodBeat.o(123847);
      }
      else
      {
        paramEditText = paramEditText.getPaint();
        if (paramEditText != null)
          break;
        j = -1;
        AppMethodBeat.o(123847);
      }
    }
    Rect localRect = new Rect();
    int j = 0;
    label86: int k;
    int m;
    if (j < localLayout.getLineCount())
    {
      localLayout.getLineBounds(j, localRect);
      k = i + localRect.height();
      if (k >= paramFloat2)
      {
        m = localLayout.getLineStart(j);
        i = localLayout.getLineEnd(j);
        if (j == localLayout.getLineCount() - 1)
          break label398;
        i = Math.max(i - 1, m);
      }
    }
    label398: 
    while (true)
    {
      if (m == i)
      {
        AppMethodBeat.o(123847);
        j = m;
        break;
      }
      Object localObject = (RelativeSizeSpan[])localEditable.getSpans(m, i, RelativeSizeSpan.class);
      float f1 = 1.0F;
      float f2 = f1;
      if (localObject != null)
      {
        int n = localObject.length;
        int i1 = 0;
        f2 = f1;
        while (i1 < n)
        {
          f2 = localObject[i1].getSizeChange();
          i1++;
        }
      }
      localObject = localEditable.subSequence(m, i).toString();
      float[] arrayOfFloat = new float[((String)localObject).length()];
      paramEditText.getTextWidths((String)localObject, arrayOfFloat);
      f1 = 0.0F;
      for (i = 0; ; i++)
      {
        if (i >= ((String)localObject).length())
          break label378;
        f1 += arrayOfFloat[i] * f2;
        if ((i == ((String)localObject).length() - 1) && (paramFloat1 >= f1))
        {
          j = ((String)localObject).length() + m;
          AppMethodBeat.o(123847);
          break;
        }
        if ((f1 >= paramFloat1) || (i == ((String)localObject).length() - 1))
        {
          j = m + i;
          AppMethodBeat.o(123847);
          break;
        }
      }
      label378: j++;
      i = k;
      break label86;
      j = -1;
      AppMethodBeat.o(123847);
      break;
    }
  }

  static void c(EditText paramEditText)
  {
    AppMethodBeat.i(123845);
    if (paramEditText == null)
      AppMethodBeat.o(123845);
    while (true)
    {
      return;
      aj.cS(paramEditText).hideSoftInputFromInputMethod(paramEditText.getWindowToken(), 2);
      AppMethodBeat.o(123845);
    }
  }

  static void setNoSystemInputOnEditText(EditText paramEditText)
  {
    AppMethodBeat.i(123846);
    if (paramEditText == null)
      AppMethodBeat.o(123846);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramEditText.setShowSoftInputOnFocus(false);
        AppMethodBeat.o(123846);
      }
      else
      {
        try
        {
          Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
          localMethod1.setAccessible(true);
          localMethod1.invoke(paramEditText, new Object[] { Boolean.FALSE });
          localMethod1.setAccessible(false);
          AppMethodBeat.o(123846);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          ab.i("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, setShowSoftInputOnFocus no such method, api level = %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
          try
          {
            Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
            localMethod2.setAccessible(true);
            localMethod2.invoke(paramEditText, new Object[] { Boolean.FALSE });
            localMethod2.setAccessible(false);
            AppMethodBeat.o(123846);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setSoftInputShownOnFocus], exp = %s", new Object[] { bo.l(localException) });
            if ((paramEditText.getContext() != null) && ((paramEditText.getContext() instanceof ad)))
              ((ad)paramEditText.getContext()).hideVKB(paramEditText);
            AppMethodBeat.o(123846);
          }
        }
        catch (Exception paramEditText)
        {
          ab.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setShowSoftInputOnFocus], exp = %s", new Object[] { bo.l(paramEditText) });
          AppMethodBeat.o(123846);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.aj.a
 * JD-Core Version:    0.6.2
 */