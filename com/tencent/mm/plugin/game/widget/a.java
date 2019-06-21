package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  private boolean OH;
  private TextWatcher arx;
  private ArrayList<b> mListeners;
  private TextPaint mPaint;
  private float nnX;
  private int nnY;
  float nnZ;
  float noa;
  float nob;
  boolean noc;
  TextView sW;

  private a(TextView paramTextView)
  {
    AppMethodBeat.i(112375);
    this.arx = new a.a(this, (byte)0);
    float f = paramTextView.getContext().getResources().getDisplayMetrics().scaledDensity;
    this.sW = paramTextView;
    this.mPaint = new TextPaint();
    setRawTextSize(paramTextView.getTextSize());
    int i = -1;
    TransformationMethod localTransformationMethod = paramTextView.getTransformationMethod();
    if ((localTransformationMethod != null) && ((localTransformationMethod instanceof SingleLineTransformationMethod)))
      i = 1;
    while (true)
    {
      this.nnY = i;
      this.nnZ = (8.0F * f);
      this.noa = this.nnX;
      this.nob = 0.5F;
      AppMethodBeat.o(112375);
      return;
      if (Build.VERSION.SDK_INT >= 16)
        i = paramTextView.getMaxLines();
    }
  }

  private static float a(CharSequence paramCharSequence, TextPaint paramTextPaint, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4, DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(112374);
    float f1 = paramFloat3;
    paramFloat3 = paramFloat2;
    paramFloat2 = (paramFloat3 + f1) / 2.0F;
    paramTextPaint.setTextSize(TypedValue.applyDimension(0, paramFloat2, paramDisplayMetrics));
    StaticLayout localStaticLayout;
    if (paramInt != 1)
      localStaticLayout = new StaticLayout(paramCharSequence, paramTextPaint, (int)paramFloat1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    for (int i = localStaticLayout.getLineCount(); ; i = 1)
    {
      if (i > paramInt)
        if (f1 - paramFloat3 < paramFloat4)
          AppMethodBeat.o(112374);
      while (true)
      {
        return paramFloat3;
        f1 = paramFloat2;
        break;
        if (i < paramInt)
        {
          paramFloat3 = paramFloat2;
          break;
        }
        float f2 = 0.0F;
        float f3;
        if (paramInt == 1)
        {
          f3 = paramTextPaint.measureText(paramCharSequence, 0, paramCharSequence.length());
          if (f1 - paramFloat3 < paramFloat4)
            AppMethodBeat.o(112374);
        }
        else
        {
          int j = 0;
          while (true)
          {
            f3 = f2;
            if (j >= i)
              break;
            f3 = f2;
            if (localStaticLayout.getLineWidth(j) > f2)
              f3 = localStaticLayout.getLineWidth(j);
            j++;
            f2 = f3;
          }
          if (f3 > paramFloat1)
          {
            f1 = paramFloat2;
            break;
          }
          if (f3 < paramFloat1)
          {
            paramFloat3 = paramFloat2;
            break;
          }
          AppMethodBeat.o(112374);
          paramFloat3 = paramFloat2;
        }
      }
      localStaticLayout = null;
    }
  }

  public static a a(TextView paramTextView, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(112372);
    paramTextView = new a(paramTextView);
    if (paramAttributeSet != null)
    {
      int i = (int)paramTextView.nnZ;
      float f = paramTextView.nob;
      paramTextView.n(0, i).aD(f);
    }
    paramTextView.hV(true);
    AppMethodBeat.o(112372);
    return paramTextView;
  }

  private static void a(TextView paramTextView, TextPaint paramTextPaint, float paramFloat1, float paramFloat2, int paramInt, float paramFloat3)
  {
    AppMethodBeat.i(112373);
    if ((paramInt <= 0) || (paramInt == 2147483647))
      AppMethodBeat.o(112373);
    int i;
    while (true)
    {
      return;
      i = paramTextView.getWidth() - paramTextView.getPaddingLeft() - paramTextView.getPaddingRight();
      if (i > 0)
        break;
      AppMethodBeat.o(112373);
    }
    Object localObject1 = paramTextView.getText();
    Object localObject2 = paramTextView.getTransformationMethod();
    Object localObject3 = localObject1;
    if (localObject2 != null)
      localObject3 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, paramTextView);
    localObject2 = paramTextView.getContext();
    localObject1 = Resources.getSystem();
    if (localObject2 != null)
      localObject1 = ((Context)localObject2).getResources();
    localObject1 = ((Resources)localObject1).getDisplayMetrics();
    paramTextPaint.set(paramTextView.getPaint());
    paramTextPaint.setTextSize(paramFloat2);
    if ((paramInt != 1) || (paramTextPaint.measureText((CharSequence)localObject3, 0, ((CharSequence)localObject3).length()) <= i))
    {
      float f = i;
      paramTextPaint.setTextSize(TypedValue.applyDimension(0, paramFloat2, (DisplayMetrics)localObject1));
      if (new StaticLayout((CharSequence)localObject3, paramTextPaint, (int)f, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true).getLineCount() <= paramInt);
    }
    else
    {
      paramFloat2 = a((CharSequence)localObject3, paramTextPaint, i, paramInt, 0.0F, paramFloat2, paramFloat3, (DisplayMetrics)localObject1);
    }
    while (true)
    {
      if (paramFloat2 < paramFloat1);
      while (true)
      {
        paramTextView.setTextSize(0, paramFloat1);
        AppMethodBeat.o(112373);
        break;
        paramFloat1 = paramFloat2;
      }
    }
  }

  private void aE(float paramFloat)
  {
    AppMethodBeat.i(112379);
    if (paramFloat != this.nnZ)
    {
      this.nnZ = paramFloat;
      bFJ();
    }
    AppMethodBeat.o(112379);
  }

  private void bFK()
  {
    AppMethodBeat.i(112383);
    if (this.mListeners == null)
      AppMethodBeat.o(112383);
    while (true)
    {
      return;
      Iterator localIterator = this.mListeners.iterator();
      while (localIterator.hasNext())
        localIterator.next();
      AppMethodBeat.o(112383);
    }
  }

  public final a a(b paramb)
  {
    AppMethodBeat.i(112376);
    if (this.mListeners == null)
      this.mListeners = new ArrayList();
    this.mListeners.add(paramb);
    AppMethodBeat.o(112376);
    return this;
  }

  public final a aD(float paramFloat)
  {
    AppMethodBeat.i(112377);
    if (this.nob != paramFloat)
    {
      this.nob = paramFloat;
      bFJ();
    }
    AppMethodBeat.o(112377);
    return this;
  }

  public final void bFJ()
  {
    AppMethodBeat.i(112382);
    float f = this.sW.getTextSize();
    this.noc = true;
    a(this.sW, this.mPaint, this.nnZ, this.noa, this.nnY, this.nob);
    this.noc = false;
    if (this.sW.getTextSize() != f)
      bFK();
    AppMethodBeat.o(112382);
  }

  public final a hV(boolean paramBoolean)
  {
    AppMethodBeat.i(112381);
    if (this.OH != paramBoolean)
    {
      this.OH = paramBoolean;
      if (!paramBoolean)
        break label44;
      this.sW.addTextChangedListener(this.arx);
      bFJ();
    }
    while (true)
    {
      AppMethodBeat.o(112381);
      return this;
      label44: this.sW.removeTextChangedListener(this.arx);
      this.sW.setTextSize(0, this.nnX);
    }
  }

  public final a n(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(112378);
    Context localContext = this.sW.getContext();
    Resources localResources = Resources.getSystem();
    if (localContext != null)
      localResources = localContext.getResources();
    aE(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
    AppMethodBeat.o(112378);
    return this;
  }

  final void setRawTextSize(float paramFloat)
  {
    if (this.nnX != paramFloat)
      this.nnX = paramFloat;
  }

  public final a wP(int paramInt)
  {
    AppMethodBeat.i(112380);
    if (this.nnY != paramInt)
    {
      this.nnY = paramInt;
      bFJ();
    }
    AppMethodBeat.o(112380);
    return this;
  }

  public static abstract interface b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.a
 * JD-Core Version:    0.6.2
 */