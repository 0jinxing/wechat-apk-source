package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandOptionButton extends FrameLayout
{
  private boolean iVc;
  private View iVd;
  private View iVe;
  private TextView iVf;
  private ImageButton iVg;

  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(87498);
    this.iVc = true;
    init(paramContext);
    AppMethodBeat.o(87498);
  }

  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(87499);
    this.iVc = true;
    init(paramContext);
    AppMethodBeat.o(87499);
  }

  private int getActionBarHeight()
  {
    AppMethodBeat.i(87500);
    int i = getResources().getDimensionPixelSize(2131427561);
    AppMethodBeat.o(87500);
    return i;
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(87501);
    this.iVd = LayoutInflater.from(paramContext).inflate(2130968656, this, false);
    this.iVe = this.iVd.findViewById(2131821128);
    this.iVf = ((TextView)this.iVd.findViewById(2131821129));
    this.iVf.setMaxLines(1);
    this.iVf.setClickable(false);
    this.iVf.setBackground(null);
    addView(this.iVd, new FrameLayout.LayoutParams(-2, -1, 17));
    this.iVd.setVisibility(8);
    this.iVg = new ImageButton(paramContext);
    this.iVg.setClickable(false);
    this.iVg.setBackground(null);
    addView(this.iVg, new FrameLayout.LayoutParams(getActionBarHeight(), -1, 17));
    AppMethodBeat.o(87501);
  }

  ImageView getButtonImage()
  {
    return this.iVg;
  }

  protected Drawable getDefaultImageDrawable()
  {
    AppMethodBeat.i(87507);
    Drawable localDrawable = b.g(getContext(), 2130837713);
    AppMethodBeat.o(87507);
    return localDrawable;
  }

  public final void reset()
  {
    AppMethodBeat.i(87506);
    this.iVc = true;
    this.iVd.setVisibility(8);
    this.iVg.setVisibility(0);
    this.iVg.setAlpha(1.0F);
    this.iVg.setImageDrawable(getDefaultImageDrawable());
    AppMethodBeat.o(87506);
  }

  public void setAccessibilityLabel(String paramString)
  {
    AppMethodBeat.i(87502);
    if ((this.iVg != null) && (this.iVg.getVisibility() == 0))
    {
      this.iVg.setContentDescription(paramString);
      AppMethodBeat.o(87502);
    }
    while (true)
    {
      return;
      if ((this.iVf != null) && (this.iVf.getVisibility() == 0))
        this.iVf.setContentDescription(paramString);
      AppMethodBeat.o(87502);
    }
  }

  public void setColor(int paramInt)
  {
    AppMethodBeat.i(87505);
    this.iVf.setTextColor(paramInt);
    this.iVg.setImageDrawable(getDefaultImageDrawable());
    this.iVg.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    this.iVg.setBackground(getBackground());
    if (this.iVg.getBackground() != null)
      this.iVg.getBackground().setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    AppMethodBeat.o(87505);
  }

  public void setIcon(Bitmap paramBitmap)
  {
    AppMethodBeat.i(87503);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(87503);
    while (true)
    {
      return;
      this.iVc = false;
      this.iVg.setImageDrawable(new BitmapDrawable(getResources(), paramBitmap));
      this.iVg.setVisibility(0);
      this.iVd.setVisibility(8);
      AppMethodBeat.o(87503);
    }
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(87504);
    this.iVc = false;
    this.iVf.setText(paramString);
    this.iVd.setVisibility(0);
    this.iVg.setVisibility(8);
    AppMethodBeat.o(87504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton
 * JD-Core Version:    0.6.2
 */