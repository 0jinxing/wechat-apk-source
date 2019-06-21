package com.tencent.mm.plugin.emojicapture.model;

import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.vfs.e;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/EmojiCaptureConstants$Companion;", "", "()V", "CHIN", "", "DefaultEmojiVideoFrameDuration", "DefaultFilterIndex", "EYE", "EmojiCornerPercent", "", "EmojiMinRecordTime", "EmojiPreviewHeight", "EmojiPreviewSize", "getEmojiPreviewSize", "()I", "setEmojiPreviewSize", "(I)V", "EmojiPreviewWidth", "EmojiPtSegmentInputSize", "EmojiRoundCornerRadius", "getEmojiRoundCornerRadius", "()F", "setEmojiRoundCornerRadius", "(F)V", "EmojiVideoSpeedupRate", "FACEV", "FinalEmojiSize", "getFinalEmojiSize", "setFinalEmojiSize", "FontPath", "", "MaxAttachedEmoji", "NOSE", "NonSpeedUpFrameRate", "RecordFrameDelayMs", "RecordVideoBitRate", "SHAPE", "SKIN", "SpeedUpFrameDropFpsLimit", "SpeedUpFrameRate", "TAG", "TempFileDir", "TempGif", "TempThumb", "captureMaxDuration", "getCaptureMaxDuration", "setCaptureMaxDuration", "debugBeautyParaSpName", "isSupportHevc", "", "()Z", "setSupportHevc", "(Z)V", "segBackgroundStorkeWidth", "calcRoundCornerRadius", "size", "formatColor", "intColor", "stringColor", "getExportPath", "getFontAssetsPath", "fontName", "getFontDataPath", "getTempGifPath", "getTempRoot", "getTempThumbPath", "getTempVideoPath", "removeTempFiles", "", "setup", "useFreetype", "useNewFont", "plugin-emojicapture_release"})
public final class c$a
{
  public static int Ka(String paramString)
  {
    AppMethodBeat.i(2580);
    j.p(paramString, "stringColor");
    int i;
    if (m.jb(paramString, "#"))
    {
      i = Color.parseColor(paramString);
      AppMethodBeat.o(2580);
    }
    while (true)
    {
      return i;
      try
      {
        i = Integer.parseInt(paramString, a.k.a.UW(16));
        i &= -1;
        AppMethodBeat.o(2580);
      }
      catch (Exception paramString)
      {
        while (true)
          i = 0;
      }
    }
  }

  public static String bmO()
  {
    AppMethodBeat.i(2578);
    String str = b.Yb() + "capture_emoji/";
    e.tf(str);
    AppMethodBeat.o(2578);
    return str;
  }

  public static String ut(int paramInt)
  {
    AppMethodBeat.i(2579);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = "";
      AppMethodBeat.o(2579);
    }
    while (true)
    {
      return localObject;
      localObject = a.f.b.y.AVH;
      localObject = String.format("%06X", Arrays.copyOf(new Object[] { Integer.valueOf(0xFFFFFF & paramInt) }, 1));
      j.o(localObject, "java.lang.String.format(format, *args)");
      AppMethodBeat.o(2579);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  public static final class a extends k
    implements a.f.a.a<a.y>
  {
    public static final a lhx;

    static
    {
      AppMethodBeat.i(2577);
      lhx = new a();
      AppMethodBeat.o(2577);
    }

    a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.a
 * JD-Core Version:    0.6.2
 */