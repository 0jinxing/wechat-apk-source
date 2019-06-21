package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c;
import java.util.Iterator;
import java.util.List;

public class EmojiSendDialogUI extends MMBaseActivity
  implements f
{
  private String emojiPath;
  private EmojiInfo exP;
  private boolean lao = false;

  private void JN(String paramString)
  {
    AppMethodBeat.i(53407);
    if (!isFinishing())
      com.tencent.mm.ui.base.h.b(this, paramString, "", true).setOnDismissListener(new EmojiSendDialogUI.1(this));
    AppMethodBeat.o(53407);
  }

  private void blz()
  {
    AppMethodBeat.i(53402);
    ab.i("MicroMsg.EmojiSendDialogUI", "select contact");
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("Retr_Msg_Type", 5);
    if (this.lao)
      localIntent.putExtra("Retr_Msg_thumb_path", this.exP.field_md5);
    while (true)
    {
      localIntent.putExtra("emoji_activity_id", this.exP.field_activityid);
      localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
      com.tencent.mm.bp.d.b(this, ".ui.transmit.SelectConversationUI", localIntent, 1001);
      overridePendingTransition(2131034229, 2131034221);
      AppMethodBeat.o(53402);
      return;
      localIntent.putExtra("image_path", this.emojiPath);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(53406);
    overridePendingTransition(-1, -1);
    super.finish();
    AppMethodBeat.o(53406);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53405);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    String str1;
    String str2;
    Object localObject;
    if (paramInt1 == 1001)
    {
      if (paramInt2 != -1)
        break label256;
      ab.i("MicroMsg.EmojiSendDialogUI", "select contact result");
      str1 = paramIntent.getStringExtra("Select_Conv_User");
      str2 = paramIntent.getStringExtra("custom_send_text");
      paramIntent = j.getEmojiStorageMgr().xYn.aqi(this.exP.Aq());
      if (paramIntent != null)
        break label264;
      localObject = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), this.exP.field_groupId, this.exP.Aq());
      if (!com.tencent.mm.vfs.e.ct((String)localObject))
        break label264;
      if (r.amo((String)localObject))
      {
        paramInt1 = EmojiInfo.yan;
        paramIntent = this.exP;
        paramIntent.field_catalog = EmojiInfo.yaf;
        paramIntent.field_type = paramInt1;
        paramIntent.field_size = ((int)com.tencent.mm.vfs.e.asZ((String)localObject));
        paramIntent.field_temp = 1;
        paramIntent = j.getEmojiStorageMgr().xYn.E(paramIntent);
      }
    }
    label256: label264: 
    while (true)
    {
      localObject = bo.P(bo.bc(str1, "").split(",")).iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          str1 = (String)((Iterator)localObject).next();
          if (paramIntent != null)
          {
            j.bki().a(str1, paramIntent, null);
            if (!bo.isNullOrNil(str2))
            {
              com.tencent.mm.plugin.messenger.a.g.bOk().eZ(str2, str1);
              continue;
              paramInt1 = EmojiInfo.yam;
              break;
            }
          }
        }
      setResult(-1);
      while (true)
      {
        finish();
        AppMethodBeat.o(53405);
        return;
        setResult(0);
      }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53401);
    overridePendingTransition(-1, -1);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(0);
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    this.exP = ((EmojiInfo)getIntent().getParcelableExtra("emoji_info"));
    paramBundle = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().Je(this.exP.field_md5);
    if (paramBundle != null)
    {
      this.exP = paramBundle;
      this.lao = true;
    }
    this.emojiPath = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), this.exP.field_groupId, this.exP.Aq());
    paramBundle = j.getEmojiStorageMgr().xYn.aqi(this.exP.field_md5);
    if (((paramBundle != null) && (paramBundle.field_catalog == EmojiInfo.yal)) || (bo.isNullOrNil(this.exP.field_groupId)) || (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(this.exP.field_groupId)))
      ab.i("MicroMsg.EmojiSendDialogUI", "no need exchange %s %s", new Object[] { this.exP.field_md5, this.exP.field_groupId });
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        blz();
      AppMethodBeat.o(53401);
      return;
      paramBundle = new com.tencent.mm.plugin.emoji.f.g(this.exP.field_groupId, (byte)0);
      com.tencent.mm.kernel.g.RO().eJo.a(paramBundle, 0);
      ab.i("MicroMsg.EmojiSendDialogUI", "do exchange %s %s", new Object[] { this.exP.field_md5, this.exP.field_groupId });
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53404);
    super.onDestroy();
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    AppMethodBeat.o(53404);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53403);
    if (paramm.getType() == 423)
    {
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramm;
      ab.i("MicroMsg.EmojiSendDialogUI", "exchange end %s", new Object[] { paramString.kWz });
      if (bo.isNullOrNil(this.exP.field_groupId))
      {
        blz();
        AppMethodBeat.o(53403);
      }
    }
    while (true)
    {
      return;
      if (this.exP.field_groupId.equalsIgnoreCase(paramString.kWz))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          blz();
          AppMethodBeat.o(53403);
        }
        else if (paramInt2 == 4)
        {
          JN(getString(2131299082));
          AppMethodBeat.o(53403);
        }
        else
        {
          JN(getString(2131299081));
          AppMethodBeat.o(53403);
        }
      }
      else
      {
        ab.i("MicroMsg.EmojiSendDialogUI", "no the same product ID");
        AppMethodBeat.o(53403);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSendDialogUI
 * JD-Core Version:    0.6.2
 */