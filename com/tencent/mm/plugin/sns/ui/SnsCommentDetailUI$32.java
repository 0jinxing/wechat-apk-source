package com.tencent.mm.plugin.sns.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.lucky.ui.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsCommentDetailUI$32
  implements View.OnClickListener
{
  SnsCommentDetailUI$32(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn, TextView paramTextView1, TextView paramTextView2, ImageView paramImageView1, ImageView paramImageView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38815);
    ab.d("MicroMsg.SnsCommentDetailUI", "showComment click" + SnsCommentDetailUI.E(this.rqN).getVisibility());
    paramView = this.rhJ.cqu();
    if ((paramView != null) && (paramView.xfI.wbJ == 21) && (!m.Xx(this.rhJ.cqU())))
    {
      a.f(this.rqN.mController.ylL, this.rqN.rqJ.DT(0));
      AppMethodBeat.o(38815);
    }
    while (true)
    {
      return;
      if (SnsCommentDetailUI.E(this.rqN).getVisibility() == 0)
      {
        SnsCommentDetailUI.g(this.rqN);
        AppMethodBeat.o(38815);
      }
      else
      {
        SnsCommentDetailUI.E(this.rqN).setVisibility(0);
        SnsCommentDetailUI.E(this.rqN).startAnimation(SnsCommentDetailUI.G(this.rqN));
        if (SnsCommentDetailUI.C(this.rqN) == 10)
          SnsCommentDetailUI.w(this.rqN).findViewById(2131821027).setBackgroundResource(2130838858);
        if (!v.Zo(SnsCommentDetailUI.o(this.rqN)))
        {
          this.rqN.rpT.setEnabled(false);
          this.rqN.rpU.setEnabled(false);
          this.rqY.setText(this.rqN.getString(2131303688));
          this.rqY.setTextColor(this.rqN.getResources().getColor(2131690478));
          this.rqZ.setTextColor(this.rqN.getResources().getColor(2131690478));
          if (SnsCommentDetailUI.C(this.rqN) == 10)
          {
            this.rra.setImageResource(2131231319);
            AppMethodBeat.o(38815);
          }
          else
          {
            this.rra.setImageResource(2131231322);
            AppMethodBeat.o(38815);
          }
        }
        else
        {
          this.rqN.rpT.setEnabled(true);
          this.rra.setImageResource(2130838862);
          this.rqN.rpU.setEnabled(true);
          this.rqY.setTextColor(this.rqN.getResources().getColor(2131690691));
          this.rqZ.setTextColor(this.rqN.getResources().getColor(2131690691));
          paramView = h.YS(SnsCommentDetailUI.o(this.rqN));
          if (SnsCommentDetailUI.C(this.rqN) == 10)
          {
            this.rra.setImageResource(2130839218);
            this.rrb.setImageResource(2130839219);
            this.rqY.setTextColor(this.rqN.getResources().getColor(2131690487));
            this.rqZ.setTextColor(this.rqN.getResources().getColor(2131690487));
          }
          while (true)
          {
            if (paramView.field_likeFlag != 0)
              break label552;
            this.rqY.setText(this.rqN.getString(2131303688));
            AppMethodBeat.o(38815);
            break;
            this.rra.setImageResource(2130838862);
            this.rqY.setTextColor(this.rqN.getResources().getColor(2131690691));
            this.rqZ.setTextColor(this.rqN.getResources().getColor(2131690691));
          }
          label552: this.rqY.setText(this.rqN.getString(2131303650));
          AppMethodBeat.o(38815);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.32
 * JD-Core Version:    0.6.2
 */