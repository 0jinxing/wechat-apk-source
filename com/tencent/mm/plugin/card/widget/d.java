package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends a
{
  private View ksr;
  private TextView kss;
  private TextView kst;
  private View ksu;
  private TextView ksv;
  private TextView ksw;
  private View ksx;
  private View ksy;
  private View ksz;

  public d(Context paramContext)
  {
    super(paramContext);
  }

  protected final void beJ()
  {
    AppMethodBeat.i(88976);
    this.ksr = this.ksf.findViewById(2131822193);
    this.kss = ((TextView)this.ksf.findViewById(2131822194));
    this.kst = ((TextView)this.ksf.findViewById(2131822195));
    this.ksu = this.ksf.findViewById(2131822196);
    this.ksv = ((TextView)this.ksf.findViewById(2131822197));
    this.ksw = ((TextView)this.ksf.findViewById(2131822198));
    this.ksy = this.ksf.findViewById(2131822201);
    this.ksz = this.ksf.findViewById(2131822200);
    AppMethodBeat.o(88976);
  }

  protected final void beK()
  {
    AppMethodBeat.i(88977);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this.kaS.aZV().vTW != null) && (this.kaS.aZV().vTW.size() > 0))
    {
      localObject1 = this.kaS.aZV().vTW;
      localObject2 = null;
      if (((LinkedList)localObject1).size() == 1)
      {
        localObject3 = (tm)((LinkedList)localObject1).get(0);
        if (localObject3 != null)
        {
          this.ksr.setVisibility(0);
          this.kss.setText(((tm)localObject3).title);
          this.kst.setText(((tm)localObject3).kbW);
          if (!TextUtils.isEmpty(((tm)localObject3).vUX))
            this.kss.setTextColor(l.Hn(((tm)localObject3).vUX));
          if (!TextUtils.isEmpty(((tm)localObject3).vUY))
            this.kst.setTextColor(l.Hn(((tm)localObject3).vUY));
        }
        if (localObject2 != null)
        {
          this.ksu.setVisibility(0);
          this.ksv.setText(((tm)localObject2).title);
          this.ksw.setText(((tm)localObject2).kbW);
          if (!TextUtils.isEmpty(((tm)localObject2).vUX))
            this.ksv.setTextColor(l.Hn(((tm)localObject2).vUX));
          if (!TextUtils.isEmpty(((tm)localObject2).vUY))
            this.ksw.setTextColor(l.Hn(((tm)localObject2).vUY));
        }
        label234: if ((!this.kaS.aZB()) || (this.kaS.aZH()))
          break label358;
        ab.i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        label265: if (!this.kaS.isNormal())
          break label866;
        this.ksy.setVisibility(8);
        label286: if ((this.kaS.aZW().vSl != null) || (!this.kaS.isNormal()))
          break label943;
        this.ksz.setVisibility(0);
        AppMethodBeat.o(88977);
      }
    }
    while (true)
    {
      return;
      localObject3 = (tm)((LinkedList)localObject1).get(0);
      localObject2 = (tm)((LinkedList)localObject1).get(1);
      break;
      ab.i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
      break label234;
      label358: if ((this.kaS.aZW().vSc != null) && (this.kaS.aZW().vSc.size() > 0))
      {
        if (this.ksx == null)
          this.ksx = ((ViewStub)this.ksf.findViewById(2131822199)).inflate();
        this.ksf.findViewById(2131822200).setVisibility(8);
        localObject3 = this.ksx;
        localObject1 = this.kaS;
        localObject2 = this.gKK;
        localObject1 = ((b)localObject1).aZW().vSc;
        if (((LinkedList)localObject1).size() == 1)
        {
          ((View)localObject3).findViewById(2131822282).setVisibility(0);
          localObject1 = (tm)((LinkedList)localObject1).get(0);
          ((TextView)((View)localObject3).findViewById(2131822283)).setText(((tm)localObject1).title);
          ((TextView)((View)localObject3).findViewById(2131822284)).setText(((tm)localObject1).kbW);
          ((View)localObject3).findViewById(2131822282).setOnClickListener((View.OnClickListener)localObject2);
          if (!TextUtils.isEmpty(((tm)localObject1).vUX))
            ((TextView)((View)localObject3).findViewById(2131822283)).setTextColor(l.Hn(((tm)localObject1).vUX));
          if (!TextUtils.isEmpty(((tm)localObject1).vUY))
            ((TextView)((View)localObject3).findViewById(2131822284)).setTextColor(l.Hn(((tm)localObject1).vUY));
          ((View)localObject3).findViewById(2131822285).setVisibility(8);
          break label265;
        }
        if (((LinkedList)localObject1).size() < 2)
          break label265;
        tm localtm = (tm)((LinkedList)localObject1).get(0);
        ((TextView)((View)localObject3).findViewById(2131822283)).setText(localtm.title);
        ((TextView)((View)localObject3).findViewById(2131822284)).setText(localtm.kbW);
        if (!TextUtils.isEmpty(localtm.vUX))
          ((TextView)((View)localObject3).findViewById(2131822283)).setTextColor(l.Hn(localtm.vUX));
        if (!TextUtils.isEmpty(localtm.vUY))
          ((TextView)((View)localObject3).findViewById(2131822284)).setTextColor(l.Hn(localtm.vUY));
        localObject1 = (tm)((LinkedList)localObject1).get(1);
        ((TextView)((View)localObject3).findViewById(2131822286)).setText(((tm)localObject1).title);
        ((TextView)((View)localObject3).findViewById(2131822287)).setText(((tm)localObject1).kbW);
        if (!TextUtils.isEmpty(((tm)localObject1).vUX))
          ((TextView)((View)localObject3).findViewById(2131822286)).setTextColor(l.Hn(((tm)localObject1).vUX));
        if (!TextUtils.isEmpty(((tm)localObject1).vUY))
          ((TextView)((View)localObject3).findViewById(2131822287)).setTextColor(l.Hn(((tm)localObject1).vUY));
        ((View)localObject3).findViewById(2131822282).setOnClickListener((View.OnClickListener)localObject2);
        ((View)localObject3).findViewById(2131822285).setOnClickListener((View.OnClickListener)localObject2);
        break label265;
      }
      if (this.ksx != null)
        this.ksx.setVisibility(8);
      this.ksf.findViewById(2131822200).setVisibility(8);
      break label265;
      label866: this.ksy.setVisibility(0);
      localObject3 = (TextView)this.ksy.findViewById(2131822320);
      if (!TextUtils.isEmpty(this.kaS.aZV().vUu))
      {
        ((TextView)localObject3).setText(this.kaS.aZV().vUu);
        break label286;
      }
      m.c((TextView)localObject3, this.kaS.aZW().status);
      break label286;
      label943: this.ksz.setVisibility(8);
      AppMethodBeat.o(88977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.d
 * JD-Core Version:    0.6.2
 */