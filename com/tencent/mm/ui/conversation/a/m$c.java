package com.tencent.mm.ui.conversation.a;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class m$c
  implements Runnable
{
  WeakReference<m> zwF;
  List<s> zwO;
  List<s> zwP;

  private static int a(String paramString, m paramm, List<s> paramList, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34692);
    Iterator localIterator = paramList.iterator();
    s locals;
    label192: m.b localb;
    while (true)
      if (localIterator.hasNext())
      {
        locals = (s)localIterator.next();
        paramm.zwD.put(locals.getFileName(), Long.valueOf(locals.fVs));
        if (paramm.zwE.containsKey(Long.valueOf(locals.fVs)))
        {
          ab.d("MicroMsg.MassSightBanner", "%s: has contains massSendId %d, file %s", new Object[] { paramString, Long.valueOf(locals.fVs), locals.getFileName() });
        }
        else if (paramInt1 < paramInt2)
        {
          paramList = paramm.mContainer;
          int i = paramInt1 + 1;
          paramList = paramList.getChildAt(paramInt1);
          ab.d("MicroMsg.MassSightBanner", "%s: refresh view(%d/%d, hashCode %d) with massSendId %d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramList.hashCode()), Long.valueOf(locals.fVs) });
          paramInt1 = i;
          localb = (m.b)paramList.getTag();
          if (localb != null)
            break label702;
          localb = new m.b((byte)0);
        }
      }
    label436: label702: 
    while (true)
    {
      String str1;
      if (localb.zwG != locals.fVs)
      {
        ab.d("MicroMsg.MassSightBanner", "ashutest::mass send id not match! %d -> %d, totalCount %d", new Object[] { Long.valueOf(localb.zwG), Long.valueOf(locals.fVs), Integer.valueOf(paramInt3) });
        localb.zwG = locals.fVs;
        localb.zwI = paramList;
        localb.zwJ = ((com.tencent.mm.plugin.sight.decode.a.a)paramList.findViewById(2131825941));
        localb.zwK = ((ImageView)paramList.findViewById(2131825942));
        localb.gHA = ((ProgressBar)paramList.findViewById(2131821370));
        localb.zwM = ((ImageButton)paramList.findViewById(2131822819));
        localb.zwL = ((TextView)paramList.findViewById(2131824214));
        localb.zwJ.setDrawableWidth(paramList.getResources().getDimensionPixelSize(2131427804));
        localb.zwI.setTag(localb);
        localb.zwM.setTag(Long.valueOf(localb.zwG));
        localb.zwI.setOnClickListener(new m.b.1(localb));
        localb.zwM.setOnClickListener(new m.b.2(localb));
        com.tencent.mm.modelvideo.o.all();
        str1 = t.uh(locals.getFileName());
        com.tencent.mm.modelvideo.o.all();
        String str2 = t.ui(locals.getFileName());
        paramList = com.tencent.mm.at.o.ahl().a(str2, com.tencent.mm.bz.a.getDensity(paramList.getContext()), paramList.getContext());
        localb.zwJ.setThumbBmp(paramList);
        if (paramInt3 <= 3)
          break label669;
        localb.zwJ.clear();
        localb.zwK.setVisibility(0);
      }
      while (true)
      {
        a(localb, locals);
        paramm.zwE.put(Long.valueOf(locals.fVs), localb);
        break;
        paramList = LayoutInflater.from(paramm.mContainer.getContext()).inflate(2130970079, paramm.mContainer, false);
        paramm.mContainer.addView(paramList);
        ab.d("MicroMsg.MassSightBanner", "%s: new view(%d/%d, hashCode %d) with massSendId %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramList.hashCode()), Long.valueOf(locals.fVs) });
        break label192;
        ab.d("MicroMsg.MassSightBanner", "ashutest::mass send id match! %d, totalCount %d", new Object[] { Long.valueOf(localb.zwG), Integer.valueOf(paramInt3) });
        break label436;
        localb.zwJ.bf(str1, false);
        localb.zwK.setVisibility(8);
      }
      AppMethodBeat.o(34692);
      return paramInt1;
    }
  }

  public static void a(m.b paramb, s params)
  {
    boolean bool = true;
    AppMethodBeat.i(34693);
    ab.v("MicroMsg.MassSightBanner", "info status %d", new Object[] { Integer.valueOf(params.status) });
    if ((params.status == 198) || (params.status == 197) || (params.status == 196))
    {
      paramb.gHA.setVisibility(4);
      paramb.zwL.setVisibility(0);
      paramb.zwM.setEnabled(true);
      paramb.zwH = true;
      AppMethodBeat.o(34693);
      return;
    }
    float f = params.fVG / params.frO;
    paramb.gHA.setVisibility(0);
    paramb.zwL.setVisibility(4);
    paramb.gHA.setProgress((int)(paramb.gHA.getMax() * f));
    params = paramb.zwM;
    if (Float.compare(0.99F, f) > 0);
    while (true)
    {
      params.setEnabled(bool);
      paramb.zwH = false;
      AppMethodBeat.o(34693);
      break;
      bool = false;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(34694);
    m localm = (m)this.zwF.get();
    if (localm == null)
    {
      ab.w("MicroMsg.MassSightBanner", "try to refresh, but banner ref is null");
      AppMethodBeat.o(34694);
    }
    while (true)
    {
      return;
      int i = localm.mContainer.getChildCount();
      localm.zwE.clear();
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.zwO.iterator();
      while (localIterator.hasNext())
        localHashSet.add(Long.valueOf(((s)localIterator.next()).fVs));
      localIterator = this.zwP.iterator();
      while (localIterator.hasNext())
        localHashSet.add(Long.valueOf(((s)localIterator.next()).fVs));
      int j = localHashSet.size();
      int k = a("update unfinish", localm, this.zwO, 0, i, j);
      k = a("update fail", localm, this.zwP, k, i, j);
      for (j = k; j < i; j++)
        localm.mContainer.removeViewAt(k);
      AppMethodBeat.o(34694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.m.c
 * JD-Core Version:    0.6.2
 */