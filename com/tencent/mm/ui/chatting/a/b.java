package com.tencent.mm.ui.chatting.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.gallery.h;
import com.tencent.mm.ui.chatting.gallery.h.a;
import java.util.Date;
import java.util.List;

public final class b extends RecyclerView.a
{
  private com.tencent.mm.at.a.a.c elH;
  private String emo;
  public List<b.c> iJL;
  private boolean kuU;
  public boolean kuX;
  Context mContext;
  boolean mgP;
  public boolean mod;
  long yNB;
  public b yNC;

  public b(Context paramContext, List<b.c> paramList, String paramString)
  {
    AppMethodBeat.i(31138);
    this.iJL = null;
    this.elH = null;
    this.kuU = true;
    this.mgP = false;
    this.mod = false;
    this.iJL = paramList;
    this.emo = paramString;
    aw.ZK();
    this.kuU = com.tencent.mm.model.c.isSDCardAvailable();
    this.mContext = paramContext;
    hT(paramContext);
    AppMethodBeat.o(31138);
  }

  public b(Context paramContext, List<b.c> paramList, String paramString, long paramLong)
  {
    AppMethodBeat.i(31139);
    this.iJL = null;
    this.elH = null;
    this.kuU = true;
    this.mgP = false;
    this.mod = false;
    this.iJL = paramList;
    this.yNB = paramLong;
    this.emo = paramString;
    aw.ZK();
    this.kuU = com.tencent.mm.model.c.isSDCardAvailable();
    this.mgP = true;
    this.mContext = paramContext;
    hT(paramContext);
    AppMethodBeat.o(31139);
  }

  private void hT(Context paramContext)
  {
    AppMethodBeat.i(31140);
    c.a locala = new c.a();
    locala.fHe = 1;
    locala.eQa = true;
    locala.ePO = (com.tencent.mm.bz.a.gd(paramContext) / 4);
    locala.ePN = (com.tencent.mm.bz.a.gd(paramContext) / 4);
    locala.ePV = 2131690335;
    this.elH = locala.ahG();
    AppMethodBeat.o(31140);
  }

  private static long hb(long paramLong)
  {
    AppMethodBeat.i(31146);
    Date localDate = new Date(paramLong);
    paramLong = com.tencent.mm.ui.gridviewheaders.a.dJg().b(localDate);
    AppMethodBeat.o(31146);
    return paramLong;
  }

  public final b.c Ox(int paramInt)
  {
    AppMethodBeat.i(31148);
    b.c localc = (b.c)this.iJL.get(paramInt);
    AppMethodBeat.o(31148);
    return localc;
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(31142);
    if (paramInt == 2147483647)
    {
      paramViewGroup = new a(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969647, paramViewGroup, false));
      AppMethodBeat.o(31142);
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = new b.d(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969842, paramViewGroup, false));
      AppMethodBeat.o(31142);
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(31144);
    if (!this.kuU)
    {
      ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", new Object[] { Boolean.valueOf(this.kuU) });
      AppMethodBeat.o(31144);
    }
    while (true)
    {
      return;
      b.c localc = Ox(paramInt);
      if (paramv.apN == 2147483647)
      {
        if ((paramInt == getItemCount() - 1) || (hb(Ox(paramInt + 1).timeStamp) != hb(localc.timeStamp)))
        {
          ((a)paramv).gnf.setVisibility(8);
          AppMethodBeat.o(31144);
        }
        else
        {
          ((a)paramv).gnf.setVisibility(0);
          ((a)paramv).gnf.setText(ha(localc.timeStamp));
          if (this.kuX)
          {
            ((a)paramv).progressBar.setVisibility(0);
            AppMethodBeat.o(31144);
          }
          else
          {
            ((a)paramv).progressBar.setVisibility(8);
            AppMethodBeat.o(31144);
          }
        }
      }
      else
      {
        ((b.d)paramv).mok.setTag(Integer.valueOf(paramInt));
        ((b.d)paramv).mop.setTag(Integer.valueOf(paramInt));
        o.ahp().a(localc.imagePath, ((b.d)paramv).mok, this.elH);
        if (localc.mog)
        {
          ((b.d)paramv).mol.setVisibility(0);
          ((b.d)paramv).kuL.setVisibility(0);
          ((b.d)paramv).kuL.setText(bo.bc(localc.yNE.moi, ""));
        }
        while (true)
          if (this.mod)
          {
            ((b.d)paramv).mop.setVisibility(0);
            ((b.d)paramv).moo.setVisibility(0);
            if (h.a.dFX().bE(localc.cKd))
            {
              ((b.d)paramv).mom.setVisibility(0);
              ((b.d)paramv).moo.setChecked(true);
              AppMethodBeat.o(31144);
              break;
              ((b.d)paramv).kuL.setVisibility(8);
              ((b.d)paramv).mol.setVisibility(8);
              continue;
            }
            ((b.d)paramv).mom.setVisibility(8);
            ((b.d)paramv).moo.setChecked(false);
            AppMethodBeat.o(31144);
            break;
          }
        ((b.d)paramv).mop.setVisibility(8);
        ((b.d)paramv).moo.setVisibility(8);
        AppMethodBeat.o(31144);
      }
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt, List paramList)
  {
    AppMethodBeat.i(31143);
    if ((paramList != null) && (paramList.size() > 0) && ((paramv instanceof b.d)))
      if (((Integer)paramList.get(0)).intValue() == 0)
      {
        ((b.d)paramv).moo.setChecked(false);
        ((b.d)paramv).moo.setVisibility(0);
        ((b.d)paramv).mop.setVisibility(0);
        AppMethodBeat.o(31143);
      }
    while (true)
    {
      return;
      ((b.d)paramv).moo.setChecked(false);
      ((b.d)paramv).moo.setVisibility(8);
      ((b.d)paramv).mop.setVisibility(8);
      AppMethodBeat.o(31143);
      continue;
      super.a(paramv, paramInt, paramList);
      AppMethodBeat.o(31143);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(31147);
    int i = this.iJL.size();
    AppMethodBeat.o(31147);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(31141);
    paramInt = Ox(paramInt).type;
    AppMethodBeat.o(31141);
    return paramInt;
  }

  public final String ha(long paramLong)
  {
    AppMethodBeat.i(31145);
    Object localObject = new Date(paramLong);
    localObject = com.tencent.mm.ui.gridviewheaders.a.dJg().a((Date)localObject, this.mContext);
    AppMethodBeat.o(31145);
    return localObject;
  }

  public final class a extends RecyclerView.v
  {
    TextView gnf;
    ProgressBar progressBar;

    public a(View arg2)
    {
      super();
      AppMethodBeat.i(31131);
      this.gnf = ((TextView)localView.findViewById(2131823899));
      this.progressBar = ((ProgressBar)localView.findViewById(2131823898));
      AppMethodBeat.o(31131);
    }
  }

  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean, b.c paramc, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b
 * JD-Core Version:    0.6.2
 */