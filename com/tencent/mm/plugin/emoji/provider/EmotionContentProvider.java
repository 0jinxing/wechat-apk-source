package com.tencent.mm.plugin.emoji.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.o;
import com.tencent.mm.storage.z;
import java.io.Serializable;
import java.util.ArrayList;

public class EmotionContentProvider extends ContentProvider
{
  private static final UriMatcher kXi;

  static
  {
    AppMethodBeat.i(53170);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kXi = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.storage.provider.emotion", "EmojiGroupInfo", 1);
    kXi.addURI("com.tencent.mm.storage.provider.emotion", "userinfo", 2);
    kXi.addURI("com.tencent.mm.storage.provider.emotion", "GetEmotionListCache", 3);
    kXi.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfo", 4);
    kXi.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfoDesc", 5);
    AppMethodBeat.o(53170);
  }

  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = false;
    AppMethodBeat.i(53169);
    ab.d("MicroMsg.EmotionContentProvider", "[call] method:%s", new Object[] { paramString1 });
    if (paramString1.equals("getAccPath"))
    {
      paramString1 = new Bundle();
      paramString1.putString("path", g.RP().eJM);
      AppMethodBeat.o(53169);
    }
    while (true)
    {
      return paramString1;
      if (paramString1.equals("getEmojiKey"))
      {
        paramString1 = new Bundle();
        paramString1.putString("key", j.getEmojiStorageMgr().xYn.getKey());
        AppMethodBeat.o(53169);
      }
      else if (paramString1.equals("ConfigStorage.getBoolean"))
      {
        paramString1 = new Bundle();
        paramString1.putBoolean("key", ((Boolean)g.RP().Ry().get(paramBundle.getInt("key"), Boolean.FALSE)).booleanValue());
        AppMethodBeat.o(53169);
      }
      else if (paramString1.equals("ConfigStorage.getString"))
      {
        paramString1 = new Bundle();
        paramString1.putString("key", (String)g.RP().Ry().get(paramBundle.getInt("key"), ""));
        AppMethodBeat.o(53169);
      }
      else if (paramString1.equals("getAllCustomEmoji"))
      {
        paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
        paramString1.putParcelableArrayList("data", j.getEmojiStorageMgr().bY(false));
        AppMethodBeat.o(53169);
      }
      else if (paramString1.equals("getRandomEmoji"))
      {
        if (paramBundle != null)
        {
          paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
          paramString2 = (EmojiInfo)paramBundle.getParcelable("emoji");
          paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
          paramString1.putParcelable("data", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().n(paramString2));
          AppMethodBeat.o(53169);
        }
        else if (paramBundle == null)
        {
          label339: ab.e("MicroMsg.EmotionContentProvider", "[getRandomEmoji] extras:%s", new Object[] { Boolean.valueOf(bool3) });
        }
      }
      else
      {
        label1587: 
        do
          while (true)
          {
            while (true)
            {
              AppMethodBeat.o(53169);
              paramString1 = null;
              break;
              bool3 = false;
              break label339;
              if (paramString1.equals("getCurLangDesc"))
              {
                paramString1 = new Bundle();
                paramString1.putString("data", j.getEmojiDescMgr().Jh(paramString2));
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("countCustomEmoji"))
              {
                bool3 = bool1;
                if (paramBundle != null)
                {
                  bool3 = paramBundle.getBoolean("withSystem");
                  bool4 = paramBundle.getBoolean("onlySuccess");
                }
                paramString1 = new Bundle();
                paramString1.putInt("data", j.getEmojiStorageMgr().xYn.y(bool3, bool4));
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("countCaptureEmoji"))
              {
                bool3 = bool2;
                if (paramBundle != null)
                  bool3 = paramBundle.getBoolean("onlySuccess");
                paramString1 = new Bundle();
                paramString1.putInt("data", j.getEmojiStorageMgr().xYn.pr(bool3));
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("countProductId"))
              {
                paramString1 = new Bundle();
                paramString1.putInt("data", j.getEmojiStorageMgr().xYn.Jp(paramString2));
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("getDownloadedCount"))
              {
                paramString1 = new Bundle();
                paramString1.putInt("data", j.getEmojiStorageMgr().bjV());
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("getEmojiListByGroupId"))
              {
                paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
                paramString1.putParcelableArrayList("data", (ArrayList)((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jg(paramString2));
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("getEmojiGroupInfoList"))
              {
                paramString1 = new Bundle(EmojiGroupInfo.class.getClassLoader());
                paramString1.putParcelableArrayList("data", j.getEmojiStorageMgr().xYz.OD());
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("createEmojiInfo"))
              {
                if (paramBundle == null)
                  continue;
                paramString1 = paramBundle.getString("key_md5");
                int i = paramBundle.getInt("key_group");
                int j = paramBundle.getInt("key_type");
                int k = paramBundle.getInt("key_size");
                paramString2 = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().j(paramString1, i, j, k);
                paramString1 = new Bundle();
                paramString1.putParcelable("key_emoji_info", paramString2);
                AppMethodBeat.o(53169);
                break;
              }
              if (paramString1.equals("updateEmojiInfo"))
              {
                if (paramBundle != null)
                {
                  paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
                  paramString1 = (EmojiInfo)paramBundle.get("key_emoji_info");
                  ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(paramString1);
                }
              }
              else
              {
                if (paramString1.equals("isEnableHEVCDecode"))
                {
                  paramString1 = new Bundle();
                  paramString1.putBoolean("key_data", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjX());
                  AppMethodBeat.o(53169);
                  break;
                }
                if (paramString1.equals("isEnableHevcUpload"))
                {
                  paramString1 = new Bundle();
                  paramString1.putBoolean("key_data", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OS());
                  AppMethodBeat.o(53169);
                  break;
                }
                if (paramString1.equals("getEmojiByMd5"))
                {
                  if (paramBundle == null)
                    continue;
                  paramString2 = paramBundle.getString("key_md5");
                  paramString1 = new Bundle();
                  paramString1.putParcelable("key_emoji_info", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Je(paramString2));
                  AppMethodBeat.o(53169);
                  break;
                }
                if (paramString1.equals("getConfig"))
                {
                  if (paramBundle == null)
                    continue;
                  paramString1 = (ac.a)paramBundle.get("key_config_key");
                  paramString2 = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().c(paramString1, null);
                  paramString1 = new Bundle();
                  paramString1.putSerializable("key_config_value", (Serializable)paramString2);
                  AppMethodBeat.o(53169);
                  break;
                }
                if (paramString1.equals("setConfig"))
                {
                  if (paramBundle != null)
                  {
                    paramString1 = (ac.a)paramBundle.get("key_config_key");
                    paramString2 = paramBundle.get("key_config_value");
                    ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().d(paramString1, paramString2);
                  }
                }
                else
                {
                  if (paramString1.equals("checkGifFile"))
                  {
                    if (paramBundle == null)
                      continue;
                    paramString1 = new Bundle();
                    paramString2 = paramBundle.getString("key_path");
                    paramString1.putBoolean("key_data", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jq(paramString2));
                    AppMethodBeat.o(53169);
                    break;
                  }
                  if (paramString1.equals("getSmileyInfoList"))
                  {
                    paramString1 = new Bundle();
                    try
                    {
                      paramString1.putParcelableArrayList("key_data", ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjO());
                      AppMethodBeat.o(53169);
                    }
                    catch (Exception paramString2)
                    {
                      while (true)
                        ab.printErrStackTrace("MicroMsg.EmotionContentProvider", paramString2, "", new Object[0]);
                    }
                  }
                }
              }
            }
            if (paramString1.equals("deleteLoadingCaptureEmoji"))
            {
              if (!bo.isNullOrNil(paramString2))
                ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jr(paramString2);
            }
            else if (paramString1.equals("uploadEmojiRemote"))
            {
              if (paramBundle != null)
              {
                paramString1 = (String)paramBundle.getParcelable("emojiMd5");
                paramBundle.setClassLoader(EmojiCaptureReporter.class.getClassLoader());
                paramString2 = (EmojiCaptureReporter)paramBundle.getParcelable("reporter");
                ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(new EmojiCaptureUploadManager.UploadTask(paramString1, paramString2));
              }
            }
            else if (paramString1.equals("showCaptureEmojiInPanel"))
            {
              if (paramBundle != null)
              {
                paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
                paramString1 = (EmojiInfo)paramBundle.getParcelable("emojiInfo");
                ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().q(paramString1);
              }
            }
            else if (paramString1.equals("showCaptureEmojiDefaultErrorDialog"))
            {
              if (paramBundle != null)
              {
                paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
                paramString1 = (EmojiInfo)paramBundle.getParcelable("emojiInfo");
                ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(paramString1);
              }
            }
            else
            {
              if (!paramString1.equals("addCaptureEmojiUploadTask"))
                break label1587;
              if (paramBundle != null)
              {
                paramBundle.setClassLoader(EmojiCaptureUploadManager.UploadTask.class.getClassLoader());
                paramString1 = (EmojiCaptureUploadManager.UploadTask)paramBundle.getParcelable("uploadTask");
                ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().b(paramString1);
              }
            }
          }
        while (!paramString1.equals("getCaptureEmoji"));
        paramString1 = new Bundle();
        paramString1.putParcelableArrayList("key_data", com.tencent.mm.emoji.a.a.OB().bZ(false));
        AppMethodBeat.o(53169);
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(53167);
    int i;
    switch (kXi.match(paramUri))
    {
    default:
      i = 0;
      AppMethodBeat.o(53167);
    case 3:
    }
    while (true)
    {
      return i;
      i = g.RP().eJN.delete("GetEmotionListCache", paramString, paramArrayOfString);
      AppMethodBeat.o(53167);
    }
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    AppMethodBeat.i(53166);
    switch (kXi.match(paramUri))
    {
    default:
      AppMethodBeat.o(53166);
    case 3:
    }
    while (true)
    {
      return paramUri;
      paramUri = Uri.withAppendedPath(paramUri, String.valueOf(g.RP().eJN.insert("GetEmotionListCache", o.ccO.xDc, paramContentValues)));
      AppMethodBeat.o(53166);
    }
  }

  public boolean onCreate()
  {
    AppMethodBeat.i(53164);
    ab.i("MicroMsg.EmotionContentProvider", "[onCreate]");
    AppMethodBeat.o(53164);
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(53165);
    ab.i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", new Object[] { paramUri.getPath(), paramString1 });
    switch (kXi.match(paramUri))
    {
    case 2:
    default:
      paramUri = null;
      AppMethodBeat.o(53165);
    case 1:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return paramUri;
      paramUri = g.RP().eJN.a(paramString1, paramArrayOfString2, 2);
      AppMethodBeat.o(53165);
      continue;
      paramUri = g.RP().eJN.a(paramString1, paramArrayOfString2, 2);
      AppMethodBeat.o(53165);
      continue;
      paramUri = g.RP().eJN.a(paramString1, paramArrayOfString2, 2);
      AppMethodBeat.o(53165);
      continue;
      paramUri = g.RP().eJN.a(paramString1, paramArrayOfString2, 2);
      AppMethodBeat.o(53165);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    int i = -1;
    AppMethodBeat.i(53168);
    if (!g.RN().QY())
      AppMethodBeat.o(53168);
    while (true)
    {
      return i;
      switch (kXi.match(paramUri))
      {
      default:
        AppMethodBeat.o(53168);
        break;
      case 2:
        g.RP().Ry().set(((Integer)paramContentValues.get("type")).intValue(), paramContentValues.get("value"));
        i = 0;
        AppMethodBeat.o(53168);
        break;
      case 1:
        i = g.RP().eJN.update("EmojiGroupInfo", paramContentValues, paramString, paramArrayOfString);
        AppMethodBeat.o(53168);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.provider.EmotionContentProvider
 * JD-Core Version:    0.6.2
 */