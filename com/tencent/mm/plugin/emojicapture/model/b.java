package com.tencent.mm.plugin.emojicapture.model;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/EmojiCaptureCommand;", "Lcom/tencent/mm/pluginsdk/cmd/ProcessorCommand;", "()V", "TAG", "", "processCommand", "", "context", "Landroid/content/Context;", "args", "", "username", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "stickerCommand", "([Ljava/lang/String;)Z", "plugin-emojicapture_release"})
public final class b
  implements a
{
  private final String TAG = "MicroMsg.EmojiCaptureCommand";

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(2575);
    j.p(paramArrayOfString, "args");
    j.p(paramString, "username");
    ab.i(this.TAG, "processCommand: " + a.a.e.a(paramArrayOfString, (CharSequence)" ", null, null, 0, null, null, 62));
    boolean bool;
    if (paramArrayOfString.length <= 1)
    {
      bool = false;
      AppMethodBeat.o(2575);
      return bool;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default:
    case -1890252483:
    }
    do
    {
      bool = false;
      AppMethodBeat.o(2575);
      break;
    }
    while ((!paramContext.equals("sticker")) || (paramArrayOfString.length <= 2));
    paramContext = paramArrayOfString[2];
    switch (paramContext.hashCode())
    {
    default:
    case -1408207997:
    case 94746185:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(2575);
      break;
      if (paramContext.equals("assets"))
      {
        paramContext = com.tencent.mm.plugin.emojicapture.model.a.e.lii;
        com.tencent.mm.vfs.e.cu(com.tencent.mm.plugin.emojicapture.model.a.e.bnz());
        paramContext = com.tencent.mm.plugin.emojicapture.model.a.e.lii;
        com.tencent.mm.plugin.emojicapture.model.a.e.bnC();
        continue;
        if (paramContext.equals("clean"))
        {
          paramContext = com.tencent.mm.plugin.emojicapture.model.a.e.lii;
          com.tencent.mm.vfs.e.cu(com.tencent.mm.plugin.emojicapture.model.a.e.bnz());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b
 * JD-Core Version:    0.6.2
 */