package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.by.a.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.protocal.protobuf.cac;
import com.tencent.mm.protocal.protobuf.gn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmojiAddCustomDialogUI extends MMBaseActivity
  implements com.tencent.mm.ai.f
{
  private int gOW;
  private ProgressDialog gqo;
  private String hxH;
  private boolean jOI;
  private String kYY;
  private String kYZ;
  private EmojiInfo kZa;
  private boolean kZb;
  private String kZc;
  private List<String> kZd;
  private String kZe;
  private com.tencent.mm.emoji.a.c kZf;
  private com.tencent.mm.ui.widget.a.c kZg;
  private com.tencent.mm.ui.widget.a.c kZh;
  private Runnable kZi;
  private Context mContext;

  public EmojiAddCustomDialogUI()
  {
    AppMethodBeat.i(53278);
    this.kZi = new EmojiAddCustomDialogUI.1(this);
    AppMethodBeat.o(53278);
  }

  private void JM(String paramString)
  {
    AppMethodBeat.i(53283);
    if ((paramString != null) && (!paramString.equals(this.kZa.Aq())))
      this.kZa = j.getEmojiStorageMgr().xYn.aqi(paramString);
    ab.d("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveSuccess");
    if (this.kZa.field_catalog != EmojiInfo.yal)
    {
      this.kZa.field_catalog = EmojiInfo.yal;
      i = j.getEmojiStorageMgr().xYn.dvi();
      if (i >= com.tencent.mm.emoji.a.e.OM())
        break label427;
    }
    label427: for (int i = com.tencent.mm.emoji.a.e.OM(); ; i++)
    {
      this.kZa.field_reserved3 = i;
      j.getEmojiStorageMgr().xYn.G(this.kZa);
      com.tencent.mm.plugin.report.service.h.pYm.e(10431, new Object[] { Integer.valueOf(this.gOW), this.kZa.Aq(), this.kZa.field_designerID, this.kZa.field_groupId, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.kZa.field_size), this.kYZ, this.kZa.field_activityid });
      com.tencent.mm.plugin.emoji.e.f.bjK().c(this.kZa, false);
      if (this.jOI)
      {
        localObject = new ArrayList();
        ((List)localObject).add(this.kZa.Aq());
        j.getEmojiStorageMgr().xYn.l(0, (List)localObject);
      }
      String str = this.kZa.dve() + "_cover";
      if ((!bo.isNullOrNil(this.kZa.field_thumbUrl)) && (!com.tencent.mm.vfs.e.ct(str)))
      {
        localObject = new c.a();
        ((c.a)localObject).ePJ = str;
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).ePF = false;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(this.kZa.field_thumbUrl, null, (com.tencent.mm.at.a.a.c)localObject);
      }
      bll();
      blb();
      com.tencent.mm.ui.base.h.bQ(this.mContext, ah.getContext().getString(2131296524));
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("extra_id", paramString);
      ((Intent)localObject).putExtra("activityId", this.kZa.field_activityid);
      setResult(-1, (Intent)localObject);
      finish();
      AppMethodBeat.o(53283);
      return;
    }
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(53287);
    if (isFinishing())
      AppMethodBeat.o(53287);
    while (true)
    {
      return;
      this.kZh = com.tencent.mm.ui.base.h.b(this, paramString, "", true);
      this.kZh.setOnDismissListener(new EmojiAddCustomDialogUI.9(this));
      AppMethodBeat.o(53287);
    }
  }

  private void blk()
  {
    AppMethodBeat.i(53282);
    ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error.");
    blb();
    com.tencent.mm.ui.base.h.bQ(this.mContext, ah.getContext().getString(2131299008));
    com.tencent.mm.plugin.report.service.h.pYm.e(10431, new Object[] { Integer.valueOf(this.gOW), this.kZa.Aq(), this.kZa.field_designerID, this.kZa.field_groupId, Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(this.kZa.field_size), this.kYZ, this.kZa.field_activityid });
    setResult(1);
    finish();
    AppMethodBeat.o(53282);
  }

  private static void bll()
  {
    AppMethodBeat.i(53284);
    Object localObject = new cz();
    ((cz)localObject).cwc.type = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (!((cz)localObject).cwd.cwe)
    {
      cab localcab = j.getEmojiStorageMgr().xYq.bjU();
      if (localcab != null)
      {
        localObject = localcab.wZl.iterator();
        while (((Iterator)localObject).hasNext())
        {
          cac localcac = (cac)((Iterator)localObject).next();
          if (localcac.ProductID.equals(String.valueOf(EmojiGroupInfo.yad)))
            localcac.vKj = 0;
        }
      }
      j.getEmojiStorageMgr().xYq.b(localcab);
      com.tencent.mm.by.a.dmE();
      localObject = com.tencent.mm.by.a.xum;
      a.b.alW(String.valueOf(EmojiGroupInfo.yad));
    }
    AppMethodBeat.o(53284);
  }

  private void blm()
  {
    AppMethodBeat.i(53286);
    if (isFinishing())
      AppMethodBeat.o(53286);
    while (true)
    {
      return;
      this.kZg = com.tencent.mm.ui.base.h.a(this.mContext, 2131299197, 2131296899, 2131299121, 2131296868, new EmojiAddCustomDialogUI.4(this), new EmojiAddCustomDialogUI.5(this));
      if (this.kZg != null)
        this.kZg.setOnDismissListener(new EmojiAddCustomDialogUI.6(this));
      AppMethodBeat.o(53286);
    }
  }

  private static void t(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53285);
    ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramEmojiInfo.Aq());
    paramEmojiInfo = new com.tencent.mm.plugin.emoji.f.c(0, 4, localArrayList);
    com.tencent.mm.kernel.g.RO().eJo.a(paramEmojiInfo, 0);
    AppMethodBeat.o(53285);
  }

  protected final void blb()
  {
    AppMethodBeat.i(53288);
    al.af(this.kZi);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(53288);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53279);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setStatusBarColor(0);
      getWindow().setNavigationBarColor(0);
    }
    this.mContext = this;
    this.hxH = getIntent().getStringExtra("extra_id");
    this.gOW = getIntent().getIntExtra("extra_scence", -1);
    this.kYZ = getIntent().getStringExtra("extra_username");
    if ((getIntent().getBooleanExtra("extra_current", false)) && (this.kYZ == null))
      this.kYZ = r.Yz();
    this.jOI = getIntent().getBooleanExtra("extra_move_to_top", false);
    this.kZb = getIntent().getBooleanExtra("key_is_selfie", false);
    this.kZc = getIntent().getStringExtra("key_attached_text");
    this.kZd = getIntent().getStringArrayListExtra("key_attached_emoji_md5");
    this.kZe = getIntent().getStringExtra("key_imitate_md5");
    if (bo.isNullOrNil(this.hxH))
    {
      ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
      setResult(1);
      finish();
    }
    this.kZa = j.getEmojiStorageMgr().xYn.aqi(this.hxH);
    com.tencent.mm.kernel.g.RO().eJo.a(698, this);
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    al.n(this.kZi, 300L);
    Object localObject = this.mContext;
    paramBundle = this.kZa;
    if (localObject == null)
    {
      ab.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
      AppMethodBeat.o(53279);
    }
    while (true)
    {
      return;
      if (paramBundle == null)
      {
        ab.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
        AppMethodBeat.o(53279);
      }
      else
      {
        localObject = com.tencent.mm.ui.tools.b.b.asm(paramBundle.dve());
        ((com.tencent.mm.ui.tools.b.b)localObject).mSize = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().d(paramBundle, this.kZb);
        ((com.tencent.mm.ui.tools.b.b)localObject).PL(com.tencent.mm.m.b.Na()).a(new EmojiAddCustomDialogUI.2(this, paramBundle));
        AppMethodBeat.o(53279);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53280);
    com.tencent.mm.kernel.g.RO().eJo.b(698, this);
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    al.af(this.kZi);
    super.onDestroy();
    if (this.kZf != null)
      this.kZf.eyM = null;
    AppMethodBeat.o(53280);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53281);
    int i = paramm.getType();
    if (i == 698)
    {
      paramString = (com.tencent.mm.plugin.emoji.f.c)paramm;
      if (paramInt2 == -434)
      {
        ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error over size.");
        blb();
        blm();
        com.tencent.mm.plugin.report.service.h.pYm.e(10431, new Object[] { Integer.valueOf(this.gOW), this.kZa.Aq(), this.kZa.field_designerID, this.kZa.field_groupId, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(this.kZa.field_size), this.kYZ, this.kZa.field_activityid });
        AppMethodBeat.o(53281);
      }
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd ok.");
        paramString = (gn)paramString.ehh.fsH.fsP;
        if ((paramString != null) && (paramString.vIL != null) && (paramString.vIL.size() > 0))
        {
          ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload size is %d", new Object[] { Integer.valueOf(paramString.vIL.size()) });
          ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "start upload emoji");
          if (this.kZf != null)
            this.kZf.eyM = null;
          this.kZf = new com.tencent.mm.emoji.a.c(this.kZa, this.kZb, this.jOI, this.kZc, this.kZd, this.kZe);
          this.kZf.eyM = new EmojiAddCustomDialogUI.3(this);
          AppMethodBeat.o(53281);
        }
        else
        {
          JM(null);
          AppMethodBeat.o(53281);
        }
      }
      else
      {
        blk();
        AppMethodBeat.o(53281);
        continue;
        if (i == 423)
        {
          if (!(paramm instanceof com.tencent.mm.plugin.emoji.f.g))
          {
            AppMethodBeat.o(53281);
          }
          else
          {
            paramString = (com.tencent.mm.plugin.emoji.f.g)paramm;
            if ((paramString != null) && (!bo.isNullOrNil(paramString.kWz)) && (this.kZa != null) && (!bo.isNullOrNil(this.kZa.field_groupId)) && (this.kZa.field_groupId.equalsIgnoreCase(paramString.kWz)))
            {
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                t(this.kZa);
                AppMethodBeat.o(53281);
              }
              else if (paramInt2 == 4)
              {
                blb();
                JN(getString(2131299011));
                AppMethodBeat.o(53281);
              }
              else if (paramInt2 == 8)
              {
                blb();
                JN(getString(2131299010));
                AppMethodBeat.o(53281);
              }
              else if (paramInt2 == 9)
              {
                blb();
                JN(getString(2131299009));
                AppMethodBeat.o(53281);
              }
              else if (paramInt2 == -2)
              {
                blb();
                JN(getString(2131299012));
                AppMethodBeat.o(53281);
              }
              else
              {
                blb();
                JN(getString(2131299008));
                AppMethodBeat.o(53281);
              }
            }
            else
              ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
          }
        }
        else
          AppMethodBeat.o(53281);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI
 * JD-Core Version:    0.6.2
 */