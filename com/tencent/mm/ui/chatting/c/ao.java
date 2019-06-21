package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.util.Pair;
import android.widget.AbsListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.fq.a;
import com.tencent.mm.g.a.fu;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.cc;
import com.tencent.mm.storage.cd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ag;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ag.class)
public class ao extends a
  implements ag
{
  private static HashMap<Long, String> ySH;
  private static HashMap<Long, ChattingItemTranslate.b> ySI;
  private static LinkedHashMap<Long, Pair<bi, Integer>> ySJ;
  private static HashMap<Long, Boolean> ySK;
  private boolean iXQ;
  private boolean ySL;
  private boolean ySM;
  private List<Long> ySN;
  boolean ySO;
  long ySP;
  long ySQ;
  boolean ySR;
  private int ySS;

  static
  {
    AppMethodBeat.i(31823);
    ySH = new HashMap();
    ySI = new HashMap();
    ySJ = new LinkedHashMap();
    ySK = new HashMap();
    AppMethodBeat.o(31823);
  }

  public ao()
  {
    AppMethodBeat.i(31786);
    this.ySL = false;
    this.iXQ = false;
    this.ySM = false;
    this.ySN = new ArrayList();
    this.ySO = false;
    this.ySQ = 0L;
    this.ySR = false;
    this.ySS = -1;
    AppMethodBeat.o(31786);
  }

  private void OG(int paramInt)
  {
    AppMethodBeat.i(31801);
    if ((this.iXQ) && (paramInt != -1))
      this.cgL.bY(paramInt);
    AppMethodBeat.o(31801);
  }

  private void OH(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(31802);
    if ((this.ySL) && (this.ySN.size() > 0))
    {
      String str = ((Long)this.ySN.get(0)).toString();
      for (int j = 1; j < this.ySN.size(); j++)
        str = str + ":" + this.ySN.get(j);
      com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
      int k = this.ySN.size();
      j = i;
      if (this.iXQ)
        j = 0;
      localh.e(16128, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(0), str });
      this.ySL = false;
      this.ySN.clear();
    }
    AppMethodBeat.o(31802);
  }

  private void a(long paramLong, bi parambi, int paramInt)
  {
    try
    {
      AppMethodBeat.i(31791);
      LinkedHashMap localLinkedHashMap = ySJ;
      Pair localPair = new android/util/Pair;
      localPair.<init>(parambi, Integer.valueOf(paramInt));
      localLinkedHashMap.put(Long.valueOf(paramLong), localPair);
      AppMethodBeat.o(31791);
      return;
    }
    finally
    {
      parambi = finally;
    }
    throw parambi;
  }

  private void art(String paramString)
  {
    AppMethodBeat.i(31807);
    if ((this.cgL != null) && (this.cgL.yTx.getContext() != null))
    {
      paramString = Toast.makeText(this.cgL.yTx.getContext(), paramString, 0);
      paramString.setGravity(17, 0, 0);
      paramString.show();
    }
    AppMethodBeat.o(31807);
  }

  private static void c(int paramInt, bi parambi)
  {
    AppMethodBeat.i(31803);
    if (parambi == null)
      AppMethodBeat.o(31803);
    while (true)
    {
      return;
      fu localfu = new fu();
      localfu.czM.czO = 0;
      localfu.czM.czP = 0;
      localfu.czM.czQ = 0;
      localfu.czM.czN = 0;
      localfu.czM.fileName = parambi.field_imgPath;
      localfu.czM.result = paramInt;
      com.tencent.mm.sdk.b.a.xxA.m(localfu);
      AppMethodBeat.o(31803);
    }
  }

  private void dFh()
  {
    try
    {
      AppMethodBeat.i(31796);
      ySJ.clear();
      AppMethodBeat.o(31796);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private int dFk()
  {
    AppMethodBeat.i(31810);
    int i;
    if (t.mZ(this.cgL.getTalkerUserName()))
    {
      boolean bool = ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn();
      if (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
        if (bool)
          i = 5;
    }
    while (true)
    {
      AppMethodBeat.o(31810);
      return i;
      i = 4;
      continue;
      if (f.rb(this.cgL.getTalkerUserName()))
      {
        i = 3;
      }
      else if (f.rc(this.cgL.getTalkerUserName()))
      {
        i = 0;
      }
      else if (f.qY(this.cgL.getTalkerUserName()))
      {
        i = 6;
      }
      else
      {
        i = 7;
        continue;
        if (this.cgL.dFw())
          i = 2;
        else
          i = 1;
      }
    }
  }

  private void g(bi parambi, int paramInt)
  {
    try
    {
      AppMethodBeat.i(31804);
      if (this.cgL != null);
      for (ak localak = com.tencent.mm.ui.chatting.d.a.dFz(); ; localak = null)
      {
        if (localak != null)
        {
          ao.2 local2 = new com/tencent/mm/ui/chatting/c/ao$2;
          local2.<init>(this, paramInt, parambi);
          localak.post(local2);
        }
        AppMethodBeat.o(31804);
        return;
      }
    }
    finally
    {
    }
    throw parambi;
  }

  private Context getContext()
  {
    AppMethodBeat.i(31806);
    Object localObject;
    if (this.cgL != null)
    {
      localObject = this.cgL.yTx.getContext();
      AppMethodBeat.o(31806);
    }
    while (true)
    {
      return localObject;
      localObject = ah.getContext();
      AppMethodBeat.o(31806);
    }
  }

  private void nh(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31788);
      ySH.remove(Long.valueOf(paramLong));
      ySI.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(31788);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private bi nk(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31793);
      Object localObject1 = (Pair)ySJ.get(Long.valueOf(paramLong));
      if (localObject1 == null)
      {
        localObject1 = null;
        AppMethodBeat.o(31793);
      }
      while (true)
      {
        return localObject1;
        localObject1 = (bi)((Pair)localObject1).first;
        AppMethodBeat.o(31793);
      }
    }
    finally
    {
    }
  }

  private void nl(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31795);
      if (ySJ.containsKey(Long.valueOf(paramLong)))
        ySJ.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(31795);
      return;
    }
    finally
    {
    }
  }

  private void nn(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31809);
      ySK.put(Long.valueOf(paramLong), Boolean.FALSE);
      AppMethodBeat.o(31809);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void notifyDataSetChanged()
  {
    AppMethodBeat.i(31805);
    if (this.cgL != null)
      this.cgL.aWv();
    AppMethodBeat.o(31805);
  }

  public final String C(long paramLong, String paramString)
  {
    try
    {
      AppMethodBeat.i(31789);
      String str1 = (String)ySH.get(Long.valueOf(paramLong));
      String str2 = str1;
      if (bo.isNullOrNil(str1))
      {
        paramString = m.amb().aqb(paramString);
        str2 = str1;
        if (paramString != null)
        {
          str2 = str1;
          if (!bo.isNullOrNil(paramString.field_content))
            str2 = paramString.field_content;
        }
      }
      AppMethodBeat.o(31789);
      return str2;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void OF(int paramInt)
  {
    AppMethodBeat.i(31799);
    if (paramInt == 2)
    {
      this.ySM = true;
      AppMethodBeat.o(31799);
    }
    while (true)
    {
      return;
      if (this.ySO)
        a(nk(this.ySP), true, -1, paramInt);
      AppMethodBeat.o(31799);
    }
  }

  public final void a(long paramLong, String paramString, ChattingItemTranslate.b paramb)
  {
    try
    {
      AppMethodBeat.i(31787);
      ySH.put(Long.valueOf(paramLong), paramString);
      ySI.put(Long.valueOf(paramLong), paramb);
      if (paramb == ChattingItemTranslate.b.zhj)
        ySK.put(Long.valueOf(paramLong), Boolean.TRUE);
      AppMethodBeat.o(31787);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void a(bi parambi, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31800);
    if (parambi == null)
    {
      ab.d("MicroMsg.TransformComponent", "go VoiceTransTextAct need MsgInfo but null");
      AppMethodBeat.o(31800);
    }
    Object localObject;
    while (true)
    {
      return;
      if (nm(parambi.field_msgId))
      {
        ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag MsgId:%s,isVoiceTransforming:%s", new Object[] { Long.valueOf(parambi.field_msgId), Boolean.valueOf(this.ySO) });
        parambi.dtT();
        nn(parambi.field_msgId);
        notifyDataSetChanged();
        AppMethodBeat.o(31800);
      }
      else
      {
        if ((nj(parambi.field_msgId)) && (paramBoolean))
        {
          if (ni(parambi.field_msgId) == ChattingItemTranslate.b.zhh)
          {
            ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag removeCache");
            nl(parambi.field_msgId);
            nh(parambi.field_msgId);
            c(5, parambi);
          }
          while (true)
          {
            notifyDataSetChanged();
            if (!paramBoolean)
              break label483;
            OH(paramInt2);
            AppMethodBeat.o(31800);
            break;
            if (this.ySO)
            {
              localObject = new fq();
              ((fq)localObject).czB.czE = 3;
              com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
              nl(parambi.field_msgId);
              nh(parambi.field_msgId);
              parambi.dtT();
              aw.ZK();
              c.XO().a(parambi.field_msgId, parambi);
              this.ySO = false;
              g(parambi, -1);
            }
          }
        }
        localObject = m.amb().aqb(parambi.field_imgPath);
        if ((localObject != null) && (!bo.isNullOrNil(((cc)localObject).field_content)))
        {
          ab.i("MicroMsg.TransformComponent", "alvinluo VoiceTransformText has TransContent MsgId:%s, clientMsgId: %s", new Object[] { Long.valueOf(parambi.field_msgId), parambi.field_imgPath });
          parambi.dtU();
          a(parambi.field_msgId, ((cc)localObject).field_content, ChattingItemTranslate.b.zhj);
          aw.ZK();
          c.XO().a(parambi.field_msgId, parambi);
          this.ySL = false;
          OG(paramInt1);
          AppMethodBeat.o(31800);
        }
        else
        {
          paramInt2 = aw.Rg().acS();
          if ((paramInt2 == 4) || (paramInt2 == 6))
            break;
          com.tencent.mm.ui.base.h.g(getContext(), 2131298252, 2131297061);
          c(2, parambi);
          this.ySL = false;
          AppMethodBeat.o(31800);
        }
      }
    }
    if (this.ySO)
    {
      ab.i("MicroMsg.TransformComponent", "go VoiceTransformText insert transformQueue");
      a(parambi.field_msgId, parambi, paramInt1);
      a(parambi.field_msgId, "", ChattingItemTranslate.b.zhh);
      notifyDataSetChanged();
    }
    while (true)
    {
      if (paramBoolean)
        this.iXQ = true;
      label483: AppMethodBeat.o(31800);
      break;
      localObject = new fq();
      ((fq)localObject).czB.czE = 1;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      localObject = new fq();
      ((fq)localObject).czB.czD = String.valueOf(parambi.field_msgId);
      ((fq)localObject).czB.fileName = parambi.field_imgPath;
      ((fq)localObject).czB.from = 1;
      ((fq)localObject).czB.czE = 0;
      ((fq)localObject).czB.scene = dFk();
      ((fq)localObject).czB.czF = new ao.1(this, (fq)localObject, paramInt1, parambi);
      a(Long.valueOf(((fq)localObject).czB.czD).longValue(), "", ChattingItemTranslate.b.zhi);
      a(parambi.field_msgId, parambi, paramInt1);
      this.ySO = true;
      this.ySP = parambi.field_msgId;
      notifyDataSetChanged();
      OG(paramInt1);
      if (com.tencent.mm.sdk.b.a.xxA.m((b)localObject))
      {
        ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent");
      }
      else
      {
        ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent fail");
        art(getContext().getString(2131298251));
        nh(Long.valueOf(((fq)localObject).czB.czD).longValue());
        nl(Long.valueOf(((fq)localObject).czB.czD).longValue());
        this.ySO = false;
        g(parambi, paramInt1);
      }
    }
  }

  public final Pair<bi, Integer> dFg()
  {
    try
    {
      AppMethodBeat.i(31794);
      Object localObject1 = ySJ.entrySet().iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject1 = (Pair)((Map.Entry)((Iterator)localObject1).next()).getValue();
        AppMethodBeat.o(31794);
      }
      while (true)
      {
        return localObject1;
        localObject1 = null;
        AppMethodBeat.o(31794);
      }
    }
    finally
    {
    }
  }

  public final boolean dFi()
  {
    AppMethodBeat.i(31797);
    aw.ZK();
    boolean bool;
    if (!((Boolean)c.Ry().get(75, Boolean.FALSE)).booleanValue())
    {
      bool = true;
      AppMethodBeat.o(31797);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31797);
    }
  }

  public final void dFj()
  {
    AppMethodBeat.i(31798);
    aw.ZK();
    c.Ry().set(75, Boolean.TRUE);
    AppMethodBeat.o(31798);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31811);
    ab.i("MicroMsg.TransformComponent", "[onChattingPause]");
    OF(3);
    AppMethodBeat.o(31811);
  }

  public final void dxD()
  {
    AppMethodBeat.i(31812);
    ab.i("MicroMsg.TransformComponent", "clear VoiceTransTextAct");
    dFh();
    ySI.clear();
    ySJ.clear();
    ySK.clear();
    if (this.ySO)
    {
      fq localfq = new fq();
      localfq.czB.czE = 3;
      com.tencent.mm.sdk.b.a.xxA.m(localfq);
      this.ySO = false;
    }
    ab.i("MicroMsg.TransformComponent", "alvinluo hide transformText");
    com.tencent.mm.sdk.g.d.post(new ao.3(this), "UnsetTransformFlag");
    AppMethodBeat.o(31812);
  }

  public final ChattingItemTranslate.b ni(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31790);
      ChattingItemTranslate.b localb1 = (ChattingItemTranslate.b)ySI.get(Long.valueOf(paramLong));
      ChattingItemTranslate.b localb2 = localb1;
      if (localb1 == null)
        localb2 = ChattingItemTranslate.b.zhg;
      AppMethodBeat.o(31790);
      return localb2;
    }
    finally
    {
    }
  }

  public final boolean nj(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31792);
      boolean bool;
      if (ySJ.containsKey(Long.valueOf(paramLong)))
      {
        bool = true;
        AppMethodBeat.o(31792);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(31792);
      }
    }
    finally
    {
    }
  }

  public final boolean nm(long paramLong)
  {
    try
    {
      AppMethodBeat.i(31808);
      Boolean localBoolean = (Boolean)ySK.get(Long.valueOf(paramLong));
      boolean bool;
      if (localBoolean != null)
      {
        bool = localBoolean.booleanValue();
        AppMethodBeat.o(31808);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(31808);
      }
    }
    finally
    {
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(31813);
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (paramInt1 < this.ySS)
      this.iXQ = false;
    this.ySS = paramInt1;
    AppMethodBeat.o(31813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ao
 * JD-Core Version:    0.6.2
 */