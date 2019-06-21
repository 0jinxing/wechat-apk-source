package com.tencent.mm.pluginsdk.ui.chat;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

final class i$3
  implements Runnable
{
  i$3(i parami, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27957);
    i locali = this.vox;
    Object localObject = locali.dkK();
    int i;
    label41: int j;
    int k;
    if (localObject == null)
    {
      i = 0;
      if (i != 0)
      {
        this.voy.sendEmptyMessage(0);
        AppMethodBeat.o(27957);
      }
    }
    else
    {
      j = (int)locali.Li(70);
      i = (int)locali.Li(120);
      k = BackwardSupportUtil.ExifHelper.bJ((String)localObject);
      if ((k != 90) && (k != 270))
        break label188;
    }
    while (true)
    {
      int m = (int)locali.Li(4);
      localObject = d.d((String)localObject, j, i, true);
      if (localObject != null)
      {
        locali.bitmap = d.a(d.b((Bitmap)localObject, k), true, m);
        locali.ehZ.edit().putString("chattingui_recent_shown_image_path", locali.vos.vop).commit();
        ab.d("MicroMsg.RecentImageBubble", "check ok");
        i = 1;
        break;
      }
      ab.e("MicroMsg.RecentImageBubble", "image hits hole.");
      i = 0;
      break;
      ab.d("MicroMsg.RecentImageBubble", "check false");
      AppMethodBeat.o(27957);
      break label41;
      label188: m = i;
      i = j;
      j = m;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(27958);
    String str = super.toString() + "|checkIfShow";
    AppMethodBeat.o(27958);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.i.3
 * JD-Core Version:    0.6.2
 */