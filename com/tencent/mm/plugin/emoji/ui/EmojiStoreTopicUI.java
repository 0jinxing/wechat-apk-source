package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class EmojiStoreTopicUI extends BaseEmojiStoreUI
{
  private int gOW;
  private int lbJ;
  private String lbK;
  private String lbL;
  private String lbM;
  private String lbN;
  private String lbO;

  protected final void JI(String paramString)
  {
    AppMethodBeat.i(53498);
    EmojiInfo localEmojiInfo;
    if ((this.kXX != null) && (this.kXY != null) && (!bo.isNullOrNil(paramString)))
    {
      com.tencent.mm.bz.a.getDensity(this);
      localEmojiInfo = EmojiLogic.r("Toptic", 8, paramString);
      if (localEmojiInfo == null)
      {
        o.ahp().a(paramString, null, g.j("Toptic", paramString, new Object[] { "Toptic", "BANNER" }), new EmojiStoreTopicUI.2(this));
        AppMethodBeat.o(53498);
      }
    }
    while (true)
    {
      return;
      this.kXY.setImageFilePath(localEmojiInfo.dve());
      AppMethodBeat.o(53498);
    }
  }

  protected final void a(com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(53500);
    super.a(paramf, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(53500);
  }

  protected final void a(boolean paramBoolean1, com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(53502);
    super.a(paramBoolean1, paramf, paramBoolean2, paramBoolean3);
    AppMethodBeat.o(53502);
  }

  protected final void bkL()
  {
    AppMethodBeat.i(53495);
    super.bkL();
    AppMethodBeat.o(53495);
  }

  protected final int bkM()
  {
    return 11;
  }

  protected final int bkN()
  {
    return 14;
  }

  protected final com.tencent.mm.plugin.emoji.a.a.a bkO()
  {
    AppMethodBeat.i(53503);
    com.tencent.mm.plugin.emoji.a.f localf = new com.tencent.mm.plugin.emoji.a.f(this.mController.ylL);
    AppMethodBeat.o(53503);
    return localf;
  }

  protected final boolean bkS()
  {
    return false;
  }

  protected final boolean bkT()
  {
    AppMethodBeat.i(53504);
    boolean bool;
    if (bo.isNullOrNil(this.lbN))
    {
      bool = false;
      AppMethodBeat.o(53504);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(53504);
    }
  }

  protected final int bkV()
  {
    return 7;
  }

  public final int bkW()
  {
    return this.lbJ;
  }

  protected final boolean blc()
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final void initView()
  {
    AppMethodBeat.i(53497);
    this.lbJ = getIntent().getIntExtra("topic_id", -1);
    this.lbK = getIntent().getStringExtra("topic_name");
    this.lbN = getIntent().getStringExtra("topic_ad_url");
    this.lbL = getIntent().getStringExtra("topic_icon_url");
    this.lbM = getIntent().getStringExtra("topic_desc");
    this.lbO = getIntent().getStringExtra("sns_object_data");
    this.gOW = getIntent().getIntExtra("extra_scence", 0);
    if (!bo.isNullOrNil(this.lbO))
    {
      this.lbJ = EmojiLogic.Jv(this.lbO);
      this.lbK = EmojiLogic.Jw(this.lbO);
      this.lbL = EmojiLogic.Jy(this.lbO);
      this.lbM = EmojiLogic.Jx(this.lbO);
      this.lbN = EmojiLogic.Jz(this.lbO);
    }
    setMMTitle(this.lbK);
    super.initView();
    addIconOptionMenu(0, 2131231770, new EmojiStoreTopicUI.1(this));
    showOptionMenu(0, false);
    JI(this.lbN);
    AppMethodBeat.o(53497);
  }

  public final void m(Message paramMessage)
  {
    AppMethodBeat.i(53505);
    super.m(paramMessage);
    if (paramMessage.what == 1009)
      JI(this.lbN);
    AppMethodBeat.o(53505);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53501);
    blb();
    if ((paramInt1 == 2002) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      if (!bo.isNullOrNil(str1))
      {
        ab.d("MicroMsg.emoji.EmojiStoreTopicUI", "..".concat(String.valueOf(str1)));
        int i = this.lbJ;
        String str2 = this.lbK;
        String str3 = this.lbM;
        String str4 = this.lbL;
        String str5 = this.lbN;
        j.bki();
        l.a(this, str1, 26, i, str2, str3, str4, str5, 0, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(53501);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53496);
    super.onCreate(paramBundle);
    h.pYm.e(12740, new Object[] { Integer.valueOf(3), "", "", Integer.valueOf(this.lbJ), Integer.valueOf(11), Integer.valueOf(11) });
    AppMethodBeat.o(53496);
  }

  public void onResume()
  {
    AppMethodBeat.i(53499);
    super.onResume();
    AppMethodBeat.o(53499);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53506);
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if (this.kYb)
    {
      showOptionMenu(0, false);
      AppMethodBeat.o(53506);
    }
    while (true)
    {
      return;
      showOptionMenu(0, true);
      AppMethodBeat.o(53506);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI
 * JD-Core Version:    0.6.2
 */