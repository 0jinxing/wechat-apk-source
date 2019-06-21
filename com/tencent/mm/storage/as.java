package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Map;

public final class as
{
  public String aeskey;
  public String cAp;
  public long cKK;
  public long createTime;
  public String cvZ;
  public String cwg;
  public int dqI;
  public String dqJ = "";
  public String eyJ;
  public String fWW;
  public String fgA;
  public String fgu;
  public int gag;
  public int height;
  public String id;
  public String lgY;
  public String nuk;
  public String talker;
  public String thumbUrl;
  public int width;
  public int xYc;
  public int xYd;
  public int xYe;
  public int xYf;
  public String xYg = "";
  public String xYh;
  public String xYi;
  public String xYj;
  public boolean xYk = true;
  public String xYl;
  public String xYm;

  public static as D(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62707);
    if (paramEmojiInfo == null)
    {
      ab.i("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiInfo failed. emojiinfo is null.");
      paramEmojiInfo = null;
      AppMethodBeat.o(62707);
    }
    while (true)
    {
      return paramEmojiInfo;
      as localas = new as();
      localas.cvZ = paramEmojiInfo.field_md5;
      localas.xYc = paramEmojiInfo.field_type;
      localas.xYd = paramEmojiInfo.field_size;
      localas.cwg = paramEmojiInfo.field_groupId;
      localas.xYh = paramEmojiInfo.field_designerID;
      localas.thumbUrl = paramEmojiInfo.field_thumbUrl;
      localas.cAp = paramEmojiInfo.field_encrypturl;
      localas.aeskey = paramEmojiInfo.field_aeskey;
      localas.width = paramEmojiInfo.field_width;
      localas.height = paramEmojiInfo.field_height;
      localas.nuk = paramEmojiInfo.field_cdnUrl;
      localas.xYi = paramEmojiInfo.field_externUrl;
      localas.xYj = paramEmojiInfo.field_externMd5;
      localas.xYl = paramEmojiInfo.field_activityid;
      localas.fgu = paramEmojiInfo.field_tpurl;
      localas.fgA = paramEmojiInfo.field_tpauthkey;
      localas.eyJ = paramEmojiInfo.field_attachedText;
      localas.lgY = paramEmojiInfo.field_lensId;
      localas.xYm = paramEmojiInfo.field_attachTextColor;
      AppMethodBeat.o(62707);
      paramEmojiInfo = localas;
    }
  }

  public static as a(Map<String, String> paramMap, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(62708);
    if (paramMap == null)
    {
      AppMethodBeat.o(62708);
      paramMap = null;
    }
    while (true)
    {
      return paramMap;
      as localas = new as();
      localas.xYg = paramString2;
      localas.talker = paramString1;
      localas.id = ((String)paramMap.get(".msg.emoji.$idbuffer"));
      localas.fWW = ((String)paramMap.get(".msg.emoji.$fromusername"));
      paramString1 = (String)paramMap.get(".msg.emoji.$androidmd5");
      localas.cvZ = paramString1;
      if (paramString1 == null)
        localas.cvZ = ((String)paramMap.get(".msg.emoji.$md5"));
      if (!bo.isNullOrNil(localas.cvZ))
        localas.cvZ = localas.cvZ.toLowerCase();
      try
      {
        localas.xYc = Integer.valueOf((String)paramMap.get(".msg.emoji.$type")).intValue();
        if (paramMap.get(".msg.emoji.$androidlen") != null)
          localas.xYd = Integer.valueOf((String)paramMap.get(".msg.emoji.$androidlen")).intValue();
        while (true)
        {
          if (paramMap.get(".msg.gameext.$type") != null)
            localas.xYe = Integer.valueOf((String)paramMap.get(".msg.gameext.$type")).intValue();
          if (paramMap.get(".msg.gameext.$content") != null)
            localas.xYf = Integer.valueOf((String)paramMap.get(".msg.gameext.$content")).intValue();
          if (paramMap.get(".msg.emoji.$productid") != null)
            localas.cwg = ((String)paramMap.get(".msg.emoji.$productid"));
          if (paramMap.get(".msg.emoji.$cdnurl") != null)
            localas.nuk = ((String)paramMap.get(".msg.emoji.$cdnurl"));
          if (paramMap.get(".msg.emoji.$tpurl") != null)
            localas.fgu = ((String)paramMap.get(".msg.emoji.$tpurl"));
          if (paramMap.get(".msg.emoji.$tpauthkey") != null)
            localas.fgA = ((String)paramMap.get(".msg.emoji.$tpauthkey"));
          if (paramMap.get(".msg.emoji.$designerid") != null)
            localas.xYh = ((String)paramMap.get(".msg.emoji.$designerid"));
          if (paramMap.get(".msg.emoji.$thumburl") != null)
            localas.thumbUrl = ((String)paramMap.get(".msg.emoji.$thumburl"));
          if (paramMap.get(".msg.emoji.$encrypturl") != null)
            localas.cAp = ((String)paramMap.get(".msg.emoji.$encrypturl"));
          if (paramMap.get(".msg.emoji.$aeskey") != null)
            localas.aeskey = ((String)paramMap.get(".msg.emoji.$aeskey"));
          if (paramMap.get(".msg.emoji.$width") != null)
            localas.width = Integer.valueOf((String)paramMap.get(".msg.emoji.$width")).intValue();
          if (paramMap.get(".msg.emoji.$height") != null)
            localas.height = Integer.valueOf((String)paramMap.get(".msg.emoji.$height")).intValue();
          if (paramMap.get(".msg.emoji.$externurl") != null)
            localas.xYi = ((String)paramMap.get(".msg.emoji.$externurl"));
          if (paramMap.get(".msg.emoji.$externmd5") != null)
            localas.xYj = ((String)paramMap.get(".msg.emoji.$externmd5"));
          if (paramMap.get(".msg.emoji.$activityid") != null)
            localas.xYl = ((String)paramMap.get(".msg.emoji.$activityid"));
          if (paramMap.get(".msg.emoji.$attachedtext") != null)
            localas.eyJ = ((String)paramMap.get(".msg.emoji.$attachedtext"));
          if (paramMap.get(".msg.emoji.$attachedtextcolor") != null)
            localas.xYm = ((String)paramMap.get(".msg.emoji.$attachedtextcolor"));
          if (paramMap.get(".msg.emoji.$lensid") != null)
            localas.lgY = ((String)paramMap.get(".msg.emoji.$lensid"));
          if (!bo.isNullOrNil(paramString3))
            localas.dqJ = paramString3;
          ab.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml id:%s  md5:%s  type:%d  len:%d  gameType:%d  gameContent:%d  productId:%s  cdnUrl:%s tpUrl:%s designerid:%s thumburl:%s encryptrul:%s width:%d height:%d externUrl:%s externMd5:%s", new Object[] { localas.id, localas.cvZ, Integer.valueOf(localas.xYc), Integer.valueOf(localas.xYd), Integer.valueOf(localas.xYe), Integer.valueOf(localas.xYf), localas.cwg, localas.nuk, localas.fgu, localas.xYh, localas.thumbUrl, localas.cAp, Integer.valueOf(localas.width), Integer.valueOf(localas.height), localas.xYi, localas.xYj });
          AppMethodBeat.o(62708);
          paramMap = localas;
          break;
          if (paramMap.get(".msg.emoji.$len") != null)
            localas.xYd = Integer.valueOf((String)paramMap.get(".msg.emoji.$len")).intValue();
        }
      }
      catch (Exception paramMap)
      {
        ab.e("MicroMsg.emoji.EmojiMsgInfo", "exception:%s", new Object[] { bo.l(paramMap) });
        AppMethodBeat.o(62708);
        paramMap = null;
      }
    }
  }

  public static void a(as paramas, EmojiInfo paramEmojiInfo)
  {
    paramEmojiInfo.field_md5 = paramas.cvZ;
    paramEmojiInfo.field_svrid = paramas.id;
    paramEmojiInfo.field_type = paramas.xYc;
    paramEmojiInfo.field_size = paramas.xYd;
    paramEmojiInfo.field_groupId = paramas.cwg;
    paramEmojiInfo.field_designerID = paramas.xYh;
    paramEmojiInfo.field_thumbUrl = paramas.thumbUrl;
    paramEmojiInfo.field_cdnUrl = paramas.nuk;
    paramEmojiInfo.field_encrypturl = paramas.cAp;
    paramEmojiInfo.field_aeskey = paramas.aeskey;
    paramEmojiInfo.field_width = paramas.width;
    paramEmojiInfo.field_height = paramas.height;
    paramEmojiInfo.field_externUrl = paramas.xYi;
    paramEmojiInfo.field_externMd5 = paramas.xYj;
    paramEmojiInfo.field_activityid = paramas.xYl;
    paramEmojiInfo.field_tpurl = paramas.fgu;
    paramEmojiInfo.field_tpauthkey = paramas.fgA;
    paramEmojiInfo.field_attachedText = paramas.eyJ;
    paramEmojiInfo.field_lensId = paramas.lgY;
    paramEmojiInfo.field_attachTextColor = paramas.xYm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.as
 * JD-Core Version:    0.6.2
 */