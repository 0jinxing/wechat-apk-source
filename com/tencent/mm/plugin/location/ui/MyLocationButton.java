package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;

public class MyLocationButton extends FrameLayout
{
  private Context context;
  public b.a ecy;
  private ImageButton nLE;
  private LinearLayout nLF;
  private com.tencent.mm.plugin.k.d nLG;
  private boolean nLH;

  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113450);
    this.nLH = true;
    this.ecy = new MyLocationButton.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113450);
  }

  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113449);
    this.nLH = true;
    this.ecy = new MyLocationButton.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113449);
  }

  private void init()
  {
    AppMethodBeat.i(113451);
    View localView = View.inflate(this.context, 2130970278, this);
    this.nLE = ((ImageButton)localView.findViewById(2131826273));
    this.nLF = ((LinearLayout)localView.findViewById(2131821099));
    AppMethodBeat.o(113451);
  }

  public final void bJN()
  {
    AppMethodBeat.i(113452);
    this.nLE.setImageResource(2130839842);
    AppMethodBeat.o(113452);
  }

  public final void bJO()
  {
    AppMethodBeat.i(113453);
    this.nLE.setImageResource(2130839843);
    AppMethodBeat.o(113453);
  }

  public ImageButton getMyLocationBtn()
  {
    return this.nLE;
  }

  public LinearLayout getProgressBar()
  {
    return this.nLF;
  }

  public void setAnimToSelf(boolean paramBoolean)
  {
    this.nLH = paramBoolean;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(113454);
    this.nLE.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(113454);
  }

  public void setProgressBar(com.tencent.mm.plugin.k.d paramd)
  {
    AppMethodBeat.i(113455);
    this.nLG = paramd;
    this.nLF.setVisibility(0);
    this.nLE.setVisibility(8);
    com.tencent.mm.modelgeo.d.agz().b(this.ecy, true);
    AppMethodBeat.o(113455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.MyLocationButton
 * JD-Core Version:    0.6.2
 */