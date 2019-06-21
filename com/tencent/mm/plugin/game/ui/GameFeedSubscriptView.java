package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.n;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedSubscriptView extends LinearLayout
  implements View.OnClickListener
{
  private ImageView kEn;
  private ad niK;
  private TextView niP;
  private TextView niQ;
  private LinearLayout niR;
  private TextView niS;
  private TextView niT;
  private TextView niU;

  public GameFeedSubscriptView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void wJ(int paramInt)
  {
    AppMethodBeat.i(111953);
    if (paramInt == 1);
    for (String str = a.T(this.niK.mZL, "clickType", "leftCorner"); ; str = a.T(this.niK.mZL, "clickType", "rightCorner"))
    {
      b.a(getContext(), 10, 1024, this.niK.mZN, 7, this.niK.fKh, GameIndexListView.getSourceScene(), str);
      AppMethodBeat.o(111953);
      return;
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111952);
    if (this.niK == null)
      AppMethodBeat.o(111952);
    while (true)
    {
      return;
      if ((paramView.getId() == 2131824499) || (paramView.getId() == 2131824500) || (paramView.getId() == 2131824502))
      {
        if ((this.niK.naK != null) && (!bo.isNullOrNil(this.niK.naK.mZj)))
        {
          c.ax(getContext(), this.niK.naK.mZj);
          wJ(1);
          AppMethodBeat.o(111952);
        }
      }
      else
      {
        if ((paramView.getId() == 2131824501) && (this.niK.naL != null) && (!bo.isNullOrNil(this.niK.naL.mZj)))
        {
          c.ax(getContext(), this.niK.naL.mZj);
          wJ(2);
        }
        AppMethodBeat.o(111952);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111950);
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(2130969715, this, true);
    this.niP = ((TextView)localView.findViewById(2131824499));
    this.niQ = ((TextView)localView.findViewById(2131824500));
    this.niR = ((LinearLayout)localView.findViewById(2131824502));
    this.kEn = ((ImageView)localView.findViewById(2131823704));
    this.niS = ((TextView)localView.findViewById(2131821045));
    this.niT = ((TextView)localView.findViewById(2131824503));
    this.niU = ((TextView)localView.findViewById(2131824501));
    this.niP.setOnClickListener(this);
    this.niQ.setOnClickListener(this);
    this.niR.setOnClickListener(this);
    this.niU.setOnClickListener(this);
    AppMethodBeat.o(111950);
  }

  public void setData(ad paramad)
  {
    AppMethodBeat.i(111951);
    if ((paramad == null) || ((paramad.naK == null) && (paramad.naL == null)))
    {
      setVisibility(8);
      AppMethodBeat.o(111951);
    }
    while (true)
    {
      return;
      this.niK = paramad;
      setVisibility(0);
      this.niP.setVisibility(8);
      this.niQ.setVisibility(8);
      this.niR.setVisibility(8);
      if (paramad.naK != null)
        switch (paramad.naK.mZX)
        {
        default:
        case 2:
        case 1:
        case 3:
        }
      while (true)
      {
        if (paramad.naL == null)
          break label293;
        this.niU.setText(paramad.naL.Desc);
        this.niU.setVisibility(0);
        AppMethodBeat.o(111951);
        break;
        this.niP.setVisibility(0);
        this.niP.setText(paramad.naK.Desc);
        continue;
        this.niQ.setVisibility(0);
        this.niQ.setText(paramad.naK.Desc);
        continue;
        this.niR.setVisibility(0);
        if (!bo.isNullOrNil(paramad.naK.mZW))
        {
          e.a.a locala = new e.a.a();
          locala.eQf = true;
          e.bFH().a(this.kEn, paramad.naK.mZW, locala.bFI());
          this.kEn.setVisibility(0);
        }
        this.niS.setText(paramad.naK.Name);
        this.niT.setText(paramad.naK.Desc);
      }
      label293: this.niU.setVisibility(8);
      AppMethodBeat.o(111951);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedSubscriptView
 * JD-Core Version:    0.6.2
 */