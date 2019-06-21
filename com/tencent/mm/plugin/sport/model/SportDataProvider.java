package com.tencent.mm.plugin.sport.model;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.sdk.platformtools.bo;

public class SportDataProvider extends ContentProvider
{
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(93684);
    if (!bo.isNullOrNil(paramString1));
    try
    {
      int j = paramString1.hashCode();
      switch (j)
      {
      default:
        i = -1;
        label75: switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
        break;
      case 1522180184:
      case -2048296977:
      case -1403048597:
      case -295950539:
      case -102943798:
      }
      while (true)
      {
        paramUri = null;
        AppMethodBeat.o(93684);
        while (true)
        {
          return paramUri;
          if (!paramString1.equals("getTodayStepCount"))
            break;
          break label75;
          if (!paramString1.equals("clearConfig"))
            break;
          i = 1;
          break label75;
          if (!paramString1.equals("updateConfig"))
            break;
          i = 2;
          break label75;
          if (!paramString1.equals("updateStep"))
            break;
          i = 3;
          break label75;
          if (!paramString1.equals("Key_mmSensorChange"))
            break;
          i = 4;
          break label75;
          paramUri = new android/os/Bundle;
          paramUri.<init>();
          paramUri.putLong("TodayStep", g.cwn());
          paramUri.putLong("TodaySaveTime", g.cwo());
          paramUri = new i(new String[] { "Step" }, paramUri);
          AppMethodBeat.o(93684);
        }
        if (com.tencent.mm.kernel.g.M(PluginSport.class) != null)
          ((PluginSport)com.tencent.mm.kernel.g.M(PluginSport.class)).getSportFileStorage().reset();
      }
    }
    catch (Exception paramUri)
    {
      while (true)
      {
        continue;
        if (com.tencent.mm.kernel.g.M(PluginSport.class) != null)
        {
          h.ZS(paramArrayOfString2[0]);
          ((PluginSport)com.tencent.mm.kernel.g.M(PluginSport.class)).getPushSportStepDetector().cwj();
          continue;
          if (com.tencent.mm.kernel.g.M(PluginSport.class) != null)
          {
            ((PluginSport)com.tencent.mm.kernel.g.M(PluginSport.class)).getPushSportStepDetector().cwj();
            continue;
            if (com.tencent.mm.kernel.g.M(PluginSport.class) != null)
            {
              long l1 = Long.valueOf(paramArrayOfString2[0]).longValue();
              long l2 = Long.valueOf(paramArrayOfString2[1]).longValue();
              ((PluginSport)com.tencent.mm.kernel.g.M(PluginSport.class)).getPushSportStepDetector().b(l1, l2, "MM");
            }
          }
        }
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.SportDataProvider
 * JD-Core Version:    0.6.2
 */