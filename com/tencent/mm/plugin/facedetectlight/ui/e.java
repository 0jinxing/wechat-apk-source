package com.tencent.mm.plugin.facedetectlight.ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends a
{
  private RelativeLayout lYh;
  private RelativeLayout lYi;
  private ImageView lYj;
  private ImageView lYk;
  private ImageView lYl;

  public e(ViewGroup paramViewGroup, com.tencent.mm.plugin.facedetectlight.ui.container.a parama)
  {
    super(paramViewGroup, parama);
  }

  public final int btU()
  {
    return 2130969468;
  }

  public final void initView()
  {
    AppMethodBeat.i(808);
    this.lYh = ((RelativeLayout)findViewById(2131823747));
    this.lYi = ((RelativeLayout)findViewById(2131823742));
    setVisibility(4);
    this.lYh.setVisibility(4);
    this.lYi.setVisibility(4);
    this.lYj = ((ImageView)findViewById(2131823753));
    this.lYk = ((ImageView)findViewById(2131823752));
    this.lYl = ((ImageView)findViewById(2131823749));
    AppMethodBeat.o(808);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.e
 * JD-Core Version:    0.6.2
 */