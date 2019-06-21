package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.ui.base.n.d;
import java.io.File;

final class ContactRemarkImagePreviewUI$1$2
  implements n.d
{
  ContactRemarkImagePreviewUI$1$2(ContactRemarkImagePreviewUI.1 param1)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(33614);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(33614);
      while (true)
      {
        return;
        if (!ContactRemarkImagePreviewUI.b(this.zlB.zlA))
        {
          ContactRemarkImagePreviewUI.a(this.zlB.zlA, true);
          AppMethodBeat.o(33614);
        }
        else
        {
          new File(ContactRemarkImagePreviewUI.c(this.zlB.zlA)).delete();
          ContactRemarkImagePreviewUI.a(this.zlB.zlA, true);
          AppMethodBeat.o(33614);
          continue;
          n.j(ContactRemarkImagePreviewUI.c(this.zlB.zlA), this.zlB.zlA);
          AppMethodBeat.o(33614);
        }
      }
      ContactRemarkImagePreviewUI.d(this.zlB.zlA);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.1.2
 * JD-Core Version:    0.6.2
 */