package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.h.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static int[] qGV = { 50, 66, 68, 88, 99, 121, 123, 166, 168, 188, 199, 233, 266, 268, 288, 299, 369, 419, 520, 666, 1024 };
  private static String qGp;
  private static g qGq = null;
  public long fKn;
  public long jCF;
  private StringBuffer jvt;
  public String qGA;
  public String qGB;
  public String qGC;
  public String qGD;
  public String qGE;
  public String qGF;
  public String qGG;
  public String qGH;
  public String qGI;
  public String qGJ;
  public String qGK;
  public String qGL;
  public String qGM;
  public String qGN;
  public String qGO;
  public String qGP;
  public String qGQ;
  public int qGR;
  public String qGS;
  private List<List<Integer>> qGT;
  private List<Integer> qGU;
  private LinkedList<c> qGW;
  public String qGn;
  public String qGr;
  public int qGs;
  public int qGt;
  public long qGu;
  public long qGv;
  public String qGw;
  public long qGx;
  public long qGy;
  public String qGz;

  static
  {
    qGp = "";
  }

  public g()
  {
    AppMethodBeat.i(35883);
    this.fKn = 0L;
    this.jCF = 0L;
    this.qGr = "";
    this.qGs = 0;
    this.qGt = 0;
    this.qGn = "";
    this.qGu = 0L;
    this.qGv = 0L;
    this.qGw = "";
    this.qGx = 0L;
    this.qGy = 0L;
    this.qGz = "";
    this.qGA = "";
    this.qGB = "";
    this.qGC = "";
    this.qGD = "";
    this.qGE = "";
    this.qGF = "";
    this.qGG = "";
    this.qGH = "";
    this.qGI = "";
    this.qGJ = "";
    this.qGK = "";
    this.qGL = "";
    this.qGM = "";
    this.qGN = "";
    this.qGO = "";
    this.qGP = "";
    this.qGQ = "";
    this.qGR = -1;
    this.qGS = "";
    this.qGT = new LinkedList();
    this.qGU = new LinkedList();
    this.qGW = new LinkedList();
    this.jvt = new StringBuffer();
    AppMethodBeat.o(35883);
  }

  public static g cmv()
  {
    AppMethodBeat.i(35884);
    com.tencent.mm.kernel.g.RQ();
    Object localObject1;
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      localObject1 = new g();
      AppMethodBeat.o(35884);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = com.tencent.mm.model.c.c.abi().ll("100068");
      Object localObject3 = ((com.tencent.mm.storage.c)localObject2).field_rawXML;
      localObject1 = localObject3;
      if (bo.isNullOrNil((String)localObject3))
        localObject1 = "";
      String str = com.tencent.mm.a.g.x(((String)localObject1).getBytes());
      if ((qGq == null) || (!str.equals(qGp)))
      {
        ab.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
        qGq = new g();
      }
      try
      {
        localObject3 = ((com.tencent.mm.storage.c)localObject2).dru();
        localObject1 = "";
        if (localObject3 != null)
          localObject1 = (String)((Map)localObject3).get("SnsHBConfig");
        localObject3 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject3 = "";
        localObject1 = URLDecoder.decode((String)localObject3, "UTF-8");
        localObject3 = qGq;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        ((g)localObject3).jvt = ((StringBuffer)localObject2);
        ((g)localObject3).qGW.clear();
        localObject2 = br.z((String)localObject1, "sysmsg");
        if (localObject2 == null)
          ab.i("MicroMsg.NewYearSnsCtrlV2", "errr for paser %s", new Object[] { localObject1 });
        while (true)
        {
          qGp = str;
          localObject1 = qGq;
          AppMethodBeat.o(35884);
          break;
          ((g)localObject3).fKn = bo.anl((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BeginTime"));
          localObject1 = ((g)localObject3).jvt;
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("BeginTime:");
          ((StringBuffer)localObject1).append(((g)localObject3).fKn + ";");
          ((g)localObject3).jCF = bo.anl((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EndTime"));
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("EndTime:");
          ((StringBuffer)localObject4).append(((g)localObject3).jCF + ";\n");
          ((g)localObject3).qGs = bo.ank((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMin"));
          ((g)localObject3).qGt = bo.ank((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMax"));
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("SvrDownReqLimitLevelMin:");
          ((StringBuffer)localObject4).append(((g)localObject3).qGs + " SvrDownReqLimitLevelMax: " + ((g)localObject3).qGt + ";\n");
          ((g)localObject3).qGx = bo.anl((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseBeginTime"));
          ((g)localObject3).qGy = bo.anl((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseEndTime"));
          ((g)localObject3).qGz = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenTitle"), "");
          ((g)localObject3).qGA = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenDescription"), "");
          ((g)localObject3).qGB = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenQueryTips"), "");
          ((g)localObject3).qGC = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenAcceptButtonText"), "");
          ((g)localObject3).qGD = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenRejectButtonText"), "");
          ((g)localObject3).qGE = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenTips"), "");
          ((g)localObject3).qGG = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenSuccTips"), "");
          ((g)localObject3).qGH = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenFailTips"), "");
          ((g)localObject3).qGF = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseTips"), "");
          ((g)localObject3).qGI = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseSuccTips"), "");
          ((g)localObject3).qGJ = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseFailTips"), "");
          ((g)localObject3).qGQ = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedID"), "");
          ((g)localObject3).qGR = bo.ank((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedCount"));
          ((g)localObject3).qGS = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenID"), "");
          if (((g)localObject3).qGR <= 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("svr MaxPostFeedCount error ");
            ab.i("MicroMsg.NewYearSnsCtrlV2", ((g)localObject3).qGR);
            ((g)localObject3).qGR = 1;
          }
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("FullScreenID:");
          ((StringBuffer)localObject4).append(((g)localObject3).qGS + " BrowseBeginTime:" + ((g)localObject3).qGx + " BrowseEndTime:" + ((g)localObject3).qGy + " FullScreenTitle:" + ((g)localObject3).qGz + " FullScreenDescription:" + ((g)localObject3).qGA + " FullScreenQueryTips:" + ((g)localObject3).qGB + " FullScreenAcceptButtonText: " + ((g)localObject3).qGC);
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("FullScreenRejectButtonText:");
          ((StringBuffer)localObject4).append(((g)localObject3).qGD + " ActionSheetOpenTips:" + ((g)localObject3).qGE + " ActionSheetOpenSuccTips:" + ((g)localObject3).qGG + " ActionSheetOpenFailTips:" + ((g)localObject3).qGH + " ActionSheetCloseTips:" + ((g)localObject3).qGF + " ActionSheetCloseSuccTips: " + ((g)localObject3).qGI + " ActionSheetCloseFailTips: " + ((g)localObject3).qGJ + "MaxPostFeedID: " + ((g)localObject3).qGQ + " MaxPostFeedCount:" + ((g)localObject3).qGR);
          ((g)localObject3).qGK = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForHasUsed"), "");
          ((g)localObject3).qGL = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForObtainUsedRight"), "");
          ((g)localObject3).qGM = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForClosedBrowseSwitch"), "");
          ((g)localObject3).qGN = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertButtonText"), "");
          ((g)localObject3).qGO = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTip"), "");
          ((g)localObject3).qGP = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTipID"), "");
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("AlertTipForHasUsed:");
          ((StringBuffer)localObject4).append(((g)localObject3).qGK + " AlertTipForObtainUsedRight:" + ((g)localObject3).qGL + " AlertTipForClosedBrowseSwitch:" + ((g)localObject3).qGM + " AlertButtonText:" + ((g)localObject3).qGN + " GoldenCameraTip:" + ((g)localObject3).qGO + " GoldenCameraTipID:" + ((g)localObject3).qGP);
          int i = 0;
          if (i == 0)
          {
            localObject1 = "";
            label1275: ((g)localObject3).qGn = bo.bc((String)((Map)localObject2).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "RedPointID" })), "");
            localObject1 = ((g)localObject3).jvt;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("RedPointID:");
            ((StringBuffer)localObject1).append(((g)localObject3).qGn + ";");
            if (bo.isNullOrNil(((g)localObject3).qGn))
              break label1607;
            if (i != 0)
              break label1589;
            localObject1 = "";
            label1372: ((g)localObject3).qGu = bo.anl((String)((Map)localObject2).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "BeginTime" })));
            localObject1 = ((g)localObject3).jvt;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("RedPointID_BeginTime:");
            ((StringBuffer)localObject1).append(((g)localObject3).qGu + ";");
            if (i != 0)
              break label1598;
          }
          label1589: label1598: for (localObject1 = ""; ; localObject1 = String.valueOf(i))
          {
            ((g)localObject3).qGv = bo.anl((String)((Map)localObject2).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "EndTime" })));
            localObject4 = ((g)localObject3).jvt;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("RedPointID_EndTime:");
            ((StringBuffer)localObject4).append(((g)localObject3).qGv + ";\n");
            localObject1 = new com/tencent/mm/plugin/sns/lucky/a/c;
            ((c)localObject1).<init>();
            ((c)localObject1).qGn = ((g)localObject3).qGn;
            ((c)localObject1).fKn = ((g)localObject3).qGu;
            ((c)localObject1).jCF = ((g)localObject3).qGv;
            ((g)localObject3).qGW.add(localObject1);
            i++;
            break;
            localObject1 = String.valueOf(i);
            break label1275;
            localObject1 = String.valueOf(i);
            break label1372;
          }
          label1607: ((g)localObject3).qGw = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.PostTips"), "");
          localObject4 = ((g)localObject3).jvt;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("PostTips:");
          ((StringBuffer)localObject4).append(((g)localObject3).qGw + ";");
          ((g)localObject3).qGr = bo.bc((String)((Map)localObject2).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EntranceTips"), "");
          localObject1 = ((g)localObject3).jvt;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("EntranceTips:");
          ((StringBuffer)localObject1).append(((g)localObject3).qGr + ";");
          ((g)localObject3).qGT.clear();
          for (i = 0; ; i++)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>(".sysmsg.NewYearSNSCtrl2016.AmountLevel");
            int j = bo.ank((String)((Map)localObject2).get(i + ".Count"));
            localObject4 = ((g)localObject3).jvt;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("count: ");
            ((StringBuffer)localObject4).append(i + " | " + j + ";\n");
            if (j == 0)
              break;
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
            int k = 0;
            if (k < j)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>(".sysmsg.NewYearSNSCtrl2016.AmountLevel");
              Object localObject5 = ((StringBuilder)localObject1).append(i).append(".Amount");
              if (k == 0);
              for (localObject1 = ""; ; localObject1 = Integer.valueOf(k))
              {
                int m = bo.ank((String)((Map)localObject2).get(localObject1));
                ((List)localObject4).add(Integer.valueOf(m));
                localObject5 = ((g)localObject3).jvt;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("AmountLevel : ");
                ((StringBuffer)localObject5).append(i + " index " + k + " val: " + m + ";");
                k++;
                break;
              }
            }
            ((g)localObject3).qGT.add(localObject4);
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("dumpinfo ");
          ab.i("MicroMsg.NewYearSnsCtrlV2", ((g)localObject3).jvt.toString());
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + localException.getMessage());
      }
    }
  }

  public static boolean cmw()
  {
    AppMethodBeat.i(35885);
    com.tencent.mm.kernel.g.RQ();
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xMU, Boolean.TRUE)).booleanValue();
    AppMethodBeat.o(35885);
    return bool;
  }

  public final void cmx()
  {
    AppMethodBeat.i(35886);
    Object localObject1 = k.h(ac.a.xMY);
    if ((((i)localObject1).qQs == null) || (bo.isNullOrNil(((i)localObject1).qQs.postId)))
    {
      ((i)localObject1).qQs = new com.tencent.mm.plugin.sns.h.g();
      ((i)localObject1).qQs.postId = this.qGQ;
      ((i)localObject1).qQs.qQq = 0;
    }
    Object localObject2;
    if ((!bo.isNullOrNil(((i)localObject1).qQs.postId)) && (((i)localObject1).qQs.postId.equals(this.qGQ)))
    {
      localObject2 = ((i)localObject1).qQs;
      ((com.tencent.mm.plugin.sns.h.g)localObject2).qQq -= 1;
      if (((i)localObject1).qQs.qQq < 0)
        ((i)localObject1).qQs.qQq = 0;
    }
    while (true)
    {
      ab.i("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 " + ((i)localObject1).qQs.qQq + " postId: " + this.qGQ + " " + bo.dpG().toString());
      try
      {
        com.tencent.mm.kernel.g.RQ();
        z localz = com.tencent.mm.kernel.g.RP().Ry();
        localObject2 = ac.a.xMY;
        String str = new java/lang/String;
        str.<init>(((i)localObject1).toByteArray(), Charset.forName("ISO-8859-1"));
        localz.set((ac.a)localObject2, str);
        localObject1 = new qy();
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
        AppMethodBeat.o(35886);
        return;
        ((i)localObject1).qQs = new com.tencent.mm.plugin.sns.h.g();
        ((i)localObject1).qQs.postId = this.qGQ;
        ((i)localObject1).qQs.qQq = 0;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.w("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 save exception:" + localIOException.getLocalizedMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.g
 * JD-Core Version:    0.6.2
 */