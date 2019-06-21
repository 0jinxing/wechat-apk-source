package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class o<V, C extends g<V>> extends t<V, C>
{
  private static boolean a(Spannable paramSpannable, e parame, Object paramObject, s params)
  {
    boolean bool1 = false;
    int i = paramSpannable.getSpanStart(paramObject);
    int j = paramSpannable.getSpanEnd(paramObject);
    int k = parame.aqm;
    int m = parame.Ls;
    int n = Math.max(i, k);
    int i1 = Math.min(j, m);
    boolean bool2;
    if (n > i1)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (n < i1)
      {
        bool2 = true;
      }
      else if (((i > k) && (j < m)) || ((k > i) && (m < j)))
      {
        bool2 = true;
      }
      else if (params == s.uSw)
      {
        bool2 = bool1;
        if (i == k)
        {
          bool2 = bool1;
          if (j == m)
          {
            bool2 = bool1;
            if (k == m)
              bool2 = true;
          }
        }
      }
      else
      {
        i = paramSpannable.getSpanFlags(paramObject) & 0x33;
        if (j == k)
          bool2 = f(i, new int[] { 34, 18 });
        else
          bool2 = f(i, new int[] { 17, 18 });
      }
    }
  }

  protected final ArrayList<Object> a(Spannable paramSpannable, e parame, s params)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments();
    if (localObject1 == null);
    for (paramSpannable = null; ; paramSpannable = localArrayList)
    {
      return paramSpannable;
      localObject1 = (Class)localObject1[(localObject1.length - 1)];
      for (Object localObject2 : paramSpannable.getSpans(parame.aqm, parame.Ls, (Class)localObject1))
        if (a(paramSpannable, parame, localObject2, params))
          localArrayList.add(localObject2);
    }
  }

  protected final void a(Spannable paramSpannable, n paramn, p paramp)
  {
    paramp.a(a(paramSpannable, paramn, s.uSw), paramn);
  }

  public abstract void a(WXRTEditText paramWXRTEditText, e parame, V paramV);

  public final void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    e locale = paramWXRTEditText.getParagraphsInSelection();
    if ((paramWXRTEditText.uQb) && (paramWXRTEditText.getSelection().aqm == locale.aqm) && (locale.aqm > 1))
    {
      Object localObject1 = a(paramWXRTEditText.getText(), locale, s.uSx);
      if ((!((ArrayList)localObject1).isEmpty()) && (paramWXRTEditText.getLayout().getPrimaryHorizontal(paramWXRTEditText.getSelection().aqm) == b.del()))
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          paramWXRTEditText.getText().removeSpan(localObject2);
        }
        paramWXRTEditText.getText().insert(locale.aqm - 1, "\n");
      }
    }
    a(paramWXRTEditText, locale, paramV);
    u.a(paramWXRTEditText, new t[] { this });
  }

  protected final e r(WXRTEditText paramWXRTEditText)
  {
    return paramWXRTEditText.getParagraphsInSelection();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.o
 * JD-Core Version:    0.6.2
 */