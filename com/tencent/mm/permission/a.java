package com.tencent.mm.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  static final String ceI;
  static final String ceJ;
  static Map<Integer, a.a> ggv;
  c ggw;
  private c ggx;
  private c ggy;

  static
  {
    AppMethodBeat.i(16645);
    Object localObject = q.LM();
    ceI = (String)localObject;
    ceJ = p.getString(((String)localObject).hashCode());
    localObject = new HashMap();
    ggv = (Map)localObject;
    ((Map)localObject).put(Integer.valueOf(1), new a.a(38, 40, 41, 2131297009, 2131297001));
    ggv.put(Integer.valueOf(2), new a.a(43, 44, 45, 2131297008, 2131297002));
    AppMethodBeat.o(16645);
  }

  public a()
  {
    AppMethodBeat.i(16641);
    this.ggw = new a.1(this);
    this.ggx = new a.2(this);
    this.ggy = new a.3(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.ggw);
    com.tencent.mm.sdk.b.a.xxA.c(this.ggx);
    com.tencent.mm.sdk.b.a.xxA.c(this.ggy);
    AppMethodBeat.o(16641);
  }

  private static int vn(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(16642);
    try
    {
      j = bo.getInt(g.Nu().getValue(paramString), 0);
      AppMethodBeat.o(16642);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.PermissionMgr", "getIntValFromDynamicConfig parseInt failed, val: ".concat(String.valueOf(paramString)));
        int j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.permission.a
 * JD-Core Version:    0.6.2
 */