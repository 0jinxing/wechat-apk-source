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

public class NewMyLocationButton extends FrameLayout
{
  private Context context;
  private b.a ecy;
  private ImageButton nLE;
  private LinearLayout nLF;
  private com.tencent.mm.plugin.k.d nLG;
  private boolean nLH;

  public NewMyLocationButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113464);
    this.nLH = true;
    this.ecy = new NewMyLocationButton.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113464);
  }

  public NewMyLocationButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113463);
    this.nLH = true;
    this.ecy = new NewMyLocationButton.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113463);
  }

  private void init()
  {
    AppMethodBeat.i(113465);
    View localView = View.inflate(this.context, 2130970303, this);
    this.nLE = ((ImageButton)localView.findViewById(2131826354));
    this.nLF = ((LinearLayout)localView.findViewById(2131826355));
    AppMethodBeat.o(113465);
  }

  public void setAnimToSelf(boolean paramBoolean)
  {
    this.nLH = paramBoolean;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(113466);
    this.nLE.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(113466);
  }

  public void setProgressBar(com.tencent.mm.plugin.k.d paramd)
  {
    AppMethodBeat.i(113467);
    this.nLG = paramd;
    this.nLF.setVisibility(0);
    this.nLE.setVisibility(8);
    com.tencent.mm.modelgeo.d.agz().b(this.ecy, true);
    AppMethodBeat.o(113467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.NewMyLocationButton
 * JD-Core Version:    0.6.2
 */