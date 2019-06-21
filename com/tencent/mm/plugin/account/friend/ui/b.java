package com.tencent.mm.plugin.account.friend.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.protocal.protobuf.aco;
import com.tencent.mm.protocal.protobuf.bed;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class b extends BaseAdapter
{
  private final LayoutInflater ezi;
  private LinkedList<bed> fjr;
  LinkedList<aco> gxf;
  boolean gxg;
  private boolean[] gxh;

  public b(LayoutInflater paramLayoutInflater)
  {
    this.ezi = paramLayoutInflater;
  }

  public final void a(LinkedList<bed> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(108564);
    if (paramInt < 0)
      this.fjr = paramLinkedList;
    while (true)
    {
      this.gxh = new boolean[this.fjr.size()];
      AppMethodBeat.o(108564);
      return;
      this.fjr = new LinkedList();
      for (int i = 0; i < paramLinkedList.size(); i++)
        if (paramInt == ((bed)paramLinkedList.get(i)).weB)
          this.fjr.add(paramLinkedList.get(i));
    }
  }

  public final String[] aqw()
  {
    AppMethodBeat.i(108565);
    Object localObject = this.gxh;
    int i = localObject.length;
    int j = 0;
    for (int k = 0; j < i; k = m)
    {
      m = k;
      if (localObject[j] != 0)
        m = k + 1;
      j++;
    }
    localObject = new String[k];
    j = 0;
    int m = 0;
    if (m < this.fjr.size())
    {
      if (this.gxh[m] == 0)
        break label116;
      localObject[j] = ((bed)this.fjr.get(m)).jBB;
      j++;
    }
    label116: 
    while (true)
    {
      m++;
      break;
      AppMethodBeat.o(108565);
      return localObject;
    }
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(108566);
    if (this.gxg)
      if (this.gxf == null)
        AppMethodBeat.o(108566);
    while (true)
    {
      return i;
      i = this.gxf.size();
      AppMethodBeat.o(108566);
      continue;
      if (this.fjr != null)
      {
        i = this.fjr.size();
        AppMethodBeat.o(108566);
      }
      else
      {
        AppMethodBeat.o(108566);
      }
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(108567);
    Object localObject;
    if (this.gxg)
    {
      localObject = this.gxf.get(paramInt);
      AppMethodBeat.o(108567);
    }
    while (true)
    {
      return localObject;
      localObject = this.fjr.get(paramInt);
      AppMethodBeat.o(108567);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(108568);
    Object localObject1;
    if (this.gxg)
    {
      localObject1 = (aco)this.gxf.get(paramInt);
      if ((paramView == null) || (((a)paramView.getTag()).type != 2))
      {
        paramView = this.ezi.inflate(2130969874, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.type = 2;
        paramViewGroup.gxi = ((TextView)paramView.findViewById(2131825028));
        paramView.setTag(paramViewGroup);
      }
      while (true)
      {
        paramViewGroup.gxi.setText(((aco)localObject1).wkk);
        AppMethodBeat.o(108568);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
    }
    bed localbed = (bed)this.fjr.get(paramInt);
    label236: Object localObject2;
    if ((paramView == null) || (((a)paramView.getTag()).type != 1))
    {
      paramViewGroup = this.ezi.inflate(2130969873, paramViewGroup, false);
      localObject1 = new a();
      ((a)localObject1).type = 1;
      ((a)localObject1).emg = ((TextView)paramViewGroup.findViewById(2131825026));
      ((a)localObject1).gxj = ((TextView)paramViewGroup.findViewById(2131825027));
      ((a)localObject1).gxl = ((CheckBox)paramViewGroup.findViewById(2131823847));
      ((a)localObject1).gxk = ((TextView)paramViewGroup.findViewById(2131823846));
      paramViewGroup.setTag(localObject1);
      if (!((q)((a)g.M(a.class)).getInviteFriendOpenStg()).wi(localbed.jBB))
        break label377;
      ((a)localObject1).gxk.setVisibility(0);
      label272: TextView localTextView = ((a)localObject1).emg;
      if (localbed == null)
        break label469;
      paramView = localbed.wbw;
      if ((paramView == null) || (paramView.length() <= 0))
        break label390;
      label301: localTextView.setText(paramView);
      localObject2 = ((a)localObject1).gxj;
      if (localbed == null)
        break label569;
      if (localbed.wyY != 0)
        break label475;
      paramView = localbed.jBB;
    }
    label390: label569: 
    while (true)
    {
      ((TextView)localObject2).setText(paramView);
      ((a)localObject1).gxl.setChecked(this.gxh[paramInt]);
      AppMethodBeat.o(108568);
      paramView = paramViewGroup;
      break;
      localObject1 = (a)paramView.getTag();
      paramViewGroup = paramView;
      break label236;
      label377: ((a)localObject1).gxk.setVisibility(8);
      break label272;
      localObject2 = localbed.jCH;
      if (localObject2 != null)
      {
        paramView = (View)localObject2;
        if (((String)localObject2).length() > 0)
          break label301;
      }
      localObject2 = new p(localbed.luF).toString();
      if (localObject2 != null)
      {
        paramView = (View)localObject2;
        if (((String)localObject2).length() > 0)
          break label301;
      }
      localObject2 = localbed.vLe;
      if (localObject2 != null)
      {
        paramView = (View)localObject2;
        if (((String)localObject2).length() > 0)
          break label301;
      }
      label469: paramView = "";
      break label301;
      label475: if (localbed.wyY == 2)
      {
        paramView = localbed.jBB;
      }
      else if (localbed.wyY == 1)
      {
        paramView = localbed.jBB;
        if (!bo.isNullOrNil(paramView))
        {
          paramView = paramView.split("@");
          if ((paramView == null) || (paramView.length < 2) || (bo.isNullOrNil(paramView[0])))
          {
            paramView = "";
            continue;
          }
          paramView = "@" + paramView[0];
        }
      }
      else
      {
        paramView = "";
      }
    }
  }

  public final void na(int paramInt)
  {
    AppMethodBeat.i(108563);
    if ((paramInt < 0) || (paramInt >= this.gxh.length))
    {
      AppMethodBeat.o(108563);
      return;
    }
    boolean[] arrayOfBoolean = this.gxh;
    if (arrayOfBoolean[paramInt] == 0);
    for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      super.notifyDataSetChanged();
      AppMethodBeat.o(108563);
      break;
    }
  }

  static final class a
  {
    TextView emg;
    TextView gxi;
    TextView gxj;
    TextView gxk;
    CheckBox gxl;
    int type;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.b
 * JD-Core Version:    0.6.2
 */