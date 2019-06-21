package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class ToolsBar extends LinearLayout
{
  private LinearLayout.LayoutParams njH;
  private ImageButton yJq;
  private ImageButton yJt;
  private ImageButton yMI;

  public ToolsBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(31072);
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(2130837979);
    this.njH = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131427857), 1.0F);
    this.yJq = new ImageButton(getContext());
    this.yJq.setImageResource(2130838193);
    this.yJq.setScaleType(ImageView.ScaleType.CENTER);
    this.yJq.setBackgroundResource(0);
    this.yJq.setContentDescription(paramContext.getString(2131298183));
    this.yJt = new ImageButton(getContext());
    this.yJt.setImageResource(2130838190);
    this.yJt.setScaleType(ImageView.ScaleType.CENTER);
    this.yJt.setBackgroundResource(0);
    this.yJt.setContentDescription(paramContext.getString(2131298182));
    this.yMI = new ImageButton(getContext());
    this.yMI.setImageResource(2130838192);
    this.yMI.setScaleType(ImageView.ScaleType.CENTER);
    this.yMI.setBackgroundResource(0);
    this.yMI.setContentDescription(paramContext.getString(2131298182));
    removeAllViews();
    addView(this.yJq, this.njH);
    addView(this.yJt, this.njH);
    addView(this.yMI, this.njH);
    AppMethodBeat.o(31072);
  }

  public final void c(int paramInt, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(31073);
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.ToolsBar", "set button listener error button index %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(31073);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.yJq.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(31073);
      continue;
      this.yJt.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(31073);
      continue;
      this.yMI.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(31073);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ToolsBar
 * JD-Core Version:    0.6.2
 */