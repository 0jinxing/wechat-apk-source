package com.tencent.mm.plugin.sns.ui;

import android.os.StrictMode;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.cbf;

final class i$1$2
  implements Runnable
{
  i$1$2(i.1 param1, n paramn, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38166);
    if (this.rhI.rhF.rhn != null)
      this.rhI.rhF.rhn.qMn.w(this.rhJ);
    Object localObject1;
    Object localObject2;
    int i;
    if (this.rhK.rHu == 0)
    {
      localObject1 = aj.q(this.rhJ);
      localObject2 = com.tencent.mm.modelsns.b.lY(707);
      ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j(this.rhJ)).mb(this.rhJ.field_type).cS(this.rhJ.DI(32)).tx(this.rhJ.crc()).tx(this.rhJ.field_userName).mb(((cbf)localObject1).xao).mb(((cbf)localObject1).xar);
      ((com.tencent.mm.modelsns.b)localObject2).ajK();
      StrictMode.allowThreadDiskReads();
      this.rhK.rHu = 1;
      this.rhJ.field_likeFlag = this.rhK.rHu;
      h.a(this.rhJ.cqA(), this.rhJ);
      ((TextView)this.mqd.findViewById(2131827696)).setText(2131303650);
      localObject1 = this.rhJ;
      if (this.rhJ.DI(32))
      {
        i = 7;
        am.a.a((n)localObject1, i, "", 0);
      }
    }
    while (true)
    {
      localObject2 = this.rhI.rhF.qPr;
      LinearLayout localLinearLayout = (LinearLayout)this.mqd;
      localObject1 = new i.1.2.1(this);
      ImageView localImageView = (ImageView)localLinearLayout.findViewById(2131827695);
      ScaleAnimation localScaleAnimation = new ScaleAnimation(0.9F, 1.2F, 0.9F, 1.2F, 1, 0.5F, 1, 0.5F);
      localScaleAnimation.setDuration(400L);
      localScaleAnimation.setStartOffset(100L);
      localScaleAnimation.setRepeatCount(0);
      localImageView.clearAnimation();
      localImageView.startAnimation(localScaleAnimation);
      localScaleAnimation.setAnimationListener(new au.9((au)localObject2, localLinearLayout, (Runnable)localObject1));
      AppMethodBeat.o(38166);
      return;
      i = 1;
      break;
      this.rhK.rHu = 0;
      this.rhJ.field_likeFlag = this.rhK.rHu;
      h.a(this.rhJ.cqA(), this.rhJ);
      ((TextView)this.mqd.findViewById(2131827696)).setText(2131303688);
      am.a.Yd(this.rhJ.cqA());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.1.2
 * JD-Core Version:    0.6.2
 */