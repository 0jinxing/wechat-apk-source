package com.tencent.mm.plugin.emojicapture.model;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/EmojiCaptureDetailIDKeyStat;", "", "()V", "ID", "", "TAG", "", "markCameraOpenFailed", "", "markCpuCropPreview", "markCpuCropPreviewFailed", "markEmojiCaptureUIOnCreate", "markEmojiCaptureUIOnDestroy", "markEmojiMixSucc", "costTime", "removeBackground", "", "markFestivalEnable", "markGifInitFailed", "markGpuCropPreview", "markGpuCropPreviewFailed", "markHighPerformance", "markLowPerformance", "markMixFrameDrawFailed", "markPixelBufferInitFailed", "markProxyCallFailed", "markRecorderInitFailed", "markSdkDrawFailed", "markSdkGestureSoFailed", "markSdkInitFailed", "markSdkReleaseFailed", "markSdkSegmentDestroyFailed", "markSdkSegmentDetectFailed", "markSdkSegmentInitFailed", "markSdkSoFailed", "markSegmentCpuSoFailed", "markSegmentGpuSoFailed", "markSegmentNotAutoInit", "markSegmentNotManualInit", "markSegmentSoInitFailed", "markStartEmojiMix", "hasSticker", "speedUp", "videoDuration", "", "markUseGif", "markUseWxam", "markVideoDecoderInitFailed", "markVideoRecordFailed", "markVideoRecordNoThumb", "markWxamInitFailed", "plugin-emojicapture_release"})
public final class d
{
  private static final String TAG = "MicroMsg.EmojiCaptureDetailIDKeyStat";
  private static final long lhy = 1012L;
  public static final d lhz;

  static
  {
    AppMethodBeat.i(2614);
    lhz = new d();
    TAG = "MicroMsg.EmojiCaptureDetailIDKeyStat";
    lhy = 1012L;
    AppMethodBeat.o(2614);
  }

  public static void Vm()
  {
    AppMethodBeat.i(2584);
    ab.i(TAG, "markCameraOpenFailed");
    h.pYm.k(lhy, 3L, 1L);
    AppMethodBeat.o(2584);
  }

  public static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    AppMethodBeat.i(2594);
    ab.i(TAG, "markStartEmojiMix, removeBackground:" + paramBoolean1 + ", hasSticker:" + paramBoolean2 + ", speedUp:" + paramBoolean3 + ", videoDuration:" + paramInt);
    h.pYm.k(lhy, 17L, 1L);
    if (paramBoolean1)
      h.pYm.k(lhy, 18L, 1L);
    if (paramBoolean2)
      h.pYm.k(lhy, 19L, 1L);
    if (paramBoolean3)
      h.pYm.k(lhy, 20L, 1L);
    if (paramInt > 0)
      h.pYm.k(lhy, 36L, paramInt);
    AppMethodBeat.o(2594);
  }

  public static void bmP()
  {
    AppMethodBeat.i(2582);
    ab.i(TAG, "markEmojiCaptureUIOnCreate");
    h.pYm.k(lhy, 0L, 1L);
    AppMethodBeat.o(2582);
  }

  public static void bmQ()
  {
    AppMethodBeat.i(2583);
    ab.i(TAG, "markEmojiCaptureUIOnDestroy");
    h.pYm.k(lhy, 1L, 1L);
    AppMethodBeat.o(2583);
  }

  public static void bmR()
  {
    AppMethodBeat.i(2585);
    ab.i(TAG, "markGpuCropPreview");
    h.pYm.k(lhy, 6L, 1L);
    AppMethodBeat.o(2585);
  }

  public static void bmS()
  {
    AppMethodBeat.i(2586);
    ab.i(TAG, "markCpuCropPreview");
    h.pYm.k(lhy, 7L, 1L);
    AppMethodBeat.o(2586);
  }

  public static void bmT()
  {
    AppMethodBeat.i(2587);
    ab.i(TAG, "markGpuCropPreviewFailed");
    h.pYm.k(lhy, 8L, 1L);
    AppMethodBeat.o(2587);
  }

  public static void bmU()
  {
    AppMethodBeat.i(2588);
    ab.i(TAG, "markCpuCropPreviewFailed");
    h.pYm.k(lhy, 9L, 1L);
    AppMethodBeat.o(2588);
  }

  public static void bmV()
  {
    AppMethodBeat.i(2589);
    ab.i(TAG, "markVideoRecordFailed");
    h.pYm.k(lhy, 10L, 1L);
    AppMethodBeat.o(2589);
  }

  public static void bmW()
  {
    AppMethodBeat.i(2590);
    ab.i(TAG, "markVideoRecordNoThumb");
    h.pYm.k(lhy, 11L, 1L);
    AppMethodBeat.o(2590);
  }

  public static void bmX()
  {
    AppMethodBeat.i(2591);
    ab.i(TAG, "markSdkInitFailed");
    h.pYm.k(lhy, 13L, 1L);
    AppMethodBeat.o(2591);
  }

  public static void bmY()
  {
    AppMethodBeat.i(2592);
    ab.i(TAG, "markSdkDrawFailed");
    h.pYm.k(lhy, 14L, 1L);
    AppMethodBeat.o(2592);
  }

  public static void bmZ()
  {
    AppMethodBeat.i(2593);
    ab.i(TAG, "markSdkReleaseFailed");
    h.pYm.k(lhy, 15L, 1L);
    AppMethodBeat.o(2593);
  }

  public static void bna()
  {
    AppMethodBeat.i(2596);
    ab.i(TAG, "markPixelBufferInitFailed");
    h.pYm.k(lhy, 25L, 1L);
    AppMethodBeat.o(2596);
  }

  public static void bnb()
  {
    AppMethodBeat.i(2597);
    ab.i(TAG, "markVideoDecoderInitFailed");
    h.pYm.k(lhy, 26L, 1L);
    AppMethodBeat.o(2597);
  }

  public static void bnc()
  {
    AppMethodBeat.i(2598);
    ab.i(TAG, "markMixFrameDrawFailed");
    h.pYm.k(lhy, 27L, 1L);
    AppMethodBeat.o(2598);
  }

  public static void bnd()
  {
    AppMethodBeat.i(2599);
    ab.i(TAG, "markUseWxam");
    h.pYm.k(lhy, 30L, 1L);
    AppMethodBeat.o(2599);
  }

  public static void bne()
  {
    AppMethodBeat.i(2600);
    ab.i(TAG, "markUseGif");
    h.pYm.k(lhy, 31L, 1L);
    AppMethodBeat.o(2600);
  }

  public static void bnf()
  {
    AppMethodBeat.i(2601);
    ab.i(TAG, "markWxamInitFailed");
    h.pYm.k(lhy, 32L, 1L);
    AppMethodBeat.o(2601);
  }

  public static void bng()
  {
    AppMethodBeat.i(2602);
    ab.i(TAG, "markGifInitFailed");
    h.pYm.k(lhy, 33L, 1L);
    AppMethodBeat.o(2602);
  }

  public static void bnh()
  {
    AppMethodBeat.i(2603);
    ab.i(TAG, "markSdkSegmentInitFailed");
    h.pYm.z(lhy, 45L);
    AppMethodBeat.o(2603);
  }

  public static void bni()
  {
    AppMethodBeat.i(2604);
    ab.i(TAG, "markSdkSegmentDetectFailed");
    h.pYm.z(lhy, 46L);
    AppMethodBeat.o(2604);
  }

  public static void bnj()
  {
    AppMethodBeat.i(2605);
    ab.i(TAG, "markSdkSegmentDestroyFailed");
    h.pYm.z(lhy, 47L);
    AppMethodBeat.o(2605);
  }

  public static void bnk()
  {
    AppMethodBeat.i(2606);
    ab.i(TAG, "markSdkSoFailed");
    h.pYm.z(lhy, 54L);
    AppMethodBeat.o(2606);
  }

  public static void bnl()
  {
    AppMethodBeat.i(2607);
    h.pYm.z(lhy, 56L);
    AppMethodBeat.o(2607);
  }

  public static void bnm()
  {
    AppMethodBeat.i(2608);
    h.pYm.z(lhy, 57L);
    AppMethodBeat.o(2608);
  }

  public static void bnn()
  {
    AppMethodBeat.i(2609);
    ab.i(TAG, "markProxyCallFailed");
    h.pYm.z(lhy, 59L);
    AppMethodBeat.o(2609);
  }

  public static void bno()
  {
    AppMethodBeat.i(2610);
    ab.i(TAG, "markSegmentSoFailed");
    h.pYm.z(lhy, 63L);
    AppMethodBeat.o(2610);
  }

  public static void bnp()
  {
    AppMethodBeat.i(2611);
    ab.i(TAG, "markSegmentCpuSoFailed");
    h.pYm.z(lhy, 64L);
    AppMethodBeat.o(2611);
  }

  public static void bnq()
  {
    AppMethodBeat.i(2612);
    ab.i(TAG, "markSegmentNotManualInit");
    h.pYm.z(lhy, 66L);
    AppMethodBeat.o(2612);
  }

  public static void bnr()
  {
    AppMethodBeat.i(2613);
    ab.i(TAG, "markSegmentSoInitFailed");
    h.pYm.z(lhy, 67L);
    AppMethodBeat.o(2613);
  }

  public static void p(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(2595);
    ab.i(TAG, "markEmojiMixSucc, costTime:" + paramLong + ", removeBackground:" + paramBoolean);
    h.pYm.k(lhy, 21L, 1L);
    if (paramBoolean)
    {
      h.pYm.k(lhy, 23L, 1L);
      if (!paramBoolean)
        break label109;
      h.pYm.k(lhy, 42L, paramLong);
      AppMethodBeat.o(2595);
    }
    while (true)
    {
      return;
      h.pYm.k(lhy, 22L, 1L);
      break;
      label109: h.pYm.k(lhy, 39L, paramLong);
      AppMethodBeat.o(2595);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.d
 * JD-Core Version:    0.6.2
 */