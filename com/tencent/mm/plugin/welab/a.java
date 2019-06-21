package com.tencent.mm.plugin.welab;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.g.a.nl;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static final a uLP;
  public com.tencent.mm.plugin.welab.d.a uLQ;
  public Map<String, b> uLR;
  public b uLS;
  public c udB;

  static
  {
    AppMethodBeat.i(80535);
    uLP = new a();
    AppMethodBeat.o(80535);
  }

  public a()
  {
    AppMethodBeat.i(80527);
    this.uLR = new HashMap();
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    this.udB = locala.ahG();
    AppMethodBeat.o(80527);
  }

  public static void Z(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(80531);
    e.aa(paramBoolean1, paramBoolean2);
    AppMethodBeat.o(80531);
  }

  public static String a(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    AppMethodBeat.i(80528);
    String str = "";
    Object localObject = uLP.agH(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = ((b)localObject).ddr();
      ab.i("WelabMgr", "get appName from opener , appid %s, appName %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str))
      localObject = parama.agR("field_Title");
    AppMethodBeat.o(80528);
    return localObject;
  }

  private b agH(String paramString)
  {
    AppMethodBeat.i(80530);
    paramString = (b)this.uLR.get(paramString);
    AppMethodBeat.o(80530);
    return paramString;
  }

  public static String b(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    AppMethodBeat.i(80529);
    String str = "";
    Object localObject = uLP.agH(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = ((b)localObject).ddq();
      ab.i("WelabMgr", "get icon url from opener , appid %s, url %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str))
      localObject = parama.field_Icon;
    AppMethodBeat.o(80529);
    return localObject;
  }

  public static a ddj()
  {
    return uLP;
  }

  public static void ed(List<com.tencent.mm.plugin.welab.d.a.a> paramList)
  {
    AppMethodBeat.i(80534);
    if (!paramList.isEmpty())
    {
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        com.tencent.mm.plugin.welab.d.a.a locala = (com.tencent.mm.plugin.welab.d.a.a)paramList.next();
        if ((!locala.ddx()) && (!locala.isExpired()))
          localArrayList.add(locala.field_LabsAppId);
      }
      paramList = new nl();
      paramList.cJJ.cJK = localArrayList;
      com.tencent.mm.sdk.b.a.xxA.m(paramList);
      paramList = localArrayList.iterator();
      while (paramList.hasNext())
        if ("labs_nearbylife".equals((String)paramList.next()))
        {
          com.tencent.mm.sdk.b.a.xxA.m(new kf());
          AppMethodBeat.o(80534);
        }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(80534);
    }
  }

  public final com.tencent.mm.plugin.welab.d.a.a agI(String paramString)
  {
    AppMethodBeat.i(80533);
    com.tencent.mm.plugin.welab.d.a locala = this.uLQ;
    com.tencent.mm.plugin.welab.d.a.a locala1 = new com.tencent.mm.plugin.welab.d.a.a();
    locala1.field_LabsAppId = paramString;
    locala.b(locala1, new String[0]);
    AppMethodBeat.o(80533);
    return locala1;
  }

  public final List<com.tencent.mm.plugin.welab.d.a.a> ddk()
  {
    AppMethodBeat.i(80532);
    List localList = this.uLQ.dds();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.welab.d.a.a locala = (com.tencent.mm.plugin.welab.d.a.a)localIterator.next();
      if ((!locala.isRunning()) || ((locala.field_Switch != 2) && (locala.field_Switch != 1)) || ("labs1de6f3".equals(locala.field_LabsAppId)))
        localIterator.remove();
    }
    ab.i("WelabMgr", "online lab %s", new Object[] { localList.toString() });
    AppMethodBeat.o(80532);
    return localList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.a
 * JD-Core Version:    0.6.2
 */