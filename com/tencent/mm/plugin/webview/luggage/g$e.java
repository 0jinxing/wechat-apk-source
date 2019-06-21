package com.tencent.mm.plugin.webview.luggage;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.m.b;
import com.tencent.mm.plugin.webview.luggage.ipc.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.h;

class g$e
  implements c
{
  public final void a(Context paramContext, Bundle paramBundle, com.tencent.mm.plugin.webview.luggage.ipc.a parama)
  {
    AppMethodBeat.i(6143);
    Object localObject = paramBundle.getString("img_path");
    if (r.amo((String)localObject))
    {
      paramBundle = com.tencent.mm.a.g.cz((String)localObject);
      paramBundle = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramBundle);
      if ((paramBundle != null) && (paramBundle.duP()))
        break label418;
      paramBundle = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
      ah.getContext();
      paramBundle = paramBundle.Jf((String)localObject);
      paramBundle = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramBundle);
    }
    label259: label412: label418: 
    while (true)
    {
      int i;
      if (paramBundle == null)
      {
        i = 0;
        if (paramBundle != null)
          break label259;
        label117: BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject, localOptions) == null) || (localOptions.outHeight <= b.Na())) && (localOptions.outWidth <= b.Na()))
          break label412;
      }
      for (int j = 1; ; j = 0)
      {
        if ((i > b.Nb()) || (j != 0))
        {
          h.a(paramContext, paramContext.getString(2131299043), "", paramContext.getString(2131300601), null);
          h.a(paramContext, paramContext.getString(2131299043), "", paramContext.getString(2131300601), "", false, new g.e.1(this, parama), new g.e.2(this, parama));
          AppMethodBeat.o(6143);
        }
        while (true)
        {
          return;
          i = e.cs(paramBundle.dve());
          break;
          localObject = paramBundle.dve();
          break label117;
          localObject = new Intent();
          if (paramBundle != null);
          for (paramBundle = paramBundle.Aq(); ; paramBundle = "")
          {
            ((Intent)localObject).putExtra("Retr_File_Name", paramBundle);
            ((Intent)localObject).putExtra("Retr_Msg_Type", 5);
            ((Intent)localObject).putExtra("Retr_MsgImgScene", 1);
            com.tencent.mm.plugin.webview.a.a.gkE.k((Intent)localObject, paramContext);
            parama.l(null);
            AppMethodBeat.o(6143);
            break;
          }
          paramBundle = new Intent();
          paramBundle.putExtra("Retr_File_Name", (String)localObject);
          paramBundle.putExtra("Retr_Compress_Type", 0);
          paramBundle.putExtra("Retr_Msg_Type", 0);
          paramBundle.addFlags(268435456);
          com.tencent.mm.plugin.webview.a.a.gkE.k(paramBundle, paramContext);
          parama.l(null);
          AppMethodBeat.o(6143);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.e
 * JD-Core Version:    0.6.2
 */