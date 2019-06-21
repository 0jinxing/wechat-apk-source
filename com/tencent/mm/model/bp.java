package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bcr;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.z;

public final class bp
{
  public String countryCode = "";
  public int dtS = 0;
  public int dub = 0;
  public String dug = "";
  private String fnm = "";
  private String fnn = "";
  public String fno = "";
  public String fnp = "";
  public String signature = "";

  public static bcr a(bp parambp)
  {
    AppMethodBeat.i(59929);
    g.RP().Ry().set(12289, Integer.valueOf(parambp.dub));
    g.RP().Ry().set(12290, Integer.valueOf(parambp.dtS));
    if (a.am((String)g.RP().Ry().get(12293, null), parambp.getProvince()))
      g.RP().Ry().set(12293, parambp.getProvince());
    if (a.am((String)g.RP().Ry().get(12292, null), parambp.getCity()))
      g.RP().Ry().set(12292, parambp.getCity());
    if (a.am((String)g.RP().Ry().get(12291, null), parambp.signature))
      g.RP().Ry().set(12291, parambp.signature);
    if (a.am((String)g.RP().Ry().get(12307, null), parambp.dug))
      g.RP().Ry().set(12307, parambp.dug);
    if (a.am((String)g.RP().Ry().get(12324, null), parambp.countryCode))
      g.RP().Ry().set(12324, parambp.countryCode);
    if (a.am((String)g.RP().Ry().get(12325, null), parambp.fnp))
      g.RP().Ry().set(12325, parambp.fnp);
    if (a.am((String)g.RP().Ry().get(12326, null), parambp.fno))
      g.RP().Ry().set(12326, parambp.fno);
    bcr localbcr = new bcr();
    localbcr.wGW = 128;
    localbcr.wcB = new bts().alV("");
    localbcr.wyX = new bts().alV("");
    localbcr.vCf = 0;
    localbcr.wGX = new bts().alV("");
    localbcr.wGY = new bts().alV("");
    localbcr.jBT = 0;
    byte[] arrayOfByte1 = com.tencent.mm.vfs.e.e("", 0, -1);
    byte[] arrayOfByte2;
    if (arrayOfByte1 == null)
    {
      arrayOfByte2 = new byte[0];
      localbcr.wGU = new b(arrayOfByte2);
      if (arrayOfByte1 != null)
        break label577;
    }
    label577: for (int i = 0; ; i = arrayOfByte1.length)
    {
      localbcr.wGT = i;
      localbcr.guN = parambp.dtS;
      localbcr.guR = parambp.dub;
      localbcr.guQ = bo.nullAsNil(parambp.signature);
      localbcr.guP = bo.nullAsNil(parambp.fno);
      localbcr.guO = bo.nullAsNil(parambp.fnp);
      localbcr.vCi = 0;
      localbcr.wBV = bo.nullAsNil(parambp.dug);
      localbcr.wHd = 0;
      localbcr.guS = "";
      localbcr.wBX = 0;
      localbcr.wBW = "";
      localbcr.guW = bo.nullAsNil(parambp.countryCode);
      AppMethodBeat.o(59929);
      return localbcr;
      arrayOfByte2 = arrayOfByte1;
      break;
    }
  }

  public static bp aao()
  {
    AppMethodBeat.i(59927);
    bp localbp = new bp();
    localbp.dub = 1;
    localbp.dtS = bo.a((Integer)g.RP().Ry().get(12290, null), 0);
    localbp.fnm = ((String)g.RP().Ry().get(12293, null));
    localbp.fnn = ((String)g.RP().Ry().get(12292, null));
    localbp.signature = ((String)g.RP().Ry().get(12291, null));
    localbp.dug = ((String)g.RP().Ry().get(12307, null));
    localbp.countryCode = ((String)g.RP().Ry().get(12324, null));
    localbp.fnp = ((String)g.RP().Ry().get(12325, null));
    localbp.fno = ((String)g.RP().Ry().get(12326, null));
    AppMethodBeat.o(59927);
    return localbp;
  }

  public static bp aap()
  {
    AppMethodBeat.i(59928);
    bp localbp;
    if (bo.a((Integer)g.RP().Ry().get(12289, null), 0) == 0)
    {
      AppMethodBeat.o(59928);
      localbp = null;
    }
    while (true)
    {
      return localbp;
      localbp = aao();
      AppMethodBeat.o(59928);
    }
  }

  public final String getCity()
  {
    AppMethodBeat.i(59930);
    String str;
    if (!bo.isNullOrNil(this.countryCode))
    {
      if (bo.isNullOrNil(this.fnp))
        break label105;
      if (bo.isNullOrNil(this.fno))
      {
        RegionCodeDecoder.duj();
        this.fnn = RegionCodeDecoder.id(this.countryCode, this.fnp);
      }
    }
    else
    {
      if (!bo.isNullOrNil(this.fnn))
        break label114;
      str = bo.nullAsNil(this.fno);
      AppMethodBeat.o(59930);
    }
    while (true)
    {
      return str;
      RegionCodeDecoder.duj();
      this.fnn = RegionCodeDecoder.aD(this.countryCode, this.fnp, this.fno);
      break;
      label105: this.fnn = "";
      break;
      label114: str = this.fnn;
      AppMethodBeat.o(59930);
    }
  }

  public final String getProvince()
  {
    AppMethodBeat.i(59931);
    String str;
    if (!bo.isNullOrNil(this.countryCode))
    {
      if ((!bo.isNullOrNil(this.fnp)) && (!bo.isNullOrNil(this.fno)) && (RegionCodeDecoder.apQ(this.countryCode)))
      {
        RegionCodeDecoder.duj();
        this.fnm = RegionCodeDecoder.id(this.countryCode, this.fnp);
      }
    }
    else
    {
      if (!bo.isNullOrNil(this.fnm))
        break label107;
      str = bo.nullAsNil(this.fnp);
      AppMethodBeat.o(59931);
    }
    while (true)
    {
      return str;
      RegionCodeDecoder.duj();
      this.fnm = RegionCodeDecoder.apR(this.countryCode);
      break;
      label107: str = this.fnm;
      AppMethodBeat.o(59931);
    }
  }

  static final class a
  {
    public static boolean am(String paramString1, String paramString2)
    {
      boolean bool = true;
      AppMethodBeat.i(59924);
      if (bo.isNullOrNil(paramString1))
        AppMethodBeat.o(59924);
      while (true)
      {
        return bool;
        paramString1 = decode(encode(paramString1));
        if ((bo.isNullOrNil(paramString1)) || (!paramString1.equals(paramString2)))
        {
          AppMethodBeat.o(59924);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(59924);
        }
      }
    }

    private static String decode(String paramString)
    {
      AppMethodBeat.i(59926);
      String str = "";
      if ((bo.isNullOrNil(paramString)) || (paramString.length() % 2 != 0))
      {
        str = "";
        AppMethodBeat.o(59926);
      }
      while (true)
      {
        return str;
        int i = 0;
        try
        {
          while (i < paramString.length())
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            str = str + (char)Integer.parseInt(paramString.substring(i, i + 2), 16);
            i += 2;
          }
        }
        catch (Exception paramString)
        {
          str = "";
          AppMethodBeat.o(59926);
        }
        continue;
        AppMethodBeat.o(59926);
      }
    }

    private static String encode(String paramString)
    {
      int i = 0;
      AppMethodBeat.i(59925);
      char[] arrayOfChar = paramString.toCharArray();
      paramString = "";
      try
      {
        int j = arrayOfChar.length;
        while (i < j)
        {
          int k = arrayOfChar[i];
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramString = paramString + String.format("%02x", new Object[] { Integer.valueOf(k) });
          i++;
        }
      }
      catch (Exception paramString)
      {
        paramString = "";
        AppMethodBeat.o(59925);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(59925);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bp
 * JD-Core Version:    0.6.2
 */