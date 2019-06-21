package com.tencent.mm.plugin.emoji.ui.fts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;

public class FTSEmojiDetailPageUI extends MMActivity
  implements f
{
  private String cAo;
  private String cHg;
  private int cvp;
  private String cwg;
  private String designerName;
  private EmojiInfo exP;
  private int fjE;
  private com.tencent.mm.ui.tools.j icA;
  private ProgressBar juA;
  private String kVF;
  private d.a kVx;
  private String lcA;
  private String lcB;
  private String lcC;
  private String lcD;
  private String lcE;
  private String lcF;
  private String lcG;
  private com.tencent.mm.sdk.b.c lcH;
  private i lcI;
  private n.d lcJ;
  private MMAnimateView lcs;
  private Button lct;
  private Button lcu;
  private TextView lcv;
  private ImageView lcw;
  private View lcx;
  private boolean lcy;
  private boolean lcz;
  private int scene;
  private int type;

  public FTSEmojiDetailPageUI()
  {
    AppMethodBeat.i(53551);
    this.lcH = new FTSEmojiDetailPageUI.9(this);
    this.kVx = new FTSEmojiDetailPageUI.10(this);
    this.lcI = new FTSEmojiDetailPageUI.11(this);
    this.lcJ = new FTSEmojiDetailPageUI.3(this);
    AppMethodBeat.o(53551);
  }

  private void blV()
  {
    AppMethodBeat.i(53556);
    this.lcu.setEnabled(true);
    AppMethodBeat.o(53556);
  }

  private void blW()
  {
    AppMethodBeat.i(53557);
    EmojiInfo localEmojiInfo1 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(this.exP.Aq());
    EmojiInfo localEmojiInfo2 = localEmojiInfo1;
    if (localEmojiInfo1 == null)
      localEmojiInfo2 = this.exP;
    if (localEmojiInfo2.field_catalog == EmojiGroupInfo.yae)
    {
      this.lct.setEnabled(false);
      this.lct.setText(2131296524);
      AppMethodBeat.o(53557);
    }
    while (true)
    {
      return;
      this.lct.setText(2131299092);
      if (e.ct(this.cHg))
      {
        this.lct.setEnabled(true);
        AppMethodBeat.o(53557);
      }
      else
      {
        this.lct.setEnabled(false);
        AppMethodBeat.o(53557);
      }
    }
  }

  private boolean blX()
  {
    boolean bool = true;
    AppMethodBeat.i(53558);
    if ((!bo.isNullOrNil(this.lcG)) && (this.cvp == 1))
      AppMethodBeat.o(53558);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53558);
    }
  }

  private void gs(boolean paramBoolean)
  {
    AppMethodBeat.i(53555);
    if (paramBoolean)
      setMMTitle(this.exP.getName());
    Object localObject1;
    switch (this.type)
    {
    default:
      if (e.ct(this.cHg))
      {
        this.juA.setVisibility(8);
        this.lcs.setVisibility(0);
        localObject1 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(this.exP.Aq());
        if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB))
        {
          ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: decrypt");
          this.lcs.f(((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l((EmojiInfo)localObject1), "");
          label151: blW();
          blV();
        }
      }
      break;
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      if (this.lcy)
        this.lct.setVisibility(8);
      AppMethodBeat.o(53555);
      return;
      o.ahp().a(this.lcB, this.lcw);
      this.lcv.setText(this.lcC);
      this.cHg = this.exP.dve();
      break;
      o.ahp().a(this.lcF, this.lcw);
      this.lcv.setText(this.designerName);
      this.cHg = this.exP.dve();
      break;
      this.lcw.setVisibility(8);
      if (!bo.isNullOrNil(this.lcE))
      {
        this.lcv.setText(this.lcE);
        break;
      }
      this.lcv.setText(2131302841);
      break;
      ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: no decrypt");
      this.lcs.setImageFilePath(this.cHg);
      break label151;
      if (paramBoolean)
        if (this.type == 4)
        {
          localObject1 = new com.tencent.mm.vfs.b(getCacheDir(), com.tencent.mm.a.g.x(this.exP.field_encrypturl.getBytes()));
          Object localObject2;
          if (((com.tencent.mm.vfs.b)localObject1).exists())
          {
            this.exP.field_md5 = e.atg(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).mUri));
            localObject2 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", this.exP.field_md5);
            if (!e.ct((String)localObject2))
              e.y(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD()), (String)localObject2);
            this.cHg = ((String)localObject2);
            gs(false);
          }
          else
          {
            localObject2 = new c.a();
            ((c.a)localObject2).ePH = true;
            ((c.a)localObject2).ePJ = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
            ((c.a)localObject2).eQd = new Object[] { com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD()) };
            localObject1 = ((c.a)localObject2).ahG();
            com.tencent.mm.plugin.emoji.model.j.bjW().a(this.exP.field_encrypturl, null, (com.tencent.mm.at.a.a.c)localObject1, this.lcI);
          }
        }
        else
        {
          this.lcs.setVisibility(8);
          this.juA.setVisibility(0);
          this.lct.setText(2131299092);
          this.lcu.setText(2131302498);
          this.lct.setEnabled(false);
          this.lcu.setEnabled(false);
          com.tencent.mm.plugin.emoji.model.j.bkh().s(this.exP);
        }
    }
  }

  public final int getLayoutId()
  {
    return 2130969620;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53554);
    if ((paramInt1 == 1001) && (paramInt2 == -1))
      com.tencent.mm.ui.widget.snackbar.b.i(this, this.mController.ylL.getString(2131297044));
    AppMethodBeat.o(53554);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53552);
    super.onCreate(paramBundle);
    this.lct = ((Button)findViewById(2131824225));
    this.lcu = ((Button)findViewById(2131824224));
    this.lcs = ((MMAnimateView)findViewById(2131824223));
    this.juA = ((ProgressBar)findViewById(2131821605));
    this.lcv = ((TextView)findViewById(2131824226));
    this.lcw = ((ImageView)findViewById(2131824227));
    this.lcx = findViewById(2131823622);
    setBackBtn(new FTSEmojiDetailPageUI.1(this));
    this.lct.setOnClickListener(new FTSEmojiDetailPageUI.5(this));
    this.lcu.setOnClickListener(new FTSEmojiDetailPageUI.6(this));
    this.lcx.setOnClickListener(new FTSEmojiDetailPageUI.7(this));
    addIconOptionMenu(0, 2130839555, new FTSEmojiDetailPageUI.8(this));
    this.type = getIntent().getIntExtra("extra_type", 0);
    this.scene = getIntent().getIntExtra("extra_scence", 0);
    this.exP = new EmojiInfo();
    this.exP.field_designerID = getIntent().getStringExtra("id");
    this.exP.field_name = getIntent().getStringExtra("extra_emoji_name");
    this.exP.field_aeskey = getIntent().getStringExtra("extra_aeskey");
    this.exP.field_encrypturl = getIntent().getStringExtra("extra_encrypt_url");
    this.exP.field_thumbUrl = getIntent().getStringExtra("extra_thumb_url");
    this.exP.field_md5 = getIntent().getStringExtra("extra_md5");
    this.exP.field_groupId = getIntent().getStringExtra("extra_product_id");
    this.cwg = this.exP.field_groupId;
    this.lcC = getIntent().getStringExtra("extra_product_name");
    this.lcB = getIntent().getStringExtra("productUrl");
    this.lcD = getIntent().getStringExtra("extra_article_url");
    this.lcE = getIntent().getStringExtra("extra_article_name");
    this.cAo = this.exP.field_designerID;
    this.designerName = getIntent().getStringExtra("name");
    this.lcF = getIntent().getStringExtra("headurl");
    this.lcG = getIntent().getStringExtra("weapp_user_name");
    this.fjE = getIntent().getIntExtra("weapp_version", 0);
    this.cvp = getIntent().getIntExtra("source_type", 0);
    this.lcA = getIntent().getStringExtra("searchID");
    this.kVF = getIntent().getStringExtra("docID");
    this.lcy = getIntent().getBooleanExtra("disableAddSticker", false);
    this.lcz = getIntent().getBooleanExtra("needSavePhotosAlbum", false);
    paramBundle = getIntent().getStringExtra("activityId");
    if (!bo.isNullOrNil(paramBundle))
      this.exP.field_activityid = paramBundle;
    com.tencent.mm.sdk.b.a.xxA.c(this.lcH);
    com.tencent.mm.plugin.emoji.model.j.bkh().kVj = this.kVx;
    an.F(this.scene, this.lcA, this.kVF);
    gs(true);
    ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "localPath=%s", new Object[] { this.cHg });
    an.F(this.scene, this.lcA, this.kVF);
    AppMethodBeat.o(53552);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53559);
    com.tencent.mm.sdk.b.a.xxA.d(this.lcH);
    com.tencent.mm.plugin.emoji.model.j.bkh().kVj = null;
    super.onDestroy();
    AppMethodBeat.o(53559);
  }

  public void onResume()
  {
    AppMethodBeat.i(53553);
    super.onResume();
    gs(false);
    AppMethodBeat.o(53553);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI
 * JD-Core Version:    0.6.2
 */