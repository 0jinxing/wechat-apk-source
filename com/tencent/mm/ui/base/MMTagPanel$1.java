package com.tencent.mm.ui.base;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.LinkedList;

final class MMTagPanel$1
  implements View.OnKeyListener
{
  MMTagPanel$1(MMTagPanel paramMMTagPanel)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106810);
    if ((paramKeyEvent.getAction() == 0) && (67 == paramInt))
    {
      ab.d("MicroMsg.MMTagPanel", "on del click, selection[%d, %d]", new Object[] { Integer.valueOf(MMTagPanel.a(this.yxC).getSelectionStart()), Integer.valueOf(MMTagPanel.a(this.yxC).getSelectionEnd()) });
      if ((MMTagPanel.a(this.yxC).getSelectionStart() == 0) && (MMTagPanel.a(this.yxC).getSelectionStart() == MMTagPanel.a(this.yxC).getSelectionEnd()))
      {
        paramInt = 1;
        if (paramInt != 0)
          break label115;
        AppMethodBeat.o(106810);
      }
      while (true)
      {
        return false;
        paramInt = 0;
        break;
        label115: this.yxC.bwC();
        if ((MMTagPanel.b(this.yxC) != null) && (!MMTagPanel.b(this.yxC).isEmpty()))
          break label153;
        AppMethodBeat.o(106810);
      }
      label153: if ((MMTagPanel.c(this.yxC)) || (MMTagPanel.d(this.yxC) != null))
        break label232;
      MMTagPanel.a(this.yxC, (MMTagPanel.d)MMTagPanel.b(this.yxC).getLast());
      this.yxC.a(MMTagPanel.d(this.yxC).yxN, false, true);
      MMTagPanel.a(this.yxC).setCursorVisible(false);
    }
    while (true)
    {
      AppMethodBeat.o(106810);
      break;
      label232: if ((MMTagPanel.d(this.yxC) != null) && (MMTagPanel.b(this.yxC) != null) && (MMTagPanel.b(this.yxC).getLast() != null) && (!bo.isNullOrNil(MMTagPanel.d(this.yxC).yxM)) && (!bo.isNullOrNil(((MMTagPanel.d)MMTagPanel.b(this.yxC).getLast()).yxM)) && (!MMTagPanel.d(this.yxC).yxM.equals(((MMTagPanel.d)MMTagPanel.b(this.yxC).getLast()).yxM)))
      {
        ab.i("MicroMsg.MMTagPanel", "change hight");
        this.yxC.dAf();
        MMTagPanel.a(this.yxC, (MMTagPanel.d)MMTagPanel.b(this.yxC).getLast());
        this.yxC.a(MMTagPanel.d(this.yxC).yxN, false, true);
        MMTagPanel.a(this.yxC).setCursorVisible(false);
      }
      else
      {
        paramView = ((MMTagPanel.d)MMTagPanel.b(this.yxC).getLast()).yxM;
        this.yxC.removeTag(paramView);
        if (MMTagPanel.e(this.yxC) != null)
          MMTagPanel.e(this.yxC).JT(paramView);
        this.yxC.dAf();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.1
 * JD-Core Version:    0.6.2
 */