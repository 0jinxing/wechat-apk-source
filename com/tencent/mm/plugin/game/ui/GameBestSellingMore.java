package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;

public class GameBestSellingMore extends LinearLayout
  implements View.OnClickListener
{
  private d neV;
  private TextView neW;
  private ImageView neX;

  public GameBestSellingMore(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111734);
    if ((this.neV == null) || (this.neV.mVH == null) || (this.neV.mVH.naG == null) || (bo.isNullOrNil(this.neV.mVH.naG.nbi)))
      AppMethodBeat.o(111734);
    while (true)
    {
      return;
      int i = c.ax(getContext(), this.neV.mVH.naG.nbi);
      b.a(getContext(), 10, 1022, 999, i, null, GameIndexListView.getSourceScene(), a.kY(this.neV.mVH.mZL));
      AppMethodBeat.o(111734);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111732);
    super.onFinishInflate();
    this.neW = ((TextView)findViewById(2131824299));
    this.neX = ((ImageView)findViewById(2131824300));
    setOnClickListener(this);
    AppMethodBeat.o(111732);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111733);
    this.neV = paramd;
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naG == null) || (bo.isNullOrNil(paramd.mVH.naG.naP)))
    {
      this.neW.setVisibility(8);
      this.neX.setVisibility(8);
      setPadding(0, 0, 0, 0);
      AppMethodBeat.o(111733);
    }
    while (true)
    {
      return;
      setPadding(getResources().getDimensionPixelSize(2131427728), 0, getResources().getDimensionPixelSize(2131427728), getResources().getDimensionPixelSize(2131427728));
      this.neW.setVisibility(0);
      this.neX.setVisibility(0);
      this.neW.setText(paramd.mVH.naG.naP);
      AppMethodBeat.o(111733);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBestSellingMore
 * JD-Core Version:    0.6.2
 */