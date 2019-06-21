package com.tencent.mm.plugin.label.ui;

import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.af;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMTextView;
import java.util.ArrayList;
import java.util.HashMap;

final class ContactLabelManagerUI$a extends BaseAdapter
{
  ArrayList<af> mData;

  ContactLabelManagerUI$a(ContactLabelManagerUI paramContactLabelManagerUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(22599);
    int i;
    if (this.mData == null)
    {
      i = 0;
      AppMethodBeat.o(22599);
    }
    while (true)
    {
      return i;
      i = this.mData.size();
      AppMethodBeat.o(22599);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22601);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.nIh).inflate(2130969225, paramViewGroup, false);
      paramViewGroup = new c(paramView);
      Object localObject = paramViewGroup.nJd.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = ((int)(a.am(this.nIh, 2131427857) * a.fZ(this.nIh)));
      paramViewGroup.nJd.setLayoutParams((ViewGroup.LayoutParams)localObject);
      paramView.setTag(paramViewGroup);
      localObject = xA(paramInt);
      SpannableString localSpannableString = j.b(this.nIh.mController.ylL, ((af)localObject).field_labelName, ContactLabelManagerUI.l(this.nIh));
      paramViewGroup.nJb.setText(localSpannableString);
      if ((ContactLabelManagerUI.j(this.nIh) == null) || (!ContactLabelManagerUI.j(this.nIh).containsKey(Integer.valueOf(((af)localObject).field_labelID))))
        break label234;
      paramViewGroup.nJc.setVisibility(0);
      paramViewGroup.nJc.setText("(" + ContactLabelManagerUI.j(this.nIh).get(Integer.valueOf(((af)localObject).field_labelID)) + ")");
    }
    while (true)
    {
      AppMethodBeat.o(22601);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
      break;
      label234: paramViewGroup.nJc.setVisibility(0);
      paramViewGroup.nJc.setText("(0)");
    }
  }

  public final af xA(int paramInt)
  {
    AppMethodBeat.i(22600);
    af localaf;
    if ((this.mData == null) || (paramInt > this.mData.size()))
    {
      localaf = null;
      AppMethodBeat.o(22600);
    }
    while (true)
    {
      return localaf;
      localaf = (af)this.mData.get(paramInt);
      AppMethodBeat.o(22600);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.a
 * JD-Core Version:    0.6.2
 */