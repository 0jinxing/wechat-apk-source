package com.tencent.mm.plugin.appbrand.widget.e;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends FrameLayout
{
  public static final int jjZ;
  public static final int jka;
  public static final int jkk;
  private float bDv;
  private float bDw;
  private TextView jkj;
  private int jkl;
  private int jkm;
  private int jkn;
  private int jko;
  public int x;
  public int y;

  static
  {
    AppMethodBeat.i(51274);
    jjZ = Color.parseColor("#000000");
    jkk = Color.parseColor("#000000");
    jka = Color.parseColor("#000000");
    AppMethodBeat.o(51274);
  }

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(51265);
    this.x = 0;
    this.y = 0;
    this.bDv = 0.0F;
    this.bDw = 0.0F;
    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.jkj = new TextView(paramContext);
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    this.jkj.setLayoutParams(paramContext);
    addView(this.jkj);
    AppMethodBeat.o(51265);
  }

  public final float getAnchorX()
  {
    return this.bDv;
  }

  public final float getAnchorY()
  {
    return this.bDw;
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(51273);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)getChildAt(0).getLayoutParams();
    if ((this.x >= 0) && (this.y >= 0))
      localLayoutParams.gravity = 85;
    while (true)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(51273);
      return;
      if ((this.x >= 0) && (this.y <= 0))
        localLayoutParams.gravity = 53;
      else if ((this.x <= 0) && (this.y >= 0))
        localLayoutParams.gravity = 83;
      else if ((this.x <= 0) && (this.y <= 0))
        localLayoutParams.gravity = 51;
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51272);
    super.onMeasure(paramInt1, paramInt2);
    this.jkl = getMeasuredWidth();
    this.jkm = getMeasuredHeight();
    if ((-this.jkl < this.x) && (this.x < 0))
    {
      this.jkn = this.jkl;
      this.bDv = (Math.abs(this.x) / (this.jkl * 1.0F));
      if ((-this.jkm >= this.y) || (this.y >= 0))
        break label189;
      this.jko = this.jkm;
      this.bDw = (Math.abs(this.y) / (this.jkm * 1.0F));
    }
    while (true)
    {
      setMeasuredDimension(this.jkn, this.jko);
      AppMethodBeat.o(51272);
      return;
      if (this.x >= 0)
      {
        this.jkn = (this.jkl + Math.abs(this.x));
        this.bDv = 0.0F;
        break;
      }
      this.jkn = Math.abs(this.x);
      this.bDv = 1.0F;
      break;
      label189: if (this.y >= 0)
      {
        this.jko = (this.jkm + Math.abs(this.y));
        this.bDw = 0.0F;
      }
      else
      {
        this.jko = Math.abs(this.y);
        this.bDw = 1.0F;
      }
    }
  }

  public final void setGravity(String paramString)
  {
    AppMethodBeat.i(51271);
    if (paramString.equals("left"))
    {
      this.jkj.setGravity(3);
      AppMethodBeat.o(51271);
    }
    while (true)
    {
      return;
      if (paramString.equals("right"))
      {
        this.jkj.setGravity(5);
        AppMethodBeat.o(51271);
      }
      else
      {
        paramString.equals("center");
        this.jkj.setGravity(17);
        AppMethodBeat.o(51271);
      }
    }
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(51267);
    this.jkj.setText(paramString);
    AppMethodBeat.o(51267);
  }

  public final void setTextColor(int paramInt)
  {
    AppMethodBeat.i(51269);
    this.jkj.setTextColor(paramInt);
    AppMethodBeat.o(51269);
  }

  public final void setTextPadding(int paramInt)
  {
    AppMethodBeat.i(51270);
    this.jkj.setPadding(paramInt, paramInt, paramInt, paramInt);
    AppMethodBeat.o(51270);
  }

  public final void setTextSize(int paramInt)
  {
    AppMethodBeat.i(51268);
    this.jkj.setTextSize(paramInt);
    AppMethodBeat.o(51268);
  }

  public final void setX(int paramInt)
  {
    this.x = paramInt;
  }

  public final void setY(int paramInt)
  {
    this.y = paramInt;
  }

  public final void x(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(51266);
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(paramInt1);
    localGradientDrawable.setStroke(paramInt2, paramInt3);
    localGradientDrawable.setColor(paramInt4);
    this.jkj.setBackgroundDrawable(localGradientDrawable);
    AppMethodBeat.o(51266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.d
 * JD-Core Version:    0.6.2
 */