package com.tencent.mm.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.ui.widget.a.e.c;

final class SmileyGrid$3
  implements e.c
{
  SmileyGrid$3(SmileyGrid paramSmileyGrid, EmojiInfo paramEmojiInfo)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(62900);
    if (paramBoolean)
    {
      this.oeD.a(EmojiInfo.a.yaF);
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(this.oeD);
      paramString = new EmojiCaptureReporter();
      paramString.ezZ = System.currentTimeMillis();
      paramString.lgP = System.currentTimeMillis();
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().b(new EmojiCaptureUploadManager.UploadTask(this.oeD.field_md5, paramString));
    }
    AppMethodBeat.o(62900);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.3
 * JD-Core Version:    0.6.2
 */