package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;

final class EnterpriseBizContactListView$3
  implements c.a
{
  EnterpriseBizContactListView$3(EnterpriseBizContactListView paramEnterpriseBizContactListView)
  {
  }

  public final View a(com.tencent.mm.ui.base.sortview.d paramd, View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(13957);
    long l = bo.yz();
    Context localContext = this.jLZ.getContext();
    EnterpriseBizContactListView.c localc;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(localContext).inflate(2130969395, null);
      localc = new EnterpriseBizContactListView.c();
      localc.jKK = ((TextView)paramView.findViewById(2131821694));
      localc.contentView = paramView.findViewById(2131821695);
      localc.ejo = ((ImageView)paramView.findViewById(2131821898));
      localc.jMg = ((ImageView)paramView.findViewById(2131821901));
      localc.ejp = ((TextView)paramView.findViewById(2131821900));
      localc.jMh = paramView.findViewById(2131821897);
      paramView.setTag(localc);
    }
    lk locallk;
    while (true)
    {
      locallk = (lk)paramd.data;
      if (locallk != null)
        break;
      ab.e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
      AppMethodBeat.o(13957);
      return paramView;
      localc = (EnterpriseBizContactListView.c)paramView.getTag();
    }
    paramInt = 0;
    if (locallk.pkW.adR())
      paramInt = 1;
    if ((this.jLZ.yDy) && (paramBoolean1))
      if (paramd.yDG.equals("!2"))
      {
        localc.jKK.setText(this.jLZ.getContext().getString(2131299233));
        localc.jKK.setVisibility(0);
        label241: if (paramInt == 0)
          break label511;
        localc.username = locallk.userName;
        localc.ejo.setImageResource(2131231244);
        paramd = this.jLZ.getResources().getString(2131299214);
        EnterpriseBizContactListView.a(localc.ejp, localContext, paramd, (int)localc.ejp.getTextSize());
        label298: ab.v("MicroMsg.BrandService.EnterpriseBizContactListView", "bizinfo status%d", new Object[] { Integer.valueOf(locallk.pkW.field_status) });
        paramd = localc.jMg;
        if (locallk.pkW.field_status != 1)
          break label592;
        paramInt = 0;
        label343: paramd.setVisibility(paramInt);
        if ((this.jLZ.getMode() != 0) || (!paramBoolean2))
          break label598;
        localc.jMh.setBackgroundResource(2130838398);
        label373: if (!this.jLZ.yDz)
          break label612;
        localc.contentView.setPadding(localc.contentView.getPaddingLeft(), localc.contentView.getPaddingTop(), (int)this.jLZ.getContext().getResources().getDimension(2131427498), localc.contentView.getPaddingBottom());
      }
    while (true)
    {
      ab.v("MicroMsg.BrandService.EnterpriseBizContactListView", "get view use %d ms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(13957);
      break;
      if (!paramd.yDG.equals("!1"))
      {
        localc.jKK.setText(paramd.yDG);
        localc.jKK.setVisibility(0);
        break label241;
      }
      localc.jKK.setVisibility(8);
      break label241;
      label511: localc.username = locallk.userName;
      localc.iconUrl = locallk.pkW.field_brandIconURL;
      localc.ejo.setTag(locallk.userName);
      a.b.b(localc.ejo, localc.username);
      paramd = locallk.ehM.Oj();
      EnterpriseBizContactListView.a(localc.ejp, localContext, paramd, (int)localc.ejp.getTextSize());
      break label298;
      label592: paramInt = 8;
      break label343;
      label598: localc.jMh.setBackgroundResource(2130839162);
      break label373;
      label612: localc.contentView.setPadding(localc.contentView.getPaddingLeft(), localc.contentView.getPaddingTop(), (int)this.jLZ.getContext().getResources().getDimension(2131427812), localc.contentView.getPaddingBottom());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.3
 * JD-Core Version:    0.6.2
 */