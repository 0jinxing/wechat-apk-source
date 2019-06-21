package com.tencent.mm.pluginsdk.ui.e;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
  implements GetChars, Spannable, CharSequence
{
  private SpannableString vrZ;

  public k()
  {
    AppMethodBeat.i(79850);
    this.vrZ = null;
    this.vrZ = new SpannableString("");
    AppMethodBeat.o(79850);
  }

  public k(SpannableString paramSpannableString)
  {
    this.vrZ = null;
    this.vrZ = paramSpannableString;
  }

  public k(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79851);
    this.vrZ = null;
    this.vrZ = new SpannableString(paramCharSequence);
    AppMethodBeat.o(79851);
  }

  public k(String paramString)
  {
    AppMethodBeat.i(79852);
    this.vrZ = null;
    this.vrZ = new SpannableString(paramString);
    AppMethodBeat.o(79852);
  }

  private void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79856);
    if ((paramInt1 >= 0) && (paramInt2 <= this.vrZ.length()))
      this.vrZ.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(79856);
  }

  public final void a(Object paramObject, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(138585);
    a(paramObject, paramCharSequence, 0);
    AppMethodBeat.o(138585);
  }

  public final void a(Object paramObject, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79853);
    a(paramObject, paramInt, paramCharSequence.length() + paramInt, 33);
    AppMethodBeat.o(79853);
  }

  public final char charAt(int paramInt)
  {
    AppMethodBeat.i(79863);
    char c = this.vrZ.charAt(paramInt);
    AppMethodBeat.o(79863);
    return c;
  }

  public final void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    AppMethodBeat.i(79866);
    this.vrZ.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
    AppMethodBeat.o(79866);
  }

  public final int getSpanEnd(Object paramObject)
  {
    AppMethodBeat.i(79859);
    int i = this.vrZ.getSpanEnd(paramObject);
    AppMethodBeat.o(79859);
    return i;
  }

  public final int getSpanFlags(Object paramObject)
  {
    AppMethodBeat.i(79860);
    int i = this.vrZ.getSpanFlags(paramObject);
    AppMethodBeat.o(79860);
    return i;
  }

  public final int getSpanStart(Object paramObject)
  {
    AppMethodBeat.i(79858);
    int i = this.vrZ.getSpanStart(paramObject);
    AppMethodBeat.o(79858);
    return i;
  }

  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    AppMethodBeat.i(79857);
    paramClass = this.vrZ.getSpans(paramInt1, paramInt2, paramClass);
    AppMethodBeat.o(79857);
    return paramClass;
  }

  public final int length()
  {
    AppMethodBeat.i(79862);
    int i = this.vrZ.length();
    AppMethodBeat.o(79862);
    return i;
  }

  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    AppMethodBeat.i(79861);
    paramInt1 = this.vrZ.nextSpanTransition(paramInt1, paramInt2, paramClass);
    AppMethodBeat.o(79861);
    return paramInt1;
  }

  public final void removeSpan(Object paramObject)
  {
    AppMethodBeat.i(79865);
    this.vrZ.removeSpan(paramObject);
    AppMethodBeat.o(79865);
  }

  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79855);
    a(paramObject, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(79855);
  }

  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79864);
    CharSequence localCharSequence = this.vrZ.subSequence(paramInt1, paramInt2);
    AppMethodBeat.o(79864);
    return localCharSequence;
  }

  public final String toString()
  {
    AppMethodBeat.i(79867);
    String str = this.vrZ.toString();
    AppMethodBeat.o(79867);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.k
 * JD-Core Version:    0.6.2
 */