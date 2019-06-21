package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.record.b.e.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.widget.progress.RoundProgressBtn;

public class AppAttachDownloadUI extends MMActivity
  implements f, e.a, k.a
{
  private String cEV;
  private boolean cHc;
  private String cHr;
  private String cJh;
  private bi cKd;
  private long cvx;
  private int egi;
  private String eov;
  private String eyr;
  private String fileName;
  private TextView grM;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private n.d lCi;
  private Button mlE;
  private View.OnTouchListener mlU;
  private View.OnLongClickListener mlV;
  private String nul;
  private com.tencent.mm.plugin.record.b.e pJg;
  private MMImageView pvR;
  private int scene;
  private RoundProgressBtn yFP;
  private AppAttachDownloadUI.a yFQ;
  private View yFR;
  private TextView yFS;
  private TextView yFT;
  private TextView yFU;
  private g yFV;
  private boolean yFW;
  private j.b yFX;
  private long yFY;
  private boolean yFZ;
  private boolean yGa;
  private boolean yGb;
  private int yGc;
  private boolean yGd;
  private LinearLayout yGe;
  private LinearLayout yGf;
  private boolean yGg;

  public AppAttachDownloadUI()
  {
    AppMethodBeat.i(30280);
    this.yFZ = false;
    this.yGa = false;
    this.yGb = true;
    this.yGc = 5000;
    this.yGd = false;
    this.yGg = false;
    this.jMO = null;
    this.lCi = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(30273);
        ClipboardManager localClipboardManager = (ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
        if (AppAttachDownloadUI.s(AppAttachDownloadUI.this).equals(""));
        for (paramAnonymousMenuItem = AppAttachDownloadUI.this.getString(2131301882); ; paramAnonymousMenuItem = AppAttachDownloadUI.s(AppAttachDownloadUI.this))
        {
          localClipboardManager.setPrimaryClip(ClipData.newPlainText(null, paramAnonymousMenuItem));
          com.tencent.mm.ui.base.h.bQ(AppAttachDownloadUI.this, AppAttachDownloadUI.this.getString(2131296876));
          AppMethodBeat.o(30273);
          return;
        }
      }
    };
    this.mlU = new AppAttachDownloadUI.11(this);
    this.mlV = new AppAttachDownloadUI.12(this);
    AppMethodBeat.o(30280);
  }

  private void Ob(int paramInt)
  {
    AppMethodBeat.i(30312);
    if (paramInt != this.yFP.getVisibility())
    {
      ab.i("MicroMsg.AppAttachDownloadUI", "setRoundProgressBar %s %s", new Object[] { Integer.valueOf(paramInt), com.tencent.mm.platformtools.ah.anW() });
      this.yFP.setVisibility(paramInt);
    }
    AppMethodBeat.o(30312);
  }

  private String aqY(String paramString)
  {
    AppMethodBeat.i(30290);
    String str = paramString;
    if (this.yFW)
    {
      str = paramString;
      if (paramString != null)
        str = bf.oz(paramString);
    }
    AppMethodBeat.o(30290);
    return str;
  }

  private boolean b(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(30288);
    if ((paramb == null) || (!new com.tencent.mm.vfs.b(paramb.field_fileFullPath).exists()))
      AppMethodBeat.o(30288);
    while (true)
    {
      return bool;
      if ((paramb.bCR()) || ((this.cKd.field_isSend == 1) && (paramb.field_isUpload)))
      {
        AppMethodBeat.o(30288);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(30288);
      }
    }
  }

  private static boolean c(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(30311);
    if (paramb == null)
      AppMethodBeat.o(30311);
    while (true)
    {
      return bool;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(paramb.field_fileFullPath);
      if ((localb.exists()) && (localb.length() == paramb.field_totalLen))
      {
        bool = true;
        AppMethodBeat.o(30311);
      }
      else
      {
        AppMethodBeat.o(30311);
      }
    }
  }

  private void ccI()
  {
    AppMethodBeat.i(30292);
    switch (this.egi)
    {
    case 1:
    case 3:
    case 5:
    default:
      this.pvR.setImageResource(2131230813);
      AppMethodBeat.o(30292);
    case 2:
    case 4:
    case 6:
    case 0:
    case 7:
    }
    while (true)
    {
      return;
      this.pvR.setImageResource(2130837705);
      AppMethodBeat.o(30292);
      continue;
      this.pvR.setImageResource(2131230817);
      AppMethodBeat.o(30292);
      continue;
      this.pvR.setImageResource(o.aiD(this.eov));
      AppMethodBeat.o(30292);
      continue;
      if (bo.any(this.eov))
      {
        this.pvR.setImageResource(2130837705);
        AppMethodBeat.o(30292);
      }
      else
      {
        this.pvR.setImageResource(2131230813);
        AppMethodBeat.o(30292);
      }
    }
  }

  private void ccL()
  {
    AppMethodBeat.i(30307);
    Intent localIntent = new Intent(this, ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", this.cKd.field_msgId);
    localIntent.putExtra("img_gallery_talker", this.cKd.field_talker);
    startActivity(localIntent);
    finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(30307);
  }

  private boolean dBa()
  {
    boolean bool = false;
    AppMethodBeat.i(30283);
    this.scene = getIntent().getIntExtra("scene", 0);
    this.cvx = getIntent().getLongExtra("app_msg_id", -1L);
    this.yGd = getIntent().getBooleanExtra("choose_way", false);
    if (this.cvx == -1L)
      AppMethodBeat.o(30283);
    while (true)
    {
      return bool;
      aw.ZK();
      this.cKd = com.tencent.mm.model.c.XO().jf(this.cvx);
      if ((this.cKd == null) || (this.cKd.field_msgId == 0L) || (this.cKd.field_content == null))
      {
        AppMethodBeat.o(30283);
      }
      else
      {
        this.yFW = t.kH(this.cKd.field_talker);
        this.cJh = this.cKd.field_content;
        if ((this.yFW) && (this.cKd.field_isSend == 0))
          this.cJh = aqY(this.cKd.field_content);
        this.yFX = j.b.me(this.cJh);
        if (this.yFX == null)
        {
          ab.e("MicroMsg.AppAttachDownloadUI", "summerapp parse msgContent error, %s", new Object[] { this.cJh });
          AppMethodBeat.o(30283);
        }
        else
        {
          if ((com.tencent.mm.platformtools.ah.isNullOrNil(this.yFX.csD)) && (!com.tencent.mm.platformtools.ah.isNullOrNil(this.yFX.fgD)))
          {
            ab.e("MicroMsg.AppAttachDownloadUI", "summerapp msgContent format error, %s", new Object[] { this.cJh });
            this.yFX.csD = this.yFX.fgD.hashCode();
          }
          this.egi = this.yFX.type;
          this.cHr = this.yFX.csD;
          this.fileName = com.tencent.mm.platformtools.ah.nullAsNil(this.yFX.title);
          this.eov = com.tencent.mm.platformtools.ah.nullAsNil(this.yFX.fgp).toLowerCase();
          this.yFY = this.yFX.fgo;
          this.nul = com.tencent.mm.platformtools.ah.nullAsNil(this.yFX.filemd5);
          this.cEV = com.tencent.mm.platformtools.ah.nullAsNil(this.yFX.cEV);
          this.eyr = com.tencent.mm.platformtools.ah.nullAsNil(this.yFX.eyr);
          if (com.tencent.mm.platformtools.ah.isNullOrNil(this.eov))
            this.eov = com.tencent.mm.vfs.e.cv(this.fileName);
          ab.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams msgId[%d], sender[%d], msgContent[%s], appType[%d], mediaId[%s], fileName[%s]", new Object[] { Long.valueOf(this.cvx), Integer.valueOf(this.cKd.field_isSend), this.cJh, Integer.valueOf(this.egi), this.cHr, this.fileName });
          com.tencent.mm.pluginsdk.model.app.b localb = dBi();
          if (localb == null)
          {
            ab.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo is null");
            this.yGa = false;
            if (c(localb))
              if (this.scene == 1)
                if (this.yGd)
                {
                  bool = com.tencent.mm.pluginsdk.ui.tools.a.b(this, localb.field_fileFullPath, this.eov, 7);
                  AppMethodBeat.o(30283);
                }
          }
          else
          {
            new com.tencent.mm.vfs.b(localb.field_fileFullPath);
            if (localb.field_offset > 0L);
            for (this.yGa = true; ; this.yGa = false)
            {
              ab.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo field_fileFullPath[%s], field_offset[%d], isDownloadStarted[%b]", new Object[] { localb.field_fileFullPath, Long.valueOf(localb.field_offset), Boolean.valueOf(this.yGa) });
              break;
            }
            bool = com.tencent.mm.pluginsdk.ui.tools.a.M(localb.field_fileFullPath, this.eov, 7);
            AppMethodBeat.o(30283);
            continue;
            if (this.yGd)
            {
              bool = com.tencent.mm.pluginsdk.ui.tools.a.b(this, localb.field_fileFullPath, this.eov, 1);
              AppMethodBeat.o(30283);
            }
            else
            {
              bool = com.tencent.mm.pluginsdk.ui.tools.a.M(localb.field_fileFullPath, this.eov, 1);
              AppMethodBeat.o(30283);
              continue;
              AppMethodBeat.o(30283);
              bool = true;
            }
          }
        }
      }
    }
  }

  private void dBb()
  {
    AppMethodBeat.i(30289);
    cl localcl = new cl();
    com.tencent.mm.pluginsdk.model.e.d(localcl, this.cKd);
    localcl.cvA.activity = this;
    localcl.cvA.cvH = 39;
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    AppMethodBeat.o(30289);
  }

  private void dBc()
  {
    AppMethodBeat.i(30291);
    this.yFV = new AppAttachDownloadUI.7(this);
    AppMethodBeat.o(30291);
  }

  private void dBd()
  {
    AppMethodBeat.i(30293);
    this.yFP.setOnClickListener(new AppAttachDownloadUI.8(this));
    AppMethodBeat.o(30293);
  }

  private void dBe()
  {
    AppMethodBeat.i(30294);
    this.yFQ.setOnClickListener(new AppAttachDownloadUI.9(this));
    AppMethodBeat.o(30294);
  }

  private void dBf()
  {
    AppMethodBeat.i(30295);
    Ob(0);
    this.yFQ.setVisibility(8);
    if (dBg())
    {
      ab.i("MicroMsg.AppAttachDownloadUI", "startToDownloadFile");
      this.pJg = new com.tencent.mm.plugin.record.b.e(this.cvx, this.cHr, this.yFV);
      aw.Rg().a(this.pJg, 0);
      y.C(this.cKd);
    }
    AppMethodBeat.o(30295);
  }

  private boolean dBg()
  {
    int i = -1;
    boolean bool1 = true;
    AppMethodBeat.i(30298);
    Object localObject1 = dBi();
    Object localObject2;
    boolean bool2;
    long l1;
    long l2;
    String str;
    long l3;
    long l4;
    if (localObject1 == null)
    {
      l.s(this.cvx, this.cJh);
      localObject2 = dBi();
      localObject1 = localObject2;
      bool2 = bool1;
      if (localObject2 != null)
      {
        l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).xDa;
        l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen;
        str = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
        l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_type;
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_mediaId;
        l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_msgInfoId;
        bool2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload;
        if (((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature != null)
          break label304;
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), str, Long.valueOf(l3), localObject1, Long.valueOf(l4), Boolean.valueOf(bool2), Integer.valueOf(i) });
        if (this.yFX.fgs == 0)
        {
          localObject1 = localObject2;
          bool2 = bool1;
          if (this.yFX.fgo <= 26214400);
        }
        else
        {
          if (com.tencent.mm.platformtools.ah.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature))
            break label316;
          bool2 = true;
          label218: localObject1 = localObject2;
        }
      }
      if ((this.yFX == null) || ((this.yFX.fgs == 0) && (this.yFX.fgo <= 26214400)))
        break label543;
      bool2 = false;
    }
    label543: 
    while (true)
    {
      if (!bool2)
        aw.Rg().a(new com.tencent.mm.plugin.record.b.c((com.tencent.mm.pluginsdk.model.app.b)localObject1, this.eyr, this.nul, this.fileName, this.eov, this.cEV), 0);
      AppMethodBeat.o(30298);
      return bool2;
      label304: i = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature.length();
      break;
      label316: bool2 = false;
      break label218;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath);
      if ((((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status == 199L) && (!localb.exists()))
      {
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist but file not!");
        l.s(this.cvx, this.cJh);
      }
      l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).xDa;
      l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_totalLen;
      str = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
      l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_type;
      localObject2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_mediaId;
      long l5 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_msgInfoId;
      boolean bool3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_isUpload;
      bool2 = localb.exists();
      l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status;
      if (((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature == null);
      while (true)
      {
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l3), Long.valueOf(l4), str, Long.valueOf(l1), localObject2, Long.valueOf(l5), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Long.valueOf(l2), Integer.valueOf(i) });
        bool2 = bool1;
        break;
        i = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature.length();
      }
    }
  }

  private void dBh()
  {
    AppMethodBeat.i(30299);
    this.mlE.setOnClickListener(new AppAttachDownloadUI.2(this));
    AppMethodBeat.o(30299);
  }

  private com.tencent.mm.pluginsdk.model.app.b dBi()
  {
    AppMethodBeat.i(30301);
    com.tencent.mm.pluginsdk.model.app.b localb1 = am.aUq().lZ(this.cvx);
    if (localb1 != null)
    {
      ab.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", new Object[] { Long.valueOf(this.cvx), com.tencent.mm.platformtools.ah.anW() });
      AppMethodBeat.o(30301);
    }
    while (true)
    {
      return localb1;
      localb1 = l.aiM(this.cHr);
      if (localb1 == null)
      {
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new Object[] { com.tencent.mm.platformtools.ah.anW() });
        AppMethodBeat.o(30301);
      }
      else if ((localb1.field_msgInfoId == this.cvx) || (com.tencent.mm.vfs.e.ct(localb1.field_fileFullPath)))
      {
        AppMethodBeat.o(30301);
      }
      else
      {
        l.s(this.cvx, this.cJh);
        com.tencent.mm.pluginsdk.model.app.b localb2 = am.aUq().lZ(this.cvx);
        if (localb2 == null)
        {
          ab.w("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new Object[] { com.tencent.mm.platformtools.ah.anW() });
          AppMethodBeat.o(30301);
        }
        else
        {
          d.post(new AppAttachDownloadUI.3(this, localb1, localb2), "copyAttachFromLocal");
          AppMethodBeat.o(30301);
        }
      }
    }
  }

  private void dBj()
  {
    AppMethodBeat.i(30304);
    switch (this.egi)
    {
    case 1:
    case 3:
    case 4:
    case 5:
    default:
      this.mlE.setVisibility(0);
      Ob(8);
      this.yFR.setVisibility(8);
      AppMethodBeat.o(30304);
    case 0:
    case 6:
    case 2:
    case 7:
    }
    while (true)
    {
      return;
      if (!dBk())
        break;
      if (bo.any(this.eov))
      {
        dBl();
        AppMethodBeat.o(30304);
      }
      else
      {
        Object localObject = getMimeType();
        ab.i("MicroMsg.AppAttachDownloadUI", "onDownLoadImpl");
        dBn();
        Ob(8);
        this.yFR.setVisibility(8);
        this.yFQ.setVisibility(8);
        this.yFT.setVisibility(0);
        if (this.fileName.equals(""))
          this.yFT.setText(getString(2131301882));
        while (true)
        {
          if ((localObject != null) && (!((String)localObject).equals("")))
            break label252;
          this.mlE.setVisibility(8);
          this.grM.setText(getString(2131298918));
          AppMethodBeat.o(30304);
          break;
          this.yFT.setText(this.fileName);
        }
        label252: this.mlE.setVisibility(0);
        this.grM.setText(getString(2131298919));
        AppMethodBeat.o(30304);
        continue;
        if (!dBk())
          break;
        ccL();
        AppMethodBeat.o(30304);
        continue;
        localObject = new Intent();
        ((Intent)localObject).putExtra("App_MsgId", this.cvx);
        setResult(-1, (Intent)localObject);
        finish();
        AppMethodBeat.o(30304);
      }
    }
  }

  private boolean dBk()
  {
    boolean bool = true;
    AppMethodBeat.i(30305);
    com.tencent.mm.pluginsdk.model.app.b localb = dBi();
    if (localb == null)
      AppMethodBeat.o(30305);
    while (true)
    {
      return bool;
      if (com.tencent.mm.vfs.e.ct(localb.field_fileFullPath))
      {
        Ob(8);
        this.yFR.setVisibility(8);
        this.yFQ.setVisibility(8);
        AppMethodBeat.o(30305);
      }
      else
      {
        Ob(8);
        dBm();
        bool = false;
        AppMethodBeat.o(30305);
      }
    }
  }

  private void dBl()
  {
    AppMethodBeat.i(30306);
    com.tencent.mm.pluginsdk.model.app.b localb = dBi();
    Intent localIntent = new Intent(this, ShowImageUI.class);
    localIntent.putExtra("key_message_id", this.cKd.field_msgId);
    localIntent.putExtra("key_image_path", localb.field_fileFullPath);
    localIntent.putExtra("key_favorite", true);
    startActivity(localIntent);
    finish();
    AppMethodBeat.o(30306);
  }

  private void dBm()
  {
    AppMethodBeat.i(30313);
    this.yGe.setVisibility(0);
    this.yGf.setVisibility(8);
    dBn();
    this.yFQ.dBo();
    AppMethodBeat.o(30313);
  }

  private void dBn()
  {
    AppMethodBeat.i(30314);
    this.grM.setVisibility(8);
    AppMethodBeat.o(30314);
  }

  private String getMimeType()
  {
    AppMethodBeat.i(30300);
    j.b localb = j.b.me(this.cJh);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localb.fgp != null)
    {
      localObject2 = localObject1;
      if (localb.fgp.length() > 0)
        localObject2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(localb.fgp);
    }
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0);
    }
    else
    {
      ab.w("MicroMsg.AppAttachDownloadUI", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      localObject1 = "*/" + localb.fgp;
    }
    AppMethodBeat.o(30300);
    return localObject1;
  }

  private void init()
  {
    AppMethodBeat.i(30282);
    setMMTitle("");
    xE(getResources().getColor(2131689613));
    dyb();
    if (!dBa())
    {
      finish();
      AppMethodBeat.o(30282);
    }
    while (true)
    {
      return;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.compatible.util.e.euQ);
      if (!localb.exists())
        localb.mkdirs();
      am.aUq().c(this);
      initView();
      AppMethodBeat.o(30282);
    }
  }

  private void start()
  {
    AppMethodBeat.i(30296);
    switch (this.egi)
    {
    case 1:
    case 3:
    case 4:
    case 5:
    default:
      AppMethodBeat.o(30296);
      return;
    case 0:
    case 6:
      if (this.yGa)
      {
        this.yFQ.setVisibility(0);
        Ob(8);
        this.yFR.setVisibility(8);
        this.mlE.setVisibility(8);
        dBn();
        this.yFT.setVisibility(0);
        if (!this.fileName.equals(""))
          break label209;
        this.yFT.setText(getString(2131301882));
        String str = getMimeType();
        if ((str != null) && (!str.equals("")))
          break label223;
        this.grM.setText(getString(2131298918));
      }
      while (bo.any(this.eov))
      {
        dBn();
        AppMethodBeat.o(30296);
        break label62;
        this.yFQ.setVisibility(8);
        break label78;
        this.yFT.setText(this.fileName);
        break label141;
        this.grM.setText(getString(2131298919));
      }
    case 7:
      label62: label78: label209: label223: if (this.yGa)
        this.yFQ.setVisibility(0);
      while (true)
      {
        label141: Ob(8);
        this.yFR.setVisibility(8);
        this.mlE.setVisibility(8);
        this.yFT.setVisibility(8);
        dBn();
        this.grM.setText(getString(2131298919));
        AppMethodBeat.o(30296);
        break;
        this.yFQ.setVisibility(8);
      }
    case 2:
    }
    Ob(8);
    this.yFR.setVisibility(8);
    if (this.yGa)
      this.yFQ.setVisibility(0);
    while (true)
    {
      this.mlE.setVisibility(8);
      this.yFT.setVisibility(8);
      dBn();
      break;
      this.yFQ.setVisibility(8);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(30303);
    paramString = dBi();
    long l1;
    long l2;
    if (paramString != null)
    {
      l1 = paramString.field_totalLen;
      l2 = paramString.field_offset;
      this.yFY = l1;
      this.yFS.setText(getString(2131298921, new Object[] { com.tencent.mm.platformtools.ah.ga(l2), com.tencent.mm.platformtools.ah.ga(l1) }));
      if (paramString.field_totalLen != 0L)
        break label348;
    }
    label348: for (int i = 0; ; i = (int)(paramString.field_offset * 100L / paramString.field_totalLen))
    {
      ab.v("MicroMsg.AppAttachDownloadUI", "summerapp attach progress:" + i + " offset:" + l2 + " totallen:" + l1 + " status " + paramString.field_status);
      this.yFP.setProgress(i);
      if ((paramString.field_status == 199L) && (i >= 100) && (!this.yFZ))
      {
        this.yFZ = true;
        if (this.yGg)
        {
          this.yGg = false;
          dBb();
        }
        if (paramString != null)
        {
          Toast.makeText(this, getString(2131298934) + " : " + paramString.field_fileFullPath.replaceFirst(com.tencent.mm.compatible.util.e.eSl, com.tencent.mm.compatible.util.e.euO), this.yGc).show();
          com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramString.field_fileFullPath, this.eov, 1);
        }
        al.n(new AppAttachDownloadUI.4(this), 200L);
      }
      if ((this.yFP.getVisibility() != 0) && (i < 100) && (!paramString.field_isUpload) && (paramString.field_status == 101L))
      {
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp still downloading updateProgress progress[%d]", new Object[] { Integer.valueOf(i) });
        Ob(0);
        this.yFQ.setVisibility(8);
      }
      AppMethodBeat.o(30303);
      return;
    }
  }

  public final void ceD()
  {
    AppMethodBeat.i(30309);
    Toast.makeText(this, 2131298930, 0).show();
    AppMethodBeat.o(30309);
  }

  public final int getLayoutId()
  {
    return 2130969303;
  }

  public final void initView()
  {
    AppMethodBeat.i(30287);
    this.pvR = ((MMImageView)findViewById(2131821523));
    this.yFP = ((RoundProgressBtn)findViewById(2131823346));
    this.yFQ = new AppAttachDownloadUI.a(this, (Button)findViewById(2131823347), (TextView)findViewById(2131823348));
    this.mlE = ((Button)findViewById(2131823349));
    this.yFR = findViewById(2131823343);
    this.grM = ((TextView)findViewById(2131823345));
    this.yFS = ((TextView)findViewById(2131823344));
    this.yFT = ((TextView)findViewById(2131823341));
    this.yFU = ((TextView)findViewById(2131823342));
    this.yGe = ((LinearLayout)findViewById(2131823340));
    this.yGf = ((LinearLayout)findViewById(2131823350));
    this.yFT.setOnTouchListener(this.mlU);
    this.yFT.setOnLongClickListener(this.mlV);
    if (this.yFT != null)
    {
      TextPaint localTextPaint = this.yFT.getPaint();
      if (localTextPaint != null)
        localTextPaint.setFakeBoldText(true);
    }
    dBd();
    dBe();
    dBh();
    ccI();
    setBackBtn(new AppAttachDownloadUI.1(this));
    this.cHc = getIntent().getBooleanExtra("app_show_share", true);
    if (this.cHc)
      addIconOptionMenu(0, 2131230740, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(30268);
          AppAttachDownloadUI.a(AppAttachDownloadUI.this, AppAttachDownloadUI.b(AppAttachDownloadUI.this));
          AppMethodBeat.o(30268);
          return false;
        }
      });
    this.yFZ = false;
    if (b(dBi()))
    {
      ab.i("MicroMsg.AppAttachDownloadUI", "summerapp isCanOpenFile");
      if (this.yFY > 0L)
      {
        this.yFU.setVisibility(0);
        this.yFU.setText(getResources().getString(2131305896, new Object[] { com.tencent.mm.platformtools.ah.ga(this.yFY) }));
        this.yFZ = true;
        dBj();
        AppMethodBeat.o(30287);
      }
    }
    while (true)
    {
      return;
      this.yFU.setVisibility(8);
      break;
      if (this.yFY > 0L)
      {
        this.yFU.setVisibility(0);
        this.yFU.setText(getResources().getString(2131305896, new Object[] { com.tencent.mm.platformtools.ah.ga(this.yFY) }));
      }
      while (true)
      {
        if (!this.yFZ)
          break label463;
        AppMethodBeat.o(30287);
        break;
        this.yFU.setVisibility(8);
      }
      label463: dBc();
      start();
      ab.i("MicroMsg.AppAttachDownloadUI", "summerapp progressCallBack[%s], isDownloadFinished[%b], isDownloadStarted[%b]", new Object[] { this.yFV, Boolean.valueOf(this.yFZ), Boolean.valueOf(this.yGa) });
      if ((this.egi == 2) || ((!this.yFZ) && (!this.yGa)))
        dBf();
      AppMethodBeat.o(30287);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30302);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, this.yGb, 2131298926, 2131298927, 1);
    AppMethodBeat.o(30302);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30281);
    super.onCreate(paramBundle);
    init();
    AppMethodBeat.o(30281);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(30297);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 0, 0, getString(2131296875));
    AppMethodBeat.o(30297);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30284);
    am.aUq().d(this);
    super.onDestroy();
    AppMethodBeat.o(30284);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(30310);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    init();
    AppMethodBeat.o(30310);
  }

  public void onPause()
  {
    AppMethodBeat.i(30286);
    aw.Rg().b(221, this);
    aw.Rg().b(728, this);
    super.onPause();
    me localme = new me();
    localme.cHX.cHY = false;
    localme.cHX.talker = this.cKd.field_talker;
    com.tencent.mm.sdk.b.a.xxA.a(localme, getMainLooper());
    ab.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI cancel pause auto download logic");
    AppMethodBeat.o(30286);
  }

  public void onResume()
  {
    AppMethodBeat.i(30285);
    super.onResume();
    aw.Rg().a(221, this);
    aw.Rg().a(728, this);
    me localme = new me();
    localme.cHX.cHY = true;
    localme.cHX.talker = this.cKd.field_talker;
    com.tencent.mm.sdk.b.a.xxA.a(localme, getMainLooper());
    ab.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI req pause auto download logic");
    this.mlE.setEnabled(true);
    AppMethodBeat.o(30285);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(30308);
    ab.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm.getType() != 221) && (paramm.getType() != 728))
      AppMethodBeat.o(30308);
    while (true)
    {
      return;
      if ((paramm.getType() == 728) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = dBi();
        if (paramString == null)
        {
          ab.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
          if (paramString != null)
          {
            paramString.field_status = 101L;
            paramString.field_lastModifyTime = bo.anT();
            am.aUq().a(paramString, new String[0]);
          }
          this.pJg = new com.tencent.mm.plugin.record.b.e(this.cvx, this.cHr, this.yFV);
          aw.Rg().a(this.pJg, 0);
          AppMethodBeat.o(30308);
        }
        else
        {
          if (paramString.field_signature == null);
          for (paramInt1 = -1; ; paramInt1 = paramString.field_signature.length())
          {
            ab.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", new Object[] { Integer.valueOf(paramInt1) });
            break;
          }
        }
      }
      else
      {
        if ((this.pJg == null) && ((paramm instanceof com.tencent.mm.plugin.record.b.e)))
        {
          com.tencent.mm.plugin.record.b.e locale = (com.tencent.mm.plugin.record.b.e)paramm;
          paramString = dBi();
          if ((paramString != null) && (!com.tencent.mm.platformtools.ah.isNullOrNil(paramString.field_mediaSvrId)) && (paramString.field_mediaSvrId.equals(locale.getMediaId())))
          {
            this.pJg = locale;
            ab.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", new Object[] { this.pJg, paramString.field_mediaSvrId });
          }
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = com.tencent.mm.plugin.report.service.h.pYm;
          paramm = this.yFX.fgD;
          if (this.yFX.fgs == 1);
          for (paramInt1 = 7; ; paramInt1 = 5)
          {
            paramString.e(14665, new Object[] { paramm, Integer.valueOf(paramInt1), Integer.valueOf(this.yFX.fgo), Integer.valueOf(0), Integer.valueOf(0), this.eov });
            AppMethodBeat.o(30308);
            break;
          }
        }
        if ((paramInt2 != 0) && (com.tencent.mm.sdk.a.b.dnO()))
          Toast.makeText(this, "errCode[" + paramInt2 + "]", 0).show();
        if (paramInt2 == -5103059)
        {
          dBm();
          Ob(8);
          if (this.egi == 6)
          {
            paramm = com.tencent.mm.plugin.report.service.h.pYm;
            paramString = this.yFX.fgD;
            if (this.yFX.fgs != 1)
              break label584;
          }
          label584: for (paramInt1 = 7; ; paramInt1 = 5)
          {
            paramm.e(14665, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(this.yFX.fgo), Integer.valueOf(1), Integer.valueOf(0), this.eov });
            AppMethodBeat.o(30308);
            break;
          }
        }
        Ob(8);
        this.yFQ.setVisibility(0);
        this.yFR.setVisibility(8);
        ab.e("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd, download fail, type = " + paramm.getType() + " errType = " + paramInt1 + ", errCode = " + paramInt2);
        AppMethodBeat.o(30308);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI
 * JD-Core Version:    0.6.2
 */