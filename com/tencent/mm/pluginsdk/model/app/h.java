package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.ad.b;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class h
  implements f, ad.b, t
{
  Map<String, Integer> hoQ;
  private List<String> qoT;
  private List<String> vbN;
  private ap vbO;
  private List<String> vbY;
  private List<String> vbZ;
  private volatile boolean vca;

  public h()
  {
    AppMethodBeat.i(79300);
    this.vbN = null;
    this.qoT = null;
    this.hoQ = null;
    this.vca = false;
    this.vbO = new ap(Looper.getMainLooper(), new h.1(this), false);
    this.vbN = new ArrayList();
    this.qoT = new ArrayList();
    this.hoQ = new HashMap();
    this.vbY = new Vector();
    this.vbZ = new ArrayList();
    this.vbO.ae(600000L, 600000L);
    com.tencent.mm.kernel.g.RO().eJo.a(231, this);
    a.bYM().a(7, this);
    AppMethodBeat.o(79300);
  }

  private void Iz(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(79303);
        if ((!bo.isNullOrNil(paramString)) && (!this.vbY.contains(paramString)))
        {
          if (!aiI(paramString))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "this app has reach the max retry count, appid is %s", new Object[] { paramString });
            AppMethodBeat.o(79303);
            return;
          }
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppInfoService", "add appid:[%s]", new Object[] { paramString });
          this.vbY.add(paramString);
          AppMethodBeat.o(79303);
          continue;
        }
      }
      finally
      {
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppInfoService", "should not add this appid:[%s], it is already runing", new Object[] { paramString });
      AppMethodBeat.o(79303);
    }
  }

  private boolean aiI(String paramString)
  {
    AppMethodBeat.i(79306);
    boolean bool;
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
      AppMethodBeat.o(79306);
      bool = false;
    }
    while (true)
    {
      return bool;
      Integer localInteger = Integer.valueOf(bo.a((Integer)this.hoQ.get(paramString), 0));
      if (localInteger.intValue() >= 5)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
        AppMethodBeat.o(79306);
        bool = false;
      }
      else
      {
        this.hoQ.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
        bool = true;
        AppMethodBeat.o(79306);
      }
    }
  }

  private void dhC()
  {
    int i = 20;
    AppMethodBeat.i(79305);
    if (this.vca)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppInfoService", " batch get appinfo doing now");
      AppMethodBeat.o(79305);
    }
    while (true)
    {
      return;
      if ((this.vbY != null) && (!this.vbY.isEmpty()))
        break;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppInfoService", "batchwaitinglist is empty, no need to doscene");
      AppMethodBeat.o(79305);
    }
    int j = this.vbY.size();
    if (j > 20)
      j = i;
    while (true)
      while (true)
        try
        {
          this.vbZ.addAll(this.vbY.subList(0, j));
          if ((this.vbZ != null) && (!this.vbZ.isEmpty()))
          {
            this.vca = true;
            y localy = new y(7, new ab(this.vbZ));
            com.tencent.mm.kernel.g.RO().eJo.a(localy, 0);
          }
          AppMethodBeat.o(79305);
          break;
        }
        finally
        {
          AppMethodBeat.o(79305);
        }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(79308);
    if (paramx.getType() != 7)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppInfoService", "not the getappinfolist scene, ignore");
      AppMethodBeat.o(79308);
    }
    while (true)
    {
      return;
      try
      {
        if ((this.vbZ != null) && (!this.vbZ.isEmpty()))
        {
          this.vbY.removeAll(this.vbZ);
          this.vbZ.clear();
        }
        this.vca = false;
        dhC();
        AppMethodBeat.o(79308);
      }
      finally
      {
        AppMethodBeat.o(79308);
      }
    }
    throw paramString;
  }

  public final void aC(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79302);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
      AppMethodBeat.o(79302);
    }
    while (true)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
        Iz((String)paramLinkedList.next());
      dhC();
      AppMethodBeat.o(79302);
    }
  }

  public final void aiH(String paramString)
  {
    AppMethodBeat.i(79304);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "push fail, appId is null");
      AppMethodBeat.o(79304);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppInfoService", "push appid : ".concat(String.valueOf(paramString)));
      Iz(paramString);
      dhC();
      AppMethodBeat.o(79304);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(79307);
    paramInt1 = paramm.getType();
    switch (paramInt1)
    {
    default:
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "error type: ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(79307);
    case 231:
    case 451:
    }
    while (true)
    {
      return;
      paramString = ((aa)paramm).appId;
      if (this.vbN.contains(paramString))
        this.vbN.remove(paramString);
      label217: 
      while (this.qoT.size() > 0)
      {
        paramm = (String)this.qoT.remove(0);
        if ((paramm == null) || (paramm.length() == 0))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "startDownload fail, appId is null");
          paramInt1 = 0;
        }
        while (true)
        {
          if (paramInt1 == 0)
            break label217;
          this.vbN.add(paramm);
          AppMethodBeat.o(79307);
          break;
          if (!aiI(paramm))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "increaseCounter fail");
            paramInt1 = 0;
          }
          else
          {
            paramString = new aa(paramm);
            com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
            paramInt1 = 1;
          }
        }
      }
      try
      {
        if ((this.vbZ != null) && (!this.vbZ.isEmpty()))
        {
          this.vbY.removeAll(this.vbZ);
          this.vbZ.clear();
        }
        this.vca = false;
        dhC();
        AppMethodBeat.o(79307);
      }
      finally
      {
        AppMethodBeat.o(79307);
      }
    }
    throw paramString;
  }

  public final String t(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79301);
    paramContext = g.t(paramContext, paramString);
    AppMethodBeat.o(79301);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.h
 * JD-Core Version:    0.6.2
 */