package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;

public final class w extends i
{
  private View krg;
  private View krh;

  public final void bes()
  {
    AppMethodBeat.i(88783);
    if (this.krg != null)
      this.krg.setVisibility(8);
    if (this.krh != null)
      this.krh.setVisibility(8);
    AppMethodBeat.o(88783);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88782);
    b localb = this.kqK.bcv();
    g localg = this.kqK.bcA();
    View localView1;
    Object localObject1;
    Object localObject2;
    int j;
    if ((localb.aZW().vSc != null) && (localb.aZW().vSc.size() > 1))
    {
      if (this.krg == null)
        this.krg = ((ViewStub)findViewById(2131822027)).inflate();
      if (this.krh != null)
        this.krh.setVisibility(8);
      MMActivity localMMActivity = this.kqK.bcy();
      localView1 = this.krg;
      localObject1 = this.kqK.bcz();
      localObject2 = localb.aZW().vSc;
      int i = l.Hn(localb.aZV().color);
      ((ViewGroup)localView1).removeAllViews();
      Iterator localIterator = ((LinkedList)localObject2).iterator();
      label360: 
      while (localIterator.hasNext())
      {
        tm localtm = (tm)localIterator.next();
        View localView2 = v.hu(localMMActivity).inflate(2130968968, (ViewGroup)localView1, false);
        localView2.setId(2131822279);
        localView2.setTag(Integer.valueOf(((LinkedList)localObject2).indexOf(localtm)));
        localView2.setOnClickListener((View.OnClickListener)localObject1);
        if (TextUtils.isEmpty(localtm.url))
          localView2.setEnabled(false);
        ((TextView)localView2.findViewById(2131822280)).setText(localtm.title);
        Object localObject3 = (TextView)localView2.findViewById(2131822281);
        ((TextView)localObject3).setText(localtm.kbW);
        ((TextView)localObject3).setTextColor(i);
        ((ViewGroup)localView1).addView(localView2);
        if (((LinkedList)localObject2).indexOf(localtm) + 1 != ((LinkedList)localObject2).size());
        for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label360;
          localObject3 = v.hu(localMMActivity).inflate(2130968969, (ViewGroup)localView1, false);
          ((ViewGroup)localView1).addView((View)localObject3);
          break;
        }
      }
      if ((localb.aZD()) && (localb.aZW().vSj != null) && (!TextUtils.isEmpty(localb.aZW().vSj.title)))
        this.krg.setBackgroundResource(2130839563);
      if ((localb.aZD()) || (!localg.bdS()))
        break label783;
      this.krg.setBackgroundResource(2130839563);
      AppMethodBeat.o(88782);
    }
    while (true)
    {
      return;
      if ((localb.aZW().vSc != null) && (localb.aZW().vSc.size() == 1))
      {
        if (this.krh == null)
          this.krh = ((ViewStub)findViewById(2131822028)).inflate();
        if (this.krg != null)
          this.krg.setVisibility(8);
        localView1 = this.krh;
        localObject2 = this.kqK.bcz();
        localObject1 = localb.aZW().vSc;
        if (((LinkedList)localObject1).size() == 1)
        {
          localView1.findViewById(2131822282).setVisibility(0);
          localObject1 = (tm)((LinkedList)localObject1).get(0);
          ((TextView)localView1.findViewById(2131822283)).setText(((tm)localObject1).title);
          ((TextView)localView1.findViewById(2131822284)).setText(((tm)localObject1).kbW);
          j = l.Hn(localb.aZV().color);
          ((TextView)localView1.findViewById(2131822284)).setTextColor(j);
          localView1.findViewById(2131822282).setOnClickListener((View.OnClickListener)localObject2);
          if (TextUtils.isEmpty(((tm)localObject1).url))
            localView1.findViewById(2131822282).setEnabled(false);
        }
        if ((localb.aZD()) && (localb.aZW().vSj != null) && (!TextUtils.isEmpty(localb.aZW().vSj.title)))
          this.krh.setBackgroundResource(2130839563);
        if ((!localb.aZD()) && (localg.bdS()))
        {
          this.krh.setBackgroundResource(2130839563);
          AppMethodBeat.o(88782);
        }
      }
      else
      {
        if (this.krg != null)
          this.krg.setVisibility(8);
        if (this.krh != null)
          this.krh.setVisibility(8);
        label783: AppMethodBeat.o(88782);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.w
 * JD-Core Version:    0.6.2
 */