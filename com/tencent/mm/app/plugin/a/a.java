package com.tencent.mm.app.plugin.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public com.tencent.mm.ui.chatting.d.a cgL;
  public a.b cgM;
  public a.a cgN;
  private String cgO;
  public Map<String, Boolean> cgP;
  public boolean cgQ;

  public a(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(15727);
    ab.d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now init the event listener");
    this.cgL = parama;
    this.cgQ = true;
    if (this.cgM == null)
      this.cgM = new a.b(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.cgM);
    if (this.cgN == null)
      this.cgN = new a.a(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.cgN);
    AppMethodBeat.o(15727);
  }

  public static boolean a(com.tencent.mm.aj.d paramd)
  {
    boolean bool = false;
    AppMethodBeat.i(15730);
    if (paramd == null)
      AppMethodBeat.o(15730);
    while (true)
    {
      return bool;
      if (paramd != null)
      {
        paramd = paramd.cJ(false);
        if ((paramd != null) && (paramd.aej() != null) && (paramd.aej().aes()))
        {
          bool = true;
          AppMethodBeat.o(15730);
        }
      }
      else
      {
        AppMethodBeat.o(15730);
      }
    }
  }

  public final void a(final int paramInt, com.tencent.mm.aj.d paramd)
  {
    AppMethodBeat.i(15729);
    if (this.cgL == null)
    {
      ab.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "notifySwitchView, context is null, maybe has been released");
      AppMethodBeat.o(15729);
    }
    while (true)
    {
      return;
      if ((t.mZ(this.cgL.getTalkerUserName())) && (a(paramd)))
        aw.RS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(15723);
            if (1 == paramInt)
            {
              localObject = new ed();
              ((ed)localObject).cxE.op = 0;
              ((ed)localObject).cxE.userName = a.this.cgL.getTalkerUserName();
              ((ed)localObject).cxE.context = a.this.cgL.yTx.getContext();
              com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
              if (a.this.cgL.getTalkerUserName().equals("gh_43f2581f6fd6"))
              {
                localObject = new sd();
                ((sd)localObject).cOe.action = 1;
                com.tencent.mm.sdk.b.a.xxA.a((b)localObject, com.tencent.mm.sdk.g.d.xDG.cin());
              }
            }
            Object localObject = new jo();
            ((jo)localObject).cEM.opType = paramInt;
            ((jo)localObject).cEM.cEO = 1;
            ((jo)localObject).cEM.cEN = a.this.cgL.getTalkerUserName();
            com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
            AppMethodBeat.o(15723);
          }
        });
      AppMethodBeat.o(15729);
    }
  }

  final void d(int paramInt, String paramString1, String paramString2)
  {
    Object localObject;
    while (true)
    {
      com.tencent.mm.aj.d locald;
      try
      {
        AppMethodBeat.i(15728);
        ab.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connect state : %d", new Object[] { Integer.valueOf(paramInt) });
        if ((this.cgL == null) || (bo.isNullOrNil(paramString1)))
        {
          ab.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null or brandName is null or nil.");
          AppMethodBeat.o(15728);
          return;
        }
        locald = f.qX(paramString1);
        if (!a(locald))
        {
          ab.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", new Object[] { paramString1 });
          AppMethodBeat.o(15728);
          continue;
        }
      }
      finally
      {
      }
      if (this.cgP == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        this.cgP = ((Map)localObject);
      }
      localObject = this.cgP;
      if (!paramString1.equals(this.cgO))
      {
        this.cgO = paramString1;
        ((Map)localObject).clear();
      }
      if (locald.cJ(false).aej().fvI != 1)
        break;
      this.cgL.yTx.setMMSubTitle(null);
      AppMethodBeat.o(15728);
    }
    ab.d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "connDeviceIds : (%s) , deviceId : (%s)", new Object[] { localObject, paramString2 });
    switch (paramInt)
    {
    case 3:
    default:
    case -1:
    case 0:
    case 2:
    case 4:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(15728);
      break;
      this.cgL.yTx.setMMSubTitle(null);
      AppMethodBeat.o(15728);
      break;
      if (((Map)localObject).size() == 0)
      {
        this.cgL.yTx.setMMSubTitle(2131299316);
        AppMethodBeat.o(15728);
        break;
        ((Map)localObject).put(paramString2, Boolean.TRUE);
        this.cgL.yTx.setMMSubTitle(this.cgL.yTx.getString(2131299314, new Object[] { Integer.valueOf(((Map)localObject).size()) }));
        ab.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connected(deviceId : %s), set the tips gone", new Object[] { paramString2 });
        AppMethodBeat.o(15728);
        break;
        if (((Map)localObject).remove(paramString2) != null)
          ab.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "disconnected(deviceId : %s) successfully.", new Object[] { paramString2 });
        this.cgL.yTx.setMMSubTitle(this.cgL.yTx.getString(2131299314, new Object[] { Integer.valueOf(((Map)localObject).size()) }));
        AppMethodBeat.o(15728);
        break;
        if (((Map)localObject).size() == 0)
          this.cgL.yTx.setMMSubTitle(2131299315);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.a.a
 * JD-Core Version:    0.6.2
 */