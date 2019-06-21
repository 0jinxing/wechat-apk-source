package com.tencent.mm.plugin.card.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardShopUI$4 extends BroadcastReceiver
{
  CardShopUI$4(CardShopUI paramCardShopUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(88632);
    paramContext = paramIntent.getAction();
    if ((paramContext != null) && (paramContext.equals("android.intent.action.LOCALE_CHANGED")) && (CardShopUI.bdv()))
      CardShopUI.e(this.knD);
    AppMethodBeat.o(88632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShopUI.4
 * JD-Core Version:    0.6.2
 */