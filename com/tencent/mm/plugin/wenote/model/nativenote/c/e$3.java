package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class e$3
  implements View.OnClickListener
{
  public e$3(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26860);
    ab.i("NoteSelectManager", "cut");
    if ((!e.dfx()) || (!e.k(this.uRO)))
    {
      ab.e("NoteSelectManager", "cut: not init or not editable");
      this.uRO.dfh();
      AppMethodBeat.o(26860);
    }
    while (true)
    {
      return;
      if (e.l(this.uRO))
      {
        if (e.m(this.uRO) != null)
          e.m(this.uRO).ddY();
        AppMethodBeat.o(26860);
      }
      else
      {
        this.uRO.dfh();
        int i = this.uRO.dfa();
        if (i == 2)
        {
          Object localObject = e.a(this.uRO, true, null, "");
          if (bo.ac((CharSequence)localObject))
          {
            ab.e("NoteSelectManager", "cut: selectedSpan is null or empty");
            e.h(this.uRO);
            AppMethodBeat.o(26860);
          }
          else
          {
            paramView = new i();
            paramView.content = b.a((Spanned)localObject);
            paramView.uNV = -1;
            paramView.uNT = false;
            localObject = new ArrayList();
            ((ArrayList)localObject).add(paramView);
            f.c(ah.getContext(), (ArrayList)localObject);
            AppMethodBeat.o(26860);
          }
        }
        else if (i == 3)
        {
          paramView = e.b(this.uRO, true, null, "");
          if ((paramView != null) && (paramView.size() > 0))
          {
            f.c(ah.getContext(), paramView);
            AppMethodBeat.o(26860);
          }
          else
          {
            ab.e("NoteSelectManager", "cut: dataList is null or empty");
            e.h(this.uRO);
            AppMethodBeat.o(26860);
          }
        }
        else
        {
          ab.e("NoteSelectManager", "cut: not in select");
          e.h(this.uRO);
          AppMethodBeat.o(26860);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.3
 * JD-Core Version:    0.6.2
 */