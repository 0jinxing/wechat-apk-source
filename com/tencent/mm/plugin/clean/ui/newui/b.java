package com.tencent.mm.plugin.clean.ui.newui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.c;
import com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class b extends BaseAdapter
  implements com.tencent.mm.ui.gridviewheaders.e
{
  private static int kxm = 0;
  private boolean bbV;
  ArrayList<com.tencent.mm.plugin.clean.c.a> iLD;
  AdapterView.OnItemClickListener jMk;
  HashSet<Integer> jur;
  GridHeadersGridView.c kxn;
  private ak kxo;
  AbsListView.OnScrollListener kxp;
  private CleanChattingDetailUI kyH;

  public b(CleanChattingDetailUI paramCleanChattingDetailUI, ArrayList<com.tencent.mm.plugin.clean.c.a> paramArrayList)
  {
    AppMethodBeat.i(18852);
    this.kxn = new b.2(this);
    this.jMk = new b.3(this);
    this.kxo = new b.4(this);
    this.kxp = new b.5(this);
    this.kyH = paramCleanChattingDetailUI;
    this.iLD = paramArrayList;
    this.jur = new HashSet();
    AppMethodBeat.o(18852);
  }

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18857);
    if (paramView == null)
    {
      ab.v("MicroMsg.CleanChattingDetailAdapter", "convertView is null");
      paramView = this.kyH.getLayoutInflater().inflate(2130969141, paramViewGroup, false);
      paramViewGroup = new b.a(this);
      paramViewGroup.kxr = ((TextView)paramView.findViewById(2131822768));
      paramViewGroup.kxs = ((TextView)paramView.findViewById(2131822769));
      paramViewGroup.kxt = ((CheckBox)paramView.findViewById(2131822770));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      localObject = tz(paramInt);
      paramViewGroup.position = paramInt;
      paramViewGroup.kxr.setText(h.formatTime(this.kyH.getString(2131300014), ((com.tencent.mm.plugin.clean.c.a)localObject).fXb / 1000L));
      long l = ((com.tencent.mm.plugin.clean.c.a)localObject).bfH();
      localObject = new HashSet();
      for (paramInt = 0; paramInt < this.iLD.size(); paramInt++)
        if (((com.tencent.mm.plugin.clean.c.a)this.iLD.get(paramInt)).bfH() == l)
          ((HashSet)localObject).add(Integer.valueOf(paramInt));
      ab.v("MicroMsg.CleanChattingDetailAdapter", "convertView is not null");
      paramViewGroup = (b.a)paramView.getTag();
    }
    Object localObject = ((HashSet)localObject).iterator();
    paramInt = 1;
    if (((Iterator)localObject).hasNext())
    {
      int i = ((Integer)((Iterator)localObject).next()).intValue();
      if (this.jur.contains(Integer.valueOf(i)))
        break label293;
      paramInt = 0;
    }
    label293: 
    while (true)
    {
      break;
      if (paramInt != 0)
        paramViewGroup.kxt.setChecked(true);
      while (true)
      {
        AppMethodBeat.o(18857);
        return paramView;
        paramViewGroup.kxt.setChecked(false);
      }
    }
  }

  public final void bgh()
  {
    AppMethodBeat.i(18859);
    this.jur.clear();
    bgi();
    AppMethodBeat.o(18859);
  }

  final void bgi()
  {
    AppMethodBeat.i(18858);
    this.kyH.tx(this.jur.size());
    Object localObject = this.kyH;
    int i;
    if (this.jur.size() == this.iLD.size())
    {
      i = 1;
      if (i == 0)
        break label113;
      ((CleanChattingDetailUI)localObject).kxB.setChecked(true);
    }
    long l;
    while (true)
    {
      localObject = this.jur.iterator();
      for (l = 0L; ((Iterator)localObject).hasNext(); l = ((com.tencent.mm.plugin.clean.c.a)this.iLD.get(i)).size + l)
        i = ((Integer)((Iterator)localObject).next()).intValue();
      i = 0;
      break;
      label113: ((CleanChattingDetailUI)localObject).kxB.setChecked(false);
    }
    localObject = this.kyH;
    if (l > 0L)
    {
      ((CleanChattingDetailUI)localObject).kxC.setText(((CleanChattingDetailUI)localObject).getString(2131298867, new Object[] { bo.ga(l) }));
      AppMethodBeat.o(18858);
    }
    while (true)
    {
      return;
      ((CleanChattingDetailUI)localObject).kxC.setText("");
      AppMethodBeat.o(18858);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(18853);
    int i = this.iLD.size();
    AppMethodBeat.o(18853);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18855);
    long l = System.currentTimeMillis();
    com.tencent.mm.plugin.clean.c.a locala;
    if (paramView == null)
    {
      paramView = this.kyH.getLayoutInflater().inflate(2130969140, paramViewGroup, false);
      paramViewGroup = new b.b(this);
      paramViewGroup.kxu = ((MMImageView)paramView.findViewById(2131822764));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.kxw = paramView.findViewById(2131822767);
      paramViewGroup.kxx = paramView.findViewById(2131822766);
      paramViewGroup.kxv = ((ImageView)paramView.findViewById(2131822765));
      paramViewGroup.gxi = ((TextView)paramView.findViewById(2131821227));
      paramView.setTag(paramViewGroup);
      locala = tz(paramInt);
      paramViewGroup.kxu.setTag(locala.filePath);
      paramViewGroup.kxw.setOnClickListener(new b.1(this, paramInt));
      if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label305;
      paramViewGroup.gnD.setChecked(true);
      paramViewGroup.kxx.setVisibility(0);
      label188: if (locala.type != 3)
        break label325;
      paramViewGroup.kxv.setVisibility(0);
    }
    while (true)
    {
      if (locala.type != 4)
        break label337;
      paramViewGroup.kxu.setImageResource(com.tencent.mm.pluginsdk.model.o.aiD(com.tencent.mm.vfs.e.cv(locala.filePath)));
      paramViewGroup.gxi.setText(new com.tencent.mm.vfs.b(locala.filePath).getName());
      paramViewGroup.gxi.setVisibility(0);
      ab.d("MicroMsg.CleanChattingDetailAdapter", "getView time=%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(18855);
      return paramView;
      paramViewGroup = (b.b)paramView.getTag();
      break;
      label305: paramViewGroup.gnD.setChecked(false);
      paramViewGroup.kxx.setVisibility(8);
      break label188;
      label325: paramViewGroup.kxv.setVisibility(8);
    }
    label337: if (kxm == 0)
      kxm = paramView.getMeasuredWidth();
    Object localObject = new c.a();
    ((c.a)localObject).fHe = 1;
    ((c.a)localObject).ePI = false;
    ((c.a)localObject).ePO = kxm;
    ((c.a)localObject).ePN = kxm;
    if (locala.type == 1)
    {
      ((c.a)localObject).ePJ = locala.filePath;
      localObject = ((c.a)localObject).ahG();
      com.tencent.mm.at.o.ahp().a(locala.filePath, paramViewGroup.kxu, (c)localObject);
    }
    while (true)
    {
      paramViewGroup.gxi.setVisibility(8);
      break;
      ((c.a)localObject).ePJ = locala.thumbPath;
      localObject = ((c.a)localObject).ahG();
      com.tencent.mm.at.o.ahp().a(locala.thumbPath, paramViewGroup.kxu, (c)localObject);
    }
  }

  public final long tw(int paramInt)
  {
    AppMethodBeat.i(18856);
    long l = ((com.tencent.mm.plugin.clean.c.a)this.iLD.get(paramInt)).bfH();
    AppMethodBeat.o(18856);
    return l;
  }

  public final com.tencent.mm.plugin.clean.c.a tz(int paramInt)
  {
    AppMethodBeat.i(18854);
    com.tencent.mm.plugin.clean.c.a locala = (com.tencent.mm.plugin.clean.c.a)this.iLD.get(paramInt);
    AppMethodBeat.o(18854);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b
 * JD-Core Version:    0.6.2
 */