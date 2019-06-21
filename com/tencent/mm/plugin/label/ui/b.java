package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMTextView;
import java.util.ArrayList;

public final class b extends BaseAdapter
{
  String gtk;
  private Context mContext;
  ArrayList<String> nIA;
  SparseArray<SpannableString> nIB;

  public b(Context paramContext)
  {
    AppMethodBeat.i(22653);
    this.nIA = new ArrayList();
    this.nIB = new SparseArray();
    this.mContext = paramContext;
    AppMethodBeat.o(22653);
  }

  public final int getCount()
  {
    AppMethodBeat.i(22654);
    int i;
    if (this.nIA == null)
    {
      i = 0;
      AppMethodBeat.o(22654);
    }
    while (true)
    {
      return i;
      i = this.nIA.size();
      AppMethodBeat.o(22654);
    }
  }

  public final String getItem(int paramInt)
  {
    AppMethodBeat.i(22655);
    String str;
    if ((this.nIA == null) || (paramInt >= getCount()))
    {
      str = null;
      AppMethodBeat.o(22655);
    }
    while (true)
    {
      return str;
      str = (String)this.nIA.get(paramInt);
      AppMethodBeat.o(22655);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22656);
    MMTextView localMMTextView;
    String str;
    int i;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(2130969225, paramViewGroup, false);
      paramViewGroup = new c(paramView);
      paramView.setTag(paramViewGroup);
      localMMTextView = paramViewGroup.nJb;
      str = bo.bc(getItem(paramInt), "");
      i = (int)paramViewGroup.nJb.getTextSize();
      paramInt = str.hashCode();
      paramViewGroup = (SpannableString)this.nIB.get(paramInt);
      if (paramViewGroup == null)
        break label121;
    }
    while (true)
    {
      localMMTextView.setText(paramViewGroup);
      AppMethodBeat.o(22656);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
      break;
      label121: paramViewGroup = new SpannableString(j.b(this.mContext, str, i));
      int j = str.indexOf(this.gtk);
      if (j == -1)
      {
        ab.w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", new Object[] { str });
      }
      else
      {
        i = this.gtk.length() + j;
        paramViewGroup.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(2131690683)), j, i, 33);
        paramViewGroup.setSpan(new StyleSpan(1), j, i, 33);
        this.nIB.put(paramInt, paramViewGroup);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.b
 * JD-Core Version:    0.6.2
 */