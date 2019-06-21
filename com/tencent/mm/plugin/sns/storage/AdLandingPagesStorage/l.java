package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.ui.al;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class l
{
  private int bgColor;
  private Context context;
  private ViewGroup pxQ;
  private LinkedHashMap<String, h> rcY;
  private List<r> reL;

  public l(List<r> paramList, Context paramContext, ViewGroup paramViewGroup)
  {
    this.reL = paramList;
    this.context = paramContext;
    this.bgColor = 0;
    this.pxQ = paramViewGroup;
  }

  public final void aZ()
  {
    AppMethodBeat.i(37786);
    if ((this.reL == null) || (this.reL.isEmpty()))
      AppMethodBeat.o(37786);
    while (true)
    {
      return;
      if (this.rcY == null)
        this.rcY = new LinkedHashMap();
      int i = 0;
      while (true)
        if (i < this.reL.size())
        {
          r localr = (r)this.reL.get(i);
          Object localObject = (h)this.rcY.get(localr.qWO);
          if (localObject != null)
            ((h)localObject).a(localr);
          try
          {
            label101: if (this.pxQ != ((h)localObject).getView().getParent())
            {
              if (this.pxQ.getChildCount() <= i)
                break label194;
              this.pxQ.addView(((h)localObject).getView(), i);
              ((h)localObject).cpz();
            }
            while (true)
            {
              i++;
              break;
              h localh = al.a(this.context, localr, this.pxQ, this.bgColor);
              localObject = localh;
              if (localh == null)
                break label101;
              this.rcY.put(localr.qWO, localh);
              localObject = localh;
              break label101;
              label194: this.pxQ.addView(((h)localObject).getView());
              ((h)localObject).cpz();
            }
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("CompRenderer", "component may have same id %s,%s", new Object[] { localr.qWO, bo.l(localException) });
          }
        }
      AppMethodBeat.o(37786);
    }
  }

  public final Collection<h> cqa()
  {
    AppMethodBeat.i(37787);
    Object localObject;
    if (this.rcY == null)
    {
      localObject = Collections.EMPTY_LIST;
      AppMethodBeat.o(37787);
    }
    while (true)
    {
      return localObject;
      localObject = this.rcY.values();
      AppMethodBeat.o(37787);
    }
  }

  public final void dl(List<r> paramList)
  {
    AppMethodBeat.i(37785);
    if ((paramList != null) && (!paramList.equals(this.reL)))
    {
      this.reL = paramList;
      aZ();
    }
    AppMethodBeat.o(37785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.l
 * JD-Core Version:    0.6.2
 */