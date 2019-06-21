package com.tencent.mm.plugin.emojicapture.model.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "", "()V", "attachText", "", "getAttachText", "()Ljava/lang/String;", "setAttachText", "(Ljava/lang/String;)V", "attachTextColor", "", "getAttachTextColor", "()I", "setAttachTextColor", "(I)V", "enableRemoveBg", "", "getEnableRemoveBg", "()Z", "setEnableRemoveBg", "(Z)V", "removeBg", "getRemoveBg", "setRemoveBg", "scene", "getScene", "setScene", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "getStickerInfo", "()Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "setStickerInfo", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;)V", "thumbPath", "getThumbPath", "setThumbPath", "timeEnter", "", "getTimeEnter", "()J", "setTimeEnter", "(J)V", "videoPath", "getVideoPath", "setVideoPath", "plugin-emojicapture_release"})
public final class a
{
  public long ezZ;
  public boolean lgS;
  public b lhH;
  public String lhI;
  public int lhJ;
  public boolean lhK = true;
  public int scene = 1;
  public String thumbPath = "";
  public String videoPath = "";

  public final void mb(String paramString)
  {
    AppMethodBeat.i(2636);
    j.p(paramString, "<set-?>");
    this.thumbPath = paramString;
    AppMethodBeat.o(2636);
  }

  public final void setVideoPath(String paramString)
  {
    AppMethodBeat.i(2635);
    j.p(paramString, "<set-?>");
    this.videoPath = paramString;
    AppMethodBeat.o(2635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a.a
 * JD-Core Version:    0.6.2
 */