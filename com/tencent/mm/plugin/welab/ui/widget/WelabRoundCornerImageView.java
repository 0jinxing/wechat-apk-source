package com.tencent.mm.plugin.welab.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.support.v4.a.a.b;
import android.support.v4.a.a.d;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WelabRoundCornerImageView extends ImageView
{
  private float uMD;

  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public Bitmap getDisplayingBitmap()
  {
    AppMethodBeat.i(80627);
    Object localObject = getDrawable();
    if ((localObject == null) || (!(localObject instanceof b)))
    {
      localObject = null;
      AppMethodBeat.o(80627);
    }
    while (true)
    {
      return localObject;
      localObject = ((b)localObject).mBitmap;
      AppMethodBeat.o(80627);
    }
  }

  public void setCornerRadiusPercent(float paramFloat)
  {
    this.uMD = paramFloat;
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(80626);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (paramBitmap.getWidth() < 0) || (paramBitmap.getHeight() < 0))
    {
      super.setImageBitmap(paramBitmap);
      AppMethodBeat.o(80626);
    }
    while (true)
    {
      return;
      if (this.uMD > 0.0F)
        break;
      super.setImageBitmap(paramBitmap);
      AppMethodBeat.o(80626);
    }
    b localb = d.a(getResources(), paramBitmap);
    float f = Math.min(paramBitmap.getWidth() * this.uMD, paramBitmap.getHeight() * this.uMD);
    if (localb.rf != f)
    {
      localb.HA = false;
      if (!b.s(f))
        break label151;
      localb.mPaint.setShader(localb.Hv);
    }
    while (true)
    {
      localb.rf = f;
      localb.invalidateSelf();
      super.setImageDrawable(localb);
      AppMethodBeat.o(80626);
      break;
      label151: localb.mPaint.setShader(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView
 * JD-Core Version:    0.6.2
 */