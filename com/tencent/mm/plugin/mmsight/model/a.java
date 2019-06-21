package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public final class a
{
  static a otd;
  public int etA;
  int fXT;
  public int fay;
  public long fileSize;
  JSONObject hwh;
  String model;
  public int otA;
  public int otB;
  public int otC;
  public long otD;
  public int otE;
  String ote;
  int otf;
  String otg;
  int oth;
  int oti;
  public String otj;
  public String otk;
  public String otl;
  public String otm;
  public int otn;
  public int oto;
  public int otp;
  public int otq;
  public int otr;
  public int ots;
  public int ott;
  public int otu;
  public int otv;
  public int otw;
  public int otx;
  public int oty;
  int otz;
  public int rotate;
  public int videoBitrate;

  public a()
  {
    AppMethodBeat.i(76456);
    this.model = Build.MODEL;
    this.ote = Build.VERSION.SDK_INT;
    this.rotate = 0;
    this.hwh = null;
    AppMethodBeat.o(76456);
  }

  public static a bPi()
  {
    AppMethodBeat.i(76457);
    if (otd == null)
      reset();
    a locala = otd;
    AppMethodBeat.o(76457);
    return locala;
  }

  public static void reset()
  {
    AppMethodBeat.i(76458);
    Object localObject = new a();
    otd = (a)localObject;
    ((a)localObject).fXT = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    otd.otf = d.ev(ah.getContext());
    otd.otg = m.Lx();
    localObject = d.eu(ah.getContext());
    otd.oth = ((Point)localObject).x;
    otd.oti = ((Point)localObject).y;
    AppMethodBeat.o(76458);
  }

  public final String bPj()
  {
    AppMethodBeat.i(76459);
    if (this.hwh == null);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      this.hwh = ((JSONObject)localObject);
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      this.hwh.put("wxcamera", localObject);
      ((JSONObject)localObject).put("model", this.model);
      ((JSONObject)localObject).put("apiLevel", this.ote);
      ((JSONObject)localObject).put("screen", String.format("%dx%d", new Object[] { Integer.valueOf(this.oth), Integer.valueOf(this.oti) }));
      ((JSONObject)localObject).put("crop", String.format("%dx%d", new Object[] { Integer.valueOf(this.otn), Integer.valueOf(this.oto) }));
      ((JSONObject)localObject).put("preview", String.format("%dx%d", new Object[] { Integer.valueOf(this.otp), Integer.valueOf(this.otq) }));
      ((JSONObject)localObject).put("encoder", String.format("%dx%d", new Object[] { Integer.valueOf(this.otr), Integer.valueOf(this.ots) }));
      ((JSONObject)localObject).put("rotate", this.rotate);
      ((JSONObject)localObject).put("deviceoutfps", this.ott);
      ((JSONObject)localObject).put("recordfps", this.otu);
      ((JSONObject)localObject).put("recordertype", this.otv);
      ((JSONObject)localObject).put("needRotateEachFrame", this.etA);
      ((JSONObject)localObject).put("isNeedRealtimeScale", this.otw);
      ((JSONObject)localObject).put("resolutionLimit", this.fay);
      ((JSONObject)localObject).put("videoBitrate", this.videoBitrate);
      ((JSONObject)localObject).put("wait2playtime", this.otD);
      ((JSONObject)localObject).put("useback", this.otE);
      if (j.ouz != null);
      for (int i = j.ouz.ouK; ; i = -1)
      {
        ((JSONObject)localObject).put("presetIndex", i);
        ((JSONObject)localObject).put("recorderOption", q.etj.etG);
        localObject = this.hwh.toString();
        AppMethodBeat.o(76459);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.CaptureStatistics", localException, "buildJson error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a
 * JD-Core Version:    0.6.2
 */