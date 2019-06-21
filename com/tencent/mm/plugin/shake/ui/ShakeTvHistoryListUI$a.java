package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.n;
import com.tencent.mm.plugin.shake.d.a.o;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.q;
import java.util.GregorianCalendar;

final class ShakeTvHistoryListUI$a extends p<n>
{
  private LayoutInflater mInflater;

  public ShakeTvHistoryListUI$a(ShakeTvHistoryListUI paramShakeTvHistoryListUI, Context paramContext)
  {
    super(paramContext, new n());
    AppMethodBeat.i(24898);
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(24898);
  }

  public final void KC()
  {
    AppMethodBeat.i(24900);
    setCursor(m.cjU().cky());
    super.notifyDataSetChanged();
    AppMethodBeat.o(24900);
  }

  public final void KD()
  {
    AppMethodBeat.i(24901);
    KC();
    AppMethodBeat.o(24901);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24899);
    Object localObject1;
    Object localObject2;
    long l1;
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130970660, paramViewGroup, false);
      localObject1 = new ShakeTvHistoryListUI.a.a(this);
      ((ShakeTvHistoryListUI.a.a)localObject1).qwz = ((MMImageView)paramViewGroup.findViewById(2131827531));
      ((ShakeTvHistoryListUI.a.a)localObject1).iDT = ((TextView)paramViewGroup.findViewById(2131827532));
      ((ShakeTvHistoryListUI.a.a)localObject1).nSC = ((TextView)paramViewGroup.findViewById(2131827533));
      paramViewGroup.setTag(localObject1);
      localObject2 = (n)getItem(paramInt);
      e.a(((ShakeTvHistoryListUI.a.a)localObject1).qwz, ((n)localObject2).field_iconurl, 0, true);
      ((ShakeTvHistoryListUI.a.a)localObject1).iDT.setText(((n)localObject2).field_title);
      localObject1 = ((ShakeTvHistoryListUI.a.a)localObject1).nSC;
      paramView = this.qwx.mController.ylL;
      l1 = ((n)localObject2).field_createtime * 1000L;
      localObject2 = new GregorianCalendar();
      if (l1 >= 3600000L)
        break label196;
      paramView = "";
    }
    while (true)
    {
      ((TextView)localObject1).setText(paramView);
      AppMethodBeat.o(24899);
      return paramViewGroup;
      localObject1 = (ShakeTvHistoryListUI.a.a)paramView.getTag();
      paramViewGroup = paramView;
      break;
      label196: localObject2 = new GregorianCalendar(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2), ((GregorianCalendar)localObject2).get(5));
      long l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
      if ((l2 > 0L) && (l2 <= 86400000L))
      {
        paramView = h.formatTime(paramView.getString(2131299964), l1 / 1000L);
      }
      else
      {
        l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L;
        if ((l2 > 0L) && (l2 <= 86400000L))
          paramView = paramView.getString(2131299986);
        else
          paramView = h.formatTime(paramView.getString(2131299952), l1 / 1000L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.a
 * JD-Core Version:    0.6.2
 */