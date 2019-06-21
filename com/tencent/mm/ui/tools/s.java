package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s
{
  String mText;
  List<b> zIb;
  WeakReference<EditText> zIc;
  ArrayList<String> zId;
  boolean zIe;

  public s(EditText paramEditText)
  {
    AppMethodBeat.i(107819);
    this.zIc = new WeakReference(paramEditText);
    AppMethodBeat.o(107819);
  }

  private static SpannableString a(Context paramContext, String paramString, Paint paramPaint)
  {
    AppMethodBeat.i(107822);
    SpannableString localSpannableString = new SpannableString(paramString);
    localSpannableString.setSpan(new ImageSpan(new a(paramContext, paramString, paramPaint), 0), 0, paramString.length(), 33);
    AppMethodBeat.o(107822);
    return localSpannableString;
  }

  static boolean a(EditText paramEditText, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(107821);
    String str = paramEditText.getText().toString();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    Object localObject = m(str, paramArrayList);
    boolean bool;
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      int i = paramEditText.getSelectionStart();
      int j = paramEditText.getSelectionEnd();
      Context localContext = paramEditText.getContext();
      paramArrayList = paramEditText.getPaint();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        b localb = (b)((Iterator)localObject).next();
        int k = localb.start;
        int m = localb.length;
        if ((k < 0) || (m <= 0) || (k + m > str.length()))
          ab.i("MicroMsg.WordsChecker", "start : %d, length : %d.", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
        else if (localb.zIh)
          localSpannableStringBuilder.append(a(localContext, str.substring(k, k + m), paramArrayList));
        else
          localSpannableStringBuilder.append(str.substring(k, k + m));
      }
      if (localSpannableStringBuilder.length() > 0)
      {
        paramEditText.setText(localSpannableStringBuilder);
        paramEditText.setTextKeepState(localSpannableStringBuilder);
        if ((i == j) && (i >= 0))
          paramEditText.setSelection(i);
      }
      bool = true;
      AppMethodBeat.o(107821);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107821);
    }
  }

  static List<b> m(String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(107823);
    if ((bo.isNullOrNil(paramString)) || (paramArrayList == null) || (paramArrayList.size() == 0))
    {
      paramString = null;
      AppMethodBeat.o(107823);
      return paramString;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramString.length();
    int j = 0;
    label48: int k;
    int m;
    if (j <= i)
    {
      Iterator localIterator = paramArrayList.iterator();
      k = 0;
      m = i;
      label66: 
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!bo.isNullOrNil(str))
        {
          int n = paramString.indexOf(str, j);
          if ((n < 0) || ((n >= m) && ((n != m) || (str.length() <= k))))
            break label252;
          k = str.length();
          m = n;
        }
      }
    }
    label252: 
    while (true)
    {
      break label66;
      if (m < i)
      {
        if (m > j)
          localArrayList.add(new b(j, m - j, false));
        localArrayList.add(new b(m, k, true));
        j = m + k;
        break label48;
      }
      if (m > j)
        localArrayList.add(new b(j, m - j, false));
      AppMethodBeat.o(107823);
      paramString = localArrayList;
      break;
    }
  }

  final b PK(int paramInt)
  {
    AppMethodBeat.i(107820);
    b localb;
    if (this.zIb != null)
    {
      Iterator localIterator = this.zIb.iterator();
      while (localIterator.hasNext())
      {
        localb = (b)localIterator.next();
        if ((paramInt <= localb.start + localb.length) && (paramInt > localb.start))
          AppMethodBeat.o(107820);
      }
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(107820);
    }
  }

  public static final class a extends Drawable
  {
    private static int zAq;
    private Paint eGZ;
    private String mText;
    private RectF nI;
    private Paint zAp;
    private float zAr;
    private float zAs;
    private float zIf;
    private float zIg;

    public a(Context paramContext, String paramString, Paint paramPaint)
    {
      AppMethodBeat.i(107813);
      this.eGZ = new Paint(1);
      this.eGZ.setColor(-7829368);
      this.zAp = paramPaint;
      zAq = BackwardSupportUtil.b.b(paramContext, 2.0F);
      this.zIf = zAq;
      this.zIg = zAq;
      this.mText = paramString;
      this.zAr = this.zAp.measureText(this.mText);
      paramContext = this.zAp.getFontMetrics();
      this.zAs = ((float)Math.ceil(paramContext.bottom - paramContext.top));
      setBounds(0, 0, (int)(this.zAr + zAq * 2 + zAq * 2), (int)this.zAs);
      ab.i("MicroMsg.TextDrawable", "setText(%s).", new Object[] { paramString });
      AppMethodBeat.o(107813);
    }

    public final void draw(Canvas paramCanvas)
    {
      AppMethodBeat.i(107814);
      paramCanvas.drawRoundRect(this.nI, this.zIf, this.zIg, this.eGZ);
      Rect localRect = getBounds();
      int i = (int)((localRect.right - localRect.left - (this.nI.right - this.nI.left) + zAq * 2) / 2.0F);
      Paint.FontMetricsInt localFontMetricsInt = this.zAp.getFontMetricsInt();
      int j = localRect.top;
      int k = (localRect.bottom - localRect.top - localFontMetricsInt.bottom + localFontMetricsInt.top) / 2;
      int m = localFontMetricsInt.top;
      paramCanvas.drawText(this.mText, i, k + j - m, this.zAp);
      AppMethodBeat.o(107814);
    }

    public final int getOpacity()
    {
      AppMethodBeat.i(107817);
      int i;
      if (this.eGZ.getAlpha() < 255)
      {
        i = -3;
        AppMethodBeat.o(107817);
      }
      while (true)
      {
        return i;
        i = -1;
        AppMethodBeat.o(107817);
      }
    }

    public final void setAlpha(int paramInt)
    {
      AppMethodBeat.i(107815);
      if (paramInt != this.eGZ.getAlpha())
      {
        this.eGZ.setAlpha(paramInt);
        invalidateSelf();
      }
      AppMethodBeat.o(107815);
    }

    public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(107818);
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      Paint.FontMetrics localFontMetrics = this.zAp.getFontMetrics();
      float f1 = zAq + paramInt1;
      float f2 = paramInt2;
      this.nI = new RectF(f1, localFontMetrics.ascent - localFontMetrics.top + f2, paramInt3 - zAq, paramInt4);
      invalidateSelf();
      AppMethodBeat.o(107818);
    }

    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      AppMethodBeat.i(107816);
      this.eGZ.setColorFilter(paramColorFilter);
      invalidateSelf();
      AppMethodBeat.o(107816);
    }
  }

  static final class b
  {
    int length;
    int start;
    boolean zIh;

    b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.start = paramInt1;
      this.length = paramInt2;
      this.zIh = paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.s
 * JD-Core Version:    0.6.2
 */