package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;

public abstract class t<V, C extends g<V>>
{
  protected static boolean f(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      if (i < 2)
      {
        int j = paramArrayOfInt[i];
        if ((paramInt & j) == j)
          bool2 = true;
      }
      else
      {
        return bool2;
      }
    }
  }

  protected abstract ArrayList<Object> a(Spannable paramSpannable, e parame, s params);

  public abstract void a(WXRTEditText paramWXRTEditText, V paramV);

  public abstract int dfy();

  protected abstract e r(WXRTEditText paramWXRTEditText);

  public final boolean s(WXRTEditText paramWXRTEditText)
  {
    e locale = r(paramWXRTEditText);
    if (!a(paramWXRTEditText.getText(), locale, s.uSx).isEmpty());
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.t
 * JD-Core Version:    0.6.2
 */