package com.tencent.mm.plugin.emojicapture.model;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.view.raw.FilterRawGet.GetInputStream;
import java.io.File;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Ljava/io/InputStream;", "bitmapRes", "", "kotlin.jvm.PlatformType", "getInputStream"})
final class PluginEmojiCapture$c
  implements FilterRawGet.GetInputStream
{
  PluginEmojiCapture$c(PluginEmojiCapture paramPluginEmojiCapture)
  {
  }

  public final InputStream getInputStream(String paramString)
  {
    AppMethodBeat.i(2618);
    ab.i(PluginEmojiCapture.access$getTAG$p(this.lhG), "get res: ".concat(String.valueOf(paramString)));
    Object localObject = ah.getContext();
    j.o(localObject, "MMApplicationContext.getContext()");
    localObject = ((Context)localObject).getAssets();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("raw");
      localObject = ((AssetManager)localObject).open(File.separator + paramString);
      paramString = (String)localObject;
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(PluginEmojiCapture.access$getTAG$p(this.lhG), "cannot find res ".concat(String.valueOf(paramString)));
        paramString = null;
        AppMethodBeat.o(2618);
      }
    }
    finally
    {
      AppMethodBeat.o(2618);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.PluginEmojiCapture.c
 * JD-Core Version:    0.6.2
 */