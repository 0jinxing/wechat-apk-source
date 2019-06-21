package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.l;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.brandservice.ui.b.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.t;
import java.util.List;

public final class e extends BaseAdapter
{
  private int emC;
  List<q> iKa;
  r.c jKp;
  boolean jNE;
  private BizTimeLineNewMsgUI jNS;
  boolean jNT;

  public e(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI, List<q> paramList, int paramInt)
  {
    AppMethodBeat.i(14149);
    this.jNT = false;
    this.jKp = new e.1(this);
    this.jNE = false;
    this.jNS = paramBizTimeLineNewMsgUI;
    z.aeY().a(this.jKp, Looper.getMainLooper());
    this.iKa = paramList;
    this.emC = paramInt;
    AppMethodBeat.o(14149);
  }

  public final q aWp()
  {
    AppMethodBeat.i(14153);
    q localq;
    if (this.iKa.size() > 0)
    {
      localq = (q)this.iKa.get(this.iKa.size() - 1);
      AppMethodBeat.o(14153);
    }
    while (true)
    {
      return localq;
      localq = null;
      AppMethodBeat.o(14153);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(14150);
    int i = this.iKa.size();
    AppMethodBeat.o(14150);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(14152);
    Object localObject = sg(paramInt);
    if (localObject == null)
    {
      ab.e("MicroMsg.BizTimeLineAdapter", "getView info is null");
      AppMethodBeat.o(14152);
      return paramView;
    }
    e.a locala;
    if (paramView == null)
    {
      locala = new e.a();
      paramViewGroup = View.inflate(this.jNS, 2130968869, null);
      locala.eks = ((ImageView)paramViewGroup.findViewById(2131821183));
      locala.gtO = ((TextView)paramViewGroup.findViewById(2131821809));
      locala.timeTv = ((TextView)paramViewGroup.findViewById(2131820988));
      locala.gne = ((TextView)paramViewGroup.findViewById(2131821185));
      locala.iLS = paramViewGroup.findViewById(2131821810);
      paramViewGroup.setTag(locala);
      label130: a.b.b(locala.eks, ((q)localObject).field_talker);
      paramView = s.mJ(((q)localObject).field_talker);
      locala.gtO.setText(j.b(this.jNS, paramView, locala.gtO.getTextSize()));
      locala.timeTv.setText(b.e(this.jNS, ((q)localObject).field_createTime));
      if (!((q)localObject).drC())
        break label269;
      locala.gne.setText(l.mi(((q)localObject).field_content));
      label220: if (paramInt != getCount() - 1)
        break label887;
      locala.iLS.setVisibility(4);
    }
    while (true)
    {
      sh(paramInt);
      AppMethodBeat.o(14152);
      paramView = paramViewGroup;
      break;
      locala = (e.a)paramView.getTag();
      paramViewGroup = paramView;
      break label130;
      label269: if (!((q)localObject).isText())
        if (((q)localObject).field_type != 10000)
          break label328;
      label328: for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label334;
        locala.gne.setText(j.a(this.jNS, ((q)localObject).field_content, (int)locala.gne.getTextSize()));
        break;
      }
      label334: if (((q)localObject).drE())
      {
        locala.gne.setText(this.jNS.getString(2131297012));
        break label220;
      }
      if (((q)localObject).drD())
      {
        locala.gne.setText(this.jNS.getString(2131297079));
        break label220;
      }
      if (((q)localObject).field_type == 43);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label434;
        locala.gne.setText(this.jNS.getString(2131297076));
        break;
      }
      label434: if ((((q)localObject).field_type == 42) || (((q)localObject).field_type == 66));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label488;
        locala.gne.setText(this.jNS.getString(2131297019));
        break;
      }
      label488: label504: j.b localb;
      if ((((q)localObject).field_type & 0xFFFF) == 49)
      {
        i = 1;
        if (i == 0)
          break label866;
        localb = j.b.me(((q)localObject).field_content);
        if (localb == null)
          break label866;
        paramView = "";
        switch (localb.type)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 16:
        case 2001:
        case 436207665:
        case 469762097:
        }
      }
      while (true)
      {
        localObject = paramView;
        if (bo.isNullOrNil(paramView))
          localObject = localb.getTitle();
        locala.gne.setText(j.b(this.jNS, (CharSequence)localObject, locala.gne.getTextSize()));
        break;
        i = 0;
        break label504;
        paramView = localb.title;
        continue;
        paramView = this.jNS.getString(2131297012);
        continue;
        paramView = this.jNS.getString(2131296980) + localb.title;
        continue;
        paramView = this.jNS.getString(2131297076) + localb.title;
        continue;
        paramView = this.jNS.getString(2131297071) + localb.getTitle();
        continue;
        paramView = this.jNS.getString(2131297019) + localb.getTitle();
        continue;
        paramView = "[" + localb.fhW + "]" + localb.fhS;
      }
      label866: locala.gne.setText(this.jNS.getString(2131297668));
      break label220;
      label887: locala.iLS.setVisibility(0);
    }
  }

  public final q sg(int paramInt)
  {
    AppMethodBeat.i(14151);
    q localq;
    if (paramInt < this.iKa.size())
    {
      localq = (q)this.iKa.get(paramInt);
      AppMethodBeat.o(14151);
    }
    while (true)
    {
      return localq;
      localq = null;
      AppMethodBeat.o(14151);
    }
  }

  public final void sh(int paramInt)
  {
    AppMethodBeat.i(14154);
    if ((this.emC == 1) && (!this.jNT))
      AppMethodBeat.o(14154);
    while (true)
    {
      return;
      if ((paramInt == getCount() - 1) && (!this.jNE))
        al.n(new e.2(this, paramInt), 300L);
      AppMethodBeat.o(14154);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.e
 * JD-Core Version:    0.6.2
 */