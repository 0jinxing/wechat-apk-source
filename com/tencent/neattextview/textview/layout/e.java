package com.tencent.neattextview.textview.layout;

import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;

public final class e<E>
{
  private final Class<? extends E> AkO;
  public int AkP;
  public E[] AkQ;
  public int[] AkR;
  public int[] AkS;
  public int[] AkT;

  e(Class<? extends E> paramClass)
  {
    this.AkO = paramClass;
    this.AkP = 0;
  }

  public final void a(Spanned paramSpanned, int paramInt)
  {
    AppMethodBeat.i(3258);
    Object[] arrayOfObject = paramSpanned.getSpans(0, paramInt, this.AkO);
    int i = arrayOfObject.length;
    if ((i > 0) && ((this.AkQ == null) || (this.AkQ.length < i)))
    {
      this.AkQ = ((Object[])Array.newInstance(this.AkO, i));
      this.AkR = new int[i];
      this.AkS = new int[i];
      this.AkT = new int[i];
    }
    this.AkP = 0;
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      Object localObject = arrayOfObject[paramInt];
      int j = paramSpanned.getSpanStart(localObject);
      int k = paramSpanned.getSpanEnd(localObject);
      if (j != k)
      {
        int m = paramSpanned.getSpanFlags(localObject);
        this.AkQ[this.AkP] = localObject;
        this.AkR[this.AkP] = j;
        this.AkS[this.AkP] = k;
        this.AkT[this.AkP] = m;
        this.AkP += 1;
      }
    }
    AppMethodBeat.o(3258);
  }

  public final E hS(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < this.AkP)
      if ((this.AkR[i] >= paramInt2) || (this.AkS[i] <= paramInt1));
    for (Object localObject = this.AkQ[i]; ; localObject = null)
    {
      return localObject;
      i++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.layout.e
 * JD-Core Version:    0.6.2
 */