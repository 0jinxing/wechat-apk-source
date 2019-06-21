package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.dl;
import com.tencent.mm.protocal.protobuf.dm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class m
  implements t
{
  private List<String> vbN;
  public Vector<String> vcj;
  private volatile boolean vck;

  public m()
  {
    AppMethodBeat.i(79329);
    this.vck = false;
    this.vcj = new Vector();
    this.vbN = new ArrayList();
    a.bYM().a(1, this);
    AppMethodBeat.o(79329);
  }

  private void Pt()
  {
    int i = 20;
    AppMethodBeat.i(79333);
    if (this.vck)
    {
      ab.d("MicroMsg.AppSettingService", "tryDoScene fail, doing Scene");
      AppMethodBeat.o(79333);
    }
    while (true)
    {
      return;
      if (this.vcj.size() > 0)
        break;
      ab.d("MicroMsg.AppSettingService", "tryDoScene fail, appIdList is empty");
      AppMethodBeat.o(79333);
    }
    ab.d("MicroMsg.AppSettingService", "tryDoScene, appid list size = " + this.vcj.size());
    int j = this.vcj.size();
    if (j > 20);
    while (true)
    {
      this.vck = true;
      this.vbN.addAll(this.vcj.subList(0, i));
      y localy = new y(1, new ac(this.vbN));
      com.tencent.mm.kernel.g.RO().eJo.a(localy, 0);
      AppMethodBeat.o(79333);
      break;
      i = j;
    }
  }

  public static String aiN(String paramString)
  {
    AppMethodBeat.i(79332);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppSettingService", "getOpenIdSync, appId is null");
      AppMethodBeat.o(79332);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject1 = g.bS(paramString, false);
      if (localObject1 == null)
      {
        AppMethodBeat.o(79332);
        paramString = null;
      }
      else if ((((f)localObject1).field_openId != null) && (((f)localObject1).field_openId.length() != 0))
      {
        paramString = ((f)localObject1).field_openId;
        AppMethodBeat.o(79332);
      }
      else
      {
        localObject1 = new LinkedList();
        ((List)localObject1).add(paramString);
        localObject1 = new ac((List)localObject1);
        Object localObject2 = new b.a();
        ((b.a)localObject2).fsJ = new dl();
        ((b.a)localObject2).fsK = new dm();
        ((b.a)localObject2).uri = "/cgi-bin/micromsg-bin/appcenter";
        ((b.a)localObject2).fsI = 452;
        ((b.a)localObject2).fsL = 0;
        ((b.a)localObject2).fsM = 0;
        localObject2 = ((b.a)localObject2).acD();
        dl localdl = (dl)((com.tencent.mm.ai.b)localObject2).fsG.fsP;
        Object localObject3 = ((ac)localObject1).dhj();
        if (localObject3 != null)
          localdl.ReqBuf = new SKBuiltinBuffer_t().setBuffer((byte[])localObject3);
        localdl.jCt = 1;
        localObject3 = com.tencent.mm.ai.x.c((com.tencent.mm.ai.b)localObject2);
        ab.i("MicroMsg.AppSettingService", "call getOpenIdSync cgi result, errType = %d, errCode = %d", new Object[] { Integer.valueOf(((a.a)localObject3).errType), Integer.valueOf(((a.a)localObject3).errCode) });
        if ((((a.a)localObject3).errType != 0) || (((a.a)localObject3).errCode != 0))
        {
          AppMethodBeat.o(79332);
          paramString = null;
        }
        else
        {
          ((ac)localObject1).bG(aa.a(((dm)((a.a)localObject3).fsy).vFq));
          ((ac)localObject1).a(0, ((a.a)localObject3).errType, ((a.a)localObject3).errCode, ((a.a)localObject3).aIm, (q)localObject2, new byte[0]);
          paramString = g.bT(paramString, false);
          if (paramString != null)
          {
            paramString = paramString.field_openId;
            AppMethodBeat.o(79332);
          }
          else
          {
            AppMethodBeat.o(79332);
            paramString = null;
          }
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(79334);
    if (paramx.getType() != 1)
      AppMethodBeat.o(79334);
    while (true)
    {
      return;
      this.vck = false;
      paramString = ((ac)paramx).vcs;
      ab.d("MicroMsg.AppSettingService", "onSceneEnd, list size = " + paramString.size());
      this.vcj.removeAll(this.vbN);
      this.vbN.clear();
      Pt();
      AppMethodBeat.o(79334);
    }
  }

  public final void addAll(List<String> paramList)
  {
    AppMethodBeat.i(79331);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.AppSettingService", "addAll list is null");
      AppMethodBeat.o(79331);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if ((!bo.isNullOrNil(paramList)) && (!this.vcj.contains(paramList)))
          this.vcj.add(paramList);
      }
      Pt();
      AppMethodBeat.o(79331);
    }
  }

  public final void wy(String paramString)
  {
    AppMethodBeat.i(79330);
    ab.d("MicroMsg.AppSettingService", "appId = ".concat(String.valueOf(paramString)));
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppSettingService", "add appId is null");
      AppMethodBeat.o(79330);
    }
    while (true)
    {
      return;
      if (!this.vcj.contains(paramString))
        this.vcj.add(paramString);
      Pt();
      AppMethodBeat.o(79330);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.m
 * JD-Core Version:    0.6.2
 */