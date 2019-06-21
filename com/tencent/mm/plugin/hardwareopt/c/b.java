package com.tencent.mm.plugin.hardwareopt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.abx;
import com.tencent.mm.protocal.protobuf.acu;
import com.tencent.mm.protocal.protobuf.asz;
import com.tencent.mm.protocal.protobuf.bba;
import com.tencent.mm.protocal.protobuf.bbg;
import com.tencent.mm.protocal.protobuf.buk;
import com.tencent.mm.protocal.protobuf.cdp;
import com.tencent.mm.protocal.protobuf.hj;
import com.tencent.mm.protocal.protobuf.na;
import com.tencent.mm.protocal.protobuf.td;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.vending.c.a<Boolean, asz>
{
  private boolean nqs = false;

  public b(boolean paramBoolean)
  {
    this.nqs = paramBoolean;
  }

  private Boolean a(asz paramasz)
  {
    AppMethodBeat.i(59280);
    if (!g.RN().QY())
    {
      ab.e("MicroMsg.TaskReportHardwareInfo", "Account not init, just return");
      paramasz = Boolean.FALSE;
      AppMethodBeat.o(59280);
    }
    long l2;
    while (true)
    {
      return paramasz;
      long l1 = ((Long)g.RP().Ry().get(ac.a.xTc, Long.valueOf(-1L))).longValue();
      l2 = System.currentTimeMillis();
      ab.i("MicroMsg.TaskReportHardwareInfo", "hy: last ticks: %d, current ticks: %d, interval: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1) });
      if ((!this.nqs) && (l2 - l1 < 86400000L))
      {
        ab.d("MicroMsg.TaskReportHardwareInfo", "hy: should not upload. too small interval");
        paramasz = Boolean.FALSE;
        AppMethodBeat.o(59280);
      }
      else if ((!this.nqs) && ((paramasz == null) || (paramasz.wwG == null)))
      {
        ab.w("MicroMsg.TaskReportHardwareInfo", "hy: error when finding hardware");
        h.pYm.a(661L, 1L, 1L, false);
        paramasz = Boolean.FALSE;
        AppMethodBeat.o(59280);
      }
      else
      {
        if ((this.nqs) || (!bo.isNullOrNil(paramasz.wwG.imei)))
          break;
        ab.w("MicroMsg.TaskReportHardwareInfo", "hy: no imei detected. maybe not grant permission. ignore");
        h.pYm.a(661L, 2L, 1L, false);
        paramasz = Boolean.FALSE;
        AppMethodBeat.o(59280);
      }
    }
    ab.i("MicroMsg.TaskReportHardwareInfo", "hy: found hardware infos. start report");
    h localh = h.pYm;
    String str1 = paramasz.wwG.imei;
    String str2 = paramasz.wwG.vJX;
    String str3 = paramasz.wwG.vJY;
    String str4 = paramasz.wwG.vJZ;
    String str5 = paramasz.wwH.vRD;
    String str6 = paramasz.wwH.vRB;
    String str7 = paramasz.wwH.vJY;
    String str8 = paramasz.wwH.vRE;
    int i = paramasz.wwH.vRC;
    int j = paramasz.wwI.wFN;
    int k = paramasz.wwI.wFO;
    int m = paramasz.wwJ.xdo;
    int n;
    label370: int i1;
    label383: int i2;
    label396: String str9;
    int i3;
    String str10;
    int i4;
    label436: int i5;
    label449: int i6;
    label462: int i7;
    label475: int i8;
    label488: int i9;
    label501: int i10;
    label514: int i11;
    label527: int i12;
    label540: int i13;
    label553: int i14;
    label566: int i15;
    label579: int i16;
    label592: int i17;
    label605: int i18;
    label618: int i19;
    label631: int i20;
    label644: int i21;
    label657: int i22;
    int i23;
    String str11;
    String str12;
    if (paramasz.wwJ.xdp)
    {
      n = 1;
      if (!paramasz.wwN.wkx)
        break label1096;
      i1 = 1;
      if (!paramasz.wwN.wky)
        break label1102;
      i2 = 1;
      str9 = paramasz.wwK.wWb;
      i3 = paramasz.wwK.density;
      str10 = paramasz.wwL.wav;
      if (!paramasz.wwM.wjw)
        break label1108;
      i4 = 1;
      if (!paramasz.wwM.wjx)
        break label1114;
      i5 = 1;
      if (!paramasz.wwM.wjy)
        break label1120;
      i6 = 1;
      if (!paramasz.wwM.wjz)
        break label1126;
      i7 = 1;
      if (!paramasz.wwM.wjA)
        break label1132;
      i8 = 1;
      if (!paramasz.wwM.wjB)
        break label1138;
      i9 = 1;
      if (!paramasz.wwM.wjC)
        break label1144;
      i10 = 1;
      if (!paramasz.wwM.wjN)
        break label1150;
      i11 = 1;
      if (!paramasz.wwM.wjD)
        break label1156;
      i12 = 1;
      if (!paramasz.wwM.wjE)
        break label1162;
      i13 = 1;
      if (!paramasz.wwM.wjF)
        break label1168;
      i14 = 1;
      if (!paramasz.wwM.wjG)
        break label1174;
      i15 = 1;
      if (!paramasz.wwM.wjH)
        break label1180;
      i16 = 1;
      if (!paramasz.wwM.wjI)
        break label1186;
      i17 = 1;
      if (!paramasz.wwM.wjJ)
        break label1192;
      i18 = 1;
      if (!paramasz.wwM.wjK)
        break label1198;
      i19 = 1;
      if (!paramasz.wwM.wjL)
        break label1204;
      i20 = 1;
      if (!paramasz.wwM.wjM)
        break label1210;
      i21 = 1;
      i22 = paramasz.wwI.ggb;
      i23 = paramasz.wwI.wFP;
      str11 = paramasz.wwL.waw;
      str12 = ad(paramasz.wwL.wax);
      if (!paramasz.wwN.wkz)
        break label1216;
    }
    label1156: label1162: label1168: label1174: label1180: label1186: label1192: label1198: label1204: label1210: label1216: for (int i24 = 1; ; i24 = 0)
    {
      localh.e(14552, new Object[] { str1, str2, str3, str4, str5, str6, str7, str8, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), str9, Integer.valueOf(i3), str10, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23), str11, str12, Integer.valueOf(i24) });
      g.RP().Ry().set(ac.a.xTc, Long.valueOf(l2));
      h.pYm.a(661L, 0L, 1L, false);
      paramasz = Boolean.TRUE;
      AppMethodBeat.o(59280);
      break;
      n = 0;
      break label370;
      label1096: i1 = 0;
      break label383;
      label1102: i2 = 0;
      break label396;
      label1108: i4 = 0;
      break label436;
      label1114: i5 = 0;
      break label449;
      label1120: i6 = 0;
      break label462;
      label1126: i7 = 0;
      break label475;
      label1132: i8 = 0;
      break label488;
      label1138: i9 = 0;
      break label501;
      label1144: i10 = 0;
      break label514;
      label1150: i11 = 0;
      break label527;
      i12 = 0;
      break label540;
      i13 = 0;
      break label553;
      i14 = 0;
      break label566;
      i15 = 0;
      break label579;
      i16 = 0;
      break label592;
      i17 = 0;
      break label605;
      i18 = 0;
      break label618;
      i19 = 0;
      break label631;
      i20 = 0;
      break label644;
      i21 = 0;
      break label657;
    }
  }

  private static String ad(LinkedList<bbg> paramLinkedList)
  {
    AppMethodBeat.i(59281);
    JSONArray localJSONArray1 = new JSONArray();
    JSONArray localJSONArray2;
    if (paramLinkedList != null)
      try
      {
        Iterator localIterator = paramLinkedList.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            Object localObject = (bbg)localIterator.next();
            if ((localObject != null) && (!bo.isNullOrNil(((bbg)localObject).clY)))
            {
              paramLinkedList = new org/json/JSONObject;
              paramLinkedList.<init>();
              paramLinkedList.put("mimeName", ((bbg)localObject).clY);
              localJSONArray2 = new org/json/JSONArray;
              localJSONArray2.<init>();
              if (((bbg)localObject).wFX != null)
              {
                localObject = ((bbg)localObject).wFX.iterator();
                while (((Iterator)localObject).hasNext())
                  localJSONArray2.put((String)((Iterator)localObject).next());
              }
            }
          }
      }
      catch (Exception paramLinkedList)
      {
        ab.printErrStackTrace("MicroMsg.TaskReportHardwareInfo", paramLinkedList, "hy: error when build up json", new Object[0]);
        paramLinkedList = "";
        AppMethodBeat.o(59281);
      }
    while (true)
    {
      return paramLinkedList;
      paramLinkedList.put("codecName", localJSONArray2);
      localJSONArray1.put(paramLinkedList);
      break;
      paramLinkedList = localJSONArray1.toString();
      AppMethodBeat.o(59281);
      continue;
      ab.w("MicroMsg.TaskReportHardwareInfo", "hy: no mime info retrieved!");
      paramLinkedList = "";
      AppMethodBeat.o(59281);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardwareopt.c.b
 * JD-Core Version:    0.6.2
 */