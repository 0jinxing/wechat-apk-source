package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryCaptureIDKeyStat;", "", "()V", "ID", "", "TAG", "", "markCpuCrop", "", "markGpuCrop", "markGpuCropFailed", "markOnCreate", "markOnDestroy", "plugin-story_release"})
public final class d
{
  public static final d sbR;

  static
  {
    AppMethodBeat.i(109799);
    sbR = new d();
    AppMethodBeat.o(109799);
  }

  public static void czX()
  {
    AppMethodBeat.i(109797);
    ab.i("MicroMsg.StoryCaptureIDKeyStat", "markOnCreate");
    h.pYm.k(985L, 0L, 1L);
    AppMethodBeat.o(109797);
  }

  public static void czY()
  {
    AppMethodBeat.i(109798);
    ab.i("MicroMsg.StoryCaptureIDKeyStat", "markOnDestroy");
    h.pYm.k(985L, 1L, 1L);
    AppMethodBeat.o(109798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.d
 * JD-Core Version:    0.6.2
 */