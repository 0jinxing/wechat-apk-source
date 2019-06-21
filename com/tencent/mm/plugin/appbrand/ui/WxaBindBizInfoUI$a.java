package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class WxaBindBizInfoUI$a extends RecyclerView.a
{
  private final List<WxaAttributes.WxaEntryInfo> iJL;
  boolean iJM;
  private LayoutInflater mInflater;

  public WxaBindBizInfoUI$a(LayoutInflater paramLayoutInflater)
  {
    AppMethodBeat.i(133193);
    this.iJM = true;
    this.mInflater = paramLayoutInflater;
    this.iJL = new LinkedList();
    AppMethodBeat.o(133193);
  }

  private boolean contains(String paramString)
  {
    AppMethodBeat.i(133199);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(133199);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.iJL.iterator();
      while (true)
        if (localIterator.hasNext())
          if (paramString.equals(((WxaAttributes.WxaEntryInfo)localIterator.next()).username))
          {
            bool = true;
            AppMethodBeat.o(133199);
            break;
          }
      AppMethodBeat.o(133199);
      bool = false;
    }
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(133194);
    paramViewGroup = new WxaBindBizInfoUI.b(this.mInflater.inflate(2130968692, paramViewGroup, false));
    AppMethodBeat.o(133194);
    return paramViewGroup;
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(133195);
    WxaAttributes.WxaEntryInfo localWxaEntryInfo = pQ(paramInt);
    if (localWxaEntryInfo == null)
    {
      ab.i("MicroMsg.WxaBindBizInfoUI", "onBindViewHolder failed, getItem(%d) return null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(133195);
    }
    while (true)
    {
      return;
      paramv = (WxaBindBizInfoUI.b)paramv;
      b.abR().a(paramv.iyo, localWxaEntryInfo.iconUrl, a.abQ(), f.fqH);
      paramv.gne.setText(bo.nullAsNil(localWxaEntryInfo.title));
      if (this.iJM)
      {
        paramv = paramv.goc;
        if (this.iJL.size() - 1 == paramInt)
          i = 8;
        paramv.setVisibility(i);
      }
      AppMethodBeat.o(133195);
    }
  }

  protected final void aN(List<WxaAttributes.WxaEntryInfo> paramList)
  {
    AppMethodBeat.i(133198);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(133198);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)localIterator.next();
        if (!contains(localWxaEntryInfo.username))
          localLinkedList.add(localWxaEntryInfo);
      }
      this.iJL.addAll(localLinkedList);
      ar(this.iJL.size() - paramList.size(), paramList.size());
      AppMethodBeat.o(133198);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(133196);
    int i = this.iJL.size();
    AppMethodBeat.o(133196);
    return i;
  }

  public final WxaAttributes.WxaEntryInfo pQ(int paramInt)
  {
    AppMethodBeat.i(133197);
    WxaAttributes.WxaEntryInfo localWxaEntryInfo;
    if ((paramInt < 0) || (paramInt >= getItemCount()))
    {
      localWxaEntryInfo = null;
      AppMethodBeat.o(133197);
    }
    while (true)
    {
      return localWxaEntryInfo;
      localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.iJL.get(paramInt);
      AppMethodBeat.o(133197);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.WxaBindBizInfoUI.a
 * JD-Core Version:    0.6.2
 */