package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;

public class GameRankHeadView extends LinearLayout
  implements View.OnClickListener
{
  private TextView gsf;
  private com.tencent.mm.plugin.game.model.c mYa;
  j.a ngQ;
  private k ngS;
  private TextView ngo;
  private TextView nlM;
  private ImageView nlN;

  public GameRankHeadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void bFm()
  {
    AppMethodBeat.i(112146);
    if (g.a(getContext(), this.mYa))
    {
      int i = com.tencent.mm.plugin.game.f.c.Or(this.mYa.field_packageName);
      if (this.mYa.versionCode > i)
      {
        this.ngo.setText(2131300242);
        AppMethodBeat.o(112146);
      }
    }
    while (true)
    {
      return;
      this.ngo.setText(2131300240);
      AppMethodBeat.o(112146);
      continue;
      switch (this.mYa.status)
      {
      default:
        this.ngo.setText(2131300237);
        AppMethodBeat.o(112146);
        break;
      case 0:
        if (this.ngS != null)
          break label150;
        this.ngo.setVisibility(8);
        this.nlN.setVisibility(8);
        AppMethodBeat.o(112146);
      }
    }
    label150: this.ngo.setVisibility(0);
    this.nlN.setVisibility(0);
    switch (this.ngS.status)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(112146);
      break;
      this.ngo.setText(2131300237);
      AppMethodBeat.o(112146);
      break;
      this.ngo.setText(2131300238);
      AppMethodBeat.o(112146);
      break;
      this.ngo.setText(2131300236);
      AppMethodBeat.o(112146);
      break;
      this.ngo.setText(2131300239);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112148);
    paramView = new d(getContext());
    k localk = new k(this.mYa);
    paramView.a(this.mYa, localk);
    AppMethodBeat.o(112148);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112145);
    super.onFinishInflate();
    this.gsf = ((TextView)findViewById(2131824470));
    this.nlM = ((TextView)findViewById(2131824471));
    this.ngo = ((TextView)findViewById(2131824472));
    this.nlN = ((ImageView)findViewById(2131824473));
    ab.i("MicroMsg.GameRankHeadView", "initView finished");
    AppMethodBeat.o(112145);
  }

  public void setData(GameDetailRankUI.a parama)
  {
    AppMethodBeat.i(112147);
    this.gsf.setText(parama.ngJ);
    this.nlM.setText(parama.ngK);
    this.mYa = parama.ngL;
    this.mYa.cKG = 1203;
    this.mYa.position = 2;
    if (this.ngS == null)
      this.ngS = new k(this.mYa);
    this.ngS.ei(getContext());
    this.ngS.biT();
    bFm();
    if (this.ngQ != null)
      j.a(this.ngQ);
    while (true)
    {
      this.ngo.setOnClickListener(this);
      AppMethodBeat.o(112147);
      return;
      this.ngQ = new GameRankHeadView.1(this);
      j.a(this.ngQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRankHeadView
 * JD-Core Version:    0.6.2
 */