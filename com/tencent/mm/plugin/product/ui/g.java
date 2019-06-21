package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends p
{
  Context mContext;
  private ArrayList<g.b> piQ;
  private boolean piR;
  g.a piS;
  private List<String> piv;

  public g(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private g(Context paramContext, byte paramByte)
  {
    AppMethodBeat.i(44073);
    this.piR = false;
    this.piS = null;
    this.mContext = paramContext;
    this.piv = null;
    setData(this.piv);
    AppMethodBeat.o(44073);
  }

  private void caf()
  {
    AppMethodBeat.i(44074);
    if (this.piQ == null)
      this.piQ = new ArrayList();
    while (true)
    {
      Iterator localIterator = this.piv.iterator();
      while (localIterator.hasNext())
      {
        g.b localb = new g.b(this, (String)localIterator.next());
        this.piQ.add(localb);
      }
      this.piQ.clear();
    }
    AppMethodBeat.o(44074);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(44077);
    ab.d("MicroMsg.MallProductImageAdapter", "destroy item");
    if (this.piQ != null)
      paramViewGroup.removeView(((g.b)this.piQ.get(paramInt)).cDh);
    AppMethodBeat.o(44077);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44076);
    int i;
    if (this.piv == null)
    {
      i = 0;
      AppMethodBeat.o(44076);
    }
    while (true)
    {
      return i;
      if (this.piR)
      {
        i = 2147483647;
        AppMethodBeat.o(44076);
      }
      else
      {
        i = this.piv.size();
        AppMethodBeat.o(44076);
      }
    }
  }

  public final int getItemPosition(Object paramObject)
  {
    return -2;
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(44078);
    if (this.piQ != null)
    {
      ab.d("MicroMsg.MallProductImageAdapter", "data valid");
      paramViewGroup.addView(((g.b)this.piQ.get(paramInt)).cDh, 0);
      paramViewGroup = ((g.b)this.piQ.get(paramInt)).cDh;
      AppMethodBeat.o(44078);
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = super.instantiateItem(paramViewGroup, paramInt);
      AppMethodBeat.o(44078);
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setData(List<String> paramList)
  {
    AppMethodBeat.i(44075);
    if (paramList != null)
    {
      if (paramList.size() > 0)
        this.piv = paramList;
      caf();
    }
    AppMethodBeat.o(44075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.g
 * JD-Core Version:    0.6.2
 */