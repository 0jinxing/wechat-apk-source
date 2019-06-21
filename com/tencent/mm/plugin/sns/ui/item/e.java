package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.bc;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.util.LinkedList;

public final class e extends BaseTimeLineItem
{
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40150);
    String str = paramav.riA;
    if (!paramTimeLineObject.xfI.wbK.isEmpty())
    {
      paramBaseViewHolder.rHF.setPosition(paramInt1);
      paramBaseViewHolder.rvR.setVisibility(0);
      paramav = (bau)paramTimeLineObject.xfI.wbK.get(0);
      g localg = af.cnC();
      Object localObject1 = paramBaseViewHolder.rHF;
      paramInt1 = this.mActivity.hashCode();
      Object localObject2 = az.dtg();
      ((az)localObject2).oyB = paramTimeLineObject.pcX;
      localg.a(paramav, (View)localObject1, 2131230800, paramInt1, (az)localObject2);
      paramBaseViewHolder.rhd.setPressed(false);
      localObject2 = paramTimeLineObject.Id;
      if (com.tencent.mm.aw.a.aie())
      {
        localObject1 = com.tencent.mm.aw.a.aih();
        if ((localObject1 != null) && (com.tencent.mm.aw.a.d((com.tencent.mm.aw.e)localObject1)) && (((String)localObject2).equals(((com.tencent.mm.aw.e)localObject1).fJU)))
        {
          paramInt1 = 1;
          if (paramInt1 == 0)
            break label347;
          paramBaseViewHolder.rhd.setImageResource(2130839637);
          label171: paramBaseViewHolder.rHF.setTag(new q(paramTimeLineObject, str));
          paramBaseViewHolder.rHF.setOnClickListener(paramau.rqg.rDA);
          paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, str));
          paramau.jMO.c(paramBaseViewHolder.rvR, paramau.qOL.rJW, paramau.qOL.rJH);
          paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rvD);
          paramTimeLineObject = paramav.Desc;
          if (bo.isNullOrNil(paramTimeLineObject))
            break label359;
          paramBaseViewHolder.rHG.setVisibility(0);
          paramBaseViewHolder.rHG.setText(paramTimeLineObject);
          label296: paramav = paramav.Title;
          if (bo.isNullOrNil(paramav))
            break label370;
          paramBaseViewHolder.gne.setVisibility(0);
          paramav = new SpannableString(paramav);
          paramBaseViewHolder.gne.setText(paramav, TextView.BufferType.SPANNABLE);
          AppMethodBeat.o(40150);
        }
      }
    }
    while (true)
    {
      return;
      paramInt1 = 0;
      break;
      label347: paramBaseViewHolder.rhd.setImageResource(2130839639);
      break label171;
      label359: paramBaseViewHolder.rHG.setVisibility(4);
      break label296;
      label370: paramBaseViewHolder.gne.setVisibility(8);
      AppMethodBeat.o(40150);
      continue;
      paramBaseViewHolder.rvR.setVisibility(8);
      AppMethodBeat.o(40150);
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40149);
    if (paramBaseViewHolder.rHC != null)
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970780);
      paramBaseViewHolder.rIl = ((ViewStub)paramBaseViewHolder.mRR.findViewById(2131827717));
      if ((!paramBaseViewHolder.rIm) && (paramBaseViewHolder.rIl != null))
        paramBaseViewHolder.rIn = paramBaseViewHolder.rIl.inflate();
    }
    for (paramBaseViewHolder.rIm = true; ; paramBaseViewHolder.rIm = true)
    {
      paramBaseViewHolder.rvR = paramBaseViewHolder.rIn;
      paramBaseViewHolder.rvR.findViewById(2131824637).setOnTouchListener(this.qPr.riQ);
      paramBaseViewHolder.rHF = ((TagImageView)paramBaseViewHolder.rvR.findViewById(2131825687));
      paramBaseViewHolder.rhd = ((ImageView)paramBaseViewHolder.rvR.findViewById(2131824637));
      paramBaseViewHolder.rHG = ((TextView)paramBaseViewHolder.rvR.findViewById(2131825690));
      paramBaseViewHolder.gne = ((TextView)paramBaseViewHolder.rvR.findViewById(2131825689));
      paramBaseViewHolder.gne.setTextColor(this.mActivity.getResources().getColor(2131690481));
      paramBaseViewHolder.gne.setMaxLines(1);
      i.b(paramBaseViewHolder.rHF, this.mActivity);
      AppMethodBeat.o(40149);
      return;
      paramBaseViewHolder.rIn = paramBaseViewHolder.mRR.findViewById(2131827798);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.e
 * JD-Core Version:    0.6.2
 */