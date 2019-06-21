package com.tencent.mm.by;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.b.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.storage.emotion.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a
  implements com.tencent.mm.pluginsdk.a.e
{
  public static a.a xul;
  public static a.b xum;
  public static a.c xun;
  private com.tencent.mm.at.a.a luu;
  private String xug;
  private ArrayList<EmojiInfo> xuh;
  private ArrayList<EmojiInfo> xui;
  private HashMap<String, ArrayList<EmojiInfo>> xuj;
  private ArrayList<EmojiGroupInfo> xuk;

  static
  {
    AppMethodBeat.i(62641);
    xul = new a.a();
    xum = new a.b();
    xun = new a.c();
    AppMethodBeat.o(62641);
  }

  public a()
  {
    AppMethodBeat.i(62594);
    this.xuh = new ArrayList();
    this.xui = new ArrayList();
    this.xuj = new HashMap();
    this.xuk = new ArrayList();
    AppMethodBeat.o(62594);
  }

  private static byte[] C(EmojiInfo paramEmojiInfo)
  {
    Object localObject = null;
    byte[] arrayOfByte1 = null;
    AppMethodBeat.i(138408);
    if (paramEmojiInfo == null)
    {
      ab.w("MicroMsg.EmotionStorageResolver", "[decodeEmojiDataExport] failed. emoji is null.");
      AppMethodBeat.o(138408);
      paramEmojiInfo = arrayOfByte1;
    }
    while (true)
    {
      return paramEmojiInfo;
      String str = paramEmojiInfo.dve();
      byte[] arrayOfByte2 = com.tencent.mm.vfs.e.e(str, 0, -1);
      if ((com.tencent.mm.vfs.e.asZ(str) > 0L) && (arrayOfByte2 != null) && (arrayOfByte2.length >= 10))
      {
        arrayOfByte1 = new byte[10];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, 10);
        if (((paramEmojiInfo.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB) && (!r.bT(arrayOfByte1)))
        {
          long l1 = System.currentTimeMillis();
          int i = (int)com.tencent.mm.vfs.e.asZ(str);
          int j = i;
          if (i > 1024)
            j = 1024;
          arrayOfByte1 = com.tencent.mm.vfs.e.e(str, 0, j);
          paramEmojiInfo = localObject;
          if (!bo.isNullOrNil(bjL()));
          try
          {
            paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte1, bjL().getBytes(), false, false);
            if ((!bo.cb(paramEmojiInfo)) && (!bo.cb(arrayOfByte2)))
            {
              System.arraycopy(paramEmojiInfo, 0, arrayOfByte2, 0, j);
              long l2 = System.currentTimeMillis();
              ab.d("MicroMsg.EmotionStorageResolver", "decode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte2.length), Long.valueOf(l2 - l1) });
              AppMethodBeat.o(138408);
              paramEmojiInfo = arrayOfByte2;
            }
          }
          catch (Throwable paramEmojiInfo)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.EmotionStorageResolver", paramEmojiInfo, "", new Object[0]);
              paramEmojiInfo = localObject;
            }
            ab.i("MicroMsg.EmotionStorageResolver", "decode emoji file failed. path:%s return original ", new Object[] { str });
            AppMethodBeat.o(138408);
            paramEmojiInfo = arrayOfByte2;
          }
        }
        else
        {
          AppMethodBeat.o(138408);
          paramEmojiInfo = arrayOfByte2;
        }
      }
      else
      {
        ab.i("MicroMsg.EmotionStorageResolver", "decode emoji file failed. path is no exist :%s ", new Object[] { str });
        AppMethodBeat.o(138408);
        paramEmojiInfo = arrayOfByte1;
      }
    }
  }

  private static String bjL()
  {
    AppMethodBeat.i(62616);
    String str = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getEmojiKey", null, null).getString("key", "");
    AppMethodBeat.o(62616);
    return str;
  }

  public static Bundle call(Uri paramUri, String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(62634);
    try
    {
      paramUri = ah.getContext().getContentResolver().call(paramUri, paramString1, paramString2, paramBundle);
      if (paramUri != null)
      {
        AppMethodBeat.o(62634);
        return paramUri;
      }
    }
    catch (NullPointerException paramUri)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.EmotionStorageResolver", paramUri, "", new Object[0]);
        paramUri = null;
        continue;
        paramUri = new Bundle();
        AppMethodBeat.o(62634);
      }
    }
    catch (IllegalArgumentException paramUri)
    {
      label31: break label31;
    }
  }

  public static a.a dmE()
  {
    return xul;
  }

  public static Uri getUri()
  {
    AppMethodBeat.i(138409);
    Uri localUri = Uri.parse("content://com.tencent.mm.storage.provider.emotion/");
    AppMethodBeat.o(138409);
    return localUri;
  }

  public final EmojiInfo Je(String paramString)
  {
    AppMethodBeat.i(62614);
    if (((h)g.RM().Rn()).SG())
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Je(paramString);
      AppMethodBeat.o(62614);
    }
    while (true)
    {
      return paramString;
      Bundle localBundle = new Bundle();
      localBundle.putString("key_md5", paramString);
      paramString = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getEmojiByMd5", null, localBundle);
      if (paramString != null)
      {
        paramString.setClassLoader(EmojiInfo.class.getClassLoader());
        paramString = (EmojiInfo)paramString.getParcelable("key_emoji_info");
        AppMethodBeat.o(62614);
      }
      else
      {
        AppMethodBeat.o(62614);
        paramString = null;
      }
    }
  }

  public final String Jh(String paramString)
  {
    AppMethodBeat.i(62595);
    if (((h)g.RM().Rn()).SG())
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(62595);
    }
    while (true)
    {
      return paramString;
      paramString = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getCurLangDesc", paramString, null).getString("data", "");
      AppMethodBeat.o(62595);
    }
  }

  public final int Jp(String paramString)
  {
    AppMethodBeat.i(62601);
    int i;
    if (((h)g.RM().Rn()).SG())
    {
      i = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jp(paramString);
      AppMethodBeat.o(62601);
    }
    while (true)
    {
      return i;
      i = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "countProductId", paramString, null).getInt("data", 0);
      AppMethodBeat.o(62601);
    }
  }

  public final boolean Jq(String paramString)
  {
    AppMethodBeat.i(62629);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jq(paramString);
      AppMethodBeat.o(62629);
    }
    while (true)
    {
      return bool;
      Bundle localBundle = new Bundle();
      localBundle.putString("key_path", paramString);
      paramString = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "checkGifFile", null, localBundle);
      if ((paramString != null) && (paramString.getBoolean("key_data")))
      {
        bool = true;
        AppMethodBeat.o(62629);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(62629);
      }
    }
  }

  public final void Jr(String paramString)
  {
    AppMethodBeat.i(62635);
    if (((h)g.RM().Rn()).SG())
    {
      if (!g.RN().QY())
        break label77;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jr(paramString);
      AppMethodBeat.o(62635);
    }
    while (true)
    {
      return;
      ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "deleteLoadingCaptureEmoji", paramString, null);
      label77: AppMethodBeat.o(62635);
    }
  }

  public final ArrayList<EmojiInfo> OC()
  {
    AppMethodBeat.i(62606);
    ArrayList localArrayList = com.tencent.mm.emoji.a.a.OB().OC();
    AppMethodBeat.o(62606);
    return localArrayList;
  }

  public final ArrayList<EmojiGroupInfo> OD()
  {
    AppMethodBeat.i(62604);
    ArrayList localArrayList = com.tencent.mm.emoji.a.a.OB().OD();
    AppMethodBeat.o(62604);
    return localArrayList;
  }

  public final boolean OS()
  {
    AppMethodBeat.i(62621);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OS();
      AppMethodBeat.o(62621);
    }
    while (true)
    {
      return bool;
      Bundle localBundle = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "isEnableHevcUpload", null, null);
      if ((localBundle != null) && (localBundle.getBoolean("key_data")))
      {
        bool = true;
        AppMethodBeat.o(62621);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(62621);
      }
    }
  }

  public final boolean OT()
  {
    AppMethodBeat.i(62622);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OT();
      AppMethodBeat.o(62622);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62622);
    }
  }

  public final void a(EmojiCaptureUploadManager.UploadTask paramUploadTask)
  {
    AppMethodBeat.i(62636);
    if (((h)g.RM().Rn()).SG())
    {
      if (!g.RN().QY())
        break label107;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(paramUploadTask);
      AppMethodBeat.o(62636);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("emojiMd5", paramUploadTask.lgZ);
      localBundle.putParcelable("reporter", paramUploadTask.lha);
      ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "uploadEmojiRemote", null, localBundle);
      label107: AppMethodBeat.o(62636);
    }
  }

  public final void a(cab paramcab)
  {
    AppMethodBeat.i(62599);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(paramcab);
    AppMethodBeat.o(62599);
  }

  public final boolean a(EmojiGroupInfo paramEmojiGroupInfo)
  {
    AppMethodBeat.i(62603);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(paramEmojiGroupInfo);
      AppMethodBeat.o(62603);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62603);
    }
  }

  public final void b(EmojiCaptureUploadManager.UploadTask paramUploadTask)
  {
    AppMethodBeat.i(62639);
    if (((h)g.RM().Rn()).SG())
    {
      if (!g.RN().QY())
        break label93;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().b(paramUploadTask);
      AppMethodBeat.o(62639);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("uploadTask", paramUploadTask);
      ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "addCaptureEmojiUploadTask", null, localBundle);
      label93: AppMethodBeat.o(62639);
    }
  }

  public final ArrayList<EmojiInfo> bY(boolean paramBoolean)
  {
    AppMethodBeat.i(62605);
    ArrayList localArrayList = com.tencent.mm.emoji.a.a.OB().bY(paramBoolean);
    AppMethodBeat.o(62605);
    return localArrayList;
  }

  public final void bZ(String paramString, int paramInt)
  {
    AppMethodBeat.i(62623);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bZ(paramString, paramInt);
    AppMethodBeat.o(62623);
  }

  public final ArrayList<SmileyInfo> bjO()
  {
    AppMethodBeat.i(62631);
    Object localObject;
    if (((h)g.RM().Rn()).SG())
    {
      if (g.RN().QY())
        ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjO();
      AppMethodBeat.o(62631);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getSmileyInfoList", null, null);
      if (localObject == null)
        break;
      ((Bundle)localObject).setClassLoader(SmileyInfo.class.getClassLoader());
      localObject = ((Bundle)localObject).getSerializable("key_data");
      if (!(localObject instanceof ArrayList))
        break;
      localObject = (ArrayList)localObject;
      AppMethodBeat.o(62631);
    }
  }

  public final void bjT()
  {
    AppMethodBeat.i(62632);
    if ((((h)g.RM().Rn()).SG()) && (g.RN().QY()))
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjT();
    AppMethodBeat.o(62632);
  }

  public final cab bjU()
  {
    AppMethodBeat.i(62598);
    cab localcab;
    if (((h)g.RM().Rn()).SG())
    {
      localcab = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjU();
      AppMethodBeat.o(62598);
    }
    while (true)
    {
      return localcab;
      localcab = null;
      AppMethodBeat.o(62598);
    }
  }

  public final int bjV()
  {
    AppMethodBeat.i(62602);
    int i;
    if (((h)g.RM().Rn()).SG())
    {
      i = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjV();
      AppMethodBeat.o(62602);
    }
    while (true)
    {
      return i;
      i = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getDownloadedCount", null, null).getInt("data", 0);
      AppMethodBeat.o(62602);
    }
  }

  public final com.tencent.mm.at.a.a bjW()
  {
    AppMethodBeat.i(62608);
    Object localObject;
    if (((h)g.RM().Rn()).SG())
    {
      localObject = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjW();
      AppMethodBeat.o(62608);
    }
    while (true)
    {
      return localObject;
      if (this.luu == null)
      {
        localObject = new b.a(ah.getContext());
        ((b.a)localObject).fGT = new com.tencent.mm.view.d.a();
        this.luu = new com.tencent.mm.at.a.a(((b.a)localObject).ahx());
      }
      localObject = this.luu;
      AppMethodBeat.o(62608);
    }
  }

  public final boolean bjX()
  {
    AppMethodBeat.i(62620);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjX();
      AppMethodBeat.o(62620);
    }
    while (true)
    {
      return bool;
      Bundle localBundle = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "isEnableHEVCDecode", null, null);
      if ((localBundle != null) && (localBundle.getBoolean("key_data")))
      {
        bool = true;
        AppMethodBeat.o(62620);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(62620);
      }
    }
  }

  public final List<t> bjY()
  {
    AppMethodBeat.i(62624);
    List localList;
    if (((h)g.RM().Rn()).SG())
    {
      localList = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjY();
      AppMethodBeat.o(62624);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(62624);
    }
  }

  public final void bjZ()
  {
    AppMethodBeat.i(62625);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjZ();
    AppMethodBeat.o(62625);
  }

  public final boolean bka()
  {
    AppMethodBeat.i(62630);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bka();
      AppMethodBeat.o(62630);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62630);
    }
  }

  public final <T> T c(ac.a parama, T paramT)
  {
    AppMethodBeat.i(62626);
    if (((h)g.RM().Rn()).SG())
    {
      paramT = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().c(parama, paramT);
      AppMethodBeat.o(62626);
    }
    while (true)
    {
      return paramT;
      Bundle localBundle = new Bundle();
      localBundle.putSerializable("key_config_key", parama);
      parama = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getConfig", null, localBundle);
      if (parama != null)
      {
        parama = parama.get("key_config_value");
        if (parama != null)
        {
          AppMethodBeat.o(62626);
          paramT = parama;
        }
      }
      else
      {
        AppMethodBeat.o(62626);
      }
    }
  }

  public final void d(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(62627);
    if (((h)g.RM().Rn()).SG())
    {
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().d(parama, paramObject);
      AppMethodBeat.o(62627);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putSerializable("key_config_key", parama);
      localBundle.putSerializable("key_config_value", (Serializable)paramObject);
      call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "setConfig", null, localBundle);
      AppMethodBeat.o(62627);
    }
  }

  public final void g(k.a parama)
  {
    AppMethodBeat.i(62609);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().g(parama);
    AppMethodBeat.o(62609);
  }

  public final String getAccPath()
  {
    AppMethodBeat.i(62617);
    if (((h)g.RM().Rn()).SG())
      this.xug = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().getAccPath();
    while (true)
    {
      String str = this.xug;
      AppMethodBeat.o(62617);
      return str;
      if (bo.isNullOrNil(this.xug))
        this.xug = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getAccPath", null, null).getString("path");
    }
  }

  public final void h(k.a parama)
  {
    AppMethodBeat.i(62611);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().h(parama);
    AppMethodBeat.o(62611);
  }

  public final void i(k.a parama)
  {
    AppMethodBeat.i(62612);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().i(parama);
    AppMethodBeat.o(62612);
  }

  public final EmojiInfo j(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(62596);
    if (((h)g.RM().Rn()).SG())
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(paramString, "", paramInt1, paramInt2, paramInt3, "");
      AppMethodBeat.o(62596);
    }
    while (true)
    {
      return paramString;
      Bundle localBundle = new Bundle();
      localBundle.putString("key_md5", paramString);
      localBundle.putInt("key_group", paramInt1);
      localBundle.putInt("key_type", paramInt2);
      localBundle.putInt("key_size", paramInt3);
      paramString = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "createEmojiInfo", null, localBundle);
      if (paramString != null)
      {
        paramString.setClassLoader(EmojiInfo.class.getClassLoader());
        paramString = (EmojiInfo)paramString.getParcelable("key_emoji_info");
        AppMethodBeat.o(62596);
      }
      else
      {
        AppMethodBeat.o(62596);
        paramString = null;
      }
    }
  }

  public final void j(k.a parama)
  {
    AppMethodBeat.i(62613);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().j(parama);
    AppMethodBeat.o(62613);
  }

  public final void k(k.a parama)
  {
    AppMethodBeat.i(62628);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(parama);
    AppMethodBeat.o(62628);
  }

  public final ArrayList<EmojiInfo> kS(String paramString)
  {
    AppMethodBeat.i(62607);
    paramString = com.tencent.mm.emoji.a.a.OB().kS(paramString);
    AppMethodBeat.o(62607);
    return paramString;
  }

  public final void l(k.a parama)
  {
    AppMethodBeat.i(62633);
    if (((h)g.RM().Rn()).SG())
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().k(parama);
    AppMethodBeat.o(62633);
  }

  public final byte[] l(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62610);
    if (((h)g.RM().Rn()).SG())
    {
      paramEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(paramEmojiInfo);
      AppMethodBeat.o(62610);
    }
    while (true)
    {
      return paramEmojiInfo;
      paramEmojiInfo = C(paramEmojiInfo);
      AppMethodBeat.o(62610);
    }
  }

  public final EmojiInfo n(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62615);
    if (((h)g.RM().Rn()).SG())
    {
      paramEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().n(paramEmojiInfo);
      AppMethodBeat.o(62615);
    }
    while (true)
    {
      return paramEmojiInfo;
      Bundle localBundle = new Bundle(EmojiInfo.class.getClassLoader());
      localBundle.putParcelable("emoji", paramEmojiInfo);
      paramEmojiInfo = ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getRandomEmoji", null, localBundle);
      if (paramEmojiInfo == null)
      {
        ab.e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bunndle is null! ");
        AppMethodBeat.o(62615);
        paramEmojiInfo = null;
      }
      else
      {
        paramEmojiInfo.setClassLoader(EmojiInfo.class.getClassLoader());
        if (!paramEmojiInfo.containsKey("data"))
          break;
        paramEmojiInfo = (EmojiInfo)paramEmojiInfo.getParcelable("data");
        AppMethodBeat.o(62615);
      }
    }
    if (paramEmojiInfo == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bundle is null?", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(62615);
      paramEmojiInfo = null;
      break;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(62619);
    this.xuk.clear();
    AppMethodBeat.o(62619);
  }

  public final void q(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62637);
    if (((h)g.RM().Rn()).SG())
    {
      if (!g.RN().QY())
        break label93;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().q(paramEmojiInfo);
      AppMethodBeat.o(62637);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("emojiInfo", paramEmojiInfo);
      ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "showCaptureEmojiInPanel", null, localBundle);
      label93: AppMethodBeat.o(62637);
    }
  }

  public final void r(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62638);
    if (((h)g.RM().Rn()).SG())
    {
      if (!g.RN().QY())
        break label93;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(paramEmojiInfo);
      AppMethodBeat.o(62638);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("emojiInfo", paramEmojiInfo);
      ah.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "showCaptureEmojiDefaultErrorDialog", null, localBundle);
      label93: AppMethodBeat.o(62638);
    }
  }

  public final void updateEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62597);
    if (((h)g.RM().Rn()).SG())
    {
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(paramEmojiInfo);
      AppMethodBeat.o(62597);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.setClassLoader(EmojiInfo.class.getClassLoader());
      localBundle.putParcelable("key_emoji_info", paramEmojiInfo);
      call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "updateEmojiInfo", null, localBundle);
      AppMethodBeat.o(62597);
    }
  }

  public final int y(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(62600);
    int i;
    if (((h)g.RM().Rn()).SG())
    {
      i = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().y(paramBoolean1, paramBoolean2);
      AppMethodBeat.o(62600);
    }
    while (true)
    {
      return i;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("withSystem", paramBoolean1);
      localBundle.putBoolean("onlySuccess", paramBoolean2);
      i = call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "countCustomEmoji", null, localBundle).getInt("data", 0);
      AppMethodBeat.o(62600);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.by.a
 * JD-Core Version:    0.6.2
 */