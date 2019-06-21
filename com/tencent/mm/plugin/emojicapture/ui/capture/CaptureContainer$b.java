package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.a.b;
import com.tencent.mm.plugin.emojicapture.model.c;
import com.tencent.mm.plugin.emojicapture.model.c.a;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$getEncodeConfig$1", "Lcom/tencent/mm/media/widget/camerarecordview/data/IEncodeConfig;", "getAudioBitrate", "", "getFilePath", "", "getRecordType", "getSampleRate", "getThumbPath", "plugin-emojicapture_release"})
public final class CaptureContainer$b
  implements b
{
  public final int Ww()
  {
    return 2;
  }

  public final int Wx()
  {
    return 0;
  }

  public final String Wy()
  {
    AppMethodBeat.i(2964);
    Object localObject = c.lhw;
    localObject = c.a.bmO() + "temp_thumb" + bo.anU();
    AppMethodBeat.o(2964);
    return localObject;
  }

  public final String getFilePath()
  {
    AppMethodBeat.i(2963);
    Object localObject = c.lhw;
    localObject = c.a.bmO() + "video_" + bo.anU();
    AppMethodBeat.o(2963);
    return localObject;
  }

  public final int getSampleRate()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.b
 * JD-Core Version:    0.6.2
 */