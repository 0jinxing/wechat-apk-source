package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.g;
import com.tencent.mm.plugin.ipcall.a.g.h;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class IPCallMsgUI$a extends p<g>
{
  int enb;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  int kmW;
  private Set<MMSlideDelView> nDv;

  public IPCallMsgUI$a(IPCallMsgUI paramIPCallMsgUI, Context paramContext, g paramg)
  {
    super(paramContext, paramg);
    AppMethodBeat.i(22198);
    this.nDv = new HashSet();
    this.jJR = new MMSlideDelView.d()
    {
      public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(22194);
        if (paramAnonymousBoolean)
        {
          nDv.add(paramAnonymousMMSlideDelView);
          AppMethodBeat.o(22194);
        }
        while (true)
        {
          return;
          nDv.remove(paramAnonymousMMSlideDelView);
          AppMethodBeat.o(22194);
        }
      }

      public final boolean bIo()
      {
        AppMethodBeat.i(22195);
        boolean bool;
        if (nDv.size() > 0)
        {
          bool = true;
          AppMethodBeat.o(22195);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(22195);
        }
      }

      public final void bIp()
      {
        AppMethodBeat.i(22196);
        Iterator localIterator = nDv.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null)
            localMMSlideDelView.dzZ();
        }
        nDv.clear();
        AppMethodBeat.o(22196);
      }

      public final void bIq()
      {
        AppMethodBeat.i(22197);
        Iterator localIterator = nDv.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null)
            localMMSlideDelView.dzY();
        }
        nDv.clear();
        AppMethodBeat.o(22197);
      }
    };
    this.kmW = 10;
    this.enb = this.kmW;
    AppMethodBeat.o(22198);
  }

  public final void KC()
  {
    AppMethodBeat.i(22202);
    this.enb = i.bHz().getCount();
    setCursor(i.bHz().xm(this.kmW));
    notifyDataSetChanged();
    AppMethodBeat.o(22202);
  }

  public final void KD()
  {
    AppMethodBeat.i(22200);
    bIf();
    KC();
    AppMethodBeat.o(22200);
  }

  public final void a(String paramString, m paramm)
  {
    try
    {
      AppMethodBeat.i(22201);
      super.a(paramString, paramm);
      AppMethodBeat.o(22201);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(22199);
    long l = ((g)getItem(paramInt)).xDa;
    AppMethodBeat.o(22199);
    return l;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22203);
    g localg = (g)getItem(paramInt);
    View localView;
    long l1;
    Object localObject;
    String str;
    if ((paramView == null) || (!(paramView.getTag() instanceof IPCallMsgUI.a.a)))
    {
      localView = v.hu(this.context).inflate(2130969898, null);
      paramViewGroup = new IPCallMsgUI.a.a(this);
      paramViewGroup.gne = ((TextView)localView.findViewById(2131821314));
      paramViewGroup.gKl = ((TextView)localView.findViewById(2131825163));
      paramViewGroup.timeTv = ((TextView)localView.findViewById(2131825164));
      localView.setTag(paramViewGroup);
      paramViewGroup.gne.setText(localg.field_title);
      paramViewGroup.gKl.setText(localg.field_content);
      TextView localTextView = paramViewGroup.timeTv;
      paramView = this.nDt.mController.ylL;
      l1 = localg.field_pushTime * 1000L;
      localObject = new GregorianCalendar();
      localObject = new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5));
      str = (String)DateFormat.format(paramView.getString(2131299933), l1);
      if (str.indexOf("-") <= 0)
        break label375;
      localObject = str.split("-")[0];
      str = str.split("-")[1];
      localObject = c.aJ(paramView, (String)localObject);
      localObject = str + " " + (String)localObject + " ";
      paramView = (String)localObject + " " + (String)c.i(paramView, l1);
      label311: localTextView.setText(paramView);
      if (localg.field_isRead != 1)
        break label534;
      paramInt = 1;
      label328: if (paramInt == 0)
        break label539;
      paramViewGroup.gne.setTextColor(this.nDt.getResources().getColor(2131690185));
    }
    while (true)
    {
      AppMethodBeat.o(22203);
      return localView;
      paramViewGroup = (IPCallMsgUI.a.a)paramView.getTag();
      localView = paramView;
      break;
      label375: long l2 = l1 - ((GregorianCalendar)localObject).getTimeInMillis();
      if ((l2 > 0L) && (l2 <= 86400000L))
      {
        paramView = (String)c.i(paramView, l1);
        break label311;
      }
      l2 = l1 - ((GregorianCalendar)localObject).getTimeInMillis() + 86400000L;
      if ((l2 > 0L) && (l2 <= 86400000L))
      {
        paramView = paramView.getString(2131299986) + " " + (String)c.i(paramView, l1);
        break label311;
      }
      paramView = str + " " + (String)c.i(paramView, l1);
      break label311;
      label534: paramInt = 0;
      break label328;
      label539: paramViewGroup.gne.setTextColor(this.nDt.getResources().getColor(2131690186));
    }
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.a
 * JD-Core Version:    0.6.2
 */