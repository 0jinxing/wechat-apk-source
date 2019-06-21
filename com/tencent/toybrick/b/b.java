package com.tencent.toybrick.b;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.toybrick.c.f;
import com.tencent.toybrick.c.g;
import com.tencent.toybrick.d.a.a;
import com.tencent.toybrick.e.b.1;
import com.tencent.toybrick.f.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class b extends RecyclerView.a<a>
  implements View.OnClickListener
{
  public ArrayList<g> AFO;
  public LinkedList<g> AFP;
  public HashMap<g, Integer> AFQ;
  private SparseArray<g> AFR;
  private com.tencent.toybrick.e.b AFS;
  public a.a AFT;
  private Context mContext;

  public b(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(113182);
    a(new b.a(this, (byte)0));
    this.mContext = paramContext;
    this.AFT = parama;
    parama = parama.AGQ;
    paramContext = parama.iterator();
    for (int i = 0; paramContext.hasNext(); i++)
      ((g)paramContext.next()).btQ = i;
    this.AFP = parama;
    this.AFR = new SparseArray();
    this.AFQ = new HashMap();
    this.AFO = new ArrayList();
    this.AFS = new com.tencent.toybrick.e.b(this);
    paramContext = this.AFS;
    paramContext.mMainHandler.removeCallbacks(paramContext.AGY);
    Handler localHandler = paramContext.mMainHandler;
    parama = new b.1(paramContext);
    paramContext.AGY = parama;
    localHandler.post(parama);
    AppMethodBeat.o(113182);
  }

  private a Sf(int paramInt)
  {
    AppMethodBeat.i(113184);
    long l = System.currentTimeMillis();
    try
    {
      View localView = LayoutInflater.from(this.mContext).inflate(paramInt, null);
      Object localObject1 = new android/support/v7/widget/RecyclerView$LayoutParams;
      ((RecyclerView.LayoutParams)localObject1).<init>(-1, -2);
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localView.setOnClickListener(this);
      localObject1 = ((g)this.AFR.get(paramInt)).fy(localView);
      return localObject1;
    }
    finally
    {
      ai.d("VerticalToyAdapter", "[onCreateViewHolder] cost:%sms toyBrick:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), ((g)this.AFR.get(paramInt)).AGC });
      AppMethodBeat.o(113184);
    }
  }

  public final g Sg(int paramInt)
  {
    AppMethodBeat.i(113187);
    g localg;
    if (this.AFO.size() > paramInt)
    {
      localg = (g)this.AFO.get(paramInt);
      AppMethodBeat.o(113187);
    }
    while (true)
    {
      return localg;
      localg = null;
      AppMethodBeat.o(113187);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(113185);
    int i = this.AFO.size();
    AppMethodBeat.o(113185);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(113183);
    g localg = Sg(paramInt);
    paramInt = localg.getLayoutResource();
    this.AFR.put(paramInt, localg);
    AppMethodBeat.o(113183);
    return paramInt;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113186);
    Sg(((a)paramView.getTag()).kj());
    AppMethodBeat.o(113186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.b.b
 * JD-Core Version:    0.6.2
 */