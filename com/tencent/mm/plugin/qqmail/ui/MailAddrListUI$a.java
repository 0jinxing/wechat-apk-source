package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.a;
import com.tencent.mm.plugin.qqmail.b.o;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class MailAddrListUI$a extends BaseAdapter
{
  private final Context context;
  boolean pyq;
  boolean pyr;
  Map<String, o> pys;

  public MailAddrListUI$a(MailAddrListUI paramMailAddrListUI, Context paramContext)
  {
    AppMethodBeat.i(68318);
    this.pyq = false;
    this.pyr = false;
    this.pys = new HashMap();
    this.context = paramContext;
    AppMethodBeat.o(68318);
  }

  private int Bt(int paramInt)
  {
    if (this.pyr);
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
        paramInt = 0;
      else
        paramInt--;
    }
  }

  private static String d(o paramo)
  {
    AppMethodBeat.i(68324);
    if (paramo == null)
    {
      paramo = null;
      AppMethodBeat.o(68324);
    }
    while (true)
    {
      label16: return paramo;
      paramo = a.Vd(paramo.puh);
      char c1;
      if (paramo.length() > 1)
        c1 = paramo.charAt(0);
      for (char c2 = c1; ; c2 = c1)
        switch (c2)
        {
        case '|':
        case '}':
        default:
          if (!bo.z(c2))
            break label148;
          paramo = String.valueOf(c2);
          AppMethodBeat.o(68324);
          break label16;
          c1 = '~';
        case '{':
        case '~':
        }
      c2 = paramo.charAt(1);
      if (bo.A(c2))
      {
        paramo = String.valueOf(c2);
        AppMethodBeat.o(68324);
      }
      else
      {
        paramo = "~";
        AppMethodBeat.o(68324);
        continue;
        paramo = "~";
        AppMethodBeat.o(68324);
        continue;
        label148: paramo = "~";
        AppMethodBeat.o(68324);
      }
    }
  }

  private TextView getTitleTextView()
  {
    AppMethodBeat.i(68322);
    TextView localTextView = new TextView(this.context);
    localTextView.setBackgroundResource(2130839171);
    localTextView.setTextColor(-16777216);
    localTextView.setTextSize(0, this.pyp.getResources().getDimensionPixelSize(2131427762));
    int i = this.pyp.getResources().getDimensionPixelSize(2131427776);
    int j = this.pyp.getResources().getDimensionPixelSize(2131427858);
    localTextView.setPadding(j, i, j, j);
    AppMethodBeat.o(68322);
    return localTextView;
  }

  public final o Bu(int paramInt)
  {
    AppMethodBeat.i(68325);
    paramInt = Bt(paramInt);
    o localo = (o)MailAddrListUI.c(this.pyp).get(paramInt);
    AppMethodBeat.o(68325);
    return localo;
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final void c(o paramo)
  {
    AppMethodBeat.i(68319);
    this.pys.put(paramo.nJq, paramo);
    AppMethodBeat.o(68319);
  }

  public final int cdf()
  {
    AppMethodBeat.i(68320);
    int i = this.pys.size();
    AppMethodBeat.o(68320);
    return i;
  }

  public final int getCount()
  {
    AppMethodBeat.i(68321);
    int i = MailAddrListUI.c(this.pyp).size();
    if (i == 0)
      if (this.pyq)
      {
        i = 1;
        AppMethodBeat.o(68321);
      }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(68321);
      continue;
      if (this.pyr)
      {
        AppMethodBeat.o(68321);
      }
      else
      {
        i++;
        AppMethodBeat.o(68321);
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(68323);
    if (paramInt == 0)
    {
      if (this.pyq)
      {
        paramView = getTitleTextView();
        paramView.setText(2131301971);
        paramInt = this.pyp.getResources().getDimensionPixelSize(2131427776);
        paramView.setPadding(paramInt, paramInt, paramInt, paramInt);
        paramView.setTextSize(0, this.pyp.getResources().getDimensionPixelSize(2131427505));
        paramView.setGravity(17);
        AppMethodBeat.o(68323);
      }
      while (true)
      {
        return paramView;
        if (this.pyr)
          break;
        paramView = getTitleTextView();
        paramView.setText(2131301970);
        AppMethodBeat.o(68323);
      }
    }
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new a();
      paramView = View.inflate(this.context, 2130970424, null);
      paramViewGroup.pyt = ((TextView)paramView.findViewById(2131826687));
      paramViewGroup.gxi = ((TextView)paramView.findViewById(2131826689));
      paramViewGroup.pyu = ((TextView)paramView.findViewById(2131826690));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131826691));
      paramView.setTag(paramViewGroup);
      label193: o localo = Bu(paramInt);
      if ((this.pyr) || (paramInt <= 10))
        break label378;
      Object localObject = Bu(paramInt - 1);
      if (paramInt == 11)
        localObject = null;
      String str = d(localo);
      localObject = d((o)localObject);
      if (str == null)
        break label366;
      if (str.equals(localObject))
        break label354;
      paramViewGroup.pyt.setText(str.toUpperCase());
      paramViewGroup.pyt.setVisibility(0);
      label280: paramViewGroup.gxi.setText(localo.name);
      paramViewGroup.pyu.setText(localo.nJq);
      paramViewGroup = paramViewGroup.gnD;
      if (this.pys.get(localo.nJq) == null)
        break label390;
    }
    label390: for (boolean bool = true; ; bool = false)
    {
      paramViewGroup.setChecked(bool);
      AppMethodBeat.o(68323);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label193;
      label354: paramViewGroup.pyt.setVisibility(8);
      break label280;
      label366: paramViewGroup.pyt.setVisibility(8);
      break label280;
      label378: paramViewGroup.pyt.setVisibility(8);
      break label280;
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = this.pyr; ; bool = true)
      return bool;
  }

  final class a
  {
    CheckBox gnD;
    TextView gxi;
    TextView pyt;
    TextView pyu;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.a
 * JD-Core Version:    0.6.2
 */