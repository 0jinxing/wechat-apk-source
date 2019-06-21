package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;

public final class a extends SpannableString
{
  private int akU;
  private Object[] uOU;
  private int[] uOV;

  public a(CharSequence paramCharSequence)
  {
    super(paramCharSequence.toString());
    AppMethodBeat.i(26708);
    n(paramCharSequence, paramCharSequence.length());
    AppMethodBeat.o(26708);
  }

  private void n(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(26709);
    this.uOU = new Object[20];
    this.uOV = new int[60];
    if ((paramCharSequence instanceof Spanned))
    {
      paramCharSequence = (Spanned)paramCharSequence;
      for (Object localObject : paramCharSequence.getSpans(0, paramInt, Object.class))
        if (((localObject instanceof CharacterStyle)) || ((localObject instanceof ParagraphStyle)))
        {
          int k = paramCharSequence.getSpanStart(localObject);
          int m = paramCharSequence.getSpanEnd(localObject);
          int n = paramCharSequence.getSpanFlags(localObject);
          int i1 = k;
          if (k < 0)
            i1 = 0;
          k = m;
          if (m > paramInt)
            k = paramInt;
          setSpan(localObject, i1 + 0, k + 0, n);
        }
    }
    AppMethodBeat.o(26709);
  }

  public final int getSpanEnd(Object paramObject)
  {
    int i = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    i--;
    if (i >= 0)
      if (arrayOfObject[i] != paramObject);
    for (i = arrayOfInt[(i * 3 + 1)]; ; i = -1)
    {
      return i;
      i--;
      break;
    }
  }

  public final int getSpanFlags(Object paramObject)
  {
    int i = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    i--;
    if (i >= 0)
      if (arrayOfObject[i] != paramObject);
    for (i = arrayOfInt[(i * 3 + 2)]; ; i = 0)
    {
      return i;
      i--;
      break;
    }
  }

  public final int getSpanStart(Object paramObject)
  {
    int i = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    i--;
    if (i >= 0)
      if (arrayOfObject[i] != paramObject);
    for (i = arrayOfInt[(i * 3 + 0)]; ; i = -1)
    {
      return i;
      i--;
      break;
    }
  }

  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    AppMethodBeat.i(26712);
    int i = 0;
    int j = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    Object localObject1 = null;
    Object localObject2 = null;
    int k = 0;
    if (k < j)
    {
      Object localObject3;
      Object localObject4;
      int m;
      int i1;
      if (paramClass != null)
      {
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = i;
        if (!paramClass.isInstance(arrayOfObject[k]));
      }
      else
      {
        int n = arrayOfInt[(k * 3 + 0)];
        i1 = arrayOfInt[(k * 3 + 1)];
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = i;
        if (n <= paramInt2)
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          m = i;
          if (i1 >= paramInt1)
            if ((n != i1) && (paramInt1 != paramInt2))
            {
              localObject3 = localObject1;
              localObject4 = localObject2;
              m = i;
              if (n != paramInt2)
              {
                localObject3 = localObject1;
                localObject4 = localObject2;
                m = i;
                if (i1 == paramInt1);
              }
            }
            else
            {
              if (i != 0)
                break label217;
              localObject4 = arrayOfObject[k];
              m = i + 1;
              localObject3 = localObject1;
            }
        }
      }
      while (true)
      {
        k++;
        localObject1 = localObject3;
        localObject2 = localObject4;
        i = m;
        break;
        label217: if (i == 1)
        {
          localObject1 = (Object[])Array.newInstance(paramClass, j - k + 1);
          localObject1[0] = localObject2;
        }
        i1 = 0xFF0000 & arrayOfInt[(k * 3 + 2)];
        if (i1 != 0)
        {
          for (m = 0; (m < i) && (i1 <= (getSpanFlags(localObject1[m]) & 0xFF0000)); m++);
          System.arraycopy(localObject1, m, localObject1, m + 1, i - m);
          localObject1[m] = arrayOfObject[k];
          m = i + 1;
          localObject3 = localObject1;
          localObject4 = localObject2;
        }
        else
        {
          localObject1[i] = arrayOfObject[k];
          m = i + 1;
          localObject3 = localObject1;
          localObject4 = localObject2;
        }
      }
    }
    if (i == 0)
    {
      paramClass = (Object[])Array.newInstance(paramClass, 0);
      AppMethodBeat.o(26712);
    }
    while (true)
    {
      return paramClass;
      if (i == 1)
      {
        paramClass = (Object[])Array.newInstance(paramClass, 1);
        paramClass[0] = localObject2;
        paramClass = (Object[])paramClass;
        AppMethodBeat.o(26712);
      }
      else if (i == localObject1.length)
      {
        paramClass = (Object[])localObject1;
        AppMethodBeat.o(26712);
      }
      else
      {
        paramClass = (Object[])Array.newInstance(paramClass, i);
        System.arraycopy(localObject1, 0, paramClass, 0, i);
        paramClass = (Object[])paramClass;
        AppMethodBeat.o(26712);
      }
    }
  }

  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    AppMethodBeat.i(26713);
    int i = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    Object localObject = paramClass;
    if (paramClass == null)
      localObject = Object.class;
    int j = 0;
    int m;
    if (j < i)
    {
      int k = arrayOfInt[(j * 3 + 0)];
      m = arrayOfInt[(j * 3 + 1)];
      if ((k <= paramInt1) || (k >= paramInt2) || (!((Class)localObject).isInstance(arrayOfObject[j])))
        break label140;
      paramInt2 = k;
    }
    label140: 
    while (true)
    {
      if ((m > paramInt1) && (m < paramInt2) && (((Class)localObject).isInstance(arrayOfObject[j])))
        paramInt2 = m;
      while (true)
      {
        j++;
        break;
        AppMethodBeat.o(26713);
        return paramInt2;
      }
    }
  }

  public final void removeSpan(Object paramObject)
  {
    AppMethodBeat.i(26711);
    int i = this.akU;
    Object[] arrayOfObject = this.uOU;
    int[] arrayOfInt = this.uOV;
    int j = i - 1;
    if (j >= 0)
      if (arrayOfObject[j] == paramObject)
      {
        i -= j + 1;
        System.arraycopy(arrayOfObject, j + 1, arrayOfObject, j, i);
        System.arraycopy(arrayOfInt, (j + 1) * 3, arrayOfInt, j * 3, i * 3);
        this.akU -= 1;
        AppMethodBeat.o(26711);
      }
    while (true)
    {
      return;
      j--;
      break;
      AppMethodBeat.o(26711);
    }
  }

  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(26710);
    if (this.akU + 1 >= this.uOU.length)
    {
      int i = this.akU + 10;
      Object[] arrayOfObject = new Object[i];
      int[] arrayOfInt = new int[i * 3];
      System.arraycopy(this.uOU, 0, arrayOfObject, 0, this.akU);
      System.arraycopy(this.uOV, 0, arrayOfInt, 0, this.akU * 3);
      this.uOU = arrayOfObject;
      this.uOV = arrayOfInt;
    }
    this.uOU[this.akU] = paramObject;
    this.uOV[(this.akU * 3 + 0)] = paramInt1;
    this.uOV[(this.akU * 3 + 1)] = paramInt2;
    this.uOV[(this.akU * 3 + 2)] = paramInt3;
    this.akU += 1;
    AppMethodBeat.o(26710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.a
 * JD-Core Version:    0.6.2
 */