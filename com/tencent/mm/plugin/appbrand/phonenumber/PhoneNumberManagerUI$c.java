package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.vending.c.a;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class PhoneNumberManagerUI$c
  implements MenuItem.OnMenuItemClickListener
{
  PhoneNumberManagerUI$c(PhoneNumberManagerUI paramPhoneNumberManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(134861);
    paramMenuItem = PhoneNumberManagerUI.b(this.iyH);
    label65: label77: PhoneItem localPhoneItem;
    if (paramMenuItem != null)
    {
      paramMenuItem = paramMenuItem.ixw;
      if (paramMenuItem != null)
      {
        paramMenuItem = Integer.valueOf(paramMenuItem.size());
        if (paramMenuItem == null)
          a.f.b.j.dWJ();
        if (paramMenuItem.intValue() < 0)
          break label205;
        paramMenuItem = PhoneNumberManagerUI.b(this.iyH);
        if (paramMenuItem == null)
          break label195;
        paramMenuItem = paramMenuItem.ixw;
        if (paramMenuItem == null)
          a.f.b.j.dWJ();
        Iterator localIterator = paramMenuItem.iterator();
        if (!localIterator.hasNext())
          break label205;
        localPhoneItem = (PhoneItem)localIterator.next();
        localObject = this.iyH.ixV;
        if (localObject != null)
        {
          paramMenuItem = this.iyH.ixV;
          if (paramMenuItem == null)
            break label200;
        }
      }
    }
    label195: label200: for (paramMenuItem = Long.valueOf(paramMenuItem.GP()); ; paramMenuItem = null)
    {
      if (paramMenuItem == null)
        a.f.b.j.dWJ();
      ((be)localObject).df(paramMenuItem.longValue() + 1L);
      new f(PhoneNumberManagerUI.a(this.iyH), localPhoneItem.cFl, 1).acy().h((a)new PhoneNumberManagerUI.c.1(this, localPhoneItem));
      break label77;
      paramMenuItem = null;
      break;
      paramMenuItem = null;
      break label65;
    }
    label205: Object localObject = j.ixQ;
    paramMenuItem = PhoneNumberManagerUI.b(this.iyH);
    if (paramMenuItem != null);
    for (paramMenuItem = paramMenuItem.ixw; ; paramMenuItem = null)
    {
      if (paramMenuItem == null)
        a.f.b.j.dWJ();
      ((j.a)localObject).o(paramMenuItem);
      this.iyH.finish();
      this.iyH.overridePendingTransition(2131034130, 2131034130);
      AppMethodBeat.o(134861);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.c
 * JD-Core Version:    0.6.2
 */