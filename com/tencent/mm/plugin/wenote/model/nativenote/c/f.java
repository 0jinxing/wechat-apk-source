package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

public final class f
{
  public static c er(View paramView)
  {
    WXRTEditText localWXRTEditText1 = null;
    AppMethodBeat.i(26929);
    if (paramView == null)
    {
      AppMethodBeat.o(26929);
      paramView = localWXRTEditText1;
      return paramView;
    }
    WXRTEditText localWXRTEditText2 = (WXRTEditText)paramView.findViewById(2131826414);
    localWXRTEditText1 = (WXRTEditText)paramView.findViewById(2131826411);
    paramView = (WXRTEditText)paramView.findViewById(2131826413);
    if (localWXRTEditText2 != null)
      paramView = new c(localWXRTEditText2);
    while (true)
    {
      AppMethodBeat.o(26929);
      break;
      if ((localWXRTEditText1 != null) && (paramView != null))
        paramView = new c(localWXRTEditText1, paramView);
      else
        paramView = null;
    }
  }

  public static View f(RecyclerView paramRecyclerView, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(26928);
    if (paramRecyclerView == null)
    {
      AppMethodBeat.o(26928);
      paramRecyclerView = localObject;
    }
    while (true)
    {
      return paramRecyclerView;
      try
      {
        paramRecyclerView = paramRecyclerView.getLayoutManager();
        if ((paramRecyclerView instanceof LinearLayoutManager))
        {
          paramRecyclerView = ((LinearLayoutManager)paramRecyclerView).bW(paramInt);
          AppMethodBeat.o(26928);
        }
      }
      catch (Exception paramRecyclerView)
      {
        while (true)
          paramRecyclerView = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.f
 * JD-Core Version:    0.6.2
 */