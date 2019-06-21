package com.tencent.mm.plugin.emoji.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class b
{
  public static boolean JX(String paramString)
  {
    AppMethodBeat.i(62347);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (!bo.isEqual(paramString, "capture")) && (!bo.isEqual(paramString, EmojiGroupInfo.yac)))
    {
      bool = true;
      AppMethodBeat.o(62347);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62347);
    }
  }

  public static boolean JY(String paramString)
  {
    AppMethodBeat.i(62350);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (!bo.isEqual(paramString, "capture")))
    {
      bool = true;
      AppMethodBeat.o(62350);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62350);
    }
  }

  public static String Yb()
  {
    AppMethodBeat.i(62343);
    String str = ((d)g.M(d.class)).getProvider().getAccPath() + "emoji/";
    AppMethodBeat.o(62343);
    return str;
  }

  public static void a(xx paramxx, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62344);
    if ((!bo.isNullOrNil(paramEmojiInfo.field_md5)) && (!paramEmojiInfo.field_md5.equals(paramxx.Md5)))
      AppMethodBeat.o(62344);
    while (true)
    {
      return;
      paramEmojiInfo.field_md5 = dN(paramxx.Md5, paramEmojiInfo.field_md5);
      paramEmojiInfo.field_cdnUrl = dN(paramxx.Url, paramEmojiInfo.field_cdnUrl);
      paramEmojiInfo.field_thumbUrl = dN(paramxx.ThumbUrl, paramEmojiInfo.field_thumbUrl);
      paramEmojiInfo.field_designerID = dN(paramxx.wdC, paramEmojiInfo.field_designerID);
      paramEmojiInfo.field_encrypturl = dN(paramxx.EncryptUrl, paramEmojiInfo.field_encrypturl);
      paramEmojiInfo.field_aeskey = dN(paramxx.AesKey, paramEmojiInfo.field_aeskey);
      paramEmojiInfo.field_groupId = dN(paramxx.ProductID, paramEmojiInfo.field_groupId);
      paramEmojiInfo.field_externUrl = dN(paramxx.ExternUrl, paramEmojiInfo.field_externUrl);
      paramEmojiInfo.field_externMd5 = dN(paramxx.ExternMd5, paramEmojiInfo.field_externMd5);
      paramEmojiInfo.field_activityid = dN(paramxx.ActivityID, paramEmojiInfo.field_activityid);
      paramEmojiInfo.field_attachedText = dN(paramxx.wdD, paramEmojiInfo.field_attachedText);
      paramEmojiInfo.field_attachTextColor = dN(paramxx.wdE, paramEmojiInfo.field_attachTextColor);
      paramEmojiInfo.field_lensId = dN(paramxx.wdF, paramEmojiInfo.field_lensId);
      AppMethodBeat.o(62344);
    }
  }

  public static int aF(byte[] paramArrayOfByte)
  {
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4))
      i = EmojiInfo.yab;
    while (true)
    {
      return i;
      if ((paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78) && (paramArrayOfByte[3] == 71))
        i = EmojiInfo.yam;
      else if ((paramArrayOfByte[0] == 71) && (paramArrayOfByte[1] == 73) && (paramArrayOfByte[2] == 70))
        i = EmojiInfo.yan;
      else if ((paramArrayOfByte[6] == 74) && (paramArrayOfByte[7] == 70) && (paramArrayOfByte[8] == 73) && (paramArrayOfByte[9] == 70))
        i = EmojiInfo.yao;
      else
        i = EmojiInfo.yab;
    }
  }

  public static String dN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62345);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(62345);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(62345);
    }
  }

  public static boolean w(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62346);
    boolean bool;
    if ((paramEmojiInfo != null) && (JX(paramEmojiInfo.field_groupId)))
    {
      bool = true;
      AppMethodBeat.o(62346);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62346);
    }
  }

  public static boolean x(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62348);
    boolean bool = bo.isEqual(paramEmojiInfo.field_groupId, "capture");
    AppMethodBeat.o(62348);
    return bool;
  }

  public static boolean y(EmojiInfo paramEmojiInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(62349);
    if (paramEmojiInfo == null)
      AppMethodBeat.o(62349);
    while (true)
    {
      return bool;
      if (!com.tencent.mm.emoji.a.e.OW())
      {
        AppMethodBeat.o(62349);
      }
      else if ((x(paramEmojiInfo)) || ((paramEmojiInfo.field_activityid != null) && (paramEmojiInfo.field_activityid.startsWith("Selfie"))))
      {
        bool = true;
        AppMethodBeat.o(62349);
      }
      else
      {
        AppMethodBeat.o(62349);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.h.b
 * JD-Core Version:    0.6.2
 */