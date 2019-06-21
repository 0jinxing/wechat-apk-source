package com.tencent.mm.media.i;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/util/MediaEditorIDKeyStat;", "", "()V", "CaptureID", "", "RemuxID", "TAG", "", "mediaCodecWaitTick", "x264WaitTick", "markCameraOpen", "", "markCameraOpenFailed", "markCameraOpenSuccess", "markMediaCodecAACRecorderInitFailed", "markMediaCodecCapture", "markMediaCodecCaptureFailed", "markMediaCodecCaptureResult", "bitrate", "", "fps", "markMediaCodecCaptureSuccess", "markMediaCodecGLInitFailed", "markMediaCodecInitFailed", "markMediaCodecStartWait", "markMediaCodecWaitStop", "markRemux", "mixType", "markRemuxAACAsyncMix", "markRemuxAACAsyncMixTime", "time", "markRemuxAACDecoderInitFailed", "markRemuxAACEncoderInitFailed", "markRemuxAACSyncMix", "markRemuxAACSyncMixTime", "markRemuxBackgroundNoAudioTrack", "markRemuxCheckCropHit", "markRemuxCheckCropRect", "markRemuxCheckCropRectFailed", "markRemuxCopyFileFailed", "markRemuxDecodeFrameFailed", "markRemuxDecodeFrameFailedAsyncOnError", "markRemuxEncodeFrameFailed", "markRemuxEncodeFrameFailedAsyncOnError", "markRemuxFrameCountDiffError", "markRemuxFrameDrawFailed", "markRemuxFrameDrawTimeout", "markRemuxFrameDropBiggerThanOne", "markRemuxGLInitFailed", "markRemuxH264DecoderInitFailed", "markRemuxH264EncoderInitFailed", "markRemuxH265Video", "markRemuxMediaExtractorCreateFailed", "markRemuxMusicBackground", "markRemuxMusicMediaExtractorCreateFailed", "markRemuxMusicOnly", "markRemuxMuxVideoError", "markRemuxNoMusic", "markRemuxOnFrameAvailableDrawFailed", "markRemuxPcmFrameMixFailed", "markRemuxResultVideoFrameCountError", "markRemuxSlient", "markRemuxSuccess", "markRemuxSuccessResult", "originVideoFps", "markRemuxTimeAll", "markRemuxTimeMusicOnly", "markRemuxTimeNoMusic", "markRemuxTimeSlient", "markRemuxVideoParaError", "markX264AACRecorderInitFailed", "markX264Capture", "markX264CaptureFailed", "markX264CaptureResult", "markX264CaptureSuccess", "markX264GLInitFailed", "markX264InitFailed", "markX264StartWait", "markX264WaitStop", "plugin-mediaeditor_release"})
public final class c
{
  private static long fah;
  private static long fai;
  public static final c faj;

  static
  {
    AppMethodBeat.i(13180);
    faj = new c();
    fah = -1L;
    fai = -1L;
    AppMethodBeat.o(13180);
  }

  public static void VA()
  {
    AppMethodBeat.i(13144);
    if (fai > 0L)
    {
      long l = bo.az(fai);
      ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecWaitStop, waitTime:".concat(String.valueOf(l)));
      h.pYm.k(985L, 17L, l);
      h.pYm.k(985L, 18L, 1L);
      fai = -1L;
    }
    AppMethodBeat.o(13144);
  }

  public static void VB()
  {
    AppMethodBeat.i(13145);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureFailed");
    h.pYm.k(985L, 20L, 1L);
    AppMethodBeat.o(13145);
  }

  public static void VC()
  {
    AppMethodBeat.i(13146);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureSuccess");
    h.pYm.k(985L, 22L, 1L);
    AppMethodBeat.o(13146);
  }

  public static void VD()
  {
    AppMethodBeat.i(13149);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxH265Video");
    h.pYm.k(986L, 7L, 1L);
    AppMethodBeat.o(13149);
  }

  public static void VE()
  {
    AppMethodBeat.i(13150);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxVideoParaError");
    h.pYm.k(986L, 10L, 1L);
    AppMethodBeat.o(13150);
  }

  public static void VF()
  {
    AppMethodBeat.i(13151);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMediaExtractorCreateFailed");
    h.pYm.k(986L, 11L, 1L);
    AppMethodBeat.o(13151);
  }

  public static void VG()
  {
    AppMethodBeat.i(13152);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCheckCropRect");
    h.pYm.k(986L, 12L, 1L);
    AppMethodBeat.o(13152);
  }

  public static void VH()
  {
    AppMethodBeat.i(13153);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCheckCropHit");
    h.pYm.k(986L, 13L, 1L);
    AppMethodBeat.o(13153);
  }

  public static void VI()
  {
    AppMethodBeat.i(13154);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCopyFileFailed");
    h.pYm.k(986L, 14L, 1L);
    AppMethodBeat.o(13154);
  }

  public static void VJ()
  {
    AppMethodBeat.i(13155);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicMediaExtractorCreateFailed");
    h.pYm.k(986L, 15L, 1L);
    AppMethodBeat.o(13155);
  }

  public static void VK()
  {
    AppMethodBeat.i(13156);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxH264EncoderInitFailed");
    h.pYm.k(986L, 16L, 1L);
    AppMethodBeat.o(13156);
  }

  public static void VL()
  {
    AppMethodBeat.i(13157);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxH264DecoderInitFailed");
    h.pYm.k(986L, 17L, 1L);
    AppMethodBeat.o(13157);
  }

  public static void VM()
  {
    AppMethodBeat.i(13158);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxGLInitFailed");
    h.pYm.k(986L, 18L, 1L);
    AppMethodBeat.o(13158);
  }

  public static void VN()
  {
    AppMethodBeat.i(13159);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
    h.pYm.k(986L, 19L, 1L);
    AppMethodBeat.o(13159);
  }

  public static void VO()
  {
    AppMethodBeat.i(13160);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACDecoderInitFailed");
    h.pYm.k(986L, 22L, 1L);
    AppMethodBeat.o(13160);
  }

  public static void VP()
  {
    AppMethodBeat.i(13161);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACEncoderInitFailed");
    h.pYm.k(986L, 23L, 1L);
    AppMethodBeat.o(13161);
  }

  public static void VQ()
  {
    AppMethodBeat.i(13162);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxPcmFrameMixFailed");
    h.pYm.k(986L, 24L, 1L);
    AppMethodBeat.o(13162);
  }

  public static void VR()
  {
    AppMethodBeat.i(13163);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMix");
    h.pYm.k(986L, 26L, 1L);
    AppMethodBeat.o(13163);
  }

  public static void VS()
  {
    AppMethodBeat.i(13165);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMix");
    h.pYm.k(986L, 30L, 1L);
    AppMethodBeat.o(13165);
  }

  public static void VT()
  {
    AppMethodBeat.i(13169);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
    h.pYm.k(986L, 53L, 1L);
    AppMethodBeat.o(13169);
  }

  public static void VU()
  {
    AppMethodBeat.i(13170);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxBackgroundNoAudioTrack");
    h.pYm.k(986L, 25L, 1L);
    AppMethodBeat.o(13170);
  }

  public static void VV()
  {
    AppMethodBeat.i(13171);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
    h.pYm.k(986L, 76L, 1L);
    AppMethodBeat.o(13171);
  }

  public static void VW()
  {
    AppMethodBeat.i(13172);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnError");
    h.pYm.k(986L, 80L, 1L);
    AppMethodBeat.o(13172);
  }

  public static void VX()
  {
    AppMethodBeat.i(13173);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailed");
    h.pYm.k(986L, 77L, 1L);
    AppMethodBeat.o(13173);
  }

  public static void VY()
  {
    AppMethodBeat.i(13174);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailedAsyncOnError");
    h.pYm.k(986L, 81L, 1L);
    AppMethodBeat.o(13174);
  }

  public static void VZ()
  {
    AppMethodBeat.i(13175);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCheckCropRectFailed");
    h.pYm.k(986L, 78L, 1L);
    AppMethodBeat.o(13175);
  }

  public static void Vk()
  {
    AppMethodBeat.i(13127);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpen");
    h.pYm.k(985L, 3L, 1L);
    AppMethodBeat.o(13127);
  }

  public static void Vl()
  {
    AppMethodBeat.i(13128);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
    h.pYm.k(985L, 4L, 1L);
    AppMethodBeat.o(13128);
  }

  public static void Vm()
  {
    AppMethodBeat.i(13129);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
    h.pYm.k(985L, 5L, 1L);
    AppMethodBeat.o(13129);
  }

  public static void Vn()
  {
    AppMethodBeat.i(13130);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
    fah = -1L;
    h.pYm.k(985L, 30L, 1L);
    AppMethodBeat.o(13130);
  }

  public static void Vo()
  {
    AppMethodBeat.i(13131);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264InitFailed");
    h.pYm.k(985L, 31L, 1L);
    AppMethodBeat.o(13131);
  }

  public static void Vp()
  {
    AppMethodBeat.i(13132);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264GLInitFailed");
    h.pYm.k(985L, 32L, 1L);
    AppMethodBeat.o(13132);
  }

  public static void Vq()
  {
    AppMethodBeat.i(13133);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264AACRecorderInitFailed");
    h.pYm.k(985L, 33L, 1L);
    AppMethodBeat.o(13133);
  }

  public static void Vr()
  {
    AppMethodBeat.i(13134);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264StartWait");
    fai = bo.yz();
    AppMethodBeat.o(13134);
  }

  public static void Vs()
  {
    AppMethodBeat.i(13135);
    if (fai > 0L)
    {
      long l = bo.az(fai);
      ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264WaitStop, waitTime:".concat(String.valueOf(l)));
      h.pYm.k(985L, 34L, l);
      h.pYm.k(985L, 35L, 1L);
      fai = -1L;
    }
    AppMethodBeat.o(13135);
  }

  public static void Vt()
  {
    AppMethodBeat.i(13136);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
    h.pYm.k(985L, 37L, 1L);
    AppMethodBeat.o(13136);
  }

  public static void Vu()
  {
    AppMethodBeat.i(13137);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
    h.pYm.k(985L, 39L, 1L);
    AppMethodBeat.o(13137);
  }

  public static void Vv()
  {
    AppMethodBeat.i(13139);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCapture");
    fai = -1L;
    h.pYm.k(985L, 13L, 1L);
    AppMethodBeat.o(13139);
  }

  public static void Vw()
  {
    AppMethodBeat.i(13140);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
    h.pYm.k(985L, 14L, 1L);
    AppMethodBeat.o(13140);
  }

  public static void Vx()
  {
    AppMethodBeat.i(13141);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecGLInitFailed");
    h.pYm.k(985L, 15L, 1L);
    AppMethodBeat.o(13141);
  }

  public static void Vy()
  {
    AppMethodBeat.i(13142);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecAACRecorderInitFailed");
    h.pYm.k(985L, 16L, 1L);
    AppMethodBeat.o(13142);
  }

  public static void Vz()
  {
    AppMethodBeat.i(13143);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecStartWait");
    fai = bo.yz();
    AppMethodBeat.o(13143);
  }

  public static void Wa()
  {
    AppMethodBeat.i(13176);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDropBiggerThanOne");
    h.pYm.k(986L, 82L, 1L);
    AppMethodBeat.o(13176);
  }

  public static void Wb()
  {
    AppMethodBeat.i(13177);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxResultVideoFrameCountError");
    h.pYm.k(986L, 83L, 1L);
    AppMethodBeat.o(13177);
  }

  public static void Wc()
  {
    AppMethodBeat.i(13178);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMuxVideoError");
    h.pYm.k(986L, 84L, 1L);
    AppMethodBeat.o(13178);
  }

  public static void Wd()
  {
    AppMethodBeat.i(13179);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawTimeout");
    h.pYm.k(986L, 54L, 1L);
    AppMethodBeat.o(13179);
  }

  public static void We()
  {
    AppMethodBeat.i(138369);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxOnFrameAvailableDrawFailed");
    h.pYm.k(986L, 86L, 1L);
    AppMethodBeat.o(138369);
  }

  public static void cj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13138);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + paramInt1 + ", fps:" + paramInt2);
    h.pYm.k(985L, 38L, paramInt1);
    h.pYm.k(985L, 41L, paramInt2);
    AppMethodBeat.o(13138);
  }

  public static void ck(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13147);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureResult, bitrate:" + paramInt1 + ", fps:" + paramInt2);
    h.pYm.k(985L, 21L, paramInt1);
    h.pYm.k(985L, 24L, paramInt2);
    AppMethodBeat.o(13147);
  }

  public static void d(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(13168);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccessResult, bitrate:" + paramLong1 + ", fps:" + paramLong2 + ", originVideoFps:" + paramLong3);
    h.pYm.k(986L, 43L, paramLong3);
    h.pYm.k(986L, 45L, paramLong2);
    h.pYm.k(986L, 48L, paramLong1);
    AppMethodBeat.o(13168);
  }

  public static void fg(long paramLong)
  {
    AppMethodBeat.i(13164);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMixTime: ".concat(String.valueOf(paramLong)));
    h.pYm.k(986L, 27L, paramLong);
    AppMethodBeat.o(13164);
  }

  public static void fh(long paramLong)
  {
    AppMethodBeat.i(13166);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMixTime: ".concat(String.valueOf(paramLong)));
    h.pYm.k(986L, 31L, paramLong);
    AppMethodBeat.o(13166);
  }

  public static void kc(int paramInt)
  {
    AppMethodBeat.i(13148);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureResult, mixType:".concat(String.valueOf(paramInt)));
    h.pYm.k(986L, 0L, 1L);
    if (paramInt == 1)
    {
      ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxNoMusic");
      h.pYm.k(986L, 1L, 1L);
      AppMethodBeat.o(13148);
    }
    while (true)
    {
      return;
      if (paramInt == 3)
      {
        ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicBackground");
        h.pYm.k(986L, 2L, 1L);
        AppMethodBeat.o(13148);
      }
      else if (paramInt == 2)
      {
        ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicOnly");
        h.pYm.k(986L, 3L, 1L);
        AppMethodBeat.o(13148);
      }
      else
      {
        if (paramInt == 0)
        {
          ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSlient");
          h.pYm.k(986L, 4L, 1L);
        }
        AppMethodBeat.o(13148);
      }
    }
  }

  public static void t(int paramInt, long paramLong)
  {
    AppMethodBeat.i(13167);
    ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccess, mixType:" + paramInt + ", time:" + paramLong);
    h.pYm.k(986L, 34L, 1L);
    if (paramInt == 1)
    {
      ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeNoMusic, time:".concat(String.valueOf(paramLong)));
      h.pYm.k(986L, 35L, paramLong);
      AppMethodBeat.o(13167);
    }
    while (true)
    {
      return;
      if (paramInt == 3)
      {
        ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeAll, time:".concat(String.valueOf(paramLong)));
        h.pYm.k(986L, 41L, paramLong);
        AppMethodBeat.o(13167);
      }
      else if (paramInt == 2)
      {
        ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeMusicOnly, time:".concat(String.valueOf(paramLong)));
        h.pYm.k(986L, 37L, paramLong);
        AppMethodBeat.o(13167);
      }
      else
      {
        if (paramInt == 0)
        {
          ab.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeSlient, time:".concat(String.valueOf(paramLong)));
          h.pYm.k(986L, 39L, paramLong);
        }
        AppMethodBeat.o(13167);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.i.c
 * JD-Core Version:    0.6.2
 */