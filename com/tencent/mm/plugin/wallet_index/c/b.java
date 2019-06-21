package com.tencent.mm.plugin.wallet_index.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public int nqa;
  public String nqb;
  public int tQZ = 0;

  private b(int paramInt, String paramString)
  {
    this.nqa = paramInt;
    this.nqb = paramString;
  }

  public static b bu(int paramInt, String paramString)
  {
    int i = 6;
    int j = 2131305769;
    AppMethodBeat.i(48175);
    int k;
    String str;
    int m;
    if (paramInt <= -15001)
    {
      k = paramInt;
      str = paramString;
      m = j;
      ab.i("MicroMsg.IapResult", "code : " + paramInt + ", errMsg : " + str + ", convert to errCode : " + k);
      if (!bo.isNullOrNil(str))
        break label396;
      paramString = new b(k, ah.getContext().getString(m));
      AppMethodBeat.o(48175);
    }
    while (true)
    {
      return paramString;
      m = j;
      k = i;
      str = paramString;
      switch (paramInt)
      {
      case 106:
      case 100000001:
      default:
        m = j;
        k = i;
        str = paramString;
        break;
      case 0:
        m = 2131305768;
        k = paramInt;
        str = paramString;
        break;
      case 1:
      case 7:
        m = 2131305770;
        k = paramInt;
        str = paramString;
        break;
      case 103:
      case 104:
      case 100000002:
        k = 100000002;
        m = 2131305767;
        str = paramString;
        break;
      case 6:
        paramString = new b(6, paramString);
        AppMethodBeat.o(48175);
        break;
      case 109:
        m = 2131305771;
        k = paramInt;
        str = paramString;
        break;
      case 110:
        m = 2131305773;
        k = paramInt;
        str = paramString;
        break;
      case 111:
        m = 2131305774;
        k = paramInt;
        str = paramString;
        break;
      case 112:
        m = 2131305772;
        k = paramInt;
        str = paramString;
        break;
      case 113:
        k = paramInt;
        m = j;
        str = paramString;
        break;
      case 3:
      case 105:
        k = 3;
        str = "Google Play not install";
        m = j;
        break;
        label396: paramString = new b(k, str);
        AppMethodBeat.o(48175);
      }
    }
  }

  public final boolean cSU()
  {
    if ((this.nqa == 104) || (this.nqa == 100000002));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cSV()
  {
    boolean bool = true;
    AppMethodBeat.i(48176);
    int i;
    if (this.nqa == 0)
    {
      i = 1;
      if ((i != 0) || (cSU()))
        break label39;
      AppMethodBeat.o(48176);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label39: AppMethodBeat.o(48176);
      bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(48177);
    String str = "IapResult: " + this.nqb;
    AppMethodBeat.o(48177);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.b
 * JD-Core Version:    0.6.2
 */