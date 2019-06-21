package com.github.henryye.nativeiv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.iv.NativeTextureView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NativeImageView extends FrameLayout
{
  private ImageView aLY;
  private NativeTextureView aLZ;
  private b aMa;

  public NativeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public NativeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(115753);
    this.aLY = null;
    this.aLZ = null;
    this.aMa = null;
    this.aLY = new ImageView(getContext());
    this.aLZ = new NativeTextureView(getContext());
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    addView(this.aLY, paramContext);
    addView(this.aLZ, paramContext);
    if ((this.aMa == null) || (this.aMa.pA() == BitmapType.Undefined) || (this.aMa.pA() == BitmapType.Legacy))
    {
      this.aLY.setVisibility(0);
      this.aLZ.setVisibility(8);
    }
    while (true)
    {
      this.aLY.setImageBitmap(null);
      NativeTextureView.pB();
      AppMethodBeat.o(115753);
      return;
      this.aLY.setVisibility(8);
      this.aLZ.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.NativeImageView
 * JD-Core Version:    0.6.2
 */