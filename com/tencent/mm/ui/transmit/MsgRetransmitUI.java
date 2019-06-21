package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.a;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.qn;
import com.tencent.mm.g.a.rf;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.ce;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.z;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.k;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class MsgRetransmitUI extends MMBaseActivity
  implements com.tencent.mm.ai.f
{
  private float cEB;
  public String cJh;
  public long cvx;
  private ProgressDialog ehJ;
  private int fDC;
  private com.tencent.mm.ai.g fEW;
  private String fFA;
  private float fFz;
  public String fileName;
  private String hcl;
  long jMj;
  private int length;
  private ak mHandler;
  boolean mgP;
  public int msgType;
  private long startTime;
  private String thumbPath;
  private boolean yFl;
  public List<String> zIR;
  private String zIS;
  private boolean zIT;
  private boolean zIU;
  private com.tencent.mm.ui.widget.a.c zIV;
  private int zIW;
  private int zIX;
  private com.tencent.mm.at.l zIY;
  private boolean zIZ;
  private List<String> zJa;
  private int zJb;
  private int zJc;
  private boolean zJd;
  private boolean zJe;
  private int zJf;
  private boolean zJg;
  private boolean zJh;
  private boolean zJi;
  private int zJj;
  private int zJk;
  private String zJl;
  private String zJm;
  private int zJn;
  private int zJo;
  private boolean zJp;
  boolean zJq;
  private int zeC;

  public MsgRetransmitUI()
  {
    AppMethodBeat.i(35090);
    this.zIS = null;
    this.zIT = true;
    this.zIU = false;
    this.ehJ = null;
    this.fDC = 0;
    this.zIW = 0;
    this.zIX = 0;
    this.zIY = null;
    this.zIZ = false;
    this.zJa = null;
    this.fEW = null;
    this.zJb = 0;
    this.zJc = 0;
    this.zJd = false;
    this.zJe = false;
    this.yFl = false;
    this.zeC = -1;
    this.zJh = true;
    this.zJi = true;
    this.zJj = 0;
    this.startTime = 0L;
    this.zJp = true;
    this.mHandler = new ak();
    this.zJq = false;
    AppMethodBeat.o(35090);
  }

  private void a(final j.b paramb, final com.tencent.mm.pluginsdk.model.app.b paramb1, final bi parambi, final String paramString1, final String paramString2, final byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(35098);
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.egl = new g.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, com.tencent.mm.i.d paramAnonymousd, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(35084);
        paramb1.field_fileFullPath = paramString2;
        if ((paramAnonymousInt == 0) && (paramAnonymousc != null))
        {
          paramb1.field_offset = paramAnonymousc.field_finishedLength;
          am.aUq().a(paramb1, new String[0]);
        }
        if ((paramAnonymousInt == 0) && (paramAnonymousd != null) && (paramAnonymousd.field_retCode == 0))
        {
          paramb1.field_status = 199L;
          paramb1.field_offset = paramb1.field_totalLen;
          am.aUq().a(paramb1, new String[0]);
          parambi.setStatus(3);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
          com.tencent.mm.pluginsdk.model.app.l.a(paramb, paramb.appId, paramb.appName, paramString1, paramString2, paramArrayOfByte, MsgRetransmitUI.a(MsgRetransmitUI.this));
        }
        AppMethodBeat.o(35084);
        return 0;
      }

      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
      }

      public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        return new byte[0];
      }
    };
    localg.field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), parambi.field_talker, parambi.field_msgId);
    localg.field_aesKey = paramb.eyr;
    localg.field_fileType = 19;
    localg.field_authKey = paramb.fgA;
    localg.egm = paramb.fgu;
    localg.field_fullpath = paramString2;
    if (!com.tencent.mm.al.f.afx().b(localg, -1))
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "openim attach download failed before rescend");
    AppMethodBeat.o(35098);
  }

  private void a(MsgRetransmitUI.b paramb, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(35110);
    com.tencent.mm.sdk.platformtools.ab.c("MicroMsg.MsgRetransmitUI", "start copy video", new Object[0]);
    Object localObject = new MsgRetransmitUI.a();
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131297043), true, new MsgRetransmitUI.13(this, (MsgRetransmitUI.a)localObject));
    ((MsgRetransmitUI.a)localObject).context = this;
    ((MsgRetransmitUI.a)localObject).fileName = this.fileName;
    ((MsgRetransmitUI.a)localObject).gII = this.ehJ;
    ((MsgRetransmitUI.a)localObject).zIW = this.zIW;
    ((MsgRetransmitUI.a)localObject).fXd = this.length;
    ((MsgRetransmitUI.a)localObject).fVl = this.msgType;
    ((MsgRetransmitUI.a)localObject).zJC = false;
    ((MsgRetransmitUI.a)localObject).userName = paramString;
    ((MsgRetransmitUI.a)localObject).zJD = true;
    ((MsgRetransmitUI.a)localObject).zIU = this.zIU;
    ((MsgRetransmitUI.a)localObject).zJG = paramb;
    paramb = u.ut(this.fileName);
    if ((paramb != null) && (paramb.fXm != null))
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "msgRetrans streamvideo");
      ((MsgRetransmitUI.a)localObject).zJF = paramb.fXm;
      ((MsgRetransmitUI.a)localObject).dqJ = paramb.getUser();
    }
    ((MsgRetransmitUI.a)localObject).execute(new Object[0]);
    bv.aaq().c(bv.fnw, null);
    if (this.cvx == -1L)
    {
      AppMethodBeat.o(35110);
      return;
    }
    aw.ZK();
    bi localbi = com.tencent.mm.model.c.XO().jf(this.cvx);
    boolean bool = com.tencent.mm.model.t.kH(paramString);
    if (bool)
    {
      paramb = a.c.yFI;
      label258: if (!this.zJg)
        break label304;
    }
    label304: for (localObject = a.d.yFM; ; localObject = a.d.yFL)
    {
      if (bool)
        i = com.tencent.mm.model.n.mA(paramString);
      com.tencent.mm.ui.chatting.a.a(paramb, (a.d)localObject, localbi, i);
      AppMethodBeat.o(35110);
      break;
      paramb = a.c.yFH;
      break label258;
    }
  }

  private void a(String paramString, int paramInt, com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(35103);
    String str1 = r.Yz();
    aw.ZK();
    bi localbi = com.tencent.mm.model.c.XO().jf(this.cvx);
    Object localObject1;
    Object localObject2;
    if (localbi.field_msgId == this.cvx)
    {
      String str2 = localbi.field_content;
      localObject1 = null;
      if (localbi.field_msgId > 0L)
        localObject1 = o.ahl().fJ(localbi.field_msgId);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((com.tencent.mm.at.e)localObject1).fDy > 0L);
      }
      else
      {
        localObject2 = localObject1;
        if (localbi.field_msgSvrId > 0L)
          localObject2 = o.ahl().fI(localbi.field_msgSvrId);
      }
      localObject1 = str2;
      if (bo.isNullOrNil(str2))
      {
        localObject1 = str2;
        if (localbi.field_msgSvrId > 0L)
          localObject1 = ((com.tencent.mm.at.e)localObject2).fDK;
      }
      if ((localObject2 != null) && ((((com.tencent.mm.at.e)localObject2).offset < ((com.tencent.mm.at.e)localObject2).frO) || (((com.tencent.mm.at.e)localObject2).frO == 0)) && (!this.zJd))
      {
        paramg = o.ahl().fI(localbi.field_msgSvrId);
        if (!a(paramg, localbi, (String)localObject1, paramInt, paramString, str1))
          b(paramg, localbi, (String)localObject1, paramInt, paramString, str1);
        AppMethodBeat.o(35103);
      }
    }
    while (true)
    {
      return;
      if (localObject2 != null);
      for (long l = ((com.tencent.mm.at.e)localObject2).fDy; ; l = -1L)
      {
        a(paramString, paramInt, str1, (String)localObject1, paramg, l);
        AppMethodBeat.o(35103);
        break;
      }
      a(paramString, paramInt, str1, "", paramg, -1L);
      AppMethodBeat.o(35103);
    }
  }

  private void a(String paramString1, int paramInt, String paramString2, String paramString3, com.tencent.mm.ai.g paramg, long paramLong)
  {
    AppMethodBeat.i(35106);
    if (!bo.isNullOrNil(this.fileName))
    {
      this.zJb = 1;
      this.zJc = 1;
      if (!asl(this.fileName))
        AppMethodBeat.o(35106);
    }
    while (true)
    {
      return;
      if ((this.fDC == 1) && (!r.g(this.fileName, paramString1, false)))
        this.fDC = 0;
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 96L, 1L, false);
      this.zIY = new com.tencent.mm.at.l(paramInt, paramString2, paramString1, this.fileName, this.fDC, paramg, 0, paramString3, "", true, 2130838182, this.zJf, this.fFz, this.cEB, paramLong);
      if (this.zIX == 1)
        this.zIY.aha();
      aw.Rg().a(this.zIY, 0);
      this.zIZ = true;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "summersafecdn jacks consumption: %d, compressType:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(this.fDC) });
      bv.aaq().c(bv.fnv, null);
      AppMethodBeat.o(35106);
      continue;
      if (this.zJd)
      {
        this.zJb += 1;
        if (!asl((String)this.zJa.get(0)))
        {
          AppMethodBeat.o(35106);
        }
        else
        {
          if ((this.fDC == 1) && (!r.g((String)this.zJa.get(0), paramString1, false)))
            this.fDC = 0;
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "summersafecdn multiSendType compressType:%d", new Object[] { Integer.valueOf(this.fDC) });
          this.zIY = new com.tencent.mm.at.l(paramInt, paramString2, paramString1, (String)this.zJa.get(0), this.fDC, paramg, 0, paramString3, "", true, 2130838182);
          if (this.zIX == 1)
            this.zIY.aha();
          this.zIZ = true;
          aw.Rg().a(this.zIY, 0);
          bv.aaq().c(bv.fnv, null);
        }
      }
      else
      {
        AppMethodBeat.o(35106);
      }
    }
  }

  private void a(String paramString, j.b paramb, byte[] paramArrayOfByte, bi parambi)
  {
    AppMethodBeat.i(35097);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "summerbig send toUser[%s], attachid[%s]", new Object[] { paramString, paramb.csD });
    Object localObject1 = com.tencent.mm.pluginsdk.model.app.l.aiM(paramb.csD);
    if (!bo.isNullOrNil(paramb.fgu))
      localObject1 = com.tencent.mm.pluginsdk.model.app.l.d(parambi, paramb.csD);
    Object localObject2 = "";
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject3 = localObject2;
      if (((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath != null)
      {
        localObject3 = localObject2;
        if (!((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath.equals(""))
        {
          aw.ZK();
          localObject3 = com.tencent.mm.pluginsdk.model.app.l.X(com.tencent.mm.model.c.Ye(), paramb.title, paramb.fgp);
          com.tencent.mm.vfs.e.y(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath, (String)localObject3);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath, paramb.title, localObject3, Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.b)localObject1).bCR()) });
        }
      }
    }
    localObject2 = j.b.a(paramb);
    ((j.b)localObject2).fgr = 3;
    if ((parambi != null) && (paramb.type == 6) && (!bo.isNullOrNil(paramb.fgu)) && (localObject1 != null) && ((!com.tencent.mm.vfs.e.ct(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath)) || (com.tencent.mm.vfs.e.asZ(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath) != ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_totalLen)))
    {
      a((j.b)localObject2, (com.tencent.mm.pluginsdk.model.app.b)localObject1, parambi, paramString, (String)localObject3, paramArrayOfByte);
      AppMethodBeat.o(35097);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil((String)localObject3)) || ((paramb.fgs == 0) && (paramb.fgo <= 26214400)))
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "summerbig send attachPath is null islargefilemsg[%d], attachlen[%d]", new Object[] { Integer.valueOf(paramb.fgs), Integer.valueOf(paramb.fgo) });
      aw.Rg().a(new z(paramb, null, paramString, new MsgRetransmitUI.19(this, paramb, (j.b)localObject2, paramString, paramArrayOfByte)), 0);
      AppMethodBeat.o(35097);
    }
    com.tencent.mm.pluginsdk.model.app.l.a((j.b)localObject2, paramb.appId, paramb.appName, paramString, (String)localObject3, paramArrayOfByte, this.hcl);
    if (((j.b)localObject2).type == 36)
      if (!paramString.endsWith("chatroom"))
        break label561;
    label561: for (int i = 1; ; i = 0)
    {
      parambi = URLEncoder.encode(bo.nullAsNil(((j.b)localObject2).url));
      localObject1 = URLEncoder.encode(bo.nullAsNil(((j.b)localObject2).title));
      paramb = URLEncoder.encode(bo.nullAsNil(((j.b)localObject2).description));
      paramArrayOfByte = URLEncoder.encode(bo.nullAsNil(((j.b)localObject2).fiO));
      com.tencent.mm.plugin.report.service.h.pYm.e(14127, new Object[] { ((j.b)localObject2).appId, ((j.b)localObject2).fiP, paramArrayOfByte, localObject1, paramb, "", parambi, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(i), paramString });
      AppMethodBeat.o(35097);
      break;
    }
  }

  private boolean a(com.tencent.mm.at.e parame, bi parambi, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(35104);
    Object localObject = br.z(parame.fDK, "msg");
    boolean bool;
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "parse cdnInfo failed. [%s]", new Object[] { parame.fDK });
      bool = false;
      AppMethodBeat.o(35104);
    }
    while (true)
    {
      return bool;
      int i = parame.fDC;
      String str1;
      if (i != 1)
        str1 = (String)((Map)localObject).get(".msg.img.$cdnmidimgurl");
      for (int j = 2; ; j = 1)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "cdntra read xml  comptype:%d url:[%s]", new Object[] { Integer.valueOf(i), str1 });
        if (!bo.isNullOrNil(str1))
          break label158;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "cdntra get cdnUrlfailed.");
        bool = false;
        AppMethodBeat.o(35104);
        break;
        str1 = (String)((Map)localObject).get(".msg.img.$cdnbigimgurl");
      }
      label158: String str2 = (String)((Map)localObject).get(".msg.img.$aeskey");
      if (bo.isNullOrNil(str2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "cdntra get aes key failed.");
        bool = false;
        AppMethodBeat.o(35104);
      }
      else if (bo.isNullOrNil(com.tencent.mm.al.c.a("downimg", parame.fDG, parambi.field_talker, parambi.field_msgId)))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgRetransmitUI", "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
        bool = false;
        AppMethodBeat.o(35104);
      }
      else
      {
        String str3 = (String)((Map)localObject).get(".msg.img.$md5");
        localObject = new com.tencent.mm.i.g();
        ((com.tencent.mm.i.g)localObject).egl = new MsgRetransmitUI.8(this, parambi, paramInt, j, paramString2, paramString3, paramString1, str3, i, parame);
        ((com.tencent.mm.i.g)localObject).field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), paramString2, parambi.field_msgId);
        ((com.tencent.mm.i.g)localObject).field_fileId = str1;
        ((com.tencent.mm.i.g)localObject).field_aesKey = str2;
        ((com.tencent.mm.i.g)localObject).field_filemd5 = str3;
        ((com.tencent.mm.i.g)localObject).field_fileType = j;
        ((com.tencent.mm.i.g)localObject).field_talker = paramString2;
        ((com.tencent.mm.i.g)localObject).field_priority = com.tencent.mm.i.a.efC;
        ((com.tencent.mm.i.g)localObject).field_svr_signature = "";
        ((com.tencent.mm.i.g)localObject).field_onlycheckexist = true;
        ((com.tencent.mm.i.g)localObject).field_trysafecdn = true;
        if (!com.tencent.mm.al.f.afx().e((com.tencent.mm.i.g)localObject))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "check exist fail! download img before retransmit");
          bool = false;
          AppMethodBeat.o(35104);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(35104);
        }
      }
    }
  }

  // ERROR //
  private static boolean asl(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: ldc_w 984
    //   7: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: ldc 226
    //   12: ldc_w 986
    //   15: iconst_1
    //   16: anewarray 240	java/lang/Object
    //   19: dup
    //   20: iconst_0
    //   21: aload_0
    //   22: aastore
    //   23: invokestatic 567	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_0
    //   27: invokestatic 990	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   30: astore_3
    //   31: aload_3
    //   32: astore_1
    //   33: new 992	android/graphics/BitmapFactory$Options
    //   36: astore 4
    //   38: aload_3
    //   39: astore_1
    //   40: aload 4
    //   42: invokespecial 993	android/graphics/BitmapFactory$Options:<init>	()V
    //   45: aload_3
    //   46: astore_1
    //   47: aload 4
    //   49: iconst_1
    //   50: putfield 996	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   53: aload_3
    //   54: astore_1
    //   55: aload_3
    //   56: aconst_null
    //   57: aload 4
    //   59: invokestatic 1002	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   62: pop
    //   63: aload_3
    //   64: astore_1
    //   65: aload 4
    //   67: getfield 1005	android/graphics/BitmapFactory$Options:outWidth	I
    //   70: iflt +29 -> 99
    //   73: aload_3
    //   74: astore_1
    //   75: aload 4
    //   77: getfield 1008	android/graphics/BitmapFactory$Options:outHeight	I
    //   80: istore 5
    //   82: iload 5
    //   84: iflt +15 -> 99
    //   87: aload_3
    //   88: invokestatic 1011	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   91: ldc_w 984
    //   94: invokestatic 134	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: iload_2
    //   98: ireturn
    //   99: iconst_0
    //   100: istore_2
    //   101: goto -14 -> 87
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_1
    //   107: ldc 226
    //   109: ldc_w 1013
    //   112: iconst_1
    //   113: anewarray 240	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_0
    //   119: aastore
    //   120: invokestatic 947	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_1
    //   124: invokestatic 1011	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   127: ldc_w 984
    //   130: invokestatic 134	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: iconst_0
    //   134: istore_2
    //   135: goto -38 -> 97
    //   138: astore_0
    //   139: aload_1
    //   140: invokestatic 1011	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   143: ldc_w 984
    //   146: invokestatic 134	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload_0
    //   150: athrow
    //   151: astore_0
    //   152: goto -13 -> 139
    //   155: astore_1
    //   156: aload_3
    //   157: astore_1
    //   158: goto -51 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   26	31	104	java/io/FileNotFoundException
    //   26	31	138	finally
    //   33	38	138	finally
    //   40	45	138	finally
    //   47	53	138	finally
    //   55	63	138	finally
    //   65	73	138	finally
    //   75	82	138	finally
    //   107	123	151	finally
    //   33	38	155	java/io/FileNotFoundException
    //   40	45	155	java/io/FileNotFoundException
    //   47	53	155	java/io/FileNotFoundException
    //   55	63	155	java/io/FileNotFoundException
    //   65	73	155	java/io/FileNotFoundException
    //   75	82	155	java/io/FileNotFoundException
  }

  private boolean asn(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(35096);
    j.b localb = j.b.me(bo.anj(this.cJh));
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "summerbig processAppMessageTransfer msgContent[%s], content[%s]", new Object[] { this.cJh, localb });
    if (localb == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "transfer app message error: app content null");
      AppMethodBeat.o(35096);
    }
    bi localbi;
    Object localObject;
    boolean bool2;
    while (true)
    {
      return bool1;
      aw.ZK();
      localbi = com.tencent.mm.model.c.XO().jf(this.cvx);
      if (localbi.drC())
      {
        if (localb.type == 33)
          com.tencent.mm.ui.chatting.l.b(paramString, localb, ce.e(((HashMap)getIntent().getSerializableExtra("appbrand_params")).get("img_url"), null));
        while (true)
        {
          AppMethodBeat.o(35096);
          bool1 = true;
          break;
          com.tencent.mm.ui.chatting.j.a(this, paramString, this.cJh, localbi.field_isSend, this.yFl);
        }
      }
      String str = null;
      localObject = null;
      byte[] arrayOfByte1 = null;
      if (this.zIS == null)
      {
        localObject = str;
        if (this.zeC < 0)
        {
          localObject = str;
          if (localbi.field_imgPath != null)
          {
            localObject = str;
            if (!localbi.field_imgPath.equals(""))
            {
              str = o.ahl().I(localbi.field_imgPath, true);
              localObject = arrayOfByte1;
              try
              {
                arrayOfByte1 = com.tencent.mm.vfs.e.e(str, 0, -1);
                localObject = arrayOfByte1;
                bool2 = cf(arrayOfByte1);
                localObject = arrayOfByte1;
                if (!bool2)
                  AppMethodBeat.o(35096);
              }
              catch (Exception localException1)
              {
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", new Object[] { paramString, localException1.getLocalizedMessage() });
              }
            }
          }
        }
      }
    }
    while (true)
      while (true)
      {
        com.tencent.mm.sdk.g.d.xDH.a(new MsgRetransmitUI.15(this, paramString, localb, (byte[])localObject, localbi), "MicroMsg.MsgRetransmitUI");
        break;
        try
        {
          byte[] arrayOfByte2 = com.tencent.mm.vfs.e.e(this.zIS, 0, -1);
          localObject = arrayOfByte2;
          bool2 = cf(arrayOfByte2);
          localObject = arrayOfByte2;
          if (!bool2)
            AppMethodBeat.o(35096);
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgRetransmitUI", localException2, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", new Object[] { paramString, localException2.getLocalizedMessage() });
        }
      }
  }

  private void aso(String paramString)
  {
    AppMethodBeat.i(35102);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "sendMultiVedeo");
    paramString = new com.tencent.mm.pluginsdk.model.j(this, null, getIntent(), paramString, 1, new MsgRetransmitUI.6(this));
    com.tencent.mm.sdk.g.d.post(paramString, "ChattingUI_importMultiVideo");
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new MsgRetransmitUI.7(this, paramString));
    AppMethodBeat.o(35102);
  }

  private void b(com.tencent.mm.at.e parame, bi parambi, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(35105);
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    localPString.value = this.fileName;
    int i = parame.fDC;
    long l1 = o.ahl().a(this.fileName, i, paramInt, localPString, localPInt1, localPInt2);
    com.tencent.mm.at.e locale = o.ahl().b(Long.valueOf(l1));
    locale.lw(1);
    Object localObject = new bi();
    ((bi)localObject).setType(com.tencent.mm.model.t.nL(paramString2));
    ((bi)localObject).ju(paramString2);
    ((bi)localObject).hO(1);
    ((bi)localObject).setStatus(1);
    ((bi)localObject).jv(localPString.value);
    ((bi)localObject).hZ(localPInt1.value);
    ((bi)localObject).ia(localPInt2.value);
    ((bi)localObject).eJ(bf.oC(((cy)localObject).field_talker));
    if (com.tencent.mm.aj.f.kq(((cy)localObject).field_talker))
      parambi.ix(com.tencent.mm.aj.a.e.aae());
    aw.ZK();
    long l2 = com.tencent.mm.model.c.XO().Z((bi)localObject);
    if (l2 >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "NetSceneUploadMsgImg: local msgId = ".concat(String.valueOf(l2)));
      locale.fG((int)l2);
      o.ahl().a(Long.valueOf(l1), locale);
      localObject = new HashMap();
      ((HashMap)localObject).put(Long.valueOf(l2), parame);
      o.ahm().a(parame.fDy, parambi.field_msgId, i, localObject, 2130838182, new MsgRetransmitUI.10(this, paramString2, paramInt, paramString3, paramString1));
      AppMethodBeat.o(35105);
      return;
    }
  }

  private static boolean cf(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    AppMethodBeat.i(35108);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", new Object[] { Byte.valueOf(paramArrayOfByte[0]), Byte.valueOf(paramArrayOfByte[1]), Byte.valueOf(paramArrayOfByte[2]), Byte.valueOf(paramArrayOfByte[3]), Byte.valueOf(paramArrayOfByte[4]) });
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
    if ((localOptions.outWidth >= 0) && (localOptions.outHeight >= 0))
      AppMethodBeat.o(35108);
    while (true)
    {
      return bool;
      AppMethodBeat.o(35108);
      bool = false;
    }
  }

  private boolean cj(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(35099);
    if (this.fileName == null)
    {
      AppMethodBeat.o(35099);
      paramBoolean = false;
      return paramBoolean;
    }
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(this.fileName);
    long l;
    label64: Object localObject1;
    label75: Object localObject2;
    if (localEmojiInfo == null)
    {
      l = com.tencent.mm.vfs.e.asZ(this.fileName);
      if (localEmojiInfo != null)
        break label290;
      localObject1 = this.fileName;
      localObject2 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
      if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject1, (BitmapFactory.Options)localObject2) == null) || (((BitmapFactory.Options)localObject2).outHeight <= com.tencent.mm.m.b.Na())) && (((BitmapFactory.Options)localObject2).outWidth <= com.tencent.mm.m.b.Na()))
        break label643;
    }
    label643: for (int i = 1; ; i = 0)
    {
      if ((l > com.tencent.mm.m.b.Nb()) || (i != 0))
      {
        if (localEmojiInfo == null);
        for (paramString = "fileName"; ; paramString = localEmojiInfo.Aq())
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "emoji is over size. md5:%s size:%d", new Object[] { paramString, Integer.valueOf(this.length) });
          this.zJp = false;
          this.zIU = false;
          com.tencent.mm.ui.base.h.a(this, getString(2131299043), "", getString(2131300601), new MsgRetransmitUI.21(this));
          if (this.zJf == 1)
            com.tencent.mm.plugin.report.service.h.pYm.e(13459, new Object[] { Long.valueOf(l), Integer.valueOf(1), localEmojiInfo.Aq(), Integer.valueOf(1) });
          AppMethodBeat.o(35099);
          paramBoolean = bool;
          break;
          l = com.tencent.mm.vfs.e.asZ(localEmojiInfo.dve());
          break label64;
          label290: localObject1 = localEmojiInfo.dve();
          break label75;
        }
      }
      if (this.zJf == 1)
      {
        localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
        if (localEmojiInfo == null)
        {
          localObject1 = "";
          label332: ((com.tencent.mm.plugin.report.service.h)localObject2).e(13459, new Object[] { Long.valueOf(l), Integer.valueOf(0), localObject1, Integer.valueOf(1) });
        }
      }
      else
      {
        if (!paramBoolean)
          break label527;
        if (localEmojiInfo != null)
          break label636;
        localObject1 = new WXMediaMessage(new WXEmojiObject(this.fileName));
        localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(getApplicationContext(), (WXMediaMessage)localObject1, "");
      }
      label527: label636: for (localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd((String)localObject1); ; localObject1 = localEmojiInfo)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13459, new Object[] { Long.valueOf(l), Integer.valueOf(0), ((EmojiInfo)localObject1).Aq(), Integer.valueOf(2) });
        com.tencent.mm.ui.chatting.j.b((EmojiInfo)localObject1, paramString);
        finish();
        AppMethodBeat.o(35099);
        paramBoolean = bool;
        break;
        localObject1 = localEmojiInfo.Aq();
        break label332;
        if ((localEmojiInfo != null) && (l > ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().d(localEmojiInfo, false)))
        {
          com.tencent.mm.ui.chatting.j.b(localEmojiInfo, paramString);
          AppMethodBeat.o(35099);
          paramBoolean = bool;
          break;
        }
        if (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(this, paramString, this.fileName))
        {
          AppMethodBeat.o(35099);
          paramBoolean = bool;
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "Retransmit emoji failed.");
        AppMethodBeat.o(35099);
        paramBoolean = false;
        break;
      }
    }
  }

  private void dKf()
  {
    AppMethodBeat.i(35094);
    switch (this.zIX)
    {
    default:
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "unknown scene %s", new Object[] { Integer.valueOf(this.zIX) });
      finish();
      AppMethodBeat.o(35094);
    case 0:
    case 1:
    case 2:
    }
    label68: Object localObject4;
    while (true)
    {
      return;
      label178: int i;
      switch (this.msgType)
      {
      case 3:
      default:
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "unknown type %s", new Object[] { Integer.valueOf(this.msgType) });
      case 2:
      case 6:
      case 10:
      case 12:
      case 13:
      case 14:
      case 16:
        i = 1;
      case 0:
      case 1:
      case 5:
      case 8:
      case 11:
      case 4:
      case 15:
      case 7:
      case 9:
      }
      boolean bool1;
      label504: Object localObject6;
      while (true)
        if (i != 0)
        {
          bool1 = true;
          label574: label582: int j;
          if ((this.msgType == 11) || (this.msgType == 1))
          {
            localObject1 = this.zIR;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "processVideoTransfer");
            if ((11 == this.msgType) && (u.uv(this.fileName)))
            {
              com.tencent.mm.ui.widget.snackbar.b.a(this, getResources().getString(2131302960), "", null);
              this.mHandler.postDelayed(new MsgRetransmitUI.18(this), 1800L);
              AppMethodBeat.o(35094);
              break;
              if (dKg())
                break label178;
              finish();
              i = 0;
              continue;
              if ((this.cJh != null) && (!this.cJh.equals("")))
                break label178;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "Transfer text erro: content null");
              finish();
              i = 0;
              continue;
              finish();
              i = 0;
              continue;
              if (!dKg())
              {
                finish();
                i = 0;
                continue;
              }
              if (this.fileName != null)
                break label178;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "Transfer fileName erro: fileName null");
              finish();
              i = 0;
              continue;
              if ((this.cJh != null) && (!this.cJh.equals("")))
                break label178;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "Transfer text erro: content null");
              finish();
              i = 0;
              continue;
            }
            localObject2 = new MsgRetransmitUI.b((byte)0);
            ((MsgRetransmitUI.b)localObject2).zJI = new LinkedList();
            ((MsgRetransmitUI.b)localObject2).zJI.addAll((Collection)localObject1);
            localObject3 = u.ut(this.fileName);
            localObject4 = ((List)localObject1).iterator();
            label972: 
            while (((Iterator)localObject4).hasNext())
            {
              localObject5 = (String)((Iterator)localObject4).next();
              if (localObject3 != null)
              {
                localObject1 = ((s)localObject3).getFileName();
                if (localObject3 == null)
                  break label574;
              }
              for (localObject6 = Integer.valueOf(((s)localObject3).status); ; localObject6 = "")
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "info[%s, %s]", new Object[] { localObject1, localObject6 });
                if ((localObject3 == null) || (((s)localObject3).status != 199))
                  break label582;
                a((MsgRetransmitUI.b)localObject2, (String)localObject5);
                break;
                localObject1 = "";
                break label504;
              }
              if (localObject3 == null)
              {
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgRetransmitUI", "checkVideoCdnInfo info is null !!!");
                i = 0;
              }
              while (true)
              {
                if (i != 0)
                  break label972;
                dKh();
                break;
                Object localObject7 = br.z(((s)localObject3).alw(), "msg");
                if (localObject7 == null)
                {
                  com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgRetransmitUI", "%s cdntra parse video recv xml failed");
                  i = 0;
                }
                else
                {
                  String str1 = (String)((Map)localObject7).get(".msg.videomsg.$cdnvideourl");
                  if (bo.isNullOrNil(str1))
                  {
                    i = 0;
                  }
                  else
                  {
                    String str2 = (String)((Map)localObject7).get(".msg.videomsg.$aeskey");
                    localObject1 = (String)((Map)localObject7).get(".msg.videomsg.$md5");
                    localObject6 = (String)((Map)localObject7).get(".msg.videomsg.$newmd5");
                    j = Integer.valueOf((String)((Map)localObject7).get(".msg.videomsg.$length")).intValue();
                    int k = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$playlength"), 0);
                    i = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$cdnthumblength"), 0);
                    localObject7 = new com.tencent.mm.i.g();
                    ((com.tencent.mm.i.g)localObject7).egl = new MsgRetransmitUI.14(this, str1, str2, i, j, (String)localObject5, (String)localObject1, (String)localObject6, k);
                    ((com.tencent.mm.i.g)localObject7).field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), (String)localObject5, this.cvx);
                    ((com.tencent.mm.i.g)localObject7).field_fileId = str1;
                    ((com.tencent.mm.i.g)localObject7).field_aesKey = str2;
                    ((com.tencent.mm.i.g)localObject7).field_filemd5 = ((String)localObject1);
                    ((com.tencent.mm.i.g)localObject7).field_fileType = 4;
                    ((com.tencent.mm.i.g)localObject7).field_talker = ((String)localObject5);
                    ((com.tencent.mm.i.g)localObject7).field_priority = com.tencent.mm.i.a.efC;
                    ((com.tencent.mm.i.g)localObject7).field_svr_signature = "";
                    ((com.tencent.mm.i.g)localObject7).field_onlycheckexist = true;
                    ((com.tencent.mm.i.g)localObject7).field_trysafecdn = true;
                    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "field_fileId:%s, md5:%s, field_aesKey:%s, xml:%s", new Object[] { str1, localObject1, str2, ((s)localObject3).alw() });
                    if (!com.tencent.mm.al.f.afx().e((com.tencent.mm.i.g)localObject7))
                    {
                      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "check exist fail! download video before retransmit");
                      finish();
                      i = 0;
                    }
                    else
                    {
                      this.zIU = false;
                      finish();
                      i = 1;
                    }
                  }
                }
              }
            }
            AppMethodBeat.o(35094);
            break;
          }
          if (this.msgType == 0)
            this.zJj = this.zIR.size();
          i = this.zIR.size();
          localObject1 = this.zIR.iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject6 = (String)((Iterator)localObject1).next();
            j = i - 1;
            boolean bool2;
            if (j == 0)
            {
              bool2 = true;
              label1056: switch (this.msgType)
              {
              case 1:
              case 3:
              case 11:
              case 15:
              default:
              case 0:
              case 2:
              case 16:
              case 4:
              case 5:
              case 6:
              case 7:
              case 8:
              case 9:
              case 10:
              case 12:
              case 13:
              case 14:
              }
            }
            while (true)
            {
              if (this.zJe)
                k.qo(bool2);
              i = j;
              break;
              bool2 = false;
              break label1056;
              aw.RS().Bn();
              com.tencent.mm.sdk.g.d.xDH.a(new MsgRetransmitUI.1(this, (String)localObject6), "MicroMsg.MsgRetransmitUI");
              continue;
              bool1 = asn((String)localObject6);
              continue;
              r.Yz();
              localObject6 = new com.tencent.mm.modelmulti.h((String)localObject6, this.cJh, com.tencent.mm.model.t.nK((String)localObject6));
              aw.Rg().a((m)localObject6, 0);
              bool1 = true;
              continue;
              bool1 = cj((String)localObject6, false);
              continue;
              localObject2 = j.b.me(bo.anj(this.cJh));
              if (localObject2 == null)
              {
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "transfer app message error: app content null");
                bool1 = false;
              }
              else
              {
                a((String)localObject6, (j.b)localObject2, null, null);
                bool1 = true;
                continue;
                localObject6 = new com.tencent.mm.modelvoice.f(q.f((String)localObject6, this.fileName, this.length), 1);
                aw.Rg().a((m)localObject6, 0);
                bool1 = true;
                continue;
                localObject2 = bi.a.apC(this.cJh);
                localObject3 = this.cJh;
                if (ad.aox(((bi.a)localObject2).svN));
                for (i = 66; ; i = 42)
                {
                  localObject6 = new com.tencent.mm.modelmulti.h((String)localObject6, (String)localObject3, i);
                  aw.Rg().a((m)localObject6, 0);
                  break;
                }
                localObject6 = new com.tencent.mm.modelmulti.h((String)localObject6, this.cJh, 48);
                aw.Rg().a((m)localObject6, 0);
                bool1 = true;
                continue;
                localObject3 = new nt();
                ((nt)localObject3).cJY.type = 4;
                localObject2 = ((nt)localObject3).cJY;
                aw.ZK();
                ((nt.a)localObject2).cKd = com.tencent.mm.model.c.XO().jf(this.cvx);
                ((nt)localObject3).cJY.toUser = ((String)localObject6);
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                continue;
                k.m(this, (String)localObject6, bool2);
                continue;
                k.l(this, (String)localObject6, bool2);
                continue;
                localObject2 = new qn();
                ((qn)localObject2).cMG.cuQ = this.cvx;
                ((qn)localObject2).cMG.cDt = this.cJh;
                ((qn)localObject2).cMG.cDu = ((String)localObject6);
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
              }
            }
          }
          localObject2 = (String)this.zIR.get(0);
          switch (this.msgType)
          {
          case 3:
          case 15:
          default:
            finish();
          case 1:
          case 11:
          case 0:
          case 2:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 12:
          case 13:
          case 14:
          case 16:
          }
        }
      AppMethodBeat.o(35094);
      continue;
      AppMethodBeat.o(35094);
      continue;
      if ((this.msgType == 2) || (this.msgType == 16))
      {
        localObject3 = j.b.me(bo.anj(this.cJh));
        if ((localObject3 == null) || (((j.b)localObject3).type != 5) || (bo.isNullOrNil(((j.b)localObject3).url)))
          break label2070;
        localObject1 = "";
      }
      label2070: 
      while ((bool1) || (localObject3 == null) || (((j.b)localObject3).type != 33))
        try
        {
          localObject6 = URLEncoder.encode(((j.b)localObject3).url, "UTF-8");
          localObject1 = localObject6;
          if (bool1)
          {
            i = 1;
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((j.b)localObject3).url, Long.valueOf(this.startTime), Integer.valueOf(this.zJk), Integer.valueOf(1), Integer.valueOf(i) });
            com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { localObject1, Long.valueOf(this.startTime), Integer.valueOf(this.zJk), Integer.valueOf(1), Integer.valueOf(i) });
            if (!bool1)
              break label2297;
            if (this.zIU)
              com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
            localObject1 = new Intent();
            localObject6 = new ArrayList();
            ((ArrayList)localObject6).addAll(this.zIR);
            ((Intent)localObject1).putStringArrayListExtra("SendMsgUsernames", (ArrayList)localObject6);
            setResult(-1, (Intent)localObject1);
            if (this.zJp)
              this.mHandler.postDelayed(new MsgRetransmitUI.5(this), 1800L);
            if ((this.zIT) && (!this.zJh))
            {
              localObject1 = new Intent(this, ChattingUI.class);
              ((Intent)localObject1).addFlags(67108864);
              ((Intent)localObject1).putExtra("Chat_User", (String)localObject2);
              startActivity((Intent)localObject1);
            }
            AppMethodBeat.o(35094);
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgRetransmitUI", localUnsupportedEncodingException, "", new Object[0]);
            continue;
            i = 2;
          }
        }
      localObject1 = new com.tencent.mm.g.a.n();
      ((com.tencent.mm.g.a.n)localObject1).csr.scene = this.zJn;
      ((com.tencent.mm.g.a.n)localObject1).csr.bQe = this.zJo;
      if (2 == this.zJn)
      {
        ((com.tencent.mm.g.a.n)localObject1).csr.cst = (this.zJm + ":" + this.zJl);
        label2164: if (!((String)localObject2).endsWith("@chatroom"))
          break label2286;
      }
      label2286: for (((com.tencent.mm.g.a.n)localObject1).csr.action = 2; ; ((com.tencent.mm.g.a.n)localObject1).csr.action = 1)
      {
        ((com.tencent.mm.g.a.n)localObject1).csr.css = (((j.b)localObject3).fiZ + 1);
        ((com.tencent.mm.g.a.n)localObject1).csr.csu = ((j.b)localObject3).fiO;
        ((com.tencent.mm.g.a.n)localObject1).csr.csl = ((j.b)localObject3).fiP;
        ((com.tencent.mm.g.a.n)localObject1).csr.appId = ((j.b)localObject3).fiQ;
        ((com.tencent.mm.g.a.n)localObject1).csr.csv = "";
        ((com.tencent.mm.g.a.n)localObject1).csr.csw = bo.anT();
        ((com.tencent.mm.g.a.n)localObject1).csr.csx = 2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        break;
        ((com.tencent.mm.g.a.n)localObject1).csr.cst = this.zJm;
        break label2164;
      }
      label2297: finish();
      AppMethodBeat.o(35094);
      continue;
      localObject1 = (String)this.zIR.get(0);
      if (!dKg())
      {
        finish();
        AppMethodBeat.o(35094);
      }
      else
      {
        switch (this.msgType)
        {
        default:
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "doRetransmitOnSceneShareFromSystemGallery unknown msg type:%d", new Object[] { Integer.valueOf(this.msgType) });
          AppMethodBeat.o(35094);
          break;
        case 0:
          if ((this.zJa != null) && (this.zJa.size() > 0))
            this.zJc = this.zJa.size();
          this.fEW = new MsgRetransmitUI.2(this);
          this.zIV = com.tencent.mm.ui.base.h.a(this, getString(2131301512, new Object[] { Integer.valueOf(1), Integer.valueOf(this.zJc), Integer.valueOf(0) }), getString(2131297061), new MsgRetransmitUI.3(this));
          this.zIV.setOnCancelListener(new MsgRetransmitUI.4(this));
          this.zIV.setCanceledOnTouchOutside(false);
          this.zIV.getButton(-1).setText(2131296868);
          a((String)localObject1, 6, this.fEW);
          AppMethodBeat.o(35094);
          break;
        case 1:
        case 11:
          if (!com.tencent.mm.network.ab.ch(this))
          {
            com.tencent.mm.ui.base.h.a(this, 2131304250, 2131297061, 2131296994, 2131296868, new MsgRetransmitUI.16(this, (String)localObject1), new MsgRetransmitUI.17(this));
            AppMethodBeat.o(35094);
          }
          else
          {
            s(getIntent(), (String)localObject1);
            AppMethodBeat.o(35094);
          }
          break;
        case 5:
          cj((String)localObject1, true);
          AppMethodBeat.o(35094);
          continue;
          switch (this.msgType)
          {
          default:
            AppMethodBeat.o(35094);
          case 2:
          case 16:
          }
          break;
        }
      }
    }
    this.zIR.get(0);
    Object localObject1 = getIntent().getExtras().getString("_mmessage_appPackage");
    Object localObject2 = new com.tencent.mm.pluginsdk.model.app.f();
    ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName = ((String)localObject1);
    am.bYJ().b((com.tencent.mm.sdk.e.c)localObject2, new String[] { "packageName" });
    Object localObject5 = new SendMessageToWX.Req(getIntent().getExtras()).message;
    Object localObject3 = new c(new MsgRetransmitUI.12(this));
    if (((WXMediaMessage)localObject5).thumbData == null);
    for (localObject1 = null; ; localObject1 = com.tencent.mm.sdk.platformtools.d.bQ(((WXMediaMessage)localObject5).thumbData))
      switch (((WXMediaMessage)localObject5).mediaObject.type())
      {
      default:
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SendAppMessage", "unkown app message type, skipped, type=" + ((WXMediaMessage)localObject5).mediaObject.type());
        AppMethodBeat.o(35094);
        break label68;
      case 1:
      case 2:
      case 3:
      case 4:
      case 6:
      case 5:
      case 7:
      }
    localObject1 = View.inflate(this, 2130968779, null);
    ((TextView)((View)localObject1).findViewById(2131821185)).setText(((WXMediaMessage)localObject5).title);
    while (true)
    {
      ((TextView)((View)localObject1).findViewById(2131821512)).setText(com.tencent.mm.pluginsdk.model.app.g.b(this, (com.tencent.mm.pluginsdk.model.app.f)localObject2, null));
      ((c)localObject3).gud = com.tencent.mm.ui.base.h.a(this, null, (View)localObject1, getString(2131297041), getString(2131296868), new c.1((c)localObject3), new c.2((c)localObject3));
      break;
      View localView = View.inflate(this, 2130968778, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      ((TextView)localView.findViewById(2131821185)).setText(((WXMediaMessage)localObject5).title);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, 2130968777, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(2131821185);
      localObject4 = (TextView)localView.findViewById(2131820991);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject4).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, 2130968777, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      localObject4 = (TextView)localView.findViewById(2131821185);
      localObject1 = (TextView)localView.findViewById(2131820991);
      ((TextView)localObject4).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, 2130968777, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      localObject4 = (TextView)localView.findViewById(2131821185);
      localObject1 = (TextView)localView.findViewById(2131820991);
      ((TextView)localObject4).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, 2130968777, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      localObject4 = (TextView)localView.findViewById(2131821185);
      localObject1 = (TextView)localView.findViewById(2131820991);
      ((TextView)localObject4).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, 2130968777, null);
      ((ImageView)localView.findViewById(2131821511)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(2131821185);
      localObject4 = (TextView)localView.findViewById(2131820991);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject4).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
    }
  }

  private boolean dKg()
  {
    AppMethodBeat.i(35100);
    aw.ZK();
    boolean bool;
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "sdcard is not available, type = " + this.msgType);
      com.tencent.mm.ui.base.t.hO(this);
      bool = false;
      AppMethodBeat.o(35100);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(35100);
    }
  }

  private void dKh()
  {
    AppMethodBeat.i(35109);
    com.tencent.mm.sdk.g.d.xDH.a(new MsgRetransmitUI.11(this), "MicroMsg.MsgRetransmitUI");
    this.zIU = false;
    AppMethodBeat.o(35109);
  }

  private void s(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(35101);
    if (this.zJd)
    {
      this.zJc = this.zJa.size();
      paramIntent = paramIntent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          paramIntent.next();
          if (this.zJq)
            break;
          aso(paramString);
        }
        AppMethodBeat.o(35101);
      }
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(35101);
      continue;
      this.zJc = 1;
      aso(paramString);
      AppMethodBeat.o(35101);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(35092);
    super.finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(35092);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(35095);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if (paramInt2 != -1)
    {
      localObject = j.b.me(bo.anj(this.cJh));
      if ((localObject != null) && (((j.b)localObject).type == 5) && (((j.b)localObject).url != null))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgRetransmitUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((j.b)localObject).url, Long.valueOf(this.startTime), Integer.valueOf(this.zJk), Integer.valueOf(1), Integer.valueOf(3) });
        paramIntent = "";
      }
    }
    while (true)
    {
      try
      {
        localObject = URLEncoder.encode(((j.b)localObject).url, "UTF-8");
        paramIntent = (Intent)localObject;
        com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramIntent, Long.valueOf(this.startTime), Integer.valueOf(this.zJk), Integer.valueOf(1), Integer.valueOf(3) });
        finish();
        AppMethodBeat.o(35095);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgRetransmitUI", localUnsupportedEncodingException, "", new Object[0]);
        continue;
      }
      if ((localUnsupportedEncodingException != null) && (localUnsupportedEncodingException.type == 33))
      {
        paramIntent = new com.tencent.mm.g.a.n();
        paramIntent.csr.bQe = this.zJo;
        paramIntent.csr.scene = this.zJn;
        if (2 == this.zJn);
        for (paramIntent.csr.cst = (this.zJm + ":" + this.zJl); ; paramIntent.csr.cst = this.zJm)
        {
          paramIntent.csr.css = (localUnsupportedEncodingException.fiZ + 1);
          paramIntent.csr.csu = localUnsupportedEncodingException.fiO;
          paramIntent.csr.csl = localUnsupportedEncodingException.fiP;
          paramIntent.csr.appId = localUnsupportedEncodingException.fiQ;
          paramIntent.csr.action = 1;
          paramIntent.csr.csv = "";
          paramIntent.csr.csw = bo.anT();
          paramIntent.csr.csx = 3;
          com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
          break;
        }
        if (paramInt1 != 0)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgRetransmitUI", "onActivityResult, unknown requestCode = ".concat(String.valueOf(paramInt1)));
          AppMethodBeat.o(35095);
        }
        else
        {
          this.zIR = bo.P(paramIntent.getStringExtra("Select_Conv_User").split(","));
          String str = paramIntent.getStringExtra("custom_send_text");
          this.mgP = paramIntent.getBooleanExtra("key_is_biz_chat", false);
          if (this.mgP)
            this.jMj = paramIntent.getLongExtra("key_biz_chat_id", -1L);
          paramInt1 = paramIntent.getIntExtra("Retr_Msg_Type", -1);
          if (paramInt1 != -1)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "summerbig replace msgType %d->%d", new Object[] { Integer.valueOf(this.msgType), Integer.valueOf(paramInt1) });
            this.msgType = paramInt1;
          }
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "summersafecdn onActivityResult doRetransmit msgType[%d], iScene[%d], size[%d]", new Object[] { Integer.valueOf(this.msgType), Integer.valueOf(this.zIX), Integer.valueOf(this.zIR.size()) });
          dKf();
          if (!TextUtils.isEmpty(str))
          {
            Iterator localIterator = this.zIR.iterator();
            while (localIterator.hasNext())
            {
              paramIntent = (String)localIterator.next();
              qb localqb = new qb();
              localqb.cMq.cMr = paramIntent;
              localqb.cMq.content = str;
              localqb.cMq.type = com.tencent.mm.model.t.nK(paramIntent);
              localqb.cMq.flags = 0;
              com.tencent.mm.sdk.b.a.xxA.m(localqb);
            }
          }
          AppMethodBeat.o(35095);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35091);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ae.a(getWindow());
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgRetransmitUI", "on activity create");
    this.startTime = bo.anT();
    this.msgType = getIntent().getIntExtra("Retr_Msg_Type", -1);
    this.cJh = getIntent().getStringExtra("Retr_Msg_content");
    this.cvx = getIntent().getLongExtra("Retr_Msg_Id", -1L);
    this.fileName = getIntent().getStringExtra("Retr_File_Name");
    this.zJa = getIntent().getStringArrayListExtra("Retr_File_Path_List");
    boolean bool;
    if ((this.zJa != null) && (this.zJa.size() > 0))
    {
      bool = true;
      this.zJd = bool;
      this.fDC = getIntent().getIntExtra("Retr_Compress_Type", 0);
      this.zIX = getIntent().getIntExtra("Retr_Scene", 0);
      this.length = getIntent().getIntExtra("Retr_length", 0);
      this.zIW = getIntent().getIntExtra("Retr_video_isexport", 0);
      this.zIS = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.zIT = getIntent().getBooleanExtra("Retr_go_to_chattingUI", true);
      this.zJh = getIntent().getBooleanExtra("Retr_start_where_you_are", true);
      paramBundle = getIntent();
      if (this.zIX != 0)
        break label751;
      bool = true;
      label257: this.zJi = paramBundle.getBooleanExtra("Multi_Retr", bool);
      if (this.zJi)
        this.zJh = true;
      this.zIU = getIntent().getBooleanExtra("Retr_show_success_tips", this.zJh);
      this.zJe = getIntent().getBooleanExtra("Edit_Mode_Sigle_Msg", false);
      this.yFl = getIntent().getBooleanExtra("is_group_chat", false);
      this.zeC = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      this.thumbPath = getIntent().getStringExtra("Retr_NewYear_Thumb_Path");
      this.zJf = getIntent().getIntExtra("Retr_MsgImgScene", 0);
      this.fFz = getIntent().getFloatExtra("Retr_Longtitude", -1000.0F);
      this.cEB = getIntent().getFloatExtra("Retr_Latitude", -1000.0F);
      this.fFA = getIntent().getStringExtra("Retr_AttachedContent");
      this.zJg = "gallery".equals(getIntent().getStringExtra("Retr_From"));
      this.hcl = getIntent().getStringExtra("reportSessionId");
      this.zJk = getIntent().getIntExtra("Retr_MsgFromScene", 0);
      this.zJl = getIntent().getStringExtra("Retr_MsgFromUserName");
      this.zJm = getIntent().getStringExtra("Retr_MsgTalker");
      this.zJn = getIntent().getIntExtra("Retr_MsgAppBrandFromScene", 1);
      this.zJo = getIntent().getIntExtra("Retr_MsgAppBrandServiceType", 0);
      aw.Rg().a(110, this);
      if (!com.tencent.mm.compatible.util.d.iW(19))
        setContentView(2130968882);
      paramBundle = new Intent(this, SelectConversationUI.class);
      paramBundle.putExtra("scene", 8);
      paramBundle.putExtra("select_is_ret", true);
      if (this.zJi)
        paramBundle.putExtra("mutil_select_is_ret", true);
      switch (this.msgType)
      {
      case 3:
      case 4:
      case 5:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      default:
        paramBundle.putExtra("Select_Conv_Type", 3);
      case 2:
      case 6:
      case 7:
      case 14:
      case 15:
      case 16:
      case 13:
      }
    }
    while (true)
    {
      paramBundle.putExtra("Retr_Msg_Type", this.msgType);
      paramBundle.putExtra("Retr_Msg_Id", this.cvx);
      paramBundle.putExtra("Retr_Msg_content", this.cJh);
      paramBundle.putExtra("image_path", this.fileName);
      startActivityForResult(paramBundle, 0);
      AppMethodBeat.o(35091);
      return;
      bool = false;
      break;
      label751: bool = false;
      break label257;
      paramBundle.putExtra("appbrand_params", getIntent().getSerializableExtra("appbrand_params"));
      if (this.zJk == 3)
        paramBundle.putExtra("scene_from", 3);
      paramBundle.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.zeC);
      paramBundle.putExtra("Retr_Big_File", getIntent().getBooleanExtra("Retr_Big_File", false));
      paramBundle.putExtra("Select_Conv_Type", 3);
      continue;
      paramBundle.putExtra("Select_Conv_Type", 11);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35093);
    if (!this.zIZ)
      aw.Rg().b(110, this);
    super.onDestroy();
    AppMethodBeat.o(35093);
  }

  @com.tencent.mm.sdk.platformtools.h
  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(35111);
    if ((paramm.getType() != 110) || (!(paramm instanceof com.tencent.mm.at.l)))
      AppMethodBeat.o(35111);
    while (true)
    {
      return;
      paramString = (com.tencent.mm.at.l)paramm;
      Object localObject;
      if (getIntent().getBooleanExtra("Retr_FromMainTimeline", false))
      {
        paramm = getIntent().getStringExtra("Retr_KSnsId");
        if (!com.tencent.mm.model.t.kH(paramString.cMr))
          break label192;
        localObject = new rf();
        ((rf)localObject).cNk.cFc = paramm;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      while (true)
      {
        if ((this.zJa == null) || (this.zJa.size() <= 1))
          break label223;
        this.zJa.remove(0);
        paramm = paramString.cMr;
        paramString = paramm;
        if (bo.isNullOrNil(paramm))
        {
          paramString = paramm;
          if (this.zIR != null)
            paramString = (String)this.zIR.get(0);
        }
        a(paramString, 3, this.fEW);
        AppMethodBeat.o(35111);
        break;
        label192: localObject = new rg();
        ((rg)localObject).cNl.cFc = paramm;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      label223: if (this.zIV != null)
      {
        this.zIV.dismiss();
        this.zIV = null;
      }
      this.zJj -= 1;
      if ((this.zJj <= 0) || (!this.zJi))
      {
        this.zIZ = false;
        aw.Rg().b(110, this);
        if (this.zIX != 0)
        {
          finish();
          if ((this.zIT) && (!this.zJh))
          {
            paramm = new Intent(this, ChattingUI.class);
            paramm.addFlags(67108864);
            paramm.putExtra("Chat_User", paramString.cMr);
            startActivity(paramm);
          }
        }
      }
      AppMethodBeat.o(35111);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI
 * JD-Core Version:    0.6.2
 */