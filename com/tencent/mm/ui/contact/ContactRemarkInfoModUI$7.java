package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.c;

final class ContactRemarkInfoModUI$7
  implements h.c
{
  ContactRemarkInfoModUI$7(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(33635);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(33635);
      while (true)
      {
        return;
        ab.d("MiroMsg.ContactRemarkInfoModUI", "pick up an image");
        Intent localIntent = new Intent();
        localIntent.putExtra("max_select_count", 1);
        localIntent.putExtra("query_source_type", 0);
        localIntent.putExtra("send_btn_string", " ");
        localIntent.addFlags(67108864);
        d.b(this.zmg, "gallery", ".ui.GalleryEntryUI", localIntent, 200);
        AppMethodBeat.o(33635);
      }
      ab.d("MiroMsg.ContactRemarkInfoModUI", "delete the remark image when download failed.");
      ContactRemarkInfoModUI.w(this.zmg);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.7
 * JD-Core Version:    0.6.2
 */