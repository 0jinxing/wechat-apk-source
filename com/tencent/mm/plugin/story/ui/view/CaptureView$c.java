package com.tencent.mm.plugin.story.ui.view;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.a.b;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.c.a.c;
import com.tencent.mm.plugin.story.c.a.c.a;
import com.tencent.mm.plugin.story.model.i;
import com.tencent.mm.plugin.story.model.i.a;
import com.tencent.mm.vfs.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/CaptureView$getEncodeConfig$1", "Lcom/tencent/mm/media/widget/camerarecordview/data/IEncodeConfig;", "getAudioBitrate", "", "getFilePath", "", "getRecordType", "getSampleRate", "getThumbPath", "plugin-story_release"})
public final class CaptureView$c
  implements b
{
  public final int Ww()
  {
    AppMethodBeat.i(110299);
    int i = ((c.a)c.rRk.Uw()).etz;
    AppMethodBeat.o(110299);
    return i;
  }

  public final int Wx()
  {
    AppMethodBeat.i(110301);
    int i = ((c.a)c.rRk.Uw()).fzS;
    AppMethodBeat.o(110301);
    return i;
  }

  public final String Wy()
  {
    AppMethodBeat.i(110303);
    Object localObject = i.rSv;
    localObject = i.a.kY(cb.aaE());
    AppMethodBeat.o(110303);
    return localObject;
  }

  public final String getFilePath()
  {
    AppMethodBeat.i(110302);
    Object localObject = i.rSv;
    long l = cb.aaE();
    e.tf(i.cxK());
    localObject = i.cxK() + "record" + l + ".mp4";
    AppMethodBeat.o(110302);
    return localObject;
  }

  public final int getSampleRate()
  {
    AppMethodBeat.i(110300);
    int i = ((c.a)c.rRk.Uw()).audioSampleRate;
    AppMethodBeat.o(110300);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView.c
 * JD-Core Version:    0.6.2
 */