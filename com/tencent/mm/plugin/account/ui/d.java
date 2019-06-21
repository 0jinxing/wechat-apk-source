package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.plugin.account.friend.a.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;

@Deprecated
final class d extends p<com.tencent.mm.plugin.account.friend.a.g>
{
  d.a gBa;
  private int[] gty;
  private String gtz;

  public d(Context paramContext, p.a parama)
  {
    super(paramContext, new com.tencent.mm.plugin.account.friend.a.g());
    AppMethodBeat.i(124801);
    super.a(parama);
    AppMethodBeat.o(124801);
  }

  public final void KC()
  {
    AppMethodBeat.i(124803);
    setCursor(com.tencent.mm.plugin.account.a.getFacebookFrdStg().wa(this.gtz));
    this.gty = new int[getCount()];
    if ((this.gBa != null) && (this.gtz != null))
      this.gBa.mT(getCursor().getCount());
    super.notifyDataSetChanged();
    AppMethodBeat.o(124803);
  }

  public final void KD()
  {
    AppMethodBeat.i(124802);
    KC();
    AppMethodBeat.o(124802);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(124805);
    Object localObject = (com.tencent.mm.plugin.account.friend.a.g)getItem(paramInt);
    if (paramView == null)
    {
      paramViewGroup = new d.b();
      paramView = View.inflate(this.context, 2130969483, null);
      paramViewGroup.eks = ((ImageView)paramView.findViewById(2131823840));
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131823841));
      paramViewGroup.gvr = ((TextView)paramView.findViewById(2131823844));
      paramViewGroup.gBb = ((TextView)paramView.findViewById(2131823842));
      paramViewGroup.gBc = ((TextView)paramView.findViewById(2131823843));
      paramViewGroup.gBd = ((ImageView)paramView.findViewById(2131823845));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtG.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, ((com.tencent.mm.plugin.account.friend.a.g)localObject).apL(), paramViewGroup.gtG.getTextSize()));
      paramViewGroup.gBc.setVisibility(8);
      paramViewGroup.gBd.setVisibility(0);
      switch (this.gty[paramInt])
      {
      case 1:
      default:
        label196: localObject = b.pS(((com.tencent.mm.plugin.account.friend.a.g)localObject).dtU);
        if (localObject == null)
          paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231172));
        break;
      case 2:
      case 0:
      }
    }
    while (true)
    {
      AppMethodBeat.o(124805);
      return paramView;
      paramViewGroup = (d.b)paramView.getTag();
      break;
      paramViewGroup.gBb.setVisibility(8);
      paramViewGroup.gvr.setVisibility(0);
      paramViewGroup.gvr.setText(2131300090);
      paramViewGroup.gvr.setTextColor(this.context.getResources().getColor(2131689657));
      break label196;
      if ((((com.tencent.mm.plugin.account.friend.a.g)localObject).status != 102) && (!((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoJ(((com.tencent.mm.plugin.account.friend.a.g)localObject).getUsername())))
      {
        paramViewGroup.gvr.setVisibility(8);
        paramViewGroup.gBb.setVisibility(0);
        break label196;
      }
      if (((com.tencent.mm.plugin.account.friend.a.g)localObject).status == 102)
      {
        paramViewGroup.gvr.setVisibility(8);
        paramViewGroup.gBb.setVisibility(8);
        paramViewGroup.gBd.setVisibility(8);
        break label196;
      }
      paramViewGroup.gvr.setVisibility(0);
      paramViewGroup.gvr.setText(2131300086);
      paramViewGroup.gvr.setTextColor(this.context.getResources().getColor(2131689656));
      paramViewGroup.gBb.setVisibility(8);
      break label196;
      paramViewGroup.eks.setImageBitmap((Bitmap)localObject);
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(124804);
    this.gtz = bo.vA(paramString.trim());
    bIf();
    KC();
    AppMethodBeat.o(124804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.d
 * JD-Core Version:    0.6.2
 */