package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c extends BaseAdapter
  implements Filterable
{
  private List<String> gAm;
  private ArrayList<String> gAn;
  private c.a gAo;
  private String gAp;
  private Context mContext;
  private final Object mLock;

  public c(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(124719);
    this.mLock = new Object();
    this.mContext = paramContext;
    this.gAm = Arrays.asList(paramArrayOfString);
    this.gAp = paramString;
    AppMethodBeat.o(124719);
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(124721);
    String str = (String)this.gAm.get(paramInt);
    AppMethodBeat.o(124721);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(124720);
    int i = this.gAm.size();
    AppMethodBeat.o(124720);
    return i;
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(124723);
    if (this.gAo == null)
      this.gAo = new c.a(this, (byte)0);
    c.a locala = this.gAo;
    AppMethodBeat.o(124723);
    return locala;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(124722);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130968789, null);
      paramViewGroup = new c.b();
      paramViewGroup.exj = ((TextView)paramView.findViewById(2131821554));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      String str = getItem(paramInt);
      paramViewGroup.exj.setText(str);
      paramView.setBackgroundResource(2130838396);
      AppMethodBeat.o(124722);
      return paramView;
      paramViewGroup = (c.b)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.c
 * JD-Core Version:    0.6.2
 */