package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class f extends RecyclerView.a
{
  private c elH;
  List<f.c> iJL;
  private boolean kuU;
  boolean kuX;
  Context mContext;
  abh mnG;
  g.b mob;
  b moc;
  boolean mod;

  public f(Context paramContext, List<f.c> paramList, g.b paramb)
  {
    AppMethodBeat.i(74578);
    this.iJL = null;
    this.elH = null;
    this.kuU = true;
    this.mnG = new abh();
    this.mod = false;
    this.iJL = paramList;
    this.kuU = g.RP().isSDCardAvailable();
    this.mContext = paramContext;
    this.mob = paramb;
    paramList = new c.a();
    paramList.fHe = 1;
    paramList.eQa = true;
    paramList.ePO = (com.tencent.mm.bz.a.gd(paramContext) / 4);
    paramList.ePN = (com.tencent.mm.bz.a.gd(paramContext) / 4);
    paramList.ePV = 2131690335;
    this.elH = paramList.ahG();
    AppMethodBeat.o(74578);
  }

  private static long hb(long paramLong)
  {
    AppMethodBeat.i(74584);
    Date localDate = new Date(paramLong);
    paramLong = com.tencent.mm.ui.gridviewheaders.a.dJg().b(localDate);
    AppMethodBeat.o(74584);
    return paramLong;
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(74580);
    if (paramInt == 2147483647)
    {
      paramViewGroup = new f.a(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969501, paramViewGroup, false));
      AppMethodBeat.o(74580);
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = new f.d(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969502, paramViewGroup, false));
      AppMethodBeat.o(74580);
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(74582);
    if (!this.kuU)
    {
      ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", new Object[] { Boolean.valueOf(this.kuU) });
      AppMethodBeat.o(74582);
    }
    while (true)
    {
      return;
      Object localObject1 = vG(paramInt);
      if (paramv.apN == 2147483647)
      {
        if ((paramInt == getItemCount() - 1) || (hb(vG(paramInt + 1).timeStamp) != hb(((f.c)localObject1).timeStamp)))
        {
          ((f.a)paramv).gnf.setVisibility(8);
          AppMethodBeat.o(74582);
        }
        else
        {
          ((f.a)paramv).gnf.setVisibility(0);
          ((f.a)paramv).gnf.setText(ha(((f.c)localObject1).timeStamp));
          if (this.kuX)
          {
            ((f.a)paramv).progressBar.setVisibility(0);
            AppMethodBeat.o(74582);
          }
          else
          {
            ((f.a)paramv).progressBar.setVisibility(8);
            AppMethodBeat.o(74582);
          }
        }
      }
      else
      {
        ((f.d)paramv).mok.setTag(2131820604, Integer.valueOf(paramInt));
        ((f.d)paramv).mop.setTag(Integer.valueOf(paramInt));
        o.ahp().a(((f.c)localObject1).imagePath, ((f.d)paramv).mok, this.elH);
        if (((f.c)localObject1).mog)
        {
          ((f.d)paramv).mol.setVisibility(0);
          ((f.d)paramv).kuL.setVisibility(0);
          ((f.d)paramv).kuL.setText(bo.bc(((f.c)localObject1).moh.moi, ""));
          label286: ((f.d)paramv).mok.getViewTreeObserver().addOnGlobalLayoutListener(new f.1(this, paramv));
          if (!this.mod)
            break label499;
          ((f.d)paramv).mop.setVisibility(0);
          ((f.d)paramv).moo.setVisibility(0);
          Object localObject2 = e.a.bwv();
          localObject1 = ((f.c)localObject1).mof;
          if (localObject1 == null)
            break label463;
          localObject2 = ((e)localObject2).mnX.iterator();
          do
            if (!((Iterator)localObject2).hasNext())
              break;
          while (!((d)((Iterator)localObject2).next()).cAJ.mnd.equals(((d)localObject1).cAJ.mnd));
        }
        label463: for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label468;
          ((f.d)paramv).mom.setVisibility(0);
          ((f.d)paramv).moo.setChecked(true);
          AppMethodBeat.o(74582);
          break;
          ((f.d)paramv).kuL.setVisibility(8);
          ((f.d)paramv).mol.setVisibility(8);
          break label286;
        }
        label468: ((f.d)paramv).mom.setVisibility(8);
        ((f.d)paramv).moo.setChecked(false);
        AppMethodBeat.o(74582);
        continue;
        label499: ((f.d)paramv).mom.setVisibility(8);
        ((f.d)paramv).mop.setVisibility(8);
        ((f.d)paramv).moo.setVisibility(8);
        AppMethodBeat.o(74582);
      }
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt, List paramList)
  {
    AppMethodBeat.i(74581);
    if ((paramList != null) && (paramList.size() > 0) && ((paramv instanceof f.d)))
      if (((Integer)paramList.get(0)).intValue() == 0)
      {
        ((f.d)paramv).moo.setChecked(false);
        ((f.d)paramv).moo.setVisibility(0);
        ((f.d)paramv).mop.setVisibility(0);
        AppMethodBeat.o(74581);
      }
    while (true)
    {
      return;
      ((f.d)paramv).moo.setChecked(false);
      ((f.d)paramv).moo.setVisibility(8);
      ((f.d)paramv).mop.setVisibility(8);
      AppMethodBeat.o(74581);
      continue;
      super.a(paramv, paramInt, paramList);
      AppMethodBeat.o(74581);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(74585);
    int i = this.iJL.size();
    AppMethodBeat.o(74585);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(74579);
    paramInt = vG(paramInt).type;
    AppMethodBeat.o(74579);
    return paramInt;
  }

  public final String ha(long paramLong)
  {
    AppMethodBeat.i(74583);
    Object localObject = new Date(paramLong);
    localObject = com.tencent.mm.ui.gridviewheaders.a.dJg().a((Date)localObject, this.mContext);
    AppMethodBeat.o(74583);
    return localObject;
  }

  public final f.c vG(int paramInt)
  {
    AppMethodBeat.i(74586);
    f.c localc = (f.c)this.iJL.get(paramInt);
    AppMethodBeat.o(74586);
    return localc;
  }

  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean, f.c paramc, int paramInt);
  }

  final class c$a
  {
    public String moi;

    c$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f
 * JD-Core Version:    0.6.2
 */