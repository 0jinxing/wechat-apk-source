package com.tencent.mm.plugin.music.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.music.model.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.c;

final class MusicMainUI$7
  implements h.c
{
  MusicMainUI$7(MusicMainUI paramMusicMainUI, e parame)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(105102);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(105102);
    case 0:
    case 1:
    case 2:
      while (true)
      {
        return;
        com.tencent.mm.plugin.music.model.d.S(this.oOZ);
        com.tencent.mm.plugin.music.model.d.d.zO(MusicMainUI.h(this.oOZ));
        com.tencent.mm.plugin.music.model.d.d.zQ(2);
        AppMethodBeat.o(105102);
        continue;
        com.tencent.mm.plugin.music.model.d.b(this.fJL, this.oOZ);
        com.tencent.mm.plugin.music.model.d.d.zP(MusicMainUI.h(this.oOZ));
        com.tencent.mm.plugin.music.model.d.d.zQ(1);
        AppMethodBeat.o(105102);
        continue;
        com.tencent.mm.plugin.music.model.d.a(this.fJL, this.oOZ);
        com.tencent.mm.plugin.music.model.d.d.zQ(3);
        AppMethodBeat.o(105102);
      }
    case 3:
    }
    Object localObject = this.fJL;
    MusicMainUI localMusicMainUI = this.oOZ;
    h.pYm.X(10910, "4");
    String str;
    label165: label171: label194: Uri localUri;
    if (localObject != null)
    {
      str = ((e)localObject).fKc;
      if (str != null)
        break label227;
      paramInt = -1;
      if (paramInt >= 0)
        break label238;
      localObject = null;
      if (localObject != null)
        break label250;
      ab.e("MicroMsg.Music.MusicUtil", "wtf, get qq music data fail, url %s", new Object[] { str });
      localObject = "androidqqmusic://";
      localUri = Uri.parse((String)localObject);
      if (localUri != null)
        break label282;
      ab.w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", new Object[] { localObject });
    }
    while (true)
    {
      com.tencent.mm.plugin.music.model.d.d.zQ(4);
      break;
      label227: paramInt = str.indexOf("#p=");
      break label165;
      label238: localObject = str.substring(paramInt + 3);
      break label171;
      label250: ab.i("MicroMsg.Music.MusicUtil", "get qq music data %s", new Object[] { localObject });
      localObject = String.format("androidqqmusic://from=webPlayer&data=%s", new Object[] { localObject });
      break label194;
      label282: a.aic();
      localObject = new Intent("android.intent.action.VIEW", localUri);
      ((Intent)localObject).addFlags(268435456);
      if (bo.k(localMusicMainUI, (Intent)localObject))
      {
        localMusicMainUI.startActivity((Intent)localObject);
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("rawUrl", str);
        b.gkE.i((Intent)localObject, localMusicMainUI);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.7
 * JD-Core Version:    0.6.2
 */