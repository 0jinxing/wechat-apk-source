package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import java.util.ArrayList;

final class ChatFooter$30
  implements i.a
{
  ChatFooter$30(ChatFooter paramChatFooter, Context paramContext)
  {
  }

  public final void ajI(String paramString)
  {
    AppMethodBeat.i(27821);
    Intent localIntent = new Intent();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramString);
    if (ChatFooter.d(this.vnX) != null)
      localIntent.putExtra("GalleryUI_FromUser", ChatFooter.d(this.vnX));
    if (ChatFooter.e(this.vnX) != null)
      localIntent.putExtra("GalleryUI_ToUser", ChatFooter.e(this.vnX));
    localIntent.putExtra("query_source_type", 3);
    localIntent.putExtra("preview_image", true);
    localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
    localIntent.putExtra("max_select_count", 1);
    localIntent.addFlags(67108864);
    if (ChatFooter.f(this.vnX) != null)
    {
      d.a(ChatFooter.f(this.vnX), "gallery", ".ui.GalleryEntryUI", localIntent, 217);
      AppMethodBeat.o(27821);
    }
    while (true)
    {
      return;
      d.b(this.val$context, "gallery", ".ui.GalleryEntryUI", localIntent, 217);
      AppMethodBeat.o(27821);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.30
 * JD-Core Version:    0.6.2
 */