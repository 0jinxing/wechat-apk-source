package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.graphics.Matrix;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.format.Formatter;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.l;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.cps;
import com.tencent.mm.protocal.protobuf.cpu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class v2protocal
{
  public static final int VOICE_FRAME_BYTES;
  public static final int VOICE_SAMPLERATE;
  protected static int cpuFlag0;
  public static boolean sTV;
  public static d sVJ;
  public static Surface sVL;
  public static WeakReference<com.tencent.mm.plugin.voip.video.e> sVN;
  private static int sVn;
  private static final String[] supportedH264HwCodecPrefixes;
  int bitrate;
  public int channelStrategy;
  public int defaultHeight;
  public int defaultWidth;
  public long fDH;
  public int[] field_ChannelReportDial;
  public int[] field_EngineReportStatFromApp;
  public int field_HWEncH;
  public int field_HWEncW;
  public int[] field_SpeedTestSvrParaArray;
  public int field_audioDuration;
  public byte[] field_capInfo;
  int field_channelReportLength;
  int field_channelStatLength;
  public int field_connectingStatusKey;
  int field_engine2ndReportLength;
  int field_engine2ndStatLength;
  int field_engineQosStatLength;
  int field_engineVersionStatLength;
  public int[] field_jbmBitratRsSvrParamArray;
  public double[] field_jbmBitratRsSvrParamDoubleArray;
  public int field_jbmParamArraySize;
  public int field_jbmParamDoubleArraySize;
  public int field_localImgHeight;
  public int field_localImgWidth;
  public int field_mGetValidSample;
  public int[] field_natSvrArray;
  int field_netFlowRecv;
  int field_netFlowSent;
  int field_newEngineExtStatLength;
  int field_newEngineReportLength;
  int field_newEngineStatLength;
  public byte[] field_peerId;
  public int field_pstnChannelInfoLength;
  public int field_pstnEngineInfoLength;
  public int[] field_punchSvrArray;
  public int field_realLinkQualityInfoBuffLen;
  public int field_recvVideoLen;
  public int field_relayDataSyncKey;
  public int[] field_relaySvrArray;
  public int[] field_relayTcpSvrArray;
  public int field_remoteImgHeight;
  public int field_remoteImgLength;
  public int field_remoteImgOrien;
  public int field_remoteImgWidth;
  public int field_sendVideoLen;
  int field_speedTestInfoLength;
  int field_statInfoLength;
  public int field_statusSyncKey;
  public int field_videoDuration;
  private ak handler;
  public int height;
  protected boolean isInited;
  public int kIm;
  public String nMl;
  public int netType;
  public int nwC;
  public int nwu;
  public long nwv;
  public int nwx;
  public int sTW;
  public int sTX;
  public int sTY;
  public long sTZ;
  public int sUA;
  public int sUB;
  public int sUC;
  public int sUD;
  public int sUE;
  public int sUF;
  public int sUG;
  public int sUH;
  public int sUI;
  public int sUJ;
  public int sUK;
  public int sUL;
  public int sUM;
  public int sUN;
  public int sUO;
  public int sUP;
  public int sUQ;
  public int sUR;
  public int sUS;
  public int sUT;
  public int[] sUU;
  public int sUV;
  public int sUW;
  public int sUX;
  public int sUY;
  public byte[] sUZ;
  public byte[] sUa;
  public byte[] sUb;
  public byte[] sUc;
  public int sUd;
  public byte[] sUe;
  public int sUf;
  public int sUg;
  public int sUh;
  public int sUi;
  public byte[] sUj;
  public int sUk;
  public int sUl;
  public int sUm;
  public int sUn;
  public int sUo;
  public int sUp;
  public int sUq;
  public int sUr;
  public int sUs;
  public int sUt;
  public int sUu;
  public int sUv;
  public int sUw;
  public int sUx;
  public int sUy;
  public int sUz;
  byte[] sVA;
  byte[] sVB;
  byte[] sVC;
  public byte[] sVD;
  public byte[] sVE;
  public int[] sVF;
  int sVG;
  public n sVH;
  public e sVI;
  int sVK;
  public boolean sVM;
  public int sVa;
  public int sVb;
  public int sVc;
  public int sVd;
  public byte[] sVe;
  public int sVf;
  public byte[] sVg;
  public byte[] sVh;
  public int sVi;
  public int sVj;
  public int sVk;
  public int sVl;
  public int sVm;
  public ArrayBlockingQueue<byte[]> sVo;
  public long sVp;
  public byte[] sVq;
  public int sVr;
  public int sVs;
  public int sVt;
  public int sVu;
  public int sVv;
  byte[] sVw;
  byte[] sVx;
  byte[] sVy;
  byte[] sVz;
  public int width;

  static
  {
    AppMethodBeat.i(4769);
    com.tencent.mm.compatible.util.k.a("voipMain", v2protocal.class.getClassLoader());
    int i = m.Lw();
    cpuFlag0 = i;
    if ((i & 0x400) != 0);
    for (i = 16000; ; i = 8000)
    {
      VOICE_SAMPLERATE = i;
      VOICE_FRAME_BYTES = i / 1000 * 20 * 2;
      sTV = false;
      sVn = 10;
      sVJ = null;
      sVL = null;
      sVN = null;
      supportedH264HwCodecPrefixes = new String[] { "OMX.qcom.", "OMX.Exynos.", "OMX.hisi" };
      AppMethodBeat.o(4769);
      return;
    }
  }

  public v2protocal(ak paramak)
  {
    AppMethodBeat.i(4752);
    this.fDH = 0L;
    this.defaultWidth = 320;
    this.defaultHeight = 240;
    this.netType = 0;
    this.sTW = 0;
    this.kIm = 0;
    this.nMl = "";
    this.sTX = 0;
    this.sTY = 0;
    this.nwu = 0;
    this.sTZ = 0L;
    this.nwC = 0;
    this.nwv = 0L;
    this.nwx = 0;
    this.sUa = null;
    this.sUb = null;
    this.sUc = null;
    this.sUd = 0;
    this.sUe = null;
    this.channelStrategy = 0;
    this.sUf = 500;
    this.sUg = 30;
    this.sUh = 999;
    this.sUi = 0;
    this.sUj = null;
    this.sUk = 20;
    this.sUl = 0;
    this.sUm = 0;
    this.sUn = 0;
    this.sUo = 0;
    this.sUp = 0;
    this.sUq = 65536;
    this.sUr = 0;
    this.sUs = 0;
    this.sUt = 7;
    this.sUu = 3;
    this.sUv = 3;
    this.sUw = 0;
    this.sUx = 0;
    this.sUy = -1;
    this.sUz = -1;
    this.sUA = 0;
    this.sUB = 0;
    this.sUC = 0;
    this.sUD = 0;
    this.sUE = 100;
    this.sUF = 300;
    this.sUG = 1;
    this.sUH = 1;
    this.sUI = 0;
    this.sUJ = 1;
    this.sUK = 0;
    this.sUL = 0;
    this.sUM = 0;
    this.sUN = 0;
    this.sUO = 0;
    this.sUP = 0;
    this.sUQ = 0;
    this.sUR = 0;
    this.sUS = 0;
    this.sUT = 0;
    this.sUU = null;
    this.field_punchSvrArray = null;
    this.field_relaySvrArray = null;
    this.field_relayTcpSvrArray = null;
    this.field_natSvrArray = null;
    this.field_peerId = null;
    this.field_capInfo = null;
    this.field_ChannelReportDial = null;
    this.field_EngineReportStatFromApp = null;
    this.field_SpeedTestSvrParaArray = null;
    this.field_mGetValidSample = 0;
    this.sUV = 0;
    this.sUW = 0;
    this.sUX = 0;
    this.sUY = 0;
    this.sUZ = null;
    this.sVa = 0;
    this.sVb = 0;
    this.sVc = 0;
    this.sVd = 0;
    this.sVe = new byte[1500];
    this.sVf = 0;
    this.sVg = null;
    this.sVh = null;
    this.sVi = 0;
    this.sVj = 0;
    this.sVk = 0;
    this.sVl = 0;
    this.sVm = 0;
    this.sVo = new ArrayBlockingQueue(sVn);
    this.field_localImgWidth = 0;
    this.field_localImgHeight = 0;
    this.field_statusSyncKey = 0;
    this.field_relayDataSyncKey = 0;
    this.field_connectingStatusKey = 0;
    this.field_HWEncW = 0;
    this.field_HWEncH = 0;
    this.field_sendVideoLen = 100;
    this.field_realLinkQualityInfoBuffLen = 0;
    this.field_remoteImgLength = 0;
    this.field_remoteImgHeight = 0;
    this.field_remoteImgWidth = 0;
    this.field_remoteImgOrien = 0;
    this.field_recvVideoLen = 120;
    this.sVp = 0L;
    this.sVq = new byte[8];
    this.sVr = 0;
    this.sVs = 0;
    this.sVt = 0;
    this.sVu = 0;
    this.sVv = 0;
    this.sVw = new byte[4096];
    this.sVx = new byte[2048];
    this.sVy = new byte[2048];
    this.sVz = new byte[4096];
    this.sVA = new byte[4096];
    this.sVB = new byte[2048];
    this.sVC = new byte[4096];
    this.sVD = new byte[2048];
    this.sVE = new byte[2048];
    this.sVF = new int[30];
    this.field_statInfoLength = 0;
    this.field_speedTestInfoLength = 0;
    this.field_engineVersionStatLength = 0;
    this.field_engineQosStatLength = 0;
    this.field_channelStatLength = 0;
    this.field_channelReportLength = 0;
    this.field_newEngineStatLength = 0;
    this.field_newEngineReportLength = 0;
    this.field_netFlowSent = 0;
    this.field_netFlowRecv = 0;
    this.field_videoDuration = 0;
    this.field_audioDuration = 0;
    this.field_newEngineExtStatLength = 0;
    this.field_engine2ndStatLength = 0;
    this.field_engine2ndReportLength = 0;
    this.field_pstnChannelInfoLength = 0;
    this.field_pstnEngineInfoLength = 0;
    this.field_jbmBitratRsSvrParamArray = null;
    this.field_jbmParamArraySize = 0;
    this.field_jbmBitratRsSvrParamDoubleArray = null;
    this.field_jbmParamDoubleArraySize = 0;
    this.sVG = 0;
    this.sVH = new n();
    this.handler = null;
    this.isInited = false;
    this.sVI = null;
    this.width = 640;
    this.height = 480;
    this.sVK = 8;
    this.bitrate = 300;
    this.sVM = false;
    this.handler = paramak;
    AppMethodBeat.o(4752);
  }

  public static void a(com.tencent.mm.plugin.voip.video.e parame)
  {
    AppMethodBeat.i(4765);
    sVN = new WeakReference(parame);
    AppMethodBeat.o(4765);
  }

  // ERROR //
  @android.annotation.SuppressLint({"NewApi"})
  private static boolean abX(String paramString)
  {
    // Byte code:
    //   0: sipush 4767
    //   3: invokestatic 191	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 579	android/os/Build$VERSION:SDK_INT	I
    //   9: bipush 21
    //   11: if_icmplt +190 -> 201
    //   14: invokestatic 584	android/media/MediaCodecList:getCodecCount	()I
    //   17: istore_1
    //   18: iinc 1 255
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: istore_3
    //   25: iload_1
    //   26: iflt +155 -> 181
    //   29: iload_2
    //   30: istore_3
    //   31: iload_1
    //   32: invokestatic 588	android/media/MediaCodecList:getCodecInfoAt	(I)Landroid/media/MediaCodecInfo;
    //   35: astore 4
    //   37: iload_2
    //   38: istore_3
    //   39: new 590	java/lang/StringBuilder
    //   42: astore 5
    //   44: iload_2
    //   45: istore_3
    //   46: aload 5
    //   48: ldc_w 592
    //   51: invokespecial 595	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   54: iload_2
    //   55: istore_3
    //   56: ldc_w 597
    //   59: aload 5
    //   61: aload 4
    //   63: invokevirtual 603	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   66: invokevirtual 607	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 610	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 616	com/tencent/mm/plugin/voip/a/a:Logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: iload_2
    //   76: istore_3
    //   77: aload 4
    //   79: invokevirtual 620	android/media/MediaCodecInfo:getSupportedTypes	()[Ljava/lang/String;
    //   82: astore 5
    //   84: iload_2
    //   85: istore_3
    //   86: aload 4
    //   88: invokevirtual 603	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   91: astore 4
    //   93: iconst_0
    //   94: istore 6
    //   96: iload_2
    //   97: istore_3
    //   98: iload 6
    //   100: aload 5
    //   102: arraylength
    //   103: if_icmpge +46 -> 149
    //   106: iload_2
    //   107: istore_3
    //   108: aload 5
    //   110: iload 6
    //   112: aaload
    //   113: aload_0
    //   114: invokevirtual 623	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   117: istore 7
    //   119: iload 7
    //   121: ifeq +22 -> 143
    //   124: ldc_w 597
    //   127: ldc_w 625
    //   130: aload 4
    //   132: invokestatic 629	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual 633	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   138: invokestatic 616	com/tencent/mm/plugin/voip/a/a:Logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: iconst_1
    //   142: istore_2
    //   143: iinc 6 1
    //   146: goto -50 -> 96
    //   149: iinc 1 255
    //   152: goto -129 -> 23
    //   155: astore_0
    //   156: iconst_0
    //   157: istore_2
    //   158: ldc_w 597
    //   161: aload_0
    //   162: ldc_w 635
    //   165: iconst_1
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_0
    //   172: invokevirtual 638	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   175: aastore
    //   176: invokestatic 644	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: iload_2
    //   180: istore_3
    //   181: sipush 4767
    //   184: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: iload_3
    //   188: ireturn
    //   189: astore_0
    //   190: iload_3
    //   191: istore_2
    //   192: goto -34 -> 158
    //   195: astore_0
    //   196: iconst_1
    //   197: istore_2
    //   198: goto -40 -> 158
    //   201: iconst_0
    //   202: istore_3
    //   203: goto -22 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   6	18	155	java/lang/Exception
    //   31	37	189	java/lang/Exception
    //   39	44	189	java/lang/Exception
    //   46	54	189	java/lang/Exception
    //   56	75	189	java/lang/Exception
    //   77	84	189	java/lang/Exception
    //   86	93	189	java/lang/Exception
    //   98	106	189	java/lang/Exception
    //   108	119	189	java/lang/Exception
    //   124	141	195	java/lang/Exception
  }

  public static long bt(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4741);
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.nativeOrder());
    long l = paramArrayOfByte.getLong();
    AppMethodBeat.o(4741);
    return l;
  }

  private String cKA()
  {
    long l1 = 0L;
    AppMethodBeat.i(4742);
    if ((this.sUm == 0) && (this.sUn == 0))
    {
      this.sVH.sQv = 0;
      this.sVH.sQD = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
      this.sVH.sQC = this.field_videoDuration;
      this.sVH.sQB = this.field_audioDuration;
      this.sUr = com.tencent.mm.compatible.b.g.KK().Lb();
      if ((this.sVH.sQL <= 0L) || (this.sVH.sQF <= this.sVH.sQL))
        break label1251;
    }
    label1251: for (long l2 = this.sVH.sQF - this.sVH.sQL; ; l2 = 0L)
    {
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "voipreport:acceptcalltime:".concat(String.valueOf(l2)));
      setJNIAppCmd(1, this.sVq, this.sVq.length);
      long l3 = bt(this.sVq);
      Object localObject1 = this.sVH;
      if ((l3 > this.sVH.sQJ) && (this.sVH.sQJ > 0L));
      for (long l4 = l3 - this.sVH.sQJ; ; l4 = 0L)
      {
        ((n)localObject1).sQM = l4;
        localObject1 = this.sVH;
        l4 = l1;
        if (l3 > this.sVH.sQL)
        {
          l4 = l1;
          if (this.sVH.sQL > 0L)
            l4 = l3 - this.sVH.sQL;
        }
        ((n)localObject1).sQN = l4;
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "voipreport:lCallerWaitTime:" + this.sVH.sQM + " lCalledWaitTime:" + this.sVH.sQN);
        int i = cpuFlag0;
        StringBuilder localStringBuilder = new StringBuilder().append(this.sUl).append(",").append(this.nwu).append(",").append(this.nwv).append(",").append(this.nwC).append(",").append(this.sVH.sQe).append(",").append(this.sVH.sQq).append(",").append(this.sVH.sQr).append(",").append(this.sVH.sQs).append(",").append(this.sVH.sQt).append(",").append(this.sVH.sQu).append(",").append(this.sVH.sQv).append(",").append(this.sVH.sQo).append(",").append(this.sVH.sQw).append(",").append(this.sVH.sQx).append(",").append(this.sVH.sQy).append(",").append(this.sVH.sQz).append(",").append(this.sVH.sQA).append(",").append(this.sVH.sQB).append(",").append(this.sVH.sQC).append(",").append(this.sVH.sQD).append(cKD()).append(cKE()).append(cKz()).append(",").append(this.sVH.sQE).append(",").append(this.sUq).append(",").append(this.sUr).append(",").append(l2).append(",").append(this.sVH.sQM).append(",").append(this.sVH.sQN).append(",").append(this.sUs).append(",").append(this.sTX).append(cKB()).append(",").append(i & 0xFF).append(",").append(this.sUy).append(",").append(this.sUz);
        Object localObject2 = Build.VERSION.INCREMENTAL;
        localObject1 = localObject2;
        if (((String)localObject2).contains(","))
          localObject1 = ((String)localObject2).replace(',', ' ');
        String str = Build.DISPLAY;
        localObject2 = str;
        if (str.contains(","))
          localObject2 = str.replace(',', ' ');
        localObject1 = new StringBuilder(",").append((String)localObject1).append(",").append((String)localObject2).toString() + "," + this.sVH.sQG + "," + this.sVH.sQI + "," + this.sVH.sQH + ",0," + this.sVH.sQO + "," + this.sVH.sQP + "," + this.sVH.sQQ + "," + this.sVH.sQR;
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:initNetType:" + this.sTX);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:NewDialStatString:".concat(String.valueOf(localObject1)));
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:getChannelStrategyString:" + cKB());
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "lInterruptStartTime:" + this.sVH.sQP + "lInterruptEndTime:" + this.sVH.sQQ + "mIinterruptCnt:" + this.sVH.sQR);
        AppMethodBeat.o(4742);
        return localObject1;
        if ((this.sUn != 0) && (this.sUm != 0))
        {
          this.sVH.sQv = 3;
          break;
        }
        if (this.sUn != 0)
        {
          this.sVH.sQv = 1;
          break;
        }
        if (this.sUm == 0)
          break;
        this.sVH.sQv = 2;
        break;
      }
    }
  }

  private String cKB()
  {
    AppMethodBeat.i(4743);
    String str = "," + this.channelStrategy;
    AppMethodBeat.o(4743);
    return str;
  }

  private String cKD()
  {
    AppMethodBeat.i(4745);
    com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "usePreConnect:" + this.sUC);
    String str = "," + this.sUC;
    AppMethodBeat.o(4745);
    return str;
  }

  private String cKE()
  {
    AppMethodBeat.i(4746);
    com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "preConnectSuccess:" + this.sUD);
    String str = "," + this.sUD;
    AppMethodBeat.o(4746);
    return str;
  }

  private String cKF()
  {
    AppMethodBeat.i(4747);
    if (Build.VERSION.SDK_INT < 11)
    {
      this.sUu = 0;
      this.sUv = 2;
      if (q.etd.eqg >= 0)
        this.sUu = q.etd.eqg;
      if ((Build.VERSION.SDK_INT >= 11) && (l.IN()) && (2 == q.etn.erV))
        this.sUv = 2;
      if (q.etd.eqh >= 0)
        this.sUv = q.etd.eqh;
      if (Build.VERSION.SDK_INT >= 11)
        break label288;
      this.sUt = 1;
      label104: if (q.etd.epG)
        this.sUt = 1;
      if (q.etd.eqf >= 0)
        this.sUt = q.etd.eqf;
      if (q.etd.epH <= 0)
        break label297;
      this.sUw = 3;
      this.sUx = 0;
    }
    while (true)
    {
      if (q.etd.eqj >= 0)
        this.sUw = q.etd.eqj;
      if (q.etd.eqk >= 0)
        this.sUx = q.etd.eqk;
      String str = "," + this.sUu + "," + this.sUv + "," + this.sUt + "," + this.sUw + "," + this.sUx;
      AppMethodBeat.o(4747);
      return str;
      this.sUu = 3;
      this.sUv = 3;
      break;
      label288: this.sUt = 7;
      break label104;
      label297: if (q.etd.eqi >= 0)
      {
        this.sUw = q.etd.eqi;
        this.sUx = q.etd.eqi;
      }
    }
  }

  private String cKH()
  {
    AppMethodBeat.i(4749);
    getNewEngineInfo(this.sVA, this.sVA.length);
    getNewEngineExtInfo(this.sVB, this.sVB.length);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:oldNewEngineString:".concat(String.valueOf(this.nwC + "," + this.nwv + this.sVH.cJg() + "," + this.sUm + "," + this.sUn + cKC() + new String(this.sVA, 0, this.field_newEngineStatLength) + "," + this.sUo + "," + this.sUp + cKF() + new String(this.sVB, 0, this.field_newEngineExtStatLength))));
    getNewEngineInfoReport(this.sVA, this.sVA.length);
    String str = this.nwC + "," + this.nwv + this.sVH.cJg() + "," + this.sUm + "," + this.sUn + cKC() + new String(this.sVA, 0, this.field_newEngineReportLength);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:yaoyaoguoNewEngineString:".concat(String.valueOf(str)));
    AppMethodBeat.o(4749);
    return str;
  }

  private static int cKL()
  {
    AppMethodBeat.i(4756);
    DhcpInfo localDhcpInfo = ((WifiManager)ah.getContext().getSystemService("wifi")).getDhcpInfo();
    com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "get wifi route ip:".concat(String.valueOf(Formatter.formatIpAddress(localDhcpInfo.gateway))));
    int i = localDhcpInfo.gateway;
    AppMethodBeat.o(4756);
    return i;
  }

  public static boolean cKN()
  {
    boolean bool = true;
    int i;
    if ((cpuFlag0 & 0x400) != 0)
    {
      i = 1;
      int j = cpuFlag0;
      int k = cpuFlag0;
      int m = Build.VERSION.SDK_INT;
      if ((i == 0) || ((j >> 12 & 0xF) < 4) || ((k & 0xFF) < 30) || (m < 23))
        break label66;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label66: bool = false;
    }
  }

  public static String cKO()
  {
    return "";
  }

  private static String cKz()
  {
    AppMethodBeat.i(4740);
    Object localObject1 = Build.MANUFACTURER;
    Object localObject2 = localObject1;
    if (((String)localObject1).contains(","))
      localObject2 = ((String)localObject1).replace(',', ' ');
    Object localObject3 = Build.MODEL;
    localObject1 = localObject3;
    if (((String)localObject3).contains(","))
      localObject1 = ((String)localObject3).replace(',', ' ');
    Object localObject4 = Build.VERSION.SDK;
    localObject3 = localObject4;
    if (((String)localObject4).contains(","))
      localObject3 = ((String)localObject4).replace(',', ' ');
    String str = Build.VERSION.RELEASE;
    localObject4 = str;
    if (str.contains(","))
      localObject4 = ((String)localObject3).replace(',', ' ');
    localObject2 = "," + (String)localObject2 + "," + (String)localObject1 + "," + (String)localObject3 + "," + (String)localObject4;
    AppMethodBeat.o(4740);
    return localObject2;
  }

  public static void fX(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4766);
    com.tencent.mm.plugin.voip.video.e locale;
    int i;
    int j;
    double d;
    int k;
    int m;
    if (sVN != null)
    {
      locale = (com.tencent.mm.plugin.voip.video.e)sVN.get();
      if (locale != null)
      {
        i = locale.mdt.getWidth();
        j = locale.mdt.getHeight();
        d = paramInt2 / paramInt1;
        if ((i != 3) || (j != 3))
        {
          if (j <= (int)(i * d))
            break label265;
          k = (int)(j / d);
          m = j;
        }
      }
    }
    while (true)
    {
      int n = (i - k) / 2;
      int i1 = (j - m) / 2;
      ab.i("DecodeTextureView", "video=" + paramInt1 + "x" + paramInt2 + " view=" + i + "x" + j + " newView=" + k + "x" + m + " off=" + n + "," + i1);
      Matrix localMatrix = new Matrix();
      locale.mdt.getTransform(localMatrix);
      localMatrix.setScale(k / i, m / j);
      localMatrix.postTranslate(n, i1);
      locale.mdt.setTransform(localMatrix);
      AppMethodBeat.o(4766);
      return;
      label265: m = (int)(d * i);
      k = i;
    }
  }

  private native int forceredirect(int paramInt1, int paramInt2);

  private native int setsvraddr(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, int paramInt4);

  private native int uninit(int paramInt1, long paramLong, int paramInt2);

  public native int GetAudioFormat(AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2, AtomicInteger paramAtomicInteger3);

  public native int GetNetBottleneckSide();

  public native int SendDTMF(int paramInt);

  public native int SendRUDP(byte[] paramArrayOfByte, int paramInt);

  public native int SetDTMFPayload(int paramInt);

  public native int StartSpeedTest(long paramLong, int paramInt);

  public native int StopSpeedTest();

  public final int a(a parama)
  {
    AppMethodBeat.i(4768);
    AtomicInteger localAtomicInteger1 = new AtomicInteger();
    AtomicInteger localAtomicInteger2 = new AtomicInteger();
    AtomicInteger localAtomicInteger3 = new AtomicInteger();
    int i = GetAudioFormat(localAtomicInteger1, localAtomicInteger2, localAtomicInteger3);
    if (i == 0)
    {
      parama.channels = localAtomicInteger3.get();
      parama.sNh = localAtomicInteger2.get();
      parama.pug = localAtomicInteger1.get();
      parama.sNg = 0;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "V2Protocal: GetAudioDeviceFmt ret :" + i + ",samplerate = " + parama.pug + ", framelenms =" + parama.sNh + ", channels =" + parama.channels);
      AppMethodBeat.o(4768);
      return i;
    }
    if ((m.Lw() & 0x400) != 0);
    for (int j = 16000; ; j = 8000)
    {
      parama.pug = j;
      parama.channels = 1;
      parama.sNh = 20;
      parama.sNg = 0;
      break;
    }
  }

  public final int a(cok paramcok1, cok paramcok2, cok paramcok3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4755);
    if ((paramcok1 != null) && (paramcok1.xlZ > 0))
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: got relay svr addr from server");
      this.field_relaySvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok1);
      if ((paramcok2 == null) || (paramcok2.xlZ <= 0))
        break label138;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: got punch svr addr from server");
      this.field_punchSvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok2);
      label62: if ((paramcok3 == null) || (paramcok3.xlZ <= 0))
        break label150;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: got relay tcp svr addr from server");
      this.field_relayTcpSvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok3);
    }
    while (true)
    {
      paramInt1 = forceredirect(paramInt1, paramInt2);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal forceRedirect ret :".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(4755);
      return paramInt1;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: [TRANSPORT]No relay svr ip");
      break;
      label138: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: No punch svr ip");
      break label62;
      label150: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "forceRedirect: No relay tcp svr ip");
    }
  }

  public final int a(cok paramcok1, cok paramcok2, cok paramcok3, cpu paramcpu, LinkedList<cps> paramLinkedList)
  {
    AppMethodBeat.i(4757);
    if (paramcok1.xlZ > 0)
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr: got relay svr addr from server");
      this.field_relaySvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok1);
      if (paramcok2.xlZ <= 0)
        break label226;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr: got punch svr addr from server");
      this.field_punchSvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok2);
      label54: if (paramcok3.xlZ <= 0)
        break label238;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr:got tcpsvr addr from server");
      this.field_relayTcpSvrArray = com.tencent.mm.plugin.voip.a.a.a(paramcok3);
      label78: if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
        break label250;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal natSvr.size() :" + paramLinkedList.size());
      this.field_natSvrArray = com.tencent.mm.plugin.voip.a.a.au(paramLinkedList);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal field_natSvrArray :" + this.field_natSvrArray.length);
    }
    while (true)
    {
      int i = setsvraddr(paramcpu.xnK, paramcpu.xnL, paramcpu.xnM, paramcpu.userName, paramcpu.gDC, cKL());
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal setsvraddr ret :".concat(String.valueOf(i)));
      AppMethodBeat.o(4757);
      return i;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr: [TRANSPORT]No relay svr ip");
      break;
      label226: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr: No punch svr ip");
      break label54;
      label238: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setSvrAddr:no tcp svr addr ip");
      break label78;
      label250: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal field_natSvrArray no nat svr list");
    }
  }

  public native int app2EngineDataEx(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4);

  public native int app2EngineLinkQualityEx(int paramInt, byte[] paramArrayOfByte);

  public final int cEb()
  {
    AppMethodBeat.i(4759);
    this.netType = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
    this.sTX = this.netType;
    if (this.netType == 5)
      this.netType = 4;
    boolean bool1;
    boolean bool2;
    label87: boolean bool3;
    label158: boolean bool4;
    label231: boolean bool5;
    label243: int i;
    label255: int j;
    label267: boolean bool6;
    label293: int k;
    label317: boolean bool7;
    label337: boolean bool8;
    if ((this.sTX >= 4) && ((cpuFlag0 & 0x400) != 0) && ((cpuFlag0 & 0xFF) >= 26))
    {
      bool1 = true;
      if ((!bool1) || ((cpuFlag0 & 0xFF) < 30))
        break label830;
      bool2 = true;
      if ((q.etc.erv <= 0) || (q.etc.eqX.width < 480) || (q.etc.eqX.height < 360) || (q.etc.eqZ.width < 480) || (q.etc.eqZ.height < 360))
        break label835;
      bool3 = true;
      if ((q.etc.erv < 2) || (q.etc.eqX.width < 640) || (q.etc.eqX.height < 480) || (q.etc.eqZ.width < 640) || (q.etc.eqZ.height < 480))
        break label840;
      bool4 = true;
      if (q.etc.erv != 0)
        break label846;
      bool5 = true;
      if (q.etc.erw != 0)
        break label852;
      i = 1;
      if (q.etc.erw <= 0)
        break label858;
      j = 1;
      this.sVM = false;
      if (i != 0)
        break label924;
      if ((!bool2) || (!abX("video/avc")))
        break label864;
      bool6 = true;
      if (j == 0)
        break label914;
      if ((!bool2) || ((q.etc.erw & 0x10) == 0))
        break label870;
      k = 1;
      if ((!bool6) || ((q.etc.erw & 0xF) == 0))
        break label876;
      bool7 = true;
      if (!bool7)
        break label882;
      bool8 = true;
      label345: this.sVM = bool8;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "hwH264Local:" + bool6 + ",hwHEVCLocal:false, bSupportH264HW:" + bool7 + ", bSupportHEVCHW:false, svrHWCfg:" + q.etc.erw);
      if (!bool7)
        break label908;
      i = 1;
      label409: if (k == 0)
        break label905;
      i |= 2;
    }
    while (true)
    {
      if (((bool1) || (bool3)) && (!bool5))
      {
        if ((!this.sVM) && (!bool4))
          break label888;
        this.defaultWidth = 640;
      }
      for (this.defaultHeight = 480; ; this.defaultHeight = 360)
      {
        sTV = true;
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "steve:Set Enable 480! " + this.defaultWidth + "x" + this.defaultHeight);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "steve: Android CPUFlag:" + (cpuFlag0 & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool1 + ", bEnable480FromSvr:" + bool3 + ", bDisable480FromSvr:" + bool5 + ", bEnable640FromLocal:" + bool2 + ", bEnable640FromSvr:" + bool4);
        this.sUU = new int[this.defaultWidth * this.defaultHeight];
        com.tencent.mm.kernel.g.RN();
        this.kIm = com.tencent.mm.kernel.a.QF();
        int m = Build.VERSION.SDK_INT;
        j = OpenGlRender.getGLVersion();
        Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
        int n = localDisplay.getWidth();
        int i1 = localDisplay.getHeight();
        n = init(this.netType | i << 8, 2, this.defaultWidth << 16 | this.defaultHeight, n << 16 | i1, this.kIm, cpuFlag0 | (j << 24 | m << 16), com.tencent.mm.compatible.util.e.eSi + "lib/", 0);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "protocal init ret :" + n + ",uin= " + this.kIm + ", gl_vs:" + j + ", cpuFlag0=" + cpuFlag0 + ", hwCap= " + i);
        this.isInited = true;
        if (n < 0)
          reset();
        AppMethodBeat.o(4759);
        return n;
        bool1 = false;
        break;
        label830: bool2 = false;
        break label87;
        label835: bool3 = false;
        break label158;
        label840: bool4 = false;
        break label231;
        label846: bool5 = false;
        break label243;
        label852: i = 0;
        break label255;
        label858: j = 0;
        break label267;
        label864: bool6 = false;
        break label293;
        label870: k = 0;
        break label317;
        label876: bool7 = false;
        break label337;
        label882: bool8 = false;
        break label345;
        label888: this.defaultWidth = 480;
      }
      label905: continue;
      label908: i = 0;
      break label409;
      label914: k = bool2;
      bool7 = bool6;
      break label337;
      label924: i = 0;
    }
  }

  protected final String cKC()
  {
    AppMethodBeat.i(4744);
    String str;
    if (this.field_videoDuration == 0)
    {
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "captureFrames:" + this.sVr + ", videoduration: 0");
      str = ",0";
      AppMethodBeat.o(4744);
    }
    while (true)
    {
      return str;
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "capturefps:" + this.sVr / this.field_videoDuration + " framecount:" + this.sVr + " videoDuration:" + this.field_videoDuration);
      str = "," + this.sVr / this.field_videoDuration;
      AppMethodBeat.o(4744);
    }
  }

  final String cKG()
  {
    AppMethodBeat.i(4748);
    getChannelInfo(this.sVz, this.sVz.length, this.sUV, this.sUW, this.sUX, this.sUY);
    Object localObject = new StringBuilder().append(this.nwv).append(",").append(this.nwu).append(",").append(this.nwC).append(this.sVH.cJg());
    n localn = this.sVH;
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:oldChannelString: ".concat(String.valueOf(new StringBuilder(",").append(localn.sQu).toString() + new String(this.sVz, 0, this.field_channelStatLength))));
    getChannelReport(this.sVz, this.sVz.length);
    localObject = new String(this.sVz, 0, this.field_channelReportLength);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:newChannelString: ".concat(String.valueOf(localObject)));
    AppMethodBeat.o(4748);
    return localObject;
  }

  final String cKI()
  {
    AppMethodBeat.i(4750);
    getEngine2ndInfo(this.sVC, this.sVC.length);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:12805,oldEngine2ndString:".concat(String.valueOf(this.nwv + "," + this.nwu + "," + this.nwC + new String(this.sVC, 0, this.field_engine2ndStatLength))));
    getEngine2ndInfoReport(this.sVC, this.sVC.length);
    String str = this.nwv + "," + this.nwu + "," + this.nwC + new String(this.sVC, 0, this.field_engine2ndReportLength);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:12805,newEngine2ndString:".concat(String.valueOf(str)));
    AppMethodBeat.o(4750);
    return str;
  }

  public final String cKJ()
  {
    AppMethodBeat.i(4751);
    int i = cpuFlag0;
    String str = cKz() + "," + this.sUA + "," + (i & 0xFF) + cKF() + "," + this.sUz;
    AppMethodBeat.o(4751);
    return str;
  }

  public final boolean cKK()
  {
    return this.isInited;
  }

  public final int cKM()
  {
    AppMethodBeat.i(4758);
    this.netType = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
    if (this.netType == 5)
      this.netType = 4;
    this.sUU = new int[this.defaultWidth * this.defaultHeight];
    com.tencent.mm.kernel.g.RN();
    this.kIm = com.tencent.mm.kernel.a.QF();
    int i = m.Lw();
    int j = Build.VERSION.SDK_INT;
    int k = OpenGlRender.getGLVersion();
    Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
    int m = localDisplay.getWidth();
    int n = localDisplay.getHeight();
    j = init(this.netType, 65538, this.defaultWidth << 16 | this.defaultHeight, m << 16 | n, this.kIm, i | (k << 24 | j << 16), com.tencent.mm.compatible.util.e.eSi + "lib/", 4);
    com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "protocal init ret :" + j + ",uin= " + this.kIm);
    this.isInited = true;
    if (j < 0)
      reset();
    AppMethodBeat.o(4758);
    return j;
  }

  public final String cKP()
  {
    AppMethodBeat.i(4761);
    String str = cKA();
    AppMethodBeat.o(4761);
    return str;
  }

  public final String[] cKQ()
  {
    AppMethodBeat.i(4762);
    String[] arrayOfString = getNatReport();
    com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip", "nat_report size:" + arrayOfString.length);
    for (int i = 0; i < arrayOfString.length; i++)
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip", "nat_report:" + arrayOfString[i]);
    AppMethodBeat.o(4762);
    return arrayOfString;
  }

  public final String cKR()
  {
    AppMethodBeat.i(4763);
    String str = cKH();
    AppMethodBeat.o(4763);
    return str;
  }

  public native int connectToPeer();

  public native int connectToPeerDirect();

  public native int connectToPeerRelay();

  public native int doubleLinkSwitch(int paramInt);

  public native int exchangeCabInfo(byte[] paramArrayOfByte, int paramInt);

  public native int freeJNIReport();

  public native int getAVDuration(byte[] paramArrayOfByte, int paramInt);

  public native int getChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public native int getChannelReport(byte[] paramArrayOfByte, int paramInt);

  public native int getCurrentConnType();

  public native int getEngine2ndInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getEngine2ndInfoReport(byte[] paramArrayOfByte, int paramInt);

  public native int getEngineQosInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getEngineVersionInfo(byte[] paramArrayOfByte, int paramInt);

  public native String[] getNatReport();

  public native int getNewEngineExtInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getNewEngineInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getNewEngineInfoReport(byte[] paramArrayOfByte, int paramInt);

  public native int getPstnChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);

  public native int getPstnEngineInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getStatInfo(byte[] paramArrayOfByte, int paramInt1, int[] paramArrayOfInt, int paramInt2);

  public native int getVideoHWDecode(int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt);

  public native int getVoipcsChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public native int getVoipcsEngineInfo(byte[] paramArrayOfByte, int paramInt);

  public native int getcurstrategy();

  public native int handleCommand(byte[] paramArrayOfByte, int paramInt);

  protected native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString, int paramInt7);

  public native int isDCReady();

  public native int isDCSameLan();

  public native int isRelayConnReady();

  public int keep_onNotifyFromJni(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4753);
    if (paramInt1 == 100)
    {
      com.tencent.mm.plugin.voip.a.a.outputJniLog(paramArrayOfByte, "MicroMsg.Voip", paramInt2);
      AppMethodBeat.o(4753);
    }
    while (true)
    {
      return 0;
      if (paramInt1 == 101)
      {
        com.tencent.mm.plugin.voip.a.a.outputJniLog(paramArrayOfByte, "MicroMsg.v2Core", paramInt2);
        AppMethodBeat.o(4753);
      }
      else
      {
        Message localMessage = new Message();
        localMessage.what = 59998;
        localMessage.arg1 = paramInt1;
        localMessage.arg2 = paramInt2;
        localMessage.obj = paramArrayOfByte;
        this.handler.sendMessage(localMessage);
        AppMethodBeat.o(4753);
      }
    }
  }

  public int keep_onNotifyFromJniInt(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4754);
    if (paramArrayOfInt != null)
    {
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.VoipService", "callByJni : arg1:" + paramInt1 + " arg2:" + paramInt2);
      Message localMessage = new Message();
      localMessage.what = 59998;
      localMessage.arg1 = paramInt1;
      localMessage.arg2 = paramInt2;
      localMessage.obj = paramArrayOfInt;
      this.handler.sendMessage(localMessage);
    }
    AppMethodBeat.o(4754);
    return 0;
  }

  public final String mx(boolean paramBoolean)
  {
    AppMethodBeat.i(4760);
    label263: Object localObject1;
    if (this.isInited)
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "call protocalUninit now...needStatInfo=".concat(String.valueOf(paramBoolean)));
      this.field_ChannelReportDial = new int[6];
      this.field_ChannelReportDial[0] = this.sVH.sQo;
      this.field_ChannelReportDial[1] = this.sVH.sQu;
      this.field_ChannelReportDial[2] = this.sUV;
      this.field_ChannelReportDial[3] = this.sUW;
      this.field_ChannelReportDial[4] = this.sUX;
      this.field_ChannelReportDial[5] = this.sUY;
      this.field_EngineReportStatFromApp = new int[14];
      cKF();
      this.field_EngineReportStatFromApp[0] = this.sUo;
      this.field_EngineReportStatFromApp[1] = this.sUp;
      this.field_EngineReportStatFromApp[2] = this.sUu;
      this.field_EngineReportStatFromApp[3] = this.sUv;
      this.field_EngineReportStatFromApp[4] = this.sUt;
      this.field_EngineReportStatFromApp[5] = this.sUw;
      this.field_EngineReportStatFromApp[6] = this.sUx;
      this.field_EngineReportStatFromApp[7] = -1;
      if (this.sVI != null)
      {
        this.field_EngineReportStatFromApp[8] = this.sVI.sOv;
        this.field_EngineReportStatFromApp[9] = this.sVI.sOx;
        this.field_EngineReportStatFromApp[10] = this.sVI.sOo;
        if (sVJ == null)
          break label1095;
        this.field_EngineReportStatFromApp[11] = sVJ.sOk;
        this.field_EngineReportStatFromApp[12] = this.sVl;
        this.field_EngineReportStatFromApp[13] = this.sVm;
        this.isInited = false;
        uninit(this.nwu, this.nwv, this.nwC);
        sTV = false;
        if (this.sVI != null)
        {
          this.sVI.cIv();
          this.sVI = null;
        }
        if (sVJ != null)
        {
          sVJ.interrupt();
          sVJ.cIv();
          sVJ = null;
        }
        sVL = null;
        sVN = null;
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "uninit over.");
        if (!paramBoolean)
          break label1106;
        getStatInfo(this.sVw, this.sVw.length, this.sVF, 30);
        getEngineVersionInfo(this.sVx, this.sVx.length);
        getEngineQosInfo(this.sVy, this.sVy.length);
        localObject1 = new StringBuilder();
        long l = this.kIm;
        if (this.kIm < 0)
          l = this.kIm + 4294967296L;
        Object localObject2 = new StringBuilder().append(l).append(",").append(this.nwv).append(",").append(this.nwu).append(",").append(this.nwC).append(",");
        n localn = this.sVH;
        localObject2 = new StringBuilder().append(localn.sQe).append(",").append(localn.sQf).append(",").append(localn.sQg).append(",").append(localn.sQh).append(",").append(localn.sQi).append(",").append(localn.sQj).append(",").append(localn.sQk).append(",").append(localn.sQl).append(",").append(localn.sQm).append(",").append(localn.sQn).append(",").append(localn.sQo).toString();
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:DailStatString:".concat(String.valueOf(localObject2)));
        localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append(new String(this.sVw, 0, this.field_statInfoLength)).append(cKz()).append(cKB());
        localObject1 = this.sVH;
        localObject1 = ((StringBuilder)localObject2).append("," + ((n)localObject1).sQp).append(new String(this.sVx, 0, this.field_engineVersionStatLength)).append(cKC());
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "cpuCapacity:" + cpuFlag0);
        localObject1 = new StringBuilder(",").append(cpuFlag0).toString() + cKD() + cKE() + new String(this.sVy, 0, this.field_engineQosStatLength);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "statInfoBuffer = " + new String(this.sVw, 0, this.field_statInfoLength));
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "engineVersionInfoBuffer = " + new String(this.sVx, 0, this.field_engineVersionStatLength));
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "engineQosInfoBuffer = " + new String(this.sVy, 0, this.field_engineQosStatLength));
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "voipreport:StatString = ".concat(String.valueOf(localObject1)));
        ao.a.flv.cm(this.field_netFlowRecv, this.field_netFlowSent);
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip", "voip net flow = " + (this.field_netFlowSent + this.field_netFlowRecv));
        AppMethodBeat.o(4760);
      }
    }
    while (true)
    {
      return localObject1;
      this.field_EngineReportStatFromApp[8] = 0;
      this.field_EngineReportStatFromApp[9] = 0;
      this.field_EngineReportStatFromApp[10] = 0;
      break;
      label1095: this.field_EngineReportStatFromApp[11] = 0;
      break label263;
      label1106: localObject1 = "";
      AppMethodBeat.o(4760);
    }
  }

  public native int parseSyncKeyBuff(byte[] paramArrayOfByte, int paramInt);

  public native int playCallback(byte[] paramArrayOfByte, int paramInt);

  public native int recordCallback(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public final void reset()
  {
    AppMethodBeat.i(4764);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal reset!");
    this.field_punchSvrArray = null;
    this.field_relaySvrArray = null;
    this.field_relayTcpSvrArray = null;
    this.field_natSvrArray = null;
    this.field_peerId = null;
    this.field_capInfo = null;
    this.nwu = 0;
    this.sTZ = 0L;
    this.sTY = 0;
    this.nwC = 0;
    this.nwv = 0L;
    this.channelStrategy = 0;
    this.nwx = 0;
    this.fDH = 0L;
    this.sUa = null;
    this.sUb = null;
    this.sUc = null;
    this.sUd = 0;
    this.sUe = null;
    this.sUY = 0;
    this.sUZ = null;
    this.sVa = 0;
    this.sVb = 0;
    this.sUj = null;
    this.sVg = null;
    this.sVh = null;
    this.sVr = 0;
    this.sVs = 0;
    this.sVt = 0;
    this.sVu = 0;
    this.sVv = 0;
    this.field_videoDuration = 0;
    this.field_audioDuration = 0;
    this.sVG = 0;
    this.sUD = 0;
    this.sUC = 0;
    this.field_engineVersionStatLength = 0;
    this.field_engineQosStatLength = 0;
    this.field_statusSyncKey = 0;
    this.field_relayDataSyncKey = 0;
    this.field_connectingStatusKey = 0;
    this.sUo = 0;
    this.sUp = 0;
    this.sUq = 65536;
    this.sUr = 0;
    this.sUs = 0;
    this.sUz = -1;
    this.sUA = 0;
    this.sVk = 0;
    this.sTW = 0;
    this.nMl = "";
    this.sVi = 0;
    this.sVj = 0;
    this.sVH.reset();
    this.sVH.cJf();
    sTV = false;
    this.field_jbmBitratRsSvrParamArray = null;
    this.field_jbmParamArraySize = 0;
    this.field_jbmBitratRsSvrParamDoubleArray = null;
    this.field_jbmParamDoubleArraySize = 0;
    int i = freeJNIReport();
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "freeJNIReport : " + i + ". [0: null, no need to free, 1: free success!]");
    AppMethodBeat.o(4764);
  }

  public native int setActive();

  public final int setAppCmd(int paramInt)
  {
    AppMethodBeat.i(4739);
    paramInt = setAppCmd(paramInt, new byte[] { 0 }, 1);
    if (paramInt < 0)
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "setAppCmd: type:" + paramInt + ":ret:" + paramInt);
    AppMethodBeat.o(4739);
    return paramInt;
  }

  public native int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);

  public native int setConfigInfo(int paramInt1, long paramLong1, int paramInt2, long paramLong2, byte[] paramArrayOfByte1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte2, int paramInt8, int paramInt9, int paramInt10, int paramInt11, byte[] paramArrayOfByte3, int paramInt12, int paramInt13, int paramInt14, byte[] paramArrayOfByte4, int paramInt15);

  public native int setInactive();

  public native int setJNIAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);

  public native int setNetSignalValue(int paramInt1, int paramInt2);

  public native int setSvrConfig(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);

  public native int setjbmbitraterssvrparam();

  public native int startEngine();

  public native int videoDecode(int[] paramArrayOfInt);

  public native int videoEncodeToLocal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt);

  public native int videoEncodeToSend(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public native int videoHWDecode(byte[] paramArrayOfByte);

  public native int videoHWProcess(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte2);

  public native int videoRorate90D(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte2, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.v2protocal
 * JD-Core Version:    0.6.2
 */