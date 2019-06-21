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
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public class ChattingFooterMoreBtnBar extends LinearLayout
{
  private ImageButton mpG;
  private LinearLayout.LayoutParams njH;
  private ImageButton yJq;
  private ImageButton yJr;
  private ImageButton yJs;
  private ImageButton yJt;

  public ChattingFooterMoreBtnBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(30684);
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(2130837979);
    this.njH = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131427857), 1.0F);
    this.njH.topMargin = a.fromDPToPix(getContext(), 0);
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
    this.mpG = new ImageButton(getContext());
    this.mpG.setImageResource(2130838188);
    this.mpG.setScaleType(ImageView.ScaleType.CENTER);
    this.mpG.setBackgroundResource(0);
    this.mpG.setContentDescription(paramContext.getString(2131298180));
    this.yJs = new ImageButton(getContext());
    this.yJs.setImageResource(2130838191);
    this.yJs.setScaleType(ImageView.ScaleType.CENTER);
    this.yJs.setBackgroundResource(0);
    this.yJs.setContentDescription(paramContext.getString(2131298179));
    this.yJr = new ImageButton(getContext());
    this.yJr.setImageResource(2130838189);
    this.yJr.setScaleType(ImageView.ScaleType.CENTER);
    this.yJr.setBackgroundResource(0);
    this.yJr.setContentDescription(paramContext.getString(2131298181));
    dCp();
    AppMethodBeat.o(30684);
  }

  public final void On(int paramInt)
  {
    AppMethodBeat.i(30686);
    boolean bool;
    if (paramInt > 0)
    {
      bool = true;
      this.yJq.setClickable(bool);
      this.yJq.setEnabled(bool);
      if (j.dBY().size() <= 0)
        break label99;
      this.yJs.setClickable(bool);
      this.yJs.setEnabled(bool);
    }
    while (true)
    {
      this.mpG.setClickable(bool);
      this.mpG.setEnabled(bool);
      this.yJt.setClickable(bool);
      this.yJt.setEnabled(bool);
      AppMethodBeat.o(30686);
      return;
      bool = false;
      break;
      label99: this.yJr.setClickable(bool);
      this.yJr.setEnabled(bool);
    }
  }

  public final void c(int paramInt, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(30687);
    switch (paramInt)
    {
    default:
      ab.w("Ashu.ChattingFooterMoreBtnBar", "set button listener error button index %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(30687);
    case 2:
    case 3:
    case 1:
    case 0:
    case 4:
    }
    while (true)
    {
      return;
      this.yJs.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(30687);
      continue;
      this.mpG.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(30687);
      continue;
      this.yJr.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(30687);
      continue;
      this.yJq.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(30687);
      continue;
      this.yJt.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(30687);
    }
  }

  public final void dCp()
  {
    AppMethodBeat.i(30685);
    removeAllViews();
    addView(this.yJq, this.njH);
    addView(this.yJt, this.njH);
    addView(this.mpG, this.njH);
    addView(this.yJr, this.njH);
    AppMethodBeat.o(30685);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar
 * JD-Core Version:    0.6.2
 */