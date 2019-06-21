package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.nativenote.b.b;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class k$1
  implements View.OnKeyListener
{
  k$1(k paramk)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(26831);
    if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getKeyCode() == 67))
    {
      if (c.dem().size() == 0)
        AppMethodBeat.o(26831);
      WXRTEditText localWXRTEditText;
      while (true)
      {
        return bool;
        localWXRTEditText = this.uQM.deS();
        if (localWXRTEditText == null)
        {
          AppMethodBeat.o(26831);
        }
        else
        {
          paramInt = localWXRTEditText.getRecyclerItemPosition();
          ab.i("MicroMsg.Note.WXRTManager", "current focus pos: %d", new Object[] { Integer.valueOf(paramInt) });
          paramView = c.dem().Ke(paramInt);
          if (paramView == null)
          {
            ab.w("MicroMsg.Note.WXRTManager", "get current item is null %d", new Object[] { Integer.valueOf(paramInt) });
            AppMethodBeat.o(26831);
          }
          else
          {
            paramKeyEvent = c.dem().Ke(paramInt - 1);
            if (paramKeyEvent != null)
              break;
            ab.i("MicroMsg.Note.WXRTManager", "get preItem is null %d", new Object[] { Integer.valueOf(paramInt) });
            AppMethodBeat.o(26831);
          }
        }
      }
      switch (localWXRTEditText.getEditTextType())
      {
      default:
      case 0:
        while (true)
        {
          label200: AppMethodBeat.o(26831);
          bool = true;
          break;
          ab.i("MicroMsg.Note.WXRTManager", "Handle Editor Type EDITTEXT");
          int i = localWXRTEditText.getSelectionStart();
          if (i != localWXRTEditText.getSelectionEnd())
          {
            AppMethodBeat.o(26831);
            break;
          }
          if (i == localWXRTEditText.getParagraphsInSelection().aqm)
          {
            localWXRTEditText.uQb = true;
            this.uQM.b(u.uSB, Boolean.FALSE);
            this.uQM.b(u.uSC, Boolean.FALSE);
            this.uQM.b(u.uSA, Boolean.FALSE);
            k.a(this.uQM).ol(false);
            k.a(this.uQM).om(false);
            k.a(this.uQM).on(false);
            localWXRTEditText.uQb = false;
          }
          if ((i != 0) || (paramInt == 0))
          {
            AppMethodBeat.o(26831);
            break;
          }
          paramView = localWXRTEditText.a(i.uQr);
          c.dem().dep();
          if (paramKeyEvent.getType() != 1)
            break label488;
          bool = c.dem().au(paramInt, true);
          paramKeyEvent = (com.tencent.mm.plugin.wenote.model.a.i)paramKeyEvent;
          i = paramKeyEvent.uNY.getText().toString().length();
          paramKeyEvent.content += paramView;
          paramKeyEvent.uNV = i;
          paramKeyEvent.uNT = true;
          paramKeyEvent.uNZ = false;
          label460: if (!bool)
            break label526;
          k.b(this.uQM).dfP().JX(paramInt - 1);
        }
        label488: if (!bo.isNullOrNil(paramView))
          break;
      case 1:
      case 2:
      }
    }
    for (bool = c.dem().au(paramInt, true); ; bool = false)
    {
      paramKeyEvent.uNX.setSelection(0);
      paramKeyEvent.uNT = true;
      paramKeyEvent.uNZ = false;
      break label460;
      label526: k.b(this.uQM).dfP().gD(paramInt - 1, 2);
      break label200;
      ab.i("MicroMsg.Note.WXRTManager", "Handle Editor Type PREBUTTON");
      c.dem().dep();
      if (paramKeyEvent.getType() == 1)
      {
        paramKeyEvent = (com.tencent.mm.plugin.wenote.model.a.i)paramKeyEvent;
        if (bo.isNullOrNil(paramKeyEvent.content))
        {
          paramView.uNW.setSelection(0);
          paramView.uNT = true;
          paramView.uNZ = true;
          c.dem().au(paramInt - 1, true);
          AppMethodBeat.o(26831);
          bool = true;
          break;
        }
        if (paramKeyEvent.content.endsWith("<br/>"))
          paramKeyEvent.content = paramKeyEvent.content.substring(0, paramKeyEvent.content.length() - 5);
        paramKeyEvent.uNV = -1;
        paramKeyEvent.uNT = true;
        paramKeyEvent.uNZ = false;
      }
      while (true)
      {
        k.b(this.uQM).dfP().gD(paramInt - 1, 2);
        break;
        paramKeyEvent.uNX.setSelection(0);
        paramKeyEvent.uNT = true;
        paramKeyEvent.uNZ = false;
      }
      ab.i("MicroMsg.Note.WXRTManager", "Handle Editor Type NEXTBTTTON");
      if ((paramView.getType() == 4) && (((l)paramView).uOh.booleanValue()))
      {
        ab.i("MicroMsg.Note.WXRTManager", "Current Item is Voice and Recording");
        AppMethodBeat.o(26831);
        break;
      }
      if ((!paramView.uOa) && (paramView.getType() != -1))
      {
        c.dem().av(paramInt, true);
        AppMethodBeat.o(26831);
        bool = true;
        break;
      }
      c.dem().dep();
      c.dem().au(paramInt, false);
      k.b(this.uQM).dfP().JZ(paramInt);
      paramView = new com.tencent.mm.plugin.wenote.model.a.i();
      paramView.uNT = true;
      paramView.uNZ = false;
      paramView.content = "";
      paramView.uNV = 0;
      c.dem().a(paramInt, paramView);
      c.dem().gG(paramInt - 1, paramInt + 1);
      k.b(this.uQM).dfN().bY(paramInt);
      break label200;
      AppMethodBeat.o(26831);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.k.1
 * JD-Core Version:    0.6.2
 */