package com.tencent.mm.plugin.sns.ui;

import android.os.Process;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MMPullDownView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class SnsUserUI$13
  implements SnsUIAction.a
{
  SnsUserUI$13(SnsUserUI paramSnsUserUI)
  {
  }

  public final void Eh(int paramInt)
  {
    AppMethodBeat.i(39802);
    ab.i("MicroMsg.SnsUserUI", "onListViewScoll %s", new Object[] { Integer.valueOf(paramInt) });
    SnsUserUI localSnsUserUI;
    boolean bool;
    int i;
    int j;
    int k;
    if (paramInt == 2)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSUserScrollEnable, SnsUserUI.h(this.rDa));
      localSnsUserUI = this.rDa;
      bool = WXHardCoderJNI.hcSNSUserScrollEnable;
      i = WXHardCoderJNI.hcSNSUserScrollDelay;
      j = WXHardCoderJNI.hcSNSUserScrollCPU;
      k = WXHardCoderJNI.hcSNSUserScrollIO;
      if (!WXHardCoderJNI.hcSNSUserScrollThr)
        break label133;
    }
    label133: for (paramInt = Process.myTid(); ; paramInt = 0)
    {
      SnsUserUI.a(localSnsUserUI, WXHardCoderJNI.startPerformance(bool, i, j, k, paramInt, WXHardCoderJNI.hcSNSUserScrollTimeout, 704, WXHardCoderJNI.hcSNSUserScrollAction, "MicroMsg.SnsUserUI"));
      ab.i("MicroMsg.SnsUserUI", "summer hardcoder sns startPerformance [%s]", new Object[] { Integer.valueOf(SnsUserUI.h(this.rDa)) });
      AppMethodBeat.o(39802);
      return;
    }
  }

  public final void ad(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(39803);
    Object localObject;
    at localat;
    if (SnsUserUI.a(this.rDa) != null)
    {
      localObject = SnsUserUI.a(this.rDa);
      if (((as)localObject).rvw != null)
      {
        localat = ((as)localObject).rvw;
        localObject = af.cnF().DK(paramInt);
        if ((localObject == null) || (((n)localObject).cqu().xfI == null) || (localat.list.size() <= 0))
        {
          AppMethodBeat.o(39803);
          return;
        }
      }
    }
    for (paramInt = 0; ; paramInt++)
    {
      int j = i;
      if (paramInt < localat.list.size())
      {
        if (((n)localat.list.get(paramInt)).cqU() == ((n)localObject).cqU())
        {
          j = 1;
          localat.list.remove(paramInt);
        }
      }
      else
      {
        if (j != 0)
        {
          localat.list.add(localObject);
          localat.ctM();
          localat.ctN();
        }
        AppMethodBeat.o(39803);
        break;
      }
    }
  }

  public final void b(int paramInt, List<Integer> paramList1, List<Integer> paramList2)
  {
    AppMethodBeat.i(39800);
    Object localObject1;
    Object localObject2;
    if ((paramInt != -1) && (SnsUserUI.a(this.rDa) != null))
    {
      localObject1 = SnsUserUI.a(this.rDa);
      if (((as)localObject1).rvw != null)
      {
        localObject1 = ((as)localObject1).rvw;
        localObject2 = af.cnF().DK(paramInt);
        if ((localObject2 != null) && (((n)localObject2).cqu().xfI != null) && (((at)localObject1).list.size() > 0))
          break label147;
      }
    }
    while ((SnsUserUI.a(this.rDa) != null) && (paramList1 != null) && (paramList2 != null))
    {
      localObject1 = SnsUserUI.a(this.rDa);
      if (((as)localObject1).rvw != null)
        if ((paramList1 == null) || (paramList2 == null) || (paramList1.size() + paramList2.size() == 0))
        {
          AppMethodBeat.o(39800);
          return;
          label147: ((at)localObject1).list.add(1, localObject2);
          ((at)localObject1).ctM();
          ((at)localObject1).ctN();
        }
        else
        {
          localObject1 = ((as)localObject1).rvw;
          if ((paramList1 != null) && (paramList1.size() != 0))
            break label224;
          if ((paramList2 != null) && (paramList2.size() != 0))
            break label333;
        }
    }
    while (true)
    {
      ((at)localObject1).ctM();
      ((at)localObject1).ctN();
      AppMethodBeat.o(39800);
      break;
      label224: ab.d("MicroMsg.SnsSelfHelper", "remove Items");
      localObject2 = paramList1.iterator();
      label239: int i;
      label331: 
      while (true)
      {
        int j;
        if (((Iterator)localObject2).hasNext())
        {
          i = ((Integer)((Iterator)localObject2).next()).intValue();
          j = ((at)localObject1).list.size();
        }
        for (paramInt = 1; ; paramInt++)
        {
          if (paramInt >= j)
            break label331;
          paramList1 = (n)((at)localObject1).list.get(paramInt);
          if ((paramList1 != null) && (paramList1.reX == i))
          {
            ((at)localObject1).list.remove(paramInt);
            break label239;
            break;
          }
        }
      }
      label333: ab.d("MicroMsg.SnsSelfHelper", "change Items");
      paramList1 = new LinkedList();
      for (paramInt = 1; paramInt < ((at)localObject1).list.size(); paramInt = i + 1)
      {
        n localn = (n)((at)localObject1).list.get(paramInt);
        i = paramInt;
        if (localn != null)
        {
          localObject2 = paramList2.iterator();
          do
          {
            i = paramInt;
            if (!((Iterator)localObject2).hasNext())
              break;
            i = ((Integer)((Iterator)localObject2).next()).intValue();
          }
          while (localn.reX != i);
          ab.d("MicroMsg.SnsSelfHelper", "update list localId ".concat(String.valueOf(i)));
          ((at)localObject1).list.remove(paramInt);
          paramList1.add(af.cnF().DK(i));
          i = paramInt - 1;
        }
      }
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (n)paramList1.next();
        ((at)localObject1).list.add(paramList2);
      }
    }
  }

  public final void cuh()
  {
    AppMethodBeat.i(39795);
    if (SnsUserUI.b(this.rDa) == null)
      SnsUserUI.a(this.rDa, af.cnv());
    am.a locala = SnsUserUI.b(this.rDa);
    String str = SnsUserUI.c(this.rDa);
    SnsUserUI.d(this.rDa);
    locala.b(2, str, SnsUserUI.f(this.rDa), SnsUserUI.e(this.rDa));
    af.bCo().postDelayed(SnsUserUI.g(this.rDa), 3000L);
    AppMethodBeat.o(39795);
  }

  public final View cui()
  {
    AppMethodBeat.i(39797);
    View localView = this.rDa.findViewById(2131821333);
    AppMethodBeat.o(39797);
    return localView;
  }

  public final MMPullDownView cuj()
  {
    AppMethodBeat.i(39799);
    MMPullDownView localMMPullDownView = (MMPullDownView)this.rDa.findViewById(2131822761);
    AppMethodBeat.o(39799);
    return localMMPullDownView;
  }

  public final boolean cuk()
  {
    return false;
  }

  public final void cul()
  {
    AppMethodBeat.i(39801);
    am.a locala = SnsUserUI.b(this.rDa);
    String str = SnsUserUI.c(this.rDa);
    SnsUserUI.d(this.rDa);
    locala.a(2, str, SnsUserUI.f(this.rDa), SnsUserUI.e(this.rDa));
    AppMethodBeat.o(39801);
  }

  public final void cum()
  {
  }

  public final void fA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39804);
    if (paramInt2 <= 0)
    {
      SnsUserUI.i(this.rDa);
      AppMethodBeat.o(39804);
    }
    while (true)
    {
      return;
      SnsUserUI.a(this.rDa, paramInt1, paramInt2);
      AppMethodBeat.o(39804);
    }
  }

  public final View getMaskView()
  {
    AppMethodBeat.i(39798);
    View localView = this.rDa.findViewById(2131827838);
    AppMethodBeat.o(39798);
    return localView;
  }

  public final ListView getSnsListView()
  {
    AppMethodBeat.i(39796);
    ListView localListView = (ListView)this.rDa.findViewById(2131827740);
    AppMethodBeat.o(39796);
    return localListView;
  }

  public final int getType()
  {
    return 2;
  }

  public final void ln(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.13
 * JD-Core Version:    0.6.2
 */