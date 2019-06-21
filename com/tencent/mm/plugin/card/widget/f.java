package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;

public final class f extends a
{
  protected TextView gnB;
  public ArrayList<od> kaY;
  private View ksI;
  private ImageView ksJ;
  private TextView ksK;
  private TextView ksL;
  private View ksM;
  private TextView ksN;
  private TextView ksO;
  private ImageView ksP;
  private TextView ksQ;

  public f(Context paramContext)
  {
    super(paramContext);
  }

  protected final void beJ()
  {
    AppMethodBeat.i(88985);
    this.gnB = ((TextView)beI().findViewById(2131822004));
    this.ksI = beI().findViewById(2131822002);
    this.ksJ = ((ImageView)beI().findViewById(2131822339));
    this.ksK = ((TextView)beI().findViewById(2131822340));
    this.ksL = ((TextView)beI().findViewById(2131822341));
    this.ksM = beI().findViewById(2131822342);
    this.ksN = ((TextView)beI().findViewById(2131822344));
    this.ksO = ((TextView)beI().findViewById(2131822345));
    this.ksP = ((ImageView)beI().findViewById(2131822343));
    this.ksQ = ((TextView)beI().findViewById(2131822346));
    AppMethodBeat.o(88985);
  }

  protected final void beK()
  {
    AppMethodBeat.i(88986);
    label129: label206: Object localObject;
    StringBuilder localStringBuilder;
    tm localtm2;
    if ((this.kaS.aZV().vUy != null) && (!TextUtils.isEmpty(this.kaS.aZV().vUy.title)))
    {
      this.iPD.setText(this.kaS.aZV().vUy.title);
      if ((this.kaS.aZV().vUy == null) || (TextUtils.isEmpty(this.kaS.aZV().vUy.kbW)))
        break label604;
      this.gnB.setText(this.kaS.aZV().vUy.kbW);
      this.gnB.setVisibility(0);
      ab.i("MicroMsg.CardWidgetTicket", "updateContentView()");
      if (bo.isNullOrNil(this.kaS.aZV().vUe))
        break label625;
      int i = this.mContext.getResources().getDimensionPixelSize(2131428196);
      m.a(this.mContext, this.ksJ, this.kaS.aZV().vUe, i, l.Hn(this.kaS.aZV().color));
      localObject = new StringBuilder();
      localStringBuilder = new StringBuilder();
      if ((this.kaS.aZV().vTW == null) || (this.kaS.aZV().vTW.size() < 2))
        break label652;
      ab.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
      tm localtm1 = (tm)this.kaS.aZV().vTW.get(0);
      localtm2 = (tm)this.kaS.aZV().vTW.get(1);
      ((StringBuilder)localObject).append(localtm1.title).append(" - ").append(localtm2.title);
      if ((!TextUtils.isEmpty(localtm1.kbX)) && (!TextUtils.isEmpty(localtm2.kbX)))
      {
        localStringBuilder.append(localtm1.kbX).append(" ").append(localtm1.kbW);
        localStringBuilder.append(" - ");
        localStringBuilder.append(localtm2.kbX).append(" ").append(localtm2.kbW);
      }
      label403: if (TextUtils.isEmpty(((StringBuilder)localObject).toString()))
        break label737;
      this.ksK.setText(((StringBuilder)localObject).toString());
      label424: if (TextUtils.isEmpty(localStringBuilder.toString()))
        break label749;
      ab.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
      this.ksL.setText(localStringBuilder.toString());
      this.ksL.setVisibility(0);
      label460: ab.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.kaS.aZV().vUa);
      if (this.kaS.aZV().vUa > 0)
        break label816;
      this.ksM.setVisibility(8);
      this.ksQ.setVisibility(8);
      label525: if (!this.kaS.aZU())
        break label1198;
      this.ksI.setVisibility(8);
      AppMethodBeat.o(88986);
    }
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(this.kaS.aZV().kdg))
      {
        this.iPD.setText(this.kaS.aZV().kdg);
        break;
      }
      this.iPD.setText("");
      break;
      label604: this.gnB.setText("");
      this.gnB.setVisibility(8);
      break label129;
      label625: m.a(this.ksJ, 2130838129, l.Hn(this.kaS.aZV().color));
      break label206;
      label652: if ((this.kaS.aZV().vTW == null) || (this.kaS.aZV().vTW.size() != 1))
        break label403;
      ab.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
      localtm2 = (tm)this.kaS.aZV().vTW.get(0);
      ((StringBuilder)localObject).append(localtm2.title);
      localStringBuilder.append(localtm2.kbW);
      break label403;
      label737: this.ksK.setText("");
      break label424;
      label749: if (!TextUtils.isEmpty(this.kaS.aZV().vUm))
      {
        ab.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
        this.ksL.setText(this.kaS.aZV().vUm);
        this.ksL.setVisibility(0);
        break label460;
      }
      this.ksL.setVisibility(8);
      break label460;
      label816: this.ksM.setVisibility(0);
      this.ksM.setOnClickListener(this.gKK);
      m.a(this.ksP, 2130838130, l.Hn(this.kaS.aZV().color));
      localStringBuilder = null;
      localObject = localStringBuilder;
      if (this.kaY != null)
      {
        localObject = localStringBuilder;
        if (this.kaY.size() > 0)
          localObject = (od)this.kaY.get(0);
      }
      if ((this.kaS.aZV().vUa == 1) && (localObject != null))
      {
        this.ksN.setText(((od)localObject).name);
        this.ksO.setText(this.mContext.getString(2131297985, new Object[] { l.g(this.mContext, ((od)localObject).qVo), ((od)localObject).fBg }));
        this.ksQ.setVisibility(8);
        this.ksM.setTag(((od)localObject).name);
        break label525;
      }
      if ((this.kaS.aZV().vUa > 1) && (localObject != null))
      {
        this.ksN.setText(((od)localObject).name);
        this.ksO.setText(this.mContext.getString(2131297985, new Object[] { l.g(this.mContext, ((od)localObject).qVo), ((od)localObject).fBg }));
        this.ksQ.setVisibility(0);
        this.ksQ.setOnClickListener(this.gKK);
        this.ksM.setTag(((od)localObject).name);
        break label525;
      }
      if (this.kaS.aZV().vUa <= 0)
        break label525;
      this.ksN.setText(2131297810);
      this.ksO.setText(this.mContext.getString(2131298011, new Object[] { Integer.valueOf(this.kaS.aZV().vUa) }));
      this.ksQ.setVisibility(8);
      this.ksQ.setOnClickListener(null);
      this.ksM.setTag(this.mContext.getString(2131297810));
      break label525;
      label1198: this.ksI.setVisibility(0);
      AppMethodBeat.o(88986);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.f
 * JD-Core Version:    0.6.2
 */