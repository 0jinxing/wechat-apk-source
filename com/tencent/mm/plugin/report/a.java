package com.tencent.mm.plugin.report;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import junit.framework.Assert;

public abstract class a
{
  private static boolean pWV = false;
  private StringBuffer pWW = new StringBuffer();

  private void fO(String paramString1, String paramString2)
  {
    ab.w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", new Object[] { Integer.valueOf(getId()), paramString1, paramString2 });
    this.pWW.append(paramString1).append(":").append(paramString2).append("\r\n");
  }

  protected static boolean getBoolean(String paramString)
  {
    boolean bool = false;
    if (bo.getInt(paramString, 0) != 0)
      bool = true;
    return bool;
  }

  public static void kh(boolean paramBoolean)
  {
    pWV = paramBoolean;
  }

  public static String r(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length <= 0)
      ab.w("MicroMsg.AbsReportStruct", "vals is null, use '' as value");
    StringBuilder localStringBuilder;
    for (paramArrayOfObject = ""; ; paramArrayOfObject = localStringBuilder.toString())
    {
      return paramArrayOfObject;
      localStringBuilder = new StringBuilder();
      int i = paramArrayOfObject.length - 1;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(String.valueOf(paramArrayOfObject[j])).append(',');
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
    }
  }

  public abstract String Fj();

  public abstract String Fk();

  protected final boolean VX(String paramString)
  {
    boolean bool = false;
    if (bo.isNullOrNil(paramString))
      fO("", "check rpt value is null.");
    while (true)
    {
      return bool;
      if (paramString.length() >= 7168)
        fO("", "check rpt value more than 7k.");
      else
        bool = true;
    }
  }

  protected final boolean ai(String paramString, long paramLong)
  {
    boolean bool = false;
    if (paramLong <= 0L)
      fO(paramString, String.valueOf(paramLong));
    while (true)
    {
      return bool;
      if (paramLong >= 3600000L)
        fO(paramString, String.valueOf(paramLong));
      else
        bool = true;
    }
  }

  protected final boolean aj(String paramString, long paramLong)
  {
    boolean bool = true;
    if (paramLong <= 151473600000L)
    {
      bool = false;
      fO(paramString, String.valueOf(paramLong));
    }
    return bool;
  }

  public final boolean ajK()
  {
    boolean bool1 = true;
    int i = getId();
    String str = Fj();
    ab.v("MicroMsg.AbsReportStruct", "report %d %s", new Object[] { Integer.valueOf(getId()), Fj() });
    if ((i > 0) && (!bo.isNullOrNil(str)))
    {
      h.pYm.X(getId(), Fj());
      bool2 = bool1;
      if (pWV)
        j.cgu().aa(Fj(), Fk(), "\r\n\r\n error:\r\n" + this.pWW.toString());
    }
    for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  protected final boolean ak(String paramString, long paramLong)
  {
    boolean bool = true;
    if (paramLong <= 151473600L)
    {
      bool = false;
      fO(paramString, String.valueOf(paramLong));
    }
    return bool;
  }

  public abstract int getId();

  protected final String t(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str;
    if (bo.isNullOrNil(paramString2))
      str = paramString2;
    do
    {
      return str;
      str = paramString2;
    }
    while (!paramString2.contains(","));
    if ((paramBoolean) && ((f.DEBUG) || (f.IS_FLAVOR_RED)))
      Assert.assertTrue("value contain comma, please confirm your logic.log id:" + getId() + " field:" + paramString1 + " value:" + paramString2, false);
    while (true)
    {
      str = paramString2.replace(',', ' ');
      break;
      fO(paramString1, "value contain comma, please confirm your logic. value :".concat(String.valueOf(paramString2)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.a
 * JD-Core Version:    0.6.2
 */