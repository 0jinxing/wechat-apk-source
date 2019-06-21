package com.tencent.mm.plugin.music.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class e
{
  private static final Pattern hnu;
  private static final String[] oPr;
  private static String oPs;
  private static String oPt;

  static
  {
    AppMethodBeat.i(137709);
    oPr = new String[] { "#", "?", "&" };
    oPs = null;
    oPt = null;
    hnu = Pattern.compile("songid=([0-9]+)");
    AppMethodBeat.o(137709);
  }

  private static String N(com.tencent.mm.aw.e parame)
  {
    Object localObject = null;
    AppMethodBeat.i(137707);
    String str;
    if (parame != null)
      if (!bo.isNullOrNil(parame.fKa))
      {
        str = parame.fKa;
        if (str != null)
          break label80;
        AppMethodBeat.o(137707);
        parame = localObject;
      }
    while (true)
    {
      return parame;
      if (!bo.isNullOrNil(parame.fKc))
      {
        str = parame.fKc;
        break;
      }
      if (!bo.isNullOrNil(parame.fKb))
      {
        str = parame.fKb;
        break;
      }
      str = null;
      break;
      label80: str = Tx(parame.fKa);
      if (str != null)
      {
        AppMethodBeat.o(137707);
        parame = str;
      }
      else
      {
        str = Tx(parame.fKc);
        if (str != null)
        {
          AppMethodBeat.o(137707);
          parame = str;
        }
        else
        {
          parame = Tx(parame.fKb);
          AppMethodBeat.o(137707);
        }
      }
    }
  }

  public static com.tencent.mm.aw.e O(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137708);
    if (parame != null)
    {
      parame.fKj = Tz(parame.fKa);
      if (parame.fKj <= 0)
      {
        parame.fKj = Tz(parame.fKc);
        if (parame.fKj <= 0)
          parame.fKj = Tz(parame.fKb);
      }
    }
    if ((parame == null) || (N(parame) == null))
      AppMethodBeat.o(137708);
    while (true)
    {
      return parame;
      long l = System.currentTimeMillis();
      Object localObject1 = N(parame);
      if (localObject1 == null)
      {
        AppMethodBeat.o(137708);
        continue;
      }
      ab.d("MicroMsg.Music.MusicUrlUtil", "bcdUrl: %s", new Object[] { localObject1 });
      Object localObject2 = new String(Ty((String)localObject1));
      int i = ((String)localObject2).indexOf("{");
      localObject1 = localObject2;
      if (i != -1)
        localObject1 = ((String)localObject2).substring(i);
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        parame.fKj = ((JSONObject)localObject2).optInt("song_ID");
        if (bo.isNullOrNil(parame.fJW))
          parame.fJW = ((JSONObject)localObject2).optString("song_Name");
        if (bo.isNullOrNil(parame.fKb))
          parame.fKb = ((JSONObject)localObject2).optString("song_WapLiveURL");
        if (bo.isNullOrNil(parame.fKa))
          parame.fKa = ((JSONObject)localObject2).optString("song_WifiURL");
        if (bo.isNullOrNil(parame.fJY))
          parame.fJY = ((JSONObject)localObject2).optString("song_Album");
        if (bo.isNullOrNil(parame.fJX))
          parame.fJX = ((JSONObject)localObject2).optString("song_Singer");
        if (parame.fKj == 0)
          parame.fKj = Tz(oPs);
        ab.i("MicroMsg.Music.MusicUrlUtil", "parseBCDForMusicWrapper %s: expend: %d %d", new Object[] { parame.fJU, Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(parame.fKj) });
        AppMethodBeat.o(137708);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", localException, "", new Object[0]);
      }
    }
  }

  public static boolean Tw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137700);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(137700);
      return bool;
    }
    Uri localUri = Uri.parse(paramString);
    String str = "";
    if (localUri != null)
      str = localUri.getHost();
    if (str != null)
    {
      bool = localUri.getHost().contains(".qq.com");
      ab.w("MicroMsg.Music.MusicUrlUtil", "url %s match ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
    }
    while (true)
    {
      AppMethodBeat.o(137700);
      break;
      ab.i("MicroMsg.Music.MusicUrlUtil", "host is null, url is not match .qq.com");
      bool = false;
    }
  }

  private static String Tx(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(137703);
    Object localObject2;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(137703);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if ((oPs != null) && (paramString.equals(oPs)))
      {
        localObject2 = oPt;
        AppMethodBeat.o(137703);
      }
      else
      {
        Object localObject3 = "";
        String[] arrayOfString = oPr;
        int i = arrayOfString.length;
        int j = 0;
        localObject2 = null;
        Object localObject4;
        Object localObject5;
        while (true)
        {
          localObject4 = localObject3;
          localObject5 = localObject2;
          if (j >= i)
            break;
          localObject3 = arrayOfString[j];
          localObject3 = (String)localObject3 + "p=";
          if (paramString.contains((CharSequence)localObject3))
            localObject2 = paramString;
          localObject4 = localObject3;
          localObject5 = localObject2;
          if (localObject2 != null)
            break;
          j++;
        }
        if (localObject5 == null)
        {
          AppMethodBeat.o(137703);
          localObject2 = localObject1;
        }
        else
        {
          j = localObject5.indexOf((String)localObject4);
          if (j < 0)
          {
            ab.w("MicroMsg.Music.MusicUrlUtil", "pIndex is %d, return", new Object[] { Integer.valueOf(j) });
            AppMethodBeat.o(137703);
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localObject5.substring(((String)localObject4).length() + j);
            localObject4 = oPr;
            i = localObject4.length;
            j = 0;
            while (j < i)
            {
              int k = ((String)localObject2).indexOf(localObject4[j]);
              localObject3 = localObject2;
              if (k > 0)
                localObject3 = ((String)localObject2).substring(0, k);
              j++;
              localObject2 = localObject3;
            }
            if (localObject2 != null)
            {
              oPs = paramString;
              oPt = (String)localObject2;
            }
            AppMethodBeat.o(137703);
          }
        }
      }
    }
  }

  private static byte[] Ty(String paramString)
  {
    AppMethodBeat.i(137705);
    byte[] arrayOfByte = new byte[paramString.length() / 2 + paramString.length() % 2];
    int i = 0;
    int j = 0;
    while (true)
    {
      try
      {
        if (i < paramString.length())
        {
          k = i + 1;
          int m = w(paramString.charAt(i));
          if (k >= paramString.length())
            break label111;
          i = k + 1;
          k = w(paramString.charAt(k));
          arrayOfByte[j] = ((byte)(byte)(k | m << 4));
          j++;
          continue;
        }
      }
      catch (Exception paramString)
      {
        paramString = null;
        AppMethodBeat.o(137705);
        return paramString;
      }
      AppMethodBeat.o(137705);
      paramString = arrayOfByte;
      continue;
      label111: int n = 0;
      i = k;
      int k = n;
    }
  }

  private static int Tz(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(137706);
    int j;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(137706);
      j = i;
    }
    while (true)
    {
      return j;
      paramString = hnu.matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group(1);
        try
        {
          j = Integer.valueOf(paramString).intValue();
          AppMethodBeat.o(137706);
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", paramString, "getSongId", new Object[0]);
          AppMethodBeat.o(137706);
          j = i;
        }
      }
      else
      {
        AppMethodBeat.o(137706);
        j = i;
      }
    }
  }

  public static String a(String paramString1, String paramString2, boolean paramBoolean, PBool paramPBool)
  {
    AppMethodBeat.i(137702);
    if ((paramBoolean) || (bo.isNullOrNil(paramString2)));
    for (String str = paramString1; bo.isNullOrNil(str); str = paramString2)
    {
      AppMethodBeat.o(137702);
      return str;
    }
    PString localPString = new PString();
    ab.i("MicroMsg.Music.MusicUrlUtil", "url[%s], lowBandUrl[%s], isWifi[%B]", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    paramString1 = Tx(str);
    if (paramString1 != null)
      if (a(paramString1, paramBoolean, localPString))
        paramPBool.value = paramBoolean;
    while (true)
    {
      str = localPString.value;
      AppMethodBeat.o(137702);
      break;
      if (str.contains("wechat_music_url="))
        a(str.substring(str.indexOf("wechat_music_url=") + 17), paramBoolean, localPString);
      else
        localPString.value = str;
    }
  }

  private static boolean a(String paramString, boolean paramBoolean, PString paramPString)
  {
    boolean bool = false;
    AppMethodBeat.i(137704);
    Object localObject1 = new String(Ty(paramString));
    int i = ((String)localObject1).indexOf("{");
    Object localObject2 = localObject1;
    if (i != -1)
      localObject2 = ((String)localObject1).substring(i);
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>((String)localObject2);
      localObject2 = ((JSONObject)localObject1).getString("song_WapLiveURL");
      localObject1 = ((JSONObject)localObject1).getString("song_WifiURL");
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("waplive: ");
      ab.d("MicroMsg.Music.MusicUrlUtil", (String)localObject2 + "  wifi:" + (String)localObject1);
      if (paramBoolean)
        localObject2 = localObject1;
      while (true)
      {
        paramPString.value = ((String)localObject2);
        paramBoolean = true;
        AppMethodBeat.o(137704);
        return paramBoolean;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        paramPString.value = paramString;
        ab.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", localException, "decodeJson", new Object[0]);
        AppMethodBeat.o(137704);
        paramBoolean = bool;
      }
    }
  }

  public static String eE(Context paramContext)
  {
    AppMethodBeat.i(137701);
    Object localObject1 = "";
    Object localObject2 = ah.getPackageName();
    if (localObject2 == null)
    {
      AppMethodBeat.o(137701);
      paramContext = (Context)localObject1;
    }
    while (true)
    {
      return paramContext;
      Object localObject3 = localObject1;
      try
      {
        localObject2 = paramContext.getPackageManager().getPackageInfo((String)localObject2, 0);
        paramContext = (Context)localObject1;
        if (localObject2 != null)
        {
          localObject3 = localObject1;
          paramContext = new java/lang/StringBuilder;
          localObject3 = localObject1;
          paramContext.<init>();
          localObject3 = localObject1;
          paramContext = "" + ((PackageInfo)localObject2).versionName;
          localObject3 = paramContext;
          localObject1 = new java/lang/StringBuilder;
          localObject3 = paramContext;
          ((StringBuilder)localObject1).<init>();
          localObject3 = paramContext;
          paramContext = paramContext + ((PackageInfo)localObject2).versionCode;
        }
        AppMethodBeat.o(137701);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", paramContext, "", new Object[0]);
          paramContext = (Context)localObject3;
        }
      }
    }
  }

  private static int w(char paramChar)
  {
    int i = 0;
    int j;
    if ((paramChar >= '1') && (paramChar <= '9'))
      j = paramChar - '0';
    while (true)
    {
      return j;
      j = i;
      if (paramChar >= 'A')
      {
        j = i;
        if (paramChar <= 'F')
          j = paramChar - 'A' + 10;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.e
 * JD-Core Version:    0.6.2
 */