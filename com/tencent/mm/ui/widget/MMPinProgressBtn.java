package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMPinProgressBtn extends CompoundButton
{
  private int EV;
  private Paint Pk;
  private RectF anj;
  private int style;
  private final float zMA;
  private Runnable zMB;
  private int zMx;
  private Paint zMy;
  private int zMz;

  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107903);
    this.anj = new RectF();
    this.zMA = 4.0F;
    this.zMB = new MMPinProgressBtn.1(this);
    b(paramContext, paramAttributeSet, 0);
    AppMethodBeat.o(107903);
  }

  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107904);
    this.anj = new RectF();
    this.zMA = 4.0F;
    this.zMB = new MMPinProgressBtn.1(this);
    b(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.o(107904);
  }

  // ERROR //
  private void b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: ldc 67
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: bipush 100
    //   8: putfield 66	com/tencent/mm/ui/widget/MMPinProgressBtn:zMx	I
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield 63	com/tencent/mm/ui/widget/MMPinProgressBtn:EV	I
    //   16: aload_0
    //   17: invokevirtual 71	com/tencent/mm/ui/widget/MMPinProgressBtn:getResources	()Landroid/content/res/Resources;
    //   20: astore 4
    //   22: aload 4
    //   24: ldc 72
    //   26: invokevirtual 78	android/content/res/Resources:getColor	(I)I
    //   29: istore 5
    //   31: aload 4
    //   33: ldc 79
    //   35: invokevirtual 78	android/content/res/Resources:getColor	(I)I
    //   38: istore 6
    //   40: iload 6
    //   42: istore 7
    //   44: iload 5
    //   46: istore 8
    //   48: aload_2
    //   49: ifnull +106 -> 155
    //   52: aload_1
    //   53: aload_2
    //   54: getstatic 85	com/tencent/mm/ad/a$a:MMPinProgressBtn	[I
    //   57: iload_3
    //   58: iconst_0
    //   59: invokevirtual 91	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   62: astore_2
    //   63: aload_0
    //   64: aload_2
    //   65: iconst_2
    //   66: aload_0
    //   67: getfield 66	com/tencent/mm/ui/widget/MMPinProgressBtn:zMx	I
    //   70: invokevirtual 97	android/content/res/TypedArray:getInteger	(II)I
    //   73: putfield 66	com/tencent/mm/ui/widget/MMPinProgressBtn:zMx	I
    //   76: aload_0
    //   77: aload_2
    //   78: iconst_1
    //   79: aload_0
    //   80: getfield 63	com/tencent/mm/ui/widget/MMPinProgressBtn:EV	I
    //   83: invokevirtual 97	android/content/res/TypedArray:getInteger	(II)I
    //   86: putfield 63	com/tencent/mm/ui/widget/MMPinProgressBtn:EV	I
    //   89: aload_2
    //   90: iconst_3
    //   91: iload 5
    //   93: invokevirtual 99	android/content/res/TypedArray:getColor	(II)I
    //   96: istore_3
    //   97: aload_2
    //   98: iconst_4
    //   99: iload 6
    //   101: invokevirtual 99	android/content/res/TypedArray:getColor	(II)I
    //   104: istore 6
    //   106: aload_0
    //   107: aload_2
    //   108: bipush 6
    //   110: iconst_0
    //   111: invokevirtual 97	android/content/res/TypedArray:getInteger	(II)I
    //   114: putfield 101	com/tencent/mm/ui/widget/MMPinProgressBtn:style	I
    //   117: aload_0
    //   118: aload_2
    //   119: iconst_5
    //   120: aload 4
    //   122: ldc 102
    //   124: invokevirtual 105	android/content/res/Resources:getDimensionPixelSize	(I)I
    //   127: invokevirtual 107	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   130: putfield 109	com/tencent/mm/ui/widget/MMPinProgressBtn:zMz	I
    //   133: iload 6
    //   135: istore 7
    //   137: iload_3
    //   138: istore 8
    //   140: aload_2
    //   141: ifnull +14 -> 155
    //   144: aload_2
    //   145: invokevirtual 112	android/content/res/TypedArray:recycle	()V
    //   148: iload_3
    //   149: istore 8
    //   151: iload 6
    //   153: istore 7
    //   155: aload_0
    //   156: new 114	android/graphics/Paint
    //   159: dup
    //   160: invokespecial 115	android/graphics/Paint:<init>	()V
    //   163: putfield 117	com/tencent/mm/ui/widget/MMPinProgressBtn:Pk	Landroid/graphics/Paint;
    //   166: aload_0
    //   167: getfield 117	com/tencent/mm/ui/widget/MMPinProgressBtn:Pk	Landroid/graphics/Paint;
    //   170: iload 8
    //   172: invokevirtual 120	android/graphics/Paint:setColor	(I)V
    //   175: aload_0
    //   176: getfield 117	com/tencent/mm/ui/widget/MMPinProgressBtn:Pk	Landroid/graphics/Paint;
    //   179: getstatic 126	android/graphics/Paint$Style:STROKE	Landroid/graphics/Paint$Style;
    //   182: invokevirtual 130	android/graphics/Paint:setStyle	(Landroid/graphics/Paint$Style;)V
    //   185: aload_0
    //   186: getfield 117	com/tencent/mm/ui/widget/MMPinProgressBtn:Pk	Landroid/graphics/Paint;
    //   189: ldc 39
    //   191: invokevirtual 134	android/graphics/Paint:setStrokeWidth	(F)V
    //   194: aload_0
    //   195: getfield 117	com/tencent/mm/ui/widget/MMPinProgressBtn:Pk	Landroid/graphics/Paint;
    //   198: iconst_1
    //   199: invokevirtual 138	android/graphics/Paint:setAntiAlias	(Z)V
    //   202: aload_0
    //   203: new 114	android/graphics/Paint
    //   206: dup
    //   207: invokespecial 115	android/graphics/Paint:<init>	()V
    //   210: putfield 140	com/tencent/mm/ui/widget/MMPinProgressBtn:zMy	Landroid/graphics/Paint;
    //   213: aload_0
    //   214: getfield 140	com/tencent/mm/ui/widget/MMPinProgressBtn:zMy	Landroid/graphics/Paint;
    //   217: iload 7
    //   219: invokevirtual 120	android/graphics/Paint:setColor	(I)V
    //   222: aload_0
    //   223: getfield 140	com/tencent/mm/ui/widget/MMPinProgressBtn:zMy	Landroid/graphics/Paint;
    //   226: iconst_1
    //   227: invokevirtual 138	android/graphics/Paint:setAntiAlias	(Z)V
    //   230: aload_0
    //   231: iconst_0
    //   232: invokevirtual 143	com/tencent/mm/ui/widget/MMPinProgressBtn:setClickable	(Z)V
    //   235: ldc 67
    //   237: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: return
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_2
    //   244: aload_2
    //   245: ifnull +7 -> 252
    //   248: aload_2
    //   249: invokevirtual 112	android/content/res/TypedArray:recycle	()V
    //   252: ldc 67
    //   254: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aload_1
    //   258: athrow
    //   259: astore_1
    //   260: goto -16 -> 244
    //
    // Exception table:
    //   from	to	target	type
    //   52	63	241	finally
    //   63	133	259	finally
  }

  public final void dKB()
  {
    AppMethodBeat.i(107908);
    removeCallbacks(this.zMB);
    post(this.zMB);
    AppMethodBeat.o(107908);
  }

  public int getMax()
  {
    return this.zMx;
  }

  public int getProgress()
  {
    return this.EV;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107910);
    super.onDraw(paramCanvas);
    this.anj.set(2.0F, 2.0F, this.zMz - 2.0F, this.zMz - 2.0F);
    this.anj.offset((getWidth() - this.zMz) / 2, (getHeight() - this.zMz) / 2);
    paramCanvas.drawArc(this.anj, 0.0F, 360.0F, true, this.Pk);
    switch (this.style)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(107910);
      while (true)
      {
        return;
        this.anj.set(8.0F, 8.0F, this.zMz - 8.0F, this.zMz - 8.0F);
        this.anj.offset((getWidth() - this.zMz) / 2, (getHeight() - this.zMz) / 2);
        paramCanvas.drawArc(this.anj, -90.0F, 360.0F * (this.EV * 1.0F / this.zMx), true, this.zMy);
        AppMethodBeat.o(107910);
      }
      this.anj.set(2.0F, 2.0F, this.zMz - 2.0F, this.zMz - 2.0F);
      this.anj.offset((getWidth() - this.zMz) / 2, (getHeight() - this.zMz) / 2);
      paramCanvas.drawArc(this.anj, 270.0F, this.EV * 1.0F / this.zMx * 360.0F - 360.0F, true, this.zMy);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107909);
    setMeasuredDimension(resolveSize(this.zMz, paramInt1), resolveSize(this.zMz, paramInt2));
    AppMethodBeat.o(107909);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(107912);
    if (!(paramParcelable instanceof MMPinProgressBtn.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(107912);
    }
    while (true)
    {
      return;
      paramParcelable = (MMPinProgressBtn.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      this.zMx = MMPinProgressBtn.SavedState.a(paramParcelable);
      this.EV = MMPinProgressBtn.SavedState.b(paramParcelable);
      AppMethodBeat.o(107912);
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(107911);
    Object localObject = super.onSaveInstanceState();
    if (isSaveEnabled())
    {
      localObject = new MMPinProgressBtn.SavedState((Parcelable)localObject);
      MMPinProgressBtn.SavedState.a((MMPinProgressBtn.SavedState)localObject, this.zMx);
      MMPinProgressBtn.SavedState.b((MMPinProgressBtn.SavedState)localObject, this.EV);
      AppMethodBeat.o(107911);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(107911);
    }
  }

  public void setMax(int paramInt)
  {
    AppMethodBeat.i(107906);
    this.zMx = Math.max(0, paramInt);
    invalidate();
    AppMethodBeat.o(107906);
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(107907);
    this.EV = Math.max(0, paramInt);
    this.EV = Math.min(paramInt, this.zMx);
    invalidate();
    AppMethodBeat.o(107907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMPinProgressBtn
 * JD-Core Version:    0.6.2
 */