package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import junit.framework.Assert;

final class l$a extends BaseAdapter
{
  private Bundle Et;
  private Context mContext;
  private List<String> ngC;
  private DialogInterface.OnDismissListener vsh;
  l.a.a vsi;

  public l$a(List<String> paramList, Context paramContext, DialogInterface.OnDismissListener paramOnDismissListener, Bundle paramBundle)
  {
    AppMethodBeat.i(28141);
    this.ngC = null;
    this.mContext = null;
    this.vsh = null;
    this.Et = null;
    this.vsi = null;
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.ngC = paramList;
      this.mContext = paramContext;
      this.vsh = paramOnDismissListener;
      this.Et = paramBundle;
      AppMethodBeat.o(28141);
      return;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(28142);
    int i;
    if (this.ngC == null)
    {
      i = 0;
      AppMethodBeat.o(28142);
    }
    while (true)
    {
      return i;
      i = this.ngC.size();
      AppMethodBeat.o(28142);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(28143);
    Object localObject = this.ngC.get(paramInt);
    AppMethodBeat.o(28143);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(28144);
    String str = (String)this.ngC.get(paramInt);
    if (this.mContext.getString(2131298197).equals(str))
    {
      paramInt = 1;
      AppMethodBeat.o(28144);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(28144);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28145);
    String str = (String)getItem(paramInt);
    paramInt = getItemViewType(paramInt);
    if (paramView == null)
    {
      paramView = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
      if (paramInt == 1)
      {
        paramView = paramView.inflate(2130969080, paramViewGroup, false);
        paramViewGroup = new l.a.b(this, (byte)0);
        ((l.a.b)paramViewGroup).gsf = ((TextView)paramView.findViewById(2131820678));
        ((l.a.b)paramViewGroup).mlF = ((Button)paramView.findViewById(2131822658));
        ((l.a.b)paramViewGroup).vsk = ((TextView)paramView.findViewById(2131822641));
        paramView.setTag(paramViewGroup);
        switch (paramInt)
        {
        default:
          label116: ab.e("MicroMsg.MailPhoneMenuHelper", "hy: error tag");
        case 0:
        case 1:
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(28145);
      return paramView;
      paramView = paramView.inflate(2130969081, paramViewGroup, false);
      paramViewGroup = new l.a.c(this, (byte)0);
      ((l.a.c)paramViewGroup).gsf = ((TextView)paramView.findViewById(2131820678));
      break;
      paramViewGroup = paramView.getTag();
      break label116;
      paramViewGroup = (l.a.c)paramViewGroup;
      paramViewGroup.gsf.setText(j.b(this.mContext, bo.nullAsNil(str), paramViewGroup.gsf.getTextSize()));
      continue;
      paramViewGroup = (l.a.b)paramViewGroup;
      paramViewGroup.gsf.setText(j.b(this.mContext, bo.nullAsNil(str), paramViewGroup.gsf.getTextSize()));
      paramViewGroup.vsk.setText(this.mContext.getString(2131298203));
      paramViewGroup.mlF.setOnClickListener(new l.a.1(this));
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.a
 * JD-Core Version:    0.6.2
 */