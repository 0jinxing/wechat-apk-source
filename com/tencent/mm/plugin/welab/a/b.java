package com.tencent.mm.plugin.welab.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.welab.d;
import com.tencent.mm.plugin.welab.d.a;
import com.tencent.mm.protocal.protobuf.axk;
import com.tencent.mm.protocal.protobuf.axl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.a
{
  private String tag;
  private Map<String, Integer> uLV;

  public b()
  {
    AppMethodBeat.i(80562);
    this.uLV = new HashMap();
    this.tag = "";
    ddm();
    AppMethodBeat.o(80562);
  }

  private void ddm()
  {
    AppMethodBeat.i(80563);
    this.tag = ((String)g.RP().Ry().get(ac.a.xRP, null));
    ab.i("LabAppLifeService", "load red tag " + this.tag);
    if (!TextUtils.isEmpty(this.tag))
      for (Object localObject : this.tag.split("&"))
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split("=");
          if ((localObject != null) && (localObject.length == 2))
            this.uLV.put(localObject[0], Integer.valueOf(bo.ank(localObject[1])));
        }
    AppMethodBeat.o(80563);
  }

  public final boolean agM(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(80565);
    com.tencent.mm.plugin.welab.d.a.a locala = com.tencent.mm.plugin.welab.a.ddj().agI(paramString);
    paramString = new StringBuilder("isOnline ").append(paramString).append(", ");
    if (locala.ddu())
    {
      bool2 = true;
      ab.i("LabAppLifeService", bool2);
      if (!locala.ddu())
        break label82;
      AppMethodBeat.o(80565);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label82: AppMethodBeat.o(80565);
    }
  }

  public final boolean agN(String paramString)
  {
    AppMethodBeat.i(80566);
    boolean bool;
    if ((this.uLV.get(paramString) == null) || (((Integer)this.uLV.get(paramString)).intValue() == 0))
    {
      bool = true;
      AppMethodBeat.o(80566);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80566);
    }
  }

  public final boolean agO(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(80568);
    com.tencent.mm.plugin.welab.d.a.a locala = com.tencent.mm.plugin.welab.a.ddj().agI(paramString);
    paramString = new StringBuilder("hitExp ").append(paramString).append(", ");
    if (locala.isRunning())
    {
      bool2 = true;
      ab.i("LabAppLifeService", bool2);
      if (!locala.isRunning())
        break label82;
      AppMethodBeat.o(80568);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label82: AppMethodBeat.o(80568);
    }
  }

  public final String agP(String paramString)
  {
    AppMethodBeat.i(80570);
    paramString = com.tencent.mm.plugin.welab.a.ddj().agI(paramString).field_WeAppUser;
    AppMethodBeat.o(80570);
    return paramString;
  }

  public final int agQ(String paramString)
  {
    AppMethodBeat.i(80571);
    int i = com.tencent.mm.plugin.welab.a.ddj().agI(paramString).field_WeAppDebugMode;
    AppMethodBeat.o(80571);
    return i;
  }

  public final void bK(String paramString, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(80569);
    ab.i("LabAppLifeService", "switchEntry " + paramString + "," + paramBoolean);
    com.tencent.mm.plugin.welab.d.a.a locala = com.tencent.mm.plugin.welab.a.ddj().agI(paramString);
    if (paramBoolean)
    {
      j = 2;
      if (locala.field_Switch != j)
      {
        locala.field_Switch = j;
        com.tencent.mm.plugin.welab.a.ddj().uLQ.c(locala, new String[0]);
        Object localObject = new axl();
        axk localaxk = new axk();
        if (!locala.ddw())
          break label227;
        j = 0;
        label115: localaxk.wBs = j;
        localaxk.wBt = locala.field_LabsAppId;
        if (locala.field_Switch != 2)
          break label240;
        j = i;
        label144: localaxk.wkB = j;
        ((axl)localObject).eow.add(localaxk);
        localObject = new j.a(207, (com.tencent.mm.bt.a)localObject);
        ((j)g.K(j.class)).XL().c((j.b)localObject);
        if (locala.field_Switch != 2)
          break label246;
      }
    }
    label227: label240: label246: for (int j = 4; ; j = 5)
    {
      d.t(paramString, j, false);
      AppMethodBeat.o(80569);
      return;
      j = 1;
      break;
      j = bo.ank(locala.field_expId);
      break label115;
      j = 2;
      break label144;
    }
  }

  public final void open(String paramString)
  {
    AppMethodBeat.i(80567);
    this.uLV.put(paramString, Integer.valueOf(1));
    this.tag = (this.tag + "&" + paramString + "=1");
    g.RP().Ry().set(ac.a.xRP, this.tag);
    com.tencent.mm.plugin.welab.d.a.a locala = com.tencent.mm.plugin.welab.a.ddj().agI(paramString);
    d.a locala1 = new d.a();
    locala1.csB = paramString;
    locala1.uLT = locala.field_expId;
    locala1.timeStamp = System.currentTimeMillis();
    locala1.action = 3;
    d.a(locala1);
    AppMethodBeat.o(80567);
  }

  public final boolean xj(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(80564);
    if (com.tencent.mm.plugin.welab.a.ddj().agI(paramString).field_Switch == 2)
    {
      ab.i("LabAppLifeService", "appid %s is open ", new Object[] { paramString });
      AppMethodBeat.o(80564);
    }
    while (true)
    {
      return bool;
      ab.i("LabAppLifeService", "appid %s is close", new Object[] { paramString });
      AppMethodBeat.o(80564);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.a.b
 * JD-Core Version:    0.6.2
 */