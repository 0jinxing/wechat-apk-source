package com.tencent.mm.plugin.welab.e;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final b uME;
  public String tag;
  public Map<String, Integer> uLV;

  static
  {
    AppMethodBeat.i(80636);
    uME = new b();
    AppMethodBeat.o(80636);
  }

  private b()
  {
    AppMethodBeat.i(80628);
    this.uLV = new HashMap();
    this.tag = "";
    ddm();
    AppMethodBeat.o(80628);
  }

  private boolean agT(String paramString)
  {
    AppMethodBeat.i(80631);
    boolean bool;
    if ((this.uLV.containsKey(paramString)) && (((Integer)this.uLV.get(paramString)).intValue() == 1))
    {
      AppMethodBeat.o(80631);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80631);
    }
  }

  public static b ddC()
  {
    return uME;
  }

  public static void ddD()
  {
    AppMethodBeat.i(80633);
    Object localObject = com.tencent.mm.plugin.welab.a.ddj().ddk();
    if ((localObject != null) && (((List)localObject).isEmpty()));
    localObject = ((List)localObject).iterator();
    com.tencent.mm.plugin.welab.d.a.a locala;
    do
    {
      if (!((Iterator)localObject).hasNext())
        break;
      locala = (com.tencent.mm.plugin.welab.d.a.a)((Iterator)localObject).next();
    }
    while ((locala == null) || (!uME.e(locala)));
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
        c.PK().bZ(266267, 266241);
      AppMethodBeat.o(80633);
      return;
    }
  }

  public static boolean ddE()
  {
    AppMethodBeat.i(80634);
    boolean bool = c.PK().bY(266267, 266241);
    AppMethodBeat.o(80634);
    return bool;
  }

  public static boolean ddF()
  {
    AppMethodBeat.i(80635);
    boolean bool = ah.doB().getBoolean("key_has_enter_welab", false);
    AppMethodBeat.o(80635);
    return bool;
  }

  private void ddm()
  {
    AppMethodBeat.i(80629);
    this.tag = ((String)g.RP().Ry().get(ac.a.xRO, null));
    ab.i("WeLabRedPointMgr", "load red tag " + this.tag);
    if (!TextUtils.isEmpty(this.tag))
      for (Object localObject : this.tag.split("&"))
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split("=");
          if ((localObject != null) && (localObject.length == 2))
            this.uLV.put(localObject[0], Integer.valueOf(bo.ank(localObject[1])));
        }
    AppMethodBeat.o(80629);
  }

  public final boolean e(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(80630);
    if ((parama.field_RedPoint != 1) || (parama.ddt()))
      AppMethodBeat.o(80630);
    while (true)
    {
      return bool;
      if (agT(parama.field_LabsAppId))
      {
        AppMethodBeat.o(80630);
      }
      else
      {
        AppMethodBeat.o(80630);
        bool = true;
      }
    }
  }

  public final void f(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    AppMethodBeat.i(80632);
    if ((parama.field_RedPoint == 1) && (!agT(parama.field_LabsAppId)) && (parama.ddu()))
      c.PK().y(266267, true);
    AppMethodBeat.o(80632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.e.b
 * JD-Core Version:    0.6.2
 */