package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Editable;
import android.text.Spannable;
import android.text.style.CharacterStyle;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class e<V, C extends g<V>> extends t<V, C>
{
  private static boolean a(Spannable paramSpannable, com.tencent.mm.plugin.wenote.model.nativenote.manager.e parame, Object paramObject, s params)
  {
    boolean bool = false;
    int i = paramSpannable.getSpanStart(paramObject);
    int j = paramSpannable.getSpanEnd(paramObject);
    int k = parame.aqm;
    int m = parame.Ls;
    int n = Math.max(i, k);
    int i1 = Math.min(j, m);
    if (n > i1);
    while (true)
    {
      return bool;
      if (n < i1)
      {
        bool = true;
      }
      else if (((i > k) && (j < m)) || ((k > i) && (m < j)))
      {
        bool = true;
      }
      else if (params != s.uSw)
      {
        i1 = paramSpannable.getSpanFlags(paramObject) & 0x33;
        if (j == k)
          bool = f(i1, new int[] { 34, 18 });
        else
          bool = f(i1, new int[] { 17, 18 });
      }
    }
  }

  protected final ArrayList<Object> a(Spannable paramSpannable, com.tencent.mm.plugin.wenote.model.nativenote.manager.e parame, s params)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    Object[] arrayOfObject = paramSpannable.getSpans(Math.max(0, parame.aqm - 1), Math.min(paramSpannable.length(), parame.Ls + 1), CharacterStyle.class);
    int j = arrayOfObject.length;
    while (i < j)
    {
      Object localObject = arrayOfObject[i];
      if ((cs(localObject)) && (a(paramSpannable, parame, localObject, params)))
        localArrayList.add(localObject);
      i++;
    }
    return localArrayList;
  }

  public void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    com.tencent.mm.plugin.wenote.model.nativenote.manager.e locale = r(paramWXRTEditText);
    int i;
    Editable localEditable;
    int j;
    label42: int k;
    if (locale.isEmpty())
    {
      i = 18;
      localEditable = paramWXRTEditText.getText();
      Iterator localIterator = a(localEditable, locale, s.uSx).iterator();
      j = i;
      if (!localIterator.hasNext())
        break label232;
      paramWXRTEditText = localIterator.next();
      boolean bool = dfA().equals(paramV);
      k = localEditable.getSpanStart(paramWXRTEditText);
      i = j;
      if (k < locale.aqm)
      {
        if (!bool)
          break label174;
        locale.gH(locale.aqm - k, 0);
        i = 34;
      }
      label115: j = localEditable.getSpanEnd(paramWXRTEditText);
      if (j > locale.Ls)
      {
        if (!bool)
          break label205;
        locale.gH(0, j - locale.Ls);
      }
    }
    while (true)
    {
      localEditable.removeSpan(paramWXRTEditText);
      j = i;
      break label42;
      i = 34;
      break;
      label174: dfA();
      localEditable.setSpan(dfz(), k, locale.aqm, 33);
      i = j;
      break label115;
      label205: dfA();
      localEditable.setSpan(dfz(), locale.Ls, j, 34);
    }
    label232: if (paramV != null)
      localEditable.setSpan(dfz(), locale.aqm, locale.Ls, j);
  }

  public abstract boolean cs(Object paramObject);

  protected abstract V dfA();

  protected abstract g<V> dfz();

  protected final com.tencent.mm.plugin.wenote.model.nativenote.manager.e r(WXRTEditText paramWXRTEditText)
  {
    return new com.tencent.mm.plugin.wenote.model.nativenote.manager.e(paramWXRTEditText);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.e
 * JD-Core Version:    0.6.2
 */