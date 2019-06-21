package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.p;

public class c extends p<CardInfo>
{
  private final String TAG;
  private int count;
  private com.tencent.mm.plugin.card.base.c kgW;
  private n.a kiz;

  public c(Context paramContext, n.a parama)
  {
    super(paramContext, new CardInfo());
    AppMethodBeat.i(88240);
    this.TAG = "MicroMsg.CardAdapter";
    this.count = 0;
    this.kiz = parama;
    pN(true);
    this.kgW = new l(paramContext, this);
    AppMethodBeat.o(88240);
  }

  public void KC()
  {
    AppMethodBeat.i(88241);
    ab.v("MicroMsg.CardAdapter", "resetCursor");
    bIf();
    Cursor localCursor = am.baW().a(this.kiz);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      ab.v("MicroMsg.CardAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    notifyDataSetChanged();
    AppMethodBeat.o(88241);
  }

  public void KD()
  {
    AppMethodBeat.i(88242);
    bIf();
    KC();
    AppMethodBeat.o(88242);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88243);
    paramViewGroup = (CardInfo)getItem(paramInt);
    paramView = this.kgW.a(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(88243);
    return paramView;
  }

  public void release()
  {
    AppMethodBeat.i(88244);
    bIf();
    this.kgW.release();
    this.kgW = null;
    AppMethodBeat.o(88244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.c
 * JD-Core Version:    0.6.2
 */