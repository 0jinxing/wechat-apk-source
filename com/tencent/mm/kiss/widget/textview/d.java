package com.tencent.mm.kiss.widget.textview;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.InputFilter.LengthFilter;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.MetricAffectingSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  private static e eNv;
  private static final SpannableString eNw;
  int eNA = 0;
  TextPaint eNB = null;
  Layout.Alignment eNC = Layout.Alignment.ALIGN_NORMAL;
  TextUtils.TruncateAt eND = null;
  int eNE = -1;
  TextDirectionHeuristic eNF = null;
  float eNG = 0.0F;
  float eNH = 1.0F;
  boolean eNI = false;
  InputFilter.LengthFilter eNJ = null;
  CharSequence eNx = null;
  CharSequence eNy = null;
  int eNz = 0;
  int gravity = 51;
  int maxLength = -1;
  int maxLines = 2147483647;
  int width = 0;

  static
  {
    AppMethodBeat.i(105713);
    eNv = new e();
    eNw = new SpannableString("");
    AppMethodBeat.o(105713);
  }

  private StaticLayout a(CharSequence paramCharSequence, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(105712);
    if (paramBoolean)
      paramCharSequence = new StaticLayout(paramCharSequence, this.eNz, this.eNA, this.eNB, this.width, this.eNC, this.eNH, this.eNG, this.eNI, this.eND, paramInt);
    while (true)
    {
      AppMethodBeat.o(105712);
      return paramCharSequence;
      if (Build.VERSION.SDK_INT >= 18)
      {
        if (this.eNF == null)
          this.eNF = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        paramCharSequence = com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.eNz, this.eNA, this.eNB, this.width, this.eNC, this.eNF, this.eNH, this.eNG, this.eNI, this.eND, paramInt, this.maxLines);
      }
      else
      {
        paramCharSequence = com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.eNz, this.eNA, this.eNB, this.width, this.eNC, this.eNH, this.eNG, this.eNI, this.eND, paramInt, this.maxLines);
      }
    }
  }

  public static d a(CharSequence paramCharSequence, int paramInt, com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(105709);
    Object localObject1 = paramCharSequence;
    if (paramCharSequence == null)
      localObject1 = "";
    int i = ((CharSequence)localObject1).length();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = "";
    localObject1 = eNv.SP();
    paramCharSequence = (CharSequence)localObject1;
    if (localObject1 == null)
      paramCharSequence = new d();
    paramCharSequence.eNx = ((CharSequence)localObject2).toString();
    paramCharSequence.eNy = ((CharSequence)localObject2);
    paramCharSequence.eNz = 0;
    paramCharSequence.eNA = i;
    paramCharSequence.width = paramInt;
    paramCharSequence.eNB = new TextPaint();
    if (parama.maxLines != -1)
    {
      paramInt = parama.maxLines;
      if (paramInt >= 0)
        paramCharSequence.maxLines = paramInt;
    }
    if (parama.maxLength != -1)
    {
      paramInt = parama.maxLength;
      if (paramInt >= 0)
      {
        paramCharSequence.maxLength = paramInt;
        paramCharSequence.eNJ = new InputFilter.LengthFilter(paramCharSequence.maxLength);
      }
    }
    localObject1 = parama.eNC;
    if (localObject1 != null)
      paramCharSequence.eNC = ((Layout.Alignment)localObject1);
    if (parama.eND != null)
    {
      localObject1 = parama.eND;
      if (localObject1 != null)
        paramCharSequence.eND = ((TextUtils.TruncateAt)localObject1);
    }
    paramCharSequence.gravity = parama.gravity;
    if (parama.eOf != -1)
    {
      paramInt = parama.eOf;
      if (paramInt >= 0)
        paramCharSequence.eNE = paramInt;
    }
    if (parama.eNF != null)
    {
      localObject1 = parama.eNF;
      if (Build.VERSION.SDK_INT >= 18)
        paramCharSequence.eNF = ((TextDirectionHeuristic)localObject1);
    }
    float f1 = parama.eNG;
    float f2 = parama.eNH;
    paramCharSequence.eNG = f1;
    paramCharSequence.eNH = f2;
    paramCharSequence.eNI = parama.eNI;
    if (parama.bTq != null)
    {
      if (parama.fontStyle == -1)
        break label547;
      localObject1 = parama.bTq;
      i = parama.fontStyle;
      if (i <= 0)
        break label521;
      if (localObject1 != null)
        break label498;
      localObject1 = Typeface.defaultFromStyle(i);
      paramCharSequence.c((Typeface)localObject1);
      if (localObject1 == null)
        break label510;
      paramInt = ((Typeface)localObject1).getStyle();
      label359: paramInt = (paramInt ^ 0xFFFFFFFF) & i;
      localObject1 = paramCharSequence.eNB;
      if ((paramInt & 0x1) != 0)
        bool = true;
      ((TextPaint)localObject1).setFakeBoldText(bool);
      localObject1 = paramCharSequence.eNB;
      if ((paramInt & 0x2) == 0)
        break label515;
      f2 = -0.25F;
      label402: ((TextPaint)localObject1).setTextSkewX(f2);
    }
    while (true)
    {
      if (parama.eOg != -1.0F)
      {
        f2 = parama.eOg;
        paramCharSequence.eNB.setTextSize(f2);
      }
      if (parama.textColor != -1)
      {
        paramInt = parama.textColor;
        paramCharSequence.eNB.setColor(paramInt);
      }
      if (parama.linkColor != -1)
      {
        paramInt = parama.linkColor;
        paramCharSequence.eNB.linkColor = paramInt;
      }
      if (parama.eNN != null)
        paramCharSequence.eNB = parama.eNN;
      AppMethodBeat.o(105709);
      return paramCharSequence;
      label498: localObject1 = Typeface.create((Typeface)localObject1, i);
      break;
      label510: paramInt = 0;
      break label359;
      label515: f2 = 0.0F;
      break label402;
      label521: paramCharSequence.eNB.setFakeBoldText(false);
      paramCharSequence.eNB.setTextSkewX(0.0F);
      paramCharSequence.c((Typeface)localObject1);
      continue;
      label547: paramCharSequence.c(parama.bTq);
    }
  }

  private d c(Typeface paramTypeface)
  {
    AppMethodBeat.i(105710);
    this.eNB.setTypeface(paramTypeface);
    AppMethodBeat.o(105710);
    return this;
  }

  @TargetApi(18)
  public final f SO()
  {
    AppMethodBeat.i(105711);
    int i;
    Object localObject1;
    if ((this.eND == null) || (this.eNE <= 0))
    {
      i = this.width;
      if ((this.eND == null) && (this.maxLines == 1))
        this.eND = TextUtils.TruncateAt.END;
      if ((this.maxLength > 0) && (this.eNJ != null))
      {
        localObject1 = this.eNJ.filter(this.eNy, 0, this.eNy.length(), eNw, 0, 0);
        if (localObject1 != null)
        {
          this.eNy = ((CharSequence)localObject1);
          if (this.eNA > this.eNy.length())
            this.eNA = this.eNy.length();
        }
      }
      if (h.DEBUG)
        ab.i("StaticTextView.StaticLayoutBuilder", "StaticLayoutWrapper build " + this.eNy + " " + this.width);
      if (this.eNC == Layout.Alignment.ALIGN_NORMAL);
      switch (this.gravity & 0x800007)
      {
      default:
        this.eNC = Layout.Alignment.ALIGN_NORMAL;
        label243: this.eNB.setAntiAlias(true);
        localObject1 = null;
        if (((this.eNF != null) && ((!com.tencent.mm.compatible.util.d.iW(18)) || (this.eNF != TextDirectionHeuristics.FIRSTSTRONG_LTR))) || ((this.maxLines != 2147483647) && (this.maxLines != -1)))
          break;
      case 3:
      case 8388611:
      case 5:
      case 8388613:
      case 1:
      }
    }
    for (boolean bool = true; ; bool = false)
      try
      {
        Object localObject3 = a(this.eNy, bool, i);
        localObject1 = localObject3;
        localObject3 = localObject1;
        if (localObject1 == null)
        {
          this.eNy = this.eNy.toString();
          localObject3 = a(this.eNy, bool, i);
        }
        localObject1 = new f((StaticLayout)localObject3);
        ((f)localObject1).eNM = this.eNx;
        ((f)localObject1).text = this.eNy;
        ((f)localObject1).maxLength = this.maxLength;
        ((f)localObject1).maxLines = this.maxLines;
        ((f)localObject1).eNC = this.eNC;
        ((f)localObject1).eND = this.eND;
        ((f)localObject1).eNN = this.eNB;
        ((f)localObject1).gravity = this.gravity;
        eNv.a(this);
        AppMethodBeat.o(105711);
        return localObject1;
        i = this.eNE;
        break;
        this.eNC = Layout.Alignment.ALIGN_NORMAL;
        break label243;
        this.eNC = Layout.Alignment.ALIGN_OPPOSITE;
        break label243;
        this.eNC = Layout.Alignment.ALIGN_CENTER;
      }
      catch (Exception localException2)
      {
        label710: 
        while (true)
        {
          ab.i("StaticTextView.StaticLayoutBuilder", "build static layout error: %s", new Object[] { localException2.getMessage() });
          int j = 0;
          while (true)
            while (true)
            {
              if (j >= 3)
                break label710;
              int k = j;
              Object localObject4 = localObject1;
              try
              {
                SpannableStringBuilder localSpannableStringBuilder = new android/text/SpannableStringBuilder;
                k = j;
                localObject4 = localObject1;
                localSpannableStringBuilder.<init>(this.eNy);
                k = j;
                localObject4 = localObject1;
                MetricAffectingSpan[] arrayOfMetricAffectingSpan = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
                if (arrayOfMetricAffectingSpan != null)
                {
                  k = j;
                  localObject4 = localObject1;
                  if (arrayOfMetricAffectingSpan.length > 0)
                  {
                    k = j;
                    localObject4 = localObject1;
                    localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(arrayOfMetricAffectingSpan[0]) - 1, " ");
                    j++;
                  }
                }
                while (true)
                {
                  k = j;
                  localObject4 = localObject1;
                  this.eNy = localSpannableStringBuilder;
                  k = j;
                  localObject4 = localObject1;
                  localObject1 = a(this.eNy, bool, i);
                  k = j;
                  localObject4 = localObject1;
                  ab.i("StaticTextView.StaticLayoutBuilder", "fix from build static layout, fixCount: %s", new Object[] { Integer.valueOf(j) });
                  break;
                  j = 100;
                }
              }
              catch (Exception localException1)
              {
                ab.i("StaticTextView.StaticLayoutBuilder", "fix, build static layout error: %s, fixCount: %s", new Object[] { localException1.getMessage(), Integer.valueOf(k) });
                j = k;
                Object localObject2 = localObject4;
              }
            }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.d
 * JD-Core Version:    0.6.2
 */