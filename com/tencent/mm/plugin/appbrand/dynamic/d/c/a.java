package com.tencent.mm.plugin.appbrand.dynamic.d.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
  implements com.tencent.mm.z.d.a
{
  private static final int hnY;
  private byte[] hnZ;
  private String id;

  static
  {
    AppMethodBeat.i(10901);
    hnY = -bo.getInt(ae.giu, 0);
    AppMethodBeat.o(10901);
  }

  public a(String paramString, byte[] paramArrayOfByte)
  {
    this.id = paramString;
    this.hnZ = paramArrayOfByte;
  }

  public final boolean jB(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(10900);
    int i = hnY;
    if (i == -1)
    {
      ab.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm on", new Object[] { this.id, Integer.valueOf(paramInt) });
      paramInt = 1;
      if (paramInt != 1)
        break label149;
      AppMethodBeat.o(10900);
    }
    while (true)
    {
      return bool;
      if (i == -2)
      {
        ab.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm off", new Object[] { this.id, Integer.valueOf(paramInt) });
        paramInt = 0;
        break;
      }
      if (paramInt == -2)
      {
        paramInt = 1;
        break;
      }
      if (paramInt == -1)
      {
        paramInt = 0;
        break;
      }
      if ((this.hnZ == null) || (paramInt < 0) || (paramInt >= this.hnZ.length))
      {
        paramInt = 0;
        break;
      }
      paramInt = this.hnZ[paramInt];
      break;
      label149: AppMethodBeat.o(10900);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.c.a
 * JD-Core Version:    0.6.2
 */