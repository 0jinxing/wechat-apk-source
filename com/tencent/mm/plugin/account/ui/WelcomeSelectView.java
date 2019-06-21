package com.tencent.mm.plugin.account.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public class WelcomeSelectView extends WelcomeView
{
  private Context context;
  protected View gCO;
  protected Button gIv;
  protected Button gIw;
  protected TextView gIx;
  private int mHeight;

  public WelcomeSelectView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(125662);
    this.mHeight = 800;
    cA(paramContext);
    AppMethodBeat.o(125662);
  }

  @TargetApi(11)
  public WelcomeSelectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(125661);
    this.mHeight = 800;
    cA(paramContext);
    AppMethodBeat.o(125661);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(125665);
    this.context = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(2130971229, this);
    this.gCO = localView.findViewById(2131829217);
    this.gIv = ((Button)localView.findViewById(2131827314));
    this.gIw = ((Button)localView.findViewById(2131827313));
    this.gIx = ((TextView)localView.findViewById(2131829216));
    this.gCO.setVisibility(8);
    this.gIx.setVisibility(8);
    this.gIx.setText(aa.gx(paramContext));
    this.mHeight = paramContext.getResources().getDisplayMetrics().heightPixels;
    AppMethodBeat.o(125665);
  }

  public final void arN()
  {
    AppMethodBeat.i(125666);
    cj(this.gCO);
    cj(this.gIx);
    this.gCO.setVisibility(0);
    this.gIx.setVisibility(0);
    al.d(new WelcomeSelectView.1(this));
    AppMethodBeat.o(125666);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(125663);
    super.dispatchDraw(paramCanvas);
    AppMethodBeat.o(125663);
  }

  final void init()
  {
    AppMethodBeat.i(125664);
    String str = aa.h(this.context.getSharedPreferences(ah.doA(), 0));
    this.gIx.setText(aa.gx(this.context));
    if ((str != null) && (str.equals("language_default")))
      this.gIx.setText(this.context.getString(2131301023));
    this.gIv.setText(2131300628);
    this.gIw.setText(2131300627);
    AppMethodBeat.o(125664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeSelectView
 * JD-Core Version:    0.6.2
 */