package com.tencent.mm.plugin.welab.d.a;

import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cq;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a extends cq
{
  public static c.a ccO;
  private static final List<String> uMf;
  private Map<String, Field> uMe;

  static
  {
    AppMethodBeat.i(80598);
    c.a locala = new c.a();
    locala.xDb = new Field[46];
    locala.columns = new String[47];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "LabsAppId";
    locala.xDd.put("LabsAppId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" LabsAppId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "LabsAppId";
    locala.columns[1] = "expId";
    locala.xDd.put("expId", "TEXT default '' ");
    localStringBuilder.append(" expId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "Type";
    locala.xDd.put("Type", "INTEGER default '0' ");
    localStringBuilder.append(" Type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "BizType";
    locala.xDd.put("BizType", "INTEGER default '0' ");
    localStringBuilder.append(" BizType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "Switch";
    locala.xDd.put("Switch", "INTEGER default '0' ");
    localStringBuilder.append(" Switch INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "AllVer";
    locala.xDd.put("AllVer", "INTEGER default '0' ");
    localStringBuilder.append(" AllVer INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "DetailURL";
    locala.xDd.put("DetailURL", "TEXT");
    localStringBuilder.append(" DetailURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "WeAppUser";
    locala.xDd.put("WeAppUser", "TEXT");
    localStringBuilder.append(" WeAppUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "WeAppPath";
    locala.xDd.put("WeAppPath", "TEXT");
    localStringBuilder.append(" WeAppPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "Pos";
    locala.xDd.put("Pos", "INTEGER default '0' ");
    localStringBuilder.append(" Pos INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "TitleKey_android";
    locala.xDd.put("TitleKey_android", "TEXT");
    localStringBuilder.append(" TitleKey_android TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "Title_cn";
    locala.xDd.put("Title_cn", "TEXT");
    localStringBuilder.append(" Title_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "Title_hk";
    locala.xDd.put("Title_hk", "TEXT");
    localStringBuilder.append(" Title_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "Title_tw";
    locala.xDd.put("Title_tw", "TEXT");
    localStringBuilder.append(" Title_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "Title_en";
    locala.xDd.put("Title_en", "TEXT");
    localStringBuilder.append(" Title_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "Desc_cn";
    locala.xDd.put("Desc_cn", "TEXT");
    localStringBuilder.append(" Desc_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "Desc_hk";
    locala.xDd.put("Desc_hk", "TEXT");
    localStringBuilder.append(" Desc_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "Desc_tw";
    locala.xDd.put("Desc_tw", "TEXT");
    localStringBuilder.append(" Desc_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "Desc_en";
    locala.xDd.put("Desc_en", "TEXT");
    localStringBuilder.append(" Desc_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "Introduce_cn";
    locala.xDd.put("Introduce_cn", "TEXT");
    localStringBuilder.append(" Introduce_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "Introduce_hk";
    locala.xDd.put("Introduce_hk", "TEXT");
    localStringBuilder.append(" Introduce_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "Introduce_tw";
    locala.xDd.put("Introduce_tw", "TEXT");
    localStringBuilder.append(" Introduce_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "Introduce_en";
    locala.xDd.put("Introduce_en", "TEXT");
    localStringBuilder.append(" Introduce_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "starttime";
    locala.xDd.put("starttime", "LONG");
    localStringBuilder.append(" starttime LONG");
    localStringBuilder.append(", ");
    locala.columns[24] = "endtime";
    locala.xDd.put("endtime", "LONG");
    localStringBuilder.append(" endtime LONG");
    localStringBuilder.append(", ");
    locala.columns[25] = "sequence";
    locala.xDd.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[26] = "prioritylevel";
    locala.xDd.put("prioritylevel", "INTEGER");
    localStringBuilder.append(" prioritylevel INTEGER");
    localStringBuilder.append(", ");
    locala.columns[27] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[28] = "ThumbUrl_cn";
    locala.xDd.put("ThumbUrl_cn", "TEXT");
    localStringBuilder.append(" ThumbUrl_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "ThumbUrl_hk";
    locala.xDd.put("ThumbUrl_hk", "TEXT");
    localStringBuilder.append(" ThumbUrl_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "ThumbUrl_tw";
    locala.xDd.put("ThumbUrl_tw", "TEXT");
    localStringBuilder.append(" ThumbUrl_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "ThumbUrl_en";
    locala.xDd.put("ThumbUrl_en", "TEXT");
    localStringBuilder.append(" ThumbUrl_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "ImgUrl_android_cn";
    locala.xDd.put("ImgUrl_android_cn", "TEXT");
    localStringBuilder.append(" ImgUrl_android_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "ImgUrl_android_hk";
    locala.xDd.put("ImgUrl_android_hk", "TEXT");
    localStringBuilder.append(" ImgUrl_android_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "ImgUrl_android_tw";
    locala.xDd.put("ImgUrl_android_tw", "TEXT");
    localStringBuilder.append(" ImgUrl_android_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "ImgUrl_android_en";
    locala.xDd.put("ImgUrl_android_en", "TEXT");
    localStringBuilder.append(" ImgUrl_android_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[36] = "RedPoint";
    locala.xDd.put("RedPoint", "INTEGER");
    localStringBuilder.append(" RedPoint INTEGER");
    localStringBuilder.append(", ");
    locala.columns[37] = "WeAppDebugMode";
    locala.xDd.put("WeAppDebugMode", "INTEGER");
    localStringBuilder.append(" WeAppDebugMode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[38] = "idkey";
    locala.xDd.put("idkey", "INTEGER");
    localStringBuilder.append(" idkey INTEGER");
    localStringBuilder.append(", ");
    locala.columns[39] = "idkeyValue";
    locala.xDd.put("idkeyValue", "INTEGER");
    localStringBuilder.append(" idkeyValue INTEGER");
    localStringBuilder.append(", ");
    locala.columns[40] = "Icon";
    locala.xDd.put("Icon", "TEXT");
    localStringBuilder.append(" Icon TEXT");
    localStringBuilder.append(", ");
    locala.columns[41] = "ImgUrl_cn";
    locala.xDd.put("ImgUrl_cn", "TEXT");
    localStringBuilder.append(" ImgUrl_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[42] = "ImgUrl_hk";
    locala.xDd.put("ImgUrl_hk", "TEXT");
    localStringBuilder.append(" ImgUrl_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[43] = "ImgUrl_tw";
    locala.xDd.put("ImgUrl_tw", "TEXT");
    localStringBuilder.append(" ImgUrl_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[44] = "ImgUrl_en";
    locala.xDd.put("ImgUrl_en", "TEXT");
    localStringBuilder.append(" ImgUrl_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[45] = "bItemFromXExpt";
    locala.xDd.put("bItemFromXExpt", "INTEGER");
    localStringBuilder.append(" bItemFromXExpt INTEGER");
    locala.columns[46] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    uMf = Arrays.asList(new String[] { "_cn", "_hk", "_tw", "_en" });
    AppMethodBeat.o(80598);
  }

  public a()
  {
    AppMethodBeat.i(80584);
    this.uMe = new HashMap();
    AppMethodBeat.o(80584);
  }

  private String Eq(String paramString)
  {
    AppMethodBeat.i(80594);
    Object localObject = (Field)this.uMe.get(paramString);
    if (localObject == null);
    while (true)
      try
      {
        Field localField = a.class.getField(paramString);
        localObject = localField;
      }
      catch (NoSuchFieldException paramString)
      {
        try
        {
          this.uMe.put(paramString, localObject);
          if (localObject != null)
          {
            try
            {
              paramString = (String)((Field)localObject).get(this);
              AppMethodBeat.o(80594);
              return paramString;
              paramString = paramString;
              ab.w("LabAppInfo", bo.l(paramString));
            }
            catch (IllegalAccessException paramString)
            {
              ab.w("LabAppInfo", bo.l(paramString));
            }
          }
          else
          {
            paramString = "";
            AppMethodBeat.o(80594);
          }
        }
        catch (NoSuchFieldException paramString)
        {
        }
      }
  }

  private String agS(String paramString)
  {
    AppMethodBeat.i(80593);
    Iterator localIterator = uMf.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      str = Eq(paramString + str);
      if (!TextUtils.isEmpty(str))
      {
        AppMethodBeat.o(80593);
        paramString = str;
      }
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(80593);
    }
  }

  private String hq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80592);
    paramString2 = Eq(paramString1 + paramString2);
    if (!TextUtils.isEmpty(paramString2))
    {
      AppMethodBeat.o(80592);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      paramString1 = agS(paramString1);
      AppMethodBeat.o(80592);
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String agR(String paramString)
  {
    AppMethodBeat.i(80591);
    String str1 = Eq(paramString + "Key_android");
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = ah.getPackageName();
      int i = ah.getResources().getIdentifier(str1, "string", str2);
      str1 = ah.getResources().getString(i);
      if (!TextUtils.isEmpty(str1))
      {
        AppMethodBeat.o(80591);
        paramString = str1;
      }
    }
    while (true)
    {
      return paramString;
      str1 = aa.gw(ah.getContext());
      if (aa.doo())
      {
        paramString = hq(paramString, "_cn");
        AppMethodBeat.o(80591);
      }
      else if ("zh_HK".equals(str1))
      {
        paramString = hq(paramString, "_hk");
        AppMethodBeat.o(80591);
      }
      else if ("zh_TW".equals(str1))
      {
        paramString = hq(paramString, "_tw");
        AppMethodBeat.o(80591);
      }
      else
      {
        paramString = hq(paramString, "_en");
        AppMethodBeat.o(80591);
      }
    }
  }

  public final boolean ddt()
  {
    AppMethodBeat.i(80595);
    boolean bool;
    if ((isExpired()) || (this.field_Switch == 3))
    {
      bool = true;
      AppMethodBeat.o(80595);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80595);
    }
  }

  public final boolean ddu()
  {
    boolean bool = true;
    AppMethodBeat.i(80596);
    if ((isRunning()) && ((this.field_Switch == 2) || (this.field_Switch == 1)))
      AppMethodBeat.o(80596);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80596);
    }
  }

  public final void ddv()
  {
    AppMethodBeat.i(80597);
    if ((this.field_idkey > 0) && (this.field_idkeyValue >= 0))
      h.pYm.a(this.field_idkey, this.field_idkeyValue, 1L, false);
    AppMethodBeat.o(80597);
  }

  public final boolean ddw()
  {
    boolean bool = true;
    if (this.field_bItemFromXExpt == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean ddx()
  {
    boolean bool = true;
    if (this.field_status == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(80586);
    boolean bool;
    if (paramObject == this)
    {
      bool = true;
      AppMethodBeat.o(80586);
    }
    while (true)
    {
      return bool;
      if ((paramObject instanceof a))
      {
        bool = ((a)paramObject).field_LabsAppId.equals(this.field_LabsAppId);
        AppMethodBeat.o(80586);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(80586);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(80585);
    int i = this.field_LabsAppId.hashCode();
    AppMethodBeat.o(80585);
    return i;
  }

  public final boolean isExpired()
  {
    AppMethodBeat.i(80589);
    boolean bool;
    if ((isValid()) && (System.currentTimeMillis() / 1000L >= this.field_endtime))
    {
      bool = true;
      AppMethodBeat.o(80589);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80589);
    }
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(80588);
    boolean bool;
    if ((isValid()) && (System.currentTimeMillis() / 1000L >= this.field_starttime) && (System.currentTimeMillis() / 1000L < this.field_endtime))
    {
      bool = true;
      AppMethodBeat.o(80588);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80588);
    }
  }

  public final boolean isValid()
  {
    AppMethodBeat.i(80587);
    boolean bool;
    if ((!TextUtils.isEmpty(this.field_LabsAppId)) && (!this.field_LabsAppId.equals("labs1de6f3")))
    {
      bool = true;
      AppMethodBeat.o(80587);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80587);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(80590);
    String str = "[appid " + this.field_LabsAppId + ",title " + this.field_Title_cn + ", exptId " + this.field_expId + "]";
    AppMethodBeat.o(80590);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.d.a.a
 * JD-Core Version:    0.6.2
 */