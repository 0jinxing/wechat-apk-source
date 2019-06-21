package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f extends BaseAdapter
{
  private final Activity czX;
  private final ak handler;
  final List<bau> list;
  private String nJy;
  final Map<Integer, Integer> rgf;
  final Map<Integer, Integer> rgg;
  int rgh;
  int rgi;
  private final f.b rgj;
  private final g rgk;
  final a rgl;
  fq rgm;

  public f(Activity paramActivity, String paramString, f.b paramb, a parama)
  {
    AppMethodBeat.i(38086);
    this.list = new ArrayList();
    this.rgf = new HashMap();
    this.rgg = new HashMap();
    this.rgh = 0;
    this.rgi = 0;
    this.handler = new ak();
    this.nJy = "";
    this.czX = paramActivity;
    this.nJy = paramString;
    this.rgj = paramb;
    this.rgl = parama;
    this.rgk = new g(new f.1(this));
    KC();
    AppMethodBeat.o(38086);
  }

  private void a(int paramInt, ImageView paramImageView)
  {
    AppMethodBeat.i(38090);
    bau localbau = (bau)getItem(paramInt);
    paramImageView.setVisibility(0);
    f.b.a locala = new f.b.a();
    locala.cFc = "";
    locala.position = paramInt;
    paramImageView.setTag(locala);
    af.cnC().b(localbau, paramImageView, this.czX.hashCode(), az.xYU);
    AppMethodBeat.o(38090);
  }

  public final void KC()
  {
    AppMethodBeat.i(38087);
    if (this.rgk != null)
    {
      r.aix();
      String str = n.aiu();
      ab.d("MicroMsg.ArtistAdapter", "packgePath: ".concat(String.valueOf(str)));
      this.rgk.gs(this.nJy, str);
    }
    AppMethodBeat.o(38087);
  }

  public final int getCount()
  {
    return this.rgh;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(38088);
    Object localObject = this.list.get(paramInt);
    AppMethodBeat.o(38088);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(38089);
    if (paramView == null)
    {
      paramViewGroup = new f.c(this);
      paramView = View.inflate(this.czX, 2130970746, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131827684));
      paramViewGroup.rgt = ((TextView)paramView.findViewById(2131827685));
      paramViewGroup.rgu = ((ImageView)paramView.findViewById(2131827686));
      paramViewGroup.rgv = ((ImageView)paramView.findViewById(2131827687));
      paramViewGroup.rgw = ((ImageView)paramView.findViewById(2131827688));
      paramViewGroup.rgx = ((LinearLayout)paramView.findViewById(2131827683));
      paramViewGroup.rgy = paramView.findViewById(2131827682);
      paramViewGroup.rgu.setOnClickListener(this.rgj.rgo);
      paramViewGroup.rgv.setOnClickListener(this.rgj.rgp);
      paramViewGroup.rgw.setOnClickListener(this.rgj.rgq);
      paramView.setTag(paramViewGroup);
      if (this.rgf.get(Integer.valueOf(paramInt)) == null)
        break label638;
    }
    label342: label638: for (int i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue(); ; i = -1)
    {
      paramViewGroup.rgu.setVisibility(8);
      paramViewGroup.rgv.setVisibility(8);
      paramViewGroup.rgw.setVisibility(8);
      paramViewGroup.rgy.setVisibility(8);
      if (paramViewGroup.rgn.nJy.equals("en"))
      {
        paramViewGroup.gsf.setVisibility(8);
        paramViewGroup.rgt.setVisibility(4);
      }
      while (true)
      {
        if ((i < this.rgi) && (i != -1))
          break label342;
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        AppMethodBeat.o(38089);
        return paramView;
        paramViewGroup = (f.c)paramView.getTag();
        break;
        paramViewGroup.gsf.setVisibility(4);
        paramViewGroup.rgt.setVisibility(8);
      }
      if (i - 1 >= 0);
      for (String str = ((bau)getItem(i - 1)).Desc; ; str = "")
      {
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        paramView.setVisibility(0);
        if (this.rgg.get(Integer.valueOf(paramInt)) != null);
        for (paramInt = ((Integer)this.rgg.get(Integer.valueOf(paramInt))).intValue(); ; paramInt = 1)
        {
          bau localbau = (bau)getItem(i);
          if ((localbau.Desc.equals("")) || (!localbau.Desc.equals(str)))
          {
            if (!this.nJy.equals("en"))
              break label582;
            paramViewGroup.rgt.setVisibility(0);
            paramViewGroup.rgt.setText(localbau.Desc);
            paramViewGroup.rgy.setVisibility(0);
          }
          while (true)
          {
            if (paramInt > 0)
              a(i, paramViewGroup.rgu);
            if (paramInt >= 2)
              a(i + 1, paramViewGroup.rgv);
            if (paramInt >= 3)
              a(i + 2, paramViewGroup.rgw);
            if (this.rgl == null)
              break;
            this.rgl.b(this.rgm);
            break;
            paramViewGroup.gsf.setVisibility(0);
            paramViewGroup.gsf.setText(localbau.Desc);
            paramViewGroup.rgy.setVisibility(0);
          }
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(fq paramfq);

    public abstract void b(fq paramfq);

    public abstract void crx();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.f
 * JD-Core Version:    0.6.2
 */