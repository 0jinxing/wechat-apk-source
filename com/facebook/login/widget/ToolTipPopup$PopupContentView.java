package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ToolTipPopup$PopupContentView extends FrameLayout
{
  private View bodyFrame;
  private ImageView bottomArrow;
  private ImageView topArrow;
  private ImageView xOut;

  public ToolTipPopup$PopupContentView(ToolTipPopup paramToolTipPopup, Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(92714);
    init();
    AppMethodBeat.o(92714);
  }

  private void init()
  {
    AppMethodBeat.i(92715);
    LayoutInflater.from(getContext()).inflate(2130969171, this);
    this.topArrow = ((ImageView)findViewById(2131822900));
    this.bottomArrow = ((ImageView)findViewById(2131822903));
    this.bodyFrame = findViewById(2131822899);
    this.xOut = ((ImageView)findViewById(2131822901));
    AppMethodBeat.o(92715);
  }

  public void showBottomArrow()
  {
    AppMethodBeat.i(92717);
    this.topArrow.setVisibility(4);
    this.bottomArrow.setVisibility(0);
    AppMethodBeat.o(92717);
  }

  public void showTopArrow()
  {
    AppMethodBeat.i(92716);
    this.topArrow.setVisibility(0);
    this.bottomArrow.setVisibility(4);
    AppMethodBeat.o(92716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.ToolTipPopup.PopupContentView
 * JD-Core Version:    0.6.2
 */