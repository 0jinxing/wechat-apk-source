package com.tencent.mm.plugin.emoji.sync.a;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cx;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a extends com.tencent.mm.plugin.emoji.sync.c
{
  private EmojiInfo exP;
  private String kWM;
  private String kWN;
  private String kWl;
  private com.tencent.mm.plugin.emoji.sync.d kXJ;
  private String kXK;
  private String kXL;
  private String kXM;
  private String kXN;
  private String kXO;
  private String kXP;
  private String kXQ;
  private com.tencent.mm.plugin.emoji.d.a kXR;
  private com.tencent.mm.at.a.b.a kXS;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    AppMethodBeat.i(53198);
    if (bo.isNullOrNil(paramString1))
      ab.e("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] can not create task md5 is null.");
    this.kXK = paramString1;
    this.kXL = paramString2;
    this.kXM = paramString3;
    this.kWM = paramString4;
    this.kXN = paramString5;
    this.kXO = paramString6;
    this.kXP = paramString8;
    this.kXQ = paramString9;
    this.kWl = paramString7;
    this.kWN = paramString10;
    this.exP = j.getEmojiStorageMgr().xYn.aqi(this.kXK);
    if (this.exP == null)
    {
      this.exP = new EmojiInfo();
      this.exP.field_md5 = this.kXK;
      this.exP.field_cdnUrl = this.kXL;
      this.exP.field_thumbUrl = this.kXM;
      this.exP.field_designerID = this.kWM;
      this.exP.field_encrypturl = this.kXN;
      this.exP.field_aeskey = this.kXO;
      this.exP.field_groupId = this.kWl;
    }
    if (!bo.isNullOrNil(this.kXL))
    {
      this.exP.field_cdnUrl = this.kXL;
      if (bo.isNullOrNil(this.kXN))
        break label401;
      this.exP.field_encrypturl = this.kXN;
      this.exP.field_aeskey = this.kXO;
    }
    while (true)
    {
      if (!bo.isNullOrNil(this.kWM))
        this.exP.field_designerID = this.kWM;
      if (!bo.isNullOrNil(this.kWl))
        this.exP.field_groupId = this.kWl;
      if (!bo.isNullOrNil(this.kXM))
        this.exP.field_thumbUrl = this.kXM;
      if (!bo.isNullOrNil(this.kWN))
        this.exP.field_activityid = this.kWN;
      this.exP.field_externUrl = this.kXP;
      this.exP.field_externMd5 = this.kXQ;
      this.exP.field_attachedText = null;
      this.kXR = new com.tencent.mm.plugin.emoji.d.a();
      this.kXS = new com.tencent.mm.at.a.b.a();
      AppMethodBeat.o(53198);
      return;
      this.kXL = this.exP.field_cdnUrl;
      break;
      label401: this.kXN = this.exP.field_encrypturl;
      this.kXO = this.exP.field_aeskey;
    }
  }

  private void bkK()
  {
    AppMethodBeat.i(53200);
    ab.i("MicroMsg.BKGLoader.EmojiDownloadTask", "disable to download emoji when cdn download failed.");
    cx localcx = new cx();
    localcx.cvY.cvZ = this.kXK;
    localcx.cvY.cuy = 0;
    localcx.cvY.success = false;
    com.tencent.mm.sdk.b.a.xxA.m(localcx);
    if (this.exP != null)
    {
      ab.i("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] this emoji is broken. md5 is:%s", new Object[] { this.exP.Aq() });
      this.exP.field_state = EmojiInfo.yau;
      this.exP.field_catalog = EmojiInfo.yaf;
      j.getEmojiStorageMgr().xYn.G(this.exP);
    }
    AppMethodBeat.o(53200);
  }

  public final void a(com.tencent.mm.plugin.emoji.sync.d paramd)
  {
    this.kXJ = paramd;
  }

  public final void cancel()
  {
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(53201);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof a)))
    {
      paramObject = (a)paramObject;
      if ((!bo.isNullOrNil(this.kXK)) && (!bo.isNullOrNil(paramObject.kXK)) && (this.kXK.equals(paramObject.kXK)))
      {
        bool = true;
        AppMethodBeat.o(53201);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53201);
    }
  }

  public final String getKey()
  {
    return this.kXK;
  }

  public final void run()
  {
    AppMethodBeat.i(53199);
    Object localObject1;
    int i;
    if (this.kXJ != null)
    {
      this.kXJ.JH(this.kXK);
      ab.i("MicroMsg.BKGLoader.EmojiDownloadTask", "emoji md5:%s cndUrl:%s thumbUrl:%s field_designerID:%s field_encrypturl:%s field_groupId:%s", new Object[] { this.exP.Aq(), this.exP.field_cdnUrl, this.exP.field_thumbUrl, this.exP.field_designerID, this.exP.field_encrypturl, this.exP.field_groupId });
      if ((bo.isNullOrNil(this.kXL)) && (bo.isNullOrNil(this.kXN)) && (bo.isNullOrNil(this.kXP)))
        break label982;
      localObject1 = this.kXL;
      if ((bo.isNullOrNil(this.kXP)) || (bo.isNullOrNil(this.kXQ)))
        break label316;
      localObject1 = this.kXP;
      i = 1;
    }
    while (true)
    {
      label159: long l = System.currentTimeMillis();
      Object localObject2 = this.kXR.sE((String)localObject1);
      if ((localObject2 == null) || (bo.cb(((com.tencent.mm.at.a.d.b)localObject2).data)))
      {
        ab.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data suuse time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        bkK();
      }
      while (true)
      {
        if (!bo.isNullOrNil(this.exP.field_thumbUrl))
        {
          localObject1 = this.kXR.sE(this.exP.field_thumbUrl);
          if (localObject1 != null)
            this.kXS.a(this.exP.field_thumbUrl, ((com.tencent.mm.at.a.d.b)localObject1).data, com.tencent.mm.plugin.emoji.e.g.q(this.exP.dve() + "_cover", new Object[0]));
        }
        AppMethodBeat.o(53199);
        return;
        ab.w("MicroMsg.BKGLoader.EmojiDownloadTask", "call back is null.");
        break;
        label316: if ((bo.isNullOrNil(this.kXN)) || (bo.isNullOrNil(this.kXO)))
          break label1039;
        localObject1 = this.kXN;
        i = 1;
        break label159;
        ab.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        Object localObject3 = ((com.tencent.mm.at.a.d.b)localObject2).data;
        Object localObject4 = localObject3;
        if (i != 0);
        try
        {
          localObject4 = ((com.tencent.mm.at.a.d.b)localObject2).data;
          Object localObject6 = Base64.decode(Base64.encodeToString(bo.anf(this.kXO), 0).getBytes(), 0);
          SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
          localSecretKeySpec.<init>((byte[])localObject6, "AES");
          localObject2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
          byte[] arrayOfByte = Arrays.copyOf((byte[])localObject6, localObject6.length);
          localObject6 = new javax/crypto/spec/IvParameterSpec;
          ((IvParameterSpec)localObject6).<init>(arrayOfByte);
          ((Cipher)localObject2).init(2, localSecretKeySpec, (AlgorithmParameterSpec)localObject6);
          localObject4 = ((Cipher)localObject2).doFinal((byte[])localObject4);
          boolean bool = this.kXS.a((String)localObject1, (byte[])localObject4, com.tencent.mm.plugin.emoji.e.g.q(this.exP.dve(), new Object[0]));
          localObject3 = new File(this.exP.dve());
          if ((!bool) || (!((File)localObject3).exists()))
            break label918;
          localObject2 = com.tencent.mm.a.g.v((File)localObject3);
          localObject1 = this.exP.Aq();
          if (!bo.isNullOrNil(this.kXQ))
            localObject1 = this.kXQ;
          if ((!bo.isNullOrNil((String)localObject2)) && (((String)localObject2).equalsIgnoreCase((String)localObject1)))
          {
            this.exP.field_size = localObject4.length;
            this.exP.field_state = EmojiInfo.yat;
            this.exP.field_temp = 0;
            this.exP.field_catalog = EmojiInfo.yal;
            j = EmojiLogic.aF((byte[])localObject4);
            this.exP.field_type = j;
            j = j.getEmojiStorageMgr().xYn.dvi();
            if (j < com.tencent.mm.emoji.a.e.OM())
            {
              j = com.tencent.mm.emoji.a.e.OM();
              this.exP.field_idx = j;
              j.getEmojiStorageMgr().xYn.G(this.exP);
              localObject1 = new cx();
              ((cx)localObject1).cvY.cvZ = this.kXK;
              ((cx)localObject1).cvY.cuy = 0;
              ((cx)localObject1).cvY.success = true;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
              if (i == 0)
                break label806;
              com.tencent.mm.plugin.emoji.c.hF(7L);
              com.tencent.mm.plugin.emoji.c.hF(4L);
              com.tencent.mm.plugin.emoji.c.a(this.kXK, 3, 0, 0, this.kWl, 0, this.kWM);
              f.bjK().c(this.exP, true);
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            int j;
            ab.w("MicroMsg.BKGLoader.EmojiDownloadTask", "encrypt file failed. %s", new Object[] { bo.l(localException) });
            Object localObject5 = localObject3;
            continue;
            j++;
            continue;
            label806: com.tencent.mm.plugin.emoji.c.hF(2L);
            com.tencent.mm.plugin.emoji.c.hF(4L);
            com.tencent.mm.plugin.emoji.c.a(this.kXK, 2, 0, 0, this.kWl, 1, this.kWM);
          }
          if (((File)localObject3).exists())
            ((File)localObject3).delete();
          bkK();
          if (i != 0)
          {
            com.tencent.mm.plugin.emoji.c.hF(8L);
            com.tencent.mm.plugin.emoji.c.a(this.kXK, 3, 0, 1, this.kWl, 1, this.kWM);
            continue;
          }
          com.tencent.mm.plugin.emoji.c.hF(5L);
          com.tencent.mm.plugin.emoji.c.a(this.kXK, 2, 0, 1, this.kWl, 1, this.kWM);
        }
        continue;
        label918: bkK();
        if (i != 0)
        {
          com.tencent.mm.plugin.emoji.c.hF(8L);
          com.tencent.mm.plugin.emoji.c.a(this.kXK, 3, 0, 1, this.kWl, 1, this.kWM);
        }
        else
        {
          com.tencent.mm.plugin.emoji.c.hF(3L);
          com.tencent.mm.plugin.emoji.c.a(this.kXK, 2, 1, 1, this.kWl, 1, this.kWM);
          continue;
          label982: h.pYm.a(164L, 10L, 1L, false);
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(this.kXK);
          com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.e((LinkedList)localObject1), 0);
          bkK();
        }
      }
      label1039: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.a.a
 * JD-Core Version:    0.6.2
 */