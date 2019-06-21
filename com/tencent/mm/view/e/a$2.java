package com.tencent.mm.view.e;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.view.SmileyPanelViewPager;
import com.tencent.mm.view.a.j;
import com.tencent.mm.view.a.j.a;

final class a$2
  implements j.a
{
  a$2(a parama)
  {
  }

  public final void f(int paramInt, View paramView)
  {
    boolean bool1 = false;
    AppMethodBeat.i(63024);
    Object localObject = a.j(this.AdQ).QE(paramInt);
    if (localObject == null)
    {
      ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "info is null. ignore click action.");
      AppMethodBeat.o(63024);
    }
    String str;
    while (true)
    {
      return;
      str = ((EmojiGroupInfo)localObject).field_productID;
      a.d(this.AdQ);
      if (!str.equalsIgnoreCase("TAG_STORE_MANEGER_TAB"))
        break;
      a.k(this.AdQ);
      AppMethodBeat.o(63024);
    }
    a.b(this.AdQ, paramInt);
    com.tencent.mm.view.c.a locala = a.d(this.AdQ).atl(((EmojiGroupInfo)localObject).field_productID);
    a.a(this.AdQ, locala.jis);
    if (locala.Adn > locala.dMX() - 1);
    for (paramInt = locala.dMX() - 1; ; paramInt = locala.Adn)
    {
      if (a.c(this.AdQ) != null)
        a.c(this.AdQ).setCurrentItem(a.e(this.AdQ) + paramInt, false);
      boolean bool2 = bool1;
      if (a.d(this.AdQ).dNx())
      {
        str = locala.kWz;
        a.d(this.AdQ);
        bool2 = bool1;
        if (str.equals("TAG_DEFAULT_TAB"))
          bool2 = true;
      }
      a.a(this.AdQ, locala.dMX(), paramInt, bool2);
      a.d(this.AdQ).Aer = paramInt;
      a.d(this.AdQ).setShowProductId(((EmojiGroupInfo)localObject).field_productID);
      localObject = ((EmojiGroupInfo)localObject).field_productID;
      a.d(this.AdQ);
      if ((((String)localObject).equals("capture")) && (com.tencent.mm.view.f.a.QL(a.d(this.AdQ).gOW)))
      {
        a.dNh();
        paramView = paramView.findViewById(2131827585);
        if (paramView != null)
          paramView.setVisibility(8);
      }
      AppMethodBeat.o(63024);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a.2
 * JD-Core Version:    0.6.2
 */