package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class l extends a
{
  private WXRTEditText uUV;

  public l(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27178);
    this.uUV = ((WXRTEditText)paramView.findViewById(2131826414));
    if ((paramk.uQI != 2) || (!this.uSJ.uQJ))
    {
      this.uUV.setKeyListener(null);
      this.uUV.setFocusable(false);
      this.uUV.setClickable(true);
    }
    this.uUV.uPS = this;
    this.uUV.setEditTextType(0);
    this.uSJ.q(this.uUV);
    this.uUV.getViewTreeObserver().addOnGlobalLayoutListener(new l.1(this));
    AppMethodBeat.o(27178);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.a.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27179);
    this.uUV.setPosInDataList(paramInt1);
    paramc = (i)paramc;
    paramc.uNY = this.uUV;
    paramc.uNW = null;
    paramc.uNX = null;
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(paramInt1 - 1);
    if ((localObject != null) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.uUV.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = 0;
      this.uUV.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(paramInt1 + 1);
    if ((localObject != null) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.uUV.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
      this.uUV.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if ((this.uSJ.uQI != 2) || (!this.uSJ.uQJ))
    {
      this.uUV.setRichTextEditing(paramc.content);
      j.l(this.uUV);
    }
    while (true)
    {
      ab.i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + ki());
      AppMethodBeat.o(27179);
      return;
      al.d(new l.2(this, paramc));
    }
  }

  public final int dfW()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.l
 * JD-Core Version:    0.6.2
 */