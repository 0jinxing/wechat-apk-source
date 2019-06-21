package com.tencent.mm.plugin.fts.a.a;

import android.graphics.Color;
import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class d
{
  public TextPaint eNN;
  public boolean mDA;
  public boolean mDC;
  public d.a mDD;
  public int mDE;
  public float mDF;
  public CharSequence mDG;
  public CharSequence mDH;
  public String mDI;
  public String mDJ;
  public CharSequence mDy;
  public g mDz;

  public d()
  {
    AppMethodBeat.i(114243);
    this.mDD = d.a.mDK;
    this.mDE = Color.parseColor("#07C160");
    this.mDG = "";
    this.mDH = "";
    this.mDI = "";
    this.mDJ = "";
    AppMethodBeat.o(114243);
  }

  public static final d a(CharSequence paramCharSequence, g paramg)
  {
    AppMethodBeat.i(114246);
    d locald = new d();
    locald.mDy = paramCharSequence;
    locald.mDz = paramg;
    AppMethodBeat.o(114246);
    return locald;
  }

  public static final d a(CharSequence paramCharSequence, g paramg, float paramFloat, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(114248);
    paramCharSequence = a(paramCharSequence, paramg, false, false, paramFloat, paramTextPaint);
    AppMethodBeat.o(114248);
    return paramCharSequence;
  }

  public static final d a(CharSequence paramCharSequence, g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(114247);
    paramCharSequence = a(paramCharSequence, paramg, paramBoolean1, paramBoolean2, 0.0F, null);
    AppMethodBeat.o(114247);
    return paramCharSequence;
  }

  public static final d a(CharSequence paramCharSequence, g paramg, boolean paramBoolean1, boolean paramBoolean2, float paramFloat, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(114249);
    d locald = new d();
    locald.mDy = paramCharSequence;
    locald.mDz = paramg;
    locald.mDA = paramBoolean1;
    locald.mDC = paramBoolean2;
    locald.mDF = paramFloat;
    locald.eNN = paramTextPaint;
    AppMethodBeat.o(114249);
    return locald;
  }

  public static final d a(CharSequence paramCharSequence1, g paramg, boolean paramBoolean1, boolean paramBoolean2, TextPaint paramTextPaint, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    AppMethodBeat.i(114250);
    d locald = new d();
    locald.mDy = paramCharSequence1;
    locald.mDz = paramg;
    locald.mDA = paramBoolean1;
    locald.mDC = paramBoolean2;
    locald.mDF = 400.0F;
    locald.eNN = paramTextPaint;
    locald.mDG = paramCharSequence2;
    locald.mDH = paramCharSequence3;
    AppMethodBeat.o(114250);
    return locald;
  }

  public static final d a(CharSequence paramCharSequence, List<String> paramList)
  {
    AppMethodBeat.i(114244);
    paramCharSequence = b(paramCharSequence, bo.c(paramList, " "));
    AppMethodBeat.o(114244);
    return paramCharSequence;
  }

  public static final d a(CharSequence paramCharSequence, List<String> paramList, d.a parama, int paramInt)
  {
    AppMethodBeat.i(114251);
    paramCharSequence = a(paramCharSequence, paramList);
    paramCharSequence.mDD = parama;
    paramCharSequence.mDE = paramInt;
    AppMethodBeat.o(114251);
    return paramCharSequence;
  }

  public static final d b(CharSequence paramCharSequence, String paramString)
  {
    AppMethodBeat.i(114245);
    d locald = new d();
    locald.mDy = paramCharSequence;
    locald.mDz = g.aO(paramString, false);
    locald.mDA = false;
    locald.mDC = false;
    AppMethodBeat.o(114245);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.d
 * JD-Core Version:    0.6.2
 */