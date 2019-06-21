package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.p.a;

public final class c extends b
{
  private b.a gtA;
  private b.b gtB;
  private int[] gty;
  private String gtz;

  public c(Context paramContext, p.a parama)
  {
    super(paramContext, new com.tencent.mm.plugin.account.friend.a.a());
    AppMethodBeat.i(13700);
    this.gtB = new c.1(this);
    super.a(parama);
    this.context = paramContext;
    AppMethodBeat.o(13700);
  }

  public final void KC()
  {
    AppMethodBeat.i(13703);
    bIf();
    setCursor(((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vU(this.gtz));
    this.gty = new int[getCount()];
    if ((this.gtA != null) && (this.gtz != null))
      this.gtA.mT(getCursor().getCount());
    notifyDataSetChanged();
    AppMethodBeat.o(13703);
  }

  public final void KD()
  {
    AppMethodBeat.i(13702);
    KC();
    AppMethodBeat.o(13702);
  }

  public final void a(b.a parama)
  {
    this.gtA = parama;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(13704);
    com.tencent.mm.plugin.account.friend.a.a locala = (com.tencent.mm.plugin.account.friend.a.a)getItem(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130970236, null);
      paramViewGroup = new c.a(this, paramView);
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131824020));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtF = paramInt;
      paramViewGroup.cvZ = locala.Aq();
      paramViewGroup.status = locala.status;
      paramViewGroup.gtG.setText(locala.apA());
      switch (locala.status)
      {
      default:
        label124: switch (locala.frT)
        {
        default:
        case 1:
        case 0:
        case 2:
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(13704);
      return paramView;
      paramViewGroup = (c.a)paramView.getTag();
      break;
      if (locala.frT == 2)
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300088);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label124;
      }
      paramViewGroup.gtH.setClickable(true);
      paramViewGroup.gtH.setBackgroundResource(2130838000);
      paramViewGroup.gnh.setText(2131300087);
      paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690691));
      break label124;
      ab.d("MicroMsg.MobileFriendAdapter", "username:%s", new Object[] { locala.getUsername() });
      if ((((j)g.K(j.class)).XM().aoJ(locala.getUsername())) || (r.Yz().equals(locala.getUsername())))
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300086);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label124;
      }
      if (locala.frT == 2)
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300091);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label124;
      }
      paramViewGroup.gtH.setClickable(true);
      paramViewGroup.gtH.setBackgroundResource(2130838000);
      paramViewGroup.gnh.setText(2131300085);
      paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690691));
      break label124;
      paramViewGroup.gnh.setVisibility(4);
      paramViewGroup.gtI.setVisibility(0);
      continue;
      paramViewGroup.gnh.setVisibility(0);
      paramViewGroup.gtI.setVisibility(4);
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(13701);
    this.gtz = bo.vA(paramString.trim());
    bIf();
    KC();
    AppMethodBeat.o(13701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.c
 * JD-Core Version:    0.6.2
 */