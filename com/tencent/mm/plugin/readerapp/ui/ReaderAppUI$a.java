package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.bm;
import com.tencent.mm.plugin.readerapp.c.g;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMNeat7extView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ReaderAppUI$a extends a<String>
{
  private Context context;
  private int enb;
  private int jNf;
  private int jNg;
  private int jNh;
  private int jNi;
  private int jNj;
  private int kmW;
  private Html.ImageGetter pFn;
  private int pFo;
  private int pFp;

  public ReaderAppUI$a(ReaderAppUI paramReaderAppUI, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
    AppMethodBeat.i(76825);
    this.pFn = new ReaderAppUI.a.1(this);
    this.pFo = 0;
    this.jNi = 0;
    this.jNg = 0;
    this.jNh = 0;
    this.pFp = 0;
    this.context = paramContext;
    this.kmW = 3;
    this.enb = g.cdZ().kI(ReaderAppUI.a(paramReaderAppUI));
    this.jNi = paramContext.getResources().getDimensionPixelSize(2131427858);
    this.jNg = paramContext.getResources().getDimensionPixelSize(2131427776);
    this.pFo = paramContext.getResources().getDimensionPixelSize(2131427500);
    this.jNh = paramContext.getResources().getDimensionPixelSize(2131427796);
    this.jNf = paramContext.getResources().getDimensionPixelSize(2131428210);
    this.jNj = paramContext.getResources().getDimensionPixelSize(2131428208);
    int i = com.tencent.mm.bz.a.gd(paramContext);
    int j = com.tencent.mm.bz.a.ge(paramContext);
    if (i < j)
      j = i;
    while (true)
    {
      this.pFp = ((int)((j - (int)(ReaderAppUI.cdr() * 32.0F)) / 2.35D));
      AppMethodBeat.o(76825);
      return;
    }
  }

  private static void O(View paramView, int paramInt)
  {
    AppMethodBeat.i(76833);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.rightMargin = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(76833);
  }

  private void a(ReaderAppUI.a.a parama, int paramInt, List<bl> paramList)
  {
    AppMethodBeat.i(76834);
    int i = paramList.size();
    if (paramInt == 1)
      if (bo.isNullOrNil(((bl)paramList.get(0)).aan()))
      {
        parama.jOS.setVisibility(0);
        O(parama.jOS, this.jNg);
        if (paramInt != 1)
          break label211;
        if (paramInt != i - 1)
          break label186;
        parama.jOT.setPadding(0, this.jNg, 0, this.jNg);
        AppMethodBeat.o(76834);
      }
    while (true)
    {
      return;
      parama.jOS.setVisibility(8);
      break;
      parama.jOS.setVisibility(0);
      bl localbl = (bl)paramList.get(paramInt - 1);
      paramList = (bl)paramList.get(paramInt);
      if ((bo.isNullOrNil(localbl.aan())) || (bo.isNullOrNil(paramList.aan())))
      {
        O(parama.jOS, this.jNg);
        break;
      }
      O(parama.jOS, this.jNj);
      break;
      label186: parama.jOT.setPadding(0, this.jNg, 0, this.jNi);
      AppMethodBeat.o(76834);
      continue;
      label211: if (paramInt == i - 1)
      {
        parama.jOT.setPadding(0, this.jNi, 0, this.jNg);
        AppMethodBeat.o(76834);
      }
      else
      {
        parama.jOT.setPadding(0, this.jNi, 0, this.jNi);
        AppMethodBeat.o(76834);
      }
    }
  }

  private static void a(ReaderAppUI.a.b paramb, ReaderAppUI.a.a parama)
  {
    AppMethodBeat.i(76824);
    if (paramb == null)
      AppMethodBeat.o(76824);
    while (true)
    {
      return;
      paramb.pFu.addView(parama.jOR);
      paramb.jPu.add(parama);
      AppMethodBeat.o(76824);
    }
  }

  private void a(ReaderAppUI.a.b paramb, List<bl> paramList, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(76831);
    ReaderAppUI.a.a locala = new ReaderAppUI.a.a(this);
    locala.jOR = View.inflate(this.context, paramInt1, null);
    locala.gsf = ((TextView)locala.jOR.findViewById(2131820678));
    locala.jOX = ((ImageView)locala.jOR.findViewById(2131821404));
    locala.jOW = locala.jOR.findViewById(2131821403);
    locala.jOS = locala.jOR.findViewById(2131821838);
    locala.jOT = locala.jOR.findViewById(2131821839);
    a(paramb, locala);
    paramb = (bl)paramList.get(paramInt2);
    a(locala, paramInt2, paramList);
    locala.gsf.setText(paramb.getTitle());
    if (paramb.aai())
    {
      locala.gsf.setText(Html.fromHtml(paramb.getTitle() + "<img src='2130839989'/>", this.pFn, null));
      if (bo.isNullOrNil(paramb.aan()))
        break label291;
      locala.jOX.setVisibility(0);
      a(paramb.aan(), locala.jOX, paramb.type, this.jNf, this.jNf, "@S");
    }
    while (true)
    {
      paramb = this.pFj.a(paramb, ReaderAppUI.a(this.pFj), paramInt2, paramString);
      locala.jOR.setOnClickListener(paramb);
      AppMethodBeat.o(76831);
      return;
      locala.gsf.setText(paramb.getTitle());
      break;
      label291: locala.jOW.setVisibility(8);
    }
  }

  private static void a(String paramString1, ImageView paramImageView, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(76835);
    if (com.tencent.mm.at.q.ahs())
      paramString1 = com.tencent.mm.at.q.sy(paramString1);
    while (true)
    {
      com.tencent.mm.at.a.a locala = o.ahp();
      c.a locala1 = new c.a();
      locala1.ePV = 2131689876;
      locala1.ePH = true;
      locala1 = locala1.ct(paramInt2, paramInt3);
      locala1.fGV = new f();
      locala1.ePJ = com.tencent.mm.pluginsdk.model.q.v(paramString1, paramInt1, paramString2);
      locala.a(paramString1, paramImageView, locala1.ahG(), null, new com.tencent.mm.pluginsdk.ui.applet.e(0, 0, 0, null));
      AppMethodBeat.o(76835);
      return;
    }
  }

  private void ds(View paramView)
  {
    AppMethodBeat.i(76832);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = this.pFp;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(76832);
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(76829);
    String str = (String)super.getItem(paramInt);
    AppMethodBeat.o(76829);
    return str;
  }

  public final void KC()
  {
    AppMethodBeat.i(76828);
    long l = System.currentTimeMillis();
    this.enb = g.cdZ().kI(20);
    setCursor(g.cdZ().cp(this.kmW, 20));
    ab.i("MicroMsg.ReaderAppUI", "[resetCursor] cost:%sms showCount:%s totalCount:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(this.kmW), Integer.valueOf(this.enb) });
    super.notifyDataSetChanged();
    AppMethodBeat.o(76828);
  }

  public final void KD()
  {
    AppMethodBeat.i(76826);
    KC();
    AppMethodBeat.o(76826);
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int bdo()
  {
    AppMethodBeat.i(76827);
    int i;
    if (bdn())
    {
      i = 0;
      AppMethodBeat.o(76827);
    }
    while (true)
    {
      return i;
      this.kmW += 3;
      if (this.kmW <= this.enb)
      {
        i = 3;
        AppMethodBeat.o(76827);
      }
      else
      {
        this.kmW = this.enb;
        i = this.enb % 3;
        AppMethodBeat.o(76827);
      }
    }
  }

  public final int getShowCount()
  {
    return this.kmW;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(76830);
    if (paramView == null)
    {
      paramViewGroup = new ReaderAppUI.a.b(this);
      paramView = View.inflate(this.context, 2130970450, null);
      paramViewGroup.ngD = ((TextView)paramView.findViewById(2131826831));
      paramViewGroup.pFu = ((ViewGroup)paramView.findViewById(2131826832));
      paramViewGroup.gCY = paramView.findViewById(2131822458);
      paramViewGroup.jPQ = paramView.findViewById(2131822455);
      paramViewGroup.jPe = ((ImageView)paramView.findViewById(2131821855));
      paramViewGroup.pFw = ((ImageView)paramView.findViewById(2131822456));
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826834));
      paramViewGroup.pFt = ((ImageView)paramView.findViewById(2131826833));
      paramViewGroup.ooM = ((TextView)paramView.findViewById(2131826835));
      paramViewGroup.jPn = paramView.findViewById(2131821852);
      paramViewGroup.pFv = ((MMNeat7extView)paramView.findViewById(2131822457));
      paramViewGroup.jPu = new ArrayList();
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      localObject1 = paramViewGroup.jPu.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ReaderAppUI.a.a)((Iterator)localObject1).next();
        paramViewGroup.pFu.removeView(((ReaderAppUI.a.a)localObject2).jOR);
      }
      paramViewGroup = (ReaderAppUI.a.b)paramView.getTag();
    }
    paramViewGroup.jPu.clear();
    Object localObject2 = getItem(paramInt);
    List localList = g.cdZ().Q((String)localObject2, 20);
    label441: label483: int j;
    label521: label568: Object localObject4;
    if (localList.size() > 0)
    {
      int i = localList.size();
      localObject3 = (bl)localList.get(0);
      paramViewGroup.ngD.setText(h.c(this.context, ((bl)localObject3).time, false));
      if (ReaderAppUI.h(this.pFj) != null)
      {
        paramViewGroup.ngD.setTextColor(ReaderAppUI.h(this.pFj).vgW);
        if (ReaderAppUI.h(this.pFj).vgX)
        {
          paramViewGroup.ngD.setShadowLayer(2.0F, 1.2F, 1.2F, ReaderAppUI.h(this.pFj).vgY);
          if (!ReaderAppUI.h(this.pFj).vgZ)
            break label954;
          paramViewGroup.ngD.setBackgroundResource(2130838199);
          paramViewGroup.ngD.setPadding(this.jNi, this.pFo, this.jNi, this.pFo);
        }
      }
      else
      {
        localObject2 = this.pFj.a((bl)localObject3, ReaderAppUI.a(this.pFj), 0, ((bl)localObject3).getTitle());
        paramViewGroup.jPn.setOnClickListener((View.OnClickListener)localObject2);
        if (i != 1)
          break label965;
        bool = true;
        paramViewGroup.gsf.setText(((bl)localObject3).getTitle());
        paramViewGroup.ooM.setText(((bl)localObject3).getDigest());
        if (bo.isNullOrNil(((bl)localObject3).aan()))
          break label971;
        j = 1;
        if (!((bl)localObject3).aai())
          break label977;
        paramViewGroup.pFv.ah(Html.fromHtml(((bl)localObject3).getTitle() + "<img src='2130839988'/>", this.pFn, null));
        localObject2 = paramViewGroup.ooM;
        if ((bool) && (!bo.isNullOrNil(((bl)localObject3).getDigest())))
          break label992;
      }
      label954: label965: label971: label977: label992: for (int k = 8; ; k = 0)
      {
        ((TextView)localObject2).setVisibility(k);
        paramViewGroup.pFw.setVisibility(8);
        if (!bool)
          break label998;
        paramViewGroup.jPe.setBackgroundResource(2130838305);
        paramViewGroup.gCY.setVisibility(0);
        paramViewGroup.pFv.setVisibility(8);
        paramViewGroup.gsf.setVisibility(0);
        ds(paramViewGroup.jPe);
        ds(paramViewGroup.jPQ);
        if (j == 0)
          break label1103;
        paramViewGroup.jPQ.setVisibility(0);
        localObject1 = ((bl)localObject3).aan();
        localObject4 = paramViewGroup.pFt;
        k = ((bl)localObject3).type;
        j = this.pFp;
        ReaderAppUI.a.2 local2 = new ReaderAppUI.a.2(this, bool, paramViewGroup);
        localObject2 = localObject1;
        if (com.tencent.mm.at.q.ahs())
          localObject2 = com.tencent.mm.at.q.sy((String)localObject1);
        int m = com.tencent.mm.bz.a.gd(((ImageView)localObject4).getContext()) - (int)(ReaderAppUI.cdr() * 32.0F);
        localObject1 = o.ahp();
        c.a locala = new c.a();
        locala.ePV = 2130837915;
        locala.ePH = true;
        locala.ePX = "2130837909";
        locala = locala.ct(m, j);
        locala.fGV = new f();
        locala.ePJ = com.tencent.mm.pluginsdk.model.q.v((String)localObject2, k, "@T");
        ((com.tencent.mm.at.a.a)localObject1).a((String)localObject2, (ImageView)localObject4, locala.ahG(), null, new com.tencent.mm.pluginsdk.ui.applet.e(2130837909, m, j, local2));
        paramViewGroup.gCY.setBackgroundResource(2130838282);
        paramViewGroup.gCY.setPadding(this.jNg, this.jNh, this.jNg, this.jNg);
        paramViewGroup.jPe.setVisibility(0);
        if (i <= 1)
          break label1236;
        for (j = 1; j < i - 1; j++)
          a(paramViewGroup, localList, 2130970457, j, ((bl)localObject3).getTitle());
        paramViewGroup.ngD.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
        break;
        paramViewGroup.ngD.setBackgroundColor(0);
        break label441;
        bool = false;
        break label483;
        j = 0;
        break label521;
        paramViewGroup.pFv.ah(((bl)localObject3).getTitle());
        break label568;
      }
      label998: paramViewGroup.jPe.setBackgroundResource(2130838307);
      localObject2 = paramViewGroup.gCY;
      if (j != 0);
      for (k = 8; ; k = 0)
      {
        ((View)localObject2).setVisibility(k);
        paramViewGroup.gsf.setVisibility(8);
        paramViewGroup.pFv.setVisibility(0);
        paramViewGroup.pFv.setTextColor(this.pFj.mController.ylL.getResources().getColor(2131690202));
        paramViewGroup.pFv.setBackgroundResource(2130839563);
        paramViewGroup.pFv.getPaint().setFakeBoldText(true);
        break;
      }
      label1103: paramViewGroup.jPQ.setVisibility(8);
      paramViewGroup.gsf.setVisibility(0);
      localObject2 = paramViewGroup.ooM;
      if (bo.isNullOrNil(((bl)localObject3).getDigest()))
      {
        j = 8;
        label1141: ((TextView)localObject2).setVisibility(j);
        if (!bool)
          break label1204;
        paramViewGroup.gCY.setBackgroundResource(2130838291);
      }
      while (true)
      {
        paramViewGroup.gCY.setPadding(this.jNg, this.jNg, this.jNg, this.jNg);
        paramViewGroup.jPe.setVisibility(8);
        break;
        j = 0;
        break label1141;
        label1204: paramViewGroup.gCY.setBackgroundResource(2130838290);
      }
      a(paramViewGroup, localList, 2130970456, i - 1, ((bl)localObject3).getTitle());
    }
    label1236: paramViewGroup.jPn.setTag(Integer.valueOf(paramInt));
    paramViewGroup.jPn.setTag(2131820654, Integer.valueOf(0));
    localObject2 = ReaderAppUI.i(this.pFj);
    Object localObject1 = paramViewGroup.jPn;
    Object localObject3 = this.pFj;
    if (localList.size() == 1)
    {
      bool = true;
      ((com.tencent.mm.ui.widget.b.a)localObject2).c((View)localObject1, ReaderAppUI.a((ReaderAppUI)localObject3, bool), ReaderAppUI.g(this.pFj));
      localObject2 = paramViewGroup.jPu.iterator();
      j = 1;
      label1331: if (!((Iterator)localObject2).hasNext())
        break label1454;
      localObject3 = (ReaderAppUI.a.a)((Iterator)localObject2).next();
      ((ReaderAppUI.a.a)localObject3).jOR.setTag(Integer.valueOf(paramInt));
      paramViewGroup = ReaderAppUI.i(this.pFj);
      localObject1 = ((ReaderAppUI.a.a)localObject3).jOR;
      localObject4 = this.pFj;
      if (localList.size() != 1)
        break label1448;
    }
    label1448: for (boolean bool = true; ; bool = false)
    {
      paramViewGroup.c((View)localObject1, ReaderAppUI.a((ReaderAppUI)localObject4, bool), ReaderAppUI.g(this.pFj));
      ((ReaderAppUI.a.a)localObject3).jOR.setTag(2131820654, Integer.valueOf(j));
      j++;
      break label1331;
      bool = false;
      break;
    }
    label1454: AppMethodBeat.o(76830);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.a
 * JD-Core Version:    0.6.2
 */