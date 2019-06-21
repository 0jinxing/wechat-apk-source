package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarAddContact$AddContactHelper;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "callback", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContactHelper;", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContactHelper;)V", "lstScene", "Ljava/util/LinkedList;", "", "lstUsername", "", "mUsername", "addContact", "", "username", "finish", "ok", "", "hasSentVerify", "respUsername", "errMsg", "onSceneEnd", "errType", "errCode", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onStart", "onStop", "sendVerifyRequest", "verifyOk", "verifyTicket", "plugin-radar_release"})
public final class c$a
  implements f
{
  String igi;
  final LinkedList<String> pAS;
  LinkedList<Integer> pAT;
  private final c.d pAU;

  public c$a(c.d paramd)
  {
    AppMethodBeat.i(102872);
    Object localObject;
    this.pAU = localObject;
    this.pAS = new LinkedList();
    AppMethodBeat.o(102872);
  }

  private final void b(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102870);
    g.Rg().b(30, (f)this);
    c.d locald = this.pAU;
    if (locald != null)
    {
      locald.a(paramBoolean1, paramBoolean2, paramString1, paramString2);
      AppMethodBeat.o(102870);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102870);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(102871);
    j.p(paramm, "scene");
    ab.d(c.access$getTAG$cp(), "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramm.getType() != 30)
    {
      ab.w(c.access$getTAG$cp(), "not expected scene,  type = " + paramm.getType());
      AppMethodBeat.o(102871);
    }
    while (true)
    {
      return;
      if (((com.tencent.mm.pluginsdk.model.m)paramm).dhm() != 2)
        break label239;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break;
      b(false, true, this.igi, "");
      AppMethodBeat.o(102871);
    }
    if ((paramInt1 == 4) && (paramInt2 == -34))
      paramm = this.pAV.context.getString(2131299915);
    while (true)
    {
      b(false, false, this.igi, paramm);
      AppMethodBeat.o(102871);
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
      {
        paramm = this.pAV.context.getString(2131299918);
      }
      else if ((paramInt1 == 4) && ((paramInt2 == -24) || (paramInt2 == -101)))
      {
        paramm = paramString;
        if (paramString != null);
      }
      else
      {
        paramm = this.pAV.context.getString(2131302960);
        continue;
        label239: if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          b(true, false, this.igi, "");
          AppMethodBeat.o(102871);
          break;
        }
        if (paramInt2 == -44)
        {
          g.Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.pluginsdk.model.m(2, (List)this.pAS, (List)this.pAT, "", ""));
          AppMethodBeat.o(102871);
          break;
        }
        if (paramInt2 == -87)
        {
          b(false, false, this.igi, this.pAV.context.getString(2131298465));
          AppMethodBeat.o(102871);
          break;
        }
        if ((paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
        {
          String str = this.igi;
          paramm = paramString;
          if (paramString == null)
            paramm = "";
          b(false, false, str, paramm);
          AppMethodBeat.o(102871);
          break;
        }
        if ((paramInt1 == 4) && (paramInt2 == -22))
          paramm = this.pAV.context.getString(2131296429);
        else
          paramm = this.pAV.context.getString(2131296428);
      }
    }
  }

  public final void onStart()
  {
    AppMethodBeat.i(102869);
    g.Rg().a(30, (f)this);
    AppMethodBeat.o(102869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.c.a
 * JD-Core Version:    0.6.2
 */