package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class k
{
  static void a(Context paramContext, k.a parama)
  {
    AppMethodBeat.i(43075);
    if ((paramContext == null) || (parama == null))
    {
      ab.e("MicroMsg.LuckySoundUtil", "play Err context:%s pathId:%d speekeron:%s looping:%b", new Object[] { paramContext, Integer.valueOf(2131301070), parama, Boolean.FALSE });
      AppMethodBeat.o(43075);
    }
    while (true)
    {
      return;
      if (!a.MC())
      {
        AppMethodBeat.o(43075);
      }
      else if (!a.MG())
      {
        AppMethodBeat.o(43075);
      }
      else
      {
        String str = paramContext.getString(2131301070);
        com.tencent.mm.compatible.b.k localk = new com.tencent.mm.compatible.b.k();
        int i;
        if (parama != k.a.oiu)
        {
          if (parama == k.a.oiv)
          {
            i = 5;
            localk.setAudioStreamType(i);
          }
        }
        else
          ab.i("MicroMsg.LuckySoundUtil", "play start mp:%d path:%s context:%s pathId:%d speakerOn:%s looping:%b ", new Object[] { Integer.valueOf(localk.hashCode()), str, paramContext, Integer.valueOf(2131301070), parama, Boolean.FALSE });
        try
        {
          paramContext = paramContext.getAssets().openFd(str);
          localk.setDataSource(paramContext.getFileDescriptor(), paramContext.getStartOffset(), paramContext.getLength());
          paramContext.close();
          localk.setLooping(false);
          localk.prepare();
          localk.start();
          paramContext = new com/tencent/mm/plugin/luckymoney/ui/k$1;
          paramContext.<init>();
          localk.setOnErrorListener(paramContext);
          paramContext = new com/tencent/mm/plugin/luckymoney/ui/k$2;
          paramContext.<init>(str);
          localk.setOnCompletionListener(paramContext);
          AppMethodBeat.o(43075);
          continue;
          i = 0;
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.LuckySoundUtil", "play failed pathId:%d e:%s", new Object[] { Integer.valueOf(2131301070), paramContext.getMessage() });
          ab.printErrStackTrace("MicroMsg.LuckySoundUtil", paramContext, "", new Object[0]);
          AppMethodBeat.o(43075);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.k
 * JD-Core Version:    0.6.2
 */