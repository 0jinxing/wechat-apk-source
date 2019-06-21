package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.protocal.protobuf.boy;
import com.tencent.mm.protocal.protobuf.boz;
import com.tencent.mm.protocal.protobuf.bpa;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.protocal.protobuf.bpd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarManager;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "delegate", "Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarDelegate;", "context", "Landroid/content/Context;", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarDelegate;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "delayRadarRemove", "com/tencent/mm/plugin/radar/model/RadarManager$delayRadarRemove$1", "Lcom/tencent/mm/plugin/radar/model/RadarManager$delayRadarRemove$1;", "delayRadarSearch", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "encodeUserNameMap", "", "", "getEncodeUserNameMap", "()Ljava/util/Map;", "setEncodeUserNameMap", "(Ljava/util/Map;)V", "isCancel", "", "lastStateTable", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "getLastStateTable", "setLastStateTable", "location", "Lcom/tencent/mm/pluginsdk/model/lbs/Location;", "locationGeo", "Lcom/tencent/mm/modelgeo/LocationGeo;", "mOnLocationGet", "Lcom/tencent/mm/modelgeo/IGetLocation$IOnLocationGet;", "members", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "radarMemberList", "Lcom/tencent/mm/protocal/protobuf/RadarMember;", "getRadarMemberList", "()Ljava/util/LinkedList;", "setRadarMemberList", "(Ljava/util/LinkedList;)V", "sceneRadarRelationChain", "Lcom/tencent/mm/plugin/radar/model/NetSceneRadarRelationChain;", "sceneRadarSearch", "Lcom/tencent/mm/plugin/radar/model/NetSceneRadarSearch;", "selectedStatusMap", "Lcom/tencent/mm/plugin/radar/model/RadarManager$ChooseStatus;", "getSelectedStatusMap", "setSelectedStatusMap", "stateTable", "getStateTable", "setStateTable", "status", "Lcom/tencent/mm/plugin/radar/model/RadarManager$Status;", "tempLatestChangeStatTable", "", "Lcom/tencent/mm/plugin/radar/model/RadarManager$LatestChangeStat;", "getTempLatestChangeStatTable", "setTempLatestChangeStatTable", "ticket", "doRadarRelationChain", "", "memList", "Lcom/tencent/mm/protocal/protobuf/RadarChatRoomMember;", "getChooseStatus", "member", "getState", "old", "username", "getStateImpl", "onCreate", "onDestroy", "onLocationGot", "isOk", "onPause", "onRadarMemberReturn", "errType", "", "errCode", "radarMembers", "count", "onRadarRelationChainReturn", "onResume", "onSceneEnd", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "putState", "state", "radarRemove", "reset", "saveLastState", "name", "setChooseStatus", "startRadarSearch", "stop", "stopRadarSearch", "syncStateToLastState", "ChooseStatus", "Companion", "LatestChangeStat", "RadarDelegate", "RadarStatus", "Status", "plugin-radar_release"})
public final class e
  implements f
{
  private static final String TAG = "MicroMsg.Radar.RadarManager";
  private static final int pBD = 3000;
  private static final int pBE = 5000;
  private static final int pBF = 1;
  public static final e.b pBG;
  private final Context context;
  private String cxb;
  private boolean eVT;
  public final b.a ecy;
  private final LinkedList<bpb> fLl;
  public d fwu;
  private final ap pBA;
  private final e.g pBB;
  private final e.d pBC;
  private Location pBr;
  private b pBs;
  private e.f pBt;
  public LinkedList<boz> pBu;
  public Map<String, String> pBv;
  private Map<String, c.e> pBw;
  private Map<String, c.e> pBx;
  public Map<Long, e.c> pBy;
  public Map<String, e.a> pBz;

  static
  {
    AppMethodBeat.i(102937);
    pBG = new e.b((byte)0);
    TAG = "MicroMsg.Radar.RadarManager";
    pBD = 3000;
    pBE = 5000;
    pBF = 1;
    AppMethodBeat.o(102937);
  }

  public e(e.d paramd, Context paramContext)
  {
    AppMethodBeat.i(102936);
    this.pBC = paramd;
    this.context = paramContext;
    this.pBt = e.f.pBS;
    this.fLl = new LinkedList();
    this.pBv = ((Map)new LinkedHashMap());
    this.pBw = ((Map)new LinkedHashMap());
    this.pBx = ((Map)new LinkedHashMap());
    this.pBy = ((Map)new LinkedHashMap());
    this.pBz = ((Map)new LinkedHashMap());
    this.pBA = new ap((ap.a)new e.h(this), false);
    this.pBB = new e.g();
    this.ecy = ((b.a)new e.i(this));
    AppMethodBeat.o(102936);
  }

  private final void a(int paramInt1, int paramInt2, LinkedList<bpb> paramLinkedList)
  {
    AppMethodBeat.i(102926);
    this.pBC.a(paramInt1, paramInt2, paramLinkedList);
    AppMethodBeat.o(102926);
  }

  private final void b(int paramInt1, int paramInt2, LinkedList<boy> paramLinkedList)
  {
    AppMethodBeat.i(102927);
    this.pBC.b(paramInt1, paramInt2, paramLinkedList);
    AppMethodBeat.o(102927);
  }

  private final c.e bb(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(102934);
    if (paramBoolean)
    {
      paramString = (c.e)this.pBx.get(paramString);
      AppMethodBeat.o(102934);
    }
    while (true)
    {
      return paramString;
      paramString = (c.e)this.pBw.get(paramString);
      AppMethodBeat.o(102934);
    }
  }

  private final void cdC()
  {
    AppMethodBeat.i(102923);
    this.pBB.sendEmptyMessageDelayed(pBF, pBE);
    AppMethodBeat.o(102923);
  }

  public final c.e Vy(String paramString)
  {
    AppMethodBeat.i(102933);
    j.p(paramString, "username");
    paramString = bb(paramString, false);
    AppMethodBeat.o(102933);
    return paramString;
  }

  public final c.e a(bpb parambpb, boolean paramBoolean)
  {
    AppMethodBeat.i(102931);
    j.p(parambpb, "member");
    Object localObject = parambpb.jBB;
    j.o(localObject, "member.UserName");
    c.e locale = bb((String)localObject, paramBoolean);
    localObject = locale;
    if (locale == null)
    {
      parambpb = parambpb.wfK;
      j.o(parambpb, "member.EncodeUserName");
      localObject = bb(parambpb, paramBoolean);
    }
    AppMethodBeat.o(102931);
    return localObject;
  }

  public final void a(bpb parambpb)
  {
    AppMethodBeat.i(102935);
    if (parambpb != null)
    {
      com.tencent.mm.plugin.radar.ui.g localg = com.tencent.mm.plugin.radar.ui.g.pDK;
      parambpb = com.tencent.mm.plugin.radar.ui.g.b(parambpb);
      if (this.pBz.containsKey(parambpb))
      {
        this.pBz.remove(parambpb);
        AppMethodBeat.o(102935);
      }
    }
    while (true)
    {
      return;
      this.pBz.put(parambpb, e.a.pBH);
      AppMethodBeat.o(102935);
    }
  }

  public final void a(String paramString, c.e parame)
  {
    AppMethodBeat.i(102929);
    c.e locale = (c.e)this.pBw.get(paramString);
    if ((locale != null) && (locale != parame))
      this.pBx.put(paramString, locale);
    AppMethodBeat.o(102929);
  }

  public final void b(String paramString, c.e parame)
  {
    AppMethodBeat.i(102930);
    j.p(paramString, "username");
    j.p(parame, "state");
    if (!a.k.m.ar((CharSequence)paramString))
    {
      a(paramString, parame);
      this.pBw.put(paramString, parame);
    }
    AppMethodBeat.o(102930);
  }

  public final void cdA()
  {
    AppMethodBeat.i(102921);
    cdB();
    this.eVT = false;
    this.pBr = null;
    this.pBt = e.f.pBS;
    this.pBA.stopTimer();
    ab.d(TAG, "start radar");
    if (this.fwu == null)
      this.fwu = d.agz();
    this.pBt = e.f.pBT;
    d locald = this.fwu;
    if (locald != null)
      locald.b(this.ecy);
    ab.d(TAG, "status: %s", new Object[] { this.pBt });
    AppMethodBeat.o(102921);
  }

  public final void cdB()
  {
    AppMethodBeat.i(102922);
    e.f localf = this.pBt;
    switch (f.eQZ[localf.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      ab.d(TAG, "stop radar");
      AppMethodBeat.o(102922);
      while (true)
      {
        return;
        AppMethodBeat.o(102922);
      }
      stop();
      continue;
      if (this.pBs != null)
      {
        stop();
        com.tencent.mm.kernel.g.Rg().c((com.tencent.mm.ai.m)this.pBs);
        cdC();
        continue;
        stop();
        cdC();
      }
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(102924);
    d locald = this.fwu;
    if (locald != null)
    {
      locald.b(this.ecy);
      AppMethodBeat.o(102924);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102924);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    bpb localbpb = null;
    AppMethodBeat.i(102928);
    j.p(paramm, "scene");
    switch (paramm.getType())
    {
    default:
    case 425:
    case 602:
    }
    while (true)
    {
      AppMethodBeat.o(102928);
      while (true)
      {
        return;
        if (this.pBs != paramm)
          break;
        if (((b)paramm).czE == 1)
        {
          this.pBt = e.f.pBV;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            Object localObject = TAG;
            paramString = ((b)paramm).ehh;
            int i;
            if (paramString != null)
            {
              paramString = paramString.acA();
              paramString = (bpd)paramString;
              if (paramString == null)
                break label276;
              i = paramString.ehB;
              label129: ab.d((String)localObject, "rader members count: %s ticket: %s", new Object[] { Integer.valueOf(i), this.cxb });
              this.pBA.ms(pBD);
              paramString = ((b)paramm).ehh;
              if (paramString == null)
                break label282;
            }
            label276: label282: for (paramString = paramString.acA(); ; paramString = null)
            {
              paramm = (bpd)paramString;
              paramString = localbpb;
              if (paramm != null)
                paramString = paramm.vEh;
              if (paramString == null)
                break label287;
              localObject = paramString.iterator();
              while (((Iterator)localObject).hasNext())
              {
                localbpb = (bpb)((Iterator)localObject).next();
                paramm = com.tencent.mm.plugin.c.a.ask();
                j.o(paramm, "PinAntispam.instance()");
                paramm.Yn().ia(localbpb.jBB, localbpb.wlF);
              }
              paramString = null;
              break;
              i = 0;
              break label129;
            }
            label287: if (paramString != null)
            {
              this.fLl.clear();
              this.fLl.addAll((Collection)paramString);
            }
            a(paramInt1, paramInt2, this.fLl);
            ab.d(TAG, "status: %s", new Object[] { this.pBt });
            AppMethodBeat.o(102928);
          }
          else
          {
            stop();
            a(paramInt1, paramInt2, null);
            AppMethodBeat.o(102928);
          }
        }
        else
        {
          a(paramInt1, paramInt2, null);
          AppMethodBeat.o(102928);
          continue;
          ab.d(TAG, " MMFunc_MMRadarRelationChain ");
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break label492;
          paramString = ((a)paramm).ehh.acA();
          if (paramString == null)
          {
            paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RadarRelationChainResponse");
            AppMethodBeat.o(102928);
            throw paramString;
          }
          paramString = (bpa)paramString;
          this.cxb = paramString.wdB;
          if (paramString.ehB > 0)
          {
            b(paramInt1, paramInt2, paramString.vEh);
            AppMethodBeat.o(102928);
          }
          else
          {
            b(paramInt1, paramInt2, null);
            AppMethodBeat.o(102928);
          }
        }
      }
      label492: b(paramInt1, paramInt2, null);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(102925);
    this.eVT = true;
    this.pBt = e.f.pBS;
    this.pBA.stopTimer();
    AppMethodBeat.o(102925);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;", "", "(Ljava/lang/String;I)V", "SEARCHING", "SEARCH_RETRUN", "RALATIONCHAIN", "RALATIONCHAIN_RETRUN", "CREATING_CHAT", "plugin-radar_release"})
  public static enum e
  {
    static
    {
      AppMethodBeat.i(102911);
      e locale1 = new e("SEARCHING", 0);
      pBM = locale1;
      e locale2 = new e("SEARCH_RETRUN", 1);
      pBN = locale2;
      e locale3 = new e("RALATIONCHAIN", 2);
      pBO = locale3;
      e locale4 = new e("RALATIONCHAIN_RETRUN", 3);
      pBP = locale4;
      e locale5 = new e("CREATING_CHAT", 4);
      pBQ = locale5;
      pBR = new e[] { locale1, locale2, locale3, locale4, locale5 };
      AppMethodBeat.o(102911);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e
 * JD-Core Version:    0.6.2
 */