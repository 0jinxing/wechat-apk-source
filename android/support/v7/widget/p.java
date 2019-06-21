package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class p
{
  private static final RectF agA = new RectF();
  private static ConcurrentHashMap<String, Method> agB = new ConcurrentHashMap();
  int agC = 0;
  private boolean agD = false;
  float agE = -1.0F;
  float agF = -1.0F;
  float agG = -1.0F;
  int[] agH = new int[0];
  boolean agI = false;
  private TextPaint agJ;
  final Context mContext;
  private final TextView sW;

  p(TextView paramTextView)
  {
    this.sW = paramTextView;
    this.mContext = this.sW.getContext();
  }

  private static Method R(String paramString)
  {
    try
    {
      Method localMethod1 = (Method)agB.get(paramString);
      Method localMethod2 = localMethod1;
      if (localMethod1 == null)
      {
        localMethod1 = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        localMethod2 = localMethod1;
        if (localMethod1 != null)
        {
          localMethod1.setAccessible(true);
          agB.put(paramString, localMethod1);
          localMethod2 = localMethod1;
        }
      }
      return localMethod2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder("Failed to retrieve TextView#").append(paramString).append("() method");
        Object localObject = null;
      }
    }
  }

  private int a(RectF paramRectF)
  {
    int i = this.agH.length;
    if (i == 0)
      throw new IllegalStateException("No available text sizes to choose from.");
    int j = 1;
    int k = i - 1;
    i = 0;
    while (j <= k)
    {
      int m = (j + k) / 2;
      if (a(this.agH[m], paramRectF))
      {
        i = j;
        j = m + 1;
      }
      else
      {
        k = m - 1;
        i = k;
      }
    }
    return this.agH[i];
  }

  private StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt)
  {
    float f1;
    float f2;
    if (Build.VERSION.SDK_INT >= 16)
    {
      f1 = this.sW.getLineSpacingMultiplier();
      f2 = this.sW.getLineSpacingExtra();
    }
    for (boolean bool = this.sW.getIncludeFontPadding(); ; bool = ((Boolean)a(this.sW, "getIncludeFontPadding", Boolean.TRUE)).booleanValue())
    {
      return new StaticLayout(paramCharSequence, this.agJ, paramInt, paramAlignment, f1, f2, bool);
      f1 = ((Float)a(this.sW, "getLineSpacingMultiplier", Float.valueOf(1.0F))).floatValue();
      f2 = ((Float)a(this.sW, "getLineSpacingExtra", Float.valueOf(0.0F))).floatValue();
    }
  }

  private StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    TextDirectionHeuristic localTextDirectionHeuristic = (TextDirectionHeuristic)a(this.sW, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
    paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), this.agJ, paramInt1).setAlignment(paramAlignment).setLineSpacing(this.sW.getLineSpacingExtra(), this.sW.getLineSpacingMultiplier()).setIncludePad(this.sW.getIncludeFontPadding()).setBreakStrategy(this.sW.getBreakStrategy()).setHyphenationFrequency(this.sW.getHyphenationFrequency());
    paramInt1 = paramInt2;
    if (paramInt2 == -1)
      paramInt1 = 2147483647;
    return paramCharSequence.setMaxLines(paramInt1).setTextDirection(localTextDirectionHeuristic).build();
  }

  private static <T> T a(Object paramObject, String paramString, T paramT)
  {
    try
    {
      paramObject = R(paramString).invoke(paramObject, new Object[0]);
      paramT = paramObject;
      if (paramObject == null);
      return paramT;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        paramObject = paramObject;
        paramObject = new java/lang/StringBuilder;
        paramObject.<init>("Failed to invoke TextView#");
        paramObject.append(paramString).append("() method");
      }
    }
    finally
    {
    }
    throw paramObject;
  }

  private boolean a(int paramInt, RectF paramRectF)
  {
    Object localObject1 = this.sW.getText();
    Object localObject2 = this.sW.getTransformationMethod();
    Object localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject2 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, this.sW);
      localObject3 = localObject1;
      if (localObject2 != null)
        localObject3 = localObject2;
    }
    int i;
    label86: boolean bool;
    if (Build.VERSION.SDK_INT >= 16)
    {
      i = this.sW.getMaxLines();
      if (this.agJ != null)
        break label198;
      this.agJ = new TextPaint();
      this.agJ.set(this.sW.getPaint());
      this.agJ.setTextSize(paramInt);
      localObject1 = (Layout.Alignment)a(this.sW, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
      if (Build.VERSION.SDK_INT < 23)
        break label208;
      localObject1 = a(localObject3, (Layout.Alignment)localObject1, Math.round(paramRectF.right), i);
      label151: if ((i == -1) || ((((StaticLayout)localObject1).getLineCount() <= i) && (((StaticLayout)localObject1).getLineEnd(((StaticLayout)localObject1).getLineCount() - 1) == localObject3.length())))
        break label226;
      bool = false;
    }
    while (true)
    {
      return bool;
      i = -1;
      break;
      label198: this.agJ.reset();
      break label86;
      label208: localObject1 = a(localObject3, (Layout.Alignment)localObject1, Math.round(paramRectF.right));
      break label151;
      label226: if (((StaticLayout)localObject1).getHeight() > paramRectF.bottom)
        bool = false;
      else
        bool = true;
    }
  }

  static int[] f(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    if (i == 0);
    ArrayList localArrayList;
    do
    {
      return paramArrayOfInt;
      Arrays.sort(paramArrayOfInt);
      localArrayList = new ArrayList();
      for (j = 0; j < i; j++)
      {
        int k = paramArrayOfInt[j];
        if ((k > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(k)) < 0))
          localArrayList.add(Integer.valueOf(k));
      }
    }
    while (i == localArrayList.size());
    i = localArrayList.size();
    int[] arrayOfInt = new int[i];
    for (int j = 0; ; j++)
    {
      paramArrayOfInt = arrayOfInt;
      if (j >= i)
        break;
      arrayOfInt[j] = ((Integer)localArrayList.get(j)).intValue();
    }
  }

  private void hN()
  {
    this.agC = 0;
    this.agF = -1.0F;
    this.agG = -1.0F;
    this.agE = -1.0F;
    this.agH = new int[0];
    this.agD = false;
  }

  private void setRawTextSize(float paramFloat)
  {
    if (paramFloat != this.sW.getPaint().getTextSize())
    {
      this.sW.getPaint().setTextSize(paramFloat);
      if (Build.VERSION.SDK_INT < 18)
        break label114;
    }
    label81: label114: for (boolean bool = this.sW.isInLayout(); ; bool = false)
    {
      if (this.sW.getLayout() != null)
        this.agD = false;
      try
      {
        Method localMethod = R("nullLayouts");
        if (localMethod != null)
          localMethod.invoke(this.sW, new Object[0]);
        if (!bool)
          this.sW.requestLayout();
        while (true)
        {
          this.sW.invalidate();
          return;
          this.sW.forceLayout();
        }
      }
      catch (Exception localException)
      {
        break label81;
      }
    }
  }

  final void e(int paramInt, float paramFloat)
  {
    if (this.mContext == null);
    for (Resources localResources = Resources.getSystem(); ; localResources = this.mContext.getResources())
    {
      setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
      return;
    }
  }

  final void f(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 <= 0.0F)
      throw new IllegalArgumentException("Minimum auto-size text size (" + paramFloat1 + "px) is less or equal to (0px)");
    if (paramFloat2 <= paramFloat1)
      throw new IllegalArgumentException("Maximum auto-size text size (" + paramFloat2 + "px) is less or equal to minimum auto-size text size (" + paramFloat1 + "px)");
    if (paramFloat3 <= 0.0F)
      throw new IllegalArgumentException("The auto-size step granularity (" + paramFloat3 + "px) is less or equal to (0px)");
    this.agC = 1;
    this.agF = paramFloat1;
    this.agG = paramFloat2;
    this.agE = paramFloat3;
    this.agI = false;
  }

  final boolean hK()
  {
    int i = this.agH.length;
    if (i > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.agI = bool;
      if (this.agI)
      {
        this.agC = 1;
        this.agF = this.agH[0];
        this.agG = this.agH[(i - 1)];
        this.agE = -1.0F;
      }
      return this.agI;
    }
  }

  final boolean hL()
  {
    if ((hP()) && (this.agC == 1))
      if ((!this.agI) || (this.agH.length == 0))
      {
        float f1 = Math.round(this.agF);
        int i = 1;
        while (Math.round(this.agE + f1) <= Math.round(this.agG))
        {
          i++;
          f1 += this.agE;
        }
        int[] arrayOfInt = new int[i];
        f1 = this.agF;
        int j = 0;
        while (j < i)
        {
          arrayOfInt[j] = Math.round(f1);
          float f2 = this.agE;
          j++;
          f1 = f2 + f1;
        }
        this.agH = f(arrayOfInt);
      }
    for (this.agD = true; ; this.agD = false)
      return this.agD;
  }

  final void hM()
  {
    if (!hO());
    while (true)
    {
      return;
      int i;
      int j;
      if (this.agD)
      {
        if ((this.sW.getMeasuredHeight() <= 0) || (this.sW.getMeasuredWidth() <= 0))
          continue;
        if (!((Boolean)a(this.sW, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue())
          break label161;
        i = 1048576;
        j = this.sW.getHeight() - this.sW.getCompoundPaddingBottom() - this.sW.getCompoundPaddingTop();
        if ((i <= 0) || (j <= 0))
          continue;
      }
      synchronized (agA)
      {
        agA.setEmpty();
        agA.right = i;
        agA.bottom = j;
        float f = a(agA);
        if (f != this.sW.getTextSize())
          e(0, f);
        this.agD = true;
        continue;
        label161: i = this.sW.getMeasuredWidth() - this.sW.getTotalPaddingLeft() - this.sW.getTotalPaddingRight();
      }
    }
  }

  final boolean hO()
  {
    if ((hP()) && (this.agC != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean hP()
  {
    if (!(this.sW instanceof AppCompatEditText));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (hP())
    {
      DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
      f(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (hL())
        hM();
    }
  }

  final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    if (hP())
    {
      int j = paramArrayOfInt.length;
      if (j > 0)
      {
        int[] arrayOfInt1 = new int[j];
        int[] arrayOfInt2;
        if (paramInt == 0)
        {
          arrayOfInt2 = Arrays.copyOf(paramArrayOfInt, j);
          this.agH = f(arrayOfInt2);
          if (!hK())
            throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(paramArrayOfInt));
        }
        else
        {
          DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
          while (true)
          {
            arrayOfInt2 = arrayOfInt1;
            if (i >= j)
              break;
            arrayOfInt1[i] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[i], localDisplayMetrics));
            i++;
          }
        }
      }
      else
      {
        this.agI = false;
      }
      if (hL())
        hM();
    }
  }

  final void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (hP())
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(paramInt)));
      case 0:
        hN();
      case 1:
      }
    while (true)
    {
      return;
      DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
      f(TypedValue.applyDimension(2, 12.0F, localDisplayMetrics), TypedValue.applyDimension(2, 112.0F, localDisplayMetrics), 1.0F);
      if (hL())
        hM();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.p
 * JD-Core Version:    0.6.2
 */