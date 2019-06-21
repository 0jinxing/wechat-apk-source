package com.tencent.mm.plugin.music.model.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.c;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;

final class a$3
  implements c
{
  a$3(a parama, com.tencent.mm.plugin.music.model.e.a parama1, String paramString)
  {
  }

  public final void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(104973);
    ab.i("MicroMsg.Music.MMMusicNotification", "music.field_songAlbumUrl:%s, success:%b", new Object[] { this.oMu.field_songAlbumUrl, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      paramArrayOfObject = d.decodeFile(this.oMP, null);
      if (paramArrayOfObject == null)
      {
        ab.e("MicroMsg.Music.MMMusicNotification", "bitmap is null, return");
        AppMethodBeat.o(104973);
      }
    }
    while (true)
    {
      return;
      o.ahp().j(this.oMu.field_songAlbumUrl, paramArrayOfObject);
      this.oMO.oMK.refresh();
      AppMethodBeat.o(104973);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.a.3
 * JD-Core Version:    0.6.2
 */