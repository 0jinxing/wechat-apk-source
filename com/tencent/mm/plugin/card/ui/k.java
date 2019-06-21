package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.ui.view.aa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class k extends c
{
  private final String TAG;
  private int count;
  private com.tencent.mm.plugin.card.base.c kgW;
  private n.a kiz;
  private final String knL;
  private final String knM;
  private ArrayList<CardInfo> knN;
  private ArrayList<CardInfo> knO;
  private ArrayList<CardInfo> knP;

  public k(Context paramContext, n.a parama)
  {
    super(paramContext, parama);
    AppMethodBeat.i(88654);
    this.TAG = "MicroMsg.CardTicketAdapter";
    this.knL = "PRIVATE_TICKET_TITLE";
    this.knM = "PRIVATE_INVOICE_TITLE";
    this.count = 0;
    this.kiz = parama;
    this.kgW = new aa(paramContext, this);
    this.knN = new ArrayList();
    this.knO = new ArrayList();
    this.knP = new ArrayList();
    AppMethodBeat.o(88654);
  }

  private void bdw()
  {
    AppMethodBeat.i(88655);
    this.knN.clear();
    this.knO.clear();
    this.knP.clear();
    int i = 0;
    CardInfo localCardInfo;
    if (i < this.count)
    {
      localCardInfo = (CardInfo)super.getItem(i);
      if (localCardInfo != null)
      {
        if (!localCardInfo.aZH())
          break label71;
        this.knP.add(localCardInfo);
      }
      while (true)
      {
        i++;
        break;
        label71: this.knO.add(localCardInfo);
      }
    }
    if (!this.knO.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_TICKET_TITLE";
      this.knN.add(localCardInfo);
      this.knN.addAll(this.knO);
    }
    if (!this.knP.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_INVOICE_TITLE";
      this.knN.add(localCardInfo);
      this.knN.addAll(this.knP);
    }
    this.count = this.knN.size();
    AppMethodBeat.o(88655);
  }

  private CardInfo sY(int paramInt)
  {
    AppMethodBeat.i(88658);
    CardInfo localCardInfo = (CardInfo)this.knN.get(paramInt);
    AppMethodBeat.o(88658);
    return localCardInfo;
  }

  public final void KC()
  {
    AppMethodBeat.i(88656);
    ab.v("MicroMsg.CardTicketAdapter", "resetCursor");
    bIf();
    Cursor localCursor = am.baW().a(this.kiz);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      ab.v("MicroMsg.CardTicketAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    bdw();
    notifyDataSetChanged();
    AppMethodBeat.o(88656);
  }

  public final void KD()
  {
    AppMethodBeat.i(88657);
    bIf();
    KC();
    AppMethodBeat.o(88657);
  }

  public final int getCount()
  {
    AppMethodBeat.i(88660);
    int i;
    if (this.knN.isEmpty())
    {
      i = super.getCount();
      AppMethodBeat.o(88660);
    }
    while (true)
    {
      return i;
      i = this.knN.size();
      AppMethodBeat.o(88660);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(88659);
    CardInfo localCardInfo = sY(paramInt);
    if ((localCardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE")) || (localCardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")))
    {
      paramInt = 0;
      AppMethodBeat.o(88659);
    }
    while (true)
    {
      return paramInt;
      if (localCardInfo.aZH())
      {
        paramInt = 2;
        AppMethodBeat.o(88659);
      }
      else
      {
        paramInt = 1;
        AppMethodBeat.o(88659);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88661);
    paramViewGroup = sY(paramInt);
    paramView = this.kgW.a(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(88661);
    return paramView;
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final void release()
  {
    AppMethodBeat.i(88662);
    bIf();
    this.kgW.release();
    this.kgW = null;
    AppMethodBeat.o(88662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.k
 * JD-Core Version:    0.6.2
 */