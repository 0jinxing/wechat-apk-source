package com.tencent.mm.plugin.qqmail.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
{
  String cEV;
  String ptN;
  private String[] pur;
  private String[] pus;
  private String[] put;
  String puu;
  a[] puv;
  a[] puw;

  public q(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2)
  {
    AppMethodBeat.i(67973);
    this.cEV = null;
    this.pur = null;
    this.pus = null;
    this.put = null;
    this.ptN = null;
    this.puu = null;
    this.puv = null;
    this.puw = null;
    if (!bo.isNullOrNil(paramString1))
      this.cEV = paramString1;
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      this.pur = paramArrayOfString1;
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
        break label134;
      this.pus = paramArrayOfString2;
      label89: if ((paramArrayOfString3 == null) || (paramArrayOfString3.length <= 0))
        break label142;
      this.put = paramArrayOfString3;
      label106: if (bo.isNullOrNil(paramString2))
        break label150;
      this.ptN = paramString2;
      AppMethodBeat.o(67973);
    }
    while (true)
    {
      return;
      this.pur = null;
      break;
      label134: this.pus = null;
      break label89;
      label142: this.put = null;
      break label106;
      label150: this.ptN = null;
      AppMethodBeat.o(67973);
    }
  }

  public static String Vk(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(67977);
    int i = "abEdf4&^^*sxcSD$%&1sdfz@!~AZcT4s322dA%^&&*$##C$%__SDy4d_(*%".length();
    paramString = paramString + "d$3^&xRw%&*_(";
    try
    {
      paramString = g.x(paramString.getBytes());
      arrayOfChar = new char[paramString.length() * 2];
      int j = 0;
      int k = 0;
      while (j < paramString.length())
      {
        int m = k + 1;
        arrayOfChar[k] = paramString.charAt(j);
        int n = paramString.charAt(j);
        k = m + 1;
        int i1 = paramString.charAt(j);
        arrayOfChar[m] = ((char)(char)("abEdf4&^^*sxcSD$%&1sdfz@!~AZcT4s322dA%^&&*$##C$%__SDy4d_(*%".charAt(n % i) + i1));
        j++;
      }
    }
    catch (Exception paramString)
    {
      char[] arrayOfChar;
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MailContentFormatter", paramString, "", new Object[0]);
        ab.e("MicroMsg.MailContentFormatter", "attachIdToKey, error:" + paramString.getLocalizedMessage());
        paramString = null;
      }
      paramString = new String(arrayOfChar);
    }
    try
    {
      paramString = g.x(paramString.getBytes("ISO-8859-1"));
      AppMethodBeat.o(67977);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MailContentFormatter", paramString, "", new Object[0]);
        ab.e("MicroMsg.MailContentFormatter", "attachIdToKey, error:" + paramString.getLocalizedMessage());
        paramString = localObject;
      }
    }
  }

  final String ccr()
  {
    AppMethodBeat.i(67974);
    Object localObject1;
    if (this.pur != null)
    {
      localObject1 = new StringBuilder("");
      ((StringBuilder)localObject1).append("To: ");
      for (String str : this.pur)
      {
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(str.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(">");
        ((StringBuilder)localObject1).append(" ,");
      }
      ??? = ((StringBuilder)localObject1).toString();
      ??? = ((String)???).lastIndexOf(" ,");
      localObject1 = ???;
      if (??? != -1)
        localObject1 = ((String)???).substring(0, ???);
      AppMethodBeat.o(67974);
    }
    while (true)
    {
      return localObject1;
      localObject1 = null;
      AppMethodBeat.o(67974);
    }
  }

  final String ccs()
  {
    AppMethodBeat.i(67975);
    Object localObject2;
    if (this.pus != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("");
      localStringBuilder.append("Cc: ");
      for (localObject2 : this.pus)
      {
        localStringBuilder.append("\"");
        localStringBuilder.append("=?utf-8?B?");
        localStringBuilder.append(Base64.encodeToString(((String)localObject2).getBytes(), 2));
        localStringBuilder.append("?=");
        localStringBuilder.append("\"");
        localStringBuilder.append(" ");
        localStringBuilder.append("<");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(">");
        localStringBuilder.append(" ,");
      }
      ??? = localStringBuilder.toString();
      ??? = ((String)???).lastIndexOf(" ,");
      localObject2 = ???;
      if (??? != -1)
        localObject2 = ((String)???).substring(0, ???);
      AppMethodBeat.o(67975);
    }
    while (true)
    {
      return localObject2;
      localObject2 = null;
      AppMethodBeat.o(67975);
    }
  }

  final String cct()
  {
    AppMethodBeat.i(67976);
    Object localObject2;
    if (this.put != null)
    {
      Object localObject1 = new StringBuilder("");
      ((StringBuilder)localObject1).append("Bcc: ");
      for (localObject2 : this.pus)
      {
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(((String)localObject2).getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(">");
        ((StringBuilder)localObject1).append(" ,");
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      ??? = ((String)localObject1).lastIndexOf(" ,");
      localObject2 = localObject1;
      if (??? != -1)
        localObject2 = ((String)localObject1).substring(0, ???);
      AppMethodBeat.o(67976);
    }
    while (true)
    {
      return localObject2;
      localObject2 = null;
      AppMethodBeat.o(67976);
    }
  }

  public static final class a
  {
    String fileName;
    int fileSize;
    String name;
    String pux;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.q
 * JD-Core Version:    0.6.2
 */