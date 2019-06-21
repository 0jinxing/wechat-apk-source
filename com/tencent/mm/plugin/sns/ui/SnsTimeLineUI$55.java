package com.tencent.mm.plugin.sns.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.storage.az;
import java.util.LinkedList;

final class SnsTimeLineUI$55
  implements Runnable
{
  SnsTimeLineUI$55(SnsTimeLineUI paramSnsTimeLineUI, LayoutInflater paramLayoutInflater, TimeLineObject paramTimeLineObject, n paramn, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39530);
    View localView = this.kqR.inflate(2130970764, SnsTimeLineUI.C(this.rzs), false);
    SnsTimeLineUI.C(this.rzs).addView(localView);
    if (SnsTimeLineUI.C(this.rzs).getChildCount() > 0)
      SnsTimeLineUI.C(this.rzs).setVisibility(0);
    Object localObject = (ImageView)localView.findViewById(2131827768);
    TextView localTextView = (TextView)localView.findViewById(2131827769);
    if (this.rqU.xfI.wbK.size() > 0)
    {
      bau localbau = (bau)this.rqU.xfI.wbK.get(0);
      g localg = af.cnC();
      int i = this.rzs.hashCode();
      az localaz = az.dtg();
      localaz.oyB = this.rqU.pcX;
      localg.b(localbau, (View)localObject, i, localaz);
    }
    if (this.rqU.xfI.wbJ == 1)
    {
      localTextView.setText(2131303736);
      localObject = this.rzs.getString(2131303737);
    }
    while (true)
    {
      localView.setOnClickListener(new SnsTimeLineUI.55.1(this, (String)localObject));
      AppMethodBeat.o(39530);
      return;
      if (this.rqU.xfI.wbJ == 15)
      {
        localTextView.setText(2131303773);
        localObject = this.rzs.getString(2131303774);
      }
      else
      {
        localObject = "";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.55
 * JD-Core Version:    0.6.2
 */