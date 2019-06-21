package com.tencent.mm.pluginsdk.model.app;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public class f extends s
{
  protected static c.a ccO;
  public static String vbQ;
  public static String vbR;
  public static String vbS;
  public static String vbT;

  static
  {
    AppMethodBeat.i(79254);
    vbQ = "wxce6f23b478a3a2a2";
    vbR = "wx7302cee7c7d6d7d6";
    vbS = "wx6fa7e3bab7e15415";
    vbT = "wx3cc22b542de028d4";
    c.a locala = new c.a();
    locala.xDb = new Field[26];
    locala.columns = new String[27];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.xDd.put("appId", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appId";
    locala.columns[1] = "appName";
    locala.xDd.put("appName", "TEXT");
    localStringBuilder.append(" appName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appDiscription";
    locala.xDd.put("appDiscription", "TEXT");
    localStringBuilder.append(" appDiscription TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "appIconUrl";
    locala.xDd.put("appIconUrl", "TEXT");
    localStringBuilder.append(" appIconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "appStoreUrl";
    locala.xDd.put("appStoreUrl", "TEXT");
    localStringBuilder.append(" appStoreUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "appVersion";
    locala.xDd.put("appVersion", "INTEGER");
    localStringBuilder.append(" appVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "appWatermarkUrl";
    locala.xDd.put("appWatermarkUrl", "TEXT");
    localStringBuilder.append(" appWatermarkUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "packageName";
    locala.xDd.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "signature";
    locala.xDd.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "modifyTime";
    locala.xDd.put("modifyTime", "LONG");
    localStringBuilder.append(" modifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "appName_en";
    locala.xDd.put("appName_en", "TEXT");
    localStringBuilder.append(" appName_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "appName_tw";
    locala.xDd.put("appName_tw", "TEXT");
    localStringBuilder.append(" appName_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "appName_hk";
    locala.xDd.put("appName_hk", "TEXT");
    localStringBuilder.append(" appName_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "appDiscription_en";
    locala.xDd.put("appDiscription_en", "TEXT");
    localStringBuilder.append(" appDiscription_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "appDiscription_tw";
    locala.xDd.put("appDiscription_tw", "TEXT");
    localStringBuilder.append(" appDiscription_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "appType";
    locala.xDd.put("appType", "TEXT");
    localStringBuilder.append(" appType TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "openId";
    locala.xDd.put("openId", "TEXT");
    localStringBuilder.append(" openId TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "authFlag";
    locala.xDd.put("authFlag", "INTEGER");
    localStringBuilder.append(" authFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "appInfoFlag";
    locala.xDd.put("appInfoFlag", "INTEGER default '-1' ");
    localStringBuilder.append(" appInfoFlag INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "lvbuff";
    locala.xDd.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    locala.columns[21] = "serviceAppType";
    locala.xDd.put("serviceAppType", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[22] = "serviceAppInfoFlag";
    locala.xDd.put("serviceAppInfoFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppInfoFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[23] = "serviceShowFlag";
    locala.xDd.put("serviceShowFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceShowFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[24] = "appSupportContentType";
    locala.xDd.put("appSupportContentType", "LONG default '0' ");
    localStringBuilder.append(" appSupportContentType LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "svrAppSupportContentType";
    locala.xDd.put("svrAppSupportContentType", "LONG default '0' ");
    localStringBuilder.append(" svrAppSupportContentType LONG default '0' ");
    locala.columns[26] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(79254);
  }

  public f()
  {
    AppMethodBeat.i(79248);
    this.field_appId = "";
    this.field_appName = "";
    this.field_appDiscription = "";
    this.field_appIconUrl = "";
    this.field_appStoreUrl = "";
    this.field_appVersion = 0;
    this.field_appWatermarkUrl = "";
    this.field_packageName = "";
    this.field_status = 4;
    this.field_signature = "";
    this.field_modifyTime = 0L;
    this.field_appName_en = "";
    this.field_appName_tw = "";
    this.field_appName_hk = "";
    this.field_appDiscription_en = "";
    this.field_appDiscription_tw = "";
    this.field_appInfoFlag = 0;
    this.field_appType = "";
    this.field_openId = "";
    this.field_authFlag = 0;
    this.field_appInfoFlag = 0;
    ig("");
    jdMethod_if("");
    ih("");
    il("");
    im("");
    in("");
    AppMethodBeat.o(79248);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(79251);
    if ((!bo.isNullOrNil(this.field_appType)) && ((this.field_appType.startsWith("1")) || (this.field_appType.startsWith("6"))))
      this.field_appType = ("," + this.field_appType);
    ContentValues localContentValues = super.Hl();
    AppMethodBeat.o(79251);
    return localContentValues;
  }

  public final boolean dhA()
  {
    AppMethodBeat.i(79250);
    boolean bool;
    if (vbR.equals(this.field_appId))
    {
      bool = true;
      AppMethodBeat.o(79250);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79250);
    }
  }

  public final boolean dhx()
  {
    if (this.field_serviceAppType == 0);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final boolean dhy()
  {
    if ((this.field_serviceAppInfoFlag & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dhz()
  {
    if ((this.field_serviceAppInfoFlag & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(79252);
    if (paramObject == null)
      AppMethodBeat.o(79252);
    while (true)
    {
      return bool;
      if (paramObject == this)
      {
        bool = true;
        AppMethodBeat.o(79252);
      }
      else if (!(paramObject instanceof f))
      {
        AppMethodBeat.o(79252);
      }
      else
      {
        bool = ((f)paramObject).field_appId.equals(this.field_appId);
        AppMethodBeat.o(79252);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(79253);
    int i;
    if (!bo.isNullOrNil(this.field_appId))
    {
      i = this.field_appId.hashCode();
      AppMethodBeat.o(79253);
    }
    while (true)
    {
      return i;
      i = super.hashCode();
      AppMethodBeat.o(79253);
    }
  }

  public final boolean xy()
  {
    boolean bool = false;
    AppMethodBeat.i(79249);
    if (bo.isNullOrNil(this.field_appType))
      AppMethodBeat.o(79249);
    while (true)
    {
      return bool;
      String[] arrayOfString = this.field_appType.split(",");
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        AppMethodBeat.o(79249);
      }
      else
      {
        int i = arrayOfString.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label97;
          if (arrayOfString[j].equals("1"))
          {
            bool = true;
            AppMethodBeat.o(79249);
            break;
          }
        }
        label97: AppMethodBeat.o(79249);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.f
 * JD-Core Version:    0.6.2
 */