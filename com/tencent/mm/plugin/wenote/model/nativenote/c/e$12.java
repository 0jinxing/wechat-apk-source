package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.text.Editable;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.sdk.platformtools.ab;

public final class e$12
  implements View.OnClickListener
{
  public e$12(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    Object localObject1 = null;
    AppMethodBeat.i(26869);
    ab.i("NoteSelectManager", "select");
    this.uRO.dfh();
    if (!e.dfx())
    {
      ab.e("NoteSelectManager", "select: not init");
      AppMethodBeat.o(26869);
    }
    while (true)
    {
      return;
      if (this.uRO.dfa() != 1)
      {
        ab.e("NoteSelectManager", "select: not insert");
        e.h(this.uRO);
        AppMethodBeat.o(26869);
      }
      else if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(e.i(this.uRO).coc) == null)
      {
        ab.e("NoteSelectManager", "select: item is null");
        e.h(this.uRO);
        AppMethodBeat.o(26869);
      }
      else
      {
        paramView = e.a(this.uRO);
        if (paramView == null)
        {
          ab.e("NoteSelectManager", "select: recyclerView is null");
          e.h(this.uRO);
          AppMethodBeat.o(26869);
        }
        else
        {
          localObject2 = f.er(f.f(paramView, e.i(this.uRO).coc));
          if (localObject2 == null)
          {
            ab.e("NoteSelectManager", "select: rteInfo is null");
            e.h(this.uRO);
            AppMethodBeat.o(26869);
          }
          else
          {
            if (((c)localObject2).uRc == null)
              break label598;
            paramView = ((c)localObject2).uRc.getText();
            if (paramView == null)
            {
              ab.e("NoteSelectManager", "select: text is null");
              e.h(this.uRO);
              AppMethodBeat.o(26869);
            }
            else
            {
              if (paramView.length() <= 0)
                break;
              ((c)localObject2).uRc.ax(e.i(this.uRO).startOffset, true);
              AppMethodBeat.o(26869);
            }
          }
        }
      }
    }
    Object localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(e.i(this.uRO).coc - 1);
    paramView = (View)localObject2;
    if (localObject2 != null)
    {
      paramView = (View)localObject2;
      if (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == -3)
        paramView = null;
    }
    localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(e.i(this.uRO).coc + 1);
    if ((localObject2 != null) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == -2));
    while (true)
    {
      if (paramView != null)
        if (paramView.getType() == 1)
        {
          paramView = a.ahb(((i)paramView).content);
          if (paramView == null)
          {
            ab.e("NoteSelectManager", "select: spanned is null");
            e.h(this.uRO);
            AppMethodBeat.o(26869);
            break;
          }
          this.uRO.H(e.i(this.uRO).coc - 1, paramView.length(), e.i(this.uRO).coc, 0);
        }
      while (true)
      {
        e.e(this.uRO);
        this.uRO.ab(true, true);
        AppMethodBeat.o(26869);
        break;
        this.uRO.H(e.i(this.uRO).coc - 1, 0, e.i(this.uRO).coc, 0);
        continue;
        if (localObject1 == null)
          break label575;
        if (localObject1.getType() == 1)
          this.uRO.H(e.i(this.uRO).coc, 0, e.i(this.uRO).coc + 1, 0);
        else
          this.uRO.H(e.i(this.uRO).coc, 0, e.i(this.uRO).coc + 1, 1);
      }
      label575: ab.e("NoteSelectManager", "select: no neighbor");
      e.h(this.uRO);
      AppMethodBeat.o(26869);
      break;
      label598: if ((((c)localObject2).uRd != null) && (((c)localObject2).uRe != null))
      {
        e.e(this.uRO);
        this.uRO.H(e.i(this.uRO).coc, 0, e.i(this.uRO).coc, 1);
        this.uRO.ab(true, true);
        AppMethodBeat.o(26869);
        break;
      }
      ab.e("NoteSelectManager", "select: rteInfo invalid");
      e.h(this.uRO);
      AppMethodBeat.o(26869);
      break;
      localObject1 = localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.12
 * JD-Core Version:    0.6.2
 */