package com.tencent.mm.plugin.brandservice.ui.base;

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

final class BrandServiceSortView$2
  implements c.a
{
  BrandServiceSortView$2(BrandServiceSortView paramBrandServiceSortView)
  {
  }

  public final View a(com.tencent.mm.ui.base.sortview.d paramd, View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(14059);
    long l = bo.yz();
    Context localContext = this.jMW.getContext();
    BrandServiceSortView.b localb;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(localContext).inflate(2130968885, null);
      localb = new BrandServiceSortView.b();
      localb.jKK = ((TextView)paramView.findViewById(2131821694));
      localb.contentView = paramView.findViewById(2131821695);
      localb.ejo = ((ImageView)paramView.findViewById(2131821898));
      localb.jMg = ((ImageView)paramView.findViewById(2131821901));
      localb.ejp = ((TextView)paramView.findViewById(2131821900));
      localb.jMh = paramView.findViewById(2131821897);
      paramView.setTag(localb);
    }
    lk locallk;
    while (true)
    {
      locallk = (lk)paramd.data;
      if (locallk != null)
        break;
      ab.e("MicroMsg.BrandServiceSortView", "should not be empty");
      AppMethodBeat.o(14059);
      return paramView;
      localb = (BrandServiceSortView.b)paramView.getTag();
    }
    if ((this.jMW.yDy) && (paramBoolean1))
    {
      localb.jKK.setText(paramd.yDG);
      localb.jKK.setVisibility(0);
      label206: localb.username = locallk.userName;
      localb.ejo.setTag(locallk.userName);
      a.b.r(localb.ejo, localb.username);
      paramd = locallk.ehM.Oj();
      BrandServiceSortView.a(this.jMW, localb.ejp, localContext, paramd, (int)localb.ejp.getTextSize());
      ab.v("MicroMsg.BrandServiceSortView", "bizinfo status%d", new Object[] { Integer.valueOf(locallk.pkW.field_status) });
      paramd = localb.jMg;
      if ((!BrandServiceSortView.c(this.jMW)) || (locallk.pkW.field_status != 1))
        break label462;
      paramInt = 0;
      label330: paramd.setVisibility(paramInt);
      if ((this.jMW.getMode() != 0) || (!paramBoolean2))
        break label468;
      localb.jMh.setBackgroundResource(2130838398);
      label360: if (!this.jMW.yDz)
        break label481;
      localb.contentView.setPadding(localb.contentView.getPaddingLeft(), localb.contentView.getPaddingTop(), (int)this.jMW.getContext().getResources().getDimension(2131427498), localb.contentView.getPaddingBottom());
    }
    while (true)
    {
      ab.v("MicroMsg.BrandServiceSortView", "get view use %d ms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(14059);
      break;
      localb.jKK.setVisibility(8);
      break label206;
      label462: paramInt = 8;
      break label330;
      label468: localb.jMh.setBackgroundResource(2130839162);
      break label360;
      label481: localb.contentView.setPadding(localb.contentView.getPaddingLeft(), localb.contentView.getPaddingTop(), (int)this.jMW.getContext().getResources().getDimension(2131427812), localb.contentView.getPaddingBottom());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.2
 * JD-Core Version:    0.6.2
 */