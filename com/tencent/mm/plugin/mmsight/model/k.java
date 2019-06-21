package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class k
{
  public static void Vv()
  {
    AppMethodBeat.i(76532);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
    h.pYm.a(440L, 2L, 1L, false);
    AppMethodBeat.o(76532);
  }

  public static void bPA()
  {
    AppMethodBeat.i(76535);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
    h.pYm.a(440L, 16L, 1L, false);
    AppMethodBeat.o(76535);
  }

  public static void bPB()
  {
    AppMethodBeat.i(76536);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
    h.pYm.a(440L, 21L, 1L, false);
    AppMethodBeat.o(76536);
  }

  public static void bPC()
  {
    AppMethodBeat.i(76537);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
    h.pYm.a(440L, 31L, 1L, false);
    AppMethodBeat.o(76537);
  }

  public static void bPD()
  {
    AppMethodBeat.i(76539);
    h.pYm.a(440L, 140L, 0L, false);
    AppMethodBeat.o(76539);
  }

  public static void bPx()
  {
    AppMethodBeat.i(76531);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
    h.pYm.a(440L, 0L, 1L, false);
    int i = 36;
    if (j.ouz.etz == 1)
      i = 39;
    int j;
    if (j.ouz.fay == 720)
      j = i + 1;
    while (true)
    {
      h.pYm.a(440L, j, 1L, false);
      AppMethodBeat.o(76531);
      return;
      j = i;
      if (j.ouz.bPI())
        j = i + 2;
    }
  }

  public static void bPy()
  {
    AppMethodBeat.i(76533);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
    h.pYm.a(440L, 7L, 1L, false);
    AppMethodBeat.o(76533);
  }

  public static void bPz()
  {
    AppMethodBeat.i(76534);
    ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
    h.pYm.a(440L, 8L, 1L, false);
    AppMethodBeat.o(76534);
  }

  public static void d(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(76538);
    ab.v("MicroMsg.MMSightRecorderIDKeyStat", "markCaptureProcessCost isPictureMode %s cost_time %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong) });
    a.bPi().otD = paramLong;
    a locala = a.bPi();
    d locald1 = new d();
    d locald2 = new d();
    locald1.k("model", locala.model + ",");
    locald1.k("apiLevel", locala.ote + ",");
    locald1.k("memoryClass", locala.fXT + ",");
    locald1.k("totalMemory", locala.otf + ",");
    locald1.k("maxCpu", locala.otg + ",");
    locald1.k("screenW", locala.oth + ",");
    locald1.k("screenH", locala.oti + ",");
    locald2.k("model", locala.model + ",");
    locald2.k("apiLevel", locala.ote + ",");
    locald2.k("memoryClass", locala.fXT + ",");
    locald2.k("totalMemory", locala.otf + ",");
    locald2.k("maxCpu", locala.otg + ",");
    locald2.k("screenW", locala.oth + ",");
    locald2.k("screenH", locala.oti + ",");
    locald1.k("cropx", locala.otn + ",");
    locald1.k("cropy", locala.oto + ",");
    locald1.k("previewx", locala.otp + ",");
    locald1.k("previewy", locala.otq + ",");
    locald1.k("encoderx", locala.otr + ",");
    locald1.k("encodery", locala.ots + ",");
    locald1.k("rotate", locala.rotate + ",");
    locald1.k("deviceoutfps", locala.ott + ",");
    locald1.k("recordfps", locala.otu + ",");
    locald1.k("recordertype", locala.otv + ",");
    locald1.k("videoBitrate", locala.videoBitrate + ",");
    locald1.k("needRotateEachFrame", locala.etA + ",");
    locald1.k("isNeedRealtimeScale", locala.otw + ",");
    locald1.k("resolutionLimit", locala.fay + ",");
    locald1.k("outfps", locala.otx + ",");
    locald1.k("recordTime", locala.oty + ",");
    locald1.k("avgcpu", locala.otz + ",");
    locald1.k("outx", locala.otA + ",");
    locald1.k("outy", locala.otB + ",");
    locald1.k("outbitrate", locala.otC + ",");
    locald1.k("fileSize", locala.fileSize + ",");
    locald1.k("wait2playtime", locala.otD + ",");
    locald1.k("useback", locala.otE + ",");
    int i = 0;
    int j = 0;
    Intent localIntent = ah.getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    int k;
    if (localIntent != null)
    {
      k = localIntent.getIntExtra("status", -1);
      if ((k == 2) || (k == 5))
      {
        k = 1;
        i = localIntent.getIntExtra("level", -1);
        j = localIntent.getIntExtra("scale", -1);
        label1218: ab.i("MicroMsg.CaptureStatistics", "battery %s %s %s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
        locald1.k("mIsCharging", k + ",");
        locald1.k("level", i + ",");
        locald1.k("scale", j + ",");
        locald1.k("createTime", System.currentTimeMillis() + ",");
        locald2.k("prewViewlist1", locala.otj + ",");
        locald2.k("pictureSize1", locala.otk + ",");
        locald2.k("prewViewlist2", locala.otl + ",");
        locald2.k("pictureSize2", locala.otm + ",");
        ab.i("MicroMsg.CaptureStatistics", "report " + locald1.Fk());
        ab.v("MicroMsg.CaptureStatistics", "report " + locald2.Fk());
        h.pYm.X(13947, locald1.toString());
        h.pYm.X(13949, locald2.toString());
        if (!paramBoolean)
          break label1699;
        h.pYm.a(440L, 119L, 1L, false);
        h.pYm.a(440L, 120L, paramLong, false);
        if (j.ouz.fay != 720)
          break label1646;
        h.pYm.a(440L, 122L, paramLong, false);
        AppMethodBeat.o(76538);
      }
    }
    label1699: 
    while (true)
    {
      return;
      k = 0;
      break;
      k = 0;
      break label1218;
      label1646: if (j.ouz.bPI())
      {
        h.pYm.a(440L, 123L, paramLong, false);
        AppMethodBeat.o(76538);
      }
      else
      {
        h.pYm.a(440L, 121L, paramLong, false);
        AppMethodBeat.o(76538);
        continue;
        h.pYm.a(440L, 124L, 1L, false);
        h.pYm.a(440L, 125L, paramLong, false);
        if (j.ouz.etz == 1)
        {
          h.pYm.a(440L, 127L, paramLong, false);
          h.pYm.a(440L, 131L, paramLong, false);
          AppMethodBeat.o(76538);
        }
        else
        {
          h.pYm.a(440L, 126L, paramLong, false);
          h.pYm.a(440L, 130L, paramLong, false);
          AppMethodBeat.o(76538);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.k
 * JD-Core Version:    0.6.2
 */