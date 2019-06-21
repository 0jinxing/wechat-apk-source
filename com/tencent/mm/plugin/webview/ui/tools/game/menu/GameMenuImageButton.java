package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class GameMenuImageButton extends LinearLayout
{
  private ImageView cAw;
  public boolean uEu;

  public GameMenuImageButton(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(8806);
    cA(paramContext);
    AppMethodBeat.o(8806);
  }

  public GameMenuImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(8807);
    cA(paramContext);
    AppMethodBeat.o(8807);
  }

  public GameMenuImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(8808);
    cA(paramContext);
    AppMethodBeat.o(8808);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(8809);
    this.cAw = new ImageView(paramContext);
    this.cAw.setLayoutParams(new ViewGroup.LayoutParams(a.am(paramContext, 2131428425), a.am(paramContext, 2131428425)));
    this.cAw.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.cAw.setImageResource(2130838942);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(0, a.am(paramContext, 2131428424), a.am(paramContext, 2131428424), 0);
    addView(this.cAw, localLayoutParams);
    AppMethodBeat.o(8809);
  }

  public final void a(FrameLayout paramFrameLayout, GameMenuImageButton.a parama)
  {
    AppMethodBeat.i(8810);
    if ((getParent() == null) && (paramFrameLayout != null))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 53;
      paramFrameLayout.addView(this, localLayoutParams);
    }
    if (this.cAw != null)
      this.cAw.setOnClickListener(new GameMenuImageButton.1(this, parama));
    this.uEu = true;
    AppMethodBeat.o(8810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton
 * JD-Core Version:    0.6.2
 */