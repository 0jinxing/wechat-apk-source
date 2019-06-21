package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
{
  public static l c(Context paramContext, List<bbb> paramList)
  {
    AppMethodBeat.i(8816);
    if (bo.ek(paramList))
    {
      AppMethodBeat.o(8816);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      Object localObject1 = new ArrayList();
      Object localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramList = (bbb)((Iterator)localObject2).next();
        if ((paramList != null) && (c.a.JH(paramList.wkB)))
          ((List)localObject1).add(paramList);
      }
      if (bo.ek((List)localObject1))
      {
        AppMethodBeat.o(8816);
        paramContext = null;
      }
      else
      {
        Collections.sort((List)localObject1, new c.1());
        int i = ((bbb)((List)localObject1).get(((List)localObject1).size() - 1)).wFR;
        paramList = new ArrayList();
        for (int j = 0; j < i; j++)
          paramList.add(null);
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bbb)((Iterator)localObject1).next();
          if ((((bbb)localObject2).wFR > 0) && (((bbb)localObject2).wFR <= paramList.size()))
            paramList.set(((bbb)localObject2).wFR - 1, localObject2);
        }
        paramContext = new l(paramContext);
        localObject2 = paramList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramList = (bbb)((Iterator)localObject2).next();
          if (paramList == null)
          {
            paramContext.e(-1, "");
          }
          else
          {
            localObject1 = paramList.Title + "__" + paramList.ThumbUrl;
            paramContext.e(paramList.wFQ, (CharSequence)localObject1);
          }
        }
        AppMethodBeat.o(8816);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.c
 * JD-Core Version:    0.6.2
 */