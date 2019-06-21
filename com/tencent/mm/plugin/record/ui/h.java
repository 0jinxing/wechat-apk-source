package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ah.i;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.record.ui.b.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public abstract class h extends BaseAdapter
{
  protected Context context;
  ListView mListView;
  private Runnable mhD = new h.2(this);
  protected ak mty = null;
  protected List<aar> pJZ = new LinkedList();
  SparseArray<h.b> pKp = new SparseArray();
  boolean pKq = false;
  private boolean pKr = false;
  protected a pKs;
  protected h.a pKt;
  private int padding = com.tencent.mm.bz.a.fromDPToPix(this.context, 35);

  public h(Context paramContext, h.a parama)
  {
    this.context = paramContext;
    this.mty = new h.1(this, Looper.getMainLooper());
    this.pKt = parama;
  }

  private aar BI(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.pJZ == null)
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (paramInt >= 0)
      {
        localObject2 = localObject1;
        if (paramInt < this.pJZ.size())
          localObject2 = (aar)this.pJZ.get(paramInt);
      }
    }
  }

  private static void VK(String paramString)
  {
    if (!t.mY(paramString))
    {
      com.tencent.mm.ah.h localh = new com.tencent.mm.ah.h();
      localh.username = paramString;
      com.tencent.mm.ah.o.act().b(localh);
    }
  }

  private static int m(aar paramaar)
  {
    int i;
    switch (paramaar.dataType)
    {
    default:
      i = 3;
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return i;
      i = 1;
      continue;
      i = 0;
      continue;
      i = 2;
    }
  }

  public abstract void a(a parama);

  public final void ceO()
  {
    this.pKp.put(0, new d(this.context));
    this.pKp.put(1, new com.tencent.mm.plugin.record.ui.b.a(this.pKt, this.mListView));
    this.pKp.put(2, new com.tencent.mm.plugin.record.ui.b.e());
    this.pKp.put(3, new com.tencent.mm.plugin.record.ui.b.b(this.pKt, this.mty));
    this.pKp.put(4, new com.tencent.mm.plugin.record.ui.b.c(this.pKt));
  }

  protected final void ceP()
  {
    this.mty.post(this.mhD);
  }

  public abstract void d(com.tencent.mm.plugin.record.ui.a.b paramb);

  public final void destroy()
  {
    for (int i = 0; i < this.pKp.size(); i++)
    {
      h.b localb = (h.b)this.pKp.valueAt(i);
      if (localb != null)
        localb.destroy();
    }
    if (this.pKt != null)
    {
      this.pKt.ceH();
      this.pKt = null;
    }
  }

  public int getCount()
  {
    if (this.pJZ == null);
    for (int i = 0; ; i = this.pJZ.size())
      return i;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    return m(BI(paramInt));
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = BI(paramInt);
    Object localObject2 = (h.b)this.pKp.get(m((aar)localObject1));
    paramViewGroup = paramView;
    if (paramView == null)
      paramViewGroup = ((h.b)localObject2).eK(this.context);
    Object localObject3;
    switch (((aar)localObject1).dataType)
    {
    default:
      paramView = new com.tencent.mm.plugin.record.ui.a.b();
      paramView.cAv = ((aar)localObject1);
      d(paramView);
      ((h.b)localObject2).a(paramViewGroup, paramInt, paramView);
      localObject2 = (ImageView)paramViewGroup.findViewById(2131820658);
      localObject3 = (TextView)paramViewGroup.findViewById(2131826905);
      paramView = j.b(((TextView)localObject3).getContext(), ((aar)localObject1).wgV, ((TextView)localObject3).getTextSize());
      if (bo.isNullOrNil(((aar)localObject1).whu))
      {
        ((TextView)localObject3).setText(paramView);
        paramView = (TextView)paramViewGroup.findViewById(2131826906);
        ab.d("MicroMsg.RecordMsgBaseAdapter", "datasrctime %s", new Object[] { ((aar)localObject1).wgX });
        if (((aar)localObject1).wgX != null)
        {
          if (!this.pKq)
            break label422;
          localObject3 = ((aar)localObject1).wgX;
          paramView.setText(((String)localObject3).substring(((String)localObject3).indexOf("-") + 1));
        }
        label229: if (paramInt != 0)
          break label613;
        if (((aar)localObject1).wgT == null)
          break label578;
        paramView = ((aar)localObject1).wgT.whw;
        ((ImageView)localObject2).setVisibility(0);
        if (!paramView.whV)
          break label490;
        VK(paramView.whU);
        if (!com.tencent.mm.aj.a.e.rr(paramView.whU))
          break label478;
        com.tencent.mm.at.o.ahp().a(com.tencent.mm.aj.a.e.ru(paramView.whU), (ImageView)localObject2);
        label295: if (paramInt != getCount() - 1)
          break label908;
        paramViewGroup.findViewById(2131820659).setVisibility(8);
      }
      break;
    case 2:
    case 15:
    }
    while (true)
    {
      return paramViewGroup;
      paramView = new com.tencent.mm.plugin.record.ui.a.a();
      break;
      paramView = new com.tencent.mm.plugin.record.ui.a.c();
      break;
      String str = ((aar)localObject1).whu;
      if (str == null);
      while (true)
      {
        ((TextView)localObject3).setText(paramView);
        break;
        paramView = new SpannableStringBuilder(paramView);
        int i = paramView.length();
        paramView.append(str);
        int j = paramView.length();
        paramView.setSpan(new ForegroundColorSpan(ah.getContext().getResources().getColor(2131690328)), i, j, 33);
      }
      label422: localObject3 = ((aar)localObject1).wgX.split(" ");
      if (localObject3.length < 2)
      {
        paramView.setText(((aar)localObject1).wgX);
        break label229;
      }
      paramView.setText(((aar)localObject1).wgX.substring(localObject3[0].length() + 1));
      break label229;
      label478: a.b.b((ImageView)localObject2, paramView.whU);
      break label295;
      label490: if ((paramView.whQ) && ((!r.Yz().equals(paramView.cEV)) || (!paramView.cEV.equals(paramView.toUser))))
      {
        VK(paramView.cEV);
        a.b.b((ImageView)localObject2, paramView.cEV);
        break label295;
      }
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.pKr = true;
      break label295;
      label578: ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.pKr = true;
      break label295;
      label613: if ((paramInt > 0) && (!this.pKr))
      {
        paramView = "";
        localObject3 = ((aar)localObject1).wgT.whw;
        if (BI(paramInt - 1).wgT.whw.whV)
          paramView = BI(paramInt - 1).wgT.whw.whU;
        while (true)
        {
          ((ImageView)localObject2).setVisibility(0);
          if (!((aar)localObject1).wgT.whw.whV)
            break label809;
          localObject1 = ((aar)localObject1).wgT.whw.whU;
          if (paramView.equals(localObject1))
            break label800;
          VK((String)localObject1);
          if (!com.tencent.mm.aj.a.e.rr(((aat)localObject3).whU))
            break label790;
          com.tencent.mm.at.o.ahp().a(com.tencent.mm.aj.a.e.ru(((aat)localObject3).whU), (ImageView)localObject2);
          break;
          if (BI(paramInt - 1).wgT.whw.whQ)
            paramView = BI(paramInt - 1).wgT.whw.cEV;
        }
        a.b.b((ImageView)localObject2, (String)localObject1);
        break label295;
        ((ImageView)localObject2).setVisibility(4);
        break label295;
        if (((aar)localObject1).wgT.whw.whQ)
        {
          localObject1 = ((aar)localObject1).wgT.whw.cEV;
          if (!paramView.equals(localObject1))
          {
            VK((String)localObject1);
            a.b.b((ImageView)localObject2, (String)localObject1);
            break label295;
          }
          ((ImageView)localObject2).setVisibility(4);
          break label295;
        }
        ((ImageView)localObject2).setVisibility(4);
        break label295;
      }
      label790: label800: label809: ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      break label295;
      label908: paramViewGroup.findViewById(2131820659).setVisibility(0);
    }
  }

  public int getViewTypeCount()
  {
    return 5;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.h
 * JD-Core Version:    0.6.2
 */