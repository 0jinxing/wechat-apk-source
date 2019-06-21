package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.plugin.clean.c.i;
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
  ArrayList<i> iLD;
  boolean isStop;
  AdapterView.OnItemClickListener jMk;
  HashSet<Integer> jur;
  private CleanChattingDetailUI kxl;
  GridHeadersGridView.c kxn;
  private ak kxo;
  AbsListView.OnScrollListener kxp;
  private String username;

  public b(CleanChattingDetailUI paramCleanChattingDetailUI, String paramString)
  {
    AppMethodBeat.i(18754);
    this.isStop = false;
    this.kxn = new b.3(this);
    this.jMk = new b.4(this);
    this.kxo = new b.5(this);
    this.kxp = new b.6(this);
    this.kxl = paramCleanChattingDetailUI;
    this.jur = new HashSet();
    this.iLD = new ArrayList();
    this.username = paramString;
    AppMethodBeat.o(18754);
  }

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18759);
    if (paramView == null)
    {
      ab.v("MicroMsg.CleanChattingDetailAdapter", "convertView is null");
      paramView = this.kxl.getLayoutInflater().inflate(2130969141, paramViewGroup, false);
      paramViewGroup = new b.a(this);
      paramViewGroup.kxr = ((TextView)paramView.findViewById(2131822768));
      paramViewGroup.kxs = ((TextView)paramView.findViewById(2131822769));
      paramViewGroup.kxt = ((CheckBox)paramView.findViewById(2131822770));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      localObject = tv(paramInt);
      paramViewGroup.position = paramInt;
      paramViewGroup.kxr.setText(h.formatTime(this.kxl.getString(2131300014), ((i)localObject).fXb / 1000L));
      long l = ((i)localObject).bfH();
      localObject = new HashSet();
      for (paramInt = 0; paramInt < this.iLD.size(); paramInt++)
        if (((i)this.iLD.get(paramInt)).bfH() == l)
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
        break label294;
      paramInt = 0;
    }
    label294: 
    while (true)
    {
      break;
      if (paramInt != 0)
        paramViewGroup.kxt.setChecked(true);
      while (true)
      {
        AppMethodBeat.o(18759);
        return paramView;
        paramViewGroup.kxt.setChecked(false);
      }
    }
  }

  public final void bgh()
  {
    AppMethodBeat.i(18761);
    this.jur.clear();
    bgi();
    AppMethodBeat.o(18761);
  }

  final void bgi()
  {
    AppMethodBeat.i(18760);
    this.kxl.tx(this.jur.size());
    Object localObject = this.kxl;
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
      for (l = 0L; ((Iterator)localObject).hasNext(); l = ((i)this.iLD.get(i)).size + l)
        i = ((Integer)((Iterator)localObject).next()).intValue();
      i = 0;
      break;
      label113: ((CleanChattingDetailUI)localObject).kxB.setChecked(false);
    }
    localObject = this.kxl;
    if (l > 0L)
    {
      ((CleanChattingDetailUI)localObject).kxC.setText(((CleanChattingDetailUI)localObject).getString(2131298867, new Object[] { bo.ga(l) }));
      AppMethodBeat.o(18760);
    }
    while (true)
    {
      return;
      ((CleanChattingDetailUI)localObject).kxC.setText("");
      AppMethodBeat.o(18760);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(18755);
    int i = this.iLD.size();
    AppMethodBeat.o(18755);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18757);
    long l = System.currentTimeMillis();
    i locali;
    if (paramView == null)
    {
      paramView = this.kxl.getLayoutInflater().inflate(2130969140, paramViewGroup, false);
      paramViewGroup = new b.c(this);
      paramViewGroup.kxu = ((MMImageView)paramView.findViewById(2131822764));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.kxw = paramView.findViewById(2131822767);
      paramViewGroup.kxx = paramView.findViewById(2131822766);
      paramViewGroup.kxv = ((ImageView)paramView.findViewById(2131822765));
      paramViewGroup.gxi = ((TextView)paramView.findViewById(2131821227));
      paramView.setTag(paramViewGroup);
      locali = tv(paramInt);
      paramViewGroup.kxu.setTag(locali.filePath);
      paramViewGroup.kxw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(18747);
          b.a(b.this, paramInt);
          b.this.notifyDataSetChanged();
          AppMethodBeat.o(18747);
        }
      });
      if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label320;
      paramViewGroup.gnD.setChecked(true);
      paramViewGroup.kxx.setVisibility(0);
      label188: if (locali.type != 3)
        break label340;
      paramViewGroup.kxv.setVisibility(0);
      label205: if (locali.type != 4)
        break label352;
      com.tencent.mm.at.o.ahp().b(locali.thumbPath, paramViewGroup.kxu);
      paramViewGroup.kxu.setImageResource(com.tencent.mm.pluginsdk.model.o.aiD(com.tencent.mm.vfs.e.cv(locali.filePath)));
      paramViewGroup.gxi.setText(new com.tencent.mm.vfs.b(locali.filePath).getName());
      paramViewGroup.gxi.setVisibility(0);
    }
    while (true)
    {
      ab.d("MicroMsg.CleanChattingDetailAdapter", "getView time=%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(18757);
      return paramView;
      paramViewGroup = (b.c)paramView.getTag();
      break;
      label320: paramViewGroup.gnD.setChecked(false);
      paramViewGroup.kxx.setVisibility(8);
      break label188;
      label340: paramViewGroup.kxv.setVisibility(8);
      break label205;
      label352: if (kxm == 0)
        kxm = paramView.getMeasuredWidth();
      Object localObject = new c.a();
      ((c.a)localObject).fHe = 1;
      ((c.a)localObject).ePI = false;
      ((c.a)localObject).ePO = kxm;
      ((c.a)localObject).ePN = kxm;
      ((c.a)localObject).ePJ = locali.thumbPath;
      localObject = ((c.a)localObject).ahG();
      com.tencent.mm.at.o.ahp().a(locali.thumbPath, paramViewGroup.kxu, (c)localObject);
      paramViewGroup.gxi.setVisibility(8);
    }
  }

  public final i tv(int paramInt)
  {
    AppMethodBeat.i(18756);
    i locali = (i)this.iLD.get(paramInt);
    AppMethodBeat.o(18756);
    return locali;
  }

  public final long tw(int paramInt)
  {
    AppMethodBeat.i(18758);
    long l = ((i)this.iLD.get(paramInt)).bfH();
    AppMethodBeat.o(18758);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.b
 * JD-Core Version:    0.6.2
 */