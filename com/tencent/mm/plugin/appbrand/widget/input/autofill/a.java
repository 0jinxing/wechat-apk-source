package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class a extends ArrayAdapter<a.b>
  implements g
{
  private b jht;
  h jhu;
  private boolean jhv;
  private final LayoutInflater mInflater;

  a(Context paramContext, List<a.b> paramList)
  {
    super(paramContext, 2130968689, paramList);
    AppMethodBeat.i(123875);
    this.jhv = false;
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(123875);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(123877);
    this.jht = paramb;
    this.jht.setOnDismissListener(new a.1(this));
    AppMethodBeat.o(123877);
  }

  public final void aRu()
  {
    AppMethodBeat.i(123878);
    this.jht.setOnDismissListener(null);
    this.jht = null;
    AppMethodBeat.o(123878);
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(123880);
    Filter localFilter = super.getFilter();
    AppMethodBeat.o(123880);
    return localFilter;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 8;
    AppMethodBeat.i(123879);
    View localView = paramView;
    if (paramView == null)
      localView = this.mInflater.inflate(2130968689, paramViewGroup, false);
    paramView = (a.a)localView.getTag();
    if (paramView == null)
    {
      paramView = new a.a(this, localView);
      localView.setTag(paramView);
    }
    while (true)
    {
      paramViewGroup = (a.b)getItem(paramInt);
      paramView.jhA = paramViewGroup;
      paramView.jhx.setText(paramViewGroup.title);
      paramView.jhy.setText(paramViewGroup.content);
      TextView localTextView = paramView.jhy;
      int j;
      if (bo.isNullOrNil(paramViewGroup.content))
      {
        j = 8;
        localTextView.setVisibility(j);
        paramView = paramView.goc;
        if (paramInt != getCount() - 1)
          break label159;
      }
      label159: for (paramInt = i; ; paramInt = 0)
      {
        paramView.setVisibility(paramInt);
        AppMethodBeat.o(123879);
        return localView;
        j = 0;
        break;
      }
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(123876);
    super.notifyDataSetChanged();
    AppMethodBeat.o(123876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.a
 * JD-Core Version:    0.6.2
 */