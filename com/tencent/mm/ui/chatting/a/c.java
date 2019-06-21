package com.tencent.mm.ui.chatting.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.gridviewheaders.a;
import java.util.Date;

public final class c extends RecyclerView.a
{
  public static e yNI;
  public static c.f yNJ = null;
  private Context mContext;
  public String yNK;

  public c(Context paramContext, c.f paramf)
  {
    yNJ = paramf;
    this.mContext = paramContext;
  }

  private static long hb(long paramLong)
  {
    AppMethodBeat.i(31159);
    Date localDate = new Date(paramLong);
    paramLong = a.dJg().b(localDate);
    AppMethodBeat.o(31159);
    return paramLong;
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(31155);
    if (paramInt == 2147483647)
    {
      paramViewGroup = new c.d(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969647, paramViewGroup, false));
      AppMethodBeat.o(31155);
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = yNJ.v(paramViewGroup);
      AppMethodBeat.o(31155);
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(31156);
    int i = getItemViewType(paramInt);
    c.b localb = yNJ.Oy(paramInt);
    Object localObject;
    if (i == 2147483647)
    {
      localObject = yNJ.Oy(paramInt + 1);
      if ((paramInt == getItemCount() - 1) || (hb(((c.b)localObject).timestamp) != hb(localb.timestamp)))
      {
        ((c.d)paramv).gnf.setVisibility(8);
        AppMethodBeat.o(31156);
      }
      while (true)
      {
        return;
        ((c.d)paramv).gnf.setVisibility(0);
        ((c.d)paramv).gnf.setText(ha(localb.timestamp));
        AppMethodBeat.o(31156);
      }
    }
    c.a locala = (c.a)paramv;
    locala.mRR.setTag(Integer.valueOf(paramInt));
    a.b.b(locala.ejo, localb.username);
    TextView localTextView = locala.gxi;
    Context localContext = this.mContext;
    if (bo.isNullOrNil(this.yNK))
      if (bo.isNullOrNil(localb.bCv))
        if (bo.isNullOrNil(localb.iQV))
          localObject = localb.nickname;
    while (true)
    {
      localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localContext, (CharSequence)localObject, locala.gxi.getTextSize()));
      locala.enf.setText(com.tencent.mm.plugin.fav.ui.j.g(this.mContext, localb.timestamp));
      locala.gnB.setText(localb.title);
      yNJ.a((c.a)paramv, paramInt);
      if (!bo.isNullOrNil(this.yNK))
      {
        c.a.c(locala.gxi, this.yNK);
        c.a.c(locala.gnB, this.yNK);
      }
      AppMethodBeat.o(31156);
      break;
      localObject = localb.iQV;
      continue;
      localObject = localb.bCv;
      continue;
      if (bo.isNullOrNil(localb.bCv))
      {
        if (!bo.isNullOrNil(localb.iQV))
        {
          if ((!bo.isNullOrNil(localb.nickname)) && (localb.nickname.contains(this.yNK)))
            localObject = localb.iQV + "(" + localb.nickname + ")";
          else
            localObject = localb.iQV;
        }
        else
          localObject = localb.nickname;
      }
      else if ((!bo.isNullOrNil(localb.iQV)) && (localb.iQV.contains(this.yNK)))
        localObject = localb.bCv + "(" + localb.iQV + ")";
      else if ((!bo.isNullOrNil(localb.nickname)) && (localb.nickname.contains(this.yNK)))
        localObject = localb.bCv + "(" + localb.nickname + ")";
      else
        localObject = localb.bCv;
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(31157);
    int i;
    if (yNJ == null)
    {
      i = 0;
      if (yNJ != null)
        break label67;
    }
    label67: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.MediaHistoryListAdapter", " null == mIDetail?%s getItemCount:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
      AppMethodBeat.o(31157);
      return i;
      i = yNJ.getCount();
      break;
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(31154);
    paramInt = yNJ.Oy(paramInt).getType();
    AppMethodBeat.o(31154);
    return paramInt;
  }

  public final String ha(long paramLong)
  {
    AppMethodBeat.i(31158);
    Object localObject = new Date(paramLong);
    localObject = a.dJg().a((Date)localObject, this.mContext);
    AppMethodBeat.o(31158);
    return localObject;
  }

  public static abstract interface e
  {
    public abstract void a(View paramView, int paramInt, c.b paramb);

    public abstract void b(View paramView, int paramInt, c.b paramb);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.c
 * JD-Core Version:    0.6.2
 */