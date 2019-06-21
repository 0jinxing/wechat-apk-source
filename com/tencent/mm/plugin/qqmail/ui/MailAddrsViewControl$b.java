package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.o;
import java.util.ArrayList;
import java.util.List;

public final class MailAddrsViewControl$b extends BaseAdapter
  implements Filterable
{
  private List<o> gAm;
  private ArrayList<o> gAn;
  private Context mContext;
  private final Object mLock;
  private boolean pyJ;
  private MailAddrsViewControl.b.a pyK;

  public MailAddrsViewControl$b(Context paramContext, List<o> paramList)
  {
    AppMethodBeat.i(68351);
    this.mLock = new Object();
    this.pyJ = true;
    this.mContext = paramContext;
    this.gAm = paramList;
    AppMethodBeat.o(68351);
  }

  public final o Bu(int paramInt)
  {
    AppMethodBeat.i(68354);
    o localo = (o)this.gAm.get(paramInt);
    AppMethodBeat.o(68354);
    return localo;
  }

  public final int getCount()
  {
    AppMethodBeat.i(68353);
    int i = this.gAm.size();
    AppMethodBeat.o(68353);
    return i;
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(68356);
    if (this.pyK == null)
      this.pyK = new MailAddrsViewControl.b.a(this, (byte)0);
    MailAddrsViewControl.b.a locala = this.pyK;
    AppMethodBeat.o(68356);
    return locala;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(68355);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130970427, null);
      paramViewGroup = new MailAddrsViewControl.b.b(this, (byte)0);
      paramViewGroup.gxi = ((TextView)paramView.findViewById(2131826689));
      paramViewGroup.pyu = ((TextView)paramView.findViewById(2131826690));
      paramViewGroup.pyM = ((CheckBox)paramView.findViewById(2131826691));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      o localo = Bu(paramInt);
      paramViewGroup = (MailAddrsViewControl.b.b)paramView.getTag();
      paramViewGroup.gxi.setText(localo.name);
      paramViewGroup.pyu.setText(localo.nJq);
      paramViewGroup.pyM.setVisibility(8);
      paramView.setBackgroundColor(-789517);
      AppMethodBeat.o(68355);
      return paramView;
      paramView = (ViewGroup)paramView;
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(68352);
    super.notifyDataSetChanged();
    this.pyJ = true;
    AppMethodBeat.o(68352);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.b
 * JD-Core Version:    0.6.2
 */