package com.tencent.mm.plugin.account.friend.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ah.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;

public final class e extends d
{
  private final int Zb;
  private final MMActivity crP;
  private String gtz;
  private final a gxE;
  private final c gxF;
  private d.a gxG;
  boolean gxH;
  private e.a gxI;

  public e(MMActivity paramMMActivity, int paramInt)
  {
    super(paramMMActivity, new ao());
    AppMethodBeat.i(108595);
    this.gxH = false;
    this.gxI = new e.1(this);
    this.crP = paramMMActivity;
    this.Zb = paramInt;
    this.gxH = paramMMActivity.getIntent().getBooleanExtra("qqgroup_sendmessage", false);
    this.gxE = new a(paramMMActivity, new e.2(this));
    this.gxF = new c(paramMMActivity, new e.3(this));
    AppMethodBeat.o(108595);
  }

  public final void KC()
  {
    AppMethodBeat.i(108598);
    bIf();
    if (bo.isNullOrNil(this.gtz))
      setCursor(((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).E(this.Zb, this.gxH));
    while (true)
    {
      if ((this.gxG != null) && (this.gtz != null))
        this.gxG.mT(getCursor().getCount());
      notifyDataSetChanged();
      AppMethodBeat.o(108598);
      return;
      setCursor(((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).c(this.Zb, this.gtz, this.gxH));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(108597);
    KC();
    AppMethodBeat.o(108597);
  }

  public final void a(d.a parama)
  {
    this.gxG = parama;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(108599);
    ao localao = (ao)getItem(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.crP, 2130970420, null);
      paramViewGroup = new e.b(this, paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtF = paramInt;
      paramViewGroup.gxL = localao.gwC;
      paramViewGroup.status = localao.gwD;
      paramViewGroup.gtG.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.crP, localao.getDisplayName(), paramViewGroup.gtG.getTextSize()));
      if (p.cB(localao.gwC) == 0)
        break label621;
    }
    label162: label208: label621: for (Bitmap localBitmap = b.fr(localao.gwC); ; localBitmap = null)
    {
      if (localBitmap == null)
      {
        paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231172));
        if (!this.gxH)
          break label208;
        paramViewGroup.gtH.setVisibility(8);
      }
      while (true)
      {
        AppMethodBeat.o(108599);
        return paramView;
        paramViewGroup = (e.b)paramView.getTag();
        break;
        paramViewGroup.eks.setImageBitmap(localBitmap);
        break label162;
        switch (localao.gwD)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
        while (true)
          switch (localao.frT)
          {
          default:
            break;
          case 0:
          case 2:
            paramViewGroup.gnh.setVisibility(0);
            paramViewGroup.gtI.setVisibility(4);
            break;
            if (localao.frT == 2)
            {
              paramViewGroup.gtH.setClickable(false);
              paramViewGroup.gtH.setBackgroundDrawable(null);
              paramViewGroup.gnh.setText(2131300088);
              paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690205));
            }
            else
            {
              paramViewGroup.gtH.setClickable(true);
              paramViewGroup.gtH.setBackgroundResource(2130838000);
              paramViewGroup.gnh.setText(2131300087);
              paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690691));
              continue;
              if ((((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoJ(localao.getUsername())) || (r.Yz().equals(localao.getUsername())))
              {
                paramViewGroup.gtH.setClickable(false);
                paramViewGroup.gtH.setBackgroundDrawable(null);
                paramViewGroup.gnh.setText(2131300086);
                paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690205));
              }
              else if (localao.frT == 2)
              {
                paramViewGroup.gtH.setClickable(false);
                paramViewGroup.gtH.setBackgroundDrawable(null);
                paramViewGroup.gnh.setText(2131300091);
                paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690205));
              }
              else
              {
                paramViewGroup.gtH.setClickable(true);
                paramViewGroup.gtH.setBackgroundResource(2130838000);
                paramViewGroup.gnh.setText(2131300085);
                paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690691));
              }
            }
            break;
          case 1:
          }
        paramViewGroup.gnh.setVisibility(4);
        paramViewGroup.gtI.setVisibility(0);
      }
    }
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(108600);
    notifyDataSetChanged();
    AppMethodBeat.o(108600);
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(108596);
    this.gtz = bo.vA(paramString.trim());
    bIf();
    KC();
    AppMethodBeat.o(108596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e
 * JD-Core Version:    0.6.2
 */