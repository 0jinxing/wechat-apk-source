package com.tencent.mm.modelstat;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class p
{
  public static String I(bi parambi)
  {
    AppMethodBeat.i(35595);
    if (parambi == null)
    {
      parambi = "";
      AppMethodBeat.o(35595);
    }
    while (true)
    {
      return parambi;
      Object localObject = null;
      if (parambi.bAA())
      {
        localObject = j.b.me(parambi.field_content);
        if ((localObject == null) || (bo.isNullOrNil(((j.b)localObject).cMn)))
        {
          parambi = "";
          AppMethodBeat.o(35595);
        }
        else
        {
          localObject = ((j.b)localObject).cMn;
        }
      }
      else if (parambi.bwt())
      {
        parambi = u.ut(parambi.field_imgPath);
        if ((parambi == null) || (bo.isNullOrNil(parambi.cMn)))
        {
          parambi = "";
          AppMethodBeat.o(35595);
        }
        else
        {
          localObject = parambi.cMn;
        }
      }
      else
      {
        AppMethodBeat.o(35595);
        parambi = (bi)localObject;
      }
    }
  }

  public static String a(cdh paramcdh)
  {
    AppMethodBeat.i(35594);
    String str2;
    if (paramcdh != null)
    {
      Object localObject = paramcdh.xcW;
      String str1 = "";
      str2 = str1;
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = ((String)localObject).split("\\|");
        str2 = str1;
        if (localObject != null)
        {
          str2 = str1;
          if (localObject.length > 0)
            str2 = localObject[0];
        }
      }
    }
    while (true)
    {
      try
      {
        paramcdh = String.format("expId=%d&adgroup_id=%s&snsId=%s", new Object[] { Integer.valueOf(paramcdh.xcX), URLEncoder.encode(str2, "UTF-8"), paramcdh.xcV });
        AppMethodBeat.o(35594);
        return paramcdh;
      }
      catch (UnsupportedEncodingException paramcdh)
      {
        ab.e("MicroMsg.SnsStatExtUtil", "", new Object[] { paramcdh });
      }
      paramcdh = "";
      AppMethodBeat.o(35594);
    }
  }

  public static String a(String paramString, PString paramPString)
  {
    AppMethodBeat.i(35593);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(35593);
    }
    while (true)
    {
      return paramString;
      Object localObject = Base64.decode(paramString, 0);
      paramString = new cdg();
      try
      {
        paramString.parseFrom((byte[])localObject);
        String str = paramString.xcS.xcW;
        localObject = paramString.xcS.xcV;
        localObject = String.format("snsId=%s&uxInfo=%s&source=%d&snsStatExt=%s", new Object[] { URLEncoder.encode(str, "UTF-8"), URLEncoder.encode((String)localObject, "UTF-8"), Integer.valueOf(paramString.xcS.cvd), URLEncoder.encode(a(paramString.xcS), "UTF-8") });
        if (paramString.xcU == null);
        for (paramString = ""; ; paramString = paramString.xcU.mVX)
        {
          paramPString.value = paramString;
          AppMethodBeat.o(35593);
          paramString = (String)localObject;
          break;
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.SnsStatExtUtil", paramString, "", new Object[0]);
        paramString = "";
        AppMethodBeat.o(35593);
      }
    }
  }

  public static void a(String paramString, d paramd)
  {
    AppMethodBeat.i(35589);
    if (paramd == null)
      AppMethodBeat.o(35589);
    while (true)
    {
      return;
      b(paramString, paramd);
      AppMethodBeat.o(35589);
    }
  }

  public static void a(String paramString, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(35591);
    if (paramStringBuilder == null)
    {
      AppMethodBeat.o(35591);
      return;
    }
    paramString = tK(paramString);
    StringBuilder localStringBuilder = paramStringBuilder.append(",");
    if (paramString == null);
    for (int i = -1; ; i = paramString.cvd)
    {
      localStringBuilder.append(i);
      paramStringBuilder.append(",").append(a(paramString));
      AppMethodBeat.o(35591);
      break;
    }
  }

  public static void b(String paramString, d paramd)
  {
    AppMethodBeat.i(35590);
    if ((bo.isNullOrNil(paramString)) || (paramd == null))
    {
      AppMethodBeat.o(35590);
      return;
    }
    cdh localcdh = tK(paramString);
    paramString = new StringBuilder();
    if (localcdh == null);
    for (int i = -1; ; i = localcdh.cvd)
    {
      paramd.l("Source", i + ",");
      paramd.l("SnsStatExt", a(localcdh));
      AppMethodBeat.o(35590);
      break;
    }
  }

  public static cdh tK(String paramString)
  {
    AppMethodBeat.i(35592);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(35592);
    }
    while (true)
    {
      return paramString;
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      paramString = new cdg();
      try
      {
        paramString.parseFrom(arrayOfByte);
        paramString = paramString.xcS;
        AppMethodBeat.o(35592);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.SnsStatExtUtil", "", new Object[] { localException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.p
 * JD-Core Version:    0.6.2
 */